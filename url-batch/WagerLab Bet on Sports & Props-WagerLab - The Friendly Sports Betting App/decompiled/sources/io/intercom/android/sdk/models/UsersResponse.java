package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

/* loaded from: classes8.dex */
public class UsersResponse extends BaseResponse {
    private final ConversationList unreadConversations;
    private final UnreadTickets unreadTickets;

    UsersResponse(Builder builder) {
        super(builder);
        ConversationList build;
        UnreadTickets unreadTickets;
        if (builder.unread_conversations == null) {
            build = new ConversationList.Builder().build();
        } else {
            build = builder.unread_conversations.build();
        }
        this.unreadConversations = build;
        if (builder.unread_tickets == null) {
            unreadTickets = UnreadTickets.INSTANCE.getNULL();
        } else {
            unreadTickets = builder.unread_tickets;
        }
        this.unreadTickets = unreadTickets;
    }

    public ConversationList getUnreadConversations() {
        return this.unreadConversations;
    }

    public UnreadTickets getUnreadTickets() {
        return this.unreadTickets;
    }

    public static class Builder extends BaseResponse.Builder {
        ConversationList.Builder unread_conversations;
        UnreadTickets unread_tickets;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public UsersResponse build() {
            return new UsersResponse(this);
        }
    }
}
