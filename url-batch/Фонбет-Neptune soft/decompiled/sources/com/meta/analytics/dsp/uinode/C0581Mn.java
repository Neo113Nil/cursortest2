package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0581Mn extends RelativeLayout {
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public final int A00;
    public final int A01;
    public final C2S A02;
    public final C0889Yn A03;
    public final InterfaceC0584Mq A04;
    public final boolean A05;

    static {
        int i = (int) (LD.A02 * 16.0f);
        A09 = i;
        A0A = (int) (LD.A02 * 8.0f);
        A0D = (int) (LD.A02 * 44.0f);
        int i2 = (int) (LD.A02 * 10.0f);
        A08 = i2;
        A07 = i - i2;
        A0E = (int) (LD.A02 * 75.0f);
        A0B = (int) (LD.A02 * 25.0f);
        A0F = (int) (LD.A02 * 45.0f);
        A0C = (int) (LD.A02 * 15.0f);
        A06 = (int) (LD.A02 * 16.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0581Mn(C0580Mm c0580Mm) {
        super(r0);
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        InterfaceC0584Mq interfaceC0584Mq;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        c0889Yn = c0580Mm.A0C;
        c0889Yn2 = c0580Mm.A0C;
        this.A03 = c0889Yn2;
        this.A02 = C2T.A00(c0889Yn2.A01());
        interfaceC0584Mq = c0580Mm.A02;
        this.A04 = interfaceC0584Mq;
        z = c0580Mm.A0B;
        this.A01 = z ? A0E : A0F;
        z2 = c0580Mm.A0B;
        this.A00 = z2 ? A0B : A0C;
        z3 = c0580Mm.A07;
        this.A05 = z3;
        setFocusable(true);
        View A01 = A01(c0580Mm);
        View A00 = A00(c0580Mm);
        View footerView = getFooterView();
        AbstractC0556Lo.A0K(A01);
        AbstractC0556Lo.A0K(A00);
        AbstractC0556Lo.A0K(footerView);
        RelativeLayout.LayoutParams footerParams = new RelativeLayout.LayoutParams(-1, -2);
        footerParams.addRule(10);
        RelativeLayout.LayoutParams headerParams = new RelativeLayout.LayoutParams(-1, -1);
        headerParams.addRule(13);
        headerParams.addRule(3, A01.getId());
        headerParams.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        int i = A09;
        layoutParams.setMargins(i, 0, i, i);
        addView(A01, footerParams);
        addView(A00, headerParams);
        addView(footerView, layoutParams);
        z4 = c0580Mm.A08;
        footerView.setVisibility(z4 ? 0 : 8);
    }

    public /* synthetic */ C0581Mn(C0580Mm c0580Mm, ViewOnClickListenerC0578Mk viewOnClickListenerC0578Mk) {
        this(c0580Mm);
    }

    private View A00(C0580Mm c0580Mm) {
        EnumC0564Lw enumC0564Lw;
        int i;
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        ImageView imageView = new ImageView(getContext());
        int i2 = this.A00;
        imageView.setPadding(i2, i2, i2, i2);
        enumC0564Lw = c0580Mm.A01;
        imageView.setImageBitmap(AbstractC0565Lx.A01(enumC0564Lw));
        imageView.setColorFilter(-1);
        int i3 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        i = c0580Mm.A00;
        gradientDrawable.setColor(i);
        AbstractC0556Lo.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i4 = A09;
        layoutParams.setMargins(i4, 0, i4, i4);
        TextView textView = new TextView(getContext());
        AbstractC0556Lo.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        str = c0580Mm.A06;
        textView.setText(str);
        textView.setGravity(17);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(-1, -2);
        iconParams.setMargins(i4, 0, i4, i4);
        TextView textView2 = new TextView(getContext());
        AbstractC0556Lo.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        str2 = c0580Mm.A05;
        textView2.setText(str2);
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(i4, 0, i4, i4);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, iconParams);
        linearLayout.addView(textView2, layoutParams2);
        z = c0580Mm.A09;
        if (z) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            str3 = c0580Mm.A04;
            if (!TextUtils.isEmpty(str3)) {
                O3 o3 = new O3(this.A03);
                int i5 = A0F;
                LinearLayout.LayoutParams subtitleParams = new LinearLayout.LayoutParams(i5, i5);
                subtitleParams.setMargins(0, 0, A0A, 0);
                o3.setFullCircleCorners(true);
                AsyncTaskC0766Tq A05 = new AsyncTaskC0766Tq(o3, this.A03).A05(i5, i5);
                str5 = c0580Mm.A04;
                A05.A07(str5);
                linearLayout2.addView(o3, subtitleParams);
            }
            C0586Ms c0586Ms = new C0586Ms(this.A03);
            str4 = c0580Mm.A03;
            c0586Ms.setData(str4, EnumC0564Lw.CHECKMARK);
            c0586Ms.setSelected(true);
            linearLayout2.addView(c0586Ms, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C0580Mm c0580Mm) {
        boolean z;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        z = c0580Mm.A0A;
        if (z) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(AbstractC0565Lx.A01(EnumC0564Lw.CROSS));
            imageView.setOnClickListener(new ViewOnClickListenerC0578Mk(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(AbstractC0565Lx.A01(EnumC0564Lw.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView managePrefsText = new TextView(getContext());
        AbstractC0556Lo.A0X(managePrefsText, false, 16);
        managePrefsText.setTextColor(-13272859);
        int i2 = A0A;
        managePrefsText.setPadding(i2, i2, i2, i2);
        managePrefsText.setText(this.A02.A0J());
        LinearLayout.LayoutParams settingsIconParams = new LinearLayout.LayoutParams(-2, -2);
        settingsIconParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new ViewOnClickListenerC0579Ml(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(managePrefsText, settingsIconParams);
        return linearLayout;
    }
}
