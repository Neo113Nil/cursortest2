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
public final class C0241j0 extends ToggleButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0254q f3001a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f3002b;

    /* renamed from: c, reason: collision with root package name */
    public C0270y f3003c;

    public C0241j0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        S0.a(this, getContext());
        C0254q c0254q = new C0254q(this);
        this.f3001a = c0254q;
        c0254q.d(attributeSet, R.attr.buttonStyleToggle);
        Z z2 = new Z(this);
        this.f3002b = z2;
        z2.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0270y getEmojiTextViewHelper() {
        if (this.f3003c == null) {
            this.f3003c = new C0270y(this);
        }
        return this.f3003c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0254q c0254q = this.f3001a;
        if (c0254q != null) {
            c0254q.a();
        }
        Z z2 = this.f3002b;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0254q c0254q = this.f3001a;
        if (c0254q != null) {
            return c0254q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0254q c0254q = this.f3001a;
        if (c0254q != null) {
            return c0254q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3002b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3002b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0254q c0254q = this.f3001a;
        if (c0254q != null) {
            c0254q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0254q c0254q = this.f3001a;
        if (c0254q != null) {
            c0254q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3002b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f3002b;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3087b.f59b).x(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0254q c0254q = this.f3001a;
        if (c0254q != null) {
            c0254q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0254q c0254q = this.f3001a;
        if (c0254q != null) {
            c0254q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f3002b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f3002b;
        z2.m(mode);
        z2.b();
    }
}
