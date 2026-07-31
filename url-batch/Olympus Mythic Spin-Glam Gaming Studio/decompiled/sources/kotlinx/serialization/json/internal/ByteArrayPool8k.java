package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArrayPools.kt */
/* loaded from: classes8.dex */
public final class ByteArrayPool8k extends ByteArrayPoolBase {
    public static final ByteArrayPool8k INSTANCE = new ByteArrayPool8k();

    private ByteArrayPool8k() {
    }

    public final byte[] take() {
        return super.take(8196);
    }

    public final void release(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }
}
