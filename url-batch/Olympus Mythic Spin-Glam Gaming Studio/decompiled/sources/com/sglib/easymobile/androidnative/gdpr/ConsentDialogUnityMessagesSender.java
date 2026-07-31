package com.sglib.easymobile.androidnative.gdpr;

import android.app.Activity;
import com.sglib.easymobile.androidnative.Helper;
import com.unity3d.player.UnityPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ConsentDialogUnityMessagesSender {
    public static final String completedEventCallback = "_OnNativeDialogCompleted";
    public static final String dismissedEventCallback = "_OnNativeDialogDismissed";
    public static final String listenerName = "EM_NativeConsentDialogListener";
    public static final String toggleBecameOffCallback = "_OnNativeToggleBecameOff";
    public static final String toggleBecameOnCallback = "_OnNativeToggleBecameOn";

    public static void SendCompletedEvent(String str, HashMap<String, Boolean> hashMap) {
        try {
            Activity activity = UnityPlayer.currentActivity;
            UnityPlayer.UnitySendMessage(listenerName, completedEventCallback, new ClosedEventParam(str, hashMap).toJson());
        } catch (ClassNotFoundException unused) {
            Helper.Log("Not Unity platform.");
        }
    }

    public static void SendDismissedEvent() {
        try {
            UnityPlayer.UnitySendMessage(listenerName, dismissedEventCallback, "");
        } catch (ClassNotFoundException unused) {
            Helper.Log("Not Unity platform.");
        }
    }

    public static void SendToggleUpdatedEvent(String str, Boolean bool) {
        try {
            Activity activity = UnityPlayer.currentActivity;
            UnityPlayer.UnitySendMessage(listenerName, bool.booleanValue() ? toggleBecameOnCallback : toggleBecameOffCallback, str);
        } catch (ClassNotFoundException unused) {
            Helper.Log("Not Unity platform.");
        }
    }

    public static class ClosedEventParam {
        public final String clickedButtonId;
        public final String CLICKED_BUTTON_ID_KEY = "clickedButtonId";
        public final String TOGGLES_KEY = "toggles";
        public final List<ToggleResult> toggleResults = new ArrayList();

        public ClosedEventParam(String str, HashMap<String, Boolean> hashMap) {
            this.clickedButtonId = str;
            for (Map.Entry<String, Boolean> entry : hashMap.entrySet()) {
                this.toggleResults.add(new ToggleResult(entry.getKey(), entry.getValue()));
            }
        }

        public String toJson() {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<ToggleResult> it = this.toggleResults.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next().toJsonObject());
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("clickedButtonId", !Helper.IsNullOrEmptyString(this.clickedButtonId) ? this.clickedButtonId : "");
                jSONObject.put("toggles", jSONArray);
                return jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
                return "";
            }
        }
    }

    public static class ToggleResult {
        public final String ID_KEY = "id";
        public final String STATE_KEY = "state";
        public Boolean state;
        public String toggleId;

        public ToggleResult(String str, Boolean bool) {
            this.toggleId = str;
            this.state = bool;
        }

        public String toJson() {
            return toJsonObject().toString();
        }

        public JSONObject toJsonObject() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", !Helper.IsNullOrEmptyString(this.toggleId) ? this.toggleId : "");
                jSONObject.put("state", this.state);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        public String getToggleId() {
            return this.toggleId;
        }

        public Boolean getState() {
            return this.state;
        }
    }
}
