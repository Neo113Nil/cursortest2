package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class SliderKt$Slider$2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ State<Function1<Float, Unit>> $onValueChangeState;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$Slider$2(ClosedFloatingPointRange<Float> closedFloatingPointRange, float f, List<Float> list, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, boolean z, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state) {
        this.$valueRange = closedFloatingPointRange;
        this.$value = f;
        this.$tickFractions = list;
        this.$onValueChangeFinished = function0;
        this.$interactionSource = mutableInteractionSource;
        this.$enabled = z;
        this.$colors = sliderColors;
        this.$onValueChangeState = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i2;
        MutableFloatState mutableFloatState;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        final SliderDraggableState sliderDraggableState;
        Ref.FloatRef floatRef3;
        Ref.FloatRef floatRef4;
        Modifier sliderTapModifier;
        ComposerKt.sourceInformation(composer, "C195@9057L7,200@9218L7,211@9632L24,212@9681L54,213@9762L36,216@9841L420,225@10294L15,225@10271L83,228@10437L633,228@10399L671,259@11645L55,266@11999L210:Slider.kt#jmzs0o");
        if ((i & 6) == 0) {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i2 = i | (composer.changed(boxWithConstraintsScope2) ? 4 : 2);
        } else {
            boxWithConstraintsScope2 = boxWithConstraintsScope;
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2085116814, i2, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:195)");
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean z = consume == LayoutDirection.Rtl;
        float m8354getMaxWidthimpl = Constraints.m8354getMaxWidthimpl(boxWithConstraintsScope2.mo723getConstraintsmsEJaDk());
        final Ref.FloatRef floatRef5 = new Ref.FloatRef();
        final Ref.FloatRef floatRef6 = new Ref.FloatRef();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume2;
        floatRef5.element = Math.max(m8354getMaxWidthimpl - density.mo424toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
        floatRef6.element = Math.min(density.mo424toPx0680j_4(SliderKt.getThumbRadius()), floatRef5.element);
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1952447580, "CC(remember):Slider.kt#9igjgp");
        float f = this.$value;
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$valueRange;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange, floatRef6, floatRef5, f));
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1952445006, "CC(remember):Slider.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            composer.updateRememberedValue(rememberedValue3);
        }
        final MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue3;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1952442094, "CC(remember):Slider.kt#9igjgp");
        boolean changed = composer.changed(floatRef6.element) | composer.changed(floatRef5.element) | composer.changed(this.$valueRange);
        final State<Function1<Float, Unit>> state = this.$onValueChangeState;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            mutableFloatState = mutableFloatState3;
            floatRef = floatRef6;
            floatRef2 = floatRef5;
            rememberedValue4 = new SliderDraggableState(new Function1() { // from class: androidx.compose.material.SliderKt$Slider$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$4$lambda$3;
                    invoke$lambda$4$lambda$3 = SliderKt$Slider$2.invoke$lambda$4$lambda$3(MutableFloatState.this, mutableFloatState3, floatRef6, floatRef5, state, closedFloatingPointRange2, ((Float) obj).floatValue());
                    return invoke$lambda$4$lambda$3;
                }
            });
            composer.updateRememberedValue(rememberedValue4);
        } else {
            floatRef2 = floatRef5;
            floatRef = floatRef6;
            mutableFloatState = mutableFloatState3;
        }
        SliderDraggableState sliderDraggableState2 = (SliderDraggableState) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -1952428003, "CC(remember):Slider.kt#9igjgp");
        boolean changed2 = composer.changed(this.$valueRange) | composer.changed(floatRef.element) | composer.changed(floatRef2.element);
        ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$valueRange;
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = (KFunction) new SliderKt$Slider$2$2$1(closedFloatingPointRange3, floatRef, floatRef2);
            composer.updateRememberedValue(rememberedValue5);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SliderKt.CorrectValueSideEffect((Function1) ((KFunction) rememberedValue5), this.$valueRange, RangesKt.rangeTo(floatRef.element, floatRef2.element), mutableFloatState2, this.$value, composer, 3072);
        ComposerKt.sourceInformationMarkerStart(composer, -1952422809, "CC(remember):Slider.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(this.$tickFractions) | composer.changed(floatRef.element) | composer.changed(floatRef2.element) | composer.changedInstance(coroutineScope) | composer.changedInstance(sliderDraggableState2) | composer.changed(this.$onValueChangeFinished);
        final List<Float> list = this.$tickFractions;
        final Function0<Unit> function0 = this.$onValueChangeFinished;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            final Ref.FloatRef floatRef7 = floatRef;
            sliderDraggableState = sliderDraggableState2;
            final Ref.FloatRef floatRef8 = floatRef2;
            Object obj = new Function1() { // from class: androidx.compose.material.SliderKt$Slider$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invoke$lambda$7$lambda$6;
                    invoke$lambda$7$lambda$6 = SliderKt$Slider$2.invoke$lambda$7$lambda$6(MutableFloatState.this, list, floatRef7, floatRef8, coroutineScope, sliderDraggableState, function0, ((Float) obj2).floatValue());
                    return invoke$lambda$7$lambda$6;
                }
            };
            floatRef3 = floatRef7;
            floatRef4 = floatRef8;
            composer.updateRememberedValue(obj);
            rememberedValue6 = obj;
        } else {
            sliderDraggableState = sliderDraggableState2;
            floatRef4 = floatRef2;
            floatRef3 = floatRef;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState((Function1) rememberedValue6, composer, 0);
        SliderDraggableState sliderDraggableState3 = sliderDraggableState;
        sliderTapModifier = SliderKt.sliderTapModifier(Modifier.INSTANCE, sliderDraggableState3, this.$interactionSource, m8354getMaxWidthimpl, z, mutableFloatState2, rememberUpdatedState, mutableFloatState, this.$enabled);
        Modifier.Companion companion = Modifier.INSTANCE;
        Orientation orientation = Orientation.Horizontal;
        boolean isDragging = sliderDraggableState.isDragging();
        Modifier.Companion companion2 = companion;
        boolean z2 = this.$enabled;
        boolean z3 = z;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        ComposerKt.sourceInformationMarkerStart(composer, -1952384731, "CC(remember):Slider.kt#9igjgp");
        boolean changed3 = composer.changed(rememberUpdatedState);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            rememberedValue7 = (Function3) new SliderKt$Slider$2$drag$1$1(rememberUpdatedState, null);
            composer.updateRememberedValue(rememberedValue7);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SliderKt.SliderImpl(this.$enabled, SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), RangesKt.coerceIn(this.$value, this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue())), this.$tickFractions, this.$colors, floatRef4.element - floatRef3.element, this.$interactionSource, sliderTapModifier.then(DraggableKt.draggable$default(companion2, sliderDraggableState3, orientation, z2, mutableInteractionSource, isDragging, null, (Function3) rememberedValue7, z3, 32, null)), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final float invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float f) {
        return SliderKt.scale(floatRef.element, floatRef2.element, f, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State state, ClosedFloatingPointRange closedFloatingPointRange, float f) {
        mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f + mutableFloatState2.getFloatValue());
        mutableFloatState2.setFloatValue(0.0f);
        ((Function1) state.getValue()).invoke(Float.valueOf(invoke$scaleToUserValue(floatRef, floatRef2, closedFloatingPointRange, RangesKt.coerceIn(mutableFloatState.getFloatValue(), floatRef.element, floatRef2.element))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(MutableFloatState mutableFloatState, List list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, CoroutineScope coroutineScope, SliderDraggableState sliderDraggableState, Function0 function0, float f) {
        float floatValue = mutableFloatState.getFloatValue();
        float snapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef.element, floatRef2.element);
        if (floatValue != snapValueToTick) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SliderKt$Slider$2$gestureEndAction$1$1$1(sliderDraggableState, floatValue, snapValueToTick, f, function0, null), 3, null);
        } else if (!sliderDraggableState.isDragging() && function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
