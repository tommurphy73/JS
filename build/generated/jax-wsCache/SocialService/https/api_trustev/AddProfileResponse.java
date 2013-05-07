
package https.api_trustev;

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
 *         &lt;element name="AddProfileResult" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social.Responses}AddProfileResponse" minOccurs="0"/>
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
    "addProfileResult"
})
@XmlRootElement(name = "AddProfileResponse")
public class AddProfileResponse {

    @XmlElementRef(name = "AddProfileResult", namespace = "https://api.trustev.com", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse> addProfileResult;

    /**
     * Gets the value of the addProfileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse> getAddProfileResult() {
        return addProfileResult;
    }

    /**
     * Sets the value of the addProfileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse }{@code >}
     *     
     */
    public void setAddProfileResult(JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse> value) {
        this.addProfileResult = ((JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_social.AddProfileResponse> ) value);
    }

}
