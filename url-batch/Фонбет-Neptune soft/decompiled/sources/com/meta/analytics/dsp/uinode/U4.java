package com.meta.analytics.dsp.uinode;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class U4 extends AbstractC0582Mo {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C2S A03;
    public final C0889Yn A04;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, Ascii.SYN, Ascii.DC4, Ascii.FS, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (LD.A02 * 8.0f);
        A07 = (int) (LD.A02 * 10.0f);
        A06 = (int) (LD.A02 * 44.0f);
    }

    public U4(C0889Yn c0889Yn, J2 j2, String str) {
        super(c0889Yn, j2, str);
        this.A04 = c0889Yn;
        this.A03 = C2T.A00(c0889Yn.A01());
        ImageView imageView = new ImageView(getContext());
        this.A00 = imageView;
        int i = A07;
        imageView.setPadding(i, i, i, i);
        imageView.setColorFilter(-10459280);
        int i2 = A06;
        LinearLayout.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i2, i2);
        closeButtonParams.gravity = 3;
        imageView.setLayoutParams(closeButtonParams);
        ScrollView scrollView = new ScrollView(getContext());
        this.A02 = scrollView;
        scrollView.setFillViewport(true);
        AbstractC0556Lo.A0M(scrollView, -218103809);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.A01 = linearLayout;
        linearLayout.setOrientation(1);
        int i3 = A08;
        linearLayout.setPadding(i3, i3, i3, i3);
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        addView(scrollView, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0582Mo
    public final void A0L() {
        this.A00.setImageBitmap(AbstractC0565Lx.A01(EnumC0564Lw.CROSS));
        this.A00.setOnClickListener(new N7(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        C0586Ms c0586Ms = new C0586Ms(this.A04);
        c0586Ms.setData(this.A03.A0H(), EnumC0564Lw.HIDE_AD);
        c0586Ms.setOnClickListener(new N8(this, c0586Ms));
        C0586Ms c0586Ms2 = new C0586Ms(this.A04);
        c0586Ms2.setData(this.A03.A0L(), EnumC0564Lw.REPORT_AD);
        c0586Ms2.setOnClickListener(new N9(this, c0586Ms2));
        C0586Ms c0586Ms3 = new C0586Ms(this.A04);
        c0586Ms3.setData(this.A03.A0M(), EnumC0564Lw.AD_CHOICES_ICON);
        c0586Ms3.setOnClickListener(new NA(this, c0586Ms3));
        LinearLayout.LayoutParams menuParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        menuParams.setMargins(i, i, i, i);
        menuParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC0556Lo.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(linearLayout, layoutParams);
        linearLayout.addView(c0586Ms, menuParams);
        linearLayout.addView(c0586Ms2, menuParams);
        linearLayout.addView(c0586Ms3, menuParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0582Mo
    public final void A0M() {
        AbstractC0556Lo.A0I(this);
        AbstractC0556Lo.A0J(this);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0582Mo
    public final void A0N(C2W c2w, C2U c2u) {
        String A0H;
        EnumC0564Lw enumC0564Lw;
        int i;
        this.A00.setOnClickListener(null);
        if (c2u == C2U.A05) {
            A0H = this.A03.A0F();
            enumC0564Lw = EnumC0564Lw.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            enumC0564Lw = EnumC0564Lw.HIDE_AD;
            i = -13272859;
        }
        C0580Mm A0I = new C0580Mm(this.A04, this.A0B).A0I(A0H);
        String title = this.A03.A0D();
        C0580Mm A0H2 = A0I.A0H(title);
        String title2 = c2w.A04();
        C0581Mn adHiddenView = A0H2.A0F(title2).A0K(false).A0E(enumC0564Lw).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        AbstractC0556Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(adHiddenView, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0582Mo
    public final void A0O(C2W c2w, C2U c2u) {
        boolean isReportFlow = c2u == C2U.A05;
        N6 n6 = new N6(this.A04, c2w, this.A0B, isReportFlow ? EnumC0564Lw.REPORT_AD : EnumC0564Lw.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(AbstractC0565Lx.A01(EnumC0564Lw.BACK_ARROW));
        this.A00.setOnClickListener(new NB(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        AbstractC0556Lo.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(n6, layoutParams);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0582Mo
    public final boolean A0P() {
        return true;
    }
}
