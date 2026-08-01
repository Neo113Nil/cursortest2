package com.google.android.material.textfield;

import A.b;
import D0.d;
import D0.n;
import D0.p;
import J0.c;
import J0.e;
import J0.f;
import J0.g;
import J0.i;
import J0.j;
import J0.k;
import K.C0006g;
import K.C0011l;
import K.I;
import K.S;
import M0.A;
import M0.B;
import M0.C;
import M0.D;
import M0.E;
import M0.F;
import M0.q;
import M0.t;
import M0.u;
import M0.x;
import M0.z;
import O0.a;
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
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k0.h;
import l.AbstractC0239n0;
import l.C0219d0;
import l.C0254v;
import p0.AbstractC0279a;
import q0.AbstractC0288a;
import q1.l;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f1766C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f1767A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f1768A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f1769B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f1770B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1771C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f1772D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1773E;
    public g F;

    /* renamed from: G, reason: collision with root package name */
    public g f1774G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f1775H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f1776I;

    /* renamed from: J, reason: collision with root package name */
    public g f1777J;

    /* renamed from: K, reason: collision with root package name */
    public g f1778K;

    /* renamed from: L, reason: collision with root package name */
    public k f1779L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1780M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1781N;

    /* renamed from: O, reason: collision with root package name */
    public int f1782O;

    /* renamed from: P, reason: collision with root package name */
    public int f1783P;

    /* renamed from: Q, reason: collision with root package name */
    public int f1784Q;

    /* renamed from: R, reason: collision with root package name */
    public int f1785R;

    /* renamed from: S, reason: collision with root package name */
    public int f1786S;

    /* renamed from: T, reason: collision with root package name */
    public int f1787T;

    /* renamed from: U, reason: collision with root package name */
    public int f1788U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f1789V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f1790W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1791a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f1792a0;

    /* renamed from: b, reason: collision with root package name */
    public final z f1793b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f1794b0;

    /* renamed from: c, reason: collision with root package name */
    public final q f1795c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f1796c0;
    public EditText d;

    /* renamed from: d0, reason: collision with root package name */
    public int f1797d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1798e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f1799e0;

    /* renamed from: f, reason: collision with root package name */
    public int f1800f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f1801f0;

    /* renamed from: g, reason: collision with root package name */
    public int f1802g;

    /* renamed from: g0, reason: collision with root package name */
    public int f1803g0;
    public int h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f1804h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f1805i0;

    /* renamed from: j, reason: collision with root package name */
    public final u f1806j;
    public ColorStateList j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1807k;

    /* renamed from: k0, reason: collision with root package name */
    public int f1808k0;

    /* renamed from: l, reason: collision with root package name */
    public int f1809l;

    /* renamed from: l0, reason: collision with root package name */
    public int f1810l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1811m;

    /* renamed from: m0, reason: collision with root package name */
    public int f1812m0;

    /* renamed from: n, reason: collision with root package name */
    public E f1813n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f1814n0;

    /* renamed from: o, reason: collision with root package name */
    public C0219d0 f1815o;

    /* renamed from: o0, reason: collision with root package name */
    public int f1816o0;

    /* renamed from: p, reason: collision with root package name */
    public int f1817p;

    /* renamed from: p0, reason: collision with root package name */
    public int f1818p0;

    /* renamed from: q, reason: collision with root package name */
    public int f1819q;

    /* renamed from: q0, reason: collision with root package name */
    public int f1820q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f1821r;

    /* renamed from: r0, reason: collision with root package name */
    public int f1822r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1823s;

    /* renamed from: s0, reason: collision with root package name */
    public int f1824s0;

    /* renamed from: t, reason: collision with root package name */
    public C0219d0 f1825t;

    /* renamed from: t0, reason: collision with root package name */
    public int f1826t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f1827u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1828u0;

    /* renamed from: v, reason: collision with root package name */
    public int f1829v;

    /* renamed from: v0, reason: collision with root package name */
    public final d f1830v0;

    /* renamed from: w, reason: collision with root package name */
    public h f1831w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1832w0;

    /* renamed from: x, reason: collision with root package name */
    public h f1833x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f1834x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f1835y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f1836y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1837z;
    public boolean z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.fortuneodd.shadegrid.R.attr.textInputStyle, com.fortuneodd.shadegrid.R.style.Widget_Design_TextInputLayout), attributeSet, com.fortuneodd.shadegrid.R.attr.textInputStyle);
        this.f1800f = -1;
        this.f1802g = -1;
        this.h = -1;
        this.i = -1;
        this.f1806j = new u(this);
        this.f1813n = new C0006g(2);
        this.f1789V = new Rect();
        this.f1790W = new Rect();
        this.f1792a0 = new RectF();
        this.f1799e0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f1830v0 = dVar;
        this.f1770B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f1791a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0288a.f3550a;
        dVar.f98Q = linearInterpolator;
        dVar.h(false);
        dVar.f97P = linearInterpolator;
        dVar.h(false);
        if (dVar.f119g != 8388659) {
            dVar.f119g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC0279a.f3377A;
        n.a(context2, attributeSet, com.fortuneodd.shadegrid.R.attr.textInputStyle, com.fortuneodd.shadegrid.R.style.Widget_Design_TextInputLayout);
        n.b(context2, attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.textInputStyle, com.fortuneodd.shadegrid.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.fortuneodd.shadegrid.R.attr.textInputStyle, com.fortuneodd.shadegrid.R.style.Widget_Design_TextInputLayout);
        C0011l c0011l = new C0011l(context2, obtainStyledAttributes);
        z zVar = new z(this, c0011l);
        this.f1793b = zVar;
        this.f1771C = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f1834x0 = obtainStyledAttributes.getBoolean(47, true);
        this.f1832w0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f1779L = k.b(context2, attributeSet, com.fortuneodd.shadegrid.R.attr.textInputStyle, com.fortuneodd.shadegrid.R.style.Widget_Design_TextInputLayout).a();
        this.f1781N = context2.getResources().getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f1783P = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f1785R = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f1786S = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f1784Q = this.f1785R;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e2 = this.f1779L.e();
        if (dimension >= 0.0f) {
            e2.f303e = new J0.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e2.f304f = new J0.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e2.f305g = new J0.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e2.h = new J0.a(dimension4);
        }
        this.f1779L = e2.a();
        ColorStateList q2 = q1.d.q(context2, c0011l, 7);
        if (q2 != null) {
            int defaultColor = q2.getDefaultColor();
            this.f1816o0 = defaultColor;
            this.f1788U = defaultColor;
            if (q2.isStateful()) {
                this.f1818p0 = q2.getColorForState(new int[]{-16842910}, -1);
                this.f1820q0 = q2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f1822r0 = q2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f1820q0 = this.f1816o0;
                ColorStateList p2 = q1.d.p(context2, com.fortuneodd.shadegrid.R.color.mtrl_filled_background_color);
                this.f1818p0 = p2.getColorForState(new int[]{-16842910}, -1);
                this.f1822r0 = p2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f1788U = 0;
            this.f1816o0 = 0;
            this.f1818p0 = 0;
            this.f1820q0 = 0;
            this.f1822r0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList g2 = c0011l.g(1);
            this.j0 = g2;
            this.f1805i0 = g2;
        }
        ColorStateList q3 = q1.d.q(context2, c0011l, 14);
        this.f1812m0 = obtainStyledAttributes.getColor(14, 0);
        this.f1808k0 = b.a(context2, com.fortuneodd.shadegrid.R.color.mtrl_textinput_default_box_stroke_color);
        this.f1824s0 = b.a(context2, com.fortuneodd.shadegrid.R.color.mtrl_textinput_disabled_color);
        this.f1810l0 = b.a(context2, com.fortuneodd.shadegrid.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (q3 != null) {
            setBoxStrokeColorStateList(q3);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(q1.d.q(context2, c0011l, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f1767A = c0011l.g(24);
        this.f1769B = c0011l.g(25);
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
        this.f1819q = obtainStyledAttributes.getResourceId(22, 0);
        this.f1817p = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f1817p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f1819q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0011l.g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0011l.g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0011l.g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0011l.g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0011l.g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0011l.g(58));
        }
        q qVar = new q(this, c0011l);
        this.f1795c = qVar;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0011l.t();
        setImportantForAccessibility(2);
        I.m(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(qVar);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || l.S(editText)) {
            return this.F;
        }
        int k2 = i1.k.k(this.d, com.fortuneodd.shadegrid.R.attr.colorControlHighlight);
        int i = this.f1782O;
        int[][] iArr = f1766C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.F;
            int i2 = this.f1788U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{i1.k.p(k2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.F;
        TypedValue o02 = l.o0(context, com.fortuneodd.shadegrid.R.attr.colorSurface, "TextInputLayout");
        int i3 = o02.resourceId;
        int a2 = i3 != 0 ? b.a(context, i3) : o02.data;
        g gVar3 = new g(gVar2.f280a.f266a);
        int p2 = i1.k.p(k2, a2, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{p2, 0}));
        gVar3.setTint(a2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{p2, a2});
        g gVar4 = new g(gVar2.f280a.f266a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f1775H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f1775H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f1775H.addState(new int[0], f(false));
        }
        return this.f1775H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f1774G == null) {
            this.f1774G = f(true);
        }
        return this.f1774G;
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
        int i = this.f1800f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.f1802g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f1776I = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.d.getTypeface();
        d dVar = this.f1830v0;
        dVar.m(typeface);
        float textSize = this.d.getTextSize();
        if (dVar.h != textSize) {
            dVar.h = textSize;
            dVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.d.getLetterSpacing();
        if (dVar.f104W != letterSpacing) {
            dVar.f104W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (dVar.f119g != i4) {
            dVar.f119g = i4;
            dVar.h(false);
        }
        if (dVar.f117f != gravity) {
            dVar.f117f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = S.f360a;
        this.f1826t0 = editText.getMinimumHeight();
        this.d.addTextChangedListener(new A(this, editText));
        if (this.f1805i0 == null) {
            this.f1805i0 = this.d.getHintTextColors();
        }
        if (this.f1771C) {
            if (TextUtils.isEmpty(this.f1772D)) {
                CharSequence hint = this.d.getHint();
                this.f1798e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.f1773E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f1815o != null) {
            n(this.d.getText());
        }
        r();
        this.f1806j.b();
        this.f1793b.bringToFront();
        q qVar = this.f1795c;
        qVar.bringToFront();
        Iterator it = this.f1799e0.iterator();
        while (it.hasNext()) {
            ((M0.n) it.next()).a(this);
        }
        qVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f1772D)) {
            return;
        }
        this.f1772D = charSequence;
        d dVar = this.f1830v0;
        if (charSequence == null || !TextUtils.equals(dVar.f83A, charSequence)) {
            dVar.f83A = charSequence;
            dVar.f84B = null;
            Bitmap bitmap = dVar.f87E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f87E = null;
            }
            dVar.h(false);
        }
        if (this.f1828u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f1823s == z2) {
            return;
        }
        if (z2) {
            C0219d0 c0219d0 = this.f1825t;
            if (c0219d0 != null) {
                this.f1791a.addView(c0219d0);
                this.f1825t.setVisibility(0);
            }
        } else {
            C0219d0 c0219d02 = this.f1825t;
            if (c0219d02 != null) {
                c0219d02.setVisibility(8);
            }
            this.f1825t = null;
        }
        this.f1823s = z2;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f1830v0;
        if (dVar.f110b == f2) {
            return;
        }
        if (this.f1836y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1836y0 = valueAnimator;
            valueAnimator.setInterpolator(l.n0(getContext(), com.fortuneodd.shadegrid.R.attr.motionEasingEmphasizedInterpolator, AbstractC0288a.f3551b));
            this.f1836y0.setDuration(l.m0(getContext(), com.fortuneodd.shadegrid.R.attr.motionDurationMedium4, 167));
            this.f1836y0.addUpdateListener(new C(i, this));
        }
        this.f1836y0.setFloatValues(dVar.f110b, f2);
        this.f1836y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f1791a;
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
        k kVar = gVar.f280a.f266a;
        k kVar2 = this.f1779L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f1782O == 2 && (i = this.f1784Q) > -1 && (i2 = this.f1787T) != 0) {
            g gVar2 = this.F;
            gVar2.f280a.f272j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f280a;
            if (fVar.d != valueOf) {
                fVar.d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f1788U;
        if (this.f1782O == 1) {
            i3 = C.a.b(this.f1788U, i1.k.j(getContext(), com.fortuneodd.shadegrid.R.attr.colorSurface, 0));
        }
        this.f1788U = i3;
        this.F.j(ColorStateList.valueOf(i3));
        g gVar3 = this.f1777J;
        if (gVar3 != null && this.f1778K != null) {
            if (this.f1784Q > -1 && this.f1787T != 0) {
                gVar3.j(this.d.isFocused() ? ColorStateList.valueOf(this.f1808k0) : ColorStateList.valueOf(this.f1787T));
                this.f1778K.j(ColorStateList.valueOf(this.f1787T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d;
        if (!this.f1771C) {
            return 0;
        }
        int i = this.f1782O;
        d dVar = this.f1830v0;
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
        hVar.f2814c = l.m0(getContext(), com.fortuneodd.shadegrid.R.attr.motionDurationShort2, 87);
        hVar.d = l.n0(getContext(), com.fortuneodd.shadegrid.R.attr.motionEasingLinearInterpolator, AbstractC0288a.f3550a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f1798e != null) {
            boolean z2 = this.f1773E;
            this.f1773E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f1798e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.f1773E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1791a;
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
        this.f1768A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1768A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f1771C;
        d dVar = this.f1830v0;
        if (z2) {
            dVar.getClass();
            int save = canvas.save();
            if (dVar.f84B != null) {
                RectF rectF = dVar.f115e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = dVar.f95N;
                    textPaint.setTextSize(dVar.f88G);
                    float f2 = dVar.f126p;
                    float f3 = dVar.f127q;
                    float f4 = dVar.F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (dVar.f114d0 <= 1 || dVar.f85C) {
                        canvas.translate(f2, f3);
                        dVar.f106Y.draw(canvas);
                    } else {
                        float lineStart = dVar.f126p - dVar.f106Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (dVar.f111b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = dVar.f89H;
                            float f7 = dVar.f90I;
                            float f8 = dVar.f91J;
                            int i3 = dVar.f92K;
                            textPaint.setShadowLayer(f6, f7, f8, C.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        dVar.f106Y.draw(canvas);
                        textPaint.setAlpha((int) (dVar.f109a0 * f5));
                        if (i2 >= 31) {
                            float f9 = dVar.f89H;
                            float f10 = dVar.f90I;
                            float f11 = dVar.f91J;
                            int i4 = dVar.f92K;
                            textPaint.setShadowLayer(f9, f10, f11, C.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = dVar.f106Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f113c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(dVar.f89H, dVar.f90I, dVar.f91J, dVar.f92K);
                        }
                        String trim = dVar.f113c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(dVar.f106Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f1778K == null || (gVar = this.f1777J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.f1778K.getBounds();
            Rect bounds2 = this.f1777J.getBounds();
            float f13 = dVar.f110b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0288a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0288a.c(centerX, bounds2.right, f13);
            this.f1778K.draw(canvas);
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
        if (this.z0) {
            return;
        }
        this.z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f1830v0;
        if (dVar != null) {
            dVar.f93L = drawableState;
            ColorStateList colorStateList2 = dVar.f121k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f120j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z2 = true;
                if (this.d != null) {
                    WeakHashMap weakHashMap = S.f360a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.z0 = false;
            }
        }
        z2 = false;
        if (this.d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.z0 = false;
    }

    public final boolean e() {
        return this.f1771C && !TextUtils.isEmpty(this.f1772D) && (this.F instanceof M0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof x ? ((x) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        J0.a aVar = new J0.a(f2);
        J0.a aVar2 = new J0.a(f2);
        J0.a aVar3 = new J0.a(dimensionPixelOffset);
        J0.a aVar4 = new J0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f309a = iVar;
        kVar.f310b = iVar2;
        kVar.f311c = iVar3;
        kVar.d = iVar4;
        kVar.f312e = aVar;
        kVar.f313f = aVar2;
        kVar.f314g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f315j = eVar2;
        kVar.f316k = eVar3;
        kVar.f317l = eVar4;
        EditText editText2 = this.d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof x ? ((x) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f279w;
            TypedValue o02 = l.o0(context, com.fortuneodd.shadegrid.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = o02.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? b.a(context, i2) : o02.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f280a;
        if (fVar.f271g == null) {
            fVar.f271g = new Rect();
        }
        gVar.f280a.f271g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.f1795c.c() : this.f1793b.a()) + i;
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
        int i = this.f1782O;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f1788U;
    }

    public int getBoxBackgroundMode() {
        return this.f1782O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f1783P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1792a0;
        return e2 ? this.f1779L.h.a(rectF) : this.f1779L.f314g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1792a0;
        return e2 ? this.f1779L.f314g.a(rectF) : this.f1779L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1792a0;
        return e2 ? this.f1779L.f312e.a(rectF) : this.f1779L.f313f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e2 = n.e(this);
        RectF rectF = this.f1792a0;
        return e2 ? this.f1779L.f313f.a(rectF) : this.f1779L.f312e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f1812m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f1814n0;
    }

    public int getBoxStrokeWidth() {
        return this.f1785R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f1786S;
    }

    public int getCounterMaxLength() {
        return this.f1809l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0219d0 c0219d0;
        if (this.f1807k && this.f1811m && (c0219d0 = this.f1815o) != null) {
            return c0219d0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f1837z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f1835y;
    }

    public ColorStateList getCursorColor() {
        return this.f1767A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f1769B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f1805i0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f1795c.f547g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f1795c.f547g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f1795c.f551m;
    }

    public int getEndIconMode() {
        return this.f1795c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f1795c.f552n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f1795c.f547g;
    }

    public CharSequence getError() {
        u uVar = this.f1806j;
        if (uVar.f584q) {
            return uVar.f583p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f1806j.f587t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f1806j.f586s;
    }

    public int getErrorCurrentTextColors() {
        C0219d0 c0219d0 = this.f1806j.f585r;
        if (c0219d0 != null) {
            return c0219d0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f1795c.f544c.getDrawable();
    }

    public CharSequence getHelperText() {
        u uVar = this.f1806j;
        if (uVar.f591x) {
            return uVar.f590w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0219d0 c0219d0 = this.f1806j.f592y;
        if (c0219d0 != null) {
            return c0219d0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f1771C) {
            return this.f1772D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f1830v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f1830v0;
        return dVar.e(dVar.f121k);
    }

    public ColorStateList getHintTextColor() {
        return this.j0;
    }

    public E getLengthCounter() {
        return this.f1813n;
    }

    public int getMaxEms() {
        return this.f1802g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f1800f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1795c.f547g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1795c.f547g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f1823s) {
            return this.f1821r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f1829v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f1827u;
    }

    public CharSequence getPrefixText() {
        return this.f1793b.f610c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1793b.f609b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1793b.f609b;
    }

    public k getShapeAppearanceModel() {
        return this.f1779L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1793b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1793b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1793b.f613g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1793b.h;
    }

    public CharSequence getSuffixText() {
        return this.f1795c.f554p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f1795c.f555q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f1795c.f555q;
    }

    public Typeface getTypeface() {
        return this.f1794b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.f1793b.a() : this.f1795c.c());
    }

    public final void i() {
        int i = this.f1782O;
        if (i == 0) {
            this.F = null;
            this.f1777J = null;
            this.f1778K = null;
        } else if (i == 1) {
            this.F = new g(this.f1779L);
            this.f1777J = new g();
            this.f1778K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f1782O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f1771C || (this.F instanceof M0.h)) {
                this.F = new g(this.f1779L);
            } else {
                k kVar = this.f1779L;
                int i2 = M0.h.f518y;
                if (kVar == null) {
                    kVar = new k();
                }
                M0.g gVar = new M0.g(kVar, new RectF());
                M0.h hVar = new M0.h(gVar);
                hVar.f519x = gVar;
                this.F = hVar;
            }
            this.f1777J = null;
            this.f1778K = null;
        }
        s();
        x();
        if (this.f1782O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f1783P = getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (q1.d.C(getContext())) {
                this.f1783P = getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f1782O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = S.f360a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (q1.d.C(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = S.f360a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f1782O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f1782O;
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
            d dVar = this.f1830v0;
            boolean b2 = dVar.b(dVar.f83A);
            dVar.f85C = b2;
            Rect rect = dVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = dVar.f107Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = dVar.f107Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f1792a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (dVar.f107Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f85C) {
                        f5 = max + dVar.f107Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (dVar.f85C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = dVar.f107Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f1781N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f1784Q);
                M0.h hVar = (M0.h) this.F;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = dVar.f107Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f1792a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (dVar.f107Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(C0219d0 c0219d0, int i) {
        try {
            c0219d0.setTextAppearance(i);
            if (c0219d0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0219d0.setTextAppearance(com.fortuneodd.shadegrid.R.style.TextAppearance_AppCompat_Caption);
        c0219d0.setTextColor(b.a(getContext(), com.fortuneodd.shadegrid.R.color.design_error));
    }

    public final boolean m() {
        u uVar = this.f1806j;
        return (uVar.f582o != 1 || uVar.f585r == null || TextUtils.isEmpty(uVar.f583p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0006g) this.f1813n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f1811m;
        int i = this.f1809l;
        String str = null;
        if (i == -1) {
            this.f1815o.setText(String.valueOf(length));
            this.f1815o.setContentDescription(null);
            this.f1811m = false;
        } else {
            this.f1811m = length > i;
            Context context = getContext();
            this.f1815o.setContentDescription(context.getString(this.f1811m ? com.fortuneodd.shadegrid.R.string.character_counter_overflowed_content_description : com.fortuneodd.shadegrid.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f1809l)));
            if (z2 != this.f1811m) {
                o();
            }
            String str2 = I.b.f236b;
            I.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? I.b.f238e : I.b.d;
            C0219d0 c0219d0 = this.f1815o;
            String string = getContext().getString(com.fortuneodd.shadegrid.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f1809l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                I.g gVar = I.h.f246a;
                str = bVar.c(string).toString();
            }
            c0219d0.setText(str);
        }
        if (this.d == null || z2 == this.f1811m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0219d0 c0219d0 = this.f1815o;
        if (c0219d0 != null) {
            l(c0219d0, this.f1811m ? this.f1817p : this.f1819q);
            if (!this.f1811m && (colorStateList2 = this.f1835y) != null) {
                this.f1815o.setTextColor(colorStateList2);
            }
            if (!this.f1811m || (colorStateList = this.f1837z) == null) {
                return;
            }
            this.f1815o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1830v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        q qVar = this.f1795c;
        qVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f1770B0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(qVar.getMeasuredHeight(), this.f1793b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.d.post(new p(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = D0.e.f137a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f1789V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = D0.e.f137a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            D0.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = D0.e.f138b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f1777J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f1785R, rect.right, i5);
            }
            g gVar2 = this.f1778K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f1786S, rect.right, i6);
            }
            if (this.f1771C) {
                float textSize = this.d.getTextSize();
                d dVar = this.f1830v0;
                if (dVar.h != textSize) {
                    dVar.h = textSize;
                    dVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (dVar.f119g != i7) {
                    dVar.f119g = i7;
                    dVar.h(false);
                }
                if (dVar.f117f != gravity) {
                    dVar.f117f = gravity;
                    dVar.h(false);
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                boolean e2 = n.e(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f1790W;
                rect2.bottom = i8;
                int i9 = this.f1782O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, e2);
                    rect2.top = rect.top + this.f1783P;
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
                    dVar.f94M = true;
                }
                if (this.d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f96O;
                textPaint.setTextSize(dVar.h);
                textPaint.setTypeface(dVar.f131u);
                textPaint.setLetterSpacing(dVar.f104W);
                float f2 = -textPaint.ascent();
                rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f1782O != 1 || this.d.getMinLines() > 1) ? rect.top + this.d.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f1782O != 1 || this.d.getMinLines() > 1) ? rect.bottom - this.d.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = dVar.f112c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    dVar.f94M = true;
                }
                dVar.h(false);
                if (!e() || this.f1828u0) {
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
        boolean z2 = this.f1770B0;
        q qVar = this.f1795c;
        if (!z2) {
            qVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f1770B0 = true;
        }
        if (this.f1825t != null && (editText = this.d) != null) {
            this.f1825t.setGravity(editText.getGravity());
            this.f1825t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        qVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F f2 = (F) parcelable;
        super.onRestoreInstanceState(f2.f672a);
        setError(f2.f500c);
        if (f2.d) {
            post(new B(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f1780M) {
            c cVar = this.f1779L.f312e;
            RectF rectF = this.f1792a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f1779L.f313f.a(rectF);
            float a4 = this.f1779L.h.a(rectF);
            float a5 = this.f1779L.f314g.a(rectF);
            k kVar = this.f1779L;
            q1.d dVar = kVar.f309a;
            q1.d dVar2 = kVar.f310b;
            q1.d dVar3 = kVar.d;
            q1.d dVar4 = kVar.f311c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(dVar2);
            j.b(dVar);
            j.b(dVar4);
            j.b(dVar3);
            J0.a aVar = new J0.a(a3);
            J0.a aVar2 = new J0.a(a2);
            J0.a aVar3 = new J0.a(a5);
            J0.a aVar4 = new J0.a(a4);
            k kVar2 = new k();
            kVar2.f309a = dVar2;
            kVar2.f310b = dVar;
            kVar2.f311c = dVar3;
            kVar2.d = dVar4;
            kVar2.f312e = aVar;
            kVar2.f313f = aVar2;
            kVar2.f314g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f315j = eVar2;
            kVar2.f316k = eVar3;
            kVar2.f317l = eVar4;
            this.f1780M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f500c = getError();
        }
        q qVar = this.f1795c;
        f2.d = qVar.i != 0 && qVar.f547g.d;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1767A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue k02 = l.k0(context, com.fortuneodd.shadegrid.R.attr.colorControlActivated);
            if (k02 != null) {
                int i = k02.resourceId;
                if (i != 0) {
                    colorStateList2 = q1.d.p(context, i);
                } else {
                    int i2 = k02.data;
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
            if ((m() || (this.f1815o != null && this.f1811m)) && (colorStateList = this.f1769B) != null) {
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
        q qVar;
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
            z zVar = this.f1793b;
            if (zVar.getMeasuredWidth() > 0) {
                int measuredWidth = zVar.getMeasuredWidth() - this.d.getPaddingLeft();
                if (this.f1796c0 == null || this.f1797d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f1796c0 = colorDrawable3;
                    this.f1797d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f1796c0;
                if (drawable2 != colorDrawable4) {
                    this.d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    qVar = this.f1795c;
                    if ((!qVar.e() || ((qVar.i != 0 && qVar.d()) || qVar.f554p != null)) && qVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = qVar.f555q.getMeasuredWidth() - this.d.getPaddingRight();
                        if (!qVar.e()) {
                            checkableImageButton = qVar.f544c;
                        } else if (qVar.i != 0 && qVar.d()) {
                            checkableImageButton = qVar.f547g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                        colorDrawable = this.f1801f0;
                        if (colorDrawable != null || this.f1803g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f1801f0 = colorDrawable5;
                                this.f1803g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f1801f0;
                            if (drawable == colorDrawable2) {
                                this.f1804h0 = drawable;
                                this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f1803g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f1801f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f1801f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f1801f0) {
                            this.d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f1804h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f1801f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                qVar = this.f1795c;
                if (qVar.e()) {
                }
                int measuredWidth22 = qVar.f555q.getMeasuredWidth() - this.d.getPaddingRight();
                if (!qVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                colorDrawable = this.f1801f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f1801f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f1796c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.d.getCompoundDrawablesRelative();
            this.d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f1796c0 = null;
            z2 = true;
            qVar = this.f1795c;
            if (qVar.e()) {
            }
            int measuredWidth222 = qVar.f555q.getMeasuredWidth() - this.d.getPaddingRight();
            if (!qVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
            colorDrawable = this.f1801f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f1801f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        qVar = this.f1795c;
        if (qVar.e()) {
        }
        int measuredWidth2222 = qVar.f555q.getMeasuredWidth() - this.d.getPaddingRight();
        if (!qVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        colorDrawable = this.f1801f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f1801f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0219d0 c0219d0;
        EditText editText = this.d;
        if (editText == null || this.f1782O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0239n0.f3039a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0254v.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f1811m && (c0219d0 = this.f1815o) != null) {
            mutate.setColorFilter(C0254v.c(c0219d0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
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
        if ((this.f1776I || editText.getBackground() == null) && this.f1782O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.d;
            WeakHashMap weakHashMap = S.f360a;
            editText2.setBackground(editTextBoxBackground);
            this.f1776I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f1788U != i) {
            this.f1788U = i;
            this.f1816o0 = i;
            this.f1820q0 = i;
            this.f1822r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f1816o0 = defaultColor;
        this.f1788U = defaultColor;
        this.f1818p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f1820q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f1822r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f1782O) {
            return;
        }
        this.f1782O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f1783P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e2 = this.f1779L.e();
        c cVar = this.f1779L.f312e;
        q1.d y2 = l.y(i);
        e2.f300a = y2;
        j.b(y2);
        e2.f303e = cVar;
        c cVar2 = this.f1779L.f313f;
        q1.d y3 = l.y(i);
        e2.f301b = y3;
        j.b(y3);
        e2.f304f = cVar2;
        c cVar3 = this.f1779L.h;
        q1.d y4 = l.y(i);
        e2.d = y4;
        j.b(y4);
        e2.h = cVar3;
        c cVar4 = this.f1779L.f314g;
        q1.d y5 = l.y(i);
        e2.f302c = y5;
        j.b(y5);
        e2.f305g = cVar4;
        this.f1779L = e2.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f1812m0 != i) {
            this.f1812m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f1808k0 = colorStateList.getDefaultColor();
            this.f1824s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f1810l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f1812m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f1812m0 != colorStateList.getDefaultColor()) {
            this.f1812m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f1814n0 != colorStateList) {
            this.f1814n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f1785R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f1786S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f1807k != z2) {
            u uVar = this.f1806j;
            if (z2) {
                C0219d0 c0219d0 = new C0219d0(getContext(), null);
                this.f1815o = c0219d0;
                c0219d0.setId(com.fortuneodd.shadegrid.R.id.textinput_counter);
                Typeface typeface = this.f1794b0;
                if (typeface != null) {
                    this.f1815o.setTypeface(typeface);
                }
                this.f1815o.setMaxLines(1);
                uVar.a(this.f1815o, 2);
                ((ViewGroup.MarginLayoutParams) this.f1815o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.fortuneodd.shadegrid.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f1815o != null) {
                    EditText editText = this.d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                uVar.g(this.f1815o, 2);
                this.f1815o = null;
            }
            this.f1807k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f1809l != i) {
            if (i > 0) {
                this.f1809l = i;
            } else {
                this.f1809l = -1;
            }
            if (!this.f1807k || this.f1815o == null) {
                return;
            }
            EditText editText = this.d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f1817p != i) {
            this.f1817p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f1837z != colorStateList) {
            this.f1837z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f1819q != i) {
            this.f1819q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f1835y != colorStateList) {
            this.f1835y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f1767A != colorStateList) {
            this.f1767A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f1769B != colorStateList) {
            this.f1769B = colorStateList;
            if (m() || (this.f1815o != null && this.f1811m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1805i0 = colorStateList;
        this.j0 = colorStateList;
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
        this.f1795c.f547g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f1795c.f547g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        q qVar = this.f1795c;
        CharSequence text = i != 0 ? qVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = qVar.f547g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        q qVar = this.f1795c;
        Drawable u2 = i != 0 ? q1.d.u(qVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = qVar.f547g;
        checkableImageButton.setImageDrawable(u2);
        if (u2 != null) {
            ColorStateList colorStateList = qVar.f549k;
            PorterDuff.Mode mode = qVar.f550l;
            TextInputLayout textInputLayout = qVar.f542a;
            q1.d.c(textInputLayout, checkableImageButton, colorStateList, mode);
            q1.d.L(textInputLayout, checkableImageButton, qVar.f549k);
        }
    }

    public void setEndIconMinSize(int i) {
        q qVar = this.f1795c;
        if (i < 0) {
            qVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != qVar.f551m) {
            qVar.f551m = i;
            CheckableImageButton checkableImageButton = qVar.f547g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = qVar.f544c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f1795c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1795c;
        View.OnLongClickListener onLongClickListener = qVar.f553o;
        CheckableImageButton checkableImageButton = qVar.f547g;
        checkableImageButton.setOnClickListener(onClickListener);
        q1.d.T(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1795c;
        qVar.f553o = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f547g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q1.d.T(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        q qVar = this.f1795c;
        qVar.f552n = scaleType;
        qVar.f547g.setScaleType(scaleType);
        qVar.f544c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1795c;
        if (qVar.f549k != colorStateList) {
            qVar.f549k = colorStateList;
            q1.d.c(qVar.f542a, qVar.f547g, colorStateList, qVar.f550l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1795c;
        if (qVar.f550l != mode) {
            qVar.f550l = mode;
            q1.d.c(qVar.f542a, qVar.f547g, qVar.f549k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f1795c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        u uVar = this.f1806j;
        if (!uVar.f584q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            uVar.f();
            return;
        }
        uVar.c();
        uVar.f583p = charSequence;
        uVar.f585r.setText(charSequence);
        int i = uVar.f581n;
        if (i != 1) {
            uVar.f582o = 1;
        }
        uVar.i(i, uVar.f582o, uVar.h(uVar.f585r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        u uVar = this.f1806j;
        uVar.f587t = i;
        C0219d0 c0219d0 = uVar.f585r;
        if (c0219d0 != null) {
            WeakHashMap weakHashMap = S.f360a;
            c0219d0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        u uVar = this.f1806j;
        uVar.f586s = charSequence;
        C0219d0 c0219d0 = uVar.f585r;
        if (c0219d0 != null) {
            c0219d0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        u uVar = this.f1806j;
        if (uVar.f584q == z2) {
            return;
        }
        uVar.c();
        TextInputLayout textInputLayout = uVar.h;
        if (z2) {
            C0219d0 c0219d0 = new C0219d0(uVar.f576g, null);
            uVar.f585r = c0219d0;
            c0219d0.setId(com.fortuneodd.shadegrid.R.id.textinput_error);
            uVar.f585r.setTextAlignment(5);
            Typeface typeface = uVar.f570B;
            if (typeface != null) {
                uVar.f585r.setTypeface(typeface);
            }
            int i = uVar.f588u;
            uVar.f588u = i;
            C0219d0 c0219d02 = uVar.f585r;
            if (c0219d02 != null) {
                textInputLayout.l(c0219d02, i);
            }
            ColorStateList colorStateList = uVar.f589v;
            uVar.f589v = colorStateList;
            C0219d0 c0219d03 = uVar.f585r;
            if (c0219d03 != null && colorStateList != null) {
                c0219d03.setTextColor(colorStateList);
            }
            CharSequence charSequence = uVar.f586s;
            uVar.f586s = charSequence;
            C0219d0 c0219d04 = uVar.f585r;
            if (c0219d04 != null) {
                c0219d04.setContentDescription(charSequence);
            }
            int i2 = uVar.f587t;
            uVar.f587t = i2;
            C0219d0 c0219d05 = uVar.f585r;
            if (c0219d05 != null) {
                WeakHashMap weakHashMap = S.f360a;
                c0219d05.setAccessibilityLiveRegion(i2);
            }
            uVar.f585r.setVisibility(4);
            uVar.a(uVar.f585r, 0);
        } else {
            uVar.f();
            uVar.g(uVar.f585r, 0);
            uVar.f585r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f584q = z2;
    }

    public void setErrorIconDrawable(int i) {
        q qVar = this.f1795c;
        qVar.i(i != 0 ? q1.d.u(qVar.getContext(), i) : null);
        q1.d.L(qVar.f542a, qVar.f544c, qVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        q qVar = this.f1795c;
        CheckableImageButton checkableImageButton = qVar.f544c;
        View.OnLongClickListener onLongClickListener = qVar.f546f;
        checkableImageButton.setOnClickListener(onClickListener);
        q1.d.T(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        q qVar = this.f1795c;
        qVar.f546f = onLongClickListener;
        CheckableImageButton checkableImageButton = qVar.f544c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q1.d.T(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        q qVar = this.f1795c;
        if (qVar.d != colorStateList) {
            qVar.d = colorStateList;
            q1.d.c(qVar.f542a, qVar.f544c, colorStateList, qVar.f545e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1795c;
        if (qVar.f545e != mode) {
            qVar.f545e = mode;
            q1.d.c(qVar.f542a, qVar.f544c, qVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        u uVar = this.f1806j;
        uVar.f588u = i;
        C0219d0 c0219d0 = uVar.f585r;
        if (c0219d0 != null) {
            uVar.h.l(c0219d0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        u uVar = this.f1806j;
        uVar.f589v = colorStateList;
        C0219d0 c0219d0 = uVar.f585r;
        if (c0219d0 == null || colorStateList == null) {
            return;
        }
        c0219d0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f1832w0 != z2) {
            this.f1832w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        u uVar = this.f1806j;
        if (isEmpty) {
            if (uVar.f591x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!uVar.f591x) {
            setHelperTextEnabled(true);
        }
        uVar.c();
        uVar.f590w = charSequence;
        uVar.f592y.setText(charSequence);
        int i = uVar.f581n;
        if (i != 2) {
            uVar.f582o = 2;
        }
        uVar.i(i, uVar.f582o, uVar.h(uVar.f592y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        u uVar = this.f1806j;
        uVar.f569A = colorStateList;
        C0219d0 c0219d0 = uVar.f592y;
        if (c0219d0 == null || colorStateList == null) {
            return;
        }
        c0219d0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        u uVar = this.f1806j;
        if (uVar.f591x == z2) {
            return;
        }
        uVar.c();
        if (z2) {
            C0219d0 c0219d0 = new C0219d0(uVar.f576g, null);
            uVar.f592y = c0219d0;
            c0219d0.setId(com.fortuneodd.shadegrid.R.id.textinput_helper_text);
            uVar.f592y.setTextAlignment(5);
            Typeface typeface = uVar.f570B;
            if (typeface != null) {
                uVar.f592y.setTypeface(typeface);
            }
            uVar.f592y.setVisibility(4);
            uVar.f592y.setAccessibilityLiveRegion(1);
            int i = uVar.f593z;
            uVar.f593z = i;
            C0219d0 c0219d02 = uVar.f592y;
            if (c0219d02 != null) {
                c0219d02.setTextAppearance(i);
            }
            ColorStateList colorStateList = uVar.f569A;
            uVar.f569A = colorStateList;
            C0219d0 c0219d03 = uVar.f592y;
            if (c0219d03 != null && colorStateList != null) {
                c0219d03.setTextColor(colorStateList);
            }
            uVar.a(uVar.f592y, 1);
            uVar.f592y.setAccessibilityDelegate(new t(uVar));
        } else {
            uVar.c();
            int i2 = uVar.f581n;
            if (i2 == 2) {
                uVar.f582o = 0;
            }
            uVar.i(i2, uVar.f582o, uVar.h(uVar.f592y, ""));
            uVar.g(uVar.f592y, 1);
            uVar.f592y = null;
            TextInputLayout textInputLayout = uVar.h;
            textInputLayout.r();
            textInputLayout.x();
        }
        uVar.f591x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        u uVar = this.f1806j;
        uVar.f593z = i;
        C0219d0 c0219d0 = uVar.f592y;
        if (c0219d0 != null) {
            c0219d0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f1771C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f1834x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f1771C) {
            this.f1771C = z2;
            if (z2) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1772D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f1773E = true;
            } else {
                this.f1773E = false;
                if (!TextUtils.isEmpty(this.f1772D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f1772D);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f1830v0;
        TextInputLayout textInputLayout = dVar.f108a;
        G0.d dVar2 = new G0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f192j;
        if (colorStateList != null) {
            dVar.f121k = colorStateList;
        }
        float f2 = dVar2.f193k;
        if (f2 != 0.0f) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f186a;
        if (colorStateList2 != null) {
            dVar.f102U = colorStateList2;
        }
        dVar.f100S = dVar2.f189e;
        dVar.f101T = dVar2.f190f;
        dVar.f99R = dVar2.f191g;
        dVar.f103V = dVar2.i;
        G0.a aVar = dVar.f135y;
        if (aVar != null) {
            aVar.f182c = true;
        }
        C.g gVar = new C.g(1, dVar);
        dVar2.a();
        dVar.f135y = new G0.a(gVar, dVar2.f196n);
        dVar2.c(textInputLayout.getContext(), dVar.f135y);
        dVar.h(false);
        this.j0 = dVar.f121k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.j0 != colorStateList) {
            if (this.f1805i0 == null) {
                d dVar = this.f1830v0;
                if (dVar.f121k != colorStateList) {
                    dVar.f121k = colorStateList;
                    dVar.h(false);
                }
            }
            this.j0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e2) {
        this.f1813n = e2;
    }

    public void setMaxEms(int i) {
        this.f1802g = i;
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
        this.f1800f = i;
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
        q qVar = this.f1795c;
        qVar.f547g.setContentDescription(i != 0 ? qVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        q qVar = this.f1795c;
        qVar.f547g.setImageDrawable(i != 0 ? q1.d.u(qVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        q qVar = this.f1795c;
        if (z2 && qVar.i != 1) {
            qVar.g(1);
        } else if (z2) {
            qVar.getClass();
        } else {
            qVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        q qVar = this.f1795c;
        qVar.f549k = colorStateList;
        q1.d.c(qVar.f542a, qVar.f547g, colorStateList, qVar.f550l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        q qVar = this.f1795c;
        qVar.f550l = mode;
        q1.d.c(qVar.f542a, qVar.f547g, qVar.f549k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f1825t == null) {
            C0219d0 c0219d0 = new C0219d0(getContext(), null);
            this.f1825t = c0219d0;
            c0219d0.setId(com.fortuneodd.shadegrid.R.id.textinput_placeholder);
            this.f1825t.setImportantForAccessibility(2);
            h d = d();
            this.f1831w = d;
            d.f2813b = 67L;
            this.f1833x = d();
            setPlaceholderTextAppearance(this.f1829v);
            setPlaceholderTextColor(this.f1827u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f1823s) {
                setPlaceholderTextEnabled(true);
            }
            this.f1821r = charSequence;
        }
        EditText editText = this.d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f1829v = i;
        C0219d0 c0219d0 = this.f1825t;
        if (c0219d0 != null) {
            c0219d0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f1827u != colorStateList) {
            this.f1827u = colorStateList;
            C0219d0 c0219d0 = this.f1825t;
            if (c0219d0 == null || colorStateList == null) {
                return;
            }
            c0219d0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        z zVar = this.f1793b;
        zVar.getClass();
        zVar.f610c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        zVar.f609b.setText(charSequence);
        zVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f1793b.f609b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1793b.f609b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.F;
        if (gVar == null || gVar.f280a.f266a == kVar) {
            return;
        }
        this.f1779L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f1793b.d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1793b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? q1.d.u(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        z zVar = this.f1793b;
        if (i < 0) {
            zVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != zVar.f613g) {
            zVar.f613g = i;
            CheckableImageButton checkableImageButton = zVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        z zVar = this.f1793b;
        View.OnLongClickListener onLongClickListener = zVar.i;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        q1.d.T(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        z zVar = this.f1793b;
        zVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = zVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        q1.d.T(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        z zVar = this.f1793b;
        zVar.h = scaleType;
        zVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        z zVar = this.f1793b;
        if (zVar.f611e != colorStateList) {
            zVar.f611e = colorStateList;
            q1.d.c(zVar.f608a, zVar.d, colorStateList, zVar.f612f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        z zVar = this.f1793b;
        if (zVar.f612f != mode) {
            zVar.f612f = mode;
            q1.d.c(zVar.f608a, zVar.d, zVar.f611e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f1793b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        q qVar = this.f1795c;
        qVar.getClass();
        qVar.f554p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        qVar.f555q.setText(charSequence);
        qVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f1795c.f555q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f1795c.f555q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d) {
        EditText editText = this.d;
        if (editText != null) {
            S.l(editText, d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f1794b0) {
            this.f1794b0 = typeface;
            this.f1830v0.m(typeface);
            u uVar = this.f1806j;
            if (typeface != uVar.f570B) {
                uVar.f570B = typeface;
                C0219d0 c0219d0 = uVar.f585r;
                if (c0219d0 != null) {
                    c0219d0.setTypeface(typeface);
                }
                C0219d0 c0219d02 = uVar.f592y;
                if (c0219d02 != null) {
                    c0219d02.setTypeface(typeface);
                }
            }
            C0219d0 c0219d03 = this.f1815o;
            if (c0219d03 != null) {
                c0219d03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f1782O != 1) {
            FrameLayout frameLayout = this.f1791a;
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
        C0219d0 c0219d0;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f1805i0;
        d dVar = this.f1830v0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f1805i0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f1824s0) : this.f1824s0));
        } else if (m()) {
            C0219d0 c0219d02 = this.f1806j.f585r;
            dVar.i(c0219d02 != null ? c0219d02.getTextColors() : null);
        } else if (this.f1811m && (c0219d0 = this.f1815o) != null) {
            dVar.i(c0219d0.getTextColors());
        } else if (z5 && (colorStateList = this.j0) != null && dVar.f121k != colorStateList) {
            dVar.f121k = colorStateList;
            dVar.h(false);
        }
        q qVar = this.f1795c;
        z zVar = this.f1793b;
        if (z4 || !this.f1832w0 || (isEnabled() && z5)) {
            if (z3 || this.f1828u0) {
                ValueAnimator valueAnimator = this.f1836y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1836y0.cancel();
                }
                if (z2 && this.f1834x0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f1828u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                v(editText3 != null ? editText3.getText() : null);
                zVar.f614j = false;
                zVar.e();
                qVar.f556r = false;
                qVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f1828u0) {
            ValueAnimator valueAnimator2 = this.f1836y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1836y0.cancel();
            }
            if (z2 && this.f1834x0) {
                a(0.0f);
            } else {
                dVar.k(0.0f);
            }
            if (e() && !((M0.h) this.F).f519x.f517q.isEmpty() && e()) {
                ((M0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f1828u0 = true;
            C0219d0 c0219d03 = this.f1825t;
            if (c0219d03 != null && this.f1823s) {
                c0219d03.setText((CharSequence) null);
                k0.q.a(this.f1791a, this.f1833x);
                this.f1825t.setVisibility(4);
            }
            zVar.f614j = true;
            zVar.e();
            qVar.f556r = true;
            qVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0006g) this.f1813n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f1791a;
        if (length != 0 || this.f1828u0) {
            C0219d0 c0219d0 = this.f1825t;
            if (c0219d0 == null || !this.f1823s) {
                return;
            }
            c0219d0.setText((CharSequence) null);
            k0.q.a(frameLayout, this.f1833x);
            this.f1825t.setVisibility(4);
            return;
        }
        if (this.f1825t == null || !this.f1823s || TextUtils.isEmpty(this.f1821r)) {
            return;
        }
        this.f1825t.setText(this.f1821r);
        k0.q.a(frameLayout, this.f1831w);
        this.f1825t.setVisibility(0);
        this.f1825t.bringToFront();
        announceForAccessibility(this.f1821r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f1814n0.getDefaultColor();
        int colorForState = this.f1814n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f1814n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f1787T = colorForState2;
        } else if (z3) {
            this.f1787T = colorForState;
        } else {
            this.f1787T = defaultColor;
        }
    }

    public final void x() {
        C0219d0 c0219d0;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.f1782O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f1787T = this.f1824s0;
        } else if (m()) {
            if (this.f1814n0 != null) {
                w(z3, z2);
            } else {
                this.f1787T = getErrorCurrentTextColors();
            }
        } else if (!this.f1811m || (c0219d0 = this.f1815o) == null) {
            if (z3) {
                this.f1787T = this.f1812m0;
            } else if (z2) {
                this.f1787T = this.f1810l0;
            } else {
                this.f1787T = this.f1808k0;
            }
        } else if (this.f1814n0 != null) {
            w(z3, z2);
        } else {
            this.f1787T = c0219d0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        q qVar = this.f1795c;
        qVar.l();
        CheckableImageButton checkableImageButton = qVar.f544c;
        ColorStateList colorStateList = qVar.d;
        TextInputLayout textInputLayout = qVar.f542a;
        q1.d.L(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = qVar.f549k;
        CheckableImageButton checkableImageButton2 = qVar.f547g;
        q1.d.L(textInputLayout, checkableImageButton2, colorStateList2);
        if (qVar.b() instanceof M0.l) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                q1.d.c(textInputLayout, checkableImageButton2, qVar.f549k, qVar.f550l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        z zVar = this.f1793b;
        q1.d.L(zVar.f608a, zVar.d, zVar.f611e);
        if (this.f1782O == 2) {
            int i = this.f1784Q;
            if (z3 && isEnabled()) {
                this.f1784Q = this.f1786S;
            } else {
                this.f1784Q = this.f1785R;
            }
            if (this.f1784Q != i && e() && !this.f1828u0) {
                if (e()) {
                    ((M0.h) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f1782O == 1) {
            if (!isEnabled()) {
                this.f1788U = this.f1818p0;
            } else if (z2 && !z3) {
                this.f1788U = this.f1822r0;
            } else if (z3) {
                this.f1788U = this.f1820q0;
            } else {
                this.f1788U = this.f1816o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1793b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1795c.f547g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1795c.f547g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f1795c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1795c.f547g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        q qVar = this.f1795c;
        CheckableImageButton checkableImageButton = qVar.f547g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = qVar.f549k;
            PorterDuff.Mode mode = qVar.f550l;
            TextInputLayout textInputLayout = qVar.f542a;
            q1.d.c(textInputLayout, checkableImageButton, colorStateList, mode);
            q1.d.L(textInputLayout, checkableImageButton, qVar.f549k);
        }
    }
}
