package com.google.android.gms.internal.ads;

import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahp implements zzahc {
    private final String zza;
    private final zzef zzb;
    private final zzee zzc;
    private zzaap zzd;
    private String zze;
    private zzaf zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private String zzu;

    public zzahp(String str) {
        this.zza = str;
        zzef zzefVar = new zzef(1024);
        this.zzb = zzefVar;
        byte[] zzH = zzefVar.zzH();
        this.zzc = new zzee(zzH, zzH.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzee zzeeVar) throws zzbu {
        int zza = zzeeVar.zza();
        zzyf zzb = zzyg.zzb(zzeeVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzeeVar.zza();
    }

    private static long zzg(zzee zzeeVar) {
        return zzeeVar.zzc((zzeeVar.zzc(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x0154, code lost:
    
        if (r14.zzl == false) goto L88;
     */
    @Override // com.google.android.gms.internal.ads.zzahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzef zzefVar) throws zzbu {
        int i;
        int i2;
        int i3;
        boolean zzl;
        zzdd.zzb(this.zzd);
        while (zzefVar.zza() > 0) {
            int i4 = this.zzg;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzk = zzefVar.zzk();
                    if ((zzk & 224) == 224) {
                        this.zzj = zzk;
                        this.zzg = 2;
                    } else if (zzk != 86) {
                        this.zzg = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzefVar.zza(), this.zzi - this.zzh);
                    zzefVar.zzB(this.zzc.zza, this.zzh, min);
                    int i5 = this.zzh + min;
                    this.zzh = i5;
                    if (i5 == this.zzi) {
                        this.zzc.zzh(0);
                        zzee zzeeVar = this.zzc;
                        if (!zzeeVar.zzl()) {
                            this.zzl = true;
                            int zzc = zzeeVar.zzc(1);
                            if (zzc == 1) {
                                i3 = zzeeVar.zzc(1);
                                i2 = 1;
                            } else {
                                i2 = zzc;
                                i3 = 0;
                            }
                            this.zzm = i3;
                            if (i3 != 0) {
                                throw zzbu.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzeeVar);
                                i2 = 1;
                            }
                            if (!zzeeVar.zzl()) {
                                throw zzbu.zza(null, null);
                            }
                            this.zzn = zzeeVar.zzc(6);
                            int zzc2 = zzeeVar.zzc(4);
                            int zzc3 = zzeeVar.zzc(3);
                            if (zzc2 != 0 || zzc3 != 0) {
                                throw zzbu.zza(null, null);
                            }
                            if (i2 == 0) {
                                int zzb = zzeeVar.zzb();
                                int zzf = zzf(zzeeVar);
                                zzeeVar.zzh(zzb);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzeeVar.zzf(bArr, 0, zzf);
                                zzad zzadVar = new zzad();
                                zzadVar.zzH(this.zze);
                                zzadVar.zzS("audio/mp4a-latm");
                                zzadVar.zzx(this.zzu);
                                zzadVar.zzw(this.zzt);
                                zzadVar.zzT(this.zzr);
                                zzadVar.zzI(Collections.singletonList(bArr));
                                zzadVar.zzK(this.zza);
                                zzaf zzY = zzadVar.zzY();
                                if (!zzY.equals(this.zzf)) {
                                    this.zzf = zzY;
                                    this.zzs = 1024000000 / zzY.zzA;
                                    this.zzd.zzk(zzY);
                                }
                            } else {
                                zzeeVar.zzj(((int) zzg(zzeeVar)) - zzf(zzeeVar));
                            }
                            int zzc4 = zzeeVar.zzc(3);
                            this.zzo = zzc4;
                            if (zzc4 == 0) {
                                zzeeVar.zzj(8);
                            } else if (zzc4 == 1) {
                                zzeeVar.zzj(9);
                            } else if (zzc4 == 3 || zzc4 == 4 || zzc4 == 5) {
                                zzeeVar.zzj(6);
                            } else {
                                if (zzc4 != 6 && zzc4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzeeVar.zzj(1);
                            }
                            boolean zzl2 = zzeeVar.zzl();
                            this.zzp = zzl2;
                            this.zzq = 0L;
                            if (zzl2) {
                                if (i2 != 1) {
                                    do {
                                        zzl = zzeeVar.zzl();
                                        this.zzq = (this.zzq << 8) + zzeeVar.zzc(8);
                                    } while (zzl);
                                } else {
                                    this.zzq = zzg(zzeeVar);
                                }
                            }
                            if (zzeeVar.zzl()) {
                                zzeeVar.zzj(8);
                            }
                        }
                        if (this.zzm != 0) {
                            throw zzbu.zza(null, null);
                        }
                        if (this.zzn != 0) {
                            throw zzbu.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw zzbu.zza(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzc5 = zzeeVar.zzc(8);
                            i = i6 + zzc5;
                            if (zzc5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzb2 = zzeeVar.zzb();
                        if ((zzb2 & 7) == 0) {
                            this.zzb.zzF(zzb2 >> 3);
                        } else {
                            zzeeVar.zzf(this.zzb.zzH(), 0, i * 8);
                            this.zzb.zzF(0);
                        }
                        this.zzd.zzq(this.zzb, i);
                        long j = this.zzk;
                        if (j != -9223372036854775807L) {
                            this.zzd.zzs(j, 1, i, 0, null);
                            this.zzk += this.zzs;
                        }
                        if (this.zzp) {
                            zzeeVar.zzj((int) this.zzq);
                        }
                        this.zzg = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzk2 = ((this.zzj & (-225)) << 8) | zzefVar.zzk();
                    this.zzi = zzk2;
                    zzef zzefVar2 = this.zzb;
                    if (zzk2 > zzefVar2.zzH().length) {
                        zzefVar2.zzC(zzk2);
                        zzee zzeeVar2 = this.zzc;
                        byte[] zzH = this.zzb.zzH();
                        zzeeVar2.zzg(zzH, zzH.length);
                    }
                    this.zzh = 0;
                    this.zzg = 3;
                }
            } else if (zzefVar.zzk() == 86) {
                this.zzg = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zzd = zzzlVar.zzv(zzaioVar.zza(), 1);
        this.zze = zzaioVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
