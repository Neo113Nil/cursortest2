package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.ionia.reidopitaco.libya.R;
import defpackage.ca;
import defpackage.g8;
import defpackage.jx;
import defpackage.ls;
import defpackage.m60;
import defpackage.o10;
import defpackage.oo;
import defpackage.vv;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer W;
    public boolean a0;
    public boolean b0;
    public ImageView.ScaleType c0;
    public Boolean d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray J = m60.J(context2, attributeSet, jx.A, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (J.hasValue(2)) {
            setNavigationIconTint(J.getColor(2, -1));
        }
        this.a0 = J.getBoolean(6, false);
        this.b0 = J.getBoolean(5, false);
        int i = J.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = e0;
            if (i < scaleTypeArr.length) {
                this.c0 = scaleTypeArr[i];
            }
        }
        if (J.hasValue(0)) {
            this.d0 = Boolean.valueOf(J.getBoolean(0, false));
        }
        J.recycle();
        o10 a = o10.g(context2, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar).a();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : vv.s(background);
        if (valueOf != null) {
            ls lsVar = new ls(a);
            lsVar.r(valueOf);
            lsVar.n(context2);
            lsVar.q(getElevation());
            setBackground(lsVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.c0;
    }

    public Integer getNavigationIconTint() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof ls) {
            vv.S(this, (ls) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ca caVar = g8.h;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.a0 || this.b0) {
            ArrayList N = g8.N(this, getTitle());
            TextView textView = N.isEmpty() ? null : (TextView) Collections.min(N, caVar);
            ArrayList N2 = g8.N(this, getSubtitle());
            TextView textView2 = N2.isEmpty() ? null : (TextView) Collections.max(N2, caVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.a0 && textView != null) {
                    u(textView, pair);
                }
                if (this.b0 && textView2 != null) {
                    u(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof ls) {
            ((ls) background).q(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.d0;
        if (bool == null || bool.booleanValue() != z) {
            this.d0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.c0 != scaleType) {
            this.c0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.W = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.b0 != z) {
            this.b0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.a0 != z) {
            this.a0 = z;
            requestLayout();
        }
    }

    public final void u(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
