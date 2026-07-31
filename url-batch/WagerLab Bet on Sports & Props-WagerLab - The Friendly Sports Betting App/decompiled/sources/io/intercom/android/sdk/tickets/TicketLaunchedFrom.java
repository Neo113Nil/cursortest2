package io.intercom.android.sdk.tickets;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.models.Ticket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDetailViewModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\b\tR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "", "from", "", "getFrom$annotations", "()V", "getFrom", "()Ljava/lang/String;", "Conversation", "Other", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom$Conversation;", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom$Other;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface TicketLaunchedFrom {

    /* compiled from: TicketDetailViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getFrom$annotations() {
        }
    }

    String getFrom();

    /* compiled from: TicketDetailViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketLaunchedFrom$Conversation;", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "<init>", "(Lio/intercom/android/sdk/models/Ticket;)V", "getTicket", "()Lio/intercom/android/sdk/models/Ticket;", "from", "", "getFrom", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Conversation implements TicketLaunchedFrom {
        public static final int $stable = 8;
        private final String from;
        private final Ticket ticket;

        /* JADX WARN: Multi-variable type inference failed */
        public Conversation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Conversation copy$default(Conversation conversation, Ticket ticket, int i, Object obj) {
            if ((i & 1) != 0) {
                ticket = conversation.ticket;
            }
            return conversation.copy(ticket);
        }

        /* renamed from: component1, reason: from getter */
        public final Ticket getTicket() {
            return this.ticket;
        }

        public final Conversation copy(Ticket ticket) {
            Intrinsics.checkNotNullParameter(ticket, "ticket");
            return new Conversation(ticket);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Conversation) && Intrinsics.areEqual(this.ticket, ((Conversation) other).ticket);
        }

        public int hashCode() {
            return this.ticket.hashCode();
        }

        public String toString() {
            return "Conversation(ticket=" + this.ticket + ')';
        }

        public Conversation(Ticket ticket) {
            Intrinsics.checkNotNullParameter(ticket, "ticket");
            this.ticket = ticket;
            this.from = "conversation";
        }

        public /* synthetic */ Conversation(Ticket ticket, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Injector.get().getDataLayer().getTicket().getValue() : ticket);
        }

        public final Ticket getTicket() {
            return this.ticket;
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        public String getFrom() {
            return this.from;
        }
    }

    /* compiled from: TicketDetailViewModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/tickets/TicketLaunchedFrom$Other;", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "ticketId", "", "from", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTicketId", "()Ljava/lang/String;", "getFrom", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Other implements TicketLaunchedFrom {
        public static final int $stable = 0;
        private final String from;
        private final String ticketId;

        public static /* synthetic */ Other copy$default(Other other, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.ticketId;
            }
            if ((i & 2) != 0) {
                str2 = other.from;
            }
            return other.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTicketId() {
            return this.ticketId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        public final Other copy(String ticketId, String from) {
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            Intrinsics.checkNotNullParameter(from, "from");
            return new Other(ticketId, from);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Other)) {
                return false;
            }
            Other other2 = (Other) other;
            return Intrinsics.areEqual(this.ticketId, other2.ticketId) && Intrinsics.areEqual(this.from, other2.from);
        }

        public int hashCode() {
            return (this.ticketId.hashCode() * 31) + this.from.hashCode();
        }

        public String toString() {
            return "Other(ticketId=" + this.ticketId + ", from=" + this.from + ')';
        }

        public Other(String ticketId, String from) {
            Intrinsics.checkNotNullParameter(ticketId, "ticketId");
            Intrinsics.checkNotNullParameter(from, "from");
            this.ticketId = ticketId;
            this.from = from;
        }

        public final String getTicketId() {
            return this.ticketId;
        }

        @Override // io.intercom.android.sdk.tickets.TicketLaunchedFrom
        public String getFrom() {
            return this.from;
        }
    }
}
