package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.ef, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3091ef extends LinearLayout {
    public static final int A00 = (int) (XX.A02 * 32.0f);
    public static final int A01 = (int) (XX.A02 * 8.0f);

    public C3091ef(C3218gi c3218gi, NativeAd nativeAd, C2682Vd c2682Vd, C2912bk c2912bk, AdOptionsView adOptionsView) {
        super(c3218gi);
        setOrientation(0);
        c2912bk.setFullCircleCorners(true);
        LinearLayout.LayoutParams iconViewParams = new LinearLayout.LayoutParams(A00, A00);
        iconViewParams.gravity = 16;
        iconViewParams.setMargins(0, 0, A01, 0);
        addView(c2912bk, iconViewParams);
        TextView textView = new TextView(c3218gi);
        c2682Vd.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView sponsoredTextView = new TextView(c3218gi);
        c2682Vd.A06(sponsoredTextView);
        sponsoredTextView.setMaxLines(1);
        sponsoredTextView.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c3218gi);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams iconViewParams2 = new LinearLayout.LayoutParams(0, -2);
        iconViewParams2.weight = 1.0f;
        iconViewParams2.gravity = 16;
        LinearLayout.LayoutParams textContainerParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(textView, textContainerParams);
        LinearLayout.LayoutParams textContainerParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.addView(sponsoredTextView, textContainerParams2);
        addView(linearLayout, iconViewParams2);
        ViewGroup.LayoutParams textContainerParams3 = new LinearLayout.LayoutParams(-2, -2);
        addView(adOptionsView, textContainerParams3);
    }
}
