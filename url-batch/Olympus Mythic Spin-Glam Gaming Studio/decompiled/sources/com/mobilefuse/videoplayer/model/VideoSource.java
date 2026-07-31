package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VideoSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VideoSource;", "", "localFileCacheKey", "", "remoteUrl", "cacheEnabled", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCacheEnabled", "()Z", "getLocalFileCacheKey", "()Ljava/lang/String;", "getRemoteUrl", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes5.dex */
public final class VideoSource {
    private final boolean cacheEnabled;

    @NotNull
    private final String localFileCacheKey;

    @NotNull
    private final String remoteUrl;

    public VideoSource(@NotNull String localFileCacheKey, @NotNull String remoteUrl, boolean z) {
        Intrinsics.checkNotNullParameter(localFileCacheKey, "localFileCacheKey");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.localFileCacheKey = localFileCacheKey;
        this.remoteUrl = remoteUrl;
        this.cacheEnabled = z;
    }

    @NotNull
    public final String getLocalFileCacheKey() {
        return this.localFileCacheKey;
    }

    @NotNull
    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    public /* synthetic */ VideoSource(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z);
    }

    public final boolean getCacheEnabled() {
        return this.cacheEnabled;
    }
}
