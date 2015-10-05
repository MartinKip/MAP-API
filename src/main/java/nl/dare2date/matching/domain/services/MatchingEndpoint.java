package nl.dare2date.matching.domain.services;

import nl.dare2date.matching.domain.model.MatchRequest;
import nl.dare2date.matching.domain.model.MatchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

/**
 * Created by Vincent on 5-10-2015.
 */

@Endpoint
public class MatchingEndpoint {

    @Autowired
    public MatchingEndpoint() {
    }

    @PayloadRoot(localPart = "MatchRequest", namespace = "http://www.han.nl/schemas/messages")
    @ResponsePayload
    public MatchResponse calculateSumForName(@RequestPayload MatchRequest req) {
        MatchResponse result = new MatchResponse();

        return result;
    }

}
