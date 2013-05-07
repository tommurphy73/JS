
package org.datacontract.schemas._2004._07.social_verify_types_datacontracts_v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSocialNetwork complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSocialNetwork">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SocialNetwork" type="{http://schemas.datacontract.org/2004/07/Social.Verify.Types.DataContracts.v1.Social}SocialNetwork" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSocialNetwork", propOrder = {
    "socialNetwork"
})
public class ArrayOfSocialNetwork {

    @XmlElement(name = "SocialNetwork", nillable = true)
    protected List<SocialNetwork> socialNetwork;

    /**
     * Gets the value of the socialNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialNetwork }
     * 
     * 
     */
    public List<SocialNetwork> getSocialNetwork() {
        if (socialNetwork == null) {
            socialNetwork = new ArrayList<SocialNetwork>();
        }
        return this.socialNetwork;
    }

}
