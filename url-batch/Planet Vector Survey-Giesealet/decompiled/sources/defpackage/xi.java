package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xi {
    public final int a;
    public final long b;
    public final yi c;
    public final p01 d;

    public xi(int i, long j, yi yiVar, p01 p01Var) {
        this.a = i;
        this.b = j;
        this.c = yiVar;
        this.d = p01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return this.a == xiVar.a && this.b == xiVar.b && this.c == xiVar.c && nz.l(this.d, xiVar.d);
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        int hashCode = (this.c.hashCode() + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31;
        p01 p01Var = this.d;
        return hashCode + (p01Var == null ? 0 : p01Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
