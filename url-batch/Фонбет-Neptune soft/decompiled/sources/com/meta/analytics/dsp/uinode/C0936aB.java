package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0936aB implements InterfaceC00952f {
    public Drawable A00;
    public final /* synthetic */ AbstractC00942e A01;

    public C0936aB(AbstractC00942e abstractC00942e) {
        this.A01 = abstractC00942e;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00952f
    public final Drawable A6J() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00952f
    public final AbstractC00942e A6K() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00952f
    public final boolean A7l() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00952f
    public final boolean A8G() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00952f
    public final void AFu(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00952f
    public final void AG7(int i, int i2) {
        if (i > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i2 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i2);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC00952f
    public final void AGE(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        AbstractC00942e abstractC00942e = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(abstractC00942e.A04.left + i, this.A01.A04.top + i2, this.A01.A04.right + i3, this.A01.A04.bottom + i4);
    }
}
