package o;

/* loaded from: classes.dex */
public final class LT implements NY {
    public final Object a;

    public LT(Object obj) {
        this.a = obj;
    }

    @Override // o.NY
    public final Object a(JH jh) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LT) && AbstractC0048Bt.h(this.a, ((LT) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
