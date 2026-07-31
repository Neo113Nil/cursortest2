package com.sglib.easymobile.androidnative.notification;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.media3.common.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import com.sglib.easymobile.androidnative.Helper;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import java.util.Map;

/* loaded from: classes5.dex */
public class NotificationHelper {
    @TargetApi(26)
    static void CreateChannelGroup(Context context, NotificationCategoryGroup notificationCategoryGroup) {
        if (Build.VERSION.SDK_INT < 26 || Helper.IsNullOrEmptyString(notificationCategoryGroup.id) || Helper.IsNullOrEmptyString(notificationCategoryGroup.name)) {
            return;
        }
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        NotificationHelper$$ExternalSyntheticApiModelOutline9.m();
        notificationManager.createNotificationChannelGroup(NotificationHelper$$ExternalSyntheticApiModelOutline8.m(notificationCategoryGroup.id, notificationCategoryGroup.name));
    }

    @TargetApi(26)
    static void CreateChannel(Context context, NotificationCategory notificationCategory) {
        Uri GetSoundUri;
        long[] jArr;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        android.app.NotificationManager notificationManager = (android.app.NotificationManager) context.getSystemService("notification");
        NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
        NotificationChannel m = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(notificationCategory.id, notificationCategory.name, notificationCategory.importance.toAndroidImportanceConstant());
        if (!Helper.IsNullOrEmptyString(notificationCategory.description)) {
            m.setDescription(notificationCategory.description);
        }
        if (!Helper.IsNullOrEmptyString(notificationCategory.groupId)) {
            m.setGroup(notificationCategory.groupId);
        }
        m.setShowBadge(notificationCategory.enableBadge);
        NotificationCategory.FeatureOptions featureOptions = notificationCategory.lights;
        NotificationCategory.FeatureOptions featureOptions2 = NotificationCategory.FeatureOptions.Off;
        m.enableLights(featureOptions != featureOptions2);
        NotificationCategory.FeatureOptions featureOptions3 = notificationCategory.lights;
        NotificationCategory.FeatureOptions featureOptions4 = NotificationCategory.FeatureOptions.Default;
        if (featureOptions3 != featureOptions4 && featureOptions3 == NotificationCategory.FeatureOptions.Custom) {
            m.setLightColor(notificationCategory.lightColor);
        }
        m.enableVibration(notificationCategory.vibration != featureOptions2);
        NotificationCategory.FeatureOptions featureOptions5 = notificationCategory.vibration;
        if (featureOptions5 != featureOptions4 && featureOptions5 == NotificationCategory.FeatureOptions.Custom && (jArr = notificationCategory.vibrationPattern) != null && jArr.length > 0) {
            m.setVibrationPattern(jArr);
        }
        m.setLockscreenVisibility(notificationCategory.lockScreenVisibility.toAndroidConstant());
        NotificationCategory.FeatureOptions featureOptions6 = notificationCategory.sound;
        if (featureOptions6 == featureOptions2) {
            m.setSound(null, null);
        } else if (featureOptions6 != featureOptions4 && featureOptions6 == NotificationCategory.FeatureOptions.Custom && (GetSoundUri = GetSoundUri(context, notificationCategory.soundName)) != null) {
            m.setSound(GetSoundUri, new AudioAttributes.Builder().setUsage(5).setContentType(4).build());
        }
        notificationManager.createNotificationChannel(m);
    }

    static Uri GetSoundUri(Context context, String str) {
        if (Helper.IsNullOrEmptyString(str)) {
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    static int GetNextNotificationRequestCode(Context context) {
        int GetMaxNotificationRequestCode = GetMaxNotificationRequestCode(context);
        int i = GetMaxNotificationRequestCode != Integer.MAX_VALUE ? 1 + GetMaxNotificationRequestCode : 1;
        SetMaxNotificationRequestCode(context, i);
        return i;
    }

    static int GetMaxNotificationRequestCode(Context context) {
        return context.getSharedPreferences("em-notification-data-sharedprefs", 0).getInt("NOTIF_MAX_REQUEST_CODE_KEY", 0);
    }

    static void SetMaxNotificationRequestCode(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("em-notification-data-sharedprefs", 0).edit();
        edit.putInt("NOTIF_MAX_REQUEST_CODE_KEY", i);
        edit.commit();
    }

    static String StoreNotificationRequestJson(Context context, NotificationRequest notificationRequest) {
        String ToJson = notificationRequest.ToJson();
        String str = notificationRequest.id;
        if (ToJson != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("em-notification-requests-sharedprefs", 0).edit();
            edit.putString(str, ToJson);
            edit.commit();
        }
        return str;
    }

    static void RemoveNotificationRequestJson(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("em-notification-requests-sharedprefs", 0).edit();
        edit.remove(str);
        edit.commit();
    }

    static Map<String, ?> GetAllNotificationRequestsJson(Context context) {
        return context.getSharedPreferences("em-notification-requests-sharedprefs", 0).getAll();
    }

    static String GetNotificationRequestJsonWithKey(Context context, String str) {
        return context.getSharedPreferences("em-notification-requests-sharedprefs", 0).getString(str, null);
    }

    static String StoreNotificationCategoryGroupJson(Context context, NotificationCategoryGroup notificationCategoryGroup) {
        if (notificationCategoryGroup == null) {
            return null;
        }
        String ToJson = notificationCategoryGroup.ToJson();
        String str = notificationCategoryGroup.id;
        if (ToJson != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("em-notification-category-groups-sharedprefs", 0).edit();
            edit.putString(str, ToJson);
            edit.commit();
        }
        return str;
    }

    static void RemoveNotificationCategoryGroupJson(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("em-notification-category-groups-sharedprefs", 0).edit();
        edit.remove(str);
        edit.commit();
    }

    static Map<String, ?> GetAllNotificationCategoryGroupsJson(Context context) {
        return context.getSharedPreferences("em-notification-category-groups-sharedprefs", 0).getAll();
    }

    static String GetNotificationCategoryGroupJsonWithKey(Context context, String str) {
        return context.getSharedPreferences("em-notification-category-groups-sharedprefs", 0).getString(str, null);
    }

    static String StoreNotificationCategoryJson(Context context, NotificationCategory notificationCategory) {
        if (notificationCategory == null) {
            return null;
        }
        String ToJson = notificationCategory.ToJson();
        String str = notificationCategory.id;
        if (ToJson != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("em-notification-categories-sharedprefs", 0).edit();
            edit.putString(str, ToJson);
            edit.commit();
        }
        return str;
    }

    static void RemoveNotificationCategoryJson(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("em-notification-categories-sharedprefs", 0).edit();
        edit.remove(str);
        edit.commit();
    }

    static Map<String, ?> GetAllNotificationCategoriesJson(Context context) {
        return context.getSharedPreferences("em-notification-categories-sharedprefs", 0).getAll();
    }

    static String GetNotificationCategoryJsonWithKey(Context context, String str) {
        return context.getSharedPreferences("em-notification-categories-sharedprefs", 0).getString(str, null);
    }
}
