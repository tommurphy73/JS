package trustev.libraries.java;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

//singleton
public class AuthenticationHelper {

   private static AuthenticationHelper instance = new AuthenticationHelper( );
   
  
   private AuthenticationHelper(){ }
   
   public static AuthenticationHelper getInstance( ) {
      return instance;
   }



public final String PasswordHashHelper(String password, String sharedsecret, java.util.Date timestamp)
{
    DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
    return Create256Hash(Create256Hash(df.format(timestamp) + "." + password) + "." + sharedsecret);
}


public final String Sha256HashHelper(String password, String sharedsecret, java.util.Date timestamp)
{
    DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
    return Create256Hash(Create256Hash(df.format(timestamp) + "." + password) + "." + sharedsecret);
}


public static String Create256Hash(String base) {
    try{
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hash = digest.digest(base.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }

        return hexString.toString();
    } catch(NoSuchAlgorithmException | UnsupportedEncodingException ex){
       throw new RuntimeException(ex);
    }
}
    
}



