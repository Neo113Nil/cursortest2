package o;

/* renamed from: o.bV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0779bV {
    public final Y3 a;
    public final long b;
    public final C1501mV c;

    public C0779bV(Y3 y3, long j) {
        this.a = y3;
        int length = y3.h.length();
        int i = C1501mV.c;
        int i2 = (int) (j >> 32);
        int q = AbstractC1807r8.q(i2, 0, length);
        int i3 = (int) (4294967295L & j);
        int q2 = AbstractC1807r8.q(i3, 0, length);
        this.b = (q == i2 && q2 == i3) ? j : AbstractC1494mO.a(q, q2);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0779bV)) {
            return false;
        }
        C0779bV c0779bV = (C0779bV) obj;
        long j = c0779bV.b;
        int i = C1501mV.c;
        return this.b == j && AbstractC0048Bt.h(this.c, c0779bV.c) && AbstractC0048Bt.h(this.a, c0779bV.a);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = C1501mV.c;
        int hashCode2 = (Long.hashCode(this.b) + hashCode) * 31;
        C1501mV c1501mV = this.c;
        return hashCode2 + (c1501mV != null ? Long.hashCode(c1501mV.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) C1501mV.a(this.b)) + ", composition=" + this.c + ')';
    }
}
