package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.ratebook.luckyconvert.R;
import h0.C0133d;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0209E extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0133d f2833a;

    /* renamed from: b, reason: collision with root package name */
    public final C0255q f2834b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f2835c;
    public C0271y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0209E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0133d c0133d = new C0133d(this);
        this.f2833a = c0133d;
        c0133d.d(attributeSet, R.attr.radioButtonStyle);
        C0255q c0255q = new C0255q(this);
        this.f2834b = c0255q;
        c0255q.d(attributeSet, R.attr.radioButtonStyle);
        Z z2 = new Z(this);
        this.f2835c = z2;
        z2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0271y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0271y(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0255q c0255q = this.f2834b;
        if (c0255q != null) {
            c0255q.a();
        }
        Z z2 = this.f2835c;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0255q c0255q = this.f2834b;
        if (c0255q != null) {
            return c0255q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0255q c0255q = this.f2834b;
        if (c0255q != null) {
            return c0255q.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0133d c0133d = this.f2833a;
        if (c0133d != null) {
            return (ColorStateList) c0133d.f2373e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0133d c0133d = this.f2833a;
        if (c0133d != null) {
            return (PorterDuff.Mode) c0133d.f2374f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2835c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2835c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0255q c0255q = this.f2834b;
        if (c0255q != null) {
            c0255q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0255q c0255q = this.f2834b;
        if (c0255q != null) {
            c0255q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0133d c0133d = this.f2833a;
        if (c0133d != null) {
            if (c0133d.f2372c) {
                c0133d.f2372c = false;
            } else {
                c0133d.f2372c = true;
                c0133d.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2835c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2835c;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.l) getEmojiTextViewHelper().f3071b.f59b).x(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0255q c0255q = this.f2834b;
        if (c0255q != null) {
            c0255q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0255q c0255q = this.f2834b;
        if (c0255q != null) {
            c0255q.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0133d c0133d = this.f2833a;
        if (c0133d != null) {
            c0133d.f2373e = colorStateList;
            c0133d.f2370a = true;
            c0133d.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0133d c0133d = this.f2833a;
        if (c0133d != null) {
            c0133d.f2374f = mode;
            c0133d.f2371b = true;
            c0133d.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2835c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2835c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(q1.l.v(getContext(), i));
    }
}
