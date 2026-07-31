package com.sglib.easymobile.androidnative.notification;

import android.app.Activity;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes3.dex */
public class NotificationUnityInterface {
    private static String UNITY_LOCAL_NOTIFICATION_LISTENER;
    private static String UNITY_ON_LOCAL_NOTIFICATION_FROM_BACKGROUND;
    private static String UNITY_ON_LOCAL_NOTIFICATION_FROM_FOREGROUND;

    public static void _Init(String str, String str2, String str3, String str4, String str5) {
        UNITY_LOCAL_NOTIFICATION_LISTENER = str3;
        UNITY_ON_LOCAL_NOTIFICATION_FROM_BACKGROUND = str4;
        UNITY_ON_LOCAL_NOTIFICATION_FROM_FOREGROUND = str5;
        NotificationManager.Init(UnityPlayer.currentActivity, NotificationCategoryGroup.NotificationCategoryGroupsFromJson(str), NotificationCategory.NotificationCategoriesFromJson(str2));
    }

    public static void _ScheduleLocalNotification(String str, long j, long j2, String str2, String str3, String str4, String str5, String str6, String str7) {
        Activity activity = UnityPlayer.currentActivity;
        NotificationManager.ScheduleLocalNotification(activity, new NotificationRequest(str, str2, str3, str4, str5, str6, str7, System.currentTimeMillis() + (1000 * j), j2, NotificationHelper.GetNextNotificationRequestCode(activity)));
    }

    public static String[] _GetPendingNotificationRequestsJson() {
        return NotificationManager.GetPendingNotificationRequestsJson(UnityPlayer.currentActivity);
    }

    public static void _CancelPendingLocalNotificationRequest(String str) {
        NotificationManager.CancelPendingLocalNotificationRequest(UnityPlayer.currentActivity, str);
    }

    public static void _CancelAllPendingLocalNotificationRequests() {
        NotificationManager.CancelAllPendingLocalNotificationRequests(UnityPlayer.currentActivity);
    }

    public static void _CancelAllShownNotifications() {
        NotificationManager.CancelAllShownNotifications(UnityPlayer.currentActivity);
    }

    static void UnityOnLocalNotificationFromForeground(String str) {
        UnityPlayer.UnitySendMessage(UNITY_LOCAL_NOTIFICATION_LISTENER, UNITY_ON_LOCAL_NOTIFICATION_FROM_FOREGROUND, str);
    }

    static void UnityOnLocalNotificationFromBackground(String str) {
        UnityPlayer.UnitySendMessage(UNITY_LOCAL_NOTIFICATION_LISTENER, UNITY_ON_LOCAL_NOTIFICATION_FROM_BACKGROUND, str);
    }
}
