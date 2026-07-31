package com.inmobi.media;

/* loaded from: classes11.dex */
public final class N6 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public N6(float f, float f2, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N6)) {
            return false;
        }
        N6 n6 = (N6) obj;
        return Float.compare(this.a, n6.a) == 0 && Float.compare(this.b, n6.b) == 0 && this.c == n6.c && this.d == n6.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Ai.a(this.c, (Float.hashCode(this.b) + (Float.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureRectangle(x=" + this.a + ", y=" + this.b + ", width=" + this.c + ", height=" + this.d + ")";
    }
}
