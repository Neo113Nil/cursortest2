package com.meta.analytics.dsp.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Bg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0315Bg extends C0915Zo {
    public static String[] A08 = {"bHvO3zM", "7z8VpEP", "iw2Y0c", "LME8njBPiXs011hhslbtp", "9K0lNzbR5X2b0vS5", "Pt0EnZUFnGQLsNks8pQcEgn0FivkNzUh", "t6anbflpJj2CGicCnIMdWTRCydsD", "D9TL9YTSSd0lWzGeUvgWfvwaUF0YdAOx"};
    public float A00;
    public int A01;
    public int A02;
    public C0316Bh A03;
    public int[] A04;
    public final C0889Yn A05;
    public final C0654Pi A06;
    public final C0655Pj A07;

    public C0315Bg(C0889Yn c0889Yn, C0655Pj c0655Pj, C0654Pi c0654Pi) {
        super(c0889Yn);
        this.A02 = 0;
        this.A00 = 50.0f;
        this.A05 = c0889Yn;
        this.A07 = c0655Pj;
        this.A06 = c0654Pi;
        this.A01 = -1;
        this.A03 = new C0316Bh(this, c0889Yn);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1J(C01624w c01624w, AnonymousClass53 anonymousClass53, int i, int widthMode) {
        int[] iArr;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(widthMode);
        if ((mode == 1073741824 && A26() == 1) || (mode2 == 1073741824 && A26() == 0)) {
            super.A1J(c01624w, anonymousClass53, i, widthMode);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(widthMode);
        if (this.A06.A01(this.A01)) {
            iArr = this.A06.A02(this.A01);
        } else {
            iArr = new int[]{0, 0};
            if (anonymousClass53.A03() >= 1) {
                int widthSize = A0W() > 0 ? 1 : A0W();
                for (int i2 = 0; i2 < widthSize; i2++) {
                    View A1m = A1m(i2);
                    if (A08[5].length() != 32) {
                        throw new RuntimeException();
                    }
                    A08[4] = "FajaHWp";
                    if (A1m == null) {
                        break;
                    }
                    this.A04 = this.A07.A00(A1m, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    if (A26() == 0) {
                        int heightMode = iArr[0];
                        int[] iArr2 = this.A04;
                        iArr[0] = heightMode + iArr2[0];
                        if (i2 == 0) {
                            int A0g = iArr2[1] + A0g();
                            if (A08[6].length() != 1) {
                                A08[6] = "o1L5u";
                                iArr[1] = A0g + A0d();
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int i3 = iArr[1];
                        int[] iArr3 = this.A04;
                        if (A08[6].length() != 1) {
                            A08[5] = "6nCDHSOFLCCkeDdRDThHGlolS6KLs45E";
                            iArr[1] = i3 + iArr3[1];
                            if (i2 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0e() + A0f();
                        } else {
                            A08[3] = "KFvpvLkhCjqU9hzA1pvFB";
                            iArr[1] = i3 + iArr3[1];
                            if (i2 != 0) {
                            }
                            iArr[0] = iArr3[0] + A0e() + A0f();
                        }
                    }
                }
                int widthMode2 = this.A01;
                if (widthMode2 != -1) {
                    this.A06.A00(widthMode2, iArr);
                }
            }
        }
        if (mode == 1073741824) {
            iArr[0] = size;
        }
        if (mode2 == 1073741824) {
            iArr[1] = size2;
        }
        A13(iArr[0], iArr[1]);
    }

    @Override // com.meta.analytics.dsp.uinode.C0915Zo, com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1p(int i) {
        A2B(i, this.A02);
    }

    @Override // com.meta.analytics.dsp.uinode.C0915Zo, com.meta.analytics.dsp.uinode.AbstractC01554o
    public final void A1x(C0372Eb c0372Eb, AnonymousClass53 anonymousClass53, int i) {
        this.A03.A0A(i);
        A1L(this.A03);
    }

    public final void A2G(double d) {
        if (d <= 0.0d) {
            d = 1.0d;
        }
        this.A00 = (float) (50.0d / d);
        this.A03 = new C0316Bh(this, this.A05);
    }

    public final void A2H(int i) {
        this.A01 = i;
    }

    public final void A2I(int i) {
        this.A02 = i;
    }
}
