package l;

import K.C0011l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* renamed from: l.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0195B extends MultiAutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0244q f2849a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f2850b;

    /* renamed from: c, reason: collision with root package name */
    public final C0197D f2851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195B(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.fortuneodd.shadegrid.R.attr.autoCompleteTextViewStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0011l r2 = C0011l.r(getContext(), attributeSet, d, com.fortuneodd.shadegrid.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) r2.f414c).hasValue(0)) {
            setDropDownBackgroundDrawable(r2.h(0));
        }
        r2.t();
        C0244q c0244q = new C0244q(this);
        this.f2849a = c0244q;
        c0244q.d(attributeSet, com.fortuneodd.shadegrid.R.attr.autoCompleteTextViewStyle);
        Z z2 = new Z(this);
        this.f2850b = z2;
        z2.f(attributeSet, com.fortuneodd.shadegrid.R.attr.autoCompleteTextViewStyle);
        z2.b();
        C0197D c0197d = new C0197D(this);
        this.f2851c = c0197d;
        c0197d.b(attributeSet, com.fortuneodd.shadegrid.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener a2 = c0197d.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0244q c0244q = this.f2849a;
        if (c0244q != null) {
            c0244q.a();
        }
        Z z2 = this.f2850b;
        if (z2 != null) {
            z2.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244q c0244q = this.f2849a;
        if (c0244q != null) {
            return c0244q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0244q c0244q = this.f2849a;
        if (c0244q != null) {
            return c0244q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2850b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2850b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        i1.r.g(editorInfo, onCreateInputConnection, this);
        return this.f2851c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244q c0244q = this.f2849a;
        if (c0244q != null) {
            c0244q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244q c0244q = this.f2849a;
        if (c0244q != null) {
            c0244q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2850b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2850b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(q1.d.u(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f2851c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2851c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244q c0244q = this.f2849a;
        if (c0244q != null) {
            c0244q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0244q c0244q = this.f2849a;
        if (c0244q != null) {
            c0244q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2850b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2850b;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f2850b;
        if (z2 != null) {
            z2.g(context, i);
        }
    }
}
