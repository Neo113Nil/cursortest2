package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.h;
import java.util.List;
import java.util.ListIterator;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.utils.browser.BrowserActivity;

/* loaded from: classes14.dex */
public class IntentHandler {
    private static final String TAG = "IntentHandler";
    private final Context context;

    public IntentHandler(Context context) {
        this.context = context;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.C);
        p0.startActivity(p1);
    }

    public boolean canHandleIntent(Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        PackageManager packageManager = this.context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        return !queryIntentActivities.isEmpty();
    }

    Intent createViewIntent(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        return intent;
    }

    Intent getPriorityBrowserIntent(Uri uri) {
        ListIterator<String> listIterator = HyBid.getBrowserManager().getPackagePriorities().listIterator();
        Intent intent = null;
        while (listIterator.hasNext() && intent == null) {
            String next = listIterator.next();
            if (!TextUtils.isEmpty(next.trim())) {
                Intent createViewIntent = createViewIntent(uri);
                createViewIntent.setPackage(next);
                if (canHandleIntent(createViewIntent)) {
                    intent = createViewIntent;
                }
            }
        }
        return intent;
    }

    public boolean handleBrowserLink(Uri uri) {
        if (!HyBid.getBrowserManager().containsPriorities()) {
            return handleDeepLink(uri);
        }
        Intent priorityBrowserIntent = getPriorityBrowserIntent(uri);
        return priorityBrowserIntent == null ? handleDeepLink(uri) : startActivitySafely(priorityBrowserIntent);
    }

    public boolean handleBrowserLinkBrowserActivity(Uri uri) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, BrowserActivity.createIntent(this.context, uri.toString()));
            return true;
        } catch (RuntimeException e) {
            Logger.e(TAG, e.getMessage());
            return false;
        }
    }

    public boolean handleDeepLink(Uri uri) {
        return startActivitySafely(createViewIntent(uri));
    }

    boolean startActivitySafely(Intent intent) {
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, intent);
            return true;
        } catch (RuntimeException e) {
            Logger.e(TAG, e.getMessage());
            return false;
        }
    }

    public boolean canHandleIntent(Uri uri) {
        if (uri == null) {
            return false;
        }
        return canHandleIntent(createViewIntent(uri));
    }
}
