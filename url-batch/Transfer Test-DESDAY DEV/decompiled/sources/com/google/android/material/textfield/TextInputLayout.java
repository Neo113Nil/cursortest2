package com.google.android.material.textfield;

import A.c;
import I0.b;
import K.C0009h;
import K.C0014m;
import K.J;
import K.T;
import L0.d;
import O0.e;
import O0.f;
import O0.g;
import O0.i;
import O0.j;
import O0.k;
import R0.A;
import R0.B;
import R0.C;
import R0.D;
import R0.h;
import R0.m;
import R0.p;
import R0.s;
import R0.t;
import R0.w;
import R0.y;
import R0.z;
import T0.a;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.AbstractC0221l0;
import l.C0201b0;
import l.C0236t;
import o0.AbstractC0278q;
import o0.C0269h;
import u0.AbstractC0338a;
import v0.AbstractC0341a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1991C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1992A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1993A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1994B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1995B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1996C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1997D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1998E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1999G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f2000H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2001I;

    /* renamed from: J, reason: collision with root package name */
    public g f2002J;

    /* renamed from: K, reason: collision with root package name */
    public g f2003K;

    /* renamed from: L, reason: collision with root package name */
    public k f2004L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2005M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2006N;

    /* renamed from: O, reason: collision with root package name */
    public int f2007O;

    /* renamed from: P, reason: collision with root package name */
    public int f2008P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2009Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2010R;

    /* renamed from: S, reason: collision with root package name */
    public int f2011S;

    /* renamed from: T, reason: collision with root package name */
    public int f2012T;

    /* renamed from: U, reason: collision with root package name */
    public int f2013U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2014V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2015W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2016a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2017a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f2018b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f2019b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f2020c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2021c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2022d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2023e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2024e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2025f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2026f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2027g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2028g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2029h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2030i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f2031j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2032j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2033k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2034k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2035l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2036l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2037m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2038m0;

    /* renamed from: n, reason: collision with root package name */
    public C f2039n;
    public ColorStateList n0;

    /* renamed from: o, reason: collision with root package name */
    public C0201b0 f2040o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2041o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2042p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2043p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2044q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2045q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2046r;
    public int r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2047s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2048s0;

    /* renamed from: t, reason: collision with root package name */
    public C0201b0 f2049t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2050t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2051u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2052u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2053v;

    /* renamed from: v0, reason: collision with root package name */
    public final b f2054v0;

    /* renamed from: w, reason: collision with root package name */
    public C0269h f2055w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2056w0;

    /* renamed from: x, reason: collision with root package name */
    public C0269h f2057x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2058x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2059y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2060y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2061z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2062z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.football.transfertrivia.R.attr.textInputStyle, com.football.transfertrivia.R.style.Widget_Design_TextInputLayout), attributeSet, com.football.transfertrivia.R.attr.textInputStyle);
        this.f2025f = -1;
        this.f2027g = -1;
        this.h = -1;
        this.i = -1;
        this.f2031j = new t(this);
        this.f2039n = new C0009h(2);
        this.f2014V = new Rect();
        this.f2015W = new Rect();
        this.f2017a0 = new RectF();
        this.f2024e0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f2054v0 = bVar;
        this.f1995B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2016a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0341a.f4037a;
        bVar.f283Q = linearInterpolator;
        bVar.h(false);
        bVar.f282P = linearInterpolator;
        bVar.h(false);
        if (bVar.f304g != 8388659) {
            bVar.f304g = 8388659;
            bVar.h(false);
        }
        int[] iArr = AbstractC0338a.f3782A;
        I0.k.a(context2, attributeSet, com.football.transfertrivia.R.attr.textInputStyle, com.football.transfertrivia.R.style.Widget_Design_TextInputLayout);
        I0.k.b(context2, attributeSet, iArr, com.football.transfertrivia.R.attr.textInputStyle, com.football.transfertrivia.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.football.transfertrivia.R.attr.textInputStyle, com.football.transfertrivia.R.style.Widget_Design_TextInputLayout);
        C0014m c0014m = new C0014m(context2, obtainStyledAttributes);
        y yVar = new y(this, c0014m);
        this.f2018b = yVar;
        this.f1996C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2058x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2056w0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f2004L = k.b(context2, attributeSet, com.football.transfertrivia.R.attr.textInputStyle, com.football.transfertrivia.R.style.Widget_Design_TextInputLayout).a();
        this.f2006N = context2.getResources().getDimensionPixelOffset(com.football.transfertrivia.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2008P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2010R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2011S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2009Q = this.f2010R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f2004L.e();
        if (dimension >= RecyclerView.f1570A0) {
            e2.f555e = new O0.a(dimension);
        }
        if (dimension2 >= RecyclerView.f1570A0) {
            e2.f556f = new O0.a(dimension2);
        }
        if (dimension3 >= RecyclerView.f1570A0) {
            e2.f557g = new O0.a(dimension3);
        }
        if (dimension4 >= RecyclerView.f1570A0) {
            e2.h = new O0.a(dimension4);
        }
        this.f2004L = e2.a();
        ColorStateList F = c.F(context2, c0014m, 7);
        if (F != null) {
            int defaultColor = F.getDefaultColor();
            this.f2041o0 = defaultColor;
            this.f2013U = defaultColor;
            if (F.isStateful()) {
                this.f2043p0 = F.getColorForState(new int[]{-16842910}, -1);
                this.f2045q0 = F.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.r0 = F.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2045q0 = this.f2041o0;
                ColorStateList E2 = c.E(context2, com.football.transfertrivia.R.color.mtrl_filled_background_color);
                this.f2043p0 = E2.getColorForState(new int[]{-16842910}, -1);
                this.r0 = E2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2013U = 0;
            this.f2041o0 = 0;
            this.f2043p0 = 0;
            this.f2045q0 = 0;
            this.r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList b2 = c0014m.b(1);
            this.f2032j0 = b2;
            this.f2030i0 = b2;
        }
        ColorStateList F2 = c.F(context2, c0014m, 14);
        this.f2038m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2034k0 = A.b.a(context2, com.football.transfertrivia.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2048s0 = A.b.a(context2, com.football.transfertrivia.R.color.mtrl_textinput_disabled_color);
        this.f2036l0 = A.b.a(context2, com.football.transfertrivia.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (F2 != null) {
            setBoxStrokeColorStateList(F2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(c.F(context2, c0014m, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1992A = c0014m.b(24);
        this.f1994B = c0014m.b(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f2044q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2042p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2042p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2044q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0014m.b(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0014m.b(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0014m.b(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0014m.b(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0014m.b(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0014m.b(58));
        }
        p pVar = new p(this, c0014m);
        this.f2020c = pVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0014m.k();
        setImportantForAccessibility(2);
        J.m(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || c.Y(editText)) {
            return this.F;
        }
        int D2 = c.D(this.d, com.football.transfertrivia.R.attr.colorControlHighlight);
        int i = this.f2007O;
        int[][] iArr = f1991C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f2013U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{c.e0(D2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue r0 = c.r0(context, com.football.transfertrivia.R.attr.colorSurface, "TextInputLayout");
        int i3 = r0.resourceId;
        int a2 = i3 != 0 ? A.b.a(context, i3) : r0.data;
        g gVar3 = new g(gVar2.f532a.f518a);
        int e02 = c.e0(D2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{e02, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{e02, a2});
        g gVar4 = new g(gVar2.f532a.f518a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2000H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2000H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2000H.addState(new int[0], f(false));
        }
        return this.f2000H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1999G == null) {
            this.f1999G = f(true);
        }
        return this.f1999G;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText;
        int i = this.f2025f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f2027g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f2001I = false;
        i();
        setTextInputAccessibilityDelegate(new B(this));
        Typeface typeface = this.d.getTypeface();
        b bVar = this.f2054v0;
        bVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (bVar.h != textSize) {
            bVar.h = textSize;
            bVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (bVar.f289W != letterSpacing) {
            bVar.f289W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (bVar.f304g != i4) {
            bVar.f304g = i4;
            bVar.h(false);
        }
        if (bVar.f302f != gravity) {
            bVar.f302f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = T.f372a;
        this.f2050t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new z(this, editText));
        if (this.f2030i0 == null) {
            this.f2030i0 = this.d.getHintTextColors();
        }
        if (this.f1996C) {
            if (TextUtils.isEmpty(this.f1997D)) {
                CharSequence hint = this.d.getHint();
                this.f2023e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1998E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2040o != null) {
            n(this.d.getText());
        }
        r();
        this.f2031j.b();
        this.f2018b.bringToFront();
        p pVar = this.f2020c;
        pVar.bringToFront();
        Iterator it = this.f2024e0.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1997D)) {
            return;
        }
        this.f1997D = charSequence;
        b bVar = this.f2054v0;
        if (charSequence == null || !TextUtils.equals(bVar.f268A, charSequence)) {
            bVar.f268A = charSequence;
            bVar.f269B = null;
            Bitmap bitmap = bVar.f272E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f272E = null;
            }
            bVar.h(false);
        }
        if (this.f2052u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2047s == z2) {
            return;
        }
        if (z2) {
            C0201b0 c0201b0 = this.f2049t;
            if (c0201b0 != null) {
                this.f2016a.addView(c0201b0);
                this.f2049t.setVisibility(0);
            }
        } else {
            C0201b0 c0201b02 = this.f2049t;
            if (c0201b02 != null) {
                c0201b02.setVisibility(8);
            }
            this.f2049t = null;
        }
        this.f2047s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        b bVar = this.f2054v0;
        if (bVar.f295b == f2) {
            return;
        }
        if (this.f2060y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2060y0 = valueAnimator;
            valueAnimator.setInterpolator(c.q0(getContext(), com.football.transfertrivia.R.attr.motionEasingEmphasizedInterpolator, AbstractC0341a.f4038b));
            this.f2060y0.setDuration(c.p0(getContext(), com.football.transfertrivia.R.attr.motionDurationMedium4, 167));
            this.f2060y0.addUpdateListener(new A(i, this));
        }
        this.f2060y0.setFloatValues(bVar.f295b, f2);
        this.f2060y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2016a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f532a.f518a;
        k kVar2 = this.f2004L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2007O == 2 && (i = this.f2009Q) > -1 && (i2 = this.f2012T) != 0) {
            g gVar2 = this.F;
            gVar2.f532a.f524j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f532a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f2013U;
        if (this.f2007O == 1) {
            i3 = C.a.b(this.f2013U, c.C(getContext(), com.football.transfertrivia.R.attr.colorSurface, 0));
        }
        this.f2013U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f2002J;
        if (gVar3 != null && this.f2003K != null) {
            if (this.f2009Q > -1 && this.f2012T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f2034k0) : ColorStateList.valueOf(this.f2012T));
                this.f2003K.j(ColorStateList.valueOf(this.f2012T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1996C) {
            return 0;
        }
        int i = this.f2007O;
        b bVar = this.f2054v0;
        if (i == 0) {
            d = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = bVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final C0269h d() {
        C0269h c0269h = new C0269h();
        c0269h.f3244c = c.p0(getContext(), com.football.transfertrivia.R.attr.motionDurationShort2, 87);
        c0269h.d = c.q0(getContext(), com.football.transfertrivia.R.attr.motionEasingLinearInterpolator, AbstractC0341a.f4037a);
        return c0269h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2023e != null) {
            boolean z2 = this.f1998E;
            this.f1998E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f2023e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1998E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2016a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f1993A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1993A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1996C;
        b bVar = this.f2054v0;
        if (z2) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f269B != null) {
                RectF rectF = bVar.f300e;
                if (rectF.width() > RecyclerView.f1570A0 && rectF.height() > RecyclerView.f1570A0) {
                    TextPaint textPaint = bVar.f280N;
                    textPaint.setTextSize(bVar.f273G);
                    float f2 = bVar.f311p;
                    float f3 = bVar.f312q;
                    float f4 = bVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (bVar.f299d0 <= 1 || bVar.f270C) {
                        canvas.translate(f2, f3);
                        bVar.f291Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f311p - bVar.f291Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (bVar.f296b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = bVar.f274H;
                            float f7 = bVar.f275I;
                            float f8 = bVar.f276J;
                            int i3 = bVar.f277K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        bVar.f291Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f294a0 * f5));
                        if (i2 >= 31) {
                            float f9 = bVar.f274H;
                            float f10 = bVar.f275I;
                            float f11 = bVar.f276J;
                            int i4 = bVar.f277K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f291Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f298c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.f1570A0, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(bVar.f274H, bVar.f275I, bVar.f276J, bVar.f277K);
                        }
                        String trim = bVar.f298c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f291Y.getLineEnd(i), str.length()), RecyclerView.f1570A0, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f2003K == null || (gVar = this.f2002J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f2003K.getBounds();
            Rect bounds2 = this.f2002J.getBounds();
            float f13 = bVar.f295b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0341a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0341a.c(centerX, bounds2.right, f13);
            this.f2003K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.f2062z0) {
            return;
        }
        this.f2062z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f2054v0;
        if (bVar != null) {
            bVar.f278L = drawableState;
            ColorStateList colorStateList2 = bVar.f306k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f305j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = T.f372a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2062z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2062z0 = false;
    }

    public final boolean e() {
        return this.f1996C && !TextUtils.isEmpty(this.f1997D) && (this.F instanceof h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.football.transfertrivia.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : RecyclerView.f1570A0;
        EditText editText = this.d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.football.transfertrivia.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.football.transfertrivia.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        O0.a aVar = new O0.a(f2);
        O0.a aVar2 = new O0.a(f2);
        O0.a aVar3 = new O0.a(dimensionPixelOffset);
        O0.a aVar4 = new O0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f561a = iVar;
        kVar.f562b = iVar2;
        kVar.f563c = iVar3;
        kVar.d = iVar4;
        kVar.f564e = aVar;
        kVar.f565f = aVar2;
        kVar.f566g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f567j = eVar2;
        kVar.f568k = eVar3;
        kVar.f569l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f531w;
            TypedValue r0 = c.r0(context, com.football.transfertrivia.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = r0.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? A.b.a(context, i2) : r0.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f532a;
        if (fVar.f523g == null) {
            fVar.f523g = new Rect();
        }
        gVar.f532a.f523g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f2020c.c() : this.f2018b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f2007O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2013U;
    }

    public int getBoxBackgroundMode() {
        return this.f2007O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2008P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f2017a0;
        return e2 ? this.f2004L.h.a(rectF) : this.f2004L.f566g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f2017a0;
        return e2 ? this.f2004L.f566g.a(rectF) : this.f2004L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f2017a0;
        return e2 ? this.f2004L.f564e.a(rectF) : this.f2004L.f565f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = I0.k.e(this);
        RectF rectF = this.f2017a0;
        return e2 ? this.f2004L.f565f.a(rectF) : this.f2004L.f564e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2038m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2010R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2011S;
    }

    public int getCounterMaxLength() {
        return this.f2035l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0201b0 c0201b0;
        if (this.f2033k && this.f2037m && (c0201b0 = this.f2040o) != null) {
            return c0201b0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2061z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2059y;
    }

    public ColorStateList getCursorColor() {
        return this.f1992A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1994B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2030i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2020c.f699g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2020c.f699g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2020c.f703m;
    }

    public int getEndIconMode() {
        return this.f2020c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2020c.f704n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2020c.f699g;
    }

    public CharSequence getError() {
        t tVar = this.f2031j;
        if (tVar.f736q) {
            return tVar.f735p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2031j.f739t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2031j.f738s;
    }

    public int getErrorCurrentTextColors() {
        C0201b0 c0201b0 = this.f2031j.f737r;
        if (c0201b0 != null) {
            return c0201b0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2020c.f696c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f2031j;
        if (tVar.f743x) {
            return tVar.f742w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0201b0 c0201b0 = this.f2031j.f744y;
        if (c0201b0 != null) {
            return c0201b0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1996C) {
            return this.f1997D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2054v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f2054v0;
        return bVar.e(bVar.f306k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2032j0;
    }

    public C getLengthCounter() {
        return this.f2039n;
    }

    public int getMaxEms() {
        return this.f2027g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2025f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2020c.f699g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2020c.f699g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2047s) {
            return this.f2046r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2053v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2051u;
    }

    public CharSequence getPrefixText() {
        return this.f2018b.f762c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2018b.f761b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2018b.f761b;
    }

    public k getShapeAppearanceModel() {
        return this.f2004L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2018b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2018b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2018b.f765g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2018b.h;
    }

    public CharSequence getSuffixText() {
        return this.f2020c.f706p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2020c.f707q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2020c.f707q;
    }

    public Typeface getTypeface() {
        return this.f2019b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f2018b.a() : this.f2020c.c());
    }

    public final void i() {
        int i = this.f2007O;
        if (i == 0) {
            this.F = null;
            this.f2002J = null;
            this.f2003K = null;
        } else if (i == 1) {
            this.F = new g(this.f2004L);
            this.f2002J = new g();
            this.f2003K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2007O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1996C || (this.F instanceof h)) {
                this.F = new g(this.f2004L);
            } else {
                k kVar = this.f2004L;
                int i2 = h.f671y;
                if (kVar == null) {
                    kVar = new k();
                }
                R0.g gVar = new R0.g(kVar, new RectF());
                h hVar = new h(gVar);
                hVar.f672x = gVar;
                this.F = hVar;
            }
            this.f2002J = null;
            this.f2003K = null;
        }
        s();
        x();
        if (this.f2007O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2008P = getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (c.a0(getContext())) {
                this.f2008P = getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f2007O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = T.f372a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (c.a0(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = T.f372a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2007O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2007O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        int i2;
        if (e()) {
            int width = this.d.getWidth();
            int gravity = this.d.getGravity();
            b bVar = this.f2054v0;
            boolean b2 = bVar.b(bVar.f268A);
            bVar.f270C = b2;
            Rect rect = bVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = bVar.f292Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = bVar.f292Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2017a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (bVar.f292Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f270C) {
                        f5 = max + bVar.f292Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (bVar.f270C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = bVar.f292Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > RecyclerView.f1570A0 || rectF.height() <= RecyclerView.f1570A0) {
                }
                float f6 = rectF.left;
                float f7 = this.f2006N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2009Q);
                h hVar = (h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = bVar.f292Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2017a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (bVar.f292Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > RecyclerView.f1570A0) {
            }
        }
    }

    public final void l(C0201b0 c0201b0, int i) {
        try {
            c0201b0.setTextAppearance(i);
            if (c0201b0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0201b0.setTextAppearance(com.football.transfertrivia.R.style.TextAppearance_AppCompat_Caption);
        c0201b0.setTextColor(A.b.a(getContext(), com.football.transfertrivia.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f2031j;
        return (tVar.f734o != 1 || tVar.f737r == null || TextUtils.isEmpty(tVar.f735p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0009h) this.f2039n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2037m;
        int i = this.f2035l;
        String str = null;
        if (i == -1) {
            this.f2040o.setText(String.valueOf(length));
            this.f2040o.setContentDescription(null);
            this.f2037m = false;
        } else {
            this.f2037m = length > i;
            Context context = getContext();
            this.f2040o.setContentDescription(context.getString(this.f2037m ? com.football.transfertrivia.R.string.character_counter_overflowed_content_description : com.football.transfertrivia.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2035l)));
            if (z2 != this.f2037m) {
                o();
            }
            String str2 = I.b.f254b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f256e : I.b.d;
            C0201b0 c0201b0 = this.f2040o;
            String string = getContext().getString(com.football.transfertrivia.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2035l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.h hVar = I.i.f264a;
                str = bVar.c(string).toString();
            }
            c0201b0.setText(str);
        }
        if (this.d == null || z2 == this.f2037m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0201b0 c0201b0 = this.f2040o;
        if (c0201b0 != null) {
            l(c0201b0, this.f2037m ? this.f2042p : this.f2044q);
            if (!this.f2037m && (colorStateList2 = this.f2059y) != null) {
                this.f2040o.setTextColor(colorStateList2);
            }
            if (!this.f2037m || (colorStateList = this.f2061z) == null) {
                return;
            }
            this.f2040o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2054v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.f2020c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1995B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f2018b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new B0.b(5, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = I0.c.f322a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2014V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = I0.c.f322a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            I0.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = I0.c.f323b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2002J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f2010R, rect.right, i5);
            }
            g gVar2 = this.f2003K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f2011S, rect.right, i6);
            }
            if (this.f1996C) {
                float textSize = this.d.getTextSize();
                b bVar = this.f2054v0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (bVar.f304g != i7) {
                    bVar.f304g = i7;
                    bVar.h(false);
                }
                if (bVar.f302f != gravity) {
                    bVar.f302f = gravity;
                    bVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = I0.k.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2015W;
                rect2.bottom = i8;
                int i9 = this.f2007O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f2008P;
                    rect2.right = h(rect.right, e2);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e2);
                } else {
                    rect2.left = this.d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = bVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    bVar.f279M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f281O;
                textPaint.setTextSize(bVar.h);
                textPaint.setTypeface(bVar.f316u);
                textPaint.setLetterSpacing(bVar.f289W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2007O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2007O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = bVar.f297c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.f279M = true;
                }
                bVar.h(false);
                if (!e() || this.f2052u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.f1995B0;
        p pVar = this.f2020c;
        if (!z2) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1995B0 = true;
        }
        if (this.f2049t != null && (editText = this.d) != null) {
            this.f2049t.setGravity(editText.getGravity());
            this.f2049t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof D)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        D d = (D) parcelable;
        super.onRestoreInstanceState(d.f771a);
        setError(d.f653c);
        if (d.d) {
            post(new Q.b(1, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2005M) {
            O0.c cVar = this.f2004L.f564e;
            RectF rectF = this.f2017a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2004L.f565f.a(rectF);
            float a4 = this.f2004L.h.a(rectF);
            float a5 = this.f2004L.f566g.a(rectF);
            k kVar = this.f2004L;
            c cVar2 = kVar.f561a;
            c cVar3 = kVar.f562b;
            c cVar4 = kVar.d;
            c cVar5 = kVar.f563c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(cVar3);
            j.b(cVar2);
            j.b(cVar5);
            j.b(cVar4);
            O0.a aVar = new O0.a(a3);
            O0.a aVar2 = new O0.a(a2);
            O0.a aVar3 = new O0.a(a5);
            O0.a aVar4 = new O0.a(a4);
            k kVar2 = new k();
            kVar2.f561a = cVar3;
            kVar2.f562b = cVar2;
            kVar2.f563c = cVar4;
            kVar2.d = cVar5;
            kVar2.f564e = aVar;
            kVar2.f565f = aVar2;
            kVar2.f566g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f567j = eVar2;
            kVar2.f568k = eVar3;
            kVar2.f569l = eVar4;
            this.f2005M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        D d = new D(super.onSaveInstanceState());
        if (m()) {
            d.f653c = getError();
        }
        p pVar = this.f2020c;
        d.d = pVar.i != 0 && pVar.f699g.d;
        return d;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1992A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue n0 = c.n0(context, com.football.transfertrivia.R.attr.colorControlActivated);
            if (n0 != null) {
                int i = n0.resourceId;
                if (i != 0) {
                    colorStateList2 = c.E(context, i);
                } else {
                    int i2 = n0.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f2040o != null && this.f2037m)) && (colorStateList = this.f1994B) != null) {
                colorStateList2 = colorStateList;
            }
            D.a.h(mutate, colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z2;
        p pVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            y yVar = this.f2018b;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f2021c0 == null || this.f2022d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2021c0 = colorDrawable3;
                    this.f2022d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f2021c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    pVar = this.f2020c;
                    if ((!pVar.e() || ((pVar.i != 0 && pVar.d()) || pVar.f706p != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = pVar.f707q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.f696c;
                        } else if (pVar.i != 0 && pVar.d()) {
                            checkableImageButton = pVar.f699g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2026f0;
                        if (colorDrawable != null || this.f2028g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2026f0 = colorDrawable5;
                                this.f2028g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2026f0;
                            if (drawable == colorDrawable2) {
                                this.f2029h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2028g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2026f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2026f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2026f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2029h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2026f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                pVar = this.f2020c;
                if (pVar.e()) {
                }
                int measuredWidth22 = pVar.f707q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f2026f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2026f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f2021c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f2021c0 = null;
            z2 = true;
            pVar = this.f2020c;
            if (pVar.e()) {
            }
            int measuredWidth222 = pVar.f707q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f2026f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2026f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        pVar = this.f2020c;
        if (pVar.e()) {
        }
        int measuredWidth2222 = pVar.f707q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f2026f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2026f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0201b0 c0201b0;
        EditText editText = this.d;
        if (editText == null || this.f2007O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0221l0.f3036a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0236t.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2037m && (c0201b0 = this.f2040o) != null) {
            mutate.setColorFilter(C0236t.c(c0201b0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.f2001I || editText.getBackground() == null) && this.f2007O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = T.f372a;
            editText2.setBackground(editTextBoxBackground);
            this.f2001I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2013U != i) {
            this.f2013U = i;
            this.f2041o0 = i;
            this.f2045q0 = i;
            this.r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(A.b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2041o0 = defaultColor;
        this.f2013U = defaultColor;
        this.f2043p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2045q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2007O) {
            return;
        }
        this.f2007O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2008P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f2004L.e();
        O0.c cVar = this.f2004L.f564e;
        c t2 = c.t(i);
        e2.f552a = t2;
        j.b(t2);
        e2.f555e = cVar;
        O0.c cVar2 = this.f2004L.f565f;
        c t3 = c.t(i);
        e2.f553b = t3;
        j.b(t3);
        e2.f556f = cVar2;
        O0.c cVar3 = this.f2004L.h;
        c t4 = c.t(i);
        e2.d = t4;
        j.b(t4);
        e2.h = cVar3;
        O0.c cVar4 = this.f2004L.f566g;
        c t5 = c.t(i);
        e2.f554c = t5;
        j.b(t5);
        e2.f557g = cVar4;
        this.f2004L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2038m0 != i) {
            this.f2038m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2034k0 = colorStateList.getDefaultColor();
            this.f2048s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2036l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2038m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2038m0 != colorStateList.getDefaultColor()) {
            this.f2038m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.n0 != colorStateList) {
            this.n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2010R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2011S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2033k != z2) {
            t tVar = this.f2031j;
            if (z2) {
                C0201b0 c0201b0 = new C0201b0(getContext(), null);
                this.f2040o = c0201b0;
                c0201b0.setId(com.football.transfertrivia.R.id.textinput_counter);
                Typeface typeface = this.f2019b0;
                if (typeface != null) {
                    this.f2040o.setTypeface(typeface);
                }
                this.f2040o.setMaxLines(1);
                tVar.a(this.f2040o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2040o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.football.transfertrivia.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2040o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2040o, 2);
                this.f2040o = null;
            }
            this.f2033k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2035l != i) {
            if (i > 0) {
                this.f2035l = i;
            } else {
                this.f2035l = -1;
            }
            if (!this.f2033k || this.f2040o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2042p != i) {
            this.f2042p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2061z != colorStateList) {
            this.f2061z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2044q != i) {
            this.f2044q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2059y != colorStateList) {
            this.f2059y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1992A != colorStateList) {
            this.f1992A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1994B != colorStateList) {
            this.f1994B = colorStateList;
            if (m() || (this.f2040o != null && this.f2037m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2030i0 = colorStateList;
        this.f2032j0 = colorStateList;
        if (this.d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2020c.f699g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2020c.f699g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f2020c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f699g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f2020c;
        Drawable w2 = i != 0 ? T.e.w(pVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pVar.f699g;
        checkableImageButton.setImageDrawable(w2);
        if (w2 != null) {
            ColorStateList colorStateList = pVar.f701k;
            PorterDuff.Mode mode = pVar.f702l;
            TextInputLayout textInputLayout = pVar.f694a;
            c.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c.m0(textInputLayout, checkableImageButton, pVar.f701k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f2020c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f703m) {
            pVar.f703m = i;
            CheckableImageButton checkableImageButton = pVar.f699g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f696c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2020c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2020c;
        View.OnLongClickListener onLongClickListener = pVar.f705o;
        CheckableImageButton checkableImageButton = pVar.f699g;
        checkableImageButton.setOnClickListener(onClickListener);
        c.v0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2020c;
        pVar.f705o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f699g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c.v0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f2020c;
        pVar.f704n = scaleType;
        pVar.f699g.setScaleType(scaleType);
        pVar.f696c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2020c;
        if (pVar.f701k != colorStateList) {
            pVar.f701k = colorStateList;
            c.d(pVar.f694a, pVar.f699g, colorStateList, pVar.f702l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2020c;
        if (pVar.f702l != mode) {
            pVar.f702l = mode;
            c.d(pVar.f694a, pVar.f699g, pVar.f701k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2020c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f2031j;
        if (!tVar.f736q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f735p = charSequence;
        tVar.f737r.setText(charSequence);
        int i = tVar.f733n;
        if (i != 1) {
            tVar.f734o = 1;
        }
        tVar.i(i, tVar.f734o, tVar.h(tVar.f737r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f2031j;
        tVar.f739t = i;
        C0201b0 c0201b0 = tVar.f737r;
        if (c0201b0 != null) {
            WeakHashMap weakHashMap = T.f372a;
            c0201b0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f2031j;
        tVar.f738s = charSequence;
        C0201b0 c0201b0 = tVar.f737r;
        if (c0201b0 != null) {
            c0201b0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        t tVar = this.f2031j;
        if (tVar.f736q == z2) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z2) {
            C0201b0 c0201b0 = new C0201b0(tVar.f728g, null);
            tVar.f737r = c0201b0;
            c0201b0.setId(com.football.transfertrivia.R.id.textinput_error);
            tVar.f737r.setTextAlignment(5);
            Typeface typeface = tVar.f722B;
            if (typeface != null) {
                tVar.f737r.setTypeface(typeface);
            }
            int i = tVar.f740u;
            tVar.f740u = i;
            C0201b0 c0201b02 = tVar.f737r;
            if (c0201b02 != null) {
                textInputLayout.l(c0201b02, i);
            }
            ColorStateList colorStateList = tVar.f741v;
            tVar.f741v = colorStateList;
            C0201b0 c0201b03 = tVar.f737r;
            if (c0201b03 != null && colorStateList != null) {
                c0201b03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f738s;
            tVar.f738s = charSequence;
            C0201b0 c0201b04 = tVar.f737r;
            if (c0201b04 != null) {
                c0201b04.setContentDescription(charSequence);
            }
            int i2 = tVar.f739t;
            tVar.f739t = i2;
            C0201b0 c0201b05 = tVar.f737r;
            if (c0201b05 != null) {
                WeakHashMap weakHashMap = T.f372a;
                c0201b05.setAccessibilityLiveRegion(i2);
            }
            tVar.f737r.setVisibility(4);
            tVar.a(tVar.f737r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f737r, 0);
            tVar.f737r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f736q = z2;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f2020c;
        pVar.i(i != 0 ? T.e.w(pVar.getContext(), i) : null);
        c.m0(pVar.f694a, pVar.f696c, pVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2020c;
        CheckableImageButton checkableImageButton = pVar.f696c;
        View.OnLongClickListener onLongClickListener = pVar.f698f;
        checkableImageButton.setOnClickListener(onClickListener);
        c.v0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2020c;
        pVar.f698f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f696c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c.v0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2020c;
        if (pVar.d != colorStateList) {
            pVar.d = colorStateList;
            c.d(pVar.f694a, pVar.f696c, colorStateList, pVar.f697e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2020c;
        if (pVar.f697e != mode) {
            pVar.f697e = mode;
            c.d(pVar.f694a, pVar.f696c, pVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f2031j;
        tVar.f740u = i;
        C0201b0 c0201b0 = tVar.f737r;
        if (c0201b0 != null) {
            tVar.h.l(c0201b0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f2031j;
        tVar.f741v = colorStateList;
        C0201b0 c0201b0 = tVar.f737r;
        if (c0201b0 == null || colorStateList == null) {
            return;
        }
        c0201b0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2056w0 != z2) {
            this.f2056w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f2031j;
        if (isEmpty) {
            if (tVar.f743x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f743x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f742w = charSequence;
        tVar.f744y.setText(charSequence);
        int i = tVar.f733n;
        if (i != 2) {
            tVar.f734o = 2;
        }
        tVar.i(i, tVar.f734o, tVar.h(tVar.f744y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f2031j;
        tVar.f721A = colorStateList;
        C0201b0 c0201b0 = tVar.f744y;
        if (c0201b0 == null || colorStateList == null) {
            return;
        }
        c0201b0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        t tVar = this.f2031j;
        if (tVar.f743x == z2) {
            return;
        }
        tVar.c();
        if (z2) {
            C0201b0 c0201b0 = new C0201b0(tVar.f728g, null);
            tVar.f744y = c0201b0;
            c0201b0.setId(com.football.transfertrivia.R.id.textinput_helper_text);
            tVar.f744y.setTextAlignment(5);
            Typeface typeface = tVar.f722B;
            if (typeface != null) {
                tVar.f744y.setTypeface(typeface);
            }
            tVar.f744y.setVisibility(4);
            tVar.f744y.setAccessibilityLiveRegion(1);
            int i = tVar.f745z;
            tVar.f745z = i;
            C0201b0 c0201b02 = tVar.f744y;
            if (c0201b02 != null) {
                c0201b02.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f721A;
            tVar.f721A = colorStateList;
            C0201b0 c0201b03 = tVar.f744y;
            if (c0201b03 != null && colorStateList != null) {
                c0201b03.setTextColor(colorStateList);
            }
            tVar.a(tVar.f744y, 1);
            tVar.f744y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.f733n;
            if (i2 == 2) {
                tVar.f734o = 0;
            }
            tVar.i(i2, tVar.f734o, tVar.h(tVar.f744y, ""));
            tVar.g(tVar.f744y, 1);
            tVar.f744y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f743x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f2031j;
        tVar.f745z = i;
        C0201b0 c0201b0 = tVar.f744y;
        if (c0201b0 != null) {
            c0201b0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1996C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2058x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1996C) {
            this.f1996C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1997D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1998E = true;
            } else {
                this.f1998E = false;
                if (!TextUtils.isEmpty(this.f1997D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1997D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f2054v0;
        TextInputLayout textInputLayout = bVar.f293a;
        d dVar = new d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f497j;
        if (colorStateList != null) {
            bVar.f306k = colorStateList;
        }
        float f2 = dVar.f498k;
        if (f2 != RecyclerView.f1570A0) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f491a;
        if (colorStateList2 != null) {
            bVar.f287U = colorStateList2;
        }
        bVar.f285S = dVar.f494e;
        bVar.f286T = dVar.f495f;
        bVar.f284R = dVar.f496g;
        bVar.f288V = dVar.i;
        L0.a aVar = bVar.f320y;
        if (aVar != null) {
            aVar.f487g = true;
        }
        A0.h hVar = new A0.h(2, bVar);
        dVar.a();
        bVar.f320y = new L0.a(hVar, dVar.f501n);
        dVar.c(textInputLayout.getContext(), bVar.f320y);
        bVar.h(false);
        this.f2032j0 = bVar.f306k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2032j0 != colorStateList) {
            if (this.f2030i0 == null) {
                b bVar = this.f2054v0;
                if (bVar.f306k != colorStateList) {
                    bVar.f306k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2032j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(C c2) {
        this.f2039n = c2;
    }

    public void setMaxEms(int i) {
        this.f2027g = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f2025f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.d;
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
        p pVar = this.f2020c;
        pVar.f699g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f2020c;
        pVar.f699g.setImageDrawable(i != 0 ? T.e.w(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p pVar = this.f2020c;
        if (z2 && pVar.i != 1) {
            pVar.g(1);
        } else if (z2) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f2020c;
        pVar.f701k = colorStateList;
        c.d(pVar.f694a, pVar.f699g, colorStateList, pVar.f702l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2020c;
        pVar.f702l = mode;
        c.d(pVar.f694a, pVar.f699g, pVar.f701k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2049t == null) {
            C0201b0 c0201b0 = new C0201b0(getContext(), null);
            this.f2049t = c0201b0;
            c0201b0.setId(com.football.transfertrivia.R.id.textinput_placeholder);
            this.f2049t.setImportantForAccessibility(2);
            C0269h d = d();
            this.f2055w = d;
            d.f3243b = 67L;
            this.f2057x = d();
            setPlaceholderTextAppearance(this.f2053v);
            setPlaceholderTextColor(this.f2051u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2047s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2046r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2053v = i;
        C0201b0 c0201b0 = this.f2049t;
        if (c0201b0 != null) {
            c0201b0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2051u != colorStateList) {
            this.f2051u = colorStateList;
            C0201b0 c0201b0 = this.f2049t;
            if (c0201b0 == null || colorStateList == null) {
                return;
            }
            c0201b0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f2018b;
        yVar.getClass();
        yVar.f762c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f761b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2018b.f761b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2018b.f761b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f532a.f518a == kVar) {
            return;
        }
        this.f2004L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2018b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2018b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? T.e.w(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f2018b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f765g) {
            yVar.f765g = i;
            CheckableImageButton checkableImageButton = yVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f2018b;
        View.OnLongClickListener onLongClickListener = yVar.i;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        c.v0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f2018b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        c.v0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f2018b;
        yVar.h = scaleType;
        yVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f2018b;
        if (yVar.f763e != colorStateList) {
            yVar.f763e = colorStateList;
            c.d(yVar.f760a, yVar.d, colorStateList, yVar.f764f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f2018b;
        if (yVar.f764f != mode) {
            yVar.f764f = mode;
            c.d(yVar.f760a, yVar.d, yVar.f763e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2018b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f2020c;
        pVar.getClass();
        pVar.f706p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f707q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2020c.f707q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2020c.f707q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(B b2) {
        EditText editText = this.d;
        if (editText != null) {
            T.l(editText, b2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2019b0) {
            this.f2019b0 = typeface;
            this.f2054v0.m(typeface);
            t tVar = this.f2031j;
            if (typeface != tVar.f722B) {
                tVar.f722B = typeface;
                C0201b0 c0201b0 = tVar.f737r;
                if (c0201b0 != null) {
                    c0201b0.setTypeface(typeface);
                }
                C0201b0 c0201b02 = tVar.f744y;
                if (c0201b02 != null) {
                    c0201b02.setTypeface(typeface);
                }
            }
            C0201b0 c0201b03 = this.f2040o;
            if (c0201b03 != null) {
                c0201b03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2007O != 1) {
            FrameLayout frameLayout = this.f2016a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C0201b0 c0201b0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2030i0;
        b bVar = this.f2054v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2030i0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2048s0) : this.f2048s0));
        } else if (m()) {
            C0201b0 c0201b02 = this.f2031j.f737r;
            bVar.i(c0201b02 != null ? c0201b02.getTextColors() : null);
        } else if (this.f2037m && (c0201b0 = this.f2040o) != null) {
            bVar.i(c0201b0.getTextColors());
        } else if (z5 && (colorStateList = this.f2032j0) != null && bVar.f306k != colorStateList) {
            bVar.f306k = colorStateList;
            bVar.h(false);
        }
        p pVar = this.f2020c;
        y yVar = this.f2018b;
        if (z4 || !this.f2056w0 || (isEnabled() && z5)) {
            if (z3 || this.f2052u0) {
                ValueAnimator valueAnimator = this.f2060y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2060y0.cancel();
                }
                if (z2 && this.f2058x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f2052u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f766j = false;
                yVar.e();
                pVar.f708r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2052u0) {
            ValueAnimator valueAnimator2 = this.f2060y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2060y0.cancel();
            }
            if (z2 && this.f2058x0) {
                a(RecyclerView.f1570A0);
            } else {
                bVar.k(RecyclerView.f1570A0);
            }
            if (e() && !((h) this.F).f672x.f670q.isEmpty() && e()) {
                ((h) this.F).n(RecyclerView.f1570A0, RecyclerView.f1570A0, RecyclerView.f1570A0, RecyclerView.f1570A0);
            }
            this.f2052u0 = true;
            C0201b0 c0201b03 = this.f2049t;
            if (c0201b03 != null && this.f2047s) {
                c0201b03.setText((CharSequence) null);
                AbstractC0278q.a(this.f2016a, this.f2057x);
                this.f2049t.setVisibility(4);
            }
            yVar.f766j = true;
            yVar.e();
            pVar.f708r = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0009h) this.f2039n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2016a;
        if (length != 0 || this.f2052u0) {
            C0201b0 c0201b0 = this.f2049t;
            if (c0201b0 == null || !this.f2047s) {
                return;
            }
            c0201b0.setText((CharSequence) null);
            AbstractC0278q.a(frameLayout, this.f2057x);
            this.f2049t.setVisibility(4);
            return;
        }
        if (this.f2049t == null || !this.f2047s || TextUtils.isEmpty(this.f2046r)) {
            return;
        }
        this.f2049t.setText(this.f2046r);
        AbstractC0278q.a(frameLayout, this.f2055w);
        this.f2049t.setVisibility(0);
        this.f2049t.bringToFront();
        announceForAccessibility(this.f2046r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.n0.getDefaultColor();
        int colorForState = this.n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2012T = colorForState2;
        } else if (z3) {
            this.f2012T = colorForState;
        } else {
            this.f2012T = defaultColor;
        }
    }

    public final void x() {
        C0201b0 c0201b0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f2007O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2012T = this.f2048s0;
        } else if (m()) {
            if (this.n0 != null) {
                w(z3, z2);
            } else {
                this.f2012T = getErrorCurrentTextColors();
            }
        } else if (!this.f2037m || (c0201b0 = this.f2040o) == null) {
            if (z3) {
                this.f2012T = this.f2038m0;
            } else if (z2) {
                this.f2012T = this.f2036l0;
            } else {
                this.f2012T = this.f2034k0;
            }
        } else if (this.n0 != null) {
            w(z3, z2);
        } else {
            this.f2012T = c0201b0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f2020c;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f696c;
        ColorStateList colorStateList = pVar.d;
        TextInputLayout textInputLayout = pVar.f694a;
        c.m0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f701k;
        CheckableImageButton checkableImageButton2 = pVar.f699g;
        c.m0(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof R0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                c.d(textInputLayout, checkableImageButton2, pVar.f701k, pVar.f702l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.f2018b;
        c.m0(yVar.f760a, yVar.d, yVar.f763e);
        if (this.f2007O == 2) {
            int i = this.f2009Q;
            if (z3 && isEnabled()) {
                this.f2009Q = this.f2011S;
            } else {
                this.f2009Q = this.f2010R;
            }
            if (this.f2009Q != i && e() && !this.f2052u0) {
                if (e()) {
                    ((h) this.F).n(RecyclerView.f1570A0, RecyclerView.f1570A0, RecyclerView.f1570A0, RecyclerView.f1570A0);
                }
                j();
            }
        }
        if (this.f2007O == 1) {
            if (!isEnabled()) {
                this.f2013U = this.f2043p0;
            } else if (z2 && !z3) {
                this.f2013U = this.r0;
            } else if (z3) {
                this.f2013U = this.f2045q0;
            } else {
                this.f2013U = this.f2041o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2018b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2020c.f699g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2020c.f699g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2020c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2020c.f699g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f2020c;
        CheckableImageButton checkableImageButton = pVar.f699g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f701k;
            PorterDuff.Mode mode = pVar.f702l;
            TextInputLayout textInputLayout = pVar.f694a;
            c.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c.m0(textInputLayout, checkableImageButton, pVar.f701k);
        }
    }
}
