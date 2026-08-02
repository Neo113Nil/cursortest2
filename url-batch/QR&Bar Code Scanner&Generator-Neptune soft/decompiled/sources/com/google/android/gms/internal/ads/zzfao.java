package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfao implements zzfaz {
    private zzdcj zza;

    @Override // com.google.android.gms.internal.ads.zzfaz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcj zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* bridge */ /* synthetic */ zzfzp zzc(zzfba zzfbaVar, zzfay zzfayVar, Object obj) {
        return zzb(zzfbaVar, zzfayVar, null);
    }

    public final synchronized zzfzp zzb(zzfba zzfbaVar, zzfay zzfayVar, zzdcj zzdcjVar) {
        zzdah zzb;
        if (zzdcjVar != null) {
            this.zza = zzdcjVar;
        } else {
            this.zza = (zzdcj) zzfayVar.zza(zzfbaVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzh(zzb.zzi());
    }
}
