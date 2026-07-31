package com.composables.core;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.MapSaverKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import com.composeunstyled.Modal_androidKt;
import com.composeunstyled.UtilsKt;
import com.facebook.react.uimanager.ViewProps;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.branch.referral.BranchError;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ModalBottomSheet.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000b0\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\r2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001aM\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\u0002\b$¢\u0006\u0002\b%H\u0007¢\u0006\u0002\u0010&\u001a;\u0010'\u001a\u00020\u001a*\u00020#2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/H\u0007¢\u0006\u0004\b0\u00101\u001am\u00102\u001a\u00020\u001a*\u00020#2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020+2\b\b\u0002\u00107\u001a\u00020+2\b\b\u0002\u00108\u001a\u0002092\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001a0\r¢\u0006\u0002\b$¢\u0006\u0002\b%H\u0007¢\u0006\u0004\b;\u0010<\"\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006=²\u0006\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001a0\nX\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"rememberModalBottomSheetState", "Lcom/composables/core/ModalBottomSheetState;", "initialDetent", "Lcom/composables/core/SheetDetent;", "detents", "", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "velocityThreshold", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/Dp;", "positionalThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "totalDistance", "confirmDetentChange", "", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Lcom/composables/core/SheetDetent;Ljava/util/List;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Lcom/composables/core/ModalBottomSheetState;", "LocalModalContext", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/composables/core/ModalContext;", "DoNothing", "", "getDoNothing", "()Lkotlin/jvm/functions/Function0;", "ModalBottomSheet", "state", DiagnosticsEntry.PROPERTIES_KEY, "Lcom/composables/core/ModalSheetProperties;", "onDismiss", "content", "Lcom/composables/core/ModalBottomSheetScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/composables/core/ModalBottomSheetState;Lcom/composables/core/ModalSheetProperties;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Scrim", "modifier", "Landroidx/compose/ui/Modifier;", "scrimColor", "Landroidx/compose/ui/graphics/Color;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "Scrim-T042LqI", "(Lcom/composables/core/ModalBottomSheetScope;Landroidx/compose/ui/Modifier;JLandroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Landroidx/compose/runtime/Composer;II)V", "Sheet", ViewProps.ENABLED, "shape", "Landroidx/compose/ui/graphics/Shape;", "backgroundColor", "contentColor", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "Lcom/composables/core/BottomSheetScope;", "Sheet-bogVsAg", "(Lcom/composables/core/ModalBottomSheetScope;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "core_release", "currentCallback", "hasBeenIntroduced"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModalBottomSheetKt {
    private static final ProvidableCompositionLocal<ModalContext> LocalModalContext = CompositionLocalKt.compositionLocalOf$default(null, new Function0() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ModalContext LocalModalContext$lambda$13;
            LocalModalContext$lambda$13 = ModalBottomSheetKt.LocalModalContext$lambda$13();
            return LocalModalContext$lambda$13;
        }
    }, 1, null);
    private static final Function0<Unit> DoNothing = new Function0() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Unit unit;
            unit = Unit.INSTANCE;
            return unit;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ModalBottomSheet$lambda$16(ModalBottomSheetState modalBottomSheetState, ModalSheetProperties modalSheetProperties, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        ModalBottomSheet(modalBottomSheetState, modalSheetProperties, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Scrim_T042LqI$lambda$17(ModalBottomSheetScope modalBottomSheetScope, Modifier modifier, long j, EnterTransition enterTransition, ExitTransition exitTransition, int i, int i2, Composer composer, int i3) {
        m9383ScrimT042LqI(modalBottomSheetScope, modifier, j, enterTransition, exitTransition, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Sheet_bogVsAg$lambda$23(ModalBottomSheetScope modalBottomSheetScope, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, Function3 function3, int i, int i2, Composer composer, int i3) {
        m9384SheetbogVsAg(modalBottomSheetScope, modifier, z, shape, j, j2, paddingValues, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberModalBottomSheetState$lambda$5$lambda$4(SheetDetent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public static final ModalBottomSheetState rememberModalBottomSheetState(final SheetDetent initialDetent, List<SheetDetent> list, AnimationSpec<Float> animationSpec, Function0<Dp> function0, Function1<? super Dp, Dp> function1, Function1<? super SheetDetent, Boolean> function12, DecayAnimationSpec<Float> decayAnimationSpec, Composer composer, int i, int i2) {
        Function0<Dp> function02;
        Function1<? super Dp, Dp> function13;
        Function1<? super SheetDetent, Boolean> function14;
        Intrinsics.checkNotNullParameter(initialDetent, "initialDetent");
        composer.startReplaceGroup(-1647745065);
        boolean z = true;
        List<SheetDetent> listOf = (i2 & 2) != 0 ? CollectionsKt.listOf((Object[]) new SheetDetent[]{SheetDetent.INSTANCE.getHidden(), SheetDetent.INSTANCE.getFullyExpanded()}) : list;
        TweenSpec tween$default = (i2 & 4) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        if ((i2 & 8) != 0) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Dp rememberModalBottomSheetState$lambda$1$lambda$0;
                        rememberModalBottomSheetState$lambda$1$lambda$0 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$1$lambda$0();
                        return rememberModalBottomSheetState$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            function02 = (Function0) rememberedValue;
        } else {
            function02 = function0;
        }
        if ((i2 & 16) != 0) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Dp rememberModalBottomSheetState$lambda$3$lambda$2;
                        rememberModalBottomSheetState$lambda$3$lambda$2 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$3$lambda$2((Dp) obj);
                        return rememberModalBottomSheetState$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            function13 = (Function1) rememberedValue2;
        } else {
            function13 = function1;
        }
        if ((i2 & 32) != 0) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean rememberModalBottomSheetState$lambda$5$lambda$4;
                        rememberModalBottomSheetState$lambda$5$lambda$4 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$5$lambda$4((SheetDetent) obj);
                        return Boolean.valueOf(rememberModalBottomSheetState$lambda$5$lambda$4);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            function14 = (Function1) rememberedValue3;
            composer.endReplaceGroup();
        } else {
            function14 = function12;
        }
        DecayAnimationSpec<Float> rememberSplineBasedDecay = (i2 & 64) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0) : decayAnimationSpec;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1647745065, i, -1, "com.composables.core.rememberModalBottomSheetState (ModalBottomSheet.kt:65)");
        }
        int i3 = i & 14;
        int i4 = i >> 6;
        int i5 = (i & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | (i4 & 7168) | (i4 & 57344);
        int i6 = i << 6;
        int i7 = i5 | (458752 & i6) | (i6 & 3670016);
        final List<SheetDetent> list2 = listOf;
        final BottomSheetState rememberBottomSheetState = BottomSheetKt.rememberBottomSheetState(initialDetent, list2, tween$default, function14, rememberSplineBasedDecay, function02, function13, composer, i7, 0);
        Object[] objArr = new Object[0];
        composer.startReplaceGroup(1849434622);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function2() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Map rememberModalBottomSheetState$lambda$7$lambda$6;
                    rememberModalBottomSheetState$lambda$7$lambda$6 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$7$lambda$6((SaverScope) obj, (ModalBottomSheetState) obj2);
                    return rememberModalBottomSheetState$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Function2 function2 = (Function2) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance = composer.changedInstance(list2) | composer.changedInstance(rememberBottomSheetState);
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = new Function1() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ModalBottomSheetState rememberModalBottomSheetState$lambda$10$lambda$9;
                    rememberModalBottomSheetState$lambda$10$lambda$9 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$10$lambda$9(list2, rememberBottomSheetState, (Map) obj);
                    return rememberModalBottomSheetState$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceGroup();
        Saver mapSaver = MapSaverKt.mapSaver(function2, (Function1) rememberedValue5);
        composer.startReplaceGroup(-1633490746);
        if (((i3 ^ 6) <= 4 || !composer.changed(initialDetent)) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance2 = composer.changedInstance(rememberBottomSheetState) | z;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = new Function0() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ModalBottomSheetState rememberModalBottomSheetState$lambda$12$lambda$11;
                    rememberModalBottomSheetState$lambda$12$lambda$11 = ModalBottomSheetKt.rememberModalBottomSheetState$lambda$12$lambda$11(SheetDetent.this, rememberBottomSheetState);
                    return rememberModalBottomSheetState$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.m5102rememberSaveable(objArr, mapSaver, (String) null, (Function0) rememberedValue6, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modalBottomSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map rememberModalBottomSheetState$lambda$7$lambda$6(SaverScope mapSaver, ModalBottomSheetState modalBottomSheetState) {
        Intrinsics.checkNotNullParameter(mapSaver, "$this$mapSaver");
        Intrinsics.checkNotNullParameter(modalBottomSheetState, "modalBottomSheetState");
        return MapsKt.mapOf(TuplesKt.to("detent", modalBottomSheetState.getCurrentDetent().getIdentifier()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModalBottomSheetState rememberModalBottomSheetState$lambda$10$lambda$9(List list, BottomSheetState bottomSheetState, Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SheetDetent sheetDetent = (SheetDetent) it.next();
            if (Intrinsics.areEqual(sheetDetent.getIdentifier(), map.get("detent"))) {
                return new ModalBottomSheetState(sheetDetent, bottomSheetState);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModalBottomSheetState rememberModalBottomSheetState$lambda$12$lambda$11(SheetDetent sheetDetent, BottomSheetState bottomSheetState) {
        return new ModalBottomSheetState(sheetDetent, bottomSheetState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ModalContext LocalModalContext$lambda$13() {
        throw new IllegalStateException("Modal not initialized".toString());
    }

    public static final Function0<Unit> getDoNothing() {
        return DoNothing;
    }

    public static final void ModalBottomSheet(final ModalBottomSheetState state, final ModalSheetProperties modalSheetProperties, Function0<Unit> function0, final Function3<? super ModalBottomSheetScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-233188847);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(modalSheetProperties)) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    modalSheetProperties = new ModalSheetProperties(false, false, 3, null);
                    i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
                if (i4 != 0) {
                    function0 = DoNothing;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= BranchError.ERR_BRANCH_NO_CONNECTIVITY;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-233188847, i3, -1, "com.composables.core.ModalBottomSheet (ModalBottomSheet.kt:229)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalModalContext.provides(new ModalContext(ModalBottomSheet$lambda$15(SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 6) & 14)))), ComposableLambdaKt.rememberComposableLambda(-290069167, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ModalBottomSheetKt$ModalBottomSheet$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    Function1 function1;
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290069167, i5, -1, "com.composables.core.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:233)");
                    }
                    composer2.startReplaceGroup(1849434622);
                    ModalBottomSheetState modalBottomSheetState = ModalBottomSheetState.this;
                    Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new ModalBottomSheetScope(modalBottomSheetState, modalBottomSheetState.getBottomSheetState());
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    final ModalBottomSheetScope modalBottomSheetScope = (ModalBottomSheetScope) rememberedValue;
                    composer2.endReplaceGroup();
                    modalBottomSheetScope.getVisibleState$core_release().setTargetState$animation_core(Boolean.valueOf(!Intrinsics.areEqual(ModalBottomSheetState.this.getCurrentDetent(), SheetDetent.INSTANCE.getHidden())));
                    if (modalBottomSheetScope.getVisibleState$core_release().getCurrentState().booleanValue() || modalBottomSheetScope.getVisibleState$core_release().getTargetState().booleanValue() || !modalBottomSheetScope.getVisibleState$core_release().isIdle()) {
                        if (modalSheetProperties.getDismissOnBackPress()) {
                            composer2.startReplaceGroup(24009614);
                            composer2.startReplaceGroup(-1633490746);
                            boolean changedInstance = composer2.changedInstance(ModalBottomSheetState.this) | composer2.changedInstance(modalBottomSheetScope);
                            final ModalBottomSheetState modalBottomSheetState2 = ModalBottomSheetState.this;
                            Object rememberedValue2 = composer2.rememberedValue();
                            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composables.core.ModalBottomSheetKt$ModalBottomSheet$1$onKeyEvent$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                        return m9386invokeZmokQxo(keyEvent.m6792unboximpl());
                                    }

                                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                    public final Boolean m9386invokeZmokQxo(android.view.KeyEvent event) {
                                        boolean z;
                                        Intrinsics.checkNotNullParameter(event, "event");
                                        if (KeyEventType.m6796equalsimpl0(KeyEvent_androidKt.m6804getTypeZmokQxo(event), KeyEventType.INSTANCE.m6800getKeyDownCS__XNY()) && ((Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6510getBackEK5gGoQ()) || Key.m6495equalsimpl0(KeyEvent_androidKt.m6803getKeyZmokQxo(event), Key.INSTANCE.m6584getEscapeEK5gGoQ())) && ModalBottomSheetState.this.getBottomSheetState().getConfirmDetentChange$core_release().invoke(SheetDetent.INSTANCE.getHidden()).booleanValue())) {
                                            modalBottomSheetScope.getSheetState().setTargetDetent(SheetDetent.INSTANCE.getHidden());
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            function1 = (Function1) rememberedValue2;
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(24481000);
                            composer2.startReplaceGroup(1849434622);
                            Object rememberedValue3 = composer2.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function1) new Function1<KeyEvent, Boolean>() { // from class: com.composables.core.ModalBottomSheetKt$ModalBottomSheet$1$onKeyEvent$2$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                        return m9387invokeZmokQxo(keyEvent.m6792unboximpl());
                                    }

                                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                    public final Boolean m9387invokeZmokQxo(android.view.KeyEvent it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return false;
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            function1 = (Function1) rememberedValue3;
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                        }
                        final ModalSheetProperties modalSheetProperties2 = modalSheetProperties;
                        final ModalBottomSheetState modalBottomSheetState3 = ModalBottomSheetState.this;
                        final Function3<ModalBottomSheetScope, Composer, Integer, Unit> function3 = content;
                        Modal_androidKt.Modal(function1, ComposableLambdaKt.rememberComposableLambda(-866973035, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ModalBottomSheetKt$ModalBottomSheet$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-866973035, i6, -1, "com.composables.core.ModalBottomSheet.<anonymous>.<anonymous> (ModalBottomSheet.kt:253)");
                                }
                                composer3.startReplaceGroup(62573058);
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ModalSheetProperties modalSheetProperties3 = ModalSheetProperties.this;
                                ModalBottomSheetState modalBottomSheetState4 = modalBottomSheetState3;
                                composer3.startReplaceGroup(62574086);
                                if (modalSheetProperties3.getDismissOnClickOutside()) {
                                    Unit unit = Unit.INSTANCE;
                                    composer3.startReplaceGroup(5004770);
                                    boolean changedInstance2 = composer3.changedInstance(modalBottomSheetState4);
                                    Object rememberedValue4 = composer3.rememberedValue();
                                    if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = (PointerInputEventHandler) new ModalBottomSheetKt$ModalBottomSheet$1$1$1$1$1(modalBottomSheetState4);
                                        composer3.updateRememberedValue(rememberedValue4);
                                    }
                                    composer3.endReplaceGroup();
                                    fillMaxSize$default = SuspendingPointerInputFilterKt.pointerInput(fillMaxSize$default, unit, (PointerInputEventHandler) rememberedValue4);
                                }
                                composer3.endReplaceGroup();
                                composer3.endReplaceGroup();
                                Function3<ModalBottomSheetScope, Composer, Integer, Unit> function32 = function3;
                                ModalBottomSheetScope modalBottomSheetScope2 = modalBottomSheetScope;
                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxSize$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4976constructorimpl = Updater.m4976constructorimpl(composer3);
                                Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function32.invoke(modalBottomSheetScope2, composer3, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 48, 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final ModalSheetProperties modalSheetProperties2 = modalSheetProperties;
        final Function0<Unit> function02 = function0;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ModalBottomSheet$lambda$16;
                    ModalBottomSheet$lambda$16 = ModalBottomSheetKt.ModalBottomSheet$lambda$16(ModalBottomSheetState.this, modalSheetProperties2, function02, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ModalBottomSheet$lambda$16;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0050  */
    /* renamed from: Scrim-T042LqI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9383ScrimT042LqI(final ModalBottomSheetScope Scrim, Modifier modifier, long j, EnterTransition enterTransition, ExitTransition exitTransition, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        int i5;
        EnterTransition enterTransition2;
        int i6;
        ExitTransition exitTransition2;
        final Modifier modifier3;
        final long j3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(Scrim, "$this$Scrim");
        Composer startRestartGroup = composer.startRestartGroup(1070774232);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(Scrim) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 384) == 0) {
                    i3 |= startRestartGroup.changed(j2) ? 256 : 128;
                }
            }
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        final Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        final long m5656copywmQWz5c$default = i4 == 0 ? Color.m5656copywmQWz5c$default(Color.INSTANCE.m5683getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
                        if (i5 != 0) {
                            enterTransition2 = UtilsKt.getAppearInstantly();
                        }
                        ExitTransition disappearInstantly = i6 == 0 ? UtilsKt.getDisappearInstantly() : exitTransition2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1070774232, i3, -1, "com.composables.core.Scrim (ModalBottomSheet.kt:289)");
                        }
                        int i8 = i3 >> 3;
                        AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(-688569344, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.ModalBottomSheetKt$Scrim$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-688569344, i9, -1, "com.composables.core.Scrim.<anonymous> (ModalBottomSheet.kt:295)");
                                }
                                BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i8 & 896) | (i8 & 7168), 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = companion;
                        j3 = m5656copywmQWz5c$default;
                        exitTransition3 = disappearInstantly;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        j3 = j2;
                        exitTransition3 = exitTransition2;
                    }
                    final EnterTransition enterTransition3 = enterTransition2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Scrim_T042LqI$lambda$17;
                                Scrim_T042LqI$lambda$17 = ModalBottomSheetKt.Scrim_T042LqI$lambda$17(ModalBottomSheetScope.this, modifier3, j3, enterTransition3, exitTransition3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Scrim_T042LqI$lambda$17;
                            }
                        });
                        return;
                    }
                    return;
                }
                exitTransition2 = exitTransition;
                if ((i3 & 9363) == 9362) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i3 >> 3;
                AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(-688569344, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.ModalBottomSheetKt$Scrim$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-688569344, i9, -1, "com.composables.core.Scrim.<anonymous> (ModalBottomSheet.kt:295)");
                        }
                        BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i82 & 896) | (i82 & 7168), 18);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                j3 = m5656copywmQWz5c$default;
                exitTransition3 = disappearInstantly;
                final EnterTransition enterTransition32 = enterTransition2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 != 0) {
            }
            exitTransition2 = exitTransition;
            if ((i3 & 9363) == 9362) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i822 = i3 >> 3;
            AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(-688569344, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.ModalBottomSheetKt$Scrim$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-688569344, i9, -1, "com.composables.core.Scrim.<anonymous> (ModalBottomSheet.kt:295)");
                    }
                    BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i822 & 896) | (i822 & 7168), 18);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            j3 = m5656copywmQWz5c$default;
            exitTransition3 = disappearInstantly;
            final EnterTransition enterTransition322 = enterTransition2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 != 0) {
        }
        exitTransition2 = exitTransition;
        if ((i3 & 9363) == 9362) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i8222 = i3 >> 3;
        AnimatedVisibilityKt.AnimatedVisibility(Scrim.getVisibleState$core_release(), (Modifier) null, enterTransition2, disappearInstantly, (String) null, ComposableLambdaKt.rememberComposableLambda(-688569344, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.ModalBottomSheetKt$Scrim$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i9) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-688569344, i9, -1, "com.composables.core.Scrim.<anonymous> (ModalBottomSheet.kt:295)");
                }
                BoxKt.Box(BackgroundKt.m262backgroundbw27NRU$default(FocusableKt.focusable$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, 2, null), m5656copywmQWz5c$default, null, 2, null).then(companion), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 196608 | MutableTransitionState.$stable | (i8222 & 896) | (i8222 & 7168), 18);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        j3 = m5656copywmQWz5c$default;
        exitTransition3 = disappearInstantly;
        final EnterTransition enterTransition3222 = enterTransition2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ee  */
    /* renamed from: Sheet-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9384SheetbogVsAg(final ModalBottomSheetScope Sheet, Modifier modifier, boolean z, Shape shape, long j, long j2, PaddingValues paddingValues, final Function3<? super BottomSheetScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier.Companion companion;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        int i6;
        long j3;
        int i7;
        long j4;
        int i8;
        Shape shape3;
        long j5;
        PaddingValues paddingValues2;
        int i9;
        Modifier modifier2;
        boolean z3;
        long j6;
        Object rememberedValue;
        MutableState mutableState;
        boolean changedInstance;
        ModalBottomSheetKt$Sheet$1$1 rememberedValue2;
        final Modifier modifier3;
        final boolean z4;
        final Shape shape4;
        final long j7;
        final long j8;
        final PaddingValues paddingValues3;
        ScopeUpdateScope endRestartGroup;
        int i10;
        Intrinsics.checkNotNullParameter(Sheet, "$this$Sheet");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1681973346);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(Sheet) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            companion = modifier;
            i3 |= startRestartGroup.changed(companion) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    shape2 = shape;
                    i3 |= startRestartGroup.changed(shape2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        j3 = j;
                        i3 |= startRestartGroup.changed(j3) ? 16384 : 8192;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            if ((i2 & 16) == 0) {
                                i7 = i11;
                                j4 = j2;
                                if (startRestartGroup.changed(j4)) {
                                    i10 = 131072;
                                    i3 |= i10;
                                }
                            } else {
                                i7 = i11;
                                j4 = j2;
                            }
                            i10 = 65536;
                            i3 |= i10;
                        } else {
                            i7 = i11;
                            j4 = j2;
                        }
                        i8 = i2 & 32;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(content) ? 8388608 : 4194304;
                        }
                        if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i7 != 0) {
                                    companion = Modifier.INSTANCE;
                                }
                                boolean z5 = i4 != 0 ? true : z2;
                                Shape rectangleShape = i5 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                long m5693getUnspecified0d7_KjU = i6 != 0 ? Color.INSTANCE.m5693getUnspecified0d7_KjU() : j3;
                                if ((i2 & 16) != 0) {
                                    ProvidableCompositionLocal<Color> localContentColor = UtilsKt.getLocalContentColor();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                    Object consume = startRestartGroup.consume(localContentColor);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    j4 = ((Color) consume).m5667unboximpl();
                                    i3 &= -458753;
                                }
                                if (i8 != 0) {
                                    i9 = i3;
                                    modifier2 = companion;
                                    paddingValues2 = PaddingKt.m830PaddingValues0680j_4(Dp.m8401constructorimpl(0));
                                    long j9 = j4;
                                    z3 = z5;
                                    shape3 = rectangleShape;
                                    j6 = m5693getUnspecified0d7_KjU;
                                    j5 = j9;
                                } else {
                                    shape3 = rectangleShape;
                                    j5 = j4;
                                    paddingValues2 = paddingValues;
                                    i9 = i3;
                                    modifier2 = companion;
                                    z3 = z5;
                                    j6 = m5693getUnspecified0d7_KjU;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -458753;
                                }
                                long j10 = j4;
                                z3 = z2;
                                j5 = j10;
                                paddingValues2 = paddingValues;
                                shape3 = shape2;
                                i9 = i3;
                                modifier2 = companion;
                                j6 = j3;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1681973346, i9, -1, "com.composables.core.Sheet (ModalBottomSheet.kt:315)");
                            }
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableState = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            Unit unit = Unit.INSTANCE;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            changedInstance = startRestartGroup.changedInstance(Sheet);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new ModalBottomSheetKt$Sheet$1$1(Sheet, mutableState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                            startRestartGroup.startReplaceGroup(1468703454);
                            if (Sheet_bogVsAg$lambda$19(mutableState)) {
                                ProvidableCompositionLocal<ModalContext> providableCompositionLocal = LocalModalContext;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                                Object consume2 = startRestartGroup.consume(providableCompositionLocal);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ModalContext modalContext = (ModalContext) consume2;
                                Boolean valueOf = Boolean.valueOf(Sheet.getSheetState().isIdle());
                                startRestartGroup.startReplaceGroup(-1633490746);
                                boolean changedInstance2 = startRestartGroup.changedInstance(Sheet) | startRestartGroup.changed(modalContext);
                                ModalBottomSheetKt$Sheet$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new ModalBottomSheetKt$Sheet$2$1(Sheet, modalContext, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                            }
                            startRestartGroup.endReplaceGroup();
                            BottomSheetKt.m9356BottomSheetbogVsAg(Sheet.getSheetState(), modifier2, z3, shape3, j6, j5, paddingValues2, content, startRestartGroup, i9 & 33554416, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            shape4 = shape3;
                            j7 = j6;
                            j8 = j5;
                            paddingValues3 = paddingValues2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            paddingValues3 = paddingValues;
                            modifier3 = companion;
                            z4 = z2;
                            j8 = j4;
                            shape4 = shape2;
                            j7 = j3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ModalBottomSheetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit Sheet_bogVsAg$lambda$23;
                                    Sheet_bogVsAg$lambda$23 = ModalBottomSheetKt.Sheet_bogVsAg$lambda$23(ModalBottomSheetScope.this, modifier3, z4, shape4, j7, j8, paddingValues3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return Sheet_bogVsAg$lambda$23;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    j3 = j;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
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
                    if ((i2 & 16) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance = startRestartGroup.changedInstance(Sheet);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue2 = new ModalBottomSheetKt$Sheet$1$1(Sheet, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                    startRestartGroup.startReplaceGroup(1468703454);
                    if (Sheet_bogVsAg$lambda$19(mutableState)) {
                    }
                    startRestartGroup.endReplaceGroup();
                    BottomSheetKt.m9356BottomSheetbogVsAg(Sheet.getSheetState(), modifier2, z3, shape3, j6, j5, paddingValues2, content, startRestartGroup, i9 & 33554416, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    shape4 = shape3;
                    j7 = j6;
                    j8 = j5;
                    paddingValues3 = paddingValues2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                shape2 = shape;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                j3 = j;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
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
                if ((i2 & 16) != 0) {
                }
                if (i8 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                Unit unit22 = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(Sheet);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue2 = new ModalBottomSheetKt$Sheet$1$1(Sheet, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                startRestartGroup.startReplaceGroup(1468703454);
                if (Sheet_bogVsAg$lambda$19(mutableState)) {
                }
                startRestartGroup.endReplaceGroup();
                BottomSheetKt.m9356BottomSheetbogVsAg(Sheet.getSheetState(), modifier2, z3, shape3, j6, j5, paddingValues2, content, startRestartGroup, i9 & 33554416, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                z4 = z3;
                shape4 = shape3;
                j7 = j6;
                j8 = j5;
                paddingValues3 = paddingValues2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            shape2 = shape;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            j3 = j;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i8 = i2 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
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
            if ((i2 & 16) != 0) {
            }
            if (i8 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Unit unit222 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance = startRestartGroup.changedInstance(Sheet);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new ModalBottomSheetKt$Sheet$1$1(Sheet, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(1468703454);
            if (Sheet_bogVsAg$lambda$19(mutableState)) {
            }
            startRestartGroup.endReplaceGroup();
            BottomSheetKt.m9356BottomSheetbogVsAg(Sheet.getSheetState(), modifier2, z3, shape3, j6, j5, paddingValues2, content, startRestartGroup, i9 & 33554416, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            z4 = z3;
            shape4 = shape3;
            j7 = j6;
            j8 = j5;
            paddingValues3 = paddingValues2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        companion = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        shape2 = shape;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        j3 = j;
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i8 = i2 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
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
        if ((i2 & 16) != 0) {
        }
        if (i8 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Unit unit2222 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(Sheet);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new ModalBottomSheetKt$Sheet$1$1(Sheet, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit2222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(1468703454);
        if (Sheet_bogVsAg$lambda$19(mutableState)) {
        }
        startRestartGroup.endReplaceGroup();
        BottomSheetKt.m9356BottomSheetbogVsAg(Sheet.getSheetState(), modifier2, z3, shape3, j6, j5, paddingValues2, content, startRestartGroup, i9 & 33554416, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        z4 = z3;
        shape4 = shape3;
        j7 = j6;
        j8 = j5;
        paddingValues3 = paddingValues2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final boolean Sheet_bogVsAg$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sheet_bogVsAg$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp rememberModalBottomSheetState$lambda$1$lambda$0() {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(125));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp rememberModalBottomSheetState$lambda$3$lambda$2(Dp dp) {
        return Dp.m8399boximpl(Dp.m8401constructorimpl(56));
    }

    private static final Function0<Unit> ModalBottomSheet$lambda$15(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
