package com.my.target;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class uj extends View {
    private a a;
    private boolean b;
    private boolean c;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface a {
        void a(boolean z);
    }

    public uj(Context context) {
        super(context);
    }

    private void a() {
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        if (b()) {
            aVar.a(true);
        } else {
            if (this.c) {
                return;
            }
            aVar.a(false);
        }
    }

    public boolean b() {
        return this.b && this.c;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(true);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(1, 1);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.c = z;
        a();
    }

    public void setStateChangedListener(@Nullable a aVar) {
        this.a = aVar;
    }

    private void a(boolean z) {
        this.b = z;
        this.c = hasWindowFocus();
        a();
    }
}
