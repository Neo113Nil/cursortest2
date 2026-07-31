package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ah extends j3 {
    private final TextView a;
    private final TextView b;
    private final Button c;
    private final hg d;
    private final w2 e;

    public ah(Context context) {
        super(context);
        hg a = hg.a(context);
        this.d = a;
        w2 a2 = w2.a(context);
        this.e = a2;
        setMinimumHeight(a.a(hg.H));
        setBackgroundColor(0);
        setOrientation(0);
        setGravity(16);
        int a3 = a.a(hg.n);
        int a4 = a.a(hg.r);
        setPadding(a3, a4, a3, a4);
        LinearLayout b = b(context);
        TextView a5 = a(context, a.a(hg.T), a2.a(w2.s), 0, true, 2);
        this.a = a5;
        qi.b(a5, "title_text_view");
        b.addView(a5);
        TextView a6 = a(context, a.a(hg.O), a2.a(w2.t), a.a(hg.g), false, 2);
        this.b = a6;
        qi.b(a6, "description_text_view");
        b.addView(a6);
        addView(b);
        Button a7 = a(context);
        this.c = a7;
        qi.b(a7, "action_button");
        addView(a7);
    }

    private TextView a(Context context, float f, int i, int i2, boolean z, int i3) {
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
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
        textView.setVisibility(8);
        return textView;
    }

    private LinearLayout b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = this.d.a(hg.n);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    @Override // com.my.target.j3, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.my.target.j3
    @NonNull
    public Button getCtaButton() {
        return this.c;
    }

    @Override // com.my.target.j3
    @NonNull
    public TextView getDescriptionTextView() {
        return this.b;
    }

    @Override // com.my.target.j3
    @Nullable
    public TextView getDomainTextView() {
        return null;
    }

    @Override // com.my.target.j3
    @Nullable
    public fh getLogoImageView() {
        return null;
    }

    @Override // com.my.target.j3
    @NonNull
    public TextView getTitleTextView() {
        return this.a;
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
        layoutParams.gravity = 8388629;
        button.setLayoutParams(layoutParams);
        int a = this.d.a(hg.r);
        int a2 = this.d.a(hg.k);
        button.setPadding(a, a2, a, a2);
        button.setTextColor(this.e.a(w2.y));
        button.setTextSize(this.d.a(hg.O));
        button.setTypeface(null, 1);
        w2 w2Var = this.e;
        button.setBackground(w2Var.a(w2Var.a(w2.B), this.e.a(w2.A), this.e.a(w2.C), this.d.a(hg.n)));
        button.setVisibility(8);
        return button;
    }
}
