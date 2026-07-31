package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class li extends LinearLayout {
    private final hg a;
    private final w2 b;
    private final fh c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final fh g;
    private final l1 h;

    public li(Context context) {
        super(context);
        hg a = hg.a(context);
        this.a = a;
        this.b = w2.a(context);
        setOrientation(0);
        setGravity(16);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        fh b = b(context);
        this.c = b;
        qi.b(b, "logo_icon");
        addView(b);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        TextView e = e(context);
        this.d = e;
        qi.b(e, "title_text_view");
        linearLayout.addView(e);
        LinearLayout c = c(context);
        TextView d = d(context);
        this.e = d;
        c.addView(d);
        TextView d2 = d(context);
        d2.setText("·");
        c.addView(d2);
        TextView d3 = d(context);
        this.f = d3;
        c.addView(d3);
        fh a2 = a(context);
        this.g = a2;
        c.addView(a2);
        linearLayout.addView(c);
        addView(linearLayout);
        l1 l1Var = new l1(context);
        this.h = l1Var;
        l1Var.getAdChoicesButton().a(a1.a(a.a(hg.w), false, context), false);
        l1Var.getAdChoicesButton().setBackgroundColor(0);
        addView(l1Var);
    }

    private fh a(Context context) {
        fh fhVar = new fh(context);
        int a = this.a.a(hg.l);
        fhVar.setLayoutParams(new LinearLayout.LayoutParams(a, a));
        fhVar.setColorFilter(this.b.a(w2.z));
        return fhVar;
    }

    private fh b(Context context) {
        fh fhVar = new fh(context);
        int a = this.a.a(hg.y);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        int a2 = this.a.a(hg.m);
        int a3 = this.a.a(hg.n);
        layoutParams.setMargins(a3, a3, a2, a3);
        fhVar.setLayoutParams(layoutParams);
        fhVar.setBackground(this.b.a(this.a.a(hg.d) / 2.0f));
        return fhVar;
    }

    private LinearLayout c(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        return linearLayout;
    }

    private TextView d(Context context) {
        TextView textView = new TextView(context);
        textView.setTextSize(this.a.a(hg.Y));
        textView.setTextColor(this.b.a(w2.z));
        textView.setAllCaps(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(this.a.a(hg.g));
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    private TextView e(Context context) {
        TextView textView = new TextView(context);
        textView.setTextSize(this.a.a(hg.O));
        textView.setTextColor(this.b.a(w2.s));
        textView.setTypeface(textView.getTypeface(), 1);
        return textView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public fh getAdsIcon() {
        return this.g;
    }

    @NonNull
    public TextView getAgeRestrictionTextView() {
        return this.f;
    }

    @NonNull
    public l1 getButtonsView() {
        return this.h;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.e;
    }

    @NonNull
    public fh getLogoIcon() {
        return this.c;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.d;
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
