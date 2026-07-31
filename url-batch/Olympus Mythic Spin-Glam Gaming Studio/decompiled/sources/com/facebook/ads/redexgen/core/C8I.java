package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8I, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C8I extends AbstractC3439kY<EnumC2442Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C8I(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3439kY
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C2450Lz A04(EnumC2442Lr enumC2442Lr) {
        return new C2450Lz(this, enumC2442Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC2442Lr.A03());
    }
}
