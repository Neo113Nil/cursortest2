package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import i0.C0141d;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0230q extends CheckBox implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final C0141d f3056a;

    /* renamed from: b, reason: collision with root package name */
    public final C0228p f3057b;

    /* renamed from: c, reason: collision with root package name */
    public final X f3058c;
    public C0242w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0230q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        Q0.a(this, getContext());
        C0141d c0141d = new C0141d(this);
        this.f3056a = c0141d;
        c0141d.d(attributeSet, i);
        C0228p c0228p = new C0228p(this);
        this.f3057b = c0228p;
        c0228p.d(attributeSet, i);
        X x2 = new X(this);
        this.f3058c = x2;
        x2.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private C0242w getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0242w(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0228p c0228p = this.f3057b;
        if (c0228p != null) {
            c0228p.a();
        }
        X x2 = this.f3058c;
        if (x2 != null) {
            x2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0228p c0228p = this.f3057b;
        if (c0228p != null) {
            return c0228p.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0228p c0228p = this.f3057b;
        if (c0228p != null) {
            return c0228p.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        C0141d c0141d = this.f3056a;
        if (c0141d != null) {
            return (ColorStateList) c0141d.f2614e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0141d c0141d = this.f3056a;
        if (c0141d != null) {
            return (PorterDuff.Mode) c0141d.f2615f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3058c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3058c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0228p c0228p = this.f3057b;
        if (c0228p != null) {
            c0228p.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0228p c0228p = this.f3057b;
        if (c0228p != null) {
            c0228p.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0141d c0141d = this.f3056a;
        if (c0141d != null) {
            if (c0141d.f2613c) {
                c0141d.f2613c = false;
            } else {
                c0141d.f2613c = true;
                c0141d.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3058c;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3058c;
        if (x2 != null) {
            x2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((T.e) getEmojiTextViewHelper().f3095b.f30b).y(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0228p c0228p = this.f3057b;
        if (c0228p != null) {
            c0228p.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0228p c0228p = this.f3057b;
        if (c0228p != null) {
            c0228p.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0141d c0141d = this.f3056a;
        if (c0141d != null) {
            c0141d.f2614e = colorStateList;
            c0141d.f2611a = true;
            c0141d.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0141d c0141d = this.f3056a;
        if (c0141d != null) {
            c0141d.f2615f = mode;
            c0141d.f2612b = true;
            c0141d.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3058c;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3058c;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(T.e.w(getContext(), i));
    }
}
