import java.net.*;
import java.io.*;


class server{

public static void main(String[] args) {


	try{
		ServerSocket ss=new ServerSocket(6600);
		System.out.println("waiting....");
		Socket s=ss.accept();
		System.out.println("connaction established..");
		
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		DataInputStream din=new DataInputStream(s.getInputStream());

		MyThread m1=new MyThread(din);
		MyThread m2=new MyThread(dout);

		m1.setName("read");
		m2.setName("write");

		m1.start();
		m2.start();
		}

		catch(Exception ex){
			System.out.println(ex.getMessage());

		}
	
}


}