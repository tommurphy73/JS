package trustev.libraries.java;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;


          
public class Authenticate{

    public String UserName;
    private String Password;
    private String Secret;
    public String TransactionNumber;
    public java.util.Date Timestamp;
    public String Token;
    public XMLGregorianCalendar TokenExpiry;
    

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }
    
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getSecret() {
        return Secret;
    }

    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    public java.util.Date getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(java.util.Date  Timestamp) {
        this.Timestamp = Timestamp;
    }

    public XMLGregorianCalendar getTokenExpiry() {
        return TokenExpiry;
    }

    public void setTokenExpiry(XMLGregorianCalendar TokenExpiry) {
        this.TokenExpiry = TokenExpiry;
    }

    public String getTransactionNumber() {
        return TransactionNumber;
    }

    public void setTransactionNumber(String TransactionNumber) {
        this.TransactionNumber = TransactionNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    
   
    private static GetTokenResponse getToken(trustev.libraries.java.GetToken parameters) {
        trustev.libraries.java.AuthenticationService service = new trustev.libraries.java.AuthenticationService();
        trustev.libraries.java.IAuthenticationService port = service.getBasicHttpBindingIAuthenticationService();
        return port.getToken(parameters);
    
        
    }
    
      public Authenticate(String username, String password, String secret, java.util.Date DateTime)
  {
                        UserName = username;
			Password = password;
			Secret = secret;
			Timestamp = DateTime;
                                
  }

    
      
     public AuthResponse GetToken()
{
    
            AuthenticationService service = (AuthenticationService)ServiceConfigHelper.getInstance().GetService(Constants.ServiceType.Authentication);

            String passwordHash = AuthenticationHelper.getInstance().PasswordHashHelper(Password, Secret, Timestamp);
            String sha256Hash = AuthenticationHelper.getInstance().Sha256HashHelper(UserName, Secret, Timestamp);
            
            SimpleLoginRequest req = new SimpleLoginRequest();
 
            
            req.userName = JAXBElement.class.cast(UserName);
            req.password = JAXBElement.class.cast(passwordHash);
            req.sha256Hash = JAXBElement.class.cast(sha256Hash);
            req.timestamp =   XMLGregorianCalendar.class.cast(Timestamp);
            
            
             AuthResponse response = service.getBasicHttpBindingIAuthenticationService().getToken(req);
                     
                  
                     
                     
            Token = response.getToken().toString();
           // TokenExpiry = response.
            
                     
                     
            return response;
            
           
            
}

                    
            
                    
        
}        
            
