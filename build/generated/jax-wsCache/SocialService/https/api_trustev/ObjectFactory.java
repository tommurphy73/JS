
package https.api_trustev;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.AddProfileRequest;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.DeleteProfileRequest;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.UpdateProfileRequest;


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

    private final static QName _AddProfileRequest_QNAME = new QName("https://api.trustev.com", "request");
    private final static QName _DeleteProfileResponseDeleteProfileResult_QNAME = new QName("https://api.trustev.com", "DeleteProfileResult");
    private final static QName _UpdateProfileResponseUpdateProfileResult_QNAME = new QName("https://api.trustev.com", "UpdateProfileResult");
    private final static QName _AddProfileResponseAddProfileResult_QNAME = new QName("https://api.trustev.com", "AddProfileResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.api_trustev
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProfile }
     * 
     */
    public AddProfile createAddProfile() {
        return new AddProfile();
    }

    /**
     * Create an instance of {@link https.api_trustev.DeleteProfileResponse }
     * 
     */
    public https.api_trustev.DeleteProfileResponse createDeleteProfileResponse() {
        return new https.api_trustev.DeleteProfileResponse();
    }

    /**
     * Create an instance of {@link https.api_trustev.UpdateProfileResponse }
     * 
     */
    public https.api_trustev.UpdateProfileResponse createUpdateProfileResponse() {
        return new https.api_trustev.UpdateProfileResponse();
    }

    /**
     * Create an instance of {@link UpdateProfile }
     * 
     */
    public UpdateProfile createUpdateProfile() {
        return new UpdateProfile();
    }

    /**
     * Create an instance of {@link DeleteProfile }
     * 
     */
    public DeleteProfile createDeleteProfile() {
        return new DeleteProfile();
    }

    /**
     * Create an instance of {@link https.api_trustev.AddProfileResponse }
     * 
     */
    public https.api_trustev.AddProfileResponse createAddProfileResponse() {
        return new https.api_trustev.AddProfileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "request", scope = AddProfile.class)
    public JAXBElement<AddProfileRequest> createAddProfileRequest(AddProfileRequest value) {
        return new JAXBElement<AddProfileRequest>(_AddProfileRequest_QNAME, AddProfileRequest.class, AddProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.DeleteProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "DeleteProfileResult", scope = https.api_trustev.DeleteProfileResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.DeleteProfileResponse> createDeleteProfileResponseDeleteProfileResult(org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.DeleteProfileResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.DeleteProfileResponse>(_DeleteProfileResponseDeleteProfileResult_QNAME, org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.DeleteProfileResponse.class, https.api_trustev.DeleteProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.UpdateProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "UpdateProfileResult", scope = https.api_trustev.UpdateProfileResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.UpdateProfileResponse> createUpdateProfileResponseUpdateProfileResult(org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.UpdateProfileResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.UpdateProfileResponse>(_UpdateProfileResponseUpdateProfileResult_QNAME, org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.UpdateProfileResponse.class, https.api_trustev.UpdateProfileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "request", scope = UpdateProfile.class)
    public JAXBElement<UpdateProfileRequest> createUpdateProfileRequest(UpdateProfileRequest value) {
        return new JAXBElement<UpdateProfileRequest>(_AddProfileRequest_QNAME, UpdateProfileRequest.class, UpdateProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "request", scope = DeleteProfile.class)
    public JAXBElement<DeleteProfileRequest> createDeleteProfileRequest(DeleteProfileRequest value) {
        return new JAXBElement<DeleteProfileRequest>(_AddProfileRequest_QNAME, DeleteProfileRequest.class, DeleteProfile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://api.trustev.com", name = "AddProfileResult", scope = https.api_trustev.AddProfileResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse> createAddProfileResponseAddProfileResult(org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse>(_AddProfileResponseAddProfileResult_QNAME, org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse.class, https.api_trustev.AddProfileResponse.class, value);
    }

}
