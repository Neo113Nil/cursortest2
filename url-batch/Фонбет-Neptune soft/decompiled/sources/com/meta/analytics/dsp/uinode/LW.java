package com.meta.analytics.dsp.uinode;

import android.content.Context;
import com.google.common.base.Ascii;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public abstract class LW {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, Ascii.VT, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, Ascii.ESC, 72, 79, 90, 88, 80, Ascii.ESC, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th) {
        int A0I = C0478Ih.A0I(context);
        int maxStacktraceLines = C0478Ih.A02(context);
        return A06(th, A0I, maxStacktraceLines, C0478Ih.A1G(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th, int i, int i2, boolean z) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C0783Uh c0783Uh = new C0783Uh();
            LU lu = c0783Uh;
            if (i2 >= 0) {
                lu = new C0781Uf(lu, i2);
            }
            if (i >= 0) {
                lu = new C0780Ue(lu, i, i);
            }
            if (z) {
                lu = new C0782Ug(lu);
            }
            C0784Ui c0784Ui = new C0784Ui(c0783Uh, 1, lu);
            th.printStackTrace(new PrintWriter(new LV(c0784Ui)));
            c0784Ui.flush();
            return c0783Uh.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(LT lt) {
        String middle = lt.A02();
        if (middle == null) {
            return false;
        }
        if (A0A(middle)) {
            return true;
        }
        Iterator<String> it = lt.A01().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = lt.A00().iterator();
        while (it2.hasNext()) {
            if (A0A(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
