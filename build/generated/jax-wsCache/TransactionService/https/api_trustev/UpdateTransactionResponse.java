
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
 *         &lt;element name="UpdateTransactionResult" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Responses}UpdateTransactionResponse" minOccurs="0"/>
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
    "updateTransactionResult"
})
@XmlRootElement(name = "UpdateTransactionResponse")
public class UpdateTransactionResponse {

    @XmlElementRef(name = "UpdateTransactionResult", namespace = "https://api.trustev.com", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse> updateTransactionResult;

    /**
     * Gets the value of the updateTransactionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse> getUpdateTransactionResult() {
        return updateTransactionResult;
    }

    /**
     * Sets the value of the updateTransactionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse }{@code >}
     *     
     */
    public void setUpdateTransactionResult(JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse> value) {
        this.updateTransactionResult = ((JAXBElement<org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction.UpdateTransactionResponse> ) value);
    }

}
