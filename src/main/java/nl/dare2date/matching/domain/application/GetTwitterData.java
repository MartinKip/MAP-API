package nl.dare2date.matching.domain.application;

import nl.dare2date.matching.domain.foundation.TwitterAccess;
import nl.dare2date.matching.domain.orchestration.Profile;
import twitter4j.JSONException;
import twitter4j.JSONObject;
import twitter4j.Twitter;
import twitter4j.TwitterException;

/**
 * Created by Vincent on 1-10-2015.
 */
public class GetTwitterData {
    private String consumerKey;
    private String consumerSecret;
    private TwitterAccess twitterAccess;

    public GetTwitterData() {
        this.consumerKey = "otHm6UTgJ88keqeS95sTqiCqE";
        this.consumerSecret = "7vM6EDM5VqNYvs0pFhym09KxqdtqZ0nvl3WkWuOQ18MHvmrR9T";
    }

    public void setTwitterAccess(TwitterAccess twitterAccess) {
        this.twitterAccess = twitterAccess;
    }

    public JSONObject getData(Profile user) {
//           https://api.twitter.com/1.1/friends/list.json
        JSONObject result = new JSONObject();
        try {
            result = this.twitterAccess.getData();
        }
        catch (TwitterException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return result;
    }
}
