package o;

import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: o.rn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1848rn implements Runnable {
    public final long h;
    public final FlutterJNI i;

    public RunnableC1848rn(long j, FlutterJNI flutterJNI) {
        this.h = j;
        this.i = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.i;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.h);
        }
    }
}
