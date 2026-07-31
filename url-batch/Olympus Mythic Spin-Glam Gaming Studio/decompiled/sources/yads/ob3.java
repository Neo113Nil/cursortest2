package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes15.dex */
public final class ob3 {
    public final nb3 a = new nb3();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.y);
        p0.startActivity(p1);
    }

    public final boolean a(Context context, String str) {
        try {
            this.a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
