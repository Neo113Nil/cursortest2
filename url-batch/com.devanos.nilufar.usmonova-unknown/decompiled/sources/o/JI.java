package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class JI {
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

    public JI(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
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
        if (obj instanceof JI) {
            JI ji = (JI) obj;
            if (this.a == ji.a && this.b == ji.b && BF.a(this.c, ji.c) && BF.a(this.d, ji.d) && this.e == ji.e && Float.compare(this.f, ji.f) == 0 && this.g == ji.g && this.h == ji.h && this.i.equals(ji.i) && BF.a(this.j, ji.j) && BF.a(this.k, ji.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + ((Long.hashCode(this.j) + ((this.i.hashCode() + ((Boolean.hashCode(this.h) + ((Integer.hashCode(this.g) + AbstractC1888sN.e(this.f, (Boolean.hashCode(this.e) + ((Long.hashCode(this.d) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.a + ')'));
        sb.append(", uptime=");
        sb.append(this.b);
        sb.append(", positionOnScreen=");
        sb.append((Object) BF.g(this.c));
        sb.append(", position=");
        sb.append((Object) BF.g(this.d));
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
        sb.append((Object) BF.g(this.j));
        sb.append(", originalEventPosition=");
        sb.append((Object) BF.g(this.k));
        sb.append(')');
        return sb.toString();
    }
}
