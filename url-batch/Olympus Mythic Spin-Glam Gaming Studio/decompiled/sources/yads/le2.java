package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class le2 implements rf3 {
    public rf3 a;
    public final /* synthetic */ me2 b;

    public le2(me2 me2Var) {
        this.b = me2Var;
    }

    @Override // yads.rf3
    public final void a() {
        rf3 rf3Var = this.a;
        if (rf3Var != null) {
            rf3Var.a();
        }
    }

    @Override // yads.rf3
    public final void b() {
        q72 q72Var = (q72) this.b.a.b();
        if (q72Var != null) {
            p52 p52Var = q72Var.c;
            s72 s72Var = this.b.c;
            dl1 dl1Var = p52Var.b;
            if (dl1Var != null) {
                CheckBox muteControl = dl1Var.getMuteControl();
                if (muteControl != null) {
                    muteControl.setOnClickListener(null);
                    muteControl.setVisibility(8);
                }
                ProgressBar videoProgress = dl1Var.getVideoProgress();
                if (videoProgress != null) {
                    videoProgress.setProgress(0);
                    videoProgress.setVisibility(8);
                }
                TextView countDownProgress = dl1Var.getCountDownProgress();
                if (countDownProgress != null) {
                    countDownProgress.setText("");
                    countDownProgress.setVisibility(8);
                }
            }
        }
        rf3 rf3Var = this.a;
        if (rf3Var != null) {
            rf3Var.b();
        }
    }

    @Override // yads.rf3
    public final void c() {
        q72 q72Var = (q72) this.b.a.b();
        if (q72Var != null) {
            this.b.d.a(q72Var);
        }
        rf3 rf3Var = this.a;
        if (rf3Var != null) {
            rf3Var.c();
        }
    }
}
