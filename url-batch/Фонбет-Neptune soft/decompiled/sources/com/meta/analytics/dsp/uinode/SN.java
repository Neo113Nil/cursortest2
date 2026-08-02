package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class SN extends AnonymousClass56 implements MJ {
    public static String[] A0B = {"av2tITPhYKbVn20ukUfJR25ELbcgjHbj", "MLeLe181lhP7dC21QqjxU1VDKV9lNkzJ", "XUmY4VBJ2tlJWKlPJ7YkBdCsKtcC", "bK6oHsXedskfaWsjnVeS6YyvP0sRA20b", "BhCeFQN4dHt9z3MLE3p7bnIzhrf86Cw8", "mLW9T0fP2Q5Hob07hRXsv0QUH1fN4", "pNzPXZ5fcby2PvmlRsfUzns43oHDF5Mi", "3YktW7BrcDIc4Xw2f2zdWv5xFETbHIAE"};
    public C1U A00;
    public RD A01;
    public RE A02;
    public RE A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C0889Yn A09;
    public final B4 A0A;

    public SN(B4 b4, SparseBooleanArray sparseBooleanArray, RE re, int i, int i2, int i3, int i4, C0889Yn c0889Yn, C1U c1u) {
        super(b4);
        this.A09 = c0889Yn;
        this.A0A = b4;
        this.A08 = sparseBooleanArray;
        this.A02 = re;
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
        this.A00 = c1u;
    }

    private void A0A(J2 j2, C0548Lg c0548Lg, String str, C0661Pp c0661Pp) {
        if (this.A08.get(c0661Pp.A02())) {
            return;
        }
        RE re = this.A03;
        if (re != null) {
            re.A0V();
            if (A0B[4].charAt(16) != 'E') {
                throw new RuntimeException();
            }
            A0B[4] = "iteeE4SnfkkyQnEAEqI0za4snrHpWaXy";
            this.A03 = null;
        }
        this.A01 = new SP(this, str, c0661Pp, j2, c0661Pp.A04(), c0548Lg);
        RE re2 = new RE(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03 = re2;
        re2.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new SO(this, c0661Pp));
    }

    public final void A0j(C0661Pp c0661Pp, J2 j2, C01946c c01946c, C0548Lg c0548Lg, String str) {
        int A02 = c0661Pp.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(A02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = A02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, A02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c0661Pp.A03().A0D().A07();
        String A08 = c0661Pp.A03().A0D().A08();
        this.A0A.setIsVideo(!TextUtils.isEmpty(A08));
        if (this.A0A.A18()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(c01946c.A0S(A08));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c0661Pp.A03().A0E().A06(), c0661Pp.A03().A0E().A01());
        this.A0A.setCTAInfo(c0661Pp.A03().A0F(), c0661Pp.A04());
        this.A0A.A1A(c0661Pp.A04());
        A0A(j2, c0548Lg, str, c0661Pp);
    }

    @Override // com.meta.analytics.dsp.uinode.MJ
    public final void AFr() {
        this.A0A.A13();
    }
}
