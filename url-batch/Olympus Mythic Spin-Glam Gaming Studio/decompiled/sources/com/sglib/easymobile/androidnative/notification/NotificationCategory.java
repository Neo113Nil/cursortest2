package com.sglib.easymobile.androidnative.notification;

import android.annotation.TargetApi;
import com.sglib.easymobile.androidnative.Helper;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class NotificationCategory {
    public static final String ACTION_BUTTONS_KEY = "actionButtons";
    public static final String ACTION_BUTTON_ICON_KEY = "icon";
    public static final String ACTION_BUTTON_ID_KEY = "id";
    public static final String ACTION_BUTTON_TITLE_KEY = "title";
    public static final String DESCRIPTION_KEY = "description";
    public static final String ENABLE_BADGE_KEY = "enableBadge";
    public static final String GROUP_ID_KEY = "groupId";
    public static final String ID_KEY = "id";
    public static final String IMPORTANCE_KEY = "importance";
    public static final String LIGHTS_KEY = "lights";
    public static final String LIGHT_COLOR_KEY = "lightColor";
    public static final String LOCKSCREEN_VISIBILITY_KEY = "lockScreenVisibility";
    public static final String NAME_KEY = "name";
    public static final String SOUND_KEY = "sound";
    public static final String SOUND_NAME_KEY = "soundName";
    public static final String VIBRATION_KEY = "vibration";
    public static final String VIBRATION_PATTERN_KEY = "vibrationPattern";
    public NotificationAction[] actionButtons;
    public String description;
    public boolean enableBadge;
    public String groupId;
    public String id;
    public Importance importance;
    public int lightColor;
    public FeatureOptions lights;
    public LockScreenVisibilityOptions lockScreenVisibility;
    public String name;
    public FeatureOptions sound;
    public String soundName;
    public FeatureOptions vibration;
    public long[] vibrationPattern;

    public NotificationCategory(String str, String str2, String str3, String str4, Importance importance, boolean z, FeatureOptions featureOptions, int i, FeatureOptions featureOptions2, long[] jArr, LockScreenVisibilityOptions lockScreenVisibilityOptions, FeatureOptions featureOptions3, String str5, NotificationAction[] notificationActionArr) {
        this.id = str;
        this.groupId = str2;
        this.name = str3;
        this.description = str4;
        this.importance = importance;
        this.enableBadge = z;
        this.lights = featureOptions;
        this.lightColor = i;
        this.vibration = featureOptions2;
        this.vibrationPattern = jArr;
        this.lockScreenVisibility = lockScreenVisibilityOptions;
        this.sound = featureOptions3;
        this.soundName = str5;
        this.actionButtons = notificationActionArr;
    }

    public String ToJson() {
        try {
            long[] jArr = this.vibrationPattern;
            boolean z = jArr != null && jArr.length > 0;
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (long j : this.vibrationPattern) {
                    arrayList.add(Long.valueOf(j));
                }
            }
            JSONObject jSONObject = new JSONObject();
            String str = "";
            jSONObject.put("id", Helper.IsNullOrEmptyString(this.id) ? "" : this.id);
            jSONObject.put(GROUP_ID_KEY, Helper.IsNullOrEmptyString(this.groupId) ? "" : this.groupId);
            jSONObject.put("name", Helper.IsNullOrEmptyString(this.name) ? "" : this.name);
            jSONObject.put("description", Helper.IsNullOrEmptyString(this.description) ? "" : this.description);
            jSONObject.put(IMPORTANCE_KEY, this.importance.toInt());
            jSONObject.put(ENABLE_BADGE_KEY, this.enableBadge);
            jSONObject.put(LIGHTS_KEY, this.lights.toInt());
            jSONObject.put(LIGHT_COLOR_KEY, this.lightColor);
            jSONObject.put(VIBRATION_KEY, this.vibration.toInt());
            jSONObject.put(VIBRATION_PATTERN_KEY, z ? new JSONArray((Collection) arrayList) : "");
            jSONObject.put(LOCKSCREEN_VISIBILITY_KEY, this.lockScreenVisibility.toInt());
            jSONObject.put(SOUND_KEY, this.sound.toInt());
            if (!Helper.IsNullOrEmptyString(this.soundName)) {
                str = this.soundName;
            }
            jSONObject.put(SOUND_NAME_KEY, str);
            jSONObject.put(ACTION_BUTTONS_KEY, NotificationActionsToJSONArray(this.actionButtons));
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static NotificationCategory FromJson(String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new NotificationCategory(jSONObject.getString("id"), jSONObject.getString(GROUP_ID_KEY), jSONObject.getString("name"), jSONObject.getString("description"), Importance.fromInt(jSONObject.getInt(IMPORTANCE_KEY)), jSONObject.getBoolean(ENABLE_BADGE_KEY), FeatureOptions.fromInt(jSONObject.getInt(LIGHTS_KEY)), jSONObject.getInt(LIGHT_COLOR_KEY), FeatureOptions.fromInt(jSONObject.getInt(VIBRATION_KEY)), ParseVibrationPattern(jSONObject.getString(VIBRATION_PATTERN_KEY)), LockScreenVisibilityOptions.fromInt(jSONObject.getInt(LOCKSCREEN_VISIBILITY_KEY)), FeatureOptions.fromInt(jSONObject.getInt(SOUND_KEY)), jSONObject.getString(SOUND_NAME_KEY), ParseNotificationActions(jSONObject.getString(ACTION_BUTTONS_KEY)));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static NotificationCategory[] NotificationCategoriesFromJson(String str) {
        if (!Helper.IsNullOrEmptyString(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(FromJson(jSONArray.getString(i)));
                }
                return (NotificationCategory[]) arrayList.toArray(new NotificationCategory[0]);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return new NotificationCategory[0];
    }

    private static long[] ParseVibrationPattern(String str) throws JSONException {
        if (Helper.IsNullOrEmptyString(str)) {
            return new long[0];
        }
        JSONArray jSONArray = new JSONArray(str);
        long[] jArr = new long[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            jArr[i] = jSONArray.getLong(i);
        }
        return jArr;
    }

    private static NotificationAction[] ParseNotificationActions(String str) throws JSONException {
        if (Helper.IsNullOrEmptyString(str)) {
            return new NotificationAction[0];
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                arrayList.add(new NotificationAction(jSONObject.getString("id"), jSONObject.getString("title"), jSONObject.getString("icon")));
            }
        }
        return (NotificationAction[]) arrayList.toArray(new NotificationAction[0]);
    }

    private static JSONArray NotificationActionsToJSONArray(NotificationAction[] notificationActionArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        if (notificationActionArr != null && notificationActionArr.length != 0) {
            for (int i = 0; i < notificationActionArr.length; i++) {
                JSONObject jSONObject = new JSONObject();
                String str = "";
                jSONObject.put("id", Helper.IsNullOrEmptyString(notificationActionArr[i].id) ? "" : notificationActionArr[i].id);
                jSONObject.put("title", Helper.IsNullOrEmptyString(notificationActionArr[i].title) ? "" : notificationActionArr[i].title);
                if (!Helper.IsNullOrEmptyString(notificationActionArr[i].icon)) {
                    str = notificationActionArr[i].icon;
                }
                jSONObject.put("icon", str);
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public enum Importance {
        Default(0),
        High(1),
        Low(2),
        Min(4),
        None(5),
        Unspecified(6);

        private static Importance[] mValues = null;
        int id;

        Importance(int i) {
            this.id = i;
        }

        public int toInt() {
            return this.id;
        }

        public boolean compare(int i) {
            return this.id == i;
        }

        public static Importance fromInt(int i) {
            if (mValues == null) {
                mValues = values();
            }
            int i2 = 0;
            while (true) {
                Importance[] importanceArr = mValues;
                if (i2 < importanceArr.length) {
                    if (importanceArr[i2].compare(i)) {
                        return mValues[i2];
                    }
                    i2++;
                } else {
                    return importanceArr[0];
                }
            }
        }

        public int toAndroidImportanceConstant() {
            int i = this.id;
            if (i == 1) {
                return 4;
            }
            if (i == 2) {
                return 2;
            }
            if (i == 4) {
                return 1;
            }
            if (i != 5) {
                return i != 6 ? 3 : -1000;
            }
            return 0;
        }

        public int toAndroidPriorityConstant() {
            int i = this.id;
            if (i == 1) {
                return 1;
            }
            if (i != 2) {
                return (i == 4 || i == 5) ? -2 : 0;
            }
            return -1;
        }
    }

    public enum FeatureOptions {
        Off(0),
        Default(1),
        Custom(2);

        private static FeatureOptions[] mValues = null;
        int id;

        FeatureOptions(int i) {
            this.id = i;
        }

        public int toInt() {
            return this.id;
        }

        public boolean compare(int i) {
            return this.id == i;
        }

        public static FeatureOptions fromInt(int i) {
            if (mValues == null) {
                mValues = values();
            }
            int i2 = 0;
            while (true) {
                FeatureOptions[] featureOptionsArr = mValues;
                if (i2 < featureOptionsArr.length) {
                    if (featureOptionsArr[i2].compare(i)) {
                        return mValues[i2];
                    }
                    i2++;
                } else {
                    return featureOptionsArr[0];
                }
            }
        }
    }

    public enum LockScreenVisibilityOptions {
        Secret(0),
        Private(1),
        Public(2);

        private static LockScreenVisibilityOptions[] mValues = null;
        int id;

        LockScreenVisibilityOptions(int i) {
            this.id = i;
        }

        public int toInt() {
            return this.id;
        }

        @TargetApi(21)
        public int toAndroidConstant() {
            int i = this.id;
            if (i != 0) {
                return i != 1 ? 1 : 0;
            }
            return -1;
        }

        public boolean compare(int i) {
            return this.id == i;
        }

        public static LockScreenVisibilityOptions fromInt(int i) {
            if (mValues == null) {
                mValues = values();
            }
            int i2 = 0;
            while (true) {
                LockScreenVisibilityOptions[] lockScreenVisibilityOptionsArr = mValues;
                if (i2 < lockScreenVisibilityOptionsArr.length) {
                    if (lockScreenVisibilityOptionsArr[i2].compare(i)) {
                        return mValues[i2];
                    }
                    i2++;
                } else {
                    return lockScreenVisibilityOptionsArr[0];
                }
            }
        }
    }
}
