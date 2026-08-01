package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class jc {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public jc(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(tc tcVar, q7 q7Var) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int max2;
        boolean z;
        int baseline;
        int i;
        if (tcVar == null) {
            return;
        }
        ec ecVar = tcVar.K;
        ec ecVar2 = tcVar.I;
        if (tcVar.g0 == 8) {
            q7Var.e = 0;
            q7Var.f = 0;
            q7Var.g = 0;
            return;
        }
        if (tcVar.T == null) {
            return;
        }
        a20 a20Var = ConstraintLayout.u;
        int i2 = q7Var.a;
        int i3 = q7Var.b;
        int i4 = q7Var.c;
        int i5 = q7Var.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = tcVar.f0;
        int h = n20.h(i2);
        if (h == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (h == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (h == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z2 = tcVar.r == 1;
            int i8 = q7Var.j;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == tcVar.k();
                if (q7Var.j == 2 || !z2 || ((z2 && z3) || tcVar.A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tcVar.q(), 1073741824);
                }
            }
        } else if (h != 3) {
            makeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = ecVar2 != null ? ecVar2.g : 0;
            if (ecVar != null) {
                i10 += ecVar.g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int h2 = n20.h(i3);
        if (h2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (h2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (h2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z4 = tcVar.s == 1;
            int i11 = q7Var.j;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == tcVar.q();
                if (q7Var.j == 2 || !z4 || ((z4 && z5) || tcVar.B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(tcVar.k(), 1073741824);
                }
            }
        } else if (h2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = ecVar2 != null ? tcVar.J.g : 0;
            if (ecVar != null) {
                i13 += tcVar.L.g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        uc ucVar = (uc) tcVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (ucVar != null && g8.v(constraintLayout.n, 256) && view.getMeasuredWidth() == tcVar.q() && view.getMeasuredWidth() < ucVar.q() && view.getMeasuredHeight() == tcVar.k() && view.getMeasuredHeight() < ucVar.k() && view.getBaseline() == tcVar.a0 && !tcVar.z() && a(tcVar.G, makeMeasureSpec, tcVar.q()) && a(tcVar.H, makeMeasureSpec2, tcVar.k())) {
            q7Var.e = tcVar.q();
            q7Var.f = tcVar.k();
            q7Var.g = tcVar.a0;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && tcVar.W > 0.0f;
        boolean z11 = z7 && tcVar.W > 0.0f;
        if (view == null) {
            return;
        }
        ic icVar = (ic) view.getLayoutParams();
        int i14 = q7Var.j;
        if (i14 != 1 && i14 != 2 && z6 && tcVar.r == 0 && z7 && tcVar.s == 0) {
            i = -1;
            z = false;
            baseline = 0;
            max2 = 0;
            max = 0;
        } else {
            if ((view instanceof q90) && (tcVar instanceof cj)) {
                ((q90) view).j((cj) tcVar, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            tcVar.G = makeMeasureSpec;
            tcVar.H = makeMeasureSpec2;
            tcVar.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = tcVar.u;
            max = i15 > 0 ? Math.max(i15, measuredWidth) : measuredWidth;
            int i16 = tcVar.v;
            if (i16 > 0) {
                max = Math.min(i16, max);
            }
            int i17 = tcVar.x;
            max2 = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = makeMeasureSpec2;
            int i19 = tcVar.y;
            if (i19 > 0) {
                max2 = Math.min(i19, max2);
            }
            if (!g8.v(constraintLayout.n, 1)) {
                if (z10 && z8) {
                    max = (int) ((max2 * tcVar.W) + 0.5f);
                } else if (z11 && z9) {
                    max2 = (int) ((max / tcVar.W) + 0.5f);
                }
            }
            if (measuredWidth == max && measuredHeight == max2) {
                baseline = baseline2;
                i = -1;
                z = false;
            } else {
                if (measuredWidth != max) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                }
                int makeMeasureSpec3 = measuredHeight != max2 ? View.MeasureSpec.makeMeasureSpec(max2, 1073741824) : i18;
                view.measure(makeMeasureSpec, makeMeasureSpec3);
                tcVar.G = makeMeasureSpec;
                tcVar.H = makeMeasureSpec3;
                z = false;
                tcVar.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredWidth2;
                max2 = measuredHeight2;
                i = -1;
            }
        }
        boolean z12 = baseline != i ? true : z;
        q7Var.i = (max == q7Var.c && max2 == q7Var.d) ? z : true;
        boolean z13 = icVar.c0 ? true : z12;
        if (z13 && baseline != -1 && tcVar.a0 != baseline) {
            q7Var.i = true;
        }
        q7Var.e = max;
        q7Var.f = max2;
        q7Var.h = z13;
        q7Var.g = baseline;
    }
}
