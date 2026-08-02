package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeup implements zzevo {
    final String zza;
    private final zzgcu zzb;
    private final ScheduledExecutorService zzc;
    private final zzelg zzd;
    private final Context zze;
    private final zzffg zzf;
    private final zzelc zzg;
    private final zzdqb zzh;
    private final zzdup zzi;

    zzeup(zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, String str, zzelg zzelgVar, Context context, zzffg zzffgVar, zzelc zzelcVar, zzdqb zzdqbVar, zzdup zzdupVar) {
        this.zzb = zzgcuVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzelgVar;
        this.zze = context;
        this.zzf = zzffgVar;
        this.zzg = zzelcVar;
        this.zzh = zzdqbVar;
        this.zzi = zzdupVar;
    }

    public static /* synthetic */ ListenableFuture zzc(zzeup zzeupVar) {
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjW)).booleanValue() ? zzeupVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzeupVar.zzf.zzf;
        final Bundle zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbt)).booleanValue() ? zzeupVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbC)).booleanValue()) {
            zzeupVar.zzi(arrayList, zzeupVar.zzd.zza(zzeupVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzfxu) zzeupVar.zzd.zzb(zzeupVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzeupVar.zzg(str, (List) entry.getValue(), zzeupVar.zzf(str), true, true));
            }
            zzeupVar.zzi(arrayList, zzeupVar.zzd.zzc());
        }
        return zzgcj.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONArray jSONArray = new JSONArray();
                for (ListenableFuture listenableFuture : arrayList) {
                    if (((JSONObject) listenableFuture.get()) != null) {
                        jSONArray.put(listenableFuture.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeuq(jSONArray.toString(), zzg);
            }
        }, zzeupVar.zzb);
    }

    private final Bundle zzf(String str) {
        Bundle bundle = this.zzf.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgca zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgca zzu = zzgca.zzu(zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // com.google.android.gms.internal.ads.zzgbp
            public final ListenableFuture zza() {
                return zzeup.this.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbp)).booleanValue()) {
            zzu = (zzgca) zzgcj.zzo(zzu, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbi)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzgca) zzgcj.zze(zzu, Throwable.class, new zzful() { // from class: com.google.android.gms.internal.ads.zzeun
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                String str2 = str;
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                String concat = "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2));
                com.google.android.gms.ads.internal.zzu.zzo().zzw((Throwable) obj, concat);
                return null;
            }
        }, this.zzb);
    }

    private final void zzh(zzbql zzbqlVar, Bundle bundle, List list, zzelj zzeljVar) throws RemoteException {
        zzbqlVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeljVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzelk zzelkVar = (zzelk) ((Map.Entry) it.next()).getValue();
            String str = zzelkVar.zza;
            list.add(zzg(str, Collections.singletonList(zzelkVar.zze), zzf(str), zzelkVar.zzb, zzelkVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        zzffg zzffgVar = this.zzf;
        if (zzffgVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbv)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzq.zzc(zzffgVar.zzd)))) {
                return zzgcj.zzh(new zzeuq(new JSONArray().toString(), new Bundle()));
            }
        }
        return zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzeuj
            @Override // com.google.android.gms.internal.ads.zzgbp
            public final ListenableFuture zza() {
                return zzeup.zzc(zzeup.this);
            }
        }, this.zzb);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(3:5|(2:7|(1:9)(1:12))(3:13|(1:15)|(2:17|(1:19)(1:20))(1:21))|10))|22|23|(0)(0)|10) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
    
        com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", r13);
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ ListenableFuture zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbql zzbqlVar;
        final zzbzt zzbztVar = new zzbzt();
        if (z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbu)).booleanValue()) {
                this.zzg.zzb(str);
                zzbqlVar = this.zzg.zza(str);
                if (zzbqlVar != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbk)).booleanValue()) {
                        throw null;
                    }
                    zzelj.zzb(str, zzbztVar);
                } else {
                    final zzelj zzeljVar = new zzelj(str, zzbqlVar, zzbztVar, com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbp)).booleanValue()) {
                        this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeuo
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzelj.this.zzc();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbi)).longValue(), TimeUnit.MILLISECONDS);
                    }
                    if (z) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbw)).booleanValue()) {
                            final zzbql zzbqlVar2 = zzbqlVar;
                            this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeul
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzeup.this.zze(zzbqlVar2, bundle, list, zzeljVar, zzbztVar);
                                }
                            });
                        } else {
                            zzh(zzbqlVar, bundle, list, zzeljVar);
                        }
                    } else {
                        zzeljVar.zzd();
                    }
                }
                return zzbztVar;
            }
        }
        zzbqlVar = this.zzh.zzb(str);
        if (zzbqlVar != null) {
        }
        return zzbztVar;
    }

    final /* synthetic */ void zze(zzbql zzbqlVar, Bundle bundle, List list, zzelj zzeljVar, zzbzt zzbztVar) {
        try {
            zzh(zzbqlVar, bundle, list, zzeljVar);
        } catch (RemoteException e) {
            zzbztVar.zzd(e);
        }
    }
}
