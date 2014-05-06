package hostnametoIP;
import java.net.*;

public class hostnametoIP {
	public static String hosttoIP(String varHostname) {
		System.out.println(varHostname);
		InetAddress address = null;
		
		try {
			address = InetAddress.getByName(varHostname);
		} catch (UnknownHostException e) {
			return("Unknown hostname");
			/** System.out.println("Can't resolve IP address"); **/
			/**e.printStackTrace();**/
		}
		System.out.println(address.getHostAddress());
		return(address.getHostAddress());
		/** System.out.println(address.getHostName()); **/
		}
}
