package com.meta.analytics.dsp.uinode;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: assets/audience_network.dex */
public final class NC extends ViewGroup {
    public static final int A01 = (int) (LD.A02 * 8.0f);
    public int A00;

    public NC(C0889Yn c0889Yn) {
        super(c0889Yn);
        setMotionEventSplittingEnabled(false);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000e */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int paddingLeft = getPaddingLeft();
        int childHeight = getPaddingTop();
        for (int childWidth = 0; childWidth < width; childWidth++) {
            View child = getChildAt(childWidth);
            int i6 = child.getMeasuredWidth();
            int yPos = child.getMeasuredHeight();
            int width = paddingLeft + i6;
            if (width > i5) {
                paddingLeft = getPaddingLeft();
                int width2 = this.A00;
                childHeight += width2;
            }
            int xPos = paddingLeft + i6;
            int width3 = childHeight + yPos;
            child.layout(paddingLeft, childHeight, xPos, width3);
            int width4 = A01;
            paddingLeft += width4 + i6;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0033 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = View.MeasureSpec.getSize(i2);
        int width = getPaddingTop();
        int i3 = size2 - width;
        int width2 = getPaddingBottom();
        int childWidth = getPaddingLeft();
        int i4 = 0;
        int childHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3 - width2, Integer.MIN_VALUE);
        int width3 = getChildCount();
        int i5 = width3 > 0 ? 1 : 0;
        for (int lineHeight = 0; lineHeight < width; lineHeight++) {
            View childAt = getChildAt(lineHeight);
            int width4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            childAt.measure(width4, childHeightMeasureSpec);
            int xPos = childAt.getMeasuredWidth();
            int width5 = childAt.getMeasuredHeight();
            int height = A01;
            i4 = Math.max(i4, width5 + height);
            int width6 = childWidth + xPos;
            if (width6 > size) {
                i5++;
                childWidth = getPaddingLeft();
            }
            childWidth += height + xPos;
        }
        this.A00 = i4;
        int width7 = A01;
        setMeasuredDimension(size, (i5 * i4) + width7);
    }
}
