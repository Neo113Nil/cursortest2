package com.google.android.material.internal;

import B.k;
import B.r;
import G0.a;
import G0.f;
import K.T;
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
import java.util.WeakHashMap;
import k.C0204o;
import k.InterfaceC0215z;
import l.C0286x0;
import l.f1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0215z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f2323G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f2324A;

    /* renamed from: B, reason: collision with root package name */
    public C0204o f2325B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f2326C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f2327D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f2328E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f2329v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2330w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2331x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f2332y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f2333z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2332y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.luckycounter.drinkwater.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.luckycounter.drinkwater.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.luckycounter.drinkwater.R.id.design_menu_item_text);
        this.f2333z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2324A == null) {
                this.f2324A = (FrameLayout) ((ViewStub) findViewById(com.luckycounter.drinkwater.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2324A.removeAllViews();
            this.f2324A.addView(view);
        }
    }

    @Override // k.InterfaceC0215z
    public final void a(C0204o c0204o) {
        StateListDrawable stateListDrawable;
        this.f2325B = c0204o;
        int i = c0204o.f3214a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0204o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.luckycounter.drinkwater.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2323G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f633a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0204o.isCheckable());
        setChecked(c0204o.isChecked());
        setEnabled(c0204o.isEnabled());
        setTitle(c0204o.f3217e);
        setIcon(c0204o.getIcon());
        setActionView(c0204o.getActionView());
        setContentDescription(c0204o.f3227q);
        f1.a(this, c0204o.f3228r);
        C0204o c0204o2 = this.f2325B;
        CharSequence charSequence = c0204o2.f3217e;
        CheckedTextView checkedTextView = this.f2333z;
        if (charSequence == null && c0204o2.getIcon() == null && this.f2325B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f2324A;
            if (frameLayout != null) {
                C0286x0 c0286x0 = (C0286x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0286x0).width = -1;
                this.f2324A.setLayoutParams(c0286x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2324A;
        if (frameLayout2 != null) {
            C0286x0 c0286x02 = (C0286x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0286x02).width = -2;
            this.f2324A.setLayoutParams(c0286x02);
        }
    }

    @Override // k.InterfaceC0215z
    public C0204o getItemData() {
        return this.f2325B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0204o c0204o = this.f2325B;
        if (c0204o != null && c0204o.isCheckable() && this.f2325B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2323G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2331x != z2) {
            this.f2331x = z2;
            this.F.h(this.f2333z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2333z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2332y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2327D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f2326C);
            }
            int i = this.f2329v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f2330w) {
            if (this.f2328E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f85a;
                Drawable a2 = k.a(resources, com.luckycounter.drinkwater.R.drawable.navigation_empty_icon, theme);
                this.f2328E = a2;
                if (a2 != null) {
                    int i2 = this.f2329v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f2328E;
        }
        this.f2333z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f2333z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f2329v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2326C = colorStateList;
        this.f2327D = colorStateList != null;
        C0204o c0204o = this.f2325B;
        if (c0204o != null) {
            setIcon(c0204o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f2333z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2330w = z2;
    }

    public void setTextAppearance(int i) {
        this.f2333z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2333z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2333z.setText(charSequence);
    }
}
