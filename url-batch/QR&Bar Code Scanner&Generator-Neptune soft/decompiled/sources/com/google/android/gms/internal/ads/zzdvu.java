package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdvu implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;

    public zzdvu(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzcos) this.zza).zza();
        final String zzb = ((zzebz) this.zzb).zzb();
        zzcgv zza2 = ((zzcpc) this.zzc).zza();
        final zzbez zzbezVar = (zzbez) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbep zzbepVar = new zzbep(new zzbev(zza));
        zzbho zza3 = zzbhp.zza();
        zza3.zza(zza2.zzb);
        zza3.zzc(zza2.zzc);
        zza3.zzb(true != zza2.zzd ? 2 : 0);
        final zzbhp zzbhpVar = (zzbhp) zza3.zzam();
        zzbepVar.zzb(new zzbeo() { // from class: com.google.android.gms.internal.ads.zzdvt
            @Override // com.google.android.gms.internal.ads.zzbeo
            public final void zza(zzbge zzbgeVar) {
                zzbez zzbezVar2 = zzbez.this;
                String str2 = zzb;
                zzbhp zzbhpVar2 = zzbhpVar;
                String str3 = str;
                zzbfa zzbfaVar = (zzbfa) zzbgeVar.zza().zzaA();
                zzbfaVar.zza(zzbezVar2);
                zzbgeVar.zze(zzbfaVar);
                zzbfw zzbfwVar = (zzbfw) zzbgeVar.zzb().zzaA();
                zzbfwVar.zza(str2);
                zzbfwVar.zzb(zzbhpVar2);
                zzbgeVar.zzg(zzbfwVar);
                zzbgeVar.zzh(str3);
            }
        });
        return zzbepVar;
    }
}
