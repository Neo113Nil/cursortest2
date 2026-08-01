package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0291e;
import s.C0298c;
import s.C0299d;
import s.C0300e;
import t.C0303b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3916a;

    /* renamed from: b, reason: collision with root package name */
    public int f3917b;

    /* renamed from: c, reason: collision with root package name */
    public int f3918c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3919e;

    /* renamed from: f, reason: collision with root package name */
    public int f3920f;

    /* renamed from: g, reason: collision with root package name */
    public int f3921g;
    public final /* synthetic */ ConstraintLayout h;

    public C0325f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3916a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(C0299d c0299d, C0303b c0303b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0299d == null) {
            return;
        }
        if (c0299d.f3653g0 == 8) {
            c0303b.f3764e = 0;
            c0303b.f3765f = 0;
            c0303b.f3766g = 0;
            return;
        }
        if (c0299d.f3634T == null) {
            return;
        }
        int i4 = c0303b.f3761a;
        int i5 = c0303b.f3762b;
        int i6 = c0303b.f3763c;
        int i7 = c0303b.d;
        int i8 = this.f3917b + this.f3918c;
        int i9 = this.d;
        View view = c0299d.f3651f0;
        int a2 = AbstractC0291e.a(i4);
        C0298c c0298c = c0299d.f3625K;
        C0298c c0298c2 = c0299d.f3623I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3920f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3920f, i9, -2);
            boolean z3 = c0299d.f3670r == 1;
            int i10 = c0303b.f3767j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0299d.k();
                if (c0303b.f3767j == 2 || !z3 || ((z3 && z4) || c0299d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0299d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3920f;
            int i12 = c0298c2 != null ? c0298c2.f3615g : 0;
            if (c0298c != null) {
                i12 += c0298c.f3615g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0291e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3921g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3921g, i8, -2);
            boolean z5 = c0299d.f3671s == 1;
            int i13 = c0303b.f3767j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0299d.q();
                if (c0303b.f3767j == 2 || !z5 || ((z5 && z6) || c0299d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0299d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3921g;
            int i15 = c0298c2 != null ? c0299d.f3624J.f3615g : 0;
            if (c0298c != null) {
                i15 += c0299d.f3626L.f3615g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0300e c0300e = (C0300e) c0299d.f3634T;
        ConstraintLayout constraintLayout = this.h;
        if (c0300e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0299d.q() && view.getMeasuredWidth() < c0300e.q() && view.getMeasuredHeight() == c0299d.k() && view.getMeasuredHeight() < c0300e.k() && view.getBaseline() == c0299d.f3642a0 && !c0299d.z() && a(c0299d.f3621G, makeMeasureSpec, c0299d.q()) && a(c0299d.f3622H, makeMeasureSpec2, c0299d.k())) {
            c0303b.f3764e = c0299d.q();
            c0303b.f3765f = c0299d.k();
            c0303b.f3766g = c0299d.f3642a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0299d.f3637W > 0.0f;
        boolean z12 = z8 && c0299d.f3637W > 0.0f;
        if (view == null) {
            return;
        }
        C0324e c0324e = (C0324e) view.getLayoutParams();
        int i16 = c0303b.f3767j;
        if (i16 != 1 && i16 != 2 && z7 && c0299d.f3670r == 0 && z8 && c0299d.f3671s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0299d instanceof s.g)) {
                ((t) view).j((s.g) c0299d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0299d.f3621G = makeMeasureSpec;
            c0299d.f3622H = makeMeasureSpec2;
            c0299d.f3652g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0299d.f3673u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0299d.f3674v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0299d.f3676x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0299d.f3677y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0299d.f3637W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0299d.f3637W) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z2 = false;
            } else {
                if (measuredWidth2 != max2) {
                    i = 1073741824;
                    i2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                } else {
                    i = 1073741824;
                    i2 = i20;
                }
                if (measuredHeight != max) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, i);
                }
                view.measure(i2, makeMeasureSpec2);
                c0299d.f3621G = i2;
                c0299d.f3622H = makeMeasureSpec2;
                z2 = false;
                c0299d.f3652g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0303b.f3763c || max != c0303b.d) {
            z2 = true;
        }
        c0303b.i = z2;
        boolean z14 = c0324e.f3883c0 ? true : z13;
        if (z14 && baseline != -1 && c0299d.f3642a0 != baseline) {
            c0303b.i = true;
        }
        c0303b.f3764e = measuredWidth;
        c0303b.f3765f = max;
        c0303b.h = z14;
        c0303b.f3766g = baseline;
    }
}
