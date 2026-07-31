package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.util.ListUtilsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Badge.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BadgeKt$BadgedBox$2$1 implements MeasurePolicy {
    public static final BadgeKt$BadgedBox$2$1 INSTANCE = new BadgeKt$BadgedBox$2$1();

    BadgeKt$BadgedBox$2$1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$2(Placeable placeable, MeasureScope measureScope, Placeable placeable2, Placeable.PlacementScope placementScope) {
        float badgeWithContentHorizontalOffset = placeable.getWidth() > measureScope.mo418roundToPx0680j_4(BadgeKt.getBadgeRadius()) * 2 ? BadgeKt.getBadgeWithContentHorizontalOffset() : BadgeKt.getBadgeHorizontalOffset();
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, placeable2.getWidth() + measureScope.mo418roundToPx0680j_4(badgeWithContentHorizontalOffset), (-placeable.getHeight()) / 2, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), MetricTracker.Object.BADGE)) {
                final Placeable mo7075measureBRTryo0 = measurable.mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Measurable measurable2 = list.get(i2);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                        final Placeable mo7075measureBRTryo02 = measurable2.mo7075measureBRTryo0(j);
                        return measureScope.layout(mo7075measureBRTryo02.getWidth(), mo7075measureBRTryo02.getHeight(), MapsKt.mapOf(TuplesKt.to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mo7075measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mo7075measureBRTryo02.get(AlignmentLineKt.getLastBaseline())))), new Function1() { // from class: androidx.compose.material.BadgeKt$BadgedBox$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit measure_3p2s80s$lambda$2;
                                measure_3p2s80s$lambda$2 = BadgeKt$BadgedBox$2$1.measure_3p2s80s$lambda$2(Placeable.this, measureScope, mo7075measureBRTryo02, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$2;
                            }
                        });
                    }
                }
                ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new KotlinNothingValueException();
            }
        }
        ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }
}
