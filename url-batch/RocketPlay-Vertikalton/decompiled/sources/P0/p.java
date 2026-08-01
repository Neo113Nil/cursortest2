package P0;

import E1.AbstractC0001b;
import K.C0019l;
import K.T;
import a1.AbstractC0067d;
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
import com.luckycounter.drinkwater.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0244c0;

/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f960a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f961b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f962c;
    public ColorStateList d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f963e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f964f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f965g;
    public final o h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashSet f966j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f967k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f968l;

    /* renamed from: m, reason: collision with root package name */
    public int f969m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f970n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f971o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f972p;

    /* renamed from: q, reason: collision with root package name */
    public final C0244c0 f973q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f974r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f975s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f976t;

    /* renamed from: u, reason: collision with root package name */
    public P.b f977u;

    /* renamed from: v, reason: collision with root package name */
    public final l f978v;

    public p(TextInputLayout textInputLayout, C0019l c0019l) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.f966j = new LinkedHashSet();
        this.f978v = new l(this);
        m mVar = new m(this);
        this.f976t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f960a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f961b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f962c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f965g = a3;
        this.h = new o(this, c0019l);
        C0244c0 c0244c0 = new C0244c0(getContext(), null);
        this.f973q = c0244c0;
        TypedArray typedArray = (TypedArray) c0019l.f684b;
        if (typedArray.hasValue(38)) {
            this.d = F1.l.y(getContext(), c0019l, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f963e = G0.m.g(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(c0019l.c(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = T.f633a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f967k = F1.l.y(getContext(), c0019l, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f968l = G0.m.g(typedArray.getInt(33, -1), null);
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
                this.f967k = F1.l.y(getContext(), c0019l, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f968l = G0.m.g(typedArray.getInt(55, -1), null);
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
        if (dimensionPixelSize != this.f969m) {
            this.f969m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType r2 = F1.d.r(typedArray.getInt(31, -1));
            this.f970n = r2;
            a3.setScaleType(r2);
            a2.setScaleType(r2);
        }
        c0244c0.setVisibility(8);
        c0244c0.setId(R.id.textinput_suffix_text);
        c0244c0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0244c0.setAccessibilityLiveRegion(1);
        c0244c0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0244c0.setTextColor(c0019l.b(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f972p = TextUtils.isEmpty(text3) ? null : text3;
        c0244c0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0244c0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2390e0.add(mVar);
        if (textInputLayout.d != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (F1.l.Q(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i = this.i;
        o oVar = this.h;
        SparseArray sparseArray = oVar.f957a;
        q qVar = (q) sparseArray.get(i);
        if (qVar == null) {
            p pVar = oVar.f958b;
            if (i == -1) {
                fVar = new f(pVar, 0);
            } else if (i == 0) {
                fVar = new f(pVar, 1);
            } else if (i == 1) {
                qVar = new x(pVar, oVar.d);
                sparseArray.append(i, qVar);
            } else if (i == 2) {
                fVar = new e(pVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC0001b.f("Invalid end icon mode: ", i));
                }
                fVar = new k(pVar);
            }
            qVar = fVar;
            sparseArray.append(i, qVar);
        }
        return qVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f965g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = T.f633a;
        return this.f973q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f961b.getVisibility() == 0 && this.f965g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f962c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        q b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f965g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof k) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            F1.d.Z(this.f960a, checkableImageButton, this.f967k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        q b2 = b();
        P.b bVar = this.f977u;
        AccessibilityManager accessibilityManager = this.f976t;
        if (bVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(bVar));
        }
        this.f977u = null;
        b2.s();
        this.i = i;
        Iterator it = this.f966j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        q b3 = b();
        int i2 = this.h.f959c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable k2 = i2 != 0 ? AbstractC0067d.k(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f965g;
        checkableImageButton.setImageDrawable(k2);
        TextInputLayout textInputLayout = this.f960a;
        if (k2 != null) {
            F1.d.l(textInputLayout, checkableImageButton, this.f967k, this.f968l);
            F1.d.Z(textInputLayout, checkableImageButton, this.f967k);
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
        P.b h = b3.h();
        this.f977u = h;
        if (h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = T.f633a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f977u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f971o;
        checkableImageButton.setOnClickListener(f2);
        F1.d.j0(checkableImageButton, onLongClickListener);
        EditText editText = this.f975s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        F1.d.l(textInputLayout, checkableImageButton, this.f967k, this.f968l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f965g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f960a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f962c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        F1.d.l(this.f960a, checkableImageButton, this.d, this.f963e);
    }

    public final void j(q qVar) {
        if (this.f975s == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f975s.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f965g.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f961b.setVisibility((this.f965g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f972p == null || this.f974r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f962c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f960a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2397j.f1002q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f960a;
        if (textInputLayout.d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = T.f633a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = T.f633a;
        this.f973q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0244c0 c0244c0 = this.f973q;
        int visibility = c0244c0.getVisibility();
        int i = (this.f972p == null || this.f974r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0244c0.setVisibility(i);
        this.f960a.q();
    }
}
