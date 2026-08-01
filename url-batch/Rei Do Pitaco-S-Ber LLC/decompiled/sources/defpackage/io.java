package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class io {
    public static final io e = new io(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public io(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static io a(io ioVar, io ioVar2) {
        return c(Math.max(ioVar.a, ioVar2.a), Math.max(ioVar.b, ioVar2.b), Math.max(ioVar.c, ioVar2.c), Math.max(ioVar.d, ioVar2.d));
    }

    public static io b(io ioVar, io ioVar2) {
        return c(Math.min(ioVar.a, ioVar2.a), Math.min(ioVar.b, ioVar2.b), Math.min(ioVar.c, ioVar2.c), Math.min(ioVar.d, ioVar2.d));
    }

    public static io c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new io(i, i2, i3, i4);
    }

    public static io d(Insets insets) {
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
        return b6.c(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io.class != obj.getClass()) {
            return false;
        }
        io ioVar = (io) obj;
        return this.d == ioVar.d && this.a == ioVar.a && this.c == ioVar.c && this.b == ioVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
