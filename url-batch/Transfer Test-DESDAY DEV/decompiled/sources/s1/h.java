package s1;

import o1.AbstractC0302t;

/* loaded from: classes.dex */
public final /* synthetic */ class h extends g1.a implements f1.a, l1.a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3702g;

    public h(i iVar) {
        super(iVar, AbstractC0302t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f3702g = false;
    }

    public final l1.a b() {
        if (!this.f3702g) {
            l1.a aVar = this.f2572a;
            if (aVar != null) {
                return aVar;
            }
            g1.j.f2584a.getClass();
            this.f2572a = this;
        }
        return this;
    }

    @Override // f1.a
    public final Object c() {
        return this.f2573b.getClass().getSimpleName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return a().equals(hVar.a()) && this.d.equals(hVar.d) && this.f2575e.equals(hVar.f2575e) && this.f2573b.equals(hVar.f2573b);
        }
        if (obj instanceof h) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2575e.hashCode() + ((this.d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        l1.a b2 = b();
        if (b2 != this) {
            return b2.toString();
        }
        return "property " + this.d + " (Kotlin reflection is not available)";
    }
}
