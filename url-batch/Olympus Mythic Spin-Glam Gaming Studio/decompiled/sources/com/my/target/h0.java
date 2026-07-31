package com.my.target;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class h0 extends LinearLayout {
    private final ImageView a;
    private final TextView b;
    private final hg c;
    private final w2 d;

    public h0(Context context) {
        super(context);
        hg a = hg.a(context);
        this.c = a;
        this.d = w2.a(context);
        int a2 = a.a(hg.i);
        int a3 = a.a(hg.g);
        setPadding(a2, a3, a2, a3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int a4 = a.a(hg.k);
        layoutParams.setMargins(a4, a4, a4, a4);
        setLayoutParams(layoutParams);
        setOrientation(0);
        setGravity(16);
        setBackground(a());
        ImageView a5 = a(context);
        this.a = a5;
        qi.b(a5, "ads_icon");
        addView(a5);
        TextView b = b(context);
        this.b = b;
        qi.b(b, "age_restrictions_text_view");
        addView(b);
    }

    private Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.d.a(w2.d));
        gradientDrawable.setCornerRadius(this.c.a(hg.y));
        return gradientDrawable;
    }

    private TextView b(Context context) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(this.c.a(hg.Y));
        textView.setTextColor(-1);
        textView.setAllCaps(true);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public ImageView getAdsIcon() {
        return this.a;
    }

    @NonNull
    public TextView getAgeRestrictionsTextView() {
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

    private ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        int a = this.c.a(hg.m);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        layoutParams.setMarginEnd(this.c.a(hg.g));
        imageView.setLayoutParams(layoutParams);
        imageView.setColorFilter(-1);
        return imageView;
    }
}
