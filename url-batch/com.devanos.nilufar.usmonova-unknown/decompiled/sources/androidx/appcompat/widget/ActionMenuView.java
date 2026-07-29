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
import o.AbstractC0599Wz;
import o.AbstractC1468m00;
import o.C0260Jx;
import o.C0573Vz;
import o.C1284jC;
import o.C1623oL;
import o.C1864s1;
import o.C2062v1;
import o.C2128w1;
import o.C2260y1;
import o.InterfaceC0694aC;
import o.InterfaceC0760bC;
import o.InterfaceC2075vC;
import o.InterfaceC2194x1;
import o.InterfaceC2326z1;
import o.InterfaceC2339zC;
import o.MenuC0825cC;
import o.Y1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0599Wz implements InterfaceC0760bC, InterfaceC2339zC {
    public C2128w1 A;
    public C0260Jx B;
    public InterfaceC0694aC C;
    public boolean D;
    public int E;
    public final int F;
    public final int G;
    public InterfaceC2326z1 H;
    public MenuC0825cC w;
    public Context x;
    public int y;
    public boolean z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.F = (int) (56.0f * f);
        this.G = (int) (f * 4.0f);
        this.x = context;
        this.y = 0;
    }

    public static C2260y1 i() {
        C2260y1 c2260y1 = new C2260y1(-2, -2);
        c2260y1.a = false;
        ((LinearLayout.LayoutParams) c2260y1).gravity = 16;
        return c2260y1;
    }

    public static C2260y1 j(ViewGroup.LayoutParams layoutParams) {
        C2260y1 c2260y1;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof C2260y1) {
            C2260y1 c2260y12 = (C2260y1) layoutParams;
            c2260y1 = new C2260y1(c2260y12);
            c2260y1.a = c2260y12.a;
        } else {
            c2260y1 = new C2260y1(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c2260y1).gravity <= 0) {
            ((LinearLayout.LayoutParams) c2260y1).gravity = 16;
        }
        return c2260y1;
    }

    @Override // o.InterfaceC2339zC
    public final void a(MenuC0825cC menuC0825cC) {
        this.w = menuC0825cC;
    }

    @Override // o.InterfaceC0760bC
    public final boolean b(C1284jC c1284jC) {
        return this.w.q(c1284jC, null, 0);
    }

    @Override // o.AbstractC0599Wz, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2260y1;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // o.AbstractC0599Wz
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0573Vz generateDefaultLayoutParams() {
        return i();
    }

    @Override // o.AbstractC0599Wz
    /* renamed from: f */
    public final C0573Vz generateLayoutParams(AttributeSet attributeSet) {
        return new C2260y1(getContext(), attributeSet);
    }

    @Override // o.AbstractC0599Wz
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C0573Vz generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // o.AbstractC0599Wz, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // o.AbstractC0599Wz, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.w == null) {
            Context context = getContext();
            MenuC0825cC menuC0825cC = new MenuC0825cC(context);
            this.w = menuC0825cC;
            menuC0825cC.e = new Y1(6, this);
            C2128w1 c2128w1 = new C2128w1(context);
            this.A = c2128w1;
            c2128w1.s = true;
            c2128w1.t = true;
            InterfaceC2075vC interfaceC2075vC = this.B;
            if (interfaceC2075vC == null) {
                interfaceC2075vC = new C1623oL(12);
            }
            c2128w1.l = interfaceC2075vC;
            this.w.b(c2128w1, this.x);
            C2128w1 c2128w12 = this.A;
            c2128w12.f236o = this;
            this.w = c2128w12.j;
        }
        return this.w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C2128w1 c2128w1 = this.A;
        C2062v1 c2062v1 = c2128w1.p;
        if (c2062v1 != null) {
            return c2062v1.getDrawable();
        }
        if (c2128w1.r) {
            return c2128w1.q;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC2194x1)) {
            z = ((InterfaceC2194x1) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC2194x1)) ? z : ((InterfaceC2194x1) childAt2).c() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C2128w1 c2128w1 = this.A;
        if (c2128w1 != null) {
            c2128w1.c();
            if (this.A.f()) {
                this.A.d();
                this.A.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2128w1 c2128w1 = this.A;
        if (c2128w1 != null) {
            c2128w1.d();
            C1864s1 c1864s1 = c2128w1.A;
            if (c1864s1 == null || !c1864s1.b()) {
                return;
            }
            c1864s1.i.dismiss();
        }
    }

    @Override // o.AbstractC0599Wz, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.D) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = AbstractC1468m00.a;
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C2260y1 c2260y1 = (C2260y1) childAt.getLayoutParams();
                if (c2260y1.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c2260y1).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c2260y1).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c2260y1).leftMargin) + ((LinearLayout.LayoutParams) c2260y1).rightMargin;
                    k(i10);
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
                C2260y1 c2260y12 = (C2260y1) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c2260y12.a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c2260y12).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c2260y12).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C2260y1 c2260y13 = (C2260y1) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c2260y13.a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c2260y13).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c2260y13).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // o.AbstractC0599Wz, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        MenuC0825cC menuC0825cC;
        boolean z = this.D;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.D = z2;
        if (z != z2) {
            this.E = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.D && (menuC0825cC = this.w) != null && size != this.E) {
            this.E = size;
            menuC0825cC.p(true);
        }
        int childCount = getChildCount();
        if (!this.D || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                C2260y1 c2260y1 = (C2260y1) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) c2260y1).rightMargin = 0;
                ((LinearLayout.LayoutParams) c2260y1).leftMargin = 0;
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
        int i9 = this.F;
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
            i3 = this.G;
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
                C2260y1 c2260y12 = (C2260y1) childAt.getLayoutParams();
                c2260y12.f = false;
                c2260y12.c = 0;
                c2260y12.b = 0;
                c2260y12.d = false;
                ((LinearLayout.LayoutParams) c2260y12).leftMargin = 0;
                ((LinearLayout.LayoutParams) c2260y12).rightMargin = 0;
                c2260y12.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = c2260y12.a ? 1 : i10;
                C2260y1 c2260y13 = (C2260y1) childAt.getLayoutParams();
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
                c2260y13.d = !c2260y13.a && z6;
                c2260y13.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), makeMeasureSpec);
                i15 = Math.max(i15, i6);
                if (c2260y12.d) {
                    i17++;
                }
                if (c2260y12.a) {
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
                C2260y1 c2260y14 = (C2260y1) getChildAt(i28).getLayoutParams();
                boolean z9 = z7;
                if (c2260y14.d) {
                    int i30 = c2260y14.b;
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
                C2260y1 c2260y15 = (C2260y1) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i32;
                if ((j2 & j3) != 0) {
                    if (z10 && c2260y15.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i3 + i24, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c2260y15.b += r11;
                    c2260y15.f = r11;
                    i25--;
                } else if (c2260y15.b == i31) {
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
                if ((j & 1) != 0 && !((C2260y1) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j & (1 << i33)) != 0 && !((C2260y1) getChildAt(i33).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i25 * i24) / bitCount) : 0;
            boolean z13 = z8;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    C2260y1 c2260y16 = (C2260y1) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c2260y16.c = i34;
                        c2260y16.f = true;
                        if (i35 == 0 && !c2260y16.e) {
                            ((LinearLayout.LayoutParams) c2260y16).leftMargin = (-i34) / 2;
                        }
                        z13 = true;
                    } else if (c2260y16.a) {
                        c2260y16.c = i34;
                        c2260y16.f = true;
                        ((LinearLayout.LayoutParams) c2260y16).rightMargin = (-i34) / 2;
                        z13 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) c2260y16).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c2260y16).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                C2260y1 c2260y17 = (C2260y1) childAt4.getLayoutParams();
                if (c2260y17.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c2260y17.b * i24) + c2260y17.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A.x = z;
    }

    public void setOnMenuItemClickListener(InterfaceC2326z1 interfaceC2326z1) {
        this.H = interfaceC2326z1;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C2128w1 c2128w1 = this.A;
        C2062v1 c2062v1 = c2128w1.p;
        if (c2062v1 != null) {
            c2062v1.setImageDrawable(drawable);
        } else {
            c2128w1.r = true;
            c2128w1.q = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.z = z;
    }

    public void setPopupTheme(int i) {
        if (this.y != i) {
            this.y = i;
            if (i == 0) {
                this.x = getContext();
            } else {
                this.x = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C2128w1 c2128w1) {
        this.A = c2128w1;
        c2128w1.f236o = this;
        this.w = c2128w1.j;
    }

    @Override // o.AbstractC0599Wz, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C2260y1(getContext(), attributeSet);
    }
}
