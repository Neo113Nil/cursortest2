package U0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1226a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1227b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1228c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1229e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1230f;

    public c(float f2, float f3, float f4, float f5, float f6, int i) {
        this.f1226a = f2;
        this.f1227b = f3;
        this.f1228c = f4;
        this.d = f5;
        this.f1229e = f6;
        this.f1230f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f1226a, cVar.f1226a) == 0 && Float.compare(this.f1227b, cVar.f1227b) == 0 && Float.compare(this.f1228c, cVar.f1228c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.f1229e, cVar.f1229e) == 0 && this.f1230f == cVar.f1230f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1230f) + ((Float.hashCode(this.f1229e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.f1228c) + ((Float.hashCode(this.f1227b) + (Float.hashCode(this.f1226a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Star(x=" + this.f1226a + ", y=" + this.f1227b + ", radius=" + this.f1228c + ", speed=" + this.d + ", phase=" + this.f1229e + ", color=" + this.f1230f + ")";
    }
}
