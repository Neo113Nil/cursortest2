package com.composables.core;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B?\b\u0000\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/composables/core/ScrollbarScope;", "", "dragInteraction", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/foundation/interaction/DragInteraction$Start;", "sliderAdapter", "Lcom/composables/core/SliderAdapter;", "mutableInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "scrollAreaState", "Lcom/composables/core/ScrollAreaState;", "onScrolledEvents", "Lkotlinx/coroutines/flow/Flow;", "", "<init>", "(Landroidx/compose/runtime/MutableState;Lcom/composables/core/SliderAdapter;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lcom/composables/core/ScrollAreaState;Lkotlinx/coroutines/flow/Flow;)V", "getDragInteraction$core_release", "()Landroidx/compose/runtime/MutableState;", "getSliderAdapter$core_release", "()Lcom/composables/core/SliderAdapter;", "getMutableInteractionSource$core_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getScrollAreaState$core_release", "()Lcom/composables/core/ScrollAreaState;", "getOnScrolledEvents$core_release", "()Lkotlinx/coroutines/flow/Flow;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollbarScope {
    public static final int $stable = 8;
    private final MutableState<DragInteraction.Start> dragInteraction;
    private final MutableInteractionSource mutableInteractionSource;
    private final Flow<Unit> onScrolledEvents;
    private final ScrollAreaState scrollAreaState;
    private final SliderAdapter sliderAdapter;

    public ScrollbarScope(MutableState<DragInteraction.Start> dragInteraction, SliderAdapter sliderAdapter, MutableInteractionSource mutableInteractionSource, ScrollAreaState scrollAreaState, Flow<Unit> onScrolledEvents) {
        Intrinsics.checkNotNullParameter(dragInteraction, "dragInteraction");
        Intrinsics.checkNotNullParameter(sliderAdapter, "sliderAdapter");
        Intrinsics.checkNotNullParameter(mutableInteractionSource, "mutableInteractionSource");
        Intrinsics.checkNotNullParameter(scrollAreaState, "scrollAreaState");
        Intrinsics.checkNotNullParameter(onScrolledEvents, "onScrolledEvents");
        this.dragInteraction = dragInteraction;
        this.sliderAdapter = sliderAdapter;
        this.mutableInteractionSource = mutableInteractionSource;
        this.scrollAreaState = scrollAreaState;
        this.onScrolledEvents = onScrolledEvents;
    }

    public final MutableState<DragInteraction.Start> getDragInteraction$core_release() {
        return this.dragInteraction;
    }

    /* renamed from: getSliderAdapter$core_release, reason: from getter */
    public final SliderAdapter getSliderAdapter() {
        return this.sliderAdapter;
    }

    /* renamed from: getMutableInteractionSource$core_release, reason: from getter */
    public final MutableInteractionSource getMutableInteractionSource() {
        return this.mutableInteractionSource;
    }

    /* renamed from: getScrollAreaState$core_release, reason: from getter */
    public final ScrollAreaState getScrollAreaState() {
        return this.scrollAreaState;
    }

    public final Flow<Unit> getOnScrolledEvents$core_release() {
        return this.onScrolledEvents;
    }
}
