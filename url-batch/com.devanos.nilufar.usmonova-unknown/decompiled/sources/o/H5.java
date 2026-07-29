package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.devanos.nilufar.usmonova.R;

/* loaded from: classes.dex */
public final class H5 extends AbstractC1809rA implements J5 {
    public CharSequence I;
    public E5 J;
    public final Rect K;
    public int L;
    public final /* synthetic */ K5 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5(K5 k5, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.M = k5;
        this.K = new Rect();
        this.v = k5;
        this.E = true;
        this.F.setFocusable(true);
        this.w = new F5(this);
    }

    @Override // o.J5
    public final void g(CharSequence charSequence) {
        this.I = charSequence;
    }

    @Override // o.J5
    public final void k(int i) {
        this.L = i;
    }

    @Override // o.J5
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C1936t5 c1936t5 = this.F;
        boolean isShowing = c1936t5.isShowing();
        s();
        this.F.setInputMethodMode(2);
        d();
        C1713pj c1713pj = this.j;
        c1713pj.setChoiceMode(1);
        c1713pj.setTextDirection(i);
        c1713pj.setTextAlignment(i2);
        K5 k5 = this.M;
        int selectedItemPosition = k5.getSelectedItemPosition();
        C1713pj c1713pj2 = this.j;
        if (c1936t5.isShowing() && c1713pj2 != null) {
            c1713pj2.setListSelectionHidden(false);
            c1713pj2.setSelection(selectedItemPosition);
            if (c1713pj2.getChoiceMode() != 0) {
                c1713pj2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = k5.getViewTreeObserver()) == null) {
            return;
        }
        B5 b5 = new B5(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(b5);
        this.F.setOnDismissListener(new G5(this, b5));
    }

    @Override // o.J5
    public final CharSequence o() {
        return this.I;
    }

    @Override // o.AbstractC1809rA, o.J5
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.J = (E5) listAdapter;
    }

    public final void s() {
        int i;
        K5 k5 = this.M;
        Rect rect = k5.f55o;
        C1936t5 c1936t5 = this.F;
        Drawable background = c1936t5.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z = AbstractC1468m00.a;
            i = k5.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = k5.getPaddingLeft();
        int paddingRight = k5.getPaddingRight();
        int width = k5.getWidth();
        int i2 = k5.n;
        if (i2 == -2) {
            int a = k5.a(this.J, c1936t5.getBackground());
            int i3 = (k5.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = AbstractC1468m00.a;
        this.m = k5.getLayoutDirection() == 1 ? (((width - paddingRight) - this.l) - this.L) + i : paddingLeft + this.L + i;
    }
}
