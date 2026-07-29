package o;

/* renamed from: o.cI, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0831cI implements InterfaceC0699aH {
    public final M5 b;
    public final AbstractC1415lB c;

    public C0831cI(M5 m5, AbstractC1415lB abstractC1415lB) {
        this.b = m5;
        this.c = abstractC1415lB;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0831cI)) {
            return false;
        }
        C0831cI c0831cI = (C0831cI) obj;
        return AbstractC0048Bt.h(this.b, c0831cI.b) && AbstractC0048Bt.h(this.c, c0831cI.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // o.InterfaceC0699aH
    public final boolean j() {
        return this.c.L().u();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.b + ", placeable=" + this.c + ')';
    }
}
