package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class a7 {
    public static boolean a(Intent intent, Context context) {
        return a(null, null, intent, null, context);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.r);
        p0.startActivity(p1);
    }

    public static boolean a(String str, String str2, Context context) {
        return a(str, str2, null, null, context);
    }

    public static boolean a(String str, String str2, Bundle bundle, Context context) {
        return a(str, str2, null, bundle, context);
    }

    public static boolean a(String str, Context context) {
        return a(str, null, null, null, context);
    }

    private static boolean a(String str, String str2, Intent intent, Bundle bundle, Context context) {
        if (intent == null) {
            try {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            } catch (Throwable th) {
                mi.a("IntentUtils: Unable to open link - " + th.getMessage());
                return false;
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (str2 != null) {
            intent.setPackage(str2);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        return true;
    }
}
