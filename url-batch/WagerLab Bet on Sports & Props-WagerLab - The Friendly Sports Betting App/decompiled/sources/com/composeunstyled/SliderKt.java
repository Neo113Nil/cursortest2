package com.composeunstyled;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aY\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016\u001au\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u001f\u001a\u00020 2\u0011\u0010!\u001a\r\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0002\b#2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\n0\"¢\u0006\u0002\b#H\u0007¢\u0006\u0002\u0010%\u001a$\u0010&\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a\u001c\u0010(\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a \u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0003H\u0002\u001a0\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\u0003H\u0002\u001a-\u00103\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109¨\u0006:²\u0006\n\u0010;\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010<\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010=\u001a\u00020\u0003X\u008a\u008e\u0002²\u0006\n\u0010>\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"rememberSliderState", "Lcom/composeunstyled/SliderState;", "initialValue", "", "valueRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "steps", "", "(FLkotlin/ranges/ClosedFloatingPointRange;ILandroidx/compose/runtime/Composer;II)Lcom/composeunstyled/SliderState;", "CorrectValueSideEffect", "", "scaleToOffset", "Lkotlin/Function1;", "correctValue", "trackRange", "value", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/ranges/ClosedFloatingPointRange;FLandroidx/compose/runtime/Composer;I)V", "waitRelease", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pass", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Slider", "state", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "track", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "thumb", "(Lcom/composeunstyled/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "sliderSemantics", "coerced", "sliderKeyboardInteractions", "calcFraction", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "pos", "scale", "a1", "b1", "x1", "a2", "b2", "Thumb", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "Thumb-FNF3uiM", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "core_release", "thumbWidthPx", "rawOffset", "pressOffset", "sliderWidth"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SliderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CorrectValueSideEffect$lambda$3(Function1 function1, Function1 function12, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, float f, int i, Composer composer, int i2) {
        CorrectValueSideEffect(function1, function12, closedFloatingPointRange, closedFloatingPointRange2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$34(SliderState sliderState, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ClosedFloatingPointRange closedFloatingPointRange, Orientation orientation, Function2 function2, Function2 function22, int i, int i2, Composer composer, int i3) {
        Slider(sliderState, modifier, z, mutableInteractionSource, closedFloatingPointRange, orientation, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Thumb_FNF3uiM$lambda$37(Modifier modifier, Shape shape, long j, int i, int i2, Composer composer, int i3) {
        m9533ThumbFNF3uiM(modifier, shape, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final float calcFraction(float f, float f2, float f3) {
        float f4 = f2 - f;
        float f5 = f4 == 0.0f ? 0.0f : (f3 - f) / f4;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        if (f6 > 1.0f) {
            return 1.0f;
        }
        return f6;
    }

    public static final SliderState rememberSliderState(float f, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i, Composer composer, int i2, int i3) {
        composer.startReplaceGroup(-939170361);
        if ((i3 & 1) != 0) {
            f = 0.0f;
        }
        if ((i3 & 2) != 0) {
            closedFloatingPointRange = RangesKt.rangeTo(0.0f, 1.0f);
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-939170361, i2, -1, "com.composeunstyled.rememberSliderState (Slider.kt:84)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new SliderState(f, closedFloatingPointRange, i);
            composer.updateRememberedValue(rememberedValue);
        }
        SliderState sliderState = (SliderState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return sliderState;
    }

    private static final void CorrectValueSideEffect(final Function1<? super Float, Float> function1, final Function1<? super Float, Unit> function12, final ClosedFloatingPointRange<Float> closedFloatingPointRange, final ClosedFloatingPointRange<Float> closedFloatingPointRange2, final float f, Composer composer, final int i) {
        int i2;
        float f2;
        Composer startRestartGroup = composer.startRestartGroup(1623928529);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(closedFloatingPointRange2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f2 = f;
            i2 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623928529, i2, -1, "com.composeunstyled.CorrectValueSideEffect (Slider.kt:97)");
            }
            startRestartGroup.startReplaceGroup(-1224400529);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                final float f3 = f2;
                Function0 function0 = new Function0() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit CorrectValueSideEffect$lambda$2$lambda$1;
                        CorrectValueSideEffect$lambda$2$lambda$1 = SliderKt.CorrectValueSideEffect$lambda$2$lambda$1(ClosedFloatingPointRange.this, function1, f3, closedFloatingPointRange2, function12);
                        return CorrectValueSideEffect$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(function0);
                rememberedValue = function0;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CorrectValueSideEffect$lambda$3;
                    CorrectValueSideEffect$lambda$3 = SliderKt.CorrectValueSideEffect$lambda$3(Function1.this, function12, closedFloatingPointRange, closedFloatingPointRange2, f, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CorrectValueSideEffect$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit CorrectValueSideEffect$lambda$2$lambda$1(ClosedFloatingPointRange closedFloatingPointRange, Function1 function1, float f, ClosedFloatingPointRange closedFloatingPointRange2, Function1 function12) {
        float floatValue = (((Number) closedFloatingPointRange.getEndInclusive()).floatValue() - ((Number) closedFloatingPointRange.getStart()).floatValue()) / 1000;
        float floatValue2 = ((Number) function1.invoke(Float.valueOf(f))).floatValue();
        if (Math.abs(floatValue2 - f) > floatValue && closedFloatingPointRange2.contains(Float.valueOf(f))) {
            function12.invoke(Float.valueOf(floatValue2));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:10:0x004d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object waitRelease(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation<? super PointerInputChange> continuation) {
        SliderKt$waitRelease$1 sliderKt$waitRelease$1;
        int i;
        int size;
        int i2;
        if (continuation instanceof SliderKt$waitRelease$1) {
            sliderKt$waitRelease$1 = (SliderKt$waitRelease$1) continuation;
            if ((sliderKt$waitRelease$1.label & Integer.MIN_VALUE) != 0) {
                sliderKt$waitRelease$1.label -= Integer.MIN_VALUE;
                Object obj = sliderKt$waitRelease$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sliderKt$waitRelease$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    sliderKt$waitRelease$1.L$0 = awaitPointerEventScope;
                    sliderKt$waitRelease$1.L$1 = pointerEventPass;
                    sliderKt$waitRelease$1.label = 1;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, sliderKt$waitRelease$1);
                    if (obj == coroutine_suspended) {
                    }
                    PointerEvent pointerEvent = (PointerEvent) obj;
                    List<PointerInputChange> changes = pointerEvent.getChanges();
                    size = changes.size();
                    i2 = 0;
                    while (i2 < size) {
                    }
                    return pointerEvent.getChanges().get(0);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                PointerEventPass pointerEventPass2 = (PointerEventPass) sliderKt$waitRelease$1.L$1;
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) sliderKt$waitRelease$1.L$0;
                ResultKt.throwOnFailure(obj);
                pointerEventPass = pointerEventPass2;
                awaitPointerEventScope = awaitPointerEventScope2;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                size = changes2.size();
                i2 = 0;
                while (i2 < size) {
                    if (PointerEventKt.changedToUp(changes2.get(i2))) {
                        i2++;
                    } else {
                        sliderKt$waitRelease$1.L$0 = awaitPointerEventScope;
                        sliderKt$waitRelease$1.L$1 = pointerEventPass;
                        sliderKt$waitRelease$1.label = 1;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass, sliderKt$waitRelease$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        PointerEvent pointerEvent22 = (PointerEvent) obj;
                        List<PointerInputChange> changes22 = pointerEvent22.getChanges();
                        size = changes22.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    }
                }
                return pointerEvent22.getChanges().get(0);
            }
        }
        sliderKt$waitRelease$1 = new SliderKt$waitRelease$1(continuation);
        Object obj2 = sliderKt$waitRelease$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sliderKt$waitRelease$1.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object waitRelease$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitRelease(awaitPointerEventScope, pointerEventPass, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Slider(final SliderState sliderState, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, ClosedFloatingPointRange<Float> closedFloatingPointRange, Orientation orientation, final Function2<? super Composer, ? super Integer, Unit> track, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i6;
        Orientation orientation2;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        Modifier modifier3;
        Object rememberedValue;
        MutableState mutableState;
        boolean z3;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        MutableState mutableState2;
        Object rememberedValue6;
        CoroutineScope coroutineScope;
        float max;
        final float min;
        float Slider$lambda$16;
        int i7;
        boolean changed;
        Object rememberedValue7;
        final MutableState mutableState3;
        float f;
        Modifier modifier4;
        MutableState mutableState4;
        boolean z4;
        final CoroutineScope coroutineScope2;
        int i8;
        int i9;
        final float f2;
        float f3;
        boolean changed2;
        SliderKt$Slider$1$1 rememberedValue8;
        boolean z5;
        Object rememberedValue9;
        boolean changed3;
        float f4;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4;
        final boolean z6;
        DraggableState draggableState;
        FocusRequester focusRequester;
        SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$1;
        boolean changedInstance;
        PointerInputEventHandler rememberedValue10;
        SliderKt$Slider$3$1 rememberedValue11;
        Object rememberedValue12;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        Object rememberedValue13;
        boolean changed4;
        Object rememberedValue14;
        int currentCompositeKeyHash2;
        Composer m4976constructorimpl2;
        final Modifier modifier5;
        final boolean z7;
        final Orientation orientation3;
        final MutableInteractionSource mutableInteractionSource3;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange5;
        ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        int i12;
        final SliderState state = sliderState;
        final Function2<? super Composer, ? super Integer, Unit> thumb = function2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Composer startRestartGroup = composer.startRestartGroup(-1049786808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            closedFloatingPointRange2 = closedFloatingPointRange;
                            if (startRestartGroup.changed(closedFloatingPointRange2)) {
                                i12 = 16384;
                                i3 |= i12;
                            }
                        } else {
                            closedFloatingPointRange2 = closedFloatingPointRange;
                        }
                        i12 = 8192;
                        i3 |= i12;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(orientation == null ? -1 : orientation.ordinal()) ? 131072 : 65536;
                    }
                    if ((i2 & 64) != 0) {
                        i11 = (1572864 & i) == 0 ? startRestartGroup.changedInstance(track) ? 1048576 : 524288 : 1572864;
                        if ((i2 & 128) == 0) {
                            i10 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(thumb) ? 8388608 : 4194304 : 12582912;
                            if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i13 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    if (i5 != 0) {
                                        mutableInteractionSource2 = null;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                        closedFloatingPointRange2 = RangesKt.rangeTo(0.0f, 1.0f);
                                    }
                                    if (i6 != 0) {
                                        orientation2 = Orientation.Horizontal;
                                        final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                        closedFloatingPointRange3 = closedFloatingPointRange2;
                                        boolean z8 = z2;
                                        int i14 = i3;
                                        modifier3 = modifier2;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1049786808, i14, -1, "com.composeunstyled.Slider (Slider.kt:172)");
                                        }
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        mutableState = (MutableState) rememberedValue;
                                        startRestartGroup.endReplaceGroup();
                                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                        Object consume = startRestartGroup.consume(localLayoutDirection);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        z3 = consume == LayoutDirection.Rtl;
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue2 = startRestartGroup.rememberedValue();
                                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue2);
                                        }
                                        final MutableState mutableState5 = (MutableState) rememberedValue2;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue3 = startRestartGroup.rememberedValue();
                                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                                            startRestartGroup.updateRememberedValue(rememberedValue3);
                                        }
                                        final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue3;
                                        startRestartGroup.endReplaceGroup();
                                        float coerceIn = RangesKt.coerceIn(state.getValue(), closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue());
                                        float calcFraction = calcFraction(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), coerceIn);
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue4 = startRestartGroup.rememberedValue();
                                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue4 = new FocusRequester();
                                            startRestartGroup.updateRememberedValue(rememberedValue4);
                                        }
                                        FocusRequester focusRequester2 = (FocusRequester) rememberedValue4;
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1849434622);
                                        rememberedValue5 = startRestartGroup.rememberedValue();
                                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue5);
                                        }
                                        mutableState2 = (MutableState) rememberedValue5;
                                        startRestartGroup.endReplaceGroup();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                                        rememberedValue6 = startRestartGroup.rememberedValue();
                                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue6 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                            startRestartGroup.updateRememberedValue(rememberedValue6);
                                        }
                                        coroutineScope = (CoroutineScope) rememberedValue6;
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        float Slider$lambda$162 = Slider$lambda$16(mutableState2);
                                        float f5 = 2;
                                        max = Math.max(Slider$lambda$162 - (Slider$lambda$6(mutableState) / f5), 0.0f);
                                        min = Math.min(Slider$lambda$6(mutableState) / f5, max);
                                        Slider$lambda$16 = (Slider$lambda$16(mutableState2) - Slider$lambda$6(mutableState)) * calcFraction;
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        int i15 = i14 & 14;
                                        i7 = (57344 & i14) ^ 24576;
                                        changed = (i15 == 4) | startRestartGroup.changed(min) | startRestartGroup.changed(max) | ((i7 <= 16384 && startRestartGroup.changed(closedFloatingPointRange3)) || (i14 & 24576) == 16384);
                                        rememberedValue7 = startRestartGroup.rememberedValue();
                                        if (!changed || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            mutableState3 = mutableState2;
                                            f = Slider$lambda$16;
                                            modifier4 = modifier3;
                                            mutableState4 = mutableState;
                                            z4 = z3;
                                            coroutineScope2 = coroutineScope;
                                            i8 = 16384;
                                            i9 = i7;
                                            f2 = max;
                                            rememberedValue7 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit Slider$lambda$19$lambda$18;
                                                    Slider$lambda$19$lambda$18 = SliderKt.Slider$lambda$19$lambda$18(min, f2, sliderState, mutableState5, mutableFloatState, closedFloatingPointRange3, ((Float) obj).floatValue());
                                                    return Slider$lambda$19$lambda$18;
                                                }
                                            };
                                            f3 = min;
                                            state = sliderState;
                                            mutableState5 = mutableState5;
                                            startRestartGroup.updateRememberedValue(rememberedValue7);
                                        } else {
                                            state = sliderState;
                                            mutableState3 = mutableState2;
                                            f = Slider$lambda$16;
                                            modifier4 = modifier3;
                                            z4 = z3;
                                            coroutineScope2 = coroutineScope;
                                            i9 = i7;
                                            f2 = max;
                                            f3 = min;
                                            mutableState4 = mutableState;
                                            i8 = 16384;
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        DraggableState rememberDraggableState = DraggableKt.rememberDraggableState((Function1) rememberedValue7, startRestartGroup, 0);
                                        startRestartGroup.startReplaceGroup(-1746271574);
                                        changed2 = ((i9 <= i8 && startRestartGroup.changed(closedFloatingPointRange3)) || (i14 & 24576) == i8) | startRestartGroup.changed(f3) | startRestartGroup.changed(f2);
                                        rememberedValue8 = startRestartGroup.rememberedValue();
                                        if (!changed2 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue8 = new SliderKt$Slider$1$1(closedFloatingPointRange3, f3, f2);
                                            startRestartGroup.updateRememberedValue(rememberedValue8);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Function1 function1 = (Function1) ((KFunction) rememberedValue8);
                                        startRestartGroup.startReplaceGroup(5004770);
                                        z5 = i15 == 4;
                                        rememberedValue9 = startRestartGroup.rememberedValue();
                                        if (!z5 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue9 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    Unit Slider$lambda$22$lambda$21;
                                                    Slider$lambda$22$lambda$21 = SliderKt.Slider$lambda$22$lambda$21(SliderState.this, ((Float) obj).floatValue());
                                                    return Slider$lambda$22$lambda$21;
                                                }
                                            };
                                            startRestartGroup.updateRememberedValue(rememberedValue9);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Modifier modifier6 = modifier4;
                                        CorrectValueSideEffect(function1, (Function1) rememberedValue9, closedFloatingPointRange3, RangesKt.rangeTo(f3, f2), state.getValue(), startRestartGroup, (i14 >> 6) & 896);
                                        startRestartGroup = startRestartGroup;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Object[] objArr = {rememberDraggableState, mutableInteractionSource4, Float.valueOf(f2), Boolean.valueOf(z4)};
                                        startRestartGroup.startReplaceGroup(-1224400529);
                                        int i16 = i14 & 896;
                                        boolean z9 = z4;
                                        changed3 = (i16 == 256) | startRestartGroup.changed(z9) | startRestartGroup.changed(f2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(rememberDraggableState);
                                        Object rememberedValue15 = startRestartGroup.rememberedValue();
                                        if (changed3) {
                                            f4 = f2;
                                        } else {
                                            f4 = f2;
                                            if (rememberedValue15 != Composer.INSTANCE.getEmpty()) {
                                                closedFloatingPointRange4 = closedFloatingPointRange3;
                                                z6 = z8;
                                                draggableState = rememberDraggableState;
                                                sliderKt$Slider$dragOnTap$1$1 = rememberedValue15;
                                                focusRequester = focusRequester2;
                                                startRestartGroup.endReplaceGroup();
                                                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, objArr, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
                                                Object[] objArr2 = {draggableState, mutableInteractionSource4, Boolean.valueOf(z6)};
                                                startRestartGroup.startReplaceGroup(-1746271574);
                                                DraggableState draggableState2 = draggableState;
                                                changedInstance = (i16 != 256) | ((i14 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
                                                rememberedValue10 = startRestartGroup.rememberedValue();
                                                if (!changedInstance || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

                                                        /* compiled from: Slider.kt */
                                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                                        @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
                                                        /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
                                                        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                                            final /* synthetic */ CoroutineContext $currentContext;
                                                            final /* synthetic */ MutableInteractionSource $interactionSource;
                                                            final /* synthetic */ CoroutineScope $scope;
                                                            private /* synthetic */ Object L$0;
                                                            Object L$1;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$currentContext = coroutineContext;
                                                                this.$interactionSource = mutableInteractionSource;
                                                                this.$scope = coroutineScope;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                                                                anonymousClass1.L$0 = obj;
                                                                return anonymousClass1;
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                                                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                            }

                                                            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                                                                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
                                                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                                                                	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                                                                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
                                                                */
                                                            /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
                                                            /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
                                                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007f -> B:8:0x0082). Please report as a decompilation issue!!! */
                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            /*
                                                                Code decompiled incorrectly, please refer to instructions dump.
                                                            */
                                                            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                                                                /*
                                                                    r12 = this;
                                                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                                                    int r1 = r12.label
                                                                    r2 = 2
                                                                    r3 = 1
                                                                    r4 = 0
                                                                    if (r1 == 0) goto L2c
                                                                    if (r1 == r3) goto L23
                                                                    if (r1 != r2) goto L1b
                                                                    java.lang.Object r1 = r12.L$1
                                                                    androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                                                                    java.lang.Object r5 = r12.L$0
                                                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                                                                    kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                                                                    goto L82
                                                                L1b:
                                                                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                                    r13.<init>(r0)
                                                                    throw r13
                                                                L23:
                                                                    java.lang.Object r1 = r12.L$0
                                                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                                                                    kotlin.ResultKt.throwOnFailure(r13)
                                                                    r5 = r1
                                                                    goto L50
                                                                L2c:
                                                                    kotlin.ResultKt.throwOnFailure(r13)
                                                                    java.lang.Object r13 = r12.L$0
                                                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                                                                    r5 = r13
                                                                L34:
                                                                    kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                                                                    boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                                                                    if (r13 == 0) goto L9a
                                                                    r8 = r12
                                                                    kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                                                                    r12.L$0 = r5
                                                                    r12.L$1 = r4
                                                                    r12.label = r3
                                                                    r6 = 0
                                                                    r7 = 0
                                                                    r9 = 3
                                                                    r10 = 0
                                                                    java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                                                                    if (r13 != r0) goto L50
                                                                    goto L81
                                                                L50:
                                                                    androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                                                                    androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                                                    long r6 = r13.getPosition()
                                                                    r1.<init>(r6, r4)
                                                                    androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                                                    if (r13 == 0) goto L72
                                                                    kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                                                    com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                                                                    androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                                                    r13.<init>(r7, r1, r4)
                                                                    r9 = r13
                                                                    kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                                                    r10 = 3
                                                                    r11 = 0
                                                                    r7 = 0
                                                                    r8 = 0
                                                                    kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                                                L72:
                                                                    r13 = r12
                                                                    kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                                                                    r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                                                                    r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                                                                    r12.label = r2     // Catch: java.lang.Exception -> L82
                                                                    java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                                                                    if (r13 != r0) goto L82
                                                                L81:
                                                                    return r0
                                                                L82:
                                                                    androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                                                    if (r13 == 0) goto L34
                                                                    kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                                                    com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                                                                    androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                                                    r13.<init>(r7, r1, r4)
                                                                    r9 = r13
                                                                    kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                                                    r10 = 3
                                                                    r11 = 0
                                                                    r7 = 0
                                                                    r8 = 0
                                                                    kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                                                    goto L34
                                                                L9a:
                                                                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                                                    return r13
                                                                */
                                                                throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                                            }

                                                            /* compiled from: Slider.kt */
                                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                                            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                            static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                                                final /* synthetic */ PressInteraction.Press $press;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                                                                    super(2, continuation);
                                                                    this.$interactionSource = mutableInteractionSource;
                                                                    this.$press = press;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new C00691(this.$interactionSource, this.$press, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }

                                                            /* compiled from: Slider.kt */
                                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                                            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                                                            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                                                            static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                                                final /* synthetic */ PressInteraction.Press $press;
                                                                int label;

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                                                                    super(2, continuation);
                                                                    this.$interactionSource = mutableInteractionSource;
                                                                    this.$press = press;
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                    return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                }

                                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                public final Object invokeSuspend(Object obj) {
                                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                    int i = this.label;
                                                                    if (i == 0) {
                                                                        ResultKt.throwOnFailure(obj);
                                                                        this.label = 1;
                                                                        if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                                                            return coroutine_suspended;
                                                                        }
                                                                    } else {
                                                                        if (i != 1) {
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        ResultKt.throwOnFailure(obj);
                                                                    }
                                                                    return Unit.INSTANCE;
                                                                }
                                                            }
                                                        }

                                                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                            CoroutineContext context = continuation.getContext();
                                                            if (z6) {
                                                                Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource4, coroutineScope2, null), continuation);
                                                                return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue10);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Modifier sliderKeyboardInteractions = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput, objArr2, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource4), z6, state);
                                                startRestartGroup.startReplaceGroup(5004770);
                                                rememberedValue11 = startRestartGroup.rememberedValue();
                                                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue11 = new SliderKt$Slider$3$1(focusRequester, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue11);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Orientation orientation4 = orientation2;
                                                Modifier draggable$default = DraggableKt.draggable$default(sliderKeyboardInteractions, draggableState2, orientation4, false, mutableInteractionSource4, false, (Function3) rememberedValue11, null, false, 212, null);
                                                startRestartGroup.startReplaceGroup(5004770);
                                                rememberedValue12 = startRestartGroup.rememberedValue();
                                                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue12 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            Unit Slider$lambda$27$lambda$26;
                                                            Slider$lambda$27$lambda$26 = SliderKt.Slider$lambda$27$lambda$26(MutableState.this, (IntSize) obj);
                                                            return Slider$lambda$27$lambda$26;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue12);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Modifier then = modifier6.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default, (Function1) rememberedValue12), z6, state, coerceIn));
                                                Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                    startRestartGroup.useNode();
                                                } else {
                                                    startRestartGroup.createNode(constructor);
                                                }
                                                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                                                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                track.invoke(startRestartGroup, Integer.valueOf((i14 >> 18) & 14));
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                startRestartGroup.startReplaceGroup(5004770);
                                                rememberedValue13 = startRestartGroup.rememberedValue();
                                                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                    final MutableState mutableState6 = mutableState4;
                                                    rememberedValue13 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda7
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            Unit Slider$lambda$33$lambda$29$lambda$28;
                                                            Slider$lambda$33$lambda$29$lambda$28 = SliderKt.Slider$lambda$33$lambda$29$lambda$28(MutableState.this, (IntSize) obj);
                                                            return Slider$lambda$33$lambda$29$lambda$28;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue13);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(companion2, (Function1) rememberedValue13);
                                                startRestartGroup.startReplaceGroup(5004770);
                                                final float f6 = f;
                                                changed4 = startRestartGroup.changed(f6);
                                                rememberedValue14 = startRestartGroup.rememberedValue();
                                                if (!changed4 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            IntOffset Slider$lambda$33$lambda$31$lambda$30;
                                                            Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f6, (Density) obj);
                                                            return Slider$lambda$33$lambda$31$lambda$30;
                                                        }
                                                    };
                                                    startRestartGroup.updateRememberedValue(rememberedValue14);
                                                }
                                                startRestartGroup.endReplaceGroup();
                                                Modifier offset = OffsetKt.offset(onSizeChanged, (Function1) rememberedValue14);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, offset);
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                startRestartGroup.startReusableNode();
                                                if (startRestartGroup.getInserting()) {
                                                    startRestartGroup.useNode();
                                                } else {
                                                    startRestartGroup.createNode(constructor2);
                                                }
                                                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                                                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                }
                                                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                thumb = function2;
                                                thumb.invoke(startRestartGroup, Integer.valueOf((i14 >> 21) & 14));
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                startRestartGroup.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                modifier5 = modifier6;
                                                z7 = z6;
                                                orientation3 = orientation4;
                                                mutableInteractionSource3 = mutableInteractionSource4;
                                                closedFloatingPointRange5 = closedFloatingPointRange4;
                                            }
                                        }
                                        SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$12 = new SliderKt$Slider$dragOnTap$1$1(z8, z9, f4, coroutineScope2, mutableState5, mutableFloatState, rememberDraggableState, focusRequester2);
                                        closedFloatingPointRange4 = closedFloatingPointRange3;
                                        z6 = z8;
                                        draggableState = rememberDraggableState;
                                        focusRequester = focusRequester2;
                                        sliderKt$Slider$dragOnTap$1$1 = sliderKt$Slider$dragOnTap$1$12;
                                        startRestartGroup.updateRememberedValue(sliderKt$Slider$dragOnTap$1$1);
                                        startRestartGroup.endReplaceGroup();
                                        Modifier pointerInput2 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion, objArr, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
                                        Object[] objArr22 = {draggableState, mutableInteractionSource4, Boolean.valueOf(z6)};
                                        startRestartGroup.startReplaceGroup(-1746271574);
                                        DraggableState draggableState22 = draggableState;
                                        changedInstance = (i16 != 256) | ((i14 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
                                        rememberedValue10 = startRestartGroup.rememberedValue();
                                        if (!changedInstance) {
                                        }
                                        rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

                                            /* compiled from: Slider.kt */
                                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
                                            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
                                            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ CoroutineContext $currentContext;
                                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                                final /* synthetic */ CoroutineScope $scope;
                                                private /* synthetic */ Object L$0;
                                                Object L$1;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$currentContext = coroutineContext;
                                                    this.$interactionSource = mutableInteractionSource;
                                                    this.$scope = coroutineScope;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                                                    anonymousClass1.L$0 = obj;
                                                    return anonymousClass1;
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                                                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
                                                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                                                    	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
                                                    */
                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                                                    /*
                                                        r12 = this;
                                                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                                        int r1 = r12.label
                                                        r2 = 2
                                                        r3 = 1
                                                        r4 = 0
                                                        if (r1 == 0) goto L2c
                                                        if (r1 == r3) goto L23
                                                        if (r1 != r2) goto L1b
                                                        java.lang.Object r1 = r12.L$1
                                                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                                                        java.lang.Object r5 = r12.L$0
                                                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                                                        kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                                                        goto L82
                                                    L1b:
                                                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                        r13.<init>(r0)
                                                        throw r13
                                                    L23:
                                                        java.lang.Object r1 = r12.L$0
                                                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                                                        kotlin.ResultKt.throwOnFailure(r13)
                                                        r5 = r1
                                                        goto L50
                                                    L2c:
                                                        kotlin.ResultKt.throwOnFailure(r13)
                                                        java.lang.Object r13 = r12.L$0
                                                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                                                        r5 = r13
                                                    L34:
                                                        kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                                                        boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                                                        if (r13 == 0) goto L9a
                                                        r8 = r12
                                                        kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                                                        r12.L$0 = r5
                                                        r12.L$1 = r4
                                                        r12.label = r3
                                                        r6 = 0
                                                        r7 = 0
                                                        r9 = 3
                                                        r10 = 0
                                                        java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                                                        if (r13 != r0) goto L50
                                                        goto L81
                                                    L50:
                                                        androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                                                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                                        long r6 = r13.getPosition()
                                                        r1.<init>(r6, r4)
                                                        androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                                        if (r13 == 0) goto L72
                                                        kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                                        com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                                                        androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                                        r13.<init>(r7, r1, r4)
                                                        r9 = r13
                                                        kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                                        r10 = 3
                                                        r11 = 0
                                                        r7 = 0
                                                        r8 = 0
                                                        kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                                    L72:
                                                        r13 = r12
                                                        kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                                                        r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                                                        r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                                                        r12.label = r2     // Catch: java.lang.Exception -> L82
                                                        java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                                                        if (r13 != r0) goto L82
                                                    L81:
                                                        return r0
                                                    L82:
                                                        androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                                        if (r13 == 0) goto L34
                                                        kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                                        com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                                                        androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                                        r13.<init>(r7, r1, r4)
                                                        r9 = r13
                                                        kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                                        r10 = 3
                                                        r11 = 0
                                                        r7 = 0
                                                        r8 = 0
                                                        kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                                        goto L34
                                                    L9a:
                                                        kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                                        return r13
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                                }

                                                /* compiled from: Slider.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                                @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ MutableInteractionSource $interactionSource;
                                                    final /* synthetic */ PressInteraction.Press $press;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                                                        super(2, continuation);
                                                        this.$interactionSource = mutableInteractionSource;
                                                        this.$press = press;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new C00691(this.$interactionSource, this.$press, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* compiled from: Slider.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                                @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                                                static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ MutableInteractionSource $interactionSource;
                                                    final /* synthetic */ PressInteraction.Press $press;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                                                        super(2, continuation);
                                                        this.$interactionSource = mutableInteractionSource;
                                                        this.$press = press;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }

                                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                                CoroutineContext context = continuation.getContext();
                                                if (z6) {
                                                    Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource4, coroutineScope2, null), continuation);
                                                    return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                        startRestartGroup.endReplaceGroup();
                                        Modifier sliderKeyboardInteractions2 = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput2, objArr22, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource4), z6, state);
                                        startRestartGroup.startReplaceGroup(5004770);
                                        rememberedValue11 = startRestartGroup.rememberedValue();
                                        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Orientation orientation42 = orientation2;
                                        Modifier draggable$default2 = DraggableKt.draggable$default(sliderKeyboardInteractions2, draggableState22, orientation42, false, mutableInteractionSource4, false, (Function3) rememberedValue11, null, false, 212, null);
                                        startRestartGroup.startReplaceGroup(5004770);
                                        rememberedValue12 = startRestartGroup.rememberedValue();
                                        if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Modifier then2 = modifier6.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default2, (Function1) rememberedValue12), z6, state, coerceIn));
                                        Alignment centerStart2 = Alignment.INSTANCE.getCenterStart();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart2, false);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
                                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                        }
                                        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4976constructorimpl.getInserting()) {
                                        }
                                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                                        track.invoke(startRestartGroup, Integer.valueOf((i14 >> 18) & 14));
                                        Modifier.Companion companion22 = Modifier.INSTANCE;
                                        startRestartGroup.startReplaceGroup(5004770);
                                        rememberedValue13 = startRestartGroup.rememberedValue();
                                        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        Modifier onSizeChanged2 = OnRemeasuredModifierKt.onSizeChanged(companion22, (Function1) rememberedValue13);
                                        startRestartGroup.startReplaceGroup(5004770);
                                        final float f62 = f;
                                        changed4 = startRestartGroup.changed(f62);
                                        rememberedValue14 = startRestartGroup.rememberedValue();
                                        if (!changed4) {
                                        }
                                        rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                IntOffset Slider$lambda$33$lambda$31$lambda$30;
                                                Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f62, (Density) obj);
                                                return Slider$lambda$33$lambda$31$lambda$30;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue14);
                                        startRestartGroup.endReplaceGroup();
                                        Modifier offset2 = OffsetKt.offset(onSizeChanged2, (Function1) rememberedValue14);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, offset2);
                                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        startRestartGroup.startReusableNode();
                                        if (startRestartGroup.getInserting()) {
                                        }
                                        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                                        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!m4976constructorimpl2.getInserting()) {
                                        }
                                        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                        thumb = function2;
                                        thumb.invoke(startRestartGroup, Integer.valueOf((i14 >> 21) & 14));
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        startRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier5 = modifier6;
                                        z7 = z6;
                                        orientation3 = orientation42;
                                        mutableInteractionSource3 = mutableInteractionSource4;
                                        closedFloatingPointRange5 = closedFloatingPointRange4;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                }
                                orientation2 = orientation;
                                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                closedFloatingPointRange3 = closedFloatingPointRange2;
                                boolean z82 = z2;
                                int i142 = i3;
                                modifier3 = modifier2;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState = (MutableState) rememberedValue;
                                startRestartGroup.endReplaceGroup();
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (consume2 == LayoutDirection.Rtl) {
                                }
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                final MutableState mutableState52 = (MutableState) rememberedValue2;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                final MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
                                startRestartGroup.endReplaceGroup();
                                float coerceIn2 = RangesKt.coerceIn(state.getValue(), closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue());
                                float calcFraction2 = calcFraction(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), coerceIn2);
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                }
                                FocusRequester focusRequester22 = (FocusRequester) rememberedValue4;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1849434622);
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutableState2 = (MutableState) rememberedValue5;
                                startRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                                rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                }
                                coroutineScope = (CoroutineScope) rememberedValue6;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                float Slider$lambda$1622 = Slider$lambda$16(mutableState2);
                                float f52 = 2;
                                max = Math.max(Slider$lambda$1622 - (Slider$lambda$6(mutableState) / f52), 0.0f);
                                min = Math.min(Slider$lambda$6(mutableState) / f52, max);
                                Slider$lambda$16 = (Slider$lambda$16(mutableState2) - Slider$lambda$6(mutableState)) * calcFraction2;
                                startRestartGroup.startReplaceGroup(-1224400529);
                                int i152 = i142 & 14;
                                i7 = (57344 & i142) ^ 24576;
                                changed = (i152 == 4) | startRestartGroup.changed(min) | startRestartGroup.changed(max) | ((i7 <= 16384 && startRestartGroup.changed(closedFloatingPointRange3)) || (i142 & 24576) == 16384);
                                rememberedValue7 = startRestartGroup.rememberedValue();
                                if (changed) {
                                }
                                mutableState3 = mutableState2;
                                f = Slider$lambda$16;
                                modifier4 = modifier3;
                                mutableState4 = mutableState;
                                z4 = z3;
                                coroutineScope2 = coroutineScope;
                                i8 = 16384;
                                i9 = i7;
                                f2 = max;
                                rememberedValue7 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Slider$lambda$19$lambda$18;
                                        Slider$lambda$19$lambda$18 = SliderKt.Slider$lambda$19$lambda$18(min, f2, sliderState, mutableState52, mutableFloatState2, closedFloatingPointRange3, ((Float) obj).floatValue());
                                        return Slider$lambda$19$lambda$18;
                                    }
                                };
                                f3 = min;
                                state = sliderState;
                                mutableState52 = mutableState52;
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                                startRestartGroup.endReplaceGroup();
                                DraggableState rememberDraggableState2 = DraggableKt.rememberDraggableState((Function1) rememberedValue7, startRestartGroup, 0);
                                startRestartGroup.startReplaceGroup(-1746271574);
                                changed2 = ((i9 <= i8 && startRestartGroup.changed(closedFloatingPointRange3)) || (i142 & 24576) == i8) | startRestartGroup.changed(f3) | startRestartGroup.changed(f2);
                                rememberedValue8 = startRestartGroup.rememberedValue();
                                if (!changed2) {
                                }
                                rememberedValue8 = new SliderKt$Slider$1$1(closedFloatingPointRange3, f3, f2);
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                                startRestartGroup.endReplaceGroup();
                                Function1 function12 = (Function1) ((KFunction) rememberedValue8);
                                startRestartGroup.startReplaceGroup(5004770);
                                if (i152 == 4) {
                                }
                                rememberedValue9 = startRestartGroup.rememberedValue();
                                if (!z5) {
                                }
                                rememberedValue9 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit Slider$lambda$22$lambda$21;
                                        Slider$lambda$22$lambda$21 = SliderKt.Slider$lambda$22$lambda$21(SliderState.this, ((Float) obj).floatValue());
                                        return Slider$lambda$22$lambda$21;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                                startRestartGroup.endReplaceGroup();
                                Modifier modifier62 = modifier4;
                                CorrectValueSideEffect(function12, (Function1) rememberedValue9, closedFloatingPointRange3, RangesKt.rangeTo(f3, f2), state.getValue(), startRestartGroup, (i142 >> 6) & 896);
                                startRestartGroup = startRestartGroup;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Object[] objArr3 = {rememberDraggableState2, mutableInteractionSource42, Float.valueOf(f2), Boolean.valueOf(z4)};
                                startRestartGroup.startReplaceGroup(-1224400529);
                                int i162 = i142 & 896;
                                boolean z92 = z4;
                                changed3 = (i162 == 256) | startRestartGroup.changed(z92) | startRestartGroup.changed(f2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(rememberDraggableState2);
                                Object rememberedValue152 = startRestartGroup.rememberedValue();
                                if (changed3) {
                                }
                                SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$122 = new SliderKt$Slider$dragOnTap$1$1(z82, z92, f4, coroutineScope2, mutableState52, mutableFloatState2, rememberDraggableState2, focusRequester22);
                                closedFloatingPointRange4 = closedFloatingPointRange3;
                                z6 = z82;
                                draggableState = rememberDraggableState2;
                                focusRequester = focusRequester22;
                                sliderKt$Slider$dragOnTap$1$1 = sliderKt$Slider$dragOnTap$1$122;
                                startRestartGroup.updateRememberedValue(sliderKt$Slider$dragOnTap$1$1);
                                startRestartGroup.endReplaceGroup();
                                Modifier pointerInput22 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion3, objArr3, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
                                Object[] objArr222 = {draggableState, mutableInteractionSource42, Boolean.valueOf(z6)};
                                startRestartGroup.startReplaceGroup(-1746271574);
                                DraggableState draggableState222 = draggableState;
                                changedInstance = (i162 != 256) | ((i142 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
                                rememberedValue10 = startRestartGroup.rememberedValue();
                                if (!changedInstance) {
                                }
                                rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

                                    /* compiled from: Slider.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                    @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
                                    /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
                                    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ CoroutineContext $currentContext;
                                        final /* synthetic */ MutableInteractionSource $interactionSource;
                                        final /* synthetic */ CoroutineScope $scope;
                                        private /* synthetic */ Object L$0;
                                        Object L$1;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                                            super(2, continuation);
                                            this.$currentContext = coroutineContext;
                                            this.$interactionSource = mutableInteractionSource;
                                            this.$scope = coroutineScope;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                                            anonymousClass1.L$0 = obj;
                                            return anonymousClass1;
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                                            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
                                            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
                                            */
                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                                            /*
                                                r12 = this;
                                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                                int r1 = r12.label
                                                r2 = 2
                                                r3 = 1
                                                r4 = 0
                                                if (r1 == 0) goto L2c
                                                if (r1 == r3) goto L23
                                                if (r1 != r2) goto L1b
                                                java.lang.Object r1 = r12.L$1
                                                androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                                                java.lang.Object r5 = r12.L$0
                                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                                                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                                                goto L82
                                            L1b:
                                                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                                r13.<init>(r0)
                                                throw r13
                                            L23:
                                                java.lang.Object r1 = r12.L$0
                                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                                                kotlin.ResultKt.throwOnFailure(r13)
                                                r5 = r1
                                                goto L50
                                            L2c:
                                                kotlin.ResultKt.throwOnFailure(r13)
                                                java.lang.Object r13 = r12.L$0
                                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                                                r5 = r13
                                            L34:
                                                kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                                                boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                                                if (r13 == 0) goto L9a
                                                r8 = r12
                                                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                                                r12.L$0 = r5
                                                r12.L$1 = r4
                                                r12.label = r3
                                                r6 = 0
                                                r7 = 0
                                                r9 = 3
                                                r10 = 0
                                                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                                                if (r13 != r0) goto L50
                                                goto L81
                                            L50:
                                                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                                                androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                                long r6 = r13.getPosition()
                                                r1.<init>(r6, r4)
                                                androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                                if (r13 == 0) goto L72
                                                kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                                com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                                                androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                                r13.<init>(r7, r1, r4)
                                                r9 = r13
                                                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                                r10 = 3
                                                r11 = 0
                                                r7 = 0
                                                r8 = 0
                                                kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                            L72:
                                                r13 = r12
                                                kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                                                r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                                                r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                                                r12.label = r2     // Catch: java.lang.Exception -> L82
                                                java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                                                if (r13 != r0) goto L82
                                            L81:
                                                return r0
                                            L82:
                                                androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                                if (r13 == 0) goto L34
                                                kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                                com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                                                androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                                r13.<init>(r7, r1, r4)
                                                r9 = r13
                                                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                                r10 = 3
                                                r11 = 0
                                                r7 = 0
                                                r8 = 0
                                                kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                                goto L34
                                            L9a:
                                                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                                return r13
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                        }

                                        /* compiled from: Slider.kt */
                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                        @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                        static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ MutableInteractionSource $interactionSource;
                                            final /* synthetic */ PressInteraction.Press $press;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                                                super(2, continuation);
                                                this.$interactionSource = mutableInteractionSource;
                                                this.$press = press;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new C00691(this.$interactionSource, this.$press, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        /* compiled from: Slider.kt */
                                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                        @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                                        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                            final /* synthetic */ MutableInteractionSource $interactionSource;
                                            final /* synthetic */ PressInteraction.Press $press;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                                                super(2, continuation);
                                                this.$interactionSource = mutableInteractionSource;
                                                this.$press = press;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final Object invokeSuspend(Object obj) {
                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                } else {
                                                    if (i != 1) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    ResultKt.throwOnFailure(obj);
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }

                                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                        CoroutineContext context = continuation.getContext();
                                        if (z6) {
                                            Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource42, coroutineScope2, null), continuation);
                                            return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                                startRestartGroup.endReplaceGroup();
                                Modifier sliderKeyboardInteractions22 = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput22, objArr222, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource42), z6, state);
                                startRestartGroup.startReplaceGroup(5004770);
                                rememberedValue11 = startRestartGroup.rememberedValue();
                                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Orientation orientation422 = orientation2;
                                Modifier draggable$default22 = DraggableKt.draggable$default(sliderKeyboardInteractions22, draggableState222, orientation422, false, mutableInteractionSource42, false, (Function3) rememberedValue11, null, false, 212, null);
                                startRestartGroup.startReplaceGroup(5004770);
                                rememberedValue12 = startRestartGroup.rememberedValue();
                                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier then22 = modifier62.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default22, (Function1) rememberedValue12), z6, state, coerceIn2));
                                Alignment centerStart22 = Alignment.INSTANCE.getCenterStart();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart22, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, then22);
                                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4976constructorimpl.getInserting()) {
                                }
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                                track.invoke(startRestartGroup, Integer.valueOf((i142 >> 18) & 14));
                                Modifier.Companion companion222 = Modifier.INSTANCE;
                                startRestartGroup.startReplaceGroup(5004770);
                                rememberedValue13 = startRestartGroup.rememberedValue();
                                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                }
                                startRestartGroup.endReplaceGroup();
                                Modifier onSizeChanged22 = OnRemeasuredModifierKt.onSizeChanged(companion222, (Function1) rememberedValue13);
                                startRestartGroup.startReplaceGroup(5004770);
                                final float f622 = f;
                                changed4 = startRestartGroup.changed(f622);
                                rememberedValue14 = startRestartGroup.rememberedValue();
                                if (!changed4) {
                                }
                                rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        IntOffset Slider$lambda$33$lambda$31$lambda$30;
                                        Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f622, (Density) obj);
                                        return Slider$lambda$33$lambda$31$lambda$30;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue14);
                                startRestartGroup.endReplaceGroup();
                                Modifier offset22 = OffsetKt.offset(onSizeChanged22, (Function1) rememberedValue14);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, offset22);
                                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                }
                                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m4976constructorimpl2.getInserting()) {
                                }
                                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                                thumb = function2;
                                thumb.invoke(startRestartGroup, Integer.valueOf((i142 >> 21) & 14));
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier5 = modifier62;
                                z7 = z6;
                                orientation3 = orientation422;
                                mutableInteractionSource3 = mutableInteractionSource42;
                                closedFloatingPointRange5 = closedFloatingPointRange4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                orientation3 = orientation;
                                modifier5 = modifier2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                closedFloatingPointRange5 = closedFloatingPointRange2;
                                z7 = z2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit Slider$lambda$34;
                                        Slider$lambda$34 = SliderKt.Slider$lambda$34(SliderState.this, modifier5, z7, mutableInteractionSource3, closedFloatingPointRange5, orientation3, track, thumb, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return Slider$lambda$34;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= i10;
                        if ((4793491 & i3) == 4793490) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i13 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i6 != 0) {
                        }
                        orientation2 = orientation;
                        final MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        boolean z822 = z2;
                        int i1422 = i3;
                        modifier3 = modifier2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume22 = startRestartGroup.consume(localLayoutDirection22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (consume22 == LayoutDirection.Rtl) {
                        }
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableState mutableState522 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        final MutableFloatState mutableFloatState22 = (MutableFloatState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        float coerceIn22 = RangesKt.coerceIn(state.getValue(), closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue());
                        float calcFraction22 = calcFraction(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), coerceIn22);
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        }
                        FocusRequester focusRequester222 = (FocusRequester) rememberedValue4;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        mutableState2 = (MutableState) rememberedValue5;
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        }
                        coroutineScope = (CoroutineScope) rememberedValue6;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float Slider$lambda$16222 = Slider$lambda$16(mutableState2);
                        float f522 = 2;
                        max = Math.max(Slider$lambda$16222 - (Slider$lambda$6(mutableState) / f522), 0.0f);
                        min = Math.min(Slider$lambda$6(mutableState) / f522, max);
                        Slider$lambda$16 = (Slider$lambda$16(mutableState2) - Slider$lambda$6(mutableState)) * calcFraction22;
                        startRestartGroup.startReplaceGroup(-1224400529);
                        int i1522 = i1422 & 14;
                        i7 = (57344 & i1422) ^ 24576;
                        changed = (i1522 == 4) | startRestartGroup.changed(min) | startRestartGroup.changed(max) | ((i7 <= 16384 && startRestartGroup.changed(closedFloatingPointRange3)) || (i1422 & 24576) == 16384);
                        rememberedValue7 = startRestartGroup.rememberedValue();
                        if (changed) {
                        }
                        mutableState3 = mutableState2;
                        f = Slider$lambda$16;
                        modifier4 = modifier3;
                        mutableState4 = mutableState;
                        z4 = z3;
                        coroutineScope2 = coroutineScope;
                        i8 = 16384;
                        i9 = i7;
                        f2 = max;
                        rememberedValue7 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit Slider$lambda$19$lambda$18;
                                Slider$lambda$19$lambda$18 = SliderKt.Slider$lambda$19$lambda$18(min, f2, sliderState, mutableState522, mutableFloatState22, closedFloatingPointRange3, ((Float) obj).floatValue());
                                return Slider$lambda$19$lambda$18;
                            }
                        };
                        f3 = min;
                        state = sliderState;
                        mutableState522 = mutableState522;
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                        startRestartGroup.endReplaceGroup();
                        DraggableState rememberDraggableState22 = DraggableKt.rememberDraggableState((Function1) rememberedValue7, startRestartGroup, 0);
                        startRestartGroup.startReplaceGroup(-1746271574);
                        changed2 = ((i9 <= i8 && startRestartGroup.changed(closedFloatingPointRange3)) || (i1422 & 24576) == i8) | startRestartGroup.changed(f3) | startRestartGroup.changed(f2);
                        rememberedValue8 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue8 = new SliderKt$Slider$1$1(closedFloatingPointRange3, f3, f2);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                        startRestartGroup.endReplaceGroup();
                        Function1 function122 = (Function1) ((KFunction) rememberedValue8);
                        startRestartGroup.startReplaceGroup(5004770);
                        if (i1522 == 4) {
                        }
                        rememberedValue9 = startRestartGroup.rememberedValue();
                        if (!z5) {
                        }
                        rememberedValue9 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit Slider$lambda$22$lambda$21;
                                Slider$lambda$22$lambda$21 = SliderKt.Slider$lambda$22$lambda$21(SliderState.this, ((Float) obj).floatValue());
                                return Slider$lambda$22$lambda$21;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                        startRestartGroup.endReplaceGroup();
                        Modifier modifier622 = modifier4;
                        CorrectValueSideEffect(function122, (Function1) rememberedValue9, closedFloatingPointRange3, RangesKt.rangeTo(f3, f2), state.getValue(), startRestartGroup, (i1422 >> 6) & 896);
                        startRestartGroup = startRestartGroup;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Object[] objArr32 = {rememberDraggableState22, mutableInteractionSource422, Float.valueOf(f2), Boolean.valueOf(z4)};
                        startRestartGroup.startReplaceGroup(-1224400529);
                        int i1622 = i1422 & 896;
                        boolean z922 = z4;
                        changed3 = (i1622 == 256) | startRestartGroup.changed(z922) | startRestartGroup.changed(f2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(rememberDraggableState22);
                        Object rememberedValue1522 = startRestartGroup.rememberedValue();
                        if (changed3) {
                        }
                        SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$1222 = new SliderKt$Slider$dragOnTap$1$1(z822, z922, f4, coroutineScope2, mutableState522, mutableFloatState22, rememberDraggableState22, focusRequester222);
                        closedFloatingPointRange4 = closedFloatingPointRange3;
                        z6 = z822;
                        draggableState = rememberDraggableState22;
                        focusRequester = focusRequester222;
                        sliderKt$Slider$dragOnTap$1$1 = sliderKt$Slider$dragOnTap$1$1222;
                        startRestartGroup.updateRememberedValue(sliderKt$Slider$dragOnTap$1$1);
                        startRestartGroup.endReplaceGroup();
                        Modifier pointerInput222 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion32, objArr32, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
                        Object[] objArr2222 = {draggableState, mutableInteractionSource422, Boolean.valueOf(z6)};
                        startRestartGroup.startReplaceGroup(-1746271574);
                        DraggableState draggableState2222 = draggableState;
                        changedInstance = (i1622 != 256) | ((i1422 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
                        rememberedValue10 = startRestartGroup.rememberedValue();
                        if (!changedInstance) {
                        }
                        rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

                            /* compiled from: Slider.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
                            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
                            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ CoroutineContext $currentContext;
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ CoroutineScope $scope;
                                private /* synthetic */ Object L$0;
                                Object L$1;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.$currentContext = coroutineContext;
                                    this.$interactionSource = mutableInteractionSource;
                                    this.$scope = coroutineScope;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                                    	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
                                    */
                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                                    /*
                                        r12 = this;
                                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                        int r1 = r12.label
                                        r2 = 2
                                        r3 = 1
                                        r4 = 0
                                        if (r1 == 0) goto L2c
                                        if (r1 == r3) goto L23
                                        if (r1 != r2) goto L1b
                                        java.lang.Object r1 = r12.L$1
                                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                                        java.lang.Object r5 = r12.L$0
                                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                                        kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                                        goto L82
                                    L1b:
                                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                        r13.<init>(r0)
                                        throw r13
                                    L23:
                                        java.lang.Object r1 = r12.L$0
                                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                                        kotlin.ResultKt.throwOnFailure(r13)
                                        r5 = r1
                                        goto L50
                                    L2c:
                                        kotlin.ResultKt.throwOnFailure(r13)
                                        java.lang.Object r13 = r12.L$0
                                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                                        r5 = r13
                                    L34:
                                        kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                                        boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                                        if (r13 == 0) goto L9a
                                        r8 = r12
                                        kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                                        r12.L$0 = r5
                                        r12.L$1 = r4
                                        r12.label = r3
                                        r6 = 0
                                        r7 = 0
                                        r9 = 3
                                        r10 = 0
                                        java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                                        if (r13 != r0) goto L50
                                        goto L81
                                    L50:
                                        androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                        long r6 = r13.getPosition()
                                        r1.<init>(r6, r4)
                                        androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                        if (r13 == 0) goto L72
                                        kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                        com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                                        androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                        r13.<init>(r7, r1, r4)
                                        r9 = r13
                                        kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                        r10 = 3
                                        r11 = 0
                                        r7 = 0
                                        r8 = 0
                                        kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                    L72:
                                        r13 = r12
                                        kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                                        r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                                        r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                                        r12.label = r2     // Catch: java.lang.Exception -> L82
                                        java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                                        if (r13 != r0) goto L82
                                    L81:
                                        return r0
                                    L82:
                                        androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                        if (r13 == 0) goto L34
                                        kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                        com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                                        androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                        r13.<init>(r7, r1, r4)
                                        r9 = r13
                                        kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                        r10 = 3
                                        r11 = 0
                                        r7 = 0
                                        r8 = 0
                                        kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                        goto L34
                                    L9a:
                                        kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                        return r13
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                                }

                                /* compiled from: Slider.kt */
                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ MutableInteractionSource $interactionSource;
                                    final /* synthetic */ PressInteraction.Press $press;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                                        super(2, continuation);
                                        this.$interactionSource = mutableInteractionSource;
                                        this.$press = press;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C00691(this.$interactionSource, this.$press, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: Slider.kt */
                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                                @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                                /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                                static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ MutableInteractionSource $interactionSource;
                                    final /* synthetic */ PressInteraction.Press $press;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                                        super(2, continuation);
                                        this.$interactionSource = mutableInteractionSource;
                                        this.$press = press;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            }

                            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                                CoroutineContext context = continuation.getContext();
                                if (z6) {
                                    Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource422, coroutineScope2, null), continuation);
                                    return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                        startRestartGroup.endReplaceGroup();
                        Modifier sliderKeyboardInteractions222 = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput222, objArr2222, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource422), z6, state);
                        startRestartGroup.startReplaceGroup(5004770);
                        rememberedValue11 = startRestartGroup.rememberedValue();
                        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Orientation orientation4222 = orientation2;
                        Modifier draggable$default222 = DraggableKt.draggable$default(sliderKeyboardInteractions222, draggableState2222, orientation4222, false, mutableInteractionSource422, false, (Function3) rememberedValue11, null, false, 212, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        rememberedValue12 = startRestartGroup.rememberedValue();
                        if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier then222 = modifier622.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default222, (Function1) rememberedValue12), z6, state, coerceIn22));
                        Alignment centerStart222 = Alignment.INSTANCE.getCenterStart();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart222, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, then222);
                        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting()) {
                        }
                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
                        track.invoke(startRestartGroup, Integer.valueOf((i1422 >> 18) & 14));
                        Modifier.Companion companion2222 = Modifier.INSTANCE;
                        startRestartGroup.startReplaceGroup(5004770);
                        rememberedValue13 = startRestartGroup.rememberedValue();
                        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier onSizeChanged222 = OnRemeasuredModifierKt.onSizeChanged(companion2222, (Function1) rememberedValue13);
                        startRestartGroup.startReplaceGroup(5004770);
                        final float f6222 = f;
                        changed4 = startRestartGroup.changed(f6222);
                        rememberedValue14 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                IntOffset Slider$lambda$33$lambda$31$lambda$30;
                                Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f6222, (Density) obj);
                                return Slider$lambda$33$lambda$31$lambda$30;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                        startRestartGroup.endReplaceGroup();
                        Modifier offset222 = OffsetKt.offset(onSizeChanged222, (Function1) rememberedValue14);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, offset222);
                        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                        }
                        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl2.getInserting()) {
                        }
                        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
                        thumb = function2;
                        thumb.invoke(startRestartGroup, Integer.valueOf((i1422 >> 21) & 14));
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier622;
                        z7 = z6;
                        orientation3 = orientation4222;
                        mutableInteractionSource3 = mutableInteractionSource422;
                        closedFloatingPointRange5 = closedFloatingPointRange4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i3 |= i11;
                    if ((i2 & 128) == 0) {
                    }
                    i3 |= i10;
                    if ((4793491 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    orientation2 = orientation;
                    final MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    boolean z8222 = z2;
                    int i14222 = i3;
                    modifier3 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume222 = startRestartGroup.consume(localLayoutDirection222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (consume222 == LayoutDirection.Rtl) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableState mutableState5222 = (MutableState) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableFloatState mutableFloatState222 = (MutableFloatState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    float coerceIn222 = RangesKt.coerceIn(state.getValue(), closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue());
                    float calcFraction222 = calcFraction(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), coerceIn222);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    }
                    FocusRequester focusRequester2222 = (FocusRequester) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState2 = (MutableState) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) rememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    float Slider$lambda$162222 = Slider$lambda$16(mutableState2);
                    float f5222 = 2;
                    max = Math.max(Slider$lambda$162222 - (Slider$lambda$6(mutableState) / f5222), 0.0f);
                    min = Math.min(Slider$lambda$6(mutableState) / f5222, max);
                    Slider$lambda$16 = (Slider$lambda$16(mutableState2) - Slider$lambda$6(mutableState)) * calcFraction222;
                    startRestartGroup.startReplaceGroup(-1224400529);
                    int i15222 = i14222 & 14;
                    i7 = (57344 & i14222) ^ 24576;
                    changed = (i15222 == 4) | startRestartGroup.changed(min) | startRestartGroup.changed(max) | ((i7 <= 16384 && startRestartGroup.changed(closedFloatingPointRange3)) || (i14222 & 24576) == 16384);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    mutableState3 = mutableState2;
                    f = Slider$lambda$16;
                    modifier4 = modifier3;
                    mutableState4 = mutableState;
                    z4 = z3;
                    coroutineScope2 = coroutineScope;
                    i8 = 16384;
                    i9 = i7;
                    f2 = max;
                    rememberedValue7 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Slider$lambda$19$lambda$18;
                            Slider$lambda$19$lambda$18 = SliderKt.Slider$lambda$19$lambda$18(min, f2, sliderState, mutableState5222, mutableFloatState222, closedFloatingPointRange3, ((Float) obj).floatValue());
                            return Slider$lambda$19$lambda$18;
                        }
                    };
                    f3 = min;
                    state = sliderState;
                    mutableState5222 = mutableState5222;
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                    startRestartGroup.endReplaceGroup();
                    DraggableState rememberDraggableState222 = DraggableKt.rememberDraggableState((Function1) rememberedValue7, startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changed2 = ((i9 <= i8 && startRestartGroup.changed(closedFloatingPointRange3)) || (i14222 & 24576) == i8) | startRestartGroup.changed(f3) | startRestartGroup.changed(f2);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue8 = new SliderKt$Slider$1$1(closedFloatingPointRange3, f3, f2);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                    startRestartGroup.endReplaceGroup();
                    Function1 function1222 = (Function1) ((KFunction) rememberedValue8);
                    startRestartGroup.startReplaceGroup(5004770);
                    if (i15222 == 4) {
                    }
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue9 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit Slider$lambda$22$lambda$21;
                            Slider$lambda$22$lambda$21 = SliderKt.Slider$lambda$22$lambda$21(SliderState.this, ((Float) obj).floatValue());
                            return Slider$lambda$22$lambda$21;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                    startRestartGroup.endReplaceGroup();
                    Modifier modifier6222 = modifier4;
                    CorrectValueSideEffect(function1222, (Function1) rememberedValue9, closedFloatingPointRange3, RangesKt.rangeTo(f3, f2), state.getValue(), startRestartGroup, (i14222 >> 6) & 896);
                    startRestartGroup = startRestartGroup;
                    Modifier.Companion companion322 = Modifier.INSTANCE;
                    Object[] objArr322 = {rememberDraggableState222, mutableInteractionSource4222, Float.valueOf(f2), Boolean.valueOf(z4)};
                    startRestartGroup.startReplaceGroup(-1224400529);
                    int i16222 = i14222 & 896;
                    boolean z9222 = z4;
                    changed3 = (i16222 == 256) | startRestartGroup.changed(z9222) | startRestartGroup.changed(f2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(rememberDraggableState222);
                    Object rememberedValue15222 = startRestartGroup.rememberedValue();
                    if (changed3) {
                    }
                    SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$12222 = new SliderKt$Slider$dragOnTap$1$1(z8222, z9222, f4, coroutineScope2, mutableState5222, mutableFloatState222, rememberDraggableState222, focusRequester2222);
                    closedFloatingPointRange4 = closedFloatingPointRange3;
                    z6 = z8222;
                    draggableState = rememberDraggableState222;
                    focusRequester = focusRequester2222;
                    sliderKt$Slider$dragOnTap$1$1 = sliderKt$Slider$dragOnTap$1$12222;
                    startRestartGroup.updateRememberedValue(sliderKt$Slider$dragOnTap$1$1);
                    startRestartGroup.endReplaceGroup();
                    Modifier pointerInput2222 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion322, objArr322, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
                    Object[] objArr22222 = {draggableState, mutableInteractionSource4222, Boolean.valueOf(z6)};
                    startRestartGroup.startReplaceGroup(-1746271574);
                    DraggableState draggableState22222 = draggableState;
                    changedInstance = (i16222 != 256) | ((i14222 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

                        /* compiled from: Slider.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
                        /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
                        static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ CoroutineContext $currentContext;
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ CoroutineScope $scope;
                            private /* synthetic */ Object L$0;
                            Object L$1;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.$currentContext = coroutineContext;
                                this.$interactionSource = mutableInteractionSource;
                                this.$scope = coroutineScope;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                                */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                                /*
                                    r12 = this;
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r1 = r12.label
                                    r2 = 2
                                    r3 = 1
                                    r4 = 0
                                    if (r1 == 0) goto L2c
                                    if (r1 == r3) goto L23
                                    if (r1 != r2) goto L1b
                                    java.lang.Object r1 = r12.L$1
                                    androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                                    java.lang.Object r5 = r12.L$0
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                                    kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                                    goto L82
                                L1b:
                                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                    r13.<init>(r0)
                                    throw r13
                                L23:
                                    java.lang.Object r1 = r12.L$0
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                                    kotlin.ResultKt.throwOnFailure(r13)
                                    r5 = r1
                                    goto L50
                                L2c:
                                    kotlin.ResultKt.throwOnFailure(r13)
                                    java.lang.Object r13 = r12.L$0
                                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                                    r5 = r13
                                L34:
                                    kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                                    boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                                    if (r13 == 0) goto L9a
                                    r8 = r12
                                    kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                                    r12.L$0 = r5
                                    r12.L$1 = r4
                                    r12.label = r3
                                    r6 = 0
                                    r7 = 0
                                    r9 = 3
                                    r10 = 0
                                    java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                                    if (r13 != r0) goto L50
                                    goto L81
                                L50:
                                    androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                                    androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                    long r6 = r13.getPosition()
                                    r1.<init>(r6, r4)
                                    androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                    if (r13 == 0) goto L72
                                    kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                    com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                                    androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                    r13.<init>(r7, r1, r4)
                                    r9 = r13
                                    kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                    r10 = 3
                                    r11 = 0
                                    r7 = 0
                                    r8 = 0
                                    kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                L72:
                                    r13 = r12
                                    kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                                    r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                                    r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                                    r12.label = r2     // Catch: java.lang.Exception -> L82
                                    java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                                    if (r13 != r0) goto L82
                                L81:
                                    return r0
                                L82:
                                    androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                    if (r13 == 0) goto L34
                                    kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                    com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                                    androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                    r13.<init>(r7, r1, r4)
                                    r9 = r13
                                    kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                    r10 = 3
                                    r11 = 0
                                    r7 = 0
                                    r8 = 0
                                    kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                    goto L34
                                L9a:
                                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                    return r13
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                            }

                            /* compiled from: Slider.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ PressInteraction.Press $press;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                                    super(2, continuation);
                                    this.$interactionSource = mutableInteractionSource;
                                    this.$press = press;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C00691(this.$interactionSource, this.$press, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: Slider.kt */
                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                            static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ MutableInteractionSource $interactionSource;
                                final /* synthetic */ PressInteraction.Press $press;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                                    super(2, continuation);
                                    this.$interactionSource = mutableInteractionSource;
                                    this.$press = press;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            CoroutineContext context = continuation.getContext();
                            if (z6) {
                                Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource4222, coroutineScope2, null), continuation);
                                return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                    startRestartGroup.endReplaceGroup();
                    Modifier sliderKeyboardInteractions2222 = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput2222, objArr22222, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource4222), z6, state);
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue11 = startRestartGroup.rememberedValue();
                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Orientation orientation42222 = orientation2;
                    Modifier draggable$default2222 = DraggableKt.draggable$default(sliderKeyboardInteractions2222, draggableState22222, orientation42222, false, mutableInteractionSource4222, false, (Function3) rememberedValue11, null, false, 212, null);
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue12 = startRestartGroup.rememberedValue();
                    if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier then2222 = modifier6222.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default2222, (Function1) rememberedValue12), z6, state, coerceIn222));
                    Alignment centerStart2222 = Alignment.INSTANCE.getCenterStart();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3222 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart2222, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222);
                    Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl.getInserting()) {
                    }
                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3222 = BoxScopeInstance.INSTANCE;
                    track.invoke(startRestartGroup, Integer.valueOf((i14222 >> 18) & 14));
                    Modifier.Companion companion22222 = Modifier.INSTANCE;
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue13 = startRestartGroup.rememberedValue();
                    if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier onSizeChanged2222 = OnRemeasuredModifierKt.onSizeChanged(companion22222, (Function1) rememberedValue13);
                    startRestartGroup.startReplaceGroup(5004770);
                    final float f62222 = f;
                    changed4 = startRestartGroup.changed(f62222);
                    rememberedValue14 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            IntOffset Slider$lambda$33$lambda$31$lambda$30;
                            Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f62222, (Density) obj);
                            return Slider$lambda$33$lambda$31$lambda$30;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue14);
                    startRestartGroup.endReplaceGroup();
                    Modifier offset2222 = OffsetKt.offset(onSizeChanged2222, (Function1) rememberedValue14);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, offset2222);
                    Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                    Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4976constructorimpl2.getInserting()) {
                    }
                    m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
                    Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
                    thumb = function2;
                    thumb.invoke(startRestartGroup, Integer.valueOf((i14222 >> 21) & 14));
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier6222;
                    z7 = z6;
                    orientation3 = orientation42222;
                    mutableInteractionSource3 = mutableInteractionSource4222;
                    closedFloatingPointRange5 = closedFloatingPointRange4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                i3 |= i11;
                if ((i2 & 128) == 0) {
                }
                i3 |= i10;
                if ((4793491 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i13 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                orientation2 = orientation;
                final MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                boolean z82222 = z2;
                int i142222 = i3;
                modifier3 = modifier2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume2222 = startRestartGroup.consume(localLayoutDirection2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (consume2222 == LayoutDirection.Rtl) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableState mutableState52222 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                final MutableFloatState mutableFloatState2222 = (MutableFloatState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                float coerceIn2222 = RangesKt.coerceIn(state.getValue(), closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue());
                float calcFraction2222 = calcFraction(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), coerceIn2222);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                FocusRequester focusRequester22222 = (FocusRequester) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState2 = (MutableState) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                coroutineScope = (CoroutineScope) rememberedValue6;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float Slider$lambda$1622222 = Slider$lambda$16(mutableState2);
                float f52222 = 2;
                max = Math.max(Slider$lambda$1622222 - (Slider$lambda$6(mutableState) / f52222), 0.0f);
                min = Math.min(Slider$lambda$6(mutableState) / f52222, max);
                Slider$lambda$16 = (Slider$lambda$16(mutableState2) - Slider$lambda$6(mutableState)) * calcFraction2222;
                startRestartGroup.startReplaceGroup(-1224400529);
                int i152222 = i142222 & 14;
                i7 = (57344 & i142222) ^ 24576;
                changed = (i152222 == 4) | startRestartGroup.changed(min) | startRestartGroup.changed(max) | ((i7 <= 16384 && startRestartGroup.changed(closedFloatingPointRange3)) || (i142222 & 24576) == 16384);
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                mutableState3 = mutableState2;
                f = Slider$lambda$16;
                modifier4 = modifier3;
                mutableState4 = mutableState;
                z4 = z3;
                coroutineScope2 = coroutineScope;
                i8 = 16384;
                i9 = i7;
                f2 = max;
                rememberedValue7 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Slider$lambda$19$lambda$18;
                        Slider$lambda$19$lambda$18 = SliderKt.Slider$lambda$19$lambda$18(min, f2, sliderState, mutableState52222, mutableFloatState2222, closedFloatingPointRange3, ((Float) obj).floatValue());
                        return Slider$lambda$19$lambda$18;
                    }
                };
                f3 = min;
                state = sliderState;
                mutableState52222 = mutableState52222;
                startRestartGroup.updateRememberedValue(rememberedValue7);
                startRestartGroup.endReplaceGroup();
                DraggableState rememberDraggableState2222 = DraggableKt.rememberDraggableState((Function1) rememberedValue7, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(-1746271574);
                changed2 = ((i9 <= i8 && startRestartGroup.changed(closedFloatingPointRange3)) || (i142222 & 24576) == i8) | startRestartGroup.changed(f3) | startRestartGroup.changed(f2);
                rememberedValue8 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue8 = new SliderKt$Slider$1$1(closedFloatingPointRange3, f3, f2);
                startRestartGroup.updateRememberedValue(rememberedValue8);
                startRestartGroup.endReplaceGroup();
                Function1 function12222 = (Function1) ((KFunction) rememberedValue8);
                startRestartGroup.startReplaceGroup(5004770);
                if (i152222 == 4) {
                }
                rememberedValue9 = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue9 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit Slider$lambda$22$lambda$21;
                        Slider$lambda$22$lambda$21 = SliderKt.Slider$lambda$22$lambda$21(SliderState.this, ((Float) obj).floatValue());
                        return Slider$lambda$22$lambda$21;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
                startRestartGroup.endReplaceGroup();
                Modifier modifier62222 = modifier4;
                CorrectValueSideEffect(function12222, (Function1) rememberedValue9, closedFloatingPointRange3, RangesKt.rangeTo(f3, f2), state.getValue(), startRestartGroup, (i142222 >> 6) & 896);
                startRestartGroup = startRestartGroup;
                Modifier.Companion companion3222 = Modifier.INSTANCE;
                Object[] objArr3222 = {rememberDraggableState2222, mutableInteractionSource42222, Float.valueOf(f2), Boolean.valueOf(z4)};
                startRestartGroup.startReplaceGroup(-1224400529);
                int i162222 = i142222 & 896;
                boolean z92222 = z4;
                changed3 = (i162222 == 256) | startRestartGroup.changed(z92222) | startRestartGroup.changed(f2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(rememberDraggableState2222);
                Object rememberedValue152222 = startRestartGroup.rememberedValue();
                if (changed3) {
                }
                SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$122222 = new SliderKt$Slider$dragOnTap$1$1(z82222, z92222, f4, coroutineScope2, mutableState52222, mutableFloatState2222, rememberDraggableState2222, focusRequester22222);
                closedFloatingPointRange4 = closedFloatingPointRange3;
                z6 = z82222;
                draggableState = rememberDraggableState2222;
                focusRequester = focusRequester22222;
                sliderKt$Slider$dragOnTap$1$1 = sliderKt$Slider$dragOnTap$1$122222;
                startRestartGroup.updateRememberedValue(sliderKt$Slider$dragOnTap$1$1);
                startRestartGroup.endReplaceGroup();
                Modifier pointerInput22222 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion3222, objArr3222, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
                Object[] objArr222222 = {draggableState, mutableInteractionSource42222, Boolean.valueOf(z6)};
                startRestartGroup.startReplaceGroup(-1746271574);
                DraggableState draggableState222222 = draggableState;
                changedInstance = (i162222 != 256) | ((i142222 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
                rememberedValue10 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

                    /* compiled from: Slider.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
                    /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ CoroutineContext $currentContext;
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ CoroutineScope $scope;
                        private /* synthetic */ Object L$0;
                        Object L$1;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$currentContext = coroutineContext;
                            this.$interactionSource = mutableInteractionSource;
                            this.$scope = coroutineScope;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                            anonymousClass1.L$0 = obj;
                            return anonymousClass1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                            */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                            /*
                                r12 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r12.label
                                r2 = 2
                                r3 = 1
                                r4 = 0
                                if (r1 == 0) goto L2c
                                if (r1 == r3) goto L23
                                if (r1 != r2) goto L1b
                                java.lang.Object r1 = r12.L$1
                                androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                                java.lang.Object r5 = r12.L$0
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                                goto L82
                            L1b:
                                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r13.<init>(r0)
                                throw r13
                            L23:
                                java.lang.Object r1 = r12.L$0
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                                kotlin.ResultKt.throwOnFailure(r13)
                                r5 = r1
                                goto L50
                            L2c:
                                kotlin.ResultKt.throwOnFailure(r13)
                                java.lang.Object r13 = r12.L$0
                                androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                                r5 = r13
                            L34:
                                kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                                boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                                if (r13 == 0) goto L9a
                                r8 = r12
                                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                                r12.L$0 = r5
                                r12.L$1 = r4
                                r12.label = r3
                                r6 = 0
                                r7 = 0
                                r9 = 3
                                r10 = 0
                                java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                                if (r13 != r0) goto L50
                                goto L81
                            L50:
                                androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                                androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                                long r6 = r13.getPosition()
                                r1.<init>(r6, r4)
                                androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                if (r13 == 0) goto L72
                                kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                                androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                r13.<init>(r7, r1, r4)
                                r9 = r13
                                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                r10 = 3
                                r11 = 0
                                r7 = 0
                                r8 = 0
                                kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                            L72:
                                r13 = r12
                                kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                                r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                                r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                                r12.label = r2     // Catch: java.lang.Exception -> L82
                                java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                                if (r13 != r0) goto L82
                            L81:
                                return r0
                            L82:
                                androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                                if (r13 == 0) goto L34
                                kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                                com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                                androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                                r13.<init>(r7, r1, r4)
                                r9 = r13
                                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                                r10 = 3
                                r11 = 0
                                r7 = 0
                                r8 = 0
                                kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                                goto L34
                            L9a:
                                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                return r13
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        /* compiled from: Slider.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                        static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ PressInteraction.Press $press;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                                super(2, continuation);
                                this.$interactionSource = mutableInteractionSource;
                                this.$press = press;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C00691(this.$interactionSource, this.$press, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* compiled from: Slider.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ MutableInteractionSource $interactionSource;
                            final /* synthetic */ PressInteraction.Press $press;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                                super(2, continuation);
                                this.$interactionSource = mutableInteractionSource;
                                this.$press = press;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                        CoroutineContext context = continuation.getContext();
                        if (z6) {
                            Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource42222, coroutineScope2, null), continuation);
                            return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
                startRestartGroup.endReplaceGroup();
                Modifier sliderKeyboardInteractions22222 = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput22222, objArr222222, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource42222), z6, state);
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue11 = startRestartGroup.rememberedValue();
                if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                Orientation orientation422222 = orientation2;
                Modifier draggable$default22222 = DraggableKt.draggable$default(sliderKeyboardInteractions22222, draggableState222222, orientation422222, false, mutableInteractionSource42222, false, (Function3) rememberedValue11, null, false, 212, null);
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier then22222 = modifier62222.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default22222, (Function1) rememberedValue12), z6, state, coerceIn2222));
                Alignment centerStart22222 = Alignment.INSTANCE.getCenterStart();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy32222 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart22222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, then22222);
                Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy32222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance32222 = BoxScopeInstance.INSTANCE;
                track.invoke(startRestartGroup, Integer.valueOf((i142222 >> 18) & 14));
                Modifier.Companion companion222222 = Modifier.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                rememberedValue13 = startRestartGroup.rememberedValue();
                if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                Modifier onSizeChanged22222 = OnRemeasuredModifierKt.onSizeChanged(companion222222, (Function1) rememberedValue13);
                startRestartGroup.startReplaceGroup(5004770);
                final float f622222 = f;
                changed4 = startRestartGroup.changed(f622222);
                rememberedValue14 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        IntOffset Slider$lambda$33$lambda$31$lambda$30;
                        Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f622222, (Density) obj);
                        return Slider$lambda$33$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue14);
                startRestartGroup.endReplaceGroup();
                Modifier offset22222 = OffsetKt.offset(onSizeChanged22222, (Function1) rememberedValue14);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, offset22222);
                Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl2.getInserting()) {
                }
                m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
                Updater.m4983setimpl(m4976constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222222 = BoxScopeInstance.INSTANCE;
                thumb = function2;
                thumb.invoke(startRestartGroup, Integer.valueOf((i142222 >> 21) & 14));
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier5 = modifier62222;
                z7 = z6;
                orientation3 = orientation422222;
                mutableInteractionSource3 = mutableInteractionSource42222;
                closedFloatingPointRange5 = closedFloatingPointRange4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i3 |= i11;
            if ((i2 & 128) == 0) {
            }
            i3 |= i10;
            if ((4793491 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i13 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            orientation2 = orientation;
            final MutableInteractionSource mutableInteractionSource422222 = mutableInteractionSource2;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            boolean z822222 = z2;
            int i1422222 = i3;
            modifier3 = modifier2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22222 = startRestartGroup.consume(localLayoutDirection22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (consume22222 == LayoutDirection.Rtl) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState522222 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableFloatState mutableFloatState22222 = (MutableFloatState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            float coerceIn22222 = RangesKt.coerceIn(state.getValue(), closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue());
            float calcFraction22222 = calcFraction(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), coerceIn22222);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            FocusRequester focusRequester222222 = (FocusRequester) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState2 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            coroutineScope = (CoroutineScope) rememberedValue6;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float Slider$lambda$16222222 = Slider$lambda$16(mutableState2);
            float f522222 = 2;
            max = Math.max(Slider$lambda$16222222 - (Slider$lambda$6(mutableState) / f522222), 0.0f);
            min = Math.min(Slider$lambda$6(mutableState) / f522222, max);
            Slider$lambda$16 = (Slider$lambda$16(mutableState2) - Slider$lambda$6(mutableState)) * calcFraction22222;
            startRestartGroup.startReplaceGroup(-1224400529);
            int i1522222 = i1422222 & 14;
            i7 = (57344 & i1422222) ^ 24576;
            changed = (i1522222 == 4) | startRestartGroup.changed(min) | startRestartGroup.changed(max) | ((i7 <= 16384 && startRestartGroup.changed(closedFloatingPointRange3)) || (i1422222 & 24576) == 16384);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            mutableState3 = mutableState2;
            f = Slider$lambda$16;
            modifier4 = modifier3;
            mutableState4 = mutableState;
            z4 = z3;
            coroutineScope2 = coroutineScope;
            i8 = 16384;
            i9 = i7;
            f2 = max;
            rememberedValue7 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Slider$lambda$19$lambda$18;
                    Slider$lambda$19$lambda$18 = SliderKt.Slider$lambda$19$lambda$18(min, f2, sliderState, mutableState522222, mutableFloatState22222, closedFloatingPointRange3, ((Float) obj).floatValue());
                    return Slider$lambda$19$lambda$18;
                }
            };
            f3 = min;
            state = sliderState;
            mutableState522222 = mutableState522222;
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceGroup();
            DraggableState rememberDraggableState22222 = DraggableKt.rememberDraggableState((Function1) rememberedValue7, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1746271574);
            changed2 = ((i9 <= i8 && startRestartGroup.changed(closedFloatingPointRange3)) || (i1422222 & 24576) == i8) | startRestartGroup.changed(f3) | startRestartGroup.changed(f2);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue8 = new SliderKt$Slider$1$1(closedFloatingPointRange3, f3, f2);
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceGroup();
            Function1 function122222 = (Function1) ((KFunction) rememberedValue8);
            startRestartGroup.startReplaceGroup(5004770);
            if (i1522222 == 4) {
            }
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue9 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit Slider$lambda$22$lambda$21;
                    Slider$lambda$22$lambda$21 = SliderKt.Slider$lambda$22$lambda$21(SliderState.this, ((Float) obj).floatValue());
                    return Slider$lambda$22$lambda$21;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
            startRestartGroup.endReplaceGroup();
            Modifier modifier622222 = modifier4;
            CorrectValueSideEffect(function122222, (Function1) rememberedValue9, closedFloatingPointRange3, RangesKt.rangeTo(f3, f2), state.getValue(), startRestartGroup, (i1422222 >> 6) & 896);
            startRestartGroup = startRestartGroup;
            Modifier.Companion companion32222 = Modifier.INSTANCE;
            Object[] objArr32222 = {rememberDraggableState22222, mutableInteractionSource422222, Float.valueOf(f2), Boolean.valueOf(z4)};
            startRestartGroup.startReplaceGroup(-1224400529);
            int i1622222 = i1422222 & 896;
            boolean z922222 = z4;
            changed3 = (i1622222 == 256) | startRestartGroup.changed(z922222) | startRestartGroup.changed(f2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(rememberDraggableState22222);
            Object rememberedValue1522222 = startRestartGroup.rememberedValue();
            if (changed3) {
            }
            SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$1222222 = new SliderKt$Slider$dragOnTap$1$1(z822222, z922222, f4, coroutineScope2, mutableState522222, mutableFloatState22222, rememberDraggableState22222, focusRequester222222);
            closedFloatingPointRange4 = closedFloatingPointRange3;
            z6 = z822222;
            draggableState = rememberDraggableState22222;
            focusRequester = focusRequester222222;
            sliderKt$Slider$dragOnTap$1$1 = sliderKt$Slider$dragOnTap$1$1222222;
            startRestartGroup.updateRememberedValue(sliderKt$Slider$dragOnTap$1$1);
            startRestartGroup.endReplaceGroup();
            Modifier pointerInput222222 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion32222, objArr32222, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
            Object[] objArr2222222 = {draggableState, mutableInteractionSource422222, Boolean.valueOf(z6)};
            startRestartGroup.startReplaceGroup(-1746271574);
            DraggableState draggableState2222222 = draggableState;
            changedInstance = (i1622222 != 256) | ((i1422222 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
                /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CoroutineContext $currentContext;
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ CoroutineScope $scope;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$currentContext = coroutineContext;
                        this.$interactionSource = mutableInteractionSource;
                        this.$scope = coroutineScope;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                        */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                        /*
                            r12 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r12.label
                            r2 = 2
                            r3 = 1
                            r4 = 0
                            if (r1 == 0) goto L2c
                            if (r1 == r3) goto L23
                            if (r1 != r2) goto L1b
                            java.lang.Object r1 = r12.L$1
                            androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                            java.lang.Object r5 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                            kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                            goto L82
                        L1b:
                            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r13.<init>(r0)
                            throw r13
                        L23:
                            java.lang.Object r1 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                            kotlin.ResultKt.throwOnFailure(r13)
                            r5 = r1
                            goto L50
                        L2c:
                            kotlin.ResultKt.throwOnFailure(r13)
                            java.lang.Object r13 = r12.L$0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                            r5 = r13
                        L34:
                            kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                            boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                            if (r13 == 0) goto L9a
                            r8 = r12
                            kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                            r12.L$0 = r5
                            r12.L$1 = r4
                            r12.label = r3
                            r6 = 0
                            r7 = 0
                            r9 = 3
                            r10 = 0
                            java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                            if (r13 != r0) goto L50
                            goto L81
                        L50:
                            androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                            androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                            long r6 = r13.getPosition()
                            r1.<init>(r6, r4)
                            androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                            if (r13 == 0) goto L72
                            kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                            com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                            r13.<init>(r7, r1, r4)
                            r9 = r13
                            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                            r10 = 3
                            r11 = 0
                            r7 = 0
                            r8 = 0
                            kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                        L72:
                            r13 = r12
                            kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                            r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                            r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                            r12.label = r2     // Catch: java.lang.Exception -> L82
                            java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                            if (r13 != r0) goto L82
                        L81:
                            return r0
                        L82:
                            androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                            if (r13 == 0) goto L34
                            kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                            com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                            r13.<init>(r7, r1, r4)
                            r9 = r13
                            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                            r10 = 3
                            r11 = 0
                            r7 = 0
                            r8 = 0
                            kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                            goto L34
                        L9a:
                            kotlin.Unit r13 = kotlin.Unit.INSTANCE
                            return r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    /* compiled from: Slider.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ PressInteraction.Press $press;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                            super(2, continuation);
                            this.$interactionSource = mutableInteractionSource;
                            this.$press = press;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C00691(this.$interactionSource, this.$press, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: Slider.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ MutableInteractionSource $interactionSource;
                        final /* synthetic */ PressInteraction.Press $press;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                            super(2, continuation);
                            this.$interactionSource = mutableInteractionSource;
                            this.$press = press;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }

                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    CoroutineContext context = continuation.getContext();
                    if (z6) {
                        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource422222, coroutineScope2, null), continuation);
                        return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue10);
            startRestartGroup.endReplaceGroup();
            Modifier sliderKeyboardInteractions222222 = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput222222, objArr2222222, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource422222), z6, state);
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Orientation orientation4222222 = orientation2;
            Modifier draggable$default222222 = DraggableKt.draggable$default(sliderKeyboardInteractions222222, draggableState2222222, orientation4222222, false, mutableInteractionSource422222, false, (Function3) rememberedValue11, null, false, 212, null);
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier then222222 = modifier622222.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default222222, (Function1) rememberedValue12), z6, state, coerceIn22222));
            Alignment centerStart222222 = Alignment.INSTANCE.getCenterStart();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy322222 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart222222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322222 = ComposedModifierKt.materializeModifier(startRestartGroup, then222222);
            Function0<ComposeUiNode> constructor322222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy322222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap322222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322222);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier322222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance322222 = BoxScopeInstance.INSTANCE;
            track.invoke(startRestartGroup, Integer.valueOf((i1422222 >> 18) & 14));
            Modifier.Companion companion2222222 = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue13 = startRestartGroup.rememberedValue();
            if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier onSizeChanged222222 = OnRemeasuredModifierKt.onSizeChanged(companion2222222, (Function1) rememberedValue13);
            startRestartGroup.startReplaceGroup(5004770);
            final float f6222222 = f;
            changed4 = startRestartGroup.changed(f6222222);
            rememberedValue14 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    IntOffset Slider$lambda$33$lambda$31$lambda$30;
                    Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f6222222, (Density) obj);
                    return Slider$lambda$33$lambda$31$lambda$30;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue14);
            startRestartGroup.endReplaceGroup();
            Modifier offset222222 = OffsetKt.offset(onSizeChanged222222, (Function1) rememberedValue14);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222222 = ComposedModifierKt.materializeModifier(startRestartGroup, offset222222);
            Function0<ComposeUiNode> constructor2222222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl2.getInserting()) {
            }
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222222);
            Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2222222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222222 = BoxScopeInstance.INSTANCE;
            thumb = function2;
            thumb.invoke(startRestartGroup, Integer.valueOf((i1422222 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier5 = modifier622222;
            z7 = z6;
            orientation3 = orientation4222222;
            mutableInteractionSource3 = mutableInteractionSource422222;
            closedFloatingPointRange5 = closedFloatingPointRange4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i3 |= i11;
        if ((i2 & 128) == 0) {
        }
        i3 |= i10;
        if ((4793491 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i13 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        orientation2 = orientation;
        final MutableInteractionSource mutableInteractionSource4222222 = mutableInteractionSource2;
        closedFloatingPointRange3 = closedFloatingPointRange2;
        boolean z8222222 = z2;
        int i14222222 = i3;
        modifier3 = modifier2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222222 = startRestartGroup.consume(localLayoutDirection222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (consume222222 == LayoutDirection.Rtl) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState5222222 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableFloatState mutableFloatState222222 = (MutableFloatState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        float coerceIn222222 = RangesKt.coerceIn(state.getValue(), closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue());
        float calcFraction222222 = calcFraction(closedFloatingPointRange3.getStart().floatValue(), closedFloatingPointRange3.getEndInclusive().floatValue(), coerceIn222222);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        FocusRequester focusRequester2222222 = (FocusRequester) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        coroutineScope = (CoroutineScope) rememberedValue6;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float Slider$lambda$162222222 = Slider$lambda$16(mutableState2);
        float f5222222 = 2;
        max = Math.max(Slider$lambda$162222222 - (Slider$lambda$6(mutableState) / f5222222), 0.0f);
        min = Math.min(Slider$lambda$6(mutableState) / f5222222, max);
        Slider$lambda$16 = (Slider$lambda$16(mutableState2) - Slider$lambda$6(mutableState)) * calcFraction222222;
        startRestartGroup.startReplaceGroup(-1224400529);
        int i15222222 = i14222222 & 14;
        i7 = (57344 & i14222222) ^ 24576;
        changed = (i15222222 == 4) | startRestartGroup.changed(min) | startRestartGroup.changed(max) | ((i7 <= 16384 && startRestartGroup.changed(closedFloatingPointRange3)) || (i14222222 & 24576) == 16384);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        mutableState3 = mutableState2;
        f = Slider$lambda$16;
        modifier4 = modifier3;
        mutableState4 = mutableState;
        z4 = z3;
        coroutineScope2 = coroutineScope;
        i8 = 16384;
        i9 = i7;
        f2 = max;
        rememberedValue7 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Slider$lambda$19$lambda$18;
                Slider$lambda$19$lambda$18 = SliderKt.Slider$lambda$19$lambda$18(min, f2, sliderState, mutableState5222222, mutableFloatState222222, closedFloatingPointRange3, ((Float) obj).floatValue());
                return Slider$lambda$19$lambda$18;
            }
        };
        f3 = min;
        state = sliderState;
        mutableState5222222 = mutableState5222222;
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        DraggableState rememberDraggableState222222 = DraggableKt.rememberDraggableState((Function1) rememberedValue7, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed2 = ((i9 <= i8 && startRestartGroup.changed(closedFloatingPointRange3)) || (i14222222 & 24576) == i8) | startRestartGroup.changed(f3) | startRestartGroup.changed(f2);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue8 = new SliderKt$Slider$1$1(closedFloatingPointRange3, f3, f2);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        Function1 function1222222 = (Function1) ((KFunction) rememberedValue8);
        startRestartGroup.startReplaceGroup(5004770);
        if (i15222222 == 4) {
        }
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue9 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit Slider$lambda$22$lambda$21;
                Slider$lambda$22$lambda$21 = SliderKt.Slider$lambda$22$lambda$21(SliderState.this, ((Float) obj).floatValue());
                return Slider$lambda$22$lambda$21;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceGroup();
        Modifier modifier6222222 = modifier4;
        CorrectValueSideEffect(function1222222, (Function1) rememberedValue9, closedFloatingPointRange3, RangesKt.rangeTo(f3, f2), state.getValue(), startRestartGroup, (i14222222 >> 6) & 896);
        startRestartGroup = startRestartGroup;
        Modifier.Companion companion322222 = Modifier.INSTANCE;
        Object[] objArr322222 = {rememberDraggableState222222, mutableInteractionSource4222222, Float.valueOf(f2), Boolean.valueOf(z4)};
        startRestartGroup.startReplaceGroup(-1224400529);
        int i16222222 = i14222222 & 896;
        boolean z9222222 = z4;
        changed3 = (i16222222 == 256) | startRestartGroup.changed(z9222222) | startRestartGroup.changed(f2) | startRestartGroup.changedInstance(coroutineScope2) | startRestartGroup.changedInstance(rememberDraggableState222222);
        Object rememberedValue15222222 = startRestartGroup.rememberedValue();
        if (changed3) {
        }
        SliderKt$Slider$dragOnTap$1$1 sliderKt$Slider$dragOnTap$1$12222222 = new SliderKt$Slider$dragOnTap$1$1(z8222222, z9222222, f4, coroutineScope2, mutableState5222222, mutableFloatState222222, rememberDraggableState222222, focusRequester2222222);
        closedFloatingPointRange4 = closedFloatingPointRange3;
        z6 = z8222222;
        draggableState = rememberDraggableState222222;
        focusRequester = focusRequester2222222;
        sliderKt$Slider$dragOnTap$1$1 = sliderKt$Slider$dragOnTap$1$12222222;
        startRestartGroup.updateRememberedValue(sliderKt$Slider$dragOnTap$1$1);
        startRestartGroup.endReplaceGroup();
        Modifier pointerInput2222222 = SuspendingPointerInputFilterKt.pointerInput((Modifier) companion322222, objArr322222, (PointerInputEventHandler) sliderKt$Slider$dragOnTap$1$1);
        Object[] objArr22222222 = {draggableState, mutableInteractionSource4222222, Boolean.valueOf(z6)};
        startRestartGroup.startReplaceGroup(-1746271574);
        DraggableState draggableState22222222 = draggableState;
        changedInstance = (i16222222 != 256) | ((i14222222 & 7168) == 2048) | startRestartGroup.changedInstance(coroutineScope2);
        rememberedValue10 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue10 = new PointerInputEventHandler() { // from class: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1

            /* compiled from: Slider.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1", f = "Slider.kt", i = {0, 1, 1}, l = {250, 257}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "press"}, s = {"L$0", "L$0", "L$1"})
            /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineContext $currentContext;
                final /* synthetic */ MutableInteractionSource $interactionSource;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CoroutineContext coroutineContext, MutableInteractionSource mutableInteractionSource, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$currentContext = coroutineContext;
                    this.$interactionSource = mutableInteractionSource;
                    this.$scope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$interactionSource, this.$scope, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0082
                    */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r12.label
                        r2 = 2
                        r3 = 1
                        r4 = 0
                        if (r1 == 0) goto L2c
                        if (r1 == r3) goto L23
                        if (r1 != r2) goto L1b
                        java.lang.Object r1 = r12.L$1
                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = (androidx.compose.foundation.interaction.PressInteraction.Press) r1
                        java.lang.Object r5 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Exception -> L82
                        goto L82
                    L1b:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L23:
                        java.lang.Object r1 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r13)
                        r5 = r1
                        goto L50
                    L2c:
                        kotlin.ResultKt.throwOnFailure(r13)
                        java.lang.Object r13 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                        r5 = r13
                    L34:
                        kotlin.coroutines.CoroutineContext r13 = r12.$currentContext
                        boolean r13 = kotlinx.coroutines.JobKt.isActive(r13)
                        if (r13 == 0) goto L9a
                        r8 = r12
                        kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                        r12.L$0 = r5
                        r12.L$1 = r4
                        r12.label = r3
                        r6 = 0
                        r7 = 0
                        r9 = 3
                        r10 = 0
                        java.lang.Object r13 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r5, r6, r7, r8, r9, r10)
                        if (r13 != r0) goto L50
                        goto L81
                    L50:
                        androidx.compose.ui.input.pointer.PointerInputChange r13 = (androidx.compose.ui.input.pointer.PointerInputChange) r13
                        androidx.compose.foundation.interaction.PressInteraction$Press r1 = new androidx.compose.foundation.interaction.PressInteraction$Press
                        long r6 = r13.getPosition()
                        r1.<init>(r6, r4)
                        androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                        if (r13 == 0) goto L72
                        kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                        com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1
                        androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                        r13.<init>(r7, r1, r4)
                        r9 = r13
                        kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                    L72:
                        r13 = r12
                        kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13     // Catch: java.lang.Exception -> L82
                        r12.L$0 = r5     // Catch: java.lang.Exception -> L82
                        r12.L$1 = r1     // Catch: java.lang.Exception -> L82
                        r12.label = r2     // Catch: java.lang.Exception -> L82
                        java.lang.Object r13 = com.composeunstyled.SliderKt.waitRelease$default(r5, r4, r13, r3, r4)     // Catch: java.lang.Exception -> L82
                        if (r13 != r0) goto L82
                    L81:
                        return r0
                    L82:
                        androidx.compose.foundation.interaction.MutableInteractionSource r13 = r12.$interactionSource
                        if (r13 == 0) goto L34
                        kotlinx.coroutines.CoroutineScope r6 = r12.$scope
                        com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3 r13 = new com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3
                        androidx.compose.foundation.interaction.MutableInteractionSource r7 = r12.$interactionSource
                        r13.<init>(r7, r1, r4)
                        r9 = r13
                        kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                        goto L34
                    L9a:
                        kotlin.Unit r13 = kotlin.Unit.INSTANCE
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1", f = "Slider.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ PressInteraction.Press $press;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00691(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super C00691> continuation) {
                        super(2, continuation);
                        this.$interactionSource = mutableInteractionSource;
                        this.$press = press;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C00691(this.$interactionSource, this.$press, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C00691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$interactionSource.emit(this.$press, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: Slider.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3", f = "Slider.kt", i = {}, l = {261}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.composeunstyled.SliderKt$Slider$dragOnTap$2$1$1$3, reason: invalid class name */
                static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ MutableInteractionSource $interactionSource;
                    final /* synthetic */ PressInteraction.Press $press;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.$interactionSource = mutableInteractionSource;
                        this.$press = press;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass3(this.$interactionSource, this.$press, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$interactionSource.emit(new PressInteraction.Release(this.$press), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                CoroutineContext context = continuation.getContext();
                if (z6) {
                    Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass1(context, mutableInteractionSource4222222, coroutineScope2, null), continuation);
                    return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue10);
        startRestartGroup.endReplaceGroup();
        Modifier sliderKeyboardInteractions2222222 = sliderKeyboardInteractions(FocusableKt.focusable(FocusRequesterModifierKt.focusRequester(SuspendingPointerInputFilterKt.pointerInput(pointerInput2222222, objArr22222222, (PointerInputEventHandler) rememberedValue10), focusRequester), z6, mutableInteractionSource4222222), z6, state);
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue11 = startRestartGroup.rememberedValue();
        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Orientation orientation42222222 = orientation2;
        Modifier draggable$default2222222 = DraggableKt.draggable$default(sliderKeyboardInteractions2222222, draggableState22222222, orientation42222222, false, mutableInteractionSource4222222, false, (Function3) rememberedValue11, null, false, 212, null);
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue12 = startRestartGroup.rememberedValue();
        if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier then2222222 = modifier6222222.then(sliderSemantics(OnRemeasuredModifierKt.onSizeChanged(draggable$default2222222, (Function1) rememberedValue12), z6, state, coerceIn222222));
        Alignment centerStart2222222 = Alignment.INSTANCE.getCenterStart();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy3222222 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart2222222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222222 = ComposedModifierKt.materializeModifier(startRestartGroup, then2222222);
        Function0<ComposeUiNode> constructor3222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy3222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap3222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier3222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance3222222 = BoxScopeInstance.INSTANCE;
        track.invoke(startRestartGroup, Integer.valueOf((i14222222 >> 18) & 14));
        Modifier.Companion companion22222222 = Modifier.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue13 = startRestartGroup.rememberedValue();
        if (rememberedValue13 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier onSizeChanged2222222 = OnRemeasuredModifierKt.onSizeChanged(companion22222222, (Function1) rememberedValue13);
        startRestartGroup.startReplaceGroup(5004770);
        final float f62222222 = f;
        changed4 = startRestartGroup.changed(f62222222);
        rememberedValue14 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue14 = new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                IntOffset Slider$lambda$33$lambda$31$lambda$30;
                Slider$lambda$33$lambda$31$lambda$30 = SliderKt.Slider$lambda$33$lambda$31$lambda$30(f62222222, (Density) obj);
                return Slider$lambda$33$lambda$31$lambda$30;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue14);
        startRestartGroup.endReplaceGroup();
        Modifier offset2222222 = OffsetKt.offset(onSizeChanged2222222, (Function1) rememberedValue14);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222222 = ComposedModifierKt.materializeModifier(startRestartGroup, offset2222222);
        Function0<ComposeUiNode> constructor22222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl2 = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy22222222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap22222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl2.getInserting()) {
        }
        m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222222);
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier22222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222222 = BoxScopeInstance.INSTANCE;
        thumb = function2;
        thumb.invoke(startRestartGroup, Integer.valueOf((i14222222 >> 21) & 14));
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier5 = modifier6222222;
        z7 = z6;
        orientation3 = orientation42222222;
        mutableInteractionSource3 = mutableInteractionSource4222222;
        closedFloatingPointRange5 = closedFloatingPointRange4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final float Slider$lambda$6(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void Slider$lambda$7(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final void Slider$lambda$10(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Slider$lambda$9(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final float Slider$lambda$12(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    private static final float Slider$lambda$16(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void Slider$lambda$17(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    private static final float Slider$scaleToUserValue(float f, float f2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f3) {
        return scale(f, f2, f3, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Slider$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, float f2, float f3) {
        return scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f3, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$19$lambda$18(float f, float f2, SliderState sliderState, MutableState mutableState, MutableFloatState mutableFloatState, ClosedFloatingPointRange closedFloatingPointRange, float f3) {
        Slider$lambda$10(mutableState, Slider$lambda$9(mutableState) + f3 + Slider$lambda$12(mutableFloatState));
        mutableFloatState.setFloatValue(0.0f);
        sliderState.setValue(Slider$scaleToUserValue(f, f2, closedFloatingPointRange, RangesKt.coerceIn(Slider$lambda$9(mutableState), f, f2)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$22$lambda$21(SliderState sliderState, float f) {
        sliderState.setValue(f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$27$lambda$26(MutableState mutableState, IntSize intSize) {
        Slider$lambda$17(mutableState, (int) (intSize.m8576unboximpl() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Slider$lambda$33$lambda$29$lambda$28(MutableState mutableState, IntSize intSize) {
        Slider$lambda$7(mutableState, (int) (intSize.m8576unboximpl() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset Slider$lambda$33$lambda$31$lambda$30(float f, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8520boximpl(IntOffset.m8523constructorimpl((MathKt.roundToInt(f) << 32) | (0 & 4294967295L)));
    }

    private static final Modifier sliderSemantics(Modifier modifier, final boolean z, final SliderState sliderState, final float f) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit sliderSemantics$lambda$36;
                sliderSemantics$lambda$36 = SliderKt.sliderSemantics$lambda$36(z, sliderState, f, (SemanticsPropertyReceiver) obj);
                return sliderSemantics$lambda$36;
            }
        }, 1, null), sliderState.getValue(), RangesKt.rangeTo(sliderState.getValueRange$core_release().getStart().floatValue(), sliderState.getValueRange$core_release().getEndInclusive().floatValue()), sliderState.getSteps());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sliderSemantics$lambda$36(boolean z, final SliderState sliderState, final float f, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        if (!z) {
            SemanticsPropertiesKt.disabled(semantics);
        }
        SemanticsPropertiesKt.setProgress$default(semantics, null, new Function1() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean sliderSemantics$lambda$36$lambda$35;
                sliderSemantics$lambda$36$lambda$35 = SliderKt.sliderSemantics$lambda$36$lambda$35(SliderState.this, f, ((Float) obj).floatValue());
                return Boolean.valueOf(sliderSemantics$lambda$36$lambda$35);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sliderSemantics$lambda$36$lambda$35(SliderState sliderState, float f, float f2) {
        int steps;
        float coerceIn = RangesKt.coerceIn(f2, sliderState.getValueRange$core_release().getStart().floatValue(), sliderState.getValueRange$core_release().getEndInclusive().floatValue());
        if (sliderState.getSteps() > 0 && (steps = sliderState.getSteps() + 1) >= 0) {
            float f3 = coerceIn;
            float f4 = f3;
            int i = 0;
            while (true) {
                float lerp = MathHelpersKt.lerp(sliderState.getValueRange$core_release().getStart().floatValue(), sliderState.getValueRange$core_release().getEndInclusive().floatValue(), i / (sliderState.getSteps() + 1));
                float f5 = lerp - coerceIn;
                if (Math.abs(f5) <= f3) {
                    f3 = Math.abs(f5);
                    f4 = lerp;
                }
                if (i == steps) {
                    break;
                }
                i++;
            }
            coerceIn = f4;
        }
        if (coerceIn == f) {
            return false;
        }
        sliderState.setValue(coerceIn);
        return true;
    }

    private static final Modifier sliderKeyboardInteractions(Modifier modifier, boolean z, final SliderState sliderState) {
        return !z ? modifier : KeyInputModifierKt.onKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: com.composeunstyled.SliderKt$sliderKeyboardInteractions$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m9536invokeZmokQxo(keyEvent.m6792unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m9536invokeZmokQxo(android.view.KeyEvent event) {
                float floatValue;
                Intrinsics.checkNotNullParameter(event, "event");
                if (SliderState.this.getSteps() > 0) {
                    floatValue = (SliderState.this.getValueRange$core_release().getEndInclusive().floatValue() - SliderState.this.getValueRange$core_release().getStart().floatValue()) / SliderState.this.getSteps();
                } else {
                    floatValue = (SliderState.this.getValueRange$core_release().getEndInclusive().floatValue() - SliderState.this.getValueRange$core_release().getStart().floatValue()) * 0.01f;
                }
                float f = 2 * floatValue;
                long m6803getKeyZmokQxo = KeyEvent_androidKt.m6803getKeyZmokQxo(event);
                boolean z2 = true;
                if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6572getDirectionRightEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6573getDirectionUpEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        SliderState sliderState2 = SliderState.this;
                        sliderState2.setValue(sliderState2.getValue() + floatValue);
                    }
                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6571getDirectionLeftEK5gGoQ()) || Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6568getDirectionDownEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        SliderState sliderState3 = SliderState.this;
                        sliderState3.setValue(sliderState3.getValue() - floatValue);
                    }
                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6610getHomeEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        SliderState sliderState4 = SliderState.this;
                        sliderState4.setValue(sliderState4.getValueRange$core_release().getStart().floatValue());
                    }
                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6646getMoveEndEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        SliderState sliderState5 = SliderState.this;
                        sliderState5.setValue(sliderState5.getValueRange$core_release().getEndInclusive().floatValue());
                    }
                } else if (Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6684getPageUpEK5gGoQ())) {
                    if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                        SliderState sliderState6 = SliderState.this;
                        sliderState6.setValue(sliderState6.getValue() + f);
                    }
                } else if (!Key.m6495equalsimpl0(m6803getKeyZmokQxo, Key.INSTANCE.m6683getPageDownEK5gGoQ())) {
                    z2 = false;
                } else if (UtilsKt.m9561isKeyDownZmokQxo(event)) {
                    SliderState sliderState7 = SliderState.this;
                    sliderState7.setValue(sliderState7.getValue() - f);
                }
                return Boolean.valueOf(z2);
            }
        });
    }

    private static final float scale(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, calcFraction(f, f2, f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* renamed from: Thumb-FNF3uiM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9533ThumbFNF3uiM(Modifier modifier, Shape shape, long j, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-876257303);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            j2 = j;
            i3 |= startRestartGroup.changed(j2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    shape = RectangleShapeKt.getRectangleShape();
                }
                long m5693getUnspecified0d7_KjU = i6 == 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-876257303, i3, -1, "com.composeunstyled.Thumb (Slider.kt:396)");
                }
                BoxKt.Box(SizeKt.m889size3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(modifier, shape), m5693getUnspecified0d7_KjU, null, 2, null), Dp.m8401constructorimpl(24)), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j3 = m5693getUnspecified0d7_KjU;
            } else {
                startRestartGroup.skipToGroupEnd();
                j3 = j2;
            }
            final Shape shape2 = shape;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier2 = modifier;
                endRestartGroup.updateScope(new Function2() { // from class: com.composeunstyled.SliderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit Thumb_FNF3uiM$lambda$37;
                        Thumb_FNF3uiM$lambda$37 = SliderKt.Thumb_FNF3uiM$lambda$37(Modifier.this, shape2, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return Thumb_FNF3uiM$lambda$37;
                    }
                });
                return;
            }
            return;
        }
        j2 = j;
        if ((i3 & 147) == 146) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        BoxKt.Box(SizeKt.m889size3ABfNKs(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(modifier, shape), m5693getUnspecified0d7_KjU, null, 2, null), Dp.m8401constructorimpl(24)), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        j3 = m5693getUnspecified0d7_KjU;
        final Shape shape22 = shape;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
