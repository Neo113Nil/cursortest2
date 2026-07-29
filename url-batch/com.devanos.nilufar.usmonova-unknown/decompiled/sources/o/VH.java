package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class VH extends r {
    public final NH h;

    public VH(NH nh) {
        this.h = nh;
    }

    @Override // o.r, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.h.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        BW bw = this.h.h;
        CW[] cwArr = new CW[8];
        for (int i = 0; i < 8; i++) {
            cwArr[i] = new DW(2);
        }
        return new UH(bw, cwArr);
    }

    @Override // o.r
    public final int j() {
        NH nh = this.h;
        nh.getClass();
        return nh.i;
    }
}
