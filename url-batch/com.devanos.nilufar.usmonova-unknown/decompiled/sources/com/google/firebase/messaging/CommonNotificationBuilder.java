package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC1025fF;
import o.AbstractC1839re;
import o.C0959eF;
import o.C1091gF;
import o.K7;

/* loaded from: classes.dex */
public final class CommonNotificationBuilder {
    private static final String ACTION_RECEIVER = "com.google.android.c2dm.intent.RECEIVE";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL = "fcm_fallback_notification_channel";
    public static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL = "fcm_fallback_notification_channel_label";
    private static final String FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE = "Misc";
    private static final int ILLEGAL_RESOURCE_ID = 0;
    public static final String METADATA_DEFAULT_CHANNEL_ID = "com.google.firebase.messaging.default_notification_channel_id";
    public static final String METADATA_DEFAULT_COLOR = "com.google.firebase.messaging.default_notification_color";
    public static final String METADATA_DEFAULT_ICON = "com.google.firebase.messaging.default_notification_icon";
    private static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {
        public final int id;
        public final C1091gF notificationBuilder;
        public final String tag;

        public DisplayNotificationInfo(C1091gF c1091gF, String str, int i) {
            this.notificationBuilder = c1091gF;
            this.tag = str;
            this.id = i;
        }
    }

    private CommonNotificationBuilder() {
    }

    private static PendingIntent createContentIntent(Context context, NotificationParams notificationParams, String str, PackageManager packageManager) {
        Intent createTargetIntent = createTargetIntent(str, notificationParams, packageManager);
        if (createTargetIntent == null) {
            return null;
        }
        createTargetIntent.addFlags(67108864);
        createTargetIntent.putExtras(notificationParams.paramsWithReservedKeysRemoved());
        if (shouldUploadMetrics(notificationParams)) {
            createTargetIntent.putExtra(Constants.MessageNotificationKeys.ANALYTICS_DATA, notificationParams.paramsForAnalyticsIntent());
        }
        return PendingIntent.getActivity(context, generatePendingIntentRequestCode(), createTargetIntent, getPendingIntentFlags(1073741824));
    }

    private static PendingIntent createDeleteIntent(Context context, Context context2, NotificationParams notificationParams) {
        if (shouldUploadMetrics(notificationParams)) {
            return createMessagingPendingIntent(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(notificationParams.paramsForAnalyticsIntent()));
        }
        return null;
    }

