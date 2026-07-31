package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.util.network.NetworkUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.Marker;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public class zzclx extends WebViewClient implements zzcnk {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private zzeaj zzA;

    @Nullable
    private zzdck zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;

    @Nullable
    private final zzelp zzH;
    private View.OnAttachStateChangeListener zzI;
    protected final zzclm zza;

    @Nullable
    protected zzcef zzb;

    @Nullable
    private final zzbif zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcni zzi;
    private zzcnj zzj;
    private zzbox zzk;
    private zzboz zzl;
    private zzdlw zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;

    @Nullable
    private zzbyx zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbys zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgN)).split(StringUtils.COMMA)));

    @VisibleForTesting
    public zzclx(zzclm zzclmVar, @Nullable zzbif zzbifVar, boolean z, zzbyx zzbyxVar, @Nullable zzbys zzbysVar, @Nullable zzelp zzelpVar) {
        this.zzd = zzbifVar;
        this.zza = zzclmVar;
        this.zzs = z;
        this.zzx = zzbyxVar;
        this.zzH = zzelpVar;
    }

    private final void zzac(final View view, final zzcef zzcefVar, final int i) {
        if (!zzcefVar.zzc() || i <= 0) {
            return;
        }
        zzcefVar.zzd(view);
        if (zzcefVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclx.this.zzU(view, zzcefVar, i);
                }
            }, 100L);
        }
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Nullable
    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbA)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0121, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0123, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        r1 = r7.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013b, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013d, code lost:
    
        r11 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
    
        r0 = r7.getHeaderFields();
        r14 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018a, code lost:
    
        if (r0.hasNext() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018c, code lost:
    
        r1 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0196, code lost:
    
        if (r1.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x019c, code lost:
    
        if (r1.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01a8, code lost:
    
        if (r1.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01aa, code lost:
    
        r14.put(r1.getKey(), r1.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c0, code lost:
    
        r10 = com.google.android.gms.ads.internal.zzt.zzf().zzc(r10, r11, com.safedk.android.internal.partials.AdMobNetworkBridge.httpUrlConnectionGetResponseCode(r7), r7.getResponseMessage(), r14, com.safedk.android.internal.partials.AdMobNetworkBridge.urlConnectionGetInputStream(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013f, code lost:
    
        r1 = r1.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0144, code lost:
    
        if (r1.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0147, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0149, code lost:
    
        if (r2 >= r1.length) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0157, code lost:
    
        if (r1[r2].trim().startsWith(com.ironsource.B5.N) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
    
        r3 = r1[r2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        if (r3.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        r5 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016f, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0125, code lost:
    
        r10 = r1.split(";")[0].trim();
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final WebResourceResponse zzaf(String str, Map map) throws IOException {
        WebResourceResponse webResourceResponse;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                int i2 = zzgat.zzb;
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.util.zzs zzc2 = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzclm zzclmVar = this.zza;
                    zzc2.zzb(zzclmVar.getContext(), zzclmVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponse = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int httpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    zzlVar.zzc(httpURLConnection, httpUrlConnectionGetResponseCode);
                    if (httpUrlConnectionGetResponseCode < 300 || httpUrlConnectionGetResponseCode >= 400) {
                        break;
                    }
                    String headerField = httpURLConnection.getHeaderField(NetworkUtils.HEADER_LOCATION);
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (headerField.startsWith("tel:")) {
                        break;
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (protocol == null) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                        webResourceResponse = zzae();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        webResourceResponse = zzae();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(sb4);
                    AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                    url = url2;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbqh) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    private static final boolean zzai(zzclm zzclmVar) {
        return zzclmVar.zzC() != null && zzclmVar.zzC().zzb();
    }

    private static final boolean zzaj(boolean z, zzclm zzclmVar) {
        return (!z || zzclmVar.zzN().zzg() || zzclmVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzclx;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(h.h, webView, str);
        safedk_zzclx_onLoadResource_54aecd105eeb9c443ed6af301debb136(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzclm zzclmVar = this.zza;
                if (zzclmVar.zzX()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzclmVar.zzY();
                    return;
                }
                this.zzC = true;
                zzcnj zzcnjVar = this.zzj;
                if (zzcnjVar != null) {
                    zzcnjVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzclm zzclmVar2 = this.zza;
                if (zzclmVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznD)).booleanValue()) {
                        zzclmVar2.zzL().zzy(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(h.h, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzclx;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(h.h, webView, i, str, str2);
        safedk_zzclx_onReceivedError_61f5832fc1be5fc9e9578c503a5a2469(webView, i, str, str2);
    }

    public void safedk_zzclx_onLoadResource_54aecd105eeb9c443ed6af301debb136(WebView p0, String p1) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(p1)));
        Uri parse = Uri.parse(p1);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        }
    }

    public void safedk_zzclx_onReceivedError_61f5832fc1be5fc9e9578c503a5a2469(WebView p0, int p1, String p2, String p3) {
        this.zzo = true;
        this.zzp = p1;
        this.zzq = p2;
        this.zzr = p3;
    }

    @Nullable
    public WebResourceResponse safedk_zzclx_shouldInterceptRequest_451b24feb108fe3ac010908b8f488c56(WebView p0, String p1) {
        return zzL(p1, Collections.emptyMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean safedk_zzclx_shouldOverrideUrlLoading_321c8317f06aa151a9bdff31f42565b1(WebView p0, String p1) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(p1)));
        Uri parse = Uri.parse(p1);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzQ(parse);
        } else {
            if (this.zzn && p0 == this.zza.zzD()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcef zzcefVar = this.zzb;
                        if (zzcefVar != null) {
                            zzcefVar.zzb(p1);
                        }
                        this.zzg = null;
                    }
                    zzdlw zzdlwVar = this.zzm;
                    if (zzdlwVar != null) {
                        zzdlwVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(p0, p1);
                }
            }
            zzclm zzclmVar = this.zza;
            if (zzclmVar.zzD().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(p1)));
            } else {
                try {
                    zzbbd zzS = zzclmVar.zzS();
                    zzfma zzT = zzclmVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznH)).booleanValue() || zzT == null) {
                        if (zzS != null && zzS.zza(parse)) {
                            parse = zzS.zzd(parse, zzclmVar.getContext(), (View) zzclmVar, zzclmVar.zzj());
                        }
                    } else if (zzS != null && zzS.zza(parse)) {
                        parse = zzT.zza(parse, zzclmVar.getContext(), (View) zzclmVar, zzclmVar.zzj());
                    }
                } catch (zzbbe unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(p1)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzclm zzclmVar2 = this.zza;
                    zzv(zzcVar, true, false, zzclmVar2 != null ? zzclmVar2.zzn() : "");
                } else {
                    zzbVar.zzc(p1);
                }
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzclx;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(h.h, webView, str, safedk_zzclx_shouldInterceptRequest_451b24feb108fe3ac010908b8f488c56(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzclx;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_zzclx_shouldOverrideUrlLoading_321c8317f06aa151a9bdff31f42565b1 = safedk_zzclx_shouldOverrideUrlLoading_321c8317f06aa151a9bdff31f42565b1(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(h.h, webView, str, safedk_zzclx_shouldOverrideUrlLoading_321c8317f06aa151a9bdff31f42565b1);
        return safedk_zzclx_shouldOverrideUrlLoading_321c8317f06aa151a9bdff31f42565b1;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbys zzbysVar = this.zzz;
        boolean zzd = zzbysVar != null ? zzbysVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zzd, this.zzA);
        zzcef zzcefVar = this.zzb;
        if (zzcefVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcefVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbqh zzbqhVar) {
        synchronized (this.zzf) {
            try {
                HashMap hashMap = this.zze;
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new CopyOnWriteArrayList();
                    hashMap.put(str, list);
                }
                list.add(zzbqhVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzC(String str, zzbqh zzbqhVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbqhVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzbqh> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbqh zzbqhVar : list) {
                    if (predicate.apply(zzbqhVar)) {
                        arrayList.add(zzbqhVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        zzcef zzcefVar = this.zzb;
        if (zzcefVar != null) {
            zzcefVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbys zzbysVar = this.zzz;
                if (zzbysVar != null) {
                    zzbysVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzG(zzcni zzcniVar) {
        this.zzi = zzcniVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzH(zzcnj zzcnjVar) {
        this.zzj = zzcnjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final zzeaj zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzJ(zzdck zzdckVar) {
        this.zzB = zzdckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final zzdck zzK() {
        return this.zzB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TRY_ENTER, TryCatch #12 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b7, B:26:0x00cb, B:29:0x00e6, B:47:0x01c3, B:48:0x017a, B:51:0x02c8, B:65:0x0245, B:66:0x0278, B:59:0x0213, B:61:0x0149, B:82:0x00d9, B:83:0x0279, B:85:0x0283, B:87:0x0289, B:89:0x02bc, B:92:0x02d7, B:94:0x02dd, B:96:0x02eb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c8 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #12 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b7, B:26:0x00cb, B:29:0x00e6, B:47:0x01c3, B:48:0x017a, B:51:0x02c8, B:65:0x0245, B:66:0x0278, B:59:0x0213, B:61:0x0149, B:82:0x00d9, B:83:0x0279, B:85:0x0283, B:87:0x0289, B:89:0x02bc, B:92:0x02d7, B:94:0x02dd, B:96:0x02eb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0208 A[Catch: all -> 0x01b6, TryCatch #7 {all -> 0x01b6, blocks: (B:42:0x019b, B:44:0x01ad, B:46:0x01b9, B:55:0x01f6, B:57:0x0208, B:58:0x020f), top: B:28:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0279 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #12 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b7, B:26:0x00cb, B:29:0x00e6, B:47:0x01c3, B:48:0x017a, B:51:0x02c8, B:65:0x0245, B:66:0x0278, B:59:0x0213, B:61:0x0149, B:82:0x00d9, B:83:0x0279, B:85:0x0283, B:87:0x0289, B:89:0x02bc, B:92:0x02d7, B:94:0x02dd, B:96:0x02eb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02dd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #12 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0026, B:8:0x0036, B:11:0x003d, B:13:0x004b, B:15:0x0067, B:17:0x0080, B:19:0x0097, B:20:0x009a, B:21:0x009d, B:24:0x00b7, B:26:0x00cb, B:29:0x00e6, B:47:0x01c3, B:48:0x017a, B:51:0x02c8, B:65:0x0245, B:66:0x0278, B:59:0x0213, B:61:0x0149, B:82:0x00d9, B:83:0x0279, B:85:0x0283, B:87:0x0289, B:89:0x02bc, B:92:0x02d7, B:94:0x02dd, B:96:0x02eb), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final WebResourceResponse zzL(String str, Map map) {
        int i;
        InputStream inputStream;
        InputStream zzb;
        final boolean z;
        final boolean z2;
        final boolean z3;
        String sb;
        try {
            Map hashMap = new HashMap();
            zzclm zzclmVar = this.zza;
            if (zzclmVar.zzC() != null) {
                hashMap = zzclmVar.zzC().zzaw;
            }
            String zza = zzcet.zza(str, zzclmVar.getContext(), this.zzF, hashMap);
            if (!zza.equals(str)) {
                return zzaf(zza, map);
            }
            Parcelable.Creator<zzbhr> creator = zzbhr.CREATOR;
            zzbhr zza2 = zzbhr.zza(Uri.parse(str));
            if (zza2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    List zzg = zzguz.zza(zzgty.zzd('-')).zzg(parse.getQueryParameter("range"));
                    if (zzg.size() == 2) {
                        int parseInt = Integer.parseInt((String) zzg.get(0));
                        int parseInt2 = Integer.parseInt((String) zzg.get(1)) + 1;
                        if (parseInt > 0) {
                            zza2.zzh = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        String str2 = "X-Afma-Gcache-CachedBytes";
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfs)).booleanValue()) {
                            zzbho zzc2 = com.google.android.gms.ads.internal.zzt.zzj().zzc(zza2);
                            if (zzc2 == null || !zzc2.zza()) {
                                inputStream = null;
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzc2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzc2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzc2.zze()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzc2.zzf()));
                                zzb = zzc2.zzb();
                                if (i != -1) {
                                    inputStream = zzham.zzb(zzb, i);
                                }
                            }
                            if (inputStream != null) {
                                return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                            }
                        } else {
                            zza2.zzi = zzgvb.zza(zzclmVar.zzn());
                            zza2.zzj = zzclmVar.zzp();
                            try {
                                long longValue = (zza2.zzg ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfu) : (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzft)).longValue();
                                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                                com.google.android.gms.ads.internal.zzt.zzz();
                                Future zza3 = zzbic.zza(zzclmVar.getContext(), zza2);
                                try {
                                    zzbid zzbidVar = (zzbid) zza3.get(longValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbidVar.zzc()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbidVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbidVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbidVar.zze()));
                                            zzb = zzbidVar.zzb();
                                            if (i != -1) {
                                                try {
                                                    zzb = zzham.zzb(zzb, i);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    z3 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfx)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    final long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclr
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzclx.this.zzX(z3, elapsedRealtime2);
                                                        }
                                                    });
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 24);
                                                    sb2.append("Cache connection took ");
                                                    sb2.append(elapsedRealtime2);
                                                    sb2.append("ms");
                                                    sb = sb2.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    return !com.google.android.gms.ads.internal.util.client.zzl.zzj() ? null : null;
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    z2 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfx)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzclx.this.zzW(z2, elapsedRealtime3);
                                                        }
                                                    });
                                                    StringBuilder sb3 = new StringBuilder(String.valueOf(elapsedRealtime3).length() + 24);
                                                    sb3.append("Cache connection took ");
                                                    sb3.append(elapsedRealtime3);
                                                    sb3.append("ms");
                                                    sb = sb3.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (TimeoutException e3) {
                                                    e = e3;
                                                    z2 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfx)).booleanValue()) {
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime32 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzclx.this.zzW(z2, elapsedRealtime32);
                                                        }
                                                    });
                                                    StringBuilder sb32 = new StringBuilder(String.valueOf(elapsedRealtime32).length() + 24);
                                                    sb32.append("Cache connection took ");
                                                    sb32.append(elapsedRealtime32);
                                                    sb32.append("ms");
                                                    sb = sb32.toString();
                                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                                    inputStream = zzb;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                }
                                            }
                                            final long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            final boolean z4 = true;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z4, elapsedRealtime4) { // from class: com.google.android.gms.internal.ads.zzclp
                                                private final /* synthetic */ long zzb;

                                                {
                                                    this.zzb = elapsedRealtime4;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzclx.this.zzV(true, this.zzb);
                                                }
                                            });
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(elapsedRealtime4);
                                            sb4.append("ms");
                                            sb = sb4.toString();
                                        } catch (Throwable th) {
                                            th = th;
                                            z = 1;
                                            final long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcls
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzclx.this.zzY(z, elapsedRealtime5);
                                                }
                                            });
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(elapsedRealtime5).length() + 24);
                                            sb5.append("Cache connection took ");
                                            sb5.append(elapsedRealtime5);
                                            sb5.append("ms");
                                            com.google.android.gms.ads.internal.util.zze.zza(sb5.toString());
                                            throw th;
                                        }
                                    } catch (InterruptedException e4) {
                                        e = e4;
                                        zzb = null;
                                    } catch (ExecutionException e5) {
                                        e = e5;
                                        zzb = null;
                                        z2 = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfx)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime322 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzclx.this.zzW(z2, elapsedRealtime322);
                                            }
                                        });
                                        StringBuilder sb322 = new StringBuilder(String.valueOf(elapsedRealtime322).length() + 24);
                                        sb322.append("Cache connection took ");
                                        sb322.append(elapsedRealtime322);
                                        sb322.append("ms");
                                        sb = sb322.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (TimeoutException e6) {
                                        e = e6;
                                        zzb = null;
                                        z2 = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfx)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime3222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzclx.this.zzW(z2, elapsedRealtime3222);
                                            }
                                        });
                                        StringBuilder sb3222 = new StringBuilder(String.valueOf(elapsedRealtime3222).length() + 24);
                                        sb3222.append("Cache connection took ");
                                        sb3222.append(elapsedRealtime3222);
                                        sb3222.append("ms");
                                        sb = sb3222.toString();
                                        com.google.android.gms.ads.internal.util.zze.zza(sb);
                                        inputStream = zzb;
                                        if (inputStream != null) {
                                        }
                                        if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    zzb = null;
                                    z3 = false;
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    zzb = null;
                                    z2 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfx)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime32222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzclx.this.zzW(z2, elapsedRealtime32222);
                                        }
                                    });
                                    StringBuilder sb32222 = new StringBuilder(String.valueOf(elapsedRealtime32222).length() + 24);
                                    sb32222.append("Cache connection took ");
                                    sb32222.append(elapsedRealtime32222);
                                    sb32222.append("ms");
                                    sb = sb32222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    zzb = null;
                                    z2 = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfx)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime322222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzclx.this.zzW(z2, elapsedRealtime322222);
                                        }
                                    });
                                    StringBuilder sb322222 = new StringBuilder(String.valueOf(elapsedRealtime322222).length() + 24);
                                    sb322222.append("Cache connection took ");
                                    sb322222.append(elapsedRealtime322222);
                                    sb322222.append("ms");
                                    sb = sb322222.toString();
                                    com.google.android.gms.ads.internal.util.zze.zza(sb);
                                    inputStream = zzb;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = 0;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(sb);
                            } catch (Throwable th3) {
                                th = th3;
                                z = str2;
                            }
                        }
                        inputStream = zzb;
                        if (inputStream != null) {
                        }
                    }
                }
                i = -1;
                String str22 = "X-Afma-Gcache-CachedBytes";
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfs)).booleanValue()) {
                }
                inputStream = zzb;
                if (inputStream != null) {
                }
            }
            if (!com.google.android.gms.ads.internal.util.client.zzl.zzj() && ((Boolean) zzbld.zzb.zze()).booleanValue()) {
                return zzaf(str, map);
            }
        } catch (Exception e10) {
            e = e10;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest");
            return zzae();
        } catch (NoClassDefFoundError e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    public final void zzM(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclm zzclmVar = zzclx.this.zza;
                    zzclmVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzL = zzclmVar.zzL();
                    if (zzL != null) {
                        zzL.zzu();
                    }
                }
            });
        }
    }

    public final void zzO(boolean z) {
        this.zzF = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzP(int i, int i2) {
        zzbys zzbysVar = this.zzz;
        if (zzbysVar != null) {
            zzbysVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzQ(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhN)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? POBCommonConstants.NULL_VALUE : path.substring(1);
            zzcgj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzclx.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgM)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgO)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzhcy.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzclo(this, list, path, uri), zzcgj.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzaa(com.google.android.gms.ads.internal.util.zzs.zzT(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzR(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzS(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzT(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    final /* synthetic */ void zzU(View view, zzcef zzcefVar, int i) {
        zzac(view, zzcefVar, i - 1);
    }

    final /* synthetic */ void zzV(boolean z, long j) {
        zzY(true, j);
    }

    final /* synthetic */ void zzZ(View view, zzcef zzcefVar, int i) {
        zzac(view, zzcefVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zza(int i, int i2, boolean z) {
        zzbyx zzbyxVar = this.zzx;
        if (zzbyxVar != null) {
            zzbyxVar.zzb(i, i2);
        }
        zzbys zzbysVar = this.zzz;
        if (zzbysVar != null) {
            zzbysVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzab(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbox zzboxVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar, @Nullable zzboz zzbozVar, @Nullable com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z, @Nullable zzbqk zzbqkVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbyz zzbyzVar, @Nullable zzcef zzcefVar, @Nullable zzele zzeleVar, @Nullable zzfte zzfteVar, @Nullable zzeaj zzeajVar, @Nullable zzbrd zzbrdVar, @Nullable zzdlw zzdlwVar, @Nullable zzbrc zzbrcVar, @Nullable zzbqw zzbqwVar, @Nullable zzbqi zzbqiVar, @Nullable zzcub zzcubVar, @Nullable zzebm zzebmVar, @Nullable zzdcq zzdcqVar, @Nullable zzdck zzdckVar, @Nullable zzdcg zzdcgVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcefVar, null) : zzbVar;
        zzclm zzclmVar = this.zza;
        this.zzz = new zzbys(zzclmVar, zzbyzVar);
        this.zzb = zzcefVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbJ)).booleanValue()) {
            zzB("/adMetadata", new zzbow(zzboxVar));
        }
        if (zzbozVar != null) {
            zzB("/appEvent", new zzboy(zzbozVar));
        }
        zzB("/backButton", zzbqg.zzj);
        zzB("/refresh", zzbqg.zzk);
        zzB("/canOpenApp", zzbqg.zzb);
        zzB("/canOpenURLs", zzbqg.zza);
        zzB("/canOpenIntents", zzbqg.zzc);
        zzB("/close", zzbqg.zzd);
        zzB("/customClose", zzbqg.zze);
        zzB("/instrument", zzbqg.zzn);
        zzB("/delayPageLoaded", zzbqg.zzp);
        zzB("/delayPageClosed", zzbqg.zzq);
        zzB("/getLocationInfo", zzbqg.zzr);
        zzB("/log", zzbqg.zzg);
        zzB("/mraid", new zzbqo(zzbVar2, this.zzz, zzbyzVar));
        zzbyx zzbyxVar = this.zzx;
        if (zzbyxVar != null) {
            zzB("/mraidLoaded", zzbyxVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbqv(zzbVar2, this.zzz, zzeleVar, zzeajVar, zzcubVar, zzdcqVar, zzdcgVar));
        zzB("/precache", new zzcjt());
        zzB("/touch", zzbqg.zzi);
        zzB("/video", zzbqg.zzl);
        zzB("/videoMeta", zzbqg.zzm);
        if (zzeleVar == null || zzfteVar == null) {
            zzB("/click", zzbqg.zzb(zzdlwVar, zzcubVar));
            zzB("/httpTrack", zzbqg.zzf);
        } else {
            zzB("/click", zzfmh.zza(zzeleVar, zzfteVar, zzcubVar, zzdlwVar));
            zzB("/httpTrack", zzfmh.zzb(zzeleVar, zzfteVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zzb(zzclmVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzclmVar.zzC() != null) {
                hashMap = zzclmVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbqn(zzclmVar.getContext(), hashMap));
        }
        if (zzbqkVar != null) {
            zzB("/setInterstitialProperties", new zzbqj(zzbqkVar));
        }
        if (zzbrdVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbrdVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkO)).booleanValue() && zzbrcVar != null) {
            zzB("/shareSheet", zzbrcVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziQ)).booleanValue() && zzebmVar != null) {
            zzB("/onDeviceStorageEvent", new zzbqp(zzebmVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkT)).booleanValue() && zzbqwVar != null) {
            zzB("/inspectorOutOfContextTest", zzbqwVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkY)).booleanValue() && zzbqiVar != null) {
            zzB("/inspectorStorage", zzbqiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzni)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbqg.zzu);
            zzB("/presentPlayStoreOverlay", zzbqg.zzv);
            zzB("/expandPlayStoreOverlay", zzbqg.zzw);
            zzB("/collapsePlayStoreOverlay", zzbqg.zzx);
            zzB("/closePlayStoreOverlay", zzbqg.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeq)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbqg.zzA);
            zzB("/resetPAID", zzbqg.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznC)).booleanValue() && zzclmVar.zzC() != null && zzclmVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbqg.zzB);
            zzB("/clearLocalStorageKeys", zzbqg.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzboxVar;
        this.zzl = zzbozVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdlwVar;
        this.zzA = zzeajVar;
        this.zzB = zzdckVar;
        this.zzn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzb(zzfld zzfldVar) {
        zzclm zzclmVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zzb(zzclmVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbqn(zzclmVar.getContext(), zzfldVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzc(zzcub zzcubVar) {
        zzD("/click");
        zzB("/click", zzbqg.zzb(this.zzm, zzcubVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzd(zzcub zzcubVar, @Nullable zzele zzeleVar, @Nullable zzfte zzfteVar) {
        zzD("/click");
        if (zzeleVar == null || zzfteVar == null) {
            zzB("/click", zzbqg.zzb(this.zzm, zzcubVar));
        } else {
            zzB("/click", zzfmh.zza(zzeleVar, zzfteVar, zzcubVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdT() {
        zzdlw zzdlwVar = this.zzm;
        if (zzdlwVar != null) {
            zzdlwVar.zzdT();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlw
    public final void zzdu() {
        zzdlw zzdlwVar = this.zzm;
        if (zzdlwVar != null) {
            zzdlwVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zze(zzcub zzcubVar, @Nullable zzele zzeleVar, @Nullable zzeaj zzeajVar) {
        zzD("/open");
        zzB("/open", new zzbqv(this.zzy, this.zzz, zzeleVar, zzeajVar, zzcubVar, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzi(@Nullable com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzj(zzcef zzcefVar) {
        this.zzb = zzcefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final boolean zzk() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzn() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzq() {
        zzcef zzcefVar = this.zzb;
        if (zzcefVar != null) {
            zzclm zzclmVar = this.zza;
            WebView zzD = zzclmVar.zzD();
            if (ViewCompat.isAttachedToWindow(zzD)) {
                zzac(zzD, zzcefVar, 10);
                return;
            }
            zzad();
            zzcln zzclnVar = new zzcln(this, zzcefVar);
            this.zzI = zzclnVar;
            ((View) zzclmVar).addOnAttachStateChangeListener(zzclnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcnk
    public final void zzt() {
        zzbif zzbifVar = this.zzd;
        if (zzbifVar != null) {
            zzbifVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcG)).booleanValue()) {
                zzclm zzclmVar = this.zza;
                if (zzclmVar.zzq() != null) {
                    zzbjn.zza(zzclmVar.zzq().zzc(), zzclmVar.zzi(), "awfllc");
                }
            }
            zzcni zzcniVar = this.zzi;
            boolean z = false;
            if (!this.zzD && !this.zzo) {
                z = true;
            }
            zzcniVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        zzclm zzclmVar = this.zza;
        boolean zzW = zzclmVar.zzW();
        boolean z3 = zzaj(zzW, zzclmVar) || z2;
        zzA(new AdOverlayInfoParcel(zzcVar, z3 ? null : this.zzg, zzW ? null : this.zzh, this.zzw, zzclmVar.zzs(), zzclmVar, z3 || !z ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzelp zzelpVar = this.zzH;
        zzclm zzclmVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzclmVar, zzclmVar.zzs(), str, str2, 14, zzelpVar));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        zzclm zzclmVar = this.zza;
        boolean zzaj = zzaj(zzclmVar.zzW(), zzclmVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        zzA(new AdOverlayInfoParcel(zzaj ? null : this.zzg, this.zzh, this.zzw, zzclmVar, z, i, zzclmVar.zzs(), z3 ? null : this.zzm, zzai(zzclmVar) ? this.zzH : null));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        zzclm zzclmVar = this.zza;
        boolean zzW = zzclmVar.zzW();
        boolean zzaj = zzaj(zzW, zzclmVar);
        boolean z4 = true;
        if (!zzaj && z2) {
            z4 = false;
        }
        zzA(new AdOverlayInfoParcel(zzaj ? null : this.zzg, zzW ? null : new zzclw(zzclmVar, this.zzh), this.zzk, this.zzl, this.zzw, zzclmVar, z, i, str, zzclmVar.zzs(), z4 ? null : this.zzm, zzai(zzclmVar) ? this.zzH : null, z3));
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzclm zzclmVar = this.zza;
        boolean zzW = zzclmVar.zzW();
        boolean zzaj = zzaj(zzW, zzclmVar);
        boolean z3 = true;
        if (!zzaj && z2) {
            z3 = false;
        }
        zzA(new AdOverlayInfoParcel(zzaj ? null : this.zzg, zzW ? null : new zzclw(zzclmVar, this.zzh), this.zzk, this.zzl, this.zzw, zzclmVar, z, i, str, str2, zzclmVar.zzs(), z3 ? null : this.zzm, zzai(zzclmVar) ? this.zzH : null));
    }
}
