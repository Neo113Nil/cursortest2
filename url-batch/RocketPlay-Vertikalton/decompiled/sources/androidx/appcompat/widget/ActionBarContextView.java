package androidx.appcompat.widget;

import K.C0010c0;
import K.T;
import a1.AbstractC0067d;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import com.luckycounter.drinkwater.R;
import f.a;
import j.AbstractC0175a;
import k.InterfaceC0185A;
import k.MenuC0202m;
import l.C0239a;
import l.C0251g;
import l.C0259k;
import l.j1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0239a f1674a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1675b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1676c;
    public C0259k d;

    /* renamed from: e, reason: collision with root package name */
    public int f1677e;

    /* renamed from: f, reason: collision with root package name */
    public C0010c0 f1678f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1679g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1680j;

    /* renamed from: k, reason: collision with root package name */
    public View f1681k;

    /* renamed from: l, reason: collision with root package name */
    public View f1682l;

    /* renamed from: m, reason: collision with root package name */
    public View f1683m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1684n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1685o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1686p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1687q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1688r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1689s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1690t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1674a = new C0239a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1675b = context;
        } else {
            this.f1675b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0067d.k(context, resourceId));
        this.f1687q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1688r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1677e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1690t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i2, int i3, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0175a abstractC0175a) {
        View view = this.f1681k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1690t, (ViewGroup) this, false);
            this.f1681k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1681k);
        }
        View findViewById = this.f1681k.findViewById(R.id.action_mode_close_button);
        this.f1682l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0175a));
        MenuC0202m c2 = abstractC0175a.c();
        C0259k c0259k = this.d;
        if (c0259k != null) {
            c0259k.f();
            C0251g c0251g = c0259k.f3464t;
            if (c0251g != null && c0251g.b()) {
                c0251g.i.dismiss();
            }
        }
        C0259k c0259k2 = new C0259k(getContext());
        this.d = c0259k2;
        c0259k2.f3456l = true;
        c0259k2.f3457m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1675b);
        C0259k c0259k3 = this.d;
        InterfaceC0185A interfaceC0185A = c0259k3.h;
        if (interfaceC0185A == null) {
            InterfaceC0185A interfaceC0185A2 = (InterfaceC0185A) c0259k3.d.inflate(c0259k3.f3452f, (ViewGroup) this, false);
            c0259k3.h = interfaceC0185A2;
            interfaceC0185A2.c(c0259k3.f3450c);
            c0259k3.c();
        }
        InterfaceC0185A interfaceC0185A3 = c0259k3.h;
        if (interfaceC0185A != interfaceC0185A3) {
            ((ActionMenuView) interfaceC0185A3).setPresenter(c0259k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0185A3;
        this.f1676c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1676c, layoutParams);
    }

    public final void d() {
        if (this.f1684n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1684n = linearLayout;
            this.f1685o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1686p = (TextView) this.f1684n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1687q;
            if (i != 0) {
                this.f1685o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1688r;
            if (i2 != 0) {
                this.f1686p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1685o.setText(this.i);
        this.f1686p.setText(this.f1680j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1680j);
        this.f1686p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1684n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1684n.getParent() == null) {
            addView(this.f1684n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1683m = null;
        this.f1676c = null;
        this.d = null;
        View view = this.f1682l;
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
        return this.f1678f != null ? this.f1674a.f3396b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1677e;
    }

    public CharSequence getSubtitle() {
        return this.f1680j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0010c0 c0010c0 = this.f1678f;
            if (c0010c0 != null) {
                c0010c0.b();
            }
            super.setVisibility(i);
        }
    }

    public final C0010c0 i(int i, long j2) {
        C0010c0 c0010c0 = this.f1678f;
        if (c0010c0 != null) {
            c0010c0.b();
        }
        C0239a c0239a = this.f1674a;
        if (i != 0) {
            C0010c0 a2 = T.a(this);
            a2.a(RecyclerView.f1949A0);
            a2.c(j2);
            c0239a.f3397c.f1678f = a2;
            c0239a.f3396b = i;
            a2.d(c0239a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(RecyclerView.f1949A0);
        }
        C0010c0 a3 = T.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0239a.f3397c.f1678f = a3;
        c0239a.f3396b = i;
        a3.d(c0239a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f2559a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0259k c0259k = this.d;
        if (c0259k != null) {
            Configuration configuration2 = c0259k.f3449b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0259k.f3460p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0202m menuC0202m = c0259k.f3450c;
            if (menuC0202m != null) {
                menuC0202m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0259k c0259k = this.d;
        if (c0259k != null) {
            c0259k.f();
            C0251g c0251g = this.d.f3464t;
            if (c0251g == null || !c0251g.b()) {
                return;
            }
            c0251g.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = j1.f3445a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1681k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1681k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1681k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1684n;
        if (linearLayout != null && this.f1683m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1684n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1683m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1676c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z4);
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
        int i3 = this.f1677e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1681k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1681k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1676c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1676c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1684n;
        if (linearLayout != null && this.f1683m == null) {
            if (this.f1689s) {
                this.f1684n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1684n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1684n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1683m;
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
            this.f1683m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1677e > 0) {
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
            this.f1679g = false;
        }
        if (!this.f1679g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1679g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1679g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1677e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1683m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1683m = view;
        if (view != null && (linearLayout = this.f1684n) != null) {
            removeView(linearLayout);
            this.f1684n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1680j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        T.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1689s) {
            requestLayout();
        }
        this.f1689s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
