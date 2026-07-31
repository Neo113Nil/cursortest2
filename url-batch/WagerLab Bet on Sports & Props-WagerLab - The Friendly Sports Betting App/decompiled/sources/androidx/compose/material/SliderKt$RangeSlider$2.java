package androidx.compose.material;

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
import kotlin.jvm.functions.Function2;
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
final class SliderKt$RangeSlider$2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ Function0<Unit> $onValueChangeFinished;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    final /* synthetic */ int $steps;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$RangeSlider$2(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, List<Float> list, Function0<Unit> function0, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z, int i, SliderColors sliderColors) {
        this.$valueRange = closedFloatingPointRange;
        this.$value = closedFloatingPointRange2;
        this.$tickFractions = list;
        this.$onValueChangeFinished = function0;
        this.$onValueChangeState = state;
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$enabled = z;
        this.$steps = i;
        this.$colors = sliderColors;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, int i) {
        BoxWithConstraintsScope boxWithConstraintsScope2;
        int i2;
        Ref.FloatRef floatRef;
        Ref.FloatRef floatRef2;
        ComposerKt.sourceInformation(composer, "C418@18639L7,423@18800L7,434@19228L60,435@19316L67,438@19429L15,437@19393L165,445@19603L15,444@19567L170,452@19759L24,454@19867L1029,454@19827L1069,480@20978L985,480@20931L1032,525@23062L63,534@23393L65,540@23603L341:Slider.kt#jmzs0o");
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
            ComposerKt.traceEventStart(652589923, i2, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:418)");
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localLayoutDirection);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean z = consume == LayoutDirection.Rtl;
        float m8354getMaxWidthimpl = Constraints.m8354getMaxWidthimpl(boxWithConstraintsScope2.mo723getConstraintsmsEJaDk());
        final Ref.FloatRef floatRef3 = new Ref.FloatRef();
        final Ref.FloatRef floatRef4 = new Ref.FloatRef();
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2 = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Density density = (Density) consume2;
        floatRef3.element = m8354getMaxWidthimpl - density.mo424toPx0680j_4(SliderKt.getThumbRadius());
        floatRef4.element = density.mo424toPx0680j_4(SliderKt.getThumbRadius());
        ComposerKt.sourceInformationMarkerStart(composer, 73711071, "CC(remember):Slider.kt#9igjgp");
        ClosedFloatingPointRange<Float> closedFloatingPointRange = this.$value;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.$valueRange;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange2, floatRef4, floatRef3, closedFloatingPointRange.getStart().floatValue()));
            composer.updateRememberedValue(rememberedValue);
        }
        final MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 73713894, "CC(remember):Slider.kt#9igjgp");
        ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.$value;
        ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.$valueRange;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(invoke$scaleToOffset(closedFloatingPointRange4, floatRef4, floatRef3, closedFloatingPointRange3.getEndInclusive().floatValue()));
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 73717458, "CC(remember):Slider.kt#9igjgp");
        boolean changed = composer.changed(this.$valueRange) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element);
        ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.$valueRange;
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = (KFunction) new SliderKt$RangeSlider$2$2$1(closedFloatingPointRange5, floatRef4, floatRef3);
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SliderKt.CorrectValueSideEffect((Function1) ((KFunction) rememberedValue3), this.$valueRange, RangesKt.rangeTo(floatRef4.element, floatRef3.element), mutableFloatState, this.$value.getStart().floatValue(), composer, 3072);
        ComposerKt.sourceInformationMarkerStart(composer, 73723026, "CC(remember):Slider.kt#9igjgp");
        boolean changed2 = composer.changed(this.$valueRange) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element);
        ClosedFloatingPointRange<Float> closedFloatingPointRange6 = this.$valueRange;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = (KFunction) new SliderKt$RangeSlider$2$3$1(closedFloatingPointRange6, floatRef4, floatRef3);
            composer.updateRememberedValue(rememberedValue4);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SliderKt.CorrectValueSideEffect((Function1) ((KFunction) rememberedValue4), this.$valueRange, RangesKt.rangeTo(floatRef4.element, floatRef3.element), mutableFloatState2, this.$value.getEndInclusive().floatValue(), composer, 3072);
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue5);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue5;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, 73732488, "CC(remember):Slider.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(this.$tickFractions) | composer.changed(floatRef4.element) | composer.changed(floatRef3.element) | composer.changed(this.$onValueChangeFinished) | composer.changedInstance(coroutineScope) | composer.changed(this.$onValueChangeState) | composer.changed(this.$valueRange);
        final List<Float> list = this.$tickFractions;
        final Function0<Unit> function0 = this.$onValueChangeFinished;
        final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.$onValueChangeState;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange7 = this.$valueRange;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function1() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$6$lambda$5;
                    invoke$lambda$6$lambda$5 = SliderKt$RangeSlider$2.invoke$lambda$6$lambda$5(MutableFloatState.this, mutableFloatState2, list, floatRef4, floatRef3, function0, coroutineScope, state, closedFloatingPointRange7, ((Boolean) obj).booleanValue());
                    return invoke$lambda$6$lambda$5;
                }
            };
            floatRef = floatRef4;
            floatRef2 = floatRef3;
            composer.updateRememberedValue(rememberedValue6);
        } else {
            floatRef2 = floatRef3;
            floatRef = floatRef4;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState((Function1) rememberedValue6, composer, 0);
        ComposerKt.sourceInformationMarkerStart(composer, 73767996, "CC(remember):Slider.kt#9igjgp");
        boolean changed3 = composer.changed(this.$valueRange) | composer.changed(floatRef.element) | composer.changed(floatRef2.element) | composer.changed(this.$value) | composer.changed(this.$onValueChangeState);
        final ClosedFloatingPointRange<Float> closedFloatingPointRange8 = this.$value;
        final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.$onValueChangeState;
        final ClosedFloatingPointRange<Float> closedFloatingPointRange9 = this.$valueRange;
        Object rememberedValue7 = composer.rememberedValue();
        if (changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            final Ref.FloatRef floatRef5 = floatRef2;
            final Ref.FloatRef floatRef6 = floatRef;
            rememberedValue7 = new Function2() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit invoke$lambda$8$lambda$7;
                    invoke$lambda$8$lambda$7 = SliderKt$RangeSlider$2.invoke$lambda$8$lambda$7(MutableFloatState.this, mutableFloatState2, closedFloatingPointRange8, floatRef6, floatRef5, state2, closedFloatingPointRange9, ((Boolean) obj).booleanValue(), ((Float) obj2).floatValue());
                    return invoke$lambda$8$lambda$7;
                }
            };
            composer.updateRememberedValue(rememberedValue7);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier rangeSliderPressDragModifier = SliderKt.rangeSliderPressDragModifier(Modifier.INSTANCE, this.$startInteractionSource, this.$endInteractionSource, mutableFloatState, mutableFloatState2, this.$enabled, z, m8354getMaxWidthimpl, this.$valueRange, rememberUpdatedState, SnapshotStateKt.rememberUpdatedState((Function2) rememberedValue7, composer, 0));
        final float coerceIn = RangesKt.coerceIn(this.$value.getStart().floatValue(), this.$valueRange.getStart().floatValue(), this.$value.getEndInclusive().floatValue());
        final float coerceIn2 = RangesKt.coerceIn(this.$value.getEndInclusive().floatValue(), this.$value.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue());
        float calcFraction = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn);
        float calcFraction2 = SliderKt.calcFraction(this.$valueRange.getStart().floatValue(), this.$valueRange.getEndInclusive().floatValue(), coerceIn2);
        int floor = (int) Math.floor(this.$steps * calcFraction2);
        int floor2 = (int) Math.floor(this.$steps * (1.0f - calcFraction));
        Modifier.Companion companion = Modifier.INSTANCE;
        boolean z2 = this.$enabled;
        ComposerKt.sourceInformationMarkerStart(composer, 73833762, "CC(remember):Slider.kt#9igjgp");
        boolean changed4 = composer.changed(this.$onValueChangeState) | composer.changed(coerceIn2);
        final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state3 = this.$onValueChangeState;
        Object rememberedValue8 = composer.rememberedValue();
        if (changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
            rememberedValue8 = new Function1() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$10$lambda$9;
                    invoke$lambda$10$lambda$9 = SliderKt$RangeSlider$2.invoke$lambda$10$lambda$9(State.this, coerceIn2, ((Float) obj).floatValue());
                    return invoke$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue8);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier sliderSemantics = SliderKt.sliderSemantics(companion, coerceIn, z2, (Function1) rememberedValue8, this.$onValueChangeFinished, RangesKt.rangeTo(this.$valueRange.getStart().floatValue(), coerceIn2), floor);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        boolean z3 = this.$enabled;
        ComposerKt.sourceInformationMarkerStart(composer, 73844356, "CC(remember):Slider.kt#9igjgp");
        boolean changed5 = composer.changed(this.$onValueChangeState) | composer.changed(coerceIn);
        final State<Function1<ClosedFloatingPointRange<Float>, Unit>> state4 = this.$onValueChangeState;
        Object rememberedValue9 = composer.rememberedValue();
        if (changed5 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
            rememberedValue9 = new Function1() { // from class: androidx.compose.material.SliderKt$RangeSlider$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$12$lambda$11;
                    invoke$lambda$12$lambda$11 = SliderKt$RangeSlider$2.invoke$lambda$12$lambda$11(State.this, coerceIn, ((Float) obj).floatValue());
                    return invoke$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue9);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SliderKt.RangeSliderImpl(this.$enabled, calcFraction, calcFraction2, this.$tickFractions, this.$colors, floatRef2.element - floatRef.element, this.$startInteractionSource, this.$endInteractionSource, rangeSliderPressDragModifier, sliderSemantics, SliderKt.sliderSemantics(companion2, coerceIn2, z3, (Function1) rememberedValue9, this.$onValueChangeFinished, RangesKt.rangeTo(coerceIn, this.$valueRange.getEndInclusive().floatValue()), floor2), composer, 14155776, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClosedFloatingPointRange<Float> invoke$scaleToUserValue(Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        return SliderKt.scale(floatRef.element, floatRef2.element, closedFloatingPointRange2, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$scaleToOffset(ClosedFloatingPointRange<Float> closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, float f) {
        return SliderKt.scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f, floatRef.element, floatRef2.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, List list, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, Function0 function0, CoroutineScope coroutineScope, State state, ClosedFloatingPointRange closedFloatingPointRange, boolean z) {
        float floatValue = (z ? mutableFloatState : mutableFloatState2).getFloatValue();
        float snapValueToTick = SliderKt.snapValueToTick(floatValue, list, floatRef.element, floatRef2.element);
        if (floatValue != snapValueToTick) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SliderKt$RangeSlider$2$gestureEndAction$1$1$1(floatValue, snapValueToTick, function0, z, mutableFloatState, mutableFloatState2, state, floatRef, floatRef2, closedFloatingPointRange, null), 3, null);
            return Unit.INSTANCE;
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$8$lambda$7(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2, ClosedFloatingPointRange closedFloatingPointRange, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, State state, ClosedFloatingPointRange closedFloatingPointRange2, boolean z, float f) {
        ClosedFloatingPointRange<Float> rangeTo;
        if (z) {
            mutableFloatState.setFloatValue(mutableFloatState.getFloatValue() + f);
            mutableFloatState2.setFloatValue(invoke$scaleToOffset(closedFloatingPointRange2, floatRef, floatRef2, ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()));
            float floatValue = mutableFloatState2.getFloatValue();
            rangeTo = RangesKt.rangeTo(RangesKt.coerceIn(mutableFloatState.getFloatValue(), floatRef.element, floatValue), floatValue);
        } else {
            mutableFloatState2.setFloatValue(mutableFloatState2.getFloatValue() + f);
            mutableFloatState.setFloatValue(invoke$scaleToOffset(closedFloatingPointRange2, floatRef, floatRef2, ((Number) closedFloatingPointRange.getStart()).floatValue()));
            float floatValue2 = mutableFloatState.getFloatValue();
            rangeTo = RangesKt.rangeTo(floatValue2, RangesKt.coerceIn(mutableFloatState2.getFloatValue(), floatValue2, floatRef2.element));
        }
        ((Function1) state.getValue()).invoke(invoke$scaleToUserValue(floatRef, floatRef2, closedFloatingPointRange2, rangeTo));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(State state, float f, float f2) {
        ((Function1) state.getValue()).invoke(RangesKt.rangeTo(f2, f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(State state, float f, float f2) {
        ((Function1) state.getValue()).invoke(RangesKt.rangeTo(f, f2));
        return Unit.INSTANCE;
    }
}
