package com.composables.core;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: FocusRingIndication.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"rememberFocusRingIndication", "Landroidx/compose/foundation/Indication;", "ringColor", "Landroidx/compose/ui/graphics/Color;", "ringWidth", "Landroidx/compose/ui/unit/Dp;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "cornerRadius", "rememberFocusRingIndication-_dVmGfk", "(JFLandroidx/compose/foundation/layout/PaddingValues;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/Indication;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusRingIndicationKt {
    /* renamed from: rememberFocusRingIndication-_dVmGfk, reason: not valid java name */
    public static final Indication m9376rememberFocusRingIndication_dVmGfk(long j, float f, PaddingValues paddingValues, float f2, Composer composer, int i, int i2) {
        composer.startReplaceGroup(-1394250415);
        if ((i2 & 1) != 0) {
            j = Color.INSTANCE.m5693getUnspecified0d7_KjU();
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            f = Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM();
        }
        float f3 = f;
        if ((i2 & 4) != 0) {
            paddingValues = PaddingKt.m832PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
        }
        PaddingValues paddingValues2 = paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1394250415, i, -1, "com.composables.core.rememberFocusRingIndication (FocusRingIndication.kt:30)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            FocusRingIndicationNodeFactory focusRingIndicationNodeFactory = new FocusRingIndicationNodeFactory(j2, f3, paddingValues2, f2, null);
            composer.updateRememberedValue(focusRingIndicationNodeFactory);
            rememberedValue = focusRingIndicationNodeFactory;
        }
        FocusRingIndicationNodeFactory focusRingIndicationNodeFactory2 = (FocusRingIndicationNodeFactory) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return focusRingIndicationNodeFactory2;
    }
}
