package io.invertase.firebase.messaging;

import com.amazon.a.a.o.b.f;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.RemoteMessage;
import io.invertase.firebase.common.UniversalFirebasePreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class ReactNativeFirebaseMessagingStoreImpl implements ReactNativeFirebaseMessagingStore {
    private static final int MAX_SIZE_NOTIFICATIONS = 100;
    private static final String S_KEY_ALL_NOTIFICATION_IDS = "all_notification_ids";
    private final String DELIMITER = f.f598a;

    @Override // io.invertase.firebase.messaging.ReactNativeFirebaseMessagingStore
    public void storeFirebaseMessage(RemoteMessage remoteMessage) {
        try {
            String jSONObject = JsonConvert.reactToJSON(ReactNativeFirebaseMessagingSerializer.remoteMessageToWritableMap(remoteMessage)).toString();
            UniversalFirebasePreferences sharedInstance = UniversalFirebasePreferences.getSharedInstance();
            List<String> convertToArray = convertToArray(sharedInstance.getStringValue(S_KEY_ALL_NOTIFICATION_IDS, ""));
            while (convertToArray.size() > 99) {
                clearFirebaseMessage(convertToArray.get(0));
                convertToArray.remove(0);
            }
            String stringValue = sharedInstance.getStringValue(S_KEY_ALL_NOTIFICATION_IDS, "");
            sharedInstance.setStringValue(remoteMessage.getMessageId(), jSONObject);
            sharedInstance.setStringValue(S_KEY_ALL_NOTIFICATION_IDS, stringValue + remoteMessage.getMessageId() + f.f598a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // io.invertase.firebase.messaging.ReactNativeFirebaseMessagingStore
    @Deprecated
    public RemoteMessage getFirebaseMessage(String str) {
        WritableMap firebaseMessageMap = getFirebaseMessageMap(str);
        if (firebaseMessageMap != null) {
            return ReactNativeFirebaseMessagingSerializer.remoteMessageFromReadableMap(firebaseMessageMap);
        }
        return null;
    }

    @Override // io.invertase.firebase.messaging.ReactNativeFirebaseMessagingStore
    public WritableMap getFirebaseMessageMap(String str) {
        String stringValue = UniversalFirebasePreferences.getSharedInstance().getStringValue(str, null);
        if (stringValue != null) {
            try {
                WritableMap jsonToReact = JsonConvert.jsonToReact(new JSONObject(stringValue));
                jsonToReact.putString("to", str);
                return jsonToReact;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override // io.invertase.firebase.messaging.ReactNativeFirebaseMessagingStore
    public void clearFirebaseMessage(String str) {
        UniversalFirebasePreferences sharedInstance = UniversalFirebasePreferences.getSharedInstance();
        sharedInstance.remove(str).apply();
        String stringValue = sharedInstance.getStringValue(S_KEY_ALL_NOTIFICATION_IDS, "");
        if (stringValue.isEmpty()) {
            return;
        }
        sharedInstance.setStringValue(S_KEY_ALL_NOTIFICATION_IDS, removeRemoteMessageId(str, stringValue));
    }

    private String removeRemoteMessageId(String str, String str2) {
        return str2.replace(str + f.f598a, "");
    }

    private List<String> convertToArray(String str) {
        return new ArrayList(Arrays.asList(str.split(f.f598a)));
    }
}
