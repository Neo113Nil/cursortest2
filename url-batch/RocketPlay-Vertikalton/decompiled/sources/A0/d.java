package A0;

import B.k;
import B.r;
import F1.l;
import G0.m;
import K.C0008b0;
import K.C0019l;
import a1.AbstractC0067d;
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
import androidx.recyclerview.widget.RecyclerView;
import com.luckycounter.drinkwater.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0275s;
import p0.C0313b;
import p0.C0315d;
import p0.C0316e;
import p0.C0317f;
import s0.AbstractC0363a;

/* loaded from: classes.dex */
public final class d extends C0275s {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f8e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f9f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f10g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f12k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f13l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f14m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f16o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f17p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f18q;

    /* renamed from: r, reason: collision with root package name */
    public int f19r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f20s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f22u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f23v;

    /* renamed from: w, reason: collision with root package name */
    public final C0317f f24w;

    /* renamed from: x, reason: collision with root package name */
    public final a f25x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f6y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f7z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f4A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f5B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public d(Context context, AttributeSet attributeSet) {
        super(R0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f8e = new LinkedHashSet();
        this.f9f = new LinkedHashSet();
        Context context2 = getContext();
        C0317f c0317f = new C0317f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f85a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c0317f.f3753a = a2;
        a2.setCallback(c0317f.f3752f);
        new C0316e(c0317f.f3753a.getConstantState());
        this.f24w = c0317f;
        this.f25x = new a(this);
        Context context3 = getContext();
        this.f13l = Q.c.a(this);
        this.f16o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0363a.f4104n;
        m.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        m.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0019l c0019l = new C0019l(context3, obtainStyledAttributes);
        this.f14m = c0019l.c(2);
        if (this.f13l != null && F1.d.c0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f5B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f13l = AbstractC0067d.k(context3, R.drawable.mtrl_checkbox_button);
                this.f15n = true;
                if (this.f14m == null) {
                    this.f14m = AbstractC0067d.k(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f17p = l.y(context3, c0019l, 3);
        this.f18q = m.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f11j = obtainStyledAttributes.getBoolean(9, false);
        this.f12k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0019l.k();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f19r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10g == null) {
            int C2 = F1.d.C(this, R.attr.colorControlActivated);
            int C3 = F1.d.C(this, R.attr.colorError);
            int C4 = F1.d.C(this, R.attr.colorSurface);
            int C5 = F1.d.C(this, R.attr.colorOnSurface);
            this.f10g = new ColorStateList(f4A, new int[]{F1.d.P(C4, C3, 1.0f), F1.d.P(C4, C2, 1.0f), F1.d.P(C4, C5, 0.54f), F1.d.P(C4, C5, 0.38f), F1.d.P(C4, C5, 0.38f)});
        }
        return this.f10g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f16o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0008b0 c0008b0;
        Drawable drawable = this.f13l;
        ColorStateList colorStateList3 = this.f16o;
        PorterDuff.Mode b2 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f13l = drawable;
        Drawable drawable2 = this.f14m;
        ColorStateList colorStateList4 = this.f17p;
        PorterDuff.Mode mode = this.f18q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f14m = drawable2;
        if (this.f15n) {
            C0317f c0317f = this.f24w;
            if (c0317f != null) {
                Drawable drawable3 = c0317f.f3753a;
                a aVar = this.f25x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f0a == null) {
                        aVar.f0a = new C0313b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f0a);
                }
                ArrayList arrayList = c0317f.f3751e;
                C0315d c0315d = c0317f.f3749b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (c0317f.f3751e.size() == 0 && (c0008b0 = c0317f.d) != null) {
                        c0315d.f3746b.removeListener(c0008b0);
                        c0317f.d = null;
                    }
                }
                Drawable drawable4 = c0317f.f3753a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f0a == null) {
                        aVar.f0a = new C0313b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f0a);
                } else if (aVar != null) {
                    if (c0317f.f3751e == null) {
                        c0317f.f3751e = new ArrayList();
                    }
                    if (!c0317f.f3751e.contains(aVar)) {
                        c0317f.f3751e.add(aVar);
                        if (c0317f.d == null) {
                            c0317f.d = new C0008b0(4, c0317f);
                        }
                        c0315d.f3746b.addListener(c0317f.d);
                    }
                }
            }
            Drawable drawable5 = this.f13l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c0317f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c0317f, false);
                ((AnimatedStateListDrawable) this.f13l).addTransition(R.id.indeterminate, R.id.unchecked, c0317f, false);
            }
        }
        Drawable drawable6 = this.f13l;
        if (drawable6 != null && (colorStateList2 = this.f16o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f14m;
        if (drawable7 != null && (colorStateList = this.f17p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f13l;
        Drawable drawable9 = this.f14m;
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
        return this.f13l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f14m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f17p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f18q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f16o;
    }

    public int getCheckedState() {
        return this.f19r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f12k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f19r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f16o == null && this.f17p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f6y);
        }
        if (this.f11j) {
            View.mergeDrawableStates(onCreateDrawableState, f7z);
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
        this.f20s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (m.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, RecyclerView.f1949A0);
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
        if (accessibilityNodeInfo != null && this.f11j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f12k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setCheckedState(cVar.f3a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3a = getCheckedState();
        return cVar;
    }

    @Override // l.C0275s, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0067d.k(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f14m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0067d.k(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f17p == colorStateList) {
            return;
        }
        this.f17p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f18q == mode) {
            return;
        }
        this.f18q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f16o == colorStateList) {
            return;
        }
        this.f16o = colorStateList;
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
        if (this.f19r != i) {
            this.f19r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f22u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f21t) {
                return;
            }
            this.f21t = true;
            LinkedHashSet linkedHashSet = this.f9f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f19r != 2 && (onCheckedChangeListener = this.f23v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f21t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f12k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f11j == z2) {
            return;
        }
        this.f11j = z2;
        refreshDrawableState();
        Iterator it = this.f8e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f23v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f22u = charSequence;
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

    @Override // l.C0275s, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f13l = drawable;
        this.f15n = false;
        a();
    }
}
