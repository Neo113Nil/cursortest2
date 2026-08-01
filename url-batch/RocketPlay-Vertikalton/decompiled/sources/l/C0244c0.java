package l;

import a1.AbstractC0067d;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c1.AbstractC0104b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: l.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0244c0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0271q f3405a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f3406b;

    /* renamed from: c, reason: collision with root package name */
    public final C0223C f3407c;
    public C0285x d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3408e;

    /* renamed from: f, reason: collision with root package name */
    public C0265n f3409f;

    /* renamed from: g, reason: collision with root package name */
    public Future f3410g;

    public C0244c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0285x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0285x(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0271q c0271q = this.f3405a;
        if (c0271q != null) {
            c0271q.a();
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.b();
        }
    }

    public final void g() {
        Future future = this.f3410g;
        if (future == null) {
            return;
        }
        try {
            this.f3410g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            F1.d.I(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (j1.f3447c) {
            return super.getAutoSizeMaxTextSize();
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            return Math.round(y2.i.f3437e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (j1.f3447c) {
            return super.getAutoSizeMinTextSize();
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            return Math.round(y2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (j1.f3447c) {
            return super.getAutoSizeStepGranularity();
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            return Math.round(y2.i.f3436c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (j1.f3447c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Y y2 = this.f3406b;
        return y2 != null ? y2.i.f3438f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (j1.f3447c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            return y2.i.f3434a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.q ? ((Q.q) customSelectionActionModeCallback).f1058a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Z getSuperCaller() {
        if (this.f3409f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f3409f = new C0242b0(this);
            } else if (i >= 28) {
                this.f3409f = new C0240a0(this);
            } else {
                this.f3409f = new C0265n(this);
            }
        }
        return this.f3409f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0271q c0271q = this.f3405a;
        if (c0271q != null) {
            return c0271q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0271q c0271q = this.f3405a;
        if (c0271q != null) {
            return c0271q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3406b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3406b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0223C c0223c;
        if (Build.VERSION.SDK_INT >= 28 || (c0223c = this.f3407c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0223c.f3286c;
        return textClassifier == null ? AbstractC0238S.a((TextView) c0223c.f3285b) : textClassifier;
    }

    public I.e getTextMetricsParamsCompat() {
        return F1.d.I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3406b.getClass();
        Y.h(editorInfo, onCreateInputConnection, this);
        AbstractC0104b.s(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        Y y2 = this.f3406b;
        if (y2 == null || j1.f3447c) {
            return;
        }
        y2.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Y y2 = this.f3406b;
        if (y2 == null || j1.f3447c) {
            return;
        }
        C0256i0 c0256i0 = y2.i;
        if (c0256i0.f()) {
            c0256i0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (j1.f3447c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (j1.f3447c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (j1.f3447c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0271q c0271q = this.f3405a;
        if (c0271q != null) {
            c0271q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0271q c0271q = this.f3405a;
        if (c0271q != null) {
            c0271q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(F1.d.q0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((F1.d) getEmojiTextViewHelper().f3526b.f38b).G(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            F1.d.i0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            F1.d.k0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        F1.d.l0(this, i);
    }

    public void setPrecomputedText(I.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        F1.d.I(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0271q c0271q = this.f3405a;
        if (c0271q != null) {
            c0271q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0271q c0271q = this.f3405a;
        if (c0271q != null) {
            c0271q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Y y2 = this.f3406b;
        y2.l(colorStateList);
        y2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Y y2 = this.f3406b;
        y2.m(mode);
        y2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0223C c0223c;
        if (Build.VERSION.SDK_INT >= 28 || (c0223c = this.f3407c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0223c.f3286c = textClassifier;
        }
    }

    public void setTextFuture(Future<I.f> future) {
        this.f3410g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f579b;
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
        getPaint().set(eVar.f578a);
        Q.m.e(this, eVar.f580c);
        Q.m.h(this, eVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = j1.f3447c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Y y2 = this.f3406b;
        if (y2 == null || z2) {
            return;
        }
        C0256i0 c0256i0 = y2.i;
        if (c0256i0.f()) {
            return;
        }
        c0256i0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f3408e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            F1.d dVar = C.h.f238a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f3408e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f3408e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0244c0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f3408e = false;
        this.f3409f = null;
        S0.a(this, getContext());
        C0271q c0271q = new C0271q(this);
        this.f3405a = c0271q;
        c0271q.d(attributeSet, i);
        Y y2 = new Y(this);
        this.f3406b = y2;
        y2.f(attributeSet, i);
        y2.b();
        C0223C c0223c = new C0223C();
        c0223c.f3285b = this;
        this.f3407c = c0223c;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().d(i, f2);
        } else if (i2 >= 34) {
            Q.p.a(this, i, f2);
        } else {
            F1.d.l0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0067d.k(context, i) : null, i2 != 0 ? AbstractC0067d.k(context, i2) : null, i3 != 0 ? AbstractC0067d.k(context, i3) : null, i4 != 0 ? AbstractC0067d.k(context, i4) : null);
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0067d.k(context, i) : null, i2 != 0 ? AbstractC0067d.k(context, i2) : null, i3 != 0 ? AbstractC0067d.k(context, i3) : null, i4 != 0 ? AbstractC0067d.k(context, i4) : null);
        Y y2 = this.f3406b;
        if (y2 != null) {
            y2.b();
        }
    }
}
