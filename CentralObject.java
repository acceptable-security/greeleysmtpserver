package greeleysmtpserver;

/**
 * @author michaelmaitland
 */
import greeleysmtpserver.server.MultiThreadedServer;

public class CentralObject {

   public static void main(String[] args){
       /*Create and run server so it is listening for connections*/
       MultiThreadedServer server = new MultiThreadedServer(4444);
       server.start();
   }

}
