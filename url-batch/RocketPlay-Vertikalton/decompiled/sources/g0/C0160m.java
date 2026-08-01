package g0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* renamed from: g0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160m {

    /* renamed from: a, reason: collision with root package name */
    public int f2952a;

    /* renamed from: b, reason: collision with root package name */
    public int f2953b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2954c;
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
        int[] iArr = this.f2954c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f2954c = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f2954c = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = this.f2954c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public final void b(RecyclerView recyclerView, boolean z2) {
        this.d = 0;
        int[] iArr = this.f2954c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0139I abstractC0139I = recyclerView.f2000m;
        if (recyclerView.f1998l == null || abstractC0139I == null || !abstractC0139I.i) {
            return;
        }
        if (z2) {
            if (!recyclerView.f1986e.f()) {
                abstractC0139I.i(recyclerView.f1998l.a(), this);
            }
        } else if (!recyclerView.N()) {
            abstractC0139I.h(this.f2952a, this.f2953b, recyclerView.f1987e0, this);
        }
        int i = this.d;
        if (i > abstractC0139I.f2783j) {
            abstractC0139I.f2783j = i;
            abstractC0139I.f2784k = z2;
            recyclerView.f1983c.m();
        }
    }
}
