package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mv0 {
    public static final mv0 c = new mv0(ze0.m(0), ze0.m(0));
    public final long a;
    public final long b;

    public mv0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0)) {
            return false;
        }
        mv0 mv0Var = (mv0) obj;
        return fw0.a(this.a, mv0Var.a) && fw0.a(this.b, mv0Var.b);
    }

    public final int hashCode() {
        return fw0.d(this.b) + (fw0.d(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) fw0.e(this.a)) + ", restLine=" + ((Object) fw0.e(this.b)) + ')';
    }
}
