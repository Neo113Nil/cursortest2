package defpackage;

import android.view.MotionEvent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e3 implements Runnable {
    public final /* synthetic */ f3 d;

    public e3(f3 f3Var) {
        this.d = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f3 f3Var = this.d;
        f3Var.removeCallbacks(this);
        MotionEvent motionEvent = f3Var.t0;
        if (motionEvent != null) {
            boolean z = motionEvent.getToolType(0) == 3;
            int actionMasked = motionEvent.getActionMasked();
            if (z) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            f3Var.H(motionEvent, i, f3Var.u0, false);
        }
    }
}
