
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.ResponseBase;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.TrustevProfile;


/**
 * <p>Java class for UpdateTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="TrustProfile" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction}TrustevProfile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionResponse", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", propOrder = {
    "trustProfile"
})
public class UpdateTransactionResponse
    extends ResponseBase
{

    @XmlElementRef(name = "TrustProfile", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses", type = JAXBElement.class, required = false)
    protected JAXBElement<TrustevProfile> trustProfile;

    /**
     * Gets the value of the trustProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TrustevProfile }{@code >}
     *     
     */
    public JAXBElement<TrustevProfile> getTrustProfile() {
        return trustProfile;
    }

    /**
     * Sets the value of the trustProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TrustevProfile }{@code >}
     *     
     */
    public void setTrustProfile(JAXBElement<TrustevProfile> value) {
        this.trustProfile = ((JAXBElement<TrustevProfile> ) value);
    }

}
