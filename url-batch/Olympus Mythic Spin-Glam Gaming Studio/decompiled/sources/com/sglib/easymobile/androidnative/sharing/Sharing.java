package com.sglib.easymobile.androidnative.sharing;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.safedk.android.utils.Logger;
import com.sglib.easymobile.androidnative.Helper;
import com.unity3d.player.UnityPlayer;
import java.io.File;

/* loaded from: classes3.dex */
public class Sharing {
    private static final String FACEBOOK_PACKAGE_NAME = "com.facebook.android ";
    private static final String FILE_PROVIDER_AUTHORITY_SUFFIX = ".easymobile_fileprovider";
    private static final String INSTAGRAM_PACKAGE_NAME = "com.instagram.android";
    private static final String NULL_INTENT_MESSAGE = "Couldn't get intent to open share activity.";
    private static final String TWITTER_PACKAGE_NAME = "com.twitter.android";
    private static final String UNINSTALLED_APP_MESSAGE = "Target application hasn't been installed in your device.";
    private static final String WECHAT_PACKAGE_NAME = "com.tencent.mm";
    private static final String WHATSAPP_PACKAGE_NAME = "com.whatsapp";

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public static String shareTextOrURL(String str, String str2) {
        try {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, Intent.createChooser(getShareTextIntent(str), str2));
            return null;
        } catch (Exception e) {
            Helper.Log(Log.getStackTraceString(e));
            return e.getMessage();
        }
    }

    public static String shareImage(String str, String str2, String str3) {
        try {
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, Intent.createChooser(getShareImageIntent(str, str2), str3));
            return null;
        } catch (Exception e) {
            Helper.Log(Log.getStackTraceString(e));
            return e.getMessage();
        }
    }

    public static String shareTextToFacebook(String str) {
        throw new UnsupportedOperationException();
    }

    public static String shareTextToInstagram(String str) {
        return shareTextDirectlyTo(str, INSTAGRAM_PACKAGE_NAME);
    }

    public static String shareTextToTwitter(String str) {
        return shareTextDirectlyTo(str, TWITTER_PACKAGE_NAME);
    }

    public static String shareTextToWechat(String str) {
        return shareTextDirectlyTo(str, WECHAT_PACKAGE_NAME);
    }

    public static String shareTextToWhatsapp(String str) {
        return shareTextDirectlyTo(str, WHATSAPP_PACKAGE_NAME);
    }

    public static String shareImageToFacebook(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public static String shareImageToInstagram(String str, String str2) {
        return shareImageDirectlyTo(str, str2, INSTAGRAM_PACKAGE_NAME);
    }

    public static String shareImageToTwitter(String str, String str2) {
        return shareImageDirectlyTo(str, str2, TWITTER_PACKAGE_NAME);
    }

    public static String shareImageToWechat(String str, String str2) {
        return shareImageDirectlyTo(str, str2, WECHAT_PACKAGE_NAME);
    }

    public static String shareImageToWhatsapp(String str, String str2) {
        return shareImageDirectlyTo(str, str2, WHATSAPP_PACKAGE_NAME);
    }

    private static String shareTextDirectlyTo(String str, String str2) {
        return shareDirectlyTo(getShareTextIntent(str), str2);
    }

    private static String shareImageDirectlyTo(String str, String str2, String str3) {
        return shareDirectlyTo(getShareImageIntent(str, str2), str3);
    }

    private static String shareDirectlyTo(Intent intent, String str) {
        if (intent == null) {
            return NULL_INTENT_MESSAGE;
        }
        try {
            for (ResolveInfo resolveInfo : UnityPlayer.currentActivity.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (resolveInfo.activityInfo.packageName.startsWith(str)) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(UnityPlayer.currentActivity, intent);
                    return null;
                }
            }
            return UNINSTALLED_APP_MESSAGE;
        } catch (Exception e) {
            Helper.Log(Log.getStackTraceString(e));
            return e.getMessage();
        }
    }

    private static Intent getShareTextIntent(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return intent;
    }

    private static Intent getShareImageIntent(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            Helper.LogError("getShareImageIntent FAILED: image not found.");
            return null;
        }
        Activity activity = UnityPlayer.currentActivity;
        Uri uriForFile = FileProvider.getUriForFile(activity, activity.getPackageName() + FILE_PROVIDER_AUTHORITY_SUFFIX, file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.setFlags(1);
        return intent;
    }
}
