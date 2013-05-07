
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.RequestBase;


/**
 * <p>Java class for GetTransactionRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetTransactionRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="TransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTransactionRequest", propOrder = {
    "transactionNumber"
})
public class GetTransactionRequest
    extends RequestBase
{

    @XmlElementRef(name = "TransactionNumber", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionNumber;

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionNumber(JAXBElement<String> value) {
        this.transactionNumber = ((JAXBElement<String> ) value);
    }

}
