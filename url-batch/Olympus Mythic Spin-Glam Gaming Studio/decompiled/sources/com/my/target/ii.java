package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class ii extends ViewGroup {
    private final TextView a;
    private final k1 b;
    private final int c;
    private final int d;

    public ii(Context context) {
        super(context);
        qi g = qi.g(context);
        TextView textView = new TextView(context);
        this.a = textView;
        k1 k1Var = new k1(context);
        this.b = k1Var;
        k1Var.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.c = g.b(4);
        this.d = g.b(2);
        qi.b(textView, "title_text");
        qi.b(k1Var, "age_bordering");
        addView(textView);
        addView(k1Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public TextView getLeftText() {
        return this.a;
    }

    @NonNull
    public k1 getRightBorderedView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.a.getMeasuredWidth();
        int measuredHeight = this.a.getMeasuredHeight();
        int measuredWidth2 = this.b.getMeasuredWidth();
        int measuredHeight2 = this.b.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i5 = (measuredHeight3 - measuredHeight) / 2;
        int i6 = (measuredHeight3 - measuredHeight2) / 2;
        int i7 = this.c + measuredWidth;
        this.a.layout(0, i5, measuredWidth, measuredHeight + i5);
        this.b.layout(i7, i6, measuredWidth2 + i7, measuredHeight2 + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.d * 2), Integer.MIN_VALUE));
        int i3 = size / 2;
        if (this.b.getMeasuredWidth() > i3) {
            this.b.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.d * 2), Integer.MIN_VALUE));
        }
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - this.b.getMeasuredWidth()) - this.c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.d * 2), Integer.MIN_VALUE));
        setMeasuredDimension(this.a.getMeasuredWidth() + this.b.getMeasuredWidth() + this.c, Math.max(this.a.getMeasuredHeight(), this.b.getMeasuredHeight()));
    }
}
