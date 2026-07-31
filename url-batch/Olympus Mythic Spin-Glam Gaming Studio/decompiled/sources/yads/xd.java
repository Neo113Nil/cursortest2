package yads;

import android.widget.ProgressBar;

/* loaded from: classes4.dex */
public final class xd {
    public static void a(ProgressBar progressBar, long j, long j2) {
        progressBar.clearAnimation();
        if (j > 0) {
            progressBar.setMax((int) j);
            lj2 lj2Var = new lj2(progressBar, progressBar.getProgress(), (int) j2);
            lj2Var.setDuration(200L);
            progressBar.startAnimation(lj2Var);
        }
    }
}
