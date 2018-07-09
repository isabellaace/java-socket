package Object;

import java.io.*;
import java.net.*;
import java.util.*;

public class OClient {
	private Socket socket = null;
	private ObjectInputStream obis= null;
	private ObjectOutputStream obos = null;
	private boolean isConnect = false;
	private Scanner input = new Scanner(System.in);
	
	private int i;
	private String n;
	public OClient() {
		
	}
	
	public void communicate() {
		while (!isConnect) {
			try {
				socket = new Socket("localhost", 4445);
				System.out.println("Connected");
				isConnect = true;
				
				obos = new ObjectOutputStream(socket.getOutputStream());
				System.out.println("Input the id : " +i);
				i = input.nextInt();
				System.out.println("Input the name : "+n);
				n = input.nextLine();
				Stud student = new Stud(i, n);
				
				System.out.println("Object to be written : " + student);
				obos.writeObject(student);
			} catch (SocketException se) {
				se.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]) {
		OClient client = new OClient();
		client.communicate();
	}

}
