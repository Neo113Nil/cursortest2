package o;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.iz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1267iz extends AbstractC2191x {
    public final C1216i8 r;
    public final LM s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1267iz(C1216i8 c1216i8, LM lm, int i, InterfaceC1249ig interfaceC1249ig) {
        super(r0.a, interfaceC1249ig, new C0338My(c1216i8, lm, false), C0827cE.e(lm.a.getName()), 1, false, i, r0.m);
        AbstractC0048Bt.n(lm, "javaTypeParameter");
        C1198hu c1198hu = (C1198hu) c1216i8.i;
        this.r = c1216i8;
        this.s = lm;
    }

    @Override // o.AbstractC1533n0
    public final List H0(List list) {
        C0218Ih c0218Ih;
        C1216i8 c1216i8 = this.r;
        C0218Ih c0218Ih2 = ((C1198hu) c1216i8.i).r;
        c0218Ih2.getClass();
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC1004ey abstractC1004ey = (AbstractC1004ey) it.next();
            RP rp = RP.u;
            AbstractC0048Bt.n(abstractC1004ey, "<this>");
            if (AbstractC2228xX.c(abstractC1004ey, rp, null)) {
                c0218Ih = c0218Ih2;
            } else {
                c0218Ih = c0218Ih2;
                abstractC1004ey = c0218Ih.l(new DR(this, false, c1216i8, EnumC1212i4.m, false), abstractC1004ey, C1318jk.h, null, false);
                if (abstractC1004ey == null) {
                    abstractC1004ey = abstractC1004ey;
                }
            }
            arrayList.add(abstractC1004ey);
            c0218Ih2 = c0218Ih;
        }
        return arrayList;
    }

    @Override // o.AbstractC1533n0
    public final List I0() {
        Type[] bounds = this.s.a.getBounds();
        AbstractC0048Bt.m(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new C2349zM(type));
        }
        C2349zM c2349zM = (C2349zM) AbstractC0720ac.F0(arrayList);
        List list = arrayList;
        if (AbstractC0048Bt.h(c2349zM != null ? c2349zM.a : null, Object.class)) {
            list = C1318jk.h;
        }
        boolean isEmpty = list.isEmpty();
        C1216i8 c1216i8 = this.r;
        if (isEmpty) {
            return AbstractC0868ct.J(HO.m(((C1198hu) c1216i8.i).f177o.l().e(), ((C1198hu) c1216i8.i).f177o.l().o()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0950e6) c1216i8.m).S((C2349zM) it.next(), AbstractC1305jX.J(2, false, this, 3)));
        }
        return arrayList2;
    }
}
