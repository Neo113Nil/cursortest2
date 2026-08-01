package X0;

import f1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f933a;

    /* renamed from: b, reason: collision with root package name */
    public final g f934b;

    public c(i iVar, g gVar) {
        g1.f.e(iVar, "left");
        this.f933a = iVar;
        this.f934b = gVar;
    }

    public final boolean equals(Object obj) {
        boolean z2;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                i iVar = cVar2.f933a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f933a;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.f934b;
                if (!g1.f.a(cVar.j(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f933a;
                if (!(iVar3 instanceof c)) {
                    g1.f.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = g1.f.a(cVar.j(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f934b.hashCode() + this.f933a.hashCode();
    }

    @Override // X0.i
    public final g j(h hVar) {
        g1.f.e(hVar, "key");
        c cVar = this;
        while (true) {
            g j2 = cVar.f934b.j(hVar);
            if (j2 != null) {
                return j2;
            }
            i iVar = cVar.f933a;
            if (!(iVar instanceof c)) {
                return iVar.j(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // X0.i
    public final i m(i iVar) {
        g1.f.e(iVar, "context");
        return iVar == j.f936a ? this : (i) iVar.t(this, b.d);
    }

    @Override // X0.i
    public final i n(h hVar) {
        g1.f.e(hVar, "key");
        g gVar = this.f934b;
        g j2 = gVar.j(hVar);
        i iVar = this.f933a;
        if (j2 != null) {
            return iVar;
        }
        i n2 = iVar.n(hVar);
        return n2 == iVar ? this : n2 == j.f936a ? gVar : new c(n2, gVar);
    }

    @Override // X0.i
    public final Object t(Object obj, p pVar) {
        return pVar.d(this.f933a.t(obj, pVar), this.f934b);
    }

    public final String toString() {
        return "[" + ((String) t("", b.f931c)) + ']';
    }
}
