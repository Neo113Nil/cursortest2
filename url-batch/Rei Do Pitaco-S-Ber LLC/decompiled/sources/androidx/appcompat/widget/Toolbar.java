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
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.ionia.reidopitaco.libya.R;
import defpackage.a40;
import defpackage.ae;
import defpackage.f80;
import defpackage.h90;
import defpackage.j4;
import defpackage.j50;
import defpackage.k00;
import defpackage.k1;
import defpackage.k50;
import defpackage.kx;
import defpackage.l4;
import defpackage.l50;
import defpackage.m50;
import defpackage.mk;
import defpackage.n50;
import defpackage.o50;
import defpackage.p5;
import defpackage.p50;
import defpackage.r50;
import defpackage.s50;
import defpackage.ss;
import defpackage.u6;
import defpackage.ur;
import defpackage.v0;
import defpackage.vs;
import defpackage.vv;
import defpackage.y5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public final int B;
    public CharSequence C;
    public CharSequence D;
    public ColorStateList E;
    public ColorStateList F;
    public boolean G;
    public boolean H;
    public final ArrayList I;
    public final ArrayList J;
    public final int[] K;
    public final y5 L;
    public ArrayList M;
    public final k50 N;
    public r50 O;
    public k1 P;
    public m50 Q;
    public boolean R;
    public OnBackInvokedCallback S;
    public OnBackInvokedDispatcher T;
    public boolean U;
    public final u6 V;
    public ActionMenuView f;
    public p5 g;
    public p5 h;
    public j4 i;
    public l4 j;
    public final Drawable k;
    public final CharSequence l;
    public j4 m;
    public View n;
    public Context o;
    public int p;
    public int q;
    public int r;
    public final int s;
    public final int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public k00 y;
    public int z;

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.B = 8388627;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.K = new int[2];
        this.L = new y5(new j50(this, 1));
        this.M = new ArrayList();
        this.N = new k50(this);
        this.V = new u6(11, this);
        Context context2 = getContext();
        int[] iArr = kx.w;
        y5 l = y5.l(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        f80.l(this, context, iArr, attributeSet, (TypedArray) l.a, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) l.a;
        this.q = typedArray.getResourceId(28, 0);
        this.r = typedArray.getResourceId(19, 0);
        this.B = typedArray.getInteger(0, 8388627);
        this.s = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        this.u = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.u = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.v = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.w = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.x = dimensionPixelOffset5;
        }
        this.t = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        k00 k00Var = this.y;
        k00Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            k00Var.e = dimensionPixelSize;
            k00Var.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            k00Var.f = dimensionPixelSize2;
            k00Var.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            k00Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.z = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.k = l.f(4);
        this.l = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.o = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable f = l.f(16);
        if (f != null) {
            setNavigationIcon(f);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable f2 = l.f(11);
        if (f2 != null) {
            setLogo(f2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(l.e(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(l.e(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        l.n();
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
        return new a40(getContext());
    }

    public static n50 h() {
        n50 n50Var = new n50(-2, -2);
        n50Var.b = 0;
        n50Var.a = 8388627;
        return n50Var;
    }

    public static n50 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof n50;
        if (z) {
            n50 n50Var = (n50) layoutParams;
            n50 n50Var2 = new n50(n50Var);
            n50Var2.b = 0;
            n50Var2.b = n50Var.b;
            return n50Var2;
        }
        if (z) {
            n50 n50Var3 = new n50((n50) layoutParams);
            n50Var3.b = 0;
            return n50Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            n50 n50Var4 = new n50(layoutParams);
            n50Var4.b = 0;
            return n50Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        n50 n50Var5 = new n50(marginLayoutParams);
        n50Var5.b = 0;
        ((ViewGroup.MarginLayoutParams) n50Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) n50Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) n50Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) n50Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return n50Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                n50 n50Var = (n50) childAt.getLayoutParams();
                if (n50Var.b == 0 && s(childAt)) {
                    int i3 = n50Var.a;
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
            n50 n50Var2 = (n50) childAt2.getLayoutParams();
            if (n50Var2.b == 0 && s(childAt2)) {
                int i5 = n50Var2.a;
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
        n50 h = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (n50) layoutParams;
        h.b = 1;
        if (!z || this.n == null) {
            addView(view, h);
        } else {
            view.setLayoutParams(h);
            this.J.add(view);
        }
    }

    public final void c() {
        if (this.m == null) {
            j4 j4Var = new j4(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.m = j4Var;
            j4Var.setImageDrawable(this.k);
            this.m.setContentDescription(this.l);
            n50 h = h();
            h.a = (this.s & 112) | 8388611;
            h.b = 2;
            this.m.setLayoutParams(h);
            this.m.setOnClickListener(new v0(4, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof n50);
    }

    public final void d() {
        if (this.y == null) {
            k00 k00Var = new k00();
            k00Var.a = 0;
            k00Var.b = 0;
            k00Var.c = Integer.MIN_VALUE;
            k00Var.d = Integer.MIN_VALUE;
            k00Var.e = 0;
            k00Var.f = 0;
            k00Var.g = false;
            k00Var.h = false;
            this.y = k00Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView.u == null) {
            ss ssVar = (ss) actionMenuView.getMenu();
            if (this.Q == null) {
                this.Q = new m50(this);
            }
            this.f.setExpandedActionViewsExclusive(true);
            ssVar.b(this.Q, this.o);
            t();
        }
    }

    public final void f() {
        if (this.f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f = actionMenuView;
            actionMenuView.setPopupTheme(this.p);
            this.f.setOnMenuItemClickListener(this.N);
            ActionMenuView actionMenuView2 = this.f;
            k50 k50Var = new k50(this);
            actionMenuView2.getClass();
            actionMenuView2.z = k50Var;
            n50 h = h();
            h.a = (this.s & 112) | 8388613;
            this.f.setLayoutParams(h);
            b(this.f, false);
        }
    }

    public final void g() {
        if (this.i == null) {
            this.i = new j4(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            n50 h = h();
            h.a = (this.s & 112) | 8388611;
            this.i.setLayoutParams(h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        n50 n50Var = new n50(context, attributeSet);
        n50Var.a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kx.b);
        n50Var.a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        n50Var.b = 0;
        return n50Var;
    }

    public CharSequence getCollapseContentDescription() {
        j4 j4Var = this.m;
        if (j4Var != null) {
            return j4Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        j4 j4Var = this.m;
        if (j4Var != null) {
            return j4Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        k00 k00Var = this.y;
        if (k00Var != null) {
            return k00Var.g ? k00Var.a : k00Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        k00 k00Var = this.y;
        if (k00Var != null) {
            return k00Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        k00 k00Var = this.y;
        if (k00Var != null) {
            return k00Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        k00 k00Var = this.y;
        if (k00Var != null) {
            return k00Var.g ? k00Var.b : k00Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        ss ssVar;
        ActionMenuView actionMenuView = this.f;
        return (actionMenuView == null || (ssVar = actionMenuView.u) == null || !ssVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        l4 l4Var = this.j;
        if (l4Var != null) {
            return l4Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        l4 l4Var = this.j;
        if (l4Var != null) {
            return l4Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f.getMenu();
    }

    public View getNavButtonView() {
        return this.i;
    }

    public CharSequence getNavigationContentDescription() {
        j4 j4Var = this.i;
        if (j4Var != null) {
            return j4Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        j4 j4Var = this.i;
        if (j4Var != null) {
            return j4Var.getDrawable();
        }
        return null;
    }

    public k1 getOuterActionMenuPresenter() {
        return this.P;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.o;
    }

    public int getPopupTheme() {
        return this.p;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public final TextView getSubtitleTextView() {
        return this.h;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.x;
    }

    public int getTitleMarginEnd() {
        return this.v;
    }

    public int getTitleMarginStart() {
        return this.u;
    }

    public int getTitleMarginTop() {
        return this.w;
    }

    public final TextView getTitleTextView() {
        return this.g;
    }

    public ae getWrapper() {
        Drawable drawable;
        if (this.O == null) {
            r50 r50Var = new r50();
            r50Var.n = 0;
            r50Var.a = this;
            r50Var.h = getTitle();
            r50Var.i = getSubtitle();
            r50Var.g = r50Var.h != null;
            r50Var.f = getNavigationIcon();
            y5 l = y5.l(R.attr.actionBarStyle, 0, getContext(), null, kx.a);
            TypedArray typedArray = (TypedArray) l.a;
            r50Var.o = l.f(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                r50Var.g = true;
                r50Var.h = text;
                if ((r50Var.b & 8) != 0) {
                    setTitle(text);
                    if (r50Var.g) {
                        f80.n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                r50Var.i = text2;
                if ((r50Var.b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable f = l.f(20);
            if (f != null) {
                r50Var.e = f;
                r50Var.c();
            }
            Drawable f2 = l.f(17);
            if (f2 != null) {
                r50Var.d = f2;
                r50Var.c();
            }
            if (r50Var.f == null && (drawable = r50Var.o) != null) {
                r50Var.f = drawable;
                if ((r50Var.b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            r50Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = r50Var.c;
                if (view != null && (r50Var.b & 16) != 0) {
                    removeView(view);
                }
                r50Var.c = inflate;
                if (inflate != null && (r50Var.b & 16) != 0) {
                    addView(inflate);
                }
                r50Var.a(r50Var.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.y.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.q = resourceId2;
                p5 p5Var = this.g;
                if (p5Var != null) {
                    p5Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.r = resourceId3;
                p5 p5Var2 = this.h;
                if (p5Var2 != null) {
                    p5Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            l.n();
            if (R.string.abc_action_bar_up_description != r50Var.n) {
                r50Var.n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = r50Var.n;
                    r50Var.j = i != 0 ? getContext().getString(i) : null;
                    r50Var.b();
                }
            }
            r50Var.j = getNavigationContentDescription();
            setNavigationOnClickListener(new ur(r50Var));
            this.O = r50Var;
        }
        return this.O;
    }

    public final int j(View view, int i) {
        n50 n50Var = (n50) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = n50Var.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) n50Var).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) n50Var).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) n50Var).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    public final void m() {
        ArrayList arrayList = this.M;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.L.c).iterator();
        while (it.hasNext()) {
            ((mk) it.next()).a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.M = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.J.contains(view);
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        n50 n50Var = (n50) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) n50Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j, max + measuredWidth, view.getMeasuredHeight() + j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) n50Var).rightMargin + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.V);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.H = false;
        }
        if (!this.H) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.H = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.H = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0285 A[LOOP:0: B:44:0x0283->B:45:0x0285, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x029d A[LOOP:1: B:48:0x029b->B:49:0x029d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02bd A[LOOP:2: B:52:0x02bb->B:53:0x02bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0310 A[LOOP:3: B:61:0x030e->B:62:0x0310, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int max;
        boolean s;
        boolean s2;
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
        int[] iArr = this.K;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = f80.a;
        int minimumHeight = getMinimumHeight();
        int min = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (s(this.i)) {
            j4 j4Var = this.i;
            if (z3) {
                i6 = p(j4Var, i19, min, iArr);
                i5 = paddingLeft;
                if (s(this.m)) {
                    j4 j4Var2 = this.m;
                    if (z3) {
                        i6 = p(j4Var2, i6, min, iArr);
                    } else {
                        i5 = o(j4Var2, i5, min, iArr);
                    }
                }
                if (s(this.f)) {
                    ActionMenuView actionMenuView = this.f;
                    if (z3) {
                        i5 = o(actionMenuView, i5, min, iArr);
                    } else {
                        i6 = p(actionMenuView, i6, min, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i19 - i6));
                max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i19 - currentContentInsetRight);
                if (s(this.n)) {
                    View view = this.n;
                    if (z3) {
                        min2 = p(view, min2, min, iArr);
                    } else {
                        max = o(view, max, min, iArr);
                    }
                }
                if (s(this.j)) {
                    l4 l4Var = this.j;
                    if (z3) {
                        min2 = p(l4Var, min2, min, iArr);
                    } else {
                        max = o(l4Var, max, min, iArr);
                    }
                }
                s = s(this.g);
                s2 = s(this.h);
                if (s) {
                    z2 = z3;
                    i7 = 0;
                } else {
                    n50 n50Var = (n50) this.g.getLayoutParams();
                    z2 = z3;
                    i7 = this.g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n50Var).topMargin + ((ViewGroup.MarginLayoutParams) n50Var).bottomMargin;
                }
                if (!s2) {
                    n50 n50Var2 = (n50) this.h.getLayoutParams();
                    i7 = this.h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) n50Var2).topMargin + ((ViewGroup.MarginLayoutParams) n50Var2).bottomMargin + i7;
                }
                if (!s || s2) {
                    p5 p5Var = !s ? this.g : this.h;
                    p5 p5Var2 = !s2 ? this.h : this.g;
                    n50 n50Var3 = (n50) p5Var.getLayoutParams();
                    n50 n50Var4 = (n50) p5Var2.getLayoutParams();
                    int i20 = i7;
                    boolean z4 = (!s && this.g.getMeasuredWidth() > 0) || (s2 && this.h.getMeasuredWidth() > 0);
                    i8 = this.B & 112;
                    int i21 = max;
                    if (i8 != 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) n50Var3).topMargin + this.w;
                    } else if (i8 != 80) {
                        int i22 = (((height - paddingTop2) - paddingBottom) - i20) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) n50Var3).topMargin + this.w;
                        if (i22 < i23) {
                            i22 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i20) - i22) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) n50Var3).bottomMargin;
                            int i26 = this.x;
                            if (i24 < i25 + i26) {
                                i22 = Math.max(0, i22 - ((((ViewGroup.MarginLayoutParams) n50Var4).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + i22;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) n50Var4).bottomMargin) - this.x) - i20;
                    }
                    if (z2) {
                        int i27 = (z4 ? this.u : 0) - iArr[0];
                        max = Math.max(0, i27) + i21;
                        iArr[0] = Math.max(0, -i27);
                        if (s) {
                            n50 n50Var5 = (n50) this.g.getLayoutParams();
                            int measuredWidth = this.g.getMeasuredWidth() + max;
                            int measuredHeight = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i9 = measuredWidth + this.v;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) n50Var5).bottomMargin;
                        } else {
                            i9 = max;
                        }
                        if (s2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n50) this.h.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.h.getMeasuredWidth() + max;
                            this.h.layout(max, i28, measuredWidth2, this.h.getMeasuredHeight() + i28);
                            i10 = measuredWidth2 + this.v;
                        } else {
                            i10 = max;
                        }
                        if (z4) {
                            max = Math.max(i9, i10);
                        }
                    } else {
                        int i29 = (z4 ? this.u : 0) - iArr[1];
                        min2 -= Math.max(0, i29);
                        iArr[1] = Math.max(0, -i29);
                        if (s) {
                            n50 n50Var6 = (n50) this.g.getLayoutParams();
                            int measuredWidth3 = min2 - this.g.getMeasuredWidth();
                            int measuredHeight2 = this.g.getMeasuredHeight() + paddingTop;
                            this.g.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i11 = measuredWidth3 - this.v;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) n50Var6).bottomMargin;
                        } else {
                            i11 = min2;
                        }
                        if (s2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((n50) this.h.getLayoutParams())).topMargin;
                            this.h.layout(min2 - this.h.getMeasuredWidth(), i30, min2, this.h.getMeasuredHeight() + i30);
                            i12 = min2 - this.v;
                        } else {
                            i12 = min2;
                        }
                        if (z4) {
                            min2 = Math.min(i11, i12);
                        }
                        max = i21;
                    }
                }
                ArrayList arrayList = this.I;
                a(arrayList, 3);
                size = arrayList.size();
                i13 = max;
                for (i14 = 0; i14 < size; i14++) {
                    i13 = o((View) arrayList.get(i14), i13, min, iArr);
                }
                a(arrayList, 5);
                size2 = arrayList.size();
                for (i15 = 0; i15 < size2; i15++) {
                    min2 = p((View) arrayList.get(i15), min2, min, iArr);
                }
                a(arrayList, 1);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i16 = 0;
                int i34 = 0;
                while (i16 < size3) {
                    View view2 = (View) arrayList.get(i16);
                    n50 n50Var7 = (n50) view2.getLayoutParams();
                    int i35 = i32;
                    int i36 = ((ViewGroup.MarginLayoutParams) n50Var7).leftMargin - i33;
                    int i37 = ((ViewGroup.MarginLayoutParams) n50Var7).rightMargin - i35;
                    int max2 = Math.max(0, i36);
                    int max3 = Math.max(0, i37);
                    int max4 = Math.max(0, -i36);
                    int max5 = Math.max(0, -i37);
                    i34 += view2.getMeasuredWidth() + max2 + max3;
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
                    i13 = o((View) arrayList.get(i17), i13, min, iArr);
                }
                arrayList.clear();
            }
            i5 = o(j4Var, paddingLeft, min, iArr);
        } else {
            i5 = paddingLeft;
        }
        i6 = i19;
        if (s(this.m)) {
        }
        if (s(this.f)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i19 - i6));
        max = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i19 - currentContentInsetRight2);
        if (s(this.n)) {
        }
        if (s(this.j)) {
        }
        s = s(this.g);
        s2 = s(this.h);
        if (s) {
        }
        if (!s2) {
        }
        if (!s) {
        }
        if (!s) {
        }
        if (!s2) {
        }
        n50 n50Var32 = (n50) p5Var.getLayoutParams();
        n50 n50Var42 = (n50) p5Var2.getLayoutParams();
        int i202 = i7;
        if (s) {
        }
        i8 = this.B & 112;
        int i212 = max;
        if (i8 != 48) {
        }
        if (z2) {
        }
        ArrayList arrayList2 = this.I;
        a(arrayList2, 3);
        size = arrayList2.size();
        i13 = max;
        while (i14 < size) {
        }
        a(arrayList2, 5);
        size2 = arrayList2.size();
        while (i15 < size2) {
        }
        a(arrayList2, 1);
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
        boolean z = h90.a;
        int i10 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c = 0;
        } else {
            c = 1;
            objArr = false;
        }
        if (s(this.i)) {
            r(this.i, i, 0, i2, this.t);
            i3 = k(this.i) + this.i.getMeasuredWidth();
            i4 = Math.max(0, l(this.i) + this.i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.i.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (s(this.m)) {
            r(this.m, i, 0, i2, this.t);
            i3 = k(this.m) + this.m.getMeasuredWidth();
            i4 = Math.max(i4, l(this.m) + this.m.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        int max2 = Math.max(0, currentContentInsetStart - i3);
        Object[] objArr2 = objArr;
        int[] iArr = this.K;
        iArr[objArr2 == true ? 1 : 0] = max2;
        if (s(this.f)) {
            r(this.f, i, max, i2, this.t);
            i6 = k(this.f) + this.f.getMeasuredWidth();
            i4 = Math.max(i4, l(this.f) + this.f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (s(this.n)) {
            max3 += q(this.n, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.n) + this.n.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.n.getMeasuredState());
        }
        if (s(this.j)) {
            max3 += q(this.j, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, l(this.j) + this.j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((n50) childAt.getLayoutParams()).b == 0 && s(childAt)) {
                max3 += q(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i4, l(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max4;
            } else {
                max3 = max3;
            }
        }
        int i12 = max3;
        int i13 = this.w + this.x;
        int i14 = this.u + this.v;
        if (s(this.g)) {
            q(this.g, i, i12 + i14, i2, i13, iArr);
            int k = k(this.g) + this.g.getMeasuredWidth();
            i7 = l(this.g) + this.g.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
            i9 = k;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (s(this.h)) {
            i9 = Math.max(i9, q(this.h, i, i12 + i14, i2, i13 + i7, iArr));
            i7 += l(this.h) + this.h.getMeasuredHeight();
            i8 = View.combineMeasuredStates(i8, this.h.getMeasuredState());
        }
        int max5 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i12 + i9;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (this.R) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!s(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
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
        if (!(parcelable instanceof p50)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p50 p50Var = (p50) parcelable;
        super.onRestoreInstanceState(p50Var.f);
        ActionMenuView actionMenuView = this.f;
        ss ssVar = actionMenuView != null ? actionMenuView.u : null;
        int i = p50Var.h;
        if (i != 0 && this.Q != null && ssVar != null && (findItem = ssVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (p50Var.i) {
            u6 u6Var = this.V;
            removeCallbacks(u6Var);
            post(u6Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        k00 k00Var = this.y;
        boolean z = i == 1;
        if (z == k00Var.g) {
            return;
        }
        k00Var.g = z;
        if (!k00Var.h) {
            k00Var.a = k00Var.e;
            k00Var.b = k00Var.f;
            return;
        }
        if (z) {
            int i2 = k00Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = k00Var.e;
            }
            k00Var.a = i2;
            int i3 = k00Var.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = k00Var.f;
            }
            k00Var.b = i3;
            return;
        }
        int i4 = k00Var.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = k00Var.e;
        }
        k00Var.a = i4;
        int i5 = k00Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = k00Var.f;
        }
        k00Var.b = i5;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k1 k1Var;
        vs vsVar;
        p50 p50Var = new p50(super.onSaveInstanceState());
        m50 m50Var = this.Q;
        if (m50Var != null && (vsVar = m50Var.g) != null) {
            p50Var.h = vsVar.a;
        }
        ActionMenuView actionMenuView = this.f;
        p50Var.i = (actionMenuView == null || (k1Var = actionMenuView.y) == null || !k1Var.h()) ? false : true;
        return p50Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
        }
        if (!this.G) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.G = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.G = false;
        return true;
    }

    public final int p(View view, int i, int i2, int[] iArr) {
        n50 n50Var = (n50) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) n50Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int j = j(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j, max, view.getMeasuredHeight() + j);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) n50Var).leftMargin);
    }

    public final int q(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void r(View view, int i, int i2, int i3, int i4) {
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

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.U != z) {
            this.U = z;
            t();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        j4 j4Var = this.m;
        if (j4Var != null) {
            j4Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.m.setImageDrawable(drawable);
        } else {
            j4 j4Var = this.m;
            if (j4Var != null) {
                j4Var.setImageDrawable(this.k);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        l4 l4Var = this.j;
        if (drawable != null) {
            if (l4Var == null) {
                this.j = new l4(getContext(), null, 0);
            }
            if (!n(this.j)) {
                b(this.j, true);
            }
        } else if (l4Var != null && n(l4Var)) {
            removeView(this.j);
            this.J.remove(this.j);
        }
        l4 l4Var2 = this.j;
        if (l4Var2 != null) {
            l4Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.j == null) {
            this.j = new l4(getContext(), null, 0);
        }
        l4 l4Var = this.j;
        if (l4Var != null) {
            l4Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        j4 j4Var = this.i;
        if (j4Var != null) {
            j4Var.setContentDescription(charSequence);
            s50.a(this.i, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.i)) {
                b(this.i, true);
            }
        } else {
            j4 j4Var = this.i;
            if (j4Var != null && n(j4Var)) {
                removeView(this.i);
                this.J.remove(this.i);
            }
        }
        j4 j4Var2 = this.i;
        if (j4Var2 != null) {
            j4Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.p != i) {
            this.p = i;
            if (i == 0) {
                this.o = getContext();
            } else {
                this.o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p5 p5Var = this.h;
        if (!isEmpty) {
            if (p5Var == null) {
                Context context = getContext();
                p5 p5Var2 = new p5(context, null);
                this.h = p5Var2;
                p5Var2.setSingleLine();
                this.h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.r;
                if (i != 0) {
                    this.h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.h.setTextColor(colorStateList);
                }
            }
            if (!n(this.h)) {
                b(this.h, true);
            }
        } else if (p5Var != null && n(p5Var)) {
            removeView(this.h);
            this.J.remove(this.h);
        }
        p5 p5Var3 = this.h;
        if (p5Var3 != null) {
            p5Var3.setText(charSequence);
        }
        this.D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.F = colorStateList;
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p5 p5Var = this.g;
        if (!isEmpty) {
            if (p5Var == null) {
                Context context = getContext();
                p5 p5Var2 = new p5(context, null);
                this.g = p5Var2;
                p5Var2.setSingleLine();
                this.g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.q;
                if (i != 0) {
                    this.g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.g.setTextColor(colorStateList);
                }
            }
            if (!n(this.g)) {
                b(this.g, true);
            }
        } else if (p5Var != null && n(p5Var)) {
            removeView(this.g);
            this.J.remove(this.g);
        }
        p5 p5Var3 = this.g;
        if (p5Var3 != null) {
            p5Var3.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        p5 p5Var = this.g;
        if (p5Var != null) {
            p5Var.setTextColor(colorStateList);
        }
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a = l50.a(this);
            m50 m50Var = this.Q;
            int i = 0;
            boolean z = (m50Var == null || m50Var.g == null || a == null || !isAttachedToWindow() || !this.U) ? false : true;
            if (z && this.T == null) {
                if (this.S == null) {
                    this.S = l50.b(new j50(this, i));
                }
                l50.c(a, this.S);
                this.T = a;
                return;
            }
            if (z || (onBackInvokedDispatcher = this.T) == null) {
                return;
            }
            l50.d(onBackInvokedDispatcher, this.S);
            this.T = null;
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(vv.t(getContext(), i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(vv.t(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(vv.t(getContext(), i));
    }

    public void setOnMenuItemClickListener(o50 o50Var) {
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
