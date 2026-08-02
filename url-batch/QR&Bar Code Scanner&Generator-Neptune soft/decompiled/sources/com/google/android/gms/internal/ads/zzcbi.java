package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcbi implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcbk zzb;

    zzcbi(zzcbk zzcbkVar, Context context) {
        this.zzb = zzcbkVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzcbj zzcbjVar = (zzcbj) weakHashMap.get(this.zza);
        zzcbh zza = (zzcbjVar == null || zzcbjVar.zza + ((Long) zzbki.zza.zze()).longValue() < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) ? new zzcbg(this.zza).zza() : new zzcbg(this.zza, zzcbjVar.zzb).zza();
        zzcbk zzcbkVar = this.zzb;
        weakHashMap2 = zzcbkVar.zza;
        weakHashMap2.put(this.zza, new zzcbj(zzcbkVar, zza));
        return zza;
    }
}
