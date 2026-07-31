package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import java.net.URISyntaxException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class l {
    public static boolean a(String str, String str2, Context context, s sVar, com.vungle.ads.internal.ui.m mVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            boolean z = !(context instanceof Activity);
            try {
                Intent a = a(z, str);
                Intent a2 = a(z, str2);
                d dVar = d.f;
                return a.a(context, a, a2, mVar);
            } catch (Exception e) {
                if (str == null || str.length() == 0) {
                    new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, com.iab.omid.library.vungle.d.a("Fail to open ", str2)).setLogEntry$vungle_ads_release(sVar).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, com.iab.omid.library.vungle.d.a("Fail to open ", str)).setLogEntry$vungle_ads_release(sVar).logErrorNoReturnValue$vungle_ads_release();
                }
                boolean z2 = u.a;
                StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Error while opening url");
                a3.append(e.getLocalizedMessage());
                t.b("ExternalRouter", a3.toString());
                t.a("ExternalRouter", "Cannot open url " + str2);
            }
        }
        return false;
    }

    public static Intent a(boolean z, String str) {
        Intent intent = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    intent = Intent.parseUri(str, 0);
                }
            } catch (URISyntaxException e) {
                boolean z2 = u.a;
                StringBuilder a = com.iab.omid.library.vungle.internal.l.a("url format is not correct ");
                a.append(e.getLocalizedMessage());
                t.b("ExternalRouter", a.toString());
            }
        }
        if (intent != null && z) {
            intent.setFlags(268435456);
        }
        return intent;
    }
}
