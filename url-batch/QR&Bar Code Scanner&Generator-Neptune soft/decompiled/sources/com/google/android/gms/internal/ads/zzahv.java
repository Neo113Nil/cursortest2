package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzahv implements zzyt {
    private final zzel zza;
    private final zzef zzb = new zzef();

    /* synthetic */ zzahv(zzel zzelVar, zzahu zzahuVar) {
        this.zza = zzelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final zzys zza(zzzj zzzjVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzzjVar.zzf();
        int min = (int) Math.min(20000L, zzzjVar.zzd() - zzf);
        this.zzb.zzC(min);
        ((zzyy) zzzjVar).zzm(this.zzb.zzH(), 0, min, false);
        zzef zzefVar = this.zzb;
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (zzefVar.zza() >= 4) {
            if (zzahw.zzh(zzefVar.zzH(), zzefVar.zzc()) != 442) {
                zzefVar.zzG(1);
            } else {
                zzefVar.zzG(4);
                long zzc = zzahx.zzc(zzefVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzys.zzd(zzb, zzf);
                        }
                        j2 = i2;
                    } else if (100000 + zzb > j) {
                        j2 = zzefVar.zzc();
                    } else {
                        i2 = zzefVar.zzc();
                        j3 = zzb;
                    }
                    return zzys.zze(zzf + j2);
                }
                int zzd = zzefVar.zzd();
                if (zzefVar.zza() >= 10) {
                    zzefVar.zzG(9);
                    int zzk = zzefVar.zzk() & 7;
                    if (zzefVar.zza() >= zzk) {
                        zzefVar.zzG(zzk);
                        if (zzefVar.zza() >= 4) {
                            if (zzahw.zzh(zzefVar.zzH(), zzefVar.zzc()) == 443) {
                                zzefVar.zzG(4);
                                int zzo = zzefVar.zzo();
                                if (zzefVar.zza() < zzo) {
                                    zzefVar.zzF(zzd);
                                } else {
                                    zzefVar.zzG(zzo);
                                }
                            }
                            while (true) {
                                if (zzefVar.zza() < 4 || (zzh = zzahw.zzh(zzefVar.zzH(), zzefVar.zzc())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzefVar.zzG(4);
                                if (zzefVar.zza() < 2) {
                                    zzefVar.zzF(zzd);
                                    break;
                                }
                                zzefVar.zzF(Math.min(zzefVar.zzd(), zzefVar.zzc() + zzefVar.zzo()));
                            }
                        } else {
                            zzefVar.zzF(zzd);
                        }
                    } else {
                        zzefVar.zzF(zzd);
                    }
                } else {
                    zzefVar.zzF(zzd);
                }
                i = zzefVar.zzc();
            }
        }
        return j3 != -9223372036854775807L ? zzys.zzf(j3, zzf + i) : zzys.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzb() {
        zzef zzefVar = this.zzb;
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        zzefVar.zzD(bArr, 0);
    }
}
