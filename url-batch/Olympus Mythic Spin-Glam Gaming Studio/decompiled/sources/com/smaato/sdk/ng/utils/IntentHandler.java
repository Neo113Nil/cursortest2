package com.smaato.sdk.ng.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.utils.browser.BrowserActivity;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes12.dex */
public class IntentHandler {
    private static final String b = "IntentHandler";
    private final Context a;

    public IntentHandler(Context context) {
        this.a = context;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    Intent a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        return intent;
    }

    Intent b(Uri uri) {
        ListIterator<String> listIterator = NextGen.getBrowserManager().getPackagePriorities().listIterator();
        Intent intent = null;
        while (listIterator.hasNext() && intent == null) {
            String next = listIterator.next();
            if (!TextUtils.isEmpty(next.trim())) {
                Intent a = a(uri);
                a.setPackage(next);
                if (canHandleIntent(a)) {
                    intent = a;
                }
            }
        }
        return intent;
    }

    public boolean canHandleIntent(Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        PackageManager packageManager = this.a.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        return !queryIntentActivities.isEmpty();
    }

    public boolean handleBrowserLink(Uri uri) {
        if (!NextGen.getBrowserManager().containsPriorities()) {
            return handleDeepLink(uri);
        }
        Intent b2 = b(uri);
        return b2 == null ? handleDeepLink(uri) : a(b2);
    }

    public boolean handleBrowserLinkBrowserActivity(Uri uri) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, BrowserActivity.createIntent(this.a, uri.toString()));
            return true;
        } catch (RuntimeException e) {
            Logger.e(b, e.getMessage());
            return false;
        }
    }

    public boolean handleDeepLink(Uri uri) {
        return a(a(uri));
    }

    boolean a(Intent intent) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
            return true;
        } catch (RuntimeException e) {
            Logger.e(b, e.getMessage());
            return false;
        }
    }

    public boolean canHandleIntent(Uri uri) {
        if (uri == null) {
            return false;
        }
        return canHandleIntent(a(uri));
    }
}
