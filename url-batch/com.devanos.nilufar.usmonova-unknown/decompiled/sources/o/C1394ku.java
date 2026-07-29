package o;

/* renamed from: o.ku, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394ku {
    public final C1639ob a;
    public final C1639ob b;
    public final C1639ob c;

    public C1394ku(C1639ob c1639ob, C1639ob c1639ob2, C1639ob c1639ob3) {
        this.a = c1639ob;
        this.b = c1639ob2;
        this.c = c1639ob3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1394ku)) {
            return false;
        }
        C1394ku c1394ku = (C1394ku) obj;
        return AbstractC0048Bt.h(this.a, c1394ku.a) && AbstractC0048Bt.h(this.b, c1394ku.b) && AbstractC0048Bt.h(this.c, c1394ku.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
