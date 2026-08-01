package l;

import a1.AbstractC0067d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.luckycounter.drinkwater.R;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0224D extends RadioButton implements Q.s {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f3289a;

    /* renamed from: b, reason: collision with root package name */
    public final C0271q f3290b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f3291c;
    public C0285x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0224D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        T0.a(context);
        S0.a(this, getContext());
        i0.d dVar = new i0.d(this);
        this.f3289a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0271q c0271q = new C0271q(this);
        this.f3290b = c0271q;
        c0271q.d(attributeSet, R.attr.radioButtonStyle);
        Y y2 = new Y(this);
        this.f3291c = y2;
        y2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0285x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0285x(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0271q c0271q = this.f3290b;
        if (c0271q != null) {
            c0271q.a();
        }
        Y y2 = this.f3291c;
        if (y2 != null) {
            y2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3290b;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3290b;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    @Override // Q.s
    public ColorStateList getSupportButtonTintList() {
        i0.d dVar = this.f3289a;
        if (dVar != null) {
            return (ColorStateList) dVar.f3034e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i0.d dVar = this.f3289a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f3035f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3291c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3291c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3290b;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271q c0271q = this.f3290b;
        if (c0271q != null) {
            c0271q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i0.d dVar = this.f3289a;
        if (dVar != null) {
            if (dVar.f3033c) {
                dVar.f3033c = false;
            } else {
                dVar.f3033c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3291c;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3291c;
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
        C0271q c0271q = this.f3290b;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3290b;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    @Override // Q.s
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i0.d dVar = this.f3289a;
        if (dVar != null) {
            dVar.f3034e = colorStateList;
            dVar.f3031a = true;
            dVar.a();
        }
    }

    @Override // Q.s
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i0.d dVar = this.f3289a;
        if (dVar != null) {
            dVar.f3035f = mode;
            dVar.f3032b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3291c;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3291c;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0067d.k(getContext(), i));
    }
}
