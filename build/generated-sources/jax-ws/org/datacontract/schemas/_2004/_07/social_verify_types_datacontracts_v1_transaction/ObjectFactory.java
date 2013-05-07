
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.social_verify.ConstantsOrderStatus;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.ArrayOfTransactionItem;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.SocialNetwork;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.TransactionData;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.TrustevProfile;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction package. 
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

    private final static QName _GetTransactionRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "GetTransactionRequest");
    private final static QName _UpdateStatusRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "UpdateStatusRequest");
    private final static QName _UpdateStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "UpdateStatusResponse");
    private final static QName _AddTransactionResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "AddTransactionResponse");
    private final static QName _GetTransactionResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "GetTransactionResponse");
    private final static QName _UpdateTransactionResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "UpdateTransactionResponse");
    private final static QName _AddTransactionRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "AddTransactionRequest");
    private final static QName _UpdateTransactionRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "UpdateTransactionRequest");
    private final static QName _AddTransactionRequestSocialNetwork_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "SocialNetwork");
    private final static QName _AddTransactionRequestTransactionData_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "TransactionData");
    private final static QName _UpdateTransactionResponseTrustProfile_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "TrustProfile");
    private final static QName _GetTransactionRequestTransactionNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "TransactionNumber");
    private final static QName _UpdateStatusRequestComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", "Comment");
    private final static QName _GetTransactionResponseTotalDelivery_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "TotalDelivery");
    private final static QName _GetTransactionResponseTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "Timestamp");
    private final static QName _GetTransactionResponseCurrency_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "Currency");
    private final static QName _GetTransactionResponseScore_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "Score");
    private final static QName _GetTransactionResponseTotalBeforeTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "TotalBeforeTax");
    private final static QName _GetTransactionResponseTotalTax_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "TotalTax");
    private final static QName _GetTransactionResponseItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "Item");
    private final static QName _GetTransactionResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "Status");
    private final static QName _GetTransactionResponseTotalDiscount_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", "TotalDiscount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateTransactionResponse }
     * 
     */
    public UpdateTransactionResponse createUpdateTransactionResponse() {
        return new UpdateTransactionResponse();
    }

    /**
     * Create an instance of {@link GetTransactionRequest }
     * 
     */
    public GetTransactionRequest createGetTransactionRequest() {
        return new GetTransactionRequest();
    }

    /**
     * Create an instance of {@link AddTransactionRequest }
     * 
     */
    public AddTransactionRequest createAddTransactionRequest() {
        return new AddTransactionRequest();
    }

    /**
     * Create an instance of {@link UpdateStatusResponse }
     * 
     */
    public UpdateStatusResponse createUpdateStatusResponse() {
        return new UpdateStatusResponse();
    }

    /**
     * Create an instance of {@link UpdateTransactionRequest }
     * 
     */
    public UpdateTransactionRequest createUpdateTransactionRequest() {
        return new UpdateTransactionRequest();
    }

    /**
     * Create an instance of {@link UpdateStatusRequest }
     * 
     */
    public UpdateStatusRequest createUpdateStatusRequest() {
        return new UpdateStatusRequest();
    }

    /**
     * Create an instance of {@link AddTransactionResponse }
     * 
     */
    public AddTransactionResponse createAddTransactionResponse() {
        return new AddTransactionResponse();
    }

    /**
     * Create an instance of {@link GetTransactionResponse }
     * 
     */
    public GetTransactionResponse createGetTransactionResponse() {
        return new GetTransactionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "GetTransactionRequest")
    public JAXBElement<GetTransactionRequest> createGetTransactionRequest(GetTransactionRequest value) {
        return new JAXBElement<GetTransactionRequest>(_GetTransactionRequest_QNAME, GetTransactionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "UpdateStatusRequest")
    public JAXBElement<UpdateStatusRequest> createUpdateStatusRequest(UpdateStatusRequest value) {
        return new JAXBElement<UpdateStatusRequest>(_UpdateStatusRequest_QNAME, UpdateStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "UpdateStatusResponse")
    public JAXBElement<UpdateStatusResponse> createUpdateStatusResponse(UpdateStatusResponse value) {
        return new JAXBElement<UpdateStatusResponse>(_UpdateStatusResponse_QNAME, UpdateStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "AddTransactionResponse")
    public JAXBElement<AddTransactionResponse> createAddTransactionResponse(AddTransactionResponse value) {
        return new JAXBElement<AddTransactionResponse>(_AddTransactionResponse_QNAME, AddTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "GetTransactionResponse")
    public JAXBElement<GetTransactionResponse> createGetTransactionResponse(GetTransactionResponse value) {
        return new JAXBElement<GetTransactionResponse>(_GetTransactionResponse_QNAME, GetTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "UpdateTransactionResponse")
    public JAXBElement<UpdateTransactionResponse> createUpdateTransactionResponse(UpdateTransactionResponse value) {
        return new JAXBElement<UpdateTransactionResponse>(_UpdateTransactionResponse_QNAME, UpdateTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "AddTransactionRequest")
    public JAXBElement<AddTransactionRequest> createAddTransactionRequest(AddTransactionRequest value) {
        return new JAXBElement<AddTransactionRequest>(_AddTransactionRequest_QNAME, AddTransactionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransactionRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "UpdateTransactionRequest")
    public JAXBElement<UpdateTransactionRequest> createUpdateTransactionRequest(UpdateTransactionRequest value) {
        return new JAXBElement<UpdateTransactionRequest>(_UpdateTransactionRequest_QNAME, UpdateTransactionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "SocialNetwork", scope = AddTransactionRequest.class)
    public JAXBElement<SocialNetwork> createAddTransactionRequestSocialNetwork(SocialNetwork value) {
        return new JAXBElement<SocialNetwork>(_AddTransactionRequestSocialNetwork_QNAME, SocialNetwork.class, AddTransactionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "TransactionData", scope = AddTransactionRequest.class)
    public JAXBElement<TransactionData> createAddTransactionRequestTransactionData(TransactionData value) {
        return new JAXBElement<TransactionData>(_AddTransactionRequestTransactionData_QNAME, TransactionData.class, AddTransactionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustevProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "TrustProfile", scope = UpdateTransactionResponse.class)
    public JAXBElement<TrustevProfile> createUpdateTransactionResponseTrustProfile(TrustevProfile value) {
        return new JAXBElement<TrustevProfile>(_UpdateTransactionResponseTrustProfile_QNAME, TrustevProfile.class, UpdateTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "TransactionNumber", scope = GetTransactionRequest.class)
    public JAXBElement<String> createGetTransactionRequestTransactionNumber(String value) {
        return new JAXBElement<String>(_GetTransactionRequestTransactionNumber_QNAME, String.class, GetTransactionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "SocialNetwork", scope = UpdateTransactionRequest.class)
    public JAXBElement<SocialNetwork> createUpdateTransactionRequestSocialNetwork(SocialNetwork value) {
        return new JAXBElement<SocialNetwork>(_AddTransactionRequestSocialNetwork_QNAME, SocialNetwork.class, UpdateTransactionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "TransactionData", scope = UpdateTransactionRequest.class)
    public JAXBElement<TransactionData> createUpdateTransactionRequestTransactionData(TransactionData value) {
        return new JAXBElement<TransactionData>(_AddTransactionRequestTransactionData_QNAME, TransactionData.class, UpdateTransactionRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "Comment", scope = UpdateStatusRequest.class)
    public JAXBElement<String> createUpdateStatusRequestComment(String value) {
        return new JAXBElement<String>(_UpdateStatusRequestComment_QNAME, String.class, UpdateStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", name = "TransactionNumber", scope = UpdateStatusRequest.class)
    public JAXBElement<String> createUpdateStatusRequestTransactionNumber(String value) {
        return new JAXBElement<String>(_GetTransactionRequestTransactionNumber_QNAME, String.class, UpdateStatusRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrustevProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "TrustProfile", scope = AddTransactionResponse.class)
    public JAXBElement<TrustevProfile> createAddTransactionResponseTrustProfile(TrustevProfile value) {
        return new JAXBElement<TrustevProfile>(_UpdateTransactionResponseTrustProfile_QNAME, TrustevProfile.class, AddTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "TotalDelivery", scope = GetTransactionResponse.class)
    public JAXBElement<BigDecimal> createGetTransactionResponseTotalDelivery(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetTransactionResponseTotalDelivery_QNAME, BigDecimal.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "Timestamp", scope = GetTransactionResponse.class)
    public JAXBElement<XMLGregorianCalendar> createGetTransactionResponseTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetTransactionResponseTimestamp_QNAME, XMLGregorianCalendar.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "Currency", scope = GetTransactionResponse.class)
    public JAXBElement<String> createGetTransactionResponseCurrency(String value) {
        return new JAXBElement<String>(_GetTransactionResponseCurrency_QNAME, String.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "Score", scope = GetTransactionResponse.class)
    public JAXBElement<BigDecimal> createGetTransactionResponseScore(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetTransactionResponseScore_QNAME, BigDecimal.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "TotalBeforeTax", scope = GetTransactionResponse.class)
    public JAXBElement<BigDecimal> createGetTransactionResponseTotalBeforeTax(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetTransactionResponseTotalBeforeTax_QNAME, BigDecimal.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "TotalTax", scope = GetTransactionResponse.class)
    public JAXBElement<BigDecimal> createGetTransactionResponseTotalTax(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetTransactionResponseTotalTax_QNAME, BigDecimal.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTransactionItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "Item", scope = GetTransactionResponse.class)
    public JAXBElement<ArrayOfTransactionItem> createGetTransactionResponseItem(ArrayOfTransactionItem value) {
        return new JAXBElement<ArrayOfTransactionItem>(_GetTransactionResponseItem_QNAME, ArrayOfTransactionItem.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantsOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "Status", scope = GetTransactionResponse.class)
    public JAXBElement<ConstantsOrderStatus> createGetTransactionResponseStatus(ConstantsOrderStatus value) {
        return new JAXBElement<ConstantsOrderStatus>(_GetTransactionResponseStatus_QNAME, ConstantsOrderStatus.class, GetTransactionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", name = "TotalDiscount", scope = GetTransactionResponse.class)
    public JAXBElement<BigDecimal> createGetTransactionResponseTotalDiscount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_GetTransactionResponseTotalDiscount_QNAME, BigDecimal.class, GetTransactionResponse.class, value);
    }

}
