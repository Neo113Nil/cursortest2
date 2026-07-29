package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.devanos.nilufar.usmonova.R;
import o.AZ;
import o.AbstractC1468m00;
import o.AbstractC1886sL;
import o.B1;
import o.C0942e00;
import o.C1006f;
import o.C1864s1;
import o.C2128w1;
import o.EB;
import o.InterfaceC2339zC;
import o.MenuC0825cC;
import o.ViewOnClickListenerC1207i1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public final int A;
    public final C1006f h;
    public final Context i;
    public ActionMenuView j;
    public C2128w1 k;
    public int l;
    public C0942e00 m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3o;
    public CharSequence p;
    public CharSequence q;
    public View r;
    public View s;
    public View t;
    public LinearLayout u;
    public TextView v;
    public TextView w;
    public final int x;
    public final int y;
    public boolean z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.h = new C1006f(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.i = context;
        } else {
            this.i = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1886sL.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : EB.t(context, resourceId));
        this.x = obtainStyledAttributes.getResourceId(5, 0);
        this.y = obtainStyledAttributes.getResourceId(4, 0);
        this.l = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.A = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final void c(B1 b1) {
        View view = this.r;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.A, (ViewGroup) this, false);
            this.r = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.r);
        }
        View findViewById = this.r.findViewById(R.id.action_mode_close_button);
        this.s = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC1207i1(0, b1));
        MenuC0825cC c = b1.c();
        C2128w1 c2128w1 = this.k;
        if (c2128w1 != null) {
            c2128w1.d();
            C1864s1 c1864s1 = c2128w1.A;
            if (c1864s1 != null && c1864s1.b()) {
                c1864s1.i.dismiss();
            }
        }
        C2128w1 c2128w12 = new C2128w1(getContext());
        this.k = c2128w12;
        c2128w12.s = true;
        c2128w12.t = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c.b(this.k, this.i);
        C2128w1 c2128w13 = this.k;
        InterfaceC2339zC interfaceC2339zC = c2128w13.f236o;
        if (interfaceC2339zC == null) {
            InterfaceC2339zC interfaceC2339zC2 = (InterfaceC2339zC) c2128w13.k.inflate(c2128w13.m, (ViewGroup) this, false);
            c2128w13.f236o = interfaceC2339zC2;
            interfaceC2339zC2.a(c2128w13.j);
            c2128w13.c();
        }
        InterfaceC2339zC interfaceC2339zC3 = c2128w13.f236o;
        if (interfaceC2339zC != interfaceC2339zC3) {
            ((ActionMenuView) interfaceC2339zC3).setPresenter(c2128w13);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC2339zC3;
        this.j = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.j, layoutParams);
    }

    public final void d() {
        if (this.u == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.u = linearLayout;
            this.v = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.w = (TextView) this.u.findViewById(R.id.action_bar_subtitle);
            int i = this.x;
            if (i != 0) {
                this.v.setTextAppearance(getContext(), i);
            }
            int i2 = this.y;
            if (i2 != 0) {
                this.w.setTextAppearance(getContext(), i2);
            }
        }
        this.v.setText(this.p);
        this.w.setText(this.q);
        boolean isEmpty = TextUtils.isEmpty(this.p);
        boolean isEmpty2 = TextUtils.isEmpty(this.q);
        this.w.setVisibility(!isEmpty2 ? 0 : 8);
        this.u.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.u.getParent() == null) {
            addView(this.u);
        }
    }

    public final void e() {
        removeAllViews();
        this.t = null;
        this.j = null;
        this.k = null;
        View view = this.s;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.m != null ? this.h.a : getVisibility();
    }

    public int getContentHeight() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.q;
    }

    public CharSequence getTitle() {
        return this.p;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0942e00 c0942e00 = this.m;
            if (c0942e00 != null) {
                c0942e00.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0942e00 i(long j, int i) {
        C0942e00 c0942e00 = this.m;
        if (c0942e00 != null) {
            c0942e00.b();
        }
        C1006f c1006f = this.h;
        if (i != 0) {
            C0942e00 a = AZ.a(this);
            a.a(0.0f);
            a.c(j);
            ((ActionBarContextView) c1006f.c).m = a;
            c1006f.a = i;
            a.d(c1006f);
            return a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0942e00 a2 = AZ.a(this);
        a2.a(1.0f);
        a2.c(j);
        ((ActionBarContextView) c1006f.c).m = a2;
        c1006f.a = i;
        a2.d(c1006f);
        return a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC1886sL.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C2128w1 c2128w1 = this.k;
        if (c2128w1 != null) {
            Configuration configuration2 = c2128w1.i.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c2128w1.w = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0825cC menuC0825cC = c2128w1.j;
            if (menuC0825cC != null) {
                menuC0825cC.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2128w1 c2128w1 = this.k;
        if (c2128w1 != null) {
            c2128w1.d();
            C1864s1 c1864s1 = this.k.A;
            if (c1864s1 == null || !c1864s1.b()) {
                return;
            }
            c1864s1.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3o = false;
        }
        if (!this.f3o) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3o = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3o = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = AbstractC1468m00.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.r;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int g = g(this.r, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? g - i6 : g + i6;
        }
        LinearLayout linearLayout = this.u;
        if (linearLayout != null && this.t == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.u, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.t;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.j;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.l;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.r;
        if (view != null) {
            int f = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.r.getLayoutParams();
            paddingLeft = f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.j;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.j, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.u;
        if (linearLayout != null && this.t == null) {
            if (this.z) {
                this.u.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.u.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.u.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.t;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.t.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.l > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.n = false;
        }
        if (!this.n) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.n = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.n = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.l = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.t;
        if (view2 != null) {
            removeView(view2);
        }
        this.t = view;
        if (view != null && (linearLayout = this.u) != null) {
            removeView(linearLayout);
            this.u = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.q = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.p = charSequence;
        d();
        AZ.i(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.z) {
            requestLayout();
        }
        this.z = z;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
