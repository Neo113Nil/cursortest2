package com.ogury.ad.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class wf extends Lambda implements Function0 {
    public final /* synthetic */ og a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(og ogVar) {
        super(0);
        this.a = ogVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        NetworkInfo networkInfo;
        q0 q0Var = this.a.c;
        q0Var.getClass();
        try {
            Context context = q0Var.a;
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter(context, "<this>");
            Intrinsics.checkNotNullParameter("android.permission.ACCESS_NETWORK_STATE", "permission");
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                Object systemService = context.getSystemService("connectivity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                networkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            return networkInfo != null ? q0.a(networkInfo) : "UNKNOWN";
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, e);
            return "NONE";
        }
    }
}
