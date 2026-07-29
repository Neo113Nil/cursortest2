package o;

import java.io.Serializable;

/* renamed from: o.oH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1619oH implements Serializable {
    public final Object h;
    public final Object i;

    public C1619oH(Object obj, Object obj2) {
        this.h = obj;
        this.i = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1619oH)) {
            return false;
        }
        C1619oH c1619oH = (C1619oH) obj;
        return AbstractC0048Bt.h(this.h, c1619oH.h) && AbstractC0048Bt.h(this.i, c1619oH.i);
    }

    public final int hashCode() {
        Object obj = this.h;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.i;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.h + ", " + this.i + ')';
    }
}
