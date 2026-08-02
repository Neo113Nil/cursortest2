package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzafv {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzaf zzf;
    public final int zzg;
    public final long[] zzh;
    public final long[] zzi;
    public final int zzj;
    private final zzafw[] zzk;

    public zzafv(int i, int i2, long j, long j2, long j3, zzaf zzafVar, int i3, zzafw[] zzafwVarArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzafVar;
        this.zzg = i3;
        this.zzk = zzafwVarArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    public final zzafw zza(int i) {
        zzafw[] zzafwVarArr = this.zzk;
        if (zzafwVarArr == null) {
            return null;
        }
        return zzafwVarArr[i];
    }
}
