
package trustev.libraries.java;


import https.api_trustev.SocialService;
import https.api_trustev.TransactionService;
import javax.xml.ws.BindingProvider;


public class ServiceConfigHelper 
{
    
    private String privateTrustevApiBaseAddress;
    private String getTrustevApiBaseAddress()
    {
            return privateTrustevApiBaseAddress;
    }
    private void setTrustevApiBaseAddress(String value)
    {
            privateTrustevApiBaseAddress = value;
    }



    private static final ServiceConfigHelper _instance = new ServiceConfigHelper();

    private ServiceConfigHelper()
    {
            setTrustevApiBaseAddress("https://api.trustev.com/v1/");
    }

    public static ServiceConfigHelper getInstance()
    {
            return _instance;
    }



    public Object GetService(Constants.ServiceType serviceType)                
    {
        switch (serviceType)
        {
            case Authentication:
                AuthenticationService service = new AuthenticationService();
                AuthenticationService port = service.getPort(AuthenticationService.class);
                BindingProvider bindingProvider = (BindingProvider) port;
                bindingProvider.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://api.trustev.com/v1/AuthenticationService.svc/soap/");
                return service;
            case Social:
                SocialService service1 = new SocialService();
                SocialService port1 = service1.getPort(SocialService.class);
                BindingProvider bindingProvider1 = (BindingProvider) port1;
                bindingProvider1.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://api.trustev.com/v1/AuthenticationService.svc/soap/");
                return service1;
            case Transaction:                    
                TransactionService service2 = new TransactionService();
                TransactionService port2 = service2.getPort(TransactionService.class);
                BindingProvider bindingProvider2 = (BindingProvider) port2;
                bindingProvider2.getRequestContext().put(
                BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://api.trustev.com/v1/TransactionService.svc/soap/");
                return service2;    
            default:
                throw new RuntimeException("Could not build a valid API Base URL and Binding");
            }            
    }
}
