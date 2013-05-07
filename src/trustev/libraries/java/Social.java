package trustev.libraries.java;

import https.api_trustev.SocialService;
import https.api_trustev.AddProfile;
import https.api_trustev.AddProfileResponse;
import java.util.Date;
import javax.xml.bind.JAXBElement;


public class Social extends Authenticate {

    public Social (String username, String password, String secret, Date DateTime) {
        super(username, password, secret, DateTime);
       
        
    }
       
          
        
   public static https.api_trustev.AddProfileResponse AddProfile(https.api_trustev.AddProfile parameters)
    {
        https.api_trustev.SocialService service = new https.api_trustev.SocialService();
        
        https.api_trustev.ISocialService port = service.getBasicHttpBindingISocialService();
        
        return port.addProfile(parameters);
    }
   
  
    
    public AddProfileRequest AddProfile()
    {
        
        SocialService service1 = (SocialService)ServiceConfigHelper.getInstance().GetService(Constants.ServiceType.Social);
        
        AddProfileRequest request = new AddProfileRequest();                       
        
        request.setUserName(JAXBElement.class.cast(UserName));
        request.setToken(JAXBElement.class.cast(Token));
        request.setTimestamp(JAXBElement.class.cast(Timestamp));
        
        AddProfile(request);
        service1.addProfile(request);
        service1.getBasicHttpBindingISocialService().addProfile(request);
        
        
        return request;
        
        
      
       }
    
       private static https.api_trustev.DeleteProfileResponse deleteProfile(https.api_trustev.DeleteProfile parameters) {
        https.api_trustev.SocialService service = new https.api_trustev.SocialService();
        https.api_trustev.ISocialService port = service.getBasicHttpBindingISocialService();
        return port.deleteProfile(parameters);
    }
 
    
    
      public DeleteProfileRequest DeleteProfile()
    {
        
        SocialService service1 = (SocialService)ServiceConfigHelper.getInstance().GetService(Constants.ServiceType.Social);
        
      
        
        DeleteProfileRequest request = service1.getBasicHttpBindingISocialService().deleteProfile(request);;
                       
        
       request.setUserName(JAXBElement.class.cast(UserName));
       request.setUserName(JAXBElement.class.cast(Token));
       request.setUserName(JAXBElement.class.cast(Timestamp));
        
        
        return request;
        
        
      
       }
       private static https.api_trustev.UpdateProfileResponse updateProfile(https.api_trustev.UpdateProfile parameters) {
        https.api_trustev.SocialService service = new https.api_trustev.SocialService();
        https.api_trustev.ISocialService port = service.getBasicHttpBindingISocialService();
        return port.updateProfile(parameters);
    }
      
        public UpdateProfileRequest UpdateProfile()
    {
        
        SocialService service1 = (SocialService)ServiceConfigHelper.getInstance().GetService(Constants.ServiceType.Social);
        
      
        
        UpdateProfileRequest request = service1.getBasicHttpBindingISocialService().deleteProfile(request);;
                       
        
       request.setUserName(JAXBElement.class.cast(UserName));
       request.setUserName(JAXBElement.class.cast(Token));
       request.setUserName(JAXBElement.class.cast(Timestamp));
        
        
        return request;
        
        
      
       }



    }


