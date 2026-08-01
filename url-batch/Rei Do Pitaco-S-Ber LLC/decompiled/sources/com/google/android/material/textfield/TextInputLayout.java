package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.af;
import defpackage.b8;
import defpackage.bi;
import defpackage.c8;
import defpackage.co;
import defpackage.d60;
import defpackage.e30;
import defpackage.eb;
import defpackage.f4;
import defpackage.f80;
import defpackage.g;
import defpackage.g8;
import defpackage.h;
import defpackage.h00;
import defpackage.hg;
import defpackage.j0;
import defpackage.jr;
import defpackage.js;
import defpackage.jx;
import defpackage.k30;
import defpackage.l8;
import defpackage.ls;
import defpackage.m60;
import defpackage.n10;
import defpackage.nd;
import defpackage.o10;
import defpackage.oi;
import defpackage.oo;
import defpackage.p1;
import defpackage.p40;
import defpackage.p5;
import defpackage.q40;
import defpackage.t40;
import defpackage.t7;
import defpackage.ta;
import defpackage.td;
import defpackage.tg;
import defpackage.u40;
import defpackage.u6;
import defpackage.ud;
import defpackage.v40;
import defpackage.vf;
import defpackage.vr;
import defpackage.vv;
import defpackage.w40;
import defpackage.y2;
import defpackage.y5;
import defpackage.y8;
import defpackage.zh;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] I0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public int B;
    public final ta B0;
    public oi C;
    public boolean C0;
    public oi D;
    public boolean D0;
    public ColorStateList E;
    public ValueAnimator E0;
    public ColorStateList F;
    public boolean F0;
    public ColorStateList G;
    public boolean G0;
    public ColorStateList H;
    public boolean H0;
    public boolean I;
    public CharSequence J;
    public boolean K;
    public ls L;
    public ls M;
    public StateListDrawable N;
    public boolean O;
    public ls P;
    public ls Q;
    public o10 R;
    public boolean S;
    public final int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public final Rect e0;
    public final FrameLayout f;
    public final Rect f0;
    public final e30 g;
    public final RectF g0;
    public final bi h;
    public Typeface h0;
    public final int i;
    public ColorDrawable i0;
    public EditText j;
    public int j0;
    public CharSequence k;
    public final LinkedHashSet k0;
    public int l;
    public ColorDrawable l0;
    public int m;
    public int m0;
    public int n;
    public Drawable n0;
    public int o;
    public ColorStateList o0;
    public final co p;
    public ColorStateList p0;
    public boolean q;
    public int q0;
    public int r;
    public int r0;
    public boolean s;
    public int s0;
    public v40 t;
    public ColorStateList t0;
    public p5 u;
    public int u0;
    public int v;
    public int v0;
    public int w;
    public int w0;
    public CharSequence x;
    public int x0;
    public boolean y;
    public int y0;
    public p5 z;
    public int z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.textInputStyle, com.ionia.reidopitaco.libya.R.style.Widget_Design_TextInputLayout), attributeSet, com.ionia.reidopitaco.libya.R.attr.textInputStyle);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = new co(this);
        this.t = new l8(26);
        this.e0 = new Rect();
        this.f0 = new Rect();
        this.g0 = new RectF();
        this.k0 = new LinkedHashSet();
        ta taVar = new ta(this);
        this.B0 = taVar;
        this.H0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = y2.a;
        taVar.R = linearInterpolator;
        taVar.j(false);
        taVar.Q = linearInterpolator;
        taVar.j(false);
        if (taVar.g != 8388659) {
            taVar.g = 8388659;
            taVar.j(false);
        }
        y5 K = m60.K(context2, attributeSet, jx.K, com.ionia.reidopitaco.libya.R.attr.textInputStyle, com.ionia.reidopitaco.libya.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        e30 e30Var = new e30(this, K);
        this.g = e30Var;
        TypedArray typedArray = (TypedArray) K.a;
        this.I = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.D0 = typedArray.getBoolean(47, true);
        this.C0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.R = o10.g(context2, attributeSet, com.ionia.reidopitaco.libya.R.attr.textInputStyle, com.ionia.reidopitaco.libya.R.style.Widget_Design_TextInputLayout).a();
        this.T = context2.getResources().getDimensionPixelOffset(com.ionia.reidopitaco.libya.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.V = typedArray.getDimensionPixelOffset(9, 0);
        this.i = getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.a0 = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.b0 = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.W = this.a0;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        n10 k = this.R.k();
        if (dimension >= 0.0f) {
            k.e = new g(dimension);
        }
        if (dimension2 >= 0.0f) {
            k.f = new g(dimension2);
        }
        if (dimension3 >= 0.0f) {
            k.g = new g(dimension3);
        }
        if (dimension4 >= 0.0f) {
            k.h = new g(dimension4);
        }
        this.R = k.a();
        ColorStateList n = oo.n(context2, K, 7);
        if (n != null) {
            int defaultColor = n.getDefaultColor();
            this.u0 = defaultColor;
            this.d0 = defaultColor;
            if (n.isStateful()) {
                this.v0 = n.getColorForState(new int[]{-16842910}, -1);
                this.w0 = n.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.x0 = n.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.w0 = this.u0;
                ColorStateList r = vv.r(context2, com.ionia.reidopitaco.libya.R.color.mtrl_filled_background_color);
                this.v0 = r.getColorForState(new int[]{-16842910}, -1);
                this.x0 = r.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.d0 = 0;
            this.u0 = 0;
            this.v0 = 0;
            this.w0 = 0;
            this.x0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList e = K.e(1);
            this.p0 = e;
            this.o0 = e;
        }
        ColorStateList n2 = oo.n(context2, K, 14);
        this.s0 = typedArray.getColor(14, 0);
        this.q0 = context2.getColor(com.ionia.reidopitaco.libya.R.color.mtrl_textinput_default_box_stroke_color);
        this.y0 = context2.getColor(com.ionia.reidopitaco.libya.R.color.mtrl_textinput_disabled_color);
        this.r0 = context2.getColor(com.ionia.reidopitaco.libya.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (n2 != null) {
            setBoxStrokeColorStateList(n2);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(oo.n(context2, K, 15));
        }
        if (typedArray.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(50, 0));
        }
        this.G = K.e(24);
        this.H = K.e(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z2 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(58, 0);
        CharSequence text3 = typedArray.getText(57);
        boolean z3 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.w = typedArray.getResourceId(22, 0);
        this.v = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.v);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.w);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(K.e(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(K.e(46));
        }
        if (typedArray.hasValue(51)) {
            setHintTextColor(K.e(51));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(K.e(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(K.e(21));
        }
        if (typedArray.hasValue(59)) {
            setPlaceholderTextColor(K.e(59));
        }
        bi biVar = new bi(this, K);
        this.h = biVar;
        boolean z4 = typedArray.getBoolean(0, true);
        setHintMaxLines(typedArray.getInt(49, 1));
        K.n();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(e30Var);
        frameLayout.addView(biVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.j;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.L;
        }
        EditText editText2 = this.j;
        int c0 = g8.c0(editText2.getContext(), m60.W(editText2, com.ionia.reidopitaco.libya.R.attr.colorControlHighlight));
        int i = this.U;
        int[][] iArr = I0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            ls lsVar = this.L;
            int i2 = this.d0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{g8.V(c0, i2, 0.1f), i2}), lsVar, lsVar);
        }
        Context context = getContext();
        ls lsVar2 = this.L;
        int c02 = g8.c0(context, m60.V(context, com.ionia.reidopitaco.libya.R.attr.colorSurface, "TextInputLayout"));
        ls lsVar3 = new ls(lsVar2.j());
        int V = g8.V(c0, c02, 0.1f);
        lsVar3.r(new ColorStateList(iArr, new int[]{V, 0}));
        lsVar3.setTint(c02);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{V, c02});
        ls lsVar4 = new ls(lsVar2.j());
        lsVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, lsVar3, lsVar4), lsVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.N == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.N = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.N.addState(new int[0], h(false));
        }
        return this.N;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.M == null) {
            this.M = h(true);
        }
        return this.M;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.j != null) {
            l8.l("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.j = editText;
        int i = this.l;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.n);
        }
        int i2 = this.m;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.o);
        }
        this.O = false;
        k();
        setTextInputAccessibilityDelegate(new u40(this));
        Typeface typeface = this.j.getTypeface();
        ta taVar = this.B0;
        taVar.n(typeface);
        float textSize = this.j.getTextSize();
        if (taVar.h != textSize) {
            taVar.h = textSize;
            taVar.j(false);
        }
        float letterSpacing = this.j.getLetterSpacing();
        if (taVar.X != letterSpacing) {
            taVar.X = letterSpacing;
            taVar.j(false);
        }
        int gravity = this.j.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (taVar.g != i3) {
            taVar.g = i3;
            taVar.j(false);
        }
        if (taVar.f != gravity) {
            taVar.f = gravity;
            taVar.j(false);
        }
        this.z0 = editText.getMinimumHeight();
        this.j.addTextChangedListener(new t40(this, editText));
        if (this.o0 == null) {
            this.o0 = this.j.getHintTextColors();
        }
        if (this.I) {
            if (TextUtils.isEmpty(this.J)) {
                CharSequence hint = this.j.getHint();
                this.k = hint;
                setHint(hint);
                this.j.setHint((CharSequence) null);
            }
            this.K = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.u != null) {
            p(this.j.getText());
        }
        t();
        this.p.b();
        this.g.bringToFront();
        bi biVar = this.h;
        biVar.bringToFront();
        Iterator it = this.k0.iterator();
        while (it.hasNext()) {
            ((zh) it.next()).a(this);
        }
        biVar.n();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.J)) {
            return;
        }
        this.J = charSequence;
        ta taVar = this.B0;
        if (charSequence == null || !TextUtils.equals(taVar.B, charSequence)) {
            taVar.B = charSequence;
            taVar.C = null;
            taVar.j(false);
        }
        if (this.A0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.y == z) {
            return;
        }
        p5 p5Var = this.z;
        if (!z) {
            if (p5Var != null) {
                p5Var.setVisibility(8);
            }
            this.z = null;
        } else if (p5Var != null) {
            this.f.addView(p5Var);
            this.z.setVisibility(0);
        }
        this.y = z;
    }

    public final void a() {
        if (this.j == null || this.U != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.j;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.B0.f() + this.i), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.j;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.material_filled_edittext_font_2_0_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (oo.v(getContext())) {
            EditText editText3 = this.j;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.material_filled_edittext_font_1_3_padding_top), this.j.getPaddingEnd(), getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        ta taVar = this.B0;
        if (taVar.b == f) {
            return;
        }
        int i = 2;
        if (this.E0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.E0 = valueAnimator;
            valueAnimator.setInterpolator(m60.U(getContext(), com.ionia.reidopitaco.libya.R.attr.motionEasingEmphasizedInterpolator, y2.b));
            this.E0.setDuration(m60.T(getContext(), com.ionia.reidopitaco.libya.R.attr.motionDurationMedium4, 167));
            this.E0.addUpdateListener(new b8(i, this));
        }
        this.E0.setFloatValues(taVar.b, f);
        this.E0.start();
    }

    public final void c() {
        int i;
        int i2;
        ls lsVar = this.L;
        if (lsVar == null) {
            return;
        }
        o10 j = lsVar.j();
        o10 o10Var = this.R;
        if (j != o10Var) {
            this.L.setShapeAppearanceModel(o10Var);
        }
        if (this.U == 2 && (i = this.W) > -1 && (i2 = this.c0) != 0) {
            ls lsVar2 = this.L;
            lsVar2.g.j = i;
            lsVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            js jsVar = lsVar2.g;
            if (jsVar.d != valueOf) {
                jsVar.d = valueOf;
                lsVar2.onStateChange(lsVar2.getState());
            }
        }
        int i3 = this.d0;
        if (this.U == 1) {
            i3 = eb.b(this.d0, g8.A(getContext(), com.ionia.reidopitaco.libya.R.attr.colorSurface, 0));
        }
        this.d0 = i3;
        this.L.r(ColorStateList.valueOf(i3));
        ls lsVar3 = this.P;
        if (lsVar3 != null && this.Q != null) {
            if (this.W > -1 && this.c0 != 0) {
                lsVar3.r(this.j.isFocused() ? ColorStateList.valueOf(this.q0) : ColorStateList.valueOf(this.c0));
                this.Q.r(ColorStateList.valueOf(this.c0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.j == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f0;
        rect2.bottom = i;
        int i2 = this.U;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.V;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.j.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.j.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.j;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.k != null) {
            boolean z = this.K;
            this.K = false;
            CharSequence hint = editText.getHint();
            this.j.setHint(this.k);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.j.setHint(hint);
                this.K = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.j) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.G0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.G0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ls lsVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.I;
        ta taVar = this.B0;
        if (z) {
            TextPaint textPaint = taVar.O;
            RectF rectF = taVar.e;
            int save = canvas2.save();
            if (taVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(taVar.G);
                float f = taVar.q;
                float f2 = taVar.r;
                float f3 = taVar.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((taVar.e0 > 1 || taVar.f0 > 1) && !taVar.D && taVar.o()) {
                    float lineStart = taVar.q - taVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (taVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = taVar.H;
                        float f6 = taVar.I;
                        float f7 = taVar.J;
                        int i2 = taVar.K;
                        textPaint.setShadowLayer(f5, f6, f7, eb.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    taVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (taVar.b0 * f4));
                    if (i >= 31) {
                        float f8 = taVar.H;
                        float f9 = taVar.I;
                        float f10 = taVar.J;
                        int i3 = taVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, eb.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = taVar.Z.getLineBaseline(0);
                    CharSequence charSequence = taVar.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(taVar.H, taVar.I, taVar.J, taVar.K);
                    }
                    String trim = taVar.d0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(taVar.Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    taVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.Q == null || (lsVar = this.P) == null) {
            return;
        }
        lsVar.draw(canvas2);
        if (this.j.isFocused()) {
            Rect bounds = this.Q.getBounds();
            Rect bounds2 = this.P.getBounds();
            float f12 = taVar.b;
            int centerX = bounds2.centerX();
            bounds.left = y2.c(centerX, bounds2.left, f12);
            bounds.right = y2.c(centerX, bounds2.right, f12);
            this.Q.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.F0) {
            return;
        }
        this.F0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ta taVar = this.B0;
        if (taVar != null) {
            taVar.M = drawableState;
            ColorStateList colorStateList2 = taVar.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = taVar.j) != null && colorStateList.isStateful())) {
                taVar.j(false);
                z = true;
                if (this.j != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z) {
                    invalidate();
                }
                this.F0 = false;
            }
        }
        z = false;
        if (this.j != null) {
        }
        t();
        z();
        if (z) {
        }
        this.F0 = false;
    }

    public final int e() {
        if (this.I) {
            int i = this.U;
            ta taVar = this.B0;
            if (i == 0) {
                return (int) taVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (taVar.f() / 2.0f);
                }
                float f = taVar.f();
                TextPaint textPaint = taVar.P;
                textPaint.setTextSize(taVar.i);
                textPaint.setTypeface(taVar.s);
                textPaint.setLetterSpacing(taVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final oi f() {
        oi oiVar = new oi();
        oiVar.h = m60.T(getContext(), com.ionia.reidopitaco.libya.R.attr.motionDurationShort2, 87);
        oiVar.i = m60.U(getContext(), com.ionia.reidopitaco.libya.R.attr.motionEasingLinearInterpolator, y2.a);
        return oiVar;
    }

    public final boolean g() {
        return this.I && !TextUtils.isEmpty(this.J) && (this.L instanceof ud);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.j;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public ls getBoxBackground() {
        int i = this.U;
        if (i == 1 || i == 2) {
            return this.L;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.d0;
    }

    public int getBoxBackgroundMode() {
        return this.U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        o10 o10Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? o10Var.h.a(rectF) : o10Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        o10 o10Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? o10Var.g.a(rectF) : o10Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        o10 o10Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? o10Var.e.a(rectF) : o10Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        o10 o10Var = this.R;
        RectF rectF = this.g0;
        return layoutDirection == 1 ? o10Var.f.a(rectF) : o10Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.s0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.t0;
    }

    public int getBoxStrokeWidth() {
        return this.a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.b0;
    }

    public int getCounterMaxLength() {
        return this.r;
    }

    public CharSequence getCounterOverflowDescription() {
        p5 p5Var;
        if (this.q && this.s && (p5Var = this.u) != null) {
            return p5Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.F;
    }

    public ColorStateList getCounterTextColor() {
        return this.E;
    }

    public ColorStateList getCursorColor() {
        return this.G;
    }

    public ColorStateList getCursorErrorColor() {
        return this.H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.o0;
    }

    public EditText getEditText() {
        return this.j;
    }

    public CharSequence getEndIconContentDescription() {
        return this.h.l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.h.l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.h.r;
    }

    public int getEndIconMode() {
        return this.h.n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.h.s;
    }

    public CheckableImageButton getEndIconView() {
        return this.h.l;
    }

    public CharSequence getError() {
        co coVar = this.p;
        if (coVar.q) {
            return coVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.p.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.p.s;
    }

    public int getErrorCurrentTextColors() {
        p5 p5Var = this.p.r;
        if (p5Var != null) {
            return p5Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.h.h.getDrawable();
    }

    public CharSequence getHelperText() {
        co coVar = this.p;
        if (coVar.x) {
            return coVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        p5 p5Var = this.p.y;
        if (p5Var != null) {
            return p5Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.I) {
            return this.J;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.B0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        ta taVar = this.B0;
        return taVar.g(taVar.k);
    }

    public int getHintMaxLines() {
        return this.B0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.p0;
    }

    public v40 getLengthCounter() {
        return this.t;
    }

    public int getMaxEms() {
        return this.m;
    }

    public int getMaxWidth() {
        return this.o;
    }

    public int getMinEms() {
        return this.l;
    }

    public int getMinWidth() {
        return this.n;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.h.l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.h.l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.y) {
            return this.x;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.B;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.A;
    }

    public CharSequence getPrefixText() {
        return this.g.h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.g.g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.g.g;
    }

    public o10 getShapeAppearanceModel() {
        return this.R;
    }

    public CharSequence getStartIconContentDescription() {
        return this.g.i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.g.i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.g.l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.g.m;
    }

    public CharSequence getSuffixText() {
        return this.h.u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.h.v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.h.v;
    }

    public Typeface getTypeface() {
        return this.h0;
    }

    public final ls h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.ionia.reidopitaco.libya.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.j;
        float popupElevation = editText instanceof jr ? ((jr) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.ionia.reidopitaco.libya.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.ionia.reidopitaco.libya.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        h00 h00Var = new h00();
        h00 h00Var2 = new h00();
        h00 h00Var3 = new h00();
        h00 h00Var4 = new h00();
        int i = 0;
        tg tgVar = new tg(i);
        tg tgVar2 = new tg(i);
        tg tgVar3 = new tg(i);
        tg tgVar4 = new tg(i);
        g gVar = new g(f);
        g gVar2 = new g(f);
        g gVar3 = new g(dimensionPixelOffset);
        g gVar4 = new g(dimensionPixelOffset);
        o10 o10Var = new o10();
        o10Var.a = h00Var;
        o10Var.b = h00Var2;
        o10Var.c = h00Var3;
        o10Var.d = h00Var4;
        o10Var.e = gVar;
        o10Var.f = gVar2;
        o10Var.g = gVar4;
        o10Var.h = gVar3;
        o10Var.i = tgVar;
        o10Var.j = tgVar2;
        o10Var.k = tgVar3;
        o10Var.l = tgVar4;
        EditText editText2 = this.j;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof jr ? ((jr) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = ls.J;
            dropDownBackgroundTintList = ColorStateList.valueOf(g8.c0(context, m60.V(context, com.ionia.reidopitaco.libya.R.attr.colorSurface, ls.class.getSimpleName())));
        }
        ls lsVar = new ls();
        lsVar.n(context);
        lsVar.r(dropDownBackgroundTintList);
        lsVar.q(popupElevation);
        lsVar.setShapeAppearanceModel(o10Var);
        js jsVar = lsVar.g;
        if (jsVar.g == null) {
            jsVar.g = new Rect();
        }
        lsVar.g.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        lsVar.invalidateSelf();
        return lsVar;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.j.getCompoundPaddingLeft() : this.h.c() : this.g.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.j.getCompoundPaddingRight() : this.g.a() : this.h.c());
    }

    public final void k() {
        int i = this.U;
        if (i == 0) {
            this.L = null;
            this.P = null;
            this.Q = null;
        } else if (i == 1) {
            this.L = new ls(this.R);
            this.P = new ls();
            this.Q = new ls();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.I || (this.L instanceof ud)) {
                this.L = new ls(this.R);
            } else {
                o10 o10Var = this.R;
                int i2 = ud.M;
                if (o10Var == null) {
                    o10Var = new o10();
                }
                td tdVar = new td(o10Var, new RectF());
                ud udVar = new ud(tdVar);
                udVar.L = tdVar;
                this.L = udVar;
            }
            this.P = null;
            this.Q = null;
        }
        u();
        z();
        if (this.U == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.V = getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (oo.v(getContext())) {
                this.V = getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.U != 0) {
            v();
        }
        EditText editText = this.j;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.U;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.j.getWidth();
            int gravity = this.j.getGravity();
            ta taVar = this.B0;
            boolean c = taVar.c(taVar.B);
            taVar.D = c;
            Rect rect = taVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = taVar.a0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = taVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.g0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (taVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (taVar.D) {
                        f5 = taVar.a0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (taVar.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = taVar.a0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = taVar.f() + rect.top;
                if (taVar.Z != null && !taVar.o()) {
                    StaticLayout staticLayout = taVar.Z;
                    float lineWidth = (taVar.i / taVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (taVar.D) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.T;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.W);
                rectF.top = 0.0f;
                ud udVar = (ud) this.L;
                udVar.getClass();
                udVar.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = taVar.a0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.g0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (taVar.a0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = taVar.f() + rect.top;
            if (taVar.Z != null) {
                StaticLayout staticLayout2 = taVar.Z;
                float lineWidth2 = (taVar.i / taVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (taVar.D) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(p5 p5Var, int i) {
        try {
            p5Var.setTextAppearance(i);
            if (p5Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        p5Var.setTextAppearance(com.ionia.reidopitaco.libya.R.style.TextAppearance_AppCompat_Caption);
        p5Var.setTextColor(getContext().getColor(com.ionia.reidopitaco.libya.R.color.design_error));
    }

    public final boolean o() {
        co coVar = this.p;
        return (coVar.o != 1 || coVar.r == null || TextUtils.isEmpty(coVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        bi biVar = this.h;
        biVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.H0 = false;
        if (this.j != null && this.j.getMeasuredHeight() < (max = Math.max(biVar.getMeasuredHeight(), this.g.getMeasuredHeight()))) {
            this.j.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.j.post(new p1(15, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float descent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.j;
        if (editText != null) {
            Rect rect = this.e0;
            af.a(this, editText, rect);
            ls lsVar = this.P;
            if (lsVar != null) {
                int i6 = rect.bottom;
                lsVar.setBounds(rect.left, i6 - this.a0, rect.right, i6);
            }
            ls lsVar2 = this.Q;
            if (lsVar2 != null) {
                int i7 = rect.bottom;
                lsVar2.setBounds(rect.left, i7 - this.b0, rect.right, i7);
            }
            if (this.I) {
                float textSize = this.j.getTextSize();
                ta taVar = this.B0;
                float f = taVar.h;
                TextPaint textPaint = taVar.P;
                if (f != textSize) {
                    taVar.h = textSize;
                    taVar.j(false);
                }
                int gravity = this.j.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (taVar.g != i8) {
                    taVar.g = i8;
                    taVar.j(false);
                }
                if (taVar.f != gravity) {
                    taVar.f = gravity;
                    taVar.j(false);
                }
                Rect d = d(rect);
                int i9 = d.left;
                int i10 = d.top;
                int i11 = d.right;
                int i12 = d.bottom;
                Rect rect2 = taVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    taVar.N = true;
                }
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(taVar.h);
                    textPaint.setTypeface(taVar.v);
                    textPaint.setLetterSpacing(taVar.X);
                    descent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(taVar.h);
                    textPaint.setTypeface(taVar.v);
                    textPaint.setLetterSpacing(taVar.X);
                    descent = taVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.j.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f0;
                rect3.left = compoundPaddingLeft;
                if (this.U != 1 || this.j.getMinLines() > 1) {
                    if (this.U != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(taVar.h);
                        textPaint.setTypeface(taVar.v);
                        textPaint.setLetterSpacing(taVar.X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.j.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (descent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.j.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.U != 1 || this.j.getMinLines() > 1) ? rect.bottom - this.j.getCompoundPaddingBottom() : (int) (rect3.top + descent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = taVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != taVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    taVar.N = true;
                    taVar.k0 = true;
                }
                taVar.j(false);
                if (!g() || this.A0) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.H0;
        bi biVar = this.h;
        if (!z) {
            biVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.H0 = true;
        }
        if (this.z != null && (editText = this.j) != null) {
            this.z.setGravity(editText.getGravity());
            this.z.setPadding(this.j.getCompoundPaddingLeft(), this.j.getCompoundPaddingTop(), this.j.getCompoundPaddingRight(), this.j.getCompoundPaddingBottom());
        }
        biVar.n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.j.getMeasuredWidth() - this.j.getCompoundPaddingLeft()) - this.j.getCompoundPaddingRight();
        ta taVar = this.B0;
        TextPaint textPaint = taVar.P;
        textPaint.setTextSize(taVar.i);
        textPaint.setTypeface(taVar.s);
        textPaint.setLetterSpacing(taVar.W);
        float f2 = measuredWidth;
        taVar.i0 = taVar.e(taVar.f0, textPaint, taVar.B, (taVar.i / taVar.h) * f2, taVar.D).getHeight();
        textPaint.setTextSize(taVar.h);
        textPaint.setTypeface(taVar.v);
        textPaint.setLetterSpacing(taVar.X);
        taVar.j0 = taVar.e(taVar.e0, textPaint, taVar.B, f2, taVar.D).getHeight();
        EditText editText2 = this.j;
        Rect rect = this.e0;
        af.a(this, editText2, rect);
        Rect d = d(rect);
        int i3 = d.left;
        int i4 = d.top;
        int i5 = d.right;
        int i6 = d.bottom;
        Rect rect2 = taVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            taVar.N = true;
        }
        v();
        a();
        if (this.j == null) {
            return;
        }
        int i7 = taVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = taVar.P;
            textPaint2.setTextSize(taVar.h);
            textPaint2.setTypeface(taVar.v);
            textPaint2.setLetterSpacing(taVar.X);
            f = -textPaint2.ascent();
        }
        if (this.x != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.z.getPaint());
            textPaint3.setTextSize(this.z.getTextSize());
            textPaint3.setTypeface(this.z.getTypeface());
            textPaint3.setLetterSpacing(this.z.getLetterSpacing());
            k30 k30Var = new k30(this.x, textPaint3, measuredWidth);
            k30Var.k = getLayoutDirection() == 1;
            k30Var.j = true;
            float lineSpacingExtra = this.z.getLineSpacingExtra();
            float lineSpacingMultiplier = this.z.getLineSpacingMultiplier();
            k30Var.g = lineSpacingExtra;
            k30Var.h = lineSpacingMultiplier;
            k30Var.m = new h(9, this);
            r3 = (this.U == 1 ? taVar.f() + this.V + this.i : 0.0f) + k30Var.a().getHeight();
        }
        float max = Math.max(f, r3);
        if (this.j.getMeasuredHeight() < max) {
            this.j.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w40)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w40 w40Var = (w40) parcelable;
        super.onRestoreInstanceState(w40Var.f);
        setError(w40Var.h);
        if (w40Var.i) {
            post(new u6(10, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.S) {
            nd ndVar = this.R.e;
            RectF rectF = this.g0;
            float a = ndVar.a(rectF);
            float a2 = this.R.f.a(rectF);
            float a3 = this.R.h.a(rectF);
            float a4 = this.R.g.a(rectF);
            o10 o10Var = this.R;
            m60 m60Var = o10Var.a;
            m60 m60Var2 = o10Var.b;
            m60 m60Var3 = o10Var.d;
            m60 m60Var4 = o10Var.c;
            tg tgVar = new tg(0);
            tg tgVar2 = new tg(0);
            tg tgVar3 = new tg(0);
            tg tgVar4 = new tg(0);
            g gVar = new g(a2);
            g gVar2 = new g(a);
            g gVar3 = new g(a4);
            g gVar4 = new g(a3);
            o10 o10Var2 = new o10();
            o10Var2.a = m60Var2;
            o10Var2.b = m60Var;
            o10Var2.c = m60Var3;
            o10Var2.d = m60Var4;
            o10Var2.e = gVar;
            o10Var2.f = gVar2;
            o10Var2.g = gVar4;
            o10Var2.h = gVar3;
            o10Var2.i = tgVar;
            o10Var2.j = tgVar2;
            o10Var2.k = tgVar3;
            o10Var2.l = tgVar4;
            this.S = z;
            setShapeAppearanceModel(o10Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        w40 w40Var = new w40(super.onSaveInstanceState());
        if (o()) {
            w40Var.h = getError();
        }
        bi biVar = this.h;
        w40Var.i = biVar.n != 0 && biVar.l.i;
        return w40Var;
    }

    public final void p(Editable editable) {
        ((l8) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.s;
        int i = this.r;
        if (i == -1) {
            this.u.setText(String.valueOf(length));
            this.u.setContentDescription(null);
            this.s = false;
        } else {
            this.s = length > i;
            Context context = getContext();
            this.u.setContentDescription(context.getString(this.s ? com.ionia.reidopitaco.libya.R.string.character_counter_overflowed_content_description : com.ionia.reidopitaco.libya.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.r)));
            if (z != this.s) {
                q();
            }
            String str = t7.b;
            t7 t7Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? t7.e : t7.d;
            p5 p5Var = this.u;
            String string = getContext().getString(com.ionia.reidopitaco.libya.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.r));
            t7Var.getClass();
            c8 c8Var = q40.a;
            p5Var.setText(string != null ? t7Var.c(string).toString() : null);
        }
        if (this.j == null || z == this.s) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        p5 p5Var = this.u;
        if (p5Var != null) {
            n(p5Var, this.s ? this.v : this.w);
            if (!this.s && (colorStateList2 = this.E) != null) {
                this.u.setTextColor(colorStateList2);
            }
            if (!this.s || (colorStateList = this.F) == null) {
                return;
            }
            this.u.setTextColor(colorStateList);
        }
    }

    public final void r() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.G;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue R = m60.R(context.getTheme(), com.ionia.reidopitaco.libya.R.attr.colorControlActivated);
            if (R != null) {
                int i = R.resourceId;
                if (i != 0) {
                    colorStateList2 = vv.r(context, i);
                } else {
                    int i2 = R.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.j;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.j.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((o() || (this.u != null && this.s)) && (colorStateList = this.H) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z;
        bi biVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.j == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            e30 e30Var = this.g;
            if (e30Var.getMeasuredWidth() > 0) {
                int max = Math.max(0, e30Var.getMeasuredWidth() - this.j.getPaddingLeft());
                if (this.i0 == null || this.j0 != max) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.i0 = colorDrawable3;
                    this.j0 = max;
                    colorDrawable3.setBounds(0, 0, max, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.j.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.i0;
                if (drawable2 != colorDrawable4) {
                    this.j.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    biVar = this.h;
                    if ((!biVar.e() || ((biVar.n != 0 && biVar.d()) || biVar.u != null)) && biVar.getMeasuredWidth() > 0) {
                        int measuredWidth = biVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                        if (!biVar.e()) {
                            checkableImageButton = biVar.h;
                        } else if (biVar.n != 0 && biVar.d()) {
                            checkableImageButton = biVar.l;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
                        }
                        int max2 = Math.max(0, measuredWidth);
                        compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
                        colorDrawable = this.l0;
                        if (colorDrawable == null && this.m0 != max2) {
                            this.m0 = max2;
                            colorDrawable.setBounds(0, 0, max2, 1);
                            this.j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.l0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.l0 = colorDrawable5;
                            this.m0 = max2;
                            colorDrawable5.setBounds(0, 0, max2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.l0;
                        if (drawable != colorDrawable2) {
                            this.n0 = drawable;
                            this.j.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.l0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.j.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.l0) {
                            this.j.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.n0, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.l0 = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                biVar = this.h;
                if (biVar.e()) {
                }
                int measuredWidth2 = biVar.v.getMeasuredWidth() - this.j.getPaddingRight();
                if (!biVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                int max22 = Math.max(0, measuredWidth2);
                compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
                colorDrawable = this.l0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.l0;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.i0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.j.getCompoundDrawablesRelative();
            this.j.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.i0 = null;
            z = true;
            biVar = this.h;
            if (biVar.e()) {
            }
            int measuredWidth22 = biVar.v.getMeasuredWidth() - this.j.getPaddingRight();
            if (!biVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            int max222 = Math.max(0, measuredWidth22);
            compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
            colorDrawable = this.l0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.l0;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        biVar = this.h;
        if (biVar.e()) {
        }
        int measuredWidth222 = biVar.v.getMeasuredWidth() - this.j.getPaddingRight();
        if (!biVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        int max2222 = Math.max(0, measuredWidth222);
        compoundDrawablesRelative = this.j.getCompoundDrawablesRelative();
        colorDrawable = this.l0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.l0;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.d0 != i) {
            this.d0 = i;
            this.u0 = i;
            this.w0 = i;
            this.x0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.u0 = defaultColor;
        this.d0 = defaultColor;
        this.v0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.w0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.U) {
            return;
        }
        this.U = i;
        if (this.j != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.V = i;
    }

    public void setBoxCornerFamily(int i) {
        n10 k = this.R.k();
        nd ndVar = this.R.e;
        k.a = vv.j(i);
        k.e = ndVar;
        nd ndVar2 = this.R.f;
        k.b = vv.j(i);
        k.f = ndVar2;
        nd ndVar3 = this.R.h;
        k.d = vv.j(i);
        k.h = ndVar3;
        nd ndVar4 = this.R.g;
        k.c = vv.j(i);
        k.g = ndVar4;
        this.R = k.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.q0 = colorStateList.getDefaultColor();
            this.y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.s0 != colorStateList.getDefaultColor()) {
            this.s0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            this.t0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.a0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.b0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.q != z) {
            co coVar = this.p;
            if (z) {
                p5 p5Var = new p5(getContext(), null);
                this.u = p5Var;
                p5Var.setId(com.ionia.reidopitaco.libya.R.id.textinput_counter);
                Typeface typeface = this.h0;
                if (typeface != null) {
                    this.u.setTypeface(typeface);
                }
                this.u.setMaxLines(1);
                coVar.a(this.u, 2);
                ((ViewGroup.MarginLayoutParams) this.u.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.ionia.reidopitaco.libya.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.u != null) {
                    EditText editText = this.j;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                coVar.g(this.u, 2);
                this.u = null;
            }
            this.q = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.r != i) {
            if (i > 0) {
                this.r = i;
            } else {
                this.r = -1;
            }
            if (!this.q || this.u == null) {
                return;
            }
            EditText editText = this.j;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.v != i) {
            this.v = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.w != i) {
            this.w = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            if (o() || (this.u != null && this.s)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.o0 = colorStateList;
        this.p0 = colorStateList;
        if (this.j != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.h.l.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.h.l.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        bi biVar = this.h;
        biVar.g(i != 0 ? biVar.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        bi biVar = this.h;
        Drawable t = i != 0 ? vv.t(biVar.getContext(), i) : null;
        TextInputLayout textInputLayout = biVar.f;
        CheckableImageButton checkableImageButton = biVar.l;
        checkableImageButton.setImageDrawable(t);
        if (t != null) {
            m60.f(textInputLayout, checkableImageButton, biVar.p, biVar.q);
            m60.Q(textInputLayout, checkableImageButton, biVar.p);
        }
    }

    public void setEndIconMinSize(int i) {
        bi biVar = this.h;
        if (i < 0) {
            biVar.getClass();
            l8.l("endIconSize cannot be less than 0");
        } else if (i != biVar.r) {
            biVar.r = i;
            CheckableImageButton checkableImageButton = biVar.l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = biVar.h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.h.h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        bi biVar = this.h;
        CheckableImageButton checkableImageButton = biVar.l;
        View.OnLongClickListener onLongClickListener = biVar.t;
        checkableImageButton.setOnClickListener(onClickListener);
        m60.X(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        bi biVar = this.h;
        biVar.t = onLongClickListener;
        CheckableImageButton checkableImageButton = biVar.l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m60.X(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        bi biVar = this.h;
        biVar.s = scaleType;
        biVar.l.setScaleType(scaleType);
        biVar.h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        bi biVar = this.h;
        if (biVar.p != colorStateList) {
            biVar.p = colorStateList;
            m60.f(biVar.f, biVar.l, colorStateList, biVar.q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        bi biVar = this.h;
        if (biVar.q != mode) {
            biVar.q = mode;
            m60.f(biVar.f, biVar.l, biVar.p, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.h.i(z);
    }

    public void setError(CharSequence charSequence) {
        co coVar = this.p;
        if (!coVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            coVar.f();
            return;
        }
        coVar.c();
        coVar.p = charSequence;
        coVar.r.setText(charSequence);
        int i = coVar.n;
        if (i != 1) {
            coVar.o = 1;
        }
        coVar.i(i, coVar.o, coVar.h(coVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        co coVar = this.p;
        coVar.t = i;
        p5 p5Var = coVar.r;
        if (p5Var != null) {
            p5Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        co coVar = this.p;
        coVar.s = charSequence;
        p5 p5Var = coVar.r;
        if (p5Var != null) {
            p5Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        co coVar = this.p;
        TextInputLayout textInputLayout = coVar.h;
        if (coVar.q == z) {
            return;
        }
        coVar.c();
        if (z) {
            p5 p5Var = new p5(coVar.g, null);
            coVar.r = p5Var;
            p5Var.setId(com.ionia.reidopitaco.libya.R.id.textinput_error);
            coVar.r.setTextAlignment(5);
            Typeface typeface = coVar.B;
            if (typeface != null) {
                coVar.r.setTypeface(typeface);
            }
            int i = coVar.u;
            coVar.u = i;
            p5 p5Var2 = coVar.r;
            if (p5Var2 != null) {
                coVar.h.n(p5Var2, i);
            }
            ColorStateList colorStateList = coVar.v;
            coVar.v = colorStateList;
            p5 p5Var3 = coVar.r;
            if (p5Var3 != null && colorStateList != null) {
                p5Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = coVar.s;
            coVar.s = charSequence;
            p5 p5Var4 = coVar.r;
            if (p5Var4 != null) {
                p5Var4.setContentDescription(charSequence);
            }
            int i2 = coVar.t;
            coVar.t = i2;
            p5 p5Var5 = coVar.r;
            if (p5Var5 != null) {
                p5Var5.setAccessibilityLiveRegion(i2);
            }
            coVar.r.setVisibility(4);
            coVar.a(coVar.r, 0);
        } else {
            coVar.f();
            coVar.g(coVar.r, 0);
            coVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        coVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        bi biVar = this.h;
        biVar.j(i != 0 ? vv.t(biVar.getContext(), i) : null);
        m60.Q(biVar.f, biVar.h, biVar.i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        bi biVar = this.h;
        CheckableImageButton checkableImageButton = biVar.h;
        View.OnLongClickListener onLongClickListener = biVar.k;
        checkableImageButton.setOnClickListener(onClickListener);
        m60.X(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        bi biVar = this.h;
        biVar.k = onLongClickListener;
        CheckableImageButton checkableImageButton = biVar.h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m60.X(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        bi biVar = this.h;
        if (biVar.i != colorStateList) {
            biVar.i = colorStateList;
            m60.f(biVar.f, biVar.h, colorStateList, biVar.j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        bi biVar = this.h;
        if (biVar.j != mode) {
            biVar.j = mode;
            m60.f(biVar.f, biVar.h, biVar.i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        co coVar = this.p;
        coVar.u = i;
        p5 p5Var = coVar.r;
        if (p5Var != null) {
            coVar.h.n(p5Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        co coVar = this.p;
        coVar.v = colorStateList;
        p5 p5Var = coVar.r;
        if (p5Var == null || colorStateList == null) {
            return;
        }
        p5Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.C0 != z) {
            this.C0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        co coVar = this.p;
        if (isEmpty) {
            if (coVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!coVar.x) {
            setHelperTextEnabled(true);
        }
        coVar.c();
        coVar.w = charSequence;
        coVar.y.setText(charSequence);
        int i = coVar.n;
        if (i != 2) {
            coVar.o = 2;
        }
        coVar.i(i, coVar.o, coVar.h(coVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        co coVar = this.p;
        coVar.A = colorStateList;
        p5 p5Var = coVar.y;
        if (p5Var == null || colorStateList == null) {
            return;
        }
        p5Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        co coVar = this.p;
        TextInputLayout textInputLayout = coVar.h;
        if (coVar.x == z) {
            return;
        }
        coVar.c();
        if (z) {
            p5 p5Var = new p5(coVar.g, null);
            coVar.y = p5Var;
            p5Var.setId(com.ionia.reidopitaco.libya.R.id.textinput_helper_text);
            coVar.y.setTextAlignment(5);
            Typeface typeface = coVar.B;
            if (typeface != null) {
                coVar.y.setTypeface(typeface);
            }
            coVar.y.setVisibility(4);
            coVar.y.setImportantForAccessibility(2);
            int i = coVar.z;
            coVar.z = i;
            p5 p5Var2 = coVar.y;
            if (p5Var2 != null) {
                p5Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = coVar.A;
            coVar.A = colorStateList;
            p5 p5Var3 = coVar.y;
            if (p5Var3 != null && colorStateList != null) {
                p5Var3.setTextColor(colorStateList);
            }
            coVar.a(coVar.y, 1);
        } else {
            coVar.c();
            int i2 = coVar.n;
            if (i2 == 2) {
                coVar.o = 0;
            }
            coVar.i(i2, coVar.o, coVar.h(coVar.y, ""));
            coVar.g(coVar.y, 1);
            coVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        coVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        co coVar = this.p;
        coVar.z = i;
        p5 p5Var = coVar.y;
        if (p5Var != null) {
            p5Var.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.D0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.I) {
            this.I = z;
            if (z) {
                CharSequence hint = this.j.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.J)) {
                        setHint(hint);
                    }
                    this.j.setHint((CharSequence) null);
                }
                this.K = true;
            } else {
                this.K = false;
                if (!TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.j.getHint())) {
                    this.j.setHint(this.J);
                }
                setHintInternal(null);
            }
            if (this.j != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        ta taVar = this.B0;
        if (i != taVar.f0) {
            taVar.f0 = i;
            taVar.j(false);
        }
        if (i != taVar.e0) {
            taVar.e0 = i;
            taVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        ta taVar = this.B0;
        TextInputLayout textInputLayout = taVar.a;
        p40 p40Var = new p40(textInputLayout.getContext(), i);
        ColorStateList colorStateList = p40Var.k;
        if (colorStateList != null) {
            taVar.k = colorStateList;
        }
        float f = p40Var.l;
        if (f != 0.0f) {
            taVar.i = f;
        }
        ColorStateList colorStateList2 = p40Var.a;
        if (colorStateList2 != null) {
            taVar.V = colorStateList2;
        }
        taVar.T = p40Var.f;
        taVar.U = p40Var.g;
        taVar.S = p40Var.h;
        taVar.W = p40Var.j;
        y8 y8Var = taVar.z;
        if (y8Var != null) {
            y8Var.q = true;
        }
        j0 j0Var = new j0(9, taVar);
        p40Var.a();
        taVar.z = new y8(j0Var, p40Var.p);
        p40Var.b(textInputLayout.getContext(), taVar.z);
        taVar.j(false);
        this.p0 = taVar.k;
        if (this.j != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            if (this.o0 == null) {
                ta taVar = this.B0;
                if (taVar.k != colorStateList) {
                    taVar.k = colorStateList;
                    taVar.j(false);
                }
            }
            this.p0 = colorStateList;
            if (this.j != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(v40 v40Var) {
        this.t = v40Var;
    }

    public void setMaxEms(int i) {
        this.m = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.o = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.l = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.n = i;
        EditText editText = this.j;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        bi biVar = this.h;
        biVar.l.setContentDescription(i != 0 ? biVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        bi biVar = this.h;
        biVar.l.setImageDrawable(i != 0 ? vv.t(biVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        bi biVar = this.h;
        if (z && biVar.n != 1) {
            biVar.h(1);
        } else if (z) {
            biVar.getClass();
        } else {
            biVar.h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        bi biVar = this.h;
        biVar.p = colorStateList;
        m60.f(biVar.f, biVar.l, colorStateList, biVar.q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        bi biVar = this.h;
        biVar.q = mode;
        m60.f(biVar.f, biVar.l, biVar.p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.z == null) {
            p5 p5Var = new p5(getContext(), null);
            this.z = p5Var;
            p5Var.setId(com.ionia.reidopitaco.libya.R.id.textinput_placeholder);
            this.z.setImportantForAccessibility(1);
            this.z.setAccessibilityLiveRegion(1);
            oi f = f();
            this.C = f;
            f.g = 67L;
            this.D = f();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.A);
            f80.m(this.z, new vr(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.y) {
                setPlaceholderTextEnabled(true);
            }
            this.x = charSequence;
        }
        EditText editText = this.j;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.B = i;
        p5 p5Var = this.z;
        if (p5Var != null) {
            p5Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            p5 p5Var = this.z;
            if (p5Var == null || colorStateList == null) {
                return;
            }
            p5Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        e30 e30Var = this.g;
        e30Var.getClass();
        e30Var.h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        e30Var.g.setText(charSequence);
        e30Var.f();
    }

    public void setPrefixTextAppearance(int i) {
        this.g.g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.g.g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o10 o10Var) {
        ls lsVar = this.L;
        if (lsVar == null || lsVar.j() == o10Var) {
            return;
        }
        this.R = o10Var;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.g.i.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? vv.t(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        e30 e30Var = this.g;
        if (i < 0) {
            e30Var.getClass();
            l8.l("startIconSize cannot be less than 0");
        } else if (i != e30Var.l) {
            e30Var.l = i;
            CheckableImageButton checkableImageButton = e30Var.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        e30 e30Var = this.g;
        CheckableImageButton checkableImageButton = e30Var.i;
        View.OnLongClickListener onLongClickListener = e30Var.n;
        checkableImageButton.setOnClickListener(onClickListener);
        m60.X(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        e30 e30Var = this.g;
        e30Var.n = onLongClickListener;
        CheckableImageButton checkableImageButton = e30Var.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m60.X(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        e30 e30Var = this.g;
        e30Var.m = scaleType;
        e30Var.i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        e30 e30Var = this.g;
        if (e30Var.j != colorStateList) {
            e30Var.j = colorStateList;
            m60.f(e30Var.f, e30Var.i, colorStateList, e30Var.k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        e30 e30Var = this.g;
        if (e30Var.k != mode) {
            e30Var.k = mode;
            m60.f(e30Var.f, e30Var.i, e30Var.j, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.g.d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        bi biVar = this.h;
        biVar.getClass();
        biVar.u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        biVar.v.setText(charSequence);
        biVar.o();
    }

    public void setSuffixTextAppearance(int i) {
        this.h.v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.h.v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(u40 u40Var) {
        EditText editText = this.j;
        if (editText != null) {
            f80.m(editText, u40Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.h0) {
            this.h0 = typeface;
            this.B0.n(typeface);
            co coVar = this.p;
            if (typeface != coVar.B) {
                coVar.B = typeface;
                p5 p5Var = coVar.r;
                if (p5Var != null) {
                    p5Var.setTypeface(typeface);
                }
                p5 p5Var2 = coVar.y;
                if (p5Var2 != null) {
                    p5Var2.setTypeface(typeface);
                }
            }
            p5 p5Var3 = this.u;
            if (p5Var3 != null) {
                p5Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        p5 p5Var;
        EditText editText = this.j;
        if (editText == null || this.U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = vf.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(f4.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.s && (p5Var = this.u) != null) {
            mutate.setColorFilter(f4.c(p5Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.j.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.j;
        if (editText == null || this.L == null) {
            return;
        }
        if ((this.O || editText.getBackground() == null) && this.U != 0) {
            this.j.setBackground(getEditTextBoxBackground());
            this.O = true;
        }
    }

    public final void v() {
        if (this.U != 1) {
            FrameLayout frameLayout = this.f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        p5 p5Var;
        boolean isEnabled = isEnabled();
        EditText editText = this.j;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.j;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.o0;
        ta taVar = this.B0;
        if (colorStateList2 != null) {
            taVar.k(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.o0;
            int i = this.y0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            taVar.k(ColorStateList.valueOf(i));
        } else if (o()) {
            p5 p5Var2 = this.p.r;
            taVar.k(p5Var2 != null ? p5Var2.getTextColors() : null);
        } else if (this.s && (p5Var = this.u) != null) {
            taVar.k(p5Var.getTextColors());
        } else if (z4 && (colorStateList = this.p0) != null && taVar.k != colorStateList) {
            taVar.k = colorStateList;
            taVar.j(false);
        }
        bi biVar = this.h;
        e30 e30Var = this.g;
        if (z3 || !this.C0 || (isEnabled() && z4)) {
            if (z2 || this.A0) {
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.E0.cancel();
                }
                if (z && this.D0) {
                    b(1.0f);
                } else {
                    taVar.m(1.0f);
                }
                this.A0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.j;
                x(editText3 != null ? editText3.getText() : null);
                e30Var.o = false;
                e30Var.f();
                biVar.w = false;
                biVar.o();
                return;
            }
            return;
        }
        if (z2 || !this.A0) {
            ValueAnimator valueAnimator2 = this.E0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E0.cancel();
            }
            if (z && this.D0) {
                b(0.0f);
            } else {
                taVar.m(0.0f);
            }
            if (g() && !((ud) this.L).L.q.isEmpty() && g()) {
                ((ud) this.L).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.A0 = true;
            p5 p5Var3 = this.z;
            if (p5Var3 != null && this.y) {
                p5Var3.setText((CharSequence) null);
                d60.a(this.f, this.D);
                this.z.setVisibility(4);
            }
            e30Var.o = true;
            e30Var.f();
            biVar.w = true;
            biVar.o();
        }
    }

    public final void x(Editable editable) {
        ((l8) this.t).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f;
        if (length != 0 || this.A0) {
            p5 p5Var = this.z;
            if (p5Var == null || !this.y) {
                return;
            }
            p5Var.setText((CharSequence) null);
            d60.a(frameLayout, this.D);
            this.z.setVisibility(4);
            return;
        }
        if (this.z == null || !this.y || TextUtils.isEmpty(this.x)) {
            return;
        }
        this.z.setText(this.x);
        d60.a(frameLayout, this.C);
        this.z.setVisibility(0);
        this.z.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.t0.getDefaultColor();
        int colorForState = this.t0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.t0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.c0 = colorForState2;
        } else if (z2) {
            this.c0 = colorForState;
        } else {
            this.c0 = defaultColor;
        }
    }

    public final void z() {
        p5 p5Var;
        EditText editText;
        EditText editText2;
        if (this.L == null || this.U == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.j) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.j) != null && editText.isHovered());
        if (!isEnabled()) {
            this.c0 = this.y0;
        } else if (o()) {
            if (this.t0 != null) {
                y(z, z2);
            } else {
                this.c0 = getErrorCurrentTextColors();
            }
        } else if (!this.s || (p5Var = this.u) == null) {
            if (z) {
                this.c0 = this.s0;
            } else if (z2) {
                this.c0 = this.r0;
            } else {
                this.c0 = this.q0;
            }
        } else if (this.t0 != null) {
            y(z, z2);
        } else {
            this.c0 = p5Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        bi biVar = this.h;
        TextInputLayout textInputLayout = biVar.f;
        CheckableImageButton checkableImageButton = biVar.l;
        TextInputLayout textInputLayout2 = biVar.f;
        biVar.m();
        m60.Q(textInputLayout2, biVar.h, biVar.i);
        m60.Q(textInputLayout2, checkableImageButton, biVar.p);
        if (biVar.b() instanceof hg) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                m60.f(textInputLayout, checkableImageButton, biVar.p, biVar.q);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        e30 e30Var = this.g;
        m60.Q(e30Var.f, e30Var.i, e30Var.j);
        if (this.U == 2) {
            int i = this.W;
            if (z && isEnabled()) {
                this.W = this.b0;
            } else {
                this.W = this.a0;
            }
            if (this.W != i && g() && !this.A0) {
                if (g()) {
                    ((ud) this.L).x(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.U == 1) {
            if (!isEnabled()) {
                this.d0 = this.v0;
            } else if (z2 && !z) {
                this.d0 = this.x0;
            } else if (z) {
                this.d0 = this.w0;
            } else {
                this.d0 = this.u0;
            }
        }
        c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.j;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.I) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.g.b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.g.c(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.h.g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.h.l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.h.l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.h.j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        bi biVar = this.h;
        TextInputLayout textInputLayout = biVar.f;
        CheckableImageButton checkableImageButton = biVar.l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            m60.f(textInputLayout, checkableImageButton, biVar.p, biVar.q);
            m60.Q(textInputLayout, checkableImageButton, biVar.p);
        }
    }
}
