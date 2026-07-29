package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: o.Vy, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572Vy implements InterfaceC1159hH {
    public final C1216i8 a;
    public final PA b;

    public C0572Vy(C1198hu c1198hu) {
        this.a = new C1216i8(c1198hu, C1623oL.p, new C2270y9(1));
        VA va = (VA) c1198hu.a;
        va.getClass();
        this.b = new PA(va, new ConcurrentHashMap(3, 1.0f, 2), new C2311yo(1), 0);
    }

    @Override // o.InterfaceC1159hH
    public final boolean a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        ((C1198hu) this.a.i).b.getClass();
        return false;
    }

    @Override // o.InterfaceC1159hH
    public final void b(C2245xo c2245xo, ArrayList arrayList) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        arrayList.add(c(c2245xo));
    }

    public final C0546Uy c(C2245xo c2245xo) {
        ((C1198hu) this.a.i).b.getClass();
        AbstractC0048Bt.n(c2245xo, "fqName");
        K2 k2 = new K2(this, 15, new HM(c2245xo));
        PA pa = this.b;
        pa.getClass();
        Object invoke = pa.invoke(new QA(c2245xo, k2));
        if (invoke != null) {
            return (C0546Uy) invoke;
        }
        PA.a(3);
        throw null;
    }

    @Override // o.InterfaceC1159hH
    public final Collection f(C2245xo c2245xo, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        List list = (List) c(c2245xo).r.invoke();
        return list == null ? C1318jk.h : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((C1198hu) this.a.i).f177o;
    }
}
