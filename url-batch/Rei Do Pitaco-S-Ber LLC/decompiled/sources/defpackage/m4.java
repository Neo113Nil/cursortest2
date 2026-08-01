package defpackage;

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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class m4 extends MultiAutoCompleteTextView {
    public static final int[] i = {R.attr.popupBackground};
    public final y1 f;
    public final l5 g;
    public final o4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.autoCompleteTextViewStyle);
        f50.a(context);
        b50.a(this, getContext());
        y5 l = y5.l(com.ionia.reidopitaco.libya.R.attr.autoCompleteTextViewStyle, 0, getContext(), attributeSet, i);
        if (((TypedArray) l.a).hasValue(0)) {
            setDropDownBackgroundDrawable(l.f(0));
        }
        l.n();
        y1 y1Var = new y1(this);
        this.f = y1Var;
        y1Var.l(attributeSet, com.ionia.reidopitaco.libya.R.attr.autoCompleteTextViewStyle);
        l5 l5Var = new l5(this);
        this.g = l5Var;
        l5Var.f(attributeSet, com.ionia.reidopitaco.libya.R.attr.autoCompleteTextViewStyle);
        l5Var.b();
        o4 o4Var = new o4(this, 5);
        this.h = o4Var;
        o4Var.z(attributeSet, com.ionia.reidopitaco.libya.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener v = o4Var.v(keyListener);
        if (v == keyListener) {
            return;
        }
        super.setKeyListener(v);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.a();
        }
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y1 y1Var = this.f;
        if (y1Var != null) {
            return y1Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.g.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        oo.A(editorInfo, onCreateInputConnection, this);
        return this.h.C(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.o(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(vv.t(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.h.M(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.h.v(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y1 y1Var = this.f;
        if (y1Var != null) {
            y1Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        l5 l5Var = this.g;
        l5Var.l(colorStateList);
        l5Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        l5 l5Var = this.g;
        l5Var.m(mode);
        l5Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        l5 l5Var = this.g;
        if (l5Var != null) {
            l5Var.g(context, i2);
        }
    }
}
