package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class p4 extends RadioButton implements h50 {
    public final h3 f;
    public final y1 g;
    public final l5 h;
    public i4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        f50.a(context);
        b50.a(this, getContext());
        h3 h3Var = new h3(this);
        this.f = h3Var;
        h3Var.d(attributeSet, R.attr.radioButtonStyle);
        y1 y1Var = new y1(this);
        this.g = y1Var;
        y1Var.l(attributeSet, R.attr.radioButtonStyle);
        l5 l5Var = new l5(this);
        this.h = l5Var;
        l5Var.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private i4 getEmojiTextViewHelper() {
        if (this.i == null) {
            this.i = new i4(this);
        }
        return this.i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.a();
        }
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.g;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    @Override // defpackage.h50
    public ColorStateList getSupportButtonTintList() {
        h3 h3Var = this.f;
        if (h3Var != null) {
            return (ColorStateList) h3Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h3 h3Var = this.f;
        if (h3Var != null) {
            return (PorterDuff.Mode) h3Var.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.o(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h3 h3Var = this.f;
        if (h3Var != null) {
            if (h3Var.e) {
                h3Var.e = false;
            } else {
                h3Var.e = true;
                h3Var.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((g8) getEmojiTextViewHelper().b.g).C(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.g;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    @Override // defpackage.h50
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h3 h3Var = this.f;
        if (h3Var != null) {
            h3Var.a = colorStateList;
            h3Var.c = true;
            h3Var.a();
        }
    }

    @Override // defpackage.h50
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h3 h3Var = this.f;
        if (h3Var != null) {
            h3Var.b = mode;
            h3Var.d = true;
            h3Var.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        l5 l5Var = this.h;
        l5Var.l(colorStateList);
        l5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        l5 l5Var = this.h;
        l5Var.m(mode);
        l5Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(vv.t(getContext(), i));
    }
}
