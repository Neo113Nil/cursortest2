package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3525ly extends AbstractC2374Jb {
    public static String[] A02 = {"WZkrugZ9k", "x4SWtznAL", "HpTT9hwXiF", "GejxPsVIqdMqn4uNSueU2CvK5QdcE", "kY6PJZpIMUpeuimCFjYxSQzMMPc04", "AyPx1MENxNPCbM7HZGi1kOnAmMtkHxm9", "mMmHuZ9NaaUgibHMJoRcA4q0AdWca5ys", "Hii3DdXYVzyt8ReiNrO7wglp0i"};
    public HJ A00;
    public C3526lz A01;

    private int A00(C20254v c20254v) {
        int i = (c20254v.A0l()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i == 6 || i == 7) {
            c20254v.A0g(4);
            String[] strArr = A02;
            String str = strArr[6];
            String str2 = strArr[5];
            int charAt = str.charAt(19);
            int blockSizeKey = str2.charAt(19);
            if (charAt == blockSizeKey) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "Cisj8wK8S";
            strArr2[0] = "koTyuZ08X";
            c20254v.A0S();
        }
        int result = HF.A00(c20254v, i);
        c20254v.A0f(0);
        return result;
    }

    public static boolean A01(C20254v c20254v) {
        return c20254v.A07() >= 5 && c20254v.A0I() == 127 && c20254v.A0Q() == 1179402563;
    }

    public static boolean A02(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2374Jb
    public final long A09(C20254v c20254v) {
        if (!A02(c20254v.A0l())) {
            return -1L;
        }
        return A00(c20254v);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2374Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A00 = null;
            this.A01 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2374Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C20254v c20254v, long j, C2373Ja c2373Ja) {
        byte[] A0l = c20254v.A0l();
        HJ hj = this.A00;
        if (hj == null) {
            HJ hj2 = new HJ(A0l, 17);
            this.A00 = hj2;
            c2373Ja.A00 = hj2.A08(Arrays.copyOfRange(A0l, 9, c20254v.A0A()), null);
            return true;
        }
        if ((A0l[0] & Byte.MAX_VALUE) == 3) {
            HI A03 = HH.A03(c20254v);
            HJ streamMetadata = hj.A09(A03);
            this.A00 = streamMetadata;
            this.A01 = new C3526lz(streamMetadata, A03);
            return true;
        }
        if (!A02(A0l)) {
            return true;
        }
        if (this.A01 != null) {
            this.A01.A00(j);
            c2373Ja.A01 = this.A01;
        }
        C3778qI c3778qI = c2373Ja.A00;
        String[] strArr = A02;
        if (strArr[4].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "zwTfeKiQLRobCpiZaAgtU0oyP8s29";
        strArr2[2] = "wrCWS6iAkk";
        AbstractC20023y.A01(c3778qI);
        return false;
    }
}
