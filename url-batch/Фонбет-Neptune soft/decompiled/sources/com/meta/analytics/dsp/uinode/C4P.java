package com.meta.analytics.dsp.uinode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.4P, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4P implements Runnable {
    public static Comparator<C4O> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<C4P> A07;
    public long A00;
    public long A01;
    public ArrayList<C0372Eb> A02 = new ArrayList<>();
    public ArrayList<C4O> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C4O>() { // from class: com.facebook.ads.redexgen.X.4N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C4O c4o, C4O c4o2) {
                if ((c4o.A03 == null) != (c4o2.A03 == null)) {
                    return c4o.A03 == null ? 1 : -1;
                }
                if (c4o.A04 != c4o2.A04) {
                    return c4o.A04 ? -1 : 1;
                }
                int i = c4o2.A02 - c4o.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = c4o.A00;
                int deltaViewVelocity = c4o2.A00;
                int i3 = i2 - deltaViewVelocity;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        };
    }

    private AnonymousClass56 A00(C0372Eb c0372Eb, int i, long j) {
        if (A08(c0372Eb, i)) {
            return null;
        }
        C01624w c01624w = c0372Eb.A0r;
        try {
            c0372Eb.A1K();
            AnonymousClass56 A0I = c01624w.A0I(i, false, j);
            if (A0I != null) {
                if (A0I.A0Y() && !A0I.A0Z()) {
                    c01624w.A0T(A0I.A0H);
                } else {
                    c01624w.A0Z(A0I, false);
                }
            }
            return A0I;
        } finally {
            c0372Eb.A1m(false);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x0078 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02() {
        C4O c4o;
        int i = this.A02.size();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C0372Eb c0372Eb = this.A02.get(i3);
            int viewCount = c0372Eb.getWindowVisibility();
            if (viewCount == 0) {
                c0372Eb.A02.A04(c0372Eb, false);
                int viewCount2 = c0372Eb.A02.A00;
                i2 += viewCount2;
            }
        }
        this.A03.ensureCapacity(i2);
        int i4 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int totalTaskCount = str.length();
        int viewCount3 = str2.length();
        if (totalTaskCount != viewCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i5 = 0; i5 < i; i5++) {
            C0372Eb c0372Eb2 = this.A02.get(i5);
            int viewCount4 = c0372Eb2.getWindowVisibility();
            if (viewCount4 == 0) {
                C0916Zp c0916Zp = c0372Eb2.A02;
                int viewCount5 = c0916Zp.A01;
                int abs = Math.abs(viewCount5);
                int viewCount6 = c0916Zp.A02;
                int abs2 = abs + Math.abs(viewCount6);
                for (int i6 = 0; i6 < viewCount * 2; i6 += 2) {
                    int viewCount7 = this.A03.size();
                    if (i4 >= viewCount7) {
                        c4o = new C4O();
                        this.A03.add(c4o);
                    } else {
                        c4o = this.A03.get(i4);
                    }
                    int totalTaskCount2 = i6 + 1;
                    int totalTaskIndex = c0916Zp.A03[totalTaskCount2];
                    c4o.A04 = totalTaskIndex <= abs2;
                    c4o.A02 = abs2;
                    c4o.A00 = totalTaskIndex;
                    c4o.A03 = c0372Eb2;
                    int totalTaskCount3 = c0916Zp.A03[i6];
                    c4o.A01 = totalTaskCount3;
                    i4++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A04(long j) {
        for (int i = 0; i < i; i++) {
            C4O task = this.A03.get(i);
            if (task.A03 == null) {
                return;
            }
            A06(task, j);
            task.A00();
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(C4O c4o, long j) {
        AnonymousClass56 A00 = A00(c4o.A03, c4o.A01, c4o.A04 ? Long.MAX_VALUE : j);
        if (A00 != null && A00.A09 != null && A00.A0Y() && !A00.A0Z()) {
            A07(A00.A09.get(), j);
        }
    }

    private void A07(C0372Eb c0372Eb, long j) {
        if (c0372Eb == null) {
            return;
        }
        if (c0372Eb.A0C) {
            C4C c4c = c0372Eb.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c4c.A06() != 0) {
                    c0372Eb.A1N();
                }
            }
            throw new RuntimeException();
        }
        C0916Zp c0916Zp = c0372Eb.A02;
        c0916Zp.A04(c0372Eb, true);
        if (c0916Zp.A00 != 0) {
            try {
                AbstractC01062q.A01(A01(0, 18, 7));
                c0372Eb.A0s.A05(c0372Eb.A04);
                int i = 0;
                while (true) {
                    int i2 = c0916Zp.A00 * 2;
                    int i3 = A06[6].charAt(8);
                    if (i3 == 73) {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i < i2) {
                        A00(c0372Eb, c0916Zp.A03[i], j);
                        i += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                AbstractC01062q.A00();
            }
        }
    }

    public static boolean A08(C0372Eb c0372Eb, int i) {
        int A062 = c0372Eb.A01.A06();
        for (int i2 = 0; i2 < A062; i2++) {
            AnonymousClass56 A0F = C0372Eb.A0F(c0372Eb.A01.A0A(i2));
            int childCount = A0F.A03;
            if (childCount == i && !A0F.A0Z()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C0372Eb c0372Eb) {
        this.A02.add(c0372Eb);
    }

    public final void A0A(C0372Eb c0372Eb) {
        this.A02.remove(c0372Eb);
    }

    public final void A0B(C0372Eb c0372Eb, int i, int i2) {
        if (c0372Eb.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = c0372Eb.getNanoTime();
            c0372Eb.post(this);
        }
        c0372Eb.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC01062q.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C0372Eb c0372Eb = this.A02.get(i);
                if (c0372Eb.getWindowVisibility() == 0) {
                    j = Math.max(c0372Eb.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                AbstractC01062q.A00();
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(j) + this.A00);
        } finally {
            this.A01 = 0L;
            AbstractC01062q.A00();
        }
    }
}
