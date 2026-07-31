package com.unity3d.ads.core.data.model;

import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OmidOptions.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006)"}, d2 = {"Lcom/unity3d/ads/core/data/model/OmidOptions;", "", "isolateVerificationScripts", "", "impressionOwner", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "videoEventsOwner", "customReferenceData", "", "impressionType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "creativeType", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "mediaEventsOwner", "<init>", "(ZLcom/iab/omid/library/unity3d/adsession/Owner;Lcom/iab/omid/library/unity3d/adsession/Owner;Ljava/lang/String;Lcom/iab/omid/library/unity3d/adsession/ImpressionType;Lcom/iab/omid/library/unity3d/adsession/CreativeType;Lcom/iab/omid/library/unity3d/adsession/Owner;)V", "getIsolateVerificationScripts", "()Z", "getImpressionOwner", "()Lcom/iab/omid/library/unity3d/adsession/Owner;", "getVideoEventsOwner", "getCustomReferenceData", "()Ljava/lang/String;", "getImpressionType", "()Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "getCreativeType", "()Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "getMediaEventsOwner", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OmidOptions {

    @Nullable
    private final CreativeType creativeType;

    @Nullable
    private final String customReferenceData;

    @Nullable
    private final Owner impressionOwner;

    @Nullable
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;

    @Nullable
    private final Owner mediaEventsOwner;

    @Nullable
    private final Owner videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = omidOptions.isolateVerificationScripts;
        }
        if ((i & 2) != 0) {
            owner = omidOptions.impressionOwner;
        }
        Owner owner4 = owner;
        if ((i & 4) != 0) {
            owner2 = omidOptions.videoEventsOwner;
        }
        Owner owner5 = owner2;
        if ((i & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            impressionType = omidOptions.impressionType;
        }
        ImpressionType impressionType2 = impressionType;
        if ((i & 32) != 0) {
            creativeType = omidOptions.creativeType;
        }
        CreativeType creativeType2 = creativeType;
        if ((i & 64) != 0) {
            owner3 = omidOptions.mediaEventsOwner;
        }
        return omidOptions.copy(z, owner4, owner5, str2, impressionType2, creativeType2, owner3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Owner getImpressionOwner() {
        return this.impressionOwner;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Owner getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ImpressionType getImpressionType() {
        return this.impressionType;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Owner getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    @NotNull
    public final OmidOptions copy(boolean isolateVerificationScripts, @Nullable Owner impressionOwner, @Nullable Owner videoEventsOwner, @Nullable String customReferenceData, @Nullable ImpressionType impressionType, @Nullable CreativeType creativeType, @Nullable Owner mediaEventsOwner) {
        return new OmidOptions(isolateVerificationScripts, impressionOwner, videoEventsOwner, customReferenceData, impressionType, creativeType, mediaEventsOwner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) other;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && Intrinsics.areEqual(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isolateVerificationScripts) * 31;
        Owner owner = this.impressionOwner;
        int hashCode2 = (hashCode + (owner == null ? 0 : owner.hashCode())) * 31;
        Owner owner2 = this.videoEventsOwner;
        int hashCode3 = (hashCode2 + (owner2 == null ? 0 : owner2.hashCode())) * 31;
        String str = this.customReferenceData;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ImpressionType impressionType = this.impressionType;
        int hashCode5 = (hashCode4 + (impressionType == null ? 0 : impressionType.hashCode())) * 31;
        CreativeType creativeType = this.creativeType;
        int hashCode6 = (hashCode5 + (creativeType == null ? 0 : creativeType.hashCode())) * 31;
        Owner owner3 = this.mediaEventsOwner;
        return hashCode6 + (owner3 != null ? owner3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public OmidOptions(boolean z, @Nullable Owner owner, @Nullable Owner owner2, @Nullable String str, @Nullable ImpressionType impressionType, @Nullable CreativeType creativeType, @Nullable Owner owner3) {
        this.isolateVerificationScripts = z;
        this.impressionOwner = owner;
        this.videoEventsOwner = owner2;
        this.customReferenceData = str;
        this.impressionType = impressionType;
        this.creativeType = creativeType;
        this.mediaEventsOwner = owner3;
    }

    public /* synthetic */ OmidOptions(boolean z, Owner owner, Owner owner2, String str, ImpressionType impressionType, CreativeType creativeType, Owner owner3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : owner, (i & 4) != 0 ? null : owner2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : impressionType, (i & 32) != 0 ? null : creativeType, (i & 64) == 0 ? owner3 : null);
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    @Nullable
    public final Owner getImpressionOwner() {
        return this.impressionOwner;
    }

    @Nullable
    public final Owner getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    @Nullable
    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    @Nullable
    public final ImpressionType getImpressionType() {
        return this.impressionType;
    }

    @Nullable
    public final CreativeType getCreativeType() {
        return this.creativeType;
    }

    @Nullable
    public final Owner getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }
}
