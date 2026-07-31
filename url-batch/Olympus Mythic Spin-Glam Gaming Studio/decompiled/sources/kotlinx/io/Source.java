package kotlinx.io;

/* compiled from: Source.kt */
/* loaded from: classes4.dex */
public interface Source extends RawSource {
    boolean exhausted();

    Buffer getBuffer();

    Source peek();

    int readAtMostTo(byte[] bArr, int i, int i2);

    byte readByte();

    void readTo(RawSink rawSink, long j);

    boolean request(long j);

    void require(long j);

    long transferTo(RawSink rawSink);
}
