package io.intercom.android.sdk.m5.conversation.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.ably.lib.realtime.Presence;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NexusEventAsFlow.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "", "<init>", "()V", "ConversationNexusEvent", "NexusConnected", "UnSupportedEvent", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$NexusConnected;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$UnSupportedEvent;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class ParsedNexusEvent {
    public static final int $stable = 0;

    public /* synthetic */ ParsedNexusEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ParsedNexusEvent() {
    }

    /* compiled from: NexusEventAsFlow.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u00002\u00020\u0001:\u0004\f\r\u000e\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "conversationId", "", "eventType", "Lio/intercom/android/nexus/NexusEventType;", "<init>", "(Ljava/lang/String;Lio/intercom/android/nexus/NexusEventType;)V", "getConversationId", "()Ljava/lang/String;", "getEventType", "()Lio/intercom/android/nexus/NexusEventType;", "NewComment", "AdminIsTyping", "UserContentSeenByAdmin", "FinStreaming", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class ConversationNexusEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        private final String conversationId;
        private final NexusEventType eventType;

        public String getConversationId() {
            return this.conversationId;
        }

        public final NexusEventType getEventType() {
            return this.eventType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationNexusEvent(String conversationId, NexusEventType eventType) {
            super(null);
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            this.conversationId = conversationId;
            this.eventType = eventType;
        }

        /* compiled from: NexusEventAsFlow.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$NewComment;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "createdByUser", "ticketId", "partBuilder", "Lio/intercom/android/sdk/models/Part$Builder;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Part$Builder;)V", "getConversationId", "()Ljava/lang/String;", "getCreatedByUser", "getTicketId", "getPartBuilder", "()Lio/intercom/android/sdk/models/Part$Builder;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class NewComment extends ConversationNexusEvent {
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
                int hashCode = ((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31;
                String str = this.ticketId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Part.Builder builder = this.partBuilder;
                return hashCode2 + (builder != null ? builder.hashCode() : 0);
            }

            public String toString() {
                return "NewComment(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", ticketId=" + this.ticketId + ", partBuilder=" + this.partBuilder + ')';
            }

            public /* synthetic */ NewComment(String str, String str2, String str3, Part.Builder builder, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : builder);
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
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
            public NewComment(String conversationId, String createdByUser, String str, Part.Builder builder) {
                super(conversationId, NexusEventType.NewComment);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.ticketId = str;
                this.partBuilder = builder;
            }
        }

        /* compiled from: NexusEventAsFlow.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$AdminIsTyping;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "createdByUser", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "isBot", "", "showAvatar", Presence.GET_CLIENTID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Avatar;ZZLjava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "getCreatedByUser", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "()Z", "getShowAvatar", "getClientId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AdminIsTyping extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String clientId;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;
            private final boolean showAvatar;

            public static /* synthetic */ AdminIsTyping copy$default(AdminIsTyping adminIsTyping, String str, String str2, Avatar avatar, boolean z, boolean z2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = adminIsTyping.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = adminIsTyping.createdByUser;
                }
                if ((i & 4) != 0) {
                    avatar = adminIsTyping.avatar;
                }
                if ((i & 8) != 0) {
                    z = adminIsTyping.isBot;
                }
                if ((i & 16) != 0) {
                    z2 = adminIsTyping.showAvatar;
                }
                if ((i & 32) != 0) {
                    str3 = adminIsTyping.clientId;
                }
                boolean z3 = z2;
                String str4 = str3;
                return adminIsTyping.copy(str, str2, avatar, z, z3, str4);
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
            public final Avatar getAvatar() {
                return this.avatar;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsBot() {
                return this.isBot;
            }

            /* renamed from: component5, reason: from getter */
            public final boolean getShowAvatar() {
                return this.showAvatar;
            }

            /* renamed from: component6, reason: from getter */
            public final String getClientId() {
                return this.clientId;
            }

            public final AdminIsTyping copy(String conversationId, String createdByUser, Avatar avatar, boolean isBot, boolean showAvatar, String clientId) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                return new AdminIsTyping(conversationId, createdByUser, avatar, isBot, showAvatar, clientId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AdminIsTyping)) {
                    return false;
                }
                AdminIsTyping adminIsTyping = (AdminIsTyping) other;
                return Intrinsics.areEqual(this.conversationId, adminIsTyping.conversationId) && Intrinsics.areEqual(this.createdByUser, adminIsTyping.createdByUser) && Intrinsics.areEqual(this.avatar, adminIsTyping.avatar) && this.isBot == adminIsTyping.isBot && this.showAvatar == adminIsTyping.showAvatar && Intrinsics.areEqual(this.clientId, adminIsTyping.clientId);
            }

            public int hashCode() {
                return (((((((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Boolean.hashCode(this.isBot)) * 31) + Boolean.hashCode(this.showAvatar)) * 31) + this.clientId.hashCode();
            }

            public String toString() {
                return "AdminIsTyping(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", avatar=" + this.avatar + ", isBot=" + this.isBot + ", showAvatar=" + this.showAvatar + ", clientId=" + this.clientId + ')';
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            public final boolean isBot() {
                return this.isBot;
            }

            public final boolean getShowAvatar() {
                return this.showAvatar;
            }

            public final String getClientId() {
                return this.clientId;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdminIsTyping(String conversationId, String createdByUser, Avatar avatar, boolean z, boolean z2, String clientId) {
                super(conversationId, NexusEventType.AdminIsTyping);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                Intrinsics.checkNotNullParameter(clientId, "clientId");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.avatar = avatar;
                this.isBot = z;
                this.showAvatar = z2;
                this.clientId = clientId;
            }
        }

        /* compiled from: NexusEventAsFlow.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$UserContentSeenByAdmin;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "createdByUser", "avatar", "Lio/intercom/android/sdk/models/Avatar;", "isBot", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Avatar;Z)V", "getConversationId", "()Ljava/lang/String;", "getCreatedByUser", "getAvatar", "()Lio/intercom/android/sdk/models/Avatar;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UserContentSeenByAdmin extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;

            public static /* synthetic */ UserContentSeenByAdmin copy$default(UserContentSeenByAdmin userContentSeenByAdmin, String str, String str2, Avatar avatar, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userContentSeenByAdmin.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = userContentSeenByAdmin.createdByUser;
                }
                if ((i & 4) != 0) {
                    avatar = userContentSeenByAdmin.avatar;
                }
                if ((i & 8) != 0) {
                    z = userContentSeenByAdmin.isBot;
                }
                return userContentSeenByAdmin.copy(str, str2, avatar, z);
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
            public final Avatar getAvatar() {
                return this.avatar;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getIsBot() {
                return this.isBot;
            }

            public final UserContentSeenByAdmin copy(String conversationId, String createdByUser, Avatar avatar, boolean isBot) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                return new UserContentSeenByAdmin(conversationId, createdByUser, avatar, isBot);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UserContentSeenByAdmin)) {
                    return false;
                }
                UserContentSeenByAdmin userContentSeenByAdmin = (UserContentSeenByAdmin) other;
                return Intrinsics.areEqual(this.conversationId, userContentSeenByAdmin.conversationId) && Intrinsics.areEqual(this.createdByUser, userContentSeenByAdmin.createdByUser) && Intrinsics.areEqual(this.avatar, userContentSeenByAdmin.avatar) && this.isBot == userContentSeenByAdmin.isBot;
            }

            public int hashCode() {
                return (((((this.conversationId.hashCode() * 31) + this.createdByUser.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Boolean.hashCode(this.isBot);
            }

            public String toString() {
                return "UserContentSeenByAdmin(conversationId=" + this.conversationId + ", createdByUser=" + this.createdByUser + ", avatar=" + this.avatar + ", isBot=" + this.isBot + ')';
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            public final boolean isBot() {
                return this.isBot;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserContentSeenByAdmin(String conversationId, String createdByUser, Avatar avatar, boolean z) {
                super(conversationId, NexusEventType.AdminIsTyping);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(createdByUser, "createdByUser");
                Intrinsics.checkNotNullParameter(avatar, "avatar");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.avatar = avatar;
                this.isBot = z;
            }
        }

        /* compiled from: NexusEventAsFlow.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u0007H×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent$FinStreaming;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "conversationId", "", "clientAssignedUUID", "partType", "tokenSequenceIndex", "", "blocks", "", "Lio/intercom/android/sdk/blocks/lib/models/Block;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getConversationId", "()Ljava/lang/String;", "getClientAssignedUUID", "getPartType", "getTokenSequenceIndex", "()I", "getBlocks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FinStreaming extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final List<Block> blocks;
            private final String clientAssignedUUID;
            private final String conversationId;
            private final String partType;
            private final int tokenSequenceIndex;

            public static /* synthetic */ FinStreaming copy$default(FinStreaming finStreaming, String str, String str2, String str3, int i, List list, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    str = finStreaming.conversationId;
                }
                if ((i2 & 2) != 0) {
                    str2 = finStreaming.clientAssignedUUID;
                }
                if ((i2 & 4) != 0) {
                    str3 = finStreaming.partType;
                }
                if ((i2 & 8) != 0) {
                    i = finStreaming.tokenSequenceIndex;
                }
                if ((i2 & 16) != 0) {
                    list = finStreaming.blocks;
                }
                List list2 = list;
                String str4 = str3;
                return finStreaming.copy(str, str2, str4, i, list2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getConversationId() {
                return this.conversationId;
            }

            /* renamed from: component2, reason: from getter */
            public final String getClientAssignedUUID() {
                return this.clientAssignedUUID;
            }

            /* renamed from: component3, reason: from getter */
            public final String getPartType() {
                return this.partType;
            }

            /* renamed from: component4, reason: from getter */
            public final int getTokenSequenceIndex() {
                return this.tokenSequenceIndex;
            }

            public final List<Block> component5() {
                return this.blocks;
            }

            public final FinStreaming copy(String conversationId, String clientAssignedUUID, String partType, int tokenSequenceIndex, List<? extends Block> blocks) {
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
                Intrinsics.checkNotNullParameter(partType, "partType");
                Intrinsics.checkNotNullParameter(blocks, "blocks");
                return new FinStreaming(conversationId, clientAssignedUUID, partType, tokenSequenceIndex, blocks);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FinStreaming)) {
                    return false;
                }
                FinStreaming finStreaming = (FinStreaming) other;
                return Intrinsics.areEqual(this.conversationId, finStreaming.conversationId) && Intrinsics.areEqual(this.clientAssignedUUID, finStreaming.clientAssignedUUID) && Intrinsics.areEqual(this.partType, finStreaming.partType) && this.tokenSequenceIndex == finStreaming.tokenSequenceIndex && Intrinsics.areEqual(this.blocks, finStreaming.blocks);
            }

            public int hashCode() {
                return (((((((this.conversationId.hashCode() * 31) + this.clientAssignedUUID.hashCode()) * 31) + this.partType.hashCode()) * 31) + Integer.hashCode(this.tokenSequenceIndex)) * 31) + this.blocks.hashCode();
            }

            public String toString() {
                return "FinStreaming(conversationId=" + this.conversationId + ", clientAssignedUUID=" + this.clientAssignedUUID + ", partType=" + this.partType + ", tokenSequenceIndex=" + this.tokenSequenceIndex + ", blocks=" + this.blocks + ')';
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getClientAssignedUUID() {
                return this.clientAssignedUUID;
            }

            public final String getPartType() {
                return this.partType;
            }

            public final int getTokenSequenceIndex() {
                return this.tokenSequenceIndex;
            }

            public final List<Block> getBlocks() {
                return this.blocks;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public FinStreaming(String conversationId, String clientAssignedUUID, String partType, int i, List<? extends Block> blocks) {
                super(conversationId, NexusEventType.ConversationPartToken);
                Intrinsics.checkNotNullParameter(conversationId, "conversationId");
                Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
                Intrinsics.checkNotNullParameter(partType, "partType");
                Intrinsics.checkNotNullParameter(blocks, "blocks");
                this.conversationId = conversationId;
                this.clientAssignedUUID = clientAssignedUUID;
                this.partType = partType;
                this.tokenSequenceIndex = i;
                this.blocks = blocks;
            }
        }
    }

    /* compiled from: NexusEventAsFlow.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$NexusConnected;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NexusConnected extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final NexusConnected INSTANCE = new NexusConnected();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NexusConnected)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1135156447;
        }

        public String toString() {
            return "NexusConnected";
        }

        private NexusConnected() {
            super(null);
        }
    }

    /* compiled from: NexusEventAsFlow.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$UnSupportedEvent;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UnSupportedEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UnSupportedEvent)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -2056396516;
        }

        public String toString() {
            return "UnSupportedEvent";
        }

        private UnSupportedEvent() {
            super(null);
        }
    }
}
