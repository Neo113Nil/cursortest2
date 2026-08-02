package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcrk implements zzdyz {
    private final Context zza;
    private final zzbqr zzb;
    private final zzcpw zzc;
    private final zzcrk zzd = this;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;

    /* synthetic */ zzcrk(zzcpw zzcpwVar, Context context, zzbqr zzbqrVar, zzcrj zzcrjVar) {
        this.zzc = zzcpwVar;
        this.zza = context;
        this.zzb = zzbqrVar;
        zzgxi zza = zzgxj.zza(this);
        this.zze = zza;
        zzgxi zza2 = zzgxj.zza(zzbqrVar);
        this.zzf = zza2;
        zzdyv zzdyvVar = new zzdyv(zza2);
        this.zzg = zzdyvVar;
        this.zzh = zzgxh.zzc(new zzdyx(zza, zzdyvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdyz
    public final zzdyq zzb() {
        return new zzcre(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdyz
    public final zzdyw zzd() {
        return (zzdyw) this.zzh.zzb();
    }
}
