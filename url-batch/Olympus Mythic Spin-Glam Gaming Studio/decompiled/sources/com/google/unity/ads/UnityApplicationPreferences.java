package com.google.unity.ads;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* loaded from: classes8.dex */
public final class UnityApplicationPreferences {
    private final SharedPreferences defaultSharedPreferences;

    public UnityApplicationPreferences(Activity activity) {
        this.defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(activity);
    }

    public void setInt(String str, int i) {
        SharedPreferences.Editor edit = this.defaultSharedPreferences.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public void setString(String str, String str2) {
        SharedPreferences.Editor edit = this.defaultSharedPreferences.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public int getInt(String str) {
        return this.defaultSharedPreferences.getInt(str, 0);
    }

    public String getString(String str) {
        return this.defaultSharedPreferences.getString(str, null);
    }
}
