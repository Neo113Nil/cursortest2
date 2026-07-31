package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import gatewayprotocol.v1.CampaignStateOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CampaignRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "", "setCampaign", "", "opportunityId", "Lcom/google/protobuf/ByteString;", MBInterstitialActivity.INTENT_CAMAPIGN, "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "setShowTimestamp", "getCampaign", "removeState", "setLoadTimestamp", "getCampaignState", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CampaignRepository {
    @Nullable
    CampaignStateOuterClass.Campaign getCampaign(@NotNull ByteString opportunityId);

    @NotNull
    CampaignStateOuterClass.CampaignState getCampaignState();

    void removeState(@NotNull ByteString opportunityId);

    void setCampaign(@NotNull ByteString opportunityId, @NotNull CampaignStateOuterClass.Campaign campaign);

    void setLoadTimestamp(@NotNull ByteString opportunityId);

    void setShowTimestamp(@NotNull ByteString opportunityId);
}
