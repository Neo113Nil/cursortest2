package com.composeunstyled;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR+\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/composeunstyled/SliderState;", "", "initialValue", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "<init>", "(FLkotlin/ranges/ClosedFloatingPointRange;I)V", "getValueRange$core_release", "()Lkotlin/ranges/ClosedFloatingPointRange;", "getSteps$core_release", "()I", "<set-?>", "innerValue", "getInnerValue", "()F", "setInnerValue", "(F)V", "innerValue$delegate", "Landroidx/compose/runtime/MutableState;", "value", "getValue", "setValue", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SliderState {
    public static final int $stable = 0;

    /* renamed from: innerValue$delegate, reason: from kotlin metadata */
    private final MutableState innerValue;
    private final int steps;
    private final ClosedFloatingPointRange<Float> valueRange;

    public SliderState(float f, ClosedFloatingPointRange<Float> valueRange, int i) {
        Intrinsics.checkNotNullParameter(valueRange, "valueRange");
        this.valueRange = valueRange;
        this.steps = i;
        if (i >= 0) {
            this.innerValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
            return;
        }
        throw new IllegalArgumentException("steps must be >= 0".toString());
    }

    public final ClosedFloatingPointRange<Float> getValueRange$core_release() {
        return this.valueRange;
    }

    /* renamed from: getSteps$core_release, reason: from getter */
    public final int getSteps() {
        return this.steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final float getInnerValue() {
        return ((Number) this.innerValue.getValue()).floatValue();
    }

    private final void setInnerValue(float f) {
        this.innerValue.setValue(Float.valueOf(f));
    }

    public final float getValue() {
        return getInnerValue();
    }

    public final void setValue(float f) {
        float floatValue;
        float floatValue2 = this.steps > 0 ? (this.valueRange.getEndInclusive().floatValue() - this.valueRange.getStart().floatValue()) / this.steps : 0.0f;
        if (this.steps > 0) {
            floatValue = ((Number) RangesKt.coerceIn(Float.valueOf((MathKt.roundToInt((f - this.valueRange.getStart().floatValue()) / floatValue2) * floatValue2) + this.valueRange.getStart().floatValue()), this.valueRange)).floatValue();
        } else {
            floatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f), this.valueRange)).floatValue();
        }
        setInnerValue(floatValue);
    }
}
