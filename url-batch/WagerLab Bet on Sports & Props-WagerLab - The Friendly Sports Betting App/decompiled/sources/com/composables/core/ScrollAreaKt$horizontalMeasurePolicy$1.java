package com.composables.core;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: ScrollArea.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ScrollAreaKt$horizontalMeasurePolicy$1 implements MeasurePolicy {
    final /* synthetic */ int $scrollThickness;
    final /* synthetic */ Function1<Integer, Unit> $setContainerSize;
    final /* synthetic */ SliderAdapter $sliderAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    ScrollAreaKt$horizontalMeasurePolicy$1(Function1<? super Integer, Unit> function1, SliderAdapter sliderAdapter, int i) {
        this.$setContainerSize = function1;
        this.$sliderAdapter = sliderAdapter;
        this.$scrollThickness = i;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> measurables, long j) {
        final IntRange thumbPixelRange;
        int size;
        Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        this.$setContainerSize.invoke(Integer.valueOf(Constraints.m8354getMaxWidthimpl(j)));
        thumbPixelRange = ScrollAreaKt.getThumbPixelRange(this.$sliderAdapter);
        if (measurables.isEmpty()) {
            return MeasureScope.layout$default(MeasurePolicy, Constraints.m8354getMaxWidthimpl(j), Constraints.m8353getMaxHeightimpl(j), null, new Function1() { // from class: com.composables.core.ScrollAreaKt$horizontalMeasurePolicy$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit measure_3p2s80s$lambda$0;
                    measure_3p2s80s$lambda$0 = ScrollAreaKt$horizontalMeasurePolicy$1.measure_3p2s80s$lambda$0((Placeable.PlacementScope) obj);
                    return measure_3p2s80s$lambda$0;
                }
            }, 4, null);
        }
        Measurable measurable = (Measurable) CollectionsKt.first((List) measurables);
        Constraints.Companion companion = Constraints.INSTANCE;
        size = ScrollAreaKt.getSize(thumbPixelRange);
        final Placeable mo7075measureBRTryo0 = measurable.mo7075measureBRTryo0(companion.m8364fixedJhjzzOo(size, ConstraintsKt.m8370constrainHeightK40F9xA(j, this.$scrollThickness)));
        return MeasureScope.layout$default(MeasurePolicy, Constraints.m8354getMaxWidthimpl(j), mo7075measureBRTryo0.getHeight(), null, new Function1() { // from class: com.composables.core.ScrollAreaKt$horizontalMeasurePolicy$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$1;
                measure_3p2s80s$lambda$1 = ScrollAreaKt$horizontalMeasurePolicy$1.measure_3p2s80s$lambda$1(Placeable.this, thumbPixelRange, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$1;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$1(Placeable placeable, IntRange intRange, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, intRange.getFirst(), 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
