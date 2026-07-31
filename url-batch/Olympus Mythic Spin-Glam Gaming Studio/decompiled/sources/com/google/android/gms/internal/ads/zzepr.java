package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzepr extends zzepq {
    private final zzcob zza;
    private final zzdcy zzb;
    private final zzdjp zzc;
    private final zzeqb zzd;
    private final zzemv zze;

    zzepr(zzcob zzcobVar, zzdcy zzdcyVar, zzdjp zzdjpVar, zzeqb zzeqbVar, zzemv zzemvVar) {
        this.zza = zzcobVar;
        this.zzb = zzdcyVar;
        this.zzc = zzdjpVar;
        this.zzd = zzeqbVar;
        this.zze = zzemvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepq
    protected final ListenableFuture zzc(zzflw zzflwVar, Bundle bundle, zzfld zzfldVar, zzflo zzfloVar) {
        zzdcy zzdcyVar = this.zzb;
        zzdcyVar.zzb(zzflwVar);
        zzdcyVar.zzc(bundle);
        zzdcyVar.zzd(new zzdcs(zzfloVar, zzfldVar, this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeE)).booleanValue()) {
            zzdcyVar.zzg(this.zze);
        }
        zzcvq zzk = this.zza.zzk();
        zzk.zzd(zzdcyVar.zze());
        zzk.zze(this.zzc);
        zzczp zza = zzk.zzh().zza();
        return zza.zzc(zza.zzb());
    }
}
