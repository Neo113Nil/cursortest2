package io.intercom.android.sdk.tickets.list.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsResponse;", "", "tickets", "", "Lio/intercom/android/sdk/models/Ticket;", "nextPage", "", "<init>", "(Ljava/util/List;Ljava/lang/Long;)V", "getTickets", "()Ljava/util/List;", "getNextPage", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Long;)Lio/intercom/android/sdk/tickets/list/data/TicketsResponse;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TicketsResponse {
    public static final int $stable = 8;

    @SerializedName("next_page")
    private final Long nextPage;

    @SerializedName("tickets")
    private final List<Ticket> tickets;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TicketsResponse copy$default(TicketsResponse ticketsResponse, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ticketsResponse.tickets;
        }
        if ((i & 2) != 0) {
            l = ticketsResponse.nextPage;
        }
        return ticketsResponse.copy(list, l);
    }

    public final List<Ticket> component1() {
        return this.tickets;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getNextPage() {
        return this.nextPage;
    }

    public final TicketsResponse copy(List<Ticket> tickets, Long nextPage) {
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        return new TicketsResponse(tickets, nextPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketsResponse)) {
            return false;
        }
        TicketsResponse ticketsResponse = (TicketsResponse) other;
        return Intrinsics.areEqual(this.tickets, ticketsResponse.tickets) && Intrinsics.areEqual(this.nextPage, ticketsResponse.nextPage);
    }

    public int hashCode() {
        int hashCode = this.tickets.hashCode() * 31;
        Long l = this.nextPage;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "TicketsResponse(tickets=" + this.tickets + ", nextPage=" + this.nextPage + ')';
    }

    public TicketsResponse(List<Ticket> tickets, Long l) {
        Intrinsics.checkNotNullParameter(tickets, "tickets");
        this.tickets = tickets;
        this.nextPage = l;
    }

    public final List<Ticket> getTickets() {
        return this.tickets;
    }

    public final Long getNextPage() {
        return this.nextPage;
    }
}
