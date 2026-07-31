package io.intercom.android.sdk.tickets.list.reducers;

import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketRowReducer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"reduceTicketRowData", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketRowReducerKt {
    public static final TicketRowData reduceTicketRowData(Ticket ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        String publicId = ticket.getPublicId();
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{publicId != null ? "#" + publicId : null, ticket.getCurrentStatus().getTitle()}), " • ", null, null, 0, null, null, 62, null);
        TicketStatus ticketStatus = TicketDetailReducerKt.toTicketStatus(ticket.getCurrentStatus());
        String id = ticket.getId();
        String title = ticket.getTitle();
        Boolean isRead = ticket.isRead();
        return new TicketRowData(id, title, joinToString$default, ticketStatus, isRead != null ? isRead.booleanValue() : true);
    }
}
