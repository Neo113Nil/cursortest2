package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcaa implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcac zzb;

    zzcaa(zzcac zzcacVar, Context context) {
        this.zzb = zzcacVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzcab zzcabVar = (zzcab) weakHashMap.get(this.zza);
        zzbzz zza = (zzcabVar == null || zzcabVar.zza + ((Long) zzbje.zza.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()) ? new zzbzy(this.zza).zza() : new zzbzy(this.zza, zzcabVar.zzb).zza();
        zzcac zzcacVar = this.zzb;
        weakHashMap2 = zzcacVar.zza;
        weakHashMap2.put(this.zza, new zzcab(zzcacVar, zza));
        return zza;
    }
}
