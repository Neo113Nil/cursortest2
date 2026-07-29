package o;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: o.vq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2115vq extends E implements Serializable {
    public static C2049uq g(E e, E e2, int i, I10 i10, Class cls) {
        return new C2049uq(e, Collections.EMPTY_LIST, e2, new C1983tq(i, i10, true), cls);
    }

    public static C2049uq h(E e, Object obj, E e2, int i, I10 i10, Class cls) {
        return new C2049uq(e, obj, e2, new C1983tq(i, i10, false), cls);
    }
}
