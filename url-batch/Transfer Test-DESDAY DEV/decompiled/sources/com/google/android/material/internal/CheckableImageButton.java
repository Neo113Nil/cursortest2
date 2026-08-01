package com.google.android.material.internal;

import A0.f;
import I0.a;
import K.T;
import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import l.C0244x;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0244x implements Checkable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f1953g = {R.attr.state_checked};
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1954e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1955f;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.football.transfertrivia.R.attr.imageButtonStyle);
        this.f1954e = true;
        this.f1955f = true;
        T.l(this, new f(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f1953g) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f771a);
        setChecked(aVar.f267c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f267c = this.d;
        return aVar;
    }

    public void setCheckable(boolean z2) {
        if (this.f1954e != z2) {
            this.f1954e = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f1954e || this.d == z2) {
            return;
        }
        this.d = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f1955f = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f1955f) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.d);
    }
}
