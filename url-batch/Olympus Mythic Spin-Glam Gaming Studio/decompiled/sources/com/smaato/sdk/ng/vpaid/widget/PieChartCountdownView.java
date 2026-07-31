package com.smaato.sdk.ng.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.R;

/* loaded from: classes3.dex */
public class PieChartCountdownView extends CountDownView {
    private ProgressBar a;
    private TextView b;
    private boolean c;

    public PieChartCountdownView(Context context) {
        super(context);
        this.c = false;
        a(context);
    }

    private void a(Context context) {
        View inflate = View.inflate(context, R.layout.player_count_down, this);
        this.a = (ProgressBar) inflate.findViewById(R.id.view_progress_bar);
        this.b = (TextView) inflate.findViewById(R.id.view_progress_text);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -90.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setFillAfter(true);
        this.a.startAnimation(rotateAnimation);
    }

    @Override // com.smaato.sdk.ng.vpaid.widget.CountDownView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.smaato.sdk.ng.vpaid.widget.CountDownView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.smaato.sdk.ng.vpaid.widget.CountDownView
    public void setProgress(int i, int i2) {
        a();
        this.a.setMax(i2);
        this.a.setSecondaryProgress(i2);
        this.a.setProgress(i);
        this.b.setText(String.valueOf(((i2 - i) / 1000) + 1));
    }

    public PieChartCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        a(context);
    }

    private void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.setBackground(getResources().getDrawable(R.drawable.circle_progress_background));
    }

    public PieChartCountdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        a(context);
    }
}
