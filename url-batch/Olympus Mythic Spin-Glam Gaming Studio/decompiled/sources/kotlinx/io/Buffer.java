package kotlinx.io;

import java.io.EOFException;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.unsafe.SegmentReadContext;
import kotlinx.io.unsafe.UnsafeBufferOperations;
import kotlinx.io.unsafe.UnsafeBufferOperationsKt;

/* compiled from: Buffer.kt */
/* loaded from: classes10.dex */
public final class Buffer implements Source, Sink {
    private Segment head;
    private long sizeMut;
    private Segment tail;

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // kotlinx.io.Source, kotlinx.io.Sink
    public Buffer getBuffer() {
        return this;
    }

    public final /* synthetic */ Segment getHead() {
        return this.head;
    }

    public final /* synthetic */ void setHead(Segment segment) {
        this.head = segment;
    }

    public final /* synthetic */ Segment getTail() {
        return this.tail;
    }

    public final /* synthetic */ void setTail(Segment segment) {
        this.tail = segment;
    }

    public final long getSize() {
        return this.sizeMut;
    }

    public final /* synthetic */ long getSizeMut() {
        return this.sizeMut;
    }

    public final /* synthetic */ void setSizeMut(long j) {
        this.sizeMut = j;
    }

    @Override // kotlinx.io.Source
    public boolean exhausted() {
        return getSize() == 0;
    }

    @Override // kotlinx.io.Source
    public void require(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (getSize() >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + getSize() + ", required: " + j + ')');
    }

    @Override // kotlinx.io.Source
    public boolean request(long j) {
        if (j >= 0) {
            return getSize() >= j;
        }
        throw new IllegalArgumentException(("byteCount: " + j + " < 0").toString());
    }

    @Override // kotlinx.io.Source
    public byte readByte() {
        Segment segment = this.head;
        if (segment == null) {
            throwEof(1L);
            throw new KotlinNothingValueException();
        }
        int size = segment.getSize();
        if (size == 0) {
            recycleHead$kotlinx_io_core();
            return readByte();
        }
        byte readByte$kotlinx_io_core = segment.readByte$kotlinx_io_core();
        this.sizeMut--;
        if (size == 1) {
            recycleHead$kotlinx_io_core();
        }
        return readByte$kotlinx_io_core;
    }

