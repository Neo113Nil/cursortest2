package o;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class D7 {
    public final InterfaceC0212Ib a;
    public final HashMap b;

    public D7(InterfaceC0212Ib interfaceC0212Ib, HashMap hashMap) {
        this.a = interfaceC0212Ib;
        this.b = hashMap;
    }

    public final long a(EnumC1489mJ enumC1489mJ, long j, int i) {
        long a = j - this.a.a();
        E7 e7 = (E7) this.b.get(enumC1489mJ);
        long j2 = e7.a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), a), e7.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D7)) {
            return false;
        }
        D7 d7 = (D7) obj;
        return this.a.equals(d7.a) && this.b.equals(d7.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
