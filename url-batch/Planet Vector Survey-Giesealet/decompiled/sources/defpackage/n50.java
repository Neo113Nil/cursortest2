package defpackage;

import android.util.SparseArray;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class n50 {
    public final SparseArray a;
    public yx0 b;

    public n50(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(yx0 yx0Var, int i, int i2) {
        int a = yx0Var.a(i);
        SparseArray sparseArray = this.a;
        n50 n50Var = sparseArray == null ? null : (n50) sparseArray.get(a);
        if (n50Var == null) {
            n50Var = new n50(1);
            sparseArray.put(yx0Var.a(i), n50Var);
        }
        if (i2 > i) {
            n50Var.a(yx0Var, i + 1, i2);
        } else {
            n50Var.b = yx0Var;
        }
    }
}
