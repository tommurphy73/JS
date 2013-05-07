
package https.api_trustev;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ITransactionService", targetNamespace = "https://api.trustev.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    org.datacontract.schemas._2004._07.social_verify.ObjectFactory.class,
    org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.ObjectFactory.class,
    org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.ObjectFactory.class,
    https.api_trustev.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class
})
public interface ITransactionService {


    /**
     * 
     * @param parameters
     * @return
     *     returns https.api_trustev.AddTransactionResponse
     */
    @WebMethod(operationName = "AddTransaction", action = "https://api.trustev.com/ITransactionService/AddTransaction")
    @WebResult(name = "AddTransactionResponse", targetNamespace = "https://api.trustev.com", partName = "parameters")
    public AddTransactionResponse addTransaction(
        @WebParam(name = "AddTransaction", targetNamespace = "https://api.trustev.com", partName = "parameters")
        AddTransaction parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns https.api_trustev.AddTransactionStatusResponse
     */
    @WebMethod(operationName = "AddTransactionStatus", action = "https://api.trustev.com/ITransactionService/AddTransactionStatus")
    @WebResult(name = "AddTransactionStatusResponse", targetNamespace = "https://api.trustev.com", partName = "parameters")
    public AddTransactionStatusResponse addTransactionStatus(
        @WebParam(name = "AddTransactionStatus", targetNamespace = "https://api.trustev.com", partName = "parameters")
        AddTransactionStatus parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns https.api_trustev.GetTransactionResponse
     */
    @WebMethod(operationName = "GetTransaction", action = "https://api.trustev.com/ITransactionService/GetTransaction")
    @WebResult(name = "GetTransactionResponse", targetNamespace = "https://api.trustev.com", partName = "parameters")
    public GetTransactionResponse getTransaction(
        @WebParam(name = "GetTransaction", targetNamespace = "https://api.trustev.com", partName = "parameters")
        GetTransaction parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns https.api_trustev.UpdateTransactionResponse
     */
    @WebMethod(operationName = "UpdateTransaction", action = "https://api.trustev.com/ITransactionService/UpdateTransaction")
    @WebResult(name = "UpdateTransactionResponse", targetNamespace = "https://api.trustev.com", partName = "parameters")
    public UpdateTransactionResponse updateTransaction(
        @WebParam(name = "UpdateTransaction", targetNamespace = "https://api.trustev.com", partName = "parameters")
        UpdateTransaction parameters);

}