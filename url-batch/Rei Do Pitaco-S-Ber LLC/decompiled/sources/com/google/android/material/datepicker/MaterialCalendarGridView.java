package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.as;
import defpackage.f80;
import defpackage.gs;
import defpackage.j0;
import defpackage.m60;
import defpackage.o10;
import defpackage.rt;
import defpackage.vr;
import defpackage.x60;
import defpackage.xr;
import defpackage.y5;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean f;
    public xr g;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        x60.c(null);
        if (gs.J(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.ionia.reidopitaco.libya.R.id.cancel_button);
            setNextFocusRightId(com.ionia.reidopitaco.libya.R.id.confirm_button);
        }
        this.f = gs.J(getContext(), com.ionia.reidopitaco.libya.R.attr.nestedScrollable);
        f80.m(this, new vr(2));
    }

    public static void a(MaterialCalendarGridView materialCalendarGridView) {
        rt rtVar = (rt) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.u;
        if (m60.S(context.getTheme(), com.ionia.reidopitaco.libya.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            y5 y5Var = rtVar.b;
            if (y5Var != null) {
                focusRingDrawable.t.t = (o10) ((j0) y5Var.a).g;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    public final rt b() {
        return (rt) super.getAdapter();
    }

    public final boolean c(int i, boolean z) {
        xr xrVar;
        xr xrVar2;
        int a = z ? ((rt) super.getAdapter()).a(i) : ((rt) super.getAdapter()).b(i);
        if (a != -1) {
            setSelection(a);
            return true;
        }
        if (!z && (xrVar2 = this.g) != null) {
            return as.H(xrVar2.a, false);
        }
        if (!z || (xrVar = this.g) == null) {
            return true;
        }
        return as.H(xrVar.a, true);
    }

    public final boolean d(int i) {
        rt rtVar = (rt) super.getAdapter();
        if (!rtVar.e(i)) {
            long itemId = rtVar.getItemId(i);
            for (int i2 = 1; i2 < rtVar.a.i; i2++) {
                int i3 = i + i2;
                if ((i3 < rt.e && rtVar.getItemId(i3) == itemId && rtVar.e(i3)) || ((i3 = i - i2) >= 0 && rtVar.getItemId(i3) == itemId && rtVar.e(i3))) {
                    i = i3;
                    break;
                }
            }
            i = -1;
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (rt) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((rt) super.getAdapter()).notifyDataSetChanged();
        post(new Runnable() { // from class: com.google.android.material.datepicker.a
            @Override // java.lang.Runnable
            public final void run() {
                MaterialCalendarGridView.a(MaterialCalendarGridView.this);
            }
        });
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rt rtVar = (rt) super.getAdapter();
        rtVar.getClass();
        int max = Math.max(rtVar.c(), getFirstVisiblePosition());
        int min = Math.min(rtVar.f(), getLastVisiblePosition());
        rtVar.getItem(max);
        rtVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int b;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            rt rtVar = (rt) super.getAdapter();
            b = rtVar.b(rtVar.f() + 1);
        } else if (i == 130 || i == 2) {
            rt rtVar2 = (rt) super.getAdapter();
            b = rtVar2.a(rtVar2.c() - 1);
        } else {
            b = -1;
        }
        if (b != -1) {
            setSelection(b);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return c(selectedItemPosition, z);
        }
        if (i == 22) {
            return c(selectedItemPosition, !z);
        }
        if (i == 61) {
            int b = keyEvent.isShiftPressed() ? ((rt) super.getAdapter()).b(selectedItemPosition) : ((rt) super.getAdapter()).a(selectedItemPosition);
            if (b == -1) {
                return false;
            }
            setSelection(b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        rt rtVar = (rt) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || rtVar.e(selectedItemPosition2)) {
            return true;
        }
        rt rtVar2 = (rt) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > rtVar2.f()) {
                            break;
                        }
                        if (d(numColumns)) {
                            break;
                        }
                        selectedItemPosition2 = getNumColumns();
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < rtVar2.c()) {
                    break;
                }
                if (d(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof rt)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), rt.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        super.setSelection(Math.max(i, ((rt) super.getAdapter()).a(r0.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (rt) super.getAdapter();
    }
}
