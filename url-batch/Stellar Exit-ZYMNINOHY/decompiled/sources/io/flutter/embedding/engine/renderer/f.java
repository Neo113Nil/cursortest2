package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final long f547b;

    /* renamed from: c, reason: collision with root package name */
    public final FlutterJNI f548c;

    public f(long j2, FlutterJNI flutterJNI) {
        this.f547b = j2;
        this.f548c = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f548c;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f547b);
        }
    }
}
