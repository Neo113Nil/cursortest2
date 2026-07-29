package o;

import android.os.SystemClock;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class Q2 extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ S2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q2(S2 s2, int i) {
        super(0);
        this.h = i;
        this.i = s2;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        int actionMasked;
        H2 h2;
        switch (this.h) {
            case 0:
                S2 s2 = this.i;
                MotionEvent motionEvent = s2.s0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    s2.t0 = SystemClock.uptimeMillis();
                    s2.post(s2.w0);
                }
                return C0782bY.a;
            default:
                h2 = this.i.get_viewTreeOwners();
                return h2;
        }
    }
}
