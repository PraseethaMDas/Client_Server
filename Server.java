import java.net.*;  
import java.io.*; 
class Server
{
	public static void main(String args[])
	{
		ServerSocket ss=new ServerSocket(3333);  
    	Socket s=ss.accept();  
    	DataInputStream din=new DataInputStream(s.getInputStream());  
    	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	}
}
