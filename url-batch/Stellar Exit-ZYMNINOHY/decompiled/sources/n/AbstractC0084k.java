package n;

import android.view.Choreographer;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0084k {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: n.j
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                runnable.run();
            }
        });
    }
}
