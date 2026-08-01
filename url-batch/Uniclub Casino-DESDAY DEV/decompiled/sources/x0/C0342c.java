package x0;

import B.k;
import B.r;
import D0.n;
import K.C0011l;
import K.Y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.fortuneodd.shadegrid.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0248s;
import l0.C0265b;
import l0.C0267d;
import l0.C0268e;
import l0.f;
import p0.AbstractC0279a;
import q1.d;
import q1.l;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342c extends C0248s {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f4123e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f4124f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f4125g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4126j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f4127k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f4128l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f4129m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4130n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f4131o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f4132p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f4133q;

    /* renamed from: r, reason: collision with root package name */
    public int f4134r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f4135s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4136t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f4137u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4138v;

    /* renamed from: w, reason: collision with root package name */
    public final f f4139w;

    /* renamed from: x, reason: collision with root package name */
    public final C0340a f4140x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f4121y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f4122z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4119A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f4120B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public C0342c(Context context, AttributeSet attributeSet) {
        super(O0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f4123e = new LinkedHashSet();
        this.f4124f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f41a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f3128a = a2;
        a2.setCallback(fVar.f3127f);
        new C0268e(fVar.f3128a.getConstantState());
        this.f4139w = fVar;
        this.f4140x = new C0340a(this);
        Context context3 = getContext();
        this.f4128l = Q.c.a(this);
        this.f4131o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0279a.f3389n;
        n.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        n.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0011l c0011l = new C0011l(context3, obtainStyledAttributes);
        this.f4129m = c0011l.h(2);
        if (this.f4128l != null && l.l0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f4120B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f4128l = d.u(context3, R.drawable.mtrl_checkbox_button);
                this.f4130n = true;
                if (this.f4129m == null) {
                    this.f4129m = d.u(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f4132p = d.q(context3, c0011l, 3);
        this.f4133q = n.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f4126j = obtainStyledAttributes.getBoolean(9, false);
        this.f4127k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0011l.t();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f4134r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f4125g == null) {
            int k2 = i1.k.k(this, R.attr.colorControlActivated);
            int k3 = i1.k.k(this, R.attr.colorError);
            int k4 = i1.k.k(this, R.attr.colorSurface);
            int k5 = i1.k.k(this, R.attr.colorOnSurface);
            this.f4125g = new ColorStateList(f4119A, new int[]{i1.k.p(k4, k3, 1.0f), i1.k.p(k4, k2, 1.0f), i1.k.p(k4, k5, 0.54f), i1.k.p(k4, k5, 0.38f), i1.k.p(k4, k5, 0.38f)});
        }
        return this.f4125g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f4131o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Y y2;
        Drawable drawable = this.f4128l;
        ColorStateList colorStateList3 = this.f4131o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f4128l = drawable;
        Drawable drawable2 = this.f4129m;
        ColorStateList colorStateList4 = this.f4132p;
        PorterDuff.Mode mode = this.f4133q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f4129m = drawable2;
        if (this.f4130n) {
            f fVar = this.f4139w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f3128a;
                C0340a c0340a = this.f4140x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0340a.f4116a == null) {
                        c0340a.f4116a = new C0265b(c0340a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0340a.f4116a);
                }
                ArrayList arrayList = fVar.f3126e;
                C0267d c0267d = fVar.f3124b;
                if (arrayList != null && c0340a != null) {
                    arrayList.remove(c0340a);
                    if (fVar.f3126e.size() == 0 && (y2 = fVar.d) != null) {
                        c0267d.f3121b.removeListener(y2);
                        fVar.d = null;
                    }
                }
                Drawable drawable4 = fVar.f3128a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0340a.f4116a == null) {
                        c0340a.f4116a = new C0265b(c0340a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0340a.f4116a);
                } else if (c0340a != null) {
                    if (fVar.f3126e == null) {
                        fVar.f3126e = new ArrayList();
                    }
                    if (!fVar.f3126e.contains(c0340a)) {
                        fVar.f3126e.add(c0340a);
                        if (fVar.d == null) {
                            fVar.d = new Y(4, fVar);
                        }
                        c0267d.f3121b.addListener(fVar.d);
                    }
                }
            }
            Drawable drawable5 = this.f4128l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f4128l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f4128l;
        if (drawable6 != null && (colorStateList2 = this.f4131o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f4129m;
        if (drawable7 != null && (colorStateList = this.f4132p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f4128l;
        Drawable drawable9 = this.f4129m;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f4128l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f4129m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f4132p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f4133q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f4131o;
    }

    public int getCheckedState() {
        return this.f4134r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f4127k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f4134r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f4131o == null && this.f4132p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f4121y);
        }
        if (this.f4126j) {
            View.mergeDrawableStates(onCreateDrawableState, f4122z);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f4135s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (n.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            D.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f4126j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f4127k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0341b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0341b c0341b = (C0341b) parcelable;
        super.onRestoreInstanceState(c0341b.getSuperState());
        setCheckedState(c0341b.f4118a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0341b c0341b = new C0341b(super.onSaveInstanceState());
        c0341b.f4118a = getCheckedState();
        return c0341b;
    }

    @Override // l.C0248s, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.u(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f4129m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(d.u(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f4132p == colorStateList) {
            return;
        }
        this.f4132p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f4133q == mode) {
            return;
        }
        this.f4133q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f4131o == colorStateList) {
            return;
        }
        this.f4131o = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.i = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f4134r != i) {
            this.f4134r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f4137u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f4136t) {
                return;
            }
            this.f4136t = true;
            LinkedHashSet linkedHashSet = this.f4124f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f4134r != 2 && (onCheckedChangeListener = this.f4138v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f4136t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f4127k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f4126j == z2) {
            return;
        }
        this.f4126j = z2;
        refreshDrawableState();
        Iterator it = this.f4123e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4138v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f4137u = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.h = z2;
        if (z2) {
            Q.b.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.b.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.C0248s, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f4128l = drawable;
        this.f4130n = false;
        a();
    }
}
