package V0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1245a;

    public e(Throwable th) {
        i1.f.e(th, "exception");
        this.f1245a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (i1.f.a(this.f1245a, ((e) obj).f1245a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1245a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1245a + ')';
    }
}
