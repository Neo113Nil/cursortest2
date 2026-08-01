package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.f80;
import defpackage.j4;
import defpackage.j7;
import defpackage.s9;
import defpackage.t9;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class CheckableImageButton extends j4 implements Checkable {
    public static final int[] m = {R.attr.state_checked};
    public boolean i;
    public boolean j;
    public boolean k;
    public s9 l;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.imageButtonStyle);
        this.j = true;
        this.k = true;
        f80.m(this, new j7(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.i ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), m) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof t9)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        t9 t9Var = (t9) parcelable;
        super.onRestoreInstanceState(t9Var.f);
        setChecked(t9Var.h);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        t9 t9Var = new t9(super.onSaveInstanceState());
        t9Var.h = this.i;
        return t9Var;
    }

    public void setCheckable(boolean z) {
        if (this.j != z) {
            this.j = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.j || this.i == z) {
            return;
        }
        this.i = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public void setFocusable(boolean z) {
        s9 s9Var;
        boolean isFocusable = isFocusable();
        super.setFocusable(z);
        if (isFocusable == z || (s9Var = this.l) == null) {
            return;
        }
        s9Var.b();
    }

    public void setOnFocusableChangedListener(s9 s9Var) {
        this.l = s9Var;
    }

    public void setPressable(boolean z) {
        this.k = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.k) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.i);
    }
}
