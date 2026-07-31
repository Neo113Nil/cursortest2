package com.my.target.nativeads.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.my.target.qi;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public class CollageView extends FrameLayout {
    final List a;
    int[] b;
    int c;
    int d;
    int e;

    public CollageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public FrameLayout getFrame(int i) {
        return (FrameLayout) this.a.get(i);
    }

    @RestrictTo
    public int getPlaceholderHeight() {
        return this.d;
    }

    @RestrictTo
    public int getPlaceholderWidth() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i);
        int size = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.getSize(i) : qi.a(280, getContext());
        int i6 = (int) ((size / this.c) * this.d);
        setMeasuredDimension(size, i6);
        boolean z = true;
        int i7 = 0;
        if (this.a.size() == 3) {
            int i8 = (size - this.e) / 2;
            View view = (FrameLayout) this.a.get(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = i8;
            layoutParams.height = i6;
            layoutParams.leftMargin = 0;
            layoutParams.topMargin = 0;
            view.setLayoutParams(layoutParams);
            measureChild(view, i, i2);
            View view2 = (FrameLayout) this.a.get(1);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int i9 = size - i8;
            int i10 = this.e;
            layoutParams2.width = i9 - i10;
            layoutParams2.height = i8;
            layoutParams2.leftMargin = i10 + i8;
            layoutParams2.topMargin = 0;
            view2.setLayoutParams(layoutParams2);
            measureChild(view2, i, i2);
            View view3 = (FrameLayout) this.a.get(2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view3.getLayoutParams();
            int i11 = this.e;
            layoutParams3.width = i9 - i11;
            layoutParams3.height = (i6 - i8) - i11;
            int i12 = i8 + i11;
            layoutParams3.leftMargin = i12;
            layoutParams3.topMargin = i12;
            view3.setLayoutParams(layoutParams3);
            measureChild(view3, i, i2);
            return;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.b;
            if (i13 >= iArr.length) {
                return;
            }
            int i16 = iArr[i13];
            int i17 = i16 - 1;
            int i18 = (size - r11) / i16;
            int i19 = (size - (i16 * i18)) - (this.e * i17);
            int i20 = i7;
            int i21 = i20;
            while (i20 < i16) {
                View view4 = (FrameLayout) this.a.get(i14);
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view4.getLayoutParams();
                if (i20 == 0) {
                    i5 = i19 / 2;
                } else if (i20 == i17) {
                    i5 = i19 - (i19 / 2);
                } else {
                    i3 = size;
                    i4 = i18;
                    layoutParams4.width = i4;
                    int i22 = i16;
                    layoutParams4.height = i13 != this.b.length + (-1) ? i6 - i15 : i18;
                    layoutParams4.leftMargin = i21;
                    layoutParams4.topMargin = i15;
                    view4.setLayoutParams(layoutParams4);
                    i21 += i4 + this.e;
                    i14++;
                    measureChild(view4, i, i2);
                    i20++;
                    size = i3;
                    z = true;
                    i16 = i22;
                }
                int i23 = i18 + i5;
                i3 = size;
                i4 = i23;
                layoutParams4.width = i4;
                int i222 = i16;
                layoutParams4.height = i13 != this.b.length + (-1) ? i6 - i15 : i18;
                layoutParams4.leftMargin = i21;
                layoutParams4.topMargin = i15;
                view4.setLayoutParams(layoutParams4);
                i21 += i4 + this.e;
                i14++;
                measureChild(view4, i, i2);
                i20++;
                size = i3;
                z = true;
                i16 = i222;
            }
            i15 += i18 + this.e;
            i13++;
            size = size;
            i7 = 0;
        }
    }

    @RestrictTo
    public void setCollageSize(int i) {
        removeAllViews();
        this.a.clear();
        Context context = getContext();
        for (int i2 = 0; i2 < i; i2++) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.setForegroundGravity(17);
            addView(frameLayout);
            this.a.add(frameLayout);
        }
        switch (i) {
            case 2:
                this.c = 280;
                this.d = 139;
                this.b = new int[]{2};
                break;
            case 3:
                this.c = 280;
                this.d = 280;
                this.b = new int[]{1, 2};
                break;
            case 4:
                this.c = 280;
                this.d = 280;
                this.b = new int[]{2, 2};
                break;
            case 5:
                this.c = 280;
                this.d = 233;
                this.b = new int[]{2, 3};
                break;
            case 6:
                this.c = 280;
                this.d = 186;
                this.b = new int[]{3, 3};
                break;
            case 7:
                this.c = 280;
                this.d = 196;
                this.b = new int[]{2, 5};
                break;
            case 8:
                this.c = 280;
                this.d = 186;
                this.b = new int[]{2, 6};
                break;
            case 9:
                this.c = 280;
                this.d = 280;
                this.b = new int[]{3, 3, 3};
                break;
            case 10:
                this.c = 280;
                this.d = 175;
                this.b = new int[]{2, 8};
                break;
            default:
                this.c = 0;
                this.d = 0;
                this.b = new int[0];
                break;
        }
    }

    public void setFrameSpace(int i) {
        this.e = i;
    }

    public CollageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CollageView(@NonNull Context context) {
        this(context, null);
    }

    public CollageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new ArrayList();
        this.b = new int[0];
        this.c = 0;
        this.d = 0;
        this.e = qi.a(2, getContext());
    }
}
