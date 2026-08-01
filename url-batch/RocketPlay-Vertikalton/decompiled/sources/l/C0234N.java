package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.luckycounter.drinkwater.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0193d;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234N extends G0 implements InterfaceC0236P {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3341C;

    /* renamed from: D, reason: collision with root package name */
    public C0232L f3342D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f3343E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0237Q f3344G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234N(C0237Q c0237q, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f3344G = c0237q;
        this.f3343E = new Rect();
        this.f3310o = c0237q;
        this.f3320y = true;
        this.f3321z.setFocusable(true);
        this.f3311p = new P0.u(1, this);
    }

    @Override // l.InterfaceC0236P
    public final CharSequence b() {
        return this.f3341C;
    }

    @Override // l.InterfaceC0236P
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0222B c0222b = this.f3321z;
        boolean isShowing = c0222b.isShowing();
        s();
        this.f3321z.setInputMethodMode(2);
        i();
        C0278t0 c0278t0 = this.f3301c;
        c0278t0.setChoiceMode(1);
        c0278t0.setTextDirection(i);
        c0278t0.setTextAlignment(i2);
        C0237Q c0237q = this.f3344G;
        int selectedItemPosition = c0237q.getSelectedItemPosition();
        C0278t0 c0278t02 = this.f3301c;
        if (c0222b.isShowing() && c0278t02 != null) {
            c0278t02.setListSelectionHidden(false);
            c0278t02.setSelection(selectedItemPosition);
            if (c0278t02.getChoiceMode() != 0) {
                c0278t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0237q.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0193d viewTreeObserverOnGlobalLayoutListenerC0193d = new ViewTreeObserverOnGlobalLayoutListenerC0193d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0193d);
        this.f3321z.setOnDismissListener(new C0233M(this, viewTreeObserverOnGlobalLayoutListenerC0193d));
    }

    @Override // l.InterfaceC0236P
    public final void h(CharSequence charSequence) {
        this.f3341C = charSequence;
    }

    @Override // l.G0, l.InterfaceC0236P
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f3342D = (C0232L) listAdapter;
    }

    @Override // l.InterfaceC0236P
    public final void p(int i) {
        this.F = i;
    }

    public final void s() {
        int i;
        C0222B c0222b = this.f3321z;
        Drawable background = c0222b.getBackground();
        C0237Q c0237q = this.f3344G;
        if (background != null) {
            background.getPadding(c0237q.h);
            boolean z2 = j1.f3445a;
            int layoutDirection = c0237q.getLayoutDirection();
            Rect rect = c0237q.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0237q.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0237q.getPaddingLeft();
        int paddingRight = c0237q.getPaddingRight();
        int width = c0237q.getWidth();
        int i2 = c0237q.f3363g;
        if (i2 == -2) {
            int a2 = c0237q.a(this.f3342D, c0222b.getBackground());
            int i3 = c0237q.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0237q.h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a2 > i4) {
                a2 = i4;
            }
            r(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z3 = j1.f3445a;
        this.f3303f = c0237q.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f3302e) - this.F) + i : paddingLeft + this.F + i;
    }
}
