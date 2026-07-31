package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes6.dex */
public abstract class dj2 extends RelativeLayout {
    private final q73 a;

    final q73 a() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Logger.d("Yandex|SafeDK: Execution> Lyads/dj2;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.y, this, motionEvent);
        return safedk_dj2_dispatchTouchEvent_6f2f7f72a40a0916eb30f4b689398591(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public boolean safedk_dj2_dispatchTouchEvent_6f2f7f72a40a0916eb30f4b689398591(MotionEvent p0) {
        this.a.b.onTouchEvent(p0);
        return super.dispatchTouchEvent(p0);
    }

    public dj2(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        this.a = new q73(context);
    }
}
