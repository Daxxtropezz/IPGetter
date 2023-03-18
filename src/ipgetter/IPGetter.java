package ipgetter;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPGetter {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress addy = InetAddress.getByName("www.facebook.com");
        System.out.println(addy.getHostAddress());
    }

}
