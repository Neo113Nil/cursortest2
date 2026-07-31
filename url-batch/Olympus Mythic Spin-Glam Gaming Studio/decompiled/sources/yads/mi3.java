package yads;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* loaded from: classes5.dex */
public final class mi3 extends FrameLayout {
    public final ProgressBar a;
    public final ImageView b;

    public mi3(Context context, ProgressBar progressBar, ImageView imageView) {
        super(context);
        this.a = progressBar;
        this.b = imageView;
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
