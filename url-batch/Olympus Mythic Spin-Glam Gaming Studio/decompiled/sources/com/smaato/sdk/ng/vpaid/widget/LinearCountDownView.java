package com.smaato.sdk.ng.vpaid.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.R;
import com.smaato.sdk.ng.utils.ProgressTimeFormatter;

/* loaded from: classes6.dex */
public class LinearCountDownView extends FrameLayout {
    private ProgressBar a;
    private TextView b;

    public LinearCountDownView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        View inflate = View.inflate(context, R.layout.linear_player_count_down, this);
        this.a = (ProgressBar) inflate.findViewById(R.id.view_progress_bar);
        this.b = (TextView) inflate.findViewById(R.id.view_progress_text);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void reset() {
        this.b.setText(ProgressTimeFormatter.formatSeconds(0));
    }

    public void setProgress(int i, int i2) {
        this.a.setMax(i2);
        this.a.setSecondaryProgress(i2);
        this.a.setProgress(i);
        int i3 = ((i2 - i) / 1000) + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        this.b.setText(ProgressTimeFormatter.formatSeconds(i3));
    }

    public LinearCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LinearCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
