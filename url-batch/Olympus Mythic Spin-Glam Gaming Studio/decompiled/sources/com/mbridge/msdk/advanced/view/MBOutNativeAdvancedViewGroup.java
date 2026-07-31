package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.mbridge.msdk.advanced.middle.c;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* loaded from: classes15.dex */
public class MBOutNativeAdvancedViewGroup extends RelativeLayout {
    private c a;

    class a implements Runnable {
        final /* synthetic */ int a;

        a(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBOutNativeAdvancedViewGroup.this.a != null) {
                MBOutNativeAdvancedViewGroup.this.a.i(this.a);
            }
        }
    }

    public MBOutNativeAdvancedViewGroup(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.o, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            a(1);
            if (getVisibility() == 0) {
                a(2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.a;
        if (cVar != null) {
            cVar.f(1);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            a(2);
            if (getParent() != null) {
                a(1);
                return;
            }
            return;
        }
        c cVar = this.a;
        if (cVar != null) {
            cVar.f(2);
        }
    }

    public void setProvider(c cVar) {
        this.a = cVar;
    }

    public MBOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(int i) {
        postDelayed(new a(i), 200L);
    }

    public MBOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
