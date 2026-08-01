package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.f80;
import defpackage.j7;
import defpackage.kt;
import defpackage.op;
import defpackage.s50;
import defpackage.vj;
import defpackage.vs;
import defpackage.wz;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class NavigationMenuItemView extends vj implements kt {
    public static final int[] L = {R.attr.state_checked};
    public int A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public final CheckedTextView E;
    public FrameLayout F;
    public vs G;
    public ColorStateList H;
    public boolean I;
    public Drawable J;
    public final j7 K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = true;
        j7 j7Var = new j7(4, this);
        this.K = j7Var;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.ionia.reidopitaco.libya.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.ionia.reidopitaco.libya.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.ionia.reidopitaco.libya.R.id.design_menu_item_text);
        this.E = checkedTextView;
        f80.m(checkedTextView, j7Var);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.F == null) {
                this.F = (FrameLayout) ((ViewStub) findViewById(com.ionia.reidopitaco.libya.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.F.removeAllViews();
            this.F.addView(view);
        }
    }

    @Override // defpackage.kt
    public final void c(vs vsVar) {
        StateListDrawable stateListDrawable;
        this.G = vsVar;
        int i = vsVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(vsVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.ionia.reidopitaco.libya.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(vsVar.isCheckable());
        setChecked(vsVar.isChecked());
        setEnabled(vsVar.isEnabled());
        setTitle(vsVar.e);
        setIcon(vsVar.getIcon());
        setActionView(vsVar.getActionView());
        setContentDescription(vsVar.q);
        s50.a(this, vsVar.r);
        vs vsVar2 = this.G;
        CharSequence charSequence = vsVar2.e;
        CheckedTextView checkedTextView = this.E;
        if (charSequence == null && vsVar2.getIcon() == null && this.G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.F;
            if (frameLayout != null) {
                op opVar = (op) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) opVar).width = -1;
                this.F.setLayoutParams(opVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.F;
        if (frameLayout2 != null) {
            op opVar2 = (op) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) opVar2).width = -2;
            this.F.setLayoutParams(opVar2);
        }
    }

    @Override // defpackage.kt
    public vs getItemData() {
        return this.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        vs vsVar = this.G;
        if (vsVar != null && vsVar.isCheckable() && this.G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.C != z) {
            this.C = z;
            this.K.h(this.E, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.E;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.D) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.H);
            }
            int i = this.A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.B) {
            if (this.J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = wz.a;
                Drawable drawable2 = resources.getDrawable(com.ionia.reidopitaco.libya.R.drawable.navigation_empty_icon, theme);
                this.J = drawable2;
                if (drawable2 != null) {
                    int i2 = this.A;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.J;
        }
        this.E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.A = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.H = colorStateList;
        this.I = colorStateList != null;
        vs vsVar = this.G;
        if (vsVar != null) {
            setIcon(vsVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.B = z;
    }

    public void setTextAppearance(int i) {
        this.E.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.E.setText(charSequence);
    }
}
