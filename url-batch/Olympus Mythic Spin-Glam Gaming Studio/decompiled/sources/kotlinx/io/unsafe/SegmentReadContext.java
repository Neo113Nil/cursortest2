package kotlinx.io.unsafe;

import kotlinx.io.Segment;

/* compiled from: UnsafeBufferOperations.kt */
/* loaded from: classes4.dex */
public interface SegmentReadContext {
    byte getUnchecked(Segment segment, int i);
}
