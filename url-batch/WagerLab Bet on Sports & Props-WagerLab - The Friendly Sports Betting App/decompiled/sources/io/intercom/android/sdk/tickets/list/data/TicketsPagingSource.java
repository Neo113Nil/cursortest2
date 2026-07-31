package io.intercom.android.sdk.tickets.list.data;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsPagingSource.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000fH\u0016¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsPagingSource;", "Landroidx/paging/PagingSource;", "", "Lio/intercom/android/sdk/models/Ticket;", "repository", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketRepository;)V", "load", "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Long;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketsPagingSource extends PagingSource<Long, Ticket> {
    public static final int PAGE_SIZE = 10;
    private final TicketRepository repository;
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsPagingSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Long getRefreshKey(PagingState<Long, Ticket> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    public /* synthetic */ TicketsPagingSource(TicketRepository ticketRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository);
    }

    public TicketsPagingSource(TicketRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(PagingSource.LoadParams<Long> loadParams, Continuation<? super PagingSource.LoadResult<Long, Ticket>> continuation) {
        TicketsPagingSource$load$1 ticketsPagingSource$load$1;
        int i;
        NetworkResponse networkResponse;
        if (continuation instanceof TicketsPagingSource$load$1) {
            ticketsPagingSource$load$1 = (TicketsPagingSource$load$1) continuation;
            if ((ticketsPagingSource$load$1.label & Integer.MIN_VALUE) != 0) {
                ticketsPagingSource$load$1.label -= Integer.MIN_VALUE;
                Object obj = ticketsPagingSource$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ticketsPagingSource$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TicketRepository ticketRepository = this.repository;
                    Long key = loadParams.getKey();
                    long longValue = key != null ? key.longValue() : 1L;
                    ticketsPagingSource$load$1.L$0 = loadParams;
                    ticketsPagingSource$load$1.label = 1;
                    obj = ticketRepository.fetchTickets(longValue, 10, ticketsPagingSource$load$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    loadParams = (PagingSource.LoadParams) ticketsPagingSource$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                    return new PagingSource.LoadResult.Page(((TicketsResponse) success.getBody()).getTickets(), loadParams.getKey() != null ? Boxing.boxLong(r7.longValue() - 1) : null, ((TicketsResponse) success.getBody()).getNextPage());
                }
                if (networkResponse instanceof NetworkResponse.NetworkError) {
                    return new PagingSource.LoadResult.Error(((NetworkResponse.NetworkError) networkResponse).getError());
                }
                if (networkResponse instanceof NetworkResponse.ClientError) {
                    return new PagingSource.LoadResult.Error(((NetworkResponse.ClientError) networkResponse).getError());
                }
                if (networkResponse instanceof NetworkResponse.ServerError) {
                    return new PagingSource.LoadResult.Error(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        ticketsPagingSource$load$1 = new TicketsPagingSource$load$1(this, continuation);
        Object obj2 = ticketsPagingSource$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ticketsPagingSource$load$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
        }
    }
}
