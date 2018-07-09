package PrimeInt;

import java.io.*;
import java.net.*;

public class TClient {
	public static void main(String args[]) throws Exception {
		Socket sk=new Socket("localhost",2000);
		System.out.println("Terhubung dengan server.");
		BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream sout=new PrintStream(sk.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ( true ) {
			
			System.out.print("Client\t: ");
			s=stdin.readLine();
			boolean isInteger = isInteger(s);
			if(isInteger) {
				sout.println(s);
			}
						
			s=sin.readLine();
			System.out.println("Server\t: "+s);
			if ( s.equalsIgnoreCase("Bye") )
				break;
		}
		sk.close();
		sin.close();
		sout.close();
		stdin.close();
	}
	
	public static boolean isInteger(String s) {
		boolean isValidInteger = false;
		try {
			Integer.parseInt(s);
			
			isValidInteger = true;
		} catch (NumberFormatException x) {
			
		}
		
		return isValidInteger;
	}

}
