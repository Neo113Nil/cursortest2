package com.composables.core;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010(J\u0015\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-¢\u0006\u0004\b.\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u001d\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/composables/core/SliderAdapter;", "", "adapter", "Lcom/composables/core/ScrollAreaState;", "trackSize", "", ViewProps.MIN_HEIGHT, "", "reverseLayout", "", "isVertical", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/composables/core/ScrollAreaState;IFZZLkotlinx/coroutines/CoroutineScope;)V", "getAdapter", "()Lcom/composables/core/ScrollAreaState;", "contentSize", "", "getContentSize", "()D", "visiblePart", "getVisiblePart", "thumbSize", "getThumbSize", "scrollScale", "getScrollScale", "rawPosition", "getRawPosition", ViewProps.POSITION, "getPosition", "bounds", "Lkotlin/ranges/ClosedFloatingPointRange;", "getBounds", "()Lkotlin/ranges/ClosedFloatingPointRange;", "unscrolledDragDistance", "onDragStarted", "", "setPosition", "value", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dragMutex", "Lkotlinx/coroutines/sync/Mutex;", "onDragDelta", "offset", "Landroidx/compose/ui/geometry/Offset;", "onDragDelta-k-4lQ0M", "(J)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SliderAdapter {
    public static final int $stable = 8;
    private final ScrollAreaState adapter;
    private final CoroutineScope coroutineScope;
    private final Mutex dragMutex;
    private final boolean isVertical;
    private final float minHeight;
    private final boolean reverseLayout;
    private final int trackSize;
    private double unscrolledDragDistance;

    public SliderAdapter(ScrollAreaState adapter, int i, float f, boolean z, boolean z2, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.adapter = adapter;
        this.trackSize = i;
        this.minHeight = f;
        this.reverseLayout = z;
        this.isVertical = z2;
        this.coroutineScope = coroutineScope;
        this.dragMutex = MutexKt.Mutex$default(false, 1, null);
    }

    public final ScrollAreaState getAdapter() {
        return this.adapter;
    }

    private final double getContentSize() {
        return this.adapter.getContentSize();
    }

    private final double getVisiblePart() {
        double contentSize = getContentSize();
        if (contentSize == 0.0d) {
            return 1.0d;
        }
        return RangesKt.coerceAtMost(this.adapter.getViewportSize() / contentSize, 1.0d);
    }

    public final double getThumbSize() {
        return RangesKt.coerceAtLeast(this.trackSize * getVisiblePart(), this.minHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double getScrollScale() {
        double thumbSize = this.trackSize - getThumbSize();
        double maxScrollOffset = ScrollAreaKt.getMaxScrollOffset(this.adapter);
        if (maxScrollOffset == 0.0d) {
            return 1.0d;
        }
        return thumbSize / maxScrollOffset;
    }

    private final double getRawPosition() {
        return getScrollScale() * this.adapter.getScrollOffset();
    }

    public final double getPosition() {
        return this.reverseLayout ? (this.trackSize - getThumbSize()) - getRawPosition() : getRawPosition();
    }

    public final ClosedFloatingPointRange<Double> getBounds() {
        return RangesKt.rangeTo(getPosition(), getPosition() + getThumbSize());
    }

    public final void onDragStarted() {
        this.unscrolledDragDistance = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setPosition(double d, Continuation<? super Unit> continuation) {
        if (this.reverseLayout) {
            d = (this.trackSize - getThumbSize()) - d;
        }
        Object scrollTo = this.adapter.scrollTo(d / getScrollScale(), continuation);
        return scrollTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollTo : Unit.INSTANCE;
    }

    /* renamed from: onDragDelta-k-4lQ0M, reason: not valid java name */
    public final void m9416onDragDeltak4lQ0M(long offset) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, CoroutineStart.UNDISPATCHED, new SliderAdapter$onDragDelta$1(this, offset, null), 1, null);
    }
}
