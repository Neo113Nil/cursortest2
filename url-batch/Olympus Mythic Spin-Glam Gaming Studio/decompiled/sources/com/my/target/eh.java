package com.my.target;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.yandex.div.internal.widget.DivLayoutParams;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class eh extends FrameLayout {
    private final fh a;
    private final hg b;
    private final w2 c;
    private final FrameLayout d;

    public eh(Context context) {
        super(context);
        w2 a = w2.a(context);
        this.c = a;
        hg a2 = hg.a(context);
        this.b = a2;
        setBackground(a(a.a(w2.x)));
        setClipToOutline(true);
        int a3 = a2.a(hg.G);
        setLayoutParams(new FrameLayout.LayoutParams(a3, a3));
        fh a4 = a(context);
        this.a = a4;
        addView(a4);
        FrameLayout b = b(context);
        b.addView(c(context));
        addView(b);
        FrameLayout d = d(context);
        this.d = d;
        d.addView(e(context));
        addView(d);
    }

    private Drawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(this.b.a(hg.n));
        return gradientDrawable;
    }

    private FrameLayout b(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int a = this.b.a(hg.t);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = DivLayoutParams.DEFAULT_GRAVITY;
        int a2 = this.b.a(hg.g);
        layoutParams.setMargins(a2, a2, 0, 0);
        frameLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.c.a(w2.i));
        gradientDrawable.setCornerRadius(this.b.a(hg.x));
        frameLayout.setBackground(gradientDrawable);
        return frameLayout;
    }

    private TextView c(Context context) {
        TextView textView = new TextView(context);
        textView.setText("%");
        textView.setTextColor(-1);
        textView.setTextSize(this.b.a(hg.R));
        textView.setGravity(17);
        return textView;
    }

    private FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(a(this.c.a(w2.m)));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    private fh e(Context context) {
        fh fhVar = new fh(context);
        int a = this.b.a(hg.v);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        fhVar.setLayoutParams(layoutParams);
        fhVar.setImageBitmap(a1.c(a, context));
        return fhVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public fh getAdImageView() {
        return this.a;
    }

    @NonNull
    public FrameLayout getSharedContainer() {
        return this.d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private fh a(Context context) {
        fh fhVar = new fh(context);
        fhVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return fhVar;
    }
}
