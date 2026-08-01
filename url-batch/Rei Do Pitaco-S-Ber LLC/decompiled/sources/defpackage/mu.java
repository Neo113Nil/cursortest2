package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ionia.reidopitaco.libya.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class mu extends FrameLayout {
    public final cu f;
    public final x7 g;
    public final hu h;
    public a40 i;
    public ku j;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public mu(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        ?? r10;
        hu huVar = new hu();
        huVar.g = false;
        this.h = huVar;
        Context context2 = getContext();
        y5 K = m60.K(context2, attributeSet, jx.C, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 17, 15);
        cu cuVar = new cu(context2, getClass(), getMaxItemCount());
        this.f = cuVar;
        x7 x7Var = new x7(context2);
        this.g = x7Var;
        x7Var.setMinimumHeight(getSuggestedMinimumHeight());
        x7Var.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        huVar.f = x7Var;
        huVar.h = 1;
        x7Var.setPresenter(huVar);
        cuVar.b(huVar, cuVar.a);
        huVar.i(getContext(), cuVar);
        TypedArray typedArray = (TypedArray) K.a;
        if (typedArray.hasValue(11)) {
            x7Var.setIconTintList(K.e(11));
        } else {
            x7Var.setIconTintList(x7Var.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(K.e(18));
        }
        Drawable background = getBackground();
        ColorStateList s = vv.s(background);
        if (background == null || s != null) {
            ls lsVar = new ls(o10.g(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (s != null) {
                lsVar.r(s);
            }
            lsVar.n(context2);
            setBackground(lsVar);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(oo.n(context2, K, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            x7Var.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(oo.n(context2, K, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, jx.B);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = obtainStyledAttributes.getString(9);
            int i = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    i = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    i = obtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(i);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize2);
            int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize2);
            int i2 = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = x7Var.d0;
            rect.left = i2;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            eu[] euVarArr = x7Var.l;
            if (euVarArr != null) {
                for (eu euVar : euVarArr) {
                    if (euVar instanceof bu) {
                        ((bu) euVar).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(oo.o(context2, obtainStyledAttributes, 2));
            r10 = 0;
            setItemActiveIndicatorShapeAppearance(o10.f(context2, obtainStyledAttributes.getResourceId(11, 0), 0).a());
            obtainStyledAttributes.recycle();
        } else {
            r10 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r10);
            hu huVar2 = this.h;
            huVar2.g = true;
            getMenuInflater().inflate(resourceId3, this.f);
            huVar2.g = r10;
            huVar2.j(true);
        }
        K.n();
        addView(this.g);
        this.f.e = new j0(28, (BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.i == null) {
            this.i = new a40(getContext());
        }
        return this.i;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.g.setMeasurePaddingFromLabelBaseline(z);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.g.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.g.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.g.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.g.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.g.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.g.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.g.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.g.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.g.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.g.getItemActiveIndicatorMarginHorizontal();
    }

    public o10 getItemActiveIndicatorShapeAppearance() {
        return this.g.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.g.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.g.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.g.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.g.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.g.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.g.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.g.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.g.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.g.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.g.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.g.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.g.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.g.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.g.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f;
    }

    public lt getMenuView() {
        return this.g;
    }

    public ViewGroup getMenuViewGroup() {
        return this.g;
    }

    public hu getPresenter() {
        return this.h;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.g.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.g.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ls) {
            vv.S(this, (ls) background);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof lu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        lu luVar = (lu) parcelable;
        super.onRestoreInstanceState(luVar.f);
        Bundle bundle = luVar.h;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f.u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jt jtVar = (jt) weakReference.get();
            if (jtVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = jtVar.getId();
                if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    jtVar.e(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable m;
        lu luVar = new lu(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        luVar.h = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return luVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            jt jtVar = (jt) weakReference.get();
            if (jtVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = jtVar.getId();
                if (id > 0 && (m = jtVar.m()) != null) {
                    sparseArray.put(id, m);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return luVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.g.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof ls) {
            ((ls) background).q(f);
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.g.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.g.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.g.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.g.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.g.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.g.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.g.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.g.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.g.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.g.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(o10 o10Var) {
        this.g.setItemActiveIndicatorShapeAppearance(o10Var);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.g.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.g.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.g.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        x7 x7Var = this.g;
        if (x7Var.getItemGravity() != i) {
            x7Var.setItemGravity(i);
            this.h.j(false);
        }
    }

    public void setItemIconGravity(int i) {
        x7 x7Var = this.g;
        if (x7Var.getItemIconGravity() != i) {
            x7Var.setItemIconGravity(i);
            this.h.j(false);
        }
    }

    public void setItemIconSize(int i) {
        this.g.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.g.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.g.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.g.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.g.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.g.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.g.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.g.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.g.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.g.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.g.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        x7 x7Var = this.g;
        if (x7Var.getLabelVisibilityMode() != i) {
            x7Var.setLabelVisibilityMode(i);
            this.h.j(false);
        }
    }

    public void setOnItemSelectedListener(ku kuVar) {
        this.j = kuVar;
    }

    public void setSelectedItemId(int i) {
        cu cuVar = this.f;
        MenuItem findItem = cuVar.findItem(i);
        if (findItem != null) {
            boolean q = cuVar.q(findItem, this.h, 0);
            if (findItem.isCheckable()) {
                if (!q || findItem.isChecked()) {
                    this.g.setCheckedItem(findItem);
                }
            }
        }
    }

    public void setOnItemReselectedListener(ju juVar) {
    }
}
