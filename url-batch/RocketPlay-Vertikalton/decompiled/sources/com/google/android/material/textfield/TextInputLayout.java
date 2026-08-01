package com.google.android.material.textfield;

import A.b;
import F1.l;
import G0.d;
import G0.m;
import G0.o;
import K.C0014g;
import K.C0019l;
import K.J;
import K.T;
import M0.c;
import M0.e;
import M0.f;
import M0.g;
import M0.i;
import M0.j;
import M0.k;
import P0.A;
import P0.B;
import P0.C;
import P0.D;
import P0.p;
import P0.s;
import P0.t;
import P0.w;
import P0.y;
import P0.z;
import R0.a;
import a1.AbstractC0067d;
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
import l.AbstractC0266n0;
import l.C0244c0;
import l.C0279u;
import o0.h;
import o0.q;
import s0.AbstractC0363a;
import t0.AbstractC0369a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2358A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f2359A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2360B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f2361B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2362C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f2363D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2364E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f2365G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f2366H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2367I;

    /* renamed from: J, reason: collision with root package name */
    public g f2368J;

    /* renamed from: K, reason: collision with root package name */
    public g f2369K;

    /* renamed from: L, reason: collision with root package name */
    public k f2370L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2371M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2372N;

    /* renamed from: O, reason: collision with root package name */
    public int f2373O;

    /* renamed from: P, reason: collision with root package name */
    public int f2374P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2375Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2376R;

    /* renamed from: S, reason: collision with root package name */
    public int f2377S;

    /* renamed from: T, reason: collision with root package name */
    public int f2378T;

    /* renamed from: U, reason: collision with root package name */
    public int f2379U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2380V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2381W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2382a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2383a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f2384b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f2385b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f2386c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2387c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2388d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2389e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2390e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2391f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2392f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2393g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2394g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2395h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2396i0;

    /* renamed from: j, reason: collision with root package name */
    public final t f2397j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2398j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2399k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2400k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2401l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2402l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2403m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2404m0;

    /* renamed from: n, reason: collision with root package name */
    public C f2405n;
    public ColorStateList n0;

    /* renamed from: o, reason: collision with root package name */
    public C0244c0 f2406o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2407o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2408p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2409p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2410q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2411q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2412r;
    public int r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2413s;

    /* renamed from: s0, reason: collision with root package name */
    public int f2414s0;

    /* renamed from: t, reason: collision with root package name */
    public C0244c0 f2415t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2416t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2417u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2418u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2419v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f2420v0;

    /* renamed from: w, reason: collision with root package name */
    public h f2421w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2422w0;

    /* renamed from: x, reason: collision with root package name */
    public h f2423x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2424x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2425y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2426y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2427z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f2428z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.luckycounter.drinkwater.R.attr.textInputStyle, com.luckycounter.drinkwater.R.style.Widget_Design_TextInputLayout), attributeSet, com.luckycounter.drinkwater.R.attr.textInputStyle);
        this.f2391f = -1;
        this.f2393g = -1;
        this.h = -1;
        this.i = -1;
        this.f2397j = new t(this);
        this.f2405n = new C0014g(2);
        this.f2380V = new Rect();
        this.f2381W = new Rect();
        this.f2383a0 = new RectF();
        this.f2390e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f2420v0 = dVar;
        this.f2361B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2382a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0369a.f4162a;
        dVar.f452Q = linearInterpolator;
        dVar.h(false);
        dVar.f451P = linearInterpolator;
        dVar.h(false);
        if (dVar.f473g != 8388659) {
            dVar.f473g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0363a.f4092A;
        m.a(context2, attributeSet, com.luckycounter.drinkwater.R.attr.textInputStyle, com.luckycounter.drinkwater.R.style.Widget_Design_TextInputLayout);
        m.b(context2, attributeSet, iArr, com.luckycounter.drinkwater.R.attr.textInputStyle, com.luckycounter.drinkwater.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.luckycounter.drinkwater.R.attr.textInputStyle, com.luckycounter.drinkwater.R.style.Widget_Design_TextInputLayout);
        C0019l c0019l = new C0019l(context2, obtainStyledAttributes);
        y yVar = new y(this, c0019l);
        this.f2384b = yVar;
        this.f2362C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f2424x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f2422w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f2370L = k.b(context2, attributeSet, com.luckycounter.drinkwater.R.attr.textInputStyle, com.luckycounter.drinkwater.R.style.Widget_Design_TextInputLayout).a();
        this.f2372N = context2.getResources().getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2374P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2376R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2377S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2375Q = this.f2376R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f2370L.e();
        if (dimension >= RecyclerView.f1949A0) {
            e2.f851e = new M0.a(dimension);
        }
        if (dimension2 >= RecyclerView.f1949A0) {
            e2.f852f = new M0.a(dimension2);
        }
        if (dimension3 >= RecyclerView.f1949A0) {
            e2.f853g = new M0.a(dimension3);
        }
        if (dimension4 >= RecyclerView.f1949A0) {
            e2.h = new M0.a(dimension4);
        }
        this.f2370L = e2.a();
        ColorStateList y2 = l.y(context2, c0019l, 7);
        if (y2 != null) {
            int defaultColor = y2.getDefaultColor();
            this.f2407o0 = defaultColor;
            this.f2379U = defaultColor;
            if (y2.isStateful()) {
                this.f2409p0 = y2.getColorForState(new int[]{-16842910}, -1);
                this.f2411q0 = y2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.r0 = y2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2411q0 = this.f2407o0;
                ColorStateList D2 = F1.d.D(context2, com.luckycounter.drinkwater.R.color.mtrl_filled_background_color);
                this.f2409p0 = D2.getColorForState(new int[]{-16842910}, -1);
                this.r0 = D2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2379U = 0;
            this.f2407o0 = 0;
            this.f2409p0 = 0;
            this.f2411q0 = 0;
            this.r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList b2 = c0019l.b(1);
            this.f2398j0 = b2;
            this.f2396i0 = b2;
        }
        ColorStateList y3 = l.y(context2, c0019l, 14);
        this.f2404m0 = obtainStyledAttributes.getColor(14, 0);
        this.f2400k0 = b.a(context2, com.luckycounter.drinkwater.R.color.mtrl_textinput_default_box_stroke_color);
        this.f2414s0 = b.a(context2, com.luckycounter.drinkwater.R.color.mtrl_textinput_disabled_color);
        this.f2402l0 = b.a(context2, com.luckycounter.drinkwater.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (y3 != null) {
            setBoxStrokeColorStateList(y3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(l.y(context2, c0019l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f2358A = c0019l.b(24);
        this.f2360B = c0019l.b(25);
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
        this.f2410q = obtainStyledAttributes.getResourceId(22, 0);
        this.f2408p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2408p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2410q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0019l.b(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0019l.b(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0019l.b(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0019l.b(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0019l.b(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0019l.b(58));
        }
        p pVar = new p(this, c0019l);
        this.f2386c = pVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0019l.k();
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
        if (!(editText instanceof AutoCompleteTextView) || l.O(editText)) {
            return this.F;
        }
        int C2 = F1.d.C(this.d, com.luckycounter.drinkwater.R.attr.colorControlHighlight);
        int i = this.f2373O;
        int[][] iArr = C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f2379U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{F1.d.P(C2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue f02 = F1.d.f0(context, com.luckycounter.drinkwater.R.attr.colorSurface, "TextInputLayout");
        int i3 = f02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : f02.data;
        g gVar3 = new g(gVar2.f828a.f814a);
        int P2 = F1.d.P(C2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{P2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{P2, a2});
        g gVar4 = new g(gVar2.f828a.f814a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2366H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2366H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2366H.addState(new int[0], f(false));
        }
        return this.f2366H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2365G == null) {
            this.f2365G = f(true);
        }
        return this.f2365G;
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
        int i = this.f2391f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f2393g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f2367I = false;
        i();
        setTextInputAccessibilityDelegate(new B(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f2420v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f458W != letterSpacing) {
            dVar.f458W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f473g != i4) {
            dVar.f473g = i4;
            dVar.h(false);
        }
        if (dVar.f471f != gravity) {
            dVar.f471f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = T.f633a;
        this.f2416t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new z(this, editText));
        if (this.f2396i0 == null) {
            this.f2396i0 = this.d.getHintTextColors();
        }
        if (this.f2362C) {
            if (TextUtils.isEmpty(this.f2363D)) {
                CharSequence hint = this.d.getHint();
                this.f2389e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f2364E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2406o != null) {
            n(this.d.getText());
        }
        r();
        this.f2397j.b();
        this.f2384b.bringToFront();
        p pVar = this.f2386c;
        pVar.bringToFront();
        Iterator it = this.f2390e0.iterator();
        while (it.hasNext()) {
            ((P0.m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2363D)) {
            return;
        }
        this.f2363D = charSequence;
        d dVar = this.f2420v0;
        if (charSequence == null || !TextUtils.equals(dVar.f437A, charSequence)) {
            dVar.f437A = charSequence;
            dVar.f438B = null;
            Bitmap bitmap = dVar.f441E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f441E = null;
            }
            dVar.h(false);
        }
        if (this.f2418u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2413s == z2) {
            return;
        }
        if (z2) {
            C0244c0 c0244c0 = this.f2415t;
            if (c0244c0 != null) {
                this.f2382a.addView(c0244c0);
                this.f2415t.setVisibility(0);
            }
        } else {
            C0244c0 c0244c02 = this.f2415t;
            if (c0244c02 != null) {
                c0244c02.setVisibility(8);
            }
            this.f2415t = null;
        }
        this.f2413s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f2420v0;
        if (dVar.f464b == f2) {
            return;
        }
        if (this.f2426y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2426y0 = valueAnimator;
            valueAnimator.setInterpolator(F1.d.e0(getContext(), com.luckycounter.drinkwater.R.attr.motionEasingEmphasizedInterpolator, AbstractC0369a.f4163b));
            this.f2426y0.setDuration(F1.d.d0(getContext(), com.luckycounter.drinkwater.R.attr.motionDurationMedium4, 167));
            this.f2426y0.addUpdateListener(new A(i, this));
        }
        this.f2426y0.setFloatValues(dVar.f464b, f2);
        this.f2426y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2382a;
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
        k kVar = gVar.f828a.f814a;
        k kVar2 = this.f2370L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2373O == 2 && (i = this.f2375Q) > -1 && (i2 = this.f2378T) != 0) {
            g gVar2 = this.F;
            gVar2.f828a.f820j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f828a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f2379U;
        if (this.f2373O == 1) {
            i3 = C.a.b(this.f2379U, F1.d.B(getContext(), com.luckycounter.drinkwater.R.attr.colorSurface, 0));
        }
        this.f2379U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f2368J;
        if (gVar3 != null && this.f2369K != null) {
            if (this.f2375Q > -1 && this.f2378T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f2400k0) : ColorStateList.valueOf(this.f2378T));
                this.f2369K.j(ColorStateList.valueOf(this.f2378T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f2362C) {
            return 0;
        }
        int i = this.f2373O;
        d dVar = this.f2420v0;
        if (i == 0) {
            d = dVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d = dVar.d() / 2.0f;
        }
        return (int) d;
    }

    public final h d() {
        h hVar = new h();
        hVar.f3671c = F1.d.d0(getContext(), com.luckycounter.drinkwater.R.attr.motionDurationShort2, 87);
        hVar.d = F1.d.e0(getContext(), com.luckycounter.drinkwater.R.attr.motionEasingLinearInterpolator, AbstractC0369a.f4162a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f2389e != null) {
            boolean z2 = this.f2364E;
            this.f2364E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f2389e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f2364E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2382a;
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
        this.f2359A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2359A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f2362C;
        d dVar = this.f2420v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f438B != null) {
                RectF rectF = dVar.f469e;
                if (rectF.width() > RecyclerView.f1949A0 && rectF.height() > RecyclerView.f1949A0) {
                    TextPaint textPaint = dVar.f449N;
                    textPaint.setTextSize(dVar.f442G);
                    float f2 = dVar.f480p;
                    float f3 = dVar.f481q;
                    float f4 = dVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f468d0 <= 1 || dVar.f439C) {
                        canvas.translate(f2, f3);
                        dVar.f460Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f480p - dVar.f460Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f465b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.f443H;
                            float f7 = dVar.f444I;
                            float f8 = dVar.f445J;
                            int i3 = dVar.f446K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f460Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f463a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.f443H;
                            float f10 = dVar.f444I;
                            float f11 = dVar.f445J;
                            int i4 = dVar.f446K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f460Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f467c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.f1949A0, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.f443H, dVar.f444I, dVar.f445J, dVar.f446K);
                        }
                        String trim = dVar.f467c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f460Y.getLineEnd(i), str.length()), RecyclerView.f1949A0, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f2369K == null || (gVar = this.f2368J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f2369K.getBounds();
            Rect bounds2 = this.f2368J.getBounds();
            float f13 = dVar.f464b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0369a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0369a.c(centerX, bounds2.right, f13);
            this.f2369K.draw(canvas);
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
        if (this.f2428z0) {
            return;
        }
        this.f2428z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f2420v0;
        if (dVar != null) {
            dVar.f447L = drawableState;
            ColorStateList colorStateList2 = dVar.f475k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f474j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = T.f633a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.f2428z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.f2428z0 = false;
    }

    public final boolean e() {
        return this.f2362C && !TextUtils.isEmpty(this.f2363D) && (this.F instanceof P0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : RecyclerView.f1949A0;
        EditText editText = this.d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        M0.a aVar = new M0.a(f2);
        M0.a aVar2 = new M0.a(f2);
        M0.a aVar3 = new M0.a(dimensionPixelOffset);
        M0.a aVar4 = new M0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f857a = iVar;
        kVar.f858b = iVar2;
        kVar.f859c = iVar3;
        kVar.d = iVar4;
        kVar.f860e = aVar;
        kVar.f861f = aVar2;
        kVar.f862g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f863j = eVar2;
        kVar.f864k = eVar3;
        kVar.f865l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f827w;
            TypedValue f02 = F1.d.f0(context, com.luckycounter.drinkwater.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = f02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : f02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f828a;
        if (fVar.f819g == null) {
            fVar.f819g = new Rect();
        }
        gVar.f828a.f819g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f2386c.c() : this.f2384b.a()) + i;
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
        int i = this.f2373O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2379U;
    }

    public int getBoxBackgroundMode() {
        return this.f2373O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2374P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = m.e(this);
        RectF rectF = this.f2383a0;
        return e2 ? this.f2370L.h.a(rectF) : this.f2370L.f862g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = m.e(this);
        RectF rectF = this.f2383a0;
        return e2 ? this.f2370L.f862g.a(rectF) : this.f2370L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = m.e(this);
        RectF rectF = this.f2383a0;
        return e2 ? this.f2370L.f860e.a(rectF) : this.f2370L.f861f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = m.e(this);
        RectF rectF = this.f2383a0;
        return e2 ? this.f2370L.f861f.a(rectF) : this.f2370L.f860e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2404m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2376R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2377S;
    }

    public int getCounterMaxLength() {
        return this.f2401l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0244c0 c0244c0;
        if (this.f2399k && this.f2403m && (c0244c0 = this.f2406o) != null) {
            return c0244c0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2427z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2425y;
    }

    public ColorStateList getCursorColor() {
        return this.f2358A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2360B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2396i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2386c.f965g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2386c.f965g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2386c.f969m;
    }

    public int getEndIconMode() {
        return this.f2386c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2386c.f970n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2386c.f965g;
    }

    public CharSequence getError() {
        t tVar = this.f2397j;
        if (tVar.f1002q) {
            return tVar.f1001p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2397j.f1005t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2397j.f1004s;
    }

    public int getErrorCurrentTextColors() {
        C0244c0 c0244c0 = this.f2397j.f1003r;
        if (c0244c0 != null) {
            return c0244c0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2386c.f962c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f2397j;
        if (tVar.f1009x) {
            return tVar.f1008w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0244c0 c0244c0 = this.f2397j.f1010y;
        if (c0244c0 != null) {
            return c0244c0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2362C) {
            return this.f2363D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2420v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f2420v0;
        return dVar.e(dVar.f475k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2398j0;
    }

    public C getLengthCounter() {
        return this.f2405n;
    }

    public int getMaxEms() {
        return this.f2393g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2391f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2386c.f965g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2386c.f965g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2413s) {
            return this.f2412r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2419v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2417u;
    }

    public CharSequence getPrefixText() {
        return this.f2384b.f1028c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2384b.f1027b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2384b.f1027b;
    }

    public k getShapeAppearanceModel() {
        return this.f2370L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2384b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2384b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2384b.f1031g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2384b.h;
    }

    public CharSequence getSuffixText() {
        return this.f2386c.f972p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2386c.f973q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2386c.f973q;
    }

    public Typeface getTypeface() {
        return this.f2385b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f2384b.a() : this.f2386c.c());
    }

    public final void i() {
        int i = this.f2373O;
        if (i == 0) {
            this.F = null;
            this.f2368J = null;
            this.f2369K = null;
        } else if (i == 1) {
            this.F = new g(this.f2370L);
            this.f2368J = new g();
            this.f2369K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2373O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2362C || (this.F instanceof P0.h)) {
                this.F = new g(this.f2370L);
            } else {
                k kVar = this.f2370L;
                int i2 = P0.h.f937y;
                if (kVar == null) {
                    kVar = new k();
                }
                P0.g gVar = new P0.g(kVar, new RectF());
                P0.h hVar = new P0.h(gVar);
                hVar.f938x = gVar;
                this.F = hVar;
            }
            this.f2368J = null;
            this.f2369K = null;
        }
        s();
        x();
        if (this.f2373O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2374P = getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (l.Q(getContext())) {
                this.f2374P = getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f2373O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = T.f633a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (l.Q(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = T.f633a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2373O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2373O;
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
            d dVar = this.f2420v0;
            boolean b2 = dVar.b(dVar.f437A);
            dVar.f439C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f461Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f461Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2383a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f461Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f439C) {
                        f5 = max + dVar.f461Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f439C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f461Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > RecyclerView.f1949A0 || rectF.height() <= RecyclerView.f1949A0) {
                }
                float f6 = rectF.left;
                float f7 = this.f2372N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2375Q);
                P0.h hVar = (P0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f461Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2383a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f461Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > RecyclerView.f1949A0) {
            }
        }
    }

    public final void l(C0244c0 c0244c0, int i) {
        try {
            c0244c0.setTextAppearance(i);
            if (c0244c0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0244c0.setTextAppearance(com.luckycounter.drinkwater.R.style.TextAppearance_AppCompat_Caption);
        c0244c0.setTextColor(b.a(getContext(), com.luckycounter.drinkwater.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f2397j;
        return (tVar.f1000o != 1 || tVar.f1003r == null || TextUtils.isEmpty(tVar.f1001p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0014g) this.f2405n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2403m;
        int i = this.f2401l;
        String str = null;
        if (i == -1) {
            this.f2406o.setText(String.valueOf(length));
            this.f2406o.setContentDescription(null);
            this.f2403m = false;
        } else {
            this.f2403m = length > i;
            Context context = getContext();
            this.f2406o.setContentDescription(context.getString(this.f2403m ? com.luckycounter.drinkwater.R.string.character_counter_overflowed_content_description : com.luckycounter.drinkwater.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2401l)));
            if (z2 != this.f2403m) {
                o();
            }
            String str2 = I.b.f574b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f576e : I.b.d;
            C0244c0 c0244c0 = this.f2406o;
            String string = getContext().getString(com.luckycounter.drinkwater.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2401l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.h hVar = I.i.f584a;
                str = bVar.c(string).toString();
            }
            c0244c0.setText(str);
        }
        if (this.d == null || z2 == this.f2403m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0244c0 c0244c0 = this.f2406o;
        if (c0244c0 != null) {
            l(c0244c0, this.f2403m ? this.f2408p : this.f2410q);
            if (!this.f2403m && (colorStateList2 = this.f2425y) != null) {
                this.f2406o.setTextColor(colorStateList2);
            }
            if (!this.f2403m || (colorStateList = this.f2427z) == null) {
                return;
            }
            this.f2406o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2420v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.f2386c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2361B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f2384b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new o(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = G0.e.f491a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2380V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = G0.e.f491a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            G0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = G0.e.f492b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2368J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f2376R, rect.right, i5);
            }
            g gVar2 = this.f2369K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f2377S, rect.right, i6);
            }
            if (this.f2362C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f2420v0;
                if (dVar.h != textSize) {
                    dVar.h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f473g != i7) {
                    dVar.f473g = i7;
                    dVar.h(false);
                }
                if (dVar.f471f != gravity) {
                    dVar.f471f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = m.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2381W;
                rect2.bottom = i8;
                int i9 = this.f2373O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f2374P;
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
                Rect rect3 = dVar.d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    dVar.f448M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f450O;
                textPaint.setTextSize(dVar.h);
                textPaint.setTypeface(dVar.f485u);
                textPaint.setLetterSpacing(dVar.f458W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2373O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2373O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f466c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f448M = true;
                }
                dVar.h(false);
                if (!e() || this.f2418u0) {
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
        boolean z2 = this.f2361B0;
        p pVar = this.f2386c;
        if (!z2) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2361B0 = true;
        }
        if (this.f2415t != null && (editText = this.d) != null) {
            this.f2415t.setGravity(editText.getGravity());
            this.f2415t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
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
        super.onRestoreInstanceState(d.f1067a);
        setError(d.f919c);
        if (d.d) {
            post(new A1.e(1, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2371M) {
            c cVar = this.f2370L.f860e;
            RectF rectF = this.f2383a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2370L.f861f.a(rectF);
            float a4 = this.f2370L.h.a(rectF);
            float a5 = this.f2370L.f862g.a(rectF);
            k kVar = this.f2370L;
            l lVar = kVar.f857a;
            l lVar2 = kVar.f858b;
            l lVar3 = kVar.d;
            l lVar4 = kVar.f859c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(lVar2);
            j.b(lVar);
            j.b(lVar4);
            j.b(lVar3);
            M0.a aVar = new M0.a(a3);
            M0.a aVar2 = new M0.a(a2);
            M0.a aVar3 = new M0.a(a5);
            M0.a aVar4 = new M0.a(a4);
            k kVar2 = new k();
            kVar2.f857a = lVar2;
            kVar2.f858b = lVar;
            kVar2.f859c = lVar3;
            kVar2.d = lVar4;
            kVar2.f860e = aVar;
            kVar2.f861f = aVar2;
            kVar2.f862g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f863j = eVar2;
            kVar2.f864k = eVar3;
            kVar2.f865l = eVar4;
            this.f2371M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        D d = new D(super.onSaveInstanceState());
        if (m()) {
            d.f919c = getError();
        }
        p pVar = this.f2386c;
        d.d = pVar.i != 0 && pVar.f965g.d;
        return d;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2358A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue b02 = F1.d.b0(context, com.luckycounter.drinkwater.R.attr.colorControlActivated);
            if (b02 != null) {
                int i = b02.resourceId;
                if (i != 0) {
                    colorStateList2 = F1.d.D(context, i);
                } else {
                    int i2 = b02.data;
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
            if ((m() || (this.f2406o != null && this.f2403m)) && (colorStateList = this.f2360B) != null) {
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
            y yVar = this.f2384b;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f2387c0 == null || this.f2388d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2387c0 = colorDrawable3;
                    this.f2388d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f2387c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    pVar = this.f2386c;
                    if ((!pVar.e() || ((pVar.i != 0 && pVar.d()) || pVar.f972p != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = pVar.f973q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.f962c;
                        } else if (pVar.i != 0 && pVar.d()) {
                            checkableImageButton = pVar.f965g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2392f0;
                        if (colorDrawable != null || this.f2394g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2392f0 = colorDrawable5;
                                this.f2394g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2392f0;
                            if (drawable == colorDrawable2) {
                                this.f2395h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2394g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2392f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2392f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2392f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2395h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2392f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                pVar = this.f2386c;
                if (pVar.e()) {
                }
                int measuredWidth22 = pVar.f973q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f2392f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2392f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f2387c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f2387c0 = null;
            z2 = true;
            pVar = this.f2386c;
            if (pVar.e()) {
            }
            int measuredWidth222 = pVar.f973q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f2392f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2392f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        pVar = this.f2386c;
        if (pVar.e()) {
        }
        int measuredWidth2222 = pVar.f973q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f2392f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2392f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0244c0 c0244c0;
        EditText editText = this.d;
        if (editText == null || this.f2373O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0266n0.f3474a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0279u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2403m && (c0244c0 = this.f2406o) != null) {
            mutate.setColorFilter(C0279u.c(c0244c0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        if ((this.f2367I || editText.getBackground() == null) && this.f2373O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = T.f633a;
            editText2.setBackground(editTextBoxBackground);
            this.f2367I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2379U != i) {
            this.f2379U = i;
            this.f2407o0 = i;
            this.f2411q0 = i;
            this.r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2407o0 = defaultColor;
        this.f2379U = defaultColor;
        this.f2409p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2411q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2373O) {
            return;
        }
        this.f2373O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2374P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f2370L.e();
        c cVar = this.f2370L.f860e;
        l u2 = F1.d.u(i);
        e2.f848a = u2;
        j.b(u2);
        e2.f851e = cVar;
        c cVar2 = this.f2370L.f861f;
        l u3 = F1.d.u(i);
        e2.f849b = u3;
        j.b(u3);
        e2.f852f = cVar2;
        c cVar3 = this.f2370L.h;
        l u4 = F1.d.u(i);
        e2.d = u4;
        j.b(u4);
        e2.h = cVar3;
        c cVar4 = this.f2370L.f862g;
        l u5 = F1.d.u(i);
        e2.f850c = u5;
        j.b(u5);
        e2.f853g = cVar4;
        this.f2370L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2404m0 != i) {
            this.f2404m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2400k0 = colorStateList.getDefaultColor();
            this.f2414s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2402l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2404m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2404m0 != colorStateList.getDefaultColor()) {
            this.f2404m0 = colorStateList.getDefaultColor();
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
        this.f2376R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2377S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2399k != z2) {
            t tVar = this.f2397j;
            if (z2) {
                C0244c0 c0244c0 = new C0244c0(getContext(), null);
                this.f2406o = c0244c0;
                c0244c0.setId(com.luckycounter.drinkwater.R.id.textinput_counter);
                Typeface typeface = this.f2385b0;
                if (typeface != null) {
                    this.f2406o.setTypeface(typeface);
                }
                this.f2406o.setMaxLines(1);
                tVar.a(this.f2406o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2406o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.luckycounter.drinkwater.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2406o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2406o, 2);
                this.f2406o = null;
            }
            this.f2399k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2401l != i) {
            if (i > 0) {
                this.f2401l = i;
            } else {
                this.f2401l = -1;
            }
            if (!this.f2399k || this.f2406o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2408p != i) {
            this.f2408p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2427z != colorStateList) {
            this.f2427z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2410q != i) {
            this.f2410q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2425y != colorStateList) {
            this.f2425y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2358A != colorStateList) {
            this.f2358A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2360B != colorStateList) {
            this.f2360B = colorStateList;
            if (m() || (this.f2406o != null && this.f2403m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2396i0 = colorStateList;
        this.f2398j0 = colorStateList;
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
        this.f2386c.f965g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2386c.f965g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f2386c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f965g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f2386c;
        Drawable k2 = i != 0 ? AbstractC0067d.k(pVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pVar.f965g;
        checkableImageButton.setImageDrawable(k2);
        if (k2 != null) {
            ColorStateList colorStateList = pVar.f967k;
            PorterDuff.Mode mode = pVar.f968l;
            TextInputLayout textInputLayout = pVar.f960a;
            F1.d.l(textInputLayout, checkableImageButton, colorStateList, mode);
            F1.d.Z(textInputLayout, checkableImageButton, pVar.f967k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f2386c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f969m) {
            pVar.f969m = i;
            CheckableImageButton checkableImageButton = pVar.f965g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f962c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2386c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2386c;
        View.OnLongClickListener onLongClickListener = pVar.f971o;
        CheckableImageButton checkableImageButton = pVar.f965g;
        checkableImageButton.setOnClickListener(onClickListener);
        F1.d.j0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2386c;
        pVar.f971o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f965g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        F1.d.j0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f2386c;
        pVar.f970n = scaleType;
        pVar.f965g.setScaleType(scaleType);
        pVar.f962c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2386c;
        if (pVar.f967k != colorStateList) {
            pVar.f967k = colorStateList;
            F1.d.l(pVar.f960a, pVar.f965g, colorStateList, pVar.f968l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2386c;
        if (pVar.f968l != mode) {
            pVar.f968l = mode;
            F1.d.l(pVar.f960a, pVar.f965g, pVar.f967k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2386c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f2397j;
        if (!tVar.f1002q) {
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
        tVar.f1001p = charSequence;
        tVar.f1003r.setText(charSequence);
        int i = tVar.f999n;
        if (i != 1) {
            tVar.f1000o = 1;
        }
        tVar.i(i, tVar.f1000o, tVar.h(tVar.f1003r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f2397j;
        tVar.f1005t = i;
        C0244c0 c0244c0 = tVar.f1003r;
        if (c0244c0 != null) {
            WeakHashMap weakHashMap = T.f633a;
            c0244c0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f2397j;
        tVar.f1004s = charSequence;
        C0244c0 c0244c0 = tVar.f1003r;
        if (c0244c0 != null) {
            c0244c0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        t tVar = this.f2397j;
        if (tVar.f1002q == z2) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.h;
        if (z2) {
            C0244c0 c0244c0 = new C0244c0(tVar.f994g, null);
            tVar.f1003r = c0244c0;
            c0244c0.setId(com.luckycounter.drinkwater.R.id.textinput_error);
            tVar.f1003r.setTextAlignment(5);
            Typeface typeface = tVar.f988B;
            if (typeface != null) {
                tVar.f1003r.setTypeface(typeface);
            }
            int i = tVar.f1006u;
            tVar.f1006u = i;
            C0244c0 c0244c02 = tVar.f1003r;
            if (c0244c02 != null) {
                textInputLayout.l(c0244c02, i);
            }
            ColorStateList colorStateList = tVar.f1007v;
            tVar.f1007v = colorStateList;
            C0244c0 c0244c03 = tVar.f1003r;
            if (c0244c03 != null && colorStateList != null) {
                c0244c03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f1004s;
            tVar.f1004s = charSequence;
            C0244c0 c0244c04 = tVar.f1003r;
            if (c0244c04 != null) {
                c0244c04.setContentDescription(charSequence);
            }
            int i2 = tVar.f1005t;
            tVar.f1005t = i2;
            C0244c0 c0244c05 = tVar.f1003r;
            if (c0244c05 != null) {
                WeakHashMap weakHashMap = T.f633a;
                c0244c05.setAccessibilityLiveRegion(i2);
            }
            tVar.f1003r.setVisibility(4);
            tVar.a(tVar.f1003r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f1003r, 0);
            tVar.f1003r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1002q = z2;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f2386c;
        pVar.i(i != 0 ? AbstractC0067d.k(pVar.getContext(), i) : null);
        F1.d.Z(pVar.f960a, pVar.f962c, pVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2386c;
        CheckableImageButton checkableImageButton = pVar.f962c;
        View.OnLongClickListener onLongClickListener = pVar.f964f;
        checkableImageButton.setOnClickListener(onClickListener);
        F1.d.j0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2386c;
        pVar.f964f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f962c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        F1.d.j0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2386c;
        if (pVar.d != colorStateList) {
            pVar.d = colorStateList;
            F1.d.l(pVar.f960a, pVar.f962c, colorStateList, pVar.f963e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2386c;
        if (pVar.f963e != mode) {
            pVar.f963e = mode;
            F1.d.l(pVar.f960a, pVar.f962c, pVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f2397j;
        tVar.f1006u = i;
        C0244c0 c0244c0 = tVar.f1003r;
        if (c0244c0 != null) {
            tVar.h.l(c0244c0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f2397j;
        tVar.f1007v = colorStateList;
        C0244c0 c0244c0 = tVar.f1003r;
        if (c0244c0 == null || colorStateList == null) {
            return;
        }
        c0244c0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2422w0 != z2) {
            this.f2422w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f2397j;
        if (isEmpty) {
            if (tVar.f1009x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f1009x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f1008w = charSequence;
        tVar.f1010y.setText(charSequence);
        int i = tVar.f999n;
        if (i != 2) {
            tVar.f1000o = 2;
        }
        tVar.i(i, tVar.f1000o, tVar.h(tVar.f1010y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f2397j;
        tVar.f987A = colorStateList;
        C0244c0 c0244c0 = tVar.f1010y;
        if (c0244c0 == null || colorStateList == null) {
            return;
        }
        c0244c0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        t tVar = this.f2397j;
        if (tVar.f1009x == z2) {
            return;
        }
        tVar.c();
        if (z2) {
            C0244c0 c0244c0 = new C0244c0(tVar.f994g, null);
            tVar.f1010y = c0244c0;
            c0244c0.setId(com.luckycounter.drinkwater.R.id.textinput_helper_text);
            tVar.f1010y.setTextAlignment(5);
            Typeface typeface = tVar.f988B;
            if (typeface != null) {
                tVar.f1010y.setTypeface(typeface);
            }
            tVar.f1010y.setVisibility(4);
            tVar.f1010y.setAccessibilityLiveRegion(1);
            int i = tVar.f1011z;
            tVar.f1011z = i;
            C0244c0 c0244c02 = tVar.f1010y;
            if (c0244c02 != null) {
                c0244c02.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f987A;
            tVar.f987A = colorStateList;
            C0244c0 c0244c03 = tVar.f1010y;
            if (c0244c03 != null && colorStateList != null) {
                c0244c03.setTextColor(colorStateList);
            }
            tVar.a(tVar.f1010y, 1);
            tVar.f1010y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.f999n;
            if (i2 == 2) {
                tVar.f1000o = 0;
            }
            tVar.i(i2, tVar.f1000o, tVar.h(tVar.f1010y, ""));
            tVar.g(tVar.f1010y, 1);
            tVar.f1010y = null;
            TextInputLayout textInputLayout = tVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1009x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f2397j;
        tVar.f1011z = i;
        C0244c0 c0244c0 = tVar.f1010y;
        if (c0244c0 != null) {
            c0244c0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2362C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2424x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2362C) {
            this.f2362C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2363D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f2364E = true;
            } else {
                this.f2364E = false;
                if (!TextUtils.isEmpty(this.f2363D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f2363D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f2420v0;
        TextInputLayout textInputLayout = dVar.f462a;
        J0.d dVar2 = new J0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f605j;
        if (colorStateList != null) {
            dVar.f475k = colorStateList;
        }
        float f2 = dVar2.f606k;
        if (f2 != RecyclerView.f1949A0) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f599a;
        if (colorStateList2 != null) {
            dVar.f456U = colorStateList2;
        }
        dVar.f454S = dVar2.f602e;
        dVar.f455T = dVar2.f603f;
        dVar.f453R = dVar2.f604g;
        dVar.f457V = dVar2.i;
        J0.a aVar = dVar.f489y;
        if (aVar != null) {
            aVar.f595c = true;
        }
        A1.d dVar3 = new A1.d(3, dVar);
        dVar2.a();
        dVar.f489y = new J0.a(dVar3, dVar2.f609n);
        dVar2.c(textInputLayout.getContext(), dVar.f489y);
        dVar.h(false);
        this.f2398j0 = dVar.f475k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2398j0 != colorStateList) {
            if (this.f2396i0 == null) {
                d dVar = this.f2420v0;
                if (dVar.f475k != colorStateList) {
                    dVar.f475k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f2398j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(C c2) {
        this.f2405n = c2;
    }

    public void setMaxEms(int i) {
        this.f2393g = i;
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
        this.f2391f = i;
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
        p pVar = this.f2386c;
        pVar.f965g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f2386c;
        pVar.f965g.setImageDrawable(i != 0 ? AbstractC0067d.k(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p pVar = this.f2386c;
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
        p pVar = this.f2386c;
        pVar.f967k = colorStateList;
        F1.d.l(pVar.f960a, pVar.f965g, colorStateList, pVar.f968l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2386c;
        pVar.f968l = mode;
        F1.d.l(pVar.f960a, pVar.f965g, pVar.f967k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2415t == null) {
            C0244c0 c0244c0 = new C0244c0(getContext(), null);
            this.f2415t = c0244c0;
            c0244c0.setId(com.luckycounter.drinkwater.R.id.textinput_placeholder);
            this.f2415t.setImportantForAccessibility(2);
            h d = d();
            this.f2421w = d;
            d.f3670b = 67L;
            this.f2423x = d();
            setPlaceholderTextAppearance(this.f2419v);
            setPlaceholderTextColor(this.f2417u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2413s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2412r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2419v = i;
        C0244c0 c0244c0 = this.f2415t;
        if (c0244c0 != null) {
            c0244c0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2417u != colorStateList) {
            this.f2417u = colorStateList;
            C0244c0 c0244c0 = this.f2415t;
            if (c0244c0 == null || colorStateList == null) {
                return;
            }
            c0244c0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f2384b;
        yVar.getClass();
        yVar.f1028c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f1027b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2384b.f1027b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2384b.f1027b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f828a.f814a == kVar) {
            return;
        }
        this.f2370L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2384b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2384b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0067d.k(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f2384b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f1031g) {
            yVar.f1031g = i;
            CheckableImageButton checkableImageButton = yVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f2384b;
        View.OnLongClickListener onLongClickListener = yVar.i;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        F1.d.j0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f2384b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        F1.d.j0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f2384b;
        yVar.h = scaleType;
        yVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f2384b;
        if (yVar.f1029e != colorStateList) {
            yVar.f1029e = colorStateList;
            F1.d.l(yVar.f1026a, yVar.d, colorStateList, yVar.f1030f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f2384b;
        if (yVar.f1030f != mode) {
            yVar.f1030f = mode;
            F1.d.l(yVar.f1026a, yVar.d, yVar.f1029e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2384b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f2386c;
        pVar.getClass();
        pVar.f972p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f973q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2386c.f973q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2386c.f973q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(B b2) {
        EditText editText = this.d;
        if (editText != null) {
            T.l(editText, b2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2385b0) {
            this.f2385b0 = typeface;
            this.f2420v0.m(typeface);
            t tVar = this.f2397j;
            if (typeface != tVar.f988B) {
                tVar.f988B = typeface;
                C0244c0 c0244c0 = tVar.f1003r;
                if (c0244c0 != null) {
                    c0244c0.setTypeface(typeface);
                }
                C0244c0 c0244c02 = tVar.f1010y;
                if (c0244c02 != null) {
                    c0244c02.setTypeface(typeface);
                }
            }
            C0244c0 c0244c03 = this.f2406o;
            if (c0244c03 != null) {
                c0244c03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2373O != 1) {
            FrameLayout frameLayout = this.f2382a;
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
        C0244c0 c0244c0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2396i0;
        d dVar = this.f2420v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2396i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f2414s0) : this.f2414s0));
        } else if (m()) {
            C0244c0 c0244c02 = this.f2397j.f1003r;
            dVar.i(c0244c02 != null ? c0244c02.getTextColors() : null);
        } else if (this.f2403m && (c0244c0 = this.f2406o) != null) {
            dVar.i(c0244c0.getTextColors());
        } else if (z5 && (colorStateList = this.f2398j0) != null && dVar.f475k != colorStateList) {
            dVar.f475k = colorStateList;
            dVar.h(false);
        }
        p pVar = this.f2386c;
        y yVar = this.f2384b;
        if (z4 || !this.f2422w0 || (isEnabled() && z5)) {
            if (z3 || this.f2418u0) {
                ValueAnimator valueAnimator = this.f2426y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2426y0.cancel();
                }
                if (z2 && this.f2424x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f2418u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f1032j = false;
                yVar.e();
                pVar.f974r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2418u0) {
            ValueAnimator valueAnimator2 = this.f2426y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2426y0.cancel();
            }
            if (z2 && this.f2424x0) {
                a(RecyclerView.f1949A0);
            } else {
                dVar.k(RecyclerView.f1949A0);
            }
            if (e() && !((P0.h) this.F).f938x.f936q.isEmpty() && e()) {
                ((P0.h) this.F).n(RecyclerView.f1949A0, RecyclerView.f1949A0, RecyclerView.f1949A0, RecyclerView.f1949A0);
            }
            this.f2418u0 = true;
            C0244c0 c0244c03 = this.f2415t;
            if (c0244c03 != null && this.f2413s) {
                c0244c03.setText((CharSequence) null);
                q.a(this.f2382a, this.f2423x);
                this.f2415t.setVisibility(4);
            }
            yVar.f1032j = true;
            yVar.e();
            pVar.f974r = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0014g) this.f2405n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2382a;
        if (length != 0 || this.f2418u0) {
            C0244c0 c0244c0 = this.f2415t;
            if (c0244c0 == null || !this.f2413s) {
                return;
            }
            c0244c0.setText((CharSequence) null);
            q.a(frameLayout, this.f2423x);
            this.f2415t.setVisibility(4);
            return;
        }
        if (this.f2415t == null || !this.f2413s || TextUtils.isEmpty(this.f2412r)) {
            return;
        }
        this.f2415t.setText(this.f2412r);
        q.a(frameLayout, this.f2421w);
        this.f2415t.setVisibility(0);
        this.f2415t.bringToFront();
        announceForAccessibility(this.f2412r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.n0.getDefaultColor();
        int colorForState = this.n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2378T = colorForState2;
        } else if (z3) {
            this.f2378T = colorForState;
        } else {
            this.f2378T = defaultColor;
        }
    }

    public final void x() {
        C0244c0 c0244c0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f2373O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2378T = this.f2414s0;
        } else if (m()) {
            if (this.n0 != null) {
                w(z3, z2);
            } else {
                this.f2378T = getErrorCurrentTextColors();
            }
        } else if (!this.f2403m || (c0244c0 = this.f2406o) == null) {
            if (z3) {
                this.f2378T = this.f2404m0;
            } else if (z2) {
                this.f2378T = this.f2402l0;
            } else {
                this.f2378T = this.f2400k0;
            }
        } else if (this.n0 != null) {
            w(z3, z2);
        } else {
            this.f2378T = c0244c0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f2386c;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f962c;
        ColorStateList colorStateList = pVar.d;
        TextInputLayout textInputLayout = pVar.f960a;
        F1.d.Z(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f967k;
        CheckableImageButton checkableImageButton2 = pVar.f965g;
        F1.d.Z(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof P0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                F1.d.l(textInputLayout, checkableImageButton2, pVar.f967k, pVar.f968l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.f2384b;
        F1.d.Z(yVar.f1026a, yVar.d, yVar.f1029e);
        if (this.f2373O == 2) {
            int i = this.f2375Q;
            if (z3 && isEnabled()) {
                this.f2375Q = this.f2377S;
            } else {
                this.f2375Q = this.f2376R;
            }
            if (this.f2375Q != i && e() && !this.f2418u0) {
                if (e()) {
                    ((P0.h) this.F).n(RecyclerView.f1949A0, RecyclerView.f1949A0, RecyclerView.f1949A0, RecyclerView.f1949A0);
                }
                j();
            }
        }
        if (this.f2373O == 1) {
            if (!isEnabled()) {
                this.f2379U = this.f2409p0;
            } else if (z2 && !z3) {
                this.f2379U = this.r0;
            } else if (z3) {
                this.f2379U = this.f2411q0;
            } else {
                this.f2379U = this.f2407o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2384b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2386c.f965g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2386c.f965g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2386c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2386c.f965g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f2386c;
        CheckableImageButton checkableImageButton = pVar.f965g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f967k;
            PorterDuff.Mode mode = pVar.f968l;
            TextInputLayout textInputLayout = pVar.f960a;
            F1.d.l(textInputLayout, checkableImageButton, colorStateList, mode);
            F1.d.Z(textInputLayout, checkableImageButton, pVar.f967k);
        }
    }
}
