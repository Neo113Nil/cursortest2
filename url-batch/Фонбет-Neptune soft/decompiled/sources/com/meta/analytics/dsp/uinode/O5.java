package com.meta.analytics.dsp.uinode;

import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class O5 extends LinearLayout {
    public static final int A06 = (int) (LD.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C0889Yn A04;
    public final O6[] A05;

    public O5(C0889Yn c0889Yn, int i, int i2, int i3, int i4) {
        super(c0889Yn);
        this.A00 = A06;
        this.A04 = c0889Yn;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new O6[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private O6 A00() {
        O6 o6 = new O6(this.A04, this.A01, this.A02);
        int i = this.A03;
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(i, i);
        starRatingViewParams.gravity = 16;
        o6.setLayoutParams(starRatingViewParams);
        return o6;
    }

    private void A01() {
        int i = 0;
        while (true) {
            O6[] o6Arr = this.A05;
            int i2 = o6Arr.length;
            if (i < i2) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o6Arr[i].getLayoutParams();
                int i3 = i == 0 ? 0 : this.A00;
                layoutParams.leftMargin = i3;
                i++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02(float f) {
        for (int i = 0; i < i; i++) {
            float fillRatio = Math.min(1.0f, f - i);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
