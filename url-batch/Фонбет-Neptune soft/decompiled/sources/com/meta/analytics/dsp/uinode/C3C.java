package com.meta.analytics.dsp.uinode;

import android.util.AttributeSet;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3C extends C3P implements InterfaceC0658Pm {
    public static byte[] A07;
    public static String[] A08 = {"T7MK6mm4Fzbg8PTMnM4kcHpb21LLpIaw", "PTQtUxKdjysMmbj8hCZsGKEwd1IRWqqZ", "Zw8mt4VncD", "79VYCrnrWW", "2MnAMBnkkiKtyd2cP7mHhabJycDYuMiE", "jaMauIT7sdi", "OgIH7ZaBRtH9hoDgrnw", "xZmsCngT77DU5lblEiekqTVKPqNdsast"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MM A04;
    public boolean A05;
    public final C0315Bg A06;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-6, -7, -37, -20, -14, -16, -50, -13, -20, -7, -14, -16, -17};
    }

    static {
        A03();
    }

    public C3C(C0889Yn c0889Yn) {
        super(c0889Yn);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0315Bg(c0889Yn, new C0655Pj(), new C0654Pi());
        A02();
    }

    public C3C(C0889Yn c0889Yn, AttributeSet attributeSet) {
        super(c0889Yn, attributeSet);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0315Bg(c0889Yn, new C0655Pj(), new C0654Pi());
        A02();
    }

    public C3C(C0889Yn c0889Yn, AttributeSet attributeSet, int i) {
        super(c0889Yn, attributeSet, i);
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
        this.A06 = new C0315Bg(c0889Yn, new C0655Pj(), new C0654Pi());
        A02();
    }

    private int A00(int i) {
        int i2 = this.A00 * 2;
        int measuredWidth = getMeasuredWidth();
        int spacing = getPaddingLeft();
        int i3 = (measuredWidth - spacing) - i2;
        int itemSize = getAdapter().A0E();
        int numFullItems = 0;
        int spacing2 = Integer.MAX_VALUE;
        while (spacing2 > i) {
            numFullItems++;
            if (numFullItems >= itemSize) {
                return i;
            }
            int spacing3 = numFullItems * i2;
            spacing2 = (int) ((i3 - spacing3) / (numFullItems + 0.333f));
        }
        return spacing2;
    }

    private void A02() {
        this.A06.A2A(0);
        setLayoutManager(this.A06);
        setSaveEnabled(false);
        setSnapDelegate(this);
        AbstractC0556Lo.A0K(this);
    }

    private void A04(int i, int i2) {
        if (i == this.A03 && i2 == this.A02) {
            return;
        }
        this.A03 = i;
        if (A08[1].charAt(11) == 'q') {
            throw new RuntimeException();
        }
        A08[6] = "hNBaptvkpj";
        this.A02 = i2;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 13, 111));
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C3P
    public final void A1y(int i, boolean z) {
        super.A1y(i, z);
        A04(i, 0);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0658Pm
    public final int A7j(int i) {
        int abs = Math.abs(i);
        int scrollXAbs = ((C3P) this).A06;
        if (abs <= scrollXAbs) {
            return 0;
        }
        int i2 = this.A01;
        if (i2 == 0) {
            return 1;
        }
        int scrollXAbs2 = 1 + (abs / i2);
        return scrollXAbs2;
    }

    public int getChildSpacing() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C0372Eb, android.view.View
    public final void onMeasure(int i, int i2) {
        int height;
        int itemSize;
        super.onMeasure(i, i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.A05) {
            int i3 = (int) LD.A02;
            int verticalPadding = C0478Ih.A0E(getContext());
            height = (i3 * verticalPadding) + paddingTop;
        } else {
            int verticalPadding2 = getMeasuredWidth();
            height = Math.round(verticalPadding2 / 1.91f);
        }
        int verticalPadding3 = View.MeasureSpec.getMode(i2);
        switch (verticalPadding3) {
            case Integer.MIN_VALUE:
                int verticalPadding4 = View.MeasureSpec.getSize(i2);
                height = Math.min(verticalPadding4, height);
                break;
            case 1073741824:
                height = View.MeasureSpec.getSize(i2);
                break;
        }
        int height2 = height - paddingTop;
        if (this.A05) {
            int verticalPadding5 = MI.A09;
            itemSize = Math.min(verticalPadding5, height2);
        } else {
            itemSize = A00(height2);
        }
        int height3 = getMeasuredWidth();
        int verticalPadding6 = itemSize + paddingTop;
        setMeasuredDimension(height3, verticalPadding6);
        if (!this.A05) {
            int verticalPadding7 = this.A00;
            setChildWidth((verticalPadding7 * 2) + itemSize);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.C0372Eb
    public void setAdapter(AbstractC01434c abstractC01434c) {
        this.A06.A2H(abstractC01434c == null ? -1 : abstractC01434c.hashCode());
        super.setAdapter(abstractC01434c);
    }

    public void setChildSpacing(int i) {
        this.A00 = i;
    }

    public void setChildWidth(int i) {
        this.A01 = i;
        int measuredWidth = getMeasuredWidth();
        int pageWidth = getPaddingLeft();
        int i2 = measuredWidth - pageWidth;
        int pageWidth2 = getPaddingRight();
        int i3 = i2 - pageWidth2;
        C0315Bg c0315Bg = this.A06;
        int pageWidth3 = this.A01;
        c0315Bg.A2I((i3 - pageWidth3) / 2);
        C0315Bg c0315Bg2 = this.A06;
        int pageWidth4 = this.A01;
        c0315Bg2.A2G(pageWidth4 / measuredWidth);
    }

    public void setCurrentPosition(int i) {
        A1y(i, false);
    }

    public void setOnPageChangedListener(MM mm) {
        this.A04 = mm;
    }

    public void setShowTextInCarousel(boolean z) {
        this.A05 = z;
    }
}
