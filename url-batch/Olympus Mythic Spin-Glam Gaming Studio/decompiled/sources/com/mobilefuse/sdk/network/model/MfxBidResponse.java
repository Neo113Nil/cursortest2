package com.mobilefuse.sdk.network.model;

import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MfxBidResponse.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\bL\b\u0086\b\u0018\u0000 `2\u00020\u0001:\u0001`BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010 J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010G\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010H\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010I\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010'J\t\u0010J\u001a\u00020\u0010HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010L\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010M\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010N\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u0010Q\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010R\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010,J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u000bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010$J\u0088\u0002\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020\u00102\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u000bHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010(\u001a\u0004\b4\u0010'R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b7\u0010$R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010(\u001a\u0004\b8\u0010'R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b9\u0010$R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b:\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\"R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\"R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010-\u001a\u0004\b=\u0010,R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b>\u0010$R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010%\u001a\u0004\b?\u0010$R\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010C¨\u0006a"}, d2 = {"Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "", "id", "", "cpm", "", "crid", "type", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "adm", "expires", "", "creativeFormat", "Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat;", "lossUrl", "muted", "", "clickBehavior", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "maxEndCards", "endCardCloseSeconds", "", "forceSkipSeconds", "blockSkipSeconds", "shouldStreamVideo", "forceTestMode", "forceLogging", "allowClickthroughWithoutTap", "forceVerboseLogging", "sendConsoleLogs", "consoleLogsTimeLimit", "consoleLogsCountLimit", "(Ljava/lang/String;DLjava/lang/String;Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;ILcom/mobilefuse/sdk/network/model/AdmCreativeFormat;Ljava/lang/String;Ljava/lang/Boolean;Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAdm", "()Ljava/lang/String;", "getAllowClickthroughWithoutTap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlockSkipSeconds", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getClickBehavior", "()Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "getConsoleLogsCountLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConsoleLogsTimeLimit", "getCpm", "()D", "getCreativeFormat", "()Lcom/mobilefuse/sdk/network/model/AdmCreativeFormat;", "getCrid", "getEndCardCloseSeconds", "getExpires", "()I", "getForceLogging", "getForceSkipSeconds", "getForceTestMode", "getForceVerboseLogging", "getId", "getLossUrl", "getMaxEndCards", "getMuted", "getSendConsoleLogs", "getShouldStreamVideo", "()Z", "getType", "()Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;DLjava/lang/String;Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;ILcom/mobilefuse/sdk/network/model/AdmCreativeFormat;Ljava/lang/String;Ljava/lang/Boolean;Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/mobilefuse/sdk/network/model/MfxBidResponse;", "equals", "other", "hashCode", "toString", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes13.dex */
public final /* data */ class MfxBidResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String adm;

    @Nullable
    private final Boolean allowClickthroughWithoutTap;

    @Nullable
    private final Float blockSkipSeconds;

    @Nullable
    private final ClickthroughBehaviour clickBehavior;

    @Nullable
    private final Integer consoleLogsCountLimit;

    @Nullable
    private final Integer consoleLogsTimeLimit;
    private final double cpm;

    @Nullable
    private final AdmCreativeFormat creativeFormat;

    @NotNull
    private final String crid;

    @Nullable
    private final Float endCardCloseSeconds;
    private final int expires;

    @Nullable
    private final Boolean forceLogging;

    @Nullable
    private final Float forceSkipSeconds;

    @Nullable
    private final Boolean forceTestMode;

    @Nullable
    private final Boolean forceVerboseLogging;

    @NotNull
    private final String id;

    @Nullable
    private final String lossUrl;

    @Nullable
    private final Integer maxEndCards;

    @Nullable
    private final Boolean muted;

    @Nullable
    private final Boolean sendConsoleLogs;
    private final boolean shouldStreamVideo;

    @NotNull
    private final AdmMediaType type;

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final ClickthroughBehaviour getClickBehavior() {
        return this.clickBehavior;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Float getEndCardCloseSeconds() {
        return this.endCardCloseSeconds;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShouldStreamVideo() {
        return this.shouldStreamVideo;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Boolean getForceTestMode() {
        return this.forceTestMode;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Boolean getForceLogging() {
        return this.forceLogging;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Boolean getForceVerboseLogging() {
        return this.forceVerboseLogging;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCpm() {
        return this.cpm;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final Boolean getSendConsoleLogs() {
        return this.sendConsoleLogs;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Integer getConsoleLogsTimeLimit() {
        return this.consoleLogsTimeLimit;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final Integer getConsoleLogsCountLimit() {
        return this.consoleLogsCountLimit;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCrid() {
        return this.crid;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AdmMediaType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    /* renamed from: component6, reason: from getter */
    public final int getExpires() {
        return this.expires;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final AdmCreativeFormat getCreativeFormat() {
        return this.creativeFormat;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getLossUrl() {
        return this.lossUrl;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getMuted() {
        return this.muted;
    }

    @NotNull
    public final MfxBidResponse copy(@NotNull String id, double cpm, @NotNull String crid, @NotNull AdmMediaType type, @NotNull String adm, int expires, @Nullable AdmCreativeFormat creativeFormat, @Nullable String lossUrl, @Nullable Boolean muted, @Nullable ClickthroughBehaviour clickBehavior, @Nullable Integer maxEndCards, @Nullable Float endCardCloseSeconds, @Nullable Float forceSkipSeconds, @Nullable Float blockSkipSeconds, boolean shouldStreamVideo, @Nullable Boolean forceTestMode, @Nullable Boolean forceLogging, @Nullable Boolean allowClickthroughWithoutTap, @Nullable Boolean forceVerboseLogging, @Nullable Boolean sendConsoleLogs, @Nullable Integer consoleLogsTimeLimit, @Nullable Integer consoleLogsCountLimit) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(crid, "crid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adm, "adm");
        return new MfxBidResponse(id, cpm, crid, type, adm, expires, creativeFormat, lossUrl, muted, clickBehavior, maxEndCards, endCardCloseSeconds, forceSkipSeconds, blockSkipSeconds, shouldStreamVideo, forceTestMode, forceLogging, allowClickthroughWithoutTap, forceVerboseLogging, sendConsoleLogs, consoleLogsTimeLimit, consoleLogsCountLimit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfxBidResponse)) {
            return false;
        }
        MfxBidResponse mfxBidResponse = (MfxBidResponse) other;
        return Intrinsics.areEqual(this.id, mfxBidResponse.id) && Double.compare(this.cpm, mfxBidResponse.cpm) == 0 && Intrinsics.areEqual(this.crid, mfxBidResponse.crid) && Intrinsics.areEqual(this.type, mfxBidResponse.type) && Intrinsics.areEqual(this.adm, mfxBidResponse.adm) && this.expires == mfxBidResponse.expires && Intrinsics.areEqual(this.creativeFormat, mfxBidResponse.creativeFormat) && Intrinsics.areEqual(this.lossUrl, mfxBidResponse.lossUrl) && Intrinsics.areEqual(this.muted, mfxBidResponse.muted) && Intrinsics.areEqual(this.clickBehavior, mfxBidResponse.clickBehavior) && Intrinsics.areEqual(this.maxEndCards, mfxBidResponse.maxEndCards) && Intrinsics.areEqual((Object) this.endCardCloseSeconds, (Object) mfxBidResponse.endCardCloseSeconds) && Intrinsics.areEqual((Object) this.forceSkipSeconds, (Object) mfxBidResponse.forceSkipSeconds) && Intrinsics.areEqual((Object) this.blockSkipSeconds, (Object) mfxBidResponse.blockSkipSeconds) && this.shouldStreamVideo == mfxBidResponse.shouldStreamVideo && Intrinsics.areEqual(this.forceTestMode, mfxBidResponse.forceTestMode) && Intrinsics.areEqual(this.forceLogging, mfxBidResponse.forceLogging) && Intrinsics.areEqual(this.allowClickthroughWithoutTap, mfxBidResponse.allowClickthroughWithoutTap) && Intrinsics.areEqual(this.forceVerboseLogging, mfxBidResponse.forceVerboseLogging) && Intrinsics.areEqual(this.sendConsoleLogs, mfxBidResponse.sendConsoleLogs) && Intrinsics.areEqual(this.consoleLogsTimeLimit, mfxBidResponse.consoleLogsTimeLimit) && Intrinsics.areEqual(this.consoleLogsCountLimit, mfxBidResponse.consoleLogsCountLimit);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.id;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Double.hashCode(this.cpm)) * 31;
        String str2 = this.crid;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AdmMediaType admMediaType = this.type;
        int hashCode3 = (hashCode2 + (admMediaType != null ? admMediaType.hashCode() : 0)) * 31;
        String str3 = this.adm;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.expires)) * 31;
        AdmCreativeFormat admCreativeFormat = this.creativeFormat;
        int hashCode5 = (hashCode4 + (admCreativeFormat != null ? admCreativeFormat.hashCode() : 0)) * 31;
        String str4 = this.lossUrl;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.muted;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        ClickthroughBehaviour clickthroughBehaviour = this.clickBehavior;
        int hashCode8 = (hashCode7 + (clickthroughBehaviour != null ? clickthroughBehaviour.hashCode() : 0)) * 31;
        Integer num = this.maxEndCards;
        int hashCode9 = (hashCode8 + (num != null ? num.hashCode() : 0)) * 31;
        Float f = this.endCardCloseSeconds;
        int hashCode10 = (hashCode9 + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.forceSkipSeconds;
        int hashCode11 = (hashCode10 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.blockSkipSeconds;
        int hashCode12 = (hashCode11 + (f3 != null ? f3.hashCode() : 0)) * 31;
        boolean z = this.shouldStreamVideo;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode12 + i) * 31;
        Boolean bool2 = this.forceTestMode;
        int hashCode13 = (i2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.forceLogging;
        int hashCode14 = (hashCode13 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.allowClickthroughWithoutTap;
        int hashCode15 = (hashCode14 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.forceVerboseLogging;
        int hashCode16 = (hashCode15 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.sendConsoleLogs;
        int hashCode17 = (hashCode16 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Integer num2 = this.consoleLogsTimeLimit;
        int hashCode18 = (hashCode17 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.consoleLogsCountLimit;
        return hashCode18 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MfxBidResponse(id=" + this.id + ", cpm=" + this.cpm + ", crid=" + this.crid + ", type=" + this.type + ", adm=" + this.adm + ", expires=" + this.expires + ", creativeFormat=" + this.creativeFormat + ", lossUrl=" + this.lossUrl + ", muted=" + this.muted + ", clickBehavior=" + this.clickBehavior + ", maxEndCards=" + this.maxEndCards + ", endCardCloseSeconds=" + this.endCardCloseSeconds + ", forceSkipSeconds=" + this.forceSkipSeconds + ", blockSkipSeconds=" + this.blockSkipSeconds + ", shouldStreamVideo=" + this.shouldStreamVideo + ", forceTestMode=" + this.forceTestMode + ", forceLogging=" + this.forceLogging + ", allowClickthroughWithoutTap=" + this.allowClickthroughWithoutTap + ", forceVerboseLogging=" + this.forceVerboseLogging + ", sendConsoleLogs=" + this.sendConsoleLogs + ", consoleLogsTimeLimit=" + this.consoleLogsTimeLimit + ", consoleLogsCountLimit=" + this.consoleLogsCountLimit + ")";
    }

    public MfxBidResponse(@NotNull String id, double d, @NotNull String crid, @NotNull AdmMediaType type, @NotNull String adm, int i, @Nullable AdmCreativeFormat admCreativeFormat, @Nullable String str, @Nullable Boolean bool, @Nullable ClickthroughBehaviour clickthroughBehaviour, @Nullable Integer num, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, boolean z, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(crid, "crid");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.id = id;
        this.cpm = d;
        this.crid = crid;
        this.type = type;
        this.adm = adm;
        this.expires = i;
        this.creativeFormat = admCreativeFormat;
        this.lossUrl = str;
        this.muted = bool;
        this.clickBehavior = clickthroughBehaviour;
        this.maxEndCards = num;
        this.endCardCloseSeconds = f;
        this.forceSkipSeconds = f2;
        this.blockSkipSeconds = f3;
        this.shouldStreamVideo = z;
        this.forceTestMode = bool2;
        this.forceLogging = bool3;
        this.allowClickthroughWithoutTap = bool4;
        this.forceVerboseLogging = bool5;
        this.sendConsoleLogs = bool6;
        this.consoleLogsTimeLimit = num2;
        this.consoleLogsCountLimit = num3;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getCpm() {
        return this.cpm;
    }

    @NotNull
    public final String getCrid() {
        return this.crid;
    }

    @NotNull
    public final AdmMediaType getType() {
        return this.type;
    }

    @NotNull
    public final String getAdm() {
        return this.adm;
    }

    public final int getExpires() {
        return this.expires;
    }

    @Nullable
    public final AdmCreativeFormat getCreativeFormat() {
        return this.creativeFormat;
    }

    @Nullable
    public final String getLossUrl() {
        return this.lossUrl;
    }

    @Nullable
    public final Boolean getMuted() {
        return this.muted;
    }

    @Nullable
    public final ClickthroughBehaviour getClickBehavior() {
        return this.clickBehavior;
    }

    @Nullable
    public final Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    public final Float getEndCardCloseSeconds() {
        return this.endCardCloseSeconds;
    }

    @Nullable
    public final Float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @Nullable
    public final Float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    public final boolean getShouldStreamVideo() {
        return this.shouldStreamVideo;
    }

    @Nullable
    public final Boolean getForceTestMode() {
        return this.forceTestMode;
    }

    @Nullable
    public final Boolean getForceLogging() {
        return this.forceLogging;
    }

    @Nullable
    public final Boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    @Nullable
    public final Boolean getForceVerboseLogging() {
        return this.forceVerboseLogging;
    }

    @Nullable
    public final Boolean getSendConsoleLogs() {
        return this.sendConsoleLogs;
    }

    @Nullable
    public final Integer getConsoleLogsTimeLimit() {
        return this.consoleLogsTimeLimit;
    }

    @Nullable
    public final Integer getConsoleLogsCountLimit() {
        return this.consoleLogsCountLimit;
    }

    /* compiled from: MfxBidResponse.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mobilefuse/sdk/network/model/MfxBidResponse$Companion;", "", "()V", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
