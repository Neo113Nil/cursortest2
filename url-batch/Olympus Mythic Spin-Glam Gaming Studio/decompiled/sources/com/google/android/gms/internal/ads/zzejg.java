package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzejg extends zzcbh {
    private final Context zza;
    private final zzhdi zzb;
    private final zzejo zzc;
    private final zzcsi zzd;
    private final ArrayDeque zze;
    private final zzfrj zzf;
    private final zzcny zzg;
    private final zzccd zzh;

    public zzejg(Context context, zzhdi zzhdiVar, zzccd zzccdVar, zzcsi zzcsiVar, zzejo zzejoVar, ArrayDeque arrayDeque, zzejl zzejlVar, zzfrj zzfrjVar, zzcny zzcnyVar) {
        zzbjg.zza(context);
        this.zza = context;
        this.zzb = zzhdiVar;
        this.zzh = zzccdVar;
        this.zzc = zzejoVar;
        this.zzd = zzcsiVar;
        this.zze = arrayDeque;
        this.zzf = zzfrjVar;
        this.zzg = zzcnyVar;
    }

    private static ListenableFuture zzl(final zzcbv zzcbvVar, zzfqi zzfqiVar, final zzfek zzfekVar) {
        zzhcg zzhcgVar = new zzhcg() { // from class: com.google.android.gms.internal.ads.zzeiu
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfek.this.zzc().zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcbvVar.zzm);
            }
        };
        return zzfqiVar.zza(zzfqc.GMS_SIGNALS, zzhcy.zza(zzcbvVar.zza)).zzc(zzhcgVar).zzb(zzeiv.zza).zzi();
    }

    private static ListenableFuture zzm(ListenableFuture listenableFuture, zzfqi zzfqiVar, zzbva zzbvaVar, zzfrg zzfrgVar, zzfqw zzfqwVar) {
        zzbuq zza = zzbvaVar.zza("AFMA_getAdDictionary", zzbux.zza, zzeja.zza);
        zzfrf.zzb(listenableFuture, zzfqwVar);
        zzfpp zzi = zzfqiVar.zza(zzfqc.BUILD_URL, listenableFuture).zzc(zza).zzi();
        zzfrf.zzf(zzi, zzfrgVar, zzfqwVar);
        return zzi;
    }

    private final void zzn(ListenableFuture listenableFuture, zzcbm zzcbmVar, zzcbv zzcbvVar) {
        zzhcy.zzr(zzhcy.zzj(listenableFuture, new zzhcg(this) { // from class: com.google.android.gms.internal.ads.zzeiy
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzhcy.zza(zzfmx.zza((InputStream) obj));
            }
        }, zzcgj.zza), new zzeir(this, zzcbvVar, zzcbmVar), zzcgj.zzh);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzblo.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzp(zzejb zzejbVar) {
        zzo();
        this.zze.addLast(zzejbVar);
    }

    @Nullable
    private final synchronized zzejb zzq(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzejb zzejbVar = (zzejb) it.next();
            if (zzejbVar.zzc.equals(str)) {
                it.remove();
                return zzejbVar;
            }
        }
        return null;
    }

    public final ListenableFuture zza(final zzcbv zzcbvVar, int i) {
        zzejb zzq;
        zzfpp zzi;
        zzbur zzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbva zza = zzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfek zzy = this.zzd.zzy(zzcbvVar, i);
        zzbuq zza2 = zza.zza("google.afma.response.normalize", zzejd.zzd, zzbux.zzb);
        if (((Boolean) zzblo.zza.zze()).booleanValue()) {
            zzq = zzq(zzcbvVar.zzh);
            if (zzq == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbvVar.zzj;
            zzq = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzejb zzejbVar = zzq;
        zzfqw zzn = zzejbVar == null ? zzfqw.zzn(context, 9) : zzejbVar.zzd;
        zzfrg zzf = zzy.zzf();
        zzf.zzb(zzcbvVar.zza.getStringArrayList("ad_types"));
        zzejn zzejnVar = new zzejn(zzcbvVar.zzg, zzf, zzn, this.zzg);
        zzejk zzejkVar = new zzejk(context, zzcbvVar.zzb.afmaVersion, this.zzh, i, null);
        zzfqi zze = zzy.zze();
        zzfqw zzn2 = zzfqw.zzn(context, 11);
        if (zzejbVar == null) {
            final ListenableFuture zzl = zzl(zzcbvVar, zze, zzy);
            final ListenableFuture zzm = zzm(zzl, zze, zza, zzf, zzn);
            zzfqw zzn3 = zzfqw.zzn(context, 10);
            final zzfpp zzi2 = zze.zzb(zzfqc.HTTP, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeiz
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzcbx zzcbxVar = (zzcbx) ListenableFuture.this.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbvVar.zzm) != null) {
                        bundle.putLong(zzdzs.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzcbxVar.zzj());
                        bundle.putLong(zzdzs.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzcbxVar.zzk());
                    }
                    return new zzejm((JSONObject) zzl.get(), zzcbxVar);
                }
            }).zzb(zzejnVar).zzb(zzfrf.zzc(zzn3)).zzb(zzejkVar).zzi();
            zzfrf.zzd(zzi2, zzf, zzn3);
            zzfrf.zzb(zzi2, zzn2);
            zzi = zze.zzb(zzfqc.PRE_PROCESS, zzl, zzm, zzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeis
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbv.this.zzm) != null) {
                        bundle.putLong(zzdzs.HTTP_RESPONSE_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
                    }
                    return new zzejd((zzejj) zzi2.get(), (JSONObject) zzl.get(), (zzcbx) zzm.get());
                }
            }).zzc(zza2).zzi();
        } else {
            zzejm zzejmVar = new zzejm(zzejbVar.zzb, zzejbVar.zza);
            zzfqw zzn4 = zzfqw.zzn(context, 10);
            final zzfpp zzi3 = zze.zza(zzfqc.HTTP, zzhcy.zza(zzejmVar)).zzb(zzejnVar).zzb(zzfrf.zzc(zzn4)).zzb(zzejkVar).zzi();
            zzfrf.zzd(zzi3, zzf, zzn4);
            final ListenableFuture zza3 = zzhcy.zza(zzejbVar);
            zzfrf.zzb(zzi3, zzn2);
            zzi = zze.zzb(zzfqc.PRE_PROCESS, zzi3, zza3).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeit
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzejj zzejjVar = (zzejj) ListenableFuture.this.get();
                    ListenableFuture listenableFuture = zza3;
                    return new zzejd(zzejjVar, ((zzejb) listenableFuture.get()).zzb, ((zzejb) listenableFuture.get()).zza);
                }
            }).zzc(zza2).zzi();
        }
        zzfrf.zzd(zzi, zzf, zzn2);
        return zzi;
    }

    public final ListenableFuture zzb(final zzcbv zzcbvVar, int i) {
        if (!((Boolean) zzblo.zza.zze()).booleanValue()) {
            return zzhcy.zzc(new Exception("Split request is disabled."));
        }
        zzfns zzfnsVar = zzcbvVar.zzi;
        if (zzfnsVar == null) {
            return zzhcy.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfnsVar.zzc == 0 || zzfnsVar.zzd == 0) {
            return zzhcy.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbva zza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzfek zzy = this.zzd.zzy(zzcbvVar, i);
        zzfqi zze = zzy.zze();
        final ListenableFuture zzl = zzl(zzcbvVar, zze, zzy);
        zzfrg zzf = zzy.zzf();
        final zzfqw zzn = zzfqw.zzn(context, 9);
        final ListenableFuture zzm = zzm(zzl, zze, zza, zzf, zzn);
        return zze.zzb(zzfqc.GET_URL_AND_CACHE_KEY, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeiw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzejg.this.zzk(zzm, zzl, zzcbvVar, zzn);
            }
        }).zzi();
    }

    public final ListenableFuture zzc(String str) {
        if (((Boolean) zzblo.zza.zze()).booleanValue()) {
            return zzq(str) == null ? zzhcy.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzhcy.zza(new zzeiq(this));
        }
        return zzhcy.zzc(new Exception("Split request is disabled."));
    }

    public final ListenableFuture zzd(final zzcbv zzcbvVar, int i) {
        zzbur zzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbva zza = zzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzblu.zza.zze()).booleanValue()) {
            return zzhcy.zzc(new Exception("Signal collection disabled."));
        }
        zzfek zzy = this.zzd.zzy(zzcbvVar, i);
        final zzfdl zzd = zzy.zzd();
        zzbuq zza2 = zza.zza("google.afma.request.getSignals", zzbux.zza, zzbux.zzb);
        zzfqw zzn = zzfqw.zzn(context, 22);
        zzfqi zze = zzy.zze();
        zzfqc zzfqcVar = zzfqc.GET_SIGNALS;
        Bundle bundle = zzcbvVar.zza;
        zzfpp zzi = zze.zza(zzfqcVar, zzhcy.zza(bundle)).zzb(zzfrf.zzc(zzn)).zzc(new zzhcg() { // from class: com.google.android.gms.internal.ads.zzeix
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfdl.this.zza(com.google.android.gms.ads.internal.client.zzay.zza().zzo((Bundle) obj), zzcbvVar.zzm);
            }
        }).zzj(zzfqc.JS_SIGNALS).zzc(zza2).zzi();
        zzfrg zzf = zzy.zzf();
        zzf.zzb(bundle.getStringArrayList("ad_types"));
        zzf.zzd(bundle.getBundle("extras"));
        zzfrf.zze(zzi, zzf, zzn);
        if (((Boolean) zzblh.zzj.zze()).booleanValue()) {
            final zzejo zzejoVar = this.zzc;
            Objects.requireNonNull(zzejoVar);
            zzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeje
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzejo.this.zza();
                }
            }, this.zzb);
        }
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zze(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbvVar.zzm) != null) {
            bundle.putLong(zzdzs.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture zza = zza(zzcbvVar, Binder.getCallingUid());
        zzn(zza, zzcbmVar, zzcbvVar);
        if (((Boolean) zzblh.zzi.zze()).booleanValue()) {
            final zzejo zzejoVar = this.zzc;
            Objects.requireNonNull(zzejoVar);
            zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzejf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzejo.this.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzf(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcS)).booleanValue() && (bundle = zzcbvVar.zzm) != null) {
            bundle.putLong(zzdzs.SERVICE_CONNECTED.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzn(zzd(zzcbvVar, Binder.getCallingUid()), zzcbmVar, zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzg(zzcbv zzcbvVar, zzcbm zzcbmVar) {
        zzn(zzb(zzcbvVar, Binder.getCallingUid()), zzcbmVar, zzcbvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzh(String str, zzcbm zzcbmVar) {
        zzn(zzc(str), zzcbmVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpR)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpS);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> zzf = zzguz.zza(zzgty.zzd(',')).zzf(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : zzf) {
                Context context = this.zza;
                zzejk zzejkVar = new zzejk(context, str, this.zzh, callingUid, "HEAD");
                HashMap hashMap = new HashMap();
                hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zzejj zza = zzejkVar.zza(new zzeji(str3, 30000, hashMap, new byte[0], "", false));
                    if (zza.zza != 200) {
                        int i = zza.zza;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 32);
                        sb.append("Unexpected preconnect response: ");
                        sb.append(i);
                        throw new RemoteException(sb.toString());
                    }
                } catch (Exception e) {
                    throw new RemoteException(e.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzj(zzcbe zzcbeVar, zzcbn zzcbnVar) {
        if (((Boolean) zzblw.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzcbeVar.zza;
            zzhcy.zzr(zzhcy.zza(null), new zzeip(this, zzcbnVar, zzcbeVar), zzcgj.zzh);
        } else {
            try {
                zzcbnVar.zze("", zzcbeVar);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
            }
        }
    }

    final /* synthetic */ InputStream zzk(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzcbv zzcbvVar, zzfqw zzfqwVar) {
        String zzi = ((zzcbx) listenableFuture.get()).zzi();
        zzp(new zzejb((zzcbx) listenableFuture.get(), (JSONObject) listenableFuture2.get(), zzcbvVar.zzh, zzi, zzfqwVar));
        return new ByteArrayInputStream(zzi.getBytes(StandardCharsets.UTF_8));
    }
}
