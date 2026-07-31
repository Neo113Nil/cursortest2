package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdSize;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XG {
    public static byte[] A00;
    public static String[] A01 = {"NoYeCqw0NuwsBVSvR8aiyPnoj7", "APA6ODPEmALJh8xHCjcwQdd6vsoZzjc", "og2YXunKDp8EqsbnYhzdu6qR", "YLuKSEsrRIdzXIjkloLmDmBrtZDR6KFi", "8qSAHAaIpnwwIsCvL7AfoFTJYv1h46H2", "PXVMr", "05SrQOor", "5yYP5"};
    public static final Map<EnumC2692Vp, EnumC2693Vq> A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{104, 74, 69, 12, 95, 11, 72, 89, 78, 74, 95, 78, 11, 106, 79, 120, 66, 81, 78, 11, 94, 88, 66, 69, 76, 11, 95, 67, 66, 88, 11, 92, 66, 79, 95, 67, 11, 74, 69, 79, 11, 67, 78, 66, 76, 67, 95, 5, 50, 9, 12, 9, 8, 16, 9, 71, 38, 3, 52, 14, 29, 2, 71, 19, 30, 23, 2, 73};
    }

    static {
        A07();
        A02 = new HashMap();
        A02.put(EnumC2692Vp.A09, EnumC2693Vq.A0D);
        A02.put(EnumC2692Vp.A07, EnumC2693Vq.A0F);
        A02.put(EnumC2692Vp.A06, EnumC2693Vq.A0E);
    }

    public static AdSize A00(EnumC2692Vp enumC2692Vp) {
        return AdSize.fromWidthAndHeight(enumC2692Vp.A04(), enumC2692Vp.A03());
    }

    public static AdSize A01(EnumC2693Vq enumC2693Vq) {
        for (Map.Entry<EnumC2692Vp, EnumC2693Vq> entry : A02.entrySet()) {
            if (entry.getValue() == enumC2693Vq) {
                EnumC2692Vp key = entry.getKey();
                if (A01[3].charAt(31) == 'z') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[5] = "vUJqh";
                strArr[7] = "m1G2X";
                return A00(key);
            }
        }
        return AdSize.BANNER_320_50;
    }

    public static EnumC2692Vp A02(int i) {
        switch (i) {
            case 4:
                return EnumC2692Vp.A05;
            case 5:
                return EnumC2692Vp.A06;
            case 6:
                return EnumC2692Vp.A07;
            case 7:
                return EnumC2692Vp.A09;
            case 100:
                return EnumC2692Vp.A08;
            default:
                throw new IllegalArgumentException(A06(48, 20, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
        }
    }

    public static EnumC2692Vp A03(int i, int i2) {
        if (EnumC2692Vp.A08.A03() == i2 && EnumC2692Vp.A08.A04() == i) {
            return EnumC2692Vp.A08;
        }
        if (EnumC2692Vp.A05.A03() == i2) {
            int A04 = EnumC2692Vp.A05.A04();
            String[] strArr = A01;
            if (strArr[5].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A01[3] = "mZi1y4qoTe3Eq90wST2K5ufjmqQARasa";
            if (A04 == i) {
                return EnumC2692Vp.A05;
            }
        }
        if (EnumC2692Vp.A06.A03() == i2 && EnumC2692Vp.A06.A04() == i) {
            return EnumC2692Vp.A06;
        }
        if (EnumC2692Vp.A07.A03() == i2 && EnumC2692Vp.A07.A04() == i) {
            return EnumC2692Vp.A07;
        }
        if (EnumC2692Vp.A09.A03() == i2) {
            EnumC2692Vp enumC2692Vp = EnumC2692Vp.A09;
            String[] strArr2 = A01;
            if (strArr2[6].length() == strArr2[0].length()) {
                throw new RuntimeException();
            }
            A01[3] = "Hv8n5Vk5MDnKIrkb6r8Yx0AFcMxyPOg2";
            if (enumC2692Vp.A04() == i) {
                return EnumC2692Vp.A09;
            }
        }
        throw new IllegalArgumentException(A06(0, 48, 57));
    }

    public static EnumC2692Vp A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static EnumC2693Vq A05(EnumC2692Vp enumC2692Vp) {
        EnumC2693Vq adTemplate = A02.get(enumC2692Vp);
        if (adTemplate == null) {
            return EnumC2693Vq.A0G;
        }
        return adTemplate;
    }
}
