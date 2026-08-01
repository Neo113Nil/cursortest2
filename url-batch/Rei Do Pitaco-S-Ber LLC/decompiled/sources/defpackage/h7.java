package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class h7 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ n7 g;

    public /* synthetic */ h7(n7 n7Var, int i) {
        this.f = i;
        this.g = n7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        int i = this.f;
        n7 n7Var = this.g;
        switch (i) {
            case 0:
                m7 m7Var = n7Var.i;
                if (m7Var != null) {
                    WindowManager windowManager = (WindowManager) n7Var.h.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    m7Var.getLocationInWindow(iArr);
                    int height2 = (height - (m7Var.getHeight() + iArr[1])) + ((int) m7Var.getTranslationY());
                    int i2 = n7Var.o;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = m7Var.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            Log.w(n7.y, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            break;
                        } else {
                            int i3 = n7Var.o;
                            n7Var.p = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            m7Var.requestLayout();
                            break;
                        }
                    } else {
                        n7Var.p = i2;
                        break;
                    }
                }
                break;
            case 1:
                n7Var.b();
                break;
            default:
                m7 m7Var2 = n7Var.i;
                if (m7Var2 != null) {
                    if (m7Var2.getParent() != null) {
                        m7Var2.setVisibility(0);
                    }
                    if (m7Var2.getAnimationMode() != 1) {
                        int height3 = m7Var2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = m7Var2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        m7Var2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(n7Var.e);
                        valueAnimator.setDuration(n7Var.c);
                        valueAnimator.addListener(new e7(n7Var, 1));
                        valueAnimator.addUpdateListener(new f7(n7Var, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(n7Var.d);
                        ofFloat.addUpdateListener(new f7(n7Var, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(n7Var.f);
                        ofFloat2.addUpdateListener(new f7(n7Var, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(n7Var.a);
                        animatorSet.addListener(new e7(n7Var, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
