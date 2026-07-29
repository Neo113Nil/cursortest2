package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class K4 extends AutoCompleteTextView {
    public static final int[] k = {R.attr.popupBackground};
    public final L4 h;
    public final R5 i;
    public final C2002u5 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.devanos.nilufar.usmonova.R.attr.autoCompleteTextViewStyle);
        RV.a(context);
        CV.a(this, getContext());
        C0950e6 F = C0950e6.F(getContext(), attributeSet, k, com.devanos.nilufar.usmonova.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) F.i).hasValue(0)) {
            setDropDownBackgroundDrawable(F.x(0));
        }
        F.L();
        L4 l4 = new L4(this);
        this.h = l4;
        l4.e(attributeSet, com.devanos.nilufar.usmonova.R.attr.autoCompleteTextViewStyle);
        R5 r5 = new R5(this);
        this.i = r5;
        r5.f(attributeSet, com.devanos.nilufar.usmonova.R.attr.autoCompleteTextViewStyle);
        r5.b();
        C2002u5 c2002u5 = new C2002u5(this, 7);
        this.j = c2002u5;
        c2002u5.T(attributeSet, com.devanos.nilufar.usmonova.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener R = c2002u5.R(keyListener);
        if (R == keyListener) {
            return;
        }
        super.setKeyListener(R);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return PO.r(super.getCustomSelectionActionModeCallback());
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0048Bt.O(onCreateInputConnection, editorInfo, this);
        return this.j.U(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PO.s(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(EB.t(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.j.a0(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.R(keyListener));
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.g(context, i);
        }
    }
}
