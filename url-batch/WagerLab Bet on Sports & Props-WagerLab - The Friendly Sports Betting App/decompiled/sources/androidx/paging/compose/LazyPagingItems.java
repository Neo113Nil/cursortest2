package androidx.paging.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import androidx.paging.CombinedLoadStates;
import androidx.paging.ItemSnapshotList;
import androidx.paging.LoadState;
import androidx.paging.LoadStates;
import androidx.paging.PagingData;
import androidx.paging.PagingDataEvent;
import androidx.paging.PagingDataPresenter;
import com.amazon.a.a.o.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: LazyPagingItems.kt */
@Metadata(d1 = {"\u0000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f*\u0001\u001e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u001b\b\u0000\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010 \u001a\u00020!H\u0080@¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020!H\u0080@¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u0004\u0018\u00018\u00002\u0006\u0010'\u001a\u00020\bH\u0086\u0002¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u0004\u0018\u00018\u00002\u0006\u0010'\u001a\u00020\b¢\u0006\u0002\u0010(J\u0006\u0010*\u001a\u00020!J\u0006\u0010+\u001a\u00020!J\b\u0010,\u001a\u00020!H\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001f¨\u0006-"}, d2 = {"Landroidx/paging/compose/LazyPagingItems;", "T", "", "flow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "(Lkotlinx/coroutines/flow/Flow;)V", "itemCount", "", "getItemCount", "()I", "<set-?>", "Landroidx/paging/ItemSnapshotList;", "itemSnapshotList", "getItemSnapshotList", "()Landroidx/paging/ItemSnapshotList;", "setItemSnapshotList", "(Landroidx/paging/ItemSnapshotList;)V", "itemSnapshotList$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/paging/CombinedLoadStates;", "loadState", "getLoadState", "()Landroidx/paging/CombinedLoadStates;", "setLoadState", "(Landroidx/paging/CombinedLoadStates;)V", "loadState$delegate", "mainDispatcher", "Lkotlin/coroutines/CoroutineContext;", "pagingDataPresenter", "androidx/paging/compose/LazyPagingItems$pagingDataPresenter$1", "Landroidx/paging/compose/LazyPagingItems$pagingDataPresenter$1;", "collectLoadState", "", "collectLoadState$paging_compose_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectPagingData", "collectPagingData$paging_compose_release", b.au, FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "peek", "refresh", "retry", "updateItemSnapshotList", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyPagingItems<T> {
    public static final int $stable = 8;
    private final Flow<PagingData<T>> flow;

    /* renamed from: itemSnapshotList$delegate, reason: from kotlin metadata */
    private final MutableState itemSnapshotList;

    /* renamed from: loadState$delegate, reason: from kotlin metadata */
    private final MutableState loadState;
    private final CoroutineContext mainDispatcher;
    private final LazyPagingItems$pagingDataPresenter$1<T> pagingDataPresenter;

    public LazyPagingItems(Flow<PagingData<T>> flow) {
        LoadStates loadStates;
        LoadStates loadStates2;
        LoadStates loadStates3;
        LoadStates loadStates4;
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.flow = flow;
        final CoroutineContext main = AndroidUiDispatcher.INSTANCE.getMain();
        this.mainDispatcher = main;
        final PagingData pagingData = flow instanceof SharedFlow ? (PagingData) CollectionsKt.firstOrNull((List) ((SharedFlow) flow).getReplayCache()) : null;
        PagingDataPresenter<T> pagingDataPresenter = new PagingDataPresenter<T>(this, main, pagingData) { // from class: androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1
            final /* synthetic */ LazyPagingItems<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagingDataPresenter
            public Object presentPagingDataEvent(PagingDataEvent<T> pagingDataEvent, Continuation<? super Unit> continuation) {
                this.this$0.updateItemSnapshotList();
                return Unit.INSTANCE;
            }
        };
        this.pagingDataPresenter = pagingDataPresenter;
        this.itemSnapshotList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(pagingDataPresenter.snapshot(), null, 2, null);
        CombinedLoadStates value = pagingDataPresenter.getLoadStateFlow().getValue();
        if (value == null) {
            loadStates = LazyPagingItemsKt.InitialLoadStates;
            LoadState refresh = loadStates.getRefresh();
            loadStates2 = LazyPagingItemsKt.InitialLoadStates;
            LoadState prepend = loadStates2.getPrepend();
            loadStates3 = LazyPagingItemsKt.InitialLoadStates;
            LoadState append = loadStates3.getAppend();
            loadStates4 = LazyPagingItemsKt.InitialLoadStates;
            value = new CombinedLoadStates(refresh, prepend, append, loadStates4, null, 16, null);
        }
        this.loadState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(value, null, 2, null);
    }

    private final void setItemSnapshotList(ItemSnapshotList<T> itemSnapshotList) {
        this.itemSnapshotList.setValue(itemSnapshotList);
    }

    public final ItemSnapshotList<T> getItemSnapshotList() {
        return (ItemSnapshotList) this.itemSnapshotList.getValue();
    }

    public final int getItemCount() {
        return getItemSnapshotList().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemSnapshotList() {
        setItemSnapshotList(snapshot());
    }

    public final T get(int index) {
        get(index);
        return getItemSnapshotList().get(index);
    }

    public final T peek(int index) {
        return getItemSnapshotList().get(index);
    }

    public final void retry() {
        retry();
    }

    public final void refresh() {
        refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLoadState(CombinedLoadStates combinedLoadStates) {
        this.loadState.setValue(combinedLoadStates);
    }

    public final CombinedLoadStates getLoadState() {
        return (CombinedLoadStates) this.loadState.getValue();
    }

    public final Object collectLoadState$paging_compose_release(Continuation<? super Unit> continuation) {
        Object collect = FlowKt.filterNotNull(getLoadStateFlow()).collect(new FlowCollector(this) { // from class: androidx.paging.compose.LazyPagingItems$collectLoadState$2
            final /* synthetic */ LazyPagingItems<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((CombinedLoadStates) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(CombinedLoadStates combinedLoadStates, Continuation<? super Unit> continuation2) {
                this.this$0.setLoadState(combinedLoadStates);
                return Unit.INSTANCE;
            }
        }, continuation);
        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
    }

    public final Object collectPagingData$paging_compose_release(Continuation<? super Unit> continuation) {
        Object collectLatest = FlowKt.collectLatest(this.flow, new LazyPagingItems$collectPagingData$2(this, null), continuation);
        return collectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collectLatest : Unit.INSTANCE;
    }
}
