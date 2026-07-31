package yads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes10.dex */
public final class nc0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ oc0 a;

    public nc0(oc0 oc0Var) {
        this.a = oc0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        nn2 nn2Var;
        pc0 pc0Var = this.a.c;
        if (audioTrack != pc0Var.u) {
            throw new IllegalStateException();
        }
        yj1 yj1Var = pc0Var.r;
        if (yj1Var == null || !pc0Var.U || (nn2Var = yj1Var.a.Q0) == null) {
            return;
        }
        ((zn0) nn2Var).a.i.a.sendEmptyMessage(2);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        nn2 nn2Var;
        pc0 pc0Var = this.a.c;
        if (audioTrack != pc0Var.u) {
            throw new IllegalStateException();
        }
        yj1 yj1Var = pc0Var.r;
        if (yj1Var == null || !pc0Var.U || (nn2Var = yj1Var.a.Q0) == null) {
            return;
        }
        ((zn0) nn2Var).a.i.a.sendEmptyMessage(2);
    }
}
