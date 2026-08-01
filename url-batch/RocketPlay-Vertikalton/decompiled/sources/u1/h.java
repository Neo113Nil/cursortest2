package u1;

import h1.InterfaceC0173a;
import q1.AbstractC0352s;

/* loaded from: classes.dex */
public final /* synthetic */ class h extends i1.a implements InterfaceC0173a, n1.a {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4189g;

    public h(i iVar) {
        super(iVar, AbstractC0352s.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f4189g = false;
    }

    public final n1.a b() {
        if (!this.f4189g) {
            n1.a aVar = this.f3039a;
            if (aVar != null) {
                return aVar;
            }
            i1.j.f3052a.getClass();
            this.f3039a = this;
        }
        return this;
    }

    @Override // h1.InterfaceC0173a
    public final Object c() {
        return this.f3040b.getClass().getSimpleName();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return a().equals(hVar.a()) && this.d.equals(hVar.d) && this.f3042e.equals(hVar.f3042e) && this.f3040b.equals(hVar.f3040b);
        }
        if (obj instanceof h) {
            return obj.equals(b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f3042e.hashCode() + ((this.d.hashCode() + (a().hashCode() * 31)) * 31);
    }

    public final String toString() {
        n1.a b2 = b();
        if (b2 != this) {
            return b2.toString();
        }
        return "property " + this.d + " (Kotlin reflection is not available)";
    }
}
