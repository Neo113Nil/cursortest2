package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
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
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class zzcmw extends WebViewClient implements zzcoc {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzcdq zza;
    private final zzcmp zzc;
    private final zzbep zzd;
    private final HashMap zze;
    private final Object zzf;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcoa zzi;
    private zzcob zzj;
    private zzbop zzk;
    private zzbor zzl;
    private zzdkn zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private com.google.android.gms.ads.internal.overlay.zzz zzs;
    private zzbye zzt;
    private com.google.android.gms.ads.internal.zzb zzu;
    private zzbxz zzv;
    private zzfkm zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzcmw(zzcmp zzcmpVar, zzbep zzbepVar, boolean z) {
        zzbye zzbyeVar = new zzbye(zzcmpVar, zzcmpVar.zzG(), new zzbim(zzcmpVar.getContext()));
        this.zze = new HashMap();
        this.zzf = new Object();
        this.zzd = zzbepVar;
        this.zzc = zzcmpVar;
        this.zzp = z;
        this.zzt = zzbyeVar;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeJ)).split(",")));
    }

    private static WebResourceResponse zzM() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaD)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzN(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
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
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                com.google.android.gms.ads.internal.zzt.zzp().zze(this.zzc.getContext(), this.zzc.zzp().zza, false, httpURLConnection, false, 60000);
                zzcgo zzcgoVar = new zzcgo(null);
                zzcgoVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzcgoVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Protocol is null");
                    return zzM();
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Unsupported scheme: " + protocol);
                    return zzM();
                }
                com.google.android.gms.ads.internal.util.zze.zze("Redirecting to " + headerField);
                httpURLConnection.disconnect();
                url = url2;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            return com.google.android.gms.ads.internal.util.zzs.zzM(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzO(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbpu) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzP() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ(final View view, final zzcdq zzcdqVar, final int i) {
        if (!zzcdqVar.zzi() || i <= 0) {
            return;
        }
        zzcdqVar.zzg(view);
        if (zzcdqVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcms
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmw.this.zzn(view, zzcdqVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzR(boolean z, zzcmp zzcmpVar) {
        return (!z || zzcmpVar.zzQ().zzi() || zzcmpVar.zzU().equals("interstitial_mb")) ? false : true;
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
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaB()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzW();
                return;
            }
            this.zzx = true;
            zzcob zzcobVar = this.zzj;
            if (zzcobVar != null) {
                zzcobVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
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
                    case WorkQueueKt.MASK /* 127 */:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzI()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcdq zzcdqVar = this.zza;
                        if (zzcdqVar != null) {
                            zzcdqVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdkn zzdknVar = this.zzm;
                    if (zzdknVar != null) {
                        zzdknVar.zzq();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzI().willNotDraw()) {
                com.google.android.gms.ads.internal.util.zze.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzape zzK = this.zzc.zzK();
                    if (zzK != null && zzK.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcmp zzcmpVar = this.zzc;
                        parse = zzK.zza(parse, context, (View) zzcmpVar, zzcmpVar.zzk());
                    }
                } catch (zzapf unused) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzu;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzr(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.zzu.zzb(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzA(int i, int i2) {
        zzbxz zzbxzVar = this.zzv;
        if (zzbxzVar != null) {
            zzbxzVar.zzd(i, i2);
        }
    }

    public final void zzB(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzC(boolean z) {
        synchronized (this.zzf) {
            this.zzr = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzD() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmr
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmw.this.zzm();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzF(zzcob zzcobVar) {
        this.zzj = zzcobVar;
    }

    public final void zzG(String str, zzbpu zzbpuVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbpuVar);
        }
    }

    public final void zzH(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbpu> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbpu zzbpuVar : list) {
                if (predicate.apply(zzbpuVar)) {
                    arrayList.add(zzbpuVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzI() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzL(com.google.android.gms.ads.internal.client.zza zzaVar, zzbop zzbopVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbor zzborVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z, zzbpx zzbpxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbyg zzbygVar, zzcdq zzcdqVar, final zzego zzegoVar, final zzfkm zzfkmVar, zzdxq zzdxqVar, zzfir zzfirVar, zzbpv zzbpvVar, final zzdkn zzdknVar, zzbqm zzbqmVar, zzbqg zzbqgVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzcdqVar, null) : zzbVar;
        this.zzv = new zzbxz(this.zzc, zzbygVar);
        this.zza = zzcdqVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaL)).booleanValue()) {
            zzx("/adMetadata", new zzboo(zzbopVar));
        }
        if (zzborVar != null) {
            zzx("/appEvent", new zzboq(zzborVar));
        }
        zzx("/backButton", zzbpt.zzj);
        zzx("/refresh", zzbpt.zzk);
        zzx("/canOpenApp", zzbpt.zzb);
        zzx("/canOpenURLs", zzbpt.zza);
        zzx("/canOpenIntents", zzbpt.zzc);
        zzx("/close", zzbpt.zzd);
        zzx("/customClose", zzbpt.zze);
        zzx("/instrument", zzbpt.zzn);
        zzx("/delayPageLoaded", zzbpt.zzp);
        zzx("/delayPageClosed", zzbpt.zzq);
        zzx("/getLocationInfo", zzbpt.zzr);
        zzx("/log", zzbpt.zzg);
        zzx("/mraid", new zzbqb(zzbVar2, this.zzv, zzbygVar));
        zzbye zzbyeVar = this.zzt;
        if (zzbyeVar != null) {
            zzx("/mraidLoaded", zzbyeVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzx("/open", new zzbqf(zzbVar2, this.zzv, zzegoVar, zzdxqVar, zzfirVar));
        zzx("/precache", new zzclc());
        zzx("/touch", zzbpt.zzi);
        zzx("/video", zzbpt.zzl);
        zzx("/videoMeta", zzbpt.zzm);
        if (zzegoVar == null || zzfkmVar == null) {
            zzx("/click", zzbpt.zza(zzdknVar));
            zzx("/httpTrack", zzbpt.zzf);
        } else {
            zzx("/click", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzfem
                @Override // com.google.android.gms.internal.ads.zzbpu
                public final void zza(Object obj, Map map) {
                    zzdkn zzdknVar2 = zzdkn.this;
                    zzfkm zzfkmVar2 = zzfkmVar;
                    zzego zzegoVar2 = zzegoVar;
                    zzcmp zzcmpVar = (zzcmp) obj;
                    zzbpt.zzd(map, zzdknVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.zze.zzj("URL missing from click GMSG.");
                    } else {
                        zzfzg.zzr(zzbpt.zzb(zzcmpVar, str), new zzfen(zzcmpVar, zzfkmVar2, zzegoVar2), zzchc.zza);
                    }
                }
            });
            zzx("/httpTrack", new zzbpu() { // from class: com.google.android.gms.internal.ads.zzfel
                @Override // com.google.android.gms.internal.ads.zzbpu
                public final void zza(Object obj, Map map) {
                    zzfkm zzfkmVar2 = zzfkm.this;
                    zzego zzegoVar2 = zzegoVar;
                    zzcmg zzcmgVar = (zzcmg) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.zze.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcmgVar.zzF().zzak) {
                        zzegoVar2.zzd(new zzegq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzcnm) zzcmgVar).zzR().zzb, str, 2));
                    } else {
                        zzfkmVar2.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzx("/logScionEvent", new zzbqa(this.zzc.getContext()));
        }
        if (zzbpxVar != null) {
            zzx("/setInterstitialProperties", new zzbpw(zzbpxVar, null));
        }
        if (zzbpvVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue()) {
                zzx("/inspectorNetworkExtras", zzbpvVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhX)).booleanValue() && zzbqmVar != null) {
            zzx("/shareSheet", zzbqmVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzia)).booleanValue() && zzbqgVar != null) {
            zzx("/inspectorOutOfContextTest", zzbqgVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziU)).booleanValue()) {
            zzx("/bindPlayStoreOverlay", zzbpt.zzu);
            zzx("/presentPlayStoreOverlay", zzbpt.zzv);
            zzx("/expandPlayStoreOverlay", zzbpt.zzw);
            zzx("/collapsePlayStoreOverlay", zzbpt.zzx);
            zzx("/closePlayStoreOverlay", zzbpt.zzy);
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbopVar;
        this.zzl = zzborVar;
        this.zzs = zzzVar;
        this.zzu = zzbVar3;
        this.zzm = zzdknVar;
        this.zzn = z;
        this.zzw = zzfkmVar;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    protected final WebResourceResponse zzc(String str, Map map) {
        zzbdy zzb2;
        try {
            if (((Boolean) zzbkt.zza.zze()).booleanValue() && this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.zzw.zzc(str, null);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String zzc = zzcew.zzc(str, this.zzc.getContext(), this.zzA);
            if (!zzc.equals(str)) {
                return zzN(zzc, map);
            }
            zzbeb zza = zzbeb.zza(Uri.parse(str));
            if (zza != null && (zzb2 = com.google.android.gms.ads.internal.zzt.zzc().zzb(zza)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (zzcgo.zzl() && ((Boolean) zzbko.zzb.zze()).booleanValue()) {
                return zzN(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "AdWebViewClient.interceptRequest");
            return zzM();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzbD)).booleanValue() && this.zzc.zzo() != null) {
                zzbjj.zza(this.zzc.zzo().zza(), this.zzc.zzn(), "awfllc");
            }
            zzcoa zzcoaVar = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzo) {
                z = true;
            }
            zzcoaVar.zza(z);
            this.zzi = null;
        }
        this.zzc.zzae();
    }

    public final void zzh(boolean z) {
        this.zzA = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzi(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfP)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzo().zzf() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzchc.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmq
                @Override // java.lang.Runnable
                public final void run() {
                    String str = substring;
                    int i = zzcmw.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeI)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeK)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzfzg.zzr(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcmu(this, list, path, uri), zzchc.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        zzO(com.google.android.gms.ads.internal.util.zzs.zzL(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzj() {
        zzbep zzbepVar = this.zzd;
        if (zzbepVar != null) {
            zzbepVar.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzk() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzl() {
        this.zzz--;
        zzg();
    }

    final /* synthetic */ void zzm() {
        this.zzc.zzac();
        com.google.android.gms.ads.internal.overlay.zzl zzN = this.zzc.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    final /* synthetic */ void zzn(View view, zzcdq zzcdqVar, int i) {
        zzQ(view, zzcdqVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzo(int i, int i2, boolean z) {
        zzbye zzbyeVar = this.zzt;
        if (zzbyeVar != null) {
            zzbyeVar.zzb(i, i2);
        }
        zzbxz zzbxzVar = this.zzv;
        if (zzbxzVar != null) {
            zzbxzVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzp() {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            WebView zzI = this.zzc.zzI();
            if (ViewCompat.isAttachedToWindow(zzI)) {
                zzQ(zzI, zzcdqVar, 10);
                return;
            }
            zzP();
            zzcmt zzcmtVar = new zzcmt(this, zzcdqVar);
            this.zzC = zzcmtVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcmtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkn
    public final void zzq() {
        zzdkn zzdknVar = this.zzm;
        if (zzdknVar != null) {
            zzdknVar.zzq();
        }
    }

    public final void zzr(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z2 = true;
        if (!zzR && z) {
            z2 = false;
        }
        zzu(new AdOverlayInfoParcel(zzcVar, zzR ? null : this.zzg, zzaC ? null : this.zzh, this.zzs, this.zzc.zzp(), this.zzc, z2 ? null : this.zzm));
    }

    public final void zzs(com.google.android.gms.ads.internal.util.zzbr zzbrVar, zzego zzegoVar, zzdxq zzdxqVar, zzfir zzfirVar, String str, String str2, int i) {
        zzcmp zzcmpVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzcmpVar, zzcmpVar.zzp(), zzbrVar, zzegoVar, zzdxqVar, zzfirVar, str, str2, 14));
    }

    public final void zzt(boolean z, int i, boolean z2) {
        boolean zzR = zzR(this.zzc.zzaC(), this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcmp zzcmpVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzcmpVar, z, i, zzcmpVar.zzp(), z3 ? null : this.zzm));
    }

    public final void zzu(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbxz zzbxzVar = this.zzv;
        boolean zze = zzbxzVar != null ? zzbxzVar.zze() : false;
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze);
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcdqVar.zzh(str);
        }
    }

    public final void zzv(boolean z, int i, String str, boolean z2) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        zzcmv zzcmvVar = zzaC ? null : new zzcmv(this.zzc, this.zzh);
        zzbop zzbopVar = this.zzk;
        zzbor zzborVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcmp zzcmpVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzcmvVar, zzbopVar, zzborVar, zzzVar, zzcmpVar, z, i, str, zzcmpVar.zzp(), z3 ? null : this.zzm));
    }

    public final void zzw(boolean z, int i, String str, String str2, boolean z2) {
        boolean zzaC = this.zzc.zzaC();
        boolean zzR = zzR(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzR && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzR ? null : this.zzg;
        zzcmv zzcmvVar = zzaC ? null : new zzcmv(this.zzc, this.zzh);
        zzbop zzbopVar = this.zzk;
        zzbor zzborVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzs;
        zzcmp zzcmpVar = this.zzc;
        zzu(new AdOverlayInfoParcel(zzaVar, zzcmvVar, zzbopVar, zzborVar, zzzVar, zzcmpVar, z, i, str, str2, zzcmpVar.zzp(), z3 ? null : this.zzm));
    }

    public final void zzx(String str, zzbpu zzbpuVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbpuVar);
        }
    }

    public final void zzy() {
        zzcdq zzcdqVar = this.zza;
        if (zzcdqVar != null) {
            zzcdqVar.zze();
            this.zza = null;
        }
        zzP();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbxz zzbxzVar = this.zzv;
            if (zzbxzVar != null) {
                zzbxzVar.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcoc
    public final void zzz(zzcoa zzcoaVar) {
        this.zzi = zzcoaVar;
    }
}
