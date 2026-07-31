package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzbtr implements zzbqh {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbul zzb;
    final /* synthetic */ zzbth zzc;
    final /* synthetic */ zzbum zzd;

    zzbtr(zzbum zzbumVar, long j, zzbul zzbulVar, zzbth zzbthVar) {
        this.zza = j;
        this.zzb = zzbulVar;
        this.zzc = zzbthVar;
        Objects.requireNonNull(zzbumVar);
        this.zzd = zzbumVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(currentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(currentTimeMillis);
        sb.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbum zzbumVar = this.zzd;
        synchronized (zzbumVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbul zzbulVar = this.zzb;
            if (zzbulVar.zzi() != -1 && zzbulVar.zzi() != 1) {
                zzbumVar.zzl(0);
                zzbth zzbthVar = this.zzc;
                zzbthVar.zzm("/log", zzbqg.zzg);
                zzbthVar.zzm("/result", zzbqg.zzo);
                zzbulVar.zzf(zzbthVar);
                zzbumVar.zzj(zzbulVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
