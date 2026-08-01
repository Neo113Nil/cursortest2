package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class am {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            l8.l("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            l8.l("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        ny nyVar = recyclerView.s;
        if (recyclerView.r == null || nyVar == null || !nyVar.i) {
            return;
        }
        if (z) {
            if (!recyclerView.j.k()) {
                nyVar.i(recyclerView.r.a(), this);
            }
        } else if (!recyclerView.O()) {
            nyVar.h(this.a, this.b, recyclerView.l0, this);
        }
        int i = this.d;
        if (i > nyVar.j) {
            nyVar.j = i;
            nyVar.k = z;
            recyclerView.h.n();
        }
    }
}
