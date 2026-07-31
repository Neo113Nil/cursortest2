package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class cj extends LinearLayout {
    private final ze a;
    private final v5 b;
    private final v5 c;
    private final hg d;

    public cj(Context context) {
        super(context);
        setOrientation(1);
        this.d = hg.a(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        v5 a = a(context);
        this.b = a;
        qi.b(a, "video_control_button");
        linearLayout.addView(a);
        v5 a2 = a(context);
        this.c = a2;
        qi.b(a2, "sound_control_button");
        linearLayout.addView(a2);
        addView(linearLayout);
        ze b = b(context);
        this.a = b;
        qi.b(b, "progress_view");
        addView(b);
    }

    private v5 a(Context context) {
        v5 v5Var = new v5(context);
        v5Var.setLayoutParams(new LinearLayout.LayoutParams(this.d.a(hg.A), this.d.a(hg.C)));
        return v5Var;
    }

    private ze b(Context context) {
        return new ze(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @NonNull
    public ye getProgressView() {
        return this.a;
    }

    @NonNull
    public v5 getSoundControlButton() {
        return this.c;
    }

    @NonNull
    public v5 getVideoControlButton() {
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
}
