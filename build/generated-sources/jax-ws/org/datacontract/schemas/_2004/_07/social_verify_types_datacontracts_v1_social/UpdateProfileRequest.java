
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.social_verify.ConstantsSocialNetworkType;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.ArrayOfSocialNetwork;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.RequestBase;


/**
 * <p>Java class for UpdateProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateProfileRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SocialNetworks" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social}ArrayOfSocialNetwork" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types}Constants.SocialNetworkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateProfileRequest", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", propOrder = {
    "id",
    "socialNetworks",
    "type"
})
public class UpdateProfileRequest
    extends RequestBase
{

    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "SocialNetworks", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSocialNetwork> socialNetworks;
    @XmlElement(name = "Type")
    protected ConstantsSocialNetworkType type;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setId(JAXBElement<String> value) {
        this.id = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the socialNetworks property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSocialNetwork }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSocialNetwork> getSocialNetworks() {
        return socialNetworks;
    }

    /**
     * Sets the value of the socialNetworks property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSocialNetwork }{@code >}
     *     
     */
    public void setSocialNetworks(JAXBElement<ArrayOfSocialNetwork> value) {
        this.socialNetworks = ((JAXBElement<ArrayOfSocialNetwork> ) value);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantsSocialNetworkType }
     *     
     */
    public ConstantsSocialNetworkType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantsSocialNetworkType }
     *     
     */
    public void setType(ConstantsSocialNetworkType value) {
        this.type = value;
    }

}
