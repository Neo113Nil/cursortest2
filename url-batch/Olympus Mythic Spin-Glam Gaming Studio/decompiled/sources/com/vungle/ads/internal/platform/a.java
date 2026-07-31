package com.vungle.ads.internal.platform;

import android.content.Context;
import android.telephony.TelephonyManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a {
    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getNetworkOperatorName();
    }
}
