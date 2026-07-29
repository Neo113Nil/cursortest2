package o;

/* loaded from: classes.dex */
public final class ND {
    public final MD a;

    public /* synthetic */ ND(MD md) {
        this.a = md;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ND) {
            return AbstractC0048Bt.h(this.a, ((ND) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.a + ')';
    }
}
