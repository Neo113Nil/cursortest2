package com.composeunstyled;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class SliderKt$Slider$1$1 extends FunctionReferenceImpl implements Function1<Float, Float> {
    final /* synthetic */ float $maxPx;
    final /* synthetic */ float $minPx;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$1$1(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2) {
        super(1, Intrinsics.Kotlin.class, "scaleToOffset", "Slider$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;FFF)F", 0);
        this.$valueRange = closedFloatingPointRange;
        this.$minPx = f;
        this.$maxPx = f2;
    }

    public final Float invoke(float f) {
        float Slider$scaleToOffset;
        Slider$scaleToOffset = SliderKt.Slider$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f);
        return Float.valueOf(Slider$scaleToOffset);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}
