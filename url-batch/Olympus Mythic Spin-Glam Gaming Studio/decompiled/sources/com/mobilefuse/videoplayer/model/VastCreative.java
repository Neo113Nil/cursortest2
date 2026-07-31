package com.mobilefuse.videoplayer.model;

import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jv\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006-"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastCreative;", "", "id", "", "adId", "sequence", "", VastAttributes.API_FRAMEWORK, "universalAdIdList", "", "Lcom/mobilefuse/videoplayer/model/VastUniversalAdId;", "linear", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "companionList", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "companionAdsRequiredMode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/mobilefuse/videoplayer/model/VastLinear;Ljava/util/List;Ljava/lang/String;)V", "getAdId", "()Ljava/lang/String;", "getApiFramework", "getCompanionAdsRequiredMode", "getCompanionList", "()Ljava/util/List;", "getId", "getLinear", "()Lcom/mobilefuse/videoplayer/model/VastLinear;", "getSequence", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUniversalAdIdList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/mobilefuse/videoplayer/model/VastLinear;Ljava/util/List;Ljava/lang/String;)Lcom/mobilefuse/videoplayer/model/VastCreative;", "equals", "", "other", "hashCode", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final /* data */ class VastCreative {

    @Nullable
    private final String adId;

    @Nullable
    private final String apiFramework;

    @Nullable
    private final String companionAdsRequiredMode;

    @NotNull
    private final List<VastCompanion> companionList;

    @Nullable
    private final String id;

    @Nullable
    private final VastLinear linear;

    @Nullable
    private final Integer sequence;

    @NotNull
    private final List<VastUniversalAdId> universalAdIdList;

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @NotNull
    public final List<VastUniversalAdId> component5() {
        return this.universalAdIdList;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final VastLinear getLinear() {
        return this.linear;
    }

    @NotNull
    public final List<VastCompanion> component7() {
        return this.companionList;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getCompanionAdsRequiredMode() {
        return this.companionAdsRequiredMode;
    }

    @NotNull
    public final VastCreative copy(@Nullable String id, @Nullable String adId, @Nullable Integer sequence, @Nullable String apiFramework, @NotNull List<VastUniversalAdId> universalAdIdList, @Nullable VastLinear linear, @NotNull List<VastCompanion> companionList, @Nullable String companionAdsRequiredMode) {
        Intrinsics.checkNotNullParameter(universalAdIdList, "universalAdIdList");
        Intrinsics.checkNotNullParameter(companionList, "companionList");
        return new VastCreative(id, adId, sequence, apiFramework, universalAdIdList, linear, companionList, companionAdsRequiredMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastCreative)) {
            return false;
        }
        VastCreative vastCreative = (VastCreative) other;
        return Intrinsics.areEqual(this.id, vastCreative.id) && Intrinsics.areEqual(this.adId, vastCreative.adId) && Intrinsics.areEqual(this.sequence, vastCreative.sequence) && Intrinsics.areEqual(this.apiFramework, vastCreative.apiFramework) && Intrinsics.areEqual(this.universalAdIdList, vastCreative.universalAdIdList) && Intrinsics.areEqual(this.linear, vastCreative.linear) && Intrinsics.areEqual(this.companionList, vastCreative.companionList) && Intrinsics.areEqual(this.companionAdsRequiredMode, vastCreative.companionAdsRequiredMode);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.adId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.sequence;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.apiFramework;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<VastUniversalAdId> list = this.universalAdIdList;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        VastLinear vastLinear = this.linear;
        int hashCode6 = (hashCode5 + (vastLinear != null ? vastLinear.hashCode() : 0)) * 31;
        List<VastCompanion> list2 = this.companionList;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str4 = this.companionAdsRequiredMode;
        return hashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastCreative(id=" + this.id + ", adId=" + this.adId + ", sequence=" + this.sequence + ", apiFramework=" + this.apiFramework + ", universalAdIdList=" + this.universalAdIdList + ", linear=" + this.linear + ", companionList=" + this.companionList + ", companionAdsRequiredMode=" + this.companionAdsRequiredMode + ")";
    }

    public VastCreative(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull List<VastUniversalAdId> universalAdIdList, @Nullable VastLinear vastLinear, @NotNull List<VastCompanion> companionList, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(universalAdIdList, "universalAdIdList");
        Intrinsics.checkNotNullParameter(companionList, "companionList");
        this.id = str;
        this.adId = str2;
        this.sequence = num;
        this.apiFramework = str3;
        this.universalAdIdList = universalAdIdList;
        this.linear = vastLinear;
        this.companionList = companionList;
        this.companionAdsRequiredMode = str4;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final Integer getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @NotNull
    public final List<VastUniversalAdId> getUniversalAdIdList() {
        return this.universalAdIdList;
    }

    @Nullable
    public final VastLinear getLinear() {
        return this.linear;
    }

    @NotNull
    public final List<VastCompanion> getCompanionList() {
        return this.companionList;
    }

    @Nullable
    public final String getCompanionAdsRequiredMode() {
        return this.companionAdsRequiredMode;
    }
}
