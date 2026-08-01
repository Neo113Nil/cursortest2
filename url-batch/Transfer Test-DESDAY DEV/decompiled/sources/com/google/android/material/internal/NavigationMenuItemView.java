package com.google.android.material.internal;

import A0.f;
import B.k;
import B.r;
import D.a;
import I0.d;
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
import k.C0166o;
import k.InterfaceC0177z;
import l.C0241v0;
import l.d1;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends d implements InterfaceC0177z {

    /* renamed from: G, reason: collision with root package name */
    public static final int[] f1956G = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f1957A;

    /* renamed from: B, reason: collision with root package name */
    public C0166o f1958B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f1959C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1960D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f1961E;
    public final f F;

    /* renamed from: v, reason: collision with root package name */
    public int f1962v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1963w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1964x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1965y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckedTextView f1966z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1965y = true;
        f fVar = new f(2, this);
        this.F = fVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.football.transfertrivia.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.football.transfertrivia.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.football.transfertrivia.R.id.design_menu_item_text);
        this.f1966z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        T.l(checkedTextView, fVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1957A == null) {
                this.f1957A = (FrameLayout) ((ViewStub) findViewById(com.football.transfertrivia.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f1957A.removeAllViews();
            this.f1957A.addView(view);
        }
    }

    @Override // k.InterfaceC0177z
    public final void a(C0166o c0166o) {
        StateListDrawable stateListDrawable;
        this.f1958B = c0166o;
        int i = c0166o.f2783a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0166o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.football.transfertrivia.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1956G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = T.f372a;
            setBackground(stateListDrawable);
        }
        setCheckable(c0166o.isCheckable());
        setChecked(c0166o.isChecked());
        setEnabled(c0166o.isEnabled());
        setTitle(c0166o.f2786e);
        setIcon(c0166o.getIcon());
        setActionView(c0166o.getActionView());
        setContentDescription(c0166o.f2796q);
        d1.a(this, c0166o.f2797r);
        C0166o c0166o2 = this.f1958B;
        CharSequence charSequence = c0166o2.f2786e;
        CheckedTextView checkedTextView = this.f1966z;
        if (charSequence == null && c0166o2.getIcon() == null && this.f1958B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1957A;
            if (frameLayout != null) {
                C0241v0 c0241v0 = (C0241v0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0241v0).width = -1;
                this.f1957A.setLayoutParams(c0241v0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1957A;
        if (frameLayout2 != null) {
            C0241v0 c0241v02 = (C0241v0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0241v02).width = -2;
            this.f1957A.setLayoutParams(c0241v02);
        }
    }

    @Override // k.InterfaceC0177z
    public C0166o getItemData() {
        return this.f1958B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0166o c0166o = this.f1958B;
        if (c0166o != null && c0166o.isCheckable() && this.f1958B.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1956G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1964x != z2) {
            this.f1964x = z2;
            this.F.h(this.f1966z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1966z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f1965y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1960D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f1959C);
            }
            int i = this.f1962v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1963w) {
            if (this.f1961E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = r.f69a;
                Drawable a2 = k.a(resources, com.football.transfertrivia.R.drawable.navigation_empty_icon, theme);
                this.f1961E = a2;
                if (a2 != null) {
                    int i2 = this.f1962v;
                    a2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1961E;
        }
        this.f1966z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1966z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1962v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1959C = colorStateList;
        this.f1960D = colorStateList != null;
        C0166o c0166o = this.f1958B;
        if (c0166o != null) {
            setIcon(c0166o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1966z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1963w = z2;
    }

    public void setTextAppearance(int i) {
        this.f1966z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1966z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1966z.setText(charSequence);
    }
}
