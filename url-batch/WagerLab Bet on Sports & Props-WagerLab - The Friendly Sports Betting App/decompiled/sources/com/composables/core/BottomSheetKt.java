package com.composables.core;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.Velocity;
import androidx.profileinstaller.ProfileVerifier;
import com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableKt;
import com.composables.core.androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState;
import com.composables.core.androidx.compose.foundation.gestures.UnstyledDraggableAnchors;
import com.composeunstyled.UtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheet.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a\u0089\u0001\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u000eH\u0002\u001a\u0090\u0001\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2#\b\u0002\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00190\u000eH\u0007¢\u0006\u0002\u0010\u001a\u001aq\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\u001c\u0010(\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u001c0\u000e¢\u0006\u0002\b*¢\u0006\u0002\b+H\u0007¢\u0006\u0004\b,\u0010-\u001aA\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\n012\u0006\u00102\u001a\u0002032!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u001c0\u000eH\u0000\u001a=\u00106\u001a\u00020\u001c*\u00020)2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0002\u0010=¨\u0006>²\u0006\n\u0010?\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010@\u001a\u00020AX\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\u0015X\u008a\u008e\u0002"}, d2 = {"Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/composables/core/BottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "sheetDetents", "", "Lcom/composables/core/SheetDetent;", "velocityThreshold", "Lkotlin/Function0;", "positionalThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "totalDistance", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "confirmDetentChange", "", "rememberBottomSheetState", "initialDetent", "detents", "Landroidx/compose/ui/unit/Dp;", "(Lcom/composables/core/SheetDetent;Ljava/util/List;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/DecayAnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lcom/composables/core/BottomSheetState;", "BottomSheet", "", "state", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.ENABLED, "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lcom/composables/core/BottomSheetScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "BottomSheet-bogVsAg", "(Lcom/composables/core/BottomSheetState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "Lcom/composables/core/androidx/compose/foundation/gestures/UnstyledAnchoredDraggableState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "onFling", "velocity", "DragIndication", "indication", "Landroidx/compose/foundation/Indication;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onClickLabel", "", "(Lcom/composables/core/BottomSheetScope;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/Indication;Landroidx/compose/foundation/interaction/MutableInteractionSource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "core_release", "containerHeight", "detentIndex", "", "goUp"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_bogVsAg$lambda$32(BottomSheetState bottomSheetState, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, Function3 function3, int i, int i2, Composer composer, int i3) {
        m9356BottomSheetbogVsAg(bottomSheetState, modifier, z, shape, j, j2, paddingValues, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DragIndication$lambda$43(BottomSheetScope bottomSheetScope, Modifier modifier, Indication indication, MutableInteractionSource mutableInteractionSource, String str, int i, int i2, Composer composer, int i3) {
        DragIndication(bottomSheetScope, modifier, indication, mutableInteractionSource, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberBottomSheetState$lambda$4$lambda$3(SheetDetent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    private static final Saver<BottomSheetState, ?> Saver(final AnimationSpec<Float> animationSpec, final CoroutineScope coroutineScope, final List<SheetDetent> list, final Function0<Float> function0, final Function1<? super Float, Float> function1, final DecayAnimationSpec<Float> decayAnimationSpec, final Function1<? super SheetDetent, Boolean> function12) {
        return MapSaverKt.mapSaver(new Function2() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Map Saver$lambda$0;
                Saver$lambda$0 = BottomSheetKt.Saver$lambda$0((SaverScope) obj, (BottomSheetState) obj2);
                return Saver$lambda$0;
            }
        }, new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BottomSheetState Saver$lambda$2;
                Saver$lambda$2 = BottomSheetKt.Saver$lambda$2(list, coroutineScope, animationSpec, function0, function1, decayAnimationSpec, function12, (Map) obj);
                return Saver$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map Saver$lambda$0(SaverScope mapSaver, BottomSheetState it) {
        Intrinsics.checkNotNullParameter(mapSaver, "$this$mapSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        return MapsKt.mapOf(TuplesKt.to("detent", it.getCurrentDetent().getIdentifier()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetState Saver$lambda$2(List list, CoroutineScope coroutineScope, AnimationSpec animationSpec, Function0 function0, Function1 function1, DecayAnimationSpec decayAnimationSpec, Function1 function12, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Object obj = map.get("detent");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SheetDetent sheetDetent = (SheetDetent) it.next();
            if (Intrinsics.areEqual(sheetDetent.getIdentifier(), obj)) {
                return new BottomSheetState(sheetDetent, list, coroutineScope, animationSpec, function0, function1, decayAnimationSpec, function12);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final BottomSheetState rememberBottomSheetState(final SheetDetent initialDetent, List<SheetDetent> list, AnimationSpec<Float> animationSpec, Function1<? super SheetDetent, Boolean> function1, DecayAnimationSpec<Float> decayAnimationSpec, Function0<Dp> function0, Function1<? super Dp, Dp> function12, Composer composer, int i, int i2) {
        Function1<? super SheetDetent, Boolean> function13;
        final Function0<Dp> function02;
        final Function1<? super Dp, Dp> function14;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(initialDetent, "initialDetent");
        composer.startReplaceGroup(-260811382);
        List<SheetDetent> listOf = (i2 & 2) != 0 ? CollectionsKt.listOf((Object[]) new SheetDetent[]{SheetDetent.INSTANCE.getHidden(), SheetDetent.INSTANCE.getFullyExpanded()}) : list;
        AnimationSpec<Float> tween$default = (i2 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        if ((i2 & 8) != 0) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberBottomSheetState$lambda$4$lambda$3;
                        rememberBottomSheetState$lambda$4$lambda$3 = BottomSheetKt.rememberBottomSheetState$lambda$4$lambda$3((SheetDetent) obj);
                        return Boolean.valueOf(rememberBottomSheetState$lambda$4$lambda$3);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            function13 = (Function1) rememberedValue;
        } else {
            function13 = function1;
        }
        DecayAnimationSpec<Float> rememberSplineBasedDecay = (i2 & 16) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        if ((i2 & 32) != 0) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Dp rememberBottomSheetState$lambda$6$lambda$5;
                        rememberBottomSheetState$lambda$6$lambda$5 = BottomSheetKt.rememberBottomSheetState$lambda$6$lambda$5();
                        return rememberBottomSheetState$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            function02 = (Function0) rememberedValue2;
        } else {
            function02 = function0;
        }
        if ((i2 & 64) != 0) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Dp rememberBottomSheetState$lambda$8$lambda$7;
                        rememberBottomSheetState$lambda$8$lambda$7 = BottomSheetKt.rememberBottomSheetState$lambda$8$lambda$7((Dp) obj);
                        return rememberBottomSheetState$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            function14 = (Function1) rememberedValue3;
        } else {
            function14 = function12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-260811382, i, -1, "com.composables.core.rememberBottomSheetState (BottomSheet.kt:85)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) consume;
        ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(composer, -954203484, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue4);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Object[] objArr2 = new Object[0];
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(density);
        int i3 = (458752 & i) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        boolean z = ((i3 > 131072 && composer.changed(function02)) || (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | changed;
        Object rememberedValue5 = composer.rememberedValue();
        if (z || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    float rememberBottomSheetState$lambda$11$lambda$10;
                    rememberBottomSheetState$lambda$11$lambda$10 = BottomSheetKt.rememberBottomSheetState$lambda$11$lambda$10(Density.this, function02);
                    return Float.valueOf(rememberBottomSheetState$lambda$11$lambda$10);
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        Function0 function03 = (Function0) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        int i4 = (3670016 & i) ^ 1572864;
        boolean changed2 = composer.changed(density) | ((i4 > 1048576 && composer.changed(function14)) || (i & 1572864) == 1048576);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    float rememberBottomSheetState$lambda$14$lambda$13;
                    rememberBottomSheetState$lambda$14$lambda$13 = BottomSheetKt.rememberBottomSheetState$lambda$14$lambda$13(Density.this, function14, ((Float) obj).floatValue());
                    return Float.valueOf(rememberBottomSheetState$lambda$14$lambda$13);
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        Saver<BottomSheetState, ?> Saver = Saver(tween$default, coroutineScope, listOf, function03, (Function1) rememberedValue6, rememberSplineBasedDecay, function13);
        final DecayAnimationSpec<Float> decayAnimationSpec2 = rememberSplineBasedDecay;
        final Function1<? super SheetDetent, Boolean> function15 = function13;
        composer.startReplaceGroup(-1224400529);
        boolean changedInstance = ((i3 > 131072 && composer.changed(function02)) || (i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072) | ((((i & 14) ^ 6) > 4 && composer.changed(initialDetent)) || (i & 6) == 4) | composer.changedInstance(listOf) | composer.changedInstance(coroutineScope) | composer.changedInstance(tween$default) | composer.changed(density) | ((i4 > 1048576 && composer.changed(function14)) || (i & 1572864) == 1048576) | composer.changedInstance(decayAnimationSpec2) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(function15)) || (i & 3072) == 2048);
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
            final AnimationSpec<Float> animationSpec2 = tween$default;
            objArr = objArr2;
            final List<SheetDetent> list2 = listOf;
            Object obj = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    BottomSheetState rememberBottomSheetState$lambda$20$lambda$19;
                    rememberBottomSheetState$lambda$20$lambda$19 = BottomSheetKt.rememberBottomSheetState$lambda$20$lambda$19(SheetDetent.this, list2, coroutineScope, animationSpec2, decayAnimationSpec2, function15, density, function02, function14);
                    return rememberBottomSheetState$lambda$20$lambda$19;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue7 = obj;
        } else {
            objArr = objArr2;
        }
        composer.endReplaceGroup();
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m5102rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) rememberedValue7, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bottomSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rememberBottomSheetState$lambda$11$lambda$10(Density density, Function0 function0) {
        return density.mo424toPx0680j_4(((Dp) function0.invoke()).m8415unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rememberBottomSheetState$lambda$14$lambda$13(Density density, Function1 function1, float f) {
        return density.mo424toPx0680j_4(((Dp) function1.invoke(Dp.m8399boximpl(density.mo420toDpu2uoSUM(f)))).m8415unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetState rememberBottomSheetState$lambda$20$lambda$19(SheetDetent sheetDetent, List list, CoroutineScope coroutineScope, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function1, final Density density, final Function0 function0, final Function1 function12) {
        return new BottomSheetState(sheetDetent, list, coroutineScope, animationSpec, new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float rememberBottomSheetState$lambda$20$lambda$19$lambda$16;
                rememberBottomSheetState$lambda$20$lambda$19$lambda$16 = BottomSheetKt.rememberBottomSheetState$lambda$20$lambda$19$lambda$16(Density.this, function0);
                return Float.valueOf(rememberBottomSheetState$lambda$20$lambda$19$lambda$16);
            }
        }, new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float rememberBottomSheetState$lambda$20$lambda$19$lambda$18;
                rememberBottomSheetState$lambda$20$lambda$19$lambda$18 = BottomSheetKt.rememberBottomSheetState$lambda$20$lambda$19$lambda$18(Density.this, function12, ((Float) obj).floatValue());
                return Float.valueOf(rememberBottomSheetState$lambda$20$lambda$19$lambda$18);
            }
        }, decayAnimationSpec, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rememberBottomSheetState$lambda$20$lambda$19$lambda$16(Density density, Function0 function0) {
        return density.mo424toPx0680j_4(((Dp) function0.invoke()).m8415unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float rememberBottomSheetState$lambda$20$lambda$19$lambda$18(Density density, Function1 function1, float f) {
        return density.mo424toPx0680j_4(((Dp) function1.invoke(Dp.m8399boximpl(density.mo420toDpu2uoSUM(f)))).m8415unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e9  */
    /* renamed from: BottomSheet-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9356BottomSheetbogVsAg(final BottomSheetState state, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, final Function3<? super BottomSheetScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        int i6;
        int i7;
        long j3;
        int i8;
        int i9;
        int i10;
        final PaddingValues paddingValues2;
        Modifier modifier2;
        Shape shape3;
        boolean z3;
        long j4;
        long j5;
        Modifier modifier3;
        Shape shape4;
        Object rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        boolean changed;
        Object rememberedValue4;
        Composer composer2;
        final Modifier modifier4;
        final Shape shape5;
        final long j6;
        final long j7;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1470695558);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
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
                    shape2 = shape;
                    i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i7 = i11;
                        i3 |= startRestartGroup.changed(j) ? 16384 : 8192;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            j3 = j2;
                            i3 |= ((i2 & 32) == 0 && startRestartGroup.changed(j3)) ? 131072 : 65536;
                        } else {
                            j3 = j2;
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        int i12 = i3;
                        if ((4793491 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i7 != 0) {
                                    companion = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                long m5693getUnspecified0d7_KjU = i6 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j;
                                if ((i2 & 32) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j3 = ((Color) consume).m5667unboximpl();
                                    i9 = i12 & (-458753);
                                } else {
                                    i9 = i12;
                                }
                                if (i8 != 0) {
                                    i10 = i9;
                                    paddingValues2 = PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0));
                                } else {
                                    i10 = i9;
                                    paddingValues2 = paddingValues;
                                }
                                long j8 = j3;
                                modifier2 = companion;
                                shape3 = rectangleShape;
                                z3 = z2;
                                j4 = m5693getUnspecified0d7_KjU;
                                j5 = j8;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    modifier2 = companion;
                                    shape3 = shape2;
                                    j5 = j3;
                                    paddingValues2 = paddingValues;
                                    i10 = i12 & (-458753);
                                    z3 = z2;
                                } else {
                                    modifier2 = companion;
                                    shape3 = shape2;
                                    j5 = j3;
                                    paddingValues2 = paddingValues;
                                    z3 = z2;
                                    i10 = i12;
                                }
                                j4 = j;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier3 = modifier2;
                                shape4 = shape3;
                                ComposerKt.traceEventStart(1470695558, i10, -1, "com.composables.core.BottomSheet (BottomSheet.kt:347)");
                            } else {
                                modifier3 = modifier2;
                                shape4 = shape3;
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new BottomSheetScope(state, z3);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            BottomSheetScope bottomSheetScope = (BottomSheetScope) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            bottomSheetScope.setEnabled$core_release(z3);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                            Object consume2 = startRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            final Density density = (Density) consume2;
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            boolean z5 = z3;
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m8399boximpl(Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM()), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            MutableState mutableState = (MutableState) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changed = startRestartGroup.changed(density) | startRestartGroup.changedInstance(state);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit BottomSheet_bogVsAg$lambda$31$lambda$30;
                                        BottomSheet_bogVsAg$lambda$31$lambda$30 = BottomSheetKt.BottomSheet_bogVsAg$lambda$31$lambda$30(BottomSheetState.this, density, (IntSize) obj);
                                        return BottomSheet_bogVsAg$lambda$31$lambda$30;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                            Modifier modifier5 = modifier3;
                            Shape shape6 = shape4;
                            BoxWithConstraintsKt.BoxWithConstraints(OnRemeasuredModifierKt.onSizeChanged(fillMaxSize$default, (Function1) rememberedValue4), Alignment.INSTANCE.getTopCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1618377380, true, new BottomSheetKt$BottomSheet$2(density, mutableState, state, bottomSheetScope, modifier5, shape6, j4, paddingValues2, coroutineScope, j5, content), composer2, 54), composer2, 3120, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            shape5 = shape6;
                            j6 = j4;
                            j7 = j5;
                            z4 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            paddingValues2 = paddingValues;
                            composer2 = startRestartGroup;
                            modifier4 = companion;
                            z4 = z2;
                            j7 = j3;
                            shape5 = shape2;
                            j6 = j;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BottomSheet_bogVsAg$lambda$32;
                                    BottomSheet_bogVsAg$lambda$32 = BottomSheetKt.BottomSheet_bogVsAg$lambda$32(BottomSheetState.this, modifier4, z4, shape5, j6, j7, paddingValues2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return BottomSheet_bogVsAg$lambda$32;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i11;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    int i122 = i3;
                    if ((4793491 & i3) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    long j82 = j3;
                    modifier2 = companion;
                    shape3 = rectangleShape;
                    z3 = z2;
                    j4 = m5693getUnspecified0d7_KjU;
                    j5 = j82;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    BottomSheetScope bottomSheetScope2 = (BottomSheetScope) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    bottomSheetScope2.setEnabled$core_release(z3);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localDensity2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density2 = (Density) consume22;
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    boolean z52 = z3;
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed = startRestartGroup.changed(density2) | startRestartGroup.changedInstance(state);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue4 = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit BottomSheet_bogVsAg$lambda$31$lambda$30;
                            BottomSheet_bogVsAg$lambda$31$lambda$30 = BottomSheetKt.BottomSheet_bogVsAg$lambda$31$lambda$30(BottomSheetState.this, density2, (IntSize) obj);
                            return BottomSheet_bogVsAg$lambda$31$lambda$30;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    Modifier modifier52 = modifier3;
                    Shape shape62 = shape4;
                    BoxWithConstraintsKt.BoxWithConstraints(OnRemeasuredModifierKt.onSizeChanged(fillMaxSize$default2, (Function1) rememberedValue4), Alignment.INSTANCE.getTopCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1618377380, true, new BottomSheetKt$BottomSheet$2(density2, mutableState2, state, bottomSheetScope2, modifier52, shape62, j4, paddingValues2, coroutineScope2, j5, content), composer2, 54), composer2, 3120, 4);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    shape5 = shape62;
                    j6 = j4;
                    j7 = j5;
                    z4 = z52;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                shape2 = shape;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i11;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                int i1222 = i3;
                if ((4793491 & i3) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i8 != 0) {
                }
                long j822 = j3;
                modifier2 = companion;
                shape3 = rectangleShape;
                z3 = z2;
                j4 = m5693getUnspecified0d7_KjU;
                j5 = j822;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                BottomSheetScope bottomSheetScope22 = (BottomSheetScope) rememberedValue;
                startRestartGroup.endReplaceGroup();
                bottomSheetScope22.setEnabled$core_release(z3);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localDensity22);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final Density density22 = (Density) consume222;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                boolean z522 = z3;
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState22 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(density22) | startRestartGroup.changedInstance(state);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue4 = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit BottomSheet_bogVsAg$lambda$31$lambda$30;
                        BottomSheet_bogVsAg$lambda$31$lambda$30 = BottomSheetKt.BottomSheet_bogVsAg$lambda$31$lambda$30(BottomSheetState.this, density22, (IntSize) obj);
                        return BottomSheet_bogVsAg$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
                Modifier modifier522 = modifier3;
                Shape shape622 = shape4;
                BoxWithConstraintsKt.BoxWithConstraints(OnRemeasuredModifierKt.onSizeChanged(fillMaxSize$default22, (Function1) rememberedValue4), Alignment.INSTANCE.getTopCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1618377380, true, new BottomSheetKt$BottomSheet$2(density22, mutableState22, state, bottomSheetScope22, modifier522, shape622, j4, paddingValues2, coroutineScope22, j5, content), composer2, 54), composer2, 3120, 4);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier522;
                shape5 = shape622;
                j6 = j4;
                j7 = j5;
                z4 = z522;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            shape2 = shape;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i11;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            int i12222 = i3;
            if ((4793491 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i8 != 0) {
            }
            long j8222 = j3;
            modifier2 = companion;
            shape3 = rectangleShape;
            z3 = z2;
            j4 = m5693getUnspecified0d7_KjU;
            j5 = j8222;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            BottomSheetScope bottomSheetScope222 = (BottomSheetScope) rememberedValue;
            startRestartGroup.endReplaceGroup();
            bottomSheetScope222.setEnabled$core_release(z3);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localDensity222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density222 = (Density) consume2222;
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            boolean z5222 = z3;
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            MutableState mutableState222 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(density222) | startRestartGroup.changedInstance(state);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit BottomSheet_bogVsAg$lambda$31$lambda$30;
                    BottomSheet_bogVsAg$lambda$31$lambda$30 = BottomSheetKt.BottomSheet_bogVsAg$lambda$31$lambda$30(BottomSheetState.this, density222, (IntSize) obj);
                    return BottomSheet_bogVsAg$lambda$31$lambda$30;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            Modifier modifier5222 = modifier3;
            Shape shape6222 = shape4;
            BoxWithConstraintsKt.BoxWithConstraints(OnRemeasuredModifierKt.onSizeChanged(fillMaxSize$default222, (Function1) rememberedValue4), Alignment.INSTANCE.getTopCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1618377380, true, new BottomSheetKt$BottomSheet$2(density222, mutableState222, state, bottomSheetScope222, modifier5222, shape6222, j4, paddingValues2, coroutineScope222, j5, content), composer2, 54), composer2, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier5222;
            shape5 = shape6222;
            j6 = j4;
            j7 = j5;
            z4 = z5222;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        shape2 = shape;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i11;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        int i122222 = i3;
        if ((4793491 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i8 != 0) {
        }
        long j82222 = j3;
        modifier2 = companion;
        shape3 = rectangleShape;
        z3 = z2;
        j4 = m5693getUnspecified0d7_KjU;
        j5 = j82222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        BottomSheetScope bottomSheetScope2222 = (BottomSheetScope) rememberedValue;
        startRestartGroup.endReplaceGroup();
        bottomSheetScope2222.setEnabled$core_release(z3);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        CoroutineScope coroutineScope2222 = (CoroutineScope) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localDensity2222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density2222 = (Density) consume22222;
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        boolean z52222 = z3;
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        MutableState mutableState2222 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(density2222) | startRestartGroup.changedInstance(state);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomSheet_bogVsAg$lambda$31$lambda$30;
                BottomSheet_bogVsAg$lambda$31$lambda$30 = BottomSheetKt.BottomSheet_bogVsAg$lambda$31$lambda$30(BottomSheetState.this, density2222, (IntSize) obj);
                return BottomSheet_bogVsAg$lambda$31$lambda$30;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        composer2 = startRestartGroup;
        Modifier modifier52222 = modifier3;
        Shape shape62222 = shape4;
        BoxWithConstraintsKt.BoxWithConstraints(OnRemeasuredModifierKt.onSizeChanged(fillMaxSize$default2222, (Function1) rememberedValue4), Alignment.INSTANCE.getTopCenter(), false, ComposableLambdaKt.rememberComposableLambda(-1618377380, true, new BottomSheetKt$BottomSheet$2(density2222, mutableState2222, state, bottomSheetScope2222, modifier52222, shape62222, j4, paddingValues2, coroutineScope2222, j5, content), composer2, 54), composer2, 3120, 4);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier52222;
        shape5 = shape62222;
        j6 = j4;
        j7 = j5;
        z4 = z52222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BottomSheet_bogVsAg$lambda$23(MutableState<Dp> mutableState) {
        return mutableState.getValue().m8415unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomSheet_bogVsAg$lambda$24(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m8399boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BottomSheet_bogVsAg$calculateDetents(final Density density, final BottomSheetState bottomSheetState, float f, float f2) {
        SheetDetent targetValue;
        final float mo420toDpu2uoSUM = density.mo420toDpu2uoSUM(f);
        final float mo420toDpu2uoSUM2 = density.mo420toDpu2uoSUM(f2);
        UnstyledDraggableAnchors<SheetDetent> UnstyledDraggableAnchors = AnchoredDraggableKt.UnstyledDraggableAnchors(new Function1() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BottomSheet_bogVsAg$calculateDetents$lambda$29;
                BottomSheet_bogVsAg$calculateDetents$lambda$29 = BottomSheetKt.BottomSheet_bogVsAg$calculateDetents$lambda$29(Density.this, bottomSheetState, mo420toDpu2uoSUM, mo420toDpu2uoSUM2, (DraggableAnchorsConfig) obj);
                return BottomSheet_bogVsAg$calculateDetents$lambda$29;
            }
        });
        if (bottomSheetState.isIdle()) {
            targetValue = bottomSheetState.getAnchoredDraggableState$core_release().getCurrentValue();
        } else {
            targetValue = bottomSheetState.getAnchoredDraggableState$core_release().getTargetValue();
        }
        bottomSheetState.getAnchoredDraggableState$core_release().updateAnchors(UnstyledDraggableAnchors, targetValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_bogVsAg$calculateDetents$lambda$29(Density density, BottomSheetState bottomSheetState, float f, float f2, DraggableAnchorsConfig UnstyledDraggableAnchors) {
        Intrinsics.checkNotNullParameter(UnstyledDraggableAnchors, "$this$UnstyledDraggableAnchors");
        bottomSheetState.setClosestDentToTop$core_release(Float.NaN);
        for (SheetDetent sheetDetent : bottomSheetState.getDetents$core_release()) {
            float mo424toPx0680j_4 = density.mo424toPx0680j_4(Dp.m8401constructorimpl(f - Dp.m8401constructorimpl(RangesKt.coerceIn(sheetDetent.getCalculateDetentHeight().invoke(Dp.m8399boximpl(f), Dp.m8399boximpl(f2)).m8415unboximpl(), Dp.m8401constructorimpl(0), f2))));
            if (Float.isNaN(bottomSheetState.getClosestDentToTop$core_release()) || bottomSheetState.getClosestDentToTop$core_release() > mo424toPx0680j_4) {
                bottomSheetState.setClosestDentToTop$core_release(mo424toPx0680j_4);
            }
            UnstyledDraggableAnchors.at(sheetDetent, mo424toPx0680j_4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheet_bogVsAg$lambda$31$lambda$30(BottomSheetState bottomSheetState, Density density, IntSize intSize) {
        BottomSheet_bogVsAg$calculateDetents(density, bottomSheetState, (int) (intSize.m8576unboximpl() & 4294967295L), bottomSheetState.getFullContentHeight());
        return Unit.INSTANCE;
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final UnstyledAnchoredDraggableState<SheetDetent> sheetState, final Orientation orientation, final Function1<? super Float, Unit> onFling) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onFling, "onFling");
        return new NestedScrollConnection() { // from class: com.composables.core.BottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public long mo923onPreScrollOzD1aCk(long available, int source) {
                float offsetToFloat = offsetToFloat(available);
                if (offsetToFloat < 0.0f && NestedScrollSource.m6828equalsimpl0(source, NestedScrollSource.INSTANCE.m6840getUserInputWNlRxjI())) {
                    return toOffset(sheetState.dispatchRawDelta(offsetToFloat));
                }
                return Offset.INSTANCE.m5429getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo572onPostScrollDzOQY0M(long consumed, long available, int source) {
                if (NestedScrollSource.m6828equalsimpl0(source, NestedScrollSource.INSTANCE.m6840getUserInputWNlRxjI())) {
                    return toOffset(sheetState.dispatchRawDelta(offsetToFloat(available)));
                }
                return Offset.INSTANCE.m5429getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public Object mo922onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
                float velocityToFloat = velocityToFloat(j);
                float requireOffset = sheetState.requireOffset();
                float minAnchor = sheetState.getAnchors().minAnchor();
                if (velocityToFloat < 0.0f && requireOffset > minAnchor) {
                    onFling.invoke(Boxing.boxFloat(velocityToFloat));
                } else {
                    j = Velocity.INSTANCE.m8650getZero9UxMQ8M();
                }
                return Velocity.m8630boximpl(j);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public Object mo571onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
                onFling.invoke(Boxing.boxFloat(velocityToFloat(j2)));
                return Velocity.m8630boximpl(j2);
            }

            private final long toOffset(float f) {
                float f2 = orientation == Orientation.Horizontal ? f : 0.0f;
                if (orientation != Orientation.Vertical) {
                    f = 0.0f;
                }
                return Offset.m5405constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
            }

            private final float velocityToFloat(long j) {
                return orientation == Orientation.Horizontal ? Velocity.m8639getXimpl(j) : Velocity.m8640getYimpl(j);
            }

            private final float offsetToFloat(long j) {
                return Float.intBitsToFloat((int) (orientation == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DragIndication(final BottomSheetScope bottomSheetScope, Modifier modifier, Indication indication, MutableInteractionSource mutableInteractionSource, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Indication indication2;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        int i5;
        String str2;
        Modifier.Companion companion;
        Indication indication3;
        MutableInteractionSource mutableInteractionSource3;
        String str3;
        Indication indication4;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        final Modifier modifier3;
        final MutableInteractionSource mutableInteractionSource4;
        final Indication indication5;
        final String str4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Intrinsics.checkNotNullParameter(bottomSheetScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(1013910399);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bottomSheetScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 2) == 0) {
                    indication2 = indication;
                    if (startRestartGroup.changed(indication2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    indication2 = indication;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                indication2 = indication;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str2 = str;
                    i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) == 0) {
                                float f = 8;
                                indication3 = FocusRingIndicationKt.m9376rememberFocusRingIndication_dVmGfk(Color.INSTANCE.m5684getBlue0d7_KjU(), Dp.m8401constructorimpl(4), PaddingKt.m831PaddingValuesYgX7TsA(Dp.m8401constructorimpl(f), Dp.m8401constructorimpl(14)), Dp.m8401constructorimpl(f), startRestartGroup, 3510, 0);
                                startRestartGroup = startRestartGroup;
                                i3 &= -897;
                            } else {
                                indication3 = indication2;
                            }
                            mutableInteractionSource3 = i4 == 0 ? null : mutableInteractionSource;
                            if (i5 == 0) {
                                indication4 = indication3;
                                str3 = "Toggle sheet";
                            } else {
                                str3 = str;
                                indication4 = indication3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -897;
                            }
                            companion = modifier2;
                            indication4 = indication2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            str3 = str2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1013910399, i3, -1, "com.composables.core.DragIndication (BottomSheet.kt:540)");
                        }
                        Object[] objArr = new Object[0];
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    MutableState DragIndication$lambda$34$lambda$33;
                                    DragIndication$lambda$34$lambda$33 = BottomSheetKt.DragIndication$lambda$34$lambda$33();
                                    return DragIndication$lambda$34$lambda$33;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        final MutableState mutableState = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
                        Object[] objArr2 = new Object[0];
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    MutableState DragIndication$lambda$38$lambda$37;
                                    DragIndication$lambda$38$lambda$37 = BottomSheetKt.DragIndication$lambda$38$lambda$37();
                                    return DragIndication$lambda$38$lambda$37;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        final MutableState mutableState2 = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
                        startRestartGroup.startReplaceGroup(-1746271574);
                        changed = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(bottomSheetScope) | startRestartGroup.changed(mutableState2);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit DragIndication$lambda$42$lambda$41;
                                    DragIndication$lambda$42$lambda$41 = BottomSheetKt.DragIndication$lambda$42$lambda$41(BottomSheetScope.this, mutableState, mutableState2);
                                    return DragIndication$lambda$42$lambda$41;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        Function0 function0 = (Function0) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        Modifier modifier4 = companion;
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        BoxKt.Box(ClickableKt.m298clickableO2vRcR0(modifier4, mutableInteractionSource5, indication4, !bottomSheetScope.getEnabled$core_release() && bottomSheetScope.getState().getDetents$core_release().size() > 1, str3, Role.m7575boximpl(Role.INSTANCE.m7582getButtono7Vup1c()), function0), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        mutableInteractionSource4 = mutableInteractionSource5;
                        indication5 = indication4;
                        str4 = str3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        indication5 = indication2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        str4 = str2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit DragIndication$lambda$43;
                                DragIndication$lambda$43 = BottomSheetKt.DragIndication$lambda$43(BottomSheetScope.this, modifier3, indication5, mutableInteractionSource4, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return DragIndication$lambda$43;
                            }
                        });
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((i3 & 9363) == 9362) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 2) == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr3 = new Object[0];
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState3 = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
                Object[] objArr22 = new Object[0];
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                final MutableState mutableState22 = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
                startRestartGroup.startReplaceGroup(-1746271574);
                changed = startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(bottomSheetScope) | startRestartGroup.changed(mutableState22);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit DragIndication$lambda$42$lambda$41;
                        DragIndication$lambda$42$lambda$41 = BottomSheetKt.DragIndication$lambda$42$lambda$41(BottomSheetScope.this, mutableState3, mutableState22);
                        return DragIndication$lambda$42$lambda$41;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                Function0 function02 = (Function0) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                Modifier modifier42 = companion;
                MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                BoxKt.Box(ClickableKt.m298clickableO2vRcR0(modifier42, mutableInteractionSource52, indication4, !bottomSheetScope.getEnabled$core_release() && bottomSheetScope.getState().getDetents$core_release().size() > 1, str3, Role.m7575boximpl(Role.INSTANCE.m7582getButtono7Vup1c()), function02), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
                mutableInteractionSource4 = mutableInteractionSource52;
                indication5 = indication4;
                str4 = str3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 2) == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr32 = new Object[0];
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            final MutableState mutableState32 = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
            Object[] objArr222 = new Object[0];
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            final MutableState mutableState222 = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr222, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(-1746271574);
            changed = startRestartGroup.changed(mutableState32) | startRestartGroup.changedInstance(bottomSheetScope) | startRestartGroup.changed(mutableState222);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DragIndication$lambda$42$lambda$41;
                    DragIndication$lambda$42$lambda$41 = BottomSheetKt.DragIndication$lambda$42$lambda$41(BottomSheetScope.this, mutableState32, mutableState222);
                    return DragIndication$lambda$42$lambda$41;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            Function0 function022 = (Function0) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            Modifier modifier422 = companion;
            MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource3;
            BoxKt.Box(ClickableKt.m298clickableO2vRcR0(modifier422, mutableInteractionSource522, indication4, !bottomSheetScope.getEnabled$core_release() && bottomSheetScope.getState().getDetents$core_release().size() > 1, str3, Role.m7575boximpl(Role.INSTANCE.m7582getButtono7Vup1c()), function022), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier422;
            mutableInteractionSource4 = mutableInteractionSource522;
            indication5 = indication4;
            str4 = str3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 2) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        Object[] objArr322 = new Object[0];
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState322 = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr322, (Saver) null, (String) null, (Function0) rememberedValue, startRestartGroup, 3072, 6);
        Object[] objArr2222 = new Object[0];
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        final MutableState mutableState2222 = (MutableState) RememberSaveableKt.m5102rememberSaveable(objArr2222, (Saver) null, (String) null, (Function0) rememberedValue2, startRestartGroup, 3072, 6);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = startRestartGroup.changed(mutableState322) | startRestartGroup.changedInstance(bottomSheetScope) | startRestartGroup.changed(mutableState2222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new Function0() { // from class: com.composables.core.BottomSheetKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DragIndication$lambda$42$lambda$41;
                DragIndication$lambda$42$lambda$41 = BottomSheetKt.DragIndication$lambda$42$lambda$41(BottomSheetScope.this, mutableState322, mutableState2222);
                return DragIndication$lambda$42$lambda$41;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        Function0 function0222 = (Function0) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        Modifier modifier4222 = companion;
        MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource3;
        BoxKt.Box(ClickableKt.m298clickableO2vRcR0(modifier4222, mutableInteractionSource5222, indication4, !bottomSheetScope.getEnabled$core_release() && bottomSheetScope.getState().getDetents$core_release().size() > 1, str3, Role.m7575boximpl(Role.INSTANCE.m7582getButtono7Vup1c()), function0222), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4222;
        mutableInteractionSource4 = mutableInteractionSource5222;
        indication5 = indication4;
        str4 = str3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DragIndication$lambda$34$lambda$33() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);
    }

    private static final int DragIndication$lambda$35(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void DragIndication$lambda$36(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState DragIndication$lambda$38$lambda$37() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    }

    private static final boolean DragIndication$lambda$39(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DragIndication$lambda$40(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DragIndication$lambda$42$lambda$41(BottomSheetScope bottomSheetScope, MutableState mutableState, MutableState mutableState2) {
        if (DragIndication$lambda$35(mutableState) == -1) {
            DragIndication$lambda$36(mutableState, bottomSheetScope.getState().getDetents$core_release().indexOf(bottomSheetScope.getState().getCurrentDetent()));
        }
        if (DragIndication$lambda$35(mutableState) == bottomSheetScope.getState().getDetents$core_release().size() - 1) {
            DragIndication$lambda$40(mutableState2, false);
        }
        if (DragIndication$lambda$35(mutableState) == 0) {
            DragIndication$lambda$40(mutableState2, true);
        }
        DragIndication$lambda$36(mutableState, DragIndication$lambda$39(mutableState2) ? DragIndication$lambda$35(mutableState) + 1 : DragIndication$lambda$35(mutableState) - 1);
        bottomSheetScope.getState().setTargetDetent(bottomSheetScope.getState().getDetents$core_release().get(DragIndication$lambda$35(mutableState)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp rememberBottomSheetState$lambda$6$lambda$5() {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(125));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp rememberBottomSheetState$lambda$8$lambda$7(Dp dp) {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(56));
    }
}
