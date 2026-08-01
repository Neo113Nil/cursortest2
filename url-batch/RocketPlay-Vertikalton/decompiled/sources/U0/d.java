package U0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f1231a;

    /* renamed from: b, reason: collision with root package name */
    public float f1232b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1233c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1234e;

    /* renamed from: f, reason: collision with root package name */
    public final float f1235f;

    public d(float f2, float f3, float f4, float f5, float f6, int i) {
        this.f1231a = f2;
        this.f1232b = f3;
        this.f1233c = f4;
        this.d = f5;
        this.f1234e = i;
        this.f1235f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f1231a, dVar.f1231a) == 0 && Float.compare(this.f1232b, dVar.f1232b) == 0 && Float.compare(this.f1233c, dVar.f1233c) == 0 && Float.compare(this.d, dVar.d) == 0 && this.f1234e == dVar.f1234e && Float.compare(this.f1235f, dVar.f1235f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1235f) + ((Integer.hashCode(this.f1234e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.f1233c) + ((Float.hashCode(this.f1232b) + (Float.hashCode(this.f1231a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Particle(x=" + this.f1231a + ", y=" + this.f1232b + ", vx=" + this.f1233c + ", vy=" + this.d + ", color=" + this.f1234e + ", size=" + this.f1235f + ")";
    }
}
