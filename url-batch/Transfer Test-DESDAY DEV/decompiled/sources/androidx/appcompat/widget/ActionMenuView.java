package androidx.appcompat.widget;

import A0.h;
import O0.e;
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
import k.C0166o;
import k.InterfaceC0147A;
import k.InterfaceC0163l;
import k.MenuC0164m;
import l.AbstractC0243w0;
import l.C0210g;
import l.C0216j;
import l.C0218k;
import l.C0222m;
import l.C0241v0;
import l.InterfaceC0220l;
import l.InterfaceC0224n;
import l.V0;
import l.h1;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC0243w0 implements InterfaceC0163l, InterfaceC0147A {

    /* renamed from: p, reason: collision with root package name */
    public MenuC0164m f1330p;

    /* renamed from: q, reason: collision with root package name */
    public Context f1331q;

    /* renamed from: r, reason: collision with root package name */
    public int f1332r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1333s;

    /* renamed from: t, reason: collision with root package name */
    public C0218k f1334t;

    /* renamed from: u, reason: collision with root package name */
    public V0 f1335u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f1336v;

    /* renamed from: w, reason: collision with root package name */
    public int f1337w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1338x;

    /* renamed from: y, reason: collision with root package name */
    public final int f1339y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0224n f1340z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1338x = (int) (56.0f * f2);
        this.f1339y = (int) (f2 * 4.0f);
        this.f1331q = context;
        this.f1332r = 0;
    }

    public static C0222m j() {
        C0222m c0222m = new C0222m(-2, -2);
        c0222m.f3038a = false;
        ((LinearLayout.LayoutParams) c0222m).gravity = 16;
        return c0222m;
    }

    public static C0222m k(ViewGroup.LayoutParams layoutParams) {
        C0222m c0222m;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof C0222m) {
            C0222m c0222m2 = (C0222m) layoutParams;
            c0222m = new C0222m(c0222m2);
            c0222m.f3038a = c0222m2.f3038a;
        } else {
            c0222m = new C0222m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0222m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0222m).gravity = 16;
        }
        return c0222m;
    }

    @Override // k.InterfaceC0163l
    public final boolean b(C0166o c0166o) {
        return this.f1330p.q(c0166o, null, 0);
    }

    @Override // k.InterfaceC0147A
    public final void c(MenuC0164m menuC0164m) {
        this.f1330p = menuC0164m;
    }

    @Override // l.AbstractC0243w0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0222m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.AbstractC0243w0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0241v0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0243w0
    /* renamed from: g */
    public final C0241v0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0222m(getContext(), attributeSet);
    }

    @Override // l.AbstractC0243w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.AbstractC0243w0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1330p == null) {
            Context context = getContext();
            MenuC0164m menuC0164m = new MenuC0164m(context);
            this.f1330p = menuC0164m;
            menuC0164m.f2759e = new h(27, this);
            C0218k c0218k = new C0218k(context);
            this.f1334t = c0218k;
            c0218k.f3024l = true;
            c0218k.f3025m = true;
            c0218k.f3019e = new e(27);
            this.f1330p.b(c0218k, this.f1331q);
            C0218k c0218k2 = this.f1334t;
            c0218k2.h = this;
            this.f1330p = c0218k2.f3018c;
        }
        return this.f1330p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0218k c0218k = this.f1334t;
        C0216j c0216j = c0218k.i;
        if (c0216j != null) {
            return c0216j.getDrawable();
        }
        if (c0218k.f3023k) {
            return c0218k.f3022j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1332r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.AbstractC0243w0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C0241v0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0220l)) {
            z2 = ((InterfaceC0220l) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0220l)) ? z2 : z2 | ((InterfaceC0220l) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0218k c0218k = this.f1334t;
        if (c0218k != null) {
            c0218k.c();
            if (this.f1334t.i()) {
                this.f1334t.e();
                this.f1334t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0218k c0218k = this.f1334t;
        if (c0218k != null) {
            c0218k.e();
            C0210g c0210g = c0218k.f3032t;
            if (c0210g == null || !c0210g.b()) {
                return;
            }
            c0210g.i.dismiss();
        }
    }

    @Override // l.AbstractC0243w0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1336v) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = h1.f3011a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0222m c0222m = (C0222m) childAt.getLayoutParams();
                if (c0222m.f3038a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0222m).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0222m).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0222m).leftMargin) + ((LinearLayout.LayoutParams) c0222m).rightMargin;
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
                C0222m c0222m2 = (C0222m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0222m2.f3038a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0222m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0222m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0222m c0222m3 = (C0222m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0222m3.f3038a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c0222m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c0222m3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // l.AbstractC0243w0, android.view.View
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
        MenuC0164m menuC0164m;
        boolean z4 = this.f1336v;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1336v = z5;
        if (z4 != z5) {
            this.f1337w = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1336v && (menuC0164m = this.f1330p) != null && size != this.f1337w) {
            this.f1337w = size;
            menuC0164m.p(true);
        }
        int childCount = getChildCount();
        if (!this.f1336v || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0222m c0222m = (C0222m) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c0222m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0222m).leftMargin = 0;
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
        int i13 = this.f1338x;
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
            i3 = this.f1339y;
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
                C0222m c0222m2 = (C0222m) childAt.getLayoutParams();
                c0222m2.f3042f = false;
                c0222m2.f3040c = 0;
                c0222m2.f3039b = 0;
                c0222m2.d = false;
                ((LinearLayout.LayoutParams) c0222m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0222m2).rightMargin = 0;
                c0222m2.f3041e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c0222m2.f3038a ? 1 : i14;
                C0222m c0222m3 = (C0222m) childAt.getLayoutParams();
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
                c0222m3.d = !c0222m3.f3038a && z8;
                c0222m3.f3039b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c0222m2.d) {
                    i21++;
                }
                if (c0222m2.f3038a) {
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
                C0222m c0222m4 = (C0222m) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c0222m4.d) {
                    int i32 = c0222m4.f3039b;
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
                C0222m c0222m5 = (C0222m) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (z9 && c0222m5.f3041e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0222m5.f3039b += r4;
                    c0222m5.f3042f = r4;
                    i14--;
                } else if (c0222m5.f3039b == i33) {
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
                if ((j2 & 1) != 0 && !((C0222m) getChildAt(0).getLayoutParams()).f3041e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & (1 << i41)) != 0 && !((C0222m) getChildAt(i41).getLayoutParams()).f3041e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > RecyclerView.f1570A0 ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j2 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0222m c0222m6 = (C0222m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0222m6.f3040c = i42;
                        c0222m6.f3042f = true;
                        if (i43 == 0 && !c0222m6.f3041e) {
                            ((LinearLayout.LayoutParams) c0222m6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0222m6.f3038a) {
                            c0222m6.f3040c = i42;
                            c0222m6.f3042f = true;
                            ((LinearLayout.LayoutParams) c0222m6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c0222m6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c0222m6).rightMargin = i42 / 2;
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
                C0222m c0222m7 = (C0222m) childAt4.getLayoutParams();
                if (c0222m7.f3042f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0222m7.f3039b * i16) + c0222m7.f3040c, 1073741824), i7);
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
        this.f1334t.f3029q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0224n interfaceC0224n) {
        this.f1340z = interfaceC0224n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0218k c0218k = this.f1334t;
        C0216j c0216j = c0218k.i;
        if (c0216j != null) {
            c0216j.setImageDrawable(drawable);
        } else {
            c0218k.f3023k = true;
            c0218k.f3022j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1333s = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1332r != i) {
            this.f1332r = i;
            if (i == 0) {
                this.f1331q = getContext();
            } else {
                this.f1331q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0218k c0218k) {
        this.f1334t = c0218k;
        c0218k.h = this;
        this.f1330p = c0218k.f3018c;
    }

    @Override // l.AbstractC0243w0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0222m(getContext(), attributeSet);
    }
}
