package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public abstract class HQ {
    public static String[] A00 = {"QVkvGuTrNYCOXAoNAePTggpZ9p9y8rjH", "Ru98bprrD7b3UUfLrlKs", "", "dJgVNsDePsDRNqW", "8CeCwhAARX5BeZctdCHITAez339E1kKv", "TdcchyCe9I3Btqth6iKX4VQ7acLjRTHE", "dxVA2OdEqxN0v6bZFx4Cf7LzvY6ZoBAr", "aJerxmZYtdmBHI5cIDnwKt2ezc6XXR2j"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x009e: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:44:0x009e */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ae: INVOKE (r3 I:com.facebook.ads.redexgen.X.Gu) STATIC call: com.facebook.ads.redexgen.X.IF.A0W(com.facebook.ads.redexgen.X.Gu):void A[MD:(com.facebook.ads.redexgen.X.Gu):void (m)], block:B:46:0x00ae */
    public static long A00(C0444Gy c0444Gy, long j, long j2, InterfaceC0440Gu interfaceC0440Gu, byte[] bArr, I3 i3, int i, HP hp) throws IOException, InterruptedException {
        InterfaceC0440Gu interfaceC0440Gu2;
        while (true) {
            if (i3 != null) {
                i3.A01(i);
            }
            try {
                break;
            } catch (I2 unused) {
            } finally {
                IF.A0W(interfaceC0440Gu2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        C0444Gy c0444Gy2 = new C0444Gy(c0444Gy.A04, c0444Gy.A06, j, (c0444Gy.A03 + j) - c0444Gy.A01, -1L, c0444Gy.A05, c0444Gy.A00 | 2);
        long ADl = interfaceC0440Gu2.ADl(c0444Gy2);
        if (hp.A01 == -1 && ADl != -1) {
            hp.A01 = c0444Gy2.A01 + ADl;
        }
        long j3 = 0;
        while (true) {
            if (j3 == j2) {
                break;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int read = interfaceC0440Gu2.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
            if (A00[3].length() != 15) {
                throw new RuntimeException();
            }
            A00[1] = "Mr4dmhY4u";
            if (read != -1) {
                j3 += read;
                hp.A02 += read;
            } else if (hp.A01 == -1) {
                hp.A01 = c0444Gy2.A01 + j3;
            }
        }
        return j3;
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C0444Gy c0444Gy) {
        if (c0444Gy.A05 != null) {
            return c0444Gy.A05;
        }
        Uri uri = c0444Gy.A04;
        if (A00[0].charAt(11) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[5] = "cu8QQJDviMrw4mI2sOy5Vu7yKrvbPHoQ";
        strArr[7] = "0ihZqD29ZbZOvC3sCo5KdBScvHoXIGQ7";
        return A01(uri);
    }

    public static void A03(C0444Gy c0444Gy, HK hk, C0811Vk c0811Vk, byte[] bArr, I3 i3, int i, HP hp, AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        long start;
        HP hp2 = hp;
        AbstractC0445Ha.A01(c0811Vk);
        AbstractC0445Ha.A01(bArr);
        if (hp2 != null) {
            A04(c0444Gy, hk, hp2);
        } else {
            hp2 = new HP();
        }
        String A02 = A02(c0444Gy);
        long j = c0444Gy.A01;
        long start2 = c0444Gy.A02;
        if (start2 != -1) {
            start = c0444Gy.A02;
        } else {
            start = hk.A6W(A02);
        }
        while (true) {
            long j2 = 0;
            if (start != 0) {
                if (atomicBoolean == null || !atomicBoolean.get()) {
                    long A6G = hk.A6G(A02, j, start != -1 ? start : Long.MAX_VALUE);
                    if (A6G <= 0) {
                        long j3 = -A6G;
                        A6G = j3;
                        if (A00(c0444Gy, j, j3, c0811Vk, bArr, i3, i, hp2) < A6G) {
                            if (!z || start == -1) {
                                return;
                            } else {
                                throw new EOFException();
                            }
                        }
                    }
                    j += A6G;
                    if (start != -1) {
                        j2 = A6G;
                    }
                    start -= j2;
                } else {
                    throw new InterruptedException();
                }
            } else {
                return;
            }
        }
    }

    public static void A04(C0444Gy c0444Gy, HK hk, HP hp) {
        long left;
        String A02 = A02(c0444Gy);
        long j = c0444Gy.A01;
        if (c0444Gy.A02 != -1) {
            left = c0444Gy.A02;
        } else {
            left = hk.A6W(A02);
        }
        hp.A01 = left;
        hp.A00 = 0L;
        hp.A02 = 0L;
        while (left != 0) {
            long A6G = hk.A6G(A02, j, left != -1 ? left : Long.MAX_VALUE);
            if (A6G > 0) {
                hp.A00 += A6G;
            } else {
                A6G = -A6G;
                if (A6G == Long.MAX_VALUE) {
                    return;
                }
            }
            j += A6G;
            if (left == -1) {
                A6G = 0;
            }
            left -= A6G;
        }
    }

    public static void A05(HK hk, String str) {
        Iterator<HO> it = hk.A6H(str).iterator();
        while (it.hasNext()) {
            try {
                hk.AF9(it.next());
            } catch (HI unused) {
            }
        }
    }
}
