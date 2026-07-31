package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC3085eZ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ FH A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{56, 51, 57, 62, 60, 47, 57, 46};
    }

    public ViewOnClickListenerC3085eZ(FH fh) {
        this.A00 = fh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr;
        ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC2416Kr = this.A00.A02;
            if (viewOnClickListenerC2416Kr != null) {
                viewOnClickListenerC2416Kr2 = this.A00.A02;
                viewOnClickListenerC2416Kr2.A0E(A00(0, 8, 103));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
