package kotlinx.io;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: PeekSource.kt */
/* loaded from: classes11.dex */
public final class PeekSource implements RawSource {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final Source upstream;

    public PeekSource(Source upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        Buffer buffer = upstream.getBuffer();
        this.buffer = buffer;
        this.expectedSegment = buffer.getHead();
        Segment head = buffer.getHead();
        this.expectedPos = head != null ? head.getPos() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r3 == r4.getPos()) goto L15;
     */
    @Override // kotlinx.io.RawSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long readAtMostTo(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.closed) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j >= 0) {
            Segment segment = this.expectedSegment;
            if (segment != null) {
                if (segment == this.buffer.getHead()) {
                    int i = this.expectedPos;
                    Segment head = this.buffer.getHead();
                    Intrinsics.checkNotNull(head);
                }
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            }
            if (j == 0) {
                return 0L;
            }
            if (!this.upstream.request(this.pos + 1)) {
                return -1L;
            }
            if (this.expectedSegment == null && this.buffer.getHead() != null) {
                this.expectedSegment = this.buffer.getHead();
                Segment head2 = this.buffer.getHead();
                Intrinsics.checkNotNull(head2);
                this.expectedPos = head2.getPos();
            }
            long min = Math.min(j, this.buffer.getSize() - this.pos);
            Buffer buffer = this.buffer;
            long j2 = this.pos;
            buffer.copyTo(sink, j2, j2 + min);
            this.pos += min;
            return min;
        }
        throw new IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }
}
