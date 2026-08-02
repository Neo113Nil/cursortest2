package m0;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1023a;

    public h(Throwable th) {
        this.f1023a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (e0.h.a(this.f1023a, ((h) obj).f1023a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1023a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // m0.i
    public final String toString() {
        return "Closed(" + this.f1023a + ')';
    }
}
