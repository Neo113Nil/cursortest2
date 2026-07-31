package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.my.target.mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class of extends nf {
    private final int S;

    public of(boolean z, View view, View view2, mf.a aVar, View view3, gg ggVar, Context context) {
        super(view, view2, aVar, view3, ggVar, context);
        if (z) {
            this.S = 0;
        } else {
            this.S = 1;
        }
    }

    private void a(int i, int i2) {
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        this.n.setVisibility(8);
        this.d.setVisibility(0);
        this.o.setVisibility(0);
        qi.a(this.d, i, i2, Integer.MIN_VALUE);
        qi.a(this.o, this.d.getMeasuredWidth(), this.d.getMeasuredHeight(), 1073741824);
    }

    private void b(int i, int i2) {
        this.d.setVisibility(0);
        this.n.setVisibility(0);
        qi.a(this.d, i - this.D, i2, Integer.MIN_VALUE);
        qi.a(this.n, i, this.d.getMeasuredHeight(), 1073741824);
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
        if (this.S != 0) {
            this.o.setVisibility(8);
            return;
        }
        int i3 = this.A;
        int i4 = i3 * 2;
        this.p.measure(View.MeasureSpec.makeMeasureSpec(((i - (i3 * 4)) - this.k.getMeasuredWidth()) - this.j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        int i5 = i - i4;
        int i6 = i2 - i4;
        qi.a(this.q, i5, i6, Integer.MIN_VALUE);
        qi.a(this.r, i5, i6, Integer.MIN_VALUE);
        this.o.setVisibility(0);
        qi.a(this.o, i, i2, 1073741824);
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

    @Override // com.my.target.nf, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size < size2) {
            b(size, size2);
            int i3 = this.S;
            if (i3 == 1) {
                qi.a(this.L, size, (size2 - this.n.getMeasuredHeight()) - (this.A * 2), Integer.MIN_VALUE);
            } else if (i3 == 0) {
                qi.a(this.L, size, ((((size2 - this.d.getMeasuredHeight()) - this.q.getMeasuredHeight()) - this.p.getMeasuredHeight()) - this.r.getMeasuredHeight()) - (this.A * 8), Integer.MIN_VALUE);
            }
        } else {
            a(size, size2);
            qi.a(this.L, size, (size2 - this.d.getMeasuredHeight()) - (this.A * 2), 1073741824);
        }
        ij ijVar = this.t;
        int i4 = this.D;
        qi.a(ijVar, i4, i4, 1073741824);
        v5 v5Var = this.c;
        int i5 = this.D + (this.E * 2);
        qi.a(v5Var, i5, i5, 1073741824);
        m mVar = this.k;
        int i6 = this.D + (this.E * 2);
        qi.a(mVar, i6, i6, 1073741824);
        setMeasuredDimension(size, size2);
    }

    @Override // com.my.target.nf, com.my.target.mf
    public void setBanner(@NonNull d9 d9Var) {
        super.setBanner(d9Var);
        this.f.a(true);
        View view = this.L;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (this.c.getVisibility() == 0) {
            v5 v5Var = this.c;
            int i5 = this.I - this.E;
            qi.b(v5Var, i2 + i5, (i3 - i) - i5);
        } else {
            ij ijVar = this.t;
            int i6 = this.I;
            qi.b(ijVar, i2 + i6, (i3 - i) - i6);
        }
        qi.e(this.d, i4, i);
        qi.e(this.L, this.d.getTop(), 0);
        this.n.layout(0, 0, 0, 0);
        View view = this.o;
        View view2 = this.L;
        if (view2 != null) {
            i4 = view2.getBottom();
        }
        qi.c(view, i4, 0);
        qi.d(this.k, this.d.getTop() - this.A, i3 - this.I);
    }

    private void b(int i, int i2, int i3, int i4) {
        int measuredHeight;
        int i5;
        if (this.c.getVisibility() == 0) {
            v5 v5Var = this.c;
            int i6 = this.A - this.E;
            qi.b(v5Var, i2 + i6, (i3 - i) - i6);
        } else {
            ij ijVar = this.t;
            int i7 = this.A;
            qi.b(ijVar, i2 + i7, (i3 - i) - i7);
        }
        qi.c(this.d, i2, i);
        int measuredHeight2 = (i4 - this.j.getMeasuredHeight()) - this.A;
        Button button = this.p;
        qi.a(button, 0, measuredHeight2 - button.getMeasuredHeight(), i3, measuredHeight2);
        if (this.S == 1) {
            qi.a(this.L, i, this.d.getBottom(), i3, i4);
        }
        int top = this.p.getTop() - this.A;
        TextView textView = this.r;
        qi.a(textView, 0, top - textView.getMeasuredHeight(), i3, top);
        if (this.r.getVisibility() == 0) {
            measuredHeight = this.r.getTop();
        } else {
            measuredHeight = top + this.r.getMeasuredHeight();
        }
        int i8 = measuredHeight - this.A;
        TextView textView2 = this.q;
        qi.a(textView2, 0, i8 - textView2.getMeasuredHeight(), i3, i8);
        if (this.S == 0) {
            qi.a(this.L, i, this.d.getBottom(), i3, this.r.getTop());
            View view = this.L;
            if (view != null) {
                i5 = view.getBottom();
                qi.c(this.n, this.d.getTop(), this.d.getLeft());
                qi.c(this.o, i5, i);
                m mVar = this.k;
                int i9 = this.A;
                qi.d(mVar, i4 - i9, i3 - i9);
                fh fhVar = this.j;
                int i10 = this.I;
                qi.e(fhVar, i4 - i10, i10);
            }
        }
        i5 = i4;
        qi.c(this.n, this.d.getTop(), this.d.getLeft());
        qi.c(this.o, i5, i);
        m mVar2 = this.k;
        int i92 = this.A;
        qi.d(mVar2, i4 - i92, i3 - i92);
        fh fhVar2 = this.j;
        int i102 = this.I;
        qi.e(fhVar2, i4 - i102, i102);
    }
}
