package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.hb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1179hb implements InterfaceC1578ng {
    public final C2217xM a;
    public final AbstractC1596ny b;
    public final C1400l c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [o.ny, o.vp] */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.ny, o.vp] */
    public C1179hb(C2217xM c2217xM, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2217xM, "jClass");
        this.a = c2217xM;
        this.b = (AbstractC1596ny) interfaceC2114vp;
        C1400l c1400l = new C1400l(10, this);
        this.c = c1400l;
        C0730am c0730am = new C0730am(AbstractC0720ac.i0(c2217xM.d()), true, c1400l);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0663Zl c0663Zl = new C0663Zl(c0730am);
        while (c0663Zl.hasNext()) {
            Object next = c0663Zl.next();
            C0827cE c = ((GM) next).c();
            Object obj = linkedHashMap.get(c);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c, obj);
            }
            ((List) obj).add(next);
        }
        this.d = linkedHashMap;
        C0730am c0730am2 = new C0730am(AbstractC0720ac.i0(this.a.b()), true, this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C0663Zl c0663Zl2 = new C0663Zl(c0730am2);
        while (c0663Zl2.hasNext()) {
            Object next2 = c0663Zl2.next();
            linkedHashMap2.put(((DM) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList e = this.a.e();
        ?? r6 = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) r6.invoke(next3)).booleanValue()) {
                arrayList.add(next3);
            }
        }
        int E = EB.E(AbstractC0786bc.d0(arrayList));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(E < 16 ? 16 : E);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((JM) next4).c(), next4);
        }
        this.f = linkedHashMap3;
    }

    @Override // o.InterfaceC1578ng
    public final Set a() {
        C0730am c0730am = new C0730am(AbstractC0720ac.i0(this.a.d()), true, this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0663Zl c0663Zl = new C0663Zl(c0730am);
        while (c0663Zl.hasNext()) {
            linkedHashSet.add(((GM) c0663Zl.next()).c());
        }
        return linkedHashSet;
    }

    @Override // o.InterfaceC1578ng
    public final Set b() {
        return this.f.keySet();
    }

    @Override // o.InterfaceC1578ng
    public final DM c(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        return (DM) this.e.get(c0827cE);
    }

    @Override // o.InterfaceC1578ng
    public final Collection d(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        List list = (List) this.d.get(c0827cE);
        return list != null ? list : C1318jk.h;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [o.ny, o.vp] */
    @Override // o.InterfaceC1578ng
    public final Set e() {
        C0730am c0730am = new C0730am(AbstractC0720ac.i0(this.a.b()), true, this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C0663Zl c0663Zl = new C0663Zl(c0730am);
        while (c0663Zl.hasNext()) {
            linkedHashSet.add(((DM) c0663Zl.next()).c());
        }
        return linkedHashSet;
    }

    @Override // o.InterfaceC1578ng
    public final JM f(C0827cE c0827cE) {
        AbstractC0048Bt.n(c0827cE, "name");
        return (JM) this.f.get(c0827cE);
    }
}
