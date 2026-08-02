package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzawb implements zzavy {
    private final zzbak zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzawb(zzavv zzavvVar) {
        zzbak zzbakVar = zzavvVar.zza;
        this.zza = zzbakVar;
        zzbakVar.zzv(12);
        this.zzc = zzbakVar.zzi() & 255;
        this.zzb = zzbakVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final int zzb() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzg();
        }
        if (i == 16) {
            return this.zza.zzj();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzg = this.zza.zzg();
        this.zze = zzg;
        return (zzg & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final boolean zzc() {
        return false;
    }
}
