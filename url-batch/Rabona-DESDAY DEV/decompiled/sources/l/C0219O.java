package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.linetic.luckycross.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0149d;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219O extends G0 implements InterfaceC0221Q {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2912C;

    /* renamed from: D, reason: collision with root package name */
    public C0217M f2913D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2914E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0222S f2915G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219O(C0222S c0222s, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2915G = c0222s;
        this.f2914E = new Rect();
        this.f2874o = c0222s;
        this.f2884y = true;
        this.f2885z.setFocusable(true);
        this.f2875p = new K0.v(1, this);
    }

    @Override // l.InterfaceC0221Q
    public final CharSequence b() {
        return this.f2912C;
    }

    @Override // l.InterfaceC0221Q
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0207C c0207c = this.f2885z;
        boolean isShowing = c0207c.isShowing();
        s();
        this.f2885z.setInputMethodMode(2);
        i();
        C0262t0 c0262t0 = this.f2865c;
        c0262t0.setChoiceMode(1);
        c0262t0.setTextDirection(i);
        c0262t0.setTextAlignment(i2);
        C0222S c0222s = this.f2915G;
        int selectedItemPosition = c0222s.getSelectedItemPosition();
        C0262t0 c0262t02 = this.f2865c;
        if (c0207c.isShowing() && c0262t02 != null) {
            c0262t02.setListSelectionHidden(false);
            c0262t02.setSelection(selectedItemPosition);
            if (c0262t02.getChoiceMode() != 0) {
                c0262t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0222s.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0149d viewTreeObserverOnGlobalLayoutListenerC0149d = new ViewTreeObserverOnGlobalLayoutListenerC0149d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0149d);
        this.f2885z.setOnDismissListener(new C0218N(this, viewTreeObserverOnGlobalLayoutListenerC0149d));
    }

    @Override // l.InterfaceC0221Q
    public final void h(CharSequence charSequence) {
        this.f2912C = charSequence;
    }

    @Override // l.G0, l.InterfaceC0221Q
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2913D = (C0217M) listAdapter;
    }

    @Override // l.InterfaceC0221Q
    public final void o(int i) {
        this.F = i;
    }

    public final void s() {
        int i;
        C0207C c0207c = this.f2885z;
        Drawable background = c0207c.getBackground();
        C0222S c0222s = this.f2915G;
        if (background != null) {
            background.getPadding(c0222s.h);
            boolean z2 = i1.f3004a;
            int layoutDirection = c0222s.getLayoutDirection();
            Rect rect = c0222s.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0222s.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0222s.getPaddingLeft();
        int paddingRight = c0222s.getPaddingRight();
        int width = c0222s.getWidth();
        int i2 = c0222s.f2928g;
        if (i2 == -2) {
            int a2 = c0222s.a(this.f2913D, c0207c.getBackground());
            int i3 = c0222s.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0222s.h;
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
        boolean z3 = i1.f3004a;
        this.f2867f = c0222s.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2866e) - this.F) + i : paddingLeft + this.F + i;
    }
}
