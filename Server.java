import java.net.*;  
import java.io.*; 
class Server
{
	public static void main(String args[])
	{
		ServerSocket ss=new ServerSocket(3333);  
    	Socket s=ss.accept();  
	}
}
