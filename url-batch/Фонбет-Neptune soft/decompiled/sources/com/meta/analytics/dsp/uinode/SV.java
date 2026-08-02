package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class SV extends AnonymousClass56 implements MJ {
    public C1U A00;
    public RD A01;
    public RE A02;
    public RE A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C0889Yn A06;
    public final BK A07;

    public SV(BK bk, SparseBooleanArray sparseBooleanArray, RE re, int i, C0889Yn c0889Yn, C1U c1u) {
        super(bk);
        this.A06 = c0889Yn;
        this.A07 = bk;
        this.A05 = sparseBooleanArray;
        this.A02 = re;
        this.A04 = i;
        this.A00 = c1u;
    }

    private void A0A(J2 j2, C0548Lg c0548Lg, String str, C0661Pp c0661Pp) {
        if (this.A05.get(c0661Pp.A02())) {
            return;
        }
        RE re = this.A03;
        if (re != null) {
            re.A0V();
            this.A03 = null;
        }
        this.A01 = new SX(this, str, c0661Pp, j2, c0661Pp.A04(), c0548Lg);
        RE re2 = new RE(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03 = re2;
        re2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new SW(this, c0661Pp));
    }

    public final void A0j(C0661Pp c0661Pp, J2 j2, C01946c c01946c, C0548Lg c0548Lg, String str, int i, int i2, int i3) {
        int leftMargin = c0661Pp.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(leftMargin));
        this.A07.setupNativeCtaExtension(c0661Pp);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, -2);
        int i4 = leftMargin == 0 ? i3 : i2;
        if (leftMargin < this.A04 - 1) {
            i3 = i2;
        }
        marginLayoutParams.setMargins(i4, 0, i3, 0);
        String A07 = c0661Pp.A03().A0D().A07();
        String A08 = c0661Pp.A03().A0D().A08();
        this.A07.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A07.A18()) {
            this.A07.setVideoPlaceholderUrl(A07);
            this.A07.setVideoUrl(c01946c.A0S(A08));
        } else {
            this.A07.setImageUrl(A07);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c0661Pp.A03().A0F(), c0661Pp.A04());
        this.A07.A19(c0661Pp.A04());
        A0A(j2, c0548Lg, str, c0661Pp);
    }

    public final void A0k(RE re) {
        this.A02 = re;
    }

    @Override // com.meta.analytics.dsp.uinode.MJ
    public final void AFr() {
        this.A07.A13();
    }
}
