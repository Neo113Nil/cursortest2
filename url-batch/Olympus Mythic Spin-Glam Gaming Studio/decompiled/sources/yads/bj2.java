package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes14.dex */
public abstract class bj2 extends FrameLayout {
    public final q73 a;

    public bj2(@NonNull Context context) {
        super(context);
        this.a = new q73(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/bj2;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, motionEvent);
        return safedk_bj2_dispatchTouchEvent_06bc83763211c9dc14075b7c005e3525(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean safedk_bj2_dispatchTouchEvent_06bc83763211c9dc14075b7c005e3525(MotionEvent p0) {
        this.a.b.onTouchEvent(p0);
        return super.dispatchTouchEvent(p0);
    }

    public bj2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new q73(context);
    }

    public bj2(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.a = new q73(context);
    }

    public bj2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new q73(context);
    }
}
