package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaeo implements zzack {
    private final byte[] zza;
    private final zzek zzb;
    private final zzacq zzc;
    private zzacn zzd;
    private zzadp zze;
    private int zzf;
    private zzbk zzg;
    private zzacv zzh;
    private int zzi;
    private int zzj;
    private zzaen zzk;
    private int zzl;
    private long zzm;

    public zzaeo() {
        throw null;
    }

    public zzaeo(int i) {
        this.zza = new byte[42];
        this.zzb = new zzek(new byte[32768], 0);
        this.zzc = new zzacq();
        this.zzf = 0;
    }

    private final long zza(zzek zzekVar, boolean z) {
        boolean z2;
        this.zzh.getClass();
        int zzd = zzekVar.zzd();
        while (zzd <= zzekVar.zze() - 16) {
            zzekVar.zzK(zzd);
            if (zzacr.zzc(zzekVar, this.zzh, this.zzj, this.zzc)) {
                zzekVar.zzK(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        if (!z) {
            zzekVar.zzK(zzd);
            return -1L;
        }
        while (zzd <= zzekVar.zze() - this.zzi) {
            zzekVar.zzK(zzd);
            try {
                z2 = zzacr.zzc(zzekVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzekVar.zzd() <= zzekVar.zze() && z2) {
                zzekVar.zzK(zzd);
                return this.zzc.zza;
            }
            zzd++;
        }
        zzekVar.zzK(zzekVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j = this.zzm * 1000000;
        zzacv zzacvVar = this.zzh;
        int i = zzet.zza;
        this.zze.zzs(j / zzacvVar.zze, 1, this.zzl, 0, null);
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
        this.zzd = zzacnVar;
        this.zze = zzacnVar.zzw(0, 1);
        zzacnVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzacs.zza(zzaclVar, false);
        zzek zzekVar = new zzek(4);
        ((zzaby) zzaclVar).zzm(zzekVar.zzM(), 0, 4, false);
        return zzekVar.zzu() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzaen zzaenVar = this.zzk;
            if (zzaenVar != null) {
                zzaenVar.zzd(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        boolean zzp;
        zzadi zzadhVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzaclVar.zzj();
            long zze = zzaclVar.zze();
            zzbk zza = zzacs.zza(zzaclVar, true);
            ((zzaby) zzaclVar).zzo((int) (zzaclVar.zze() - zze), false);
            this.zzg = zza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            ((zzaby) zzaclVar).zzm(this.zza, 0, 42, false);
            zzaclVar.zzj();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzek zzekVar = new zzek(4);
            ((zzaby) zzaclVar).zzn(zzekVar.zzM(), 0, 4, false);
            if (zzekVar.zzu() != 1716281667) {
                throw zzbo.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzacv zzacvVar = this.zzh;
            do {
                zzaclVar.zzj();
                zzej zzejVar = new zzej(new byte[4], 4);
                zzaby zzabyVar = (zzaby) zzaclVar;
                zzabyVar.zzm(zzejVar.zza, 0, 4, false);
                zzp = zzejVar.zzp();
                int zzd = zzejVar.zzd(7);
                int zzd2 = zzejVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzabyVar.zzn(bArr, 0, 38, false);
                    zzacvVar = new zzacv(bArr, 4);
                } else {
                    if (zzacvVar == null) {
                        throw new IllegalArgumentException();
                    }
                    if (zzd == 3) {
                        zzek zzekVar2 = new zzek(zzd2);
                        zzabyVar.zzn(zzekVar2.zzM(), 0, zzd2, false);
                        zzacvVar = zzacvVar.zzf(zzacs.zzb(zzekVar2));
                    } else if (zzd == 4) {
                        zzek zzekVar3 = new zzek(zzd2);
                        zzabyVar.zzn(zzekVar3.zzM(), 0, zzd2, false);
                        zzekVar3.zzL(4);
                        zzacvVar = zzacvVar.zzg(Arrays.asList(zzadv.zzc(zzekVar3, false, false).zza));
                    } else if (zzd == 6) {
                        zzek zzekVar4 = new zzek(zzd2);
                        zzabyVar.zzn(zzekVar4.zzM(), 0, zzd2, false);
                        zzekVar4.zzL(4);
                        zzacvVar = zzacvVar.zze(zzfxr.zzn(zzafj.zzb(zzekVar4)));
                    } else {
                        zzabyVar.zzo(zzd2, false);
                    }
                }
                int i2 = zzet.zza;
                this.zzh = zzacvVar;
            } while (!zzp);
            zzacvVar.getClass();
            this.zzi = Math.max(zzacvVar.zzc, 6);
            this.zze.zzl(this.zzh.zzc(this.zza, this.zzg));
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzaclVar.zzj();
            zzek zzekVar5 = new zzek(2);
            ((zzaby) zzaclVar).zzm(zzekVar5.zzM(), 0, 2, false);
            int zzq = zzekVar5.zzq();
            if ((zzq >> 2) != 16382) {
                zzaclVar.zzj();
                throw zzbo.zza("First frame does not start with sync code.", null);
            }
            zzaclVar.zzj();
            this.zzj = zzq;
            zzacn zzacnVar = this.zzd;
            int i3 = zzet.zza;
            long zzf = zzaclVar.zzf();
            long zzd3 = zzaclVar.zzd();
            zzacv zzacvVar2 = this.zzh;
            zzacvVar2.getClass();
            if (zzacvVar2.zzk != null) {
                zzadhVar = new zzact(zzacvVar2, zzf);
            } else if (zzd3 == -1 || zzacvVar2.zzj <= 0) {
                zzadhVar = new zzadh(zzacvVar2.zza(), 0L);
            } else {
                zzaen zzaenVar = new zzaen(zzacvVar2, this.zzj, zzf, zzd3);
                this.zzk = zzaenVar;
                zzadhVar = zzaenVar.zzb();
            }
            zzacnVar.zzO(zzadhVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzacv zzacvVar3 = this.zzh;
        zzacvVar3.getClass();
        zzaen zzaenVar2 = this.zzk;
        if (zzaenVar2 != null && zzaenVar2.zze()) {
            return zzaenVar2.zza(zzaclVar, zzadfVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzacr.zzb(zzaclVar, zzacvVar3);
            return 0;
        }
        zzek zzekVar6 = this.zzb;
        int zze2 = zzekVar6.zze();
        if (zze2 < 32768) {
            int zza2 = zzaclVar.zza(zzekVar6.zzM(), zze2, 32768 - zze2);
            z = zza2 == -1;
            if (!z) {
                this.zzb.zzJ(zze2 + zza2);
            } else if (this.zzb.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z = false;
        }
        zzek zzekVar7 = this.zzb;
        int zzd4 = zzekVar7.zzd();
        int i4 = this.zzl;
        int i5 = this.zzi;
        if (i4 < i5) {
            zzekVar7.zzL(Math.min(i5 - i4, zzekVar7.zzb()));
        }
        long zza3 = zza(this.zzb, z);
        zzek zzekVar8 = this.zzb;
        int zzd5 = zzekVar8.zzd() - zzd4;
        zzekVar8.zzK(zzd4);
        this.zze.zzq(this.zzb, zzd5);
        this.zzl += zzd5;
        if (zza3 != -1) {
            zzg();
            this.zzl = 0;
            this.zzm = zza3;
        }
        zzek zzekVar9 = this.zzb;
        if (zzekVar9.zzb() >= 16) {
            return 0;
        }
        int zzb = zzekVar9.zzb();
        System.arraycopy(zzekVar9.zzM(), zzekVar9.zzd(), zzekVar9.zzM(), 0, zzb);
        this.zzb.zzK(0);
        this.zzb.zzJ(zzb);
        return 0;
    }
}
