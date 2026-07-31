package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzaqs implements zzaqh {

    @Nullable
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzeu zzd;
    private final zzet zze;
    private zzaht zzf;
    private String zzg;
    private zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;

    @Nullable
    private String zzw;

    public zzaqs(@Nullable String str, int i, String str2) {
        this.zza = str;
        this.zzb = i;
        zzeu zzeuVar = new zzeu(1024);
        this.zzd = zzeuVar;
        byte[] zzi = zzeuVar.zzi();
        this.zze = new zzet(zzi, zzi.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzg(zzet zzetVar) throws zzat {
        int zzc = zzetVar.zzc();
        zzafe zzb = zzaff.zzb(zzetVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zzc - zzetVar.zzc();
    }

    private static long zzh(zzet zzetVar) {
        return zzetVar.zzj((zzetVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzb(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.zza();
        this.zzf = zzagkVar.zzs(zzarvVar.zzb(), 1);
        this.zzg = zzarvVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015a, code lost:
    
        if (r14.zzn == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i;
        int i2;
        int i3;
        boolean zzi;
        this.zzf.getClass();
        while (zzeuVar.zzd() > 0) {
            int i4 = this.zzi;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzs = zzeuVar.zzs();
                    if ((zzs & 224) == 224) {
                        this.zzl = zzs;
                        this.zzi = 2;
                    } else if (zzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzeuVar.zzd(), this.zzk - this.zzj);
                    zzet zzetVar = this.zze;
                    zzeuVar.zzm(zzetVar.zza, this.zzj, min);
                    int i5 = this.zzj + min;
                    this.zzj = i5;
                    if (i5 == this.zzk) {
                        zzetVar.zzf(0);
                        if (!zzetVar.zzi()) {
                            this.zzn = true;
                            int zzj = zzetVar.zzj(1);
                            if (zzj == 1) {
                                i3 = zzetVar.zzj(1);
                                i2 = 1;
                            } else {
                                i2 = zzj;
                                i3 = 0;
                            }
                            this.zzo = i3;
                            if (i3 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 1) {
                                zzh(zzetVar);
                                i2 = 1;
                            }
                            if (!zzetVar.zzi()) {
                                throw zzat.zzb(null, null);
                            }
                            this.zzp = zzetVar.zzj(6);
                            int zzj2 = zzetVar.zzj(4);
                            int zzj3 = zzetVar.zzj(3);
                            if (zzj2 != 0 || zzj3 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 0) {
                                int zzd = zzetVar.zzd();
                                int zzg = zzg(zzetVar);
                                zzetVar.zzf(zzd);
                                byte[] bArr = new byte[(zzg + 7) / 8];
                                zzetVar.zzl(bArr, 0, zzg);
                                zzt zztVar = new zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzn(this.zzc);
                                zztVar.zzo("audio/mp4a-latm");
                                zztVar.zzk(this.zzw);
                                zztVar.zzH(this.zzv);
                                zztVar.zzJ(this.zzt);
                                zztVar.zzr(Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                zzv zzQ = zztVar.zzQ();
                                if (!zzQ.equals(this.zzh)) {
                                    this.zzh = zzQ;
                                    this.zzu = 1024000000 / zzQ.zzK;
                                    this.zzf.zzA(zzQ);
                                }
                            } else {
                                zzetVar.zzh(((int) zzh(zzetVar)) - zzg(zzetVar));
                            }
                            int zzj4 = zzetVar.zzj(3);
                            this.zzq = zzj4;
                            if (zzj4 == 0) {
                                zzetVar.zzh(8);
                            } else if (zzj4 == 1) {
                                zzetVar.zzh(9);
                            } else if (zzj4 == 3 || zzj4 == 4 || zzj4 == 5) {
                                zzetVar.zzh(6);
                            } else {
                                if (zzj4 != 6 && zzj4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzetVar.zzh(1);
                            }
                            boolean zzi2 = zzetVar.zzi();
                            this.zzr = zzi2;
                            this.zzs = 0L;
                            if (zzi2) {
                                if (i2 != 1) {
                                    do {
                                        zzi = zzetVar.zzi();
                                        this.zzs = (this.zzs << 8) + zzetVar.zzj(8);
                                    } while (zzi);
                                } else {
                                    this.zzs = zzh(zzetVar);
                                }
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzat.zzb(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzj5 = zzetVar.zzj(8);
                            i = i6 + zzj5;
                            if (zzj5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzd2 = zzetVar.zzd();
                        if ((zzd2 & 7) == 0) {
                            this.zzd.zzh(zzd2 >> 3);
                        } else {
                            zzeu zzeuVar2 = this.zzd;
                            zzetVar.zzl(zzeuVar2.zzi(), 0, i * 8);
                            zzeuVar2.zzh(0);
                        }
                        this.zzf.zzc(this.zzd, i);
                        zzguk.zzi(this.zzm != -9223372036854775807L);
                        this.zzf.zze(this.zzm, 1, i, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzetVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzs2 = ((this.zzl & (-225)) << 8) | zzeuVar.zzs();
                    this.zzk = zzs2;
                    zzeu zzeuVar3 = this.zzd;
                    if (zzs2 > zzeuVar3.zzi().length) {
                        zzeuVar3.zza(zzs2);
                        zzet zzetVar2 = this.zze;
                        byte[] zzi3 = zzeuVar3.zzi();
                        zzetVar2.zzb(zzi3, zzi3.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzeuVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }
}
