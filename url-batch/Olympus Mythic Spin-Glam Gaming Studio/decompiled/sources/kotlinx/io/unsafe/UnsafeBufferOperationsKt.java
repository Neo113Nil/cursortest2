package kotlinx.io.unsafe;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Segment;

/* compiled from: UnsafeBufferOperations.kt */
/* loaded from: classes11.dex */
public abstract class UnsafeBufferOperationsKt {
    private static final SegmentReadContext SegmentReadContextImpl = new SegmentReadContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$SegmentReadContextImpl$1
        @Override // kotlinx.io.unsafe.SegmentReadContext
        public byte getUnchecked(Segment segment, int i) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            return segment.getUnchecked$kotlinx_io_core(i);
        }
    };
    private static final SegmentWriteContext SegmentWriteContextImpl = new SegmentWriteContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$SegmentWriteContextImpl$1
    };
    private static final BufferIterationContext BufferIterationContextImpl = new BufferIterationContext() { // from class: kotlinx.io.unsafe.UnsafeBufferOperationsKt$BufferIterationContextImpl$1
        @Override // kotlinx.io.unsafe.SegmentReadContext
        public byte getUnchecked(Segment segment, int i) {
            SegmentReadContext segmentReadContext;
            Intrinsics.checkNotNullParameter(segment, "segment");
            segmentReadContext = UnsafeBufferOperationsKt.SegmentReadContextImpl;
            return segmentReadContext.getUnchecked(segment, i);
        }
    };
}
