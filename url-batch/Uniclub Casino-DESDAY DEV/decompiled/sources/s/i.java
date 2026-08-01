package s;

import java.util.ArrayList;
import t.AbstractC0306h;
import t.C0312n;

/* loaded from: classes.dex */
public abstract class i extends C0296d {

    /* renamed from: q0, reason: collision with root package name */
    public C0296d[] f3758q0 = new C0296d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3759r0 = 0;

    public final void R(int i, ArrayList arrayList, C0312n c0312n) {
        for (int i2 = 0; i2 < this.f3759r0; i2++) {
            C0296d c0296d = this.f3758q0[i2];
            ArrayList arrayList2 = c0312n.f3797a;
            if (!arrayList2.contains(c0296d)) {
                arrayList2.add(c0296d);
            }
        }
        for (int i3 = 0; i3 < this.f3759r0; i3++) {
            AbstractC0306h.b(this.f3758q0[i3], i, arrayList, c0312n);
        }
    }

    public void S() {
    }
}
