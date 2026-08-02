package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamb implements zzamf {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzej zzc = new zzej(new byte[7], 7);
    private final zzek zzd = new zzek(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzadp zzh;
    private zzadp zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzadp zzv;
    private long zzw;

    public zzamb(boolean z, String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzadp zzadpVar, long j, int i, int i2) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzadpVar;
        this.zzw = j;
        this.zzt = i2;
    }

    private final boolean zzk(zzek zzekVar, byte[] bArr, int i) {
        int min = Math.min(zzekVar.zzb(), i - this.zzk);
        zzekVar.zzG(bArr, this.zzk, min);
        int i2 = this.zzk + min;
        this.zzk = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzek zzekVar, byte[] bArr, int i) {
        if (zzekVar.zzb() < i) {
            return false;
        }
        zzekVar.zzG(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02be  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzek zzekVar) throws zzbo {
        int i;
        byte b;
        int i2;
        int i3;
        this.zzh.getClass();
        int i4 = zzet.zza;
        while (zzekVar.zzb() > 0) {
            int i5 = this.zzj;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzM = zzekVar.zzM();
                int zzd = zzekVar.zzd();
                int zze = zzekVar.zze();
                while (true) {
                    if (zzd >= zze) {
                        zzekVar.zzK(zzd);
                        break;
                    }
                    i = zzd + 1;
                    b = zzM[zzd];
                    int i8 = b & 255;
                    if (this.zzl == 512 && zzl((byte) -1, (byte) i8)) {
                        if (!this.zzn) {
                            int i9 = zzd - 1;
                            zzekVar.zzK(zzd);
                            if (zzm(zzekVar, this.zzc.zza, 1)) {
                                this.zzc.zzl(4);
                                int zzd2 = this.zzc.zzd(1);
                                int i10 = this.zzo;
                                if (i10 == -1 || zzd2 == i10) {
                                    if (this.zzp != -1) {
                                        if (!zzm(zzekVar, this.zzc.zza, 1)) {
                                            break;
                                        }
                                        this.zzc.zzl(i7);
                                        if (this.zzc.zzd(4) == this.zzp) {
                                            zzekVar.zzK(zzd + 1);
                                        }
                                    }
                                    if (!zzm(zzekVar, this.zzc.zza, 4)) {
                                        break;
                                    }
                                    this.zzc.zzl(14);
                                    int zzd3 = this.zzc.zzd(i6);
                                    if (zzd3 >= 7) {
                                        byte[] zzM2 = zzekVar.zzM();
                                        int zze2 = zzekVar.zze();
                                        int i11 = i9 + zzd3;
                                        if (i11 < zze2) {
                                            byte b2 = zzM2[i11];
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i12 = i11 + 1;
                                                    if (i12 == zze2) {
                                                        break;
                                                    }
                                                    if (zzM2[i12] == 68) {
                                                        int i13 = i11 + 2;
                                                        if (i13 == zze2) {
                                                            break;
                                                        } else if (zzM2[i13] == 51) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int i14 = i11 + 1;
                                                if (i14 == zze2) {
                                                    break;
                                                }
                                                byte b3 = zzM2[i14];
                                                if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == zzd2) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    int i15 = this.zzl;
                                    i2 = i15 | i8;
                                    if (i2 != 329) {
                                        i3 = 768;
                                    } else if (i2 == 511) {
                                        i3 = 512;
                                    } else if (i2 == 836) {
                                        i3 = 1024;
                                    } else {
                                        if (i2 == 1075) {
                                            this.zzj = 2;
                                            this.zzk = 3;
                                            this.zzt = 0;
                                            this.zzd.zzK(0);
                                            zzekVar.zzK(i);
                                            break;
                                        }
                                        if (i15 != 256) {
                                            this.zzl = 256;
                                            i6 = 13;
                                            i7 = 2;
                                        } else {
                                            zzd = i;
                                            i6 = 13;
                                            i7 = 2;
                                        }
                                    }
                                    this.zzl = i3;
                                    zzd = i;
                                    i6 = 13;
                                    i7 = 2;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    int i152 = this.zzl;
                    i2 = i152 | i8;
                    if (i2 != 329) {
                    }
                    this.zzl = i3;
                    zzd = i;
                    i6 = 13;
                    i7 = 2;
                }
                this.zzq = (b & 8) >> 3;
                this.zzm = 1 == ((b & 1) ^ 1);
                if (this.zzn) {
                    zzi();
                } else {
                    this.zzj = 1;
                    this.zzk = 0;
                }
                zzekVar.zzK(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(zzekVar.zzb(), this.zzt - this.zzk);
                        this.zzv.zzq(zzekVar, min);
                        int i16 = this.zzk + min;
                        this.zzk = i16;
                        if (i16 == this.zzt) {
                            zzdi.zzf(this.zzu != -9223372036854775807L);
                            this.zzv.zzs(this.zzu, 1, this.zzt, 0, null);
                            this.zzu += this.zzw;
                            zzh();
                        }
                    } else {
                        if (zzk(zzekVar, this.zzc.zza, true != this.zzm ? 5 : 7)) {
                            this.zzc.zzl(0);
                            if (this.zzr) {
                                this.zzc.zzn(10);
                            } else {
                                int zzd4 = this.zzc.zzd(2) + 1;
                                if (zzd4 != 2) {
                                    zzea.zzf("AdtsReader", "Detected audio object type: " + zzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzn(5);
                                int zzd5 = this.zzc.zzd(3);
                                int i17 = this.zzp;
                                int i18 = zzabg.zza;
                                byte[] bArr = {(byte) (((i17 >> 1) & 7) | 16), (byte) (((zzd5 << 3) & 120) | ((i17 << 7) & 128))};
                                zzabf zza2 = zzabg.zza(bArr);
                                zzad zzadVar = new zzad();
                                zzadVar.zzK(this.zzg);
                                zzadVar.zzX("audio/mp4a-latm");
                                zzadVar.zzz(zza2.zzc);
                                zzadVar.zzy(zza2.zzb);
                                zzadVar.zzY(zza2.zza);
                                zzadVar.zzL(Collections.singletonList(bArr));
                                zzadVar.zzO(this.zze);
                                zzadVar.zzV(this.zzf);
                                zzaf zzad = zzadVar.zzad();
                                this.zzs = 1024000000 / zzad.zzA;
                                this.zzh.zzl(zzad);
                                this.zzr = true;
                            }
                            this.zzc.zzn(4);
                            int zzd6 = this.zzc.zzd(13);
                            zzj(this.zzh, this.zzs, 0, this.zzm ? zzd6 - 9 : zzd6 - 7);
                        }
                    }
                } else if (zzk(zzekVar, this.zzd.zzM(), 10)) {
                    this.zzi.zzq(this.zzd, 10);
                    this.zzd.zzK(6);
                    zzj(this.zzi, 0L, 10, this.zzd.zzl() + 10);
                }
            } else if (zzekVar.zzb() != 0) {
                zzej zzejVar = this.zzc;
                zzejVar.zza[0] = zzekVar.zzM()[zzekVar.zzd()];
                zzejVar.zzl(2);
                int zzd7 = this.zzc.zzd(4);
                int i19 = this.zzp;
                if (i19 == -1 || zzd7 == i19) {
                    if (!this.zzn) {
                        this.zzn = true;
                        this.zzo = this.zzq;
                        this.zzp = zzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzg = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 1);
        this.zzh = zzw;
        this.zzv = zzw;
        if (!this.zzb) {
            this.zzi = new zzacj();
            return;
        }
        zzansVar.zzc();
        zzadp zzw2 = zzacnVar.zzw(zzansVar.zza(), 5);
        this.zzi = zzw2;
        zzad zzadVar = new zzad();
        zzadVar.zzK(zzansVar.zzb());
        zzadVar.zzX("application/id3");
        zzw2.zzl(zzadVar.zzad());
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzu = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }
}
