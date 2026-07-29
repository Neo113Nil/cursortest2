package o;

/* loaded from: classes.dex */
public final class TS {
    public final C0827cE a;
    public final String b;

    public TS(C0827cE c0827cE, String str) {
        AbstractC0048Bt.n(str, "signature");
        this.a = c0827cE;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TS)) {
            return false;
        }
        TS ts = (TS) obj;
        return AbstractC0048Bt.h(this.a, ts.a) && AbstractC0048Bt.h(this.b, ts.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(name=");
        sb.append(this.a);
        sb.append(", signature=");
        return AbstractC2188wx.h(sb, this.b, ')');
    }
}
