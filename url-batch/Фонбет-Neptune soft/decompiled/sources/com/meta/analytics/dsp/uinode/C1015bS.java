package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.bS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1015bS implements AnonymousClass61 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1010bN A01;
    public final /* synthetic */ C1010bN A02;
    public final /* synthetic */ C8T A03;

    public C1015bS(C1010bN c1010bN, int i, C8T c8t, C1010bN c1010bN2) {
        this.A01 = c1010bN;
        this.A00 = i;
        this.A03 = c8t;
        this.A02 = c1010bN2;
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAl() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.meta.analytics.dsp.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC00610x interfaceC00610x;
        interfaceC00610x = this.A01.A00;
        interfaceC00610x.ABw(this.A02, C0495Jb.A00(AdErrorType.NO_FILL));
    }
}
