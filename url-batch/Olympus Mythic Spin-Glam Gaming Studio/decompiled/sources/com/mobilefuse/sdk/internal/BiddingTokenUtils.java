package com.mobilefuse.sdk.internal;

import com.ironsource.O6;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.internal.bidding.Partner;
import com.mobilefuse.sdk.mfx.MfxRequestAdKt;
import com.mobilefuse.sdk.network.model.MfxBidRequest;
import com.mobilefuse.sdk.network.model.MfxBidRequestToMapKt;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BiddingTokenUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\fJ\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/mobilefuse/sdk/internal/BiddingTokenUtils;", "", "()V", "paramsToRemoveForAmazon", "", "", "paramsToRemoveForNimbus", "alterPartnerParams", "", "request", "Lcom/mobilefuse/sdk/internal/IMobileFuseBiddingTokenRequest;", "data", "", "buildBaseDataMap", "getParamsToRemove", "Lcom/mobilefuse/sdk/internal/BiddingPartnerTokenRequest;", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final class BiddingTokenUtils {

    @NotNull
    public static final BiddingTokenUtils INSTANCE = new BiddingTokenUtils();
    private static final Set<String> paramsToRemoveForNimbus = SetsKt.setOf((Object[]) new String[]{POBConstants.TEST_MODE, "app_version", "ifa", "ua", O6.q, CommonUrlParts.DEVICE_TYPE, "device_w", "device_h", "lmt", "lat", POBConstants.KEY_LONGITUDE, "altitude", "pressure", "coppa", "gpp", "us_privacy", "banner_width", "banner_height"});
    private static final Set<String> paramsToRemoveForAmazon = SetsKt.setOf((Object[]) new String[]{"ifa", POBConstants.KEY_IP, POBConstants.KEY_YEAR_OF_BIRTH, "gender", "eid_source", "lat", POBConstants.KEY_LONGITUDE, TelemetryCategory.EID});

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    /* loaded from: classes14.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Partner.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Partner.NIMBUS.ordinal()] = 1;
            iArr[Partner.AMAZON.ordinal()] = 2;
        }
    }

    private BiddingTokenUtils() {
    }

    @NotNull
    public final Map<String, Object> buildBaseDataMap(@NotNull IMobileFuseBiddingTokenRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        final MobileFusePrivacyPreferences mergePrivacyPreferences$mobilefuse_sdk_core_release = MobileFuseBiddingTokenProvider.INSTANCE.mergePrivacyPreferences$mobilefuse_sdk_core_release(request.getPrivacyPreferences());
        MfxBidRequest createBidRequest = MfxRequestAdKt.createBidRequest("", 0, 0, new Function0() { // from class: com.mobilefuse.sdk.internal.BiddingTokenUtils$buildBaseDataMap$bidRequest$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final MobileFusePrivacyPreferences mo4828invoke() {
                return MobileFusePrivacyPreferences.this;
            }
        }, request.getIsTestMode(), request.getBidFloor());
        Map<String, Object> mutableMap = MapsKt.toMutableMap(MfxBidRequestToMapKt.toMap(createBidRequest, false));
        if (!createBidRequest.getEidValues().isEmpty()) {
            mutableMap.put(TelemetryCategory.EID, createBidRequest.getEidValues());
        }
        mutableMap.put("v", 2);
        mutableMap.remove(POBConstants.KEY_TAG_ID);
        alterPartnerParams(request, mutableMap);
        return mutableMap;
    }

    public final void alterPartnerParams(@NotNull IMobileFuseBiddingTokenRequest request, @NotNull Map<String, Object> data) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(data, "data");
        if (request instanceof BiddingPartnerTokenRequest) {
            Iterator<T> it = getParamsToRemove((BiddingPartnerTokenRequest) request).iterator();
            while (it.hasNext()) {
                data.remove((String) it.next());
            }
        }
    }

    @NotNull
    public final Set<String> getParamsToRemove(@NotNull BiddingPartnerTokenRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        int i = WhenMappings.$EnumSwitchMapping$0[request.getPartner().ordinal()];
        if (i == 1) {
            return paramsToRemoveForNimbus;
        }
        if (i == 2) {
            if (MobileFuseSettings.isLimitTrackingEnabled() || request.getPrivacyPreferences().isDoNotTrack()) {
                return paramsToRemoveForAmazon;
            }
            return SetsKt.emptySet();
        }
        return SetsKt.emptySet();
    }
}
