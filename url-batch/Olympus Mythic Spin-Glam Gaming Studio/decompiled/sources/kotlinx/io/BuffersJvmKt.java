package kotlinx.io;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: BuffersJvm.kt */
/* loaded from: classes3.dex */
public abstract class BuffersJvmKt {
    public static /* synthetic */ void readTo$default(Buffer buffer, OutputStream outputStream, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = buffer.getSize();
        }
        readTo(buffer, outputStream, j);
    }

    public static final void readTo(Buffer buffer, OutputStream out, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        _UtilKt.checkOffsetAndCount(buffer.getSize(), 0L, j);
        while (j > 0) {
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            if (buffer.exhausted()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            Segment head = buffer.getHead();
            Intrinsics.checkNotNull(head);
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            int min = (int) Math.min(j, head.getLimit() - pos);
            out.write(dataAsByteArray, pos, min);
            long j2 = min;
            j -= j2;
            if (min != 0) {
                if (min < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (min > head.getSize()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                buffer.skip(j2);
            }
        }
    }
}
