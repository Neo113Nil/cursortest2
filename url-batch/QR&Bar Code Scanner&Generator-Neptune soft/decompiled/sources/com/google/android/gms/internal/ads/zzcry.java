package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcry implements zzfde {
    private final zzcpw zza;
    private final zzcry zzb = this;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;
    private final zzgxv zzj;

    /* synthetic */ zzcry(zzcpw zzcpwVar, Context context, String str, zzcrx zzcrxVar) {
        zzgxv zzgxvVar;
        zzgxv zzgxvVar2;
        zzgxv zzgxvVar3;
        zzgxv zzgxvVar4;
        zzgxv zzgxvVar5;
        zzgxv zzgxvVar6;
        this.zza = zzcpwVar;
        zzgxi zza = zzgxj.zza(context);
        this.zzc = zza;
        zzgxvVar = zzcpwVar.zzaz;
        zzgxvVar2 = zzcpwVar.zzaA;
        zzfbe zzfbeVar = new zzfbe(zza, zzgxvVar, zzgxvVar2);
        this.zzd = zzfbeVar;
        zzgxvVar3 = zzcpwVar.zzaz;
        zzgxv zzc = zzgxh.zzc(new zzfco(zzgxvVar3));
        this.zze = zzc;
        zzgxv zzc2 = zzgxh.zzc(zzfec.zza());
        this.zzf = zzc2;
        zzgxvVar4 = zzcpwVar.zzp;
        zzgxvVar5 = zzcpwVar.zzR;
        zzgxv zzc3 = zzgxh.zzc(new zzfcy(zza, zzgxvVar4, zzgxvVar5, zzfbeVar, zzc, zzfeh.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzgxh.zzc(new zzfdi(zzc3, zzc, zzc2));
        zzgxi zzc4 = zzgxj.zzc(str);
        this.zzi = zzc4;
        zzgxvVar6 = zzcpwVar.zzi;
        this.zzj = zzgxh.zzc(new zzfdc(zzc4, zzc3, zza, zzc, zzc2, zzgxvVar6));
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final zzfdb zza() {
        return (zzfdb) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final zzfdh zzb() {
        return (zzfdh) this.zzh.zzb();
    }
}
