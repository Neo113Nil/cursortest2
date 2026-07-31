package net.pubnative.lite.sdk.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import net.pubnative.lite.sdk.db.OnDatabaseResetListener;
import net.pubnative.lite.sdk.utils.HyBidTimeUtils;

/* loaded from: classes11.dex */
public class HyBidPreferences {
    private SharedPreferences.Editor editor;
    private final SharedPreferences sharedPreferences;

    public static class Key {
        public static final String App_FIRST_INSTALLED = "app_first_installed";
        public static final String IS_App_FIRST_INSTALLED_TRACKED = "is_app_first_installed_tracked";
        public static final String SESSION_TIMESTAMP = "session_timestamp";
        public static final String TOPICS_API_ENABLED = "topics_api_enabled";
    }

    public enum TIMESTAMP {
        NORMAL,
        AD_REQUEST
    }

    public HyBidPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("hybid_prefs_reporting", 0);
        this.sharedPreferences = sharedPreferences;
        if (sharedPreferences != null) {
            this.editor = sharedPreferences.edit();
        }
    }

    private Boolean isAppFirstInstalledTracked() {
        return Boolean.valueOf(this.sharedPreferences.getBoolean("is_app_first_installed_tracked", false));
    }

    public String getAppFirstInstalledTime() {
        return this.sharedPreferences.getString("app_first_installed", "");
    }

    public long getSessionTimeStamp() {
        return this.sharedPreferences.getLong("session_timestamp", 0L);
    }

    public Boolean isTopicsAPIEnabled() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null && sharedPreferences.contains("topics_api_enabled")) {
            return Boolean.valueOf(this.sharedPreferences.getBoolean("topics_api_enabled", false));
        }
        return null;
    }

    public void setAppFirstInstalledTime(String str) {
        if (isAppFirstInstalledTracked().booleanValue()) {
            return;
        }
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences != null) {
            this.editor = sharedPreferences.edit();
        }
        this.editor.putString("app_first_installed", str);
        this.editor.putBoolean("is_app_first_installed_tracked", true);
        this.editor.commit();
    }

    public void setSessionTimeStamp(long j, OnDatabaseResetListener onDatabaseResetListener, TIMESTAMP timestamp) {
        long sessionTimeStamp = getSessionTimeStamp();
        if (sessionTimeStamp == 0) {
            SharedPreferences sharedPreferences = this.sharedPreferences;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.editor = edit;
                edit.putLong("session_timestamp", j);
                this.editor.commit();
                return;
            }
            return;
        }
        if (new HyBidTimeUtils().IsStartingNewSession(j - sessionTimeStamp).booleanValue()) {
            if (onDatabaseResetListener != null) {
                onDatabaseResetListener.onDatabaseReset();
            }
            SharedPreferences sharedPreferences2 = this.sharedPreferences;
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                this.editor = edit2;
                edit2.putLong("session_timestamp", sessionTimeStamp);
                this.editor.commit();
            }
        }
    }

    public void setTopicsAPIEnabled(Boolean bool) {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        if (sharedPreferences == null || bool == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        this.editor = edit;
        edit.putBoolean("topics_api_enabled", bool.booleanValue());
        this.editor.commit();
    }
}
