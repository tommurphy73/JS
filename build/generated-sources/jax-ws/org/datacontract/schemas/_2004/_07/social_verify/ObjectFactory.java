
package org.datacontract.schemas._2004._07.social_verify;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.social_verify package. 
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

    private final static QName _ConstantsOrderStatusReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types", "Constants.OrderStatusReason");
    private final static QName _ConstantsSocialNetworkType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types", "Constants.SocialNetworkType");
    private final static QName _ConstantsAddressType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types", "Constants.AddressType");
    private final static QName _ConstantsOrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Social.Verify.Types", "Constants.OrderStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.social_verify
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantsOrderStatusReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types", name = "Constants.OrderStatusReason")
    public JAXBElement<ConstantsOrderStatusReason> createConstantsOrderStatusReason(ConstantsOrderStatusReason value) {
        return new JAXBElement<ConstantsOrderStatusReason>(_ConstantsOrderStatusReason_QNAME, ConstantsOrderStatusReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantsSocialNetworkType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types", name = "Constants.SocialNetworkType")
    public JAXBElement<ConstantsSocialNetworkType> createConstantsSocialNetworkType(ConstantsSocialNetworkType value) {
        return new JAXBElement<ConstantsSocialNetworkType>(_ConstantsSocialNetworkType_QNAME, ConstantsSocialNetworkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantsAddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types", name = "Constants.AddressType")
    public JAXBElement<ConstantsAddressType> createConstantsAddressType(ConstantsAddressType value) {
        return new JAXBElement<ConstantsAddressType>(_ConstantsAddressType_QNAME, ConstantsAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConstantsOrderStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types", name = "Constants.OrderStatus")
    public JAXBElement<ConstantsOrderStatus> createConstantsOrderStatus(ConstantsOrderStatus value) {
        return new JAXBElement<ConstantsOrderStatus>(_ConstantsOrderStatus_QNAME, ConstantsOrderStatus.class, null, value);
    }

}
