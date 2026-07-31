package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
final class zzarn {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    zzarn(int i) {
    }

    private final int zze(zzagi zzagiVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagiVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzagi zzagiVar, zzahh zzahhVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzagiVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzagiVar.zzo();
            int min = (int) Math.min(112800L, zzo);
            long j2 = zzo - min;
            if (zzagiVar.zzn() == j2) {
                zzeu zzeuVar = this.zzb;
                zzeuVar.zza(min);
                zzagiVar.zzl();
                zzagiVar.zzi(zzeuVar.zzi(), 0, min);
                int zzg = zzeuVar.zzg();
                int zze = zzeuVar.zze();
                int i2 = zze - 188;
                while (true) {
                    if (i2 < zzg) {
                        break;
                    }
                    byte[] zzi = zzeuVar.zzi();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < zzg || i5 >= zze || zzi[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb = zzarx.zzb(zzeuVar, i2, i);
                                if (zzb != -9223372036854775807L) {
                                    j = zzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzahhVar.zza = j2;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzagiVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzagiVar);
                    return 0;
                }
                zzfj zzfjVar = this.zza;
                this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j3);
                zze(zzagiVar);
                return 0;
            }
            int min2 = (int) Math.min(112800L, zzagiVar.zzo());
            if (zzagiVar.zzn() == 0) {
                zzeu zzeuVar2 = this.zzb;
                zzeuVar2.zza(min2);
                zzagiVar.zzl();
                zzagiVar.zzi(zzeuVar2.zzi(), 0, min2);
                int zzg2 = zzeuVar2.zzg();
                int zze2 = zzeuVar2.zze();
                while (true) {
                    if (zzg2 >= zze2) {
                        break;
                    }
                    if (zzeuVar2.zzi()[zzg2] == 71) {
                        long zzb2 = zzarx.zzb(zzeuVar2, zzg2, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzg2++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzahhVar.zza = 0L;
        }
        return 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfj zzd() {
        return this.zza;
    }
}
