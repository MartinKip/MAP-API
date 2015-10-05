package nl.dare2date.matching.domain.foundation;

import twitter4j.*;
import twitter4j.api.FavoritesResources;

/**
 * Created by Vincent on 1-10-2015.
 */
public class TwitterAccess {

    public JSONObject getData() throws JSONException, TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        Query query = new Query("source:twitter4j yusukey");
        QueryResult result = twitter.search(query);

        FavoritesResources favorites = (FavoritesResources) twitter.getFavorites();

        for(Status status: result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ": " + status.getText());
        }

        JSONObject returnObject = new JSONObject();
        returnObject.append("name", "Vincent Bakkenes");
        return returnObject;
    }
}
