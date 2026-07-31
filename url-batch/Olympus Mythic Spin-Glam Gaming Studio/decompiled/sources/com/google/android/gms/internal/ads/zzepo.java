package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzepo extends zzepq {
    private final zzcob zza;
    private final zzdov zzb;
    private final zzdcy zzc;
    private final zzdjp zzd;
    private final zzeqb zze;
    private final zzemv zzf;

    public zzepo(zzcob zzcobVar, zzdov zzdovVar, zzdcy zzdcyVar, zzdjp zzdjpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.zza = zzcobVar;
        this.zzb = zzdovVar;
        this.zzc = zzdcyVar;
        this.zzd = zzdjpVar;
        this.zze = zzeqbVar;
        this.zzf = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    protected final ListenableFuture zzc(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.zzc;
        zzdcyVar.zzb(zzflwVar);
        zzdcyVar.zzc(bundle);
        zzdcyVar.zzd(new zzdcs(zzfloVar, zzfldVar, this.zze));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue()) {
            zzdcyVar.zzg(this.zzf);
        }
        zzdoz zzo = this.zza.zzo();
        zzo.zzf(zzdcyVar.zze());
        zzo.zzg(this.zzd);
        zzo.zze(this.zzb);
        zzo.zzd(new zzcwa(null));
        zzczp zza = zzo.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
