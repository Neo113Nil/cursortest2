package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class b5 extends jq implements d5 {
    public CharSequence H;
    public y4 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ e5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(e5 e5Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = e5Var;
        this.J = new Rect();
        this.t = e5Var;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new z4(0, this);
    }

    @Override // defpackage.d5
    public final void f(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // defpackage.d5
    public final void l(int i) {
        this.K = i;
    }

    @Override // defpackage.d5
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        n4 n4Var = this.E;
        boolean isShowing = n4Var.isShowing();
        s();
        n4Var.setInputMethodMode(2);
        d();
        bg bgVar = this.h;
        bgVar.setChoiceMode(1);
        bgVar.setTextDirection(i);
        bgVar.setTextAlignment(i2);
        e5 e5Var = this.L;
        int selectedItemPosition = e5Var.getSelectedItemPosition();
        bg bgVar2 = this.h;
        if (n4Var.isShowing() && bgVar2 != null) {
            bgVar2.setListSelectionHidden(false);
            bgVar2.setSelection(selectedItemPosition);
            if (bgVar2.getChoiceMode() != 0) {
                bgVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = e5Var.getViewTreeObserver()) == null) {
            return;
        }
        v4 v4Var = new v4(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(v4Var);
        n4Var.setOnDismissListener(new a5(this, v4Var));
    }

    @Override // defpackage.d5
    public final CharSequence p() {
        return this.H;
    }

    @Override // defpackage.jq, defpackage.d5
    public final void q(ListAdapter listAdapter) {
        super.q(listAdapter);
        this.I = (y4) listAdapter;
    }

    public final void s() {
        int i;
        n4 n4Var = this.E;
        Drawable background = n4Var.getBackground();
        e5 e5Var = this.L;
        Rect rect = e5Var.m;
        if (background != null) {
            background.getPadding(rect);
            boolean z = h90.a;
            i = e5Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = e5Var.getPaddingLeft();
        int paddingRight = e5Var.getPaddingRight();
        int width = e5Var.getWidth();
        int i2 = e5Var.l;
        if (i2 == -2) {
            int a = e5Var.a(this.I, n4Var.getBackground());
            int i3 = (e5Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a > i3) {
                a = i3;
            }
            r(Math.max(a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = h90.a;
        this.k = e5Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.K) + i : paddingLeft + this.K + i;
    }
}
