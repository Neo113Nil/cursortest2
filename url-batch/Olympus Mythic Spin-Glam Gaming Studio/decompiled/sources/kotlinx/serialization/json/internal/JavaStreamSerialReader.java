package kotlinx.serialization.json.internal;

import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: JvmJsonStreams.kt */
/* loaded from: classes13.dex */
public final class JavaStreamSerialReader implements InternalJsonReader {
    private final CharsetReader reader;

    public JavaStreamSerialReader(InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.reader = new CharsetReader(stream, Charsets.UTF_8);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonReader
    public int read(char[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return this.reader.read(buffer, i, i2);
    }

    public final void release() {
        this.reader.release();
    }
}
