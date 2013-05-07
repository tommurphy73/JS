
package trustev.libraries.java;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Constants.CredentialType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Constants.CredentialType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Test"/>
 *     &lt;enumeration value="Live"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Constants.CredentialType", namespace = "http://schemas.datacontract.org/2004/07/Social.Verify.Types")
@XmlEnum
public enum ConstantsCredentialType {

    @XmlEnumValue("Test")
    TEST("Test"),
    @XmlEnumValue("Live")
    LIVE("Live");
    private final String value;

    ConstantsCredentialType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstantsCredentialType fromValue(String v) {
        for (ConstantsCredentialType c: ConstantsCredentialType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
