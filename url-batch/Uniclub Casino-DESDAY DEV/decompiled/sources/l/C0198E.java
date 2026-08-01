package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.fortuneodd.shadegrid.R;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0198E extends RadioButton implements Q.t {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f2858a;

    /* renamed from: b, reason: collision with root package name */
    public final C0244q f2859b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f2860c;
    public C0260y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        T0.a(context);
        S0.a(this, getContext());
        h0.d dVar = new h0.d(this);
        this.f2858a = dVar;
        dVar.d(attributeSet, R.attr.radioButtonStyle);
        C0244q c0244q = new C0244q(this);
        this.f2859b = c0244q;
        c0244q.d(attributeSet, R.attr.radioButtonStyle);
        Z z2 = new Z(this);
        this.f2860c = z2;
        z2.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().a(attributeSet, R.attr.radioButtonStyle);
    }

    private C0260y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0260y(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0244q c0244q = this.f2859b;
        if (c0244q != null) {
            c0244q.a();
        }
        Z z2 = this.f2860c;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244q c0244q = this.f2859b;
        if (c0244q != null) {
            return c0244q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0244q c0244q = this.f2859b;
        if (c0244q != null) {
            return c0244q.c();
        }
        return null;
    }

    @Override // Q.t
    public ColorStateList getSupportButtonTintList() {
        h0.d dVar = this.f2858a;
        if (dVar != null) {
            return (ColorStateList) dVar.f2379e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h0.d dVar = this.f2858a;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f2380f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2860c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2860c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244q c0244q = this.f2859b;
        if (c0244q != null) {
            c0244q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244q c0244q = this.f2859b;
        if (c0244q != null) {
            c0244q.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h0.d dVar = this.f2858a;
        if (dVar != null) {
            if (dVar.f2378c) {
                dVar.f2378c = false;
            } else {
                dVar.f2378c = true;
                dVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2860c;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2860c;
        if (z2 != null) {
            z2.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.d) getEmojiTextViewHelper().f3096b.f62b).x(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244q c0244q = this.f2859b;
        if (c0244q != null) {
            c0244q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0244q c0244q = this.f2859b;
        if (c0244q != null) {
            c0244q.i(mode);
        }
    }

    @Override // Q.t
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h0.d dVar = this.f2858a;
        if (dVar != null) {
            dVar.f2379e = colorStateList;
            dVar.f2376a = true;
            dVar.a();
        }
    }

    @Override // Q.t
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h0.d dVar = this.f2858a;
        if (dVar != null) {
            dVar.f2380f = mode;
            dVar.f2377b = true;
            dVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2860c;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2860c;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(q1.d.u(getContext(), i));
    }
}
