
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1 package. 
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

    private final static QName _ArrayOfSocialNetwork_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "ArrayOfSocialNetwork");
    private final static QName _ResponseBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", "ResponseBase");
    private final static QName _RequestBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", "RequestBase");
    private final static QName _AddProfileRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "AddProfileRequest");
    private final static QName _SocialNetwork_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "SocialNetwork");
    private final static QName _SocialNetworkSecret_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "Secret");
    private final static QName _SocialNetworkShortTermAccessToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "ShortTermAccessToken");
    private final static QName _SocialNetworkId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "Id");
    private final static QName _SocialNetworkLongTermAccessToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "LongTermAccessToken");
    private final static QName _ResponseBaseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", "Message");
    private final static QName _AddProfileRequestSocialNetworks_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", "SocialNetworks");
    private final static QName _RequestBaseToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", "Token");
    private final static QName _RequestBaseUserName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", "UserName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SocialNetwork }
     * 
     */
    public SocialNetwork createSocialNetwork() {
        return new SocialNetwork();
    }

    /**
     * Create an instance of {@link ResponseBase }
     * 
     */
    public ResponseBase createResponseBase() {
        return new ResponseBase();
    }

    /**
     * Create an instance of {@link AddProfileRequest }
     * 
     */
    public AddProfileRequest createAddProfileRequest() {
        return new AddProfileRequest();
    }

    /**
     * Create an instance of {@link RequestBase }
     * 
     */
    public RequestBase createRequestBase() {
        return new RequestBase();
    }

    /**
     * Create an instance of {@link ArrayOfSocialNetwork }
     * 
     */
    public ArrayOfSocialNetwork createArrayOfSocialNetwork() {
        return new ArrayOfSocialNetwork();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSocialNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "ArrayOfSocialNetwork")
    public JAXBElement<ArrayOfSocialNetwork> createArrayOfSocialNetwork(ArrayOfSocialNetwork value) {
        return new JAXBElement<ArrayOfSocialNetwork>(_ArrayOfSocialNetwork_QNAME, ArrayOfSocialNetwork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", name = "ResponseBase")
    public JAXBElement<ResponseBase> createResponseBase(ResponseBase value) {
        return new JAXBElement<ResponseBase>(_ResponseBase_QNAME, ResponseBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", name = "RequestBase")
    public JAXBElement<RequestBase> createRequestBase(RequestBase value) {
        return new JAXBElement<RequestBase>(_RequestBase_QNAME, RequestBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "AddProfileRequest")
    public JAXBElement<AddProfileRequest> createAddProfileRequest(AddProfileRequest value) {
        return new JAXBElement<AddProfileRequest>(_AddProfileRequest_QNAME, AddProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "SocialNetwork")
    public JAXBElement<SocialNetwork> createSocialNetwork(SocialNetwork value) {
        return new JAXBElement<SocialNetwork>(_SocialNetwork_QNAME, SocialNetwork.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "Secret", scope = SocialNetwork.class)
    public JAXBElement<String> createSocialNetworkSecret(String value) {
        return new JAXBElement<String>(_SocialNetworkSecret_QNAME, String.class, SocialNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "ShortTermAccessToken", scope = SocialNetwork.class)
    public JAXBElement<String> createSocialNetworkShortTermAccessToken(String value) {
        return new JAXBElement<String>(_SocialNetworkShortTermAccessToken_QNAME, String.class, SocialNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "Id", scope = SocialNetwork.class)
    public JAXBElement<String> createSocialNetworkId(String value) {
        return new JAXBElement<String>(_SocialNetworkId_QNAME, String.class, SocialNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "LongTermAccessToken", scope = SocialNetwork.class)
    public JAXBElement<String> createSocialNetworkLongTermAccessToken(String value) {
        return new JAXBElement<String>(_SocialNetworkLongTermAccessToken_QNAME, String.class, SocialNetwork.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", name = "Message", scope = ResponseBase.class)
    public JAXBElement<String> createResponseBaseMessage(String value) {
        return new JAXBElement<String>(_ResponseBaseMessage_QNAME, String.class, ResponseBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSocialNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", name = "SocialNetworks", scope = AddProfileRequest.class)
    public JAXBElement<ArrayOfSocialNetwork> createAddProfileRequestSocialNetworks(ArrayOfSocialNetwork value) {
        return new JAXBElement<ArrayOfSocialNetwork>(_AddProfileRequestSocialNetworks_QNAME, ArrayOfSocialNetwork.class, AddProfileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", name = "Token", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseToken(String value) {
        return new JAXBElement<String>(_RequestBaseToken_QNAME, String.class, RequestBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", name = "UserName", scope = RequestBase.class)
    public JAXBElement<String> createRequestBaseUserName(String value) {
        return new JAXBElement<String>(_RequestBaseUserName_QNAME, String.class, RequestBase.class, value);
    }

}
