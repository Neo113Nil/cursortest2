package o;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1335k0 implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ C1335k0(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                C1401l0 c1401l0 = (C1401l0) this.i;
                sb.append(((C0827cE) c1401l0.i).b());
                return AbstractC1035fP.c(sb.toString(), ((AbstractC1533n0) c1401l0.j).getUpperBounds());
            case 1:
                C2043uk c2043uk = (C2043uk) this.i;
                HashSet hashSet = new HashSet();
                for (C0827cE c0827cE : (Set) c2043uk.e.p.invoke()) {
                    if (c0827cE == null) {
                        C2043uk.h(5);
                        throw null;
                    }
                    hashSet.addAll((Collection) c2043uk.b.invoke(c0827cE));
                    hashSet.addAll((Collection) c2043uk.c.invoke(c0827cE));
                }
                return hashSet;
            default:
                return (List) this.i;
        }
    }
}
