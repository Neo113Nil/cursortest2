package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jm extends k implements ua0 {
    public final Window l;
    public final ce0 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    public jm(Context context, Window window) {
        super(context);
        this.l = window;
        this.m = ud0.o(fg.a);
        int i = c01.a;
        xz0.b(this, this);
        c01.a(this, new im(this));
    }

    @Override // defpackage.ua0
    public final d21 a(View view, d21 d21Var) {
        if (!this.o) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return d21Var.a.m(max, max2, max3, max4);
            }
        }
        return d21Var;
    }

    @Override // defpackage.k
    public final void b(ih ihVar, int i) {
        qh qhVar = (qh) ihVar;
        qhVar.W(1735448596);
        int i2 = (qhVar.h(this) ? 4 : 2) | i;
        if (qhVar.N(i2 & 1, (i2 & 3) != 2)) {
            ((qu) this.m.getValue()).invoke(qhVar, 0);
        } else {
            qhVar.Q();
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new j(i, 7, this);
        }
    }

    @Override // defpackage.k
    public final void e(int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // defpackage.k
    public final void f(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        Window window = this.l;
        int i3 = (mode != Integer.MIN_VALUE || this.n || this.o || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i4 = size - paddingRight;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingBottom;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.o || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        if (this.n) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // defpackage.k
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.q;
    }
}
