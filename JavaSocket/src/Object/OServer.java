package Object;

import java.io.*;
import java.net.*;

public class OServer {
	private ServerSocket serversocket = null;
	private Socket socket = null;
	private ObjectInputStream obis = null;
	
	public OServer() {
		
	}
	
	public void communicate() {
		try {
			serversocket = new ServerSocket(4445);
			socket = serversocket.accept();
			System.out.println("Connected");
			obis = new ObjectInputStream(socket.getInputStream());
			
			Stud student = (Stud) obis.readObject();
			System.out.println("Object received : " + student);
			socket.close();
		} catch (SocketException se) {
			System.exit(0);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		OServer server = new OServer();
		server.communicate();
	}

}
