package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbcx;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbtc;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyl;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcvy;
import com.google.android.gms.internal.ads.zzdci;
import com.google.android.gms.internal.ads.zzdoa;
import com.google.android.gms.internal.ads.zzdrt;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzffk;
import com.google.android.gms.internal.ads.zzfgf;
import com.google.android.gms.internal.ads.zzfjt;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfkf;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.internal.ads.zzfll;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzgbp;
import com.google.android.gms.internal.ads.zzgbq;
import com.google.android.gms.internal.ads.zzgca;
import com.google.android.gms.internal.ads.zzgcj;
import com.google.android.gms.internal.ads.zzgcu;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzak extends zzbyl {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbcx zzI;
    private final zze zzJ;
    private final zzcgj zzf;
    private Context zzg;
    private final zzauo zzh;
    private final zzffk zzi;
    private final zzfgf zzj;
    private final zzgcu zzk;
    private final ScheduledExecutorService zzl;
    private zzbtl zzm;
    private final zzdsp zzp;
    private final zzfll zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgx)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgw)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgz)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgB)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgA);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgC);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgD);

    public zzak(zzcgj zzcgjVar, Context context, zzauo zzauoVar, zzfgf zzfgfVar, zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, zzdsp zzdspVar, zzfll zzfllVar, VersionInfoParcel versionInfoParcel, zzbcx zzbcxVar, zzffk zzffkVar, zze zzeVar) {
        List list;
        this.zzf = zzcgjVar;
        this.zzg = context;
        this.zzh = zzauoVar;
        this.zzi = zzffkVar;
        this.zzj = zzfgfVar;
        this.zzk = zzgcuVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdspVar;
        this.zzq = zzfllVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbcxVar;
        this.zzJ = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgE)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgF));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgG));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgH));
            list = zzaa((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgI));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            list = zzd;
        }
        this.zzE = list;
    }

    static /* bridge */ /* synthetic */ void zzH(zzak zzakVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzakVar.zzO((Uri) it.next())) {
                zzakVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzs zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, Bundle bundle) {
        char c;
        zzffe zzffeVar = new zzffe();
        if ("REWARDED".equals(str2)) {
            zzffeVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzffeVar.zzp().zza(3);
        }
        zzr zzp = this.zzf.zzp();
        zzcvy zzcvyVar = new zzcvy();
        zzcvyVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzffeVar.zzt(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzffeVar.zzH(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c = 4;
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
            zzqVar = c != 0 ? (c == 1 || c == 2) ? com.google.android.gms.ads.internal.client.zzq.zzd() : c != 3 ? c != 4 ? new com.google.android.gms.ads.internal.client.zzq() : com.google.android.gms.ads.internal.client.zzq.zzb() : com.google.android.gms.ads.internal.client.zzq.zzc() : new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
        }
        zzffeVar.zzs(zzqVar);
        zzffeVar.zzz(true);
        zzffeVar.zzA(bundle);
        zzcvyVar.zzi(zzffeVar.zzJ());
        zzp.zza(zzcvyVar.zzj());
        zzan zzanVar = new zzan();
        zzanVar.zza(str2);
        zzp.zzb(new zzap(zzanVar, null));
        new zzdci();
        return zzp.zzc();
    }

    private final ListenableFuture zzS(final String str) {
        final zzdoa[] zzdoaVarArr = new zzdoa[1];
        ListenableFuture zzn = zzgcj.zzn(this.zzj.zza(), new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzak.this.zzv(zzdoaVarArr, str, (zzdoa) obj);
            }
        }, this.zzk);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzw
            @Override // java.lang.Runnable
            public final void run() {
                zzak.this.zzJ(zzdoaVarArr);
            }
        }, this.zzk);
        return zzgcj.zze(zzgcj.zzm((zzgca) zzgcj.zzo(zzgca.zzu(zzn), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgP)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzful() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzac
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                int i = zzak.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzful() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                int i = zzak.zze;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            this.zzJ.zzb();
        } else {
            zzgcj.zzr(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkg)).booleanValue() ? zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzgbp
                public final ListenableFuture zza() {
                    return zzak.this.zzu();
                }
            }, zzbzo.zza) : zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb(), new zzaj(this), this.zzf.zzB());
        }
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziH)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziK)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziO)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, boolean z) {
        ListenableFuture zzb2;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgO)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The updating URL feature is not enabled.");
            try {
                zzbtcVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzO(uri)) {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzx
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzak.this.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    zzb2 = zzgcj.zzn(zzb2, new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzy
                        @Override // com.google.android.gms.internal.ads.zzgbq
                        public final ListenableFuture zza(Object obj) {
                            ListenableFuture zzm;
                            zzm = zzgcj.zzm(r0.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzful(r0, (Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzz
                                public final /* synthetic */ Uri zza;

                                {
                                    this.zza = r2;
                                }

                                @Override // com.google.android.gms.internal.ads.zzful
                                public final Object apply(Object obj2) {
                                    return zzak.zzQ(this.zza, (String) obj2);
                                }
                            }, zzak.this.zzk);
                            return zzm;
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                zzb2 = zzgcj.zzh(uri);
            }
            arrayList.add(zzb2);
        }
        zzgcj.zzr(zzgcj.zzd(arrayList), new zzai(this, zzbtcVar, z), this.zzf.zzB());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbtc zzbtcVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgO)).booleanValue()) {
            try {
                zzbtcVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                return;
            }
        }
        ListenableFuture zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzak.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            zzb2 = zzgcj.zzn(zzb2, new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    return zzak.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Asset view map is empty.");
        }
        zzgcj.zzr(zzb2, new zzah(this, zzbtcVar, z), this.zzf.zzB());
    }

    private static boolean zzX(Uri uri, List list, List list2) {
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

    private final boolean zzY() {
        Map map;
        zzbtl zzbtlVar = this.zzm;
        return (zzbtlVar == null || (map = zzbtlVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
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

    private static final List zzaa(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfvj.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfkf zzr(ListenableFuture listenableFuture, zzbyq zzbyqVar) {
        if (!zzfki.zza() || !((Boolean) zzbdl.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfkf zza2 = ((zzs) zzgcj.zzp(listenableFuture)).zza();
            zza2.zzd(new ArrayList(Collections.singletonList(zzbyqVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbyqVar.zzd;
            zza2.zzb(zzlVar == null ? "" : zzlVar.zzp);
            zza2.zzf(zzbyqVar.zzd.zzm);
            return zza2;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
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
            if (zzP(uri)) {
                arrayList.add(zzZ(uri, "ms", zzh));
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    final /* synthetic */ void zzJ(zzdoa[] zzdoaVarArr) {
        zzdoa zzdoaVar = zzdoaVarArr[0];
        if (zzdoaVar != null) {
            this.zzj.zzb(zzgcj.zzh(zzdoaVar));
        }
    }

    final boolean zzO(Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    final boolean zzP(Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziR)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbdx.zza.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzf(IObjectWrapper iObjectWrapper, final zzbyq zzbyqVar, zzbyj zzbyjVar) {
        ListenableFuture zzb2;
        ListenableFuture listenableFuture;
        ListenableFuture zzb3;
        ListenableFuture zzn;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbS)).booleanValue()) {
            bundle.putLong(zzdrt.PUBLIC_API_CALL.zza(), zzbyqVar.zzd.zzz);
            bundle.putLong(zzdrt.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfju zza2 = zzfjt.zza(context, 22);
        zza2.zzi();
        if ("UNKNOWN".equals(zzbyqVar.zzb)) {
            List arrayList = new ArrayList();
            if (!((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgN)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgN)).split(","));
            }
            if (arrayList.contains(zzq.zzc(zzbyqVar.zzd))) {
                zzb3 = zzgcj.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                zzn = zzgcj.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                listenableFuture = zzb3;
                zzb2 = zzn;
                zzgcj.zzr(zzb2, new zzag(this, listenableFuture, zzbyqVar, zzbyjVar, zza2), this.zzf.zzB());
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkg)).booleanValue()) {
            zzb3 = zzbzo.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzak.this.zzq(zzbyqVar, bundle);
                }
            });
            zzn = zzgcj.zzn(zzb3, new zzgbq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzab
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    return ((zzs) obj).zzb();
                }
            }, zzbzo.zza);
            listenableFuture = zzb3;
            zzb2 = zzn;
            zzgcj.zzr(zzb2, new zzag(this, listenableFuture, zzbyqVar, zzbyjVar, zza2), this.zzf.zzB());
        }
        zzs zzR = zzR(this.zzg, zzbyqVar.zza, zzbyqVar.zzb, zzbyqVar.zzc, zzbyqVar.zzd, bundle);
        ListenableFuture zzh = zzgcj.zzh(zzR);
        zzb2 = zzR.zzb();
        listenableFuture = zzh;
        zzgcj.zzr(zzb2, new zzag(this, listenableFuture, zzbyqVar, zzbyjVar, zza2), this.zzf.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzg(zzbtl zzbtlVar) {
        this.zzm = zzbtlVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        zzV(list, iObjectWrapper, zzbtcVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        zzW(list, iObjectWrapper, zzbtcVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziG)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgM)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("The webView cannot be null.");
                return;
            }
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zziQ)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzo().zzs();
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgM)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzgO)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbtl zzbtlVar = this.zzm;
            this.zzn = zzbv.zza(motionEvent, zzbtlVar == null ? null : zzbtlVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzn.x, this.zzn.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        zzV(list, iObjectWrapper, zzbtcVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbym
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtc zzbtcVar) {
        zzW(list, iObjectWrapper, zzbtcVar, false);
    }

    final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzffk zzffkVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzla)).booleanValue() || (zzffkVar = this.zzi) == null) ? this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzffkVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaup e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    final /* synthetic */ zzs zzq(zzbyq zzbyqVar, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzbyqVar.zza, zzbyqVar.zzb, zzbyqVar.zzc, zzbyqVar.zzd, bundle);
    }

    final /* synthetic */ ListenableFuture zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, new Bundle()).zzb();
    }

    final /* synthetic */ ListenableFuture zzv(zzdoa[] zzdoaVarArr, String str, zzdoa zzdoaVar) throws Exception {
        zzdoaVarArr[0] = zzdoaVar;
        Context context = this.zzg;
        zzbtl zzbtlVar = this.zzm;
        Map map = zzbtlVar.zzb;
        JSONObject zzd2 = zzbv.zzd(context, map, map, zzbtlVar.zza, null);
        JSONObject zzg = zzbv.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbv.zzf(this.zzm.zza);
        JSONObject zze2 = zzbv.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdoaVar.zzg(str, jSONObject);
    }

    final /* synthetic */ ListenableFuture zzw(final ArrayList arrayList) throws Exception {
        return zzgcj.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzful() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                return zzak.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
