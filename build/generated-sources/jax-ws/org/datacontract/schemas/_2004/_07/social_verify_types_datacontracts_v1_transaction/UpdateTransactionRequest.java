
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.RequestBase;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.SocialNetwork;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.TransactionData;


/**
 * <p>Java class for UpdateTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="SocialNetwork" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social}SocialNetwork" minOccurs="0"/>
 *         &lt;element name="TransactionData" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction}TransactionData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTransactionRequest", propOrder = {
    "sessionId",
    "socialNetwork",
    "transactionData"
})
public class UpdateTransactionRequest
    extends RequestBase
{

    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElementRef(name = "SocialNetwork", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<SocialNetwork> socialNetwork;
    @XmlElementRef(name = "TransactionData", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionData> transactionData;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the socialNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SocialNetwork }{@code >}
     *     
     */
    public JAXBElement<SocialNetwork> getSocialNetwork() {
        return socialNetwork;
    }

    /**
     * Sets the value of the socialNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SocialNetwork }{@code >}
     *     
     */
    public void setSocialNetwork(JAXBElement<SocialNetwork> value) {
        this.socialNetwork = ((JAXBElement<SocialNetwork> ) value);
    }

    /**
     * Gets the value of the transactionData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionData }{@code >}
     *     
     */
    public JAXBElement<TransactionData> getTransactionData() {
        return transactionData;
    }

    /**
     * Sets the value of the transactionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionData }{@code >}
     *     
     */
    public void setTransactionData(JAXBElement<TransactionData> value) {
        this.transactionData = ((JAXBElement<TransactionData> ) value);
    }

}
