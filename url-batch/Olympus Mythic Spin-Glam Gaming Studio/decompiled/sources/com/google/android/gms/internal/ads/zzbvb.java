package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzbvb implements zzcgs {
    final /* synthetic */ zzbug zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcgo zzc;
    final /* synthetic */ zzbve zzd;

    zzbvb(zzbve zzbveVar, zzbug zzbugVar, Object obj, zzcgo zzcgoVar) {
        this.zza = zzbugVar;
        this.zzb = obj;
        this.zzc = zzcgoVar;
        Objects.requireNonNull(zzbveVar);
        this.zzd = zzbveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcgo zzcgoVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbun) obj, obj2, zzcgoVar);
    }
}
