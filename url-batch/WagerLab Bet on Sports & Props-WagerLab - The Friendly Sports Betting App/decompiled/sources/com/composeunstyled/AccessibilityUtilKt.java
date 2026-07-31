package com.composeunstyled;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccessibilityUtil.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0016\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"HorizontalSemanticsBoundsPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalSemanticsBoundsPadding", "()F", "F", "VerticalSemanticsBoundsPadding", "getVerticalSemanticsBoundsPadding", "IncreaseHorizontalSemanticsBounds", "Landroidx/compose/ui/Modifier;", "getIncreaseHorizontalSemanticsBounds", "()Landroidx/compose/ui/Modifier;", "IncreaseVerticalSemanticsBounds", "getIncreaseVerticalSemanticsBounds", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccessibilityUtilKt {
    private static final float HorizontalSemanticsBoundsPadding;
    private static final Modifier IncreaseHorizontalSemanticsBounds;
    private static final Modifier IncreaseVerticalSemanticsBounds;
    private static final float VerticalSemanticsBoundsPadding;

    public static final float getHorizontalSemanticsBoundsPadding() {
        return HorizontalSemanticsBoundsPadding;
    }

    public static final float getVerticalSemanticsBoundsPadding() {
        return VerticalSemanticsBoundsPadding;
    }

    public static final Modifier getIncreaseHorizontalSemanticsBounds() {
        return IncreaseHorizontalSemanticsBounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult IncreaseHorizontalSemanticsBounds$lambda$1(MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final int i = layout.mo418roundToPx0680j_4(HorizontalSemanticsBoundsPadding);
        long value = constraints.getValue();
        int i2 = i * 2;
        final Placeable mo7075measureBRTryo0 = measurable.mo7075measureBRTryo0(ConstraintsKt.m8373offsetNN6EwU(value, i2, 0));
        return MeasureScope.layout$default(layout, mo7075measureBRTryo0.getWidth() - i2, mo7075measureBRTryo0.getHeight(), null, new Function1() { // from class: com.composeunstyled.AccessibilityUtilKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0;
                IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0 = AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0(Placeable.this, i, (Placeable.PlacementScope) obj);
                return IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0(Placeable placeable, int i, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, -i, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IncreaseHorizontalSemanticsBounds$lambda$2(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    public static final Modifier getIncreaseVerticalSemanticsBounds() {
        return IncreaseVerticalSemanticsBounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult IncreaseVerticalSemanticsBounds$lambda$4(MeasureScope layout, Measurable measurable, Constraints constraints) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        final int i = layout.mo418roundToPx0680j_4(VerticalSemanticsBoundsPadding);
        long value = constraints.getValue();
        int i2 = i * 2;
        final Placeable mo7075measureBRTryo0 = measurable.mo7075measureBRTryo0(ConstraintsKt.m8373offsetNN6EwU(value, 0, i2));
        return MeasureScope.layout$default(layout, mo7075measureBRTryo0.getWidth(), mo7075measureBRTryo0.getHeight() - i2, null, new Function1() { // from class: com.composeunstyled.AccessibilityUtilKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit IncreaseVerticalSemanticsBounds$lambda$4$lambda$3;
                IncreaseVerticalSemanticsBounds$lambda$4$lambda$3 = AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4$lambda$3(Placeable.this, i, (Placeable.PlacementScope) obj);
                return IncreaseVerticalSemanticsBounds$lambda$4$lambda$3;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IncreaseVerticalSemanticsBounds$lambda$4$lambda$3(Placeable placeable, int i, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, 0, -i, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IncreaseVerticalSemanticsBounds$lambda$5(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        return Unit.INSTANCE;
    }

    static {
        float f = 10;
        float m8401constructorimpl = Dp.m8401constructorimpl(f);
        HorizontalSemanticsBoundsPadding = m8401constructorimpl;
        float m8401constructorimpl2 = Dp.m8401constructorimpl(f);
        VerticalSemanticsBoundsPadding = m8401constructorimpl2;
        IncreaseHorizontalSemanticsBounds = PaddingKt.m839paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3() { // from class: com.composeunstyled.AccessibilityUtilKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult IncreaseHorizontalSemanticsBounds$lambda$1;
                IncreaseHorizontalSemanticsBounds$lambda$1 = AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return IncreaseHorizontalSemanticsBounds$lambda$1;
            }
        }), true, new Function1() { // from class: com.composeunstyled.AccessibilityUtilKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit IncreaseHorizontalSemanticsBounds$lambda$2;
                IncreaseHorizontalSemanticsBounds$lambda$2 = AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$2((SemanticsPropertyReceiver) obj);
                return IncreaseHorizontalSemanticsBounds$lambda$2;
            }
        }), m8401constructorimpl, 0.0f, 2, null);
        IncreaseVerticalSemanticsBounds = PaddingKt.m839paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3() { // from class: com.composeunstyled.AccessibilityUtilKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                MeasureResult IncreaseVerticalSemanticsBounds$lambda$4;
                IncreaseVerticalSemanticsBounds$lambda$4 = AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return IncreaseVerticalSemanticsBounds$lambda$4;
            }
        }), true, new Function1() { // from class: com.composeunstyled.AccessibilityUtilKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit IncreaseVerticalSemanticsBounds$lambda$5;
                IncreaseVerticalSemanticsBounds$lambda$5 = AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$5((SemanticsPropertyReceiver) obj);
                return IncreaseVerticalSemanticsBounds$lambda$5;
            }
        }), 0.0f, m8401constructorimpl2, 1, null);
    }
}
