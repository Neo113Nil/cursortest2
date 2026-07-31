package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;
import com.my.target.mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class qf extends nf {
    public qf(View view, View view2, mf.a aVar, View view3, gg ggVar, Context context) {
        super(view, view2, aVar, view3, ggVar, context);
        addView(this.a);
        addView(this.g);
        addView(this.h);
        addView(this.l);
        addView(view2);
    }

    private void a(int i, int i2) {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.n.setVisibility(8);
        this.d.setVisibility(0);
        if (a(i)) {
            this.s.setVisibility(0);
            this.o.setVisibility(8);
            qi.a(this.s, i, i2, Integer.MIN_VALUE);
            View view = this.L;
            int a = i - qi.a(view != null ? view.getMeasuredWidth() : 0, this.i.getMeasuredWidth());
            qi.a(this.d, a, a, Integer.MIN_VALUE);
        } else {
            this.s.setVisibility(8);
            this.o.setVisibility(0);
            qi.a(this.d, i, i2, Integer.MIN_VALUE);
        }
        qi.a(this.o, this.d.getMeasuredWidth(), this.d.getMeasuredHeight(), 1073741824);
    }

    private void b(int i, int i2) {
        this.d.setVisibility(0);
        this.n.setVisibility(0);
        this.o.setVisibility(0);
        this.s.setVisibility(8);
        qi.a(this.d, i - this.D, i2, Integer.MIN_VALUE);
        qi.a(this.n, i, this.d.getMeasuredHeight(), 1073741824);
        if (qi.a(this.L != null ? r0.getMeasuredHeight() : 0, this.i.getMeasuredHeight()) * 1.6d > i2) {
            this.q.setVisibility(8);
            if (!TextUtils.isEmpty(this.r.getText())) {
                this.r.setVisibility(0);
            }
        } else {
            if (TextUtils.isEmpty(this.q.getText())) {
                this.q.setVisibility(8);
            } else {
                this.q.setVisibility(0);
            }
            if (TextUtils.isEmpty(this.r.getText())) {
                this.r.setVisibility(8);
            } else {
                this.r.setVisibility(0);
            }
        }
        int i3 = this.A;
        int i4 = i3 * 2;
        this.p.measure(View.MeasureSpec.makeMeasureSpec(((i - (i3 * 4)) - this.k.getMeasuredWidth()) - this.j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        int i5 = i - i4;
        int i6 = i2 - i4;
        qi.a(this.q, i5, i6, Integer.MIN_VALUE);
        qi.a(this.r, i5, i6, Integer.MIN_VALUE);
        qi.a(this.o, i, i2, 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        this.f.a(this.Q);
    }

    private void f() {
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.qf$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qf.this.d(view);
            }
        });
        View view = this.L;
        if (view != null) {
            view.setOnTouchListener(this.z);
            this.L.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.qf$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    qf.this.e(view2);
                }
            });
        }
        this.m.setOnTouchListener(this.z);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.qf$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                qf.this.f(view2);
            }
        });
    }

    private void g() {
        this.a.setOnClickListener(this);
        View view = this.L;
        if (view != null) {
            view.setOnClickListener(this);
        }
        this.m.setOnClickListener(this);
    }

    @Override // com.my.target.nf, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.e.getVisibility() == 0) {
            qi.e(this.e, i4 - i2, i);
        }
        if (i3 - i < i4 - i2) {
            b(i, i2, i3, i4);
        } else {
            a(i, i2, i3, i4);
        }
        View view = this.L;
        if (view == null) {
            view = this.i;
        }
        int left = view.getLeft();
        View view2 = this.L;
        if (view2 == null) {
            view2 = this.i;
        }
        int top = view2.getTop();
        View view3 = this.L;
        int a = qi.a(view3 != null ? view3.getRight() : 0, this.i.getRight());
        View view4 = this.L;
        int a2 = qi.a(view4 != null ? view4.getBottom() : 0, this.i.getBottom());
        if (this.l.getVisibility() == 0) {
            qi.a(this.l, left, top, a, a2);
        }
        if (this.g.getVisibility() != 0) {
            return;
        }
        if (this.h.getVisibility() != 0) {
            qi.a(this.g, left, top, a, a2);
            return;
        }
        int measuredWidth = left + (((a - left) - ((this.g.getMeasuredWidth() + this.A) + this.h.getMeasuredWidth())) / 2);
        int measuredHeight = top + (((a2 - top) - this.g.getMeasuredHeight()) / 2);
        qi.c(this.g, measuredHeight, measuredWidth);
        qi.c(this.h, measuredHeight, this.g.getRight() + this.A);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    @Override // com.my.target.nf, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = this.M;
        if (i6 <= 0 || (i5 = this.N) <= 0) {
            i3 = size;
        } else {
            float f = i6;
            float f2 = i5;
            float f3 = f / f2;
            float f4 = size;
            float f5 = f4 / f;
            float f6 = size2;
            if (Math.min(f5, f6 / f2) == f5 && f3 > 0.0f) {
                i4 = (int) (f4 / f3);
                i3 = size;
                qi.a(this.L, i3, i4, Integer.MIN_VALUE);
                qi.a(this.i, i3, i4, Integer.MIN_VALUE);
                qi.a(this.m, i3, i4, 1073741824);
                fh fhVar = this.j;
                int i7 = this.G;
                qi.a(fhVar, i7, i7, Integer.MIN_VALUE);
                v5 v5Var = this.a;
                int i8 = this.D + (this.E * 2);
                qi.a(v5Var, i8, i8, 1073741824);
                v5 v5Var2 = this.c;
                int i9 = this.D + (this.E * 2);
                qi.a(v5Var2, i9, i9, 1073741824);
                ij ijVar = this.t;
                int i10 = this.D;
                qi.a(ijVar, i10, i10, 1073741824);
                m mVar = this.k;
                int i11 = this.D + (this.E * 2);
                qi.a(mVar, i11, i11, 1073741824);
                if (size >= size2) {
                    b(size, size2);
                } else {
                    a(size, size2);
                }
                if (this.g.getVisibility() == 0) {
                    x4 x4Var = this.g;
                    int i12 = this.B;
                    qi.a(x4Var, i12, i12, 1073741824);
                    if (this.h.getVisibility() == 0) {
                        this.h.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.g.getMeasuredHeight(), 1073741824));
                    }
                }
                ProgressBar progressBar = this.l;
                int i13 = this.B;
                qi.a(progressBar, i13, i13, 1073741824);
                qi.a(this.e, size, this.C, 1073741824);
                setMeasuredDimension(size, size2);
            }
            i3 = (int) (f6 * f3);
        }
        i4 = size2;
        qi.a(this.L, i3, i4, Integer.MIN_VALUE);
        qi.a(this.i, i3, i4, Integer.MIN_VALUE);
        qi.a(this.m, i3, i4, 1073741824);
        fh fhVar2 = this.j;
        int i72 = this.G;
        qi.a(fhVar2, i72, i72, Integer.MIN_VALUE);
        v5 v5Var3 = this.a;
        int i82 = this.D + (this.E * 2);
        qi.a(v5Var3, i82, i82, 1073741824);
        v5 v5Var22 = this.c;
        int i92 = this.D + (this.E * 2);
        qi.a(v5Var22, i92, i92, 1073741824);
        ij ijVar2 = this.t;
        int i102 = this.D;
        qi.a(ijVar2, i102, i102, 1073741824);
        m mVar2 = this.k;
        int i112 = this.D + (this.E * 2);
        qi.a(mVar2, i112, i112, 1073741824);
        if (size >= size2) {
        }
        if (this.g.getVisibility() == 0) {
        }
        ProgressBar progressBar2 = this.l;
        int i132 = this.B;
        qi.a(progressBar2, i132, i132, 1073741824);
        qi.a(this.e, size, this.C, 1073741824);
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.nf, com.my.target.mf
    public void setBanner(@NonNull d9 d9Var) {
        ImageData y;
        Bitmap bitmap;
        super.setBanner(d9Var);
        eb j0 = d9Var.j0();
        if (j0 == null) {
            return;
        }
        this.e.setVisibility(0);
        this.a.setVisibility(0);
        if (j0.u0()) {
            this.a.a(this.v, false);
            this.a.setContentDescription("sound_off");
        } else {
            this.a.a(this.u, false);
            this.a.setContentDescription("sound_on");
        }
        this.g.setImageBitmap(this.w);
        this.P = 0;
        dj djVar = (dj) j0.A0();
        ImageData i0 = j0.i0();
        if (djVar != null) {
            this.M = djVar.getWidth();
            this.N = djVar.getHeight();
        }
        if ((this.M <= 0 || this.N <= 0) && i0 != null) {
            this.M = i0.getWidth();
            this.N = i0.getHeight();
        }
        if ((this.M <= 0 || this.N <= 0) && (y = d9Var.y()) != null) {
            this.M = y.getWidth();
            int height = y.getHeight();
            this.N = height;
            if ((this.M <= 0 || height <= 0) && (bitmap = y.getBitmap()) != null) {
                this.M = bitmap.getWidth();
                this.N = bitmap.getHeight();
            }
        }
        if (this.R) {
            f();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        this.f.b(this.Q);
    }

    private void a(int i, int i2, int i3, int i4) {
        int i5;
        if (this.c.getVisibility() == 0) {
            v5 v5Var = this.c;
            int i6 = this.I - this.E;
            qi.b(v5Var, i2 + i6, (i3 - i) - i6);
        } else {
            ij ijVar = this.t;
            int i7 = this.I;
            qi.b(ijVar, i2 + i7, (i3 - i) - i7);
        }
        if (a(i3 - i)) {
            fh fhVar = this.i;
            qi.a(fhVar, i, i2, fhVar.getMeasuredWidth() + i, i4);
            View view = this.L;
            qi.a(view, i, i2, (view != null ? view.getMeasuredWidth() : 0) + i, i4);
            View view2 = this.L;
            if (view2 == null) {
                view2 = this.i;
            }
            int left = view2.getLeft();
            View view3 = this.L;
            if (view3 == null) {
                view3 = this.i;
            }
            int right = view3.getRight();
            View view4 = this.L;
            if (view4 == null) {
                view4 = this.i;
            }
            int bottom = view4.getBottom();
            View view5 = this.L;
            if (view5 == null) {
                view5 = this.i;
            }
            int top = view5.getTop();
            int i8 = this.I;
            int a = qi.a(right, this.i.getRight()) + this.I;
            int a2 = qi.a(this.j.getMeasuredHeight(), this.s.getMeasuredHeight());
            int i9 = this.E;
            qi.a(i8, a, a2 + i9, i9, this.j, this.s);
            this.m.layout(left, top, right, bottom);
            this.d.layout(qi.a(right, this.i.getRight()), i2, i3, i4);
            this.n.layout(0, 0, 0, 0);
            int max = Math.max(this.i.getRight(), right);
            int i10 = this.I - this.E;
            qi.d(this.a, i4 - i10, max - i10);
            this.f.a(false);
            qi.c(this.o, i4, this.d.getLeft());
            if (this.c.getVisibility() == 0) {
                i5 = (this.c.getLeft() - this.A) + this.E;
            } else if (this.t.getVisibility() == 0) {
                i5 = this.t.getLeft() - this.A;
            } else {
                i5 = i3 - this.I;
            }
            qi.b(this.k, this.I, i5);
            return;
        }
        fh fhVar2 = this.j;
        int i11 = this.I;
        qi.c(fhVar2, i11, i11);
        qi.e(this.d, i4 - i2, i);
        qi.a(this.i, i, i2, i3, i4);
        qi.a(this.L, i, i2, i3, i4);
        this.m.layout(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
        this.n.layout(0, 0, 0, 0);
        qi.c(this.o, this.d.getTop(), this.d.getLeft());
        int top2 = this.d.getTop();
        int i12 = this.A;
        int i13 = this.E;
        qi.d(this.a, top2 - (i12 - i13), i3 - (this.I - i13));
        qi.d(this.k, this.a.getTop() - (this.A - this.E), i3 - this.I);
        this.f.a(true);
    }

    private void b(int i, int i2, int i3, int i4) {
        int top;
        if (this.c.getVisibility() == 0) {
            v5 v5Var = this.c;
            int i5 = this.A - this.E;
            qi.b(v5Var, i2 + i5, (i3 - i) - i5);
        } else {
            ij ijVar = this.t;
            int i6 = this.A;
            qi.b(ijVar, i2 + i6, (i3 - i) - i6);
        }
        qi.c(this.d, i2, i);
        Button button = this.p;
        qi.a(button, 0, (i4 - this.F) - button.getMeasuredHeight(), i3, i4 - this.F);
        qi.a(this.L, i, i2, i3, i4);
        if (this.i.getMeasuredWidth() > 0 && this.i.getMeasuredHeight() > 0) {
            qi.a(this.i, i, i2, i3, i4);
        }
        View view = this.L;
        int left = view != null ? view.getLeft() : 0;
        View view2 = this.L;
        int top2 = view2 != null ? view2.getTop() : 0;
        View view3 = this.L;
        int a = qi.a(view3 != null ? view3.getRight() : 0, this.i.getRight());
        View view4 = this.L;
        int a2 = qi.a(view4 != null ? view4.getBottom() : 0, this.i.getBottom());
        this.m.layout(left, top2, a, a2);
        int measuredHeight = this.r.getMeasuredHeight() + (this.A / 2);
        if (this.q.getVisibility() == 0) {
            measuredHeight += this.A + this.q.getMeasuredHeight();
        }
        int i7 = this.A;
        int i8 = i3 - i;
        int measuredWidth = i7 + (((i8 - (i7 * 2)) - this.q.getMeasuredWidth()) / 2);
        int i9 = this.A;
        int measuredWidth2 = i9 + (((i8 - (i9 * 2)) - this.r.getMeasuredWidth()) / 2);
        int a3 = qi.a(this.i.getBottom(), a2);
        if (measuredHeight < this.p.getTop() - a3) {
            int top3 = a3 + (((this.p.getTop() - a3) - measuredHeight) / 2);
            qi.c(this.q, top3, measuredWidth);
            qi.c(this.r, qi.a(top3, this.q.getBottom() + this.J), measuredWidth2);
        } else {
            qi.e(this.r, this.p.getTop() - this.A, measuredWidth2);
            this.q.layout(0, 0, 0, 0);
        }
        if (this.q.getTop() > 0) {
            top = this.q.getTop();
        } else if (this.r.getTop() > 0) {
            top = this.r.getTop();
        } else {
            top = this.p.getTop();
        }
        int i10 = top - this.A;
        qi.c(this.n, this.d.getTop(), this.d.getLeft());
        qi.c(this.o, i10, i);
        int min = Math.min(this.o.getTop(), Math.max(a2, this.i.getBottom()));
        int i11 = this.A - this.E;
        qi.d(this.a, min - i11, i3 - i11);
        this.f.a(((double) (this.i.getBottom() - this.o.getTop())) > ((double) this.i.getMeasuredHeight()) * 0.1d);
        if (this.e.getVisibility() == 0) {
            i4 = this.e.getTop();
        }
        m mVar = this.k;
        int i12 = this.A;
        qi.d(mVar, i4 - i12, i3 - i12);
        fh fhVar = this.j;
        int i13 = this.A;
        qi.e(fhVar, i4 - i13, i13);
    }
}
