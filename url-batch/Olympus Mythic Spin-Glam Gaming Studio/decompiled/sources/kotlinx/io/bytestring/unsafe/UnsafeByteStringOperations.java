package kotlinx.io.bytestring.unsafe;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.bytestring.ByteString;

/* compiled from: UnsafeByteStringOperations.kt */
/* loaded from: classes14.dex */
public final class UnsafeByteStringOperations {
    public static final UnsafeByteStringOperations INSTANCE = new UnsafeByteStringOperations();

    private UnsafeByteStringOperations() {
    }

    public final ByteString wrapUnsafe(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return ByteString.Companion.wrap$kotlinx_io_bytestring(array);
    }
}
