package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArrayPools.kt */
/* loaded from: classes10.dex */
public abstract class ByteArrayPoolBase {
    private final ArrayDeque arrays = new ArrayDeque();
    private int bytesTotal;

    protected final byte[] take(int i) {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.arrays.removeLastOrNull();
            if (bArr != null) {
                this.bytesTotal -= bArr.length / 2;
            } else {
                bArr = null;
            }
        }
        return bArr == null ? new byte[i] : bArr;
    }

    protected final void releaseImpl(byte[] array) {
        int i;
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int length = this.bytesTotal + array.length;
                i = ArrayPoolsKt.MAX_CHARS_IN_POOL;
                if (length < i) {
                    this.bytesTotal += array.length / 2;
                    this.arrays.addLast(array);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
