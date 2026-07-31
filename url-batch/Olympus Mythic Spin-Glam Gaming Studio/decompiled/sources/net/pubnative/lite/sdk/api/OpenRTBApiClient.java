package net.pubnative.lite.sdk.api;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.B5;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.yandex.div.DivApi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.BuildConfig;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.api.ApiClient;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.request.Imp;
import net.pubnative.lite.sdk.models.request.OpenRTBAdRequest;
import net.pubnative.lite.sdk.models.response.Bid;
import net.pubnative.lite.sdk.models.response.OpenRTBResponse;
import net.pubnative.lite.sdk.models.response.SeatBid;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.AdRequestRegistry;
import net.pubnative.lite.sdk.utils.MarkupUtils;
import net.pubnative.lite.sdk.utils.OpenRTBApiUrlComposer;
import net.pubnative.lite.sdk.utils.OpenRTBAssetsGroup;
import net.pubnative.lite.sdk.utils.SignalDataProcessor;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class OpenRTBApiClient implements ApiClient {
    private String mApiUrl = BuildConfig.BASE_RTB_URL;
    private final Context mContext;
    private String mCustomUrl;
    private JSONObject mPlacementParams;

    public OpenRTBApiClient(Context context) {
        this.mContext = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void buildAd(final OpenRTBResponse openRTBResponse, final AdRequest adRequest, final Bid bid, Integer num, Integer num2, final ApiClient.AdRequestListener adRequestListener) {
        Ad.AdType adType;
        Imp imp;
        boolean z;
        OpenRTBAdRequest openRTBAdRequest = adRequest != null ? (OpenRTBAdRequest) adRequest : null;
        boolean z2 = true;
        if (openRTBAdRequest != null && openRTBAdRequest.getImp() != null && !openRTBAdRequest.getImp().isEmpty()) {
            Iterator<Imp> it = openRTBAdRequest.getImp().iterator();
            adType = null;
            imp = null;
            boolean z3 = false;
            while (it.hasNext() && !z3) {
                imp = it.next();
                if (!TextUtils.isEmpty(imp.getId()) && !TextUtils.isEmpty(bid.getImpressionid()) && imp.getId().equals(bid.getImpressionid())) {
                    if (imp.getBanner() != null) {
                        adType = Ad.AdType.HTML;
                    } else if (imp.getVideo() != null) {
                        adType = Ad.AdType.VIDEO;
                    }
                    z3 = true;
                }
            }
        } else if (!TextUtils.isEmpty(bid.getAdMarkup())) {
            adType = MarkupUtils.isVastXml(bid.getAdMarkup()) ? Ad.AdType.VIDEO : Ad.AdType.HTML;
            imp = null;
        } else {
            if (bid.getExt() != null && !TextUtils.isEmpty(bid.getExt().getSignaldata())) {
                new SignalDataProcessor().processSignalData(bid.getExt().getSignaldata(), new SignalDataProcessor.Listener() { // from class: net.pubnative.lite.sdk.api.OpenRTBApiClient.2
                    @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                    public void onError(Throwable th) {
                        adRequestListener.onFailure(new Exception("no ads found"));
                    }

                    @Override // net.pubnative.lite.sdk.utils.SignalDataProcessor.Listener
                    public void onProcessed(Ad ad) {
                        adRequestListener.onSuccess(ad);
                    }
                });
                adType = null;
                imp = null;
                z = true;
                if (z) {
                    if (adType == null) {
                        adRequestListener.onFailure(new HyBidError(HyBidErrorCode.NO_FILL));
                        return;
                    }
                    if (adRequest != null) {
                        z2 = adRequest.isInterstitial.booleanValue();
                    } else if (num == null || num2 == null || num.intValue() != 320 || num2.intValue() != 480) {
                        z2 = false;
                    }
                    Integer num3 = OpenRTBAssetsGroup.get(imp, num, num2, adType, z2);
                    if (num3 == null) {
                        adRequestListener.onFailure(new HyBidError(HyBidErrorCode.INVALID_ASSET));
                        return;
                    }
                    final Ad ad = new Ad(num3.intValue(), bid.getAdMarkup(), adType);
                    ad.setZoneId(adRequest != null ? adRequest.zoneId : StatisticData.ERROR_CODE_NOT_FOUND);
                    String replaceMacros = replaceMacros(bid.getNoticeUrl(), adRequest, openRTBResponse, bid);
                    if (TextUtils.isEmpty(bid.getAdMarkup())) {
                        if (TextUtils.isEmpty(replaceMacros)) {
                            adRequestListener.onFailure(new Exception("No creative was returned on the bid"));
                            return;
                        } else {
                            PNHttpClient.makeRequest(this.mContext, replaceMacros, null, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.OpenRTBApiClient.4
                                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                                public void onFailure(Throwable th) {
                                    ApiClient.AdRequestListener adRequestListener2 = adRequestListener;
                                    if (adRequestListener2 != null) {
                                        adRequestListener2.onFailure(new Exception("No creative was returned on the bid"));
                                    }
                                }

                                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                                public void onSuccess(String str, Map<String, List<String>> map) {
                                    if (adRequestListener != null) {
                                        if (TextUtils.isEmpty(str)) {
                                            adRequestListener.onFailure(new Exception("No creative was returned on the bid"));
                                            return;
                                        }
                                        ad.getAssetHtml(OpenRTBApiClient.this.replaceMacros(str, adRequest, openRTBResponse, bid));
                                        adRequestListener.onSuccess(ad);
                                    }
                                }
                            });
                            return;
                        }
                    }
                    adRequestListener.onSuccess(ad);
                    if (TextUtils.isEmpty(replaceMacros)) {
                        return;
                    }
                    PNHttpClient.makeRequest(this.mContext, replaceMacros, null, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.OpenRTBApiClient.3
                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public void onFailure(Throwable th) {
                        }

                        @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                        public void onSuccess(String str, Map<String, List<String>> map) {
                        }
                    });
                    return;
                }
                return;
            }
            adType = null;
            imp = null;
        }
        z = false;
        if (z) {
        }
    }

    private String getAdRequestURL(OpenRTBAdRequest openRTBAdRequest) {
        return OpenRTBApiUrlComposer.buildUrl(this.mApiUrl, openRTBAdRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerAdRequest(String str, String str2, String str3, long j) {
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, str3, System.currentTimeMillis() - j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String replaceMacros(String str, AdRequest adRequest, OpenRTBResponse openRTBResponse, Bid bid) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String replace = str.replace("${AUCTION_PRICE}", String.valueOf(bid.getPrice()));
        if (adRequest != null) {
            OpenRTBAdRequest openRTBAdRequest = (OpenRTBAdRequest) adRequest;
            if (!TextUtils.isEmpty(openRTBAdRequest.getId())) {
                replace = replace.replace("${AUCTION_ID}", openRTBAdRequest.getId());
            }
            if (openRTBAdRequest.getImp() != null && !openRTBAdRequest.getImp().isEmpty() && !TextUtils.isEmpty(openRTBAdRequest.getImp().get(0).getId())) {
                replace = replace.replace("${AUCTION_IMP_ID}", openRTBAdRequest.getImp().get(0).getId());
            }
        }
        if (openRTBResponse.getSeatBids() != null && !openRTBResponse.getSeatBids().isEmpty() && !TextUtils.isEmpty(openRTBResponse.getSeatBids().get(0).getSeat())) {
            replace = replace.replace("${AUCTION_SEAT_ID}", openRTBResponse.getSeatBids().get(0).getSeat());
        }
        return !TextUtils.isEmpty(bid.getAdId()) ? replace.replace("${AUCTION_AD_ID}", bid.getAdId()) : replace;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(String str, String str2, ApiClient.AdRequestListener adRequestListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public String getApiUrl() {
        return this.mApiUrl;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public Context getContext() {
        return this.mContext;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public JSONObject getPlacementParams() {
        return null;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, ApiClient.AdRequestListener adRequestListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(AdResponse adResponse, Exception exc, ApiClient.AdRequestListener adRequestListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void setApiUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mApiUrl = str;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void setCustomUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mCustomUrl = str;
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void trackJS(String str, ApiClient.TrackJSListener trackJSListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void trackUrl(String str, String str2, String str3, ApiClient.TrackUrlListener trackUrlListener) {
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void getAd(AdRequest adRequest, String str, final ApiClient.AdRequestListener adRequestListener) {
        if (!(adRequest instanceof OpenRTBAdRequest)) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("Invalid ad request. Make sure you have initialized HyBid SDK properly."));
                return;
            }
            return;
        }
        final OpenRTBAdRequest openRTBAdRequest = (OpenRTBAdRequest) adRequest;
        String adRequestURL = !TextUtils.isEmpty(this.mCustomUrl) ? this.mCustomUrl : getAdRequestURL(openRTBAdRequest);
        if (adRequestURL == null) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("PNApiClient - Error: invalid request URL"));
                return;
            }
            return;
        }
        try {
            final String jSONObject = openRTBAdRequest.toJson().toString();
            if (!TextUtils.isEmpty(jSONObject)) {
                HashMap hashMap = new HashMap();
                hashMap.put(POBConstants.ORTB_VERSION_PARAM, DivApi.VERSION);
                hashMap.put("Content-Type", "application/json");
                hashMap.put("Accept-Charset", B5.O);
                final long currentTimeMillis = System.currentTimeMillis();
                final String str2 = adRequestURL;
                PNHttpClient.makeRequest(this.mContext, adRequestURL, null, jSONObject, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.OpenRTBApiClient.1
                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onFailure(Throwable th) {
                        OpenRTBApiClient.this.registerAdRequest(str2, th.getMessage(), jSONObject, currentTimeMillis);
                        ApiClient.AdRequestListener adRequestListener2 = adRequestListener;
                        if (adRequestListener2 != null) {
                            adRequestListener2.onFailure(th);
                        }
                    }

                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onFinally(String str3, int i) {
                        super.onFinally(str3, i);
                    }

                    @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                    public void onSuccess(String str3, Map<String, List<String>> map) {
                        OpenRTBApiClient.this.registerAdRequest(str2, str3, jSONObject, currentTimeMillis);
                        OpenRTBApiClient.this.processStream(str3, openRTBAdRequest, null, null, adRequestListener);
                    }
                });
            } else if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("Invalid post body for OpenRTB request"));
            }
        } catch (Exception unused) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("Error processing OpenRTB ad request"));
            }
        }
    }

    @Override // net.pubnative.lite.sdk.api.ApiClient
    public void processStream(String str, AdRequest adRequest, Integer num, Integer num2, ApiClient.AdRequestListener adRequestListener) {
        OpenRTBResponse openRTBResponse;
        Exception exc = null;
        try {
            openRTBResponse = new OpenRTBResponse(new JSONObject(str));
        } catch (Error e) {
            openRTBResponse = null;
            exc = new Exception("Response cannot be parsed", e);
        } catch (Exception e2) {
            openRTBResponse = null;
            exc = e2;
        }
        if (exc != null) {
            adRequestListener.onFailure(exc);
            return;
        }
        if (openRTBResponse == null) {
            adRequestListener.onFailure(new Exception("OpenRTBApiClient - Parse error"));
            return;
        }
        if (openRTBResponse.getSeatBids() != null && !openRTBResponse.getSeatBids().isEmpty()) {
            SeatBid seatBid = openRTBResponse.getSeatBids().get(0);
            if (seatBid.getBids() != null && !seatBid.getBids().isEmpty() && seatBid.getBids().get(0) != null) {
                buildAd(openRTBResponse, adRequest, seatBid.getBids().get(0), num, num2, adRequestListener);
                return;
            } else {
                adRequestListener.onFailure(new Exception("HyBid - No fill"));
                return;
            }
        }
        adRequestListener.onFailure(new Exception("HyBid - No fill"));
    }
}
