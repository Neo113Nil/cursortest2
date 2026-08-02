package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FX extends AbstractC0993b6 {
    public final C0889Yn A00;
    public final JR A01;

    public FX(C0889Yn c0889Yn, C3C c3c, List<V2> list, JR jr) {
        super(c3c, list, c0889Yn);
        this.A00 = c0889Yn;
        this.A01 = jr == null ? new JR() : jr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UR A0C(ViewGroup viewGroup, int i) {
        return new UR(new MI(this.A00, this.A01));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    /* renamed from: A0H */
    public final void A0D(UR ur, int i) {
        super.A0D(ur, i);
        MI mi = (MI) ur.A0j();
        A0F(mi.getImageCardView(), i);
        if (((AbstractC0993b6) this).A01.get(i) != null) {
            mi.setTitle(((AbstractC0993b6) this).A01.get(i).getAdHeadline());
            mi.setSubtitle(((AbstractC0993b6) this).A01.get(i).getAdLinkDescription());
            mi.setButtonText(((AbstractC0993b6) this).A01.get(i).getAdCallToAction());
        }
        V2 v2 = ((AbstractC0993b6) this).A01.get(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mi);
        v2.A1O(mi, mi, arrayList);
    }
}
