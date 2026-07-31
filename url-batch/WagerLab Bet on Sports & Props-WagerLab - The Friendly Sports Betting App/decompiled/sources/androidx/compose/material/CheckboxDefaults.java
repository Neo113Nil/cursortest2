package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material/CheckboxColors;", "checkedColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m1931colorszjMxDiM(long j, long j2, long j3, long j4, long j5, Composer composer, int i, int i2) {
        long j6;
        long j7;
        ComposerKt.sourceInformationMarkerStart(composer, 469524104, "C(colors)N(checkedColor:c#ui.graphics.Color,uncheckedColor:c#ui.graphics.Color,checkmarkColor:c#ui.graphics.Color,disabledColor:c#ui.graphics.Color,disabledIndeterminateColor:c#ui.graphics.Color)220@9357L6,221@9421L6,222@9504L6,223@9565L6,223@9608L8,224@9702L8,226@9752L922:Checkbox.kt#jmzs0o");
        long m1955getSecondary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1955getSecondary0d7_KjU() : j;
        long m5656copywmQWz5c$default = (i2 & 2) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long m1957getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1957getSurface0d7_KjU() : j3;
        long m5656copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m5656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1952getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if ((i2 & 16) != 0) {
            long j8 = m1955getSecondary0d7_KjU;
            j7 = Color.m5656copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j6 = j8;
        } else {
            j6 = m1955getSecondary0d7_KjU;
            j7 = j5;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:225)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 241113730, "CC(remember):Checkbox.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(j6)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(m5656copywmQWz5c$default)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(m1957getSurface0d7_KjU)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(m5656copywmQWz5c$default2)) || (i & 3072) == 2048) | ((((57344 & i) ^ 24576) > 16384 && composer.changed(j7)) || (i & 24576) == 16384);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            long m5656copywmQWz5c$default3 = Color.m5656copywmQWz5c$default(m1957getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
            long j9 = j6;
            long m5656copywmQWz5c$default4 = Color.m5656copywmQWz5c$default(j9, 0.0f, 0.0f, 0.0f, 0.0f, 14, null);
            long j10 = m5656copywmQWz5c$default2;
            DefaultCheckboxColors defaultCheckboxColors = new DefaultCheckboxColors(m1957getSurface0d7_KjU, m5656copywmQWz5c$default3, j9, m5656copywmQWz5c$default4, j10, Color.m5656copywmQWz5c$default(j10, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j7, j9, m5656copywmQWz5c$default, j10, j7, null);
            composer.updateRememberedValue(defaultCheckboxColors);
            rememberedValue = defaultCheckboxColors;
        }
        DefaultCheckboxColors defaultCheckboxColors2 = (DefaultCheckboxColors) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultCheckboxColors2;
    }
}
