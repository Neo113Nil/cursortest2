package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamh implements zzamf {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzadp zzc;
    private final zzanv zzd;
    private final zzek zze;
    private final zzamx zzf;
    private final boolean[] zzg;
    private final zzamg zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzamh() {
        throw null;
    }

    zzamh(zzanv zzanvVar) {
        zzek zzekVar;
        this.zzd = zzanvVar;
        this.zzg = new boolean[4];
        this.zzh = new zzamg(128);
        if (zzanvVar != null) {
            this.zzf = new zzamx(Opcodes.GETSTATIC, 128);
            zzekVar = new zzek();
        } else {
            zzekVar = null;
            this.zzf = null;
        }
        this.zze = zzekVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0  */
    @Override // com.google.android.gms.internal.ads.zzamf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzek zzekVar) {
        int i;
        zzamx zzamxVar;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        long j3;
        byte b;
        int i7;
        zzdi.zzb(this.zzc);
        int zzd = zzekVar.zzd();
        int zze = zzekVar.zze();
        byte[] zzM = zzekVar.zzM();
        this.zzi += zzekVar.zzb();
        this.zzc.zzq(zzekVar, zzekVar.zzb());
        while (true) {
            int zza2 = zzfh.zza(zzM, zzd, zze, this.zzg);
            if (zza2 == zze) {
                break;
            }
            int i8 = zza2 + 3;
            int i9 = zzekVar.zzM()[i8] & 255;
            int i10 = zza2 - zzd;
            if (!this.zzk) {
                if (i10 > 0) {
                    this.zzh.zza(zzM, zzd, zza2);
                }
                if (this.zzh.zzc(i9, i10 < 0 ? -i10 : 0)) {
                    zzamg zzamgVar = this.zzh;
                    String str = this.zzb;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzamgVar.zzc, zzamgVar.zza);
                    int i11 = copyOf[4] & 255;
                    byte b2 = copyOf[5];
                    int i12 = copyOf[6] & 255;
                    i = i8;
                    int i13 = ((b2 & 255) >> 4) | (i11 << 4);
                    int i14 = (copyOf[7] & 240) >> 4;
                    int i15 = ((b2 & Ascii.SI) << 8) | i12;
                    if (i14 == 2) {
                        i4 = i15 * 4;
                        i5 = i13 * 3;
                    } else if (i14 == 3) {
                        i4 = i15 * 16;
                        i5 = i13 * 9;
                    } else if (i14 != 4) {
                        f = 1.0f;
                        zzad zzadVar = new zzad();
                        zzadVar.zzK(str);
                        zzadVar.zzX("video/mpeg2");
                        zzadVar.zzac(i13);
                        zzadVar.zzI(i15);
                        zzadVar.zzT(f);
                        zzadVar.zzL(Collections.singletonList(copyOf));
                        zzaf zzad = zzadVar.zzad();
                        i6 = (copyOf[7] & Ascii.SI) - 1;
                        j3 = 0;
                        if (i6 >= 0 && i6 < 8) {
                            double d = zza[i6];
                            b = copyOf[zzamgVar.zzb + 9];
                            i7 = (b & 96) >> 5;
                            if (i7 != (b & Ascii.US)) {
                                d *= (i7 + 1.0d) / (r7 + 1);
                            }
                            j3 = (long) (1000000.0d / d);
                        }
                        Pair create = Pair.create(zzad, Long.valueOf(j3));
                        this.zzc.zzl((zzaf) create.first);
                        this.zzl = ((Long) create.second).longValue();
                        this.zzk = true;
                        zzamxVar = this.zzf;
                        if (zzamxVar != null) {
                            if (i10 > 0) {
                                zzamxVar.zza(zzM, zzd, zza2);
                                i3 = 0;
                            } else {
                                i3 = -i10;
                            }
                            if (this.zzf.zzd(i3)) {
                                zzamx zzamxVar2 = this.zzf;
                                int zzb = zzfh.zzb(zzamxVar2.zza, zzamxVar2.zzb);
                                zzek zzekVar2 = this.zze;
                                int i16 = zzet.zza;
                                zzekVar2.zzI(this.zzf.zza, zzb);
                                this.zzd.zza(this.zzo, this.zze);
                            }
                            if (i9 == 178) {
                                if (zzekVar.zzM()[zza2 + 2] == 1) {
                                    this.zzf.zzc(Opcodes.GETSTATIC);
                                }
                                i9 = Opcodes.GETSTATIC;
                            }
                        }
                        if (i9 != 0 || i9 == 179) {
                            i2 = zze - zza2;
                            if (this.zzq && this.zzk) {
                                j2 = this.zzo;
                                if (j2 != -9223372036854775807L) {
                                    this.zzc.zzs(j2, this.zzp ? 1 : 0, ((int) (this.zzi - this.zzn)) - i2, i2, null);
                                }
                            }
                            if (this.zzj || this.zzq) {
                                this.zzn = this.zzi - i2;
                                j = this.zzm;
                                if (j == -9223372036854775807L) {
                                    long j4 = this.zzo;
                                    j = j4 != -9223372036854775807L ? j4 + this.zzl : -9223372036854775807L;
                                }
                                this.zzo = j;
                                this.zzp = false;
                                this.zzm = -9223372036854775807L;
                                this.zzj = true;
                            }
                            this.zzq = i9 == 0;
                        } else if (i9 == 184) {
                            this.zzp = true;
                        }
                        zzd = i;
                    } else {
                        i4 = i15 * 121;
                        i5 = i13 * 100;
                    }
                    f = i4 / i5;
                    zzad zzadVar2 = new zzad();
                    zzadVar2.zzK(str);
                    zzadVar2.zzX("video/mpeg2");
                    zzadVar2.zzac(i13);
                    zzadVar2.zzI(i15);
                    zzadVar2.zzT(f);
                    zzadVar2.zzL(Collections.singletonList(copyOf));
                    zzaf zzad2 = zzadVar2.zzad();
                    i6 = (copyOf[7] & Ascii.SI) - 1;
                    j3 = 0;
                    if (i6 >= 0) {
                        double d2 = zza[i6];
                        b = copyOf[zzamgVar.zzb + 9];
                        i7 = (b & 96) >> 5;
                        if (i7 != (b & Ascii.US)) {
                        }
                        j3 = (long) (1000000.0d / d2);
                    }
                    Pair create2 = Pair.create(zzad2, Long.valueOf(j3));
                    this.zzc.zzl((zzaf) create2.first);
                    this.zzl = ((Long) create2.second).longValue();
                    this.zzk = true;
                    zzamxVar = this.zzf;
                    if (zzamxVar != null) {
                    }
                    if (i9 != 0) {
                    }
                    i2 = zze - zza2;
                    if (this.zzq) {
                        j2 = this.zzo;
                        if (j2 != -9223372036854775807L) {
                        }
                    }
                    if (this.zzj) {
                    }
                    this.zzn = this.zzi - i2;
                    j = this.zzm;
                    if (j == -9223372036854775807L) {
                    }
                    this.zzo = j;
                    this.zzp = false;
                    this.zzm = -9223372036854775807L;
                    this.zzj = true;
                    this.zzq = i9 == 0;
                    zzd = i;
                }
            }
            i = i8;
            zzamxVar = this.zzf;
            if (zzamxVar != null) {
            }
            if (i9 != 0) {
            }
            i2 = zze - zza2;
            if (this.zzq) {
            }
            if (this.zzj) {
            }
            this.zzn = this.zzi - i2;
            j = this.zzm;
            if (j == -9223372036854775807L) {
            }
            this.zzo = j;
            this.zzp = false;
            this.zzm = -9223372036854775807L;
            this.zzj = true;
            this.zzq = i9 == 0;
            zzd = i;
        }
        if (!this.zzk) {
            this.zzh.zza(zzM, zzd, zze);
        }
        zzamx zzamxVar3 = this.zzf;
        if (zzamxVar3 != null) {
            zzamxVar3.zza(zzM, zzd, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzb = zzansVar.zzb();
        this.zzc = zzacnVar.zzw(zzansVar.zza(), 2);
        zzanv zzanvVar = this.zzd;
        if (zzanvVar != null) {
            zzanvVar.zzb(zzacnVar, zzansVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
        zzdi.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzp;
            long j = this.zzi - this.zzn;
            this.zzc.zzs(this.zzo, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        zzfh.zzf(this.zzg);
        this.zzh.zzb();
        zzamx zzamxVar = this.zzf;
        if (zzamxVar != null) {
            zzamxVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
