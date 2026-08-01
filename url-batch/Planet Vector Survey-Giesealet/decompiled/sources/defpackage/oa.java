package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oa extends fu0 implements qu {
    public final /* synthetic */ int d = 1;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(cx0 cx0Var, s80 s80Var, Map map, bt0 bt0Var, rg rgVar, kj kjVar) {
        super(2, kjVar);
        this.e = cx0Var;
        this.f = s80Var;
        this.g = map;
        this.h = bt0Var;
        this.i = rgVar;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        int i = this.d;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                oa oaVar = new oa((pa) obj5, (ea0) obj4, (bu) obj3, (c9) obj2, kjVar);
                oaVar.e = obj;
                return oaVar;
            default:
                return new oa((cx0) this.e, (s80) obj5, (Map) obj4, (bt0) obj3, (rg) obj2, kjVar);
        }
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        ky0 ky0Var = ky0.a;
        bk bkVar = (bk) obj;
        kj kjVar = (kj) obj2;
        switch (i) {
            case 0:
                return ((oa) create(bkVar, kjVar)).invokeSuspend(ky0Var);
            default:
                ((oa) create(bkVar, kjVar)).invokeSuspend(ky0Var);
                return ky0Var;
        }
    }

    @Override // defpackage.h9
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.f;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                rg0.u(obj);
                bk bkVar = (bk) this.e;
                pa paVar = (pa) obj4;
                d31.E(bkVar, null, new u6(paVar, (ea0) obj5, (bu) obj3, null, 1), 3);
                return d31.E(bkVar, null, new c(paVar, (c9) obj2, null, 4), 3);
            default:
                Map map = (Map) obj5;
                s80 s80Var = (s80) obj4;
                rg0.u(obj);
                cx0 cx0Var = (cx0) this.e;
                Object b = cx0Var.a.b();
                ce0 ce0Var = cx0Var.d;
                if (nz.l(b, ce0Var.getValue()) && (((y70) s80Var.g.f()) == null || nz.l(ce0Var.getValue(), (y70) s80Var.g.f()))) {
                    rg rgVar = (rg) obj2;
                    Iterator it = ((List) ((bt0) obj3).getValue()).iterator();
                    while (it.hasNext()) {
                        rgVar.b().b((y70) it.next());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!nz.l(entry.getKey(), ((y70) ce0Var.getValue()).i)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        map.remove(((Map.Entry) it2.next()).getKey());
                    }
                }
                return ky0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(pa paVar, ea0 ea0Var, bu buVar, c9 c9Var, kj kjVar) {
        super(2, kjVar);
        this.f = paVar;
        this.g = ea0Var;
        this.h = buVar;
        this.i = c9Var;
    }
}
