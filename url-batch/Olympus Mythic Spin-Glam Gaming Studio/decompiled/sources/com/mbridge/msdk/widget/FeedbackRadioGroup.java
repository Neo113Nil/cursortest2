package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* loaded from: classes4.dex */
public class FeedbackRadioGroup extends RadioGroup {
    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Logger.d("Mintegral|SafeDK: Execution> Lcom/mbridge/msdk/widget/FeedbackRadioGroup;->onLayout(ZIIII)V");
        safedk_FeedbackRadioGroup_onLayout_7883610c66cd8de959c7c07045d65d0c(z, i, i2, i3, i4);
        CreativeInfoManager.onFeedbackPopup(h.o);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i9 = i7 + measuredWidth;
            if (getPaddingLeft() + i9 + getPaddingRight() > size) {
                i3 = Math.max(i7, i6);
                i5 += i8;
                i8 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v("FeedbackRadioGroup", "maxHeight:" + i5 + "---maxWidth:" + i3);
            } else {
                i8 = Math.max(i8, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                measuredWidth = i9;
                i3 = i6;
            }
            if (i4 == childCount - 1) {
                i5 += i8;
                i6 = Math.max(measuredWidth, i6);
            } else {
                i6 = i3;
            }
            i4++;
            i7 = measuredWidth;
        }
        int paddingLeft = i6 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i5 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size = paddingLeft;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    protected void safedk_FeedbackRadioGroup_onLayout_7883610c66cd8de959c7c07045d65d0c(boolean p0, int p1, int p2, int p3, int p4) {
        int childCount = getChildCount();
        int p22 = getPaddingLeft();
        int p42 = getPaddingTop();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (marginLayoutParams.leftMargin + p22 + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + getPaddingRight() > p3 - p1) {
                p22 = getPaddingLeft();
                p42 += i;
                i = getChildAt(i2).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                i = Math.max(i, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i3 = marginLayoutParams.leftMargin + p22;
            int i4 = marginLayoutParams.topMargin + p42;
            childAt.layout(i3, i4, childAt.getMeasuredWidth() + i3, childAt.getMeasuredHeight() + i4);
            p22 += marginLayoutParams.leftMargin + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin;
        }
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
