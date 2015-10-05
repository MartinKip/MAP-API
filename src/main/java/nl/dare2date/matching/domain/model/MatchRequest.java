
package nl.dare2date.matching.domain.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="input" type="{http://www.dare2date.nl/matching/schemas/types}MatchInput"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "input"
})
@XmlRootElement(name = "MatchRequest", namespace = "http://www.dare2date.nl/matching/schemas/messages")
public class MatchRequest {

    @XmlElement(namespace = "http://www.dare2date.nl/matching/schemas/messages", required = true)
    protected MatchInput input;

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link MatchInput }
     *     
     */
    public MatchInput getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchInput }
     *     
     */
    public void setInput(MatchInput value) {
        this.input = value;
    }

}
