
package nl.dare2date.matching.domain.model;

import nl.dare2date.matching.domain.orchestration.Profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="profileUser" type="{http://www.dare2date.nl/matching/schemas/types}Profile"/>
 *         &lt;element name="viewUser" type="{http://www.dare2date.nl/matching/schemas/types}Profile"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchInput", namespace = "http://www.dare2date.nl/matching/schemas/types", propOrder = {

})
public class MatchInput {

    @XmlElement(namespace = "http://www.dare2date.nl/matching/schemas/types", required = true)
    protected Profile profileUser;
    @XmlElement(namespace = "http://www.dare2date.nl/matching/schemas/types", required = true)
    protected Profile viewUser;

    /**
     * Gets the value of the profileUser property.
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getProfileUser() {
        return profileUser;
    }

    /**
     * Sets the value of the profileUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setProfileUser(Profile value) {
        this.profileUser = value;
    }

    /**
     * Gets the value of the viewUser property.
     * 
     * @return
     *     possible object is
     *     {@link Profile }
     *     
     */
    public Profile getViewUser() {
        return viewUser;
    }

    /**
     * Sets the value of the viewUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile }
     *     
     */
    public void setViewUser(Profile value) {
        this.viewUser = value;
    }

}
