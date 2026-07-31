package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class zb extends RecyclerView {
    private a a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void b();
    }

    public zb(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        a aVar;
        super.onScrollStateChanged(i);
        if (i == 0 && (aVar = this.a) != null) {
            aVar.b();
        }
    }

    public void setMoveStopListener(@Nullable a aVar) {
        this.a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollBy(int i, int i2) {
        super.smoothScrollBy(i, i2, new AccelerateDecelerateInterpolator());
    }
}
