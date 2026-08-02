package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class OR implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ BJ A00;

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
        A01 = new byte[]{Ascii.ESC, Ascii.US, 19, Ascii.EM, Ascii.ETB};
    }

    public OR(BJ bj) {
        this.A00 = bj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KL.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A09(A00(0, 5, 67));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
