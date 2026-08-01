package C0;

import B.k;
import B.r;
import K.C0003b0;
import K.C0014m;
import T.e;
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
import com.football.transfertrivia.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0230q;
import p0.C0313b;
import p0.C0315d;
import p0.C0316e;
import p0.f;
import u0.AbstractC0338a;

/* loaded from: classes.dex */
public final class d extends C0230q {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f120e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f121f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f122g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f123j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f124k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f125l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f126m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f127n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f128o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f129p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f130q;

    /* renamed from: r, reason: collision with root package name */
    public int f131r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f132s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f133t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f134u;

    /* renamed from: v, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f135v;

    /* renamed from: w, reason: collision with root package name */
    public final f f136w;

    /* renamed from: x, reason: collision with root package name */
    public final a f137x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f118y = {R.attr.state_indeterminate};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f119z = {R.attr.state_error};

    /* renamed from: A, reason: collision with root package name */
    public static final int[][] f116A = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: B, reason: collision with root package name */
    public static final int f117B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    public d(Context context, AttributeSet attributeSet) {
        super(T0.a.a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f120e = new LinkedHashSet();
        this.f121f = new LinkedHashSet();
        Context context2 = getContext();
        f fVar = new f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = r.f69a;
        Drawable a2 = k.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        fVar.f3379a = a2;
        a2.setCallback(fVar.f3378f);
        new C0316e(fVar.f3379a.getConstantState());
        this.f136w = fVar;
        this.f137x = new a(this);
        Context context3 = getContext();
        this.f125l = Q.d.a(this);
        this.f128o = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0338a.f3794n;
        I0.k.a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        I0.k.b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0014m c0014m = new C0014m(context3, obtainStyledAttributes);
        this.f126m = c0014m.c(2);
        if (this.f125l != null && A.c.o0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f117B && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f125l = e.w(context3, R.drawable.mtrl_checkbox_button);
                this.f127n = true;
                if (this.f126m == null) {
                    this.f126m = e.w(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f129p = A.c.F(context3, c0014m, 3);
        this.f130q = I0.k.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.h = obtainStyledAttributes.getBoolean(10, false);
        this.i = obtainStyledAttributes.getBoolean(6, true);
        this.f123j = obtainStyledAttributes.getBoolean(9, false);
        this.f124k = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0014m.k();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.f131r;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f122g == null) {
            int D2 = A.c.D(this, R.attr.colorControlActivated);
            int D3 = A.c.D(this, R.attr.colorError);
            int D4 = A.c.D(this, R.attr.colorSurface);
            int D5 = A.c.D(this, R.attr.colorOnSurface);
            this.f122g = new ColorStateList(f116A, new int[]{A.c.e0(D4, D3, 1.0f), A.c.e0(D4, D2, 1.0f), A.c.e0(D4, D5, 0.54f), A.c.e0(D4, D5, 0.38f), A.c.e0(D4, D5, 0.38f)});
        }
        return this.f122g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f128o;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0003b0 c0003b0;
        Drawable drawable = this.f125l;
        ColorStateList colorStateList3 = this.f128o;
        PorterDuff.Mode b2 = Q.c.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b2 != null) {
                D.a.i(drawable, b2);
            }
        }
        this.f125l = drawable;
        Drawable drawable2 = this.f126m;
        ColorStateList colorStateList4 = this.f129p;
        PorterDuff.Mode mode = this.f130q;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f126m = drawable2;
        if (this.f127n) {
            f fVar = this.f136w;
            if (fVar != null) {
                Drawable drawable3 = fVar.f3379a;
                a aVar = this.f137x;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f112a == null) {
                        aVar.f112a = new C0313b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f112a);
                }
                ArrayList arrayList = fVar.f3377e;
                C0315d c0315d = fVar.f3375b;
                if (arrayList != null && aVar != null) {
                    arrayList.remove(aVar);
                    if (fVar.f3377e.size() == 0 && (c0003b0 = fVar.d) != null) {
                        c0315d.f3372b.removeListener(c0003b0);
                        fVar.d = null;
                    }
                }
                Drawable drawable4 = fVar.f3379a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f112a == null) {
                        aVar.f112a = new C0313b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f112a);
                } else if (aVar != null) {
                    if (fVar.f3377e == null) {
                        fVar.f3377e = new ArrayList();
                    }
                    if (!fVar.f3377e.contains(aVar)) {
                        fVar.f3377e.add(aVar);
                        if (fVar.d == null) {
                            fVar.d = new C0003b0(4, fVar);
                        }
                        c0315d.f3372b.addListener(fVar.d);
                    }
                }
            }
            Drawable drawable5 = this.f125l;
            if ((drawable5 instanceof AnimatedStateListDrawable) && fVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, fVar, false);
                ((AnimatedStateListDrawable) this.f125l).addTransition(R.id.indeterminate, R.id.unchecked, fVar, false);
            }
        }
        Drawable drawable6 = this.f125l;
        if (drawable6 != null && (colorStateList2 = this.f128o) != null) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f126m;
        if (drawable7 != null && (colorStateList = this.f129p) != null) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f125l;
        Drawable drawable9 = this.f126m;
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
        return this.f125l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f126m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f129p;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f130q;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f128o;
    }

    public int getCheckedState() {
        return this.f131r;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f124k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f131r == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.f128o == null && this.f129p == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f118y);
        }
        if (this.f123j) {
            View.mergeDrawableStates(onCreateDrawableState, f119z);
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
        this.f132s = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = Q.d.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (I0.k.e(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, RecyclerView.f1570A0);
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
        if (accessibilityNodeInfo != null && this.f123j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f124k));
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
        setCheckedState(cVar.f115a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f115a = getCheckedState();
        return cVar;
    }

    @Override // l.C0230q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(e.w(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f126m = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(e.w(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f129p == colorStateList) {
            return;
        }
        this.f129p = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f130q == mode) {
            return;
        }
        this.f130q = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f128o == colorStateList) {
            return;
        }
        this.f128o = colorStateList;
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
        if (this.f131r != i) {
            this.f131r = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f134u == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f133t) {
                return;
            }
            this.f133t = true;
            LinkedHashSet linkedHashSet = this.f121f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f131r != 2 && (onCheckedChangeListener = this.f135v) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f133t = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f124k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f123j == z2) {
            return;
        }
        this.f123j = z2;
        refreshDrawableState();
        Iterator it = this.f120e.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f135v = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f134u = charSequence;
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
            Q.c.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.c.c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // l.C0230q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f125l = drawable;
        this.f127n = false;
        a();
    }
}
