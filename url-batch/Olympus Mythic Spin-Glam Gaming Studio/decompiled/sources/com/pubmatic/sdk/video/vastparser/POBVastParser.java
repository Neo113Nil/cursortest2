package com.pubmatic.sdk.video.vastparser;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.POBVideoLogConstants;
import com.pubmatic.sdk.video.vastmodels.POBVast;
import com.pubmatic.sdk.video.vastmodels.POBVastAd;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLParser;
import java.util.List;

/* loaded from: classes13.dex */
public class POBVastParser {
    private final POBVastParserListener a;
    private final int b;
    private final POBNetworkHandler d;
    private int e = 5000;
    private final Handler c = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBVastParser pOBVastParser = POBVastParser.this;
            pOBVastParser.a(this.a, pOBVastParser.b, (POBVastAd) null);
        }
    }

    class b implements POBNetworkHandler.POBNetworkListener {
        final /* synthetic */ POBVast a;
        final /* synthetic */ int b;

        b(POBVast pOBVast, int i) {
            this.a = pOBVast;
            this.b = i;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            if (str == null || this.a.getAds() == null) {
                POBLog.debug("POBVastParser", "Network response is null", new Object[0]);
                POBVastParser.this.a(this.a, POBVastError.NO_VAST_RESPONSE, POBVideoLogConstants.MSG_NO_VAST_RESPONSE);
            } else if (POBVastParser.this.a(str, this.b - 1, this.a.getAds().get(0)) == null) {
                POBVastParser.this.a(this.a, 100, POBVideoLogConstants.MSG_XML_PARSING_ERROR);
            }
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onFailure(POBError pOBError) {
            POBVastParser pOBVastParser = POBVastParser.this;
            pOBVastParser.a(this.a, pOBVastParser.a(pOBError), pOBError.getErrorMessage());
        }
    }

    class c implements Runnable {
        final /* synthetic */ POBVast a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        c(POBVast pOBVast, int i, String str) {
            this.a = pOBVast;
            this.b = i;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastParser.this.a != null) {
                POBVastParser.this.a.onFailure(this.a, new POBVastError(this.b, this.c));
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ POBVast a;

        d(POBVast pOBVast) {
            this.a = pOBVast;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVastParser.this.a != null) {
                POBVastParser.this.a.onSuccess(this.a);
            }
        }
    }

    public POBVastParser(@NonNull POBNetworkHandler pOBNetworkHandler, int i, @Nullable POBVastParserListener pOBVastParserListener) {
        this.d = pOBNetworkHandler;
        this.a = pOBVastParserListener;
        this.b = i;
    }

    public void parse(@NonNull String str) {
        POBTaskHandler.getInstance().runOnBackgroundThread(new a(str));
    }

    public void setWrapperTimeout(int i) {
        this.e = i;
    }

    private boolean b(POBVast pOBVast) {
        return (pOBVast == null || pOBVast.getAds() == null || pOBVast.getAds().isEmpty() || pOBVast.getAds().get(0).getAdType() != POBVastAd.POBVastAdType.INLINE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBVast a(String str, int i, POBVastAd pOBVastAd) {
        POBVast pOBVast = (POBVast) POBXMLParser.parse(str, POBVast.class);
        if (pOBVast != null) {
            if (pOBVast.getAds() != null && !pOBVast.getAds().isEmpty()) {
                pOBVast.getAds().get(0).setWrapper(pOBVastAd);
            }
            if (pOBVast.getVersion() != null && !a(pOBVast.getVersion())) {
                a(pOBVast, 102, POBVideoLogConstants.MSG_UNSUPPORTED_VAST_VERSION);
                return pOBVast;
            }
            if (b(pOBVast)) {
                a(pOBVast);
                return pOBVast;
            }
            if (i == 0) {
                a(pOBVast, 302, POBVideoLogConstants.MSG_WRAPPER_THRESHOLD);
                return pOBVast;
            }
            List<POBVastAd> ads = pOBVast.getAds();
            if (ads != null && !ads.isEmpty() && ads.get(0).getAdType() != POBVastAd.POBVastAdType.NO_ADS) {
                String vASTAdTagURI = ads.get(0).getVASTAdTagURI();
                if (vASTAdTagURI != null && !vASTAdTagURI.isEmpty()) {
                    POBHttpRequest pOBHttpRequest = new POBHttpRequest();
                    pOBHttpRequest.setUrl(vASTAdTagURI);
                    pOBHttpRequest.setRequestTag("POBVastParser");
                    pOBHttpRequest.setTimeout(this.e);
                    this.d.sendRequest(pOBHttpRequest, new b(pOBVast, i));
                    return pOBVast;
                }
                a(pOBVast, 101, POBVideoLogConstants.MSG_SCHEMA_VALIDATION_ERROR);
                return pOBVast;
            }
            a(pOBVast, POBVastError.NO_VAST_RESPONSE, POBVideoLogConstants.MSG_NO_VAST_RESPONSE);
            return pOBVast;
        }
        if (i == this.b) {
            a((POBVast) null, 100, POBVideoLogConstants.MSG_XML_PARSING_ERROR);
        }
        return pOBVast;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(POBVast pOBVast, int i, String str) {
        this.c.post(new c(pOBVast, i, str));
    }

    private void a(POBVast pOBVast) {
        this.c.post(new d(pOBVast));
    }

    private boolean a(String str) {
        if (str != null) {
            try {
                if (Integer.parseInt(str.split("\\.")[0]) >= 2) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(POBError pOBError) {
        return (pOBError == null || pOBError.getErrorCode() != 1005) ? 300 : 301;
    }
}
