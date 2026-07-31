package net.pubnative.lite.sdk.utils;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import java.util.List;
import net.pubnative.lite.sdk.AdCache;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.HyBidError;
import net.pubnative.lite.sdk.HyBidErrorCode;
import net.pubnative.lite.sdk.api.ApiClient;
import net.pubnative.lite.sdk.api.PNApiClient;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.EndCardData;
import net.pubnative.lite.sdk.models.SignalData;
import net.pubnative.lite.sdk.vpaid.VideoAdCache;
import net.pubnative.lite.sdk.vpaid.VideoAdCacheItem;
import net.pubnative.lite.sdk.vpaid.VideoAdProcessor;
import net.pubnative.lite.sdk.vpaid.response.AdParams;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class SignalDataProcessor {
    private static final String TAG = "SignalDataProcessor";
    private final AdCache mAdCache;
    private final PNApiClient mApiClient;
    private final DeviceInfo mDeviceInfo;
    private boolean mIsDestroyed;
    private Listener mListener;
    private final VideoAdCache mVideoCache;

    public interface Listener {
        void onError(Throwable th);

        void onProcessed(Ad ad);
    }

    public SignalDataProcessor() {
        this(HyBid.getApiClient(), HyBid.getDeviceInfo(), HyBid.getAdCache(), HyBid.getVideoAdCache());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processAd(String str, final Ad ad) {
        ad.setZoneId(str);
        final String sessionId = ad.getSessionId();
        this.mAdCache.put(sessionId, ad);
        AdTopicsAPIManager.setTopicsAPIEnabled(this.mApiClient.getContext(), ad);
        int i = ad.assetgroupid;
        if (i == 4 || i == 15) {
            new VideoAdProcessor().process(this.mApiClient.getContext(), ad.getVast(), null, new VideoAdProcessor.Listener() { // from class: net.pubnative.lite.sdk.utils.SignalDataProcessor.3
                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheError(Throwable th) {
                    if (SignalDataProcessor.this.mIsDestroyed) {
                        return;
                    }
                    Logger.w(SignalDataProcessor.TAG, th.getMessage());
                    if (SignalDataProcessor.this.mListener != null) {
                        SignalDataProcessor.this.mListener.onError(th);
                    }
                }

                @Override // net.pubnative.lite.sdk.vpaid.VideoAdProcessor.Listener
                public void onCacheSuccess(AdParams adParams, String str2, EndCardData endCardData, String str3, List<String> list) {
                    if (SignalDataProcessor.this.mIsDestroyed) {
                        return;
                    }
                    ad.setHasEndCard((adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true);
                    SignalDataProcessor.this.mVideoCache.put(sessionId, new VideoAdCacheItem(adParams, str2, endCardData, str3));
                    if (SignalDataProcessor.this.mListener != null) {
                        SignalDataProcessor.this.mListener.onProcessed(ad);
                    }
                }
            });
            return;
        }
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onProcessed(ad);
        }
    }

    public void destroy() {
        this.mIsDestroyed = true;
        this.mListener = null;
    }

    public void processSignalData(String str, Listener listener) {
        Listener listener2;
        this.mListener = listener;
        try {
            final SignalData signalData = new SignalData(new JSONObject(str));
            if (TextUtils.isEmpty(signalData.tagid)) {
                Listener listener3 = this.mListener;
                if (listener3 != null) {
                    listener3.onError(new HyBidError(HyBidErrorCode.INVALID_ZONE_ID));
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(signalData.admurl)) {
                if (this.mApiClient != null) {
                    DeviceInfo deviceInfo = this.mDeviceInfo;
                    this.mApiClient.getAd(signalData.admurl, deviceInfo != null ? deviceInfo.getUserAgent() : "", new ApiClient.AdRequestListener() { // from class: net.pubnative.lite.sdk.utils.SignalDataProcessor.1
                        @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                        public void onFailure(Throwable th) {
                            if (SignalDataProcessor.this.mIsDestroyed) {
                                return;
                            }
                            Logger.w(SignalDataProcessor.TAG, th.getMessage());
                            if (SignalDataProcessor.this.mListener != null) {
                                SignalDataProcessor.this.mListener.onError(new Exception(th));
                            }
                        }

                        @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                        public void onSuccess(Ad ad) {
                            if (SignalDataProcessor.this.mIsDestroyed) {
                                return;
                            }
                            Logger.d(SignalDataProcessor.TAG, "Received ad response for zone id: " + signalData.tagid);
                            SignalDataProcessor.this.processAd(signalData.tagid, ad);
                        }
                    });
                    return;
                } else {
                    Listener listener4 = this.mListener;
                    if (listener4 != null) {
                        listener4.onError(new HyBidError(HyBidErrorCode.INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
            }
            AdResponse adResponse = signalData.adm;
            if (adResponse == null) {
                Listener listener5 = this.mListener;
                if (listener5 != null) {
                    listener5.onError(new HyBidError(HyBidErrorCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            PNApiClient pNApiClient = this.mApiClient;
            if (pNApiClient != null) {
                pNApiClient.processStream(adResponse, null, new ApiClient.AdRequestListener() { // from class: net.pubnative.lite.sdk.utils.SignalDataProcessor.2
                    @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                    public void onFailure(Throwable th) {
                        if (SignalDataProcessor.this.mIsDestroyed) {
                            return;
                        }
                        Logger.w(SignalDataProcessor.TAG, th.getMessage());
                        if (SignalDataProcessor.this.mListener != null) {
                            SignalDataProcessor.this.mListener.onError(new Exception(th));
                        }
                    }

                    @Override // net.pubnative.lite.sdk.api.ApiClient.AdRequestListener
                    public void onSuccess(Ad ad) {
                        if (SignalDataProcessor.this.mIsDestroyed) {
                            return;
                        }
                        Logger.d(SignalDataProcessor.TAG, "Received ad response for zone id: " + signalData.tagid);
                        SignalDataProcessor.this.processAd(signalData.tagid, ad);
                    }
                });
                return;
            }
            Listener listener6 = this.mListener;
            if (listener6 != null) {
                listener6.onError(new HyBidError(HyBidErrorCode.INTERNAL_ERROR));
            }
        } catch (RuntimeException e) {
            HyBid.reportException((Exception) e);
            Logger.e(TAG, e.getMessage());
            if (!(e instanceof AndroidRuntimeException) || (listener2 = this.mListener) == null) {
                return;
            }
            listener2.onError(new HyBidError(HyBidErrorCode.INVALID_VIEW_BINDER));
        } catch (Exception e2) {
            HyBid.reportException(e2);
            Logger.e(TAG, e2.getMessage());
            Listener listener7 = this.mListener;
            if (listener7 != null) {
                listener7.onError(new HyBidError(HyBidErrorCode.INVALID_SIGNAL_DATA));
            }
        } catch (OutOfMemoryError e3) {
            HyBid.reportException(e3);
            Logger.e(TAG, e3.getMessage());
            Listener listener8 = this.mListener;
            if (listener8 != null) {
                listener8.onError(new HyBidError(HyBidErrorCode.OUT_OF_MEMORY));
            }
        }
    }

    SignalDataProcessor(PNApiClient pNApiClient, DeviceInfo deviceInfo, AdCache adCache, VideoAdCache videoAdCache) {
        this.mApiClient = pNApiClient;
        this.mDeviceInfo = deviceInfo;
        this.mAdCache = adCache;
        this.mVideoCache = videoAdCache;
    }
}
