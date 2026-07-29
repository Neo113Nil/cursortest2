package o;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511mf implements InterfaceC1346k8 {
    public final FlutterJNI a;
    public final int b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public C1511mf(FlutterJNI flutterJNI, int i) {
        this.a = flutterJNI;
        this.b = i;
    }

    @Override // o.InterfaceC1346k8
    public final void a(ByteBuffer byteBuffer) {
        if (this.c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i = this.b;
        FlutterJNI flutterJNI = this.a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i, byteBuffer, byteBuffer.position());
        }
    }
}
