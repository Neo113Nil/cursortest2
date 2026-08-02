package com.meta.analytics.dsp.uinode;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class FU extends AbstractC0992b5 implements Serializable {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772011L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{72, 79, 85, 68, 83, 82, 85, 72, 85, 72, 64, 77};
    }

    public FU(List<C1G> list) {
        super(list);
    }

    public static FU A02(JSONObject jSONObject, C0889Yn c0889Yn) {
        FU fu = new FU(AbstractC0992b5.A08(jSONObject, c0889Yn, new C0989b2()));
        fu.A16(jSONObject);
        fu.A0b(A03(0, 12, 67));
        return fu;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0F() {
        return 0;
    }

    @Override // com.meta.analytics.dsp.uinode.C1F
    public final int A0G() {
        return 0;
    }
}
