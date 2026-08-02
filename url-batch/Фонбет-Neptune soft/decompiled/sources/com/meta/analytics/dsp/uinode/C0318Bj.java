package com.meta.analytics.dsp.uinode;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0318Bj implements V1 {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C0318Bj(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void AAc() {
        KK.A00(new C0798Ux(this));
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void AAg() {
        KK.A00(new C0799Uy(this));
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void ABR(C0495Jb c0495Jb) {
        KK.A00(new V0(this, c0495Jb));
    }

    @Override // com.meta.analytics.dsp.uinode.JH
    public final void ACA() {
        KK.A00(new C0797Uw(this));
    }

    @Override // com.meta.analytics.dsp.uinode.V1
    public final void ACF() {
        KK.A00(new C0800Uz(this));
    }
}
