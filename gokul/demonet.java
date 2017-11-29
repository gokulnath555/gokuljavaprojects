import java.net.*;
import java.net.InetAddress;
class sample
{
	sample()
	{
		try{
		System.out.println(""+InetAddress.getLocalHost());
		System.out.println(""+InetAddress.getByName("www.facebook.com"));

		URL url=new URL("http:/www.google.com");
		InetAddress address = InetAddress.getByName("www.google.com");
		System.out.println("protocol"+url.getProtocol());
		System.out.println("host"+url.getHost());
		System.out.println("file"+url.getFile());
		System.out.println("file"+url.getRef());
		System.out.println("host"+url.getAuthority());
		 System.out.println(address.isAnyLocalAddress());
		System.out.println(address.isLoopbackAddress());
		System.out.println(address.isMulticastAddress());
		System.out.println(address.isMCSiteLocal());
		}catch(Exception f){}
		
	}
}
class demonet
{
	public static void main(String args[])
	{
		sample s=new sample();
	}
}


