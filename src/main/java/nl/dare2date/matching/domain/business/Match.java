package nl.dare2date.matching.domain.business;

import nl.dare2date.matching.domain.application.GetTwitterData;
import nl.dare2date.matching.domain.model.MatchResult;
import nl.dare2date.matching.domain.orchestration.Profile;
import twitter4j.JSONObject;

/**
 * Created by Vincent on 1-10-2015.
 */
public class Match {
    private GetTwitterData twitterDataReceiver;

    public void setTwitterDataReceiver(GetTwitterData twitterDataReceiver) {
        this.twitterDataReceiver = twitterDataReceiver;
    }

    public MatchResult match(Profile viewer, Profile profileUser) {
        JSONObject viewerTwitterData, profileTwitterData;
        MatchResult result = new MatchResult();

        viewerTwitterData = this.twitterDataReceiver.getData(viewer);
        profileTwitterData = this.twitterDataReceiver.getData(profileUser);

        // compare twitterData

        // for now create a random percentage
        int percentage = (int) Math.round(Math.random() * 100);
        String message = "The result of the twitter match is "+percentage+"%!";

        result.setValue(percentage);
        result.setMessage(message);

        return result;
    }
}
