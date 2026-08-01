package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class pm extends tc {
    public tc[] q0 = new tc[4];
    public int r0 = 0;

    public final void R(int i, v90 v90Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            tc tcVar = this.q0[i2];
            ArrayList arrayList2 = v90Var.a;
            if (!arrayList2.contains(tcVar)) {
                arrayList2.add(tcVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            g8.x(this.q0[i3], i, arrayList, v90Var);
        }
    }

    public void S() {
    }
}
