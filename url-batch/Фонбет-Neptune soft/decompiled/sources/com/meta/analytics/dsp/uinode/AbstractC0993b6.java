package com.meta.analytics.dsp.uinode;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0993b6 extends AbstractC01434c<UR> {
    public static final int A05 = (int) (LD.A02 * 4.0f);
    public C1B A00;
    public final List<V2> A01;
    public final int A02;
    public final C0889Yn A03;
    public final RD A04 = new C0995b8(this);

    public AbstractC0993b6(C3C c3c, List<V2> list, C0889Yn c0889Yn) {
        this.A03 = c0889Yn;
        this.A02 = c3c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01434c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        V2 v2 = this.A01.get(i);
        JP adCoverImage = v2.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC0766Tq A04 = new AsyncTaskC0766Tq(imageView, this.A03).A04();
            A04.A06(new C0994b7(this, i, v2));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(C1B c1b) {
        this.A00 = c1b;
    }

    public void A0H(UR ur, int i) {
        ur.A0j().setLayoutParams(A02(i));
    }
}
