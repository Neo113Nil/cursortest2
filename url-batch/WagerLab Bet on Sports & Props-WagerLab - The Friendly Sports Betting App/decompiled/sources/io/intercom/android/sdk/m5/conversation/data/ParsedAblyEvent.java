package io.intercom.android.sdk.m5.conversation.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.models.Part;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ParsedAblyEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "", "<init>", "()V", "AblyConnected", "AblyClosed", "AblyFailed", "UnSupportedEvent", "ConversationAblyEvent", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$AblyClosed;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$AblyConnected;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$AblyFailed;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$ConversationAblyEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$UnSupportedEvent;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ParsedAblyEvent {
    public static final int $stable = 0;

    public /* synthetic */ ParsedAblyEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ParsedAblyEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$AblyConnected;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AblyConnected extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final AblyConnected INSTANCE = new AblyConnected();

        private AblyConnected() {
            super(null);
        }
    }

    private ParsedAblyEvent() {
    }

    /* compiled from: ParsedAblyEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$AblyClosed;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AblyClosed extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final AblyClosed INSTANCE = new AblyClosed();

        private AblyClosed() {
            super(null);
        }
    }

    /* compiled from: ParsedAblyEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$AblyFailed;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AblyFailed extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final AblyFailed INSTANCE = new AblyFailed();

        private AblyFailed() {
            super(null);
        }
    }

    /* compiled from: ParsedAblyEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$UnSupportedEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "<init>", "()V", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UnSupportedEvent extends ParsedAblyEvent {
        public static final int $stable = 0;
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        private UnSupportedEvent() {
            super(null);
        }
    }

    /* compiled from: ParsedAblyEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$ConversationAblyEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent;", "<init>", "()V", "NewComment", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$ConversationAblyEvent$NewComment;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ConversationAblyEvent extends ParsedAblyEvent {
        public static final int $stable = 0;

        public /* synthetic */ ConversationAblyEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ConversationAblyEvent() {
            super(null);
        }

        /* compiled from: ParsedAblyEvent.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$ConversationAblyEvent$NewComment;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedAblyEvent$ConversationAblyEvent;", "conversationId", "", "createdByUser", "ticketId", "partBuilder", "Lio/intercom/android/sdk/models/Part$Builder;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Part$Builder;)V", "getConversationId", "()Ljava/lang/String;", "getCreatedByUser", "getTicketId", "getPartBuilder", "()Lio/intercom/android/sdk/models/Part$Builder;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NewComment extends ConversationAblyEvent {
            public static final int $stable = 8;
            private final String conversationId;
            private final String createdByUser;
            private final Part.Builder partBuilder;
            private final String ticketId;

            public static /* synthetic */ NewComment copy$default(NewComment newComment, String str, String str2, String str3, Part.Builder builder, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = newComment.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = newComment.createdByUser;
                }
                if ((i & 4) != 0) {
                    str3 = newComment.ticketId;
                }
                if ((i & 8) != 0) {
                    builder = newComment.partBuilder;
                }
                return newComment.copy(str, str2, str3, builder);
            }

            /* renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTicketId() {
                return this.ticketId;
            }

            /* renamed from: component4, reason: from getter */
            public final Part.Builder getPartBuilder() {
                return this.partBuilder;
            }

            public final NewComment copy(String conversationId, String createdByUser, String ticketId, Part.Builder partBuilder) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
                return new NewComment(conversationId, createdByUser, ticketId, partBuilder);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NewComment)) {
                    return false;
                }
                NewComment newComment = (NewComment) other;
                return Intrinsics.areEqual(this.conversationId, newComment.conversationId) && Intrinsics.areEqual(this.createdByUser, newComment.createdByUser) && Intrinsics.areEqual(this.ticketId, newComment.ticketId) && Intrinsics.areEqual(this.partBuilder, newComment.partBuilder);
            }

            public int hashCode() {
                return (((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.ticketId.hashCode()) * 31) + this.partBuilder.hashCode();
            }

            public String toString() {
                return "NewComment(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", ticketId=" + this.ticketId + ", partBuilder=" + this.partBuilder + ')';
            }

            public final String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final String getTicketId() {
                return this.ticketId;
            }

            public final Part.Builder getPartBuilder() {
                return this.partBuilder;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewComment(String conversationId, String createdByUser, String ticketId, Part.Builder partBuilder) {
                super(null);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(ticketId, "ticketId");
                Intrinsics.checkNotNullParameter(partBuilder, "partBuilder");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.ticketId = ticketId;
                this.partBuilder = partBuilder;
            }
        }
    }
}
