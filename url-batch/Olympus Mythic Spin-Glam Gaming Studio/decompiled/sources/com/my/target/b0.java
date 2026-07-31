package com.my.target;

import android.content.Context;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes12.dex */
public class b0 extends RelativeLayout {
    private final TextView a;
    private final View b;
    private String c;
    private a d;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a();
    }

    public b0(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setTextSize(2, 20.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, getContext().getResources().getDisplayMetrics());
        layoutParams.addRule(15);
        layoutParams.addRule(1, 256);
        addView(textView, layoutParams);
        setBackgroundColor(-7829368);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (qi.a() + 0.5f));
        layoutParams2.addRule(12);
        View view = new View(context);
        this.b = view;
        view.setBackgroundColor(-10066330);
        addView(view, layoutParams2);
        w5 w5Var = new w5(context);
        w5Var.a(l0.a(), false);
        w5Var.setId(256);
        w5Var.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.b0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b0.this.a(view2);
            }
        });
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, getContext().getResources().getDisplayMetrics());
        layoutParams3.addRule(15);
        layoutParams3.addRule(9);
        w5Var.setLayoutParams(layoutParams3);
        addView(w5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public String getTitle() {
        return this.c;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setMainColor(int i) {
        setBackgroundColor(i);
    }

    public void setOnCloseClickListener(@Nullable a aVar) {
        this.d = aVar;
    }

    public void setStripeColor(int i) {
        this.b.setBackgroundColor(i);
    }

    public void setTitle(@Nullable String str) {
        this.c = str;
        this.a.setText(str);
    }

    public void setTitleColor(int i) {
        this.a.setTextColor(i);
    }
}
