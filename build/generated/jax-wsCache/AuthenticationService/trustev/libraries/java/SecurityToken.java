
package trustev.libraries.java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SecurityToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityToken">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CredentialType" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types}Constants.CredentialType" minOccurs="0"/>
 *         &lt;element name="ExpireAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityToken", propOrder = {
    "credentialType",
    "expireAt",
    "token"
})
public class SecurityToken {

    @XmlElement(name = "CredentialType")
    protected ConstantsCredentialType credentialType;
    @XmlElement(name = "ExpireAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireAt;
    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", type = JAXBElement.class, required = false)
    protected JAXBElement<String> token;

    /**
     * Gets the value of the credentialType property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantsCredentialType }
     *     
     */
    public ConstantsCredentialType getCredentialType() {
        return credentialType;
    }

    /**
     * Sets the value of the credentialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantsCredentialType }
     *     
     */
    public void setCredentialType(ConstantsCredentialType value) {
        this.credentialType = value;
    }

    /**
     * Gets the value of the expireAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireAt() {
        return expireAt;
    }

    /**
     * Sets the value of the expireAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireAt(XMLGregorianCalendar value) {
        this.expireAt = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = ((JAXBElement<String> ) value);
    }

}
