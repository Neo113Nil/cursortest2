package com.sglib.easymobile.androidnative.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.sglib.easymobile.androidnative.AppUtil;
import com.sglib.easymobile.androidnative.Helper;
import com.sglib.easymobile.androidnative.R;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.core.view2.divs.widgets.DivSeparatorView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class NotificationManager {
    static void Init(Context context, NotificationCategoryGroup[] notificationCategoryGroupArr, NotificationCategory[] notificationCategoryArr) {
        boolean z = Build.VERSION.SDK_INT >= 26;
        if (notificationCategoryGroupArr != null && notificationCategoryGroupArr.length > 0) {
            for (int i = 0; i < notificationCategoryGroupArr.length; i++) {
                if (z) {
                    NotificationHelper.CreateChannelGroup(context, notificationCategoryGroupArr[i]);
                }
                NotificationHelper.StoreNotificationCategoryGroupJson(context, notificationCategoryGroupArr[i]);
            }
        }
        if (notificationCategoryArr != null && notificationCategoryArr.length > 0) {
            for (int i2 = 0; i2 < notificationCategoryArr.length; i2++) {
                if (z) {
                    NotificationHelper.CreateChannel(context, notificationCategoryArr[i2]);
                }
                NotificationHelper.StoreNotificationCategoryJson(context, notificationCategoryArr[i2]);
            }
        }
        String DispatchLaunchNotificationData = NotificationHandlerActivity.DispatchLaunchNotificationData();
        if (DispatchLaunchNotificationData != null) {
            NotificationUnityInterface.UnityOnLocalNotificationFromBackground(DispatchLaunchNotificationData);
        }
    }

    static void ScheduleLocalNotification(Context context, NotificationRequest notificationRequest) {
        if (notificationRequest == null) {
            Helper.Log("Failed to schedule local notification: invalid request.");
            return;
        }
        CancelPendingLocalNotificationRequest(context, notificationRequest.id);
        String StoreNotificationRequestJson = NotificationHelper.StoreNotificationRequestJson(context, notificationRequest);
        Intent intent = new Intent(context, (Class<?>) NotificationAlarmReceiver.class);
        intent.putExtra("NOTIF_DATA_KEY", StoreNotificationRequestJson);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, notificationRequest.requestCode, intent, 134217728);
        NotificationAlarmReceiver.EnableReceiver(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        long j = notificationRequest.repeatSecs;
        if (j > 0) {
            alarmManager.setRepeating(0, notificationRequest.fireTimeMillis, j * 1000, broadcast);
        } else {
            alarmManager.set(0, notificationRequest.fireTimeMillis, broadcast);
        }
    }

    static void CancelPendingLocalNotificationRequest(Context context, String str) {
        NotificationRequest GetPendingNotificationRequestWithID = GetPendingNotificationRequestWithID(context, str);
        if (GetPendingNotificationRequestWithID == null) {
            return;
        }
        DoCancelPendingLocalNotificationRequest(context, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), GetPendingNotificationRequestWithID.requestCode);
        NotificationHelper.RemoveNotificationRequestJson(context, str);
        if (HasPendingNotificationRequest(context)) {
            return;
        }
        NotificationAlarmReceiver.DisableReceiver(context);
    }

    static void CancelAllPendingLocalNotificationRequests(Context context) {
        NotificationRequest[] GetPendingNotificationRequests = GetPendingNotificationRequests(context);
        if (GetPendingNotificationRequests.length < 1) {
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        for (int i = 0; i < GetPendingNotificationRequests.length; i++) {
            DoCancelPendingLocalNotificationRequest(context, alarmManager, GetPendingNotificationRequests[i].requestCode);
            NotificationHelper.RemoveNotificationRequestJson(context, GetPendingNotificationRequests[i].id);
        }
        NotificationAlarmReceiver.DisableReceiver(context);
    }

    static void CancelAllShownNotifications(Context context) {
        ((android.app.NotificationManager) context.getSystemService("notification")).cancelAll();
    }

    static String[] GetPendingNotificationRequestsJson(Context context) {
        Map<String, ?> GetAllNotificationRequestsJson = NotificationHelper.GetAllNotificationRequestsJson(context);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = GetAllNotificationRequestsJson.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    static NotificationRequest[] GetPendingNotificationRequests(Context context) {
        Map<String, ?> GetAllNotificationRequestsJson = NotificationHelper.GetAllNotificationRequestsJson(context);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = GetAllNotificationRequestsJson.entrySet().iterator();
        while (it.hasNext()) {
            NotificationRequest FromJson = NotificationRequest.FromJson(it.next().getValue().toString());
            if (FromJson != null) {
                arrayList.add(FromJson);
            }
        }
        return (NotificationRequest[]) arrayList.toArray(new NotificationRequest[0]);
    }

    static NotificationRequest GetPendingNotificationRequestWithID(Context context, String str) {
        String GetNotificationRequestJsonWithKey = NotificationHelper.GetNotificationRequestJsonWithKey(context, str);
        if (Helper.IsNullOrEmptyString(GetNotificationRequestJsonWithKey)) {
            return null;
        }
        return NotificationRequest.FromJson(GetNotificationRequestJsonWithKey);
    }

    static boolean HasPendingNotificationRequest(Context context) {
        return NotificationHelper.GetAllNotificationRequestsJson(context).size() > 0;
    }

    static NotificationCategory[] GetAllNotificationCategories(Context context) {
        Map<String, ?> GetAllNotificationCategoriesJson = NotificationHelper.GetAllNotificationCategoriesJson(context);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = GetAllNotificationCategoriesJson.entrySet().iterator();
        while (it.hasNext()) {
            NotificationCategory FromJson = NotificationCategory.FromJson(it.next().getValue().toString());
            if (FromJson != null) {
                arrayList.add(FromJson);
            }
        }
        return (NotificationCategory[]) arrayList.toArray(new NotificationCategory[0]);
    }

    static NotificationCategory GetNotificationCategoryWithID(Context context, String str) {
        String GetNotificationCategoryJsonWithKey = NotificationHelper.GetNotificationCategoryJsonWithKey(context, str);
        if (Helper.IsNullOrEmptyString(GetNotificationCategoryJsonWithKey)) {
            return null;
        }
        return NotificationCategory.FromJson(GetNotificationCategoryJsonWithKey);
    }

    static void DeliverNotification(Context context, String str) {
        int i;
        int GetSystemSDKLevel = Helper.GetSystemSDKLevel();
        NotificationRequest FromJson = NotificationRequest.FromJson(NotificationHelper.GetNotificationRequestJsonWithKey(context, str));
        if (FromJson == null) {
            Helper.LogError("Error parsing notification request from JSON. Please check.");
            return;
        }
        String str2 = FromJson.id;
        String str3 = FromJson.title;
        String str4 = FromJson.message;
        String str5 = FromJson.categoryId;
        String str6 = FromJson.smallIcon;
        String str7 = FromJson.largeIcon;
        long j = FromJson.repeatSecs;
        int i2 = FromJson.requestCode;
        NotificationCategory GetNotificationCategoryWithID = GetNotificationCategoryWithID(context, str5);
        if (GetNotificationCategoryWithID == null) {
            Helper.Log("Failed to deliver notification: invalid channel/category with id: " + str5);
            return;
        }
        String ToJson = new NotificationResponse("", FromJson).ToJson();
        if (AppUtil.IsAppInForeground()) {
            NotificationUnityInterface.UnityOnLocalNotificationFromForeground(ToJson);
        } else {
            NotificationCompat.Builder style = new NotificationCompat.Builder(context, str5).setAutoCancel(true).setContentTitle(str3).setContentText(str4).setStyle(new NotificationCompat.BigTextStyle().bigText(str4));
            if (GetSystemSDKLevel < 26) {
                style.setPriority(GetNotificationCategoryWithID.importance.toAndroidPriorityConstant());
                if (!GetNotificationCategoryWithID.enableBadge) {
                    style.setBadgeIconType(0);
                }
                NotificationCategory.FeatureOptions featureOptions = GetNotificationCategoryWithID.lights;
                NotificationCategory.FeatureOptions featureOptions2 = NotificationCategory.FeatureOptions.Default;
                if (featureOptions == featureOptions2) {
                    i = 4;
                } else {
                    style.setLights(GetNotificationCategoryWithID.lightColor, featureOptions == NotificationCategory.FeatureOptions.Off ? 0 : 500, 5000);
                    i = 0;
                }
                NotificationCategory.FeatureOptions featureOptions3 = GetNotificationCategoryWithID.vibration;
                if (featureOptions3 == featureOptions2) {
                    i |= 2;
                } else {
                    style.setVibrate(featureOptions3 == NotificationCategory.FeatureOptions.Off ? null : GetNotificationCategoryWithID.vibrationPattern);
                }
                NotificationCategory.FeatureOptions featureOptions4 = GetNotificationCategoryWithID.sound;
                if (featureOptions4 == featureOptions2) {
                    i |= 1;
                } else {
                    style.setSound(featureOptions4 == NotificationCategory.FeatureOptions.Off ? null : NotificationHelper.GetSoundUri(context, GetNotificationCategoryWithID.soundName));
                }
                if (Helper.GetSystemSDKLevel() >= 21) {
                    style.setVisibility(GetNotificationCategoryWithID.lockScreenVisibility.toAndroidConstant());
                }
                style.setDefaults(i);
            }
            Resources resources = context.getResources();
            int identifier = !Helper.IsNullOrEmptyString(str6) ? resources.getIdentifier(str6, "drawable", context.getPackageName()) : 0;
            if (identifier <= 0) {
                identifier = R.drawable.ic_stat_easymobile_fallback;
            }
            style.setSmallIcon(identifier);
            int identifier2 = !Helper.IsNullOrEmptyString(str7) ? resources.getIdentifier(str7, "drawable", context.getPackageName()) : 0;
            if (identifier2 > 0) {
                style.setLargeIcon(BitmapFactory.decodeResource(resources, identifier2));
            }
            style.setContentIntent(PendingIntent.getActivity(context, i2, CreateStandardNotificationIntent(context, ToJson), 134217728));
            if (GetSystemSDKLevel >= 23 && GetNotificationCategoryWithID.actionButtons != null) {
                int i3 = 0;
                while (true) {
                    NotificationAction[] notificationActionArr = GetNotificationCategoryWithID.actionButtons;
                    if (i3 >= notificationActionArr.length) {
                        break;
                    }
                    NotificationAction notificationAction = notificationActionArr[i3];
                    String str8 = notificationAction.id;
                    String str9 = notificationAction.title;
                    String str10 = notificationAction.icon;
                    if (!Helper.IsNullOrEmptyString(str8) && !Helper.IsNullOrEmptyString(str9)) {
                        style.addAction(!Helper.IsNullOrEmptyString(str10) ? resources.getIdentifier(str10, "drawable", context.getPackageName()) : 0, str9, PendingIntent.getActivity(context, NotificationHelper.GetNextNotificationRequestCode(context), CreateStandardNotificationIntent(context, new NotificationResponse(str8, FromJson).ToJson()), 1073741824));
                    }
                    i3++;
                }
            }
            ((android.app.NotificationManager) context.getSystemService("notification")).notify(i2, style.build());
        }
        if (j > 0) {
            FromJson.fireTimeMillis = System.currentTimeMillis() + (j * 1000);
            NotificationHelper.StoreNotificationRequestJson(context, FromJson);
        } else {
            NotificationHelper.RemoveNotificationRequestJson(context, str2);
            if (HasPendingNotificationRequest(context)) {
                return;
            }
            NotificationAlarmReceiver.DisableReceiver(context);
        }
    }

    private static Intent CreateStandardNotificationIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) NotificationHandlerActivity.class);
        intent.addFlags(DivSeparatorView.DEFAULT_DIVIDER_COLOR);
        intent.putExtra("NOTIF_DATA", str);
        return intent;
    }

    private static void DoCancelPendingLocalNotificationRequest(Context context, AlarmManager alarmManager, int i) {
        alarmManager.cancel(PendingIntent.getBroadcast(context, i, new Intent(context, (Class<?>) NotificationAlarmReceiver.class), 134217728));
    }
}
