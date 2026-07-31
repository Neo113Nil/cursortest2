package kotlinx.io;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Segment.kt */
/* loaded from: classes14.dex */
public final class Segment {
    public static final Companion Companion = new Companion(null);
    private SegmentCopyTracker copyTracker;
    private final byte[] data;
    private int limit;
    private Segment next;
    public boolean owner;
    private int pos;
    private Segment prev;

    public /* synthetic */ Segment(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public /* synthetic */ Segment(byte[] bArr, int i, int i2, SegmentCopyTracker segmentCopyTracker, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, i, i2, segmentCopyTracker, z);
    }

    public final /* synthetic */ void writeBackData(byte[] data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public final /* synthetic */ int getPos() {
        return this.pos;
    }

    public final /* synthetic */ void setPos(int i) {
        this.pos = i;
    }

    public final /* synthetic */ int getLimit() {
        return this.limit;
    }

    public final /* synthetic */ void setLimit(int i) {
        this.limit = i;
    }

    public final boolean getShared$kotlinx_io_core() {
        SegmentCopyTracker segmentCopyTracker = this.copyTracker;
        if (segmentCopyTracker != null) {
            return segmentCopyTracker.getShared();
        }
        return false;
    }

    public final SegmentCopyTracker getCopyTracker$kotlinx_io_core() {
        return this.copyTracker;
    }

    public final /* synthetic */ Segment getNext() {
        return this.next;
    }

    public final /* synthetic */ void setNext(Segment segment) {
        this.next = segment;
    }

    public final /* synthetic */ Segment getPrev() {
        return this.prev;
    }

    public final /* synthetic */ void setPrev(Segment segment) {
        this.prev = segment;
    }

    private Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.copyTracker = null;
    }

    private Segment(byte[] bArr, int i, int i2, SegmentCopyTracker segmentCopyTracker, boolean z) {
        this.data = bArr;
        this.pos = i;
        this.limit = i2;
        this.copyTracker = segmentCopyTracker;
        this.owner = z;
    }

    public final Segment sharedCopy$kotlinx_io_core() {
        SegmentCopyTracker segmentCopyTracker = this.copyTracker;
        if (segmentCopyTracker == null) {
            segmentCopyTracker = SegmentPool.tracker();
            this.copyTracker = segmentCopyTracker;
        }
        SegmentCopyTracker segmentCopyTracker2 = segmentCopyTracker;
        byte[] bArr = this.data;
        int i = this.pos;
        int i2 = this.limit;
        segmentCopyTracker2.addCopy();
        Unit unit = Unit.INSTANCE;
        return new Segment(bArr, i, i2, segmentCopyTracker2, false);
    }

    public final Segment pop$kotlinx_io_core() {
        Segment segment = this.next;
        Segment segment2 = this.prev;
        if (segment2 != null) {
            Intrinsics.checkNotNull(segment2);
            segment2.next = this.next;
        }
        Segment segment3 = this.next;
        if (segment3 != null) {
            Intrinsics.checkNotNull(segment3);
            segment3.prev = this.prev;
        }
        this.next = null;
        this.prev = null;
        return segment;
    }

    public final Segment push$kotlinx_io_core(Segment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        if (segment2 != null) {
            Intrinsics.checkNotNull(segment2);
            segment2.prev = segment;
        }
        this.next = segment;
        return segment;
    }

    public final Segment split$kotlinx_io_core(int i) {
        Segment take;
        if (i <= 0 || i > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            take = sharedCopy$kotlinx_io_core();
        } else {
            take = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = take.data;
            int i2 = this.pos;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
        }
        take.limit = take.pos + i;
        this.pos += i;
        Segment segment = this.prev;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            segment.push$kotlinx_io_core(take);
        } else {
            take.next = this;
            this.prev = take;
        }
        return take;
    }

    public final Segment compact$kotlinx_io_core() {
        int i;
        Segment segment = this.prev;
        if (segment == null) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(segment);
        if (!segment.owner) {
            return this;
        }
        int i2 = this.limit - this.pos;
        Segment segment2 = this.prev;
        Intrinsics.checkNotNull(segment2);
        int i3 = 8192 - segment2.limit;
        Segment segment3 = this.prev;
        Intrinsics.checkNotNull(segment3);
        if (segment3.getShared$kotlinx_io_core()) {
            i = 0;
        } else {
            Segment segment4 = this.prev;
            Intrinsics.checkNotNull(segment4);
            i = segment4.pos;
        }
        if (i2 > i3 + i) {
            return this;
        }
        Segment segment5 = this.prev;
        Intrinsics.checkNotNull(segment5);
        writeTo$kotlinx_io_core(segment5, i2);
        if (pop$kotlinx_io_core() != null) {
            throw new IllegalStateException("Check failed.");
        }
        SegmentPool.recycle(this);
        return segment5;
    }

    public final void writeByte$kotlinx_io_core(byte b) {
        byte[] bArr = this.data;
        int i = this.limit;
        this.limit = i + 1;
        bArr[i] = b;
    }

    public final byte readByte$kotlinx_io_core() {
        byte[] bArr = this.data;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    public final void writeTo$kotlinx_io_core(Segment sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.limit + i > 8192) {
            if (sink.getShared$kotlinx_io_core()) {
                throw new IllegalArgumentException();
            }
            int i2 = sink.limit;
            int i3 = sink.pos;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            ArraysKt.copyInto$default(bArr, bArr, 0, i3, i2, 2, (Object) null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i4 = sink.limit;
        int i5 = this.pos;
        ArraysKt.copyInto(bArr2, bArr3, i4, i5, i5 + i);
        sink.limit += i;
        this.pos += i;
    }

    public final void readTo$kotlinx_io_core(byte[] dst, int i, int i2) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i3 = i2 - i;
        byte[] bArr = this.data;
        int i4 = this.pos;
        ArraysKt.copyInto(bArr, dst, i, i4, i4 + i3);
        this.pos += i3;
    }

    public final void write$kotlinx_io_core(byte[] src, int i, int i2) {
        Intrinsics.checkNotNullParameter(src, "src");
        ArraysKt.copyInto(src, this.data, this.limit, i, i2);
        this.limit += i2 - i;
    }

    public final int getSize() {
        return this.limit - this.pos;
    }

    public final int getRemainingCapacity() {
        return this.data.length - this.limit;
    }

    public final /* synthetic */ byte[] dataAsByteArray(boolean z) {
        return this.data;
    }

    public final byte getUnchecked$kotlinx_io_core(int i) {
        return this.data[this.pos + i];
    }

    /* compiled from: Segment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ Segment new$kotlinx_io_core() {
            return new Segment(null);
        }

        public final /* synthetic */ Segment new$kotlinx_io_core(byte[] data, int i, int i2, SegmentCopyTracker segmentCopyTracker, boolean z) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Segment(data, i, i2, segmentCopyTracker, z, null);
        }
    }
}
