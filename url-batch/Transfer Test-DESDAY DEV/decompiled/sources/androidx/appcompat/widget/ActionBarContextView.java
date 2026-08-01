package androidx.appcompat.widget;

import K.T;
import K.c0;
import T.e;
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
import com.football.transfertrivia.R;
import com.google.android.material.datepicker.j;
import f.a;
import j.AbstractC0144a;
import k.InterfaceC0147A;
import k.MenuC0164m;
import l.C0198a;
import l.C0210g;
import l.C0218k;
import l.h1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0198a f1285a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1286b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f1287c;
    public C0218k d;

    /* renamed from: e, reason: collision with root package name */
    public int f1288e;

    /* renamed from: f, reason: collision with root package name */
    public c0 f1289f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1290g;
    public boolean h;
    public CharSequence i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1291j;

    /* renamed from: k, reason: collision with root package name */
    public View f1292k;

    /* renamed from: l, reason: collision with root package name */
    public View f1293l;

    /* renamed from: m, reason: collision with root package name */
    public View f1294m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f1295n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f1296o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f1297p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1298q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1299r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1300s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1301t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1285a = new C0198a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1286b = context;
        } else {
            this.f1286b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : e.w(context, resourceId));
        this.f1298q = obtainStyledAttributes.getResourceId(5, 0);
        this.f1299r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1288e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1301t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
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

    public final void c(AbstractC0144a abstractC0144a) {
        View view = this.f1292k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1301t, (ViewGroup) this, false);
            this.f1292k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1292k);
        }
        View findViewById = this.f1292k.findViewById(R.id.action_mode_close_button);
        this.f1293l = findViewById;
        findViewById.setOnClickListener(new j(2, abstractC0144a));
        MenuC0164m c2 = abstractC0144a.c();
        C0218k c0218k = this.d;
        if (c0218k != null) {
            c0218k.e();
            C0210g c0210g = c0218k.f3032t;
            if (c0210g != null && c0210g.b()) {
                c0210g.i.dismiss();
            }
        }
        C0218k c0218k2 = new C0218k(getContext());
        this.d = c0218k2;
        c0218k2.f3024l = true;
        c0218k2.f3025m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c2.b(this.d, this.f1286b);
        C0218k c0218k3 = this.d;
        InterfaceC0147A interfaceC0147A = c0218k3.h;
        if (interfaceC0147A == null) {
            InterfaceC0147A interfaceC0147A2 = (InterfaceC0147A) c0218k3.d.inflate(c0218k3.f3020f, (ViewGroup) this, false);
            c0218k3.h = interfaceC0147A2;
            interfaceC0147A2.c(c0218k3.f3018c);
            c0218k3.c();
        }
        InterfaceC0147A interfaceC0147A3 = c0218k3.h;
        if (interfaceC0147A != interfaceC0147A3) {
            ((ActionMenuView) interfaceC0147A3).setPresenter(c0218k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0147A3;
        this.f1287c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1287c, layoutParams);
    }

    public final void d() {
        if (this.f1295n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1295n = linearLayout;
            this.f1296o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1297p = (TextView) this.f1295n.findViewById(R.id.action_bar_subtitle);
            int i = this.f1298q;
            if (i != 0) {
                this.f1296o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1299r;
            if (i2 != 0) {
                this.f1297p.setTextAppearance(getContext(), i2);
            }
        }
        this.f1296o.setText(this.i);
        this.f1297p.setText(this.f1291j);
        boolean isEmpty = TextUtils.isEmpty(this.i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1291j);
        this.f1297p.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1295n.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1295n.getParent() == null) {
            addView(this.f1295n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f1294m = null;
        this.f1287c = null;
        this.d = null;
        View view = this.f1293l;
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
        return this.f1289f != null ? this.f1285a.f2967b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1288e;
    }

    public CharSequence getSubtitle() {
        return this.f1291j;
    }

    public CharSequence getTitle() {
        return this.i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            c0 c0Var = this.f1289f;
            if (c0Var != null) {
                c0Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final c0 i(int i, long j2) {
        c0 c0Var = this.f1289f;
        if (c0Var != null) {
            c0Var.b();
        }
        C0198a c0198a = this.f1285a;
        if (i != 0) {
            c0 a2 = T.a(this);
            a2.a(RecyclerView.f1570A0);
            a2.c(j2);
            c0198a.f2968c.f1289f = a2;
            c0198a.f2967b = i;
            a2.d(c0198a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(RecyclerView.f1570A0);
        }
        c0 a3 = T.a(this);
        a3.a(1.0f);
        a3.c(j2);
        c0198a.f2968c.f1289f = a3;
        c0198a.f2967b = i;
        a3.d(c0198a);
        return a3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.f2137a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0218k c0218k = this.d;
        if (c0218k != null) {
            Configuration configuration2 = c0218k.f3017b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0218k.f3028p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC0164m menuC0164m = c0218k.f3018c;
            if (menuC0164m != null) {
                menuC0164m.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0218k c0218k = this.d;
        if (c0218k != null) {
            c0218k.e();
            C0210g c0210g = this.d.f3032t;
            if (c0210g == null || !c0210g.b()) {
                return;
            }
            c0210g.i.dismiss();
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
        boolean z3 = h1.f3011a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1292k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1292k.getLayoutParams();
            int i5 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z4 ? paddingRight - i5 : paddingRight + i5;
            int g2 = g(this.f1292k, i7, paddingTop, paddingTop2, z4) + i7;
            paddingRight = z4 ? g2 - i6 : g2 + i6;
        }
        LinearLayout linearLayout = this.f1295n;
        if (linearLayout != null && this.f1294m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f1295n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f1294m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1287c;
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
        int i3 = this.f1288e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f1292k;
        if (view != null) {
            int f2 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1292k.getLayoutParams();
            paddingLeft = f2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1287c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f1287c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1295n;
        if (linearLayout != null && this.f1294m == null) {
            if (this.f1300s) {
                this.f1295n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1295n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1295n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1294m;
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
            this.f1294m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1288e > 0) {
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
            this.f1290g = false;
        }
        if (!this.f1290g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1290g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1290g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1288e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1294m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1294m = view;
        if (view != null && (linearLayout = this.f1295n) != null) {
            removeView(linearLayout);
            this.f1295n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1291j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
        T.m(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1300s) {
            requestLayout();
        }
        this.f1300s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
