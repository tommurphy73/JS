
package org.datacontract.schemas._2004._07.social_verify;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Constants.OrderStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Constants.OrderStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Init"/>
 *     &lt;enumeration value="Placed"/>
 *     &lt;enumeration value="Refunded"/>
 *     &lt;enumeration value="Rejected"/>
 *     &lt;enumeration value="Fulfilled"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Refreshed"/>
 *     &lt;enumeration value="Payment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Constants.OrderStatus", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types")
@XmlEnum
public enum ConstantsOrderStatus {

    @XmlEnumValue("Init")
    INIT("Init"),
    @XmlEnumValue("Placed")
    PLACED("Placed"),
    @XmlEnumValue("Refunded")
    REFUNDED("Refunded"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Fulfilled")
    FULFILLED("Fulfilled"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Refreshed")
    REFRESHED("Refreshed"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment");
    private final String value;

    ConstantsOrderStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstantsOrderStatus fromValue(String v) {
        for (ConstantsOrderStatus c: ConstantsOrderStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
