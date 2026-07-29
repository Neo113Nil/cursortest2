package o;

import java.util.Comparator;

/* renamed from: o.e3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947e3 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0947e3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int compare = ((Comparator) this.b).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return C0027Ay.G.compare(((C2287yQ) obj).c, ((C2287yQ) obj2).c);
            case 1:
                int compare2 = ((C0947e3) this.b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : AbstractC1305jX.l(Integer.valueOf(((C2287yQ) obj).g), Integer.valueOf(((C2287yQ) obj2).g));
            default:
                AbstractC1004ey abstractC1004ey = (AbstractC1004ey) obj;
                InterfaceC2114vp interfaceC2114vp = (InterfaceC2114vp) this.b;
                AbstractC0048Bt.m(abstractC1004ey, "it");
                String obj3 = interfaceC2114vp.invoke(abstractC1004ey).toString();
                AbstractC1004ey abstractC1004ey2 = (AbstractC1004ey) obj2;
                AbstractC0048Bt.m(abstractC1004ey2, "it");
                return AbstractC1305jX.l(obj3, interfaceC2114vp.invoke(abstractC1004ey2).toString());
        }
    }

    public C0947e3(Comparator comparator) {
        this.a = 0;
        this.b = comparator;
    }
}
