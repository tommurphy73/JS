
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1_transaction;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.social_verify.ConstantsOrderStatus;
import org.datacontract.schemas._2004._07.social_verify.ConstantsOrderStatusReason;
import org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1.RequestBase;


/**
 * <p>Java class for UpdateStatusRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatusRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Authentication}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types}Constants.OrderStatusReason" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types}Constants.OrderStatus" minOccurs="0"/>
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
@XmlType(name = "UpdateStatusRequest", propOrder = {
    "comment",
    "reason",
    "status",
    "transactionNumber"
})
public class UpdateStatusRequest
    extends RequestBase
{

    @XmlElementRef(name = "Comment", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comment;
    @XmlElement(name = "Reason")
    protected ConstantsOrderStatusReason reason;
    @XmlElement(name = "Status")
    protected ConstantsOrderStatus status;
    @XmlElementRef(name = "TransactionNumber", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Transaction.Requests", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionNumber;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComment(JAXBElement<String> value) {
        this.comment = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantsOrderStatusReason }
     *     
     */
    public ConstantsOrderStatusReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantsOrderStatusReason }
     *     
     */
    public void setReason(ConstantsOrderStatusReason value) {
        this.reason = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantsOrderStatus }
     *     
     */
    public ConstantsOrderStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantsOrderStatus }
     *     
     */
    public void setStatus(ConstantsOrderStatus value) {
        this.status = value;
    }

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
