package com.meta.analytics.dsp.uinode;

import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.1t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC00831t {
    public static byte[] A00;
    public static String[] A01 = {"SZD1gnuwYC0ZDT5XCpN5wGg04vpvlXtv", "38Pkme0hctlwOycqXgIFmSt4EwGMsPu", "PZ5YSJhnqoOlFoXIJ", "MKZOkal4amZt32sY0duMnYWyMVrdvNv7", "PmMqC", "MtvBWYcgrX5nN2Ecp9gb0xGXALHF8kJ8", "836OSMulKGxVhnpon", "Ud77gBKi5ZcurXFgX0oEk2YfAMQgAhDP"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Ascii.EM, 95, 67, 90, 91, 103, 96, 122, 107, 124, 125, 122, 103, 122, 103, 111, 98, 3, Ascii.DC4, 6, 16, 3, Ascii.NAK, Ascii.DC4, Ascii.NAK, 46, 7, Ascii.CAN, Ascii.NAK, Ascii.DC4, Ascii.RS};
    }

    static {
        A01();
    }

    /* JADX WARN: Incorrect condition in loop: B:10:0x00d7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A02(C0889Yn c0889Yn, C01946c c01946c, FS fs) {
        c01946c.A0c(new C01926a(fs.A10().A01(), C0660Po.A04, C0660Po.A04, fs.A0S(), A00(17, 14, 99)));
        boolean A0m = fs.A0m();
        if (A0m) {
            C6Y c6y = new C6Y(fs.A0M(), fs.A0S(), A00(17, 14, 99));
            c6y.A04 = true;
            c6y.A03 = A00(0, 5, 37);
            c01946c.A0X(c6y);
        }
        boolean isDSL = C0694Qw.A03();
        boolean A2R = C0478Ih.A2R(c0889Yn, isDSL);
        C6Y c6y2 = new C6Y(fs.A0x().A0D().A08(), fs.A0S(), A00(17, 14, 99), fs.A0x().A0D().A05());
        if (A0m && !A2R) {
            c01946c.A0X(c6y2);
        } else {
            c01946c.A0a(c6y2);
        }
        c01946c.A0c(new C01926a(fs.A0x().A0D().A07(), AbstractC00781o.A00(fs.A0x().A0D()), AbstractC00781o.A01(fs.A0x().A0D()), fs.A0S(), A00(17, 14, 99)));
        Iterator<String> it = fs.A0x().A0G().A01().iterator();
        while (isDSL) {
            String url = it.next();
            c01946c.A0c(new C01926a(url, -1, -1, fs.A0S(), A00(17, 14, 99)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0.A0D().A08()) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a6, code lost:
    
        new com.meta.analytics.dsp.uinode.C6Y(r0.A0D().A08(), r15.A0S(), A00(5, 12, 28), r0.A0D().A05()).A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00cb, code lost:
    
        r7 = r7 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A03(C0889Yn c0889Yn, C01946c c01946c, FS fs) {
        int i = 0;
        Iterator<C1G> it = fs.A14().iterator();
        while (it.hasNext()) {
            C1G next = it.next();
            C01926a c01926a = new C01926a(next.A0D().A07(), AbstractC00781o.A00(next.A0D()), AbstractC00781o.A01(next.A0D()), fs.A0S(), A00(5, 12, 28));
            if (i == 0) {
                c01946c.A0b(c01926a);
            } else {
                c01946c.A0c(c01926a);
            }
            Iterator<String> it2 = next.A0G().A01().iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                String[] strArr = A01;
                if (strArr[2].length() == strArr[6].length()) {
                    String[] strArr2 = A01;
                    strArr2[0] = "d4OGgqInyGax2uUwuJ6rocUy9OK0g6RJ";
                    strArr2[7] = "8ZRzgNChvbJeQD0ONiajCC1PQNrhJWUQ";
                    if (!hasNext) {
                        break;
                    } else {
                        c01946c.A0c(new C01926a(it2.next(), -1, -1, fs.A0S(), A00(5, 12, 28)));
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }
}
