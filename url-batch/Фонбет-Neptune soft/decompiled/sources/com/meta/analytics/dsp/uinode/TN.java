package com.meta.analytics.dsp.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class TN implements P2 {
    public static byte[] A01;
    public final /* synthetic */ B3 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-49, -53, -64, -40};
    }

    public TN(B3 b3) {
        this.A00 = b3;
    }

    @Override // com.meta.analytics.dsp.uinode.P2
    public final void ADY(String str, JSONObject jSONObject) {
        PB pb;
        C0889Yn c0889Yn;
        C0889Yn c0889Yn2;
        if (str.equals(A00(0, 4, 72))) {
            this.A00.AGY();
            c0889Yn = this.A00.A07;
            if (C0478Ih.A1W(c0889Yn)) {
                c0889Yn2 = this.A00.A07;
                c0889Yn2.A0A().ABG();
            }
        }
        pb = this.A00.A0F;
        pb.A0h(str, jSONObject);
    }
}
