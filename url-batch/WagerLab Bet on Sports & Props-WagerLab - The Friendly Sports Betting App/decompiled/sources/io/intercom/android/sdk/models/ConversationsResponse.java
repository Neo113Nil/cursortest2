package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.ConversationList;

/* loaded from: classes8.dex */
public class ConversationsResponse extends BaseResponse {
    private final ConversationList conversationPage;

    ConversationsResponse(Builder builder) {
        super(builder);
        ConversationList build;
        if (builder.conversation_page == null) {
            build = new ConversationList.Builder().build();
        } else {
            build = builder.conversation_page.build();
        }
        this.conversationPage = build;
    }

    public ConversationList getConversationPage() {
        return this.conversationPage;
    }

    public static final class Builder extends BaseResponse.Builder {
        ConversationList.Builder conversation_page;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationsResponse build() {
            return new ConversationsResponse(this);
        }

        public Builder withConversationPage(ConversationList.Builder builder) {
            this.conversation_page = builder;
            return this;
        }
    }
}
