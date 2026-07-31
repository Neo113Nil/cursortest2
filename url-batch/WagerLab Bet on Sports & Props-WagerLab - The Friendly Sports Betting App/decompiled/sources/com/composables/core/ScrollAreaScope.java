package com.composables.core;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/composables/core/ScrollAreaScope;", "", "boxScope", "Landroidx/compose/foundation/layout/BoxScope;", "scrollAreaState", "Lcom/composables/core/ScrollAreaState;", "onScrolledEvents", "Lkotlinx/coroutines/flow/Flow;", "", "<init>", "(Landroidx/compose/foundation/layout/BoxScope;Lcom/composables/core/ScrollAreaState;Lkotlinx/coroutines/flow/Flow;)V", "getScrollAreaState$core_release", "()Lcom/composables/core/ScrollAreaState;", "getOnScrolledEvents$core_release", "()Lkotlinx/coroutines/flow/Flow;", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollAreaScope {
    public static final int $stable = 8;
    private final BoxScope boxScope;
    private final Flow<Unit> onScrolledEvents;
    private final ScrollAreaState scrollAreaState;

    public ScrollAreaScope(BoxScope boxScope, ScrollAreaState scrollAreaState, Flow<Unit> onScrolledEvents) {
        Intrinsics.checkNotNullParameter(boxScope, "boxScope");
        Intrinsics.checkNotNullParameter(scrollAreaState, "scrollAreaState");
        Intrinsics.checkNotNullParameter(onScrolledEvents, "onScrolledEvents");
        this.boxScope = boxScope;
        this.scrollAreaState = scrollAreaState;
        this.onScrolledEvents = onScrolledEvents;
    }

    /* renamed from: getScrollAreaState$core_release, reason: from getter */
    public final ScrollAreaState getScrollAreaState() {
        return this.scrollAreaState;
    }

    public final Flow<Unit> getOnScrolledEvents$core_release() {
        return this.onScrolledEvents;
    }

    public final Modifier align(Modifier modifier, Alignment alignment) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return this.boxScope.align(modifier, alignment);
    }
}
