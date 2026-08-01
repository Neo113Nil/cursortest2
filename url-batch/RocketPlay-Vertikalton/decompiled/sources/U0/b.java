package U0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public final float f1224b;

    /* renamed from: a, reason: collision with root package name */
    public float f1223a = 20.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f1225c = 255;

    public b(float f2) {
        this.f1224b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f1223a, bVar.f1223a) == 0 && Float.compare(this.f1224b, bVar.f1224b) == 0 && Float.compare(8.0f, 8.0f) == 0 && this.f1225c == bVar.f1225c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1225c) + ((Float.hashCode(8.0f) + ((Float.hashCode(this.f1224b) + (Float.hashCode(this.f1223a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Ring(radius=" + this.f1223a + ", maxRadius=" + this.f1224b + ", speed=8.0, alpha=" + this.f1225c + ")";
    }
}
