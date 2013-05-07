
package trustev.libraries.java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}ResponseBase">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}SecurityToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthResponse", propOrder = {
    "token"
})
public class AuthResponse
    extends ResponseBase
{

    @XmlElementRef(name = "Token", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication", type = JAXBElement.class, required = false)
    protected JAXBElement<SecurityToken> token;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SecurityToken }{@code >}
     *     
     */
    public JAXBElement<SecurityToken> getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SecurityToken }{@code >}
     *     
     */
    public void setToken(JAXBElement<SecurityToken> value) {
        this.token = ((JAXBElement<SecurityToken> ) value);
    }

}
