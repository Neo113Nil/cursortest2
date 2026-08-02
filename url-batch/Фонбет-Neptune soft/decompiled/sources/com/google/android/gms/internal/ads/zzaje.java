package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaje implements zzajj {
    private final zzacv zza;
    private final zzacu zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzaje(zzacv zzacvVar, zzacu zzacuVar) {
        this.zza = zzacvVar;
        this.zzb = zzacuVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzd(zzacl zzaclVar) {
        long j = this.zzd;
        if (j < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final zzadi zze() {
        zzdi.zzf(this.zzc != -1);
        return new zzact(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzet.zzc(jArr, j, true, true)];
    }
}
