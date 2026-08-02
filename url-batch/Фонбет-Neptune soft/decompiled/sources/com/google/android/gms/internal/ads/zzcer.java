package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.net.HttpHeaders;
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
import javax.annotation.ParametersAreNonnullByDefault;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class zzcer extends WebViewClient implements zzcgb {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzeds zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbxl zza;
    private final zzcej zzc;
    private final zzbav zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzp zzh;
    private zzcfz zzi;
    private zzcga zzj;
    private zzbhn zzk;
    private zzbhp zzl;
    private zzdeq zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzaa zzv;
    private zzbrp zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrk zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfb)).split(",")));

    public zzcer(zzcej zzcejVar, zzbav zzbavVar, boolean z, zzbrp zzbrpVar, zzbrk zzbrkVar, zzeds zzedsVar) {
        this.zzd = zzbavVar;
        this.zzc = zzcejVar;
        this.zzs = z;
        this.zzw = zzbrpVar;
        this.zzE = zzedsVar;
    }

    private static WebResourceResponse zzS() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaB)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzT(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
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
                com.google.android.gms.ads.internal.zzu.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, 60000);
                webResourceResponse = null;
                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    break;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Protocol is null");
                    webResourceResponse = zzS();
                    break;
                }
                if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unsupported scheme: " + protocol);
                    webResourceResponse = zzS();
                    break;
                }
                com.google.android.gms.ads.internal.util.client.zzm.zze("Redirecting to " + headerField);
                httpURLConnection.disconnect();
                url = url2;
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.zzu.zzp();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzu.zzp();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i2 = 1;
                    while (true) {
                        if (i2 >= split.length) {
                            break;
                        }
                        if (split[i2].trim().startsWith("charset")) {
                            String[] split2 = split[i2].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i2++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            webResourceResponse = com.google.android.gms.ads.internal.zzu.zzq().zzb(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            return webResourceResponse;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbix) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzV() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzW(final View view, final zzbxl zzbxlVar, final int i) {
        if (!zzbxlVar.zzi() || i <= 0) {
            return;
        }
        zzbxlVar.zzg(view);
        if (zzbxlVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcek
                @Override // java.lang.Runnable
                public final void run() {
                    zzcer.this.zzp(view, zzbxlVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzX(zzcej zzcejVar) {
        if (zzcejVar.zzD() != null) {
            return zzcejVar.zzD().zzai;
        }
        return false;
    }

    private static final boolean zzY(boolean z, zzcej zzcejVar) {
        return (!z || zzcejVar.zzO().zzi() || zzcejVar.zzU().equals("interstitial_mb")) ? false : true;
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
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaE()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzX();
                return;
            }
            this.zzz = true;
            zzcga zzcgaVar = this.zzj;
            if (zzcgaVar != null) {
                zzcgaVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkV)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcej zzcejVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcejVar.zzaD(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
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
                    case 127:
                    case 128:
                    case Opcodes.LOR /* 129 */:
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
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxl zzbxlVar = this.zza;
                        if (zzbxlVar != null) {
                            zzbxlVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdeq zzdeqVar = this.zzm;
                    if (zzdeqVar != null) {
                        zzdeqVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzauo zzI = this.zzc.zzI();
                    zzffk zzS = this.zzc.zzS();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzla)).booleanValue() || zzS == null) {
                        if (zzI != null && zzI.zzf(parse)) {
                            Context context = this.zzc.getContext();
                            zzcej zzcejVar = this.zzc;
                            parse = zzI.zza(parse, context, (View) zzcejVar, zzcejVar.zzi());
                        }
                    } else if (zzI != null && zzI.zzf(parse)) {
                        Context context2 = this.zzc.getContext();
                        zzcej zzcejVar2 = this.zzc;
                        parse = zzS.zza(parse, context2, (View) zzcejVar2, zzcejVar2.zzi());
                    }
                } catch (zzaup unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzu(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true, false);
                } else {
                    this.zzx.zzb(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, zzbix zzbixVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbixVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzB(zzcfz zzcfzVar) {
        this.zzi = zzcfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzC(int i, int i2) {
        zzbrk zzbrkVar = this.zzy;
        if (zzbrkVar != null) {
            zzbrkVar.zze(i, i2);
        }
    }

    public final void zzD(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbzo.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
                @Override // java.lang.Runnable
                public final void run() {
                    zzcer.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzH(zzcga zzcgaVar) {
        this.zzj = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzI(zzcni zzcniVar, zzedh zzedhVar, zzfll zzfllVar) {
        zzL("/click");
        if (zzedhVar == null || zzfllVar == null) {
            zzA("/click", new zzbhv(this.zzm, zzcniVar));
        } else {
            zzA("/click", new zzffo(this.zzm, zzcniVar, zzfllVar, zzedhVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzJ(zzcni zzcniVar) {
        zzL("/click");
        zzA("/click", new zzbhv(this.zzm, zzcniVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzK(zzcni zzcniVar, zzedh zzedhVar, zzdsk zzdskVar) {
        zzL("/open");
        zzA("/open", new zzbjj(this.zzx, this.zzy, zzedhVar, zzdskVar, zzcniVar));
    }

    public final void zzL(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzM(String str, zzbix zzbixVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbixVar);
        }
    }

    public final void zzN(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbix> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbix zzbixVar : list) {
                if (predicate.apply(zzbixVar)) {
                    arrayList.add(zzbixVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzO() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final boolean zzP() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzQ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzR(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhn zzbhnVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbhp zzbhpVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, boolean z, zzbja zzbjaVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbrr zzbrrVar, zzbxl zzbxlVar, final zzedh zzedhVar, final zzfll zzfllVar, zzdsk zzdskVar, zzbjr zzbjrVar, zzdeq zzdeqVar, zzbjq zzbjqVar, zzbjk zzbjkVar, zzbiy zzbiyVar, zzcni zzcniVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxlVar, null) : zzbVar;
        this.zzy = new zzbrk(this.zzc, zzbrrVar);
        this.zza = zzbxlVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzaI)).booleanValue()) {
            zzA("/adMetadata", new zzbhm(zzbhnVar));
        }
        if (zzbhpVar != null) {
            zzA("/appEvent", new zzbho(zzbhpVar));
        }
        zzA("/backButton", zzbiw.zzj);
        zzA("/refresh", zzbiw.zzk);
        zzA("/canOpenApp", zzbiw.zzb);
        zzA("/canOpenURLs", zzbiw.zza);
        zzA("/canOpenIntents", zzbiw.zzc);
        zzA("/close", zzbiw.zzd);
        zzA("/customClose", zzbiw.zze);
        zzA("/instrument", zzbiw.zzn);
        zzA("/delayPageLoaded", zzbiw.zzp);
        zzA("/delayPageClosed", zzbiw.zzq);
        zzA("/getLocationInfo", zzbiw.zzr);
        zzA("/log", zzbiw.zzg);
        zzA("/mraid", new zzbje(zzbVar2, this.zzy, zzbrrVar));
        zzbrp zzbrpVar = this.zzw;
        if (zzbrpVar != null) {
            zzA("/mraidLoaded", zzbrpVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzA("/open", new zzbjj(zzbVar2, this.zzy, zzedhVar, zzdskVar, zzcniVar));
        zzA("/precache", new zzccw());
        zzA("/touch", zzbiw.zzi);
        zzA("/video", zzbiw.zzl);
        zzA("/videoMeta", zzbiw.zzm);
        if (zzedhVar == null || zzfllVar == null) {
            zzA("/click", new zzbhv(zzdeqVar, zzcniVar));
            zzA("/httpTrack", zzbiw.zzf);
        } else {
            zzA("/click", new zzffo(zzdeqVar, zzcniVar, zzfllVar, zzedhVar));
            zzA("/httpTrack", new zzbix() { // from class: com.google.android.gms.internal.ads.zzffp
                @Override // com.google.android.gms.internal.ads.zzbix
                public final void zza(Object obj, Map map) {
                    zzcea zzceaVar = (zzcea) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzceaVar.zzD().zzai) {
                        zzedhVar.zzd(new zzedj(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), ((zzcfm) zzceaVar).zzR().zzb, str, 2));
                    } else {
                        zzfll.this.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zzc.getContext())) {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            zzA("/logScionEvent", new zzbjd(this.zzc.getContext(), hashMap));
        }
        if (zzbjaVar != null) {
            zzA("/setInterstitialProperties", new zzbiz(zzbjaVar));
        }
        if (zzbjrVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzia)).booleanValue()) {
                zzA("/inspectorNetworkExtras", zzbjrVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzit)).booleanValue() && zzbjqVar != null) {
            zzA("/shareSheet", zzbjqVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziy)).booleanValue() && zzbjkVar != null) {
            zzA("/inspectorOutOfContextTest", zzbjkVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziC)).booleanValue() && zzbiyVar != null) {
            zzA("/inspectorStorage", zzbiyVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkD)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzbiw.zzu);
            zzA("/presentPlayStoreOverlay", zzbiw.zzv);
            zzA("/expandPlayStoreOverlay", zzbiw.zzw);
            zzA("/collapsePlayStoreOverlay", zzbiw.zzx);
            zzA("/closePlayStoreOverlay", zzbiw.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzcT)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzbiw.zzA);
            zzA("/resetPAID", zzbiw.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkU)).booleanValue()) {
            zzcej zzcejVar = this.zzc;
            if (zzcejVar.zzD() != null && zzcejVar.zzD().zzar) {
                zzA("/writeToLocalStorage", zzbiw.zzB);
                zzA("/clearLocalStorageKeys", zzbiw.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzpVar;
        this.zzk = zzbhnVar;
        this.zzl = zzbhpVar;
        this.zzv = zzaaVar;
        this.zzx = zzbVar3;
        this.zzm = zzdeqVar;
        this.zzn = z;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TRY_ENTER, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0289 A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e1 A[Catch: all -> 0x01c8, TryCatch #0 {all -> 0x01c8, blocks: (B:41:0x017d, B:43:0x018f, B:44:0x0196, B:53:0x01cf, B:55:0x01e1, B:56:0x01e8), top: B:27:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023a A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029e A[Catch: NoClassDefFoundError -> 0x02b3, Exception | NoClassDefFoundError -> 0x02b5, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02b5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x0021, B:8:0x0033, B:11:0x003a, B:13:0x0046, B:15:0x0062, B:17:0x007b, B:19:0x0092, B:20:0x0095, B:21:0x0098, B:24:0x00b2, B:26:0x00ca, B:28:0x00e3, B:45:0x01a1, B:46:0x01c4, B:49:0x0289, B:63:0x0213, B:64:0x0239, B:57:0x01ec, B:59:0x0143, B:79:0x00d7, B:80:0x023a, B:82:0x0244, B:84:0x024a, B:86:0x027d, B:90:0x0298, B:92:0x029e, B:94:0x02ac), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b1 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final WebResourceResponse zzc(String str, Map map) {
        int i;
        InputStream inputStream;
        InputStream inputStream2;
        final boolean z;
        final boolean z2;
        String str2;
        try {
            Map hashMap = new HashMap();
            if (this.zzc.zzD() != null) {
                hashMap = this.zzc.zzD().zzaw;
            }
            String zzc = zzbyc.zzc(str, this.zzc.getContext(), this.zzC, hashMap);
            if (!zzc.equals(str)) {
                return zzT(zzc, map);
            }
            zzbah zza = zzbah.zza(Uri.parse(str));
            if (zza != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, ProxyConfig.MATCH_ALL_SCHEMES);
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    List zze = zzfvh.zzb(zzfui.zzc(SignatureVisitor.SUPER)).zze(parse.getQueryParameter("range"));
                    if (zze.size() == 2) {
                        int parseInt = Integer.parseInt((String) zze.get(0));
                        int parseInt2 = Integer.parseInt((String) zze.get(1)) + 1;
                        if (parseInt > 0) {
                            zza.zzh = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        final boolean z3 = "X-Afma-Gcache-CachedBytes";
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdQ)).booleanValue()) {
                            zzbae zzb2 = com.google.android.gms.ads.internal.zzu.zzc().zzb(zza);
                            if (zzb2 == null || !zzb2.zze()) {
                                inputStream = null;
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzb2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzb2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzb2.zzf()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzb2.zza()));
                                InputStream zzc2 = zzb2.zzc();
                                inputStream = i != -1 ? zzgab.zza(zzc2, i) : zzc2;
                            }
                        } else {
                            zza.zzi = zzfvj.zzc(this.zzc.zzr());
                            zza.zzj = this.zzc.zzf();
                            try {
                                long longValue = (zza.zzg ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdS) : (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdR)).longValue();
                                long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
                                com.google.android.gms.ads.internal.zzu.zzd();
                                Future zza2 = zzbas.zza(this.zzc.getContext(), zza);
                                try {
                                    zzbat zzbatVar = (zzbat) zza2.get(longValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbatVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbatVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbatVar.zze()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbatVar.zza()));
                                            inputStream2 = zzbatVar.zzc();
                                            if (i != -1) {
                                                try {
                                                    inputStream2 = zzgab.zza(inputStream2, i);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    z2 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdV)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza2.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    final long elapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            zzcer.this.zzo(z2, elapsedRealtime2);
                                                        }
                                                    });
                                                    str2 = "Cache connection took " + elapsedRealtime2 + "ms";
                                                    com.google.android.gms.ads.internal.util.zze.zza(str2);
                                                    inputStream = inputStream2;
                                                    if (inputStream != null) {
                                                    }
                                                    return !com.google.android.gms.ads.internal.util.client.zzl.zzk() ? null : null;
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdV)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza2.cancel(true);
                                                    final long elapsedRealtime3 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            zzcer.this.zzo(z, elapsedRealtime3);
                                                        }
                                                    });
                                                    str2 = "Cache connection took " + elapsedRealtime3 + "ms";
                                                    com.google.android.gms.ads.internal.util.zze.zza(str2);
                                                    inputStream = inputStream2;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                                    }
                                                } catch (TimeoutException e3) {
                                                    e = e3;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdV)).booleanValue()) {
                                                    }
                                                    zza2.cancel(true);
                                                    final long elapsedRealtime32 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            zzcer.this.zzo(z, elapsedRealtime32);
                                                        }
                                                    });
                                                    str2 = "Cache connection took " + elapsedRealtime32 + "ms";
                                                    com.google.android.gms.ads.internal.util.zze.zza(str2);
                                                    inputStream = inputStream2;
                                                    if (inputStream != null) {
                                                    }
                                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                                    }
                                                }
                                            }
                                            final long elapsedRealtime4 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                            final boolean z4 = true;
                                            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzcer.this.zzo(z4, elapsedRealtime4);
                                                }
                                            });
                                            str2 = "Cache connection took " + elapsedRealtime4 + "ms";
                                        } catch (Throwable th) {
                                            th = th;
                                            z3 = 1;
                                            final long elapsedRealtime5 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    zzcer.this.zzo(z3, elapsedRealtime5);
                                                }
                                            });
                                            com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + elapsedRealtime5 + "ms");
                                            throw th;
                                        }
                                    } catch (InterruptedException e4) {
                                        e = e4;
                                        inputStream2 = null;
                                    } catch (ExecutionException e5) {
                                        e = e5;
                                        inputStream2 = null;
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdV)).booleanValue()) {
                                        }
                                        zza2.cancel(true);
                                        final long elapsedRealtime322 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzcer.this.zzo(z, elapsedRealtime322);
                                            }
                                        });
                                        str2 = "Cache connection took " + elapsedRealtime322 + "ms";
                                        com.google.android.gms.ads.internal.util.zze.zza(str2);
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                        }
                                        if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                        }
                                    } catch (TimeoutException e6) {
                                        e = e6;
                                        inputStream2 = null;
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdV)).booleanValue()) {
                                        }
                                        zza2.cancel(true);
                                        final long elapsedRealtime3222 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzcer.this.zzo(z, elapsedRealtime3222);
                                            }
                                        });
                                        str2 = "Cache connection took " + elapsedRealtime3222 + "ms";
                                        com.google.android.gms.ads.internal.util.zze.zza(str2);
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                        }
                                        if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                        }
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    inputStream2 = null;
                                    z2 = false;
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    inputStream2 = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdV)).booleanValue()) {
                                    }
                                    zza2.cancel(true);
                                    final long elapsedRealtime32222 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcer.this.zzo(z, elapsedRealtime32222);
                                        }
                                    });
                                    str2 = "Cache connection took " + elapsedRealtime32222 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.zza(str2);
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                    }
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    inputStream2 = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdV)).booleanValue()) {
                                    }
                                    zza2.cancel(true);
                                    final long elapsedRealtime322222 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzcer.this.zzo(z, elapsedRealtime322222);
                                        }
                                    });
                                    str2 = "Cache connection took " + elapsedRealtime322222 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.zza(str2);
                                    inputStream = inputStream2;
                                    if (inputStream != null) {
                                    }
                                    if (!com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z3 = 0;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(str2);
                                inputStream = inputStream2;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        if (inputStream != null) {
                            return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                        }
                    }
                }
                i = -1;
                final boolean z32 = "X-Afma-Gcache-CachedBytes";
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdQ)).booleanValue()) {
                }
                if (inputStream != null) {
                }
            }
            if (!com.google.android.gms.ads.internal.util.client.zzl.zzk() && ((Boolean) zzbdo.zzb.zze()).booleanValue()) {
                return zzT(str, map);
            }
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e10, "AdWebViewClient.interceptRequest");
            return zzS();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdG() {
        zzdeq zzdeqVar = this.zzm;
        if (zzdeqVar != null) {
            zzdeqVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzdf() {
        zzdeq zzdeqVar = this.zzm;
        if (zzdeqVar != null) {
            zzdeqVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbG)).booleanValue() && this.zzc.zzm() != null) {
                zzbcd.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcfz zzcfzVar = this.zzi;
            boolean z = false;
            if (!this.zzA && !this.zzo) {
                z = true;
            }
            zzcfzVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzh() {
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            zzbxlVar.zze();
            this.zza = null;
        }
        zzV();
        synchronized (this.zzf) {
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
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbrk zzbrkVar = this.zzy;
            if (zzbrkVar != null) {
                zzbrkVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzj(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(String.valueOf(uri))));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgb)).booleanValue() || com.google.android.gms.ads.internal.zzu.zzo().zzg() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzbzo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcem
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzcer.zzb;
                    com.google.android.gms.ads.internal.zzu.zzo().zzg().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfa)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzfc)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgcj.zzr(com.google.android.gms.ads.internal.zzu.zzp().zzb(uri), new zzcep(this, list, path, uri), zzbzo.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        zzU(com.google.android.gms.ads.internal.util.zzt.zzP(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzk() {
        zzbav zzbavVar = this.zzd;
        if (zzbavVar != null) {
            zzbavVar.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    final /* synthetic */ void zzn() {
        this.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    final /* synthetic */ void zzo(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    final /* synthetic */ void zzp(View view, zzbxl zzbxlVar, int i) {
        zzW(view, zzbxlVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzq(int i, int i2, boolean z) {
        zzbrp zzbrpVar = this.zzw;
        if (zzbrpVar != null) {
            zzbrpVar.zzb(i, i2);
        }
        zzbrk zzbrkVar = this.zzy;
        if (zzbrkVar != null) {
            zzbrkVar.zzd(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgb
    public final void zzr() {
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            WebView zzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(zzG)) {
                zzW(zzG, zzbxlVar, 10);
                return;
            }
            zzV();
            zzceo zzceoVar = new zzceo(this, zzbxlVar);
            this.zzF = zzceoVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzceoVar);
        }
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2) {
        zzcej zzcejVar = this.zzc;
        boolean zzaF = zzcejVar.zzaF();
        boolean z3 = zzY(zzaF, zzcejVar) || z2;
        boolean z4 = z3 || !z;
        com.google.android.gms.ads.internal.client.zza zzaVar = z3 ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = zzaF ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcVar, zzaVar, zzpVar, zzaaVar, zzcejVar2.zzn(), zzcejVar2, z4 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i) {
        zzeds zzedsVar = this.zzE;
        zzcej zzcejVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcejVar, zzcejVar.zzn(), str, str2, 14, zzedsVar));
    }

    public final void zzw(boolean z, int i, boolean z2) {
        zzcej zzcejVar = this.zzc;
        boolean zzY = zzY(zzcejVar.zzaF(), zzcejVar);
        boolean z3 = true;
        if (!zzY && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzY ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzpVar, zzaaVar, zzcejVar2, z, i, zzcejVar2.zzn(), z3 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbrk zzbrkVar = this.zzy;
        boolean zzf = zzbrkVar != null ? zzbrkVar.zzf() : false;
        com.google.android.gms.ads.internal.zzu.zzi();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zzf);
        zzbxl zzbxlVar = this.zza;
        if (zzbxlVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxlVar.zzh(str);
        }
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) {
        zzcej zzcejVar = this.zzc;
        boolean zzaF = zzcejVar.zzaF();
        boolean zzY = zzY(zzaF, zzcejVar);
        boolean z3 = true;
        if (!zzY && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzY ? null : this.zzg;
        zzceq zzceqVar = zzaF ? null : new zzceq(this.zzc, this.zzh);
        zzbhn zzbhnVar = this.zzk;
        zzbhp zzbhpVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzceqVar, zzbhnVar, zzbhpVar, zzaaVar, zzcejVar2, z, i, str, str2, zzcejVar2.zzn(), z3 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null));
    }

    public final void zzz(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcej zzcejVar = this.zzc;
        boolean zzaF = zzcejVar.zzaF();
        boolean zzY = zzY(zzaF, zzcejVar);
        boolean z4 = true;
        if (!zzY && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzY ? null : this.zzg;
        zzceq zzceqVar = zzaF ? null : new zzceq(this.zzc, this.zzh);
        zzbhn zzbhnVar = this.zzk;
        zzbhp zzbhpVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcej zzcejVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzceqVar, zzbhnVar, zzbhpVar, zzaaVar, zzcejVar2, z, i, str, zzcejVar2.zzn(), z4 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null, z3));
    }
}
