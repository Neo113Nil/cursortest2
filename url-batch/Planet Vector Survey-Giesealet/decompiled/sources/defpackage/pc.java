package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pc {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public pc(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pc)) {
            return false;
        }
        pc pcVar = (pc) obj;
        return ge.c(this.a, pcVar.a) && ge.c(this.b, pcVar.b) && ge.c(this.c, pcVar.c) && ge.c(this.d, pcVar.d);
    }

    public final int hashCode() {
        return ge.i(this.d) + ((ge.i(this.c) + ((ge.i(this.b) + (ge.i(this.a) * 31)) * 31)) * 31);
    }
}
