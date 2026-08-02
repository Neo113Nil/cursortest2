package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FW extends AbstractC0993b6 {
    public final C0889Yn A00;

    public FW(C3C c3c, List<V2> list, C0889Yn c0889Yn) {
        super(c3c, list, c0889Yn);
        this.A00 = c0889Yn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i) {
        return new UR(new MN(this.A00));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void A0D(UR ur, int i) {
        super.A0D(ur, i);
        MN mn = (MN) ur.A0j();
        MZ imageView = (MZ) mn.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i);
        V2 childAd = ((AbstractC0993b6) this).A01.get(i);
        childAd.A11().A0K(this.A00);
        childAd.A1N(mn, mn);
    }
}
