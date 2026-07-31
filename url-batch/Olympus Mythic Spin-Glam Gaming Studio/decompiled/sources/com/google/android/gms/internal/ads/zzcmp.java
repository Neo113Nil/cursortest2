package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.VisibleForTesting;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbil;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4643f8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.SafeDK;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkDiscovery;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.internal.partials.NetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@SuppressLint({"ViewConstructor"})
@VisibleForTesting
/* loaded from: classes3.dex */
final class zzcmp extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzclm {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcms zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbmi zzE;
    private zzbmf zzF;
    private zzbgt zzG;
    private int zzH;
    private int zzI;
    private zzbjs zzJ;
    private final zzbjs zzK;
    private zzbjs zzL;
    private final zzbjt zzM;
    private int zzN;
    private com.google.android.gms.ads.internal.overlay.zzm zzO;
    private boolean zzP;
    private final com.google.android.gms.ads.internal.util.zzci zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbif zzY;
    private boolean zzZ;
    private final zzcno zzb;
    private final zzbbd zzc;
    private final zzfma zzd;
    private final zzbkn zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzn zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfld zzk;
    private zzflg zzl;
    private boolean zzm;
    private boolean zzn;
    private zzclx zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzeml zzq;
    private zzemj zzr;
    private zzcnw zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    @VisibleForTesting
    protected zzcmp(zzcno zzcnoVar, zzcnw zzcnwVar, String str, boolean z, boolean z2, zzbbd zzbbdVar, zzbkn zzbknVar, VersionInfoParcel versionInfoParcel, zzbjv zzbjvVar, com.google.android.gms.ads.internal.zzn zznVar, com.google.android.gms.ads.internal.zza zzaVar, zzbif zzbifVar, zzfld zzfldVar, zzflg zzflgVar, zzfma zzfmaVar) {
        super(zzcnoVar);
        zzflg zzflgVar2;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcnoVar;
        this.zzs = zzcnwVar;
        this.zzt = str;
        this.zzw = z;
        this.zzc = zzbbdVar;
        this.zzd = zzfmaVar;
        this.zze = zzbknVar;
        this.zzf = versionInfoParcel;
        this.zzg = zznVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        com.google.android.gms.ads.internal.zzt.zzc();
        DisplayMetrics zzv = com.google.android.gms.ads.internal.util.zzs.zzv(windowManager);
        this.zzi = zzv;
        this.zzj = zzv.density;
        this.zzY = zzbifVar;
        this.zzk = zzfldVar;
        this.zzl = zzflgVar;
        this.zzQ = new com.google.android.gms.ads.internal.util.zzci(zzcnoVar.zzb(), this, this, null);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznm)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznl)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoY)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzc().zze(zzcnoVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzp(getContext(), settings);
        setDownloadListener(this);
        zzbc();
        AdMobNetworkBridge.webviewAddJavascriptInterface(this, new zzcmx(this, new zzcmw() { // from class: com.google.android.gms.internal.ads.zzcmv
            @Override // com.google.android.gms.internal.ads.zzcmw
            public final /* synthetic */ void zza(Uri uri) {
                zzclx zzaS = ((zzcmp) zzclm.this).zzaS();
                if (zzaS != null) {
                    zzaS.zzQ(uri);
                } else {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbjt zzbjtVar = new zzbjt(new zzbjv(true, "make_wv", this.zzt));
        this.zzM = zzbjtVar;
        zzbjtVar.zzc().zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue() && (zzflgVar2 = this.zzl) != null && zzflgVar2.zzb != null) {
            zzbjtVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbjtVar.zzc();
        zzbjs zzf = zzbjv.zzf();
        this.zzK = zzf;
        zzbjtVar.zza("native:view_create", zzf);
        this.zzL = null;
        this.zzJ = null;
        com.google.android.gms.ads.internal.util.zzce.zza().zzb(zzcnoVar);
        com.google.android.gms.ads.internal.zzt.zzh().zzk();
    }

    private void safedk_webview_zzcmp_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(String p1, String p2, String p3, String p4, String p5) {
        String str;
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcmp;->safedk_webview_zzcmp_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                Logger.d("SafeDKNetwork", "webviewLoadDataWithBaseURL: ", p1, ", WebView address : ", toString(), ", isOnUiThread = ", Boolean.valueOf(n.c()), ", SDK_PACKAGE_NAME = ", h.h);
                CreativeInfoManager.a(p1, p2, this, h.h);
                SafeDKWebAppInterface.a(h.h, (WebView) this, p2, true);
            }
            AdNetworkDiscovery j = CreativeInfoManager.j(h.h);
            str = j != null ? j.a(this, p1, p2) : p2;
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadDataWithBaseURL exception", th);
            str = p2;
        }
        super.loadDataWithBaseURL(p1, str, p3, p4, p5);
    }

    private void safedk_webview_zzcmp_webviewLoadData_172d49d32092f6f80826f3dca3960029(String p1, String p2, String p3) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcmp;->safedk_webview_zzcmp_webviewLoadData_172d49d32092f6f80826f3dca3960029(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        try {
            boolean z = SafeDK.getInstance() != null && SafeDK.getInstance().p();
            Logger.d("SafeDKNetwork", "webviewLoadData invoked, WebView address : ", this, ", isSafeDKInitialized = ", Boolean.valueOf(z), ", SDK_PACKAGE_NAME = ", h.h);
            if (z) {
                CreativeInfoManager.a((String) null, p1, this, h.h);
                SafeDKWebAppInterface.a(h.h, (WebView) this, p1, true);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadData exception", th);
        }
        super.loadData(p1, p2, p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: safedk_webview_zzcmp_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e, reason: merged with bridge method [inline-methods] */
    public void zzaV(String p1) {
        Logger.d("AdMobNetwork|SafeDK: Partial-Network> Lcom/google/android/gms/internal/ads/zzcmp;->safedk_webview_zzcmp_webviewLoadUrl_e3177bcd2c23ea94d3766e04b80fd51e(Ljava/lang/String;)V");
        try {
            Logger.d("SafeDKNetwork", "webviewLoadUrl2. url: ", p1, ", WebView address : ", toString(), ", SDK_PACKAGE_NAME = ", h.h);
            if (SafeDK.getInstance() != null && SafeDK.getInstance().p()) {
                if (!TextUtils.isEmpty(p1) && !p1.startsWith("javascript:")) {
                    NetworkBridge.logWebviewLoadURLRequest(h.h, this, p1);
                    AdNetworkDiscovery j = CreativeInfoManager.j(h.h);
                    if (j != null && j.d().b(AdNetworkConfiguration.USE_WEBVIEW_LOADURL_AS_RESOURCE_LOADED_INDICATION)) {
                        CreativeInfoManager.a(p1, (String) null, this, h.h);
                    }
                    SafeDKWebAppInterface.a(h.h, (WebView) this, p1, true);
                }
                Logger.d("SafeDKNetwork", "webviewLoadUrl2 loadUrl url is null or a javascript command : ", p1);
            }
        } catch (Throwable th) {
            Logger.e("SafeDKNetwork", "webviewLoadUrl2 exception", th);
        }
        super.loadUrl(p1);
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = AndroidWebViewClient.BLANK_PAGE;
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcmm
                private final /* synthetic */ String zzb = AndroidWebViewClient.BLANK_PAGE;

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcmp.this.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdWebViewImpl.loadUrlUnsafe");
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean zzc = com.google.android.gms.ads.internal.zzt.zzh().zzc();
        this.zzy = zzc;
        if (zzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbjn.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfld zzfldVar = this.zzk;
        if (zzfldVar != null && zzfldVar.zzam) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        com.google.android.gms.ads.internal.zzt.zzh().zzl();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcjs) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbh() {
        zzbjt zzbjtVar = this.zzM;
        if (zzbjtVar == null) {
            return;
        }
        zzbjv zzc = zzbjtVar.zzc();
        zzbjl zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza();
        if (zza2 != null) {
            zza2.zzb(zzc);
        }
    }

    private final void zzbi(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(C4643f8.k, true != z ? "0" : "1");
        zze("onAdVisibilityChanged", hashMap);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void destroy() {
        try {
            zzbh();
            this.zzQ.zzc();
            com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
            if (zzmVar != null) {
                zzmVar.zza();
                this.zzp.zzp();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzB().zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmt)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity zzb = this.zzb.zzb();
            if (zzb != null && zzb.isDestroyed()) {
                com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
                zzY();
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
                com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
                zzaZ(AndroidWebViewClient.BLANK_PAGE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmu)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcgj.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcmp.this.zzaU(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        com.google.android.gms.ads.internal.zzt.zzB().zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            safedk_webview_zzcmp_webviewLoadData_172d49d32092f6f80826f3dca3960029(str, str2, str3);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzX()) {
            safedk_webview_zzcmp_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, str2, str3, str4, str5);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcml
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcmp.this.zzaV(str);
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "AdWebViewImpl.loadUrl");
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzclx zzclxVar = this.zzo;
        if (zzclxVar != null) {
            zzclxVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            if (!zzX()) {
                this.zzQ.zzd();
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z = this.zzC;
            zzclx zzclxVar = this.zzo;
            if (zzclxVar != null && zzclxVar.zzl()) {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
                z = true;
            }
            zzbi(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzclx zzclxVar;
        synchronized (this) {
            try {
                if (!zzX()) {
                    this.zzQ.zze();
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzclxVar = this.zzo) != null && zzclxVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmI)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            String sb2 = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaM = zzaM();
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL == null || !zzaM) {
            return;
        }
        zzL.zzB();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e8 A[Catch: all -> 0x000d, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d1, B:96:0x01d4, B:98:0x01db, B:103:0x01e8, B:105:0x01ee, B:106:0x01f1, B:108:0x01f5, B:109:0x01fe, B:115:0x0209), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d1, B:96:0x01d4, B:98:0x01db, B:103:0x01e8, B:105:0x01ee, B:106:0x01f1, B:108:0x01f5, B:109:0x01fe, B:115:0x0209), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x0010, B:11:0x0016, B:13:0x001a, B:16:0x0024, B:18:0x002c, B:21:0x0031, B:23:0x0039, B:25:0x004b, B:28:0x0050, B:30:0x0057, B:33:0x0061, B:36:0x0066, B:39:0x0077, B:40:0x008f, B:44:0x007e, B:47:0x0083, B:51:0x009c, B:53:0x00a4, B:55:0x00b6, B:58:0x00bb, B:60:0x00d7, B:61:0x00df, B:64:0x00db, B:65:0x00e4, B:67:0x00ec, B:70:0x00f7, B:77:0x011b, B:79:0x0122, B:82:0x0129, B:84:0x013b, B:86:0x0149, B:89:0x0156, B:93:0x015b, B:95:0x01d1, B:96:0x01d4, B:98:0x01db, B:103:0x01e8, B:105:0x01ee, B:106:0x01f1, B:108:0x01f5, B:109:0x01fe, B:115:0x0209), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6 = 0;
        if (zzX()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.zzw && !this.zzs.zzh()) {
            if (this.zzs.zzj()) {
                super.onMeasure(i, i2);
                return;
            }
            if (this.zzs.zzi()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeS)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzcms zzh = zzh();
                float zzm = zzh != null ? zzh.zzm() : 0.0f;
                if (zzm == 0.0f) {
                    super.onMeasure(i, i2);
                    return;
                }
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = size2 * zzm;
                int i7 = (int) (size / zzm);
                if (size2 == 0) {
                    if (i7 != 0) {
                        i5 = (int) (i7 * zzm);
                        i6 = size;
                        i4 = i7;
                        setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                        return;
                    }
                    size2 = 0;
                }
                int i8 = (int) f;
                if (size != 0) {
                    i6 = size;
                } else if (i8 != 0) {
                    i7 = (int) (i8 / zzm);
                    i4 = size2;
                    i5 = i8;
                    i6 = i5;
                    setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                    return;
                }
                i4 = size2;
                i5 = i8;
                setMeasuredDimension(Math.min(i5, i6), Math.min(i7, i4));
                return;
            }
            if (this.zzs.zzf()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfa)).booleanValue()) {
                    super.onMeasure(i, i2);
                    return;
                }
                zzab("/contentHeight", new zzcmj(this));
                zzaP("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                float f2 = this.zzi.density;
                int size3 = View.MeasureSpec.getSize(i);
                int i9 = this.zzI;
                setMeasuredDimension(size3, i9 != -1 ? (int) (i9 * f2) : View.MeasureSpec.getSize(i2));
                return;
            }
            if (this.zzs.zzg()) {
                DisplayMetrics displayMetrics = this.zzi;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i);
            int size4 = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size5 = View.MeasureSpec.getSize(i2);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i3 = Integer.MAX_VALUE;
                int i10 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                zzcnw zzcnwVar = this.zzs;
                z = zzcnwVar.zzb <= i3 || zzcnwVar.zza > i10;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgD)).booleanValue()) {
                    zzcnw zzcnwVar2 = this.zzs;
                    float f3 = zzcnwVar2.zzb;
                    float f4 = this.zzj;
                    z &= f3 / f4 <= ((float) i3) / f4 && ((float) zzcnwVar2.zza) / f4 <= ((float) i10) / f4;
                }
                if (z) {
                    if (getVisibility() != 8) {
                        setVisibility(0);
                    }
                    if (!this.zzn) {
                        this.zzY.zzc(Sdk.SDKError.Reason.AD_LOAD_TOO_FREQUENTLY_VALUE);
                        this.zzn = true;
                    }
                    zzcnw zzcnwVar3 = this.zzs;
                    setMeasuredDimension(zzcnwVar3.zzb, zzcnwVar3.zza);
                    return;
                }
                float f5 = this.zzs.zzb;
                float f6 = this.zzj;
                int i11 = (int) (f5 / f6);
                int i12 = (int) (r2.zza / f6);
                int i13 = (int) (size4 / f6);
                int i14 = (int) (size5 / f6);
                StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 36 + String.valueOf(i12).length() + 18 + String.valueOf(i13).length() + 1 + String.valueOf(i14).length() + 4);
                sb.append("Not enough space to show ad. Needs ");
                sb.append(i11);
                sb.append(VastAttributes.HORIZONTAL_POSITION);
                sb.append(i12);
                sb.append(" dp, but only has ");
                sb.append(i13);
                sb.append(VastAttributes.HORIZONTAL_POSITION);
                sb.append(i14);
                sb.append(" dp.");
                String sb2 = sb.toString();
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                if (getVisibility() != 8) {
                    setVisibility(4);
                }
                setMeasuredDimension(0, 0);
                if (this.zzm) {
                    return;
                }
                this.zzY.zzc(Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
                this.zzm = true;
                return;
            }
            i3 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            zzcnw zzcnwVar4 = this.zzs;
            if (zzcnwVar4.zzb <= i3) {
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgD)).booleanValue()) {
            }
            if (z) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzom)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Muting webview");
                WebViewCompat.setAudioMuted(this, true);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not pause webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzop)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzom)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unmuting webview");
                WebViewCompat.setAudioMuted(this, false);
            }
        } catch (Exception e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not resume webview.", e);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzop)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeA)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z) {
            zzbbd zzbbdVar = this.zzc;
            if (zzbbdVar != null) {
                zzbbdVar.zzc(motionEvent);
            }
            zzbkn zzbknVar = this.zze;
            if (zzbknVar != null) {
                zzbknVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbmi zzbmiVar = this.zzE;
                    if (zzbmiVar != null) {
                        zzbmiVar.zzb(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclm
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclx) {
            this.zzo = (zzclx) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzA(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcld
    public final zzfld zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcnh
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzG() {
        zzbb();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzH(int i) {
        if (i == 0) {
            zzbjt zzbjtVar = this.zzM;
            zzbjn.zza(zzbjtVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbjt zzbjtVar2 = this.zzM;
        zzbjtVar2.zzc();
        zzbjtVar2.zzc().zzd("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzI() {
        if (this.zzJ == null) {
            zzbjt zzbjtVar = this.zzM;
            zzbjn.zza(zzbjtVar.zzc(), this.zzK, "aes2");
            zzbjtVar.zzc();
            zzbjs zzf = zzbjv.zzf();
            this.zzJ = zzf;
            zzbjtVar.zza("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzf.afmaVersion);
        zze("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzJ() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzd()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzi().zzb()));
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzaa.zze(getContext())));
        zze("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcne
    public final synchronized zzcnw zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final /* synthetic */ zzcnk zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcnf
    public final zzbbd zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final zzfma zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzeml zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzemj zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzY() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzbf();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcmk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        zzbie zzbieVar = new zzbie() { // from class: com.google.android.gms.internal.ads.zzcmn
            @Override // com.google.android.gms.internal.ads.zzbie
            public final /* synthetic */ void zza(zzbil.zzt.zza zzaVar) {
                int i2 = zzcmp.zza;
                zzbil.zzbl.zza zzq = zzbil.zzbl.zzq();
                boolean zzb = zzq.zzb();
                boolean z2 = z;
                if (zzb != z2) {
                    zzq.zzc(z2);
                }
                zzq.zzg(i);
                zzaVar.zzal(zzq.zzbu());
            }
        };
        zzbif zzbifVar = this.zzY;
        zzbifVar.zzb(zzbieVar);
        zzbifVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcmt
    public final zzflg zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzaD(zzfld zzfldVar, zzflg zzflgVar) {
        this.zzk = zzfldVar;
        this.zzl = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzaE(boolean z, int i) {
        if (z) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzt(z, i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final ListenableFuture zzaF() {
        zzbkn zzbknVar = this.zze;
        return zzbknVar == null ? zzhcy.zza(null) : zzbknVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzaG(boolean z) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        this.zzo.zzv(zzcVar, z, z2, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void zzaI(boolean z, int i, boolean z2) {
        this.zzo.zzx(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) {
        this.zzo.zzy(z, i, str, z2, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void zzaK(boolean z, int i, String str, String str2, boolean z2) {
        this.zzo.zzz(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzcnc
    public final void zzaL(String str, String str2, int i) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r10.zzV != r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r10.zzV != r9) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzaM() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzo.zzk() || this.zzo.zzl()) {
            com.google.android.gms.ads.internal.client.zzay.zza();
            DisplayMetrics displayMetrics = this.zzi;
            int zzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zza();
            int zzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.heightPixels);
            Activity zzb = this.zzb.zzb();
            if (zzb == null || zzb.getWindow() == null) {
                i = zzC;
                i2 = zzC2;
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] zzV = com.google.android.gms.ads.internal.util.zzs.zzV(zzb);
                com.google.android.gms.ads.internal.client.zzay.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, zzV[0]);
                com.google.android.gms.ads.internal.client.zzay.zza();
                i2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, zzV[1]);
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            int rotation = this.zzX.getDefaultDisplay().getRotation();
            if (this.zzS == zzC && this.zzR == zzC2 && this.zzT == i && this.zzU == i2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaK)).booleanValue()) {
                }
            }
            if (this.zzS == zzC && this.zzR == zzC2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaK)).booleanValue()) {
                }
                this.zzS = zzC;
                this.zzR = zzC2;
                this.zzT = i;
                this.zzU = i2;
                this.zzV = rotation;
                new zzbyy(this, "").zzl(zzC, zzC2, i, i2, displayMetrics.density, rotation);
                return z;
            }
            z = true;
            this.zzS = zzC;
            this.zzR = zzC2;
            this.zzT = i;
            this.zzU = i2;
            this.zzV = rotation;
            new zzbyy(this, "").zzl(zzC, zzC2, i, i2, displayMetrics.density, rotation);
            return z;
        }
        return false;
    }

    protected final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
        }
    }

    protected final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    @VisibleForTesting
    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzb(bool);
    }

    @VisibleForTesting
    final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzclx zzaS() {
        return this.zzo;
    }

    final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaW(String str) {
        zzaV(AndroidWebViewClient.BLANK_PAGE);
    }

    final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    final /* synthetic */ void zzaY(int i) {
        this.zzI = i;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzab(String str, zzbqh zzbqhVar) {
        zzclx zzclxVar = this.zzo;
        if (zzclxVar != null) {
            zzclxVar.zzB(str, zzbqhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzac(String str, zzbqh zzbqhVar) {
        zzclx zzclxVar = this.zzo;
        if (zzclxVar != null) {
            zzclxVar.zzC(str, zzbqhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzad(String str, Predicate predicate) {
        zzclx zzclxVar = this.zzo;
        if (zzclxVar != null) {
            zzclxVar.zzE(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzaf(zzcnw zzcnwVar) {
        this.zzs = zzcnwVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzag(boolean z) {
        try {
            boolean z2 = this.zzw;
            this.zzw = z;
            zzbc();
            if (z != z2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaI)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbyy(this, "").zzk(true != z ? "default" : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzah() {
        this.zzQ.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzai(Context context) {
        zzcno zzcnoVar = this.zzb;
        zzcnoVar.setBaseContext(context);
        this.zzQ.zza(zzcnoVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzaj(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzs(this.zzo.zzk(), z);
        } else {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzak(zzeml zzemlVar) {
        this.zzq = zzemlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzal(zzemj zzemjVar) {
        this.zzr = zzemjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzam(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzv(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzO = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzao(boolean z) {
        this.zzz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzap() {
        if (this.zzL == null) {
            zzbjt zzbjtVar = this.zzM;
            zzbjtVar.zzc();
            zzbjs zzf = zzbjv.zzf();
            this.zzL = zzf;
            zzbjtVar.zza("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzaq(zzbmi zzbmiVar) {
        this.zzE = zzbmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzbmi zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzas(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzH + (true != z ? -1 : 1);
        this.zzH = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzau(String str, String str2, String str3) {
        String str4;
        try {
            if (zzX()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("#004 The webview is destroyed. Ignoring action.");
                return;
            }
            String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaH);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            safedk_webview_zzcmp_webviewLoadDataWithBaseURL_558df8468e7a3606a3ca6ea19e01a100(str, zzcnd.zza(str2, str4), POBCommonConstants.CONTENT_TYPE_HTML, "UTF-8", null);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzav() {
        com.google.android.gms.ads.internal.util.zze.zza("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final void zzaw(boolean z) {
        this.zzo.zzO(z);
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzax(zzbmf zzbmfVar) {
        this.zzF = zzbmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized void zzay(zzbgt zzbgtVar) {
        this.zzG = zzbgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclm
    public final synchronized zzbgt zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtq
    public final void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(sb2));
        zzaP(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdT() {
        zzclx zzclxVar = this.zzo;
        if (zzclxVar != null) {
            zzclxVar.zzdT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final void zzdj(zzbff zzbffVar) {
        boolean z;
        synchronized (this) {
            z = zzbffVar.zzj;
            this.zzC = z;
        }
        zzbi(z);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdk() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final synchronized void zzdl() {
        com.google.android.gms.ads.internal.zzn zznVar = this.zzg;
        if (zznVar != null) {
            zznVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final zzchu zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzdn(boolean z) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdu() {
        zzclx zzclxVar = this.zzo;
        if (zzclxVar != null) {
            zzclxVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final synchronized zzcms zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final zzbjs zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcmy, com.google.android.gms.internal.ads.zzcif
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzl() {
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzL();
        if (zzL != null) {
            zzL.zzD();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized String zzn() {
        zzflg zzflgVar = this.zzl;
        if (zzflgVar == null) {
            return null;
        }
        return zzflgVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized void zzo(int i) {
        this.zzN = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final zzbjt zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized zzcjs zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcjs) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcng, com.google.android.gms.internal.ads.zzcif
    public final VersionInfoParcel zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final synchronized void zzt(String str, zzcjs zzcjsVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzcjsVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzu(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.toString(j));
        zze("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final void zzv(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzclm, com.google.android.gms.internal.ads.zzcif
    public final synchronized void zzw(zzcms zzcmsVar) {
        if (this.zzB == null) {
            this.zzB = zzcmsVar;
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcif
    public final synchronized void zzz() {
        zzbmf zzbmfVar = this.zzF;
        if (zzbmfVar != null) {
            zzbmfVar.zza();
        }
    }
}
