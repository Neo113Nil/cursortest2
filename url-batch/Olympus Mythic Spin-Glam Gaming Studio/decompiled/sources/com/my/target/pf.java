package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import com.my.target.mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class pf extends nf {
    public pf(View view, View view2, mf.a aVar, View view3, gg ggVar, Context context) {
        super(view, view2, aVar, view3, ggVar, context);
    }

    private void a(int i, int i2) {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.n.setVisibility(8);
        this.d.setVisibility(0);
        if (a(i)) {
            this.s.setVisibility(0);
            qi.a(this.s, i, i2, Integer.MIN_VALUE);
            this.o.setVisibility(8);
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
        if (this.i.getMeasuredHeight() * 1.6d > i2) {
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
        ij ijVar = this.t;
        int i7 = this.D;
        qi.a(ijVar, i7, i7, 1073741824);
    }

    @Override // com.my.target.nf, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 - i < i4 - i2) {
            b(i, i2, i3, i4);
        } else {
            a(i, i2, i3, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
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
                qi.a(this.i, i3, i4, Integer.MIN_VALUE);
                fh fhVar = this.j;
                int i7 = this.G;
                qi.a(fhVar, i7, i7, Integer.MIN_VALUE);
                v5 v5Var = this.c;
                int i8 = this.D + (this.E * 2);
                qi.a(v5Var, i8, i8, 1073741824);
                ij ijVar = this.t;
                int i9 = this.D;
                qi.a(ijVar, i9, i9, 1073741824);
                m mVar = this.k;
                int i10 = this.D + (this.E * 2);
                qi.a(mVar, i10, i10, 1073741824);
                if (size >= size2) {
                    b(size, size2);
                } else {
                    a(size, size2);
                }
                setMeasuredDimension(size, size2);
            }
            i3 = (int) (f6 * f3);
        }
        i4 = size2;
        qi.a(this.i, i3, i4, Integer.MIN_VALUE);
        fh fhVar2 = this.j;
        int i72 = this.G;
        qi.a(fhVar2, i72, i72, Integer.MIN_VALUE);
        v5 v5Var2 = this.c;
        int i82 = this.D + (this.E * 2);
        qi.a(v5Var2, i82, i82, 1073741824);
        ij ijVar2 = this.t;
        int i92 = this.D;
        qi.a(ijVar2, i92, i92, 1073741824);
        m mVar2 = this.k;
        int i102 = this.D + (this.E * 2);
        qi.a(mVar2, i102, i102, 1073741824);
        if (size >= size2) {
        }
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.nf, com.my.target.mf
    public void setBanner(@NonNull d9 d9Var) {
        super.setBanner(d9Var);
        View view = this.L;
        if (view != null) {
            view.setVisibility(8);
        }
        this.m.setVisibility(8);
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
            qi.a(this.I, this.i.getRight() + this.I, qi.a(this.j.getMeasuredHeight(), this.s.getMeasuredHeight()) + this.E, this.E, this.j, this.s);
            View view = this.L;
            qi.a(view, i, i2, (view != null ? view.getMeasuredWidth() : 0) + i, i4);
            this.d.layout(this.i.getRight(), i2, i3, i4);
            this.n.layout(0, 0, 0, 0);
            this.f.a(false);
            if (this.c.getVisibility() == 0) {
                i5 = (this.c.getLeft() - this.A) + this.E;
            } else if (this.t.getVisibility() == 0) {
                i5 = this.t.getLeft() - this.A;
            } else {
                i5 = i3 - this.I;
            }
            qi.b(this.k, this.I, i5);
            qi.b(this.k, this.I, i5);
            return;
        }
        fh fhVar2 = this.j;
        int i8 = this.I;
        qi.c(fhVar2, i8, i8);
        qi.e(this.d, i4 - i2, i);
        qi.a(this.i, i, i2, i3, i4);
        qi.a(this.L, i, i2, i3, i4);
        this.m.layout(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
        this.n.layout(0, 0, 0, 0);
        qi.c(this.o, this.d.getTop(), this.d.getLeft());
        this.f.a(true);
        qi.d(this.k, this.d.getTop() - this.A, i3 - this.I);
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
        qi.a(this.i, i, i2, i3, i4);
        int measuredHeight = this.r.getMeasuredHeight() + (this.A / 2);
        if (this.q.getVisibility() == 0) {
            measuredHeight += this.A + this.q.getMeasuredHeight();
        }
        int i7 = this.A;
        int i8 = i3 - i;
        int measuredWidth = i7 + (((i8 - (i7 * 2)) - this.q.getMeasuredWidth()) / 2);
        int i9 = this.A;
        int measuredWidth2 = i9 + (((i8 - (i9 * 2)) - this.r.getMeasuredWidth()) / 2);
        int bottom = this.i.getBottom();
        if (measuredHeight < this.p.getTop() - bottom) {
            int top2 = bottom + (((this.p.getTop() - bottom) - measuredHeight) / 2);
            qi.c(this.q, top2, measuredWidth);
            qi.c(this.r, qi.a(top2, this.q.getBottom() + this.J), measuredWidth2);
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
        this.f.a(((double) (this.i.getBottom() - this.o.getTop())) > ((double) this.i.getMeasuredHeight()) * 0.1d);
        m mVar = this.k;
        int i11 = this.A;
        qi.d(mVar, i4 - i11, i3 - i11);
        fh fhVar = this.j;
        int i12 = this.A;
        qi.e(fhVar, i4 - i12, i12);
    }
}
