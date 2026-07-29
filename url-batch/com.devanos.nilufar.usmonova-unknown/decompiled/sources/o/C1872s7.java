package o;

/* renamed from: o.s7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1872s7 extends AbstractC0134Fb {
    public final C1675p7 a;

    public C1872s7(C1675p7 c1675p7) {
        this.a = c1675p7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0134Fb)) {
            return false;
        }
        AbstractC0134Fb abstractC0134Fb = (AbstractC0134Fb) obj;
        ((C1872s7) abstractC0134Fb).getClass();
        Object obj2 = EnumC0108Eb.h;
        if (obj2.equals(obj2)) {
            return this.a.equals(((C1872s7) abstractC0134Fb).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((EnumC0108Eb.h.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + EnumC0108Eb.h + ", androidClientInfo=" + this.a + "}";
    }
}
