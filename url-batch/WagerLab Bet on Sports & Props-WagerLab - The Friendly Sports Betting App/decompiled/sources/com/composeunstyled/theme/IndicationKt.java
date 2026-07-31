package com.composeunstyled.theme;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"rememberColoredIndication", "Landroidx/compose/foundation/IndicationNodeFactory;", "hoveredColor", "Landroidx/compose/ui/graphics/Color;", "pressedColor", "focusedColor", "rememberColoredIndication-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/IndicationNodeFactory;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IndicationKt {
    /* renamed from: rememberColoredIndication-RGew2ao, reason: not valid java name */
    public static final IndicationNodeFactory m9564rememberColoredIndicationRGew2ao(long j, long j2, long j3, Composer composer, int i, int i2) {
        composer.startReplaceGroup(55160654);
        if ((i2 & 1) != 0) {
            j = Color.INSTANCE.m5693getUnspecified0d7_KjU();
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            j2 = Color.INSTANCE.m5693getUnspecified0d7_KjU();
        }
        long j5 = j2;
        long m5693getUnspecified0d7_KjU = (i2 & 4) != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(55160654, i, -1, "com.composeunstyled.theme.rememberColoredIndication (Indication.kt:22)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            ColoredIndication coloredIndication = new ColoredIndication(j4, j5, m5693getUnspecified0d7_KjU, null);
            composer.updateRememberedValue(coloredIndication);
            rememberedValue = coloredIndication;
        }
        ColoredIndication coloredIndication2 = (ColoredIndication) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return coloredIndication2;
    }
}
