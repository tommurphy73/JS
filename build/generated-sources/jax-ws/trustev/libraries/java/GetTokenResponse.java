
package trustev.libraries.java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetTokenResult" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}AuthResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTokenResult"
})
@XmlRootElement(name = "GetTokenResponse", namespace = "https://api.trustev.com")
public class GetTokenResponse {

    @XmlElementRef(name = "GetTokenResult", namespace = "https://api.trustev.com", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthResponse> getTokenResult;

    /**
     * Gets the value of the getTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthResponse }{@code >}
     *     
     */
    public JAXBElement<AuthResponse> getGetTokenResult() {
        return getTokenResult;
    }

    /**
     * Sets the value of the getTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthResponse }{@code >}
     *     
     */
    public void setGetTokenResult(JAXBElement<AuthResponse> value) {
        this.getTokenResult = ((JAXBElement<AuthResponse> ) value);
    }

}
