package com.my.target;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.my.target.common.models.ImageData;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class a extends LinearLayout {
    private final TextView a;
    private final fh b;

    public a(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        fh fhVar = new fh(context);
        this.b = fhVar;
        qi g = qi.g(context);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable.setStroke(g.a(1.0f), -1157627904);
        gradientDrawable.setCornerRadius(g.a(10.0f));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1157627904, -1157627904});
        gradientDrawable2.setStroke(g.a(1.0f), -1157627904);
        gradientDrawable2.setCornerRadius(g.a(10.0f));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int b = g.b(6);
        int b2 = g.b(12);
        textView.setTextColor(-1);
        textView.setTextSize(18.0f);
        textView.setMaxLines(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int a = qi.a(32, context);
        setPadding(b2, b, b2, b);
        setBackgroundDrawable(stateListDrawable);
        setGravity(16);
        setOrientation(0);
        qi.b(fhVar, "ctc_icon");
        addView(fhVar, a, a);
        qi.b(textView, "ctc_text");
        addView(textView, new LinearLayout.LayoutParams(-2, -2));
    }

    public void a(String str, ImageData imageData) {
        this.a.setText(str);
        this.b.setImageData(imageData);
        ((LinearLayout.LayoutParams) this.a.getLayoutParams()).leftMargin = imageData == null ? 0 : qi.a(4, getContext()) * 2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