    private static PendingIntent createMessagingPendingIntent(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, generatePendingIntentRequestCode(), new Intent(ACTION_RECEIVER).setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), getPendingIntentFlags(1073741824));
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, NotificationParams notificationParams) {
        Bundle manifestMetadata = getManifestMetadata(context.getPackageManager(), context.getPackageName());
        return createNotificationInfo(context, context, notificationParams, getOrCreateChannel(context, notificationParams.getNotificationChannelId(), manifestMetadata), manifestMetadata);
    }

    private static Intent createTargetIntent(String str, NotificationParams notificationParams, PackageManager packageManager) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
        if (!TextUtils.isEmpty(string)) {
            Intent intent = new Intent(string);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri link = notificationParams.getLink();
        if (link != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(link);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w(Constants.TAG, "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int generatePendingIntentRequestCode() {
        return requestCodeProvider.incrementAndGet();
    }

    private static Integer getColor(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w(Constants.TAG, "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt(METADATA_DEFAULT_COLOR, ILLEGAL_RESOURCE_ID);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(AbstractC1839re.a(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w(Constants.TAG, "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int getConsolidatedDefaults(NotificationParams notificationParams) {
        boolean z = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
        ?? r0 = z;
        if (notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS)) {
            r0 = (z ? 1 : 0) | 2;
        }
        return notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS) ? r0 | 4 : r0;
    }

    private static Bundle getManifestMetadata(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w(Constants.TAG, "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String getOrCreateChannel(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), ILLEGAL_RESOURCE_ID).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w(Constants.TAG, "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString(METADATA_DEFAULT_CHANNEL_ID);
            if (TextUtils.isEmpty(string2)) {
                Log.w(Constants.TAG, "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                Log.w(Constants.TAG, "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel(FCM_FALLBACK_NOTIFICATION_CHANNEL);
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier(FCM_FALLBACK_NOTIFICATION_CHANNEL_LABEL, "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e(Constants.TAG, "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME_NO_RESOURCE;
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(K7.c(string));
            }
            return FCM_FALLBACK_NOTIFICATION_CHANNEL;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int getPendingIntentFlags(int i) {
        return i | 67108864;
    }

    private static int getSmallIcon(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && isValidIcon(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && isValidIcon(resources, identifier2)) {
                return identifier2;
            }
            Log.w(Constants.TAG, "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt(METADATA_DEFAULT_ICON, ILLEGAL_RESOURCE_ID);
        if (i == 0 || !isValidIcon(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, ILLEGAL_RESOURCE_ID).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w(Constants.TAG, "Couldn't get own application info: " + e);
            }
        }
        return (i == 0 || !isValidIcon(resources, i)) ? android.R.drawable.sym_def_app_icon : i;
    }

    private static Uri getSound(String str, NotificationParams notificationParams, Resources resources) {
        String soundResourceName = notificationParams.getSoundResourceName();
        if (TextUtils.isEmpty(soundResourceName)) {
            return null;
        }
        if ("default".equals(soundResourceName) || resources.getIdentifier(soundResourceName, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + soundResourceName);
    }

    private static String getTag(NotificationParams notificationParams) {
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean isValidIcon(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!K7.B(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e(Constants.TAG, "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e(Constants.TAG, "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    public static boolean shouldUploadMetrics(NotificationParams notificationParams) {
        return notificationParams.getBoolean(Constants.AnalyticsKeys.ENABLED);
    }

    public static DisplayNotificationInfo createNotificationInfo(Context context, Context context2, NotificationParams notificationParams, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        C1091gF c1091gF = new C1091gF(context2, str);
        String possiblyLocalizedString = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.TITLE);
        if (!TextUtils.isEmpty(possiblyLocalizedString)) {
            c1091gF.e = C1091gF.b(possiblyLocalizedString);
        }
        String possiblyLocalizedString2 = notificationParams.getPossiblyLocalizedString(resources, packageName, Constants.MessageNotificationKeys.BODY);
        if (!TextUtils.isEmpty(possiblyLocalizedString2)) {
            c1091gF.f = C1091gF.b(possiblyLocalizedString2);
            C0959eF c0959eF = new C0959eF();
            c0959eF.i = C1091gF.b(possiblyLocalizedString2);
            c1091gF.d(c0959eF);
        }
        c1091gF.s.icon = getSmallIcon(packageManager, resources, packageName, notificationParams.getString(Constants.MessageNotificationKeys.ICON), bundle);
        Uri sound = getSound(packageName, notificationParams, resources);
        if (sound != null) {
            Notification notification = c1091gF.s;
            notification.sound = sound;
            notification.audioStreamType = -1;
            notification.audioAttributes = AbstractC1025fF.a(AbstractC1025fF.e(AbstractC1025fF.c(AbstractC1025fF.b(), 4), 5));
        }
        c1091gF.g = createContentIntent(context, notificationParams, packageName, packageManager);
        PendingIntent createDeleteIntent = createDeleteIntent(context, context2, notificationParams);
        if (createDeleteIntent != null) {
            c1091gF.s.deleteIntent = createDeleteIntent;
        }
        Integer color = getColor(context2, notificationParams.getString(Constants.MessageNotificationKeys.COLOR), bundle);
        if (color != null) {
            c1091gF.f167o = color.intValue();
        }
        boolean z = notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY);
        Notification notification2 = c1091gF.s;
        if (!z) {
            notification2.flags |= 16;
        } else {
            notification2.flags &= -17;
        }
        c1091gF.m = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
        String string = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
        if (string != null) {
            c1091gF.s.tickerText = C1091gF.b(string);
        }
        Integer notificationPriority = notificationParams.getNotificationPriority();
        if (notificationPriority != null) {
            c1091gF.j = notificationPriority.intValue();
        }
        Integer visibility = notificationParams.getVisibility();
        if (visibility != null) {
            c1091gF.p = visibility.intValue();
        }
        Integer notificationCount = notificationParams.getNotificationCount();
        if (notificationCount != null) {
            c1091gF.i = notificationCount.intValue();
        }
        Long l = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
        if (l != null) {
            c1091gF.k = true;
            c1091gF.s.when = l.longValue();
        }
        long[] vibrateTimings = notificationParams.getVibrateTimings();
        if (vibrateTimings != null) {
            c1091gF.s.vibrate = vibrateTimings;
        }
        int[] lightSettings = notificationParams.getLightSettings();
        if (lightSettings != null) {
            int i = lightSettings[ILLEGAL_RESOURCE_ID];
            int i2 = lightSettings[1];
            int i3 = lightSettings[2];
            Notification notification3 = c1091gF.s;
            notification3.ledARGB = i;
            notification3.ledOnMS = i2;
            notification3.ledOffMS = i3;
            notification3.flags = ((i2 == 0 || i3 == 0) ? ILLEGAL_RESOURCE_ID : 1) | (notification3.flags & (-2));
        }
        int consolidatedDefaults = getConsolidatedDefaults(notificationParams);
        Notification notification4 = c1091gF.s;
        notification4.defaults = consolidatedDefaults;
        if ((consolidatedDefaults & 4) != 0) {
            notification4.flags |= 1;
        }
        return new DisplayNotificationInfo(c1091gF, getTag(notificationParams), ILLEGAL_RESOURCE_ID);
    }
}
