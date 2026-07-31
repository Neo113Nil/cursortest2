package com.google.android.gms.internal.ads;

import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzace {
    public static final zzace zza = new zzace(-3, C.TIME_UNSET, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzace(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzace zza(long j, long j2) {
        return new zzace(-1, j, j2);
    }

    public static zzace zzb(long j, long j2) {
        return new zzace(-2, j, j2);
    }

    public static zzace zzc(long j) {
        return new zzace(0, C.TIME_UNSET, j);
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
