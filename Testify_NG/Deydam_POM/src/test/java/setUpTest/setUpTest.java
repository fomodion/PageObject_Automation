package setUpTest;

import Test.Test;
import setUp.setUps;

public class setUpTest extends setUps {
    @Test
    public void testSetUp (){
      String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/messages";
      if (pageURL.equalsIgnoreCase("https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/messages")){
          System.out.println("The webPage URL is " + pageURL);
      } else {
          System.out.println("Invalid URL. Actual webPage URL is " + pageURL);
      }
      //inCase of getting DTD error, got to run, edit config, edit existing and add the error to the sign on the VM
        //by selecting testng
    }

}