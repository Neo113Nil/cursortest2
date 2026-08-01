package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: l.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258j0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0271q f3442a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3443b;

    /* renamed from: c, reason: collision with root package name */
    public C0285x f3444c;

    public C0258j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        S0.a(this, getContext());
        C0271q c0271q = new C0271q(this);
        this.f3442a = c0271q;
        c0271q.d(attributeSet, R.attr.buttonStyleToggle);
        Y y2 = new Y(this);
        this.f3443b = y2;
        y2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0285x getEmojiTextViewHelper() {
        if (this.f3444c == null) {
            this.f3444c = new C0285x(this);
        }
        return this.f3444c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0271q c0271q = this.f3442a;
        if (c0271q != null) {
            c0271q.a();
        }
        Y y2 = this.f3443b;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3442a;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3442a;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3443b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3443b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3442a;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271q c0271q = this.f3442a;
        if (c0271q != null) {
            c0271q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3443b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3443b;
        if (y2 != null) {
            y2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((F1.d) getEmojiTextViewHelper().f3526b.f38b).G(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271q c0271q = this.f3442a;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3442a;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3443b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3443b;
        y2.m(mode);
        y2.b();
    }
}
