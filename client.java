import java.net.*;
import java.io.*;
import java.util.*;


class client{

	public static void main(String[] args) {
		try{
			Scanner sc= new Scanner(System.in);
			Socket s=new Socket("localhost",6600);
			String messageRecieve,messageSend=null;

			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			DataInputStream din=new DataInputStream(s.getInputStream());	


			MyThread m1=new MyThread(din);
			MyThread m2=new MyThread(dout);

			m1.setName("read");
			m2.setName("write");

			m1.start();
			m2.start();

		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}