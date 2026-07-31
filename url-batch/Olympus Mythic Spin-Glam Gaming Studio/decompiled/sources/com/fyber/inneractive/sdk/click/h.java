package com.fyber.inneractive.sdk.click;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.net.URISyntaxException;
import java.util.List;

/* loaded from: classes5.dex */
public final class h extends a {
    public boolean a = false;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.p);
        p0.startActivity(p1);
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        return SDKConstants.PARAM_INTENT.equalsIgnoreCase(uri.getScheme()) && !this.a;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        if (a(uri, (r) null)) {
            try {
                Intent parseUri = Intent.parseUri(uri.toString(), 1);
                if (!this.a && h0.a(context, parseUri)) {
                    int i = IAlog.a;
                    IAlog.d("%s %s", "DEEPLINK", uri.toString());
                    if (list != null) {
                        list.add(new j(uri.toString(), true, q.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return new b(uri.toString(), a.a(uri, q.OPEN_IN_EXTERNAL_APPLICATION), "IntentScheme", null);
                }
                String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                if (this.a || TextUtils.isEmpty(stringExtra)) {
                    if (list != null) {
                        list.add(new j(uri.toString(), false, q.OPEN_IN_EXTERNAL_APPLICATION, "tryToOpenExternalApp has failed (intent scheme)"));
                    }
                    return r.a(uri.toString(), "IntentScheme", "tryToOpenExternalApp has failed (intent scheme)");
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra));
                    if (!(context instanceof Activity)) {
                        intent.setFlags(268435456);
                    }
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                    IAlog.d("%s %s", "Intent opened successfully, url:", stringExtra);
                    if (list != null) {
                        list.add(new j(uri.toString(), false, q.DEEP_LINK, null));
                        list.add(new j(stringExtra, true, q.OPEN_IN_EXTERNAL_APPLICATION, null));
                    }
                    return new b(uri.toString(), a.a(uri, q.OPEN_IN_EXTERNAL_APPLICATION), "IntentScheme", null);
                } catch (Throwable unused) {
                    IAlog.d("%s %s", "Intent failed, url:", stringExtra);
                }
            } catch (URISyntaxException e) {
                IAlog.a("failed parsing uri with error: %s", e.getLocalizedMessage());
                if (list != null) {
                    list.add(new j(uri.toString(), false, q.OPEN_IN_EXTERNAL_APPLICATION, null));
                }
                return new b(uri.toString(), q.FAILED, "IntentScheme", e);
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void a() {
        this.a = true;
    }
}
