package com.ogury.ad.internal;

import android.content.Context;
import com.ironsource.X3;
import com.ogury.ad.common.OguryMediation;
import com.ogury.ad.viewer.AdsCallback;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c4 {
    public final c a;
    public final x b;
    public final p0 c;
    public final OguryMediation d;
    public o0 e;
    public AdsCallback f;
    public g9 g;

    public c4(Context context, c adConfig, x adType, OguryMediation oguryMediation) {
        p0 adsSourceFactory = new p0(context, adConfig, adType);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adsSourceFactory, "adsSourceFactory");
        this.a = adConfig;
        this.b = adType;
        this.c = adsSourceFactory;
        this.d = oguryMediation;
    }

    public final void a(String str) {
        o0 o0Var = this.e;
        if (o0Var != null && o0Var.r) {
            o0Var.a();
        }
        o0 o0Var2 = this.e;
        if (o0Var2 != null && o0Var2.q) {
            o0Var2.b();
        }
        p0 p0Var = this.c;
        o0 o0Var3 = this.e;
        boolean z = o0Var3 != null && o0Var3.o;
        OguryMediation oguryMediation = this.d;
        Context context = p0Var.a;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        o0 o0Var4 = new o0(context, uuid, oguryMediation, p0Var.b, p0Var.c, z);
        o0Var4.t = this.f;
        o0Var4.v = this.g;
        this.e = o0Var4;
        if (str != null) {
            o0Var4.a(str);
        } else {
            o0Var4.a((String) null);
        }
    }

    public final void a(OguryListenerAdapter oguryListenerAdapter) {
        LogTag logTag = LogTag.REQUESTS;
        SourceTag sourceTag = SourceTag.ADS;
        IntegrationLogger.d(logTag, sourceTag, X3.j.d + this.b.b + "] Registering to ad listener");
        if (oguryListenerAdapter == null) {
            IntegrationLogger.d(logTag, sourceTag, X3.j.d + this.b.b + "] Ad listener is null");
        }
        this.f = oguryListenerAdapter;
        o0 o0Var = this.e;
        if (o0Var == null) {
            return;
        }
        o0Var.t = oguryListenerAdapter;
    }
}
