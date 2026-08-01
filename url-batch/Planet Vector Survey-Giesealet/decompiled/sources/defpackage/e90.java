package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e90 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public e90(float f, float f2, float f3, int i, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e90.class == obj.getClass()) {
            e90 e90Var = (e90) obj;
            return this.c == e90Var.c && this.d == e90Var.d && this.b == e90Var.b && this.a == e90Var.a && this.e == e90Var.e;
        }
        return false;
    }

    public final int hashCode() {
        int t = (y6.t(this.b, y6.t(this.d, Float.floatToIntBits(this.c) * 31, 31), 31) + this.a) * 31;
        long j = this.e;
        return t + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
