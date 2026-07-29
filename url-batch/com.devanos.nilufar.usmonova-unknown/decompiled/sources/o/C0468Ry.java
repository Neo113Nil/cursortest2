package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: o.Ry, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468Ry extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0494Sy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0468Ry(C0494Sy c0494Sy, int i) {
        super(0);
        this.h = i;
        this.i = c0494Sy;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                List b = this.i.f108o.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj : b) {
                    if (((DM) obj).a.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int E = EB.E(AbstractC0786bc.d0(arrayList));
                if (E < 16) {
                    E = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(E);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    linkedHashMap.put(((DM) next).c(), next);
                }
                return linkedHashMap;
            case 1:
                Class<?>[] declaredClasses = this.i.f108o.a.getDeclaredClasses();
                AbstractC0048Bt.m(declaredClasses, "klass.declaredClasses");
                return AbstractC0720ac.M0(PQ.B(PQ.A(new C0730am(P6.X(declaredClasses), false, WI.n), WI.f124o)));
            default:
                C0494Sy c0494Sy = this.i;
                return WQ.n(c0494Sy.d(), c0494Sy.e());
        }
    }
}
