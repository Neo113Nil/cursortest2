package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Y9 implements InterfaceC02749r {
    public static byte[] A0A;
    public static String[] A0B = {"QBw2naITCC87BBmeZEHB", "QG9qcoN67OZ9HCiBeCwQ37yZ8k9VzRIx", "huClURZcVSvs210svchTpygB", "SPjUxwmyMxCkovVHB3ukUPObWP0MyL9L", "Qo3gDbJmZiOUOvD4YrLGADsp8gVNY68y", "aCbITSFANaeoynFt6tlPTZT3Ud0BkJzi", "LC42BZreN0Trrj0tndAjNl8pur2kDdxK", "yIqlj0SUGgDzqSotNJk32MbE6gj6YGfF"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final W2 A07;
    public final I3 A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{-97, -30, -32, -19, -19, -18, -13, -97, -31, -28, -97, -21, -28, -14, -14, -97, -13, -25, -32, -19, -97, -55, -27, -8, -23, -23, -24, -11, -55, -14, -11, -45, -17, -28, -4, -27, -28, -26, -18, -60, -23, -9, -24, -11, -43, -24, -27, -8, -23, -23, -24, -11, -48, -10, 3, Ascii.SYN, 7, 7, 6, 19, -25, 16, 19, -15, Ascii.CR, 2, Ascii.SUB, 3, 2, 4, Ascii.FF, -18, Ascii.DC4, Ascii.EM, Ascii.CR, 36, -18, 33, Ascii.DC2, Ascii.DC2, 17, Ascii.RS, -7, Ascii.US, -64, -68, -63, -107, -56, -71, -71, -72, -59, -96, -58};
    }

    static {
        A02();
    }

    public Y9() {
        this(new W2(true, 65536));
    }

    @Deprecated
    public Y9(W2 w2) {
        this(w2, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public Y9(W2 w2, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(w2, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public Y9(W2 w2, int i, int i2, int i3, int i4, int i5, boolean z, I3 i32) {
        String A01 = A01(54, 19, 78);
        String A012 = A01(21, 1, 70);
        A03(i3, 0, A01, A012);
        String A013 = A01(22, 32, 48);
        A03(i4, 0, A013, A012);
        String A014 = A01(84, 11, 0);
        A03(i, i3, A014, A01);
        A03(i, i4, A014, A013);
        A03(i2, i, A01(73, 11, 89), A014);
        this.A07 = w2;
        this.A06 = i * 1000;
        this.A05 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A03 = i4 * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = i32;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int A00(Y5[] y5Arr, C0427Gh c0427Gh) {
        int i = 0;
        for (int i2 = 0; i2 < targetBufferSize; i2++) {
            if (c0427Gh.A00(i2) != null) {
                int targetBufferSize = y5Arr[i2].A8C();
                i += IF.A01(targetBufferSize);
            }
        }
        return i;
    }

    public static void A03(int i, int i2, String str, String str2) {
        AbstractC0445Ha.A05(i >= i2, str + A01(0, 21, 44) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        I3 i3 = this.A08;
        if (i3 != null && this.A01) {
            i3.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final W2 A60() {
        return this.A07;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final long A65() {
        return 0L;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final void ACr() {
        A04(true);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final void ADF() {
        A04(true);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final void ADN(Y5[] y5Arr, TrackGroupArray trackGroupArray, C0427Gh c0427Gh) {
        int i = this.A02;
        if (i == -1) {
            i = A00(y5Arr, c0427Gh);
        }
        this.A00 = i;
        this.A07.A04(i);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final boolean AFO() {
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final boolean AGI(long j, float f) {
        boolean targetBufferSizeReached;
        boolean z = true;
        boolean z2 = this.A07.A02() >= this.A00;
        boolean z3 = this.A01;
        long j2 = this.A06;
        if (f > 1.0f) {
            j2 = Math.min(IF.A0C(j2, f), this.A05);
        }
        if (j < j2) {
            if (!this.A09 && z2) {
                z = false;
            }
            this.A01 = z;
        } else if (j > this.A05 || z2) {
            this.A01 = false;
        }
        I3 i3 = this.A08;
        if (A0B[0].length() != 20) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[1] = "QKQzs8A5eNnCMvZO6Czn4VC5jQwn3nPR";
        strArr[4] = "QpEe5JzrMZm1KKJ9dYBmwnmG628Fesko";
        if (i3 != null && (targetBufferSizeReached = this.A01) != z3) {
            if (targetBufferSizeReached) {
                i3.A00(0);
            } else {
                i3.A03(0);
            }
        }
        return this.A01;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final boolean AGL(long j, float f, boolean z) {
        long A0D = IF.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        return j2 <= 0 || A0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC02749r
    public final void onPrepared() {
        A04(false);
    }
}
