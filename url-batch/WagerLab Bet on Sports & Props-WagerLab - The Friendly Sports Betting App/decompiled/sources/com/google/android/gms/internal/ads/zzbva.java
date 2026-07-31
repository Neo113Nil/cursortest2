package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbva implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvc zzb;

    zzbva(zzbvc zzbvcVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzbvcVar);
        this.zzb = zzbvcVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbuz zza;
        zzbvc zzbvcVar = this.zzb;
        WeakHashMap zzb = zzbvcVar.zzb();
        Context context = this.zza;
        zzbvb zzbvbVar = (zzbvb) zzb.get(context);
        if (zzbvbVar != null) {
            if (zzbvbVar.zza + ((Long) zzbdx.zzd.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) {
                zza = new zzbuy(context, zzbvbVar.zzb).zza();
                zzbvcVar.zzb().put(context, new zzbvb(zzbvcVar, zza));
                return zza;
            }
        }
        zza = new zzbuy(context).zza();
        zzbvcVar.zzb().put(context, new zzbvb(zzbvcVar, zza));
        return zza;
    }
}
