package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC2924bw implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C2401Kc A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 70, 74, 76, 78};
    }

    public ViewOnClickListenerC2924bw(C2401Kc c2401Kc) {
        this.A00 = c2401Kc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.getCtaButton().A0E(A00(0, 5, 46));
            if (((AbstractC2931c3) this.A00).A07.A0D() != null) {
                ((AbstractC2931c3) this.A00).A07.A0D().ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
