package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbrx implements zzbol {
    final /* synthetic */ zzbrg zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzca zzb;
    final /* synthetic */ zzbsl zzc;

    zzbrx(zzbsl zzbslVar, zzaoc zzaocVar, zzbrg zzbrgVar, com.google.android.gms.ads.internal.util.zzca zzcaVar) {
        this.zzc = zzbslVar;
        this.zza = zzbrgVar;
        this.zzb = zzcaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbol, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbol
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
