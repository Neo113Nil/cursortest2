package com.unity3d.ads.adplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/unity3d/ads/adplayer/model/OnDownloadProgressEvent;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "downloadId", "", "percent", "", "bytesDownloaded", "", "totalBytes", "completed", "", "error", "source", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;JLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "category", "getCategory", "()Ljava/lang/String;", "name", "getName", "parameters", "", "", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnDownloadProgressEvent implements WebViewEvent {

    @NotNull
    private final String category;

    @NotNull
    private final String name;

    @NotNull
    private final Object[] parameters;

    public OnDownloadProgressEvent(@NotNull String downloadId, @Nullable Integer num, long j, @Nullable Long l, boolean z, @Nullable String str, @NotNull String source) {
        Intrinsics.checkNotNullParameter(downloadId, "downloadId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.category = "ADVIEWER";
        this.name = "ON_DOWNLOAD_PROGRESS";
        this.parameters = new Object[]{downloadId, num, Long.valueOf(j), l, Boolean.valueOf(z), str, source};
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getCategory() {
        return this.category;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // com.unity3d.ads.adplayer.model.WebViewEvent
    @NotNull
    public Object[] getParameters() {
        return this.parameters;
    }
}
