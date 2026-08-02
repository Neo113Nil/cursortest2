package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcru implements zzfbq {
    private final zzcpw zza;
    private final zzcru zzb = this;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;

    /* synthetic */ zzcru(zzcpw zzcpwVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcrt zzcrtVar) {
        zzgxv zzgxvVar;
        zzgxv zzgxvVar2;
        zzgxv zzgxvVar3;
        zzgxv zzgxvVar4;
        zzgxv zzgxvVar5;
        this.zza = zzcpwVar;
        zzgxi zza = zzgxj.zza(context);
        this.zzc = zza;
        zzgxi zza2 = zzgxj.zza(zzqVar);
        this.zzd = zza2;
        zzgxi zza3 = zzgxj.zza(str);
        this.zze = zza3;
        zzgxvVar = zzcpwVar.zzo;
        zzgxv zzc = zzgxh.zzc(new zzeog(zzgxvVar));
        this.zzf = zzc;
        zzgxvVar2 = zzcpwVar.zzaz;
        zzgxv zzc2 = zzgxh.zzc(new zzfco(zzgxvVar2));
        this.zzg = zzc2;
        zzgxvVar3 = zzcpwVar.zzp;
        zzgxvVar4 = zzcpwVar.zzR;
        zzgxv zzc3 = zzgxh.zzc(new zzfbo(zza, zzgxvVar3, zzgxvVar4, zzc, zzc2, zzfeh.zza()));
        this.zzh = zzc3;
        zzgxvVar5 = zzcpwVar.zzi;
        this.zzi = zzgxh.zzc(new zzeoo(zza, zza2, zza3, zzc3, zzc, zzc2, zzgxvVar5));
    }

    @Override // com.google.android.gms.internal.ads.zzfbq
    public final zzeon zza() {
        return (zzeon) this.zzi.zzb();
    }
}
