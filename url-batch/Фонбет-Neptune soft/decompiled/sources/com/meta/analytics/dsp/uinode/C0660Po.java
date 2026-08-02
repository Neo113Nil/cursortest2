package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0660Po extends LinearLayout {
    public static final int A04 = (int) (LD.A02 * 32.0f);
    public static final int A05 = (int) (LD.A02 * 8.0f);
    public TextView A00;
    public TextView A01;
    public O3 A02;
    public final C0889Yn A03;

    public C0660Po(C0889Yn c0889Yn) {
        super(c0889Yn);
        this.A03 = c0889Yn;
        A00(c0889Yn);
    }

    private final void A00(C0889Yn c0889Yn) {
        setGravity(16);
        O3 o3 = new O3(c0889Yn);
        this.A02 = o3;
        o3.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams pageImageViewParams = new LinearLayout.LayoutParams(i, i);
        pageImageViewParams.setMargins(0, 0, A05, 0);
        addView(this.A02, pageImageViewParams);
        LinearLayout pageInfoView = new LinearLayout(c0889Yn);
        pageInfoView.setOrientation(1);
        this.A00 = new TextView(c0889Yn);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        AbstractC0556Lo.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        TextView textView = new TextView(c0889Yn);
        this.A01 = textView;
        AbstractC0556Lo.A0X(textView, false, 14);
        pageInfoView.addView(this.A00);
        pageInfoView.addView(this.A01);
        addView(pageInfoView, layoutParams);
    }

    public final void A01() {
        this.A02.setImageBitmap(null);
        this.A00.setText("");
        this.A01.setText("");
    }

    public final void A02(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C00641a c00641a) {
        AsyncTaskC0766Tq asyncTaskC0766Tq = new AsyncTaskC0766Tq(this.A02, this.A03);
        int i = A04;
        asyncTaskC0766Tq.A05(i, i);
        asyncTaskC0766Tq.A07(c00641a.A01());
        this.A00.setText(c00641a.A02());
        this.A01.setText(c00641a.A03());
    }
}
