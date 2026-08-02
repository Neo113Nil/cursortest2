package com.meta.analytics.dsp.uinode;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ok, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0630Ok implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ TT A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 66, 66, 67, 82, 71, 79, 74, 85};
    }

    public ViewOnClickListenerC0630Ok(TT tt) {
        this.A00 = tt;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C0634Oo c0634Oo;
        if (KL.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0O;
            if (z) {
                return;
            }
            c0634Oo = this.A00.A0M;
            c0634Oo.A02(A00(0, 9, 31));
        } catch (Throwable th) {
            KL.A00(th, this);
        }
    }
}
