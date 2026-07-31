package yads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class p82 extends gb2 implements Serializable {
    public static final p82 b = new p82();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // yads.gb2
    public final gb2 a() {
        return lq2.b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
