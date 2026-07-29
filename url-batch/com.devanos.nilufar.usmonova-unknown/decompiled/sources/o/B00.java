package o;

import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class B00 implements Choreographer.FrameCallback {
    public long h;
    public final /* synthetic */ QL i;

    public B00(QL ql, long j) {
        this.i = ql;
        this.h = j;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long nanoTime = System.nanoTime() - j;
        long j2 = nanoTime < 0 ? 0L : nanoTime;
        QL ql = this.i;
        ((FlutterJNI) ql.b).onVsync(j2, ql.a, this.h);
        ql.c = this;
    }
}
