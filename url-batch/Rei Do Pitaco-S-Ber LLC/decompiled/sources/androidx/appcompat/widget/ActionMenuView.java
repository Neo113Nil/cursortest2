package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.e1;
import defpackage.h1;
import defpackage.h90;
import defpackage.j0;
import defpackage.k1;
import defpackage.k50;
import defpackage.l1;
import defpackage.lt;
import defpackage.m1;
import defpackage.n1;
import defpackage.op;
import defpackage.pp;
import defpackage.rs;
import defpackage.ss;
import defpackage.tg;
import defpackage.vs;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ActionMenuView extends pp implements rs, lt {
    public boolean A;
    public int B;
    public final int C;
    public final int D;
    public n1 E;
    public ss u;
    public Context v;
    public int w;
    public boolean x;
    public k1 y;
    public k50 z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.C = (int) (56.0f * f);
        this.D = (int) (f * 4.0f);
        this.v = context;
        this.w = 0;
    }

    public static m1 j() {
        m1 m1Var = new m1(-2, -2);
        m1Var.a = false;
        ((LinearLayout.LayoutParams) m1Var).gravity = 16;
        return m1Var;
    }

    public static m1 k(ViewGroup.LayoutParams layoutParams) {
        m1 m1Var;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof m1) {
            m1 m1Var2 = (m1) layoutParams;
            m1Var = new m1(m1Var2);
            m1Var.a = m1Var2.a;
        } else {
            m1Var = new m1(layoutParams);
        }
        if (((LinearLayout.LayoutParams) m1Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) m1Var).gravity = 16;
        }
        return m1Var;
    }

    @Override // defpackage.rs
    public final boolean a(vs vsVar) {
        return this.u.q(vsVar, null, 0);
    }

    @Override // defpackage.lt
    public final void b(ss ssVar) {
        this.u = ssVar;
    }

    @Override // defpackage.pp, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof m1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.pp
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ op generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.pp
    /* renamed from: g */
    public final op generateLayoutParams(AttributeSet attributeSet) {
        return new m1(getContext(), attributeSet);
    }

    @Override // defpackage.pp, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.pp, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new m1(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.u == null) {
            Context context = getContext();
            ss ssVar = new ss(context);
            this.u = ssVar;
            ssVar.e = new j0(3, this);
            k1 k1Var = new k1(context);
            this.y = k1Var;
            k1Var.r = true;
            k1Var.s = true;
            k1Var.j = new tg(10);
            this.u.b(k1Var, this.v);
            k1 k1Var2 = this.y;
            k1Var2.m = this;
            this.u = k1Var2.h;
        }
        return this.u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        k1 k1Var = this.y;
        h1 h1Var = k1Var.o;
        if (h1Var != null) {
            return h1Var.getDrawable();
        }
        if (k1Var.q) {
            return k1Var.p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.pp
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ op generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof l1)) {
            z = ((l1) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof l1)) ? z : ((l1) childAt2).b() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k1 k1Var = this.y;
        if (k1Var != null) {
            k1Var.j(false);
            if (this.y.h()) {
                this.y.d();
                this.y.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k1 k1Var = this.y;
        if (k1Var != null) {
            k1Var.d();
            e1 e1Var = k1Var.z;
            if (e1Var == null || !e1Var.b()) {
                return;
            }
            e1Var.j.dismiss();
        }
    }

    @Override // defpackage.pp, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = h90.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                m1 m1Var = (m1) childAt.getLayoutParams();
                if (m1Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) m1Var).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) m1Var).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) m1Var).leftMargin) + ((LinearLayout.LayoutParams) m1Var).rightMargin;
                    l(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                m1 m1Var2 = (m1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !m1Var2.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) m1Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) m1Var2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            m1 m1Var3 = (m1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !m1Var3.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) m1Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) m1Var3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.pp, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        ss ssVar;
        boolean z = this.A;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.A = z2;
        if (z != z2) {
            this.B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.A && (ssVar = this.u) != null && size != this.B) {
            this.B = size;
            ssVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.A || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                m1 m1Var = (m1) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) m1Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) m1Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.C;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        long j = 0;
        while (true) {
            i3 = this.D;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i14++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                m1 m1Var2 = (m1) childAt.getLayoutParams();
                m1Var2.f = false;
                m1Var2.c = 0;
                m1Var2.b = 0;
                m1Var2.d = false;
                ((LinearLayout.LayoutParams) m1Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) m1Var2).rightMargin = 0;
                m1Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = m1Var2.a ? 1 : i10;
                m1 m1Var3 = (m1) childAt.getLayoutParams();
                int i21 = i10;
                i5 = i12;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i20 <= 0 || (z5 && i20 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i20, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                m1Var3.d = !m1Var3.a && z6;
                m1Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (m1Var2.d) {
                    i17++;
                }
                if (m1Var2.a) {
                    z3 = true;
                }
                i10 = i21 - i6;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= 1 << i16;
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i12 = i5;
        }
        int i22 = size3;
        int i23 = i10;
        int i24 = i12;
        boolean z7 = z3 && i14 == 2;
        int i25 = i23;
        boolean z8 = false;
        while (i17 > 0 && i25 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j2 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = i13;
                m1 m1Var4 = (m1) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (m1Var4.d) {
                    int i30 = m1Var4.b;
                    if (i30 < i26) {
                        j2 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j2 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z7 = z9;
                i13 = i29;
            }
            i4 = i13;
            boolean z10 = z7;
            j |= j2;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                m1 m1Var5 = (m1) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && m1Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    m1Var5.b += r11;
                    m1Var5.f = r11;
                    i25--;
                } else if (m1Var5.b == i31) {
                    j |= j3;
                }
                i32++;
                z3 = z11;
            }
            z7 = z10;
            i13 = i4;
            z8 = true;
        }
        i4 = i13;
        boolean z12 = !z3 && i14 == 1;
        if (i25 > 0 && j != 0 && (i25 < i14 - 1 || z12 || i15 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((m1) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((m1) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    m1 m1Var6 = (m1) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        m1Var6.c = i34;
                        m1Var6.f = true;
                        if (i35 == 0 && !m1Var6.e) {
                            ((LinearLayout.LayoutParams) m1Var6).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (m1Var6.a) {
                        m1Var6.c = i34;
                        m1Var6.f = true;
                        ((LinearLayout.LayoutParams) m1Var6).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) m1Var6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) m1Var6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                m1 m1Var7 = (m1) childAt4.getLayoutParams();
                if (m1Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((m1Var7.b * i24) + m1Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.y.w = z;
    }

    public void setOnMenuItemClickListener(n1 n1Var) {
        this.E = n1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        k1 k1Var = this.y;
        h1 h1Var = k1Var.o;
        if (h1Var != null) {
            h1Var.setImageDrawable(drawable);
        } else {
            k1Var.q = true;
            k1Var.p = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.x = z;
    }

    public void setPopupTheme(int i) {
        if (this.w != i) {
            this.w = i;
            if (i == 0) {
                this.v = getContext();
            } else {
                this.v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(k1 k1Var) {
        this.y = k1Var;
        k1Var.m = this;
        this.u = k1Var.h;
    }

    @Override // defpackage.pp, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
