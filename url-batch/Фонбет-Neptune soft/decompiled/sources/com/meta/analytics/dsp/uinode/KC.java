package com.meta.analytics.dsp.uinode;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class KC implements InterfaceC0681Qj {
    public static byte[] A06;
    public static String[] A07 = {"A7BI5", "gKWOMBrJHuMwvM90e1kQxbLVjOWHbC33", "UYN9ptwwhG6kseDSIUjMW4tKOOJXD2Z7", "Ja75eMPfNEu2gmMNMrA6", "IMMQ3U1D8CAOequczoeO", "aOtgKGua3vuGYyvCOzm8c8DJStBVo0w", "j", "V23k2coZlnHKKs"};
    public ValueAnimator A00;
    public EnumC0680Qi A01 = EnumC0680Qi.A05;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{40, Ascii.EM, 44, 40, -9, 35, 32, 35, 38};
    }

    static {
        A05();
    }

    public KC(View view, int i, int i2, int i3) {
        this.A02 = i;
        this.A05 = view;
        this.A04 = i2;
        this.A03 = i3;
    }

    private void A06(int i, int i2) {
        this.A01 = i == this.A04 ? EnumC0680Qi.A04 : EnumC0680Qi.A06;
        ObjectAnimator ofInt = ObjectAnimator.ofInt((TextView) this.A05, A04(0, 9, 82), i, i2);
        this.A00 = ofInt;
        ofInt.setEvaluator(new ArgbEvaluator());
        this.A00.setDuration(this.A02);
        this.A00.addListener(new C0687Qp(this, i, i2));
        this.A00.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i, int i2, boolean z) {
        if (z) {
            A06(i, i2);
            return;
        }
        View view = this.A05;
        if (A07[4].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[7] = "Y4rCa4lywlEdVv";
        strArr[0] = "Hdg5N";
        ((TextView) view).setTextColor(i2);
        this.A01 = i2 == this.A03 ? EnumC0680Qi.A03 : EnumC0680Qi.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0681Qj
    public final void A3Y(boolean z, boolean z2) {
        int endColor = z2 ? this.A03 : this.A04;
        int startColor = z2 ? this.A04 : this.A03;
        A07(endColor, startColor, z);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0681Qj
    public final EnumC0680Qi A82() {
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0681Qj
    public final void cancel() {
        ValueAnimator valueAnimator = this.A00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
