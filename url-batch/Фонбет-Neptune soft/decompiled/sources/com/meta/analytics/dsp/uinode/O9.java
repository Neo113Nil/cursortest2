package com.meta.analytics.dsp.uinode;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class O9 extends LinearLayout {
    public static byte[] A04;
    public static String[] A05 = {"lF8IVPZcS3mZAefsIaNZ6E9xMmjOqdH7", "idkW2", "HbWJiF6R60B06srsOI5ot4Pv3KsUxfPN", "7f3O1w3Qg3dv0DYXPvEPDd2nNc", "nnNATfNTHr6hSEkqMWy2MP3i9vksRg0T", "pai30RxYeYeDatKriEp6xPPXjxDmZE6E", "MhBAxeK5XElhMNsb", "N4hTYih9SgQSzhMEA04rsaAJRIerHLwS"};
    public static final float A06;
    public static final int A07;
    public static final int A08;
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final boolean A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 69);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A05[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[7] = "1IRXFHeJ8iEaedLhZkECOAxJLr3083z4";
        strArr[2] = "dqFSPFlearJtxV8PFi6iCQhpIdVpxh77";
        A04 = new byte[]{-33, -30, -30, -29, -14, -33, -25, -22, -15};
    }

    static {
        A01();
        float f = Resources.getSystem().getDisplayMetrics().density;
        A06 = f;
        A08 = (int) (6.0f * f);
        A07 = (int) (f * 8.0f);
    }

    public O9(C0889Yn c0889Yn, C1P c1p, boolean z, int i, int i2, int i3) {
        super(c0889Yn);
        setOrientation(1);
        TextView textView = new TextView(c0889Yn);
        this.A02 = textView;
        AbstractC0556Lo.A0X(textView, true, i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int i4 = A08;
        textView.setLineSpacing(i4, 1.0f);
        TextView textView2 = new TextView(c0889Yn);
        this.A01 = textView2;
        TextView textView3 = new TextView(c0889Yn);
        this.A00 = textView3;
        AbstractC0556Lo.A0X(textView3, false, i2);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setLineSpacing(i4, 1.0f);
        boolean A0y = C0478Ih.A0y(c0889Yn);
        this.A03 = A0y;
        int i5 = A0y ? -2 : -1;
        ViewGroup.LayoutParams titleParams = new LinearLayout.LayoutParams(i5, -2);
        addView(textView, titleParams);
        ViewGroup.LayoutParams titleParams2 = new LinearLayout.LayoutParams(i5, -2);
        addView(textView2, titleParams2);
        textView2.setVisibility(8);
        A02(c1p, z);
        LinearLayout.LayoutParams titleParams3 = new LinearLayout.LayoutParams(i5, -2);
        titleParams3.setMargins(0, i3, 0, 0);
        addView(textView3, titleParams3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public O9(C0889Yn c0889Yn, C1P c1p, boolean z, boolean z2, boolean z3) {
        this(c0889Yn, c1p, z, r4, r5, z3 ? r6 / 2 : r6);
        int i = z2 ? 18 : 22;
        int i2 = z2 ? 14 : 16;
        int i3 = A07;
    }

    public final void A02(C1P c1p, boolean z) {
        this.A02.setTextColor(c1p.A06(z));
        this.A01.setTextColor(c1p.A04(z));
        this.A00.setTextColor(c1p.A05(z));
    }

    public final void A03(String str, String str2, String str3, boolean z, boolean z2) {
        boolean z3 = !TextUtils.isEmpty(str);
        boolean z4 = !TextUtils.isEmpty(str2);
        TextView textView = this.A02;
        if (!z3) {
            str = str2;
        }
        textView.setText(str);
        if (str3 != null) {
            this.A01.setText(str3);
        }
        TextView textView2 = this.A00;
        if (!z3) {
            str2 = A00(0, 0, 28);
        }
        textView2.setText(str2);
        if (A05[4].charAt(18) != 'y') {
            throw new RuntimeException();
        }
        A05[4] = "cGsHRNQKRzUTXMDBZCyzngEN4Bg1pclE";
        int i = 3;
        if (!z3 || !z4) {
            TextView textView3 = this.A02;
            if (z) {
                i = 2;
            } else if (z2) {
                i = 4;
            }
            textView3.setMaxLines(i);
            return;
        }
        this.A02.setMaxLines(z ? 1 : 2);
        this.A00.setMaxLines(z ? 1 : z2 ? 3 : 2);
    }

    public TextView getDescriptionTextView() {
        return this.A00;
    }

    public TextView getTitleTextView() {
        return this.A02;
    }

    public void setAlignment(int i) {
        if (this.A03) {
            setGravity(i);
        }
        this.A02.setGravity(i);
        this.A00.setGravity(i);
    }

    public void setCTAClickListener(ViewOnClickListenerC0761Tl viewOnClickListenerC0761Tl) {
        OH A03 = OI.A03(viewOnClickListenerC0761Tl, A00(0, 9, 57));
        this.A02.setOnClickListener(A03);
        this.A00.setOnClickListener(A03);
        this.A01.setOnClickListener(A03);
    }

    public void setDescriptionVisibility(int i) {
        this.A00.setVisibility(i);
    }
}
