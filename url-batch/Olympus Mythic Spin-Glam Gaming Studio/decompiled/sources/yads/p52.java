package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes3.dex */
public final class p52 extends FrameLayout {
    public final wn2 a;
    public final dl1 b;

    /* JADX WARN: Multi-variable type inference failed */
    public p52(Context context, wn2 wn2Var, dl1 dl1Var) {
        super(context);
        this.a = wn2Var;
        this.b = dl1Var;
        addView(wn2Var);
        if (dl1Var == 0 || !(dl1Var instanceof View)) {
            return;
        }
        addView((View) dl1Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }
}
