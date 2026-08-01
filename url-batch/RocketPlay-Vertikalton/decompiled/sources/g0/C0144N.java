package g0;

import android.util.SparseArray;
import java.util.Set;

/* renamed from: g0.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144N {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f2795a;

    /* renamed from: b, reason: collision with root package name */
    public int f2796b;

    /* renamed from: c, reason: collision with root package name */
    public Set f2797c;

    public final C0143M a(int i) {
        SparseArray sparseArray = this.f2795a;
        C0143M c0143m = (C0143M) sparseArray.get(i);
        if (c0143m != null) {
            return c0143m;
        }
        C0143M c0143m2 = new C0143M();
        sparseArray.put(i, c0143m2);
        return c0143m2;
    }
}
