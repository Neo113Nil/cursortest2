package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0108l f2104a;

    public C0106j(C0108l c0108l) {
        this.f2104a = c0108l;
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0108l c0108l = this.f2104a;
        int computeVerticalScrollRange = c0108l.f2126s.computeVerticalScrollRange();
        int i3 = c0108l.f2125r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0108l.f2111a;
        c0108l.f2127t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0108l.f2126s.computeHorizontalScrollRange();
        int i6 = c0108l.f2124q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0108l.f2128u = z2;
        boolean z3 = c0108l.f2127t;
        if (!z3 && !z2) {
            if (c0108l.f2129v != 0) {
                c0108l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0108l.f2119l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0108l.f2118k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0108l.f2128u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0108l.f2122o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0108l.f2121n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0108l.f2129v;
        if (i7 == 0 || i7 == 1) {
            c0108l.f(1);
        }
    }
}
