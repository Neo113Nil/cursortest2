package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class uk0 implements Serializable {
    public final Throwable d;

    public uk0(Throwable th) {
        th.getClass();
        this.d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uk0) {
            return nz.l(this.d, ((uk0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.d + ')';
    }
}
