package com.my.target;

import android.content.Context;
import android.graphics.Outline;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public final class w9 extends LinearLayout {
    private final ImageView a;
    private final TextView b;
    private final Button c;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends ViewOutlineProvider {
        final /* synthetic */ float a;

        a(float f) {
            this.a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
        }
    }

    public w9(Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        setBackgroundColor(-1728053248);
        qi g = qi.g(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        addView(imageView, new LinearLayout.LayoutParams(g.b(80), g.b(80)));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(null, 1);
        textView.setTextSize(1, gg.a(context).a(gg.s));
        textView.setPadding(g.b(50), 0, g.b(50), 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = g.b(10);
        addView(textView, layoutParams);
        Button button = new Button(context);
        this.c = button;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = g.b(25);
        a(button, g.b(8));
        button.setMinimumWidth(g.b(120));
        button.setMinimumHeight(g.b(44));
        addView(button, layoutParams2);
    }

    void a(View view, float f) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new a(f));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public Button getCtaButton() {
        return this.c;
    }

    @NonNull
    public ImageView getIconView() {
        return this.a;
    }

    @NonNull
    public TextView getTitleView() {
        return this.b;
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
