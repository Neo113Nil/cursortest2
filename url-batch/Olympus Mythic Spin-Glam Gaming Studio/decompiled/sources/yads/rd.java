package yads;

import android.util.SparseArray;

/* loaded from: classes4.dex */
public final class rd {
    public final zu0 a;
    public final SparseArray b;

    public rd(zu0 zu0Var, SparseArray sparseArray) {
        this.a = zu0Var;
        SparseArray sparseArray2 = new SparseArray(zu0Var.a.size());
        for (int i = 0; i < zu0Var.a.size(); i++) {
            int a = zu0Var.a(i);
            qd qdVar = (qd) sparseArray.get(a);
            qdVar.getClass();
            sparseArray2.append(a, qdVar);
        }
        this.b = sparseArray2;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }
}
