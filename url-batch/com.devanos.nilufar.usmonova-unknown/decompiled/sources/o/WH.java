package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class WH extends Y implements XH {
    public static final WH k;
    public final Object h;
    public final Object i;
    public final NH j;

    static {
        C0460Rq c0460Rq = C0460Rq.D;
        k = new WH(c0460Rq, c0460Rq, NH.j);
    }

    public WH(Object obj, Object obj2, NH nh) {
        this.h = obj;
        this.i = obj2;
        this.j = nh;
    }

    @Override // o.r, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.j.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2247xq(this.h, this.j);
    }

    @Override // o.r
    public final int j() {
        NH nh = this.j;
        nh.getClass();
        return nh.i;
    }
}
