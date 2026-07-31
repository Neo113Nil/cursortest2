package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class Tc implements Ih, InterfaceC3898bl, Qo {
    public final C4493y9 a;
    public final Nc b;

    public Tc(Context context, C3868ah pubSettings, Uc nativeCallbacks) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Intrinsics.checkNotNullParameter(nativeCallbacks, "nativeCallbacks");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter("native", "logType");
        Intrinsics.checkNotNullParameter("native", "adType");
        Intrinsics.checkNotNullParameter(pubSettings, "pubSettings");
        Nb nb = AbstractC3869ai.a;
        this.a = AbstractC3869ai.a("native", pubSettings.h);
        this.b = new Nc(new C4248p1(context, this, new C4274q1(this, pubSettings)), nativeCallbacks);
    }

    @Override // com.inmobi.media.Qo
    public final String a(int i, double d) {
        return this.b.a(i, d);
    }

    @Override // com.inmobi.media.InterfaceC3898bl
    public final void d() {
        this.b.d();
    }

    @Override // com.inmobi.media.Qo
    public final String a(double d) {
        return this.b.a(d);
    }

    @Override // com.inmobi.media.Ih
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        Intrinsics.checkNotNullParameter(inMobiNativeViewData, "inMobiNativeViewData");
        this.b.a(inMobiNativeViewData);
    }
}
