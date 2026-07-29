package o;

/* renamed from: o.kv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395kv extends AbstractC1052fg {
    public final String h;
    public final String i;

    public C1395kv(String str, String str2) {
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "desc");
        this.h = str;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1395kv)) {
            return false;
        }
        C1395kv c1395kv = (C1395kv) obj;
        return AbstractC0048Bt.h(this.h, c1395kv.h) && AbstractC0048Bt.h(this.i, c1395kv.i);
    }

    @Override // o.AbstractC1052fg
    public final String f() {
        return this.h + ':' + this.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + (this.h.hashCode() * 31);
    }
}
