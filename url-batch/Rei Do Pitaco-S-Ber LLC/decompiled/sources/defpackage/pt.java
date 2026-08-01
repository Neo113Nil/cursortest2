package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class pt {
    public final SparseArray a;
    public t60 b;

    public pt(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(t60 t60Var, int i, int i2) {
        int a = t60Var.a(i);
        SparseArray sparseArray = this.a;
        pt ptVar = sparseArray == null ? null : (pt) sparseArray.get(a);
        if (ptVar == null) {
            ptVar = new pt(1);
            sparseArray.put(t60Var.a(i), ptVar);
        }
        if (i2 > i) {
            ptVar.a(t60Var, i + 1, i2);
        } else {
            ptVar.b = t60Var;
        }
    }
}
