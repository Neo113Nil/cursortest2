package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzyg {
    public static final zzyg zza = new zzyg(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzyg(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzyg zzd(long j, long j2) {
        return new zzyg(-1, j, j2);
    }

    public static zzyg zze(long j) {
        return new zzyg(0, -9223372036854775807L, j);
    }

    public static zzyg zzf(long j, long j2) {
        return new zzyg(-2, j, j2);
    }
}
