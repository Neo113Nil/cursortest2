package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import com.ionia.reidopitaco.libya.R;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class jr extends c3 {
    public final jq j;
    public final AccessibilityManager k;
    public final int[] l;
    public final Rect m;
    public final int n;
    public final float o;
    public ColorStateList p;
    public int q;
    public ColorStateList r;

    public jr(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.l = new int[]{android.R.attr.state_selected};
        this.m = new Rect();
        Context context2 = getContext();
        TypedArray J = m60.J(context2, attributeSet, jx.m, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (J.hasValue(0) && J.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.n = J.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        int i = 1;
        this.o = J.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (J.hasValue(2)) {
            this.p = ColorStateList.valueOf(J.getColor(2, 0));
        }
        this.q = J.getColor(4, 0);
        this.r = oo.o(context2, J, 5);
        this.k = (AccessibilityManager) context2.getSystemService("accessibility");
        jq jqVar = new jq(context2, null, R.attr.listPopupWindowStyle, 0);
        this.j = jqVar;
        jqVar.D = true;
        n4 n4Var = jqVar.E;
        n4Var.setFocusable(true);
        jqVar.t = this;
        n4Var.setInputMethodMode(2);
        jqVar.q(getAdapter());
        jqVar.u = new z4(i, this);
        if (J.hasValue(6)) {
            setSimpleItems(J.getResourceId(6, 0));
        }
        J.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.p;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b = b();
        return (b == null || !b.K) ? super.getHint() : b.getHint();
    }

    public float getPopupElevation() {
        return this.o;
    }

    public int getSimpleItemSelectedColor() {
        return this.q;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.r;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        jq jqVar = this.j;
        if (jqVar == null || !jqVar.E.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.K && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.j.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout b = b();
        if (b != null) {
            b.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i3 = 0;
            if (adapter != null && b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                jq jqVar = this.j;
                int min = Math.min(adapter.getCount(), Math.max(0, !jqVar.E.isShowing() ? -1 : jqVar.h.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = jqVar.E.getBackground();
                if (background != null) {
                    Rect rect = this.m;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.j.q(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        jq jqVar = this.j;
        if (jqVar != null) {
            jqVar.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.p = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof ls) {
            ((ls) dropDownBackground).r(this.p);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.j.v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout b = b();
        if (b != null) {
            b.u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.q = i;
        if (getAdapter() instanceof ir) {
            ((ir) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.r = colorStateList;
        if (getAdapter() instanceof ir) {
            ((ir) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ir(this, getContext(), this.n, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.j.d();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
