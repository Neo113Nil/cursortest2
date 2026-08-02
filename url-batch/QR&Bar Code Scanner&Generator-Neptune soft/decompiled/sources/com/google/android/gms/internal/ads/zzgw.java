package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgw implements zzjh {
    private final zzwi zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private int zzg;
    private boolean zzh;

    public zzgw() {
        zzwi zzwiVar = new zzwi(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zza = zzwiVar;
        this.zzb = zzen.zzv(50000L);
        this.zzc = zzen.zzv(50000L);
        this.zzd = zzen.zzv(2500L);
        this.zze = zzen.zzv(5000L);
        this.zzg = 13107200;
        this.zzf = zzen.zzv(0L);
    }

    private static void zzj(int i, int i2, String str, String str2) {
        zzdd.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z) {
        this.zzg = 13107200;
        this.zzh = false;
        if (z) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void zze(zzka[] zzkaVarArr, zzuh zzuhVar, zzvt[] zzvtVarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = zzkaVarArr.length;
            if (i >= 2) {
                int max = Math.max(13107200, i2);
                this.zzg = max;
                this.zza.zzf(max);
                return;
            } else {
                if (zzvtVarArr[i] != null) {
                    i2 += zzkaVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final boolean zzg(long j, long j2, float f) {
        int zza = this.zza.zza();
        int i = this.zzg;
        long j3 = this.zzb;
        if (f > 1.0f) {
            j3 = Math.min(zzen.zzs(j3, f), this.zzc);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = zza < i;
            this.zzh = z;
            if (!z && j2 < 500000) {
                zzdw.zze("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzc || zza >= i) {
            this.zzh = false;
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final boolean zzh(long j, float f, boolean z, long j2) {
        long zzu = zzen.zzu(j, f);
        long j3 = z ? this.zze : this.zzd;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || zzu >= j3 || this.zza.zza() >= this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final zzwi zzi() {
        return this.zza;
    }
}
