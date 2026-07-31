package com.unity3d.ads.core.data.model;

import com.facebook.share.internal.ShareConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CachedFile.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JS\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/unity3d/ads/core/data/model/CachedFile;", "", "url", "", "name", "file", "Ljava/io/File;", ShareConstants.MEDIA_EXTENSION, "contentLength", "", "protocol", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;JLjava/lang/String;I)V", "getUrl", "()Ljava/lang/String;", "getName", "getFile", "()Ljava/io/File;", "getExtension", "getContentLength", "()J", "getProtocol", "getPriority", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CachedFile {
    private final long contentLength;

    @Nullable
    private final String extension;

    @Nullable
    private final File file;

    @NotNull
    private final String name;
    private final int priority;

    @NotNull
    private final String protocol;

    @NotNull
    private final String url;

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getExtension() {
        return this.extension;
    }

    /* renamed from: component5, reason: from getter */
    public final long getContentLength() {
        return this.contentLength;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final CachedFile copy(@NotNull String url, @NotNull String name, @Nullable File file, @Nullable String extension, long contentLength, @NotNull String protocol, int priority) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new CachedFile(url, name, file, extension, contentLength, protocol, priority);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) other;
        return Intrinsics.areEqual(this.url, cachedFile.url) && Intrinsics.areEqual(this.name, cachedFile.name) && Intrinsics.areEqual(this.file, cachedFile.file) && Intrinsics.areEqual(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && Intrinsics.areEqual(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public int hashCode() {
        int hashCode = ((this.url.hashCode() * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + Integer.hashCode(this.priority);
    }

    @NotNull
    public String toString() {
        return "CachedFile(url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public CachedFile(@NotNull String url, @NotNull String name, @Nullable File file, @Nullable String str, long j, @NotNull String protocol, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j;
        this.protocol = protocol;
        this.priority = i;
    }

    public /* synthetic */ CachedFile(String str, String str2, File file, String str3, long j, String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : file, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? -1L : j, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? Integer.MAX_VALUE : i);
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    public final int getPriority() {
        return this.priority;
    }
}
