package g0;

import android.util.SparseArray;
import java.util.Set;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2357a;

    /* renamed from: b, reason: collision with root package name */
    public int f2358b;

    /* renamed from: c, reason: collision with root package name */
    public Set f2359c;

    public final M a(int i) {
        SparseArray sparseArray = this.f2357a;
        M m2 = (M) sparseArray.get(i);
        if (m2 != null) {
            return m2;
        }
        M m3 = new M();
        sparseArray.put(i, m3);
        return m3;
    }
}
