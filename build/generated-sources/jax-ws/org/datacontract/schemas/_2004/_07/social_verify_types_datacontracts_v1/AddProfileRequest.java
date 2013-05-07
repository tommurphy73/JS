
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddProfileRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddProfileRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="SocialNetworks" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social}ArrayOfSocialNetwork" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddProfileRequest", propOrder = {
    "socialNetworks"
})
public class AddProfileRequest
    extends RequestBase
{

    @XmlElementRef(name = "SocialNetworks", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSocialNetwork> socialNetworks;

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

}
