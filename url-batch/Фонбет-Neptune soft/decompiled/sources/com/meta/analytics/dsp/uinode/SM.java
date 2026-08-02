package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SM extends AbstractC01434c<SK> {
    public final int A00;
    public final C0889Yn A01;
    public final ViewOnClickListenerC0761Tl A02;
    public final List<String> A03;

    public SM(C0889Yn c0889Yn, List<String> screenshotUrls, int i, ViewOnClickListenerC0761Tl viewOnClickListenerC0761Tl) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = c0889Yn;
        this.A02 = viewOnClickListenerC0761Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final SK A0C(ViewGroup viewGroup, int i) {
        SL sl = new SL(this.A01);
        if (C0478Ih.A12(this.A01)) {
            sl.setOnClickListener(new Q6(this));
        }
        return new SK(sl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(SK sk, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i2 = leftMargin * 4;
        if (i == 0) {
            leftMargin = i2;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        sk.A0j().setLayoutParams(marginLayoutParams);
        sk.A0j().A00(str);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    public final int A0E() {
        return this.A03.size();
    }
}
