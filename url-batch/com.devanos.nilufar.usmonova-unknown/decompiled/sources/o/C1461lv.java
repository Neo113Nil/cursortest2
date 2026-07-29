package o;

/* renamed from: o.lv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461lv extends AbstractC1052fg {
    public final String h;
    public final String i;

    public C1461lv(String str, String str2) {
        AbstractC0048Bt.n(str, "name");
        AbstractC0048Bt.n(str2, "desc");
        this.h = str;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1461lv)) {
            return false;
        }
        C1461lv c1461lv = (C1461lv) obj;
        return AbstractC0048Bt.h(this.h, c1461lv.h) && AbstractC0048Bt.h(this.i, c1461lv.i);
    }

    @Override // o.AbstractC1052fg
    public final String f() {
        return this.h + this.i;
    }

    public final int hashCode() {
        return this.i.hashCode() + (this.h.hashCode() * 31);
    }
}
