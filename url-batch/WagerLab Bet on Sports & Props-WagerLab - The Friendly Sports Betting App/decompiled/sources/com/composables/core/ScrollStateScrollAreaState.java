package com.composables.core;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/composables/core/ScrollStateScrollAreaState;", "Lcom/composables/core/ScrollAreaState;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "<init>", "(Landroidx/compose/foundation/ScrollState;)V", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "scrollOffset", "", "getScrollOffset", "()D", "scrollTo", "", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contentSize", "getContentSize", "viewportSize", "getViewportSize", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollStateScrollAreaState implements ScrollAreaState {
    public static final int $stable = 0;
    private final ScrollState scrollState;

    public ScrollStateScrollAreaState(ScrollState scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.scrollState = scrollState;
    }

    @Override // com.composables.core.ScrollAreaState
    public InteractionSource getInteractionSource() {
        return this.scrollState.getInteractionSource();
    }

    @Override // com.composables.core.ScrollAreaState
    public double getScrollOffset() {
        return this.scrollState.getValue();
    }

    @Override // com.composables.core.ScrollAreaState
    public Object scrollTo(double d, Continuation<? super Unit> continuation) {
        Object scrollTo = this.scrollState.scrollTo(MathKt.roundToInt(d), continuation);
        return scrollTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollTo : Unit.INSTANCE;
    }

    @Override // com.composables.core.ScrollAreaState
    public double getContentSize() {
        return this.scrollState.getMaxValue() + getViewportSize();
    }

    @Override // com.composables.core.ScrollAreaState
    public double getViewportSize() {
        return this.scrollState.getViewportSize();
    }
}
