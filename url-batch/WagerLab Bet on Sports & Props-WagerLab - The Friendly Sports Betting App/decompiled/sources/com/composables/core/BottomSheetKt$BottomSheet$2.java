package com.composables.core;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.composables.core.androidx.compose.foundation.gestures.AnchoredDraggableKt;
import com.composables.core.androidx.compose.foundation.gestures.UnstyledAnchoredDraggableState;
import com.composeunstyled.UtilsKt;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BottomSheet.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BottomSheetKt$BottomSheet$2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ MutableState<Dp> $containerHeight$delegate;
    final /* synthetic */ Function3<BottomSheetScope, Composer, Integer, Unit> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Density $density;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ BottomSheetScope $scope;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ BottomSheetState $state;

    /* JADX WARN: Multi-variable type inference failed */
    BottomSheetKt$BottomSheet$2(Density density, MutableState<Dp> mutableState, BottomSheetState bottomSheetState, BottomSheetScope bottomSheetScope, Modifier modifier, Shape shape, long j, PaddingValues paddingValues, CoroutineScope coroutineScope, long j2, Function3<? super BottomSheetScope, ? super Composer, ? super Integer, Unit> function3) {
        this.$density = density;
        this.$containerHeight$delegate = mutableState;
        this.$state = bottomSheetState;
        this.$scope = bottomSheetScope;
        this.$modifier = modifier;
        this.$shape = shape;
        this.$backgroundColor = j;
        this.$contentPadding = paddingValues;
        this.$coroutineScope = coroutineScope;
        this.$contentColor = j2;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Density density, MutableState mutableState, IntSize intSize) {
        BottomSheetKt.BottomSheet_bogVsAg$lambda$24(mutableState, density.mo421toDpu2uoSUM((int) (intSize.m8576unboximpl() & 4294967295L)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$5$lambda$4(BottomSheetState bottomSheetState, Density density, MutableState mutableState, IntSize intSize) {
        float BottomSheet_bogVsAg$lambda$23;
        bottomSheetState.setFullContentHeight$core_release((int) (intSize.m8576unboximpl() & 4294967295L));
        BottomSheet_bogVsAg$lambda$23 = BottomSheetKt.BottomSheet_bogVsAg$lambda$23(mutableState);
        BottomSheetKt.BottomSheet_bogVsAg$calculateDetents(density, bottomSheetState, density.mo424toPx0680j_4(BottomSheet_bogVsAg$lambda$23), (int) (intSize.m8576unboximpl() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult invoke$lambda$17$lambda$10$lambda$9(BottomSheetState bottomSheetState, MutableState mutableState, Density density, MeasureScope layout, Measurable measurable, Constraints constraints) {
        float BottomSheet_bogVsAg$lambda$23;
        float BottomSheet_bogVsAg$lambda$232;
        int i;
        float BottomSheet_bogVsAg$lambda$233;
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        BottomSheet_bogVsAg$lambda$23 = BottomSheetKt.BottomSheet_bogVsAg$lambda$23(mutableState);
        if (Dp.m8406equalsimpl0(BottomSheet_bogVsAg$lambda$23, Dp.INSTANCE.m8421getUnspecifiedD9Ej5fM())) {
            i = Constraints.m8353getMaxHeightimpl(constraints.getValue());
        } else {
            Iterator<T> it = bottomSheetState.getDetents$core_release().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Function2<Dp, Dp, Dp> calculateDetentHeight = ((SheetDetent) it.next()).getCalculateDetentHeight();
            BottomSheet_bogVsAg$lambda$232 = BottomSheetKt.BottomSheet_bogVsAg$lambda$23(mutableState);
            Dp m8399boximpl = Dp.m8399boximpl(calculateDetentHeight.invoke(Dp.m8399boximpl(BottomSheet_bogVsAg$lambda$232), Dp.m8399boximpl(density.mo421toDpu2uoSUM(Constraints.m8353getMaxHeightimpl(constraints.getValue())))).m8415unboximpl());
            while (it.hasNext()) {
                Function2<Dp, Dp, Dp> calculateDetentHeight2 = ((SheetDetent) it.next()).getCalculateDetentHeight();
                BottomSheet_bogVsAg$lambda$233 = BottomSheetKt.BottomSheet_bogVsAg$lambda$23(mutableState);
                Dp m8399boximpl2 = Dp.m8399boximpl(calculateDetentHeight2.invoke(Dp.m8399boximpl(BottomSheet_bogVsAg$lambda$233), Dp.m8399boximpl(density.mo421toDpu2uoSUM(Constraints.m8353getMaxHeightimpl(constraints.getValue())))).m8415unboximpl());
                if (m8399boximpl.compareTo(m8399boximpl2) < 0) {
                    m8399boximpl = m8399boximpl2;
                }
            }
            i = layout.mo418roundToPx0680j_4(m8399boximpl.m8415unboximpl());
        }
        final Placeable mo7075measureBRTryo0 = measurable.mo7075measureBRTryo0(Constraints.m8344copyZbe2FdA$default(constraints.getValue(), 0, 0, 0, i, 7, null));
        return MeasureScope.layout$default(layout, mo7075measureBRTryo0.getWidth(), mo7075measureBRTryo0.getHeight(), null, new Function1() { // from class: com.composables.core.BottomSheetKt$BottomSheet$2$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$10$lambda$9$lambda$8;
                invoke$lambda$17$lambda$10$lambda$9$lambda$8 = BottomSheetKt$BottomSheet$2.invoke$lambda$17$lambda$10$lambda$9$lambda$8(Placeable.this, (Placeable.PlacementScope) obj);
                return invoke$lambda$17$lambda$10$lambda$9$lambda$8;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$10$lambda$9$lambda$8(Placeable placeable, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset invoke$lambda$17$lambda$12$lambda$11(BottomSheetState bottomSheetState, MutableState mutableState, Density offset) {
        float BottomSheet_bogVsAg$lambda$23;
        long m8523constructorimpl;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        if (Float.isNaN(bottomSheetState.getAnchoredDraggableState$core_release().getOffset())) {
            BottomSheet_bogVsAg$lambda$23 = BottomSheetKt.BottomSheet_bogVsAg$lambda$23(mutableState);
            m8523constructorimpl = IntOffset.m8523constructorimpl((0 << 32) | (offset.mo418roundToPx0680j_4(BottomSheet_bogVsAg$lambda$23) & 4294967295L));
        } else {
            m8523constructorimpl = IntOffset.m8523constructorimpl((0 << 32) | (((int) bottomSheetState.getAnchoredDraggableState$core_release().requireOffset()) & 4294967295L));
        }
        return IntOffset.m8520boximpl(m8523constructorimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$14$lambda$13(CoroutineScope coroutineScope, BottomSheetState bottomSheetState, float f) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BottomSheetKt$BottomSheet$2$2$4$1$1(bottomSheetState, f, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x015f, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        PaddingValues paddingValues;
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1618377380, i2, -1, "com.composables.core.BottomSheet.<anonymous> (BottomSheet.kt:391)");
        }
        Modifier matchParentSize = BoxWithConstraints.matchParentSize(Modifier.INSTANCE);
        composer.startReplaceGroup(-1633490746);
        boolean changed = composer.changed(this.$density);
        final Density density = this.$density;
        final MutableState<Dp> mutableState = this.$containerHeight$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: com.composables.core.BottomSheetKt$BottomSheet$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = BottomSheetKt$BottomSheet$2.invoke$lambda$2$lambda$1(Density.this, mutableState, (IntSize) obj);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(matchParentSize, (Function1) rememberedValue);
        final BottomSheetState bottomSheetState = this.$state;
        final Density density2 = this.$density;
        final BottomSheetScope bottomSheetScope = this.$scope;
        Modifier modifier = this.$modifier;
        Shape shape = this.$shape;
        long j = this.$backgroundColor;
        PaddingValues paddingValues2 = this.$contentPadding;
        final MutableState<Dp> mutableState2 = this.$containerHeight$delegate;
        final CoroutineScope coroutineScope = this.$coroutineScope;
        long j2 = this.$contentColor;
        final Function3<BottomSheetScope, Composer, Integer, Unit> function3 = this.$content;
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, onSizeChanged);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4976constructorimpl = Updater.m4976constructorimpl(composer);
        Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Alignment topCenter = Alignment.INSTANCE.getTopCenter();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance = composer.changedInstance(bottomSheetState) | composer.changed(density2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance) {
            paddingValues = paddingValues2;
        } else {
            paddingValues = paddingValues2;
        }
        rememberedValue2 = new Function1() { // from class: com.composables.core.BottomSheetKt$BottomSheet$2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$5$lambda$4;
                invoke$lambda$17$lambda$5$lambda$4 = BottomSheetKt$BottomSheet$2.invoke$lambda$17$lambda$5$lambda$4(BottomSheetState.this, density2, mutableState2, (IntSize) obj);
                return invoke$lambda$17$lambda$5$lambda$4;
            }
        };
        composer.updateRememberedValue(rememberedValue2);
        composer.endReplaceGroup();
        Modifier onSizeChanged2 = OnRemeasuredModifierKt.onSizeChanged(companion2, (Function1) rememberedValue2);
        composer.startReplaceGroup(-1746271574);
        boolean changedInstance2 = composer.changedInstance(bottomSheetState) | composer.changed(density2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function3() { // from class: com.composables.core.BottomSheetKt$BottomSheet$2$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MeasureResult invoke$lambda$17$lambda$10$lambda$9;
                    invoke$lambda$17$lambda$10$lambda$9 = BottomSheetKt$BottomSheet$2.invoke$lambda$17$lambda$10$lambda$9(BottomSheetState.this, mutableState2, density2, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                    return invoke$lambda$17$lambda$10$lambda$9;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier layout = LayoutModifierKt.layout(onSizeChanged2, (Function3) rememberedValue3);
        composer.startReplaceGroup(-1633490746);
        boolean changedInstance3 = composer.changedInstance(bottomSheetState);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: com.composables.core.BottomSheetKt$BottomSheet$2$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    IntOffset invoke$lambda$17$lambda$12$lambda$11;
                    invoke$lambda$17$lambda$12$lambda$11 = BottomSheetKt$BottomSheet$2.invoke$lambda$17$lambda$12$lambda$11(BottomSheetState.this, mutableState2, (Density) obj);
                    return invoke$lambda$17$lambda$12$lambda$11;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        Modifier offset = OffsetKt.offset(layout, (Function1) rememberedValue4);
        composer.startReplaceGroup(169163907);
        if (bottomSheetScope.getEnabled$core_release()) {
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Object anchoredDraggableState$core_release = bottomSheetState.getAnchoredDraggableState$core_release();
            Orientation orientation = Orientation.Vertical;
            composer.startReplaceGroup(-1633490746);
            boolean changed2 = composer.changed(anchoredDraggableState$core_release);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = BottomSheetKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(bottomSheetState.getAnchoredDraggableState$core_release(), Orientation.Vertical, new Function1() { // from class: com.composables.core.BottomSheetKt$BottomSheet$2$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$14$lambda$13;
                        invoke$lambda$17$lambda$14$lambda$13 = BottomSheetKt$BottomSheet$2.invoke$lambda$17$lambda$14$lambda$13(CoroutineScope.this, bottomSheetState, ((Float) obj).floatValue());
                        return invoke$lambda$17$lambda$14$lambda$13;
                    }
                });
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceGroup();
            companion = NestedScrollModifierKt.nestedScroll$default(companion3, (NestedScrollConnection) rememberedValue5, null, 2, null);
        } else {
            companion = Modifier.INSTANCE;
        }
        composer.endReplaceGroup();
        Modifier unstyledAnchoredDraggable$default = AnchoredDraggableKt.unstyledAnchoredDraggable$default(offset.then(companion), (UnstyledAnchoredDraggableState) bottomSheetState.getAnchoredDraggableState$core_release(), Orientation.Vertical, bottomSheetScope.getEnabled$core_release() && bottomSheetState.getDetents$core_release().size() > 1, (MutableInteractionSource) null, (OverscrollEffect) null, false, 56, (Object) null);
        Unit unit = Unit.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = (PointerInputEventHandler) BottomSheetKt$BottomSheet$2$2$5$1.INSTANCE;
            composer.updateRememberedValue(rememberedValue6);
        }
        composer.endReplaceGroup();
        Modifier padding = PaddingKt.padding(BackgroundKt.m262backgroundbw27NRU$default(ClipKt.clip(boxScopeInstance.align(SuspendingPointerInputFilterKt.pointerInput(unstyledAnchoredDraggable$default, unit, (PointerInputEventHandler) rememberedValue6), Alignment.INSTANCE.getTopCenter()).then(modifier), shape), j, null, 2, null), paddingValues);
        ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, padding);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        Composer m4976constructorimpl2 = Updater.m4976constructorimpl(composer);
        Updater.m4983setimpl(m4976constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4976constructorimpl2.getInserting() || !Intrinsics.areEqual(m4976constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4976constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4976constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4983setimpl(m4976constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(UtilsKt.getLocalContentColor().provides(Color.m5647boximpl(j2)), ComposableLambdaKt.rememberComposableLambda(-143177048, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.BottomSheetKt$BottomSheet$2$2$6$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-143177048, i3, -1, "com.composables.core.BottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomSheet.kt:454)");
                }
                function3.invoke(bottomSheetScope, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
