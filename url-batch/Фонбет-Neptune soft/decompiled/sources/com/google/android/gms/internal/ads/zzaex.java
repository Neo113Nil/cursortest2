package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaex implements zzack {
    private zzacn zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzagr zzg;
    private zzacl zzh;
    private zzafa zzi;
    private zzaiq zzj;
    private final zzek zza = new zzek(6);
    private long zzf = -1;

    private final int zza(zzacl zzaclVar) throws IOException {
        this.zza.zzH(2);
        ((zzaby) zzaclVar).zzm(this.zza.zzM(), 0, 2, false);
        return this.zza.zzq();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        int i;
        String zzx;
        zzaez zza;
        zzagr zzagrVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzH(2);
            ((zzaby) zzaclVar).zzn(this.zza.zzM(), 0, 2, false);
            int zzq = this.zza.zzq();
            this.zzd = zzq;
            if (zzq == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzg();
                return 0;
            }
            if ((zzq >= 65488 && zzq <= 65497) || zzq == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zza.zzH(2);
            ((zzaby) zzaclVar).zzn(this.zza.zzM(), 0, 2, false);
            this.zze = this.zza.zzq() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzaclVar != this.zzh) {
                    this.zzh = zzaclVar;
                    this.zzi = new zzafa(zzaclVar, this.zzf);
                }
                zzaiq zzaiqVar = this.zzj;
                zzaiqVar.getClass();
                int zzb = zzaiqVar.zzb(this.zzi, zzadfVar);
                if (zzb == 1) {
                    zzadfVar.zza += this.zzf;
                }
                return zzb;
            }
            long zzf = zzaclVar.zzf();
            long j2 = this.zzf;
            if (zzf != j2) {
                zzadfVar.zza = j2;
                return 1;
            }
            if (zzaclVar.zzm(this.zza.zzM(), 0, 1, true)) {
                zzaclVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzaiq(zzajy.zza, 8);
                }
                zzafa zzafaVar = new zzafa(zzaclVar, this.zzf);
                this.zzi = zzafaVar;
                if (this.zzj.zzj(zzafaVar)) {
                    zzaiq zzaiqVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzacn zzacnVar = this.zzb;
                    zzacnVar.getClass();
                    zzaiqVar2.zze(new zzafc(j3, zzacnVar));
                    zzagr zzagrVar2 = this.zzg;
                    zzagrVar2.getClass();
                    zzacn zzacnVar2 = this.zzb;
                    zzacnVar2.getClass();
                    zzadp zzw = zzacnVar2.zzw(1024, 4);
                    zzad zzadVar = new zzad();
                    zzadVar.zzB("image/jpeg");
                    zzadVar.zzQ(new zzbk(-9223372036854775807L, zzagrVar2));
                    zzw.zzl(zzadVar.zzad());
                    this.zzc = 5;
                } else {
                    zzg();
                }
            } else {
                zzg();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzek zzekVar = new zzek(this.zze);
            ((zzaby) zzaclVar).zzn(zzekVar.zzM(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzekVar.zzx((char) 0)) && (zzx = zzekVar.zzx((char) 0)) != null) {
                long zzd = zzaclVar.zzd();
                if (zzd != -1 && (zza = zzafd.zza(zzx)) != null && zza.zzb.size() >= 2) {
                    int size = zza.zzb.size() - 1;
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean z = false;
                    while (size >= 0) {
                        zzaey zzaeyVar = (zzaey) zza.zzb.get(size);
                        boolean equals = "video/mp4".equals(zzaeyVar.zza) | z;
                        if (size == 0) {
                            zzd -= zzaeyVar.zzc;
                            j = 0;
                        } else {
                            j = zzd - zzaeyVar.zzb;
                        }
                        long j8 = zzd;
                        zzd = j;
                        if (equals && zzd != j8) {
                            j7 = j8 - zzd;
                            j6 = zzd;
                            equals = false;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = zzd;
                        }
                        size--;
                        z = equals;
                    }
                    if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                        zzagrVar = new zzagr(j4, j5, zza.zza, j6, j7);
                        this.zzg = zzagrVar;
                        if (zzagrVar != null) {
                            this.zzf = zzagrVar.zzd;
                        }
                    }
                }
                zzagrVar = null;
                this.zzg = zzagrVar;
                if (zzagrVar != null) {
                }
            }
            i = 0;
        } else {
            i = 0;
            ((zzaby) zzaclVar).zzo(this.zze, false);
        }
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zzb = zzacnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        if (zza(zzaclVar) != 65496) {
            return false;
        }
        int zza = zza(zzaclVar);
        this.zzd = zza;
        if (zza == 65504) {
            this.zza.zzH(2);
            zzaby zzabyVar = (zzaby) zzaclVar;
            zzabyVar.zzm(this.zza.zzM(), 0, 2, false);
            zzabyVar.zzl(this.zza.zzq() - 2, false);
            zza = zza(zzaclVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzaby zzabyVar2 = (zzaby) zzaclVar;
            zzabyVar2.zzl(2, false);
            this.zza.zzH(6);
            zzabyVar2.zzm(this.zza.zzM(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaiq zzaiqVar = this.zzj;
            zzaiqVar.getClass();
            zzaiqVar.zzi(j, j2);
        }
    }

    private final void zzg() {
        zzacn zzacnVar = this.zzb;
        zzacnVar.getClass();
        zzacnVar.zzD();
        this.zzb.zzO(new zzadh(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
