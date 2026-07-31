package yads;

import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class qj2 implements k73 {
    public final long a;
    public final WeakReference b;

    public qj2(ProgressBar progressBar, fw fwVar, long j) {
        this.a = j;
        this.b = new WeakReference(progressBar);
    }

    @Override // yads.k73
    public final void a(long j, long j2) {
        ProgressBar progressBar = (ProgressBar) this.b.get();
        if (progressBar != null) {
            long j3 = this.a;
            xd.a(progressBar, j3, j3 - j);
        }
    }
}
