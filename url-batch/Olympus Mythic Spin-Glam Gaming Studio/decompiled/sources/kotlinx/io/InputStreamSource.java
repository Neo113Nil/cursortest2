package kotlinx.io;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: JvmCore.kt */
/* loaded from: classes3.dex */
class InputStreamSource implements RawSource {
    private final InputStream input;

    public InputStreamSource(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.input = input;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
        }
        try {
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            Segment writableSegment = sink.writableSegment(1);
            int i = 0;
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            long read = this.input.read(dataAsByteArray, writableSegment.getLimit(), (int) Math.min(j, dataAsByteArray.length - r4));
            if (read != -1) {
                i = (int) read;
            }
            if (i == 1) {
                writableSegment.writeBackData(dataAsByteArray, i);
                writableSegment.setLimit(writableSegment.getLimit() + i);
                sink.setSizeMut(sink.getSizeMut() + i);
            } else {
                if (i < 0 || i > writableSegment.getRemainingCapacity()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                }
                if (i != 0) {
                    writableSegment.writeBackData(dataAsByteArray, i);
                    writableSegment.setLimit(writableSegment.getLimit() + i);
                    sink.setSizeMut(sink.getSizeMut() + i);
                } else if (SegmentKt.isEmpty(writableSegment)) {
                    sink.recycleTail();
                }
            }
            return read;
        } catch (AssertionError e) {
            if (JvmCoreKt.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    public String toString() {
        return "RawSource(" + this.input + ')';
    }
}
