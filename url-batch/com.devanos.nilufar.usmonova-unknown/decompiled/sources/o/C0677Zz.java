package o;

/* renamed from: o.Zz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677Zz extends AbstractC0692aA {
    public final String a;
    public final C1435lV b;

    public C0677Zz(String str, C1435lV c1435lV) {
        this.a = str;
        this.b = c1435lV;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0677Zz)) {
            return false;
        }
        C0677Zz c0677Zz = (C0677Zz) obj;
        if (!AbstractC0048Bt.h(this.a, c0677Zz.a) || !AbstractC0048Bt.h(this.b, c0677Zz.b)) {
            return false;
        }
        c0677Zz.getClass();
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        C1435lV c1435lV = this.b;
        return (hashCode + (c1435lV != null ? c1435lV.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return AbstractC2188wx.h(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }
}
