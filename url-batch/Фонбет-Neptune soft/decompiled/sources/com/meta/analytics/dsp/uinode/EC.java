package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.google.common.base.Ascii;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* loaded from: assets/audience_network.dex */
public final class EC implements XV {
    public static byte[] A03;
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 75, Ascii.GS, 9, Ascii.EM, 2, 107, 47, 42, 63, 42, 107, 56, 34, 49, 46, 107, 38, 34, 56, 38, 42, 63, 40, 35, 113, 107, 0, 52, 36, 63, 5, 51, 51, Base64.padSymbol, 51, 36};
    }

    public EC(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static EC A00(long j, long j2, By by, C0470Hz c0470Hz) {
        int A0E;
        long j3 = j2;
        c0470Hz.A0Z(10);
        int numFrames = c0470Hz.A08();
        if (numFrames <= 0) {
            return null;
        }
        int sampleRate = by.A03;
        long A0F = IF.A0F(numFrames, (sampleRate >= 32000 ? 1152 : 576) * 1000000, sampleRate);
        int A0I = c0470Hz.A0I();
        int numFrames2 = c0470Hz.A0I();
        int A0I2 = c0470Hz.A0I();
        c0470Hz.A0Z(2);
        long j4 = j3 + by.A02;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int scale = 0; scale < A0I; scale++) {
            jArr[scale] = (scale * A0F) / A0I;
            jArr2[scale] = Math.max(j3, j4);
            switch (A0I2) {
                case 1:
                    A0E = c0470Hz.A0E();
                    break;
                case 2:
                    A0E = c0470Hz.A0I();
                    break;
                case 3:
                    A0E = c0470Hz.A0G();
                    break;
                case 4:
                    A0E = c0470Hz.A0H();
                    break;
                default:
                    return null;
            }
            j3 += A0E * numFrames2;
        }
        if (j != -1 && j != j3) {
            Log.w(A01(27, 10, 87), A01(2, 25, 74) + j + A01(0, 2, 106) + j3);
        }
        return new EC(jArr, jArr2, A0F);
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final C0 A7t(long j) {
        int A0B = IF.A0B(this.A02, j, true, true);
        C2 c2 = new C2(this.A02[A0B], this.A01[A0B]);
        if (c2.A01 < j) {
            int tableIndex = this.A02.length;
            if (A0B != tableIndex - 1) {
                int tableIndex2 = A0B + 1;
                long j2 = this.A02[tableIndex2];
                int tableIndex3 = A0B + 1;
                C2 nextSeekPoint = new C2(j2, this.A01[tableIndex3]);
                return new C0(c2, nextSeekPoint);
            }
        }
        return new C0(c2);
    }

    @Override // com.meta.analytics.dsp.uinode.XV
    public final long A88(long j) {
        return this.A02[IF.A0B(this.A01, j, true, true)];
    }

    @Override // com.meta.analytics.dsp.uinode.C1
    public final boolean A9I() {
        return true;
    }
}
