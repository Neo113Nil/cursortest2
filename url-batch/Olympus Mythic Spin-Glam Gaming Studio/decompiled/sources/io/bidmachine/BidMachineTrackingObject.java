package io.bidmachine;

import io.bidmachine.AdResponseCacheParamsCollector;
import io.bidmachine.models.AdObject;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.SessionTrackingObject;
import io.bidmachine.utils.BMError;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005Jb\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0015H\u0002JN\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0018H\u0007J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\rH\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lio/bidmachine/BidMachineTrackingObject;", "Lio/bidmachine/tracking/SessionTrackingObject;", "()V", "trackingKey", "", "(Ljava/lang/Object;)V", "adResponse", "Lio/bidmachine/AdResponse;", "cacheParamsCollector", "Lio/bidmachine/AdResponseCacheParamsCollector;", "eventFinish", "", "trackEventType", "Lio/bidmachine/TrackEventType;", "isBillable", "", "adsType", "Lio/bidmachine/AdsType;", "bmError", "Lio/bidmachine/utils/BMError;", "customParams", "", "", "extraParams", "", "getEventConfiguration", "Lio/bidmachine/protobuf/AdExtension$EventConfiguration;", "getTrackingUrls", "", "eventType", "setAdResponse", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class BidMachineTrackingObject extends SessionTrackingObject {

    @Nullable
    private AdResponse adResponse;

    @NotNull
    private final AdResponseCacheParamsCollector cacheParamsCollector;

    public BidMachineTrackingObject() {
        super(k.b().p());
        this.cacheParamsCollector = new AdResponseCacheParamsCollector(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ void eventFinish$default(BidMachineTrackingObject bidMachineTrackingObject, TrackEventType trackEventType, boolean z, AdsType adsType, AdResponse adResponse, BMError bMError, Map map, int i, Object obj) {
        if ((i & 32) != 0) {
            map = null;
        }
        bidMachineTrackingObject.eventFinish(trackEventType, z, adsType, adResponse, bMError, map);
    }

    public final void eventFinish(@NotNull TrackEventType trackEventType, boolean z, @Nullable AdsType adsType, @Nullable AdResponse adResponse, @Nullable BMError bMError) {
        Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
        eventFinish$default(this, trackEventType, z, adsType, adResponse, bMError, null, 32, null);
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    @Nullable
    public AdExtension.EventConfiguration getEventConfiguration() {
        AdResponse adResponse = this.adResponse;
        return adResponse == null ? super.getEventConfiguration() : adResponse.getEventConfiguration();
    }

    @Override // io.bidmachine.tracking.TrackingObjectImpl, io.bidmachine.tracking.TrackingObject
    @Nullable
    public List<String> getTrackingUrls(@NotNull TrackEventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        AdResponse adResponse = this.adResponse;
        return adResponse == null ? super.getTrackingUrls(eventType) : adResponse.getTrackUrlListByEvent(eventType);
    }

    public final void setAdResponse(@Nullable AdResponse adResponse) {
        this.adResponse = adResponse;
    }

    public final void eventFinish(@NotNull final TrackEventType trackEventType, final boolean isBillable, @Nullable final AdsType adsType, @Nullable final AdResponse adResponse, @Nullable final BMError bmError, @Nullable final Map<String, Object> customParams) {
        Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
        this.cacheParamsCollector.collect(trackEventType, adResponse, new AdResponseCacheParamsCollector.Callback() { // from class: io.bidmachine.BidMachineTrackingObject$eventFinish$1
            @Override // io.bidmachine.AdResponseCacheParamsCollector.Callback
            public void onCollected(@NotNull Map<String, ? extends Object> cacheParams) {
                Intrinsics.checkNotNullParameter(cacheParams, "cacheParams");
                BidMachineTrackingObject.this.eventFinish(trackEventType, isBillable, adsType, adResponse, bmError, customParams, cacheParams);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidMachineTrackingObject(@NotNull Object trackingKey) {
        super(trackingKey, k.b().p());
        Intrinsics.checkNotNullParameter(trackingKey, "trackingKey");
        this.cacheParamsCollector = new AdResponseCacheParamsCollector(null, null, null, null, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eventFinish(TrackEventType trackEventType, boolean isBillable, AdsType adsType, AdResponse adResponse, BMError bmError, Map<String, ? extends Object> customParams, Map<String, ? extends Object> extraParams) {
        Map<String, ? extends Object> customParams2;
        EventData isBillable2 = new EventData().setIsBillable(isBillable);
        if (adResponse != null) {
            isBillable2.setNetworkName(adResponse.getAuctionResult().getNetworkKey());
            isBillable2.setPrice(Double.valueOf(adResponse.getPrice()));
            AdObject adObject = adResponse.getAdObject();
            if (adObject != null && (customParams2 = adObject.getCustomParams()) != null && !customParams2.isEmpty()) {
                isBillable2.addCustomParams(customParams2);
            }
            String deal = adResponse.getAuctionResult().getDeal();
            if (deal != null && !StringsKt.isBlank(deal)) {
                isBillable2.addCustomParam("deal_id", deal);
            }
        }
        if (customParams != null && !customParams.isEmpty()) {
            isBillable2.addCustomParams(customParams);
        }
        if (extraParams != null && !extraParams.isEmpty()) {
            isBillable2.addCustomParams(extraParams);
        }
        eventFinish(trackEventType, adsType, isBillable2, bmError);
    }
}
