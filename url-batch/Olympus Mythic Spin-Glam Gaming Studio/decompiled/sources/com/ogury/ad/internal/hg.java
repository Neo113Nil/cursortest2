package com.ogury.ad.internal;

import android.telephony.TelephonyManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class hg extends Lambda implements Function0 {
    public final /* synthetic */ og a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg(og ogVar) {
        super(0);
        this.a = ogVar;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        Object systemService = this.a.c.a.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String networkCountryIso = ((TelephonyManager) systemService).getNetworkCountryIso();
        Intrinsics.checkNotNullExpressionValue(networkCountryIso, "getNetworkCountryIso(...)");
        return networkCountryIso;
    }
}
