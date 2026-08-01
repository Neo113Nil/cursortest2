package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o5 implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ p5 d;

    public o5(p5 p5Var) {
        this.d = p5Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.d.g.removeCallbacks(this);
        p5.l(this.d);
        p5 p5Var = this.d;
        synchronized (p5Var.h) {
            if (p5Var.m) {
                p5Var.m = false;
                ArrayList arrayList = p5Var.j;
                p5Var.j = p5Var.k;
                p5Var.k = arrayList;
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
        p5.l(this.d);
        p5 p5Var = this.d;
        synchronized (p5Var.h) {
            if (p5Var.j.isEmpty()) {
                p5Var.f.removeFrameCallback(this);
                p5Var.m = false;
            }
        }
    }
}
