package io.intercom.android.sdk.tickets.create.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TicketRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.create.data.TicketRepository", f = "TicketRepository.kt", i = {0}, l = {36}, m = "createTicket", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class TicketRepository$createTicket$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TicketRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TicketRepository$createTicket$1(TicketRepository ticketRepository, Continuation<? super TicketRepository$createTicket$1> continuation) {
        super(continuation);
        this.this$0 = ticketRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createTicket(null, 0, null, this);
    }
}
