package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdph implements zzgxi {
    private final zzdpc zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdph(zzdpc zzdpcVar, zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzdpcVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcec zzb() {
        return new zzcec(((zzcos) this.zzb).zza(), ((zzdcr) this.zzc).zza().zzf);
    }
}
