
package nl.dare2date.matching.domain.model;

import nl.dare2date.matching.domain.orchestration.Profile;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.dare2date.matching.domain.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.dare2date.matching.domain.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MatchResponse }
     * 
     */
    public MatchResponse createMatchResponse() {
        return new MatchResponse();
    }

    /**
     * Create an instance of {@link MatchResult }
     * 
     */
    public MatchResult createMatchResult() {
        return new MatchResult();
    }

    /**
     * Create an instance of {@link MatchRequest }
     * 
     */
    public MatchRequest createMatchRequest() {
        return new MatchRequest();
    }

    /**
     * Create an instance of {@link MatchInput }
     * 
     */
    public MatchInput createMatchInput() {
        return new MatchInput();
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

}
