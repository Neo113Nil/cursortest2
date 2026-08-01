package g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: g0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125n {

    /* renamed from: a, reason: collision with root package name */
    public int f2516a;

    /* renamed from: b, reason: collision with root package name */
    public int f2517b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2518c;
    public int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = this.f2518c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2518c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2518c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2518c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2518c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        I i = recyclerView.f1621m;
        if (recyclerView.f1619l == null || i == null || !i.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1607e.f()) {
                i.i(recyclerView.f1619l.a(), this);
            }
        } else if (!recyclerView.N()) {
            i.h(this.f2516a, this.f2517b, recyclerView.f1608e0, this);
        }
        int i2 = this.d;
        if (i2 > i.f2345j) {
            i.f2345j = i2;
            i.f2346k = z2;
            recyclerView.f1604c.m();
        }
    }
}
