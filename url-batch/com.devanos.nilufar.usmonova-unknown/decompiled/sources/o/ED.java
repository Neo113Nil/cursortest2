package o;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ED extends C2338zB {
    public final RH j;
    public Object k;

    public ED(RH rh, Object obj, Object obj2) {
        super(obj, obj2);
        this.j = rh;
        this.k = obj2;
    }

    @Override // o.C2338zB, java.util.Map.Entry
    public final Object getValue() {
        return this.k;
    }

    @Override // o.C2338zB, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.k;
        this.k = obj;
        PH ph = (PH) this.j.i;
        HH hh = ph.k;
        Object obj3 = this.h;
        if (!hh.containsKey(obj3)) {
            return obj2;
        }
        boolean z = ph.j;
        if (!z) {
            hh.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            CW cw = ph.h[ph.i];
            Object obj4 = cw.h[cw.j];
            hh.put(obj3, obj);
            ph.d(obj4 != null ? obj4.hashCode() : 0, hh.i, obj4, 0);
        }
        ph.n = hh.k;
        return obj2;
    }
}
