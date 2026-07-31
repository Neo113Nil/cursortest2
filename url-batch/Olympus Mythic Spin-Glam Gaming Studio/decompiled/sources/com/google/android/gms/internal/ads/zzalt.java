package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzalt implements zzalp {
    private final zzeu zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzalt(zzga zzgaVar) {
        zzeu zzeuVar = zzgaVar.zza;
        this.zza = zzeuVar;
        zzeuVar.zzh(12);
        this.zzc = zzeuVar.zzH() & 255;
        this.zzb = zzeuVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzs();
        }
        if (i == 16) {
            return this.zza.zzt();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int zzs = this.zza.zzs();
        this.zze = zzs;
        return (zzs & 240) >> 4;
    }
}
