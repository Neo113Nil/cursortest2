package o;

/* renamed from: o.Lu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308Lu {
    public final Integer a;
    public final Object b;

    public C0308Lu(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0308Lu)) {
            return false;
        }
        C0308Lu c0308Lu = (C0308Lu) obj;
        return this.a.equals(c0308Lu.a) && AbstractC0048Bt.h(this.b, c0308Lu.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
