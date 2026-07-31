package kotlin.io;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileReadWrite.kt */
/* loaded from: classes4.dex */
final class ExposingBufferByteArrayOutputStream extends ByteArrayOutputStream {
    public ExposingBufferByteArrayOutputStream(int i) {
        super(i);
    }

    public final byte[] getBuffer() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
