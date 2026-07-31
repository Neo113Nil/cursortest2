package com.smaato.sdk.ng.views;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public class ProgressDialogView extends RelativeLayout {
    private TextView a;
    private TextView b;

    public ProgressDialogView(Context context) {
        this(context, null, 0);
    }

    private void a() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        linearLayout.setPadding(40, 40, 40, 40);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(100, 0, 100, 0);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(getContext());
        this.a = textView;
        textView.setTextColor(-16777216);
        this.a.setTypeface(Typeface.DEFAULT_BOLD);
        this.a.setTextSize(24.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, 40);
        this.a.setLayoutParams(layoutParams2);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setBackgroundColor(-1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView2 = new TextView(getContext());
        this.b = textView2;
        textView2.setTextColor(-7829368);
        this.b.setTextSize(16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        this.b.setLayoutParams(layoutParams3);
        View progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleLarge);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(100, 100);
        layoutParams4.setMarginEnd(60);
        layoutParams4.gravity = 16;
        progressBar.setLayoutParams(layoutParams4);
        linearLayout2.addView(progressBar);
        linearLayout2.addView(this.b);
        linearLayout.addView(this.a);
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
    }

    private void b() {
        setVerticalGravity(8);
        setBackgroundColor(Color.argb(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 0, 0, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.v, this, me);
        return super.dispatchTouchEvent(me);
    }

    public void hide() {
        setVisibility(8);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void show(String str, String str2) {
        if (str != null) {
            this.a.setVisibility(0);
            this.a.setText(str);
        } else {
            this.a.setVisibility(8);
        }
        if (str2 != null) {
            this.b.setVisibility(0);
            this.b.setText(str2);
        } else {
            this.b.setVisibility(8);
        }
        setVisibility(0);
    }

    public ProgressDialogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProgressDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
        a();
    }
}
