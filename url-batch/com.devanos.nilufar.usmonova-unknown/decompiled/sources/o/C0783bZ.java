package o;

/* renamed from: o.bZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783bZ {
    public final V3 a;
    public final InterfaceC2372zj b;

    public C0783bZ(V3 v3, InterfaceC2372zj interfaceC2372zj) {
        this.a = v3;
        this.b = interfaceC2372zj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0783bZ)) {
            return false;
        }
        C0783bZ c0783bZ = (C0783bZ) obj;
        return AbstractC0048Bt.h(this.a, c0783bZ.a) && AbstractC0048Bt.h(this.b, c0783bZ.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
