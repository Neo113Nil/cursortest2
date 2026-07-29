package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.lw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462lw extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C1528mw i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1462lw(C1528mw c1528mw, int i) {
        super(0);
        this.h = i;
        this.i = c1528mw;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        G9 t9;
        G9 s9;
        GenericDeclaration declaredConstructor;
        V9 v9;
        V9 t92;
        int i = this.h;
        C1528mw c1528mw = this.i;
        Object obj = null;
        switch (i) {
            case 0:
                C1639ob c1639ob = AbstractC0969eP.a;
                Object obj2 = c1528mw.f199o;
                InterfaceC0381Op p = c1528mw.p();
                AbstractC1330jw abstractC1330jw = c1528mw.m;
                AbstractC1807r8 c = AbstractC0969eP.c(p);
                if (c instanceof C1263iv) {
                    if (c1528mw.q()) {
                        Class e = abstractC1330jw.e();
                        List parameters = c1528mw.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(parameters));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            String name = ((C0362Nw) ((InterfaceC0310Lw) it.next())).getName();
                            AbstractC0048Bt.k(name);
                            arrayList.add(name);
                        }
                        return new C0817c4(e, arrayList, 2);
                    }
                    String str = ((C1263iv) c).i.i;
                    abstractC1330jw.getClass();
                    AbstractC0048Bt.n(str, "desc");
                    Class e2 = abstractC1330jw.e();
                    try {
                        Class[] clsArr = (Class[]) abstractC1330jw.s(str).toArray(new Class[0]);
                        obj = e2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (c instanceof C1329jv) {
                    C1461lv c1461lv = ((C1329jv) c).i;
                    obj = abstractC1330jw.l(c1461lv.h, c1461lv.i);
                } else if (c instanceof C1199hv) {
                    obj = ((C1199hv) c).i;
                } else {
                    if (!(c instanceof C1133gv)) {
                        if (!(c instanceof C1067fv)) {
                            throw new C0057Cc();
                        }
                        List list = ((C1067fv) c).i;
                        Class e3 = abstractC1330jw.e();
                        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new C0817c4(e3, arrayList2, 2, 1, list);
                    }
                    obj = ((C1133gv) c).i;
                }
                if (obj instanceof Constructor) {
                    s9 = C1528mw.s(c1528mw, (Constructor) obj, c1528mw.p(), false);
                } else {
                    if (!(obj instanceof Method)) {
                        throw new C0526Ue("Could not compute caller for function: " + c1528mw.p() + " (member = " + obj + ')');
                    }
                    Method method = (Method) obj;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        t9 = c1528mw.r() ? new R9(AbstractC1052fg.h(obj2, c1528mw.p()), method) : new U9(method, 0);
                    } else if (((L) c1528mw.p()).getAnnotations().c(JY.a) != null) {
                        s9 = c1528mw.r() ? new S9(method) : new U9(method, 1);
                    } else {
                        t9 = c1528mw.r() ? new T9(AbstractC1052fg.h(obj2, c1528mw.p()), method) : new U9(method, 2);
                    }
                    s9 = t9;
                }
                return AbstractC1052fg.k(c1528mw.p(), s9, false);
            default:
                C1639ob c1639ob2 = AbstractC0969eP.a;
                InterfaceC0381Op p2 = c1528mw.p();
                AbstractC1330jw abstractC1330jw2 = c1528mw.m;
                AbstractC1807r8 c2 = AbstractC0969eP.c(p2);
                if (c2 instanceof C1329jv) {
                    C1461lv c1461lv2 = ((C1329jv) c2).i;
                    String str2 = c1461lv2.h;
                    String str3 = c1461lv2.i;
                    Member b = c1528mw.m().b();
                    AbstractC0048Bt.k(b);
                    boolean isStatic = Modifier.isStatic(b.getModifiers());
                    boolean z = !isStatic;
                    abstractC1330jw2.getClass();
                    AbstractC0048Bt.n(str2, "name");
                    AbstractC0048Bt.n(str3, "desc");
                    if (!str2.equals("<init>")) {
                        ArrayList arrayList3 = new ArrayList();
                        if (!isStatic) {
                            arrayList3.add(abstractC1330jw2.e());
                        }
                        abstractC1330jw2.i(arrayList3, str3, false);
                        declaredConstructor = AbstractC1330jw.t(abstractC1330jw2.q(), str2.concat("$default"), (Class[]) arrayList3.toArray(new Class[0]), abstractC1330jw2.u(str3, UT.H(str3, ')', 0, 6) + 1, str3.length()), z);
                    }
                    declaredConstructor = null;
                } else {
                    if (c2 instanceof C1263iv) {
                        if (c1528mw.q()) {
                            Class e4 = abstractC1330jw2.e();
                            List parameters2 = c1528mw.getParameters();
                            ArrayList arrayList4 = new ArrayList(AbstractC0786bc.d0(parameters2));
                            Iterator it3 = parameters2.iterator();
                            while (it3.hasNext()) {
                                String name2 = ((C0362Nw) ((InterfaceC0310Lw) it3.next())).getName();
                                AbstractC0048Bt.k(name2);
                                arrayList4.add(name2);
                            }
                            return new C0817c4(e4, arrayList4, 1);
                        }
                        String str4 = ((C1263iv) c2).i.i;
                        abstractC1330jw2.getClass();
                        AbstractC0048Bt.n(str4, "desc");
                        Class e5 = abstractC1330jw2.e();
                        ArrayList arrayList5 = new ArrayList();
                        abstractC1330jw2.i(arrayList5, str4, true);
                        try {
                            Class[] clsArr2 = (Class[]) arrayList5.toArray(new Class[0]);
                            declaredConstructor = e5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                        }
                    } else if (c2 instanceof C1067fv) {
                        List list2 = ((C1067fv) c2).i;
                        Class e6 = abstractC1330jw2.e();
                        ArrayList arrayList6 = new ArrayList(AbstractC0786bc.d0(list2));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Method) it4.next()).getName());
                        }
                        return new C0817c4(e6, arrayList6, 1, 1, list2);
                    }
                    declaredConstructor = null;
                }
                if (declaredConstructor instanceof Constructor) {
                    v9 = C1528mw.s(c1528mw, (Constructor) declaredConstructor, c1528mw.p(), true);
                } else if (declaredConstructor instanceof Method) {
                    if (((L) c1528mw.p()).getAnnotations().c(JY.a) != null) {
                        InterfaceC1118gg n = c1528mw.p().n();
                        AbstractC0048Bt.l(n, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        if (!((InterfaceC1245ib) n).D()) {
                            Method method2 = (Method) declaredConstructor;
                            t92 = c1528mw.r() ? new S9(method2) : new U9(method2, 1);
                            v9 = t92;
                        }
                    }
                    Method method3 = (Method) declaredConstructor;
                    t92 = c1528mw.r() ? new T9(AbstractC1052fg.h(c1528mw.f199o, c1528mw.p()), method3) : new U9(method3, 2);
                    v9 = t92;
                } else {
                    v9 = null;
                }
                if (v9 != null) {
                    return AbstractC1052fg.k(c1528mw.p(), v9, true);
                }
                return null;
        }
    }
}
