package d0;

import Y.K;
import androidx.lifecycle.O;
import o.l;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0105a extends O {

    /* renamed from: c, reason: collision with root package name */
    public static final K f2520c = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final l f2521b = new l();

    @Override // androidx.lifecycle.O
    public final void b() {
        l lVar = this.f2521b;
        int i = lVar.f3615c;
        if (i > 0) {
            lVar.f3614b[0].getClass();
            throw new ClassCastException();
        }
        Object[] objArr = lVar.f3614b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        lVar.f3615c = 0;
    }
}
