package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdlx implements zzgxi {
    private final zzdlk zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdlx(zzdlk zzdlkVar, zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzdlkVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcec zzb() {
        return new zzcec(((zzcos) this.zzb).zza(), ((zzdcr) this.zzc).zza().zzf);
    }
}
