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
public final class f1 extends j3 {
    private final fh a;
    private final TextView b;
    private final TextView c;
    private final TextView d;
    private final Button e;
    private final hg f;
    private final w2 g;

    public f1(Context context) {
        super(context);
        hg a = hg.a(context);
        this.f = a;
        w2 a2 = w2.a(context);
        this.g = a2;
        setBackgroundColor(0);
        setOrientation(1);
        setGravity(17);
        int a3 = a.a(hg.u);
        setPadding(a3, a3, a3, a3);
        fh b = b(context);
        this.a = b;
        qi.b(b, "icon_image_view");
        addView(b);
        TextView a4 = a(context, a.a(hg.O), a2.a(w2.z), a.a(hg.g), false, 0);
        this.b = a4;
        qi.b(a4, "domain_text_view");
        addView(a4);
        TextView a5 = a(context, a.a(hg.V), a2.a(w2.s), a.a(hg.n), true, 2);
        this.c = a5;
        qi.b(a5, "title_text_view");
        addView(a5);
        TextView a6 = a(context, a.a(hg.U), a2.a(w2.t), a.a(hg.k), false, 5);
        this.d = a6;
        qi.b(a6, "description_text_view");
        addView(a6);
        Button a7 = a(context);
        this.e = a7;
        qi.b(a7, "action_button");
        addView(a7);
    }

    private TextView a(Context context, float f, int i, int i2, boolean z, int i3) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = i2;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        textView.setTextSize(f);
        textView.setTextColor(i);
        if (z) {
            textView.setTypeface(null, 1);
        }
        if (i3 > 0) {
            textView.setMaxLines(i3);
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        textView.setVisibility(8);
        return textView;
    }

    private fh b(Context context) {
        fh fhVar = new fh(context);
        int a = this.f.a(hg.z);
        fhVar.setLayoutParams(new LinearLayout.LayoutParams(a, a));
        fhVar.setVisibility(8);
        w2 w2Var = this.g;
        hg hgVar = this.f;
        int i = hg.d;
        fhVar.setBackground(w2Var.a(hgVar.a(i) / 2.0f));
        int a2 = this.f.a(i);
        fhVar.setPadding(a2, a2, a2, a2);
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
        layoutParams.topMargin = this.f.a(hg.r);
        button.setLayoutParams(layoutParams);
        int a = this.f.a(hg.v);
        int a2 = this.f.a(hg.n);
        button.setPadding(a, a2, a, a2);
        button.setTextColor(this.g.a(w2.y));
        button.setTextSize(this.f.a(hg.U));
        button.setTypeface(null, 1);
        w2 w2Var = this.g;
        button.setBackground(w2Var.a(w2Var.a(w2.B), this.g.a(w2.A), this.g.a(w2.C), this.f.a(r2)));
        button.setVisibility(8);
        return button;
    }
}
