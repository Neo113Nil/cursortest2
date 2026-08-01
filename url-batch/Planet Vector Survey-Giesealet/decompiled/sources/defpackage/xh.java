package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class xh {
    public final uh a;

    public xh(uh uhVar) {
        this.a = uhVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xh) {
            return this.a.equals(((xh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
