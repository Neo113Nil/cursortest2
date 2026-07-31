package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzamq implements zzamd {
    private String zzf;
    private zzaeb zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = MimeTypes.VIDEO_MP2T;
    private int zze = 0;
    private final zzef zzb = new zzef(new byte[15], 2);
    private final zzee zzc = new zzee();
    private final zzef zzd = new zzef();
    private final zzamr zzq = new zzamr();
    private int zzr = C.RATE_UNSET_INT;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzamq(String str) {
    }

    private static final void zzf(zzef zzefVar, zzef zzefVar2, boolean z) {
        int zzg = zzefVar.zzg();
        int min = Math.min(zzefVar.zzd(), zzefVar2.zzd());
        zzefVar.zzm(zzefVar2.zzi(), zzefVar2.zzg(), min);
        zzefVar2.zzk(min);
        if (z) {
            zzefVar.zzh(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = C.RATE_UNSET_INT;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != C.TIME_UNSET) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) throws zzas {
        int i;
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i2 = this.zze;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzl;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (zzefVar.zzd() > 0) {
                            int i5 = this.zzm << 8;
                            this.zzm = i5;
                            int zzs = i5 | zzefVar.zzs();
                            this.zzm = zzs;
                            if ((zzs & ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzefVar.zzh(zzefVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzefVar.zzh(zzefVar.zze());
            } else if (i2 != 1) {
                zzamr zzamrVar = this.zzq;
                int i6 = zzamrVar.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzefVar, this.zzd, true);
                }
                int min = Math.min(zzefVar.zzd(), zzamrVar.zzc - this.zzo);
                this.zzg.zzz(zzefVar, min);
                int i7 = this.zzo + min;
                this.zzo = i7;
                if (i7 == zzamrVar.zzc) {
                    int i8 = zzamrVar.zza;
                    if (i8 == 1) {
                        byte[] zzi = this.zzd.zzi();
                        zzams zzb = zzamt.zzb(new zzee(zzi, zzi.length));
                        this.zzr = zzb.zzb;
                        this.zzs = zzb.zzc;
                        long j = this.zzu;
                        long j2 = zzamrVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i9 = zzb.zza;
                            String str = "mhm1";
                            if (i9 != -1) {
                                String format = String.format(".%02X", Integer.valueOf(i9));
                                String.valueOf(format);
                                str = "mhm1".concat(String.valueOf(format));
                            }
                            byte[] bArr = zzb.zzd;
                            zzgjz zzgjzVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgjzVar = zzgjz.zzk(zzeo.zzb, bArr);
                            }
                            zzs zzsVar = new zzs();
                            zzsVar.zza(this.zzf);
                            zzsVar.zzl(this.zza);
                            zzsVar.zzm(MimeTypes.AUDIO_MPEGH_MHM1);
                            zzsVar.zzF(this.zzr);
                            zzsVar.zzj(str);
                            zzsVar.zzp(zzgjzVar);
                            this.zzg.zzu(zzsVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i8 == 17) {
                        byte[] zzi2 = this.zzd.zzi();
                        zzee zzeeVar = new zzee(zzi2, zzi2.length);
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(2);
                            i3 = zzeeVar.zzj(13);
                        }
                        this.zzt = i3;
                    } else if (i8 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long round = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i10 * 1000000.0d) / d;
                        }
                        this.zzg.zzx(round, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzef zzefVar2 = this.zzb;
                zzf(zzefVar, zzefVar2, false);
                if (zzefVar2.zzd() == 0) {
                    zzee zzeeVar2 = this.zzc;
                    int zze = zzefVar2.zze();
                    zzeeVar2.zzb(zzefVar2.zzi(), zze);
                    zzamr zzamrVar2 = this.zzq;
                    if (zzamt.zza(zzeeVar2, zzamrVar2)) {
                        this.zzo = 0;
                        this.zzp += zzamrVar2.zzc + zze;
                        zzefVar2.zzh(0);
                        this.zzg.zzz(zzefVar2, zzefVar2.zze());
                        zzefVar2.zza(2);
                        this.zzd.zza(zzamrVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzefVar2.zze() < 15) {
                        zzefVar2.zzf(zzefVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
