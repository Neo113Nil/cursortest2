package s;

import java.util.ArrayList;
import t.AbstractC0309h;
import t.C0315n;

/* loaded from: classes.dex */
public abstract class i extends C0299d {

    /* renamed from: q0, reason: collision with root package name */
    public C0299d[] f3731q0 = new C0299d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3732r0 = 0;

    public final void R(int i, ArrayList arrayList, C0315n c0315n) {
        for (int i2 = 0; i2 < this.f3732r0; i2++) {
            C0299d c0299d = this.f3731q0[i2];
            ArrayList arrayList2 = c0315n.f3771a;
            if (!arrayList2.contains(c0299d)) {
                arrayList2.add(c0299d);
            }
        }
        for (int i3 = 0; i3 < this.f3732r0; i3++) {
            AbstractC0309h.b(this.f3731q0[i3], i, arrayList, c0315n);
        }
    }

    public void S() {
    }
}
