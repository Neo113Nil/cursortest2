package o;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class V5 extends TextView {
    public final L4 h;
    public final R5 i;
    public final C2002u5 j;
    public C1607o5 k;
    public boolean l;
    public Y1 m;
    public Future n;

    public V5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1607o5 getEmojiTextViewHelper() {
        if (this.k == null) {
            this.k = new C1607o5(this);
        }
        return this.k;
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
    public int getAutoSizeMaxTextSize() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeMaxTextSize();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return Math.round(r5.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeMinTextSize();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return Math.round(r5.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeStepGranularity();
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return Math.round(r5.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        R5 r5 = this.i;
        return r5 != null ? r5.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC1468m00.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            return r5.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return PO.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public S5 getSuperCaller() {
        if (this.m == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.m = new U5(this);
            } else if (i >= 28) {
                this.m = new T5(this);
            } else if (i >= 26) {
                this.m = new Y1(7, this);
            }
        }
        return this.m;
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
    public CharSequence getText() {
        Future future = this.n;
        if (future != null) {
            try {
                this.n = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PO.h(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C2002u5 c2002u5;
        if (Build.VERSION.SDK_INT >= 28 || (c2002u5 = this.j) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2002u5.j;
        return textClassifier == null ? L5.a((TextView) c2002u5.i) : textClassifier;
    }

    public PI getTextMetricsParamsCompat() {
        return PO.h(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.i.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            CharSequence text = getText();
            if (i >= 30) {
                AbstractC0116Ej.a(editorInfo, text);
            } else {
                text.getClass();
                if (i >= 30) {
                    AbstractC0116Ej.a(editorInfo, text);
                } else {
                    int i2 = editorInfo.initialSelStart;
                    int i3 = editorInfo.initialSelEnd;
                    int i4 = i2 > i3 ? i3 : i2;
                    if (i2 <= i3) {
                        i2 = i3;
                    }
                    int length = text.length();
                    if (i4 < 0 || i2 > length) {
                        AbstractC1305jX.G(editorInfo, null, 0, 0);
                    } else {
                        int i5 = editorInfo.inputType & 4095;
                        if (i5 == 129 || i5 == 225 || i5 == 18) {
                            AbstractC1305jX.G(editorInfo, null, 0, 0);
                        } else if (length <= 2048) {
                            AbstractC1305jX.G(editorInfo, text, i4, i2);
                        } else {
                            int i6 = i2 - i4;
                            int i7 = i6 > 1024 ? 0 : i6;
                            int i8 = 2048 - i7;
                            int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
                            int min2 = Math.min(i4, i8 - min);
                            int i9 = i4 - min2;
                            if (Character.isLowSurrogate(text.charAt(i9))) {
                                i9++;
                                min2--;
                            }
                            if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                                min--;
                            }
                            int i10 = min2 + i7;
                            AbstractC1305jX.G(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
                        }
                    }
                }
            }
        }
        AbstractC0048Bt.O(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R5 r5 = this.i;
        if (r5 == null || AbstractC1468m00.c) {
            return;
        }
        r5.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.n;
        if (future != null) {
            try {
                this.n = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                PO.h(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        R5 r5 = this.i;
        if (r5 != null) {
            C0688a6 c0688a6 = r5.i;
            if (AbstractC1468m00.c || !c0688a6.f()) {
                return;
            }
            c0688a6.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC1468m00.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC1468m00.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC1468m00.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            r5.j(i);
        }
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(PO.s(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0048Bt) getEmojiTextViewHelper().b.i).H(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().H(i);
        } else {
            PO.m(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().m(i);
        } else {
            PO.n(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        PO.o(this, i);
    }

    public void setPrecomputedText(QI qi) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        PO.h(this);
        throw null;
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C2002u5 c2002u5;
        if (Build.VERSION.SDK_INT >= 28 || (c2002u5 = this.j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2002u5.j = textClassifier;
        }
    }

    public void setTextFuture(Future<QI> future) {
        this.n = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PI pi) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = pi.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(pi.a);
        AbstractC1962tV.e(this, pi.c);
        AbstractC1962tV.h(this, pi.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = AbstractC1468m00.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        R5 r5 = this.i;
        if (r5 != null) {
            C0688a6 c0688a6 = r5.i;
            if (z || c0688a6.f()) {
                return;
            }
            c0688a6.g(f, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.l) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC2219xO abstractC2219xO = BX.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.l = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.l = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RV.a(context);
        this.l = false;
        this.m = null;
        CV.a(this, getContext());
        L4 l4 = new L4(this);
        this.h = l4;
        l4.e(attributeSet, i);
        R5 r5 = new R5(this);
        this.i = r5;
        r5.f(attributeSet, i);
        r5.b();
        C2002u5 c2002u5 = new C2002u5(8, false);
        c2002u5.i = this;
        this.j = c2002u5;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().O(i, f);
        } else if (i2 >= 34) {
            AbstractC2160wV.a(this, i, f);
        } else {
            PO.o(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? EB.t(context, i) : null, i2 != 0 ? EB.t(context, i2) : null, i3 != 0 ? EB.t(context, i3) : null, i4 != 0 ? EB.t(context, i4) : null);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? EB.t(context, i) : null, i2 != 0 ? EB.t(context, i2) : null, i3 != 0 ? EB.t(context, i3) : null, i4 != 0 ? EB.t(context, i4) : null);
        R5 r5 = this.i;
        if (r5 != null) {
            r5.b();
        }
    }
}
