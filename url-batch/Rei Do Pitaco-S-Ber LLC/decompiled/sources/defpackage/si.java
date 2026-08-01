package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class si extends qy {
    public final /* synthetic */ ti a;

    public si(ti tiVar) {
        this.a = tiVar;
    }

    @Override // defpackage.qy
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ti tiVar = this.a;
        int i3 = tiVar.a;
        int computeVerticalScrollRange = tiVar.s.computeVerticalScrollRange();
        int i4 = tiVar.r;
        tiVar.t = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int computeHorizontalScrollRange = tiVar.s.computeHorizontalScrollRange();
        int i5 = tiVar.q;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        tiVar.u = z;
        boolean z2 = tiVar.t;
        if (!z2 && !z) {
            if (tiVar.v != 0) {
                tiVar.f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            tiVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            tiVar.k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (tiVar.u) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            tiVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            tiVar.n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = tiVar.v;
        if (i6 == 0 || i6 == 1) {
            tiVar.f(1);
        }
    }
}
