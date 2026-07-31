package com.five_corp.ad.internal.viewability;

import com.five_corp.ad.internal.ad.beacon.j;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class c {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public c(double d, double d2, double d3, double d4) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public static boolean a(double d, double d2) {
        return d2 <= 0.0d ? d > 0.0d : d2 >= 1.0d ? d == 1.0d : d >= d2;
    }

    public final String a() {
        double floor = Math.floor(this.a * 100.0d) / 100.0d;
        double floor2 = Math.floor(this.b * 100.0d) / 100.0d;
        return String.format(Locale.US, "MA: %.2f / %.2f, AC: %.2f / %.2f", Double.valueOf(floor), Double.valueOf(Math.floor(this.c * 100.0d) / 100.0d), Double.valueOf(floor2), Double.valueOf(Math.floor(this.d * 100.0d) / 100.0d));
    }

    public final boolean a(j jVar) {
        double d;
        int ordinal = jVar.b.ordinal();
        if (ordinal == 0) {
            int ordinal2 = jVar.a.ordinal();
            if (ordinal2 == 0) {
                d = this.a;
            } else {
                if (ordinal2 != 1) {
                    throw new RuntimeException();
                }
                d = this.c;
            }
        } else {
            if (ordinal != 1) {
                throw new RuntimeException();
            }
            int ordinal3 = jVar.a.ordinal();
            if (ordinal3 == 0) {
                d = this.b;
            } else {
                if (ordinal3 != 1) {
                    throw new RuntimeException();
                }
                d = this.d;
            }
        }
        return a(d, jVar.c);
    }
}
