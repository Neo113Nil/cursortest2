package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.devanos.nilufar.usmonova.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AZ;
import o.AbstractC1468m00;
import o.AbstractC1886sL;
import o.C0260Jx;
import o.C0406Po;
import o.C0780bW;
import o.C0845cW;
import o.C0950e6;
import o.C1088gC;
import o.C1108gW;
import o.C1284jC;
import o.C1673p5;
import o.C1764qU;
import o.C1804r5;
import o.C2128w1;
import o.EB;
import o.InterfaceC0714aW;
import o.InterfaceC1710pg;
import o.InterfaceC2207xC;
import o.MenuC0825cC;
import o.R2;
import o.TM;
import o.V5;
import o.VV;
import o.ViewOnClickListenerC1207i1;
import o.WV;
import o.XO;
import o.XV;
import o.YV;
import o.ZV;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public XO A;
    public int B;
    public int C;
    public final int D;
    public CharSequence E;
    public CharSequence F;
    public ColorStateList G;
    public ColorStateList H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final int[] M;
    public final C1088gC N;
    public ArrayList O;
    public InterfaceC0714aW P;
    public final WV Q;
    public C1108gW R;
    public C2128w1 S;
    public YV T;
    public C0260Jx U;
    public C0845cW V;
    public boolean W;
    public OnBackInvokedCallback a0;
    public OnBackInvokedDispatcher b0;
    public boolean c0;
    public final R2 d0;
    public ActionMenuView h;
    public V5 i;
    public V5 j;
    public C1673p5 k;
    public C1804r5 l;
    public final Drawable m;
    public final CharSequence n;

    /* renamed from: o, reason: collision with root package name */
    public C1673p5 f6o;
    public View p;
    public Context q;
    public int r;
    public int s;
    public int t;
    public final int u;
    public final int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.D = 8388627;
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new int[2];
        this.N = new C1088gC(new VV(this, 1));
        this.O = new ArrayList();
        this.Q = new WV(this);
        this.d0 = new R2(8, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1886sL.w;
        C0950e6 F = C0950e6.F(context2, attributeSet, iArr, R.attr.toolbarStyle);
        AZ.g(this, context, iArr, attributeSet, (TypedArray) F.i, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) F.i;
        this.s = typedArray.getResourceId(28, 0);
        this.t = typedArray.getResourceId(19, 0);
        this.D = typedArray.getInteger(0, 8388627);
        this.u = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.z = dimensionPixelOffset;
        this.y = dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.w = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.x = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.y = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.z = dimensionPixelOffset5;
        }
        this.v = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        XO xo = this.A;
        xo.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            xo.e = dimensionPixelSize;
            xo.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            xo.f = dimensionPixelSize2;
            xo.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            xo.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.B = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.C = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.m = F.x(4);
        this.n = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.q = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable x = F.x(16);
        if (x != null) {
            setNavigationIcon(x);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable x2 = F.x(11);
        if (x2 != null) {
            setLogo(x2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(F.w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(F.w(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        F.L();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1764qU(getContext());
    }

    public static ZV h() {
        ZV zv = new ZV(-2, -2);
        zv.b = 0;
        zv.a = 8388627;
        return zv;
    }

    public static ZV i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof ZV;
        if (z) {
            ZV zv = (ZV) layoutParams;
            ZV zv2 = new ZV(zv);
            zv2.b = 0;
            zv2.b = zv.b;
            return zv2;
        }
        if (z) {
            ZV zv3 = new ZV((ZV) layoutParams);
            zv3.b = 0;
            return zv3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            ZV zv4 = new ZV(layoutParams);
            zv4.b = 0;
            return zv4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ZV zv5 = new ZV(marginLayoutParams);
        zv5.b = 0;
        ((ViewGroup.MarginLayoutParams) zv5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) zv5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) zv5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) zv5).bottomMargin = marginLayoutParams.bottomMargin;
        return zv5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ZV zv = (ZV) childAt.getLayoutParams();
                if (zv.b == 0 && t(childAt)) {
                    int i3 = zv.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            ZV zv2 = (ZV) childAt2.getLayoutParams();
            if (zv2.b == 0 && t(childAt2)) {
                int i5 = zv2.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ZV h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (ZV) layoutParams;
        h.b = 1;
        if (!z || this.p == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.L.add(view);
        }
    }

    public final void c() {
        if (this.f6o == null) {
            C1673p5 c1673p5 = new C1673p5(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f6o = c1673p5;
            c1673p5.setImageDrawable(this.m);
            this.f6o.setContentDescription(this.n);
            ZV h = h();
            h.a = (this.u & 112) | 8388611;
            h.b = 2;
            this.f6o.setLayoutParams(h);
            this.f6o.setOnClickListener(new ViewOnClickListenerC1207i1(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ZV);
    }

    public final void d() {
        if (this.A == null) {
            XO xo = new XO();
            xo.a = 0;
            xo.b = 0;
            xo.c = Integer.MIN_VALUE;
            xo.d = Integer.MIN_VALUE;
            xo.e = 0;
            xo.f = 0;
            xo.g = false;
            xo.h = false;
            this.A = xo;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.h;
        if (actionMenuView.w == null) {
            MenuC0825cC menuC0825cC = (MenuC0825cC) actionMenuView.getMenu();
            if (this.T == null) {
                this.T = new YV(this);
            }
            this.h.setExpandedActionViewsExclusive(true);
            menuC0825cC.b(this.T, this.q);
            v();
        }
    }

    public final void f() {
        if (this.h == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.h = actionMenuView;
            actionMenuView.setPopupTheme(this.r);
            this.h.setOnMenuItemClickListener(this.Q);
            ActionMenuView actionMenuView2 = this.h;
            C0260Jx c0260Jx = this.U;
            WV wv = new WV(this);
            actionMenuView2.B = c0260Jx;
            actionMenuView2.C = wv;
            ZV h = h();
            h.a = (this.u & 112) | 8388613;
            this.h.setLayoutParams(h);
            b(this.h, false);
        }
    }

    public final void g() {
        if (this.k == null) {
            this.k = new C1673p5(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            ZV h = h();
            h.a = (this.u & 112) | 8388611;
            this.k.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1673p5 c1673p5 = this.f6o;
        if (c1673p5 != null) {
            return c1673p5.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1673p5 c1673p5 = this.f6o;
        if (c1673p5 != null) {
            return c1673p5.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        XO xo = this.A;
        if (xo != null) {
            return xo.g ? xo.a : xo.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.C;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        XO xo = this.A;
        if (xo != null) {
            return xo.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        XO xo = this.A;
        if (xo != null) {
            return xo.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        XO xo = this.A;
        if (xo != null) {
            return xo.g ? xo.b : xo.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.B;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC0825cC menuC0825cC;
        ActionMenuView actionMenuView = this.h;
        return (actionMenuView == null || (menuC0825cC = actionMenuView.w) == null || !menuC0825cC.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.C, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.B, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1804r5 c1804r5 = this.l;
        if (c1804r5 != null) {
            return c1804r5.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1804r5 c1804r5 = this.l;
        if (c1804r5 != null) {
            return c1804r5.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.h.getMenu();
    }

    public View getNavButtonView() {
        return this.k;
    }

    public CharSequence getNavigationContentDescription() {
        C1673p5 c1673p5 = this.k;
        if (c1673p5 != null) {
            return c1673p5.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1673p5 c1673p5 = this.k;
        if (c1673p5 != null) {
            return c1673p5.getDrawable();
        }
        return null;
    }

    public C2128w1 getOuterActionMenuPresenter() {
        return this.S;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.h.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.q;
    }

    public int getPopupTheme() {
        return this.r;
    }

    public CharSequence getSubtitle() {
        return this.F;
    }

    public final TextView getSubtitleTextView() {
        return this.j;
    }

    public CharSequence getTitle() {
        return this.E;
    }

    public int getTitleMarginBottom() {
        return this.z;
    }

    public int getTitleMarginEnd() {
        return this.x;
    }

    public int getTitleMarginStart() {
        return this.w;
    }

    public int getTitleMarginTop() {
        return this.y;
    }

    public final TextView getTitleTextView() {
        return this.i;
    }

    public InterfaceC1710pg getWrapper() {
        if (this.R == null) {
            this.R = new C1108gW(this, true);
        }
        return this.R;
    }

    public final int j(View view, int i) {
        ZV zv = (ZV) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = zv.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.D & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) zv).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) zv).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) zv).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        Iterator it = this.O.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.N.b.iterator();
        while (it2.hasNext()) {
            ((C0406Po) ((InterfaceC2207xC) it2.next())).a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.O = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.L.contains(view);
    }

    public final boolean o() {
        C2128w1 c2128w1;
        ActionMenuView actionMenuView = this.h;
        return (actionMenuView == null || (c2128w1 = actionMenuView.A) == null || !c2128w1.f()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.d0);
        v();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.J = false;
        }
        if (!this.J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.J = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.J = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean t;
        boolean t2;
        boolean z2;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int i11;
        int i12;
        int size;
        int i13;
        int i14;
        int size2;
        int i15;
        int size3;
        int i16;
        int i17;
        int i18;
        int size4;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.M;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AZ.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (!t(this.k)) {
            i5 = paddingLeft;
        } else {
            if (z3) {
                i6 = q(this.k, i19, min, iArr);
                i5 = paddingLeft;
                if (t(this.f6o)) {
                    if (z3) {
                        i6 = q(this.f6o, i6, min, iArr);
                    } else {
                        i5 = p(this.f6o, i5, min, iArr);
                    }
                }
                if (t(this.h)) {
                    if (z3) {
                        i5 = p(this.h, i5, min, iArr);
                    } else {
                        i6 = q(this.h, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (t(this.p)) {
                    if (z3) {
                        min2 = q(this.p, min2, min, iArr);
                    } else {
                        max = p(this.p, max, min, iArr);
                    }
                }
                if (t(this.l)) {
                    if (z3) {
                        min2 = q(this.l, min2, min, iArr);
                    } else {
                        max = p(this.l, max, min, iArr);
                    }
                }
                t = t(this.i);
                t2 = t(this.j);
                if (t) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    ZV zv = (ZV) this.i.getLayoutParams();
                    z2 = z3;
                    i7 = this.i.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zv).topMargin + ((ViewGroup.MarginLayoutParams) zv).bottomMargin;
                }
                if (!t2) {
                    ZV zv2 = (ZV) this.j.getLayoutParams();
                    i7 = this.j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zv2).topMargin + ((ViewGroup.MarginLayoutParams) zv2).bottomMargin + i7;
                }
                if (!t || t2) {
                    V5 v5 = !t ? this.i : this.j;
                    V5 v52 = !t2 ? this.j : this.i;
                    ZV zv3 = (ZV) v5.getLayoutParams();
                    ZV zv4 = (ZV) v52.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!t && this.i.getMeasuredWidth() > 0) || (t2 && this.j.getMeasuredWidth() > 0);
                    i8 = this.D & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) zv3).topMargin + this.y;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) zv3).topMargin + this.y;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) zv3).bottomMargin;
                            int i26 = this.z;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) zv4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) zv4).bottomMargin) - this.z) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.w : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (t) {
                            ZV zv5 = (ZV) this.i.getLayoutParams();
                            int measuredWidth = this.i.getMeasuredWidth() + max;
                            int measuredHeight = this.i.getMeasuredHeight() + paddingTop;
                            this.i.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.x;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) zv5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (t2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ZV) this.j.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.j.getMeasuredWidth() + max;
                            this.j.layout(max, i28, measuredWidth2, this.j.getMeasuredHeight() + i28);
                            i10 = measuredWidth2 + this.x;
                        } else {
                            i10 = max;
                        }
                        if (z4) {
                            max = Math.max(i9, i10);
                        }
                    } else {
                        int i29 = (z4 ? this.w : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (t) {
                            ZV zv6 = (ZV) this.i.getLayoutParams();
                            int measuredWidth3 = min2 - this.i.getMeasuredWidth();
                            int measuredHeight2 = this.i.getMeasuredHeight() + paddingTop;
                            this.i.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.x;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) zv6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (t2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((ZV) this.j.getLayoutParams())).topMargin;
                            this.j.layout(min2 - this.j.getMeasuredWidth(), i30, min2, this.j.getMeasuredHeight() + i30);
                            i12 = min2 - this.x;
                        } else {
                            i12 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i11, i12);
                        }
                        max = i21;
                    }
                }
                ArrayList arrayList = this.K;
                a(3, arrayList);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = p((View) arrayList.get(i14), i13, min, iArr);
                }
                a(5, arrayList);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = q((View) arrayList.get(i15), min2, min, iArr);
                }
                a(1, arrayList);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view = (View) arrayList.get(i16);
                    ZV zv7 = (ZV) view.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) zv7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) zv7).rightMargin - i35;
                    int max2 = Math.max(0, i36);
                    int max3 = Math.max(0, i37);
                    int max4 = Math.max(0, -i36);
                    int max5 = Math.max(0, -i37);
                    i34 += view.getMeasuredWidth() + max2 + max3;
                    i16++;
                    i33 = max4;
                    i32 = max5;
                }
                i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i34 / 2);
                int i38 = i34 + i18;
                if (i18 >= i13) {
                    i13 = i38 > min2 ? i18 - (i38 - min2) : i18;
                }
                size4 = arrayList.size();
                for (i17 = 0; i17 < size4; i17++) {
                    i13 = p((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = p(this.k, paddingLeft, min, iArr);
        }
        i6 = i19;
        if (t(this.f6o)) {
        }
        if (t(this.h)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (t(this.p)) {
        }
        if (t(this.l)) {
        }
        t = t(this.i);
        t2 = t(this.j);
        if (t) {
        }
        if (!t2) {
        }
        if (!t) {
        }
        if (!t) {
        }
        if (!t2) {
        }
        ZV zv32 = (ZV) v5.getLayoutParams();
        ZV zv42 = (ZV) v52.getLayoutParams();
        int i202 = i7;
        if (t) {
        }
        i8 = this.D & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.K;
        a(3, arrayList2);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        a(5, arrayList2);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        a(1, arrayList2);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i16 = 0;
        int i342 = 0;
        while (i16 < size3) {
        }
        i18 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i342 / 2);
        int i382 = i342 + i18;
        if (i18 >= i13) {
        }
        size4 = arrayList2.size();
        while (i17 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        Object[] objArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z = AbstractC1468m00.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (t(this.k)) {
            s(this.k, i, 0, i2, this.v);
            i3 = k(this.k) + this.k.getMeasuredWidth();
            i4 = Math.max(0, l(this.k) + this.k.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.k.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (t(this.f6o)) {
            s(this.f6o, i, 0, i2, this.v);
            i3 = k(this.f6o) + this.f6o.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f6o) + this.f6o.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f6o.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.M;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (t(this.h)) {
            s(this.h, i, max, i2, this.v);
            i6 = k(this.h) + this.h.getMeasuredWidth();
            i4 = Math.max(i4, l(this.h) + this.h.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (t(this.p)) {
            max3 += r(this.p, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.p) + this.p.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.p.getMeasuredState());
        }
        if (t(this.l)) {
            max3 += r(this.l, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.l) + this.l.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.l.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((ZV) childAt.getLayoutParams()).b == 0 && t(childAt)) {
                max3 += r(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.y + this.z;
        int i14 = this.w + this.x;
        if (t(this.i)) {
            r(this.i, i, i12 + i14, i2, i13, iArr);
            int k = k(this.i) + this.i.getMeasuredWidth();
            i7 = l(this.i) + this.i.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.i.getMeasuredState());
            i9 = k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (t(this.j)) {
            i9 = Math.max(i9, r(this.j, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += l(this.j) + this.j.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.j.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.W) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof C0780bW)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0780bW c0780bW = (C0780bW) parcelable;
        super.onRestoreInstanceState(c0780bW.h);
        ActionMenuView actionMenuView = this.h;
        MenuC0825cC menuC0825cC = actionMenuView != null ? actionMenuView.w : null;
        int i = c0780bW.j;
        if (i != 0 && this.T != null && menuC0825cC != null && (findItem = menuC0825cC.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c0780bW.k) {
            R2 r2 = this.d0;
            removeCallbacks(r2);
            post(r2);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        XO xo = this.A;
        boolean z = i == 1;
        if (z == xo.g) {
            return;
        }
        xo.g = z;
        if (!xo.h) {
            xo.a = xo.e;
            xo.b = xo.f;
            return;
        }
        if (z) {
            int i2 = xo.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = xo.e;
            }
            xo.a = i2;
            int i3 = xo.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = xo.f;
            }
            xo.b = i3;
            return;
        }
        int i4 = xo.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = xo.e;
        }
        xo.a = i4;
        int i5 = xo.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = xo.f;
        }
        xo.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1284jC c1284jC;
        C0780bW c0780bW = new C0780bW(super.onSaveInstanceState());
        YV yv = this.T;
        if (yv != null && (c1284jC = yv.i) != null) {
            c0780bW.j = c1284jC.a;
        }
        c0780bW.k = o();
        return c0780bW;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.I = false;
        }
        if (!this.I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.I = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.I = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        ZV zv = (ZV) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) zv).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) zv).rightMargin + max;
    }

    public final int q(View view, int i, int i2, int[] iArr) {
        ZV zv = (ZV) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) zv).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) zv).leftMargin);
    }

    public final int r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.c0 != z) {
            this.c0 = z;
            v();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(EB.t(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.W = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.C) {
            this.C = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.B) {
            this.B = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(EB.t(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(EB.t(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.k.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0714aW interfaceC0714aW) {
        this.P = interfaceC0714aW;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.h.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.r != i) {
            this.r = i;
            if (i == 0) {
                this.q = getContext();
            } else {
                this.q = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.z = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.y = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean u() {
        C2128w1 c2128w1;
        ActionMenuView actionMenuView = this.h;
        return (actionMenuView == null || (c2128w1 = actionMenuView.A) == null || !c2128w1.l()) ? false : true;
    }

    public final void v() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = XV.a(this);
            YV yv = this.T;
            boolean z = (yv == null || yv.i == null || a == null || !isAttachedToWindow() || !this.c0) ? false : true;
            if (z && this.b0 == null) {
                if (this.a0 == null) {
                    this.a0 = XV.b(new VV(this, 0));
                }
                XV.c(a, this.a0);
                this.b0 = a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.b0) == null) {
                return;
            }
            XV.d(onBackInvokedDispatcher, this.a0);
            this.b0 = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ZV zv = new ZV(context, attributeSet);
        zv.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1886sL.b);
        zv.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        zv.b = 0;
        return zv;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1673p5 c1673p5 = this.f6o;
        if (c1673p5 != null) {
            c1673p5.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f6o.setImageDrawable(drawable);
        } else {
            C1673p5 c1673p5 = this.f6o;
            if (c1673p5 != null) {
                c1673p5.setImageDrawable(this.m);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.l == null) {
                this.l = new C1804r5(getContext(), null, 0);
            }
            if (!n(this.l)) {
                b(this.l, true);
            }
        } else {
            C1804r5 c1804r5 = this.l;
            if (c1804r5 != null && n(c1804r5)) {
                removeView(this.l);
                this.L.remove(this.l);
            }
        }
        C1804r5 c1804r52 = this.l;
        if (c1804r52 != null) {
            c1804r52.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.l == null) {
            this.l = new C1804r5(getContext(), null, 0);
        }
        C1804r5 c1804r5 = this.l;
        if (c1804r5 != null) {
            c1804r5.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1673p5 c1673p5 = this.k;
        if (c1673p5 != null) {
            c1673p5.setContentDescription(charSequence);
            TM.C(this.k, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.k)) {
                b(this.k, true);
            }
        } else {
            C1673p5 c1673p5 = this.k;
            if (c1673p5 != null && n(c1673p5)) {
                removeView(this.k);
                this.L.remove(this.k);
            }
        }
        C1673p5 c1673p52 = this.k;
        if (c1673p52 != null) {
            c1673p52.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            V5 v5 = this.j;
            if (v5 != null && n(v5)) {
                removeView(this.j);
                this.L.remove(this.j);
            }
        } else {
            if (this.j == null) {
                Context context = getContext();
                V5 v52 = new V5(context, null);
                this.j = v52;
                v52.setSingleLine();
                this.j.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.t;
                if (i != 0) {
                    this.j.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.H;
                if (colorStateList != null) {
                    this.j.setTextColor(colorStateList);
                }
            }
            if (!n(this.j)) {
                b(this.j, true);
            }
        }
        V5 v53 = this.j;
        if (v53 != null) {
            v53.setText(charSequence);
        }
        this.F = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.H = colorStateList;
        V5 v5 = this.j;
        if (v5 != null) {
            v5.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            V5 v5 = this.i;
            if (v5 != null && n(v5)) {
                removeView(this.i);
                this.L.remove(this.i);
            }
        } else {
            if (this.i == null) {
                Context context = getContext();
                V5 v52 = new V5(context, null);
                this.i = v52;
                v52.setSingleLine();
                this.i.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.s;
                if (i != 0) {
                    this.i.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    this.i.setTextColor(colorStateList);
                }
            }
            if (!n(this.i)) {
                b(this.i, true);
            }
        }
        V5 v53 = this.i;
        if (v53 != null) {
            v53.setText(charSequence);
        }
        this.E = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        V5 v5 = this.i;
        if (v5 != null) {
            v5.setTextColor(colorStateList);
        }
    }
}
