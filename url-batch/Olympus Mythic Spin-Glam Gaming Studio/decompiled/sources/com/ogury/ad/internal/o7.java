package com.ogury.ad.internal;

import com.ironsource.C4701ic;
import com.ogury.core.internal.network.NetworkRequest;
import com.ogury.core.internal.network.NetworkResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes6.dex */
public final class o7 {
    public static final o7 a = new o7();

    public static void a(String mraidDownloadUrl, boolean z, l7 l7Var, z8 z8Var) {
        z8Var.getClass();
        Intrinsics.checkNotNullParameter(mraidDownloadUrl, "url");
        NetworkResponse execute = z8Var.b.newCall(new NetworkRequest(mraidDownloadUrl, C4701ic.a, "", z8Var.a.a)).execute();
        if (execute instanceof NetworkResponse.Success) {
            NetworkResponse.Success success = (NetworkResponse.Success) execute;
            if (success.getResponseBody().length() > 0) {
                String mraidJs = success.getResponseBody();
                l7Var.getClass();
                Intrinsics.checkNotNullParameter(mraidJs, "mraidJs");
                BuildersKt__BuildersKt.runBlocking$default(null, new k7(l7Var, mraidJs, null), 1, null);
                Intrinsics.checkNotNullParameter(mraidDownloadUrl, "mraidDownloadUrl");
                BuildersKt__BuildersKt.runBlocking$default(null, new i7(l7Var, mraidDownloadUrl, null), 1, null);
                return;
            }
        }
        if (z) {
            Thread.sleep(400L);
            a(mraidDownloadUrl, false, l7Var, z8Var);
        } else {
            throw new n7("Failed to download mraid (" + mraidDownloadUrl + ")");
        }
    }
}
