package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class nu {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public nu(int i, float f, float f2, float f3, long j) {
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
        if (obj != null && nu.class == obj.getClass()) {
            nu nuVar = (nu) obj;
            return this.c == nuVar.c && this.d == nuVar.d && this.b == nuVar.b && this.a == nuVar.a && this.e == nuVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + ((Integer.hashCode(this.a) + ((Float.hashCode(this.b) + ((Float.hashCode(this.d) + (Float.hashCode(this.c) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
