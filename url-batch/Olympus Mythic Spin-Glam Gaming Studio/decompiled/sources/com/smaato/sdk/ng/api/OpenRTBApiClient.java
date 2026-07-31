package com.smaato.sdk.ng.api;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.ironsource.B5;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.smaato.sdk.ng.BuildConfig;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.api.ApiClient;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdRequest;
import com.smaato.sdk.ng.models.AdResponse;
import com.smaato.sdk.ng.models.request.Imp;
import com.smaato.sdk.ng.models.request.OpenRTBAdRequest;
import com.smaato.sdk.ng.models.response.Bid;
import com.smaato.sdk.ng.models.response.OpenRTBResponse;
import com.smaato.sdk.ng.models.response.SeatBid;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.utils.AdRequestRegistry;
import com.smaato.sdk.ng.utils.MarkupUtils;
import com.smaato.sdk.ng.utils.OpenRTBApiUrlComposer;
import com.smaato.sdk.ng.utils.OpenRTBAssetsGroup;
import com.smaato.sdk.ng.utils.SignalDataProcessor;
import com.yandex.div.DivApi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class OpenRTBApiClient implements ApiClient {
    private final Context a;
    private String b = BuildConfig.BASE_RTB_URL;
    private String c;

    class a implements NGSDKHttpClient.Listener {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ long c;
        final /* synthetic */ OpenRTBAdRequest d;
        final /* synthetic */ ApiClient.AdRequestListener e;

        a(String str, String str2, long j, OpenRTBAdRequest openRTBAdRequest, ApiClient.AdRequestListener adRequestListener) {
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = openRTBAdRequest;
            this.e = adRequestListener;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            OpenRTBApiClient.this.a(this.a, th.getMessage(), this.b, this.c);
            ApiClient.AdRequestListener adRequestListener = this.e;
            if (adRequestListener != null) {
                adRequestListener.onFailure(th);
            }
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFinally(String str, int i) {
            super.onFinally(str, i);
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            OpenRTBApiClient.this.a(this.a, str, this.b, this.c);
            OpenRTBApiClient.this.processStream(str, this.d, null, null, this.e);
        }
    }

    class b implements SignalDataProcessor.Listener {
        final /* synthetic */ ApiClient.AdRequestListener a;

        b(ApiClient.AdRequestListener adRequestListener) {
            this.a = adRequestListener;
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onError(Throwable th) {
            this.a.onFailure(new Exception("no ads found"));
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onProcessed(Ad ad) {
            this.a.onSuccess(ad);
        }
    }

    class c implements NGSDKHttpClient.Listener {
        c() {
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
        }
    }

    class d implements NGSDKHttpClient.Listener {
        final /* synthetic */ ApiClient.AdRequestListener a;
        final /* synthetic */ AdRequest b;
        final /* synthetic */ OpenRTBResponse c;
        final /* synthetic */ Bid d;
        final /* synthetic */ Ad e;

        d(ApiClient.AdRequestListener adRequestListener, AdRequest adRequest, OpenRTBResponse openRTBResponse, Bid bid, Ad ad) {
            this.a = adRequestListener;
            this.b = adRequest;
            this.c = openRTBResponse;
            this.d = bid;
            this.e = ad;
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onFailure(Throwable th) {
            ApiClient.AdRequestListener adRequestListener = this.a;
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("No creative was returned on the bid"));
            }
        }

        @Override // com.smaato.sdk.ng.network.NGSDKHttpClient.Listener
        public void onSuccess(String str, Map<String, List<String>> map) {
            if (this.a != null) {
                if (TextUtils.isEmpty(str)) {
                    this.a.onFailure(new Exception("No creative was returned on the bid"));
                    return;
                }
                this.e.getAssetHtml(OpenRTBApiClient.this.a(str, this.b, this.c, this.d));
                this.a.onSuccess(this.e);
            }
        }
    }

    public OpenRTBApiClient(Context context) {
        this.a = context;
    }

    private String a(OpenRTBAdRequest openRTBAdRequest) {
        return OpenRTBApiUrlComposer.buildUrl(this.b, openRTBAdRequest);
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void getAd(String str, String str2, ApiClient.AdRequestListener adRequestListener) {
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public String getApiUrl() {
        return this.b;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public Context getContext() {
        return this.a;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public JSONObject getPlacementParams() {
        return null;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void processStream(AdResponse adResponse, Exception exc, ApiClient.AdRequestListener adRequestListener) {
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void processStream(String str, ApiClient.AdRequestListener adRequestListener) {
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void setApiUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b = str;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void setCustomUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c = str;
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void trackJS(String str, ApiClient.TrackJSListener trackJSListener) {
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void trackUrl(String str, String str2, String str3, ApiClient.TrackUrlListener trackUrlListener) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, String str3, long j) {
        AdRequestRegistry.getInstance().setLastAdRequest(str, str2, str3, System.currentTimeMillis() - j);
    }

    @Override // com.smaato.sdk.ng.api.ApiClient
    public void getAd(AdRequest adRequest, String str, ApiClient.AdRequestListener adRequestListener) {
        if (!(adRequest instanceof OpenRTBAdRequest)) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("Invalid ad request. Make sure you have initialized NextGen SDK properly."));
                return;
            }
            return;
        }
        OpenRTBAdRequest openRTBAdRequest = (OpenRTBAdRequest) adRequest;
        String a2 = !TextUtils.isEmpty(this.c) ? this.c : a(openRTBAdRequest);
        if (a2 == null) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("NGSDKApiClient - Error: invalid request URL"));
                return;
            }
            return;
        }
        try {
            String jSONObject = openRTBAdRequest.toJson().toString();
            if (!TextUtils.isEmpty(jSONObject)) {
                HashMap hashMap = new HashMap();
                hashMap.put(POBConstants.ORTB_VERSION_PARAM, DivApi.VERSION);
                hashMap.put("Content-Type", "application/json");
                hashMap.put("Accept-Charset", B5.O);
                NGSDKHttpClient.makeRequest(this.a, a2, null, jSONObject, new a(a2, jSONObject, System.currentTimeMillis(), openRTBAdRequest, adRequestListener));
            } else if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("Invalid post body for OpenRTB request"));
            }
        } catch (Exception unused) {
            if (adRequestListener != null) {
                adRequestListener.onFailure(new Exception("Error processing OpenRTB ad request"));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(OpenRTBResponse openRTBResponse, AdRequest adRequest, Bid bid, Integer num, Integer num2, ApiClient.AdRequestListener adRequestListener) {
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
            if (MarkupUtils.isVastXml(bid.getAdMarkup())) {
                adType = Ad.AdType.VIDEO;
            } else {
                adType = Ad.AdType.HTML;
            }
            imp = null;
        } else {
            if (bid.getExt() != null && !TextUtils.isEmpty(bid.getExt().getSignaldata())) {
                new SignalDataProcessor().processSignalData(bid.getExt().getSignaldata(), new b(adRequestListener));
                adType = null;
                imp = null;
                z = true;
                if (z) {
                    if (adType == null) {
                        adRequestListener.onFailure(new NextGenError(NextGenErrorCode.NO_FILL));
                        return;
                    }
                    if (adRequest != null) {
                        z2 = adRequest.isInterstitial.booleanValue();
                    } else if (num == null || num2 == null || num.intValue() != 320 || num2.intValue() != 480) {
                        z2 = false;
                    }
                    Integer num3 = OpenRTBAssetsGroup.get(imp, num, num2, adType, z2);
                    if (num3 == null) {
                        adRequestListener.onFailure(new NextGenError(NextGenErrorCode.INVALID_ASSET));
                        return;
                    }
                    Ad ad = new Ad(num3.intValue(), bid.getAdMarkup(), adType);
                    ad.setZoneId(adRequest != null ? adRequest.zoneId : StatisticData.ERROR_CODE_NOT_FOUND);
                    String a2 = a(bid.getNoticeUrl(), adRequest, openRTBResponse, bid);
                    if (!TextUtils.isEmpty(bid.getAdMarkup())) {
                        adRequestListener.onSuccess(ad);
                        if (TextUtils.isEmpty(a2)) {
                            return;
                        }
                        NGSDKHttpClient.makeRequest(this.a, a2, null, null, new c());
                        return;
                    }
                    if (!TextUtils.isEmpty(a2)) {
                        NGSDKHttpClient.makeRequest(this.a, a2, null, null, new d(adRequestListener, adRequest, openRTBResponse, bid, ad));
                        return;
                    } else {
                        adRequestListener.onFailure(new Exception("No creative was returned on the bid"));
                        return;
                    }
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

    @Override // com.smaato.sdk.ng.api.ApiClient
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
                a(openRTBResponse, adRequest, seatBid.getBids().get(0), num, num2, adRequestListener);
                return;
            } else {
                adRequestListener.onFailure(new Exception("NextGen - No fill"));
                return;
            }
        }
        adRequestListener.onFailure(new Exception("NextGen - No fill"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str, AdRequest adRequest, OpenRTBResponse openRTBResponse, Bid bid) {
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
}
