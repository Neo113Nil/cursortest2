package com.facebook.ads.redexgen.core;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC3077eQ implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ C3079eS A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{25, 22, 18, 21, 22, 35};
    }

    public ViewOnClickListenerC3077eQ(C3079eS c3079eS) {
        this.A00 = c3079eS;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr;
        ViewOnClickListenerC2416Kr viewOnClickListenerC2416Kr2;
        if (WU.A02(this)) {
            return;
        }
        try {
            viewOnClickListenerC2416Kr = this.A00.A0l;
            if (viewOnClickListenerC2416Kr == null) {
                return;
            }
            viewOnClickListenerC2416Kr2 = this.A00.A0l;
            viewOnClickListenerC2416Kr2.A0E(A00(0, 6, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
