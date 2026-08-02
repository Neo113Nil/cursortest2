package com.meta.analytics.dsp.uinode;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;
import java.util.Collections;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Xg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0856Xg extends C6 {
    public static byte[] A03;
    public static String[] A04 = {"NGxGYCc4p5LcUzQMJWyw5DiDSRjOQe9F", "UCFVtk8FFiQwlTHXhlKlMorjx3xQRwUs", "gTYsvz0mqVjOzoMK", "3KonftsBU2Jf7i08alR6FL8DBvSTG56H", "D2cphfoCJeCyY12qt8LourkPjJ4neP20", "nKjfLlw2BnKut4cvipNa", "Z1RdCfwuszFRU44UcECPMtJ2BxVCI0wR", ""};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[6].charAt(5) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "nNsRewLEUEMjLhcIGLcqJY6DWywwxHcp";
            strArr[3] = "fafmuFk897DEXRggqTinAcDDyPNFBZka";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 126);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{39, 91, 74, 79, 85, 6, 76, 85, 88, 83, 71, 90, 6, 84, 85, 90, 6, 89, 91, 86, 86, 85, 88, 90, 75, 74, 32, 6, 48, 68, 51, 56, 62, -2, 54, 6, 0, 0, -4, 48, 59, 48, 70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -21, -22, -33, -11, -24, -4, -21, -16, -10, -74, -12, -9, -69, -24, -76, -13, -24, -5, -12, 41, Base64.padSymbol, 44, 49, 55, -9, 53, 56, 45, 47};
    }

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C0856Xg(C4 c4) {
        super(c4);
    }

    @Override // com.meta.analytics.dsp.uinode.C6
    public final void A0B(C0470Hz c0470Hz, long j) throws C02789v {
        if (this.A00 == 2) {
            int A042 = c0470Hz.A04();
            super.A00.AFR(c0470Hz, A042);
            super.A00.AFS(j, 1, A042, 0, null);
            return;
        }
        int A0E = c0470Hz.A0E();
        if (A04[2].length() != 16) {
            throw new RuntimeException();
        }
        A04[7] = "";
        if (A0E == 0 && !this.A01) {
            byte[] bArr = new byte[c0470Hz.A04()];
            c0470Hz.A0c(bArr, 0, bArr.length);
            Pair<Integer, Integer> audioParams = AbstractC0449He.A03(bArr);
            super.A00.A5n(Format.A07(null, A00(58, 15, 9), null, -1, -1, ((Integer) audioParams.second).intValue(), ((Integer) audioParams.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            this.A01 = true;
            return;
        }
        if (this.A00 == 10 && A0E != 1) {
            return;
        }
        int A043 = c0470Hz.A04();
        super.A00.AFR(c0470Hz, A043);
        super.A00.AFS(j, 1, A043, 0, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
    
        if (r5 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        r12 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        r12 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r5 == 1) goto L22;
     */
    @Override // com.meta.analytics.dsp.uinode.C6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean A0C(C0470Hz c0470Hz) throws C0852Xc {
        int i;
        if (!this.A02) {
            int A0E = c0470Hz.A0E();
            if (A04[2].length() == 16) {
                A04[5] = "dXuDB62giJCeOUzZyzuh";
                int i2 = (A0E >> 4) & 15;
                this.A00 = i2;
                if (i2 == 2) {
                    super.A00.A5n(Format.A07(null, A00(73, 10, 74), null, -1, -1, 1, A05[(A0E >> 2) & 3], null, null, 0, null));
                    this.A01 = true;
                } else if (i2 == 7 || i2 == 8) {
                    String A00 = i2 == 7 ? A00(28, 15, 81) : A00(43, 15, 0);
                    int i3 = A0E & 1;
                    if (A04[1].charAt(9) != '8') {
                        A04[2] = "aabLL8EV5C3yGzSa";
                    }
                    Format format = Format.A06(null, A00, null, -1, -1, 1, 8000, i, null, null, 0, null);
                    super.A00.A5n(format);
                    this.A01 = true;
                } else if (i2 != 10) {
                    throw new C0852Xc(A00(0, 28, 104) + this.A00);
                }
                this.A02 = true;
                return true;
            }
            throw new RuntimeException();
        }
        if (A04[4].charAt(28) != 'G') {
            A04[1] = "XJizbdJnEvbAe8rCZCbZRYx6n8uD67e5";
            c0470Hz.A0Z(1);
            return true;
        }
        throw new RuntimeException();
    }
}
