
package trustev.libraries.java;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;


public class AuthenticateTest {
    
    
    private String _username =  "testtrustev" ;
    private String _password = "6af92077e0f325a0df39f694cfecc113";
    private String _sharedsecret = "5160574c3159333093f1c7bf92756366";
    private Date _timestamp = new Date();

    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
        System.out.println("Test complete.");
    }

    @Test
    public void TestGetToken() {
         
     try
        {
            Authenticate service = new Authenticate(_username, _password, _sharedsecret, _timestamp);
            AuthResponse response = service.GetToken();

            System.out.println(String.format("Response Code: {0}", response.code));
            System.out.println(String.format("Response Message: {0}", response.message));
            System.out.println(String.format("Token: {0}", response.token));
            
            assertEquals((Integer)200, response.code);
        }
        catch (Exception ex)
        {
        }
     
    }
     @Test
     
      public void TestToken401() {
         
     try
        {
            Authenticate service = new Authenticate(_username, _password, _sharedsecret, _timestamp);
            AuthResponse response = service.GetToken();

            System.out.println(String.format("Response Code: {0}", response.code));
            System.out.println(String.format("Response Message: {0}", response.message));
            System.out.println(String.format("Token: {0}", response.token));
            
            assertEquals((Integer)401, response.code);
        }
        catch (Exception ex)
           
        {
             
        }
     
     
}

    
}

