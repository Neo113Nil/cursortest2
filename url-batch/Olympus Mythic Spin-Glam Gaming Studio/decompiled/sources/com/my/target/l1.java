package com.my.target;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class l1 extends LinearLayout {
    private final v5 a;
    private final v5 b;
    private final v5 c;
    private final RelativeLayout d;
    private final TextView e;
    private final hg f;
    private final w2 g;

    public l1(Context context) {
        super(context);
        this.f = hg.a(context);
        this.g = w2.a(context);
        setOrientation(0);
        v5 a = a(context);
        this.a = a;
        qi.b(a, "ad_choices_button");
        addView(a);
        RelativeLayout c = c(context);
        this.d = c;
        addView(c);
        TextView d = d(context);
        this.e = d;
        qi.b(d, "progress_wheel");
        c.addView(d);
        v5 b = b(context);
        this.b = b;
        qi.b(b, "close_button");
        addView(b);
        v5 e = e(context);
        this.c = e;
        qi.b(e, "skip_button");
        addView(e);
    }

    private v5 a(Context context) {
        v5 v5Var = new v5(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f.a(hg.C), this.f.a(hg.D));
        int a = this.f.a(hg.k);
        v5Var.setPadding(a, a, a / 2, a);
        v5Var.setLayoutParams(layoutParams);
        v5Var.a(a1.a(this.f.a(hg.w), true, getContext()), false);
        return v5Var;
    }

    private v5 b(Context context) {
        v5 v5Var = new v5(context);
        int a = this.f.a(hg.k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f.a(hg.C), this.f.a(hg.D));
        v5Var.setPadding(a / 2, a, a, a);
        v5Var.setLayoutParams(layoutParams);
        v5Var.setVisibility(8);
        v5Var.a(a1.a(this.f.a(hg.w), getContext()), false);
        return v5Var;
    }

    private RelativeLayout c(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        int a = this.f.a(hg.w);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        hg hgVar = this.f;
        int i = hg.g;
        int a2 = hgVar.a(i);
        int a3 = this.f.a(hg.k);
        layoutParams.setMargins(a2, a3, a3, a3);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setBackground(a());
        relativeLayout.setGravity(49);
        relativeLayout.setPadding(0, this.f.a(i), 0, this.f.a(hg.j));
        relativeLayout.setClickable(true);
        relativeLayout.setFocusable(true);
        return relativeLayout;
    }

    private TextView d(Context context) {
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, this.f.a(hg.r)));
        textView.setTextSize(this.f.a(hg.P));
        textView.setTypeface(null, 1);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        return textView;
    }

    private v5 e(Context context) {
        v5 v5Var = new v5(context);
        int a = this.f.a(hg.k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f.a(hg.C), this.f.a(hg.D));
        v5Var.setPadding(a / 2, a, a, a);
        v5Var.setLayoutParams(layoutParams);
        v5Var.setVisibility(8);
        v5Var.a(zg.a(this.f.a(hg.w), getContext()), false);
        return v5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public v5 getAdChoicesButton() {
        return this.a;
    }

    @NonNull
    public v5 getCloseButton() {
        return this.b;
    }

    @NonNull
    public TextView getProgress() {
        return this.e;
    }

    @NonNull
    public RelativeLayout getProgressFrame() {
        return this.d;
    }

    @NonNull
    public v5 getSkipButton() {
        return this.c;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.g.a(w2.d));
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }
}
