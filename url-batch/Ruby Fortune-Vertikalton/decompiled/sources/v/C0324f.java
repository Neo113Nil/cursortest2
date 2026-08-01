package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0290e;
import s.C0297c;
import s.C0298d;
import s.C0299e;
import t.C0302b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3910a;

    /* renamed from: b, reason: collision with root package name */
    public int f3911b;

    /* renamed from: c, reason: collision with root package name */
    public int f3912c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3913e;

    /* renamed from: f, reason: collision with root package name */
    public int f3914f;

    /* renamed from: g, reason: collision with root package name */
    public int f3915g;
    public final /* synthetic */ ConstraintLayout h;

    public C0324f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3910a = constraintLayout2;
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

    public final void b(C0298d c0298d, C0302b c0302b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0298d == null) {
            return;
        }
        if (c0298d.f3647g0 == 8) {
            c0302b.f3758e = 0;
            c0302b.f3759f = 0;
            c0302b.f3760g = 0;
            return;
        }
        if (c0298d.f3628T == null) {
            return;
        }
        int i4 = c0302b.f3755a;
        int i5 = c0302b.f3756b;
        int i6 = c0302b.f3757c;
        int i7 = c0302b.d;
        int i8 = this.f3911b + this.f3912c;
        int i9 = this.d;
        View view = c0298d.f3645f0;
        int a2 = AbstractC0290e.a(i4);
        C0297c c0297c = c0298d.f3619K;
        C0297c c0297c2 = c0298d.f3617I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3914f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3914f, i9, -2);
            boolean z3 = c0298d.f3664r == 1;
            int i10 = c0302b.f3761j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0298d.k();
                if (c0302b.f3761j == 2 || !z3 || ((z3 && z4) || c0298d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0298d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3914f;
            int i12 = c0297c2 != null ? c0297c2.f3609g : 0;
            if (c0297c != null) {
                i12 += c0297c.f3609g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0290e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3915g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3915g, i8, -2);
            boolean z5 = c0298d.f3665s == 1;
            int i13 = c0302b.f3761j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0298d.q();
                if (c0302b.f3761j == 2 || !z5 || ((z5 && z6) || c0298d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0298d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3915g;
            int i15 = c0297c2 != null ? c0298d.f3618J.f3609g : 0;
            if (c0297c != null) {
                i15 += c0298d.f3620L.f3609g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0299e c0299e = (C0299e) c0298d.f3628T;
        ConstraintLayout constraintLayout = this.h;
        if (c0299e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0298d.q() && view.getMeasuredWidth() < c0299e.q() && view.getMeasuredHeight() == c0298d.k() && view.getMeasuredHeight() < c0299e.k() && view.getBaseline() == c0298d.f3636a0 && !c0298d.z() && a(c0298d.f3615G, makeMeasureSpec, c0298d.q()) && a(c0298d.f3616H, makeMeasureSpec2, c0298d.k())) {
            c0302b.f3758e = c0298d.q();
            c0302b.f3759f = c0298d.k();
            c0302b.f3760g = c0298d.f3636a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0298d.f3631W > 0.0f;
        boolean z12 = z8 && c0298d.f3631W > 0.0f;
        if (view == null) {
            return;
        }
        C0323e c0323e = (C0323e) view.getLayoutParams();
        int i16 = c0302b.f3761j;
        if (i16 != 1 && i16 != 2 && z7 && c0298d.f3664r == 0 && z8 && c0298d.f3665s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0298d instanceof s.g)) {
                ((t) view).j((s.g) c0298d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0298d.f3615G = makeMeasureSpec;
            c0298d.f3616H = makeMeasureSpec2;
            c0298d.f3646g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0298d.f3667u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0298d.f3668v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0298d.f3670x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0298d.f3671y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0298d.f3631W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0298d.f3631W) + 0.5f);
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
                c0298d.f3615G = i2;
                c0298d.f3616H = makeMeasureSpec2;
                z2 = false;
                c0298d.f3646g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0302b.f3757c || max != c0302b.d) {
            z2 = true;
        }
        c0302b.i = z2;
        boolean z14 = c0323e.f3877c0 ? true : z13;
        if (z14 && baseline != -1 && c0298d.f3636a0 != baseline) {
            c0302b.i = true;
        }
        c0302b.f3758e = measuredWidth;
        c0302b.f3759f = max;
        c0302b.h = z14;
        c0302b.f3760g = baseline;
    }
}
