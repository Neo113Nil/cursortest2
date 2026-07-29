package o;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.dz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0939dz extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1005ez i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0939dz(AbstractC1005ez abstractC1005ez, int i) {
        super(1);
        this.h = i;
        this.i = abstractC1005ez;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x027e, code lost:
    
        if (o.AbstractC1965tY.a(r3) == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0291  */
    @Override // o.InterfaceC2114vp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C1198hu c1198hu;
        C0904dP c0904dP;
        boolean z;
        InterfaceC1526mu c1821rM;
        AbstractC1004ey S;
        AbstractC1004ey c;
        int i = this.h;
        AbstractC1005ez abstractC1005ez = this.i;
        switch (i) {
            case 0:
                C0827cE c0827cE = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE, "name");
                AbstractC1005ez abstractC1005ez2 = abstractC1005ez.c;
                if (abstractC1005ez2 != null) {
                    return (PJ) abstractC1005ez2.g.invoke(c0827cE);
                }
                DM c2 = ((InterfaceC1578ng) abstractC1005ez.e.invoke()).c(c0827cE);
                if (c2 != null) {
                    Field field = c2.a;
                    if (!field.isEnumConstant()) {
                        boolean z2 = !Modifier.isFinal(((Field) c2.b()).getModifiers());
                        C1216i8 c1216i8 = abstractC1005ez.b;
                        C0338My G = AbstractC0022At.G(c1216i8, c2);
                        InterfaceC1118gg q = abstractC1005ez.q();
                        C0244Jh t = AbstractC2219xO.t(c2.e());
                        C0827cE c3 = c2.c();
                        C1198hu c1198hu2 = (C1198hu) c1216i8.i;
                        C0904dP H0 = c1198hu2.j.H0(c2);
                        if (Modifier.isFinal(((Field) c2.b()).getModifiers()) && Modifier.isStatic(((Field) c2.b()).getModifiers())) {
                            c1198hu = c1198hu2;
                            c0904dP = H0;
                            z = true;
                        } else {
                            c1198hu = c1198hu2;
                            c0904dP = H0;
                            z = false;
                        }
                        C1132gu P0 = C1132gu.P0(q, G, t, z2, c3, c0904dP, z);
                        P0.L0(null, null, null, null);
                        C0950e6 c0950e6 = (C0950e6) c1216i8.m;
                        Type genericType = field.getGenericType();
                        AbstractC0048Bt.m(genericType, "member.genericType");
                        boolean z3 = genericType instanceof Class;
                        if (z3) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                c1821rM = new IM(cls);
                                S = c0950e6.S(c1821rM, AbstractC1305jX.J(2, false, null, 7));
                                if ((!AbstractC0545Ux.F(S) || AbstractC0545Ux.G(S)) && Modifier.isFinal(((Field) c2.b()).getModifiers())) {
                                    Modifier.isStatic(((Field) c2.b()).getModifiers());
                                }
                                C0261Jy p = abstractC1005ez.p();
                                C1318jk c1318jk = C1318jk.h;
                                P0.O0(S, c1318jk, p, null, c1318jk);
                                c = P0.c();
                                if (c != null) {
                                    AbstractC0114Eh.a(67);
                                    throw null;
                                }
                                int i2 = AbstractC0114Eh.a;
                                if (!P0.m && !AbstractC1473m3.P(c)) {
                                    if (!AbstractC2228xX.b(c)) {
                                        AbstractC0545Ux e = AbstractC0192Hh.e(P0);
                                        if (!AbstractC0545Ux.F(c)) {
                                            AE ae = InterfaceC1136gy.a;
                                            if (!ae.a(e.u(), c)) {
                                                if (!ae.a(e.j("Number").i(), c)) {
                                                    if (!ae.a(e.e(), c)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    P0.M0(null, new V7(abstractC1005ez, c2, P0, 5));
                                }
                                c1198hu.g.getClass();
                                return P0;
                            }
                        }
                        c1821rM = ((genericType instanceof GenericArrayType) || (z3 && ((Class) genericType).isArray())) ? new C1821rM(genericType) : genericType instanceof WildcardType ? new NM((WildcardType) genericType) : new C2349zM(genericType);
                        S = c0950e6.S(c1821rM, AbstractC1305jX.J(2, false, null, 7));
                        if (!AbstractC0545Ux.F(S)) {
                        }
                        Modifier.isStatic(((Field) c2.b()).getModifiers());
                        C0261Jy p2 = abstractC1005ez.p();
                        C1318jk c1318jk2 = C1318jk.h;
                        P0.O0(S, c1318jk2, p2, null, c1318jk2);
                        c = P0.c();
                        if (c != null) {
                        }
                    }
                }
                return null;
            case 1:
                C0827cE c0827cE2 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE2, "name");
                AbstractC1005ez abstractC1005ez3 = abstractC1005ez.c;
                if (abstractC1005ez3 != null) {
                    return (Collection) abstractC1005ez3.f.invoke(c0827cE2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((InterfaceC1578ng) abstractC1005ez.e.invoke()).d(c0827cE2).iterator();
                while (it.hasNext()) {
                    C0934du t2 = abstractC1005ez.t((GM) it.next());
                    if (abstractC1005ez.r(t2)) {
                        ((C1198hu) abstractC1005ez.b.i).g.getClass();
                        arrayList.add(t2);
                    }
                }
                abstractC1005ez.j(arrayList, c0827cE2);
                return arrayList;
            case 2:
                C0827cE c0827cE3 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE3, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) abstractC1005ez.f.invoke(c0827cE3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String y = PX.y((HR) obj2, 2);
                    Object obj3 = linkedHashMap.get(y);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(y, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection b0 = AbstractC0048Bt.b0(list, C2316yt.q);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(b0);
                    }
                }
                abstractC1005ez.m(linkedHashSet, c0827cE3);
                C1216i8 c1216i82 = abstractC1005ez.b;
                return AbstractC0720ac.J0(((C1198hu) c1216i82.i).r.q(c1216i82, linkedHashSet));
            default:
                C0827cE c0827cE4 = (C0827cE) obj;
                AbstractC0048Bt.n(c0827cE4, "name");
                ArrayList arrayList2 = new ArrayList();
                AbstractC1052fg.e(arrayList2, abstractC1005ez.g.invoke(c0827cE4));
                abstractC1005ez.n(arrayList2, c0827cE4);
                if (AbstractC0114Eh.n(abstractC1005ez.q(), 5)) {
                    return AbstractC0720ac.J0(arrayList2);
                }
                C1216i8 c1216i83 = abstractC1005ez.b;
                return AbstractC0720ac.J0(((C1198hu) c1216i83.i).r.q(c1216i83, arrayList2));
        }
    }
}
