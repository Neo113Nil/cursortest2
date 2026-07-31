package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzepx extends zzepq {
    private final zzcob zza;
    private final zzdcy zzb;
    private final zzdjp zzc;
    private final zzeqb zzd;
    private final zzflp zze;
    private final zzemv zzf;

    public zzepx(zzcob zzcobVar, zzdcy zzdcyVar, zzdjp zzdjpVar, zzflp zzflpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.zza = zzcobVar;
        this.zzb = zzdcyVar;
        this.zzc = zzdjpVar;
        this.zze = zzflpVar;
        this.zzd = zzeqbVar;
        this.zzf = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    protected final ListenableFuture zzc(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzflp zzflpVar;
        zzdcy zzdcyVar = this.zzb;
        zzdcyVar.zzb(zzflwVar);
        zzdcyVar.zzc(bundle);
        zzdcyVar.zzd(new zzdcs(zzfloVar, zzfldVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeD)).booleanValue() && (zzflpVar = this.zze) != null) {
            zzdcyVar.zzf(zzflpVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue()) {
            zzdcyVar.zzg(this.zzf);
        }
        zzdwo zzp = this.zza.zzp();
        zzp.zzd(zzdcyVar.zze());
        zzp.zze(this.zzc);
        zzczp zza = zzp.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
