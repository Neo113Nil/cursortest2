package o;

/* renamed from: o.fM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032fM {
    public static final C1032fM e = new C1032fM(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C1032fM(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final long a() {
        return PX.h((c() / 2.0f) + this.a, (b() / 2.0f) + this.b);
    }

    public final float b() {
        return this.d - this.b;
    }

    public final float c() {
        return this.c - this.a;
    }

    public final C1032fM d(float f, float f2) {
        return new C1032fM(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1032fM)) {
            return false;
        }
        C1032fM c1032fM = (C1032fM) obj;
        return Float.compare(this.a, c1032fM.a) == 0 && Float.compare(this.b, c1032fM.b) == 0 && Float.compare(this.c, c1032fM.c) == 0 && Float.compare(this.d, c1032fM.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + AbstractC1888sN.e(this.c, AbstractC1888sN.e(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC1052fg.X(this.a) + ", " + AbstractC1052fg.X(this.b) + ", " + AbstractC1052fg.X(this.c) + ", " + AbstractC1052fg.X(this.d) + ')';
    }
}
