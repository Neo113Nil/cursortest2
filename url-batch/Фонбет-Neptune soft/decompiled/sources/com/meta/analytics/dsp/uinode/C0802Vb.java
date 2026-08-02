package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Vb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0802Vb implements InterfaceC0709Rl {
    public static byte[] A02;
    public final /* synthetic */ C0888Ym A00;
    public final /* synthetic */ InterfaceC0707Rj A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 32);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-120, -121, -125, -106, -105, -108, -121, -127, -123, -111, -112, -120, -117, -119};
    }

    public C0802Vb(InterfaceC0707Rj interfaceC0707Rj, C0888Ym c0888Ym) {
        this.A01 = interfaceC0707Rj;
        this.A00 = c0888Ym;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0709Rl
    public final void A45() {
        try {
            C0478Ih.A0R(this.A00).A2Y(this.A01.A6h().optJSONObject(A00(0, 14, 2)));
        } catch (JSONException e) {
            this.A00.A07().A3c(e);
        }
    }
}
