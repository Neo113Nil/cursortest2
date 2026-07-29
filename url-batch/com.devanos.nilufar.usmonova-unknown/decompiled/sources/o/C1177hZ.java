package o;

import java.math.BigInteger;

/* renamed from: o.hZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1177hZ implements Comparable {
    public static final C1177hZ m;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final BU l = EB.D(new LE(17, this));

    static {
        new C1177hZ(0, 0, 0, "");
        m = new C1177hZ(0, 1, 0, "");
        new C1177hZ(1, 0, 0, "");
    }

    public C1177hZ(int i, int i2, int i3, String str) {
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1177hZ c1177hZ = (C1177hZ) obj;
        AbstractC0048Bt.n(c1177hZ, "other");
        Object value = this.l.getValue();
        AbstractC0048Bt.m(value, "<get-bigInteger>(...)");
        Object value2 = c1177hZ.l.getValue();
        AbstractC0048Bt.m(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1177hZ)) {
            return false;
        }
        C1177hZ c1177hZ = (C1177hZ) obj;
        return this.h == c1177hZ.h && this.i == c1177hZ.i && this.j == c1177hZ.j;
    }

    public final int hashCode() {
        return ((((527 + this.h) * 31) + this.i) * 31) + this.j;
    }

    public final String toString() {
        String str;
        String str2 = this.k;
        if (UT.J(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.h + '.' + this.i + '.' + this.j + str;
    }
}
