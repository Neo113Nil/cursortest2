package com.yandex.mobile.ads.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B1\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/yandex/mobile/ads/common/Creative;", "", "", "creativeId", "campaignId", "placeId", "offerId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCreativeId", "b", "getCampaignId", "c", "getPlaceId", "d", "getOfferId", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Creative {

    /* renamed from: a, reason: from kotlin metadata and from toString */
    private final String creativeId;

    /* renamed from: b, reason: from kotlin metadata and from toString */
    private final String campaignId;

    /* renamed from: c, reason: from kotlin metadata and from toString */
    private final String placeId;

    /* renamed from: d, reason: from kotlin metadata and from toString */
    private final String offerId;

    public Creative(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.creativeId = str;
        this.campaignId = str2;
        this.placeId = str3;
        this.offerId = str4;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Creative.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.mobile.ads.common.Creative");
        Creative creative = (Creative) other;
        return Intrinsics.areEqual(this.creativeId, creative.creativeId) && Intrinsics.areEqual(this.campaignId, creative.campaignId) && Intrinsics.areEqual(this.placeId, creative.placeId) && Intrinsics.areEqual(this.offerId, creative.offerId);
    }

    public int hashCode() {
        String str = this.creativeId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.campaignId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.placeId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.offerId;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Creative(creativeId=" + this.creativeId + ", campaignId=" + this.campaignId + ", placeId=" + this.placeId + ", offerId=" + this.offerId + ")";
    }
}
