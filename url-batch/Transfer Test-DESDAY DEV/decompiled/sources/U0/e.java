package U0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f865a;

    public e(Throwable th) {
        g1.f.e(th, "exception");
        this.f865a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (g1.f.a(this.f865a, ((e) obj).f865a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f865a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f865a + ')';
    }
}
