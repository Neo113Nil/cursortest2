package T;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f744a;

    /* renamed from: b, reason: collision with root package name */
    public x f745b;

    public t(int i) {
        this.f744a = new SparseArray(i);
    }

    public final void a(x xVar, int i, int i2) {
        int a2 = xVar.a(i);
        SparseArray sparseArray = this.f744a;
        t tVar = sparseArray == null ? null : (t) sparseArray.get(a2);
        if (tVar == null) {
            tVar = new t(1);
            sparseArray.put(xVar.a(i), tVar);
        }
        if (i2 > i) {
            tVar.a(xVar, i + 1, i2);
        } else {
            tVar.f745b = xVar;
        }
    }
}
