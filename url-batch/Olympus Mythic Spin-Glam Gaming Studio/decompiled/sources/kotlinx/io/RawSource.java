package kotlinx.io;

/* compiled from: RawSource.kt */
/* loaded from: classes3.dex */
public interface RawSource extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    long readAtMostTo(Buffer buffer, long j);
}
