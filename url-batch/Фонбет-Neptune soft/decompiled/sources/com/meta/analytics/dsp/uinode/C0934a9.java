package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0934a9 implements InterfaceC00962g {
    private C00972h A00(InterfaceC00952f interfaceC00952f) {
        return (C00972h) interfaceC00952f.A6J();
    }

    public final void A01(InterfaceC00952f interfaceC00952f) {
        if (!interfaceC00952f.A8G()) {
            interfaceC00952f.AGE(0, 0, 0, 0);
            return;
        }
        float A7M = A7M(interfaceC00952f);
        float A7m = A7m(interfaceC00952f);
        float elevation = C00992j.A00(A7M, A7m, interfaceC00952f.A7l());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C00992j.A01(A7M, A7m, interfaceC00952f.A7l());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC00952f.AGE(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final ColorStateList A66(InterfaceC00952f interfaceC00952f) {
        return A00(interfaceC00952f).A05();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A6t(InterfaceC00952f interfaceC00952f) {
        return interfaceC00952f.A6K().getElevation();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7M(InterfaceC00952f interfaceC00952f) {
        return A00(interfaceC00952f).A03();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7R(InterfaceC00952f interfaceC00952f) {
        return A7m(interfaceC00952f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7S(InterfaceC00952f interfaceC00952f) {
        return A7m(interfaceC00952f) * 2.0f;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7m(InterfaceC00952f interfaceC00952f) {
        return A00(interfaceC00952f).A04();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void A8r() {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void A8s(InterfaceC00952f interfaceC00952f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C00972h background = new C00972h(colorStateList, f);
        interfaceC00952f.AFu(background);
        View view = interfaceC00952f.A6K();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AG6(interfaceC00952f, f3);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AB7(InterfaceC00952f interfaceC00952f) {
        AG6(interfaceC00952f, A7M(interfaceC00952f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void ACk(InterfaceC00952f interfaceC00952f) {
        AG6(interfaceC00952f, A7M(interfaceC00952f));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AFt(InterfaceC00952f interfaceC00952f, ColorStateList colorStateList) {
        A00(interfaceC00952f).A08(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AFz(InterfaceC00952f interfaceC00952f, float f) {
        interfaceC00952f.A6K().setElevation(f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AG6(InterfaceC00952f interfaceC00952f, float f) {
        A00(interfaceC00952f).A07(f, interfaceC00952f.A8G(), interfaceC00952f.A7l());
        A01(interfaceC00952f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AGC(InterfaceC00952f interfaceC00952f, float f) {
        A00(interfaceC00952f).A06(f);
    }
}
