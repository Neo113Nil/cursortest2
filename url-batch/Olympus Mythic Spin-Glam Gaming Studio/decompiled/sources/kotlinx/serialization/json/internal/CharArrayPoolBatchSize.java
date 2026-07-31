package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArrayPools.kt */
/* loaded from: classes12.dex */
public final class CharArrayPoolBatchSize extends CharArrayPoolBase {
    public static final CharArrayPoolBatchSize INSTANCE = new CharArrayPoolBatchSize();

    private CharArrayPoolBatchSize() {
    }

    public final char[] take() {
        return super.take(16384);
    }

    public final void release(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length != 16384) {
            throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
        releaseImpl(array);
    }
}
