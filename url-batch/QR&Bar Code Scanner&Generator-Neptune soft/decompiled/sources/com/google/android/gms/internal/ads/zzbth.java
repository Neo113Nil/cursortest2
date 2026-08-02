package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbth implements zzbpu {
    final /* synthetic */ zzbtv zza;
    final /* synthetic */ zzbsr zzb;
    final /* synthetic */ zzbtw zzc;

    zzbth(zzbtw zzbtwVar, zzbtv zzbtvVar, zzbsr zzbsrVar) {
        this.zzc = zzbtwVar;
        this.zza = zzbtvVar;
        this.zzb = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zzc.zzi = 0;
                zzbsr zzbsrVar = this.zzb;
                zzbsrVar.zzq("/log", zzbpt.zzg);
                zzbsrVar.zzq("/result", zzbpt.zzo);
                this.zza.zzh(this.zzb);
                this.zzc.zzh = this.zza;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
