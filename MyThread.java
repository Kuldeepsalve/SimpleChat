import java.io.*;
import java.net.*;
import java.util.*;
public class MyThread extends Thread{

	DataOutputStream dout;
	DataInputStream din;

	MyThread(DataInputStream din)
	{
		this.din=din;
	}
	MyThread(DataOutputStream dout)
	{
		this.dout=dout;

	}

	public void run()
	{
		do{
			switch(Thread.currentThread().getName())
			{
				case "read":
				try{
					String msg=din.readUTF();
					System.out.println("Other: "+msg);
				}catch(Exception e)
				{
					System.out.println("problem:"+e);
				}
				break;

				case "write":
				try{
					Scanner sc=new Scanner(System.in);
					String msgOut=sc.nextLine();
					dout.writeUTF(msgOut);
				}catch(Exception e){
					System.out.println("problem: "+e);
				}
				break;
			}
		}while(true);
	}}


































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































	