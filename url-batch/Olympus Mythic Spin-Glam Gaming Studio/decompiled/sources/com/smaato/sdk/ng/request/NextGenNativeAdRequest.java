package com.smaato.sdk.ng.request;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.smaato.sdk.ng.NextGen;
import com.smaato.sdk.ng.NextGenError;
import com.smaato.sdk.ng.NextGenErrorCode;
import com.smaato.sdk.ng.api.RequestManager;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.models.NativeAd;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.utils.NGSDKBitmapDownloader;
import com.smaato.sdk.ng.utils.SignalDataProcessor;

/* loaded from: classes8.dex */
public class NextGenNativeAdRequest implements RequestManager.RequestListener {
    private static final String i = "NextGenNativeAdRequest";
    private String a;
    private String b;
    private String c;
    private RequestListener d;
    private final RequestManager e;
    private SignalDataProcessor f;
    private NGSDKBitmapDownloader g;
    private boolean h;

    public interface RequestListener {
        void onRequestFail(Throwable th);

        void onRequestSuccess(NativeAd nativeAd);
    }

    class a implements SignalDataProcessor.Listener {
        a() {
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onError(Throwable th) {
            RequestListener requestListener = NextGenNativeAdRequest.this.d;
            if (requestListener != null) {
                requestListener.onRequestFail(th);
            }
        }

        @Override // com.smaato.sdk.ng.utils.SignalDataProcessor.Listener
        public void onProcessed(Ad ad) {
            if (ad != null) {
                NextGenNativeAdRequest.this.a(ad);
                return;
            }
            RequestListener requestListener = NextGenNativeAdRequest.this.d;
            if (requestListener != null) {
                requestListener.onRequestFail(new NextGenError(NextGenErrorCode.NULL_AD));
            }
        }
    }

    class b implements NGSDKBitmapDownloader.DownloadListener {
        final /* synthetic */ NativeAd a;

        b(NativeAd nativeAd) {
            this.a = nativeAd;
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFailed(String str, Exception exc) {
            if (exc != null) {
                NextGen.reportException(exc);
            }
            NextGenNativeAdRequest.this.b(this.a);
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFinish(String str, Bitmap bitmap) {
            if (bitmap != null) {
                this.a.setBannerBitmap(bitmap);
            }
            NextGenNativeAdRequest.this.b(this.a);
        }
    }

    class c implements NGSDKBitmapDownloader.DownloadListener {
        final /* synthetic */ NativeAd a;

        c(NativeAd nativeAd) {
            this.a = nativeAd;
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFailed(String str, Exception exc) {
            if (exc != null) {
                NextGen.reportException(exc);
            }
            RequestListener requestListener = NextGenNativeAdRequest.this.d;
            if (requestListener != null) {
                requestListener.onRequestSuccess(this.a);
            }
        }

        @Override // com.smaato.sdk.ng.utils.NGSDKBitmapDownloader.DownloadListener
        public void onDownloadFinish(String str, Bitmap bitmap) {
            if (bitmap != null) {
                this.a.setIconBitmap(bitmap);
            }
            RequestListener requestListener = NextGenNativeAdRequest.this.d;
            if (requestListener != null) {
                requestListener.onRequestSuccess(this.a);
            }
        }
    }

    public NextGenNativeAdRequest() {
        NativeRequestManager nativeRequestManager = new NativeRequestManager();
        this.e = nativeRequestManager;
        nativeRequestManager.setIntegrationType(IntegrationType.STANDALONE);
        nativeRequestManager.setRequestListener(this);
        this.g = new NGSDKBitmapDownloader();
        this.h = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Ad ad) {
        NativeAd nativeAd = new NativeAd(ad);
        RequestManager requestManager = this.e;
        if (requestManager != null) {
            requestManager.sendAdSessionDataToAtom(ad, Double.valueOf(1.0d));
        }
        if (this.h) {
            a(nativeAd);
            return;
        }
        RequestListener requestListener = this.d;
        if (requestListener != null) {
            requestListener.onRequestSuccess(nativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(NativeAd nativeAd) {
        if (!TextUtils.isEmpty(nativeAd.getIconUrl())) {
            this.g.download(nativeAd.getIconUrl(), new c(nativeAd));
            return;
        }
        RequestListener requestListener = this.d;
        if (requestListener != null) {
            requestListener.onRequestSuccess(nativeAd);
        }
    }

    public void load(String str, RequestListener requestListener) {
        load(null, str, requestListener);
    }

    @Override // com.smaato.sdk.ng.api.RequestManager.RequestListener
    public void onRequestFail(Throwable th) {
        if (th instanceof NextGenError) {
            if (((NextGenError) th).getErrorCode() == NextGenErrorCode.NO_FILL) {
                Logger.w(i, th.getMessage());
            } else {
                Logger.e(i, th.getMessage());
            }
        }
        RequestListener requestListener = this.d;
        if (requestListener != null) {
            requestListener.onRequestFail(th);
        }
    }

    @Override // com.smaato.sdk.ng.api.RequestManager.RequestListener
    public void onRequestSuccess(Ad ad) {
        a(ad);
    }

    public void prepareAd(String str, RequestListener requestListener) {
        if (TextUtils.isEmpty(str)) {
            if (requestListener != null) {
                requestListener.onRequestFail(new NextGenError(NextGenErrorCode.INVALID_SIGNAL_DATA));
            }
        } else {
            this.d = requestListener;
            SignalDataProcessor signalDataProcessor = new SignalDataProcessor();
            this.f = signalDataProcessor;
            signalDataProcessor.processSignalData(str, new a());
        }
    }

    public void setMediation(boolean z) {
        RequestManager requestManager = this.e;
        if (requestManager != null) {
            requestManager.setIntegrationType(z ? IntegrationType.MEDIATION : IntegrationType.STANDALONE);
        }
    }

    public void setMediationVendor(String str) {
        RequestManager requestManager = this.e;
        if (requestManager != null) {
            requestManager.setMediationVendor(str);
        }
    }

    public void setPreLoadMediaAssets(boolean z) {
        this.h = z;
    }

    public void setScreenIabCategory(String str) {
        this.a = str;
    }

    public void setScreenKeywords(String str) {
        this.b = str;
    }

    public void setUserIntent(String str) {
        this.c = str;
    }

    public void load(String str, String str2, RequestListener requestListener) {
        this.d = requestListener;
        if (!TextUtils.isEmpty(str)) {
            this.e.setAppToken(str);
        }
        this.e.setZoneId(str2);
        this.e.requestAd();
    }

    private void a(NativeAd nativeAd) {
        if (TextUtils.isEmpty(nativeAd.getBannerUrl())) {
            b(nativeAd);
        } else {
            this.g.download(nativeAd.getBannerUrl(), new b(nativeAd));
        }
    }

    public void prepareAd(Ad ad, RequestListener requestListener) {
        if (ad != null) {
            this.d = requestListener;
            a(ad);
        } else if (requestListener != null) {
            requestListener.onRequestFail(new NextGenError(NextGenErrorCode.NULL_AD));
        }
    }
}
