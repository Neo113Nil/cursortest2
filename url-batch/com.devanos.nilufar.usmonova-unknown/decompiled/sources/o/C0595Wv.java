package o;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.Wv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595Wv extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0621Xv i;
    public final /* synthetic */ C0740aw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0595Wv(C0621Xv c0621Xv, C0740aw c0740aw, int i) {
        super(0);
        this.h = i;
        this.i = c0621Xv;
        this.j = c0740aw;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        Field declaredField;
        int i = this.h;
        C0740aw c0740aw = this.j;
        C0621Xv c0621Xv = this.i;
        switch (i) {
            case 0:
                Class cls = c0740aw.i;
                InterfaceC1245ib a = c0621Xv.a();
                if (a.B() != 6) {
                    return null;
                }
                if (a.D()) {
                    LinkedHashSet linkedHashSet = C2101vc.a;
                    if (!EB.A(a)) {
                        declaredField = cls.getEnclosingClass().getDeclaredField(a.getName().b());
                        Object obj = declaredField.get(null);
                        AbstractC0048Bt.l(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                        return obj;
                    }
                }
                declaredField = cls.getDeclaredField("INSTANCE");
                Object obj2 = declaredField.get(null);
                AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj2;
            case 1:
                Collection<AbstractC1004ey> d = c0621Xv.a().z().d();
                AbstractC0048Bt.m(d, "descriptor.typeConstructor.supertypes");
                ArrayList arrayList = new ArrayList(d.size());
                for (AbstractC1004ey abstractC1004ey : d) {
                    AbstractC0048Bt.m(abstractC1004ey, "kotlinType");
                    arrayList.add(new C1661ox(abstractC1004ey, new V7(abstractC1004ey, c0621Xv, c0740aw, 3)));
                }
                InterfaceC1245ib a2 = c0621Xv.a();
                C0827cE c0827cE = AbstractC0545Ux.e;
                if (!AbstractC0545Ux.b(a2, AbstractC1433lT.a) && !AbstractC0545Ux.b(a2, AbstractC1433lT.b)) {
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int B = AbstractC0114Eh.c(((C1661ox) it.next()).h).B();
                            AbstractC1888sN.t(B, "getClassDescriptorForType(it.type).kind");
                            if (B == 2 || B == 5) {
                            }
                        }
                    }
                    arrayList.add(new C1661ox(AbstractC0192Hh.e(c0621Xv.a()).e(), C2234xd.r));
                }
                return AbstractC1052fg.i(arrayList);
            default:
                List<InterfaceC1437lX> p = c0621Xv.a().p();
                AbstractC0048Bt.m(p, "descriptor.declaredTypeParameters");
                ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(p));
                for (InterfaceC1437lX interfaceC1437lX : p) {
                    AbstractC0048Bt.m(interfaceC1437lX, "descriptor");
                    arrayList2.add(new C1793qx(c0740aw, interfaceC1437lX));
                }
                return arrayList2;
        }
    }
}
