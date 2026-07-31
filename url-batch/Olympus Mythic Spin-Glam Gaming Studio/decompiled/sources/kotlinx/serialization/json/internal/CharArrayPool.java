package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArrayPools.kt */
/* loaded from: classes4.dex */
public final class CharArrayPool extends CharArrayPoolBase {
    public static final CharArrayPool INSTANCE = new CharArrayPool();

    private CharArrayPool() {
    }

    public final char[] take() {
        return super.take(128);
    }

    public final void release(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        releaseImpl(array);
    }
}
