package androidx.compose.material;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: ListItem.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class ListItemKt$OffsetToBaselineOrCenter$1$1 implements MeasurePolicy {
    final /* synthetic */ float $offset;

    ListItemKt$OffsetToBaselineOrCenter$1$1(float f) {
        this.$offset = f;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int max;
        final int m8530getYimpl;
        final Placeable mo7075measureBRTryo0 = list.get(0).mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
        int i = mo7075measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
        if (i != Integer.MIN_VALUE) {
            m8530getYimpl = measureScope.mo418roundToPx0680j_4(this.$offset) - i;
            max = Math.max(Constraints.m8355getMinHeightimpl(j), mo7075measureBRTryo0.getHeight() + m8530getYimpl);
        } else {
            max = Math.max(Constraints.m8355getMinHeightimpl(j), mo7075measureBRTryo0.getHeight());
            m8530getYimpl = IntOffset.m8530getYimpl(Alignment.INSTANCE.getCenter().mo5136alignKFBX0sM(IntSize.INSTANCE.m8577getZeroYbymL2g(), IntSize.m8567constructorimpl((0 << 32) | ((max - mo7075measureBRTryo0.getHeight()) & 4294967295L)), measureScope.getLayoutDirection()));
        }
        return MeasureScope.layout$default(measureScope, mo7075measureBRTryo0.getWidth(), max, null, new Function1() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit measure_3p2s80s$lambda$0;
                measure_3p2s80s$lambda$0 = ListItemKt$OffsetToBaselineOrCenter$1$1.measure_3p2s80s$lambda$0(Placeable.this, m8530getYimpl, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$0(Placeable placeable, int i, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}
