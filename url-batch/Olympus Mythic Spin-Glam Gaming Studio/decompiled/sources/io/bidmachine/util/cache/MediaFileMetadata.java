package io.bidmachine.util.cache;

import java.io.File;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaFileMetadata.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0019\u0010!\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0013J\u0019\u0010#\u001a\u00020\nHÆ\u0003ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0013J\t\u0010%\u001a\u00020\rHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003Jf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u000b\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Lio/bidmachine/util/cache/MediaFileMetadata;", "", "file", "Ljava/io/File;", "mimeType", "", "sizeBytes", "", "usageFrequency", "pingTime", "Lkotlin/time/Duration;", "downloadTime", "lastUsedTime", "Ljava/util/Date;", "createdAt", "(Ljava/io/File;Ljava/lang/String;JJJJLjava/util/Date;Ljava/util/Date;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCreatedAt", "()Ljava/util/Date;", "getDownloadTime-UwyO8pc", "()J", "J", "getFile", "()Ljava/io/File;", "getLastUsedTime", "getMimeType", "()Ljava/lang/String;", "getPingTime-UwyO8pc", "getSizeBytes", "getUsageFrequency", "component1", "component2", "component3", "component4", "component5", "component5-UwyO8pc", "component6", "component6-UwyO8pc", "component7", "component8", "copy", "copy-77cDFVw", "(Ljava/io/File;Ljava/lang/String;JJJJLjava/util/Date;Ljava/util/Date;)Lio/bidmachine/util/cache/MediaFileMetadata;", "equals", "", "other", "hashCode", "", "toString", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MediaFileMetadata {

    @NotNull
    private final Date createdAt;
    private final long downloadTime;

    @NotNull
    private final File file;

    @NotNull
    private final Date lastUsedTime;

    @NotNull
    private final String mimeType;
    private final long pingTime;
    private final long sizeBytes;
    private final long usageFrequency;

    public /* synthetic */ MediaFileMetadata(File file, String str, long j, long j2, long j3, long j4, Date date, Date date2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, str, j, j2, j3, j4, date, date2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUsageFrequency() {
        return this.usageFrequency;
    }

    /* renamed from: component5-UwyO8pc, reason: not valid java name and from getter */
    public final long getPingTime() {
        return this.pingTime;
    }

    /* renamed from: component6-UwyO8pc, reason: not valid java name and from getter */
    public final long getDownloadTime() {
        return this.downloadTime;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Date getLastUsedTime() {
        return this.lastUsedTime;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* renamed from: copy-77cDFVw, reason: not valid java name */
    public final MediaFileMetadata m7955copy77cDFVw(@NotNull File file, @NotNull String mimeType, long sizeBytes, long usageFrequency, long pingTime, long downloadTime, @NotNull Date lastUsedTime, @NotNull Date createdAt) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(lastUsedTime, "lastUsedTime");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new MediaFileMetadata(file, mimeType, sizeBytes, usageFrequency, pingTime, downloadTime, lastUsedTime, createdAt, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaFileMetadata)) {
            return false;
        }
        MediaFileMetadata mediaFileMetadata = (MediaFileMetadata) other;
        return Intrinsics.areEqual(this.file, mediaFileMetadata.file) && Intrinsics.areEqual(this.mimeType, mediaFileMetadata.mimeType) && this.sizeBytes == mediaFileMetadata.sizeBytes && this.usageFrequency == mediaFileMetadata.usageFrequency && Duration.m8142equalsimpl0(this.pingTime, mediaFileMetadata.pingTime) && Duration.m8142equalsimpl0(this.downloadTime, mediaFileMetadata.downloadTime) && Intrinsics.areEqual(this.lastUsedTime, mediaFileMetadata.lastUsedTime) && Intrinsics.areEqual(this.createdAt, mediaFileMetadata.createdAt);
    }

    public int hashCode() {
        return (((((((((((((this.file.hashCode() * 31) + this.mimeType.hashCode()) * 31) + Long.hashCode(this.sizeBytes)) * 31) + Long.hashCode(this.usageFrequency)) * 31) + Duration.m8156hashCodeimpl(this.pingTime)) * 31) + Duration.m8156hashCodeimpl(this.downloadTime)) * 31) + this.lastUsedTime.hashCode()) * 31) + this.createdAt.hashCode();
    }

    @NotNull
    public String toString() {
        return "MediaFileMetadata(file=" + this.file + ", mimeType=" + this.mimeType + ", sizeBytes=" + this.sizeBytes + ", usageFrequency=" + this.usageFrequency + ", pingTime=" + ((Object) Duration.m8170toStringimpl(this.pingTime)) + ", downloadTime=" + ((Object) Duration.m8170toStringimpl(this.downloadTime)) + ", lastUsedTime=" + this.lastUsedTime + ", createdAt=" + this.createdAt + ')';
    }

    private MediaFileMetadata(File file, String str, long j, long j2, long j3, long j4, Date date, Date date2) {
        this.file = file;
        this.mimeType = str;
        this.sizeBytes = j;
        this.usageFrequency = j2;
        this.pingTime = j3;
        this.downloadTime = j4;
        this.lastUsedTime = date;
        this.createdAt = date2;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }

    public final long getSizeBytes() {
        return this.sizeBytes;
    }

    public final long getUsageFrequency() {
        return this.usageFrequency;
    }

    /* renamed from: getPingTime-UwyO8pc, reason: not valid java name */
    public final long m7957getPingTimeUwyO8pc() {
        return this.pingTime;
    }

    /* renamed from: getDownloadTime-UwyO8pc, reason: not valid java name */
    public final long m7956getDownloadTimeUwyO8pc() {
        return this.downloadTime;
    }

    @NotNull
    public final Date getLastUsedTime() {
        return this.lastUsedTime;
    }

    @NotNull
    public final Date getCreatedAt() {
        return this.createdAt;
    }
}
