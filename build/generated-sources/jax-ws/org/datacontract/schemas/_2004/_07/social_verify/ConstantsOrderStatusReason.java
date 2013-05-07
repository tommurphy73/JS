
package org.datacontract.schemas._2004._07.social_verify;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Constants.OrderStatusReason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Constants.OrderStatusReason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="System"/>
 *     &lt;enumeration value="Fraud"/>
 *     &lt;enumeration value="Complaint"/>
 *     &lt;enumeration value="Remorse"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Constants.OrderStatusReason", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types")
@XmlEnum
public enum ConstantsOrderStatusReason {

    @XmlEnumValue("System")
    SYSTEM("System"),
    @XmlEnumValue("Fraud")
    FRAUD("Fraud"),
    @XmlEnumValue("Complaint")
    COMPLAINT("Complaint"),
    @XmlEnumValue("Remorse")
    REMORSE("Remorse"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConstantsOrderStatusReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstantsOrderStatusReason fromValue(String v) {
        for (ConstantsOrderStatusReason c: ConstantsOrderStatusReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
