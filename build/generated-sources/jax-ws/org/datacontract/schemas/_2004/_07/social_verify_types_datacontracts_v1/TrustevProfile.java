
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrustevProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrustevProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BillingAddressScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DeliveryAddressScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OverallScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustevProfile", propOrder = {
    "billingAddressScore",
    "deliveryAddressScore",
    "overallScore"
})
public class TrustevProfile {

    @XmlElement(name = "BillingAddressScore")
    protected BigDecimal billingAddressScore;
    @XmlElement(name = "DeliveryAddressScore")
    protected BigDecimal deliveryAddressScore;
    @XmlElement(name = "OverallScore")
    protected BigDecimal overallScore;

    /**
     * Gets the value of the billingAddressScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillingAddressScore() {
        return billingAddressScore;
    }

    /**
     * Sets the value of the billingAddressScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillingAddressScore(BigDecimal value) {
        this.billingAddressScore = value;
    }

    /**
     * Gets the value of the deliveryAddressScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeliveryAddressScore() {
        return deliveryAddressScore;
    }

    /**
     * Sets the value of the deliveryAddressScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeliveryAddressScore(BigDecimal value) {
        this.deliveryAddressScore = value;
    }

    /**
     * Gets the value of the overallScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallScore() {
        return overallScore;
    }

    /**
     * Sets the value of the overallScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallScore(BigDecimal value) {
        this.overallScore = value;
    }

}
