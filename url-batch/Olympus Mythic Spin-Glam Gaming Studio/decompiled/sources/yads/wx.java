package yads;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public final class wx extends gb2 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator b;

    public wx(Comparator comparator) {
        comparator.getClass();
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wx) {
            return this.b.equals(((wx) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
