package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.pd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1707pd implements InterfaceC1159hH {
    public final List a;
    public final String b;

    public C1707pd(String str, List list) {
        AbstractC0048Bt.n(str, "debugName");
        this.a = list;
        this.b = str;
        list.size();
        AbstractC0720ac.M0(list).size();
    }

    @Override // o.InterfaceC1159hH
    public final boolean a(C2245xo c2245xo) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        List list = this.a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!EB.z((InterfaceC1159hH) it.next(), c2245xo)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.InterfaceC1159hH
    public final void b(C2245xo c2245xo, ArrayList arrayList) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            EB.g((InterfaceC1159hH) it.next(), c2245xo, arrayList);
        }
    }

    @Override // o.InterfaceC1159hH
    public final Collection f(C2245xo c2245xo, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2245xo, "fqName");
        HashSet hashSet = new HashSet();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC1159hH) it.next()).f(c2245xo, interfaceC2114vp));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
