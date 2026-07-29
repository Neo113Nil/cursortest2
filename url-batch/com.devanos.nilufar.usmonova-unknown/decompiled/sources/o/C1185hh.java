package o;

/* renamed from: o.hh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185hh implements InterfaceC1119gh {
    public final float b;
    public final float c;

    public C1185hh(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // o.InterfaceC1119gh
    public final float c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1185hh)) {
            return false;
        }
        C1185hh c1185hh = (C1185hh) obj;
        return Float.compare(this.b, c1185hh.b) == 0 && Float.compare(this.c, c1185hh.c) == 0;
    }

    @Override // o.InterfaceC1119gh
    public final float f() {
        return this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.b + ", fontScale=" + this.c + ')';
    }
}
