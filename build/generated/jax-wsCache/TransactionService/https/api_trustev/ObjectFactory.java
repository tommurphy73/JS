
package https.api_trustev;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.AddTransactionRequest;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.GetTransactionRequest;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateStatusRequest;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateStatusResponse;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionRequest;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.api_trustev package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddTransactionResponseAddTransactionResult_QNAME = new QName("https://api.trustev.com", "AddTransactionResult");
    private final static QName _UpdateTransactionResponseUpdateTransactionResult_QNAME = new QName("https://api.trustev.com", "UpdateTransactionResult");
    private final static QName _UpdateTransactionRequest_QNAME = new QName("https://api.trustev.com", "request");
    private final static QName _AddTransactionStatusResponseAddTransactionStatusResult_QNAME = new QName("https://api.trustev.com", "AddTransactionStatusResult");
    private final static QName _GetTransactionResponseGetTransactionResult_QNAME = new QName("https://api.trustev.com", "GetTransactionResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.api_trustev
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link https.api_trustev.AddTransactionResponse }
     * 
     */
    public https.api_trustev.AddTransactionResponse createAddTransactionResponse() {
        return new https.api_trustev.AddTransactionResponse();
    }

    /**
     * Create an instance of {@link https.api_trustev.UpdateTransactionResponse }
     * 
     */
    public https.api_trustev.UpdateTransactionResponse createUpdateTransactionResponse() {
        return new https.api_trustev.UpdateTransactionResponse();
    }

    /**
     * Create an instance of {@link UpdateTransaction }
     * 
     */
    public UpdateTransaction createUpdateTransaction() {
        return new UpdateTransaction();
    }

    /**
     * Create an instance of {@link AddTransactionStatusResponse }
     * 
     */
    public AddTransactionStatusResponse createAddTransactionStatusResponse() {
        return new AddTransactionStatusResponse();
    }

    /**
     * Create an instance of {@link AddTransaction }
     * 
     */
    public AddTransaction createAddTransaction() {
        return new AddTransaction();
    }

    /**
     * Create an instance of {@link AddTransactionStatus }
     * 
     */
    public AddTransactionStatus createAddTransactionStatus() {
        return new AddTransactionStatus();
    }

    /**
     * Create an instance of {@link https.api_trustev.GetTransactionResponse }
     * 
     */
    public https.api_trustev.GetTransactionResponse createGetTransactionResponse() {
        return new https.api_trustev.GetTransactionResponse();
    }

    /**
     * Create an instance of {@link GetTransaction }
     * 
     */
    public GetTransaction createGetTransaction() {
        return new GetTransaction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.AddTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "AddTransactionResult", scope = https.api_trustev.AddTransactionResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.AddTransactionResponse> createAddTransactionResponseAddTransactionResult(org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.AddTransactionResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.AddTransactionResponse>(_AddTransactionResponseAddTransactionResult_QNAME, org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.AddTransactionResponse.class, https.api_trustev.AddTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "UpdateTransactionResult", scope = https.api_trustev.UpdateTransactionResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse> createUpdateTransactionResponseUpdateTransactionResult(org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse>(_UpdateTransactionResponseUpdateTransactionResult_QNAME, org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse.class, https.api_trustev.UpdateTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "request", scope = UpdateTransaction.class)
    public JAXBElement<UpdateTransactionRequest> createUpdateTransactionRequest(UpdateTransactionRequest value) {
        return new JAXBElement<UpdateTransactionRequest>(_UpdateTransactionRequest_QNAME, UpdateTransactionRequest.class, UpdateTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "AddTransactionStatusResult", scope = AddTransactionStatusResponse.class)
    public JAXBElement<UpdateStatusResponse> createAddTransactionStatusResponseAddTransactionStatusResult(UpdateStatusResponse value) {
        return new JAXBElement<UpdateStatusResponse>(_AddTransactionStatusResponseAddTransactionStatusResult_QNAME, UpdateStatusResponse.class, AddTransactionStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "request", scope = AddTransaction.class)
    public JAXBElement<AddTransactionRequest> createAddTransactionRequest(AddTransactionRequest value) {
        return new JAXBElement<AddTransactionRequest>(_UpdateTransactionRequest_QNAME, AddTransactionRequest.class, AddTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "request", scope = AddTransactionStatus.class)
    public JAXBElement<UpdateStatusRequest> createAddTransactionStatusRequest(UpdateStatusRequest value) {
        return new JAXBElement<UpdateStatusRequest>(_UpdateTransactionRequest_QNAME, UpdateStatusRequest.class, AddTransactionStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "request", scope = GetTransaction.class)
    public JAXBElement<GetTransactionRequest> createGetTransactionRequest(GetTransactionRequest value) {
        return new JAXBElement<GetTransactionRequest>(_UpdateTransactionRequest_QNAME, GetTransactionRequest.class, GetTransaction.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.GetTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "GetTransactionResult", scope = https.api_trustev.GetTransactionResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.GetTransactionResponse> createGetTransactionResponseGetTransactionResult(org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.GetTransactionResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.GetTransactionResponse>(_GetTransactionResponseGetTransactionResult_QNAME, org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.GetTransactionResponse.class, https.api_trustev.GetTransactionResponse.class, value);
    }

}
