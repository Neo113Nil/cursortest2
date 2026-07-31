package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.media3.extractor.ts.TsExtractor;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
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
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes5.dex */
public class zzcev extends WebViewClient implements zzcgi {
    public static final /* synthetic */ int zzc = 0;
    private zzdsm zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzecy zzG;
    private View.OnAttachStateChangeListener zzH;
    protected final zzcek zza;
    protected zzbxf zzb;
    private final zzbbh zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzq zzh;
    private zzcgg zzi;
    private zzcgh zzj;
    private zzbib zzk;
    private zzbid zzl;
    private zzddz zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzac zzw;
    private zzbsa zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbrv zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgg)).split(f.f598a)));

    public zzcev(zzcek zzcekVar, zzbbh zzbbhVar, boolean z, zzbsa zzbsaVar, zzbrv zzbrvVar, zzecy zzecyVar) {
        this.zzd = zzbbhVar;
        this.zza = zzcekVar;
        this.zzs = z;
        this.zzx = zzbsaVar;
        this.zzG = zzecyVar;
    }

    private final void zzaa(final View view, final zzbxf zzbxfVar, final int i) {
        if (!zzbxfVar.zzc() || i <= 0) {
            return;
        }
        zzbxfVar.zzd(view);
        if (zzbxfVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcet
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcev.this.zzS(view, zzbxfVar, i);
                }
            }, 100L);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzac() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaZ)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzad(String str, Map map) throws IOException {
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
                int i2 = zzfqt.zzb;
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
                com.google.android.gms.ads.internal.util.zzs zzc2 = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzcek zzcekVar = this.zza;
                    zzc2.zzb(zzcekVar.getContext(), zzcekVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    webResourceResponse = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    zzlVar.zzc(httpURLConnection, responseCode);
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
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                        webResourceResponse = zzac();
                        break;
                    }
                    if (!protocol.equals("http") && !protocol.equals("https")) {
                        StringBuilder sb = new StringBuilder(protocol.length() + 20);
                        sb.append("Unsupported scheme: ");
                        sb.append(protocol);
                        String sb2 = sb.toString();
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        webResourceResponse = zzac();
                        break;
                    }
                    StringBuilder sb3 = new StringBuilder(headerField.length() + 15);
                    sb3.append("Redirecting to ");
                    sb3.append(headerField);
                    String sb4 = sb3.toString();
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd(sb4);
                    httpURLConnection.disconnect();
                    url = url2;
                } catch (Throwable th) {
                    th = th;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            String trim = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
            com.google.android.gms.ads.internal.zzt.zzc();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i6 = 1;
                    while (true) {
                        if (i6 >= split.length) {
                            break;
                        }
                        if (split[i6].trim().startsWith("charset")) {
                            String[] split2 = split[i6].trim().split(f.b);
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i6++;
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
            webResourceResponse = com.google.android.gms.ads.internal.zzt.zzf().zzc(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            TrafficStats.clearThreadStatsTag();
            return webResourceResponse;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzY(Map map, List list, String str) {
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
            ((zzbjl) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzW(boolean z, long j) {
        this.zza.zzu(z, j);
    }

    private static final boolean zzag(zzcek zzcekVar) {
        return zzcekVar.zzC() != null && zzcekVar.zzC().zzb();
    }

    private static final boolean zzah(boolean z, zzcek zzcekVar) {
        return (!z || zzcekVar.zzN().zzg() || zzcekVar.zzO().equals("interstitial_mb")) ? false : true;
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
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzO(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            zzcek zzcekVar = this.zza;
            if (zzcekVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzcekVar.zzY();
                return;
            }
            this.zzB = true;
            zzcgh zzcghVar = this.zzj;
            if (zzcghVar != null) {
                zzcghVar.zza();
                this.zzj = null;
            }
            zzu();
            zzcek zzcekVar2 = this.zza;
            if (zzcekVar2.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmJ)).booleanValue()) {
                    zzcekVar2.zzL().zzz(str);
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
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzJ(str, Collections.emptyMap());
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
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                    case 127:
                    case 128:
                    case TsExtractor.TS_STREAM_TYPE_AC3 /* 129 */:
                    case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzO(parse);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxf zzbxfVar = this.zzb;
                        if (zzbxfVar != null) {
                            zzbxfVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzddz zzddzVar = this.zzm;
                    if (zzddzVar != null) {
                        zzddzVar.zzdz();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcek zzcekVar = this.zza;
            if (zzcekVar.zzD().willNotDraw()) {
                String.valueOf(str);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzauu zzS = zzcekVar.zzS();
                    zzfdg zzT = zzcekVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || zzT == null) {
                        if (zzS != null && zzS.zza(parse)) {
                            parse = zzS.zzd(parse, zzcekVar.getContext(), (View) zzcekVar, zzcekVar.zzj());
                        }
                    } else if (zzS != null && zzS.zza(parse)) {
                        parse = zzT.zza(parse, zzcekVar.getContext(), (View) zzcekVar, zzcekVar.zzj());
                    }
                } catch (zzauv unused) {
                    String.valueOf(str);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null);
                    zzcek zzcekVar2 = this.zza;
                    zzv(zzcVar, true, false, zzcekVar2 != null ? zzcekVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbrv zzbrvVar = this.zzz;
        boolean zzd = zzbrvVar != null ? zzbrvVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza.getContext(), adOverlayInfoParcel, !zzd, this.zzA);
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxfVar.zzb(str);
        }
    }

    public final void zzB(String str, zzbjl zzbjlVar) {
        synchronized (this.zzf) {
            HashMap hashMap = this.zze;
            List list = (List) hashMap.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                hashMap.put(str, list);
            }
            list.add(zzbjlVar);
        }
    }

    public final void zzC(String str, zzbjl zzbjlVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbjlVar);
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbjl> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbjl zzbjlVar : list) {
                if (predicate.apply(zzbjlVar)) {
                    arrayList.add(zzbjlVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzF() {
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzbxfVar.zzf();
            this.zzb = null;
        }
        zzab();
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
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbrv zzbrvVar = this.zzz;
            if (zzbrvVar != null) {
                zzbrvVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzG(zzcgg zzcggVar) {
        this.zzi = zzcggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzH(zzcgh zzcghVar) {
        this.zzj = zzcghVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final zzdsm zzI() {
        return this.zzA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TRY_ENTER, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02bb A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02d1 A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb A[Catch: all -> 0x01e1, TryCatch #3 {all -> 0x01e1, blocks: (B:41:0x018c, B:43:0x019e, B:44:0x01a5, B:60:0x01e9, B:62:0x01fb, B:63:0x0202), top: B:27:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c A[Catch: Exception | NoClassDefFoundError -> 0x02e5, Exception -> 0x02e7, TryCatch #12 {Exception | NoClassDefFoundError -> 0x02e5, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:11:0x0036, B:13:0x0044, B:15:0x0060, B:17:0x0079, B:19:0x0090, B:20:0x0093, B:21:0x0096, B:24:0x00b2, B:26:0x00c6, B:28:0x00df, B:45:0x01b0, B:46:0x016f, B:49:0x02bb, B:51:0x02cb, B:53:0x02d1, B:55:0x02df, B:70:0x0238, B:71:0x026b, B:64:0x0206, B:66:0x013e, B:86:0x00d3, B:87:0x026c, B:89:0x0276, B:91:0x027c, B:93:0x02af), top: B:2:0x000c }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final WebResourceResponse zzJ(String str, Map map) {
        WebResourceResponse webResourceResponse;
        int i;
        InputStream inputStream;
        InputStream zzb;
        final boolean z;
        final boolean z2;
        String sb;
        try {
            Map hashMap = new HashMap();
            zzcek zzcekVar = this.zza;
            if (zzcekVar.zzC() != null) {
                hashMap = zzcekVar.zzC().zzaw;
            }
            String zza = zzbxt.zza(str, zzcekVar.getContext(), this.zzE, hashMap);
            if (!zza.equals(str)) {
                return zzad(zza, map);
            }
            Parcelable.Creator<zzbat> creator = zzbat.CREATOR;
            zzbat zza2 = zzbat.zza(Uri.parse(str));
            if (zza2 != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
                Uri parse = Uri.parse(str);
                if (parse.getQueryParameterNames().contains("range")) {
                    List zze = zzghq.zza(zzggo.zzc('-')).zze(parse.getQueryParameter("range"));
                    if (zze.size() == 2) {
                        int parseInt = Integer.parseInt((String) zze.get(0));
                        int parseInt2 = Integer.parseInt((String) zze.get(1)) + 1;
                        if (parseInt > 0) {
                            zza2.zzh = parseInt;
                        }
                        i = parseInt2 - parseInt;
                        final boolean z3 = "X-Afma-Gcache-CachedBytes";
                        webResourceResponse = null;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeN)).booleanValue()) {
                            zzbaq zzc2 = com.google.android.gms.ads.internal.zzt.zzj().zzc(zza2);
                            if (zzc2 == null || !zzc2.zza()) {
                                inputStream = null;
                                if (inputStream != null) {
                                    return new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream);
                                }
                            } else {
                                hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzc2.zzd()));
                                hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzc2.zzg()));
                                hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzc2.zze()));
                                hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzc2.zzf()));
                                zzb = zzc2.zzb();
                                if (i != -1) {
                                    zzb = zzgmo.zzb(zzb, i);
                                }
                            }
                        } else {
                            zza2.zzi = zzghs.zza(zzcekVar.zzn());
                            zza2.zzj = zzcekVar.zzp();
                            try {
                                long longValue = (zza2.zzg ? (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeP) : (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeO)).longValue();
                                long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                                com.google.android.gms.ads.internal.zzt.zzz();
                                Future zza3 = zzbbe.zza(zzcekVar.getContext(), zza2);
                                try {
                                    zzbbf zzbbfVar = (zzbbf) zza3.get(longValue, TimeUnit.MILLISECONDS);
                                    try {
                                        try {
                                            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbbfVar.zzc()));
                                            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbbfVar.zzd()));
                                            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbbfVar.zzf()));
                                            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbbfVar.zze()));
                                            zzb = zzbbfVar.zzb();
                                            if (i != -1) {
                                                try {
                                                    zzb = zzgmo.zzb(zzb, i);
                                                } catch (InterruptedException e) {
                                                    e = e;
                                                    z2 = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeS)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    Thread.currentThread().interrupt();
                                                    final long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcep
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcev.this.zzV(z2, elapsedRealtime2);
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
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (ExecutionException e2) {
                                                    e = e2;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeS)).booleanValue()) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdWebViewClient.interceptRequest.gcache");
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcev.this.zzU(z, elapsedRealtime3);
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
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                } catch (TimeoutException e3) {
                                                    e = e3;
                                                    z = true;
                                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeS)).booleanValue()) {
                                                    }
                                                    zza3.cancel(true);
                                                    final long elapsedRealtime32 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                                        @Override // java.lang.Runnable
                                                        public final /* synthetic */ void run() {
                                                            zzcev.this.zzU(z, elapsedRealtime32);
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
                                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                                    }
                                                }
                                            }
                                            final long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            final boolean z4 = true;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z4, elapsedRealtime4) { // from class: com.google.android.gms.internal.ads.zzcen
                                                private final /* synthetic */ long zzb;

                                                {
                                                    this.zzb = elapsedRealtime4;
                                                }

                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzcev.this.zzT(true, this.zzb);
                                                }
                                            });
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(elapsedRealtime4).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(elapsedRealtime4);
                                            sb4.append("ms");
                                            sb = sb4.toString();
                                        } catch (Throwable th) {
                                            th = th;
                                            z3 = 1;
                                            final long elapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzcev.this.zzW(z3, elapsedRealtime5);
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
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeS)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime322 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzcev.this.zzU(z, elapsedRealtime322);
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
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    } catch (TimeoutException e6) {
                                        e = e6;
                                        zzb = null;
                                        z = true;
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeS)).booleanValue()) {
                                        }
                                        zza3.cancel(true);
                                        final long elapsedRealtime3222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzcev.this.zzU(z, elapsedRealtime3222);
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
                                        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                        }
                                    }
                                } catch (InterruptedException e7) {
                                    e = e7;
                                    zzb = null;
                                    z2 = false;
                                } catch (ExecutionException e8) {
                                    e = e8;
                                    zzb = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeS)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime32222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzcev.this.zzU(z, elapsedRealtime32222);
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
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (TimeoutException e9) {
                                    e = e9;
                                    zzb = null;
                                    z = false;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeS)).booleanValue()) {
                                    }
                                    zza3.cancel(true);
                                    final long elapsedRealtime322222 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            zzcev.this.zzU(z, elapsedRealtime322222);
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
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    z3 = 0;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(sb);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        inputStream = zzb;
                        if (inputStream != null) {
                        }
                    }
                }
                i = -1;
                final boolean z32 = "X-Afma-Gcache-CachedBytes";
                webResourceResponse = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeN)).booleanValue()) {
                }
                inputStream = zzb;
                if (inputStream != null) {
                }
            } else {
                webResourceResponse = null;
            }
            return (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbee.zzb.zze()).booleanValue()) ? webResourceResponse : zzad(str, map);
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdWebViewClient.interceptRequest");
            return zzac();
        }
    }

    public final void zzK(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzL() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcek zzcekVar = zzcev.this.zza;
                    zzcekVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzl zzL = zzcekVar.zzL();
                    if (zzL != null) {
                        zzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzM(boolean z) {
        this.zzE = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzN(int i, int i2) {
        zzbrv zzbrvVar = this.zzz;
        if (zzbrvVar != null) {
            zzbrvVar.zze(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzO(Uri uri) {
        String valueOf = String.valueOf(uri);
        String.valueOf(valueOf);
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(valueOf)));
        HashMap hashMap = this.zze;
        String path = uri.getPath();
        List list = (List) hashMap.get(path);
        if (path == null || list == null) {
            String valueOf2 = String.valueOf(uri);
            String.valueOf(valueOf2);
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(valueOf2)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhf)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzcev.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(substring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgf)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgh)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgot.zzq(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcem(this, list, path, uri), zzbzh.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzY(com.google.android.gms.ads.internal.util.zzs.zzU(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzP(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzQ(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzR(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    final /* synthetic */ void zzS(View view, zzbxf zzbxfVar, int i) {
        zzaa(view, zzbxfVar, i - 1);
    }

    final /* synthetic */ void zzT(boolean z, long j) {
        zzW(true, j);
    }

    final /* synthetic */ void zzX(View view, zzbxf zzbxfVar, int i) {
        zzaa(view, zzbxfVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzZ(com.google.android.gms.ads.internal.client.zza zzaVar, zzbib zzbibVar, com.google.android.gms.ads.internal.overlay.zzq zzqVar, zzbid zzbidVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar, boolean z, zzbjo zzbjoVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbsc zzbscVar, zzbxf zzbxfVar, zzecn zzecnVar, zzfjv zzfjvVar, zzdsm zzdsmVar, zzbkg zzbkgVar, zzddz zzddzVar, zzbkf zzbkfVar, zzbjz zzbjzVar, zzbjm zzbjmVar, zzcmi zzcmiVar, zzdtp zzdtpVar, zzcur zzcurVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzbxfVar, null) : zzbVar;
        zzcek zzcekVar = this.zza;
        this.zzz = new zzbrv(zzcekVar, zzbscVar);
        this.zzb = zzbxfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbg)).booleanValue()) {
            zzB("/adMetadata", new zzbia(zzbibVar));
        }
        if (zzbidVar != null) {
            zzB("/appEvent", new zzbic(zzbidVar));
        }
        zzB("/backButton", zzbjk.zzj);
        zzB("/refresh", zzbjk.zzk);
        zzB("/canOpenApp", zzbjk.zzb);
        zzB("/canOpenURLs", zzbjk.zza);
        zzB("/canOpenIntents", zzbjk.zzc);
        zzB("/close", zzbjk.zzd);
        zzB("/customClose", zzbjk.zze);
        zzB("/instrument", zzbjk.zzn);
        zzB("/delayPageLoaded", zzbjk.zzp);
        zzB("/delayPageClosed", zzbjk.zzq);
        zzB("/getLocationInfo", zzbjk.zzr);
        zzB("/log", zzbjk.zzg);
        zzB("/mraid", new zzbjs(zzbVar2, this.zzz, zzbscVar));
        zzbsa zzbsaVar = this.zzx;
        if (zzbsaVar != null) {
            zzB("/mraidLoaded", zzbsaVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbjy(zzbVar3, this.zzz, zzecnVar, zzdsmVar, zzcmiVar, zzcurVar));
        zzB("/precache", new zzccr());
        zzB("/touch", zzbjk.zzi);
        zzB("/video", zzbjk.zzl);
        zzB("/videoMeta", zzbjk.zzm);
        if (zzecnVar == null || zzfjvVar == null) {
            zzB("/click", zzbjk.zzb(zzddzVar, zzcmiVar));
            zzB("/httpTrack", zzbjk.zzf);
        } else {
            zzB("/click", zzfdn.zza(zzecnVar, zzfjvVar, zzcmiVar, zzddzVar));
            zzB("/httpTrack", zzfdn.zzb(zzecnVar, zzfjvVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcekVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcekVar.zzC() != null) {
                hashMap = zzcekVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbjr(zzcekVar.getContext(), hashMap));
        }
        if (zzbjoVar != null) {
            zzB("/setInterstitialProperties", new zzbjn(zzbjoVar));
        }
        if (zzbkgVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbkgVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkb)).booleanValue() && zzbkfVar != null) {
            zzB("/shareSheet", zzbkfVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzio)).booleanValue() && zzdtpVar != null) {
            zzB("/onDeviceStorageEvent", new zzbjt(zzdtpVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue() && zzbjzVar != null) {
            zzB("/inspectorOutOfContextTest", zzbjzVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkl)).booleanValue() && zzbjmVar != null) {
            zzB("/inspectorStorage", zzbjmVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmo)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbjk.zzu);
            zzB("/presentPlayStoreOverlay", zzbjk.zzv);
            zzB("/expandPlayStoreOverlay", zzbjk.zzw);
            zzB("/collapsePlayStoreOverlay", zzbjk.zzx);
            zzB("/closePlayStoreOverlay", zzbjk.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzdI)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbjk.zzA);
            zzB("/resetPAID", zzbjk.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmI)).booleanValue() && zzcekVar.zzC() != null && zzcekVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbjk.zzB);
            zzB("/clearLocalStorageKeys", zzbjk.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzqVar;
        this.zzk = zzbibVar;
        this.zzl = zzbidVar;
        this.zzw = zzacVar;
        this.zzy = zzbVar3;
        this.zzm = zzddzVar;
        this.zzA = zzdsmVar;
        this.zzn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zza(int i, int i2, boolean z) {
        zzbsa zzbsaVar = this.zzx;
        if (zzbsaVar != null) {
            zzbsaVar.zzb(i, i2);
        }
        zzbrv zzbrvVar = this.zzz;
        if (zzbrvVar != null) {
            zzbrvVar.zzc(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzb(zzfcj zzfcjVar) {
        zzcek zzcekVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcekVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbjr(zzcekVar.getContext(), zzfcjVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzc(zzcmi zzcmiVar) {
        zzD("/click");
        zzB("/click", zzbjk.zzb(this.zzm, zzcmiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzd(zzcmi zzcmiVar, zzecn zzecnVar, zzfjv zzfjvVar) {
        zzD("/click");
        if (zzecnVar == null || zzfjvVar == null) {
            zzB("/click", zzbjk.zzb(this.zzm, zzcmiVar));
        } else {
            zzB("/click", zzfdn.zza(zzecnVar, zzfjvVar, zzcmiVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdV() {
        zzddz zzddzVar = this.zzm;
        if (zzddzVar != null) {
            zzddzVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddz
    public final void zzdz() {
        zzddz zzddzVar = this.zzm;
        if (zzddzVar != null) {
            zzddzVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zze(zzcmi zzcmiVar, zzecn zzecnVar, zzdsm zzdsmVar) {
        zzD("/open");
        zzB("/open", new zzbjy(this.zzy, this.zzz, zzecnVar, zzdsmVar, zzcmiVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzj(zzbxf zzbxfVar) {
        this.zzb = zzbxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
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
    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzq() {
        zzbxf zzbxfVar = this.zzb;
        if (zzbxfVar != null) {
            zzcek zzcekVar = this.zza;
            WebView zzD = zzcekVar.zzD();
            if (ViewCompat.isAttachedToWindow(zzD)) {
                zzaa(zzD, zzbxfVar, 10);
                return;
            }
            zzab();
            zzcel zzcelVar = new zzcel(this, zzbxfVar);
            this.zzH = zzcelVar;
            ((View) zzcekVar).addOnAttachStateChangeListener(zzcelVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzs() {
        this.zzD--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcgi
    public final void zzt() {
        zzbbh zzbbhVar = this.zzd;
        if (zzbbhVar != null) {
            zzbbhVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcd)).booleanValue()) {
                zzcek zzcekVar = this.zza;
                if (zzcekVar.zzq() != null) {
                    zzbcp.zza(zzcekVar.zzq().zzc(), zzcekVar.zzi(), "awfllc");
                }
            }
            this.zzi.zza((this.zzC || this.zzo) ? false : true, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        boolean z3;
        zzcek zzcekVar = this.zza;
        boolean zzW = zzcekVar.zzW();
        boolean z4 = false;
        boolean z5 = zzah(zzW, zzcekVar) || z2;
        if (z5 || !z) {
            z3 = zzW;
            z4 = true;
        } else {
            z3 = zzW;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z5 ? null : this.zzg, z3 ? null : this.zzh, this.zzw, zzcekVar.zzs(), zzcekVar, z4 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzecy zzecyVar = this.zzG;
        zzcek zzcekVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcekVar, zzcekVar.zzs(), str, str2, 14, zzecyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbsp] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z, int i, boolean z2) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzddz zzddzVar;
        ?? r9;
        int i2;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z3;
        zzcek zzcekVar = this.zza;
        boolean zzah = zzah(zzcekVar.zzW(), zzcekVar);
        boolean z4 = true;
        if (!zzah && z2) {
            z4 = false;
        }
        if (zzah) {
            zzaVar = null;
            zzddzVar = null;
        } else {
            zzaVar = this.zzg;
            zzddzVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzq zzqVar = this.zzh;
        zzddz zzddzVar2 = zzddzVar;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        VersionInfoParcel zzs = zzcekVar.zzs();
        zzddz zzddzVar3 = z4 ? zzddzVar2 : this.zzm;
        if (zzag(zzcekVar)) {
            r9 = this.zzG;
            z3 = z;
            i2 = i;
            zzaVar2 = zzaVar;
        } else {
            r9 = zzddzVar2;
            i2 = i;
            zzaVar2 = zzaVar;
            z3 = z;
        }
        zzA(new AdOverlayInfoParcel(zzaVar2, zzqVar, zzacVar, zzcekVar, z3, i2, zzs, zzddzVar3, r9));
    }

    public final void zzy(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcek zzcekVar = this.zza;
        boolean zzW = zzcekVar.zzW();
        boolean zzah = zzah(zzW, zzcekVar);
        boolean z4 = true;
        if (!zzah && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzah ? null : this.zzg;
        zzceu zzceuVar = zzW ? null : new zzceu(zzcekVar, this.zzh);
        zzbib zzbibVar = this.zzk;
        zzecy zzecyVar = null;
        zzbid zzbidVar = this.zzl;
        boolean z5 = z4;
        zzceu zzceuVar2 = zzceuVar;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        VersionInfoParcel zzs = zzcekVar.zzs();
        zzddz zzddzVar = z5 ? null : this.zzm;
        if (zzag(zzcekVar)) {
            zzecyVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzceuVar2, zzbibVar, zzbidVar, zzacVar, zzcekVar, z, i, str, zzs, zzddzVar, zzecyVar, z3));
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzcek zzcekVar = this.zza;
        boolean zzW = zzcekVar.zzW();
        boolean zzah = zzah(zzW, zzcekVar);
        boolean z3 = true;
        if (!zzah && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zzah ? null : this.zzg;
        zzceu zzceuVar = zzW ? null : new zzceu(zzcekVar, this.zzh);
        zzbib zzbibVar = this.zzk;
        zzecy zzecyVar = null;
        zzbid zzbidVar = this.zzl;
        boolean z4 = z3;
        zzceu zzceuVar2 = zzceuVar;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        VersionInfoParcel zzs = zzcekVar.zzs();
        zzddz zzddzVar = z4 ? null : this.zzm;
        if (zzag(zzcekVar)) {
            zzecyVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzceuVar2, zzbibVar, zzbidVar, zzacVar, zzcekVar, z, i, str, str2, zzs, zzddzVar, zzecyVar));
    }
}
