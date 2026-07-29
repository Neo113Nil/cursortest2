package o;

/* renamed from: o.oX, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1635oX {
    public final InterfaceC1437lX a;
    public final C1658ou b;

    public C1635oX(InterfaceC1437lX interfaceC1437lX, C1658ou c1658ou) {
        AbstractC0048Bt.n(interfaceC1437lX, "typeParameter");
        AbstractC0048Bt.n(c1658ou, "typeAttr");
        this.a = interfaceC1437lX;
        this.b = c1658ou;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1635oX)) {
            return false;
        }
        C1635oX c1635oX = (C1635oX) obj;
        return AbstractC0048Bt.h(c1635oX.a, this.a) && AbstractC0048Bt.h(c1635oX.b, this.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.b.hashCode() + (hashCode * 31) + hashCode;
    }

    public final String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.a + ", typeAttr=" + this.b + ')';
    }
}
