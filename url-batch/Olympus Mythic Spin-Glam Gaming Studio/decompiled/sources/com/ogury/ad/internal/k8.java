package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class k8 {
    public final ConnectivityManager a;

    public k8(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter("android.permission.ACCESS_NETWORK_STATE", "permission");
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            this.a = (ConnectivityManager) systemService;
        }
    }
}
