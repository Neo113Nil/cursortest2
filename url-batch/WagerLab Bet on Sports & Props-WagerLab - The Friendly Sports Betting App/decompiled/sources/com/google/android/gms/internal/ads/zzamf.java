package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzamf implements zzamd {
    private static final double[] zzc = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zza;
    private zzaeb zzb;
    private final zzanv zzd;
    private final String zze;
    private final zzef zzf;
    private final zzamu zzg;
    private final boolean[] zzh = new boolean[4];
    private final zzame zzi = new zzame(128);
    private long zzj;
    private boolean zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private boolean zzq;
    private boolean zzr;

    zzamf(zzanv zzanvVar, String str) {
        zzef zzefVar;
        this.zzd = zzanvVar;
        this.zze = str;
        if (zzanvVar != null) {
            this.zzg = new zzamu(178, 128);
            zzefVar = new zzef();
        } else {
            zzefVar = null;
            this.zzg = null;
        }
        this.zzf = zzefVar;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        zzfl.zzi(this.zzh);
        this.zzi.zza();
        zzamu zzamuVar = this.zzg;
        if (zzamuVar != null) {
            zzamuVar.zza();
        }
        this.zzj = 0L;
        this.zzk = false;
        this.zzn = C.TIME_UNSET;
        this.zzp = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zza = zzanrVar.zzc();
        this.zzb = zzacxVar.zzu(zzanrVar.zzb(), 2);
        zzanv zzanvVar = this.zzd;
        if (zzanvVar != null) {
            zzanvVar.zza(zzacxVar, zzanrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzamd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(zzef zzefVar) {
        int i;
        zzamu zzamuVar;
        int i2;
        long j;
        long j2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        long j3;
        byte b;
        int i7;
        this.zzb.getClass();
        int zzg = zzefVar.zzg();
        int zze = zzefVar.zze();
        byte[] zzi = zzefVar.zzi();
        this.zzj += zzefVar.zzd();
        this.zzb.zzz(zzefVar, zzefVar.zzd());
        while (true) {
            int zzh = zzfl.zzh(zzi, zzg, zze, this.zzh);
            if (zzh == zze) {
                break;
            }
            int i8 = zzh + 3;
            int i9 = zzefVar.zzi()[i8] & 255;
            int i10 = zzh - zzg;
            if (!this.zzl) {
                if (i10 > 0) {
                    this.zzi.zzc(zzi, zzg, zzh);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                zzame zzameVar = this.zzi;
                if (zzameVar.zzb(i9, i11)) {
                    String str = this.zza;
                    str.getClass();
                    String str2 = this.zze;
                    byte[] copyOf = Arrays.copyOf(zzameVar.zzc, zzameVar.zza);
                    int i12 = copyOf[4] & 255;
                    byte b2 = copyOf[5];
                    i = zze;
                    int i13 = copyOf[6] & 255;
                    int i14 = (i12 << 4) | ((b2 & 255) >> 4);
                    int i15 = (copyOf[7] & 240) >> 4;
                    int i16 = ((b2 & Ascii.SI) << 8) | i13;
                    if (i15 == 2) {
                        i4 = i16 * 4;
                        i5 = i14 * 3;
                    } else if (i15 == 3) {
                        i4 = i16 * 16;
                        i5 = i14 * 9;
                    } else if (i15 != 4) {
                        f = 1.0f;
                        zzs zzsVar = new zzs();
                        zzsVar.zza(str);
                        zzsVar.zzl(str2);
                        zzsVar.zzm(MimeTypes.VIDEO_MPEG2);
                        zzsVar.zzt(i14);
                        zzsVar.zzu(i16);
                        zzsVar.zzz(f);
                        zzsVar.zzp(Collections.singletonList(copyOf));
                        zzu zzM = zzsVar.zzM();
                        i6 = (copyOf[7] & Ascii.SI) - 1;
                        j3 = 0;
                        if (i6 >= 0 && i6 < 8) {
                            double d = zzc[i6];
                            b = copyOf[zzameVar.zzb + 9];
                            i7 = (b & 96) >> 5;
                            if (i7 != (b & Ascii.US)) {
                                d *= (i7 + 1.0d) / (r11 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzM, Long.valueOf(j3));
                        this.zzb.zzu((zzu) create.first);
                        this.zzm = ((Long) create.second).longValue();
                        this.zzl = true;
                        zzamuVar = this.zzg;
                        if (zzamuVar != null) {
                            if (i10 > 0) {
                                zzamuVar.zzd(zzi, zzg, zzh);
                                i3 = 0;
                            } else {
                                i3 = -i10;
                            }
                            if (zzamuVar.zze(i3)) {
                                int zza = zzfl.zza(zzamuVar.zza, zzamuVar.zzb);
                                zzef zzefVar2 = this.zzf;
                                String str3 = zzeo.zza;
                                zzefVar2.zzb(zzamuVar.zza, zza);
                                this.zzd.zzb(this.zzp, zzefVar2);
                            }
                            if (i9 == 178) {
                                if (zzefVar.zzi()[zzh + 2] == 1) {
                                    zzamuVar.zzc(178);
                                }
                                i9 = 178;
                            }
                        }
                        if (i9 != 0 || i9 == 179) {
                            i2 = i - zzh;
                            if (this.zzr || !this.zzl) {
                                j = -9223372036854775807L;
                            } else {
                                j = -9223372036854775807L;
                                long j4 = this.zzp;
                                if (j4 != C.TIME_UNSET) {
                                    boolean z3 = this.zzq;
                                    int i17 = ((int) (this.zzj - this.zzo)) - i2;
                                    zzaeb zzaebVar = this.zzb;
                                    j = C.TIME_UNSET;
                                    zzaebVar.zzx(j4, z3 ? 1 : 0, i17, i2, null);
                                }
                            }
                            if (this.zzk || this.zzr) {
                                this.zzo = this.zzj - i2;
                                j2 = this.zzn;
                                if (j2 == j) {
                                    long j5 = this.zzp;
                                    j2 = j5 != j ? j5 + this.zzm : j;
                                }
                                this.zzp = j2;
                                z = false;
                                this.zzq = false;
                                this.zzn = j;
                                z2 = true;
                                this.zzk = true;
                            } else {
                                z2 = true;
                                z = false;
                            }
                            this.zzr = i9 == 0 ? z2 : z;
                        } else if (i9 == 184) {
                            this.zzq = true;
                        }
                        zzg = i8;
                        zze = i;
                    } else {
                        i4 = i16 * 121;
                        i5 = i14 * 100;
                    }
                    f = i4 / i5;
                    zzs zzsVar2 = new zzs();
                    zzsVar2.zza(str);
                    zzsVar2.zzl(str2);
                    zzsVar2.zzm(MimeTypes.VIDEO_MPEG2);
                    zzsVar2.zzt(i14);
                    zzsVar2.zzu(i16);
                    zzsVar2.zzz(f);
                    zzsVar2.zzp(Collections.singletonList(copyOf));
                    zzu zzM2 = zzsVar2.zzM();
                    i6 = (copyOf[7] & Ascii.SI) - 1;
                    j3 = 0;
                    if (i6 >= 0) {
                        double d2 = zzc[i6];
                        b = copyOf[zzameVar.zzb + 9];
                        i7 = (b & 96) >> 5;
                        if (i7 != (b & Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(zzM2, Long.valueOf(j3));
                    this.zzb.zzu((zzu) create2.first);
                    this.zzm = ((Long) create2.second).longValue();
                    this.zzl = true;
                    zzamuVar = this.zzg;
                    if (zzamuVar != null) {
                    }
                    if (i9 != 0) {
                    }
                    i2 = i - zzh;
                    if (this.zzr) {
                    }
                    j = -9223372036854775807L;
                    if (this.zzk) {
                    }
                    this.zzo = this.zzj - i2;
                    j2 = this.zzn;
                    if (j2 == j) {
                    }
                    this.zzp = j2;
                    z = false;
                    this.zzq = false;
                    this.zzn = j;
                    z2 = true;
                    this.zzk = true;
                    this.zzr = i9 == 0 ? z2 : z;
                    zzg = i8;
                    zze = i;
                }
            }
            i = zze;
            zzamuVar = this.zzg;
            if (zzamuVar != null) {
            }
            if (i9 != 0) {
            }
            i2 = i - zzh;
            if (this.zzr) {
            }
            j = -9223372036854775807L;
            if (this.zzk) {
            }
            this.zzo = this.zzj - i2;
            j2 = this.zzn;
            if (j2 == j) {
            }
            this.zzp = j2;
            z = false;
            this.zzq = false;
            this.zzn = j;
            z2 = true;
            this.zzk = true;
            this.zzr = i9 == 0 ? z2 : z;
            zzg = i8;
            zze = i;
        }
        if (!this.zzl) {
            this.zzi.zzc(zzi, zzg, zze);
        }
        zzamu zzamuVar2 = this.zzg;
        if (zzamuVar2 != null) {
            zzamuVar2.zzd(zzi, zzg, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        zzaeb zzaebVar = this.zzb;
        zzaebVar.getClass();
        if (z) {
            boolean z2 = this.zzq;
            long j = this.zzj - this.zzo;
            zzaebVar.zzx(this.zzp, z2 ? 1 : 0, (int) j, 0, null);
        }
    }
}
