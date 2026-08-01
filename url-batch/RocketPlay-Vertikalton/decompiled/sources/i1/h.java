package i1;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f3049a;

    public h(Class cls) {
        this.f3049a = cls;
    }

    @Override // i1.b
    public final Class a() {
        return this.f3049a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (f.a(this.f3049a, ((h) obj).f3049a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3049a.hashCode();
    }

    public final String toString() {
        return this.f3049a.toString() + " (Kotlin reflection is not available)";
    }
}
