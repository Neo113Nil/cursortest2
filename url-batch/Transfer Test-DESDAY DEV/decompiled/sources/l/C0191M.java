package l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.football.transfertrivia.R;
import k.ViewTreeObserverOnGlobalLayoutListenerC0155d;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191M extends E0 implements InterfaceC0193O {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2916C;

    /* renamed from: D, reason: collision with root package name */
    public C0189K f2917D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2918E;
    public int F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C0194P f2919G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191M(C0194P c0194p, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2919G = c0194p;
        this.f2918E = new Rect();
        this.f2878o = c0194p;
        this.f2888y = true;
        this.f2889z.setFocusable(true);
        this.f2879p = new R0.u(1, this);
    }

    @Override // l.InterfaceC0193O
    public final CharSequence b() {
        return this.f2916C;
    }

    @Override // l.InterfaceC0193O
    public final void g(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C0179A c0179a = this.f2889z;
        boolean isShowing = c0179a.isShowing();
        r();
        this.f2889z.setInputMethodMode(2);
        i();
        C0233r0 c0233r0 = this.f2869c;
        c0233r0.setChoiceMode(1);
        c0233r0.setTextDirection(i);
        c0233r0.setTextAlignment(i2);
        C0194P c0194p = this.f2919G;
        int selectedItemPosition = c0194p.getSelectedItemPosition();
        C0233r0 c0233r02 = this.f2869c;
        if (c0179a.isShowing() && c0233r02 != null) {
            c0233r02.setListSelectionHidden(false);
            c0233r02.setSelection(selectedItemPosition);
            if (c0233r02.getChoiceMode() != 0) {
                c0233r02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c0194p.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0155d viewTreeObserverOnGlobalLayoutListenerC0155d = new ViewTreeObserverOnGlobalLayoutListenerC0155d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0155d);
        this.f2889z.setOnDismissListener(new C0190L(this, viewTreeObserverOnGlobalLayoutListenerC0155d));
    }

    @Override // l.InterfaceC0193O
    public final void h(CharSequence charSequence) {
        this.f2916C = charSequence;
    }

    @Override // l.E0, l.InterfaceC0193O
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2917D = (C0189K) listAdapter;
    }

    @Override // l.InterfaceC0193O
    public final void o(int i) {
        this.F = i;
    }

    public final void r() {
        int i;
        C0179A c0179a = this.f2889z;
        Drawable background = c0179a.getBackground();
        C0194P c0194p = this.f2919G;
        if (background != null) {
            background.getPadding(c0194p.h);
            boolean z2 = h1.f3011a;
            int layoutDirection = c0194p.getLayoutDirection();
            Rect rect = c0194p.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c0194p.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c0194p.getPaddingLeft();
        int paddingRight = c0194p.getPaddingRight();
        int width = c0194p.getWidth();
        int i2 = c0194p.f2932g;
        if (i2 == -2) {
            int a2 = c0194p.a(this.f2917D, c0179a.getBackground());
            int i3 = c0194p.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c0194p.h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (a2 > i4) {
                a2 = i4;
            }
            q(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z3 = h1.f3011a;
        this.f2871f = c0194p.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2870e) - this.F) + i : paddingLeft + this.F + i;
    }
}
