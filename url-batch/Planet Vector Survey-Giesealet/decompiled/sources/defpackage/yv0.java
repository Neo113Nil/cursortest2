package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yv0 {
    public final long a;
    public final long b;

    public yv0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv0)) {
            return false;
        }
        yv0 yv0Var = (yv0) obj;
        return ge.c(this.a, yv0Var.a) && ge.c(this.b, yv0Var.b);
    }

    public final int hashCode() {
        return ge.i(this.b) + (ge.i(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        y6.z(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) ge.j(this.b));
        sb.append(')');
        return sb.toString();
    }
}
