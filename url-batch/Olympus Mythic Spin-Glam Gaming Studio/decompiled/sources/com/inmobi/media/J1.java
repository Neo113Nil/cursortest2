package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.network.NetworkUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class J1 {
    public static boolean a(Context context, String url, Eh redirectionValidator, String api, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        Intrinsics.checkNotNullParameter(api, "api");
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).c("AppstoreLinkHandler", "In appStoreLinkHandled");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() != 0) {
            Uri parse = Uri.parse(url);
            if (Intrinsics.areEqual(NetworkUtils.PROTOCOL_MARKET, parse.getScheme()) || Intrinsics.areEqual(POBCommonConstants.PLAY_STORE_DOMAIN, parse.getHost()) || Intrinsics.areEqual("market.android.com", parse.getHost())) {
                Uri parse2 = Uri.parse(url);
                if (context != null) {
                    try {
                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
                        if (!redirectionValidator.c()) {
                            redirectionValidator.a("EX_" + api);
                            return false;
                        }
                        try {
                            Intent intent = new Intent("android.intent.action.VIEW", parse2);
                            intent.setPackage("com.android.vending");
                            intent.addFlags(268435456);
                            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                            if (interfaceC4466x9 != null) {
                                ((C4493y9) interfaceC4466x9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                            }
                            return true;
                        } catch (IllegalArgumentException e) {
                            if (interfaceC4466x9 != null) {
                                ((C4493y9) interfaceC4466x9).c("AppstoreLinkHandler", "IllegalArgumentException: Processing appStoreLinkHandling: " + e.getMessage());
                            }
                            return false;
                        } catch (Exception e2) {
                            if (interfaceC4466x9 != null) {
                                ((C4493y9) interfaceC4466x9).c("AppstoreLinkHandler", "ActivityNotFoundException: Processing appStoreLinkHandling: " + e2.getMessage());
                            }
                            return false;
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e3.printStackTrace();
                    }
                }
                int a = AbstractC4357t5.a(context, url, redirectionValidator, api, interfaceC4466x9);
                if (a != 0 && a != 1) {
                    return false;
                }
                if (interfaceC4466x9 != null) {
                    ((C4493y9) interfaceC4466x9).c("AppstoreLinkHandler", "Playstore link handled successfully");
                }
                return true;
            }
        }
        return false;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }
}
