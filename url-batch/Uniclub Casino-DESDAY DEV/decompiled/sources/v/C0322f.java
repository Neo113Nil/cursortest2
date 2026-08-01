package v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import q.AbstractC0286e;
import s.C0295c;
import s.C0296d;
import s.C0297e;
import t.C0300b;

/* renamed from: v.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322f {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3894a;

    /* renamed from: b, reason: collision with root package name */
    public int f3895b;

    /* renamed from: c, reason: collision with root package name */
    public int f3896c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3897e;

    /* renamed from: f, reason: collision with root package name */
    public int f3898f;

    /* renamed from: g, reason: collision with root package name */
    public int f3899g;
    public final /* synthetic */ ConstraintLayout h;

    public C0322f(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.f3894a = constraintLayout2;
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

    public final void b(C0296d c0296d, C0300b c0300b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0296d == null) {
            return;
        }
        if (c0296d.f3658g0 == 8) {
            c0300b.f3768e = 0;
            c0300b.f3769f = 0;
            c0300b.f3770g = 0;
            return;
        }
        if (c0296d.f3639T == null) {
            return;
        }
        int i4 = c0300b.f3765a;
        int i5 = c0300b.f3766b;
        int i6 = c0300b.f3767c;
        int i7 = c0300b.d;
        int i8 = this.f3895b + this.f3896c;
        int i9 = this.d;
        View view = c0296d.f3656f0;
        int a2 = AbstractC0286e.a(i4);
        C0295c c0295c = c0296d.f3630K;
        C0295c c0295c2 = c0296d.f3628I;
        if (a2 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (a2 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3898f, i9, -2);
        } else if (a2 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f3898f, i9, -2);
            boolean z3 = c0296d.f3675r == 1;
            int i10 = c0300b.f3771j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c0296d.k();
                if (c0300b.f3771j == 2 || !z3 || ((z3 && z4) || c0296d.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0296d.q(), 1073741824);
                }
            }
        } else if (a2 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f3898f;
            int i12 = c0295c2 != null ? c0295c2.f3620g : 0;
            if (c0295c != null) {
                i12 += c0295c.f3620g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int a3 = AbstractC0286e.a(i5);
        if (a3 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (a3 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3899g, i8, -2);
        } else if (a3 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f3899g, i8, -2);
            boolean z5 = c0296d.f3676s == 1;
            int i13 = c0300b.f3771j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c0296d.q();
                if (c0300b.f3771j == 2 || !z5 || ((z5 && z6) || c0296d.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0296d.k(), 1073741824);
                }
            }
        } else if (a3 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f3899g;
            int i15 = c0295c2 != null ? c0296d.f3629J.f3620g : 0;
            if (c0295c != null) {
                i15 += c0296d.f3631L.f3620g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0297e c0297e = (C0297e) c0296d.f3639T;
        ConstraintLayout constraintLayout = this.h;
        if (c0297e != null && s.j.c(constraintLayout.i, 256) && view.getMeasuredWidth() == c0296d.q() && view.getMeasuredWidth() < c0297e.q() && view.getMeasuredHeight() == c0296d.k() && view.getMeasuredHeight() < c0297e.k() && view.getBaseline() == c0296d.f3647a0 && !c0296d.z() && a(c0296d.f3626G, makeMeasureSpec, c0296d.q()) && a(c0296d.f3627H, makeMeasureSpec2, c0296d.k())) {
            c0300b.f3768e = c0296d.q();
            c0300b.f3769f = c0296d.k();
            c0300b.f3770g = c0296d.f3647a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c0296d.f3642W > 0.0f;
        boolean z12 = z8 && c0296d.f3642W > 0.0f;
        if (view == null) {
            return;
        }
        C0321e c0321e = (C0321e) view.getLayoutParams();
        int i16 = c0300b.f3771j;
        if (i16 != 1 && i16 != 2 && z7 && c0296d.f3675r == 0 && z8 && c0296d.f3676s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof t) && (c0296d instanceof s.g)) {
                ((t) view).j((s.g) c0296d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c0296d.f3626G = makeMeasureSpec;
            c0296d.f3627H = makeMeasureSpec2;
            c0296d.f3657g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0296d.f3678u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0296d.f3679v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c0296d.f3681x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c0296d.f3682y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!s.j.c(constraintLayout.i, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c0296d.f3642W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c0296d.f3642W) + 0.5f);
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
                c0296d.f3626G = i2;
                c0296d.f3627H = makeMeasureSpec2;
                z2 = false;
                c0296d.f3657g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c0300b.f3767c || max != c0300b.d) {
            z2 = true;
        }
        c0300b.i = z2;
        boolean z14 = c0321e.f3861c0 ? true : z13;
        if (z14 && baseline != -1 && c0296d.f3647a0 != baseline) {
            c0300b.i = true;
        }
        c0300b.f3768e = measuredWidth;
        c0300b.f3769f = max;
        c0300b.h = z14;
        c0300b.f3770g = baseline;
    }
}
