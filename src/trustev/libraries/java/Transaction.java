package trustev.libraries.java;

import https.api_trustev.AddTransactionResponse;
import https.api_trustev.TransactionService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.social_verify.ConstantsAddressType;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.*;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.AddTransactionRequest;

public class Transaction extends Social {
      public Transaction (String username, String password, String secret, Date DateTime) {
        super(username, password, secret, DateTime);
       
        
      }
    
    public static AddTransactionResponse addTransaction(https.api_trustev.AddTransaction parameters) {
        
        https.api_trustev.TransactionService service2 = new https.api_trustev.TransactionService();
        
        https.api_trustev.ITransactionService port = service2.getBasicHttpBindingITransactionService();
        
        return port.addTransaction(parameters);
    }
    
     public AddTransactionResponse AddTransaction()
             
          
        {
            
            
            
            //TransactionNumber = Date.Utc.Ticks.ToString();
            TransactionService service2 = (TransactionService)ServiceConfigHelper.getInstance().GetService(Constants.ServiceType.Transaction);
    
            // TransactionNumber =

            AddTransactionRequest request = new AddTransactionRequest();
            
            request.setSessionId(("29b7d597-25f3-475b-afd9-fb3319deb653"));
            request.setTimestamp(XMLGregorianCalendar.class.cast(Timestamp));
            request.setUserName(JAXBElement.class.cast(UserName));
            request.setToken(JAXBElement.class.cast(Token));
  
      
            {
            //request.setSocialNetwork
                
                
            }

	TransactionData req = new TransactionData();
                      
            {
            
	    req.setCurrency(JAXBElement.class.cast("Euro"));
            req.setTransactionNumber(JAXBElement.class.cast(TransactionNumber));
            req.setTotalDelivery(BigDecimal.valueOf(300));
            req.setTotalDelivery(BigDecimal.valueOf(0));
	    req.setTotalDiscount(BigDecimal.valueOf(0));
            req.setTotalTax(BigDecimal.valueOf(0));
            req.setTimestamp(XMLGregorianCalendar.class.cast(Timestamp));
          
            List<Address> address = new ArrayList<>();
            req.setAddress(JAXBElement.class.cast(address));
            
            List<TransactionItem> item = new ArrayList<>();
            req.setAddress(JAXBElement.class.cast(item));
            
          
                                              
            }
                
            Address billingAddress = new Address();
            
                
            {
            
               billingAddress.setFirstName(JAXBElement.class.cast("David"));
               billingAddress.setLastName(JAXBElement.class.cast("Devane"));
               billingAddress.setFirstName(JAXBElement.class.cast("David"));
               billingAddress.setType(ConstantsAddressType.BILLING);
               billingAddress.setAddress1(JAXBElement.class.cast("31,Magazine road"));
               billingAddress.setAddress2(JAXBElement.class.cast(""));
               billingAddress.setAddress3(JAXBElement.class.cast(""));
               billingAddress.setCity(JAXBElement.class.cast("Cork city"));
               billingAddress.setPostalCode(JAXBElement.class.cast("000")); 
               billingAddress.setState(JAXBElement.class.cast("Cork"));
               billingAddress.setCountryIsoA2Code(JAXBElement.class.cast("IRE"));
           
            }

      Address deliveryAddress = new Address();
      {
     
               deliveryAddress.setFirstName(JAXBElement.class.cast("David"));
               deliveryAddress.setLastName(JAXBElement.class.cast("Devane"));
               deliveryAddress.setFirstName(JAXBElement.class.cast("David"));
               deliveryAddress.setType(ConstantsAddressType.BILLING);
               deliveryAddress.setAddress1(JAXBElement.class.cast("31,Magazine road"));
               deliveryAddress.setAddress2(JAXBElement.class.cast(""));
               deliveryAddress.setAddress3(JAXBElement.class.cast(""));
               deliveryAddress.setCity(JAXBElement.class.cast("Cork city"));
               deliveryAddress.setPostalCode(JAXBElement.class.cast("000")); 
               deliveryAddress.setState(JAXBElement.class.cast("Cork"));
               deliveryAddress.setCountryIsoA2Code(JAXBElement.class.cast("IRE"));
      
               
        }
          
              TransactionItem item = new TransactionItem();
              {
               
                  item.setName(JAXBElement.class.cast("Widget"));
                  item.setURL(JAXBElement.class.cast("http://bartley.local:8888/meanbee/trustev/1_5_1_0/index.php/widget.html"));
                  item.setImageURL(JAXBElement.class.cast("http://bartley.local:8888/meanbee/trustev/1_5_1_0/media/catalog/product/cache/1/image/265x/9df78eab33525d08d6e5fb8d27136e95/images/catalog/product/placeholder/image.jpg"));
                  item.setQuantity(Integer.class.cast(3));
                  item.setTotalBeforeTax(BigDecimal.class.cast(100));
                  item.setTotalDiscount(BigDecimal.class.cast(0));
                  item.setTotalTax(BigDecimal.class.cast(0));
                  
              }
              
              return 
                    //request.setTransactionData(JAXBElement<TransactionData>);

            //return .service2.getBasicHttpBindingITransactionService()
        
                      
                     
                      }
     
     
    

              
              
                    
}
 