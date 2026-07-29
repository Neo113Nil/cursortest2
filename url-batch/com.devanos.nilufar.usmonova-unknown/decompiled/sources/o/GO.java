package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class GO implements LB {
    public static final GO b = new GO(0);
    public final /* synthetic */ int a;

    public /* synthetic */ GO(int i) {
        this.a = i;
    }

    @Override // o.LB
    public final M5 a(AbstractC1415lB abstractC1415lB, List list, long j) {
        switch (this.a) {
            case 0:
                if (list.isEmpty()) {
                    return abstractC1415lB.T(C0603Xd.f(j), C0603Xd.e(j), WI.u);
                }
                if (list.size() == 1) {
                    AbstractC0700aI a = ((IB) list.get(0)).a(j);
                    return abstractC1415lB.T(AbstractC1807r8.q(a.b, C0603Xd.f(j), C0603Xd.d(j)), AbstractC1807r8.q(a.c, C0603Xd.e(j), C0603Xd.c(j)), new C0585Wl(a, 1));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((IB) list.get(i)).a(j));
                }
                int size2 = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    AbstractC0700aI abstractC0700aI = (AbstractC0700aI) arrayList.get(i4);
                    i2 = Math.max(abstractC0700aI.b, i2);
                    i3 = Math.max(abstractC0700aI.c, i3);
                }
                return abstractC1415lB.T(AbstractC1807r8.q(i2, C0603Xd.f(j), C0603Xd.d(j)), AbstractC1807r8.q(i3, C0603Xd.e(j), C0603Xd.c(j)), new C2084vL(5, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
