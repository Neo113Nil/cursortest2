package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.iA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3305iA implements InterfaceC2521Ot {
    public Drawable A00;
    public final /* synthetic */ C2520Os A01;

    public C3305iA(C2520Os c2520Os) {
        this.A01 = c2520Os;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2521Ot
    public final Drawable A7E() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2521Ot
    public final C2520Os A7F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2521Ot
    public final boolean A8q() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2521Ot
    public final boolean A9R() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2521Ot
    public final void AJK(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2521Ot
    public final void AJl(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        super/*android.widget.FrameLayout*/.setPadding(this.A01.A04.left + i, this.A01.A04.top + i2, this.A01.A04.right + i3, this.A01.A04.bottom + i4);
    }
}
