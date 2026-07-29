package o;

import android.graphics.Rect;

/* renamed from: o.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2137w8 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C2137w8(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException(AbstractC1888sN.g(i, i3, "Left must be less than or equal to right, left: ", ", right: ").toString());
        }
        if (i2 > i4) {
            throw new IllegalArgumentException(AbstractC1888sN.g(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: ").toString());
        }
    }

    public final Rect a() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2137w8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        C2137w8 c2137w8 = (C2137w8) obj;
        return this.a == c2137w8.a && this.b == c2137w8.b && this.c == c2137w8.c && this.d == c2137w8.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return C2137w8.class.getSimpleName() + " { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }
}
