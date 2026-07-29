package o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0808bz {
    public final AbstractC1004ey a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public C0808bz(AbstractC1004ey abstractC1004ey, List list, ArrayList arrayList, List list2) {
        this.a = abstractC1004ey;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0808bz)) {
            return false;
        }
        C0808bz c0808bz = (C0808bz) obj;
        return this.a.equals(c0808bz.a) && this.b.equals(c0808bz.b) && this.c.equals(c0808bz.c) && this.d.equals(c0808bz.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 961);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
