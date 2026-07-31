package yads;

import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes9.dex */
public final class wi3 implements cg3 {
    public final ak3 a;
    public final xd b;
    public final c20 c;

    public wi3(ak3 ak3Var) {
        xd xdVar = new xd();
        c20 c20Var = new c20();
        this.a = ak3Var;
        this.b = xdVar;
        this.c = c20Var;
    }

    @Override // yads.cg3
    public final void a(long j, long j2) {
        q72 q72Var = (q72) this.a.b();
        if (q72Var != null) {
            dl1 dl1Var = q72Var.c.b;
            ProgressBar videoProgress = dl1Var != null ? dl1Var.getVideoProgress() : null;
            if (videoProgress != null) {
                this.b.getClass();
                xd.a(videoProgress, j, j2);
            }
            dl1 dl1Var2 = q72Var.c.b;
            TextView countDownProgress = dl1Var2 != null ? dl1Var2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                long j3 = j - j2;
                uj2 uj2Var = this.c.a;
                countDownProgress.setText(uj2.a(j3));
            }
        }
    }
}
