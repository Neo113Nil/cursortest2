package kotlinx.io;

/* compiled from: Sink.kt */
/* loaded from: classes4.dex */
public interface Sink extends RawSink {
    Buffer getBuffer();

    long transferFrom(RawSource rawSource);

    void write(byte[] bArr, int i, int i2);

    void writeByte(byte b);

    static /* synthetic */ void write$default(Sink sink, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        sink.write(bArr, i, i2);
    }
}
