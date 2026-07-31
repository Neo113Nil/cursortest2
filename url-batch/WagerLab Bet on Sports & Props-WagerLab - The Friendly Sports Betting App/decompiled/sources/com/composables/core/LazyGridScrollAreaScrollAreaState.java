package com.composables.core;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridLayoutInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import com.composables.core.LazyLineContentScrollAreaState;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* compiled from: ScrollArea.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0015\u001a\u00020\u0012*\u00020\u0016H\u0002J\f\u0010\u0017\u001a\u00020\u0012*\u00020\u0016H\u0002J\f\u0010\u0018\u001a\u00020\u0012*\u00020\u0016H\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0012H\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\n\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u0012H\u0014J\b\u0010#\u001a\u00020\u0012H\u0014J\u001e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0012H\u0094@¢\u0006\u0002\u0010(J\u0016\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+H\u0094@¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0019\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010.\u001a\u00020\u00128TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0014¨\u00060"}, d2 = {"Lcom/composables/core/LazyGridScrollAreaScrollAreaState;", "Lcom/composables/core/LazyLineContentScrollAreaState;", "scrollState", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "viewportSize", "", "getViewportSize", "()D", "isVertical", "", "()Z", "unknownLine", "", "getUnknownLine", "()I", "line", "Landroidx/compose/foundation/lazy/grid/LazyGridItemInfo;", "mainAxisSize", "mainAxisOffset", "slotsPerLine", "getSlotsPerLine", "slotsPerLine$delegate", "Landroidx/compose/runtime/State;", "lineOfIndex", FirebaseAnalytics.Param.INDEX, "indexOfFirstInLine", "firstVisibleLine", "Lcom/composables/core/LazyLineContentScrollAreaState$VisibleLine;", "totalLineCount", "contentPadding", "snapToLine", "", "lineIndex", "scrollOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollBy", "value", "", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "averageVisibleLineSize", "lineSpacing", "getLineSpacing", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyGridScrollAreaScrollAreaState extends LazyLineContentScrollAreaState {
    public static final int $stable = 0;
    private final LazyGridState scrollState;

    /* renamed from: slotsPerLine$delegate, reason: from kotlin metadata */
    private final State slotsPerLine;

    public LazyGridScrollAreaScrollAreaState(LazyGridState scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.scrollState = scrollState;
        this.slotsPerLine = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.composables.core.LazyGridScrollAreaScrollAreaState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int slotsPerLine_delegate$lambda$5;
                slotsPerLine_delegate$lambda$5 = LazyGridScrollAreaScrollAreaState.slotsPerLine_delegate$lambda$5(LazyGridScrollAreaScrollAreaState.this);
                return Integer.valueOf(slotsPerLine_delegate$lambda$5);
            }
        });
    }

    @Override // com.composables.core.ScrollAreaState
    public InteractionSource getInteractionSource() {
        return this.scrollState.getInteractionSource();
    }

    @Override // com.composables.core.ScrollAreaState
    public double getViewportSize() {
        return (int) (this.scrollState.getLayoutInfo().getOrientation() == Orientation.Vertical ? r0.mo1000getViewportSizeYbymL2g() & 4294967295L : r0.mo1000getViewportSizeYbymL2g() >> 32);
    }

    private final boolean isVertical() {
        return this.scrollState.getLayoutInfo().getOrientation() == Orientation.Vertical;
    }

    private final int getUnknownLine() {
        LazyGridItemInfo.Companion companion = LazyGridItemInfo.INSTANCE;
        isVertical();
        return -1;
    }

    private final int line(LazyGridItemInfo lazyGridItemInfo) {
        return isVertical() ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn();
    }

    private final int mainAxisSize(LazyGridItemInfo lazyGridItemInfo) {
        long size = lazyGridItemInfo.getSize();
        return (int) (isVertical() ? size & 4294967295L : size >> 32);
    }

    private final int mainAxisOffset(LazyGridItemInfo lazyGridItemInfo) {
        long offset = lazyGridItemInfo.getOffset();
        return isVertical() ? IntOffset.m8530getYimpl(offset) : IntOffset.m8529getXimpl(offset);
    }

    private final int getSlotsPerLine() {
        return ((Number) this.slotsPerLine.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int slotsPerLine_delegate$lambda$5(LazyGridScrollAreaScrollAreaState lazyGridScrollAreaScrollAreaState) {
        Orientation orientation = lazyGridScrollAreaScrollAreaState.scrollState.getLayoutInfo().getOrientation();
        List<LazyGridItemInfo> visibleItemsInfo = lazyGridScrollAreaScrollAreaState.scrollState.getLayoutInfo().getVisibleItemsInfo();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : visibleItemsInfo) {
            LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
            if (hashSet.add(Integer.valueOf(orientation == Orientation.Vertical ? lazyGridItemInfo.getColumn() : lazyGridItemInfo.getRow()))) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    private final int lineOfIndex(int index) {
        return index / RangesKt.coerceAtLeast(getSlotsPerLine(), 1);
    }

    private final int indexOfFirstInLine(int line) {
        return line * getSlotsPerLine();
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected LazyLineContentScrollAreaState.VisibleLine firstVisibleLine() {
        Object obj;
        Iterator<T> it = this.scrollState.getLayoutInfo().getVisibleItemsInfo().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (line((LazyGridItemInfo) obj) != getUnknownLine()) {
                break;
            }
        }
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) obj;
        if (lazyGridItemInfo != null) {
            return new LazyLineContentScrollAreaState.VisibleLine(line(lazyGridItemInfo), mainAxisOffset(lazyGridItemInfo));
        }
        return null;
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected int totalLineCount() {
        int totalItemsCount = this.scrollState.getLayoutInfo().getTotalItemsCount();
        if (totalItemsCount == 0) {
            return 0;
        }
        return lineOfIndex(totalItemsCount - 1) + 1;
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected int contentPadding() {
        LazyGridLayoutInfo layoutInfo = this.scrollState.getLayoutInfo();
        return layoutInfo.getBeforeContentPadding() + layoutInfo.getAfterContentPadding();
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected Object snapToLine(int i, int i2, Continuation<? super Unit> continuation) {
        Object scrollToItem = this.scrollState.scrollToItem(indexOfFirstInLine(i), i2, continuation);
        return scrollToItem == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollToItem : Unit.INSTANCE;
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected Object scrollBy(float f, Continuation<? super Unit> continuation) {
        Object scrollBy = ScrollExtensionsKt.scrollBy(this.scrollState, f, continuation);
        return scrollBy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scrollBy : Unit.INSTANCE;
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected double averageVisibleLineSize() {
        List<LazyGridItemInfo> visibleItemsInfo = this.scrollState.getLayoutInfo().getVisibleItemsInfo();
        Iterator<LazyGridItemInfo> it = visibleItemsInfo.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (line(it.next()) != getUnknownLine()) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return 0.0d;
        }
        List<LazyGridItemInfo> subList = visibleItemsInfo.subList(i, visibleItemsInfo.size());
        final int line = line((LazyGridItemInfo) CollectionsKt.last((List) subList));
        Iterator it2 = SequencesKt.takeWhile(CollectionsKt.asSequence(CollectionsKt.asReversed(subList)), new Function1() { // from class: com.composables.core.LazyGridScrollAreaScrollAreaState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean averageVisibleLineSize$lambda$10;
                averageVisibleLineSize$lambda$10 = LazyGridScrollAreaScrollAreaState.averageVisibleLineSize$lambda$10(LazyGridScrollAreaScrollAreaState.this, line, (LazyGridItemInfo) obj);
                return Boolean.valueOf(averageVisibleLineSize$lambda$10);
            }
        }).iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        int mainAxisSize = mainAxisSize((LazyGridItemInfo) it2.next());
        while (it2.hasNext()) {
            int mainAxisSize2 = mainAxisSize((LazyGridItemInfo) it2.next());
            if (mainAxisSize < mainAxisSize2) {
                mainAxisSize = mainAxisSize2;
            }
        }
        LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.first((List) subList);
        return (((mainAxisOffset(r0) + mainAxisSize) - mainAxisOffset(lazyGridItemInfo)) - (r3 * getLineSpacing())) / ((line((LazyGridItemInfo) CollectionsKt.last((List) subList)) - line(lazyGridItemInfo)) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean averageVisibleLineSize$lambda$10(LazyGridScrollAreaScrollAreaState lazyGridScrollAreaScrollAreaState, int i, LazyGridItemInfo it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return lazyGridScrollAreaScrollAreaState.line(it) == i;
    }

    @Override // com.composables.core.LazyLineContentScrollAreaState
    protected int getLineSpacing() {
        return this.scrollState.getLayoutInfo().getMainAxisItemSpacing();
    }
}
