package com.pubmatic.sdk.openwrap.core;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.base.POBAdBuilding;
import com.pubmatic.sdk.common.base.POBBaseBidder;
import com.pubmatic.sdk.common.base.POBBidderListener;
import com.pubmatic.sdk.common.base.POBBidderResult;
import com.pubmatic.sdk.common.base.POBCommunicator;
import com.pubmatic.sdk.common.base.POBRequestBuilding;
import com.pubmatic.sdk.common.base.POBResponseParsing;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAdResponse;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.openwrap.core.internal.POBBidsBuilder;
import com.pubmatic.sdk.openwrap.core.internal.POBResponseParser;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes11.dex */
public class POBManager extends POBBaseBidder<POBBid> {
    private final POBCommunicator b;
    private POBBidderResult c;
    private POBBaseBidder.CountryFilterConfig d;
    private POBDeviceInfo e;

    private class b implements POBCommunicator.POBCommunicatorListener {
        private b() {
        }

        @Override // com.pubmatic.sdk.common.base.POBCommunicator.POBCommunicatorListener
        public void onError(POBError pOBError) {
            POBManager.this.a(pOBError);
        }

        @Override // com.pubmatic.sdk.common.base.POBCommunicator.POBCommunicatorListener
        public void onSuccess(POBAdResponse pOBAdResponse) {
            POBLog.debug("POBManager", "Ready to share Wrapper bid", new Object[0]);
            if (POBManager.this.c != null) {
                POBManager.this.c.setAdResponse(pOBAdResponse);
            }
            if (((POBBaseBidder) POBManager.this).bidderListener != null) {
                ((POBBaseBidder) POBManager.this).bidderListener.onBidsFetched(POBManager.this, pOBAdResponse);
            }
        }
    }

    public POBManager(@NonNull Context context, @NonNull POBCommunicator<POBBid> pOBCommunicator) {
        this.b = pOBCommunicator;
        pOBCommunicator.setListener(new b());
        this.e = POBInstanceProvider.getDeviceInfo(context);
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public void destroy() {
        this.bidderListener = null;
        this.b.cancel();
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @Nullable
    public POBAdResponse<POBBid> getAdResponse() {
        POBBidderResult pOBBidderResult = this.c;
        if (pOBBidderResult != null) {
            return pOBBidderResult.getAdResponse();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    @NonNull
    public Map<String, POBBidderResult<POBBid>> getBidderResults() {
        HashMap hashMap = new HashMap();
        POBBidderResult pOBBidderResult = this.c;
        if (pOBBidderResult != null) {
            pOBBidderResult.setNetworkResult(this.b.getNetworkResult());
            hashMap.put(getIdentifier(), this.c);
        }
        return hashMap;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidding
    public void requestBid() {
        this.c = new POBBidderResult();
        if (b()) {
            this.b.requestAd();
        } else {
            a(new POBError(1012, POBCommonConstants.MSG_REQUEST_NOT_ALLOWED));
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBBaseBidder
    public void setCountryFilterConfig(@Nullable POBBaseBidder.CountryFilterConfig countryFilterConfig) {
        this.d = countryFilterConfig;
    }

    private POBRequestBuilding b(Context context, POBRequest pOBRequest) {
        POBRequestBuilder pOBRequestBuilder = new POBRequestBuilder(pOBRequest, "https://ow.pubmatic.com/openrtb/2.5", context);
        pOBRequestBuilder.setAppInfo(POBInstanceProvider.getAppInfo(context.getApplicationContext()));
        pOBRequestBuilder.setDeviceInfo(POBInstanceProvider.getDeviceInfo(context.getApplicationContext()));
        pOBRequestBuilder.setLocationDetector(POBInstanceProvider.getLocationDetector(context.getApplicationContext()));
        return pOBRequestBuilder;
    }

    private POBResponseParsing c() {
        return new POBResponseParser();
    }

    private POBCommunicator a(Context context, POBRequest pOBRequest) {
        return new POBCommunicator(b(context, pOBRequest), c(), a(), POBInstanceProvider.getNetworkHandlerWithMainThreadDelivery());
    }

    public POBManager(@NonNull POBRequest pOBRequest, @NonNull Context context) {
        POBCommunicator a2 = a(context, pOBRequest);
        this.b = a2;
        a2.setListener(new b());
        this.e = POBInstanceProvider.getDeviceInfo(context);
    }

    private POBAdBuilding a() {
        return new POBBidsBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBError pOBError) {
        POBBidderResult pOBBidderResult = this.c;
        if (pOBBidderResult != null) {
            pOBBidderResult.setError(pOBError);
        }
        POBBidderListener<T> pOBBidderListener = this.bidderListener;
        if (pOBBidderListener != 0) {
            pOBBidderListener.onBidsFailed(this, pOBError);
        }
    }

    private boolean b() {
        String str;
        if (this.d != null) {
            POBDeviceInfo pOBDeviceInfo = this.e;
            if (pOBDeviceInfo != null) {
                str = pOBDeviceInfo.getISOAlpha2CountryCode();
                POBLog.debug("POBManager", POBCommonConstants.MSG_COUNTRY_CODE, str);
            } else {
                str = null;
            }
            if (!POBUtils.isNullOrEmpty(str)) {
                String countryFilteringMode = this.d.getCountryFilteringMode();
                Set<String> filteringCountries = this.d.getFilteringCountries();
                if (filteringCountries != null && filteringCountries.size() > 0) {
                    if (POBProfileInfo.COUNTRY_FILTERING_ALLOW_MODE.equals(countryFilteringMode)) {
                        return filteringCountries.contains(str);
                    }
                    if (POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE.equals(countryFilteringMode)) {
                        return !filteringCountries.contains(str);
                    }
                }
            }
        }
        return true;
    }
}
