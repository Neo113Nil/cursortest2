package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.fortuneodd.shadegrid.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0159d;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208O extends G0 implements InterfaceC0210Q {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2915C;

    /* renamed from: D, reason: collision with root package name */
    public C0206M f2916D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2917E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0211S f2918G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208O(C0211S c0211s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2918G = c0211s;
        this.f2917E = new Rect();
        this.f2877o = c0211s;
        this.f2887y = true;
        this.f2888z.setFocusable(true);
        this.f2878p = new M0.v(1, this);
    }

    @Override // l.InterfaceC0210Q
    public final CharSequence b() {
        return this.f2915C;
    }

    @Override // l.InterfaceC0210Q
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0196C c0196c = this.f2888z;
        boolean isShowing = c0196c.isShowing();
        s();
        this.f2888z.setInputMethodMode(2);
        i();
        C0251t0 c0251t0 = this.f2868c;
        c0251t0.setChoiceMode(1);
        c0251t0.setTextDirection(i);
        c0251t0.setTextAlignment(i2);
        C0211S c0211s = this.f2918G;
        int selectedItemPosition = c0211s.getSelectedItemPosition();
        C0251t0 c0251t02 = this.f2868c;
        if (c0196c.isShowing() && c0251t02 != null) {
            c0251t02.setListSelectionHidden(false);
            c0251t02.setSelection(selectedItemPosition);
            if (c0251t02.getChoiceMode() != 0) {
                c0251t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0211s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0159d viewTreeObserverOnGlobalLayoutListenerC0159d = new ViewTreeObserverOnGlobalLayoutListenerC0159d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0159d);
        this.f2888z.setOnDismissListener(new C0207N(this, viewTreeObserverOnGlobalLayoutListenerC0159d));
    }

    @Override // l.InterfaceC0210Q
    public final void h(CharSequence charSequence) {
        this.f2915C = charSequence;
    }

    @Override // l.G0, l.InterfaceC0210Q
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2916D = (C0206M) listAdapter;
    }

    @Override // l.InterfaceC0210Q
    public final void o(int i) {
        this.F = i;
    }

    public final void s() {
        int i;
        C0196C c0196c = this.f2888z;
        Drawable background = c0196c.getBackground();
        C0211S c0211s = this.f2918G;
        if (background != null) {
            background.getPadding(c0211s.h);
            boolean z2 = i1.f3007a;
            int layoutDirection = c0211s.getLayoutDirection();
            Rect rect = c0211s.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0211s.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0211s.getPaddingLeft();
        int paddingRight = c0211s.getPaddingRight();
        int width = c0211s.getWidth();
        int i2 = c0211s.f2931g;
        if (i2 == -2) {
            int a2 = c0211s.a(this.f2916D, c0196c.getBackground());
            int i3 = c0211s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0211s.h;
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
        boolean z3 = i1.f3007a;
        this.f2870f = c0211s.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2869e) - this.F) + i : paddingLeft + this.F + i;
    }
}
