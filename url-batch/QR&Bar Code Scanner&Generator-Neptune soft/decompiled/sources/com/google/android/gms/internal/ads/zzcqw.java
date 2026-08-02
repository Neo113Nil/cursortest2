package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcqw implements zzezx {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final String zzc;
    private final zzcpw zzd;
    private final zzcqw zze = this;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;
    private final zzgxv zzj;
    private final zzgxv zzk;

    /* synthetic */ zzcqw(zzcpw zzcpwVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcqv zzcqvVar) {
        zzgxv zzgxvVar;
        zzgxv zzgxvVar2;
        zzgxv zzgxvVar3;
        this.zzd = zzcpwVar;
        this.zza = context;
        this.zzb = zzqVar;
        this.zzc = str;
        zzgxi zza = zzgxj.zza(context);
        this.zzf = zza;
        zzgxi zza2 = zzgxj.zza(zzqVar);
        this.zzg = zza2;
        zzgxvVar = zzcpwVar.zzo;
        zzgxv zzc = zzgxh.zzc(new zzeog(zzgxvVar));
        this.zzh = zzc;
        zzgxv zzc2 = zzgxh.zzc(zzeol.zza());
        this.zzi = zzc2;
        zzgxv zzc3 = zzgxh.zzc(zzdhx.zza());
        this.zzj = zzc3;
        zzgxvVar2 = zzcpwVar.zzp;
        zzgxvVar3 = zzcpwVar.zzR;
        this.zzk = zzgxh.zzc(new zzezv(zza, zzgxvVar2, zza2, zzgxvVar3, zzc, zzc2, zzfeh.zza(), zzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final zzenm zza() {
        zzcop zzcopVar;
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzb;
        String str = this.zzc;
        zzezu zzezuVar = (zzezu) this.zzk.zzb();
        zzeof zzeofVar = (zzeof) this.zzh.zzb();
        zzcopVar = this.zzd.zza;
        zzcgv zzd = zzcopVar.zzd();
        zzgxq.zzb(zzd);
        return new zzenm(context, zzqVar, str, zzezuVar, zzeofVar, zzd);
    }
}
