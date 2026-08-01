package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ut0 extends nz {
    public final float o;
    public final float p;
    public final int q;
    public final int r;

    public ut0(float f, float f2, int i, int i2, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.o = f;
        this.p = f2;
        this.q = i;
        this.r = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut0)) {
            return false;
        }
        ut0 ut0Var = (ut0) obj;
        return this.o == ut0Var.o && this.p == ut0Var.p && this.q == ut0Var.q && this.r == ut0Var.r;
    }

    public final int hashCode() {
        return (((y6.t(this.p, Float.floatToIntBits(this.o) * 31, 31) + this.q) * 31) + this.r) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.o);
        sb.append(", miter=");
        sb.append(this.p);
        sb.append(", cap=");
        String str = "Unknown";
        int i = this.q;
        sb.append((Object) (i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.r;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
