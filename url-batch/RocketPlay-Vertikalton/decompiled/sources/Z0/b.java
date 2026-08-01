package Z0;

import h1.p;

/* loaded from: classes.dex */
public final class b extends i1.g implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1553c = new b(2, 0);
    public static final b d = new b(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.f1554b = i2;
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f1554b) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                i1.f.e(str, "acc");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                i1.f.e(iVar, "acc");
                i i = iVar.i(gVar2.getKey());
                j jVar = j.f1558a;
                if (i == jVar) {
                    return gVar2;
                }
                e eVar = e.f1557a;
                f fVar = (f) i.f(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, i);
                } else {
                    i i2 = i.i(eVar);
                    if (i2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, i2));
                }
                return cVar;
        }
    }
}
