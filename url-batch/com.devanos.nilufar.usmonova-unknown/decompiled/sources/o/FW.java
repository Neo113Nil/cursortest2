package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class FW implements Serializable {
    public final Object h;
    public final Object i;
    public final Object j;

    public FW(Object obj, Object obj2, Object obj3) {
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FW)) {
            return false;
        }
        FW fw = (FW) obj;
        return AbstractC0048Bt.h(this.h, fw.h) && AbstractC0048Bt.h(this.i, fw.i) && AbstractC0048Bt.h(this.j, fw.j);
    }

    public final int hashCode() {
        Object obj = this.h;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.i;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.j;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.h + ", " + this.i + ", " + this.j + ')';
    }
}
