package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class mf extends ze {
    public int m;

    public mf(w90 w90Var) {
        super(w90Var);
        if (w90Var instanceof tm) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.ze
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xe xeVar = (xe) obj;
            xeVar.a(xeVar);
        }
    }
}
