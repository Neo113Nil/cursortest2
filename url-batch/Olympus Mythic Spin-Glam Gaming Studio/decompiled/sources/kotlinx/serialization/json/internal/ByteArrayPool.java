package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArrayPools.kt */
/* loaded from: classes5.dex */
public final class ByteArrayPool extends ByteArrayPoolBase {
    public static final ByteArrayPool INSTANCE = new ByteArrayPool();

    private ByteArrayPool() {
    }

    public final byte[] take() {
        return super.take(512);
    }

    public final void release(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }
}
