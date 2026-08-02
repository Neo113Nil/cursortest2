package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: com.facebook.ads.redexgen.X.a7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0932a7 implements InterfaceC00962g {
    public final RectF A00 = new RectF();

    private C00992j A00(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C00992j(context.getResources(), colorStateList, f, f2, f3);
    }

    private C00992j A01(InterfaceC00952f interfaceC00952f) {
        return (C00992j) interfaceC00952f.A6J();
    }

    public final void A02(InterfaceC00952f interfaceC00952f) {
        Rect rect = new Rect();
        A01(interfaceC00952f).A0K(rect);
        interfaceC00952f.AG7((int) Math.ceil(A7S(interfaceC00952f)), (int) Math.ceil(A7R(interfaceC00952f)));
        interfaceC00952f.AGE(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final ColorStateList A66(InterfaceC00952f interfaceC00952f) {
        return A01(interfaceC00952f).A0F();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A6t(InterfaceC00952f interfaceC00952f) {
        return A01(interfaceC00952f).A0E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7M(InterfaceC00952f interfaceC00952f) {
        return A01(interfaceC00952f).A0B();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7R(InterfaceC00952f interfaceC00952f) {
        return A01(interfaceC00952f).A0C();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7S(InterfaceC00952f interfaceC00952f) {
        return A01(interfaceC00952f).A0D();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final float A7m(InterfaceC00952f interfaceC00952f) {
        return A01(interfaceC00952f).A0A();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public void A8r() {
        C00992j.A0G = new C0933a8(this);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void A8s(InterfaceC00952f interfaceC00952f, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C00992j A00 = A00(context, colorStateList, f, f2, f3);
        A00.A0L(interfaceC00952f.A7l());
        interfaceC00952f.AFu(A00);
        A02(interfaceC00952f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AB7(InterfaceC00952f interfaceC00952f) {
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void ACk(InterfaceC00952f interfaceC00952f) {
        A01(interfaceC00952f).A0L(interfaceC00952f.A7l());
        A02(interfaceC00952f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AFt(InterfaceC00952f interfaceC00952f, ColorStateList colorStateList) {
        A01(interfaceC00952f).A0J(colorStateList);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AFz(InterfaceC00952f interfaceC00952f, float f) {
        A01(interfaceC00952f).A0I(f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AG6(InterfaceC00952f interfaceC00952f, float f) {
        A01(interfaceC00952f).A0H(f);
        A02(interfaceC00952f);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00962g
    public final void AGC(InterfaceC00952f interfaceC00952f, float f) {
        A01(interfaceC00952f).A0G(f);
        A02(interfaceC00952f);
    }
}
