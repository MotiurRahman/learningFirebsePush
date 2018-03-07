package learning.bd.com.learning;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by user on 5/3/18.
 */

public class MyfirebaseIdService extends FirebaseInstanceIdService{

    private static final String TAG = "MyfirebaseIdService";

    @Override
    public void onTokenRefresh() {
        String refresshedToken  = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New Token:" +refresshedToken);
    }
}
