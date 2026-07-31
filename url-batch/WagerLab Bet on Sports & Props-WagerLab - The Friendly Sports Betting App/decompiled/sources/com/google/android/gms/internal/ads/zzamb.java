package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzamb implements zzamd {
    private final zzef zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaeb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzu zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = C.TIME_UNSET;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = MimeTypes.VIDEO_MP2T;

    public zzamb(String str, int i, int i2, String str2) {
        this.zza = new zzef(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzf(zzef zzefVar, byte[] bArr, int i) {
        int min = Math.min(zzefVar.zzd(), i - this.zzi);
        zzefVar.zzm(bArr, this.zzi, min);
        int i2 = this.zzi + min;
        this.zzi = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    private final void zzg(zzacs zzacsVar) {
        int i;
        int i2 = zzacsVar.zzb;
        if (i2 == -2147483647 || (i = zzacsVar.zzc) == -1) {
            return;
        }
        zzu zzuVar = this.zzl;
        if (zzuVar != null && i == zzuVar.zzG && i2 == zzuVar.zzH && Objects.equals(zzacsVar.zza, zzuVar.zzo)) {
            return;
        }
        zzu zzuVar2 = this.zzl;
        zzs zzsVar = zzuVar2 == null ? new zzs() : zzuVar2.zza();
        zzsVar.zza(this.zzf);
        zzsVar.zzl(this.zze);
        zzsVar.zzm(zzacsVar.zza);
        zzsVar.zzE(i);
        zzsVar.zzF(i2);
        zzsVar.zze(this.zzc);
        zzsVar.zzg(this.zzd);
        zzu zzM = zzsVar.zzM();
        this.zzl = zzM;
        this.zzg.zzu(zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = C.TIME_UNSET;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) throws zzas {
        int i;
        byte b;
        int i2;
        byte b2;
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i3 = this.zzh;
            if (i3 == 0) {
                while (true) {
                    if (zzefVar.zzd() > 0) {
                        int i4 = this.zzj << 8;
                        this.zzj = i4;
                        int zzs = i4 | zzefVar.zzs();
                        this.zzj = zzs;
                        int zza = zzact.zza(zzs);
                        this.zzn = zza;
                        if (zza != 0) {
                            byte[] zzi = this.zza.zzi();
                            int i5 = this.zzj;
                            zzi[0] = (byte) ((i5 >> 24) & 255);
                            zzi[1] = (byte) ((i5 >> 16) & 255);
                            zzi[2] = (byte) ((i5 >> 8) & 255);
                            zzi[3] = (byte) (i5 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            if (zza == 3 || zza == 4) {
                                this.zzh = 4;
                            } else if (zza == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i3 == 1) {
                zzef zzefVar2 = this.zza;
                if (zzf(zzefVar, zzefVar2.zzi(), 18)) {
                    byte[] zzi2 = zzefVar2.zzi();
                    if (this.zzl == null) {
                        zzu zzb = zzact.zzb(zzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzb;
                        this.zzg.zzu(zzb);
                    }
                    this.zzm = zzact.zzc(zzi2);
                    byte b3 = zzi2[0];
                    if (b3 != -2) {
                        if (b3 == -1) {
                            i = (zzi2[4] & 7) << 4;
                            b2 = zzi2[7];
                        } else if (b3 != 31) {
                            i = (zzi2[4] & 1) << 6;
                            b = zzi2[5];
                        } else {
                            i = (zzi2[5] & 7) << 4;
                            b2 = zzi2[6];
                        }
                        i2 = b2 & 60;
                        this.zzk = zzgne.zza(zzeo.zzr(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzH));
                        zzefVar2.zzh(0);
                        this.zzg.zzz(zzefVar2, 18);
                        this.zzh = 6;
                    } else {
                        i = (zzi2[5] & 1) << 6;
                        b = zzi2[4];
                    }
                    i2 = b & 252;
                    this.zzk = zzgne.zza(zzeo.zzr(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzH));
                    zzefVar2.zzh(0);
                    this.zzg.zzz(zzefVar2, 18);
                    this.zzh = 6;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    zzef zzefVar3 = this.zza;
                    if (zzf(zzefVar, zzefVar3.zzi(), this.zzo)) {
                        zzacs zzd = zzact.zzd(zzefVar3.zzi());
                        zzg(zzd);
                        this.zzm = zzd.zzd;
                        long j = zzd.zze;
                        this.zzk = j != C.TIME_UNSET ? j : 0L;
                        zzefVar3.zzh(0);
                        this.zzg.zzz(zzefVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i3 == 4) {
                    zzef zzefVar4 = this.zza;
                    if (zzf(zzefVar, zzefVar4.zzi(), 6)) {
                        int zzg = zzact.zzg(zzefVar4.zzi());
                        this.zzp = zzg;
                        int i6 = this.zzi;
                        if (i6 > zzg) {
                            int i7 = i6 - zzg;
                            this.zzi = i6 - i7;
                            zzefVar.zzh(zzefVar.zzg() - i7);
                        }
                        this.zzh = 5;
                    }
                } else if (i3 != 5) {
                    int min = Math.min(zzefVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzz(zzefVar, min);
                    int i8 = this.zzi + min;
                    this.zzi = i8;
                    if (i8 == this.zzm) {
                        zzghc.zzh(this.zzq != C.TIME_UNSET);
                        this.zzg.zzx(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzef zzefVar5 = this.zza;
                    if (zzf(zzefVar, zzefVar5.zzi(), this.zzp)) {
                        zzacs zzf = zzact.zzf(zzefVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzf);
                        }
                        this.zzm = zzf.zzd;
                        long j2 = zzf.zze;
                        this.zzk = j2 != C.TIME_UNSET ? j2 : 0L;
                        zzefVar5.zzh(0);
                        this.zzg.zzz(zzefVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzef zzefVar6 = this.zza;
                if (zzf(zzefVar, zzefVar6.zzi(), 7)) {
                    this.zzo = zzact.zze(zzefVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
