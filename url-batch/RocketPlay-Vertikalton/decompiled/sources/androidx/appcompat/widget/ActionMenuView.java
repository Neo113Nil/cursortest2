package androidx.appcompat.widget;

import M0.e;
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
import androidx.recyclerview.widget.RecyclerView;
import k.C0204o;
import k.InterfaceC0185A;
import k.InterfaceC0201l;
import k.MenuC0202m;
import l.AbstractC0288y0;
import l.C0251g;
import l.C0257j;
import l.C0259k;
import l.C0263m;
import l.C0265n;
import l.C0286x0;
import l.InterfaceC0261l;
import l.InterfaceC0267o;
import l.X0;
import l.j1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0288y0 implements InterfaceC0201l, InterfaceC0185A {

    /* renamed from: p, reason: collision with root package name */
    public MenuC0202m f1719p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1720q;

    /* renamed from: r, reason: collision with root package name */
    public int f1721r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1722s;

    /* renamed from: t, reason: collision with root package name */
    public C0259k f1723t;

    /* renamed from: u, reason: collision with root package name */
    public X0 f1724u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1725v;

    /* renamed from: w, reason: collision with root package name */
    public int f1726w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1727x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1728y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0267o f1729z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1727x = (int) (56.0f * f2);
        this.f1728y = (int) (f2 * 4.0f);
        this.f1720q = context;
        this.f1721r = 0;
    }

    public static C0263m j() {
        C0263m c0263m = new C0263m(-2, -2);
        c0263m.f3468a = false;
        ((LinearLayout.LayoutParams) c0263m).gravity = 16;
        return c0263m;
    }

    public static C0263m k(ViewGroup.LayoutParams layoutParams) {
        C0263m c0263m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0263m) {
            C0263m c0263m2 = (C0263m) layoutParams;
            c0263m = new C0263m(c0263m2);
            c0263m.f3468a = c0263m2.f3468a;
        } else {
            c0263m = new C0263m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0263m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0263m).gravity = 16;
        }
        return c0263m;
    }

    @Override // k.InterfaceC0201l
    public final boolean b(C0204o c0204o) {
        return this.f1719p.q(c0204o, null, 0);
    }

    @Override // k.InterfaceC0185A
    public final void c(MenuC0202m menuC0202m) {
        this.f1719p = menuC0202m;
    }

    @Override // l.AbstractC0288y0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0263m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0288y0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0286x0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0288y0
    /* renamed from: g */
    public final C0286x0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0263m(getContext(), attributeSet);
    }

    @Override // l.AbstractC0288y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0288y0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1719p == null) {
            Context context = getContext();
            MenuC0202m menuC0202m = new MenuC0202m(context);
            this.f1719p = menuC0202m;
            menuC0202m.f3190e = new C0265n(this);
            C0259k c0259k = new C0259k(context);
            this.f1723t = c0259k;
            c0259k.f3456l = true;
            c0259k.f3457m = true;
            c0259k.f3451e = new e(28);
            this.f1719p.b(c0259k, this.f1720q);
            C0259k c0259k2 = this.f1723t;
            c0259k2.h = this;
            this.f1719p = c0259k2.f3450c;
        }
        return this.f1719p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0259k c0259k = this.f1723t;
        C0257j c0257j = c0259k.i;
        if (c0257j != null) {
            return c0257j.getDrawable();
        }
        if (c0259k.f3455k) {
            return c0259k.f3454j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1721r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0288y0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0286x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0261l)) {
            z2 = ((InterfaceC0261l) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0261l)) ? z2 : z2 | ((InterfaceC0261l) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0259k c0259k = this.f1723t;
        if (c0259k != null) {
            c0259k.c();
            if (this.f1723t.i()) {
                this.f1723t.f();
                this.f1723t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0259k c0259k = this.f1723t;
        if (c0259k != null) {
            c0259k.f();
            C0251g c0251g = c0259k.f3464t;
            if (c0251g == null || !c0251g.b()) {
                return;
            }
            c0251g.i.dismiss();
        }
    }

    @Override // l.AbstractC0288y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1725v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = j1.f3445a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0263m c0263m = (C0263m) childAt.getLayoutParams();
                if (c0263m.f3468a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0263m).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0263m).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0263m).leftMargin) + ((LinearLayout.LayoutParams) c0263m).rightMargin;
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
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0263m c0263m2 = (C0263m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0263m2.f3468a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0263m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0263m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0263m c0263m3 = (C0263m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0263m3.f3468a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0263m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0263m3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC0288y0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC0202m menuC0202m;
        boolean z4 = this.f1725v;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1725v = z5;
        if (z4 != z5) {
            this.f1726w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1725v && (menuC0202m = this.f1719p) != null && size != this.f1726w) {
            this.f1726w = size;
            menuC0202m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1725v || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0263m c0263m = (C0263m) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0263m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0263m).leftMargin = 0;
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
        int i12 = size2 - paddingRight;
        int i13 = this.f1727x;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z6 = false;
        int i21 = 0;
        long j2 = 0;
        while (true) {
            i3 = this.f1728y;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i24 = i18 + 1;
                if (z7) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C0263m c0263m2 = (C0263m) childAt.getLayoutParams();
                c0263m2.f3472f = false;
                c0263m2.f3470c = 0;
                c0263m2.f3469b = 0;
                c0263m2.d = false;
                ((LinearLayout.LayoutParams) c0263m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0263m2).rightMargin = 0;
                c0263m2.f3471e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0263m2.f3468a ? 1 : i14;
                C0263m c0263m3 = (C0263m) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i25 <= 0 || (z8 && i25 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i16, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z8 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c0263m3.d = !c0263m3.f3468a && z8;
                c0263m3.f3469b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0263m2.d) {
                    i21++;
                }
                if (c0263m2.f3468a) {
                    z6 = true;
                }
                i14 -= i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= 1 << i20;
                }
                i18 = i24;
            }
            i20++;
            size3 = i22;
            i12 = i23;
            paddingBottom = i9;
            mode = i8;
        }
        int i26 = mode;
        int i27 = i12;
        int i28 = size3;
        boolean z9 = z6 && i18 == 2;
        boolean z10 = false;
        while (i21 > 0 && i14 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j3 = 0;
            while (i31 < childCount2) {
                C0263m c0263m4 = (C0263m) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c0263m4.d) {
                    int i32 = c0263m4.f3469b;
                    if (i32 < i29) {
                        j3 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j3 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i30 > i14) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0263m c0263m5 = (C0263m) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (z9 && c0263m5.f3471e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0263m5.f3469b += r4;
                    c0263m5.f3472f = r4;
                    i14--;
                } else if (c0263m5.f3469b == i33) {
                    j2 |= j4;
                }
                i34++;
                childMeasureSpec = i36;
                i17 = i35;
                childCount2 = i37;
            }
            z10 = true;
        }
        z2 = z10;
        int i38 = i17;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z12 = !z6 && i18 == 1;
        if (i14 <= 0 || j2 == 0 || (i14 >= i18 - 1 && !z12 && i19 <= 1)) {
            i4 = i40;
            z3 = z2;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C0263m) getChildAt(0).getLayoutParams()).f3471e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & (1 << i41)) != 0 && !((C0263m) getChildAt(i41).getLayoutParams()).f3471e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > RecyclerView.f1949A0 ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j2 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0263m c0263m6 = (C0263m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0263m6.f3470c = i42;
                        c0263m6.f3472f = true;
                        if (i43 == 0 && !c0263m6.f3471e) {
                            ((LinearLayout.LayoutParams) c0263m6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0263m6.f3468a) {
                            c0263m6.f3470c = i42;
                            c0263m6.f3472f = true;
                            ((LinearLayout.LayoutParams) c0263m6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0263m6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c0263m6).rightMargin = i42 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i44 = 0;
            while (i44 < i4) {
                View childAt4 = getChildAt(i44);
                C0263m c0263m7 = (C0263m) childAt4.getLayoutParams();
                if (c0263m7.f3472f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0263m7.f3469b * i16) + c0263m7.f3470c, 1073741824), i7);
                } else {
                    i7 = i39;
                }
                i44++;
                i39 = i7;
            }
        }
        if (i26 != 1073741824) {
            i6 = i27;
            i5 = i38;
        } else {
            i5 = i28;
            i6 = i27;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1723t.f3461q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0267o interfaceC0267o) {
        this.f1729z = interfaceC0267o;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0259k c0259k = this.f1723t;
        C0257j c0257j = c0259k.i;
        if (c0257j != null) {
            c0257j.setImageDrawable(drawable);
        } else {
            c0259k.f3455k = true;
            c0259k.f3454j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1722s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1721r != i) {
            this.f1721r = i;
            if (i == 0) {
                this.f1720q = getContext();
            } else {
                this.f1720q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0259k c0259k) {
        this.f1723t = c0259k;
        c0259k.h = this;
        this.f1719p = c0259k.f3450c;
    }

    @Override // l.AbstractC0288y0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0263m(getContext(), attributeSet);
    }
}
