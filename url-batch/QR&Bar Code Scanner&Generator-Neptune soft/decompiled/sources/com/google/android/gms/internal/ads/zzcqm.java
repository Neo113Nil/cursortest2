package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcqm implements zzeyj {
    private final zzcpw zza;
    private final zzcqm zzb = this;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;
    private final zzgxv zzj;
    private final zzgxv zzk;

    /* synthetic */ zzcqm(zzcpw zzcpwVar, Context context, String str, zzcql zzcqlVar) {
        zzgxv zzgxvVar;
        zzgxv zzgxvVar2;
        zzgxv zzgxvVar3;
        zzgxv zzgxvVar4;
        zzgxv zzgxvVar5;
        zzgxv zzgxvVar6;
        zzgxv zzgxvVar7;
        zzgxv zzgxvVar8;
        zzgxv zzgxvVar9;
        zzgxv zzgxvVar10;
        zzgxv zzgxvVar11;
        zzgxv zzgxvVar12;
        zzgxv zzgxvVar13;
        zzgxv zzgxvVar14;
        zzgxv zzgxvVar15;
        this.zza = zzcpwVar;
        zzgxi zza = zzgxj.zza(context);
        this.zzc = zza;
        zzgxi zza2 = zzgxj.zza(str);
        this.zzd = zza2;
        zzgxvVar = zzcpwVar.zzaz;
        zzgxvVar2 = zzcpwVar.zzaA;
        zzfbd zzfbdVar = new zzfbd(zza, zzgxvVar, zzgxvVar2);
        this.zze = zzfbdVar;
        zzgxvVar3 = zzcpwVar.zzaz;
        zzgxv zzc = zzgxh.zzc(new zzezh(zzgxvVar3));
        this.zzf = zzc;
        zzgxvVar4 = zzcpwVar.zzp;
        zzgxvVar5 = zzcpwVar.zzR;
        zzfeh zza3 = zzfeh.zza();
        zzgxvVar6 = zzcpwVar.zzi;
        zzgxv zzc2 = zzgxh.zzc(new zzeyb(zza, zzgxvVar4, zzgxvVar5, zzfbdVar, zzc, zza3, zzgxvVar6));
        this.zzg = zzc2;
        zzgxvVar7 = zzcpwVar.zzR;
        zzgxvVar8 = zzcpwVar.zzi;
        this.zzh = zzgxh.zzc(new zzeyh(zzgxvVar7, zza, zza2, zzc2, zzc, zzgxvVar8));
        zzgxvVar9 = zzcpwVar.zzaz;
        zzgxvVar10 = zzcpwVar.zzaA;
        zzfbc zzfbcVar = new zzfbc(zza, zzgxvVar9, zzgxvVar10);
        this.zzi = zzfbcVar;
        zzgxvVar11 = zzcpwVar.zzp;
        zzgxvVar12 = zzcpwVar.zzR;
        zzfeh zza4 = zzfeh.zza();
        zzgxvVar13 = zzcpwVar.zzi;
        zzgxv zzc3 = zzgxh.zzc(new zzezj(zza, zzgxvVar11, zzgxvVar12, zzfbcVar, zzc, zza4, zzgxvVar13));
        this.zzj = zzc3;
        zzgxvVar14 = zzcpwVar.zzR;
        zzgxvVar15 = zzcpwVar.zzi;
        this.zzk = zzgxh.zzc(new zzezp(zzgxvVar14, zza, zza2, zzc3, zzc, zzgxvVar15));
    }

    @Override // com.google.android.gms.internal.ads.zzeyj
    public final zzeyg zza() {
        return (zzeyg) this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeyj
    public final zzezo zzb() {
        return (zzezo) this.zzk.zzb();
    }
}
