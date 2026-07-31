package yads;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class ht2 extends y53 {
    public long b;
    public long[] c;
    public long[] d;

    public ht2() {
        super(new hl0());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Serializable a(int i, xb2 xb2Var) {
        if (i == 8) {
            return a(xb2Var);
        }
        if (i == 10) {
            int n = xb2Var.n();
            ArrayList arrayList = new ArrayList(n);
            for (int i2 = 0; i2 < n; i2++) {
                Serializable a = a(xb2Var.k(), xb2Var);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
        if (i == 11) {
            Date date = new Date((long) Double.longBitsToDouble(xb2Var.g()));
            xb2Var.e(xb2Var.b + 2);
            return date;
        }
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(xb2Var.g()));
        }
        if (i == 1) {
            return Boolean.valueOf(xb2Var.k() == 1);
        }
        if (i == 2) {
            return b(xb2Var);
        }
        if (i != 3) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String b = b(xb2Var);
            int k = xb2Var.k();
            if (k == 9) {
                return hashMap;
            }
            Serializable a2 = a(k, xb2Var);
            if (a2 != null) {
                hashMap.put(b, a2);
            }
        }
    }

    public static String b(xb2 xb2Var) {
        int p = xb2Var.p();
        int i = xb2Var.b;
        xb2Var.e(i + p);
        return new String(xb2Var.a, i, p);
    }

    public static HashMap a(xb2 xb2Var) {
        int n = xb2Var.n();
        HashMap hashMap = new HashMap(n);
        for (int i = 0; i < n; i++) {
            String b = b(xb2Var);
            Serializable a = a(xb2Var.k(), xb2Var);
            if (a != null) {
                hashMap.put(b, a);
            }
        }
        return hashMap;
    }
}
