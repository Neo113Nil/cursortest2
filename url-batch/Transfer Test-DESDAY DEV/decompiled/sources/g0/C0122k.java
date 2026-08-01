package g0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122k extends L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0124m f2486a;

    public C0122k(C0124m c0124m) {
        this.f2486a = c0124m;
    }

    @Override // g0.L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0124m c0124m = this.f2486a;
        int computeVerticalScrollRange = c0124m.f2508s.computeVerticalScrollRange();
        int i3 = c0124m.f2507r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0124m.f2493a;
        c0124m.f2509t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0124m.f2508s.computeHorizontalScrollRange();
        int i6 = c0124m.f2506q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0124m.f2510u = z2;
        boolean z3 = c0124m.f2509t;
        if (!z3 && !z2) {
            if (c0124m.f2511v != 0) {
                c0124m.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0124m.f2501l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0124m.f2500k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0124m.f2510u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0124m.f2504o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0124m.f2503n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0124m.f2511v;
        if (i7 == 0 || i7 == 1) {
            c0124m.f(1);
        }
    }
}
