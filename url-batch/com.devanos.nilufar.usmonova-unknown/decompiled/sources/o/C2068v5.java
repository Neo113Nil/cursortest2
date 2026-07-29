package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.v5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2068v5 extends RadioButton {
    public final Q4 h;
    public final L4 i;
    public final R5 j;
    public C1607o5 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2068v5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        RV.a(context);
        CV.a(this, getContext());
        Q4 q4 = new Q4(this);
        this.h = q4;
        q4.c(attributeSet, R.attr.radioButtonStyle);
        L4 l4 = new L4(this);
        this.i = l4;
        l4.e(attributeSet, R.attr.radioButtonStyle);
        R5 r5 = new R5(this);
        this.j = r5;
        r5.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C1607o5 getEmojiTextViewHelper() {
        if (this.k == null) {
            this.k = new C1607o5(this);
        }
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L4 l4 = this.i;
        if (l4 != null) {
            l4.a();
        }
        R5 r5 = this.j;
        if (r5 != null) {
            r5.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        L4 l4 = this.i;
        if (l4 != null) {
            return l4.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        L4 l4 = this.i;
        if (l4 != null) {
            return l4.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        Q4 q4 = this.h;
        if (q4 != null) {
            return (ColorStateList) q4.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        Q4 q4 = this.h;
        if (q4 != null) {
            return (PorterDuff.Mode) q4.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.j.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.j.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        L4 l4 = this.i;
        if (l4 != null) {
            l4.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        L4 l4 = this.i;
        if (l4 != null) {
            l4.g(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        Q4 q4 = this.h;
        if (q4 != null) {
            if (q4.e) {
                q4.e = false;
            } else {
                q4.e = true;
                q4.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.j;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.j;
        if (r5 != null) {
            r5.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0048Bt) getEmojiTextViewHelper().b.i).H(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        L4 l4 = this.i;
        if (l4 != null) {
            l4.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        L4 l4 = this.i;
        if (l4 != null) {
            l4.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        Q4 q4 = this.h;
        if (q4 != null) {
            q4.a = colorStateList;
            q4.c = true;
            q4.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        Q4 q4 = this.h;
        if (q4 != null) {
            q4.b = mode;
            q4.d = true;
            q4.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        R5 r5 = this.j;
        r5.k(colorStateList);
        r5.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        R5 r5 = this.j;
        r5.l(mode);
        r5.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(EB.t(getContext(), i));
    }
}
