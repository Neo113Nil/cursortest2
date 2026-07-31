package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.jl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3391jl extends N3 {
    public static byte[] A06;
    public static final String A07;
    public C3393jn A00;
    public EnumC2692Vp A01;
    public boolean A02;
    public final C3218gi A03;
    public final VA A04;
    public final AbstractC2864ay A05;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{-55, -56, -43, -43, -52, -39};
    }

    static {
        A05();
        A07 = C3391jl.class.getSimpleName();
    }

    public C3391jl(C3218gi c3218gi, VA va, AbstractC2864ay abstractC2864ay, C3163fp c3163fp, N4 n4, EnumC2692Vp enumC2692Vp) {
        super(c3218gi, n4, c3163fp);
        this.A04 = va;
        this.A05 = abstractC2864ay;
        this.A03 = c3218gi;
        this.A01 = enumC2692Vp;
    }

    @Override // com.facebook.ads.redexgen.core.N3
    public final void A08(Map<String, String> map) {
        String adPlacementType;
        if (this.A00 != null && !TextUtils.isEmpty(this.A00.A7O())) {
            this.A03.A0F().A3L();
            AbstractC2502Oa.A02(this.A00.A05(), AbstractC2738Xm.A00(A04(0, 6, 50)));
            this.A04.ABJ(this.A00.A7O(), map);
            if (C2668Up.A1A(this.A03)) {
                if (this.A01 == EnumC2692Vp.A09) {
                    adPlacementType = AdPlacementType.MEDIUM_RECTANGLE.toString();
                } else {
                    adPlacementType = AdPlacementType.BANNER.toString();
                }
                C2714Wl A00 = C2714Wl.A00(this.A03);
                String placementType = this.A00.A7O();
                A00.A0E(adPlacementType, placementType);
            }
        }
    }

    public final synchronized void A09() {
        if (!this.A02 && this.A00 != null) {
            this.A02 = true;
            if (!TextUtils.isEmpty(this.A00.A03())) {
                Y4.A00(new C3392jm(this));
            }
        }
    }

    public final void A0A(C3393jn c3393jn) {
        this.A00 = c3393jn;
    }
}
