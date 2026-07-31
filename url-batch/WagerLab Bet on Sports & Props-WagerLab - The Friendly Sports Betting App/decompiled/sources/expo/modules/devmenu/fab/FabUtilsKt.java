package expo.modules.devmenu.fab;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffset;
import expo.modules.devmenu.fab.ExpoVelocityTracker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FabUtils.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u000b*\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u0002H\u0016H\u0001¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"calculateTargetPosition", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "velocity", "Lexpo/modules/devmenu/fab/ExpoVelocityTracker$PointF;", "bounds", "totalFabWidth", "", "calculateTargetPosition-IEwrmTk", "(JLexpo/modules/devmenu/fab/ExpoVelocityTracker$PointF;JF)J", "toIntOffset", "Landroidx/compose/ui/unit/IntOffset;", "toIntOffset-k-4lQ0M", "(J)J", "coerceIn", "minX", "maxX", "minY", "maxY", "coerceIn-ULxng0E", "(JFFFF)J", "rememberPrevious", "T", "current", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "emitRelease", "", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "pressPosition", "emitRelease-d-4ec7I", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-dev-menu_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FabUtilsKt {
    /* renamed from: calculateTargetPosition-IEwrmTk, reason: not valid java name */
    public static final long m10883calculateTargetPositionIEwrmTk(long j, ExpoVelocityTracker.PointF velocity, long j2, float f) {
        Intrinsics.checkNotNullParameter(velocity, "velocity");
        float x = velocity.getX() / 10.0f;
        float y = velocity.getY() / 10.0f;
        float f2 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + (f / f2) + x;
        int i = (int) (j2 >> 32);
        float intBitsToFloat2 = intBitsToFloat < Float.intBitsToFloat(i) / f2 ? 0.0f : Float.intBitsToFloat(i);
        return m10885coerceInULxng0E$default(Offset.m5405constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + y) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32)), 0.0f, Float.intBitsToFloat(i), 0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)), 5, null);
    }

    /* renamed from: coerceIn-ULxng0E$default, reason: not valid java name */
    public static /* synthetic */ long m10885coerceInULxng0E$default(long j, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        return m10884coerceInULxng0E(j, f, f2, f3, f4);
    }

    /* renamed from: emitRelease-d-4ec7I, reason: not valid java name */
    public static final Object m10886emitReleased4ec7I(MutableInteractionSource mutableInteractionSource, long j, Continuation<? super Unit> continuation) {
        Object emit = mutableInteractionSource.emit(new PressInteraction.Release(new PressInteraction.Press(j, null)), continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    /* renamed from: toIntOffset-k-4lQ0M, reason: not valid java name */
    public static final long m10887toIntOffsetk4lQ0M(long j) {
        return IntOffset.m8523constructorimpl((MathKt.roundToInt(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (MathKt.roundToInt(Float.intBitsToFloat((int) (j >> 32))) << 32));
    }

    /* renamed from: coerceIn-ULxng0E, reason: not valid java name */
    public static final long m10884coerceInULxng0E(long j, float f, float f2, float f3, float f4) {
        return Offset.m5406copydBAh8RU(j, RangesKt.coerceIn(Float.intBitsToFloat((int) (j >> 32)), f, f2), RangesKt.coerceIn(Float.intBitsToFloat((int) (4294967295L & j)), f3, f4));
    }

    public static final <T> T rememberPrevious(T t, Composer composer, int i) {
        composer.startReplaceGroup(1573431450);
        ComposerKt.sourceInformation(composer, "C(rememberPrevious)54@1766L37,56@1831L37,56@1807L61:FabUtils.kt#c54gd2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1573431450, i, -1, "expo.modules.devmenu.fab.rememberPrevious (FabUtils.kt:53)");
        }
        composer.startReplaceGroup(1849434622);
        ComposerKt.sourceInformation(composer, "CC(remember):FabUtils.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        ComposerKt.sourceInformation(composer, "CC(remember):FabUtils.kt#9igjgp");
        boolean z = (((i & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i & 6) == 4;
        FabUtilsKt$rememberPrevious$1$1 rememberedValue2 = composer.rememberedValue();
        if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new FabUtilsKt$rememberPrevious$1$1(mutableState, t, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(t, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, i & 14);
        T t2 = (T) mutableState.getValue();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return t2;
    }
}
