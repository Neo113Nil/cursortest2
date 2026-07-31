package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u00020\u000b*\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0005¢\u0006\u0004\b\u000f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "initialPositionChange", "Landroidx/compose/ui/geometry/Offset;", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "mainAxis", "", "mainAxis-k-4lQ0M", "(J)F", "crossAxis", "crossAxis-k-4lQ0M", "totalPositionChange", "J", "addPointerInputChange", "dragEvent", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "touchSlop", "addPointerInputChange-dBAh8RU", "(Landroidx/compose/ui/input/pointer/PointerInputChange;F)J", "reset", "", "calculatePostSlopOffset", "calculatePostSlopOffset-tuRUvjQ", "(F)J", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TouchSlopDetector {
    public static final int $stable = 8;
    private final Orientation orientation;
    private long totalPositionChange;

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, j);
    }

    private TouchSlopDetector(Orientation orientation, long j) {
        this.orientation = orientation;
        this.totalPositionChange = j;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public /* synthetic */ TouchSlopDetector(Orientation orientation, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : orientation, (i & 2) != 0 ? Offset.INSTANCE.m5429getZeroF1C5BW0() : j, null);
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    public final float m606mainAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* renamed from: crossAxis-k-4lQ0M, reason: not valid java name */
    public final float m605crossAxisk4lQ0M(long j) {
        return Float.intBitsToFloat((int) (this.orientation == Orientation.Horizontal ? j & 4294967295L : j >> 32));
    }

    /* renamed from: addPointerInputChange-dBAh8RU, reason: not valid java name */
    public final long m604addPointerInputChangedBAh8RU(PointerInputChange dragEvent, float touchSlop) {
        float abs;
        long m5418plusMKHz9U = Offset.m5418plusMKHz9U(this.totalPositionChange, Offset.m5417minusMKHz9U(dragEvent.getPosition(), dragEvent.getPreviousPosition()));
        this.totalPositionChange = m5418plusMKHz9U;
        if (this.orientation == null) {
            abs = Offset.m5411getDistanceimpl(m5418plusMKHz9U);
        } else {
            abs = Math.abs(m606mainAxisk4lQ0M(m5418plusMKHz9U));
        }
        if (abs >= touchSlop) {
            return m603calculatePostSlopOffsettuRUvjQ(touchSlop);
        }
        return Offset.INSTANCE.m5428getUnspecifiedF1C5BW0();
    }

    public final void reset() {
        this.totalPositionChange = Offset.INSTANCE.m5429getZeroF1C5BW0();
    }

    /* renamed from: calculatePostSlopOffset-tuRUvjQ, reason: not valid java name */
    private final long m603calculatePostSlopOffsettuRUvjQ(float touchSlop) {
        if (this.orientation == null) {
            long j = this.totalPositionChange;
            return Offset.m5417minusMKHz9U(this.totalPositionChange, Offset.m5420timestuRUvjQ(Offset.m5408divtuRUvjQ(j, Offset.m5411getDistanceimpl(j)), touchSlop));
        }
        float m606mainAxisk4lQ0M = m606mainAxisk4lQ0M(this.totalPositionChange) - (Math.signum(m606mainAxisk4lQ0M(this.totalPositionChange)) * touchSlop);
        float m605crossAxisk4lQ0M = m605crossAxisk4lQ0M(this.totalPositionChange);
        if (this.orientation == Orientation.Horizontal) {
            return Offset.m5405constructorimpl((Float.floatToRawIntBits(m606mainAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m605crossAxisk4lQ0M) & 4294967295L));
        }
        return Offset.m5405constructorimpl((Float.floatToRawIntBits(m605crossAxisk4lQ0M) << 32) | (Float.floatToRawIntBits(m606mainAxisk4lQ0M) & 4294967295L));
    }
}
