package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g7 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            n7 n7Var = (n7) message.obj;
            m7 m7Var = n7Var.i;
            if (m7Var.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = m7Var.getLayoutParams();
                if (layoutParams instanceof kd) {
                    kd kdVar = (kd) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    j0 j0Var = baseTransientBottomBar$Behavior.i;
                    j0Var.getClass();
                    j0Var.g = n7Var.s;
                    baseTransientBottomBar$Behavior.b = new i7(n7Var);
                    kdVar.b(baseTransientBottomBar$Behavior);
                    kdVar.g = 80;
                }
                ViewGroup viewGroup = n7Var.g;
                m7Var.p = true;
                viewGroup.addView(m7Var);
                m7Var.p = false;
                n7Var.e();
                m7Var.setVisibility(4);
            }
            if (m7Var.isLaidOut()) {
                n7Var.d();
                return true;
            }
            n7Var.q = true;
            return true;
        }
        if (i != 1) {
            return false;
        }
        n7 n7Var2 = (n7) message.obj;
        int i2 = message.arg1;
        m7 m7Var2 = n7Var2.i;
        AccessibilityManager accessibilityManager = n7Var2.r;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || m7Var2.getVisibility() != 0) {
            n7Var2.b();
            return true;
        }
        if (m7Var2.getAnimationMode() == 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setInterpolator(n7Var2.d);
            ofFloat.addUpdateListener(new f7(n7Var2, 0));
            ofFloat.setDuration(n7Var2.b);
            ofFloat.addListener(new e7(n7Var2, i2, 0));
            ofFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        m7 m7Var3 = n7Var2.i;
        int height = m7Var3.getHeight();
        ViewGroup.LayoutParams layoutParams2 = m7Var3.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(n7Var2.e);
        valueAnimator.setDuration(n7Var2.c);
        valueAnimator.addListener(new e7(n7Var2, i2, 2));
        valueAnimator.addUpdateListener(new f7(n7Var2, 3));
        valueAnimator.start();
        return true;
    }
}
