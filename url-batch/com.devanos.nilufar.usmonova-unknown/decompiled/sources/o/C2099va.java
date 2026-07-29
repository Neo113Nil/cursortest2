package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.va, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2099va {
    public static final C2099va c = new C2099va(AbstractC0720ac.M0(new ArrayList()), null);
    public final Set a;
    public final AbstractC1305jX b;

    public C2099va(Set set, AbstractC1305jX abstractC1305jX) {
        this.a = set;
        this.b = abstractC1305jX;
    }

    public final void a(String str, InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(str, "hostname");
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2099va)) {
            return false;
        }
        C2099va c2099va = (C2099va) obj;
        return AbstractC0048Bt.h(c2099va.a, this.a) && AbstractC0048Bt.h(c2099va.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 1517) * 41;
        AbstractC1305jX abstractC1305jX = this.b;
        return hashCode + (abstractC1305jX != null ? abstractC1305jX.hashCode() : 0);
    }
}
