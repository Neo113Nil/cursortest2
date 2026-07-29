package o;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class MC {
    public final SparseArray a;
    public HX b;

    public MC(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(HX hx, int i, int i2) {
        int a = hx.a(i);
        SparseArray sparseArray = this.a;
        MC mc = sparseArray == null ? null : (MC) sparseArray.get(a);
        if (mc == null) {
            mc = new MC(1);
            sparseArray.put(hx.a(i), mc);
        }
        if (i2 > i) {
            mc.a(hx, i + 1, i2);
        } else {
            mc.b = hx;
        }
    }
}
