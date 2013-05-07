
package org.datacontract.schemas._2004._07.social_verify;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Constants.AddressType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Constants.AddressType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Billing"/>
 *     &lt;enumeration value="Delivery"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Constants.AddressType", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types")
@XmlEnum
public enum ConstantsAddressType {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Delivery")
    DELIVERY("Delivery");
    private final String value;

    ConstantsAddressType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstantsAddressType fromValue(String v) {
        for (ConstantsAddressType c: ConstantsAddressType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
