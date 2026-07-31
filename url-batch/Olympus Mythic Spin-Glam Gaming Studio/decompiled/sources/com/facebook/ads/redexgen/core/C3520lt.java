package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3520lt extends AbstractC2374Jb {
    public static byte[] A05;
    public static String[] A06 = {"uV3egKqPt", "vbtXlOI", "gip2ILD7nBGTUOP5yb7zSULibNYEk", "ypzju5tbq0Qdtgd67o3qNaulkzBfCJSX", "gCa1Tkio4U0hXnRqOcWVPONwWAtrpMS5", "m", "OXoEHzgO5FTzqO33f", "i"};
    public int A00;
    public C2329Hh A01;
    public C2331Hj A02;
    public C2375Jc A03;
    public boolean A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C2375Jc A02(C20254v c20254v) throws IOException {
        if (this.A02 == null) {
            this.A02 = AbstractC2332Hk.A06(c20254v);
            return null;
        }
        if (this.A01 == null) {
            this.A01 = AbstractC2332Hk.A04(c20254v);
            return null;
        }
        C2331Hj c2331Hj = this.A02;
        C2329Hh c2329Hh = this.A01;
        byte[] bArr = new byte[c20254v.A0A()];
        System.arraycopy(c20254v.A0l(), 0, bArr, 0, c20254v.A0A());
        return new C2375Jc(c2331Hj, c2329Hh, bArr, AbstractC2332Hk.A0D(c20254v, c2331Hj.A05), AbstractC2332Hk.A00(r6.length - 1));
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 29);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-108, -88, -105, -100, -94, 98, -87, -94, -91, -107, -100, -90};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C2375Jc c2375Jc) {
        if (!c2375Jc.A04[A00(b, c2375Jc.A00, 1)].A03) {
            int modeNumber = c2375Jc.A02.A03;
            return modeNumber;
        }
        int modeNumber2 = c2375Jc.A02.A04;
        return modeNumber2;
    }

    public static void A05(C20254v c20254v, long j) {
        if (c20254v.A08() < c20254v.A0A() + 4) {
            c20254v.A0i(Arrays.copyOf(c20254v.A0l(), c20254v.A0A() + 4));
        } else {
            c20254v.A0e(c20254v.A0A() + 4);
        }
        byte[] A0l = c20254v.A0l();
        A0l[c20254v.A0A() - 4] = (byte) (j & 255);
        A0l[c20254v.A0A() - 3] = (byte) ((j >>> 8) & 255);
        A0l[c20254v.A0A() - 2] = (byte) ((j >>> 16) & 255);
        A0l[c20254v.A0A() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C20254v c20254v) {
        try {
            return AbstractC2332Hk.A0C(1, c20254v, true);
        } catch (C3K unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2374Jb
    public final long A09(C20254v c20254v) {
        int i = 0;
        if ((c20254v.A0l()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c20254v.A0l()[0];
        if (A06[4].charAt(1) != 'C') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[0] = "17tCp0Qcd";
        strArr[6] = "uqZ30DdcDRhFwj0kQ";
        int samplesInPacket = A01(b, (C2375Jc) AbstractC20023y.A02(this.A03));
        if (this.A04) {
            int packetBlockSize = this.A00;
            i = (packetBlockSize + samplesInPacket) / 4;
        }
        A05(c20254v, i);
        this.A04 = true;
        this.A00 = samplesInPacket;
        return i;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2374Jb
    public final void A0A(long j) {
        super.A0A(j);
        this.A04 = j != 0;
        this.A00 = this.A02 != null ? this.A02.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2374Jb
    public final void A0B(boolean z) {
        super.A0B(z);
        if (z) {
            this.A03 = null;
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2374Jb
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean A0C(C20254v c20254v, long j, C2373Ja c2373Ja) throws IOException {
        if (this.A03 != null) {
            AbstractC20023y.A01(c2373Ja.A00);
            return false;
        }
        this.A03 = A02(c20254v);
        if (this.A03 == null) {
            return true;
        }
        C2375Jc c2375Jc = this.A03;
        C2331Hj c2331Hj = c2375Jc.A02;
        ArrayList<byte[]> codecInitializationData = new ArrayList<>();
        codecInitializationData.add(c2331Hj.A09);
        codecInitializationData.add(c2375Jc.A03);
        c2373Ja.A00 = new C19692p().A11(A03(0, 12, 22)).A0a(c2331Hj.A02).A0j(c2331Hj.A00).A0b(c2331Hj.A05).A0m(c2331Hj.A06).A12(codecInitializationData).A0v(AbstractC2332Hk.A02(MetaExoPlayerCustomizedCollections.A02(c2375Jc.A01.A02))).A14();
        return true;
    }
}
