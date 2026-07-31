package com.smaato.sdk.ng.utils;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.smaato.sdk.ng.AdCache;
import com.smaato.sdk.ng.DeviceInfo;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.api.ApiClient;
import com.smaato.sdk.ng.api.NGSDKApiClient;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.AdResponse;
import com.smaato.sdk.ng.models.EndCardData;
import com.smaato.sdk.ng.models.SignalData;
import com.smaato.sdk.ng.vpaid.VideoAdCache;
import com.smaato.sdk.ng.vpaid.VideoAdCacheItem;
import com.smaato.sdk.ng.vpaid.VideoAdProcessor;
import com.smaato.sdk.ng.vpaid.response.AdParams;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class SignalDataProcessor {
    private static final String g = "SignalDataProcessor";
    private final NGSDKApiClient a;
    private final DeviceInfo b;
    private final AdCache c;
    private final VideoAdCache d;
    private Listener e;
    private boolean f;

    public interface Listener {
        void onError(Throwable th);

        void onProcessed(Ad ad);
    }

    class a implements ApiClient.AdRequestListener {
        final /* synthetic */ SignalData a;

        a(SignalData signalData) {
            this.a = signalData;
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.AdRequestListener
        public void onFailure(Throwable th) {
            if (SignalDataProcessor.this.f) {
                return;
            }
            Logger.w(SignalDataProcessor.g, th.getMessage());
            Listener listener = SignalDataProcessor.this.e;
            if (listener != null) {
                listener.onError(new Exception(th));
            }
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.AdRequestListener
        public void onSuccess(Ad ad) {
            if (SignalDataProcessor.this.f) {
                return;
            }
            Logger.d(SignalDataProcessor.g, "Received ad response for zone id: " + this.a.tagid);
            SignalDataProcessor.this.a(this.a.tagid, ad);
        }
    }

    class b implements ApiClient.AdRequestListener {
        final /* synthetic */ SignalData a;

        b(SignalData signalData) {
            this.a = signalData;
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.AdRequestListener
        public void onFailure(Throwable th) {
            if (SignalDataProcessor.this.f) {
                return;
            }
            Logger.w(SignalDataProcessor.g, th.getMessage());
            Listener listener = SignalDataProcessor.this.e;
            if (listener != null) {
                listener.onError(new Exception(th));
            }
        }

        @Override // com.smaato.sdk.ng.api.ApiClient.AdRequestListener
        public void onSuccess(Ad ad) {
            if (SignalDataProcessor.this.f) {
                return;
            }
            Logger.d(SignalDataProcessor.g, "Received ad response for zone id: " + this.a.tagid);
            SignalDataProcessor.this.a(this.a.tagid, ad);
        }
    }

    class c implements VideoAdProcessor.Listener {
        final /* synthetic */ Ad a;
        final /* synthetic */ String b;

        c(Ad ad, String str) {
            this.a = ad;
            this.b = str;
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheError(Throwable th) {
            if (SignalDataProcessor.this.f) {
                return;
            }
            Logger.w(SignalDataProcessor.g, th.getMessage());
            Listener listener = SignalDataProcessor.this.e;
            if (listener != null) {
                listener.onError(th);
            }
        }

        @Override // com.smaato.sdk.ng.vpaid.VideoAdProcessor.Listener
        public void onCacheSuccess(AdParams adParams, String str, EndCardData endCardData, String str2, List<String> list) {
            if (SignalDataProcessor.this.f) {
                return;
            }
            this.a.setHasEndCard((adParams.getEndCardList() == null || adParams.getEndCardList().isEmpty()) ? false : true);
            SignalDataProcessor.this.d.put(this.b, new VideoAdCacheItem(adParams, str, endCardData, str2));
            Listener listener = SignalDataProcessor.this.e;
            if (listener != null) {
                listener.onProcessed(this.a);
            }
        }
    }

    public SignalDataProcessor() {
        this(NextGen.getApiClient(), NextGen.getDeviceInfo(), NextGen.getAdCache(), NextGen.getVideoAdCache());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Ad ad) {
        ad.setZoneId(str);
        String sessionId = ad.getSessionId();
        this.c.put(sessionId, ad);
        AdTopicsAPIManager.setTopicsAPIEnabled(this.a.getContext(), ad);
        int i = ad.assetgroupid;
        if (i == 4 || i == 15) {
            new VideoAdProcessor().process(this.a.getContext(), ad.getVast(), null, new c(ad, sessionId));
            return;
        }
        Listener listener = this.e;
        if (listener != null) {
            listener.onProcessed(ad);
        }
    }

    public void destroy() {
        this.f = true;
        this.e = null;
    }

    public void processSignalData(String str, Listener listener) {
        Listener listener2;
        this.e = listener;
        try {
            SignalData signalData = new SignalData(new JSONObject(str));
            if (TextUtils.isEmpty(signalData.tagid)) {
                Listener listener3 = this.e;
                if (listener3 != null) {
                    listener3.onError(new NextGenError(NextGenErrorCode.INVALID_ZONE_ID));
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(signalData.admurl)) {
                if (this.a != null) {
                    DeviceInfo deviceInfo = this.b;
                    this.a.getAd(signalData.admurl, deviceInfo != null ? deviceInfo.getUserAgent() : "", new a(signalData));
                    return;
                } else {
                    Listener listener4 = this.e;
                    if (listener4 != null) {
                        listener4.onError(new NextGenError(NextGenErrorCode.INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
            }
            AdResponse adResponse = signalData.adm;
            if (adResponse == null) {
                Listener listener5 = this.e;
                if (listener5 != null) {
                    listener5.onError(new NextGenError(NextGenErrorCode.INTERNAL_ERROR));
                    return;
                }
                return;
            }
            NGSDKApiClient nGSDKApiClient = this.a;
            if (nGSDKApiClient != null) {
                nGSDKApiClient.processStream(adResponse, null, new b(signalData));
                return;
            }
            Listener listener6 = this.e;
            if (listener6 != null) {
                listener6.onError(new NextGenError(NextGenErrorCode.INTERNAL_ERROR));
            }
        } catch (RuntimeException e) {
            NextGen.reportException((Exception) e);
            Logger.e(g, e.getMessage());
            if (!(e instanceof AndroidRuntimeException) || (listener2 = this.e) == null) {
                return;
            }
            listener2.onError(new NextGenError(NextGenErrorCode.INVALID_VIEW_BINDER));
        } catch (Exception e2) {
            NextGen.reportException(e2);
            Logger.e(g, e2.getMessage());
            Listener listener7 = this.e;
            if (listener7 != null) {
                listener7.onError(new NextGenError(NextGenErrorCode.INVALID_SIGNAL_DATA));
            }
        } catch (OutOfMemoryError e3) {
            NextGen.reportException(e3);
            Logger.e(g, e3.getMessage());
            Listener listener8 = this.e;
            if (listener8 != null) {
                listener8.onError(new NextGenError(NextGenErrorCode.OUT_OF_MEMORY));
            }
        }
    }

    SignalDataProcessor(NGSDKApiClient nGSDKApiClient, DeviceInfo deviceInfo, AdCache adCache, VideoAdCache videoAdCache) {
        this.a = nGSDKApiClient;
        this.b = deviceInfo;
        this.c = adCache;
        this.d = videoAdCache;
    }
}
