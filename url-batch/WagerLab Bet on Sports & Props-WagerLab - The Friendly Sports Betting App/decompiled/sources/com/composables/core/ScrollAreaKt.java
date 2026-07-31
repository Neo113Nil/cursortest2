package com.composables.core;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.composables.core.ThumbVisibility;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000¸\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a=\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001aY\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010\u001b\u001aW\u0010\u001c\u001a\u00020\f*\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u001e2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010$\u001aW\u0010%\u001a\u00020\f*\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010&\u001a\u00020\u001e2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0002\u0010$\u001a]\u0010'\u001a\u00020\f*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0003¢\u0006\u0002\u0010*\u001a/\u0010+\u001a\u00020\f*\u00020#2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0002\u0010.\u001a,\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010<\u001a\u000205H\u0002\u001a,\u0010=\u001a\u0002092\u0006\u0010:\u001a\u0002012\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010<\u001a\u000205H\u0002\u001a,\u0010>\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0@2\u0006\u0010:\u001a\u000201H\u0002\u001a$\u0010B\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010:\u001a\u000201H\u0002\u001a\"\u0010C\u001a\u00020\f*\u00020D2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020FH\u0082@¢\u0006\u0002\u0010G\"\u0018\u0010/\u001a\u000200*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0018\u00104\u001a\u000205*\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u000e\u0010H\u001a\u00020IX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010J\u001a\u00020IX\u0080T¢\u0006\u0002\n\u0000\"\u0015\u0010K\u001a\u00020L*\u00020\u00018F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006O²\u0006\n\u0010P\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u0010Q\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010R\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010S\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010T\u001a\u00020 X\u008a\u0084\u0002²\u0006\u0012\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010A0@X\u008a\u0084\u0002²\u0006\n\u0010V\u001a\u000201X\u008a\u0084\u0002"}, d2 = {"rememberScrollAreaState", "Lcom/composables/core/ScrollAreaState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Lcom/composables/core/ScrollAreaState;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Lcom/composables/core/ScrollAreaState;", "lazyGridState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)Lcom/composables/core/ScrollAreaState;", "ScrollArea", "", "state", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Lcom/composables/core/ScrollAreaScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/composables/core/ScrollAreaState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffectSides", "", "Lcom/composables/core/OverscrollSides;", "(Lcom/composables/core/ScrollAreaState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/OverscrollEffect;Ljava/util/List;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "VerticalScrollbar", ViewProps.ENABLED, "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "reverseLayout", "thumb", "Lcom/composables/core/ScrollbarScope;", "(Lcom/composables/core/ScrollAreaScope;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "HorizontalScrollbar", "reverseLayout2", "ScrollBar", "reverse", "isVertical", "(Lcom/composables/core/ScrollAreaScope;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Thumb", "thumbVisibility", "Lcom/composables/core/ThumbVisibility;", "(Lcom/composables/core/ScrollbarScope;Landroidx/compose/ui/Modifier;Lcom/composables/core/ThumbVisibility;ZLandroidx/compose/runtime/Composer;II)V", "thumbPixelRange", "Lkotlin/ranges/IntRange;", "Lcom/composables/core/SliderAdapter;", "getThumbPixelRange", "(Lcom/composables/core/SliderAdapter;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Lkotlin/ranges/IntRange;)I", "verticalMeasurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "sliderAdapter", "setContainerSize", "scrollThickness", "horizontalMeasurePolicy", "scrollbarDrag", "draggedInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "scrollOnPressTrack", "detectScrollViaTrackGestures", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "scroller", "Lcom/composables/core/TrackPressScroller;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;ZLcom/composables/core/TrackPressScroller;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DelayBeforeSecondScrollOnTrackPress", "", "DelayBetweenScrollsOnTrackPress", "maxScrollOffset", "", "getMaxScrollOffset", "(Lcom/composables/core/ScrollAreaState;)D", "core_release", "containerSize", "show", "isHovered", "isDraggingList", "currentInteractionSource", "currentDraggedInteraction", "currentSliderAdapter"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollAreaKt {
    public static final long DelayBeforeSecondScrollOnTrackPress = 300;
    public static final long DelayBetweenScrollsOnTrackPress = 100;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HorizontalScrollbar$lambda$9(ScrollAreaScope scrollAreaScope, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, int i, int i2, Composer composer, int i3) {
        HorizontalScrollbar(scrollAreaScope, modifier, z, mutableInteractionSource, z2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollArea$lambda$3(ScrollAreaState scrollAreaState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        ScrollArea(scrollAreaState, modifier, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollArea$lambda$5(ScrollAreaState scrollAreaState, Modifier modifier, OverscrollEffect overscrollEffect, List list, Function3 function3, int i, int i2, Composer composer, int i3) {
        ScrollArea(scrollAreaState, modifier, overscrollEffect, list, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollBar$lambda$28(ScrollAreaScope scrollAreaScope, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, Function3 function3, int i, int i2, Composer composer, int i3) {
        ScrollBar(scrollAreaScope, modifier, z, mutableInteractionSource, z2, z3, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Thumb$lambda$36(ScrollbarScope scrollbarScope, Modifier modifier, ThumbVisibility thumbVisibility, boolean z, int i, int i2, Composer composer, int i3) {
        Thumb(scrollbarScope, modifier, thumbVisibility, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalScrollbar$lambda$7(ScrollAreaScope scrollAreaScope, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, int i, int i2, Composer composer, int i3) {
        VerticalScrollbar(scrollAreaScope, modifier, z, mutableInteractionSource, z2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final ScrollAreaState rememberScrollAreaState(ScrollState scrollState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        composer.startReplaceGroup(-566932451);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-566932451, i, -1, "com.composables.core.rememberScrollAreaState (ScrollArea.kt:68)");
        }
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(scrollState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new ScrollStateScrollAreaState(scrollState);
            composer.updateRememberedValue(rememberedValue);
        }
        ScrollStateScrollAreaState scrollStateScrollAreaState = (ScrollStateScrollAreaState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return scrollStateScrollAreaState;
    }

    public static final ScrollAreaState rememberScrollAreaState(LazyListState lazyListState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceGroup(1772667992);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1772667992, i, -1, "com.composables.core.rememberScrollAreaState (ScrollArea.kt:78)");
        }
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LazyListScrollAreaState(lazyListState);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyListScrollAreaState lazyListScrollAreaState = (LazyListScrollAreaState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lazyListScrollAreaState;
    }

    public static final ScrollAreaState rememberScrollAreaState(LazyGridState lazyGridState, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(lazyGridState, "lazyGridState");
        composer.startReplaceGroup(-93880656);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93880656, i, -1, "com.composables.core.rememberScrollAreaState (ScrollArea.kt:88)");
        }
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyGridState)) || (i & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new LazyGridScrollAreaScrollAreaState(lazyGridState);
            composer.updateRememberedValue(rememberedValue);
        }
        LazyGridScrollAreaScrollAreaState lazyGridScrollAreaScrollAreaState = (LazyGridScrollAreaScrollAreaState) rememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lazyGridScrollAreaScrollAreaState;
    }

    public static final void ScrollArea(ScrollAreaState state, Modifier modifier, Function3<? super ScrollAreaScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final ScrollAreaState scrollAreaState;
        final Function3<? super ScrollAreaScope, ? super Composer, ? super Integer, Unit> function3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1014701288);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(state) : startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1014701288, i3, -1, "com.composables.core.ScrollArea (ScrollArea.kt:118)");
            }
            ScrollArea(state, modifier3, OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0), CollectionsKt.listOf((Object[]) new OverscrollSides[]{OverscrollSides.m9388boximpl(OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc()), OverscrollSides.m9388boximpl(OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())}), content, startRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 0);
            scrollAreaState = state;
            function3 = content;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            function3 = content;
            modifier2 = modifier;
            scrollAreaState = state;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ScrollArea$lambda$3;
                    ScrollArea$lambda$3 = ScrollAreaKt.ScrollArea$lambda$3(ScrollAreaState.this, modifier2, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return ScrollArea$lambda$3;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScrollArea(final ScrollAreaState state, Modifier modifier, OverscrollEffect overscrollEffect, List<OverscrollSides> list, final Function3<? super ScrollAreaScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        OverscrollEffect overscrollEffect2;
        int i4;
        List<OverscrollSides> list2;
        OverscrollEffect overscrollEffect3;
        int i5;
        final Modifier modifier3;
        final OverscrollEffect overscrollEffect4;
        final List<OverscrollSides> listOf;
        Object rememberedValue;
        Object rememberedValue2;
        final Modifier modifier4;
        int i6;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1550375884);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(state) : startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    overscrollEffect2 = overscrollEffect;
                    if (startRestartGroup.changed(overscrollEffect2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    overscrollEffect2 = overscrollEffect;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                overscrollEffect2 = overscrollEffect;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                list2 = list;
                i3 |= startRestartGroup.changedInstance(list2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            overscrollEffect3 = OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                            i3 &= -897;
                        } else {
                            overscrollEffect3 = overscrollEffect2;
                        }
                        if (i4 != 0) {
                            i5 = i3;
                            modifier3 = companion;
                            overscrollEffect4 = overscrollEffect3;
                            listOf = CollectionsKt.listOf((Object[]) new OverscrollSides[]{OverscrollSides.m9388boximpl(OverscrollSides.INSTANCE.m9400getVerticalFfLkZdc()), OverscrollSides.m9388boximpl(OverscrollSides.INSTANCE.m9396getHorizontalFfLkZdc())});
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1550375884, i5, -1, "com.composables.core.ScrollArea (ScrollArea.kt:149)");
                            }
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.startReplaceGroup(1849434622);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                            ScrollArea_androidKt.NoOverscroll(ComposableLambdaKt.rememberComposableLambda(-761153891, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ScrollAreaKt$ScrollArea$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i8) {
                                    if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-761153891, i8, -1, "com.composables.core.ScrollArea.<anonymous> (ScrollArea.kt:154)");
                                    }
                                    Modifier modifier5 = Modifier.this;
                                    composer2.startReplaceGroup(1849434622);
                                    CoroutineScope coroutineScope2 = coroutineScope;
                                    OverscrollEffect overscrollEffect5 = overscrollEffect4;
                                    List<OverscrollSides> list3 = listOf;
                                    MutableSharedFlow<Unit> mutableSharedFlow2 = mutableSharedFlow;
                                    ScrollAreaState scrollAreaState = state;
                                    Object rememberedValue3 = composer2.rememberedValue();
                                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new ScrollAreaKt$ScrollArea$2$1$1(coroutineScope2, overscrollEffect5, list3, mutableSharedFlow2, scrollAreaState);
                                        composer2.updateRememberedValue(rememberedValue3);
                                    }
                                    composer2.endReplaceGroup();
                                    Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier5, (ScrollAreaKt$ScrollArea$2$1$1) rememberedValue3, null, 2, null);
                                    OverscrollEffect overscrollEffect6 = overscrollEffect4;
                                    if (overscrollEffect6 != null) {
                                        nestedScroll$default = OverscrollKt.overscroll(nestedScroll$default, overscrollEffect6);
                                    }
                                    Function3<ScrollAreaScope, Composer, Integer, Unit> function3 = content;
                                    ScrollAreaState scrollAreaState2 = state;
                                    MutableSharedFlow<Unit> mutableSharedFlow3 = mutableSharedFlow;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, nestedScroll$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                                    Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer2.startReplaceGroup(1849434622);
                                    Object rememberedValue4 = composer2.rememberedValue();
                                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new ScrollAreaScope(boxScopeInstance, scrollAreaState2, mutableSharedFlow3);
                                        composer2.updateRememberedValue(rememberedValue4);
                                    }
                                    composer2.endReplaceGroup();
                                    function3.invoke((ScrollAreaScope) rememberedValue4, composer2, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                        } else {
                            i5 = i3;
                            modifier3 = companion;
                            overscrollEffect4 = overscrollEffect3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        overscrollEffect4 = overscrollEffect2;
                    }
                    listOf = list2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    final CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    final MutableSharedFlow<Unit> mutableSharedFlow2 = (MutableSharedFlow) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    ScrollArea_androidKt.NoOverscroll(ComposableLambdaKt.rememberComposableLambda(-761153891, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ScrollAreaKt$ScrollArea$2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-761153891, i8, -1, "com.composables.core.ScrollArea.<anonymous> (ScrollArea.kt:154)");
                            }
                            Modifier modifier5 = Modifier.this;
                            composer2.startReplaceGroup(1849434622);
                            CoroutineScope coroutineScope22 = coroutineScope2;
                            OverscrollEffect overscrollEffect5 = overscrollEffect4;
                            List<OverscrollSides> list3 = listOf;
                            MutableSharedFlow<Unit> mutableSharedFlow22 = mutableSharedFlow2;
                            ScrollAreaState scrollAreaState = state;
                            Object rememberedValue3 = composer2.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new ScrollAreaKt$ScrollArea$2$1$1(coroutineScope22, overscrollEffect5, list3, mutableSharedFlow22, scrollAreaState);
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier5, (ScrollAreaKt$ScrollArea$2$1$1) rememberedValue3, null, 2, null);
                            OverscrollEffect overscrollEffect6 = overscrollEffect4;
                            if (overscrollEffect6 != null) {
                                nestedScroll$default = OverscrollKt.overscroll(nestedScroll$default, overscrollEffect6);
                            }
                            Function3<ScrollAreaScope, Composer, Integer, Unit> function3 = content;
                            ScrollAreaState scrollAreaState2 = state;
                            MutableSharedFlow<Unit> mutableSharedFlow3 = mutableSharedFlow2;
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, nestedScroll$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m4976constructorimpl = Updater.m4976constructorimpl(composer2);
                            Updater.m4983setimpl(m4976constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer2.startReplaceGroup(1849434622);
                            Object rememberedValue4 = composer2.rememberedValue();
                            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new ScrollAreaScope(boxScopeInstance, scrollAreaState2, mutableSharedFlow3);
                                composer2.updateRememberedValue(rememberedValue4);
                            }
                            composer2.endReplaceGroup();
                            function3.invoke((ScrollAreaScope) rememberedValue4, composer2, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    overscrollEffect4 = overscrollEffect2;
                    listOf = list2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit ScrollArea$lambda$5;
                            ScrollArea$lambda$5 = ScrollAreaKt.ScrollArea$lambda$5(ScrollAreaState.this, modifier4, overscrollEffect4, listOf, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return ScrollArea$lambda$5;
                        }
                    });
                    return;
                }
                return;
            }
            list2 = list;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        list2 = list;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalScrollbar(final ScrollAreaScope scrollAreaScope, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, final Function3<? super ScrollbarScope, ? super Composer, ? super Integer, Unit> thumb, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        boolean z4;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z6;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(scrollAreaScope, "<this>");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Composer startRestartGroup = composer.startRestartGroup(974533410);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(scrollAreaScope) ? 4 : 2) | i;
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
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                        if ((i2 & 16) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(thumb) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i5 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            }
                            boolean z7 = i6 != 0 ? false : z4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(974533410, i3, -1, "com.composables.core.VerticalScrollbar (ScrollArea.kt:324)");
                            }
                            int i8 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
                            boolean z8 = z3;
                            Modifier modifier4 = companion;
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            ScrollBar(scrollAreaScope, modifier4, z8, mutableInteractionSource4, z7, true, thumb, startRestartGroup, i8, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z7;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            z6 = z8;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z6 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z5 = z4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit VerticalScrollbar$lambda$7;
                                    VerticalScrollbar$lambda$7 = ScrollAreaKt.VerticalScrollbar$lambda$7(ScrollAreaScope.this, modifier3, z6, mutableInteractionSource3, z5, thumb, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return VerticalScrollbar$lambda$7;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    if ((i2 & 16) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
                    boolean z82 = z3;
                    Modifier modifier42 = companion;
                    MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    ScrollBar(scrollAreaScope, modifier42, z82, mutableInteractionSource42, z7, true, thumb, startRestartGroup, i82, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z7;
                    mutableInteractionSource3 = mutableInteractionSource42;
                    z6 = z82;
                    modifier3 = modifier42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                z4 = z2;
                if ((i2 & 16) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
                boolean z822 = z3;
                Modifier modifier422 = companion;
                MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                ScrollBar(scrollAreaScope, modifier422, z822, mutableInteractionSource422, z7, true, thumb, startRestartGroup, i822, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z7;
                mutableInteractionSource3 = mutableInteractionSource422;
                z6 = z822;
                modifier3 = modifier422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            z4 = z2;
            if ((i2 & 16) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
            boolean z8222 = z3;
            Modifier modifier4222 = companion;
            MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            ScrollBar(scrollAreaScope, modifier4222, z8222, mutableInteractionSource4222, z7, true, thumb, startRestartGroup, i8222, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z7;
            mutableInteractionSource3 = mutableInteractionSource4222;
            z6 = z8222;
            modifier3 = modifier4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        z4 = z2;
        if ((i2 & 16) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
        boolean z82222 = z3;
        Modifier modifier42222 = companion;
        MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        ScrollBar(scrollAreaScope, modifier42222, z82222, mutableInteractionSource42222, z7, true, thumb, startRestartGroup, i82222, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z7;
        mutableInteractionSource3 = mutableInteractionSource42222;
        z6 = z82222;
        modifier3 = modifier42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HorizontalScrollbar(final ScrollAreaScope scrollAreaScope, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, final Function3<? super ScrollbarScope, ? super Composer, ? super Integer, Unit> thumb, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        boolean z4;
        final boolean z5;
        final MutableInteractionSource mutableInteractionSource3;
        final boolean z6;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(scrollAreaScope, "<this>");
        Intrinsics.checkNotNullParameter(thumb, "thumb");
        Composer startRestartGroup = composer.startRestartGroup(-1262891184);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(scrollAreaScope) ? 4 : 2) | i;
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
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                        if ((i2 & 16) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(thumb) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if (i5 != 0) {
                                startRestartGroup.startReplaceGroup(1849434622);
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            }
                            boolean z7 = i6 != 0 ? false : z4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1262891184, i3, -1, "com.composables.core.HorizontalScrollbar (ScrollArea.kt:334)");
                            }
                            int i8 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
                            boolean z8 = z3;
                            Modifier modifier4 = companion;
                            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                            ScrollBar(scrollAreaScope, modifier4, z8, mutableInteractionSource4, z7, false, thumb, startRestartGroup, i8, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z7;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            z6 = z8;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z6 = z3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z5 = z4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit HorizontalScrollbar$lambda$9;
                                    HorizontalScrollbar$lambda$9 = ScrollAreaKt.HorizontalScrollbar$lambda$9(ScrollAreaScope.this, modifier3, z6, mutableInteractionSource3, z5, thumb, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return HorizontalScrollbar$lambda$9;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    if ((i2 & 16) != 0) {
                    }
                    if ((74899 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
                    boolean z82 = z3;
                    Modifier modifier42 = companion;
                    MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                    ScrollBar(scrollAreaScope, modifier42, z82, mutableInteractionSource42, z7, false, thumb, startRestartGroup, i82, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z7;
                    mutableInteractionSource3 = mutableInteractionSource42;
                    z6 = z82;
                    modifier3 = modifier42;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                z4 = z2;
                if ((i2 & 16) != 0) {
                }
                if ((74899 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i822 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
                boolean z822 = z3;
                Modifier modifier422 = companion;
                MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
                ScrollBar(scrollAreaScope, modifier422, z822, mutableInteractionSource422, z7, false, thumb, startRestartGroup, i822, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                z5 = z7;
                mutableInteractionSource3 = mutableInteractionSource422;
                z6 = z822;
                modifier3 = modifier422;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            z4 = z2;
            if ((i2 & 16) != 0) {
            }
            if ((74899 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i8222 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
            boolean z8222 = z3;
            Modifier modifier4222 = companion;
            MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
            ScrollBar(scrollAreaScope, modifier4222, z8222, mutableInteractionSource4222, z7, false, thumb, startRestartGroup, i8222, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            z5 = z7;
            mutableInteractionSource3 = mutableInteractionSource4222;
            z6 = z8222;
            modifier3 = modifier4222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        z4 = z2;
        if ((i2 & 16) != 0) {
        }
        if ((74899 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        int i82222 = (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | ((i3 << 3) & 3670016);
        boolean z82222 = z3;
        Modifier modifier42222 = companion;
        MutableInteractionSource mutableInteractionSource42222 = mutableInteractionSource2;
        ScrollBar(scrollAreaScope, modifier42222, z82222, mutableInteractionSource42222, z7, false, thumb, startRestartGroup, i82222, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        z5 = z7;
        mutableInteractionSource3 = mutableInteractionSource42222;
        z6 = z82222;
        modifier3 = modifier42222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ScrollBar(final ScrollAreaScope scrollAreaScope, final Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, boolean z3, final Function3<? super ScrollbarScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        ScrollAreaScope scrollAreaScope2;
        int i3;
        boolean z4;
        int i4;
        final MutableInteractionSource mutableInteractionSource2;
        int i5;
        boolean z5;
        boolean z6;
        Density density;
        boolean z7;
        Object rememberedValue;
        final MutableState mutableState;
        boolean z8;
        Object rememberedValue2;
        Object rememberedValue3;
        final MutableState mutableState2;
        Object rememberedValue4;
        boolean changed;
        Object rememberedValue5;
        Density density2;
        MutableState mutableState3;
        int i6;
        SliderAdapter sliderAdapter;
        boolean changed2;
        Object rememberedValue6;
        MutableInteractionSource mutableInteractionSource3;
        MeasurePolicy measurePolicy;
        int currentCompositeKeyHash;
        Composer m4976constructorimpl;
        final MutableInteractionSource mutableInteractionSource4;
        final boolean z9;
        final boolean z10;
        ScopeUpdateScope endRestartGroup;
        final boolean z11 = z3;
        Composer startRestartGroup = composer.startRestartGroup(-674775856);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
            scrollAreaScope2 = scrollAreaScope;
        } else {
            scrollAreaScope2 = scrollAreaScope;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(scrollAreaScope2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z4 = z;
            i3 |= startRestartGroup.changed(z4) ? 256 : 128;
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
                    z5 = z2;
                    i3 |= startRestartGroup.changed(z5) ? 16384 : 8192;
                    if ((i2 & 16) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(z11) ? 131072 : 65536;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        z6 = i7 == 0 ? true : z4;
                        if (i4 != 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue7;
                        }
                        boolean z12 = i5 == 0 ? false : z5;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-674775856, i3, -1, "com.composables.core.ScrollBar (ScrollArea.kt:345)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        density = (Density) consume;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        z7 = consume2 != LayoutDirection.Rtl ? !z12 : z12;
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        mutableState = (MutableState) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(-1633490746);
                        z8 = (i3 & 7168) != 2048;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z8 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    DisposableEffectResult ScrollBar$lambda$27$lambda$15$lambda$14;
                                    ScrollBar$lambda$27$lambda$15$lambda$14 = ScrollAreaKt.ScrollBar$lambda$27$lambda$15$lambda$14(MutableState.this, mutableInteractionSource2, (DisposableEffectScope) obj);
                                    return ScrollBar$lambda$27$lambda$15$lambda$14;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(mutableInteractionSource2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i3 >> 9) & 14);
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        mutableState2 = (MutableState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        float mo424toPx0680j_4 = density.mo424toPx0680j_4(Dp.m8401constructorimpl(16));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ScrollAreaState scrollAreaState = scrollAreaScope2.getScrollAreaState();
                        int ScrollBar$lambda$27$lambda$17 = ScrollBar$lambda$27$lambda$17(mutableState2);
                        int i8 = i3;
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed = startRestartGroup.changed(scrollAreaState) | startRestartGroup.changed(ScrollBar$lambda$27$lambda$17) | startRestartGroup.changed(mo424toPx0680j_4) | startRestartGroup.changed(z7) | ((i8 & 458752) != 131072) | startRestartGroup.changed(coroutineScope);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            density2 = density;
                            mutableState3 = mutableState;
                            i6 = -1633490746;
                            rememberedValue5 = new SliderAdapter(scrollAreaScope2.getScrollAreaState(), ScrollBar$lambda$27$lambda$17(mutableState2), mo424toPx0680j_4, z7, z3, coroutineScope);
                            z11 = z3;
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        } else {
                            density2 = density;
                            mutableState3 = mutableState;
                            i6 = -1633490746;
                        }
                        sliderAdapter = (SliderAdapter) rememberedValue5;
                        startRestartGroup.endReplaceGroup();
                        int ScrollBar$lambda$27$lambda$172 = ScrollBar$lambda$27$lambda$17(mutableState2);
                        startRestartGroup.startReplaceGroup(i6);
                        changed2 = startRestartGroup.changed(ScrollBar$lambda$27$lambda$172) | startRestartGroup.changed(sliderAdapter);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                            rememberedValue6 = new ScrollbarScope(mutableState3, sliderAdapter, mutableInteractionSource5, scrollAreaScope.getScrollAreaState(), scrollAreaScope.getOnScrolledEvents$core_release());
                            mutableInteractionSource3 = mutableInteractionSource5;
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        ScrollbarScope scrollbarScope = (ScrollbarScope) rememberedValue6;
                        startRestartGroup.endReplaceGroup();
                        int mo418roundToPx0680j_4 = density2.mo418roundToPx0680j_4(Dp.m8401constructorimpl(8));
                        if (z11) {
                            startRestartGroup.startReplaceGroup(487460000);
                            startRestartGroup.startReplaceGroup(i6);
                            boolean changed3 = startRestartGroup.changed(sliderAdapter) | startRestartGroup.changed(mo418roundToPx0680j_4);
                            Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (changed3 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = horizontalMeasurePolicy(sliderAdapter, new Function1() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit ScrollBar$lambda$27$lambda$24$lambda$23;
                                        ScrollBar$lambda$27$lambda$24$lambda$23 = ScrollAreaKt.ScrollBar$lambda$27$lambda$24$lambda$23(MutableState.this, ((Integer) obj).intValue());
                                        return ScrollBar$lambda$27$lambda$24$lambda$23;
                                    }
                                }, mo418roundToPx0680j_4);
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            measurePolicy = (MeasurePolicy) rememberedValue8;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(487297250);
                            startRestartGroup.startReplaceGroup(i6);
                            boolean changed4 = startRestartGroup.changed(sliderAdapter) | startRestartGroup.changed(mo418roundToPx0680j_4);
                            Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (changed4 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = verticalMeasurePolicy(sliderAdapter, new Function1() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit ScrollBar$lambda$27$lambda$22$lambda$21;
                                        ScrollBar$lambda$27$lambda$22$lambda$21 = ScrollAreaKt.ScrollBar$lambda$27$lambda$22$lambda$21(MutableState.this, ((Integer) obj).intValue());
                                        return ScrollBar$lambda$27$lambda$22$lambda$21;
                                    }
                                }, mo418roundToPx0680j_4);
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            }
                            measurePolicy = (MeasurePolicy) rememberedValue9;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endReplaceGroup();
                        }
                        Modifier hoverable$default = HoverableKt.hoverable$default(modifier, mutableInteractionSource3, false, 2, null);
                        if (z6) {
                            hoverable$default = scrollOnPressTrack(hoverable$default, z11, z7, sliderAdapter);
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, hoverable$default);
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
                        Updater.m4983setimpl(m4976constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4976constructorimpl.getInserting() || !Intrinsics.areEqual(m4976constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4983setimpl(m4976constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        function3.invoke(scrollbarScope, startRestartGroup, Integer.valueOf((i8 >> 15) & 112));
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        z9 = z6;
                        z10 = z12;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z10 = z5;
                        z9 = z4;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit ScrollBar$lambda$28;
                                ScrollBar$lambda$28 = ScrollAreaKt.ScrollBar$lambda$28(ScrollAreaScope.this, modifier, z9, mutableInteractionSource4, z10, z11, function3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return ScrollBar$lambda$28;
                            }
                        });
                        return;
                    }
                    return;
                }
                z5 = z2;
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i3 & 599187) == 599186) {
                }
                if (i7 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume3 = startRestartGroup.consume(localDensity2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                density = (Density) consume3;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (consume22 != LayoutDirection.Rtl) {
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                if ((i3 & 7168) != 2048) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z8) {
                }
                rememberedValue2 = new Function1() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DisposableEffectResult ScrollBar$lambda$27$lambda$15$lambda$14;
                        ScrollBar$lambda$27$lambda$15$lambda$14 = ScrollAreaKt.ScrollBar$lambda$27$lambda$15$lambda$14(MutableState.this, mutableInteractionSource2, (DisposableEffectScope) obj);
                        return ScrollBar$lambda$27$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(mutableInteractionSource2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i3 >> 9) & 14);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                float mo424toPx0680j_42 = density.mo424toPx0680j_4(Dp.m8401constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ScrollAreaState scrollAreaState2 = scrollAreaScope2.getScrollAreaState();
                int ScrollBar$lambda$27$lambda$173 = ScrollBar$lambda$27$lambda$17(mutableState2);
                int i82 = i3;
                startRestartGroup.startReplaceGroup(-1224400529);
                changed = startRestartGroup.changed(scrollAreaState2) | startRestartGroup.changed(ScrollBar$lambda$27$lambda$173) | startRestartGroup.changed(mo424toPx0680j_42) | startRestartGroup.changed(z7) | ((i82 & 458752) != 131072) | startRestartGroup.changed(coroutineScope2);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                density2 = density;
                mutableState3 = mutableState;
                i6 = -1633490746;
                rememberedValue5 = new SliderAdapter(scrollAreaScope2.getScrollAreaState(), ScrollBar$lambda$27$lambda$17(mutableState2), mo424toPx0680j_42, z7, z3, coroutineScope2);
                z11 = z3;
                startRestartGroup.updateRememberedValue(rememberedValue5);
                sliderAdapter = (SliderAdapter) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                int ScrollBar$lambda$27$lambda$1722 = ScrollBar$lambda$27$lambda$17(mutableState2);
                startRestartGroup.startReplaceGroup(i6);
                changed2 = startRestartGroup.changed(ScrollBar$lambda$27$lambda$1722) | startRestartGroup.changed(sliderAdapter);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (changed2) {
                }
                MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource2;
                rememberedValue6 = new ScrollbarScope(mutableState3, sliderAdapter, mutableInteractionSource52, scrollAreaScope.getScrollAreaState(), scrollAreaScope.getOnScrolledEvents$core_release());
                mutableInteractionSource3 = mutableInteractionSource52;
                startRestartGroup.updateRememberedValue(rememberedValue6);
                ScrollbarScope scrollbarScope2 = (ScrollbarScope) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                int mo418roundToPx0680j_42 = density2.mo418roundToPx0680j_4(Dp.m8401constructorimpl(8));
                if (z11) {
                }
                Modifier hoverable$default2 = HoverableKt.hoverable$default(modifier, mutableInteractionSource3, false, 2, null);
                if (z6) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, hoverable$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
                Updater.m4983setimpl(m4976constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4976constructorimpl.getInserting()) {
                }
                m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4983setimpl(m4976constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                function3.invoke(scrollbarScope2, startRestartGroup, Integer.valueOf((i82 >> 15) & 112));
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                z9 = z6;
                z10 = z12;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            mutableInteractionSource2 = mutableInteractionSource;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z5 = z2;
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            if (i7 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(localDensity22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            density = (Density) consume32;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume222 = startRestartGroup.consume(localLayoutDirection22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (consume222 != LayoutDirection.Rtl) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z8) {
            }
            rememberedValue2 = new Function1() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DisposableEffectResult ScrollBar$lambda$27$lambda$15$lambda$14;
                    ScrollBar$lambda$27$lambda$15$lambda$14 = ScrollAreaKt.ScrollBar$lambda$27$lambda$15$lambda$14(MutableState.this, mutableInteractionSource2, (DisposableEffectScope) obj);
                    return ScrollBar$lambda$27$lambda$15$lambda$14;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.DisposableEffect(mutableInteractionSource2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i3 >> 9) & 14);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            float mo424toPx0680j_422 = density.mo424toPx0680j_4(Dp.m8401constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            CoroutineScope coroutineScope22 = (CoroutineScope) rememberedValue4;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ScrollAreaState scrollAreaState22 = scrollAreaScope2.getScrollAreaState();
            int ScrollBar$lambda$27$lambda$1732 = ScrollBar$lambda$27$lambda$17(mutableState2);
            int i822 = i3;
            startRestartGroup.startReplaceGroup(-1224400529);
            changed = startRestartGroup.changed(scrollAreaState22) | startRestartGroup.changed(ScrollBar$lambda$27$lambda$1732) | startRestartGroup.changed(mo424toPx0680j_422) | startRestartGroup.changed(z7) | ((i822 & 458752) != 131072) | startRestartGroup.changed(coroutineScope22);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            density2 = density;
            mutableState3 = mutableState;
            i6 = -1633490746;
            rememberedValue5 = new SliderAdapter(scrollAreaScope2.getScrollAreaState(), ScrollBar$lambda$27$lambda$17(mutableState2), mo424toPx0680j_422, z7, z3, coroutineScope22);
            z11 = z3;
            startRestartGroup.updateRememberedValue(rememberedValue5);
            sliderAdapter = (SliderAdapter) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            int ScrollBar$lambda$27$lambda$17222 = ScrollBar$lambda$27$lambda$17(mutableState2);
            startRestartGroup.startReplaceGroup(i6);
            changed2 = startRestartGroup.changed(ScrollBar$lambda$27$lambda$17222) | startRestartGroup.changed(sliderAdapter);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (changed2) {
            }
            MutableInteractionSource mutableInteractionSource522 = mutableInteractionSource2;
            rememberedValue6 = new ScrollbarScope(mutableState3, sliderAdapter, mutableInteractionSource522, scrollAreaScope.getScrollAreaState(), scrollAreaScope.getOnScrolledEvents$core_release());
            mutableInteractionSource3 = mutableInteractionSource522;
            startRestartGroup.updateRememberedValue(rememberedValue6);
            ScrollbarScope scrollbarScope22 = (ScrollbarScope) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            int mo418roundToPx0680j_422 = density2.mo418roundToPx0680j_4(Dp.m8401constructorimpl(8));
            if (z11) {
            }
            Modifier hoverable$default22 = HoverableKt.hoverable$default(modifier, mutableInteractionSource3, false, 2, null);
            if (z6) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, hoverable$default22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
            Updater.m4983setimpl(m4976constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4976constructorimpl.getInserting()) {
            }
            m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4983setimpl(m4976constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            function3.invoke(scrollbarScope22, startRestartGroup, Integer.valueOf((i822 >> 15) & 112));
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            mutableInteractionSource4 = mutableInteractionSource3;
            z9 = z6;
            z10 = z12;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z4 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z5 = z2;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        if (i7 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(localDensity222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        density = (Density) consume322;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (consume2222 != LayoutDirection.Rtl) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        if ((i3 & 7168) != 2048) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z8) {
        }
        rememberedValue2 = new Function1() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                DisposableEffectResult ScrollBar$lambda$27$lambda$15$lambda$14;
                ScrollBar$lambda$27$lambda$15$lambda$14 = ScrollAreaKt.ScrollBar$lambda$27$lambda$15$lambda$14(MutableState.this, mutableInteractionSource2, (DisposableEffectScope) obj);
                return ScrollBar$lambda$27$lambda$15$lambda$14;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.DisposableEffect(mutableInteractionSource2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, (i3 >> 9) & 14);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        mutableState2 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        float mo424toPx0680j_4222 = density.mo424toPx0680j_4(Dp.m8401constructorimpl(16));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        CoroutineScope coroutineScope222 = (CoroutineScope) rememberedValue4;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ScrollAreaState scrollAreaState222 = scrollAreaScope2.getScrollAreaState();
        int ScrollBar$lambda$27$lambda$17322 = ScrollBar$lambda$27$lambda$17(mutableState2);
        int i8222 = i3;
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = startRestartGroup.changed(scrollAreaState222) | startRestartGroup.changed(ScrollBar$lambda$27$lambda$17322) | startRestartGroup.changed(mo424toPx0680j_4222) | startRestartGroup.changed(z7) | ((i8222 & 458752) != 131072) | startRestartGroup.changed(coroutineScope222);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        density2 = density;
        mutableState3 = mutableState;
        i6 = -1633490746;
        rememberedValue5 = new SliderAdapter(scrollAreaScope2.getScrollAreaState(), ScrollBar$lambda$27$lambda$17(mutableState2), mo424toPx0680j_4222, z7, z3, coroutineScope222);
        z11 = z3;
        startRestartGroup.updateRememberedValue(rememberedValue5);
        sliderAdapter = (SliderAdapter) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        int ScrollBar$lambda$27$lambda$172222 = ScrollBar$lambda$27$lambda$17(mutableState2);
        startRestartGroup.startReplaceGroup(i6);
        changed2 = startRestartGroup.changed(ScrollBar$lambda$27$lambda$172222) | startRestartGroup.changed(sliderAdapter);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (changed2) {
        }
        MutableInteractionSource mutableInteractionSource5222 = mutableInteractionSource2;
        rememberedValue6 = new ScrollbarScope(mutableState3, sliderAdapter, mutableInteractionSource5222, scrollAreaScope.getScrollAreaState(), scrollAreaScope.getOnScrolledEvents$core_release());
        mutableInteractionSource3 = mutableInteractionSource5222;
        startRestartGroup.updateRememberedValue(rememberedValue6);
        ScrollbarScope scrollbarScope222 = (ScrollbarScope) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        int mo418roundToPx0680j_4222 = density2.mo418roundToPx0680j_4(Dp.m8401constructorimpl(8));
        if (z11) {
        }
        Modifier hoverable$default222 = HoverableKt.hoverable$default(modifier, mutableInteractionSource3, false, 2, null);
        if (z6) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, hoverable$default222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4976constructorimpl = Updater.m4976constructorimpl(startRestartGroup);
        Updater.m4983setimpl(m4976constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4983setimpl(m4976constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4976constructorimpl.getInserting()) {
        }
        m4976constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4976constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4983setimpl(m4976constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        function3.invoke(scrollbarScope222, startRestartGroup, Integer.valueOf((i8222 >> 15) & 112));
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        mutableInteractionSource4 = mutableInteractionSource3;
        z9 = z6;
        z10 = z12;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final int ScrollBar$lambda$27$lambda$17(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void ScrollBar$lambda$27$lambda$18(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollBar$lambda$27$lambda$22$lambda$21(MutableState mutableState, int i) {
        ScrollBar$lambda$27$lambda$18(mutableState, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollBar$lambda$27$lambda$24$lambda$23(MutableState mutableState, int i) {
        ScrollBar$lambda$27$lambda$18(mutableState, i);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Thumb(final ScrollbarScope scrollbarScope, Modifier modifier, ThumbVisibility thumbVisibility, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ThumbVisibility thumbVisibility2;
        int i5;
        boolean z2;
        ThumbVisibility thumbVisibility3;
        boolean z3;
        ThumbVisibility thumbVisibility4;
        int i6;
        Continuation continuation;
        MutableState mutableState;
        final Modifier modifier3;
        final ThumbVisibility thumbVisibility5;
        final boolean z4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(scrollbarScope, "<this>");
        Composer startRestartGroup = composer.startRestartGroup(699897841);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(scrollbarScope) ? 4 : 2) | i;
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
            } else if ((i & 384) == 0) {
                thumbVisibility2 = thumbVisibility;
                i3 |= startRestartGroup.changed(thumbVisibility2) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                        final Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        thumbVisibility3 = i4 == 0 ? ThumbVisibility.AlwaysVisible.INSTANCE : thumbVisibility2;
                        final boolean z5 = i5 == 0 ? true : z2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(699897841, i3, -1, "com.composables.core.Thumb (ScrollArea.kt:405)");
                        }
                        final ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1326197392, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ScrollAreaKt$Thumb$content$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1326197392, i8, -1, "com.composables.core.Thumb.<anonymous> (ScrollArea.kt:407)");
                                }
                                Modifier modifier4 = Modifier.this;
                                boolean z6 = z5;
                                ScrollbarScope scrollbarScope2 = scrollbarScope;
                                if (z6) {
                                    modifier4 = ScrollAreaKt.scrollbarDrag(modifier4, scrollbarScope2.getMutableInteractionSource(), scrollbarScope2.getDragInteraction$core_release(), scrollbarScope2.getSliderAdapter());
                                }
                                BoxKt.Box(modifier4, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, startRestartGroup, 54);
                        if (!Intrinsics.areEqual(thumbVisibility3, ThumbVisibility.AlwaysVisible.INSTANCE)) {
                            startRestartGroup.startReplaceGroup(-1409057768);
                            rememberComposableLambda.invoke(startRestartGroup, 6);
                            startRestartGroup.endReplaceGroup();
                            z3 = z5;
                            thumbVisibility4 = thumbVisibility3;
                        } else if (!(thumbVisibility3 instanceof ThumbVisibility.HideWhileIdle)) {
                            z3 = z5;
                            thumbVisibility4 = thumbVisibility3;
                            startRestartGroup.startReplaceGroup(-1408213359);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-1408950446);
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            MutableState mutableState2 = (MutableState) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                            State<Boolean> collectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(scrollbarScope.getMutableInteractionSource(), startRestartGroup, 0);
                            State<Boolean> collectIsDraggedAsState = DragInteractionKt.collectIsDraggedAsState(scrollbarScope.getScrollAreaState().getInteractionSource(), startRestartGroup, 0);
                            Boolean valueOf = Boolean.valueOf(Thumb$lambda$30(mutableState2));
                            Boolean valueOf2 = Boolean.valueOf(Thumb$lambda$33(collectIsDraggedAsState));
                            Boolean valueOf3 = Boolean.valueOf(Thumb$lambda$32(collectIsHoveredAsState));
                            startRestartGroup.startReplaceGroup(-1224400529);
                            boolean changed = ((i3 & 896) == 256) | startRestartGroup.changed(collectIsDraggedAsState) | startRestartGroup.changed(collectIsHoveredAsState);
                            ScrollAreaKt$Thumb$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                i6 = 6;
                                continuation = null;
                                thumbVisibility4 = thumbVisibility3;
                                mutableState = mutableState2;
                                rememberedValue2 = new ScrollAreaKt$Thumb$1$1(thumbVisibility3, collectIsDraggedAsState, collectIsHoveredAsState, mutableState2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            } else {
                                i6 = 6;
                                continuation = null;
                                mutableState = mutableState2;
                                thumbVisibility4 = thumbVisibility3;
                            }
                            startRestartGroup.endReplaceGroup();
                            z3 = z5;
                            EffectsKt.LaunchedEffect(valueOf, valueOf2, valueOf3, (Function2) rememberedValue2, startRestartGroup, 0);
                            Unit unit = Unit.INSTANCE;
                            startRestartGroup.startReplaceGroup(-1633490746);
                            boolean changedInstance = startRestartGroup.changedInstance(scrollbarScope);
                            ScrollAreaKt$Thumb$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new ScrollAreaKt$Thumb$2$1(scrollbarScope, mutableState, continuation);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            startRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, i6);
                            ThumbVisibility.HideWhileIdle hideWhileIdle = (ThumbVisibility.HideWhileIdle) thumbVisibility4;
                            AnimatedVisibilityKt.AnimatedVisibility(Thumb$lambda$30(mutableState), (Modifier) null, hideWhileIdle.getEnter(), hideWhileIdle.getExit(), (String) null, ComposableLambdaKt.rememberComposableLambda(1247927061, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.composables.core.ScrollAreaKt$Thumb$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i8) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1247927061, i8, -1, "com.composables.core.Thumb.<anonymous> (ScrollArea.kt:442)");
                                    }
                                    rememberComposableLambda.invoke(composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
                            startRestartGroup = startRestartGroup;
                            startRestartGroup.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = companion;
                        thumbVisibility5 = thumbVisibility4;
                        z4 = z3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        thumbVisibility5 = thumbVisibility2;
                        z4 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.composables.core.ScrollAreaKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit Thumb$lambda$36;
                                Thumb$lambda$36 = ScrollAreaKt.Thumb$lambda$36(ScrollbarScope.this, modifier3, thumbVisibility5, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return Thumb$lambda$36;
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i3 & 1171) == 1170) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1326197392, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ScrollAreaKt$Thumb$content$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1326197392, i8, -1, "com.composables.core.Thumb.<anonymous> (ScrollArea.kt:407)");
                        }
                        Modifier modifier4 = Modifier.this;
                        boolean z6 = z5;
                        ScrollbarScope scrollbarScope2 = scrollbarScope;
                        if (z6) {
                            modifier4 = ScrollAreaKt.scrollbarDrag(modifier4, scrollbarScope2.getMutableInteractionSource(), scrollbarScope2.getDragInteraction$core_release(), scrollbarScope2.getSliderAdapter());
                        }
                        BoxKt.Box(modifier4, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54);
                if (!Intrinsics.areEqual(thumbVisibility3, ThumbVisibility.AlwaysVisible.INSTANCE)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                thumbVisibility5 = thumbVisibility4;
                z4 = z3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            thumbVisibility2 = thumbVisibility;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i3 & 1171) == 1170) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda22 = ComposableLambdaKt.rememberComposableLambda(1326197392, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ScrollAreaKt$Thumb$content$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    if ((i8 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1326197392, i8, -1, "com.composables.core.Thumb.<anonymous> (ScrollArea.kt:407)");
                    }
                    Modifier modifier4 = Modifier.this;
                    boolean z6 = z5;
                    ScrollbarScope scrollbarScope2 = scrollbarScope;
                    if (z6) {
                        modifier4 = ScrollAreaKt.scrollbarDrag(modifier4, scrollbarScope2.getMutableInteractionSource(), scrollbarScope2.getDragInteraction$core_release(), scrollbarScope2.getSliderAdapter());
                    }
                    BoxKt.Box(modifier4, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            if (!Intrinsics.areEqual(thumbVisibility3, ThumbVisibility.AlwaysVisible.INSTANCE)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            thumbVisibility5 = thumbVisibility4;
            z4 = z3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        thumbVisibility2 = thumbVisibility;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final Function2<? super Composer, ? super Integer, Unit> rememberComposableLambda222 = ComposableLambdaKt.rememberComposableLambda(1326197392, true, new Function2<Composer, Integer, Unit>() { // from class: com.composables.core.ScrollAreaKt$Thumb$content$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i8) {
                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1326197392, i8, -1, "com.composables.core.Thumb.<anonymous> (ScrollArea.kt:407)");
                }
                Modifier modifier4 = Modifier.this;
                boolean z6 = z5;
                ScrollbarScope scrollbarScope2 = scrollbarScope;
                if (z6) {
                    modifier4 = ScrollAreaKt.scrollbarDrag(modifier4, scrollbarScope2.getMutableInteractionSource(), scrollbarScope2.getDragInteraction$core_release(), scrollbarScope2.getSliderAdapter());
                }
                BoxKt.Box(modifier4, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54);
        if (!Intrinsics.areEqual(thumbVisibility3, ThumbVisibility.AlwaysVisible.INSTANCE)) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        thumbVisibility5 = thumbVisibility4;
        z4 = z3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Thumb$lambda$30(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Thumb$lambda$31(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange getThumbPixelRange(SliderAdapter sliderAdapter) {
        int roundToInt = MathKt.roundToInt(sliderAdapter.getPosition());
        return RangesKt.until(roundToInt, MathKt.roundToInt(sliderAdapter.getThumbSize()) + roundToInt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getSize(IntRange intRange) {
        return (intRange.getLast() + 1) - intRange.getFirst();
    }

    private static final MeasurePolicy verticalMeasurePolicy(SliderAdapter sliderAdapter, Function1<? super Integer, Unit> function1, int i) {
        return new ScrollAreaKt$verticalMeasurePolicy$1(function1, sliderAdapter, i);
    }

    private static final MeasurePolicy horizontalMeasurePolicy(SliderAdapter sliderAdapter, Function1<? super Integer, Unit> function1, int i) {
        return new ScrollAreaKt$horizontalMeasurePolicy$1(function1, sliderAdapter, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier scrollbarDrag(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableState<DragInteraction.Start> mutableState, SliderAdapter sliderAdapter) {
        return ComposedModifierKt.composed$default(modifier, null, new ScrollAreaKt$scrollbarDrag$1(mutableInteractionSource, mutableState, sliderAdapter), 1, null);
    }

    private static final Modifier scrollOnPressTrack(Modifier modifier, final boolean z, final boolean z2, final SliderAdapter sliderAdapter) {
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.composables.core.ScrollAreaKt$scrollOnPressTrack$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(1383253924);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1383253924, i, -1, "com.composables.core.scrollOnPressTrack.<anonymous> (ScrollArea.kt:533)");
                }
                ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(composer, -954203484, "CC(remember):Effects.kt#9igjgp");
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                    composer.updateRememberedValue(rememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.startReplaceGroup(-1746271574);
                boolean changed = composer.changed(SliderAdapter.this) | composer.changed(coroutineScope) | composer.changed(z2);
                SliderAdapter sliderAdapter2 = SliderAdapter.this;
                boolean z3 = z2;
                Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new TrackPressScroller(coroutineScope, sliderAdapter2, z3);
                    composer.updateRememberedValue(rememberedValue2);
                }
                final TrackPressScroller trackPressScroller = (TrackPressScroller) rememberedValue2;
                composer.endReplaceGroup();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean changed2 = composer.changed(z) | composer.changedInstance(trackPressScroller);
                final boolean z4 = z;
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: com.composables.core.ScrollAreaKt$scrollOnPressTrack$1$1$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            Object detectScrollViaTrackGestures;
                            detectScrollViaTrackGestures = ScrollAreaKt.detectScrollViaTrackGestures(pointerInputScope, z4, trackPressScroller, continuation);
                            return detectScrollViaTrackGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectScrollViaTrackGestures : Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, trackPressScroller, (PointerInputEventHandler) rememberedValue3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return pointerInput;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectScrollViaTrackGestures(PointerInputScope pointerInputScope, boolean z, TrackPressScroller trackPressScroller, Continuation<? super Unit> continuation) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new ScrollAreaKt$detectScrollViaTrackGestures$2(trackPressScroller, z, null), continuation);
        return awaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : Unit.INSTANCE;
    }

    public static final double getMaxScrollOffset(ScrollAreaState scrollAreaState) {
        Intrinsics.checkNotNullParameter(scrollAreaState, "<this>");
        return RangesKt.coerceAtLeast(scrollAreaState.getContentSize() - scrollAreaState.getViewportSize(), 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ScrollBar$lambda$27$lambda$15$lambda$14(final MutableState mutableState, final MutableInteractionSource mutableInteractionSource, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.composables.core.ScrollAreaKt$ScrollBar$lambda$27$lambda$15$lambda$14$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                DragInteraction.Start start = (DragInteraction.Start) MutableState.this.getValue();
                if (start != null) {
                    mutableInteractionSource.tryEmit(new DragInteraction.Cancel(start));
                    MutableState.this.setValue(null);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Thumb$lambda$32(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Thumb$lambda$33(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float detectScrollViaTrackGestures$onScrollAxis(long j, boolean z) {
        return Float.intBitsToFloat((int) (z ? j & 4294967295L : j >> 32));
    }
}
