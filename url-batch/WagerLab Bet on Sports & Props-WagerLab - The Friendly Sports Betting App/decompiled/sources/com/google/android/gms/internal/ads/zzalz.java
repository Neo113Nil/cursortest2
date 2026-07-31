package com.google.android.gms.internal.ads;

import androidx.compose.material.MenuKt;
import androidx.core.view.MotionEventCompat;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzalz implements zzamd {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzaeb zzi;
    private zzaeb zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzaeb zzw;
    private long zzx;
    private final zzee zzc = new zzee(new byte[7], 7);
    private final zzef zzd = new zzef(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = C.TIME_UNSET;
    private long zzv = C.TIME_UNSET;

    public zzalz(boolean z, String str, int i, String str2) {
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzef zzefVar, byte[] bArr, int i) {
        int min = Math.min(zzefVar.zzd(), i - this.zzl);
        zzefVar.zzm(bArr, this.zzl, min);
        int i2 = this.zzl + min;
        this.zzl = i2;
        return i2 == i;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzaeb zzaebVar, long j, int i, int i2) {
        this.zzk = 4;
        this.zzl = i;
        this.zzw = zzaebVar;
        this.zzx = j;
        this.zzu = i2;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzef zzefVar, byte[] bArr, int i) {
        if (zzefVar.zzd() < i) {
            return false;
        }
        zzefVar.zzm(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzv = C.TIME_UNSET;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzh = zzanrVar.zzc();
        zzaeb zzu = zzacxVar.zzu(zzanrVar.zzb(), 1);
        this.zzi = zzu;
        this.zzw = zzu;
        if (!this.zzb) {
            this.zzj = new zzacr();
            return;
        }
        zzanrVar.zza();
        zzaeb zzu2 = zzacxVar.zzu(zzanrVar.zzb(), 5);
        this.zzj = zzu2;
        zzs zzsVar = new zzs();
        zzsVar.zza(zzanrVar.zzc());
        zzsVar.zzl(this.zzg);
        zzsVar.zzm(MimeTypes.APPLICATION_ID3);
        zzu2.zzu(zzsVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzv = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) throws zzas {
        int i;
        byte b;
        char c;
        int i2;
        int i3;
        boolean z;
        int i4;
        this.zzi.getClass();
        String str = zzeo.zza;
        while (zzefVar.zzd() > 0) {
            int i5 = this.zzk;
            char c2 = 7;
            int i6 = 3;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzi = zzefVar.zzi();
                int zzg = zzefVar.zzg();
                int zze = zzefVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzefVar.zzh(zzg);
                        break;
                    }
                    i = zzg + 1;
                    b = zzi[zzg];
                    int i8 = b & 255;
                    int i9 = i6;
                    if (this.zzm != 512 || !zzl((byte) -1, (byte) i8)) {
                        c = c2;
                    } else {
                        if (this.zzo) {
                            break;
                        }
                        int i10 = zzg - 1;
                        zzefVar.zzh(zzg);
                        zzee zzeeVar = this.zzc;
                        if (zzm(zzefVar, zzeeVar.zza, 1)) {
                            zzeeVar.zzf(4);
                            int zzj = zzeeVar.zzj(1);
                            int i11 = this.zzp;
                            if (i11 == -1 || zzj == i11) {
                                if (this.zzq != -1) {
                                    if (!zzm(zzefVar, zzeeVar.zza, 1)) {
                                        break;
                                    }
                                    zzeeVar.zzf(i7);
                                    if (zzeeVar.zzj(4) == this.zzq) {
                                        zzefVar.zzh(zzg + 1);
                                    }
                                }
                                if (!zzm(zzefVar, zzeeVar.zza, 4)) {
                                    break;
                                }
                                zzeeVar.zzf(14);
                                int zzj2 = zzeeVar.zzj(13);
                                c = 7;
                                if (zzj2 >= 7) {
                                    byte[] zzi2 = zzefVar.zzi();
                                    int zze2 = zzefVar.zze();
                                    int i12 = i10 + zzj2;
                                    if (i12 < zze2) {
                                        byte b2 = zzi2[i12];
                                        if (b2 != -1) {
                                            if (b2 == 73) {
                                                int i13 = i12 + 1;
                                                if (i13 == zze2) {
                                                    break;
                                                }
                                                if (zzi2[i13] == 68) {
                                                    int i14 = i12 + 2;
                                                    if (i14 == zze2) {
                                                        break;
                                                    } else if (zzi2[i14] == 51) {
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i15 = i12 + 1;
                                            if (i15 == zze2) {
                                                break;
                                            }
                                            byte b3 = zzi2[i15];
                                            if (zzl((byte) -1, b3) && ((b3 & 8) >> 3) == zzj) {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                        c = 7;
                    }
                    int i16 = this.zzm;
                    int i17 = i16 | i8;
                    if (i17 == 329) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 768;
                    } else if (i17 == 511) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 512;
                    } else if (i17 == 836) {
                        i2 = i9;
                        i3 = 2;
                        z = false;
                        i4 = 1024;
                    } else {
                        if (i17 == 1075) {
                            this.zzk = 2;
                            this.zzl = i9;
                            this.zzu = 0;
                            this.zzd.zzh(0);
                            zzefVar.zzh(i);
                            break;
                        }
                        if (i16 != 256) {
                            this.zzm = 256;
                            c2 = c;
                            i6 = i9;
                            i7 = 2;
                        } else {
                            i2 = i9;
                            i3 = 2;
                            z = false;
                            zzg = i;
                            i6 = i2;
                            c2 = c;
                            i7 = i3;
                        }
                    }
                    this.zzm = i4;
                    zzg = i;
                    i6 = i2;
                    c2 = c;
                    i7 = i3;
                }
                this.zzr = (b & 8) >> 3;
                this.zzn = 1 == ((b & 1) ^ 1);
                if (this.zzo) {
                    zzk();
                } else {
                    this.zzk = 1;
                    this.zzl = 0;
                }
                zzefVar.zzh(i);
            } else if (i5 != 1) {
                if (i5 == 2) {
                    zzef zzefVar2 = this.zzd;
                    if (zzh(zzefVar, zzefVar2.zzi(), 10)) {
                        this.zzj.zzz(zzefVar2, 10);
                        zzefVar2.zzh(6);
                        zzj(this.zzj, 0L, 10, zzefVar2.zzG() + 10);
                    }
                } else if (i5 != 3) {
                    int min = Math.min(zzefVar.zzd(), this.zzu - this.zzl);
                    this.zzw.zzz(zzefVar, min);
                    int i18 = this.zzl + min;
                    this.zzl = i18;
                    if (i18 == this.zzu) {
                        zzghc.zzh(this.zzv != C.TIME_UNSET);
                        this.zzw.zzx(this.zzv, 1, this.zzu, 0, null);
                        this.zzv += this.zzx;
                        zzi();
                    }
                } else {
                    int i19 = true != this.zzn ? 5 : 7;
                    zzee zzeeVar2 = this.zzc;
                    if (zzh(zzefVar, zzeeVar2.zza, i19)) {
                        zzeeVar2.zzf(0);
                        if (this.zzs) {
                            zzeeVar2.zzh(10);
                        } else {
                            int zzj3 = zzeeVar2.zzj(2) + 1;
                            if (zzj3 != 2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 50);
                                sb.append("Detected audio object type: ");
                                sb.append(zzj3);
                                sb.append(", but assuming AAC LC.");
                                zzds.zzc("AdtsReader", sb.toString());
                            }
                            zzeeVar2.zzh(5);
                            int zzj4 = zzeeVar2.zzj(3);
                            int i20 = this.zzq;
                            int i21 = zzabt.zza;
                            byte[] bArr = {(byte) (((i20 >> 1) & 7) | 16), (byte) (((zzj4 << 3) & MenuKt.InTransitionDuration) | ((i20 << 7) & 128))};
                            zzabs zza2 = zzabt.zza(bArr);
                            zzs zzsVar = new zzs();
                            zzsVar.zza(this.zzh);
                            zzsVar.zzl(this.zzg);
                            zzsVar.zzm(MimeTypes.AUDIO_AAC);
                            zzsVar.zzj(zza2.zzc);
                            zzsVar.zzE(zza2.zzb);
                            zzsVar.zzF(zza2.zza);
                            zzsVar.zzp(Collections.singletonList(bArr));
                            zzsVar.zze(this.zze);
                            zzsVar.zzg(this.zzf);
                            zzu zzM = zzsVar.zzM();
                            this.zzt = 1024000000 / zzM.zzH;
                            this.zzi.zzu(zzM);
                            this.zzs = true;
                        }
                        zzeeVar2.zzh(4);
                        int zzj5 = zzeeVar2.zzj(13);
                        int i22 = zzj5 - 7;
                        if (this.zzn) {
                            i22 = zzj5 - 9;
                        }
                        zzj(this.zzi, this.zzt, 0, i22);
                    }
                }
            } else if (zzefVar.zzd() != 0) {
                zzee zzeeVar3 = this.zzc;
                zzeeVar3.zza[0] = zzefVar.zzi()[zzefVar.zzg()];
                zzeeVar3.zzf(2);
                int zzj6 = zzeeVar3.zzj(4);
                int i23 = this.zzq;
                if (i23 == -1 || zzj6 == i23) {
                    if (!this.zzo) {
                        this.zzo = true;
                        this.zzp = this.zzr;
                        this.zzq = zzj6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
