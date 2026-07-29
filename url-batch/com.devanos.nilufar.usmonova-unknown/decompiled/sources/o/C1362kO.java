package o;

import java.io.Serializable;

/* renamed from: o.kO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1362kO implements Serializable {
    public final Throwable h;

    public C1362kO(Throwable th) {
        AbstractC0048Bt.n(th, "exception");
        this.h = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1362kO) {
            return AbstractC0048Bt.h(this.h, ((C1362kO) obj).h);
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.h + ')';
    }
}
