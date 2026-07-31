package com.inmobi.media;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC4094j5 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, CustomTabsIntent customTabsIntent, Uri uri, C4081ii c4081ii, C4152lb c4152lb, Eh redirectionValidator, String api) {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customTabsIntent, "customTabsIntent");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        String a = AbstractC4226o5.a(context);
        try {
            try {
                if (a == null) {
                    Intrinsics.checkNotNullExpressionValue("m5", "access$getLOG_TAG$cp(...)");
                    if (c4081ii != null) {
                        String url = uri.toString();
                        Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                        Intrinsics.checkNotNullParameter(url, "url");
                        Intrinsics.checkNotNullParameter(api, "api");
                        c4081ii.a.getLandingPageHandler().a(url, api, c4152lb);
                        return;
                    }
                    return;
                }
                customTabsIntent.intent.setFlags(268435456);
                customTabsIntent.intent.setPackage(a);
                safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(customTabsIntent, context, uri);
                if (c4152lb != null) {
                    c4152lb.f = "IN_NATIVE";
                }
                if (c4081ii != null) {
                    O2.a(c4081ii, Za.f, c4152lb);
                }
            } catch (Exception unused) {
                String uri2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                i = F3.a(context, uri2, redirectionValidator, api);
                if (c4152lb != null) {
                    c4152lb.f = "EX_NATIVE";
                }
                if (i != 0 || i == 1) {
                    if (c4081ii == null) {
                        O2.a(c4081ii, Za.f, c4152lb);
                    }
                } else if (c4081ii != null) {
                    Za landingPageFunnelState = Za.g;
                    Integer valueOf = Integer.valueOf(i);
                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                    c4081ii.a.getLandingPageHandler().a(landingPageFunnelState, c4152lb, valueOf);
                }
            }
        } catch (Exception unused2) {
            i = 9;
            if (c4152lb != null) {
            }
            if (i != 0) {
            }
            if (c4081ii == null) {
            }
        }
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, com.safedk.android.utils.h.i);
        p0.launchUrl(p1, p2);
    }
}
