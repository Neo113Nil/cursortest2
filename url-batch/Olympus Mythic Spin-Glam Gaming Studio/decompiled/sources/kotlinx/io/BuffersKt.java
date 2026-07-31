package kotlinx.io;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Buffers.kt */
/* loaded from: classes8.dex */
public abstract class BuffersKt {
    public static final long indexOf(Buffer buffer, byte b, long j, long j2) {
        long j3;
        int indexOf;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long min = Math.min(j2, buffer.getSize());
        _UtilKt.checkBounds(buffer.getSize(), j, min);
        if (j == min || buffer.getHead() == null) {
            return -1L;
        }
        if (buffer.getSize() - j < j) {
            Segment tail = buffer.getTail();
            j3 = buffer.getSize();
            while (tail != null && j3 > j) {
                j3 -= tail.getLimit() - tail.getPos();
                if (j3 <= j) {
                    break;
                }
                tail = tail.getPrev();
            }
            if (j3 == -1) {
                return -1L;
            }
            while (min > j3) {
                Intrinsics.checkNotNull(tail);
                indexOf = SegmentKt.indexOf(tail, b, Math.max((int) (j - j3), 0), Math.min(tail.getSize(), (int) (min - j3)));
                if (indexOf == -1) {
                    j3 += tail.getSize();
                    tail = tail.getNext();
                    if (tail == null || j3 >= min) {
                        return -1L;
                    }
                }
            }
            throw new IllegalStateException("Check failed.");
        }
        Segment head = buffer.getHead();
        j3 = 0;
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j3;
            if (limit > j) {
                break;
            }
            head = head.getNext();
            j3 = limit;
        }
        if (j3 == -1) {
            return -1L;
        }
        while (min > j3) {
            Intrinsics.checkNotNull(head);
            indexOf = SegmentKt.indexOf(head, b, Math.max((int) (j - j3), 0), Math.min(head.getSize(), (int) (min - j3)));
            if (indexOf == -1) {
                j3 += head.getSize();
                head = head.getNext();
                if (head == null || j3 >= min) {
                    return -1L;
                }
            }
        }
        throw new IllegalStateException("Check failed.");
        return j3 + indexOf;
    }
}
