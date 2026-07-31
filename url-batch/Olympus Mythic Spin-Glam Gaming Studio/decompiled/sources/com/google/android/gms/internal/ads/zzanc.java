package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzanc implements zzanj {
    private final zzani zza;
    private final long zzb;
    private final long zzc;
    private final zzann zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzanc(zzann zzannVar, long j, long j2, long j3, long j4, boolean z) {
        zzguk.zza(j >= 0 && j2 > j);
        this.zzd = zzannVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzani();
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    public final void zzb(long j) {
        long j2 = this.zzf - 1;
        String str = zzfm.zza;
        this.zzh = Math.max(0L, Math.min(j, j2));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzanj
    @Nullable
    public final /* bridge */ /* synthetic */ zzahk zzc() {
        byte[] bArr = null;
        if (this.zzf != 0) {
            return new zzanb(this, bArr);
        }
        return null;
    }

    final /* synthetic */ long zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ zzann zzf() {
        return this.zzd;
    }

    final /* synthetic */ long zzg() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzanj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(zzagi zzagiVar) throws IOException {
        long max;
        int i = this.zze;
        if (i == 0) {
            long zzn = zzagiVar.zzn();
            this.zzg = zzn;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > zzn) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.zzi;
                long j3 = this.zzj;
                if (j2 != j3) {
                    long zzn2 = zzagiVar.zzn();
                    zzani zzaniVar = this.zza;
                    if (zzaniVar.zzb(zzagiVar, j3)) {
                        zzaniVar.zzc(zzagiVar, false);
                        zzagiVar.zzl();
                        long j4 = this.zzh;
                        long j5 = zzaniVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzaniVar.zzd + zzaniVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = zzn2;
                                this.zzl = j5;
                            } else {
                                this.zzi = i2 + zzagiVar.zzn();
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < 100000) {
                                this.zzj = j8;
                                max = j8;
                            } else {
                                long j10 = i2;
                                long j11 = j6 <= 0 ? 2L : 1L;
                                String str = zzfm.zza;
                                max = Math.max(j8, Math.min((zzagiVar.zzn() - (j10 * j11)) + ((j6 * j9) / (this.zzl - this.zzk)), j7 - 1));
                            }
                        }
                    } else {
                        max = this.zzi;
                        if (max == zzn2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (max == -1) {
                        return max;
                    }
                    this.zze = 3;
                }
                max = -1;
                if (max == -1) {
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                zzani zzaniVar2 = this.zza;
                zzaniVar2.zzb(zzagiVar, -1L);
                zzaniVar2.zzc(zzagiVar, false);
                if (zzaniVar2.zzb > this.zzh) {
                    zzagiVar.zzl();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                zzagiVar.zzf(zzaniVar2.zzd + zzaniVar2.zze);
                this.zzi = zzagiVar.zzn();
                this.zzk = zzaniVar2.zzb;
            }
        }
        zzani zzaniVar3 = this.zza;
        zzaniVar3.zza();
        if (!zzaniVar3.zzb(zzagiVar, -1L)) {
            throw new EOFException();
        }
        zzaniVar3.zzc(zzagiVar, false);
        zzagiVar.zzf(zzaniVar3.zzd + zzaniVar3.zze);
        long j12 = zzaniVar3.zzb;
        while ((zzaniVar3.zza & 4) != 4 && zzaniVar3.zzb(zzagiVar, -1L) && zzagiVar.zzn() < this.zzc && zzaniVar3.zzc(zzagiVar, true) && zzagl.zzd(zzagiVar, zzaniVar3.zzd + zzaniVar3.zze)) {
            j12 = zzaniVar3.zzb;
        }
        this.zzf = j12;
        this.zze = 4;
        return this.zzg;
    }
}
