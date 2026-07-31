package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: TicketDetailViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.TicketDetailViewModel$fetchTicketDetail$1", f = "TicketDetailViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class TicketDetailViewModel$fetchTicketDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $ticketId;
    Object L$0;
    int label;
    final /* synthetic */ TicketDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TicketDetailViewModel$fetchTicketDetail$1(TicketDetailViewModel ticketDetailViewModel, String str, Continuation<? super TicketDetailViewModel$fetchTicketDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = ticketDetailViewModel;
        this.$ticketId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TicketDetailViewModel$fetchTicketDetail$1(this.this$0, this.$ticketId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TicketDetailViewModel$fetchTicketDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object obj2;
        UserIdentity userIdentity;
        List activeAdminsAvatars;
        TicketLaunchedFrom ticketLaunchedFrom;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._stateFlow;
            this.L$0 = mutableStateFlow;
            this.label = 1;
            Object fetchTicketDetail = this.this$0.repository.fetchTicketDetail(this.$ticketId, this);
            if (fetchTicketDetail == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow2 = mutableStateFlow;
            obj = fetchTicketDetail;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (MutableStateFlow) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            obj2 = (TicketDetailState) new TicketDetailState.Error(new ErrorState.WithoutCTA(0, 0, Boxing.boxInt(R.string.intercom_error_loading_ticket), 3, null));
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            Integer boxInt = Boxing.boxInt(R.string.intercom_error_loading_ticket);
            final TicketDetailViewModel ticketDetailViewModel = this.this$0;
            final String str = this.$ticketId;
            obj2 = (TicketDetailState) new TicketDetailState.Error(new ErrorState.WithCTA(0, 0, boxInt, 0, new Function0() { // from class: io.intercom.android.sdk.tickets.TicketDetailViewModel$fetchTicketDetail$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = TicketDetailViewModel$fetchTicketDetail$1.invokeSuspend$lambda$0(TicketDetailViewModel.this, str);
                    return invokeSuspend$lambda$0;
                }
            }, 11, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            Ticket ticket = (Ticket) ((NetworkResponse.Success) networkResponse).getBody();
            this.this$0.fireMetricIfNecessary(ticket);
            this.this$0.markAsReadIfNecessary(ticket);
            this.this$0.ticketId = ticket.getId();
            userIdentity = this.this$0.user;
            activeAdminsAvatars = this.this$0.getActiveAdminsAvatars();
            ticketLaunchedFrom = this.this$0.launchedFrom;
            obj2 = TicketDetailReducerKt.computeTicketViewState(ticket, userIdentity, activeAdminsAvatars, ticketLaunchedFrom);
        }
        mutableStateFlow2.setValue(obj2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(TicketDetailViewModel ticketDetailViewModel, String str) {
        ticketDetailViewModel.fetchTicketDetail$intercom_sdk_base_release(str);
        return Unit.INSTANCE;
    }
}
