package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ig extends j3 {
    private final fh a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final Button e;
    private final hg f;
    private final w2 g;

    public ig(Context context) {
        super(context);
        hg a = hg.a(context);
        this.f = a;
        w2 a2 = w2.a(context);
        this.g = a2;
        setMinimumWidth(a.a(hg.L));
        setBackgroundColor(0);
        setOrientation(1);
        setGravity(16);
        int a3 = a.a(hg.r);
        setPadding(a3, a3, a3, a3);
        fh c = c(context);
        this.a = c;
        qi.b(c, "icon_image_view");
        int i = hg.O;
        TextView a4 = a(context, a.a(i), a2.a(w2.z), 0, false, 1, TextUtils.TruncateAt.MARQUEE);
        this.b = a4;
        qi.b(a4, "domain_text_view");
        LinearLayout b = b(context);
        b.addView(c);
        b.addView(a4);
        qi.b(b, "domain_container");
        addView(b);
        float a5 = a.a(hg.X);
        int a6 = a2.a(w2.s);
        int a7 = a.a(hg.n);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        TextView a8 = a(context, a5, a6, a7, true, 2, truncateAt);
        this.c = a8;
        qi.b(a8, "title_text_view");
        addView(a8);
        TextView a9 = a(context, a.a(i), a2.a(w2.t), a.a(hg.k), false, 5, truncateAt);
        this.d = a9;
        qi.b(a9, "description_text_view");
        addView(a9);
        Button a10 = a(context);
        this.e = a10;
        qi.b(a10, "action_button");
        addView(a10);
    }

    private TextView a(Context context, float f, int i, int i2, boolean z, int i3, TextUtils.TruncateAt truncateAt) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = i2;
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(f);
        textView.setTextColor(i);
        if (z) {
            textView.setTypeface(null, 1);
        }
        if (i3 > 0) {
            textView.setMaxLines(i3);
            if (truncateAt != null) {
                textView.setEllipsize(truncateAt);
            }
        }
        textView.setVisibility(8);
        return textView;
    }

    private LinearLayout b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        return linearLayout;
    }

    private fh c(Context context) {
        fh fhVar = new fh(context);
        int a = this.f.a(hg.u);
        int a2 = this.f.a(hg.k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a, a);
        layoutParams.rightMargin = a2;
        fhVar.setLayoutParams(layoutParams);
        int a3 = this.f.a(hg.d);
        fhVar.setPadding(a3, a3, a3, a3);
        fhVar.setBackground(this.g.a(this.f.a(r1) / 2.0f));
        fhVar.setVisibility(8);
        return fhVar;
    }

    @Override // com.my.target.j3, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.j3
    @NonNull
    public Button getCtaButton() {
        return this.e;
    }

    @Override // com.my.target.j3
    @NonNull
    public TextView getDescriptionTextView() {
        return this.d;
    }

    @Override // com.my.target.j3
    @NonNull
    public TextView getDomainTextView() {
        return this.b;
    }

    @Override // com.my.target.j3
    @NonNull
    public fh getLogoImageView() {
        return this.a;
    }

    @Override // com.my.target.j3
    @NonNull
    public TextView getTitleTextView() {
        return this.c;
    }

    @Override // com.my.target.j3, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    private Button a(Context context) {
        Button button = new Button(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        hg hgVar = this.f;
        int i = hg.r;
        layoutParams.topMargin = hgVar.a(i);
        button.setLayoutParams(layoutParams);
        int a = this.f.a(i);
        int a2 = this.f.a(hg.k);
        button.setPadding(a, a2, a, a2);
        button.setTextColor(this.g.a(w2.y));
        button.setTextSize(this.f.a(hg.O));
        button.setTypeface(null, 1);
        w2 w2Var = this.g;
        button.setBackground(w2Var.a(w2Var.a(w2.B), this.g.a(w2.A), this.g.a(w2.C), this.f.a(hg.n)));
        button.setVisibility(8);
        return button;
    }
}
