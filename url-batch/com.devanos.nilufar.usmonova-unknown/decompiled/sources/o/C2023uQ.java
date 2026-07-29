package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.uQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2023uQ implements Iterable, InterfaceC1594nw {
    public final LinkedHashMap h = new LinkedHashMap();
    public boolean i;
    public boolean j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2023uQ)) {
            return false;
        }
        C2023uQ c2023uQ = (C2023uQ) obj;
        return AbstractC0048Bt.h(this.h, c2023uQ.h) && this.i == c2023uQ.i && this.j == c2023uQ.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ((Boolean.hashCode(this.i) + (this.h.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.h.entrySet().iterator();
    }

    public final Object j(FQ fq) {
        Object obj = this.h.get(fq);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + fq + " - consider getOrElse or getOrNull");
    }

    public final void k(FQ fq, Object obj) {
        boolean z = obj instanceof C1599o0;
        LinkedHashMap linkedHashMap = this.h;
        if (!z || !linkedHashMap.containsKey(fq)) {
            linkedHashMap.put(fq, obj);
            return;
        }
        Object obj2 = linkedHashMap.get(fq);
        AbstractC0048Bt.l(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        C1599o0 c1599o0 = (C1599o0) obj2;
        C1599o0 c1599o02 = (C1599o0) obj;
        String str = c1599o02.a;
        if (str == null) {
            str = c1599o0.a;
        }
        InterfaceC0174Gp interfaceC0174Gp = c1599o02.b;
        if (interfaceC0174Gp == null) {
            interfaceC0174Gp = c1599o0.b;
        }
        linkedHashMap.put(fq, new C1599o0(str, interfaceC0174Gp));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.i) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.j) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.h.entrySet()) {
            FQ fq = (FQ) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(fq.a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return AbstractC0946e20.O(this) + "{ " + ((Object) sb) + " }";
    }
}
