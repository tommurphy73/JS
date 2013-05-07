
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.datacontract.schemas._2004._07.social_verify.ConstantsSocialNetworkType;


/**
 * <p>Java class for SocialNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocialNetwork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongTermAccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LongTermAccessTokenExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Secret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortTermAccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ShortTermAccessTokenExpiry" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types}Constants.SocialNetworkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocialNetwork", propOrder = {
    "id",
    "longTermAccessToken",
    "longTermAccessTokenExpiry",
    "secret",
    "shortTermAccessToken",
    "shortTermAccessTokenExpiry",
    "type"
})
public class SocialNetwork {

    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlElementRef(name = "LongTermAccessToken", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longTermAccessToken;
    @XmlElement(name = "LongTermAccessTokenExpiry")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar longTermAccessTokenExpiry;
    @XmlElementRef(name = "Secret", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secret;
    @XmlElementRef(name = "ShortTermAccessToken", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shortTermAccessToken;
    @XmlElement(name = "ShortTermAccessTokenExpiry")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shortTermAccessTokenExpiry;
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
     * Gets the value of the longTermAccessToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongTermAccessToken() {
        return longTermAccessToken;
    }

    /**
     * Sets the value of the longTermAccessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongTermAccessToken(JAXBElement<String> value) {
        this.longTermAccessToken = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the longTermAccessTokenExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLongTermAccessTokenExpiry() {
        return longTermAccessTokenExpiry;
    }

    /**
     * Sets the value of the longTermAccessTokenExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLongTermAccessTokenExpiry(XMLGregorianCalendar value) {
        this.longTermAccessTokenExpiry = value;
    }

    /**
     * Gets the value of the secret property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecret() {
        return secret;
    }

    /**
     * Sets the value of the secret property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecret(JAXBElement<String> value) {
        this.secret = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shortTermAccessToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShortTermAccessToken() {
        return shortTermAccessToken;
    }

    /**
     * Sets the value of the shortTermAccessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShortTermAccessToken(JAXBElement<String> value) {
        this.shortTermAccessToken = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the shortTermAccessTokenExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShortTermAccessTokenExpiry() {
        return shortTermAccessTokenExpiry;
    }

    /**
     * Sets the value of the shortTermAccessTokenExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShortTermAccessTokenExpiry(XMLGregorianCalendar value) {
        this.shortTermAccessTokenExpiry = value;
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
