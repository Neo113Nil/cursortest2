package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzamo implements zzamd {
    private final String zza;
    private final int zzb;
    private final String zzc = MimeTypes.VIDEO_MP2T;
    private final zzef zzd;
    private final zzee zze;
    private zzaeb zzf;
    private String zzg;
    private zzu zzh;
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
    private String zzw;

    public zzamo(String str, int i, String str2) {
        this.zza = str;
        this.zzb = i;
        zzef zzefVar = new zzef(1024);
        this.zzd = zzefVar;
        byte[] zzi = zzefVar.zzi();
        this.zze = new zzee(zzi, zzi.length);
        this.zzm = C.TIME_UNSET;
    }

    private final int zzf(zzee zzeeVar) throws zzas {
        int zzc = zzeeVar.zzc();
        zzabs zzb = zzabt.zzb(zzeeVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zzc - zzeeVar.zzc();
    }

    private static long zzg(zzee zzeeVar) {
        return zzeeVar.zzj((zzeeVar.zzj(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzi = 0;
        this.zzm = C.TIME_UNSET;
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzacxVar.zzu(zzanrVar.zzb(), 1);
        this.zzg = zzanrVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x015a, code lost:
    
        if (r14.zzn == false) goto L89;
     */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzef zzefVar) throws zzas {
        int i;
        int i2;
        int i3;
        boolean zzi;
        this.zzf.getClass();
        while (zzefVar.zzd() > 0) {
            int i4 = this.zzi;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzs = zzefVar.zzs();
                    if ((zzs & 224) == 224) {
                        this.zzl = zzs;
                        this.zzi = 2;
                    } else if (zzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzefVar.zzd(), this.zzk - this.zzj);
                    zzee zzeeVar = this.zze;
                    zzefVar.zzm(zzeeVar.zza, this.zzj, min);
                    int i5 = this.zzj + min;
                    this.zzj = i5;
                    if (i5 == this.zzk) {
                        zzeeVar.zzf(0);
                        if (!zzeeVar.zzi()) {
                            this.zzn = true;
                            int zzj = zzeeVar.zzj(1);
                            if (zzj == 1) {
                                i3 = zzeeVar.zzj(1);
                                i2 = 1;
                            } else {
                                i2 = zzj;
                                i3 = 0;
                            }
                            this.zzo = i3;
                            if (i3 != 0) {
                                throw zzas.zzb(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzeeVar);
                                i2 = 1;
                            }
                            if (!zzeeVar.zzi()) {
                                throw zzas.zzb(null, null);
                            }
                            this.zzp = zzeeVar.zzj(6);
                            int zzj2 = zzeeVar.zzj(4);
                            int zzj3 = zzeeVar.zzj(3);
                            if (zzj2 != 0 || zzj3 != 0) {
                                throw zzas.zzb(null, null);
                            }
                            if (i2 == 0) {
                                int zzd = zzeeVar.zzd();
                                int zzf = zzf(zzeeVar);
                                zzeeVar.zzf(zzd);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzeeVar.zzl(bArr, 0, zzf);
                                zzs zzsVar = new zzs();
                                zzsVar.zza(this.zzg);
                                zzsVar.zzl(this.zzc);
                                zzsVar.zzm(MimeTypes.AUDIO_AAC);
                                zzsVar.zzj(this.zzw);
                                zzsVar.zzE(this.zzv);
                                zzsVar.zzF(this.zzt);
                                zzsVar.zzp(Collections.singletonList(bArr));
                                zzsVar.zze(this.zza);
                                zzsVar.zzg(this.zzb);
                                zzu zzM = zzsVar.zzM();
                                if (!zzM.equals(this.zzh)) {
                                    this.zzh = zzM;
                                    this.zzu = 1024000000 / zzM.zzH;
                                    this.zzf.zzu(zzM);
                                }
                            } else {
                                zzeeVar.zzh(((int) zzg(zzeeVar)) - zzf(zzeeVar));
                            }
                            int zzj4 = zzeeVar.zzj(3);
                            this.zzq = zzj4;
                            if (zzj4 == 0) {
                                zzeeVar.zzh(8);
                            } else if (zzj4 == 1) {
                                zzeeVar.zzh(9);
                            } else if (zzj4 == 3 || zzj4 == 4 || zzj4 == 5) {
                                zzeeVar.zzh(6);
                            } else {
                                if (zzj4 != 6 && zzj4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzeeVar.zzh(1);
                            }
                            boolean zzi2 = zzeeVar.zzi();
                            this.zzr = zzi2;
                            this.zzs = 0L;
                            if (zzi2) {
                                if (i2 != 1) {
                                    do {
                                        zzi = zzeeVar.zzi();
                                        this.zzs = (this.zzs << 8) + zzeeVar.zzj(8);
                                    } while (zzi);
                                } else {
                                    this.zzs = zzg(zzeeVar);
                                }
                            }
                            if (zzeeVar.zzi()) {
                                zzeeVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzas.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzas.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzas.zzb(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzj5 = zzeeVar.zzj(8);
                            i = i6 + zzj5;
                            if (zzj5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzd2 = zzeeVar.zzd();
                        if ((zzd2 & 7) == 0) {
                            this.zzd.zzh(zzd2 >> 3);
                        } else {
                            zzef zzefVar2 = this.zzd;
                            zzeeVar.zzl(zzefVar2.zzi(), 0, i * 8);
                            zzefVar2.zzh(0);
                        }
                        this.zzf.zzz(this.zzd, i);
                        zzghc.zzh(this.zzm != C.TIME_UNSET);
                        this.zzf.zzx(this.zzm, 1, i, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzeeVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzs2 = ((this.zzl & (-225)) << 8) | zzefVar.zzs();
                    this.zzk = zzs2;
                    zzef zzefVar3 = this.zzd;
                    if (zzs2 > zzefVar3.zzi().length) {
                        zzefVar3.zza(zzs2);
                        zzee zzeeVar2 = this.zze;
                        byte[] zzi3 = zzefVar3.zzi();
                        zzeeVar2.zzb(zzi3, zzi3.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzefVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
