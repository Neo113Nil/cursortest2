package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.宀, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1163 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1086 f2960;

    public C1163(C1086 c1086) {
        this.f2960 = c1086;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0377 c0377 = this.f2960.f2755;
        String decrypt = StringFog.decrypt("JhxAWQVMnRQ3Ans=\n", "UmwfKmA/7ks=\n");
        c0377.getClass();
        AbstractC1026.m4313(new C0381(c0377, decrypt));
        this.f2960.m4388(StringFog.decrypt("NcAGzhfLG2kk3j0=\n", "QbBZvXK4aDY=\n"), IronSourceNetworkBridge.jsonObjectInit());
    }
}
