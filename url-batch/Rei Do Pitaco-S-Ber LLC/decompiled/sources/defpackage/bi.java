package defpackage;

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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.ionia.reidopitaco.libya.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bi extends LinearLayout {
    public final yh A;
    public final TextInputLayout f;
    public final FrameLayout g;
    public final CheckableImageButton h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public View.OnLongClickListener k;
    public final CheckableImageButton l;
    public final ai m;
    public int n;
    public final LinkedHashSet o;
    public ColorStateList p;
    public PorterDuff.Mode q;
    public int r;
    public ImageView.ScaleType s;
    public View.OnLongClickListener t;
    public CharSequence u;
    public final p5 v;
    public boolean w;
    public EditText x;
    public final AccessibilityManager y;
    public AccessibilityManager.TouchExplorationStateChangeListener z;

    public bi(TextInputLayout textInputLayout, y5 y5Var) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.n = 0;
        this.o = new LinkedHashSet();
        this.A = new yh(this);
        zh zhVar = new zh(this);
        this.y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a = a(this, from, R.id.text_input_error_icon);
        this.h = a;
        CheckableImageButton a2 = a(frameLayout, from, R.id.text_input_end_icon);
        this.l = a2;
        this.m = new ai(this, y5Var);
        p5 p5Var = new p5(getContext(), null);
        this.v = p5Var;
        TypedArray typedArray = (TypedArray) y5Var.a;
        if (typedArray.hasValue(38)) {
            this.i = oo.n(getContext(), y5Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.j = g90.b(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            j(y5Var.f(37));
        }
        a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        a.setImportantForAccessibility(2);
        a.setClickable(false);
        a.setPressable(false);
        a.setCheckable(false);
        a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.p = oo.n(getContext(), y5Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.q = g90.b(typedArray.getInt(33, -1), null);
            }
        }
        final int i2 = 1;
        if (typedArray.hasValue(30)) {
            h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                g(typedArray.getText(27));
            }
            a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.p = oo.n(getContext(), y5Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.q = g90.b(typedArray.getInt(56, -1), null);
            }
            h(typedArray.getBoolean(54, false) ? 1 : 0);
            g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            l8.l("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.r) {
            this.r = dimensionPixelSize;
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
            a.setMinimumWidth(dimensionPixelSize);
            a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType q = m60.q(typedArray.getInt(31, -1));
            this.s = q;
            a2.setScaleType(q);
            a.setScaleType(q);
        }
        p5Var.setVisibility(8);
        p5Var.setId(R.id.textinput_suffix_text);
        p5Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        p5Var.setAccessibilityLiveRegion(1);
        p5Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            p5Var.setTextColor(y5Var.e(74));
        }
        CharSequence text = typedArray.getText(72);
        this.u = TextUtils.isEmpty(text) ? null : text;
        p5Var.setText(text);
        o();
        frameLayout.addView(a2);
        addView(p5Var);
        addView(frameLayout);
        addView(a);
        a.setOnFocusableChangedListener(new s9(this) { // from class: xh
            public final /* synthetic */ bi g;

            {
                this.g = this;
            }

            @Override // defpackage.s9
            public final void b() {
                int i3 = i;
                bi biVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = biVar.h;
                        m60.c0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = biVar.l;
                        m60.c0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        a2.setOnFocusableChangedListener(new s9(this) { // from class: xh
            public final /* synthetic */ bi g;

            {
                this.g = this;
            }

            @Override // defpackage.s9
            public final void b() {
                int i3 = i2;
                bi biVar = this.g;
                switch (i3) {
                    case 0:
                        CheckableImageButton checkableImageButton = biVar.h;
                        m60.c0(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = biVar.l;
                        m60.c0(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.k0.add(zhVar);
        if (textInputLayout.j != null) {
            zhVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new f9(i2, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (oo.v(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final ci b() {
        ci rdVar;
        int i = this.n;
        ai aiVar = this.m;
        SparseArray sparseArray = aiVar.a;
        ci ciVar = (ci) sparseArray.get(i);
        if (ciVar != null) {
            return ciVar;
        }
        bi biVar = aiVar.b;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                rdVar = new rd(biVar, i2);
            } else if (i == 1) {
                rdVar = new dw(biVar, aiVar.d);
            } else if (i == 2) {
                rdVar = new na(biVar);
            } else {
                if (i != 3) {
                    l8.l(n20.e("Invalid end icon mode: ", i));
                    return null;
                }
                rdVar = new hg(biVar);
            }
        } else {
            rdVar = new rd(biVar, 0);
        }
        sparseArray.append(i, rdVar);
        return rdVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.g.getVisibility() == 0 && this.l.getVisibility() == 0;
    }

    public final boolean e() {
        return this.h.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        ci b = b();
        boolean j = b.j();
        CheckableImageButton checkableImageButton = this.l;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.i) == b.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(b instanceof hg) || (isActivated = checkableImageButton.isActivated()) == ((hg) b).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            m60.Q(this.f, checkableImageButton, this.p);
        }
    }

    public final void g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            m60.c0(checkableImageButton, charSequence);
        }
    }

    public final void h(int i) {
        if (this.n == i) {
            return;
        }
        ci b = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.z;
        AccessibilityManager accessibilityManager = this.y;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.z = null;
        b.r();
        this.n = i;
        Iterator it = this.o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            l8.c();
            return;
        }
        i(i != 0);
        ci b2 = b();
        int i2 = this.m.c;
        if (i2 == 0) {
            i2 = b2.d();
        }
        Drawable t = i2 != 0 ? vv.t(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.l;
        checkableImageButton.setImageDrawable(t);
        TextInputLayout textInputLayout = this.f;
        if (t != null) {
            m60.f(textInputLayout, checkableImageButton, this.p, this.q);
            m60.Q(textInputLayout, checkableImageButton, this.p);
        }
        checkableImageButton.setCheckable(b2.j());
        if (!b2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b2.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = b2.h();
        this.z = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.z);
        }
        View.OnClickListener f = b2.f();
        View.OnLongClickListener onLongClickListener = this.t;
        checkableImageButton.setOnClickListener(f);
        m60.X(checkableImageButton, onLongClickListener);
        int c = b2.c();
        g(c != 0 ? getResources().getText(c) : null);
        EditText editText = this.x;
        if (editText != null) {
            b2.l(editText);
            k(b2);
        }
        m60.f(textInputLayout, checkableImageButton, this.p, this.q);
        f(true);
    }

    public final void i(boolean z) {
        EditText editText;
        if (d() != z) {
            CheckableImageButton checkableImageButton = this.l;
            if (!z && checkableImageButton.hasFocus() && (editText = this.x) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            l();
            n();
            this.f.s();
        }
    }

    public final void j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.h;
        checkableImageButton.setImageDrawable(drawable);
        m();
        m60.f(this.f, checkableImageButton, this.i, this.j);
    }

    public final void k(ci ciVar) {
        if (this.x == null) {
            return;
        }
        if (ciVar.e() != null) {
            this.x.setOnFocusChangeListener(ciVar.e());
        }
        if (ciVar.g() != null) {
            this.l.setOnFocusChangeListener(ciVar.g());
        }
    }

    public final void l() {
        this.g.setVisibility((this.l.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.u == null || this.w) ? 8 : false)) ? 0 : 8);
    }

    public final void m() {
        CheckableImageButton checkableImageButton = this.h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.p.q && textInputLayout.o()) ? 0 : 8);
        l();
        n();
        if (this.n != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void n() {
        TextInputLayout textInputLayout = this.f;
        if (textInputLayout.j == null) {
            return;
        }
        this.v.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.j.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.j.getPaddingEnd(), textInputLayout.j.getPaddingBottom());
    }

    public final void o() {
        p5 p5Var = this.v;
        int visibility = p5Var.getVisibility();
        int i = (this.u == null || this.w) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        l();
        p5Var.setVisibility(i);
        this.f.s();
    }
}
