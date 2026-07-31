package kotlinx.io;

import io.ktor.utils.io.pool.DefaultPool$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SegmentPool.kt */
/* loaded from: classes12.dex */
public final class SegmentPool {
    private static final String DEFAULT_SECOND_LEVEL_POOL_TOTAL_SIZE;
    private static final int HASH_BUCKET_COUNT;
    private static final int HASH_BUCKET_COUNT_L2;
    private static final int SECOND_LEVEL_POOL_BUCKET_SIZE;
    private static final int SECOND_LEVEL_POOL_TOTAL_SIZE;
    private static final AtomicReferenceArray hashBuckets;
    private static final AtomicReferenceArray hashBucketsL2;
    public static final SegmentPool INSTANCE = new SegmentPool();
    private static final int MAX_SIZE = 65536;
    private static final Segment LOCK = Segment.Companion.new$kotlinx_io_core(new byte[0], 0, 0, null, false);

    private SegmentPool() {
    }

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        HASH_BUCKET_COUNT = highestOneBit;
        int coerceAtLeast = RangesKt.coerceAtLeast(highestOneBit / 2, 1);
        HASH_BUCKET_COUNT_L2 = coerceAtLeast;
        String str = Intrinsics.areEqual(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        DEFAULT_SECOND_LEVEL_POOL_TOTAL_SIZE = str;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        Integer intOrNull = StringsKt.toIntOrNull(property);
        int coerceAtLeast2 = intOrNull != null ? RangesKt.coerceAtLeast(intOrNull.intValue(), 0) : 0;
        SECOND_LEVEL_POOL_TOTAL_SIZE = coerceAtLeast2;
        SECOND_LEVEL_POOL_BUCKET_SIZE = RangesKt.coerceAtLeast(coerceAtLeast2 / coerceAtLeast, 8192);
        hashBuckets = new AtomicReferenceArray(highestOneBit);
        hashBucketsL2 = new AtomicReferenceArray(coerceAtLeast);
    }

    public static final Segment take() {
        Segment segment;
        Segment segment2;
        AtomicReferenceArray atomicReferenceArray = hashBuckets;
        int l1BucketId = INSTANCE.l1BucketId();
        do {
            segment = LOCK;
            segment2 = (Segment) atomicReferenceArray.getAndSet(l1BucketId, segment);
        } while (Intrinsics.areEqual(segment2, segment));
        if (segment2 == null) {
            atomicReferenceArray.set(l1BucketId, null);
            if (SECOND_LEVEL_POOL_TOTAL_SIZE > 0) {
                return takeL2();
            }
            return Segment.Companion.new$kotlinx_io_core();
        }
        atomicReferenceArray.set(l1BucketId, segment2.getNext());
        segment2.setNext(null);
        segment2.setLimit(0);
        return segment2;
    }

    private static final Segment takeL2() {
        AtomicReferenceArray atomicReferenceArray = hashBucketsL2;
        int l2BucketId = INSTANCE.l2BucketId();
        int i = 0;
        while (true) {
            Segment segment = LOCK;
            Segment segment2 = (Segment) atomicReferenceArray.getAndSet(l2BucketId, segment);
            if (!Intrinsics.areEqual(segment2, segment)) {
                if (segment2 == null) {
                    atomicReferenceArray.set(l2BucketId, null);
                    int i2 = HASH_BUCKET_COUNT_L2;
                    if (i >= i2) {
                        return Segment.Companion.new$kotlinx_io_core();
                    }
                    l2BucketId = (l2BucketId + 1) & (i2 - 1);
                    i++;
                } else {
                    atomicReferenceArray.set(l2BucketId, segment2.getNext());
                    segment2.setNext(null);
                    segment2.setLimit(0);
                    return segment2;
                }
            }
        }
    }

    public static final void recycle(Segment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.getNext() != null || segment.getPrev() != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        SegmentCopyTracker copyTracker$kotlinx_io_core = segment.getCopyTracker$kotlinx_io_core();
        if (copyTracker$kotlinx_io_core != null && copyTracker$kotlinx_io_core.removeCopy()) {
            return;
        }
        AtomicReferenceArray atomicReferenceArray = hashBuckets;
        int l1BucketId = INSTANCE.l1BucketId();
        segment.setPos(0);
        segment.owner = true;
        while (true) {
            Segment segment2 = (Segment) atomicReferenceArray.get(l1BucketId);
            if (segment2 != LOCK) {
                int limit = segment2 != null ? segment2.getLimit() : 0;
                if (limit >= MAX_SIZE) {
                    if (SECOND_LEVEL_POOL_TOTAL_SIZE > 0) {
                        recycleL2(segment);
                        return;
                    }
                    return;
                } else {
                    segment.setNext(segment2);
                    segment.setLimit(limit + 8192);
                    if (DefaultPool$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, l1BucketId, segment2, segment)) {
                        return;
                    }
                }
            }
        }
    }

    private static final void recycleL2(Segment segment) {
        segment.setPos(0);
        segment.owner = true;
        int l2BucketId = INSTANCE.l2BucketId();
        AtomicReferenceArray atomicReferenceArray = hashBucketsL2;
        int i = 0;
        while (true) {
            Segment segment2 = (Segment) atomicReferenceArray.get(l2BucketId);
            if (segment2 != LOCK) {
                int limit = (segment2 != null ? segment2.getLimit() : 0) + 8192;
                if (limit > SECOND_LEVEL_POOL_BUCKET_SIZE) {
                    int i2 = HASH_BUCKET_COUNT_L2;
                    if (i >= i2) {
                        return;
                    }
                    i++;
                    l2BucketId = (l2BucketId + 1) & (i2 - 1);
                } else {
                    segment.setNext(segment2);
                    segment.setLimit(limit);
                    if (DefaultPool$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, l2BucketId, segment2, segment)) {
                        return;
                    }
                }
            }
        }
    }

    public static final SegmentCopyTracker tracker() {
        return new RefCountingCopyTracker();
    }

    private final int l1BucketId() {
        return bucketId(HASH_BUCKET_COUNT - 1);
    }

    private final int l2BucketId() {
        return bucketId(HASH_BUCKET_COUNT_L2 - 1);
    }

    private final int bucketId(long j) {
        return (int) (j & Thread.currentThread().getId());
    }
}
