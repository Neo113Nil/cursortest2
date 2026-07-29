package o;

/* renamed from: o.fb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1047fb {
    public final InterfaceC0893dE a;
    public final C1030fK b;
    public final AbstractC1478m8 c;
    public final IS d;

    public C1047fb(InterfaceC0893dE interfaceC0893dE, C1030fK c1030fK, AbstractC1478m8 abstractC1478m8, IS is) {
        AbstractC0048Bt.n(interfaceC0893dE, "nameResolver");
        AbstractC0048Bt.n(c1030fK, "classProto");
        AbstractC0048Bt.n(is, "sourceElement");
        this.a = interfaceC0893dE;
        this.b = c1030fK;
        this.c = abstractC1478m8;
        this.d = is;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1047fb)) {
            return false;
        }
        C1047fb c1047fb = (C1047fb) obj;
        return AbstractC0048Bt.h(this.a, c1047fb.a) && AbstractC0048Bt.h(this.b, c1047fb.b) && AbstractC0048Bt.h(this.c, c1047fb.c) && AbstractC0048Bt.h(this.d, c1047fb.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
