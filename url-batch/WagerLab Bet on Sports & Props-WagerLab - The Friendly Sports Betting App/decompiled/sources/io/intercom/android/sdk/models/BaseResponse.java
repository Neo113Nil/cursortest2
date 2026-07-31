package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.User;

/* loaded from: classes8.dex */
public abstract class BaseResponse {
    private final Config config;
    private final boolean hasConversations;
    private final User user;

    protected BaseResponse(Builder builder) {
        this.config = builder.config == null ? new Config() : builder.config;
        this.hasConversations = builder.has_conversations;
        this.user = builder.user == null ? User.NULL : builder.user.build();
    }

    public Config getConfig() {
        return this.config;
    }

    public boolean hasConversations() {
        return this.hasConversations;
    }

    public User getUser() {
        return this.user;
    }

    static abstract class Builder {
        Config config;
        boolean has_conversations;
        User.Builder user;

        public abstract BaseResponse build();

        Builder() {
        }
    }
}
