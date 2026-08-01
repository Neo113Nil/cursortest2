package l;

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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: l.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0219d0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0244q f2973a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f2974b;

    /* renamed from: c, reason: collision with root package name */
    public final C0197D f2975c;
    public C0260y d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2976e;

    /* renamed from: f, reason: collision with root package name */
    public C0238n f2977f;

    /* renamed from: g, reason: collision with root package name */
    public Future f2978g;

    public C0219d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0260y getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0260y(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0244q c0244q = this.f2973a;
        if (c0244q != null) {
            c0244q.a();
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.b();
        }
    }

    public final void g() {
        Future future = this.f2978g;
        if (future == null) {
            return;
        }
        try {
            this.f2978g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            q1.d.y(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (i1.f3009c) {
            return super.getAutoSizeMaxTextSize();
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            return Math.round(z2.i.f3002e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (i1.f3009c) {
            return super.getAutoSizeMinTextSize();
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            return Math.round(z2.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (i1.f3009c) {
            return super.getAutoSizeStepGranularity();
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            return Math.round(z2.i.f3001c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f3009c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        Z z2 = this.f2974b;
        return z2 != null ? z2.i.f3003f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (i1.f3009c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            return z2.i.f2999a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof Q.r ? ((Q.r) customSelectionActionModeCallback).f649a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0213a0 getSuperCaller() {
        if (this.f2977f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f2977f = new C0217c0(this);
            } else if (i >= 28) {
                this.f2977f = new C0215b0(this);
            } else {
                this.f2977f = new C0238n(this);
            }
        }
        return this.f2977f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244q c0244q = this.f2973a;
        if (c0244q != null) {
            return c0244q.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0244q c0244q = this.f2973a;
        if (c0244q != null) {
            return c0244q.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2974b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2974b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0197D c0197d;
        if (Build.VERSION.SDK_INT >= 28 || (c0197d = this.f2975c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0197d.f2856c;
        return textClassifier == null ? T.a((TextView) c0197d.f2855b) : textClassifier;
    }

    public I.d getTextMetricsParamsCompat() {
        return q1.d.y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2974b.getClass();
        Z.h(editorInfo, onCreateInputConnection, this);
        i1.r.g(editorInfo, onCreateInputConnection, this);
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
        Z z3 = this.f2974b;
        if (z3 == null || i1.f3009c) {
            return;
        }
        z3.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Z z2 = this.f2974b;
        if (z2 == null || i1.f3009c) {
            return;
        }
        C0229i0 c0229i0 = z2.i;
        if (c0229i0.f()) {
            c0229i0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (i1.f3009c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (i1.f3009c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (i1.f3009c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244q c0244q = this.f2973a;
        if (c0244q != null) {
            c0244q.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244q c0244q = this.f2973a;
        if (c0244q != null) {
            c0244q.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(q1.d.a0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((q1.d) getEmojiTextViewHelper().f3096b.f62b).x(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            q1.d.S(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            q1.d.U(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        q1.d.V(this, i);
    }

    public void setPrecomputedText(I.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        q1.d.y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244q c0244q = this.f2973a;
        if (c0244q != null) {
            c0244q.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0244q c0244q = this.f2973a;
        if (c0244q != null) {
            c0244q.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        Z z2 = this.f2974b;
        z2.l(colorStateList);
        z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        Z z2 = this.f2974b;
        z2.m(mode);
        z2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0197D c0197d;
        if (Build.VERSION.SDK_INT >= 28 || (c0197d = this.f2975c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0197d.f2856c = textClassifier;
        }
    }

    public void setTextFuture(Future<I.e> future) {
        this.f2978g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(I.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f241b;
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
        getPaint().set(dVar.f240a);
        Q.n.e(this, dVar.f242c);
        Q.n.h(this, dVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = i1.f3009c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        Z z3 = this.f2974b;
        if (z3 == null || z2) {
            return;
        }
        C0229i0 c0229i0 = z3.i;
        if (c0229i0.f()) {
            return;
        }
        c0229i0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f2976e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            q1.d dVar = C.h.f63a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f2976e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2976e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0219d0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        T0.a(context);
        this.f2976e = false;
        this.f2977f = null;
        S0.a(this, getContext());
        C0244q c0244q = new C0244q(this);
        this.f2973a = c0244q;
        c0244q.d(attributeSet, i);
        Z z2 = new Z(this);
        this.f2974b = z2;
        z2.f(attributeSet, i);
        z2.b();
        C0197D c0197d = new C0197D();
        c0197d.f2855b = this;
        this.f2975c = c0197d;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().d(i, f2);
        } else if (i2 >= 34) {
            Q.q.a(this, i, f2);
        } else {
            q1.d.V(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? q1.d.u(context, i) : null, i2 != 0 ? q1.d.u(context, i2) : null, i3 != 0 ? q1.d.u(context, i3) : null, i4 != 0 ? q1.d.u(context, i4) : null);
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? q1.d.u(context, i) : null, i2 != 0 ? q1.d.u(context, i2) : null, i3 != 0 ? q1.d.u(context, i3) : null, i4 != 0 ? q1.d.u(context, i4) : null);
        Z z2 = this.f2974b;
        if (z2 != null) {
            z2.b();
        }
    }
}
