package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fa {
    static {
        List V = va.V(dl.class, ol.class, sl.class, tl.class, ul.class, vl.class, wl.class, xl.class, yl.class, zl.class, el.class, fl.class, gl.class, hl.class, il.class, jl.class, kl.class, ll.class, ml.class, nl.class, pl.class, ql.class, rl.class);
        ArrayList arrayList = new ArrayList(wa.Y(V));
        int i = 0;
        for (Object obj : V) {
            int i2 = i + 1;
            if (i < 0) {
                va.X();
                throw null;
            }
            arrayList.add(new bw((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        hr.h0(arrayList);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fa) && oo.q(this).equals(oo.q((fa) obj));
    }

    public final int hashCode() {
        return oo.q(this).hashCode();
    }

    public final String toString() {
        return t00.class + " (Kotlin reflection is not available)";
    }
}
