package com.unity3d.ads.network.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpBody.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody;", "", "StringBody", "ByteArrayBody", "EmptyBody", "Lcom/unity3d/ads/network/model/HttpBody$ByteArrayBody;", "Lcom/unity3d/ads/network/model/HttpBody$EmptyBody;", "Lcom/unity3d/ads/network/model/HttpBody$StringBody;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface HttpBody {

    /* compiled from: HttpBody.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody$StringBody;", "Lcom/unity3d/ads/network/model/HttpBody;", "content", "", "<init>", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StringBody implements HttpBody {

        @NotNull
        private final String content;

        public StringBody(@NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }
    }

    /* compiled from: HttpBody.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody$ByteArrayBody;", "Lcom/unity3d/ads/network/model/HttpBody;", "content", "", "<init>", "([B)V", "getContent", "()[B", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ByteArrayBody implements HttpBody {

        @NotNull
        private final byte[] content;

        public ByteArrayBody(@NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final byte[] getContent() {
            return this.content;
        }
    }

    /* compiled from: HttpBody.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody$EmptyBody;", "Lcom/unity3d/ads/network/model/HttpBody;", "<init>", "()V", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyBody implements HttpBody {

        @NotNull
        public static final EmptyBody INSTANCE = new EmptyBody();

        private EmptyBody() {
        }
    }
}
