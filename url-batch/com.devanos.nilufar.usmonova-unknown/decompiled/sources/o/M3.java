package o;

import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M3 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ N3 h;

    public M3(N3 n3) {
        this.h = n3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.h.k.removeCallbacks(this);
        N3.O(this.h);
        N3 n3 = this.h;
        synchronized (n3.l) {
            if (n3.q) {
                n3.q = false;
                ArrayList arrayList = n3.n;
                n3.n = n3.f69o;
                n3.f69o = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        N3.O(this.h);
        N3 n3 = this.h;
        synchronized (n3.l) {
            if (n3.n.isEmpty()) {
                n3.j.removeFrameCallback(this);
                n3.q = false;
            }
        }
    }
}
