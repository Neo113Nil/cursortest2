package com.composables.core;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.composables.core.LazyLineContentScrollAreaState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010\u0010J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000fH\u0014J\b\u0010\u0014\u001a\u00020\u000fH\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0094@¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u001f\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/composables/core/LazyListScrollAreaState;", "Lcom/composables/core/LazyLineContentScrollAreaState;", "scrollState", "Landroidx/compose/foundation/lazy/LazyListState;", "<init>", "(Landroidx/compose/foundation/lazy/LazyListState;)V", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "viewportSize", "", "getViewportSize", "()D", "firstFloatingVisibleItemIndex", "", "()Ljava/lang/Integer;", "firstVisibleLine", "Lcom/composables/core/LazyLineContentScrollAreaState$VisibleLine;", "totalLineCount", "contentPadding", "snapToLine", "", "lineIndex", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "value", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "averageVisibleLineSize", "lineSpacing", "getLineSpacing", "()I", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyListScrollAreaState extends LazyLineContentScrollAreaState {
    public static final int $stable = 0;
    private final LazyListState scrollState;

    public LazyListScrollAreaState(LazyListState scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.scrollState = scrollState;
    }

    @Override // com.composables.core.ScrollAreaState
    public InteractionSource getInteractionSource() {
        return this.scrollState.getInteractionSource();
    }

    @Override // com.composables.core.ScrollAreaState
    public double getViewportSize() {
        return (int) (this.scrollState.getLayoutInfo().getOrientation() == Orientation.Vertical ? r0.mo957getViewportSizeYbymL2g() & 4294967295L : r0.mo957getViewportSizeYbymL2g() >> 32);
    }

    private final Integer firstFloatingVisibleItemIndex() {
        List<LazyListItemInfo> visibleItemsInfo = this.scrollState.getLayoutInfo().getVisibleItemsInfo();
        int size = visibleItemsInfo.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return 0;
        }
        LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(0);
        LazyListItemInfo lazyListItemInfo2 = visibleItemsInfo.get(1);
        return Integer.valueOf((lazyListItemInfo.getIndex() < lazyListItemInfo2.getIndex() - 1 || (lazyListItemInfo.getOffset() + lazyListItemInfo.getSize()) + getLineSpacing() > lazyListItemInfo2.getOffset()) ? 1 : 0);
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected LazyLineContentScrollAreaState.VisibleLine firstVisibleLine() {
        Integer firstFloatingVisibleItemIndex = firstFloatingVisibleItemIndex();
        if (firstFloatingVisibleItemIndex == null) {
            return null;
        }
        LazyListItemInfo lazyListItemInfo = this.scrollState.getLayoutInfo().getVisibleItemsInfo().get(firstFloatingVisibleItemIndex.intValue());
        return new LazyLineContentScrollAreaState.VisibleLine(lazyListItemInfo.getIndex(), lazyListItemInfo.getOffset());
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected int totalLineCount() {
        return this.scrollState.getLayoutInfo().getTotalItemsCount();
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected int contentPadding() {
        LazyListLayoutInfo layoutInfo = this.scrollState.getLayoutInfo();
        return layoutInfo.getBeforeContentPadding() + layoutInfo.getAfterContentPadding();
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected Object snapToLine(int i, int i2, Continuation<? super Unit> continuation) {
        Object scrollToItem = this.scrollState.scrollToItem(i, i2, continuation);
        return scrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToItem : Unit.INSTANCE;
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected Object scrollBy(float f, Continuation<? super Unit> continuation) {
        Object scrollBy = ScrollExtensionsKt.scrollBy(this.scrollState, f, continuation);
        return scrollBy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollBy : Unit.INSTANCE;
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected double averageVisibleLineSize() {
        List<LazyListItemInfo> visibleItemsInfo = this.scrollState.getLayoutInfo().getVisibleItemsInfo();
        Integer firstFloatingVisibleItemIndex = firstFloatingVisibleItemIndex();
        if (firstFloatingVisibleItemIndex == null) {
            return 0.0d;
        }
        int intValue = firstFloatingVisibleItemIndex.intValue();
        LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(intValue);
        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.last((List) visibleItemsInfo);
        return (((lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize()) - lazyListItemInfo.getOffset()) - ((r0 - 1) * getLineSpacing())) / (visibleItemsInfo.size() - intValue);
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected int getLineSpacing() {
        return this.scrollState.getLayoutInfo().getMainAxisItemSpacing();
    }
}
