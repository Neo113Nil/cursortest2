package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbti implements zzbpu {
    final /* synthetic */ zzbsr zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzca zzb;
    final /* synthetic */ zzbtw zzc;

    zzbti(zzbtw zzbtwVar, zzape zzapeVar, zzbsr zzbsrVar, com.google.android.gms.ads.internal.util.zzca zzcaVar) {
        this.zzc = zzbtwVar;
        this.zza = zzbsrVar;
        this.zzb = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbpu, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbpu
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            com.google.android.gms.ads.internal.util.zze.zzi("JS Engine is requesting an update");
            i = this.zzc.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
