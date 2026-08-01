package g0;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: g0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157j extends AbstractC0142L {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0159l f2919a;

    public C0157j(C0159l c0159l) {
        this.f2919a = c0159l;
    }

    @Override // g0.AbstractC0142L
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0159l c0159l = this.f2919a;
        int computeVerticalScrollRange = c0159l.f2944s.computeVerticalScrollRange();
        int i3 = c0159l.f2943r;
        int i4 = computeVerticalScrollRange - i3;
        int i5 = c0159l.f2929a;
        c0159l.f2945t = i4 > 0 && i3 >= i5;
        int computeHorizontalScrollRange = c0159l.f2944s.computeHorizontalScrollRange();
        int i6 = c0159l.f2942q;
        boolean z2 = computeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        c0159l.f2946u = z2;
        boolean z3 = c0159l.f2945t;
        if (!z3 && !z2) {
            if (c0159l.f2947v != 0) {
                c0159l.f(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i3;
            c0159l.f2937l = (int) ((((f2 / 2.0f) + computeVerticalScrollOffset) * f2) / computeVerticalScrollRange);
            c0159l.f2936k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (c0159l.f2946u) {
            float f3 = computeHorizontalScrollOffset;
            float f4 = i6;
            c0159l.f2940o = (int) ((((f4 / 2.0f) + f3) * f4) / computeHorizontalScrollRange);
            c0159l.f2939n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = c0159l.f2947v;
        if (i7 == 0 || i7 == 1) {
            c0159l.f(1);
        }
    }
}
