package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.domain.GetSharedDataTimestamps;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidCampaignRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidCampaignRepository;", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "getSharedDataTimestamps", "Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;", "<init>", "(Lcom/unity3d/ads/core/domain/GetSharedDataTimestamps;)V", "campaigns", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "Lgatewayprotocol/v1/CampaignStateOuterClass$Campaign;", "setCampaign", "", "opportunityId", "Lcom/google/protobuf/ByteString;", MBInterstitialActivity.INTENT_CAMAPIGN, "setShowTimestamp", "getCampaign", "removeState", "setLoadTimestamp", "getCampaignState", "Lgatewayprotocol/v1/CampaignStateOuterClass$CampaignState;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AndroidCampaignRepository implements CampaignRepository {

    @NotNull
    private final MutableStateFlow campaigns;

    @NotNull
    private final GetSharedDataTimestamps getSharedDataTimestamps;

    public AndroidCampaignRepository(@NotNull GetSharedDataTimestamps getSharedDataTimestamps) {
        Intrinsics.checkNotNullParameter(getSharedDataTimestamps, "getSharedDataTimestamps");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.campaigns = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setCampaign(@NotNull ByteString opportunityId, @NotNull CampaignStateOuterClass.Campaign campaign) {
        Object value;
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        MutableStateFlow mutableStateFlow = this.campaigns;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MapsKt.plus((Map) value, TuplesKt.to(opportunityId.toStringUtf8(), campaign))));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setShowTimestamp(@NotNull ByteString opportunityId) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setShowTimestamp(this.getSharedDataTimestamps.invoke());
            Unit unit = Unit.INSTANCE;
            setCampaign(opportunityId, _create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    @Nullable
    public CampaignStateOuterClass.Campaign getCampaign(@NotNull ByteString opportunityId) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return (CampaignStateOuterClass.Campaign) ((Map) this.campaigns.getValue()).get(opportunityId.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void removeState(@NotNull ByteString opportunityId) {
        Object value;
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        MutableStateFlow mutableStateFlow = this.campaigns;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MapsKt.minus((Map) value, opportunityId.toStringUtf8())));
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    public void setLoadTimestamp(@NotNull ByteString opportunityId) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        CampaignStateOuterClass.Campaign campaign = getCampaign(opportunityId);
        if (campaign != null) {
            CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.INSTANCE;
            CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
            CampaignKt.Dsl _create = companion._create(builder);
            _create.setLoadTimestamp(this.getSharedDataTimestamps.invoke());
            Unit unit = Unit.INSTANCE;
            setCampaign(opportunityId, _create._build());
        }
    }

    @Override // com.unity3d.ads.core.data.repository.CampaignRepository
    @NotNull
    public CampaignStateOuterClass.CampaignState getCampaignState() {
        Collection values = ((Map) this.campaigns.getValue()).values();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : values) {
            if (((CampaignStateOuterClass.Campaign) obj).hasShowTimestamp()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        CampaignStateKt.Dsl.Companion companion = CampaignStateKt.Dsl.INSTANCE;
        CampaignStateOuterClass.CampaignState.Builder newBuilder = CampaignStateOuterClass.CampaignState.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        CampaignStateKt.Dsl _create = companion._create(newBuilder);
        _create.addAllShownCampaigns(_create.getShownCampaigns(), list);
        _create.addAllLoadedCampaigns(_create.getLoadedCampaigns(), list2);
        return _create._build();
    }
}
