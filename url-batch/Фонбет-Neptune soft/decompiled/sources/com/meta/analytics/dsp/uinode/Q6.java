package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class Q6 implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ SM A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{Ascii.NAK, Ascii.RS, Ascii.DC4, 19, 17, 34, Ascii.DC4, 35};
    }

    public Q6(SM sm) {
        this.A00 = sm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC0761Tl viewOnClickListenerC0761Tl;
        ViewOnClickListenerC0761Tl viewOnClickListenerC0761Tl2;
        if (KL.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC0761Tl = this.A00.A02;
            if (viewOnClickListenerC0761Tl == null) {
                return;
            }
            viewOnClickListenerC0761Tl2 = this.A00.A02;
            viewOnClickListenerC0761Tl2.A09(A00(0, 8, 65));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
