package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d3 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ f3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(f3 f3Var, int i) {
        super(0);
        this.e = i;
        this.f = f3Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        int actionMasked;
        y2 y2Var;
        int i = this.e;
        f3 f3Var = this.f;
        switch (i) {
            case 0:
                MotionEvent motionEvent = f3Var.t0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    f3Var.u0 = SystemClock.uptimeMillis();
                    f3Var.post(f3Var.z0);
                }
                return ky0.a;
            default:
                y2Var = f3Var.get_viewTreeOwners();
                return y2Var;
        }
    }
}
