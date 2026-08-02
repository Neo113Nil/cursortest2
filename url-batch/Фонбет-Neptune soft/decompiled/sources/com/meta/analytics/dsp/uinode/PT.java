package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class PT implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C0747Sx A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 73);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.RS, 33, 33, 34, 49, Ascii.RS, 38, 41, 48};
    }

    public PT(C0747Sx c0747Sx) {
        this.A00 = c0747Sx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C0634Oo c0634Oo;
        if (KL.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (z) {
                return;
            }
            c0634Oo = this.A00.A0H;
            c0634Oo.A02(A00(0, 9, 116));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
