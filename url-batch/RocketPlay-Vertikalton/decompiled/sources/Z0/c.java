package Z0;

import F1.l;
import h1.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final i f1555a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1556b;

    public c(g gVar, i iVar) {
        i1.f.e(iVar, "left");
        this.f1555a = iVar;
        this.f1556b = gVar;
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
                i iVar = cVar2.f1555a;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f1555a;
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
                g gVar = cVar4.f1556b;
                if (!i1.f.a(cVar.f(gVar.getKey()), gVar)) {
                    z2 = false;
                    break;
                }
                i iVar3 = cVar4.f1555a;
                if (!(iVar3 instanceof c)) {
                    i1.f.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    z2 = i1.f.a(cVar.f(gVar2.getKey()), gVar2);
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

    @Override // Z0.i
    public final g f(h hVar) {
        i1.f.e(hVar, "key");
        c cVar = this;
        while (true) {
            g f2 = cVar.f1556b.f(hVar);
            if (f2 != null) {
                return f2;
            }
            i iVar = cVar.f1555a;
            if (!(iVar instanceof c)) {
                return iVar.f(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // Z0.i
    public final i h(i iVar) {
        return l.e0(this, iVar);
    }

    public final int hashCode() {
        return this.f1556b.hashCode() + this.f1555a.hashCode();
    }

    @Override // Z0.i
    public final i i(h hVar) {
        i1.f.e(hVar, "key");
        g gVar = this.f1556b;
        g f2 = gVar.f(hVar);
        i iVar = this.f1555a;
        if (f2 != null) {
            return iVar;
        }
        i i = iVar.i(hVar);
        return i == iVar ? this : i == j.f1558a ? gVar : new c(gVar, i);
    }

    @Override // Z0.i
    public final Object q(Object obj, p pVar) {
        return pVar.d(this.f1555a.q(obj, pVar), this.f1556b);
    }

    public final String toString() {
        return "[" + ((String) q("", b.f1553c)) + ']';
    }
}
