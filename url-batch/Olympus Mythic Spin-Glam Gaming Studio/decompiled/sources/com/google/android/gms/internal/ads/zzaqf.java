package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqf implements zzaqh {
    private final zzeu zza;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaht zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private zzv zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzs;
    private boolean zzv;
    private boolean zzw;
    private int zzh = 0;
    private long zzt = -9223372036854775807L;
    private long zzu = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzq = -1;
    private int zzr = -1;
    private final String zze = "video/mp2t";

    public zzaqf(@Nullable String str, int i, int i2, String str2) {
        this.zza = new zzeu(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzg(zzeu zzeuVar, byte[] bArr, int i) {
        int min = Math.min(zzeuVar.zzd(), i - this.zzi);
        zzeuVar.zzm(bArr, this.zzi, min);
        int i2 = this.zzi + min;
        this.zzi = i2;
        return i2 == i;
    }

    private final void zzh(int i) {
        byte[] zzi = this.zza.zzi();
        zzi[0] = (byte) ((i >> 24) & 255);
        zzi[1] = (byte) ((i >> 16) & 255);
        zzi[2] = (byte) ((i >> 8) & 255);
        zzi[3] = (byte) (i & 255);
        this.zzi = 4;
    }

    private final void zzi(zzagf zzagfVar) {
        int i;
        int i2 = zzagfVar.zzb;
        if (i2 == -2147483647 || (i = zzagfVar.zzc) == -1) {
            return;
        }
        String str = zzagfVar.zza;
        if (str == null) {
            zzv zzvVar = this.zzm;
            str = zzvVar != null ? zzvVar.zzp : null;
        }
        zzv zzvVar2 = this.zzm;
        if (zzvVar2 != null && !this.zzs && i == zzvVar2.zzI && i2 == zzvVar2.zzK && Objects.equals(str, zzvVar2.zzp)) {
            return;
        }
        zzv zzvVar3 = this.zzm;
        zzt zztVar = zzvVar3 == null ? new zzt() : zzvVar3.zza();
        zztVar.zza(this.zzf);
        zztVar.zzn(this.zze);
        zztVar.zzo(str);
        zztVar.zzH(i);
        zztVar.zzJ(i2);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzQ = zztVar.zzQ();
        this.zzm = zzQ;
        this.zzg.zzA(zzQ);
        this.zzs = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzk = 0;
        this.zzj = 0;
        this.zzo = 0;
        this.zzt = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb.set(0);
        this.zzs = false;
        this.zzw = this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzf = zzarvVar.zzc();
        this.zzg = zzagkVar.zzs(zzarvVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        if (j != -9223372036854775807L) {
            if (this.zzh != 0) {
                this.zzu = j;
            } else {
                this.zzt = j;
                this.zzu = -9223372036854775807L;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i5 = 2;
            switch (this.zzh) {
                case 0:
                    while (true) {
                        if (zzeuVar.zzd() > 0) {
                            int i6 = this.zzk << 8;
                            this.zzk = i6;
                            int zzs = i6 | zzeuVar.zzs();
                            this.zzk = zzs;
                            int zzb = zzagg.zzb(zzs);
                            this.zzp = zzb;
                            if (zzb != 0) {
                                zzh(this.zzk);
                                this.zzk = 0;
                                if (!this.zzw || this.zzp != 2) {
                                    int i7 = this.zzp;
                                    if (i7 == 1) {
                                        this.zzw = false;
                                        i7 = 1;
                                    }
                                    int i8 = i7;
                                    if (i7 != 3 && i7 != 4) {
                                        if (i8 != 1) {
                                            this.zzh = 2;
                                            break;
                                        } else {
                                            this.zzh = 1;
                                            break;
                                        }
                                    } else {
                                        this.zzh = 4;
                                        break;
                                    }
                                } else {
                                    this.zzi = 0;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    zzeu zzeuVar2 = this.zza;
                    if (!zzg(zzeuVar, zzeuVar2.zzi(), 18)) {
                        break;
                    } else {
                        this.zzv = true;
                        byte[] zzi = zzeuVar2.zzi();
                        if (this.zzm == null) {
                            this.zzm = zzagg.zzc(zzi, this.zzf, this.zzc, this.zzd, this.zze, null);
                            this.zzs = true;
                        }
                        this.zzn = zzagg.zzd(zzi);
                        byte b2 = zzi[0];
                        if (b2 != -2) {
                            if (b2 == -1) {
                                i = (zzi[4] & 7) << 4;
                                b = zzi[7];
                            } else if (b2 != 31) {
                                i3 = ((zzi[5] & 252) >> 2) | ((zzi[4] & 1) << 6);
                                this.zzl = zzhbj.zza(zzfm.zzu((i3 + 1) * 32, this.zzm.zzK));
                                zzeuVar2.zzh(0);
                                this.zzg.zzc(zzeuVar2, 18);
                                this.zzh = 6;
                                break;
                            } else {
                                i = (zzi[5] & 7) << 4;
                                b = zzi[6];
                            }
                            i2 = b & 60;
                        } else {
                            i = (zzi[5] & 1) << 6;
                            i2 = zzi[4] & 252;
                        }
                        i3 = i | (i2 >> 2);
                        this.zzl = zzhbj.zza(zzfm.zzu((i3 + 1) * 32, this.zzm.zzK));
                        zzeuVar2.zzh(0);
                        this.zzg.zzc(zzeuVar2, 18);
                        this.zzh = 6;
                    }
                case 2:
                    zzeu zzeuVar3 = this.zza;
                    if (!zzg(zzeuVar, zzeuVar3.zzi(), 7)) {
                        break;
                    } else {
                        this.zzq = zzagg.zzf(zzeuVar3.zzi());
                        this.zzh = 3;
                        break;
                    }
                case 3:
                    zzeu zzeuVar4 = this.zza;
                    if (!zzg(zzeuVar, zzeuVar4.zzi(), this.zzq)) {
                        break;
                    } else {
                        zzagf zze = zzagg.zze(zzeuVar4.zzi());
                        zzi(zze);
                        this.zzn = zze.zzd;
                        long j = zze.zze;
                        if (j != -9223372036854775807L) {
                            this.zzl = j;
                        }
                        zzeuVar4.zzh(0);
                        this.zzg.zzc(zzeuVar4, this.zzq);
                        this.zzh = 6;
                        break;
                    }
                case 4:
                    zzeu zzeuVar5 = this.zza;
                    if (!zzg(zzeuVar, zzeuVar5.zzi(), 6)) {
                        break;
                    } else {
                        int zzh = zzagg.zzh(zzeuVar5.zzi());
                        this.zzr = zzh;
                        int i9 = this.zzi;
                        if (i9 > zzh) {
                            int i10 = i9 - zzh;
                            this.zzi = i9 - i10;
                            zzeuVar.zzh(zzeuVar.zzg() - i10);
                        }
                        this.zzh = 5;
                        break;
                    }
                case 5:
                    zzeu zzeuVar6 = this.zza;
                    if (!zzg(zzeuVar, zzeuVar6.zzi(), this.zzr)) {
                        break;
                    } else {
                        zzagf zzg = zzagg.zzg(zzeuVar6.zzi(), this.zzb);
                        if (this.zzp == 3) {
                            zzi(zzg);
                        }
                        this.zzn = zzg.zzd;
                        long j2 = zzg.zze;
                        if (j2 == -9223372036854775807L) {
                            j2 = 0;
                        }
                        this.zzl = j2;
                        zzeuVar6.zzh(0);
                        this.zzg.zzc(zzeuVar6, this.zzr);
                        this.zzh = 6;
                        break;
                    }
                case 6:
                    int min = Math.min(zzeuVar.zzd(), this.zzn - this.zzi);
                    this.zzg.zzc(zzeuVar, min);
                    int i11 = this.zzi + min;
                    this.zzi = i11;
                    int i12 = this.zzn;
                    if (i11 == i12) {
                        if (this.zzp != 1) {
                            zzguk.zzi(this.zzt != -9223372036854775807L);
                            int i13 = this.zzn;
                            int i14 = this.zzp;
                            if (i14 == 2) {
                                i4 = this.zzo;
                            } else {
                                i5 = i14;
                                i4 = 0;
                            }
                            int i15 = i13 + i4;
                            long j3 = this.zzt;
                            this.zzg.zze(j3, i5 == 4 ? 0 : 1, i15, 0, null);
                            this.zzt += this.zzl;
                            long j4 = this.zzu;
                            if (j4 != -9223372036854775807L) {
                                if (j4 != j3) {
                                    this.zzt = j4;
                                }
                                this.zzu = -9223372036854775807L;
                            }
                            this.zzo = 0;
                            this.zzh = 0;
                            break;
                        } else {
                            this.zzo = i12;
                            this.zzi = 0;
                            this.zzj = 0;
                            this.zzh = 7;
                            break;
                        }
                    } else {
                        break;
                    }
                default:
                    while (zzeuVar.zzd() > 0 && this.zzi < 4) {
                        int i16 = this.zzj << 8;
                        this.zzj = i16;
                        this.zzj = i16 | zzeuVar.zzs();
                        this.zzi++;
                    }
                    if (this.zzi == 4) {
                        if (zzagg.zzb(this.zzj) != 2) {
                            if (this.zzs) {
                                zzaht zzahtVar = this.zzg;
                                zzv zzvVar = this.zzm;
                                zzvVar.getClass();
                                zzahtVar.zzA(zzvVar);
                                this.zzs = false;
                            }
                            zzguk.zzi(this.zzt != -9223372036854775807L);
                            long j5 = this.zzt;
                            this.zzg.zze(j5, 1, this.zzo, 0, null);
                            this.zzt += this.zzl;
                            long j6 = this.zzu;
                            if (j6 != -9223372036854775807L) {
                                if (j6 != j5) {
                                    this.zzt = j6;
                                }
                                this.zzu = -9223372036854775807L;
                            }
                            this.zzo = 0;
                            int i17 = this.zzj;
                            this.zzk = i17;
                            this.zzj = 0;
                            int zzb2 = zzagg.zzb(i17);
                            this.zzp = zzb2;
                            if (zzb2 != 3 && zzb2 != 4) {
                                if (zzb2 != 1) {
                                    this.zzi = 0;
                                    this.zzh = 0;
                                    break;
                                } else {
                                    zzh(i17);
                                    this.zzk = 0;
                                    this.zzh = 1;
                                    break;
                                }
                            } else {
                                zzh(i17);
                                this.zzk = 0;
                                this.zzh = 4;
                                break;
                            }
                        } else {
                            zzh(this.zzj);
                            this.zzp = 2;
                            this.zzj = 0;
                            this.zzh = 2;
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzn() {
        if (this.zzh == 7) {
            zzaht zzahtVar = this.zzg;
            zzahtVar.getClass();
            if (this.zzs) {
                zzv zzvVar = this.zzm;
                zzvVar.getClass();
                zzahtVar.zzA(zzvVar);
                this.zzs = false;
            }
            long j = this.zzt;
            if (j != -9223372036854775807L) {
                this.zzg.zze(j, 1, this.zzo, 0, null);
                this.zzt += this.zzl;
            }
            this.zzo = 0;
            this.zzi = 0;
            this.zzk = 0;
            this.zzj = 0;
            this.zzh = 0;
        }
    }
}
