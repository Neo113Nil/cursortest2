package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzawa implements zzavy {
    private final int zza;
    private final int zzb;
    private final zzbak zzc;

    public zzawa(zzavv zzavvVar) {
        zzbak zzbakVar = zzavvVar.zza;
        this.zzc = zzbakVar;
        zzbakVar.zzv(12);
        this.zza = zzbakVar.zzi();
        this.zzb = zzbakVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final int zzb() {
        int i = this.zza;
        return i == 0 ? this.zzc.zzi() : i;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final boolean zzc() {
        return this.zza != 0;
    }
}
