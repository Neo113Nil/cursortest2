package io.intercom.android.sdk.models;

import io.intercom.android.sdk.models.BaseResponse;
import io.intercom.android.sdk.models.Link;

/* loaded from: classes8.dex */
public class LinkResponse extends BaseResponse {
    private final Link link;

    LinkResponse(Builder builder) {
        super(builder);
        Link build;
        if (builder.article == null) {
            build = new Link.Builder().build();
        } else {
            build = builder.article.build();
        }
        this.link = build;
    }

    public Link getLink() {
        return this.link;
    }

    public static final class Builder extends BaseResponse.Builder {
        Link.Builder article;

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public LinkResponse build() {
            return new LinkResponse(this);
        }
    }
}
