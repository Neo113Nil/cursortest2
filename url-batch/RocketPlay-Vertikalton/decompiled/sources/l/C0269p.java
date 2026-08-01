package l;

import K.C0019l;
import a1.AbstractC0067d;
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
import c1.AbstractC0104b;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0269p extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0271q f3476a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3477b;

    /* renamed from: c, reason: collision with root package name */
    public final C0223C f3478c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0269p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckycounter.drinkwater.R.attr.autoCompleteTextViewStyle);
        T0.a(context);
        S0.a(this, getContext());
        C0019l i = C0019l.i(getContext(), attributeSet, d, com.luckycounter.drinkwater.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) i.f684b).hasValue(0)) {
            setDropDownBackgroundDrawable(i.c(0));
        }
        i.k();
        C0271q c0271q = new C0271q(this);
        this.f3476a = c0271q;
        c0271q.d(attributeSet, com.luckycounter.drinkwater.R.attr.autoCompleteTextViewStyle);
        Y y2 = new Y(this);
        this.f3477b = y2;
        y2.f(attributeSet, com.luckycounter.drinkwater.R.attr.autoCompleteTextViewStyle);
        y2.b();
        C0223C c0223c = new C0223C(this);
        this.f3478c = c0223c;
        c0223c.b(attributeSet, com.luckycounter.drinkwater.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = c0223c.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0271q c0271q = this.f3476a;
        if (c0271q != null) {
            c0271q.a();
        }
        Y y2 = this.f3477b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f1058a : customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3476a;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3476a;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3477b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3477b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0104b.s(editorInfo, onCreateInputConnection, this);
        return this.f3478c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3476a;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271q c0271q = this.f3476a;
        if (c0271q != null) {
            c0271q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3477b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3477b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(F1.d.q0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0067d.k(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f3478c.d(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f3478c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271q c0271q = this.f3476a;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3476a;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3477b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3477b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3477b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }
}
