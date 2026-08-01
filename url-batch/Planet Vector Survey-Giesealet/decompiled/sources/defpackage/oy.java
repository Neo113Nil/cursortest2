package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oy {
    public static final oy e = new oy(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public oy(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static oy a(oy oyVar, oy oyVar2) {
        return c(Math.max(oyVar.a, oyVar2.a), Math.max(oyVar.b, oyVar2.b), Math.max(oyVar.c, oyVar2.c), Math.max(oyVar.d, oyVar2.d));
    }

    public static oy b(oy oyVar, oy oyVar2) {
        return c(Math.min(oyVar.a, oyVar2.a), Math.min(oyVar.b, oyVar2.b), Math.min(oyVar.c, oyVar2.c), Math.min(oyVar.d, oyVar2.d));
    }

    public static oy c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new oy(i, i2, i3, i4);
    }

    public static oy d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final Insets e() {
        return zi.h(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oy.class != obj.getClass()) {
            return false;
        }
        oy oyVar = (oy) obj;
        return this.d == oyVar.d && this.a == oyVar.a && this.c == oyVar.c && this.b == oyVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
