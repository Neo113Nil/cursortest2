package com.google.android.material.timepicker;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.ionia.reidopitaco.libya.R;
import defpackage.d0;
import defpackage.j0;
import defpackage.k0;
import defpackage.x;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class a extends x {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ a(ViewGroup viewGroup, int i) {
        this.d = i;
        this.e = viewGroup;
    }

    @Override // defpackage.x
    public final void d(View view, k0 k0Var) {
        int i = this.d;
        ViewGroup viewGroup = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k0Var.j(((EditText) view).getText());
                accessibilityNodeInfo.setHintText(((ChipTextInputComboView) viewGroup).h.getText());
                accessibilityNodeInfo.setMaxTextLength(2);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = k0Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (intValue > 0) {
                    accessibilityNodeInfo2.setTraversalAfter((View) ((ClockFaceView) viewGroup).C.get(intValue - 1));
                }
                k0Var.i(j0.D(view.isSelected(), 0, 1, intValue, 1));
                accessibilityNodeInfo2.setClickable(true);
                k0Var.b(d0.e);
                break;
        }
    }

    @Override // defpackage.x
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 1:
                ClockFaceView clockFaceView = (ClockFaceView) this.e;
                ClockHandView clockHandView = clockFaceView.y;
                Rect rect = clockFaceView.z;
                if (i != 16) {
                    break;
                } else {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(rect);
                    float centerX = rect.centerX();
                    float centerY = rect.centerY();
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                    clockHandView.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                    break;
                }
        }
        return super.g(view, i, bundle);
    }
}
