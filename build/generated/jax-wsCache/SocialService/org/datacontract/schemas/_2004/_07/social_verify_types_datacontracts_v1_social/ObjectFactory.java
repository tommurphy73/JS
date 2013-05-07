
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.ArrayOfSocialNetwork;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social package. 
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

    private final static QName _DeleteProfileResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Responses", "DeleteProfileResponse");
    private final static QName _UpdateProfileRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", "UpdateProfileRequest");
    private final static QName _DeleteProfileRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", "DeleteProfileRequest");
    private final static QName _UpdateProfileResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Responses", "UpdateProfileResponse");
    private final static QName _AddProfileResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Responses", "AddProfileResponse");
    private final static QName _UpdateProfileRequestSocialNetworks_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", "SocialNetworks");
    private final static QName _UpdateProfileRequestId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", "Id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProfileResponse }
     * 
     */
    public AddProfileResponse createAddProfileResponse() {
        return new AddProfileResponse();
    }

    /**
     * Create an instance of {@link DeleteProfileResponse }
     * 
     */
    public DeleteProfileResponse createDeleteProfileResponse() {
        return new DeleteProfileResponse();
    }

    /**
     * Create an instance of {@link UpdateProfileRequest }
     * 
     */
    public UpdateProfileRequest createUpdateProfileRequest() {
        return new UpdateProfileRequest();
    }

    /**
     * Create an instance of {@link DeleteProfileRequest }
     * 
     */
    public DeleteProfileRequest createDeleteProfileRequest() {
        return new DeleteProfileRequest();
    }

    /**
     * Create an instance of {@link UpdateProfileResponse }
     * 
     */
    public UpdateProfileResponse createUpdateProfileResponse() {
        return new UpdateProfileResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Responses", name = "DeleteProfileResponse")
    public JAXBElement<DeleteProfileResponse> createDeleteProfileResponse(DeleteProfileResponse value) {
        return new JAXBElement<DeleteProfileResponse>(_DeleteProfileResponse_QNAME, DeleteProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", name = "UpdateProfileRequest")
    public JAXBElement<UpdateProfileRequest> createUpdateProfileRequest(UpdateProfileRequest value) {
        return new JAXBElement<UpdateProfileRequest>(_UpdateProfileRequest_QNAME, UpdateProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteProfileRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", name = "DeleteProfileRequest")
    public JAXBElement<DeleteProfileRequest> createDeleteProfileRequest(DeleteProfileRequest value) {
        return new JAXBElement<DeleteProfileRequest>(_DeleteProfileRequest_QNAME, DeleteProfileRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Responses", name = "UpdateProfileResponse")
    public JAXBElement<UpdateProfileResponse> createUpdateProfileResponse(UpdateProfileResponse value) {
        return new JAXBElement<UpdateProfileResponse>(_UpdateProfileResponse_QNAME, UpdateProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Responses", name = "AddProfileResponse")
    public JAXBElement<AddProfileResponse> createAddProfileResponse(AddProfileResponse value) {
        return new JAXBElement<AddProfileResponse>(_AddProfileResponse_QNAME, AddProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSocialNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", name = "SocialNetworks", scope = UpdateProfileRequest.class)
    public JAXBElement<ArrayOfSocialNetwork> createUpdateProfileRequestSocialNetworks(ArrayOfSocialNetwork value) {
        return new JAXBElement<ArrayOfSocialNetwork>(_UpdateProfileRequestSocialNetworks_QNAME, ArrayOfSocialNetwork.class, UpdateProfileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", name = "Id", scope = UpdateProfileRequest.class)
    public JAXBElement<String> createUpdateProfileRequestId(String value) {
        return new JAXBElement<String>(_UpdateProfileRequestId_QNAME, String.class, UpdateProfileRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSocialNetwork }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", name = "SocialNetworks", scope = DeleteProfileRequest.class)
    public JAXBElement<ArrayOfSocialNetwork> createDeleteProfileRequestSocialNetworks(ArrayOfSocialNetwork value) {
        return new JAXBElement<ArrayOfSocialNetwork>(_UpdateProfileRequestSocialNetworks_QNAME, ArrayOfSocialNetwork.class, DeleteProfileRequest.class, value);
    }

}
