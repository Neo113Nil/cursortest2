package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: o.b6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754b6 extends ToggleButton {
    public final L4 h;
    public final R5 i;
    public C1607o5 j;

    public C0754b6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        CV.a(this, getContext());
        L4 l4 = new L4(this);
        this.h = l4;
        l4.e(attributeSet, R.attr.buttonStyleToggle);
        R5 r5 = new R5(this);
        this.i = r5;
        r5.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1607o5 getEmojiTextViewHelper() {
        if (this.j == null) {
            this.j = new C1607o5(this);
        }
        return this.j;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        L4 l4 = this.h;
        if (l4 != null) {
            l4.a();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        L4 l4 = this.h;
        if (l4 != null) {
            return l4.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        L4 l4 = this.h;
        if (l4 != null) {
            return l4.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.i.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        L4 l4 = this.h;
        if (l4 != null) {
            l4.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        L4 l4 = this.h;
        if (l4 != null) {
            l4.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.i;
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
        L4 l4 = this.h;
        if (l4 != null) {
            l4.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        L4 l4 = this.h;
        if (l4 != null) {
            l4.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        R5 r5 = this.i;
        r5.k(colorStateList);
        r5.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        R5 r5 = this.i;
        r5.l(mode);
        r5.b();
    }
}
