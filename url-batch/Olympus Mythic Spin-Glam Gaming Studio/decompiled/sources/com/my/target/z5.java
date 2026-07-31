package com.my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class z5 extends FrameLayout {
    private static final int g = qi.c();
    private final fh a;
    private final TextView b;
    private final fh c;
    private final LinearLayout d;
    private final hg e;
    private final w2 f;

    public z5(Context context) {
        super(context);
        this.e = hg.a(context);
        this.f = w2.a(context);
        fh a = a(context);
        this.a = a;
        qi.b(a, "image_view");
        addView(a);
        LinearLayout c = c(context);
        this.d = c;
        fh e = e(context);
        this.c = e;
        c.addView(e);
        qi.b(e, "icon_image_view");
        TextView d = d(context);
        this.b = d;
        qi.b(d, "domain_text_view");
        c.addView(d);
        qi.b(c, "domain_container");
        LinearLayout b = b(context);
        b.addView(c);
        c.setVisibility(8);
        qi.b(b, "bottom_layout");
        addView(b);
    }

    private fh a(Context context) {
        fh fhVar = new fh(context);
        fhVar.setId(g);
        fhVar.setBackgroundColor(this.f.a(w2.x));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (context.getResources().getConfiguration().orientation == 2) {
            layoutParams.gravity = 8388627;
        } else {
            layoutParams.gravity = 49;
        }
        fhVar.setScaleType(ImageView.ScaleType.FIT_XY);
        fhVar.setLayoutParams(layoutParams);
        return fhVar;
    }

    private LinearLayout b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private LinearLayout c(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388693;
        hg hgVar = this.e;
        int i = hg.g;
        int a = hgVar.a(i);
        layoutParams.setMargins(a, a, a, a);
        linearLayout.setBackground(a());
        linearLayout.setGravity(16);
        int a2 = this.e.a(i);
        linearLayout.setPadding(a2, a2, a2, a2);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    private TextView d(Context context) {
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        textView.setTextColor(-1);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(this.e.a(hg.R));
        return textView;
    }

    private fh e(Context context) {
        fh fhVar = new fh(context);
        int a = this.e.a(hg.n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.setMarginEnd(this.e.a(hg.g));
        fhVar.setLayoutParams(layoutParams);
        return fhVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public LinearLayout getDomainContainer() {
        return this.d;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.b;
    }

    @NonNull
    public fh getImageView() {
        return this.a;
    }

    @NonNull
    public fh getLogoImageView() {
        return this.c;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.a.getLayoutParams();
        if (configuration.orientation == 2) {
            layoutParams.gravity = 8388627;
        } else {
            layoutParams.gravity = 49;
        }
        this.a.setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private GradientDrawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(this.f.a(w2.d));
        gradientDrawable.setCornerRadius(this.e.a(hg.v));
        return gradientDrawable;
    }
}
