package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.i9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3304i9 implements InterfaceC2522Ou {
    private C2523Ov A00(InterfaceC2521Ot interfaceC2521Ot) {
        return (C2523Ov) interfaceC2521Ot.A7E();
    }

    public final void A01(InterfaceC2521Ot interfaceC2521Ot) {
        if (!interfaceC2521Ot.A9R()) {
            interfaceC2521Ot.AJl(0, 0, 0, 0);
            return;
        }
        float A8S = A8S(interfaceC2521Ot);
        float A8r = A8r(interfaceC2521Ot);
        float elevation = AbstractC2525Ox.A00(A8S, A8r, interfaceC2521Ot.A8q());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC2525Ox.A01(A8S, A8r, interfaceC2521Ot.A8q());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC2521Ot.AJl(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final ColorStateList A71(InterfaceC2521Ot interfaceC2521Ot) {
        return A00(interfaceC2521Ot).A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final float A7v(InterfaceC2521Ot interfaceC2521Ot) {
        return interfaceC2521Ot.A7F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final float A8S(InterfaceC2521Ot interfaceC2521Ot) {
        return A00(interfaceC2521Ot).A03();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final float A8X(InterfaceC2521Ot interfaceC2521Ot) {
        return A8r(interfaceC2521Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final float A8Y(InterfaceC2521Ot interfaceC2521Ot) {
        return A8r(interfaceC2521Ot) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final float A8r(InterfaceC2521Ot interfaceC2521Ot) {
        return A00(interfaceC2521Ot).A04();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void AAE() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void AAG(InterfaceC2521Ot interfaceC2521Ot, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C2523Ov background = new C2523Ov(colorStateList, f);
        interfaceC2521Ot.AJK(background);
        View view = interfaceC2521Ot.A7F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AJX(interfaceC2521Ot, f3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void ADP(InterfaceC2521Ot interfaceC2521Ot) {
        AJX(interfaceC2521Ot, A8S(interfaceC2521Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void AFT(InterfaceC2521Ot interfaceC2521Ot) {
        AJX(interfaceC2521Ot, A8S(interfaceC2521Ot));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void AJJ(InterfaceC2521Ot interfaceC2521Ot, ColorStateList colorStateList) {
        A00(interfaceC2521Ot).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void AJP(InterfaceC2521Ot interfaceC2521Ot, float f) {
        interfaceC2521Ot.A7F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void AJX(InterfaceC2521Ot interfaceC2521Ot, float f) {
        A00(interfaceC2521Ot).A07(f, interfaceC2521Ot.A9R(), interfaceC2521Ot.A8q());
        A01(interfaceC2521Ot);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522Ou
    public final void AJj(InterfaceC2521Ot interfaceC2521Ot, float f) {
        A00(interfaceC2521Ot).A06(f);
    }
}
