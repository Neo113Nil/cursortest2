package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaez implements zzafg {
    private final zzaff zza;
    private final long zzb;
    private final long zzc;
    private final zzafl zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaez(zzafl zzaflVar, long j, long j2, long j3, long j4, boolean z) {
        zzcw.zzd(j >= 0 && j2 > j);
        this.zzd = zzaflVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzaff();
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final /* bridge */ /* synthetic */ zzzv zze() {
        zzaex zzaexVar = null;
        if (this.zzf != 0) {
            return new zzaey(this, zzaexVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final void zzg(long j) {
        this.zzh = zzeg.zzr(j, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzafg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzd(zzyt zzytVar) throws IOException {
        long zzr;
        int i = this.zze;
        if (i == 0) {
            long zzf = zzytVar.zzf();
            this.zzg = zzf;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > zzf) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.zzi;
                long j3 = this.zzj;
                if (j2 != j3) {
                    long zzf2 = zzytVar.zzf();
                    if (this.zza.zzc(zzytVar, j3)) {
                        this.zza.zzb(zzytVar, false);
                        zzytVar.zzj();
                        long j4 = this.zzh;
                        zzaff zzaffVar = this.zza;
                        long j5 = zzaffVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzaffVar.zzd + zzaffVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = zzf2;
                                this.zzl = j5;
                            } else {
                                this.zzi = zzytVar.zzf() + i2;
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < 100000) {
                                this.zzj = j8;
                                zzr = j8;
                            } else {
                                zzr = zzeg.zzr((zzytVar.zzf() - (i2 * (j6 <= 0 ? 2L : 1L))) + ((j6 * j9) / (this.zzl - this.zzk)), j8, j7 - 1);
                            }
                        }
                    } else {
                        zzr = this.zzi;
                        if (zzr == zzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (zzr == -1) {
                        return zzr;
                    }
                    this.zze = 3;
                }
                zzr = -1;
                if (zzr == -1) {
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzytVar, -1L);
                this.zza.zzb(zzytVar, false);
                zzaff zzaffVar2 = this.zza;
                if (zzaffVar2.zzb > this.zzh) {
                    zzytVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zzym) zzytVar).zzo(zzaffVar2.zzd + zzaffVar2.zze, false);
                this.zzi = zzytVar.zzf();
                this.zzk = this.zza.zzb;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzytVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzytVar, false);
        zzaff zzaffVar3 = this.zza;
        ((zzym) zzytVar).zzo(zzaffVar3.zzd + zzaffVar3.zze, false);
        long j10 = this.zza.zzb;
        while (true) {
            zzaff zzaffVar4 = this.zza;
            if ((zzaffVar4.zza & 4) == 4 || !zzaffVar4.zzc(zzytVar, -1L) || zzytVar.zzf() >= this.zzc || !this.zza.zzb(zzytVar, true)) {
                break;
            }
            zzaff zzaffVar5 = this.zza;
            if (!zzyw.zze(zzytVar, zzaffVar5.zzd + zzaffVar5.zze)) {
                break;
            }
            j10 = this.zza.zzb;
        }
        this.zzf = j10;
        this.zze = 4;
        return this.zzg;
    }
}
