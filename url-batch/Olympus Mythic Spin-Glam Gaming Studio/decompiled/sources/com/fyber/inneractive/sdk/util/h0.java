package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class h0 extends o {
    public static boolean a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("googlechrome://navigate?url=" + str));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Throwable unused) {
            IAlog.f("Failed opening chrome for a special uri.", new Object[0]);
            return false;
        }
    }

    public static boolean c(String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F") || str.startsWith("%");
    }

    public static boolean d(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith("mailto:") && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.f("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    public static boolean e(String str) {
        Uri uri;
        if (!v.a(str)) {
            return false;
        }
        try {
            uri = Uri.parse(str);
        } catch (Exception unused) {
            IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri != null && v.a(uri.getScheme())) {
            return v.a(uri.getHost());
        }
        return false;
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (!s.a() || IAConfigManager.N.q) {
            return (str.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.d.v) || str.startsWith("http%3A%2F%2F")) ? false : true;
        }
        return true;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.p);
        p0.startActivity(p1);
    }

    public static boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static HashMap a(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }
}
