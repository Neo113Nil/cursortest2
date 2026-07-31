package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;
import androidx.annotation.AttrRes;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class zl2 extends RatingBar implements wl2 {
    public zl2(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return isClickable() && motionEvent.getAction() == 0;
    }

    @Override // android.widget.RatingBar, yads.wl2
    public void setRating(float f) {
        super.setRating(f);
    }

    public zl2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public zl2(@NotNull Context context) {
        super(context);
    }
}
