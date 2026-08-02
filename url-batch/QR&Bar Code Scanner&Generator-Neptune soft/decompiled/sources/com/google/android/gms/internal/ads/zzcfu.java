package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcfu extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcfy zza;

    zzcfu(zzcfy zzcfyVar) {
        this.zza = zzcfyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcgv zzcgvVar;
        Object obj;
        zzbjh zzbjhVar;
        zzcfy zzcfyVar = this.zza;
        context = zzcfyVar.zze;
        zzcgvVar = zzcfyVar.zzf;
        zzbjf zzbjfVar = new zzbjf(context, zzcgvVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzt.zze();
                zzbjhVar = this.zza.zzg;
                zzbji.zza(zzbjhVar, zzbjfVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.zze.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
