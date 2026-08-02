package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzagb implements zzagi {
    private final zzagh zza;
    private final long zzb;
    private final long zzc;
    private final zzagn zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzagb(zzagn zzagnVar, long j, long j2, long j3, long j4, boolean z) {
        zzdd.zzd(j >= 0 && j2 > j);
        this.zzd = zzagnVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzagh();
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final /* bridge */ /* synthetic */ zzaal zze() {
        zzafz zzafzVar = null;
        if (this.zzf != 0) {
            return new zzaga(this, zzafzVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void zzg(long j) {
        this.zzh = zzen.zzr(j, 0L, this.zzf - 1);
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    @Override // com.google.android.gms.internal.ads.zzagi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzd(zzzj zzzjVar) throws IOException {
        long zzr;
        int i = this.zze;
        long j = -1;
        if (i == 0) {
            long zzf = zzzjVar.zzf();
            this.zzg = zzf;
            this.zze = 1;
            long j2 = this.zzc - 65307;
            if (j2 > zzf) {
                return j2;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j3 = this.zzi;
                long j4 = this.zzj;
                if (j3 != j4) {
                    long zzf2 = zzzjVar.zzf();
                    if (this.zza.zzc(zzzjVar, j4)) {
                        this.zza.zzb(zzzjVar, false);
                        zzzjVar.zzj();
                        long j5 = this.zzh;
                        zzagh zzaghVar = this.zza;
                        long j6 = zzaghVar.zzb;
                        long j7 = j5 - j6;
                        int i2 = zzaghVar.zzd + zzaghVar.zze;
                        if (j7 < 0 || j7 >= 72000) {
                            if (j7 < 0) {
                                this.zzj = zzf2;
                                this.zzl = j6;
                            } else {
                                this.zzi = zzzjVar.zzf() + i2;
                                this.zzk = j6;
                            }
                            long j8 = this.zzj;
                            long j9 = this.zzi;
                            long j10 = j8 - j9;
                            if (j10 < 100000) {
                                this.zzj = j9;
                                zzr = j9;
                            } else {
                                j = -1;
                                zzr = zzen.zzr((zzzjVar.zzf() - (i2 * (j7 <= 0 ? 2L : 1L))) + ((j7 * j10) / (this.zzl - this.zzk)), j9, j8 - 1);
                            }
                        }
                    } else {
                        zzr = this.zzi;
                        if (zzr == zzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                    if (zzr == j) {
                        return zzr;
                    }
                    this.zze = 3;
                }
                zzr = -1;
                if (zzr == j) {
                }
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzzjVar, j);
                this.zza.zzb(zzzjVar, false);
                zzagh zzaghVar2 = this.zza;
                if (zzaghVar2.zzb > this.zzh) {
                    zzzjVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                ((zzyy) zzzjVar).zzo(zzaghVar2.zzd + zzaghVar2.zze, false);
                this.zzi = zzzjVar.zzf();
                this.zzk = this.zza.zzb;
                j = -1;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzzjVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzzjVar, false);
        zzagh zzaghVar3 = this.zza;
        ((zzyy) zzzjVar).zzo(zzaghVar3.zzd + zzaghVar3.zze, false);
        long j11 = this.zza.zzb;
        while (true) {
            zzagh zzaghVar4 = this.zza;
            if ((zzaghVar4.zza & 4) == 4 || !zzaghVar4.zzc(zzzjVar, -1L) || zzzjVar.zzf() >= this.zzc || !this.zza.zzb(zzzjVar, true)) {
                break;
            }
            zzagh zzaghVar5 = this.zza;
            if (!zzzm.zze(zzzjVar, zzaghVar5.zzd + zzaghVar5.zze)) {
                break;
            }
            j11 = this.zza.zzb;
        }
        this.zzf = j11;
        this.zze = 4;
        return this.zzg;
    }
}
