package com.pubmatic.sdk.common.utility;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.log.POBLog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.net.URISyntaxException;

/* loaded from: classes14.dex */
public class POBDeepLinkUtil {
    static boolean a(Context context, String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            try {
                parseUri.setComponent(null);
                parseUri.setSelector(null);
                parseUri.addFlags(268435456);
                safedk_POBUtils_startActivity_77a045103a3f673fe5e6fdc8c1e6b82c(context, parseUri);
                return true;
            } catch (ActivityNotFoundException unused) {
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (POBUtils.isNullOrEmpty(stringExtra)) {
                    return false;
                }
                return triggerDeepLink(context, stringExtra, false);
            } catch (Exception e) {
                POBLog.warn("POBDeepLinkUtil", "Error while starting the activity for the intent: %s. Error: %s", str, e.getMessage());
                return false;
            }
        } catch (URISyntaxException e2) {
            POBLog.warn("POBDeepLinkUtil", "Error while starting the activity for the intent: %s. Error: %s", str, e2.getMessage());
            return false;
        }
    }

    static boolean b(String str) {
        return !POBUtils.isNullOrEmpty(str) && str.startsWith("intent://");
    }

    public static void safedk_POBUtils_startActivity_77a045103a3f673fe5e6fdc8c1e6b82c(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/pubmatic/sdk/common/utility/POBUtils;->startActivity(Landroid/content/Context;Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.F);
        POBUtils.startActivity(p0, p1);
    }

    public static boolean triggerDeepLink(@NonNull Context context, @NonNull String str, boolean z) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (z) {
                intent.setPackage("com.android.vending");
            }
            intent.setData(Uri.parse(str));
            safedk_POBUtils_startActivity_77a045103a3f673fe5e6fdc8c1e6b82c(context, intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            POBLog.warn("POBDeepLinkUtil", "Activity not found for the uri: " + str, new Object[0]);
            return false;
        } catch (Exception e) {
            POBLog.warn("POBDeepLinkUtil", "Error while starting the activity for the uri: %s. Error: %s", str, e.getMessage());
            return false;
        }
    }

    public static boolean validateAndRedirect(Context context, String str) {
        if (context == null || !POBUtils.isValidPlayStoreUrl(str)) {
            return false;
        }
        return triggerDeepLink(context, str, false);
    }

    static boolean a(String str) {
        return POBUtils.isValidPlayStoreUrl(str) || !URLUtil.isValidUrl(str);
    }
}
