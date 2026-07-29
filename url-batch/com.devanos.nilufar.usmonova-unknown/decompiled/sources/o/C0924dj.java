package o;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.dj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0924dj extends ViewGroup {
    public boolean h;

    public C0924dj(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(InterfaceC0980ea interfaceC0980ea, NZ nz, long j) {
        super.drawChild(AbstractC2328z2.a(interfaceC0980ea), nz, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0048Bt.l(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((NZ) childAt).f73o) {
                this.h = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.h = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.h) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
