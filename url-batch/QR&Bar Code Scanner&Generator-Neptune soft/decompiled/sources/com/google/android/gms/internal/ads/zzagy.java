package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzagy implements zzahc {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzee zzc = new zzee(new byte[7], 7);
    private final zzef zzd = new zzef(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzaap zzg;
    private zzaap zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzaap zzu;
    private long zzv;

    public zzagy(boolean z, String str) {
        zzh();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzh();
    }

    private final void zzh() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzi() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private final void zzj(zzaap zzaapVar, long j, int i, int i2) {
        this.zzi = 4;
        this.zzj = i;
        this.zzu = zzaapVar;
        this.zzv = j;
        this.zzs = i2;
    }

    private final boolean zzk(zzef zzefVar, byte[] bArr, int i) {
        int min = Math.min(zzefVar.zza(), i - this.zzj);
        zzefVar.zzB(bArr, this.zzj, min);
        int i2 = this.zzj + min;
        this.zzj = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & UByte.MAX_VALUE) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzef zzefVar, byte[] bArr, int i) {
        if (zzefVar.zza() < i) {
            return false;
        }
        zzefVar.zzB(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zza(zzef zzefVar) throws zzbu {
        int i;
        int i2;
        int i3;
        int i4;
        Objects.requireNonNull(this.zzg);
        int i5 = zzen.zza;
        while (zzefVar.zza() > 0) {
            int i6 = this.zzi;
            int i7 = 13;
            int i8 = 2;
            if (i6 == 0) {
                byte[] zzH = zzefVar.zzH();
                int zzc = zzefVar.zzc();
                int zzd = zzefVar.zzd();
                while (true) {
                    if (zzc >= zzd) {
                        zzefVar.zzF(zzc);
                        break;
                    }
                    i = zzc + 1;
                    i2 = zzH[zzc] & UByte.MAX_VALUE;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) i2)) {
                        if (!this.zzm) {
                            int i9 = i - 2;
                            zzefVar.zzF(i9 + 1);
                            if (zzm(zzefVar, this.zzc.zza, 1)) {
                                this.zzc.zzh(4);
                                int zzc2 = this.zzc.zzc(1);
                                int i10 = this.zzn;
                                if (i10 == -1 || zzc2 == i10) {
                                    if (this.zzo != -1) {
                                        if (!zzm(zzefVar, this.zzc.zza, 1)) {
                                            break;
                                        }
                                        this.zzc.zzh(i8);
                                        if (this.zzc.zzc(4) == this.zzo) {
                                            zzefVar.zzF(i9 + 2);
                                        }
                                    }
                                    if (!zzm(zzefVar, this.zzc.zza, 4)) {
                                        break;
                                    }
                                    this.zzc.zzh(14);
                                    int zzc3 = this.zzc.zzc(i7);
                                    if (zzc3 >= 7) {
                                        byte[] zzH2 = zzefVar.zzH();
                                        int zzd2 = zzefVar.zzd();
                                        int i11 = i9 + zzc3;
                                        if (i11 < zzd2) {
                                            byte b = zzH2[i11];
                                            if (b != -1) {
                                                if (b == 73) {
                                                    int i12 = i11 + 1;
                                                    if (i12 == zzd2) {
                                                        break;
                                                    }
                                                    if (zzH2[i12] == 68) {
                                                        int i13 = i11 + 2;
                                                        if (i13 == zzd2) {
                                                            break;
                                                        } else if (zzH2[i13] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i14 = i11 + 1;
                                                if (i14 == zzd2) {
                                                    break;
                                                }
                                                byte b2 = zzH2[i14];
                                                if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzc2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    int i15 = this.zzk;
                    int i16 = i15 | i2;
                    if (i16 == 329) {
                        i3 = 2;
                        i4 = 768;
                    } else if (i16 == 511) {
                        i3 = 2;
                        i4 = 512;
                    } else if (i16 == 836) {
                        i3 = 2;
                        i4 = 1024;
                    } else {
                        if (i16 == 1075) {
                            this.zzi = 2;
                            this.zzj = 3;
                            this.zzs = 0;
                            this.zzd.zzF(0);
                            zzefVar.zzF(i);
                            break;
                        }
                        if (i15 != 256) {
                            this.zzk = 256;
                            zzc = i - 1;
                            i7 = 13;
                            i8 = 2;
                        } else {
                            i3 = 2;
                            i8 = i3;
                            zzc = i;
                            i7 = 13;
                        }
                    }
                    this.zzk = i4;
                    i8 = i3;
                    zzc = i;
                    i7 = 13;
                }
                this.zzp = (i2 & 8) >> 3;
                this.zzl = 1 == ((i2 & 1) ^ 1);
                if (this.zzm) {
                    zzi();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzefVar.zzF(i);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(zzefVar.zza(), this.zzs - this.zzj);
                        this.zzu.zzq(zzefVar, min);
                        int i17 = this.zzj + min;
                        this.zzj = i17;
                        int i18 = this.zzs;
                        if (i17 == i18) {
                            long j = this.zzt;
                            if (j != -9223372036854775807L) {
                                this.zzu.zzs(j, 1, i18, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzh();
                        }
                    } else {
                        if (zzk(zzefVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzh(0);
                            if (this.zzq) {
                                this.zzc.zzj(10);
                            } else {
                                int zzc4 = this.zzc.zzc(2) + 1;
                                if (zzc4 != 2) {
                                    zzdw.zze("AdtsReader", "Detected audio object type: " + zzc4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzj(5);
                                int zzc5 = this.zzc.zzc(3);
                                int i19 = this.zzo;
                                int i20 = zzyg.zza;
                                byte[] bArr = {(byte) (((i19 >> 1) & 7) | 16), (byte) (((zzc5 << 3) & 120) | ((i19 << 7) & 128))};
                                zzyf zza2 = zzyg.zza(bArr);
                                zzad zzadVar = new zzad();
                                zzadVar.zzH(this.zzf);
                                zzadVar.zzS("audio/mp4a-latm");
                                zzadVar.zzx(zza2.zzc);
                                zzadVar.zzw(zza2.zzb);
                                zzadVar.zzT(zza2.zza);
                                zzadVar.zzI(Collections.singletonList(bArr));
                                zzadVar.zzK(this.zze);
                                zzaf zzY = zzadVar.zzY();
                                this.zzr = 1024000000 / zzY.zzA;
                                this.zzg.zzk(zzY);
                                this.zzq = true;
                            }
                            this.zzc.zzj(4);
                            int zzc6 = this.zzc.zzc(13) - 7;
                            if (this.zzl) {
                                zzc6 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzc6);
                        }
                    }
                } else if (zzk(zzefVar, this.zzd.zzH(), 10)) {
                    this.zzh.zzq(this.zzd, 10);
                    this.zzd.zzF(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzj());
                }
            } else if (zzefVar.zza() != 0) {
                zzee zzeeVar = this.zzc;
                zzeeVar.zza[0] = zzefVar.zzH()[zzefVar.zzc()];
                zzeeVar.zzh(2);
                int zzc7 = this.zzc.zzc(4);
                int i21 = this.zzo;
                if (i21 == -1 || zzc7 == i21) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzc7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zzf = zzaioVar.zzb();
        zzaap zzv = zzzlVar.zzv(zzaioVar.zza(), 1);
        this.zzg = zzv;
        this.zzu = zzv;
        if (!this.zzb) {
            this.zzh = new zzzh();
            return;
        }
        zzaioVar.zzc();
        zzaap zzv2 = zzzlVar.zzv(zzaioVar.zza(), 5);
        this.zzh = zzv2;
        zzad zzadVar = new zzad();
        zzadVar.zzH(zzaioVar.zzb());
        zzadVar.zzS("application/id3");
        zzv2.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzt = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        this.zzt = -9223372036854775807L;
        zzg();
    }
}
