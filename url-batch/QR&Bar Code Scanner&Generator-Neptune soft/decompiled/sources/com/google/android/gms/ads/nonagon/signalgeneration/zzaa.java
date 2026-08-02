package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzcom;
import com.google.android.gms.internal.ads.zzdck;
import com.google.android.gms.internal.ads.zzdik;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import com.google.android.gms.internal.ads.zzfed;
import com.google.android.gms.internal.ads.zzffb;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzfym;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zzfzq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
public final class zzaa extends zzcff {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcgv zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzcom zzf;
    private Context zzg;
    private final zzape zzh;
    private final zzffb zzi;
    private final zzfzq zzk;
    private final ScheduledExecutorService zzl;
    private zzcaa zzm;
    private final zzc zzq;
    private final zzdxv zzr;
    private final zzfkm zzs;
    private zzdxl zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzay.zzc().zzb(zzbjc.zzgq)).booleanValue();
    private final boolean zzu = ((Boolean) zzay.zzc().zzb(zzbjc.zzgp)).booleanValue();
    private final boolean zzv = ((Boolean) zzay.zzc().zzb(zzbjc.zzgr)).booleanValue();
    private final boolean zzw = ((Boolean) zzay.zzc().zzb(zzbjc.zzgt)).booleanValue();
    private final String zzx = (String) zzay.zzc().zzb(zzbjc.zzgs);
    private final String zzy = (String) zzay.zzc().zzb(zzbjc.zzgu);
    private final String zzC = (String) zzay.zzc().zzb(zzbjc.zzgv);

    public zzaa(zzcom zzcomVar, Context context, zzape zzapeVar, zzffb zzffbVar, zzfzq zzfzqVar, ScheduledExecutorService scheduledExecutorService, zzdxv zzdxvVar, zzfkm zzfkmVar, zzcgv zzcgvVar) {
        List list;
        this.zzf = zzcomVar;
        this.zzg = context;
        this.zzh = zzapeVar;
        this.zzi = zzffbVar;
        this.zzk = zzfzqVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcomVar.zzm();
        this.zzr = zzdxvVar;
        this.zzs = zzfkmVar;
        this.zzA = zzcgvVar;
        if (((Boolean) zzay.zzc().zzb(zzbjc.zzgw)).booleanValue()) {
            this.zzD = zzX((String) zzay.zzc().zzb(zzbjc.zzgx));
            this.zzE = zzX((String) zzay.zzc().zzb(zzbjc.zzgy));
            this.zzF = zzX((String) zzay.zzc().zzb(zzbjc.zzgz));
            list = zzX((String) zzay.zzc().zzb(zzbjc.zzgA));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzG(final zzaa zzaaVar, final String str, final String str2, final zzdxl zzdxlVar) {
        if (((Boolean) zzay.zzc().zzb(zzbjc.zzga)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbjc.zzgg)).booleanValue()) {
                zzchc.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaa.this.zzI(str, str2, zzdxlVar);
                    }
                });
            } else {
                zzaaVar.zzq.zzd(str, str2, zzdxlVar);
            }
        }
    }

    static final /* synthetic */ Uri zzP(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzW(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        char c;
        zzfed zzfedVar = new zzfed();
        if (((Boolean) zzay.zzc().zzb(zzbjc.zzgC)).booleanValue()) {
            if ("REWARDED".equals(str2)) {
                zzfedVar.zzo().zza(2);
            } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
                zzfedVar.zzo().zza(3);
            }
        }
        zzg zzn = this.zzf.zzn();
        zzdck zzdckVar = new zzdck();
        zzdckVar.zzc(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfedVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfedVar.zzE(zzlVar);
        if (zzqVar == null) {
            if (((Boolean) zzay.zzc().zzb(zzbjc.zzgC)).booleanValue()) {
                switch (str2.hashCode()) {
                    case -1999289321:
                        if (str2.equals("NATIVE")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 543046670:
                        if (str2.equals("REWARDED")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1854800829:
                        if (str2.equals("REWARDED_INTERSTITIAL")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1951953708:
                        if (str2.equals("BANNER")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                zzqVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzq.zzd() : c != 3 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzc() : new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
            } else {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq();
            }
        }
        zzfedVar.zzr(zzqVar);
        zzfedVar.zzx(true);
        zzdckVar.zzf(zzfedVar.zzG());
        zzn.zza(zzdckVar.zzg());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzn.zzb(new zzae(zzacVar, null));
        new zzdik();
        zzh zzc2 = zzn.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final zzfzp zzR(final String str) {
        final zzdtn[] zzdtnVarArr = new zzdtn[1];
        zzfzp zzn = zzfzg.zzn(this.zzi.zza(), new zzfyn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzaa.this.zzv(zzdtnVarArr, str, (zzdtn) obj);
            }
        }, this.zzk);
        zzn.zzc(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzaa.this.zzH(zzdtnVarArr);
            }
        }, this.zzk);
        return zzfzg.zzf(zzfzg.zzm((zzfyx) zzfzg.zzo(zzfyx.zzv(zzn), ((Integer) zzay.zzc().zzb(zzbjc.zzgG)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfsm() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfsm() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                int i = zzaa.zze;
                zzcgp.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbzr zzbzrVar, boolean z) {
        zzfzp zzb2;
        if (!((Boolean) zzay.zzc().zzb(zzbjc.zzgF)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzj("The updating URL feature is not enabled.");
            try {
                zzbzrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcgp.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.zze.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzN(uri)) {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzaa.this.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzV()) {
                    zzb2 = zzfzg.zzn(zzb2, new zzfyn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.zzfyn
                        public final zzfzp zza(Object obj) {
                            zzfzp zzm;
                            zzm = zzfzg.zzm(r0.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfsm() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                                @Override // com.google.android.gms.internal.ads.zzfsm
                                public final Object apply(Object obj2) {
                                    return zzaa.zzP(r2, (String) obj2);
                                }
                            }, zzaa.this.zzk);
                            return zzm;
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.zze.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                zzb2 = zzfzg.zzi(uri);
            }
            arrayList.add(zzb2);
        }
        zzfzg.zzr(zzfzg.zze(arrayList), new zzy(this, zzbzrVar, z), this.zzf.zzA());
    }

    private final void zzT(final List list, final IObjectWrapper iObjectWrapper, zzbzr zzbzrVar, boolean z) {
        if (!((Boolean) zzay.zzc().zzb(zzbjc.zzgF)).booleanValue()) {
            try {
                zzbzrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzcgp.zzh("", e);
                return;
            }
        }
        zzfzp zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaa.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzV()) {
            zzb2 = zzfzg.zzn(zzb2, new zzfyn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    return zzaa.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.zze.zzi("Asset view map is empty.");
        }
        zzfzg.zzr(zzb2, new zzx(this, zzbzrVar, z), this.zzf.zzA());
    }

    private static boolean zzU(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        Map map;
        zzcaa zzcaaVar = this.zzm;
        return (zzcaaVar == null || (map = zzcaaVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzW(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    private static final List zzX(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzftm.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfju zzr(zzfzp zzfzpVar, zzcfk zzcfkVar) {
        if (!zzfjw.zza() || !((Boolean) zzbkl.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfju zzb2 = ((zzh) zzfzg.zzp(zzfzpVar)).zzb();
            zzb2.zzd(new ArrayList(Collections.singletonList(zzcfkVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzcfkVar.zzd;
            zzb2.zzb(zzlVar == null ? "" : zzlVar.zzp);
            return zzb2;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzO(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzW(uri, "nas", str));
            }
        }
        return arrayList;
    }

    final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(zzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri)) {
                arrayList.add(zzW(uri, "ms", zzh));
            } else {
                com.google.android.gms.ads.internal.util.zze.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void zzH(zzdtn[] zzdtnVarArr) {
        zzdtn zzdtnVar = zzdtnVarArr[0];
        if (zzdtnVar != null) {
            this.zzi.zzb(zzfzg.zzi(zzdtnVar));
        }
    }

    final /* synthetic */ void zzI(String str, String str2, zzdxl zzdxlVar) {
        this.zzq.zzd(str, str2, zzdxlVar);
    }

    final boolean zzN(Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    final boolean zzO(Uri uri) {
        return zzU(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zze(IObjectWrapper iObjectWrapper, final zzcfk zzcfkVar, zzcfd zzcfdVar) {
        zzfzp zzc2;
        zzfzp zzfzpVar;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfjj zza2 = zzfji.zza(context, 22);
        zza2.zzf();
        if (((Boolean) zzay.zzc().zzb(zzbjc.zziH)).booleanValue()) {
            zzfzp zzb2 = zzchc.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzaa.this.zzq(zzcfkVar);
                }
            });
            zzfzpVar = zzb2;
            zzc2 = zzfzg.zzn(zzb2, new zzfyn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.zzfyn
                public final zzfzp zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzchc.zza);
        } else {
            zzh zzQ = zzQ(this.zzg, zzcfkVar.zza, zzcfkVar.zzb, zzcfkVar.zzc, zzcfkVar.zzd);
            zzfzp zzi = zzfzg.zzi(zzQ);
            zzc2 = zzQ.zzc();
            zzfzpVar = zzi;
        }
        zzfzg.zzr(zzc2, new zzw(this, zzfzpVar, zzcfkVar, zzcfdVar, zza2, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzA());
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzf(zzcaa zzcaaVar) {
        this.zzm = zzcaaVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) {
        zzS(list, iObjectWrapper, zzbzrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) {
        zzT(list, iObjectWrapper, zzbzrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzi(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.zzc().zzb(zzbjc.zzib)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                com.google.android.gms.ads.internal.util.zze.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) zzay.zzc().zzb(zzbjc.zzic)).booleanValue()) {
                zzfzg.zzr(((Boolean) zzay.zzc().zzb(zzbjc.zziH)).booleanValue() ? zzfzg.zzl(new zzfym() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                    @Override // com.google.android.gms.internal.ads.zzfym
                    public final zzfzp zza() {
                        return zzaa.this.zzu();
                    }
                }, zzchc.zza) : zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc(), new zzz(this), this.zzf.zzA());
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.zze.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                com.google.android.gms.ads.internal.util.zze.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr), "gmaSdk");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzay.zzc().zzb(zzbjc.zzgF)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzcaa zzcaaVar = this.zzm;
            this.zzn = zzbx.zza(motionEvent, zzcaaVar == null ? null : zzcaaVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) {
        zzS(list, iObjectWrapper, zzbzrVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfg
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzrVar) {
        zzT(list, iObjectWrapper, zzbzrVar, false);
    }

    final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzapf e) {
            zzcgp.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ zzh zzq(zzcfk zzcfkVar) throws Exception {
        return zzQ(this.zzg, zzcfkVar.zza, zzcfkVar.zzb, zzcfkVar.zzc, zzcfkVar.zzd);
    }

    final /* synthetic */ zzfzp zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    final /* synthetic */ zzfzp zzv(zzdtn[] zzdtnVarArr, String str, zzdtn zzdtnVar) throws Exception {
        zzdtnVarArr[0] = zzdtnVar;
        Context context = this.zzg;
        zzcaa zzcaaVar = this.zzm;
        Map map = zzcaaVar.zzb;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzcaaVar.zza);
        JSONObject zzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbx.zzf(this.zzm.zza);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdtnVar.zzd(str, jSONObject);
    }

    final /* synthetic */ zzfzp zzw(final ArrayList arrayList) throws Exception {
        return zzfzg.zzm(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfsm() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                return zzaa.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
