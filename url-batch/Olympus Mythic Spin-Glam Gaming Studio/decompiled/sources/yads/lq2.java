package yads;

import java.io.Serializable;

/* loaded from: classes6.dex */
public final class lq2 extends gb2 implements Serializable {
    public static final lq2 b = new lq2();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // yads.gb2
    public final gb2 a() {
        return p82.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
