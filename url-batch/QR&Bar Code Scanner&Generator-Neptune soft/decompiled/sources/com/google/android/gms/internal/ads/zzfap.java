package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfap implements zzfaz {
    private final zzfaz zza;
    private zzdcj zzb;

    public zzfap(zzfaz zzfazVar) {
        this.zza = zzfazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdcj zzd() {
        return this.zzb;
    }

    public final synchronized zzfzp zzb(zzfba zzfbaVar, zzfay zzfayVar, zzdcj zzdcjVar) {
        this.zzb = zzdcjVar;
        if (zzfbaVar.zza == null) {
            return ((zzfao) this.zza).zzb(zzfbaVar, zzfayVar, zzdcjVar);
        }
        zzdah zzb = this.zzb.zzb();
        return zzb.zzh(zzb.zzj(zzfzg.zzi(zzfbaVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfaz
    public final /* bridge */ /* synthetic */ zzfzp zzc(zzfba zzfbaVar, zzfay zzfayVar, Object obj) {
        return zzb(zzfbaVar, zzfayVar, null);
    }
}
