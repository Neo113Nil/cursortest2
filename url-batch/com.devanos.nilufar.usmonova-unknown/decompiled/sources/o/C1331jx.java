package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;

/* renamed from: o.jx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331jx extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ AbstractC1397kx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1331jx(AbstractC1397kx abstractC1397kx, int i) {
        super(0);
        this.h = i;
        this.i = abstractC1397kx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005a, code lost:
    
        if (o.EB.A((o.InterfaceC1245ib) r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if (r6 != false) goto L31;
     */
    @Override // o.InterfaceC1455lp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        boolean i;
        Class<?> enclosingClass;
        int i2 = this.h;
        AbstractC1397kx abstractC1397kx = this.i;
        boolean z = true;
        switch (i2) {
            case 0:
                AbstractC1330jw abstractC1330jw = abstractC1397kx.m;
                String str = abstractC1397kx.n;
                String str2 = abstractC1397kx.f191o;
                abstractC1330jw.getClass();
                AbstractC0048Bt.n(str, "name");
                AbstractC0048Bt.n(str2, "signature");
                C0705aN c0705aN = AbstractC1330jw.h;
                c0705aN.getClass();
                Matcher matcher = c0705aN.h.matcher(str2);
                AbstractC0048Bt.m(matcher, "matcher(...)");
                C0208Hx c0208Hx = matcher.matches() ? new C0208Hx(matcher, str2) : null;
                if (c0208Hx != null) {
                    if (((FB) c0208Hx.j) == null) {
                        c0208Hx.j = new FB(c0208Hx);
                    }
                    FB fb = (FB) c0208Hx.j;
                    AbstractC0048Bt.k(fb);
                    String str3 = (String) fb.get(1);
                    PJ o2 = abstractC1330jw.o(Integer.parseInt(str3));
                    if (o2 != null) {
                        return o2;
                    }
                    throw new C0526Ue("Local property #" + str3 + " not found in " + abstractC1330jw.e());
                }
                Collection r = abstractC1330jw.r(C0827cE.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : r) {
                    if (AbstractC0048Bt.h(AbstractC0969eP.b((PJ) obj).g(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new C0526Ue("Property '" + str + "' (JVM signature: " + str2 + ") not resolved in " + abstractC1330jw);
                }
                if (arrayList.size() == 1) {
                    return (PJ) AbstractC0720ac.D0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C0244Jh visibility = ((PJ) next).getVisibility();
                    Object obj2 = linkedHashMap.get(visibility);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(visibility, obj2);
                    }
                    ((List) obj2).add(next);
                }
                TreeMap treeMap = new TreeMap(new C0685a3(12));
                treeMap.putAll(linkedHashMap);
                Collection values = treeMap.values();
                AbstractC0048Bt.m(values, "properties\n             …\n                }.values");
                List list = (List) AbstractC0720ac.u0(values);
                if (list.size() == 1) {
                    return (PJ) AbstractC0720ac.n0(list);
                }
                String t0 = AbstractC0720ac.t0(abstractC1330jw.r(C0827cE.e(str)), "\n", null, null, C2316yt.f249o, 30);
                StringBuilder sb = new StringBuilder("Property '");
                sb.append(str);
                sb.append("' (JVM signature: ");
                sb.append(str2);
                sb.append(") not resolved in ");
                sb.append(abstractC1330jw);
                sb.append(':');
                sb.append(t0.length() == 0 ? " no members found" : "\n".concat(t0));
                throw new C0526Ue(sb.toString());
            default:
                C1639ob c1639ob = AbstractC0969eP.a;
                PJ p = abstractC1397kx.p();
                AbstractC1330jw abstractC1330jw2 = abstractC1397kx.m;
                AbstractC0868ct b = AbstractC0969eP.b(p);
                if (!(b instanceof C1988tv)) {
                    if (b instanceof C1856rv) {
                        return ((C1856rv) b).s;
                    }
                    if ((b instanceof C1922sv) || (b instanceof C2054uv)) {
                        return null;
                    }
                    throw new C0057Cc();
                }
                C1988tv c1988tv = (C1988tv) b;
                CK ck = c1988tv.t;
                PJ pj = c1988tv.s;
                C1649ol c1649ol = C0206Hv.a;
                C1395kv b2 = C0206Hv.b(ck, c1988tv.v, c1988tv.w, true);
                if (b2 == null) {
                    return null;
                }
                if (pj.M() != 2) {
                    InterfaceC1118gg n = pj.n();
                    if (n == null) {
                        AbstractC0048Bt.a(1);
                        throw null;
                    }
                    if (AbstractC0114Eh.l(n)) {
                        InterfaceC1118gg n2 = n.n();
                        if (AbstractC0114Eh.n(n2, 1) || AbstractC0114Eh.n(n2, 3)) {
                            LinkedHashSet linkedHashSet = C2101vc.a;
                            break;
                        }
                    }
                    if (AbstractC0114Eh.l(pj.n())) {
                        C0325Ml R = pj.R();
                        if (R == null || !R.getAnnotations().i(AbstractC0412Pu.a)) {
                            i = pj.getAnnotations().i(AbstractC0412Pu.a);
                            break;
                        } else {
                            i = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z || C0206Hv.d(ck)) {
                    enclosingClass = abstractC1330jw2.e().getEnclosingClass();
                } else {
                    InterfaceC1118gg n3 = pj.n();
                    enclosingClass = n3 instanceof InterfaceC1245ib ? JY.j((InterfaceC1245ib) n3) : abstractC1330jw2.e();
                }
                if (enclosingClass == null) {
                    return null;
                }
                try {
                    return enclosingClass.getDeclaredField(b2.h);
                } catch (NoSuchFieldException unused) {
                    return null;
                }
        }
    }
}
