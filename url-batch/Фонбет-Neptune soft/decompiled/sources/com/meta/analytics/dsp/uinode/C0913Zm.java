package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0913Zm extends C4Y {
    public C0913Zm(AbstractC01554o abstractC01554o) {
        super(abstractC01554o, null);
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C01564p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0D(View view) {
        C01564p c01564p = (C01564p) view.getLayoutParams();
        return this.A02.A0m(view) + c01564p.leftMargin + c01564p.rightMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0E(View view) {
        C01564p c01564p = (C01564p) view.getLayoutParams();
        return this.A02.A0l(view) + c01564p.topMargin + c01564p.bottomMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C01564p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.meta.analytics.dsp.uinode.C4Y
    public final void A0J(int i) {
        this.A02.A0z(i);
    }
}
