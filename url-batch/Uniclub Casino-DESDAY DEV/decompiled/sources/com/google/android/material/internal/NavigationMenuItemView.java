package com.google.android.material.internal;

import B.k;
import B.r;
import D0.a;
import D0.f;
import K.S;
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
import k.C0170o;
import k.InterfaceC0181z;
import l.C0259x0;
import l.e1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements InterfaceC0181z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1731G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1732A;

    /* renamed from: B, reason: collision with root package name */
    public C0170o f1733B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1734C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1735D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1736E;
    public final a F;

    /* renamed from: v, reason: collision with root package name */
    public int f1737v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1738w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1739x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1740y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1741z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1740y = true;
        a aVar = new a(1, this);
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.fortuneodd.shadegrid.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.fortuneodd.shadegrid.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.fortuneodd.shadegrid.R.id.design_menu_item_text);
        this.f1741z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        S.l(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1732A == null) {
                this.f1732A = (FrameLayout) ((ViewStub) findViewById(com.fortuneodd.shadegrid.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1732A.removeAllViews();
            this.f1732A.addView(view);
        }
    }

    @Override // k.InterfaceC0181z
    public final void a(C0170o c0170o) {
        StateListDrawable stateListDrawable;
        this.f1733B = c0170o;
        int i = c0170o.f2718a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0170o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.fortuneodd.shadegrid.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1731G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = S.f360a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0170o.isCheckable());
        setChecked(c0170o.isChecked());
        setEnabled(c0170o.isEnabled());
        setTitle(c0170o.f2721e);
        setIcon(c0170o.getIcon());
        setActionView(c0170o.getActionView());
        setContentDescription(c0170o.f2731q);
        e1.a(this, c0170o.f2732r);
        C0170o c0170o2 = this.f1733B;
        CharSequence charSequence = c0170o2.f2721e;
        CheckedTextView checkedTextView = this.f1741z;
        if (charSequence == null && c0170o2.getIcon() == null && this.f1733B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1732A;
            if (frameLayout != null) {
                C0259x0 c0259x0 = (C0259x0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0259x0).width = -1;
                this.f1732A.setLayoutParams(c0259x0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1732A;
        if (frameLayout2 != null) {
            C0259x0 c0259x02 = (C0259x0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0259x02).width = -2;
            this.f1732A.setLayoutParams(c0259x02);
        }
    }

    @Override // k.InterfaceC0181z
    public C0170o getItemData() {
        return this.f1733B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0170o c0170o = this.f1733B;
        if (c0170o != null && c0170o.isCheckable() && this.f1733B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1731G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1739x != z2) {
            this.f1739x = z2;
            this.F.h(this.f1741z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1741z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1740y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1735D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                D.a.h(drawable, this.f1734C);
            }
            int i = this.f1737v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1738w) {
            if (this.f1736E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f41a;
                Drawable a2 = k.a(resources, com.fortuneodd.shadegrid.R.drawable.navigation_empty_icon, theme);
                this.f1736E = a2;
                if (a2 != null) {
                    int i2 = this.f1737v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1736E;
        }
        this.f1741z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1741z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1737v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1734C = colorStateList;
        this.f1735D = colorStateList != null;
        C0170o c0170o = this.f1733B;
        if (c0170o != null) {
            setIcon(c0170o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1741z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1738w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1741z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1741z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1741z.setText(charSequence);
    }
}
