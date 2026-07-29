package o;

import android.graphics.Insets;

/* renamed from: o.Ys, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644Ys {
    public static final C0644Ys e = new C0644Ys(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C0644Ys(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static C0644Ys a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new C0644Ys(i, i2, i3, i4);
    }

    public static C0644Ys b(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return a(i, i2, i3, i4);
    }

    public final Insets c() {
        return AbstractC0618Xs.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0644Ys.class != obj.getClass()) {
            return false;
        }
        C0644Ys c0644Ys = (C0644Ys) obj;
        return this.d == c0644Ys.d && this.a == c0644Ys.a && this.c == c0644Ys.c && this.b == c0644Ys.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
