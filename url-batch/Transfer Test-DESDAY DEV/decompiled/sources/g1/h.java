package g1;

/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2582a;

    public h(Class cls) {
        this.f2582a = cls;
    }

    @Override // g1.b
    public final Class a() {
        return this.f2582a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (f.a(this.f2582a, ((h) obj).f2582a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2582a.hashCode();
    }

    public final String toString() {
        return this.f2582a.toString() + " (Kotlin reflection is not available)";
    }
}
