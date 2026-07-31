package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzafr {
    public static final zzafr zza = new zzafr(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzafr(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzafr zza(long j, long j2) {
        return new zzafr(-1, j, j2);
    }

    public static zzafr zzb(long j, long j2) {
        return new zzafr(-2, j, j2);
    }

    public static zzafr zzc(long j) {
        return new zzafr(0, -9223372036854775807L, j);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
