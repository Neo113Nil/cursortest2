package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class fu extends ViewGroup implements lt {
    public static final int[] e0 = {R.attr.state_checked};
    public static final int[] f0 = {-16842910};
    public final SparseArray A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public o10 N;
    public boolean O;
    public ColorStateList P;
    public hu Q;
    public du R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;
    public MenuItem a0;
    public int b0;
    public boolean c0;
    public final Rect d0;
    public final v6 f;
    public final v0 g;
    public ow h;
    public final SparseArray i;
    public int j;
    public int k;
    public eu[] l;
    public int m;
    public int n;
    public ColorStateList o;
    public int p;
    public ColorStateList q;
    public final ColorStateList r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public Drawable x;
    public ColorStateList y;
    public int z;

    public fu(Context context) {
        super(context);
        this.i = new SparseArray();
        this.m = -1;
        this.n = -1;
        this.A = new SparseArray();
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.M = 49;
        this.O = false;
        this.U = 1;
        this.V = 0;
        this.a0 = null;
        this.b0 = 7;
        this.c0 = false;
        this.d0 = new Rect();
        this.r = c();
        if (isInEditMode()) {
            this.f = null;
        } else {
            v6 v6Var = new v6();
            this.f = v6Var;
            v6Var.M(0);
            v6Var.n();
            v6Var.B(m60.T(getContext(), com.ionia.reidopitaco.libya.R.attr.motionDurationMedium4, getResources().getInteger(com.ionia.reidopitaco.libya.R.integer.material_motion_duration_long_1)));
            v6Var.D(m60.U(getContext(), com.ionia.reidopitaco.libya.R.attr.motionEasingStandard, y2.b));
            v6Var.J(new x40());
        }
        this.g = new v0(3, (x7) this);
        setImportantForAccessibility(1);
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.b0, this.R.e);
    }

    private bu getNewItem() {
        ow owVar = this.h;
        bu buVar = owVar != null ? (bu) owVar.a() : null;
        return buVar == null ? new w7(getContext()) : buVar;
    }

    private void setBadgeIfNeeded(bu buVar) {
        z6 z6Var;
        int id = buVar.getId();
        if (id == -1 || (z6Var = (z6) this.A.get(id)) == null) {
            return;
        }
        buVar.setBadge(z6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        bu buVar;
        removeAllViews();
        eu[] euVarArr = this.l;
        if (euVarArr != null && this.h != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    bu buVar2 = (bu) euVar;
                    this.h.c(buVar2);
                    buVar2.j(buVar2.y);
                    buVar2.N = null;
                    buVar2.T = 0.0f;
                    buVar2.f = false;
                }
            }
        }
        this.Q.g = true;
        this.R.b();
        this.Q.g = false;
        int i = this.R.c;
        if (i == 0) {
            this.m = 0;
            this.n = 0;
            this.l = null;
            this.h = null;
            return;
        }
        if (this.h == null || this.V != i) {
            this.V = i;
            this.h = new ow(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.R.b.size(); i2++) {
            hashSet.add(Integer.valueOf(this.R.a(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.A;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i3++;
        }
        int size = this.R.b.size();
        this.l = new eu[size];
        int i4 = this.j;
        boolean z = i4 != -1 ? i4 == 0 : getCurrentVisibleContentItemCount() > 3;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem a = this.R.a(i7);
            boolean z2 = a instanceof sf;
            if (z2) {
                Context context = getContext();
                yt ytVar = new yt(context);
                LayoutInflater.from(context).inflate(com.ionia.reidopitaco.libya.R.layout.m3_navigation_menu_divider, (ViewGroup) ytVar, true);
                ytVar.a();
                ytVar.setOnlyShowWhenExpanded(true);
                ytVar.setDividersEnabled(this.c0);
                buVar = ytVar;
            } else if (a.hasSubMenu()) {
                if (i5 > 0) {
                    l8.l("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                    return;
                }
                iu iuVar = new iu(getContext());
                int i8 = this.v;
                if (i8 == 0) {
                    i8 = this.t;
                }
                iuVar.setTextAppearance(i8);
                iuVar.setTextColor(this.q);
                iuVar.setOnlyShowWhenExpanded(true);
                iuVar.c((vs) a);
                i5 = a.getSubMenu().size();
                buVar = iuVar;
            } else if (i5 > 0) {
                i5--;
                buVar = e(i7, (vs) a, z, true);
            } else {
                vs vsVar = (vs) a;
                boolean z3 = i6 >= this.b0;
                i6++;
                buVar = e(i7, vsVar, z, z3);
            }
            if (!z2 && a.isCheckable() && this.n == -1) {
                this.n = i7;
            }
            this.l[i7] = buVar;
            addView(buVar);
        }
        int min = Math.min(size - 1, this.n);
        this.n = min;
        setCheckedItem(this.l[min].getItemData());
    }

    @Override // defpackage.lt
    public final void b(ss ssVar) {
        this.R = new du(ssVar);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList r = vv.r(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.ionia.reidopitaco.libya.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = r.getDefaultColor();
        int[] iArr = e0;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = f0;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{r.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public final ls d() {
        if (this.N == null || this.P == null) {
            return null;
        }
        ls lsVar = new ls(this.N);
        lsVar.r(this.P);
        return lsVar;
    }

    public final bu e(int i, vs vsVar, boolean z, boolean z2) {
        this.Q.g = true;
        vsVar.setCheckable(true);
        this.Q.g = false;
        bu newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.U);
        newItem.setIconTintList(this.o);
        newItem.setIconSize(this.p);
        newItem.setTextColor(this.r);
        newItem.setTextAppearanceInactive(this.s);
        newItem.setTextAppearanceActive(this.t);
        newItem.setHorizontalTextAppearanceInactive(this.u);
        newItem.setHorizontalTextAppearanceActive(this.v);
        newItem.setTextAppearanceActiveBoldEnabled(this.w);
        newItem.setTextColor(this.q);
        int i2 = this.B;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.C;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.S);
        newItem.setLabelFontScalingEnabled(this.T);
        int i4 = this.D;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.E;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.G);
        newItem.setActiveIndicatorHeight(this.H);
        newItem.setActiveIndicatorExpandedWidth(this.I);
        newItem.setActiveIndicatorExpandedHeight(this.J);
        newItem.setActiveIndicatorMarginHorizontal(this.K);
        newItem.setItemGravity(this.M);
        newItem.setActiveIndicatorExpandedPadding(this.d0);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.L);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.O);
        newItem.setActiveIndicatorEnabled(this.F);
        Drawable drawable = this.x;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.z);
        }
        newItem.setItemRippleColor(this.y);
        newItem.setLabelVisibilityMode(this.j);
        newItem.setItemIconGravity(this.k);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.W);
        newItem.c(vsVar);
        newItem.setItemPosition(i);
        int i6 = vsVar.a;
        newItem.setOnTouchListener((View.OnTouchListener) this.i.get(i6));
        newItem.setOnClickListener(this.g);
        int i7 = this.m;
        if (i7 != 0 && i6 == i7) {
            this.n = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.D;
    }

    public SparseArray<z6> getBadgeDrawables() {
        return this.A;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.W ? this.R.d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.v;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.u;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.E;
    }

    public ColorStateList getIconTintList() {
        return this.o;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.P;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.F;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.J;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.L;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.I;
    }

    public int getItemActiveIndicatorHeight() {
        return this.H;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.K;
    }

    public o10 getItemActiveIndicatorShapeAppearance() {
        return this.N;
    }

    public int getItemActiveIndicatorWidth() {
        return this.G;
    }

    public Drawable getItemBackground() {
        eu[] euVarArr = this.l;
        if (euVarArr != null && euVarArr.length > 0) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    return ((bu) euVar).getBackground();
                }
            }
        }
        return this.x;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.z;
    }

    public int getItemGravity() {
        return this.M;
    }

    public int getItemIconGravity() {
        return this.k;
    }

    public int getItemIconSize() {
        return this.p;
    }

    public int getItemPaddingBottom() {
        return this.C;
    }

    public int getItemPaddingTop() {
        return this.B;
    }

    public ColorStateList getItemRippleColor() {
        return this.y;
    }

    public int getItemTextAppearanceActive() {
        return this.t;
    }

    public int getItemTextAppearanceInactive() {
        return this.s;
    }

    public ColorStateList getItemTextColor() {
        return this.q;
    }

    public int getLabelMaxLines() {
        return this.U;
    }

    public int getLabelVisibilityMode() {
        return this.j;
    }

    public du getMenu() {
        return this.R;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.T;
    }

    public int getSelectedItemId() {
        return this.m;
    }

    public int getSelectedItemPosition() {
        return this.n;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getCurrentVisibleContentItemCount(), false, 1));
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.D = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.a0 == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.a0;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.a0.setChecked(false);
        }
        menuItem.setChecked(true);
        this.a0 = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.b0 = i;
    }

    public void setExpanded(boolean z) {
        this.W = z;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                euVar.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.v = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.u = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.E = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.F = z;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.J = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.L = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.I = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.H = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.K = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.O = z;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(o10 o10Var) {
        this.N = o10Var;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.G = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.x = drawable;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.z = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.M = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.k = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.p = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setIconSize(i);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.C = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setItemPaddingBottom(this.C);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.B = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.y = colorStateList;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.t = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.w = z;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.s = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.q = colorStateList;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.T = z;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.U = i;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.j = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.S = z;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof bu) {
                    ((bu) euVar).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(hu huVar) {
        this.Q = huVar;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.c0 == z) {
            return;
        }
        this.c0 = z;
        eu[] euVarArr = this.l;
        if (euVarArr != null) {
            for (eu euVar : euVarArr) {
                if (euVar instanceof yt) {
                    ((yt) euVar).setDividersEnabled(z);
                }
            }
        }
    }
}
