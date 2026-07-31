package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class we extends LinearLayout {
    private final List a;
    private final hg b;

    public we(Context context) {
        super(context);
        this.b = hg.a(context);
        setOrientation(0);
        this.a = new ArrayList();
    }

    public void a(int i, float f) {
        ((ye) this.a.get(i)).setMaxTime(f);
    }

    public void b(int i, float f) {
        for (int i2 = 0; i2 < i; i2++) {
            ((ye) this.a.get(i2)).setMaxTime(f);
            ((ye) this.a.get(i2)).setTimeChanged(f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setCountBars(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            ze zeVar = new ze(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0f;
            if (i > 1 && i2 != i - 1) {
                layoutParams.setMarginEnd(this.b.a(hg.g));
            }
            zeVar.setLayoutParams(layoutParams);
            this.a.add(zeVar);
            addView(zeVar);
        }
    }

    public void a(float f, int i) {
        ((ye) this.a.get(i)).setTimeChanged(f);
    }
}
