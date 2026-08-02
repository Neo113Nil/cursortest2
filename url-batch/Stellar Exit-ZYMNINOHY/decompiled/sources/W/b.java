package W;

import d0.p;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f390b;

    public /* synthetic */ b(int i2) {
        this.f390b = i2;
    }

    @Override // d0.p
    public final Object e(Object obj, Object obj2) {
        c cVar;
        switch (this.f390b) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                e0.h.e(str, "acc");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                e0.h.e(iVar, "acc");
                i e2 = iVar.e(gVar2.getKey());
                j jVar = j.f394b;
                if (e2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f393b;
                f fVar = (f) e2.k(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, e2);
                } else {
                    i e3 = e2.e(eVar);
                    if (e3 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, e3));
                }
                return cVar;
        }
    }
}
