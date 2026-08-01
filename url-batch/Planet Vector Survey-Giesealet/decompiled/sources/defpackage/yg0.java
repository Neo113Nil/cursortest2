package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yg0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public yg0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg0)) {
            return false;
        }
        yg0 yg0Var = (yg0) obj;
        return vg0.a(this.a, yg0Var.a) && this.b == yg0Var.b && ra0.b(this.c, yg0Var.c) && ra0.b(this.d, yg0Var.d) && this.e == yg0Var.e && Float.compare(this.f, yg0Var.f) == 0 && this.g == yg0Var.g && this.h == yg0Var.h && this.i.equals(yg0Var.i) && ra0.b(this.j, yg0Var.j) && ra0.b(this.k, yg0Var.k);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ra0.f(this.k) + ((ra0.f(this.j) + ((this.i.hashCode() + ((((y6.t(this.f, (((ra0.f(this.d) + ((ra0.f(this.c) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31, 31) + this.g) * 31) + (this.h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) vg0.b(this.a));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) ra0.j(this.c));
        sb.append(", position=");
        sb.append((Object) ra0.j(this.d));
        sb.append(", down=");
        sb.append(this.e);
        sb.append(", pressure=");
        sb.append(this.f);
        sb.append(", type=");
        int i = this.g;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.h);
        sb.append(", historical=");
        sb.append(this.i);
        sb.append(", scrollDelta=");
        sb.append((Object) ra0.j(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) ra0.j(this.k));
        sb.append(')');
        return sb.toString();
    }
}
