package com.meta.analytics.dsp.uinode;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Ms, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0586Ms extends LinearLayout {
    public boolean A00;
    public final ImageView A01;
    public final TextView A02;
    public static final int A04 = (int) (LD.A02 * 16.0f);
    public static final int A05 = (int) (LD.A02 * 12.0f);
    public static final int A06 = (int) (LD.A02 * 12.0f);
    public static final int A03 = (int) (LD.A02 * 16.0f);

    public C0586Ms(C0889Yn c0889Yn) {
        super(c0889Yn);
        this.A00 = false;
        setOrientation(0);
        int i = A04;
        int i2 = A05;
        setPadding(i, i2, i, i2);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        int i3 = A03;
        LinearLayout.LayoutParams textViewParams = new LinearLayout.LayoutParams(i3, i3);
        textViewParams.gravity = 17;
        TextView textView = new TextView(getContext());
        this.A02 = textView;
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        addView(imageView, textViewParams);
        addView(textView, layoutParams);
        A00();
    }

    private void A00() {
        int textColor;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.A00 ? -13272859 : -1315344);
        gradientDrawable.setCornerRadius(50.0f);
        AbstractC0556Lo.A0S(this, gradientDrawable);
        AbstractC0556Lo.A0X(this.A02, false, 14);
        if (this.A00) {
            textColor = -1;
        } else {
            textColor = -10459280;
        }
        this.A02.setTextColor(textColor);
        this.A01.setColorFilter(textColor);
    }

    public final void A01() {
        setSelected(!this.A00);
    }

    public void setData(String str, EnumC0564Lw enumC0564Lw) {
        this.A02.setText(str);
        if (enumC0564Lw != null) {
            this.A01.setImageBitmap(AbstractC0565Lx.A01(enumC0564Lw));
            this.A01.setVisibility(0);
            this.A02.setPadding(A06, 0, 0, 0);
        } else {
            this.A01.setVisibility(8);
            this.A02.setPadding(0, 0, 0, 0);
        }
        A00();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.A00 = z;
        A00();
    }
}
