package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ElevationOverlay.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "<init>", "()V", "apply", "Landroidx/compose/ui/graphics/Color;", "color", "elevation", "Landroidx/compose/ui/unit/Dp;", "apply-7g2Lkgo", "(JFLandroidx/compose/runtime/Composer;I)J", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DefaultElevationOverlay implements ElevationOverlay {
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo1984apply7g2Lkgo(long j, float f, Composer composer, int i) {
        long m2017calculateForegroundColorCLU3JFs;
        composer.startReplaceGroup(-1687113661);
        ComposerKt.sourceInformation(composer, "C(apply)N(color:c#ui.graphics.Color,elevation:c#ui.unit.Dp)68@2746L6:ElevationOverlay.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (Dp.m8400compareTo0680j_4(f, Dp.m8401constructorimpl(0)) > 0 && !colors.isLight()) {
            composer.startReplaceGroup(-1095579370);
            ComposerKt.sourceInformation(composer, "70@2845L42");
            m2017calculateForegroundColorCLU3JFs = ElevationOverlayKt.m2017calculateForegroundColorCLU3JFs(j, f, composer, i & WebSocketProtocol.PAYLOAD_SHORT);
            j = ColorKt.m5702compositeOverOWjLjI(m2017calculateForegroundColorCLU3JFs, j);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1095440862);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j;
    }
}
