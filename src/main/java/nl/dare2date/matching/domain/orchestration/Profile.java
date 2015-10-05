package nl.dare2date.matching.domain.orchestration;

import nl.dare2date.matching.domain.business.Match;
import nl.dare2date.matching.domain.model.MatchResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Vincent on 1-10-2015.
 */

/**
 * <p>Java class for Profile complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Profile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", namespace = "http://www.dare2date.nl/matching/schemas/types", propOrder = {
        "id"
})
public class Profile {

    @XmlElement(namespace = "http://www.dare2date.nl/matching/schemas/types")
    protected int id;

    private int userId;
    private Match matcher;
    private Profile viewer;

    public Profile() {

    }

    public Profile(int userId) {
        this.setId(userId);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setMatcher(Match matcher) {
        this.matcher = matcher;
    }

    public Match getMatcher() {
        return this.matcher;
    }

    public void setViewer(Profile viewer) {
        this.viewer = viewer;
    }

    public Profile getViewer() {
        return this.viewer;
    }

    public Profile view(int userId) {
        this.setId(userId);
        MatchResult result = this.matcher.match(this.getViewer(), this);




        return this;
    }
}
