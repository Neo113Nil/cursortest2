package o;

/* renamed from: o.Yz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651Yz extends AbstractC0692aA {
    public final String a;
    public final C1435lV b;

    public C0651Yz(String str, C1435lV c1435lV) {
        this.a = str;
        this.b = c1435lV;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0651Yz)) {
            return false;
        }
        C0651Yz c0651Yz = (C0651Yz) obj;
        if (!AbstractC0048Bt.h(this.a, c0651Yz.a) || !AbstractC0048Bt.h(this.b, c0651Yz.b)) {
            return false;
        }
        c0651Yz.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        C1435lV c1435lV = this.b;
        return (hashCode + (c1435lV != null ? c1435lV.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
