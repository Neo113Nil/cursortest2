package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6N {
    public static C6O A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C6N.class) {
            if (A00 == null) {
                return;
            }
            C8B c8b = new C8B(A00.AFE());
            c8b.A05(1);
            C0888Ym A002 = AbstractC02167e.A00();
            if (A002 != null) {
                A002.A07().A9a(A00(0, 9, 109), 3401, c8b);
            }
            A00.reset();
        }
    }

    public static void A03(final long j) {
        if (j > 0) {
            A00 = new C0898Yw();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.6P
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (KL.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (Throwable th) {
                                KL.A00(th, this);
                                return;
                            }
                        } catch (InterruptedException unused) {
                        }
                        C6N.A01();
                    }
                }
            };
        }
    }
}
