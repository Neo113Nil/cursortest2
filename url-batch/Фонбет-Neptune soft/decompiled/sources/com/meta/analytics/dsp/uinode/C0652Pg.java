package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.objectweb.asm.Opcodes;

/* renamed from: com.facebook.ads.redexgen.X.Pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0652Pg extends LinearLayout {
    public LinearLayout A00;
    public final int A01;
    public final C0889Yn A02;
    public final O3 A03;
    public final O9 A04;
    public static final int A07 = (int) (LD.A02 * 16.0f);
    public static final int A08 = (int) (LD.A02 * 16.0f);
    public static final int A06 = (int) (LD.A02 * 8.0f);
    public static final int A05 = (int) (LD.A02 * 72.0f);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0652Pg(C0650Pe c0650Pe) {
        super(r0);
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        C1P c1p;
        int i;
        c0889Yn = c0650Pe.A06;
        c0889Yn2 = c0650Pe.A06;
        this.A02 = c0889Yn2;
        this.A03 = new O3(c0889Yn2);
        c1p = c0650Pe.A01;
        this.A04 = new O9(c0889Yn2, c1p, true, false, true);
        i = c0650Pe.A00;
        this.A01 = i;
        A03(c0650Pe);
    }

    public /* synthetic */ C0652Pg(C0650Pe c0650Pe, C0733Sj c0733Sj) {
        this(c0650Pe);
    }

    private void A00() {
        A01(this.A03, Opcodes.FCMPG);
        A01(this.A04, Opcodes.TABLESWITCH);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, Opcodes.ARRAYLENGTH);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C0650Pe c0650Pe) {
        String str;
        String str2;
        String str3;
        str = c0650Pe.A03;
        if (!TextUtils.isEmpty(str)) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A00 = linearLayout;
            linearLayout.setGravity(17);
            LinearLayout linearLayout2 = this.A00;
            int i = A08;
            linearLayout2.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams informativeTextViewParams = new LinearLayout.LayoutParams(-2, -2);
            informativeTextViewParams.setMargins(0, i / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            AbstractC0556Lo.A0X(textView, false, 16);
            str2 = c0650Pe.A03;
            textView.setText(str2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            AsyncTaskC0766Tq A04 = new AsyncTaskC0766Tq(imageView, this.A02).A04();
            str3 = c0650Pe.A02;
            A04.A07(str3);
            int i2 = A07;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
            layoutParams2.setMargins(0, 0, i / 2, 0);
            this.A00.addView(imageView, layoutParams2);
            this.A00.addView(textView, layoutParams);
            GradientDrawable bgDrawable = new GradientDrawable();
            bgDrawable.setCornerRadius(100.0f);
            bgDrawable.setColor(469762047);
            AbstractC0556Lo.A0S(this.A00, bgDrawable);
            addView(this.A00, informativeTextViewParams);
        }
    }

    private void A03(C0650Pe c0650Pe) {
        C1N c1n;
        C00641a c00641a;
        C1N c1n2;
        C00641a c00641a2;
        AbstractC0556Lo.A0M(this.A03, 0);
        this.A03.setRadius(50);
        c1n = c0650Pe.A04;
        if (c1n.A00() == C1L.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        AsyncTaskC0766Tq A04 = new AsyncTaskC0766Tq(this.A03, this.A02).A04();
        c00641a = c0650Pe.A05;
        A04.A07(c00641a.A01());
        O9 o9 = this.A04;
        c1n2 = c0650Pe.A04;
        String A062 = c1n2.A06();
        c00641a2 = c0650Pe.A05;
        o9.A03(A062, c00641a2.A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(0, i, 0, i / 2);
        View view = this.A03;
        int i2 = A05;
        ViewGroup.LayoutParams titleAndDescriptionParams = new LinearLayout.LayoutParams(i2, i2);
        addView(view, titleAndDescriptionParams);
        addView(this.A04, layoutParams);
        A02(c0650Pe);
        AbstractC0556Lo.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC0651Pf interfaceC0651Pf) {
        A00();
        postDelayed(new C0733Sj(this, interfaceC0651Pf), this.A01);
    }
}
