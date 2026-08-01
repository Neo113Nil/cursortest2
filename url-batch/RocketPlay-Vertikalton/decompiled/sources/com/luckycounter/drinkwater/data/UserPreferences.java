package com.luckycounter.drinkwater.data;

import android.content.Context;
import android.content.SharedPreferences;
import i1.d;
import i1.f;

/* loaded from: classes.dex */
public final class UserPreferences {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_CUSTOM_GOAL = "custom_goal";
    private static final String KEY_DAILY_GOAL = "daily_goal";
    private static final String KEY_LAST_CELEBRATE = "last_celebrate";
    private static final String KEY_LAST_GOAL_DATE = "last_goal_date";
    private static final String KEY_STREAK = "streak";
    private static final String PREFS_NAME = "hydration_prefs";
    private final SharedPreferences prefs;

    public static final class Companion {
        public /* synthetic */ Companion(d dVar) {
            this();
        }

        private Companion() {
        }
    }

    public UserPreferences(Context context) {
        f.e(context, "context");
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS_NAME, 0);
        f.d(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
    }

    public final boolean getCustomGoalEnabled() {
        return this.prefs.getBoolean(KEY_CUSTOM_GOAL, false);
    }

    public final int getDailyGoalMl() {
        return this.prefs.getInt(KEY_DAILY_GOAL, 2000);
    }

    public final String getLastCelebrateDate() {
        return this.prefs.getString(KEY_LAST_CELEBRATE, null);
    }

    public final String getLastGoalDate() {
        return this.prefs.getString(KEY_LAST_GOAL_DATE, null);
    }

    public final int getStreakDays() {
        return this.prefs.getInt(KEY_STREAK, 0);
    }

    public final void resetStreak() {
        this.prefs.edit().putInt(KEY_STREAK, 0).putString(KEY_LAST_GOAL_DATE, null).apply();
    }

    public final void setCustomGoalEnabled(boolean z2) {
        this.prefs.edit().putBoolean(KEY_CUSTOM_GOAL, z2).apply();
    }

    public final void setDailyGoalMl(int i) {
        this.prefs.edit().putInt(KEY_DAILY_GOAL, i).apply();
    }

    public final void setLastCelebrateDate(String str) {
        this.prefs.edit().putString(KEY_LAST_CELEBRATE, str).apply();
    }

    public final void setLastGoalDate(String str) {
        this.prefs.edit().putString(KEY_LAST_GOAL_DATE, str).apply();
    }

    public final void setStreakDays(int i) {
        this.prefs.edit().putInt(KEY_STREAK, i).apply();
    }
}
