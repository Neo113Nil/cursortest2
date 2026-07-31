package com.composables.core.androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\t*\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u00020\t*\u00020\n¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/composables/core/androidx/compose/foundation/gestures/TouchSlopDetector;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;)V", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "mainAxis", "", "Landroidx/compose/ui/geometry/Offset;", "mainAxis-k-4lQ0M", "(J)F", "crossAxis", "crossAxis-k-4lQ0M", "totalPositionChange", "J", "addPointerInputChange", "dragEvent", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "touchSlop", "addPointerInputChange-GcwITfU", "reset", "", "calculatePostSlopOffset", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TouchSlopDetector {
    private final Orientation orientation;
    private long totalPositionChange;

    /* JADX WARN: Multi-variable type inference failed */
    public TouchSlopDetector() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public TouchSlopDetector(Orientation orientation) {
        this.orientation = orientation;
        this.totalPositionChange = Offset.INSTANCE.m5429getZeroF1C5BW0();
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orientation);
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m9485mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m9484crossAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j & 4294967295L : j >> 32));
    }

    /* renamed from: addPointerInputChange-GcwITfU, reason: not valid java name */
    public final Offset m9483addPointerInputChangeGcwITfU(PointerInputChange dragEvent, float touchSlop) {
        float abs;
        Intrinsics.checkNotNullParameter(dragEvent, "dragEvent");
        long m5418plusMKHz9U = Offset.m5418plusMKHz9U(this.totalPositionChange, Offset.m5417minusMKHz9U(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = m5418plusMKHz9U;
        if (this.orientation == null) {
            abs = Offset.m5411getDistanceimpl(m5418plusMKHz9U);
        } else {
            abs = Math.abs(m9485mainAxisk4lQ0M(m5418plusMKHz9U));
        }
        if (abs >= touchSlop) {
            return Offset.m5402boximpl(m9482calculatePostSlopOffsettuRUvjQ(touchSlop));
        }
        return null;
    }

    public final void reset() {
        this.totalPositionChange = Offset.INSTANCE.m5429getZeroF1C5BW0();
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m9482calculatePostSlopOffsettuRUvjQ(float touchSlop) {
        if (this.orientation == null) {
            long j = this.totalPositionChange;
            return Offset.m5417minusMKHz9U(this.totalPositionChange, Offset.m5420timestuRUvjQ(Offset.m5408divtuRUvjQ(j, Offset.m5411getDistanceimpl(j)), touchSlop));
        }
        float m9485mainAxisk4lQ0M = m9485mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m9485mainAxisk4lQ0M(this.totalPositionChange)) * touchSlop);
        float m9484crossAxisk4lQ0M = m9484crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m5405constructorimpl((Float.floatToRawIntBits(m9485mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m9484crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m5405constructorimpl((Float.floatToRawIntBits(m9484crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m9485mainAxisk4lQ0M) & 4294967295L));
    }
}
