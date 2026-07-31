package com.smaato.sdk.ng.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import com.smaato.sdk.ng.db.OnDatabaseResetListener;
import com.smaato.sdk.ng.utils.NextGenTimeUtils;

/* loaded from: classes11.dex */
public class NextGenPreferences {
    private final SharedPreferences a;
    private SharedPreferences.Editor b;

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

    public NextGenPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("nextgen_prefs_reporting", 0);
        this.a = sharedPreferences;
        if (sharedPreferences != null) {
            this.b = sharedPreferences.edit();
        }
    }

    private Boolean a() {
        return Boolean.valueOf(this.a.getBoolean("is_app_first_installed_tracked", false));
    }

    public String getAppFirstInstalledTime() {
        return this.a.getString("app_first_installed", "");
    }

    public long getSessionTimeStamp() {
        return this.a.getLong("session_timestamp", 0L);
    }

    public Boolean isTopicsAPIEnabled() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null && sharedPreferences.contains("topics_api_enabled")) {
            return Boolean.valueOf(this.a.getBoolean("topics_api_enabled", false));
        }
        return null;
    }

    public void setAppFirstInstalledTime(String str) {
        if (a().booleanValue()) {
            return;
        }
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            this.b = sharedPreferences.edit();
        }
        this.b.putString("app_first_installed", str);
        this.b.putBoolean("is_app_first_installed_tracked", true);
        this.b.commit();
    }

    public void setSessionTimeStamp(long j, OnDatabaseResetListener onDatabaseResetListener, TIMESTAMP timestamp) {
        long sessionTimeStamp = getSessionTimeStamp();
        if (sessionTimeStamp == 0) {
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                this.b = edit;
                edit.putLong("session_timestamp", j);
                this.b.commit();
                return;
            }
            return;
        }
        if (new NextGenTimeUtils().IsStartingNewSession(j - sessionTimeStamp).booleanValue()) {
            if (onDatabaseResetListener != null) {
                onDatabaseResetListener.onDatabaseReset();
            }
            SharedPreferences sharedPreferences2 = this.a;
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                this.b = edit2;
                edit2.putLong("session_timestamp", sessionTimeStamp);
                this.b.commit();
            }
        }
    }

    public void setTopicsAPIEnabled(Boolean bool) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null || bool == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        this.b = edit;
        edit.putBoolean("topics_api_enabled", bool.booleanValue());
        this.b.commit();
    }
}
