package s;

import java.util.ArrayList;
import t.o;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f4090q0 = new d[4];
    public int r0 = 0;

    public final void R(int i, ArrayList arrayList, o oVar) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            d dVar = this.f4090q0[i2];
            ArrayList arrayList2 = oVar.f4151a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            t.h.b(this.f4090q0[i3], i, arrayList, oVar);
        }
    }

    public void S() {
    }
}
