package greeleysmtpserver;

/**
 * @author michaelmaitland
 */
import greeleysmtpserver.database.UserDatabase;
import greeleysmtpserver.server.MultiThreadedServer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Main {

    public static void main(String[] args) throws UnknownHostException, IOException {
        /*Output ip addresses as IPv4 if possible*/
        System.setProperty("java.net.preferIPv4Stack", "true");
        /*Set config file for logs*/
        System.setProperty("java.util.logging.config.file",
                "src/greeleysmtpserver/server/logger.properties");
        
        UserDatabase userDB = new UserDatabase("greeleysmtp.db");
        userDB.add("joe", "dick");
        userDB.selectAll();
        
        /*Create and run server so it is listening for connections*/
        MultiThreadedServer server = new MultiThreadedServer(4444);
        server.start();
    }
}