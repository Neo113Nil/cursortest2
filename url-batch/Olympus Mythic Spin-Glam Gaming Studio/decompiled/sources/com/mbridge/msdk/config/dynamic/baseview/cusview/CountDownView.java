package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import com.mbridge.msdk.config.dynamic.baseview.ComponentTextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.widget.FeedBackButton;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class CountDownView extends ComponentTextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public CountDownView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    private void c() {
        int a = v0.a(c.n().d(), 13.0f);
        setPadding(a, 0, a, 0);
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(v0.a(c.n().d(), 20.0f));
        gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentTextView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