    private final Void throwEof(long j) {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + getSize() + ", required: " + j + ')');
    }

    public final void copyTo(Buffer out, long j, long j2) {
        Intrinsics.checkNotNullParameter(out, "out");
        _UtilKt.checkBounds(getSize(), j, j2);
        if (j == j2) {
            return;
        }
        long j3 = j2 - j;
        out.sizeMut += j3;
        Segment segment = this.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            if (j < segment.getLimit() - segment.getPos()) {
                break;
            }
            j -= segment.getLimit() - segment.getPos();
            segment = segment.getNext();
        }
        while (j3 > 0) {
            Intrinsics.checkNotNull(segment);
            Segment sharedCopy$kotlinx_io_core = segment.sharedCopy$kotlinx_io_core();
            sharedCopy$kotlinx_io_core.setPos(sharedCopy$kotlinx_io_core.getPos() + ((int) j));
            sharedCopy$kotlinx_io_core.setLimit(Math.min(sharedCopy$kotlinx_io_core.getPos() + ((int) j3), sharedCopy$kotlinx_io_core.getLimit()));
            if (out.getHead() == null) {
                out.setHead(sharedCopy$kotlinx_io_core);
                out.setTail(sharedCopy$kotlinx_io_core);
            } else {
                Segment tail = out.getTail();
                Intrinsics.checkNotNull(tail);
                out.setTail(tail.push$kotlinx_io_core(sharedCopy$kotlinx_io_core));
            }
            j3 -= sharedCopy$kotlinx_io_core.getLimit() - sharedCopy$kotlinx_io_core.getPos();
            segment = segment.getNext();
            j = 0;
        }
    }

    public final long completeSegmentByteCount$kotlinx_io_core() {
        long size = getSize();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.tail;
        Intrinsics.checkNotNull(segment);
        return (segment.getLimit() >= 8192 || !segment.owner) ? size : size - (segment.getLimit() - segment.getPos());
    }

    public final byte get(long j) {
        long j2 = 0;
        if (j < 0 || j >= getSize()) {
            throw new IndexOutOfBoundsException("position (" + j + ") is not within the range [0..size(" + getSize() + "))");
        }
        if (j == 0) {
            Segment segment = this.head;
            Intrinsics.checkNotNull(segment);
            return segment.getUnchecked$kotlinx_io_core(0);
        }
        if (getHead() == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (getSize() - j < j) {
            Segment tail = getTail();
            long size = getSize();
            while (tail != null && size > j) {
                size -= tail.getLimit() - tail.getPos();
                if (size <= j) {
                    break;
                }
                tail = tail.getPrev();
            }
            Intrinsics.checkNotNull(tail);
            return tail.getUnchecked$kotlinx_io_core((int) (j - size));
        }
        Segment head = getHead();
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j2;
            if (limit > j) {
                break;
            }
            head = head.getNext();
            j2 = limit;
        }
        Intrinsics.checkNotNull(head);
        return head.getUnchecked$kotlinx_io_core((int) (j - j2));
    }

    public final void clear() {
        skip(getSize());
    }

    public void skip(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
        }
        long j2 = j;
        while (j2 > 0) {
            Segment segment = this.head;
            if (segment != null) {
                int min = (int) Math.min(j2, segment.getLimit() - segment.getPos());
                long j3 = min;
                this.sizeMut -= j3;
                j2 -= j3;
                segment.setPos(segment.getPos() + min);
                if (segment.getPos() == segment.getLimit()) {
                    recycleHead$kotlinx_io_core();
                }
            } else {
                throw new EOFException("Buffer exhausted before skipping " + j + " bytes.");
            }
        }
    }

    @Override // kotlinx.io.Source
    public int readAtMostTo(byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        _UtilKt.checkBounds(sink.length, i, i2);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2 - i, segment.getSize());
        segment.readTo$kotlinx_io_core(sink, i, i + min);
        this.sizeMut -= min;
        if (SegmentKt.isEmpty(segment)) {
            recycleHead$kotlinx_io_core();
        }
        return min;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
        }
        if (getSize() == 0) {
            return -1L;
        }
        if (j > getSize()) {
            j = getSize();
        }
        sink.write(this, j);
        return j;
    }

    @Override // kotlinx.io.Source
    public void readTo(RawSink sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
        }
        if (getSize() < j) {
            sink.write(this, getSize());
            throw new EOFException("Buffer exhausted before writing " + j + " bytes. Only " + getSize() + " bytes were written.");
        }
        sink.write(this, j);
    }

    @Override // kotlinx.io.Source
    public long transferTo(RawSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = getSize();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @Override // kotlinx.io.Source
    public Source peek() {
        return CoreKt.buffered(new PeekSource(this));
    }

    public final /* synthetic */ Segment writableSegment(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException(("unexpected capacity (" + i + "), should be in range [1, 8192]").toString());
        }
        Segment segment = this.tail;
        if (segment == null) {
            Segment take = SegmentPool.take();
            this.head = take;
            this.tail = take;
            return take;
        }
        Intrinsics.checkNotNull(segment);
        if (segment.getLimit() + i <= 8192 && segment.owner) {
            return segment;
        }
        Segment push$kotlinx_io_core = segment.push$kotlinx_io_core(SegmentPool.take());
        this.tail = push$kotlinx_io_core;
        return push$kotlinx_io_core;
    }

    @Override // kotlinx.io.Sink
    public void write(byte[] source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        _UtilKt.checkBounds(source.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            Segment writableSegment = writableSegment(1);
            int min = Math.min(i2 - i3, writableSegment.getRemainingCapacity()) + i3;
            writableSegment.write$kotlinx_io_core(source, i3, min);
            i3 = min;
        }
        this.sizeMut += i2 - i;
    }

    @Override // kotlinx.io.RawSink
    public void write(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        _UtilKt.checkOffsetAndCount(source.sizeMut, 0L, j);
        while (j > 0) {
            Intrinsics.checkNotNull(source.head);
            if (j < r0.getSize()) {
                Segment segment = this.tail;
                if (segment != null && segment.owner) {
                    if ((segment.getLimit() + j) - (segment.getShared$kotlinx_io_core() ? 0 : segment.getPos()) <= 8192) {
                        Segment segment2 = source.head;
                        Intrinsics.checkNotNull(segment2);
                        segment2.writeTo$kotlinx_io_core(segment, (int) j);
                        source.sizeMut -= j;
                        this.sizeMut += j;
                        return;
                    }
                }
                Segment segment3 = source.head;
                Intrinsics.checkNotNull(segment3);
                source.head = segment3.split$kotlinx_io_core((int) j);
            }
            Segment segment4 = source.head;
            Intrinsics.checkNotNull(segment4);
            long size = segment4.getSize();
            Segment pop$kotlinx_io_core = segment4.pop$kotlinx_io_core();
            source.head = pop$kotlinx_io_core;
            if (pop$kotlinx_io_core == null) {
                source.tail = null;
            }
            if (getHead() == null) {
                setHead(segment4);
                setTail(segment4);
            } else {
                Segment tail = getTail();
                Intrinsics.checkNotNull(tail);
                setTail(tail.push$kotlinx_io_core(segment4).compact$kotlinx_io_core());
                Segment tail2 = getTail();
                Intrinsics.checkNotNull(tail2);
                if (tail2.getPrev() == null) {
                    setHead(getTail());
                }
            }
            source.sizeMut -= size;
            this.sizeMut += size;
            j -= size;
        }
    }

    @Override // kotlinx.io.Sink
    public long transferFrom(RawSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long readAtMostTo = source.readAtMostTo(this, 8192L);
            if (readAtMostTo == -1) {
                return j;
            }
            j += readAtMostTo;
        }
    }

    @Override // kotlinx.io.Sink
    public void writeByte(byte b) {
        writableSegment(1).writeByte$kotlinx_io_core(b);
        this.sizeMut++;
    }

    public String toString() {
        SegmentReadContext segmentReadContext;
        if (getSize() == 0) {
            return "Buffer(size=0)";
        }
        long j = 64;
        int min = (int) Math.min(j, getSize());
        StringBuilder sb = new StringBuilder((min * 2) + (getSize() > j ? 1 : 0));
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        int i = 0;
        for (Segment head = getHead(); head != null; head = head.getNext()) {
            segmentReadContext = UnsafeBufferOperationsKt.SegmentReadContextImpl;
            int i2 = 0;
            while (i < min && i2 < head.getSize()) {
                int i3 = i2 + 1;
                byte unchecked = segmentReadContext.getUnchecked(head, i2);
                i++;
                sb.append(_UtilKt.getHEX_DIGIT_CHARS()[(unchecked >> 4) & 15]);
                sb.append(_UtilKt.getHEX_DIGIT_CHARS()[unchecked & 15]);
                i2 = i3;
            }
        }
        if (getSize() > j) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + getSize() + " hex=" + ((Object) sb) + ')';
    }

    public final void recycleHead$kotlinx_io_core() {
        Segment segment = this.head;
        Intrinsics.checkNotNull(segment);
        Segment next = segment.getNext();
        this.head = next;
        if (next == null) {
            this.tail = null;
        } else {
            next.setPrev(null);
        }
        segment.setNext(null);
        SegmentPool.recycle(segment);
    }

    public final /* synthetic */ void recycleTail() {
        Segment segment = this.tail;
        Intrinsics.checkNotNull(segment);
        Segment prev = segment.getPrev();
        this.tail = prev;
        if (prev == null) {
            this.head = null;
        } else {
            prev.setNext(null);
        }
        segment.setPrev(null);
        SegmentPool.recycle(segment);
    }
}
