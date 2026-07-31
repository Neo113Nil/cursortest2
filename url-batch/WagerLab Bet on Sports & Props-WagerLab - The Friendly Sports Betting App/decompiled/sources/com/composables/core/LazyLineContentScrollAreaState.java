package com.composables.core;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\b!\u0018\u00002\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H$J\b\u0010\u0006\u001a\u00020\u0007H$J\b\u0010\b\u001a\u00020\u0007H$J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H¤@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H¤@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H$J\u0016\u0010!\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\"R\u0012\u0010\u0014\u001a\u00020\u0007X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0012\u001a\u00020\u00138BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\f\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0019¨\u0006%"}, d2 = {"Lcom/composables/core/LazyLineContentScrollAreaState;", "Lcom/composables/core/ScrollAreaState;", "<init>", "()V", "firstVisibleLine", "Lcom/composables/core/LazyLineContentScrollAreaState$VisibleLine;", "totalLineCount", "", "contentPadding", "snapToLine", "", "lineIndex", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "value", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "averageVisibleLineSize", "", "lineSpacing", "getLineSpacing", "()I", "getAverageVisibleLineSize$annotations", "getAverageVisibleLineSize", "()D", "averageVisibleLineSize$delegate", "Landroidx/compose/runtime/State;", "averageVisibleLineSizeWithSpacing", "getAverageVisibleLineSizeWithSpacing", "getScrollOffset", "contentSize", "getContentSize", "scrollTo", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "VisibleLine", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class LazyLineContentScrollAreaState implements ScrollAreaState {
    public static final int $stable = 0;

    /* renamed from: averageVisibleLineSize$delegate, reason: from kotlin metadata */
    private final State averageVisibleLineSize = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.LazyLineContentScrollAreaState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            double averageVisibleLineSize_delegate$lambda$0;
            averageVisibleLineSize_delegate$lambda$0 = LazyLineContentScrollAreaState.averageVisibleLineSize_delegate$lambda$0(LazyLineContentScrollAreaState.this);
            return Double.valueOf(averageVisibleLineSize_delegate$lambda$0);
        }
    });

    private static /* synthetic */ void getAverageVisibleLineSize$annotations() {
    }

    protected abstract double averageVisibleLineSize();

    protected abstract int contentPadding();

    protected abstract VisibleLine firstVisibleLine();

    protected abstract int getLineSpacing();

    protected abstract Object scrollBy(float f, Continuation<? super Unit> continuation);

    @Override // com.composables.core.ScrollAreaState
    public Object scrollTo(double d, Continuation<? super Unit> continuation) {
        return scrollTo$suspendImpl(this, d, continuation);
    }

    protected abstract Object snapToLine(int i, int i2, Continuation<? super Unit> continuation);

    protected abstract int totalLineCount();

    /* compiled from: ScrollArea.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/composables/core/LazyLineContentScrollAreaState$VisibleLine;", "", FirebaseAnalytics.Param.INDEX, "", "offset", "<init>", "(II)V", "getIndex", "()I", "getOffset", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VisibleLine {
        public static final int $stable = 0;
        private final int index;
        private final int offset;

        public VisibleLine(int i, int i2) {
            this.index = i;
            this.offset = i2;
        }

        public final int getIndex() {
            return this.index;
        }

        public final int getOffset() {
            return this.offset;
        }
    }

    private final double getAverageVisibleLineSize() {
        return ((Number) this.averageVisibleLineSize.getValue()).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double averageVisibleLineSize_delegate$lambda$0(LazyLineContentScrollAreaState lazyLineContentScrollAreaState) {
        if (lazyLineContentScrollAreaState.totalLineCount() == 0) {
            return 0.0d;
        }
        return lazyLineContentScrollAreaState.averageVisibleLineSize();
    }

    private final double getAverageVisibleLineSizeWithSpacing() {
        return getAverageVisibleLineSize() + getLineSpacing();
    }

    @Override // com.composables.core.ScrollAreaState
    public double getScrollOffset() {
        if (firstVisibleLine() == null) {
            return 0.0d;
        }
        return (r0.getIndex() * getAverageVisibleLineSizeWithSpacing()) - r0.getOffset();
    }

    @Override // com.composables.core.ScrollAreaState
    public double getContentSize() {
        return (getAverageVisibleLineSize() * totalLineCount()) + (getLineSpacing() * RangesKt.coerceAtLeast(r0 - 1, 0)) + contentPadding();
    }

    static /* synthetic */ Object scrollTo$suspendImpl(LazyLineContentScrollAreaState lazyLineContentScrollAreaState, double d, Continuation<? super Unit> continuation) {
        double scrollOffset = d - lazyLineContentScrollAreaState.getScrollOffset();
        if (Math.abs(scrollOffset) <= lazyLineContentScrollAreaState.getViewportSize()) {
            Object scrollBy = lazyLineContentScrollAreaState.scrollBy((float) scrollOffset, continuation);
            return scrollBy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollBy : Unit.INSTANCE;
        }
        Object snapTo = lazyLineContentScrollAreaState.snapTo(d, continuation);
        return snapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object snapTo(double d, Continuation<? super Unit> continuation) {
        double coerceIn = RangesKt.coerceIn(d, 0.0d, ScrollAreaKt.getMaxScrollOffset(this));
        int coerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtLeast((int) (coerceIn / getAverageVisibleLineSizeWithSpacing()), 0), totalLineCount() - 1);
        Object snapToLine = snapToLine(coerceAtMost, RangesKt.coerceAtLeast((int) (coerceIn - (coerceAtMost * getAverageVisibleLineSizeWithSpacing())), 0), continuation);
        return snapToLine == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapToLine : Unit.INSTANCE;
    }
}
