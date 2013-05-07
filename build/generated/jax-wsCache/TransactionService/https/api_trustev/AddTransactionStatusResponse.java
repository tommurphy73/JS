
package https.api_trustev;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateStatusResponse;


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
 *         &lt;element name="AddTransactionStatusResult" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses}UpdateStatusResponse" minOccurs="0"/>
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
    "addTransactionStatusResult"
})
@XmlRootElement(name = "AddTransactionStatusResponse")
public class AddTransactionStatusResponse {

    @XmlElementRef(name = "AddTransactionStatusResult", namespace = "https://api.trustev.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateStatusResponse> addTransactionStatusResult;

    /**
     * Gets the value of the addTransactionStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UpdateStatusResponse }{@code >}
     *     
     */
    public JAXBElement<UpdateStatusResponse> getAddTransactionStatusResult() {
        return addTransactionStatusResult;
    }

    /**
     * Sets the value of the addTransactionStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UpdateStatusResponse }{@code >}
     *     
     */
    public void setAddTransactionStatusResult(JAXBElement<UpdateStatusResponse> value) {
        this.addTransactionStatusResult = ((JAXBElement<UpdateStatusResponse> ) value);
    }

}
