package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC3017dR implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C5F A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{20, 23, 23, 24, 39, 20, 28, 31, 38};
    }

    public ViewOnClickListenerC3017dR(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C2967cd c2967cd;
        InterfaceC3038dm interfaceC3038dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0K;
            if (!z) {
                c2967cd = this.A00.A0H;
                c2967cd.A02(A00(0, 9, 103));
                interfaceC3038dm = this.A00.A0Z;
                interfaceC3038dm.ACQ();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
