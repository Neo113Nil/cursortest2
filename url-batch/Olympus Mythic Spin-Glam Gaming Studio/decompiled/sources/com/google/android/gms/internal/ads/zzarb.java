package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzarb implements zzafs {
    private final zzfj zza;
    private final zzeu zzb = new zzeu();

    /* synthetic */ zzarb(zzfj zzfjVar, byte[] bArr) {
        this.zza = zzfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzafr zza(zzagi zzagiVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzn = zzagiVar.zzn();
        int min = (int) Math.min(20000L, zzagiVar.zzo() - zzn);
        zzeu zzeuVar = this.zzb;
        zzeuVar.zza(min);
        zzagiVar.zzi(zzeuVar.zzi(), 0, min);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (zzeuVar.zzd() >= 4) {
            if (zzarc.zzh(zzeuVar.zzi(), zzeuVar.zzg()) != 442) {
                zzeuVar.zzk(1);
            } else {
                zzeuVar.zzk(4);
                long zze = zzard.zze(zzeuVar);
                if (zze != -9223372036854775807L) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzafr.zza(zze2, zzn);
                        }
                        j2 = i2;
                    } else if (100000 + zze2 > j) {
                        j2 = zzeuVar.zzg();
                    } else {
                        i2 = zzeuVar.zzg();
                        j3 = zze2;
                    }
                    return zzafr.zzc(zzn + j2);
                }
                int zze3 = zzeuVar.zze();
                if (zzeuVar.zzd() >= 10) {
                    zzeuVar.zzk(9);
                    int zzs = zzeuVar.zzs() & 7;
                    if (zzeuVar.zzd() >= zzs) {
                        zzeuVar.zzk(zzs);
                        if (zzeuVar.zzd() >= 4) {
                            if (zzarc.zzh(zzeuVar.zzi(), zzeuVar.zzg()) == 443) {
                                zzeuVar.zzk(4);
                                int zzt = zzeuVar.zzt();
                                if (zzeuVar.zzd() < zzt) {
                                    zzeuVar.zzh(zze3);
                                } else {
                                    zzeuVar.zzk(zzt);
                                }
                            }
                            while (true) {
                                if (zzeuVar.zzd() < 4 || (zzh = zzarc.zzh(zzeuVar.zzi(), zzeuVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzeuVar.zzk(4);
                                if (zzeuVar.zzd() < 2) {
                                    zzeuVar.zzh(zze3);
                                    break;
                                }
                                zzeuVar.zzh(Math.min(zzeuVar.zze(), zzeuVar.zzg() + zzeuVar.zzt()));
                            }
                        } else {
                            zzeuVar.zzh(zze3);
                        }
                    } else {
                        zzeuVar.zzh(zze3);
                    }
                } else {
                    zzeuVar.zzh(zze3);
                }
                i = zzeuVar.zzg();
            }
        }
        return j3 != -9223372036854775807L ? zzafr.zzb(j3, zzn + i) : zzafr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final void zzb() {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
