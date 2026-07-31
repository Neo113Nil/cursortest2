package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeBannerAd;
import java.util.ArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public final class F7 extends LinearLayout implements InterfaceC3090ee {
    public final NativeBannerAd A00;
    public final C3218gi A01;
    public final ArrayList<View> A02;
    public static final int A04 = (int) (XX.A02 * 42.0f);
    public static final int A03 = (int) (XX.A02 * 48.0f);
    public static final int A05 = (int) (XX.A02 * 54.0f);
    public static final int A07 = (int) (XX.A02 * 4.0f);
    public static final int A06 = (int) (XX.A02 * 8.0f);

    public F7(C3218gi c3218gi, NativeBannerAd nativeBannerAd, C2682Vd c2682Vd, EnumC2683Ve enumC2683Ve, MediaView mediaView, AdOptionsView adOptionsView, C2809a5 c2809a5) {
        super(c3218gi);
        LinearLayout.LayoutParams layoutParams;
        ViewGroup.LayoutParams commonLayoutParams;
        this.A02 = new ArrayList<>();
        this.A00 = nativeBannerAd;
        this.A01 = c3218gi;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        int A00 = A00(enumC2683Ve);
        C2913bl c2913bl = new C2913bl(this.A01);
        c2913bl.setFullCircleCorners(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(A00, A00);
        c2913bl.addView(mediaView, new LinearLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        relativeLayout.addView(c2913bl, layoutParams2);
        if (c2809a5 != null) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams4.addRule(10);
            layoutParams4.setMargins(XV.A0A, XV.A0A, XV.A00, XV.A00);
            relativeLayout.addView(c2809a5, layoutParams4);
        }
        linearLayout.addView(relativeLayout, layoutParams3);
        View c3087eb = new C3087eb(c3218gi, this.A00, enumC2683Ve, c2682Vd, adOptionsView);
        c3087eb.setPadding(A06, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2);
        layoutParams5.weight = 1.0f;
        layoutParams5.gravity = 16;
        linearLayout.addView(c3087eb, layoutParams5);
        if (enumC2683Ve == EnumC2683Ve.A0A) {
            setPadding(A07, A07, A07, A07);
            setOrientation(0);
            layoutParams = new LinearLayout.LayoutParams(0, -1);
            commonLayoutParams = new LinearLayout.LayoutParams(-2, -1);
            linearLayout.setPadding(0, 0, A07, 0);
        } else {
            setPadding(A06, A06, A06, A06);
            setOrientation(1);
            layoutParams = new LinearLayout.LayoutParams(-1, 0);
            commonLayoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setPadding(0, 0, 0, A06);
        }
        layoutParams.weight = 1.0f;
        addView(linearLayout, layoutParams);
        TextView textView = new TextView(getContext());
        textView.setPadding(A06, A07, A06, A07);
        c2682Vd.A05(textView);
        textView.setText(this.A00.getAdCallToAction());
        addView(textView, commonLayoutParams);
        this.A02.add(mediaView);
        this.A02.add(textView);
    }

    public static int A00(EnumC2683Ve enumC2683Ve) {
        switch (enumC2683Ve) {
            case A0A:
                return A04;
            case A06:
                return A03;
            default:
                return A05;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3090ee
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3090ee
    public ArrayList<View> getViewsForInteraction() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3090ee
    public final void unregisterView() {
        this.A00.unregisterView();
    }
}
