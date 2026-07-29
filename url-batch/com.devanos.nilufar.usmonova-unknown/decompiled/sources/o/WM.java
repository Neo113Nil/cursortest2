package o;

import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* loaded from: classes.dex */
public class WM extends VM {
    public static AbstractC1330jw j(AbstractC2336z9 abstractC2336z9) {
        InterfaceC1134gw owner = abstractC2336z9.getOwner();
        return owner instanceof AbstractC1330jw ? (AbstractC1330jw) owner : C1122gk.i;
    }

    @Override // o.VM
    public final InterfaceC1396kw a(AbstractC0485Sp abstractC0485Sp) {
        AbstractC1330jw j = j(abstractC0485Sp);
        String name = abstractC0485Sp.getName();
        String signature = abstractC0485Sp.getSignature();
        Object boundReceiver = abstractC0485Sp.getBoundReceiver();
        AbstractC0048Bt.n(j, "container");
        AbstractC0048Bt.n(name, "name");
        AbstractC0048Bt.n(signature, "signature");
        return new C1528mw(j, name, signature, null, boundReceiver);
    }

    @Override // o.VM
    public final InterfaceC0517Tv b(Class cls) {
        return AbstractC1743q9.a(cls);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [o.ny, o.vp] */
    @Override // o.VM
    public final InterfaceC1134gw c(Class cls, String str) {
        Object putIfAbsent;
        C2002u5 c2002u5 = AbstractC1743q9.a;
        AbstractC0048Bt.n(cls, "jClass");
        C2002u5 c2002u52 = AbstractC1743q9.b;
        c2002u52.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2002u52.j;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls, (obj = ((AbstractC1596ny) c2002u52.i).invoke(cls)))) != null) {
            obj = putIfAbsent;
        }
        return (InterfaceC1134gw) obj;
    }

    @Override // o.VM
    public final InterfaceC1989tw d(O2 o2) {
        return new C2121vw(j(o2), o2.getName(), o2.getSignature(), o2.getBoundReceiver());
    }

    @Override // o.VM
    public final InterfaceC2253xw e(JD jd) {
        return new C2385zw(j(jd), jd.getName(), jd.getSignature(), jd.getBoundReceiver());
    }

    @Override // o.VM
    public final InterfaceC0466Rw f(WA wa) {
        return new C0544Uw(j(wa), wa.getName(), wa.getSignature(), wa.getBoundReceiver());
    }

    @Override // o.VM
    public final InterfaceC0596Ww g(TJ tj) {
        return new C0674Zw(j(tj), tj.getName(), tj.getSignature(), tj.getBoundReceiver());
    }

    @Override // o.VM
    public final String h(InterfaceC0200Hp interfaceC0200Hp) {
        C1528mw b;
        Metadata metadata = (Metadata) interfaceC0200Hp.getClass().getAnnotation(Metadata.class);
        C1528mw c1528mw = null;
        if (metadata != null) {
            String[] d1 = metadata.d1();
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                String[] d2 = metadata.d2();
                C1649ol c1649ol = C0206Hv.a;
                AbstractC0048Bt.n(d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC1544n8.a(d1));
                C1649ol c1649ol2 = C0206Hv.a;
                C1593nv g = C0206Hv.g(byteArrayInputStream, d2);
                C1649ol c1649ol3 = C0206Hv.a;
                C2120vv c2120vv = C2017uK.C;
                c2120vv.getClass();
                C0523Ub c0523Ub = new C0523Ub(byteArrayInputStream);
                E e = (E) c2120vv.a(c0523Ub, c1649ol3);
                try {
                    c0523Ub.a(0);
                    if (!e.b()) {
                        C0204Ht c0204Ht = new C0204Ht(new C0057Cc().getMessage());
                        c0204Ht.h = e;
                        throw c0204Ht;
                    }
                    C2017uK c2017uK = (C2017uK) e;
                    C1527mv c1527mv = new C1527mv(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = interfaceC0200Hp.getClass();
                    SK sk = c2017uK.w;
                    AbstractC0048Bt.m(sk, "proto.typeTable");
                    c1528mw = new C1528mw(C1122gk.i, (HR) JY.f(cls, c2017uK, g, new C0695aD(sk), c1527mv, QM.j));
                } catch (C0204Ht e2) {
                    e2.h = e;
                    throw e2;
                }
            }
        }
        if (c1528mw == null || (b = JY.b(c1528mw)) == null) {
            return super.h(interfaceC0200Hp);
        }
        C2304yh c2304yh = XM.a;
        InterfaceC0381Op p = b.p();
        StringBuilder sb = new StringBuilder();
        XM.a(sb, p);
        List t0 = p.t0();
        AbstractC0048Bt.m(t0, "invoke.valueParameters");
        AbstractC0720ac.s0(t0, sb, ", ", "(", ")", WI.q, 48);
        sb.append(" -> ");
        AbstractC1004ey returnType = p.getReturnType();
        AbstractC0048Bt.k(returnType);
        sb.append(XM.d(returnType));
        String sb2 = sb.toString();
        AbstractC0048Bt.m(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @Override // o.VM
    public final String i(AbstractC1596ny abstractC1596ny) {
        return h(abstractC1596ny);
    }
}
