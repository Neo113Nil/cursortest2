package defpackage;

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
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.ionia.reidopitaco.libya.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ds extends f3 {
    public static final int[] D = {R.attr.state_indeterminate};
    public static final int[] E = {R.attr.state_error};
    public static final int[][] F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public CompoundButton.OnCheckedChangeListener A;
    public final u2 B;
    public final bs C;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public ColorStateList l;
    public boolean m;
    public boolean n;
    public boolean o;
    public CharSequence p;
    public Drawable q;
    public Drawable r;
    public boolean s;
    public ColorStateList t;
    public ColorStateList u;
    public PorterDuff.Mode v;
    public int w;
    public int[] x;
    public boolean y;
    public CharSequence z;

    public ds(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
        Context context2 = getContext();
        u2 u2Var = new u2(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = wz.a;
        Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        u2Var.f = drawable;
        drawable.setCallback(u2Var.k);
        new t2(u2Var.f.getConstantState());
        this.B = u2Var;
        this.C = new bs(this);
        Context context3 = getContext();
        this.q = getButtonDrawable();
        this.t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        y5 K = m60.K(context3, attributeSet, jx.t, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArray = (TypedArray) K.a;
        this.r = K.f(2);
        if (this.q != null && m60.S(context3.getTheme(), R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArray.getResourceId(0, 0);
            int resourceId2 = typedArray.getResourceId(1, 0);
            if (resourceId == G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.q = vv.t(context3, R.drawable.mtrl_checkbox_button);
                this.s = true;
                if (this.r == null) {
                    this.r = vv.t(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.u = oo.n(context3, K, 3);
        this.v = g90.b(typedArray.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.m = typedArray.getBoolean(11, false);
        this.n = typedArray.getBoolean(6, true);
        this.o = typedArray.getBoolean(9, false);
        this.p = typedArray.getText(8);
        if (typedArray.hasValue(7)) {
            setCheckedState(typedArray.getInt(7, 0));
        }
        if (typedArray.hasValue(10)) {
            setRippleColor(oo.n(context3, K, 10));
        }
        K.n();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.l == null) {
            int c0 = g8.c0(getContext(), m60.W(this, R.attr.colorControlActivated));
            int c02 = g8.c0(getContext(), m60.W(this, R.attr.colorError));
            int c03 = g8.c0(getContext(), m60.W(this, R.attr.colorSurface));
            int c04 = g8.c0(getContext(), m60.W(this, R.attr.colorOnSurface));
            this.l = new ColorStateList(F, new int[]{g8.V(c03, c02, 1.0f), g8.V(c03, c0, 1.0f), g8.V(c03, c04, 0.54f), g8.V(c03, c04, 0.38f), g8.V(c03, c04, 0.38f)});
        }
        return this.l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        w0 w0Var;
        Drawable drawable = this.q;
        ColorStateList colorStateList3 = this.t;
        PorterDuff.Mode buttonTintMode = getButtonTintMode();
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (buttonTintMode != null) {
                drawable.setTintMode(buttonTintMode);
            }
        }
        this.q = drawable;
        Drawable drawable2 = this.r;
        ColorStateList colorStateList4 = this.u;
        PorterDuff.Mode mode = this.v;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                drawable2.setTintMode(mode);
            }
        }
        this.r = drawable2;
        if (this.s) {
            u2 u2Var = this.B;
            if (u2Var != null) {
                s2 s2Var = u2Var.g;
                Drawable drawable3 = u2Var.f;
                bs bsVar = this.C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (bsVar.a == null) {
                        bsVar.a = new q2(bsVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(bsVar.a);
                }
                ArrayList arrayList = u2Var.j;
                if (arrayList != null && bsVar != null) {
                    arrayList.remove(bsVar);
                    if (u2Var.j.size() == 0 && (w0Var = u2Var.i) != null) {
                        s2Var.b.removeListener(w0Var);
                        u2Var.i = null;
                    }
                }
                Drawable drawable4 = u2Var.f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (bsVar.a == null) {
                        bsVar.a = new q2(bsVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(bsVar.a);
                } else if (bsVar != null) {
                    if (u2Var.j == null) {
                        u2Var.j = new ArrayList();
                    }
                    if (!u2Var.j.contains(bsVar)) {
                        u2Var.j.add(bsVar);
                        if (u2Var.i == null) {
                            u2Var.i = new w0(1, u2Var);
                        }
                        s2Var.b.addListener(u2Var.i);
                    }
                }
            }
            Drawable drawable5 = this.q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && u2Var != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, u2Var, false);
                ((AnimatedStateListDrawable) this.q).addTransition(R.id.indeterminate, R.id.unchecked, u2Var, false);
            }
        }
        Drawable drawable6 = this.q;
        if (drawable6 != null && (colorStateList2 = this.t) != null) {
            drawable6.setTintList(colorStateList2);
        }
        Drawable drawable7 = this.r;
        if (drawable7 != null && (colorStateList = this.u) != null) {
            drawable7.setTintList(colorStateList);
        }
        Drawable drawable8 = this.q;
        Drawable drawable9 = this.r;
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
                float f = intrinsicWidth / intrinsicHeight;
                if (f >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f * intrinsicHeight);
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
        return this.q;
    }

    public Drawable getButtonIconDrawable() {
        return this.r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.t;
    }

    public int getCheckedState() {
        return this.w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.m && this.t == null && this.u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (this.o) {
            View.mergeDrawableStates(onCreateDrawableState, E);
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
        this.x = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.n || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof cs)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cs csVar = (cs) parcelable;
        super.onRestoreInstanceState(csVar.getSuperState());
        setCheckedState(csVar.f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        cs csVar = new cs(super.onSaveInstanceState());
        csVar.f = getCheckedState();
        return csVar;
    }

    @Override // defpackage.f3, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(vv.t(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.r = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(vv.t(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.u == colorStateList) {
            return;
        }
        this.u = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.v == mode) {
            return;
        }
        this.v = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.t == colorStateList) {
            return;
        }
        this.t = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.n = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.w != i) {
            this.w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.y) {
                return;
            }
            this.y = true;
            LinkedHashSet linkedHashSet = this.k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    l8.c();
                    return;
                }
            }
            if (this.w != 2 && (onCheckedChangeListener = this.A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.y = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            l8.c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.m = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.f3, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.q = drawable;
        this.s = false;
        a();
    }
}
