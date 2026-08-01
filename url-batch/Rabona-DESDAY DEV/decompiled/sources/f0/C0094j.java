package f0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094j extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0096l f2102a;

    public C0094j(C0096l c0096l) {
        this.f2102a = c0096l;
    }

    @Override // f0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0096l c0096l = this.f2102a;
        int computeVerticalScrollRange = c0096l.f2124s.computeVerticalScrollRange();
        int i3 = c0096l.f2123r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0096l.f2109a;
        c0096l.f2125t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0096l.f2124s.computeHorizontalScrollRange();
        int i6 = c0096l.f2122q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0096l.f2126u = z2;
        boolean z3 = c0096l.f2125t;
        if (!z3 && !z2) {
            if (c0096l.f2127v != 0) {
                c0096l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0096l.f2117l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0096l.f2116k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0096l.f2126u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0096l.f2120o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0096l.f2119n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0096l.f2127v;
        if (i7 == 0 || i7 == 1) {
            c0096l.f(1);
        }
    }
}
