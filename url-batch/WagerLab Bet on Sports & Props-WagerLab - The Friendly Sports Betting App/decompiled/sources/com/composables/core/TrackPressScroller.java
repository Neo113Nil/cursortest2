package com.composables.core;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0013H\u0002J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/composables/core/TrackPressScroller;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "sliderAdapter", "Lcom/composables/core/SliderAdapter;", "reverseLayout", "", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/composables/core/SliderAdapter;Z)V", "direction", "", "offset", "", "Ljava/lang/Float;", "job", "Lkotlinx/coroutines/Job;", "directionOfScrollTowards", "scrollTowardsCurrentOffset", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startScrolling", "onPress", "onMovePressed", "cleanupAfterGesture", "onRelease", "onGestureCancelled", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TrackPressScroller {
    private final CoroutineScope coroutineScope;
    private int direction;
    private Job job;
    private Float offset;
    private final boolean reverseLayout;
    private final SliderAdapter sliderAdapter;

    public TrackPressScroller(CoroutineScope coroutineScope, SliderAdapter sliderAdapter, boolean z) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sliderAdapter, "sliderAdapter");
        this.coroutineScope = coroutineScope;
        this.sliderAdapter = sliderAdapter;
        this.reverseLayout = z;
    }

    private final int directionOfScrollTowards(float offset) {
        IntRange thumbPixelRange;
        thumbPixelRange = ScrollAreaKt.getThumbPixelRange(this.sliderAdapter);
        if (offset < thumbPixelRange.getFirst()) {
            return this.reverseLayout ? 1 : -1;
        }
        if (offset > thumbPixelRange.getLast()) {
            return this.reverseLayout ? -1 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object scrollTowardsCurrentOffset(Continuation<? super Unit> continuation) {
        Float f = this.offset;
        if (f != null) {
            int directionOfScrollTowards = directionOfScrollTowards(f.floatValue());
            if (directionOfScrollTowards != this.direction) {
                return Unit.INSTANCE;
            }
            ScrollAreaState adapter = this.sliderAdapter.getAdapter();
            Object scrollTo = adapter.scrollTo(adapter.getScrollOffset() + (directionOfScrollTowards * adapter.getViewportSize()), continuation);
            if (scrollTo == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return scrollTo;
            }
        }
        return Unit.INSTANCE;
    }

    private final void startScrolling() {
        Job launch$default;
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new TrackPressScroller$startScrolling$1(this, null), 3, null);
        this.job = launch$default;
    }

    public final void onPress(float offset) {
        this.offset = Float.valueOf(offset);
        int directionOfScrollTowards = directionOfScrollTowards(offset);
        this.direction = directionOfScrollTowards;
        if (directionOfScrollTowards != 0) {
            startScrolling();
        }
    }

    public final void onMovePressed(float offset) {
        this.offset = Float.valueOf(offset);
    }

    private final void cleanupAfterGesture() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.direction = 0;
        this.offset = null;
    }

    public final void onRelease() {
        cleanupAfterGesture();
    }

    public final void onGestureCancelled() {
        cleanupAfterGesture();
    }
}
