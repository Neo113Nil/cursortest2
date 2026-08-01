package M0;

import K.C0011l;
import K.S;
import X.V;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.fortuneodd.shadegrid.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0219d0;

/* loaded from: classes.dex */
public final class q extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f542a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f543b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f544c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f545e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f546f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f547g;
    public final p h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f548j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f549k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f550l;

    /* renamed from: m, reason: collision with root package name */
    public int f551m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f552n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f553o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f554p;

    /* renamed from: q, reason: collision with root package name */
    public final C0219d0 f555q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f556r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f557s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f558t;

    /* renamed from: u, reason: collision with root package name */
    public k f559u;

    /* renamed from: v, reason: collision with root package name */
    public final m f560v;

    public q(TextInputLayout textInputLayout, C0011l c0011l) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f548j = new LinkedHashSet();
        this.f560v = new m(this);
        n nVar = new n(this);
        this.f558t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f542a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f543b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f544c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f547g = a3;
        this.h = new p(this, c0011l);
        C0219d0 c0219d0 = new C0219d0(getContext(), null);
        this.f555q = c0219d0;
        TypedArray typedArray = (TypedArray) c0011l.f414c;
        if (typedArray.hasValue(38)) {
            this.d = q1.d.q(getContext(), c0011l, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f545e = D0.n.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0011l.h(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = S.f360a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f549k = q1.d.q(getContext(), c0011l, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f550l = D0.n.g(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a3.getContentDescription() != (text = typedArray.getText(27))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f549k = q1.d.q(getContext(), c0011l, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f550l = D0.n.g(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f551m) {
            this.f551m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType g2 = q1.d.g(typedArray.getInt(31, -1));
            this.f552n = g2;
            a3.setScaleType(g2);
            a2.setScaleType(g2);
        }
        c0219d0.setVisibility(8);
        c0219d0.setId(R.id.textinput_suffix_text);
        c0219d0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0219d0.setAccessibilityLiveRegion(1);
        c0219d0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0219d0.setTextColor(c0011l.g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f554p = TextUtils.isEmpty(text3) ? null : text3;
        c0219d0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0219d0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f1799e0.add(nVar);
        if (textInputLayout.d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new o(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (q1.d.C(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final r b() {
        r c0030f;
        int i = this.i;
        p pVar = this.h;
        SparseArray sparseArray = pVar.f539a;
        r rVar = (r) sparseArray.get(i);
        if (rVar == null) {
            q qVar = pVar.f540b;
            if (i == -1) {
                c0030f = new C0030f(qVar, 0);
            } else if (i == 0) {
                c0030f = new C0030f(qVar, 1);
            } else if (i == 1) {
                rVar = new y(qVar, pVar.d);
                sparseArray.append(i, rVar);
            } else if (i == 2) {
                c0030f = new C0029e(qVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(V.d("Invalid end icon mode: ", i));
                }
                c0030f = new l(qVar);
            }
            rVar = c0030f;
            sparseArray.append(i, rVar);
        }
        return rVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f547g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = S.f360a;
        return this.f555q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f543b.getVisibility() == 0 && this.f547g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f544c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        r b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f547g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof l) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            q1.d.L(this.f542a, checkableImageButton, this.f549k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        r b2 = b();
        k kVar = this.f559u;
        AccessibilityManager accessibilityManager = this.f558t;
        if (kVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(kVar));
        }
        this.f559u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f548j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        r b3 = b();
        int i2 = this.h.f541c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable u2 = i2 != 0 ? q1.d.u(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f547g;
        checkableImageButton.setImageDrawable(u2);
        TextInputLayout textInputLayout = this.f542a;
        if (u2 != null) {
            q1.d.c(textInputLayout, checkableImageButton, this.f549k, this.f550l);
            q1.d.L(textInputLayout, checkableImageButton, this.f549k);
        }
        int c2 = b3.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b3.k());
        if (!b3.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b3.r();
        k h = b3.h();
        this.f559u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = S.f360a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f559u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f553o;
        checkableImageButton.setOnClickListener(f2);
        q1.d.T(checkableImageButton, onLongClickListener);
        EditText editText = this.f557s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        q1.d.c(textInputLayout, checkableImageButton, this.f549k, this.f550l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f547g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f542a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f544c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        q1.d.c(this.f542a, checkableImageButton, this.d, this.f545e);
    }

    public final void j(r rVar) {
        if (this.f557s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f557s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f547g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final void k() {
        this.f543b.setVisibility((this.f547g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f554p == null || this.f556r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f544c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f542a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f1806j.f584q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f542a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = S.f360a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = S.f360a;
        this.f555q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0219d0 c0219d0 = this.f555q;
        int visibility = c0219d0.getVisibility();
        int i = (this.f554p == null || this.f556r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0219d0.setVisibility(i);
        this.f542a.q();
    }
}
