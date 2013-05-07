
package org.datacontract.schemas._2004._07.social_verify;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Constants.SocialNetworkType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Constants.SocialNetworkType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Facebook"/>
 *     &lt;enumeration value="Twitter"/>
 *     &lt;enumeration value="LinkedIn"/>
 *     &lt;enumeration value="Trustev"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Constants.SocialNetworkType", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types")
@XmlEnum
public enum ConstantsSocialNetworkType {

    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),
    @XmlEnumValue("Twitter")
    TWITTER("Twitter"),
    @XmlEnumValue("LinkedIn")
    LINKED_IN("LinkedIn"),
    @XmlEnumValue("Trustev")
    TRUSTEV("Trustev");
    private final String value;

    ConstantsSocialNetworkType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstantsSocialNetworkType fromValue(String v) {
        for (ConstantsSocialNetworkType c: ConstantsSocialNetworkType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
