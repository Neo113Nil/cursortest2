package o;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Tt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0515Tt {
    public static final Object a = EB.G(new C1619oH("PACKAGE", EnumSet.noneOf(EnumC0938dy.class)), new C1619oH("TYPE", EnumSet.of(EnumC0938dy.j, EnumC0938dy.v)), new C1619oH("ANNOTATION_TYPE", EnumSet.of(EnumC0938dy.k)), new C1619oH("TYPE_PARAMETER", EnumSet.of(EnumC0938dy.l)), new C1619oH("FIELD", EnumSet.of(EnumC0938dy.n)), new C1619oH("LOCAL_VARIABLE", EnumSet.of(EnumC0938dy.f159o)), new C1619oH("PARAMETER", EnumSet.of(EnumC0938dy.p)), new C1619oH("CONSTRUCTOR", EnumSet.of(EnumC0938dy.q)), new C1619oH("METHOD", EnumSet.of(EnumC0938dy.r, EnumC0938dy.s, EnumC0938dy.t)), new C1619oH("TYPE_USE", EnumSet.of(EnumC0938dy.u)));
    public static final Object b = EB.G(new C1619oH("RUNTIME", EnumC0873cy.h), new C1619oH("CLASS", EnumC0873cy.i), new C1619oH("SOURCE", EnumC0873cy.j));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static O6 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CM) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(C0827cE.e(((CM) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = C1648ok.h;
            }
            AbstractC1048fc.f0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C2175wk(C1639ob.j(AbstractC1433lT.u), C0827cE.e(((EnumC0938dy) it2.next()).name())));
        }
        return new O6(arrayList3, C2316yt.j);
    }
}
