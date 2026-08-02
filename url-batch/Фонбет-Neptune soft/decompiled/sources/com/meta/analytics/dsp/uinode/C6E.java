package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.6E, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C6E {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C6C> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C6C A00() {
        C6C c6c = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C6C c6c2 = c6c;
            if (c6c2 == null) {
                C6C A002 = C6C.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c6c2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6C A01(C02177f c02177f, C6C c6c) {
        if (c6c != null) {
            try {
            } catch (Throwable t) {
                c02177f.A07().A9a(A04(12, 7, 6), C8A.A1Q, new C8B(t));
            }
        }
        return C6K.A00(c02177f);
        return c6c;
    }

    public static C6C A02(C02177f c02177f, C6C c6c, C6D c6d) {
        C6F c6f = null;
        try {
            if (AbstractC0477Ig.A06(c02177f) && (c6c == null || TextUtils.isEmpty(c6c.A03()))) {
                c6f = C6G.A00(c02177f.getContentResolver());
            }
        } catch (Throwable th) {
            c02177f.A07().A9a(A04(12, 7, 6), C8A.A1S, new C8B(th));
        }
        if (c6f != null && c6f.A01 != null) {
            A03.set(c6f.A01);
            c6d.A05(c6f.A01);
        }
        if (c6c == null && c6f != null && !TextUtils.isEmpty(c6f.A00)) {
            return new C6C(c6f.A00, c6f.A02, C6B.A05);
        }
        return c6c;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C6D c6d) {
        A02.set(c6d.A02());
        A03.set(c6d.A03());
    }

    public static void A07(C02177f c02177f) {
        long j;
        C6C A022;
        try {
            C6D c6d = new C6D(c02177f);
            A06(c6d);
            if (A08()) {
                return;
            }
            AtomicReference<C6C> atomicReference = A02;
            C6C c6c = atomicReference.get();
            if (c6c != null && !TextUtils.isEmpty(c6c.A03())) {
                j = c6c.A01();
            } else {
                j = -1;
            }
            if (j > 0) {
                long cacheTS = System.currentTimeMillis();
                if (cacheTS - j < AbstractC0477Ig.A00(c02177f)) {
                    return;
                }
            }
            if (AbstractC0477Ig.A07(c02177f)) {
                A022 = A01(c02177f, A02(c02177f, null, c6d));
            } else {
                A022 = A02(c02177f, A01(c02177f, null), c6d);
            }
            if (A022 != null && !TextUtils.isEmpty(A022.A03())) {
                atomicReference.set(A022);
                c6d.A04(A022);
            }
        } catch (Throwable t) {
            c02177f.A07().A9a(A04(12, 7, 6), C8A.A1R, new C8B(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = L0.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            boolean updated2 = L0.A05(A04);
            if (updated2) {
                A03.set(L0.A01(A04));
                z = true;
            }
        }
        boolean A042 = L0.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return z;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return z;
            }
        }
        String A043 = A04(19, 13, 79);
        boolean updated3 = L0.A05(A043);
        if (updated3) {
            String A012 = L0.A01(A043);
            AtomicReference<C6C> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C6C(A012, false, C6B.A04));
            return true;
        }
        return z;
    }
}
