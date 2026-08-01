package X0;

import f1.p;

/* loaded from: classes.dex */
public final class b extends g1.g implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final b f931c = new b(2, 0);
    public static final b d = new b(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2) {
        super(i);
        this.f932b = i2;
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        c cVar;
        switch (this.f932b) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                g1.f.e(str, "acc");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                g1.f.e(iVar, "acc");
                i n2 = iVar.n(gVar2.getKey());
                j jVar = j.f936a;
                if (n2 == jVar) {
                    return gVar2;
                }
                e eVar = e.f935a;
                f fVar = (f) n2.j(eVar);
                if (fVar == null) {
                    cVar = new c(n2, gVar2);
                } else {
                    i n3 = n2.n(eVar);
                    if (n3 == jVar) {
                        return new c(gVar2, fVar);
                    }
                    cVar = new c(new c(n3, gVar2), fVar);
                }
                return cVar;
        }
    }
}
