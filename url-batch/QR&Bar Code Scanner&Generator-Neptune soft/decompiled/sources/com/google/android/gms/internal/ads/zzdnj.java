package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdnj implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;

    public zzdnj(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcom zzcomVar = (zzcom) this.zza.zzb();
        zzdck zza = ((zzdcs) this.zzb).zza();
        zzdim zza2 = ((zzdjf) this.zzc).zza();
        zzdmy zza3 = ((zzdna) this.zzd).zza();
        zzdfp zzb = ((zzcxb) this.zze).zzb();
        zzcxy zze = zzcomVar.zze();
        zze.zzi(zza.zzg());
        zze.zzf(zza2);
        zze.zzd(zza3);
        zze.zze(new zzemp(null));
        zze.zzg(new zzcyw(zzb, null));
        zze.zzc(new zzcwz(null));
        zzczh zzc = zze.zzj().zzc();
        zzgxq.zzb(zzc);
        return zzc;
    }
}
