package com.google.android.material.internal;

import B.k;
import B.r;
import B0.a;
import B0.g;
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
import k.C0160o;
import k.InterfaceC0171z;
import l.C0270x0;
import l.e1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends g implements InterfaceC0171z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1724G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1725A;

    /* renamed from: B, reason: collision with root package name */
    public C0160o f1726B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1727C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1728D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1729E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1730v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1731w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1732x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1733y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1734z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1733y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.linetic.luckycross.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.linetic.luckycross.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.linetic.luckycross.R.id.design_menu_item_text);
        this.f1734z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1725A == null) {
                this.f1725A = (FrameLayout) ((ViewStub) findViewById(com.linetic.luckycross.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1725A.removeAllViews();
            this.f1725A.addView(view);
        }
    }

    @Override // k.InterfaceC0171z
    public final void a(C0160o c0160o) {
        StateListDrawable stateListDrawable;
        this.f1726B = c0160o;
        int i = c0160o.f2715a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0160o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.linetic.luckycross.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1724G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f381a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0160o.isCheckable());
        setChecked(c0160o.isChecked());
        setEnabled(c0160o.isEnabled());
        setTitle(c0160o.f2718e);
        setIcon(c0160o.getIcon());
        setActionView(c0160o.getActionView());
        setContentDescription(c0160o.f2728q);
        e1.a(this, c0160o.f2729r);
        C0160o c0160o2 = this.f1726B;
        CharSequence charSequence = c0160o2.f2718e;
        CheckedTextView checkedTextView = this.f1734z;
        if (charSequence == null && c0160o2.getIcon() == null && this.f1726B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1725A;
            if (frameLayout != null) {
                C0270x0 c0270x0 = (C0270x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0270x0).width = -1;
                this.f1725A.setLayoutParams(c0270x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1725A;
        if (frameLayout2 != null) {
            C0270x0 c0270x02 = (C0270x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0270x02).width = -2;
            this.f1725A.setLayoutParams(c0270x02);
        }
    }

    @Override // k.InterfaceC0171z
    public C0160o getItemData() {
        return this.f1726B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0160o c0160o = this.f1726B;
        if (c0160o != null && c0160o.isCheckable() && this.f1726B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1724G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1732x != z2) {
            this.f1732x = z2;
            this.F.h(this.f1734z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1734z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1733y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1728D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1727C);
            }
            int i = this.f1730v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1731w) {
            if (this.f1729E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f43a;
                Drawable a2 = k.a(resources, com.linetic.luckycross.R.drawable.navigation_empty_icon, theme);
                this.f1729E = a2;
                if (a2 != null) {
                    int i2 = this.f1730v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1729E;
        }
        this.f1734z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1734z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1730v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1727C = colorStateList;
        this.f1728D = colorStateList != null;
        C0160o c0160o = this.f1726B;
        if (c0160o != null) {
            setIcon(c0160o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1734z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1731w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1734z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1734z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1734z.setText(charSequence);
    }
}
