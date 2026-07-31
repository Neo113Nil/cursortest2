package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzcu {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final zzcs zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private double zzq;

    public zzcu(int i, int i2, float f, float f2, int i3, boolean z) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = i / i3;
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        this.zzh = i4 + i4;
        this.zzi = z ? new zzcr(this) : new zzct(this);
    }

    private final void zzo(int i, int i2) {
        zzcs zzcsVar = this.zzi;
        zzcsVar.zzk(i2);
        Object zzr = zzcsVar.zzr();
        Object zzq = zzcsVar.zzq();
        int i3 = this.zzk;
        int i4 = this.zzb;
        System.arraycopy(zzr, i * i4, zzq, i3 * i4, i2 * i4);
        this.zzk += i2;
    }

    public final int zza() {
        return this.zzj * this.zzb * this.zzi.zza();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        zzcs zzcsVar = this.zzi;
        int remaining = byteBuffer.remaining();
        int zza = remaining / (this.zzb * zzcsVar.zza());
        zzcsVar.zzj(zza);
        zzcsVar.zzn(byteBuffer, remaining);
        this.zzj += zza;
        zzp();
    }

    public final void zzc(ByteBuffer byteBuffer) {
        zzguk.zzi(this.zzk >= 0);
        int i = this.zzb;
        int remaining = byteBuffer.remaining();
        zzcs zzcsVar = this.zzi;
        int min = Math.min(remaining / (zzcsVar.zza() * i), this.zzk);
        zzcsVar.zzo(byteBuffer, min);
        this.zzk -= min;
        System.arraycopy(zzcsVar.zzq(), min * i, zzcsVar.zzq(), 0, this.zzk * i);
    }

    public final void zzd() {
        int i = this.zzj;
        int i2 = this.zzo;
        int i3 = this.zzk;
        float f = this.zzc;
        float f2 = this.zzd;
        int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + this.zzq) + this.zzl) / (this.zze * f2)) + 0.5d));
        this.zzq = 0.0d;
        int i5 = this.zzh;
        int i6 = i5 + i5;
        zzcs zzcsVar = this.zzi;
        zzcsVar.zzj(i + i6);
        zzcsVar.zzm(i * this.zzb, i6);
        this.zzj += i6;
        zzp();
        if (this.zzk > i4) {
            this.zzk = Math.max(i4, 0);
        }
        this.zzj = 0;
        this.zzo = 0;
        this.zzl = 0;
    }

    public final void zze() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0.0d;
        this.zzi.zzg();
    }

    public final int zzf() {
        zzguk.zzi(this.zzk >= 0);
        return this.zzk * this.zzb * this.zzi.zza();
    }

    final /* synthetic */ int zzg() {
        return this.zzb;
    }

    final /* synthetic */ int zzh() {
        return this.zzh;
    }

    final /* synthetic */ int zzi() {
        return this.zzj;
    }

    final /* synthetic */ int zzj() {
        return this.zzk;
    }

    final /* synthetic */ int zzk() {
        return this.zzl;
    }

    final /* synthetic */ int zzl() {
        return this.zzm;
    }

    final /* synthetic */ int zzm() {
        return this.zzn;
    }

    final /* synthetic */ int zzn() {
        return this.zzp;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzp() {
        int i;
        int i2;
        int i3;
        double d;
        int i4;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        long j;
        long j2;
        float f2 = this.zzc;
        float f3 = this.zzd;
        double d2 = f2 / f3;
        int i9 = this.zzk;
        int i10 = 0;
        int i11 = 1;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i12 = this.zzj;
            int i13 = this.zzh;
            if (i12 >= i13) {
                int i14 = 0;
                while (true) {
                    int i15 = this.zzo;
                    if (i15 > 0) {
                        int min = Math.min(i13, i15);
                        zzo(i14, min);
                        this.zzo -= min;
                        i14 += min;
                        d = d2;
                        i = i9;
                    } else {
                        int i16 = this.zza;
                        int i17 = i16 > 4000 ? i16 / 4000 : i11;
                        int i18 = this.zzb;
                        if (i18 == i11) {
                            if (i17 == i11) {
                                i2 = this.zzi.zzf(i14, this.zzf, this.zzg);
                                i = i9;
                                i3 = i11;
                                zzcs zzcsVar = this.zzi;
                                int i19 = !zzcsVar.zzc() ? this.zzp : i2;
                                int i20 = i14 + i19;
                                zzcsVar.zzi();
                                this.zzp = i2;
                                double d3 = i19;
                                if (d2 <= 1.0d) {
                                    double d4 = d2 - 1.0d;
                                    if (d2 >= 2.0d) {
                                        double d5 = (d3 / d4) + this.zzq;
                                        int round = (int) Math.round(d5);
                                        this.zzq = d5 - round;
                                        i5 = round;
                                    } else {
                                        double d6 = ((d3 * (2.0d - d2)) / d4) + this.zzq;
                                        int round2 = (int) Math.round(d6);
                                        this.zzo = round2;
                                        this.zzq = d6 - round2;
                                        i5 = i19;
                                    }
                                    zzcsVar.zzk(i5);
                                    zzcsVar.zzh(i5, i3, this.zzk, i14, i20);
                                    this.zzk += i5;
                                    i14 += i19 + i5;
                                    d = d2;
                                } else {
                                    int i21 = i19;
                                    double d7 = 1.0d - d2;
                                    if (d2 < 0.5d) {
                                        double d8 = ((d3 * d2) / d7) + this.zzq;
                                        int round3 = (int) Math.round(d8);
                                        this.zzq = d8 - round3;
                                        d = d2;
                                        i4 = round3;
                                    } else {
                                        d = d2;
                                        double d9 = ((d3 * ((d2 + d2) - 1.0d)) / d7) + this.zzq;
                                        int round4 = (int) Math.round(d9);
                                        this.zzo = round4;
                                        this.zzq = d9 - round4;
                                        i4 = i21;
                                    }
                                    int i22 = i21 + i4;
                                    zzcsVar.zzk(i22);
                                    System.arraycopy(zzcsVar.zzr(), i14 * i3, zzcsVar.zzq(), this.zzk * i3, i21 * i3);
                                    zzcsVar.zzh(i4, i3, this.zzk + i21, i20, i14);
                                    this.zzk += i22;
                                    i14 += i4;
                                }
                            } else {
                                i18 = i11;
                            }
                        }
                        zzcs zzcsVar2 = this.zzi;
                        zzcsVar2.zzd(i14, i17);
                        int i23 = this.zzf;
                        int i24 = this.zzg;
                        i = i9;
                        int zze = zzcsVar2.zze(i10, i23 / i17, i24 / i17);
                        if (i17 != i11) {
                            int i25 = zze * i17;
                            int i26 = i17 * 4;
                            int i27 = i25 - i26;
                            if (i27 >= i23) {
                                i23 = i27;
                            }
                            int i28 = i25 + i26;
                            if (i28 <= i24) {
                                i24 = i28;
                            }
                            if (i18 == i11) {
                                i2 = zzcsVar2.zzf(i14, i23, i24);
                            } else {
                                zzcsVar2.zzd(i14, i11);
                                i2 = zzcsVar2.zze(i10, i23, i24);
                            }
                        } else {
                            i2 = zze;
                        }
                        i3 = i18;
                        zzcs zzcsVar3 = this.zzi;
                        if (!zzcsVar3.zzc()) {
                        }
                        int i202 = i14 + i19;
                        zzcsVar3.zzi();
                        this.zzp = i2;
                        double d32 = i19;
                        if (d2 <= 1.0d) {
                        }
                    }
                    if (i14 + i13 > i12) {
                        break;
                    }
                    i9 = i;
                    d2 = d;
                    i10 = 0;
                    i11 = 1;
                }
                int i29 = this.zzj - i14;
                zzcs zzcsVar4 = this.zzi;
                int i30 = this.zzb;
                System.arraycopy(zzcsVar4.zzr(), i14 * i30, zzcsVar4.zzr(), 0, i30 * i29);
                this.zzj = i29;
                f = this.zze * f3;
                if (f != 1.0f || this.zzk == (i6 = i)) {
                }
                int i31 = this.zza;
                float f4 = i31 / f;
                long j3 = i31;
                long j4 = (long) f4;
                while (j4 != 0 && j3 != 0 && j4 % 2 == 0 && j3 % 2 == 0) {
                    j4 /= 2;
                    j3 /= 2;
                }
                int i32 = this.zzk - i6;
                zzcs zzcsVar5 = this.zzi;
                zzcsVar5.zzl(i32);
                int i33 = this.zzb;
                System.arraycopy(zzcsVar5.zzq(), i6 * i33, zzcsVar5.zzp(), this.zzl * i33, i32 * i33);
                this.zzk = i6;
                this.zzl += i32;
                int i34 = 0;
                while (true) {
                    i7 = this.zzl - 1;
                    if (i34 >= i7) {
                        break;
                    }
                    while (true) {
                        i8 = this.zzm + 1;
                        j = i8;
                        long j5 = j * j4;
                        j2 = this.zzn;
                        if (j5 <= j2 * j3) {
                            break;
                        }
                        zzcsVar5.zzk(1);
                        zzcsVar5.zzb(i34, j3, j4);
                        this.zzn++;
                        this.zzk++;
                    }
                    this.zzm = i8;
                    if (j == j3) {
                        this.zzm = 0;
                        zzguk.zzi(j2 == j4);
                        this.zzn = 0;
                    }
                    i34++;
                }
                if (i7 != 0) {
                    System.arraycopy(zzcsVar5.zzp(), i7 * i33, zzcsVar5.zzp(), 0, (this.zzl - i7) * i33);
                    this.zzl -= i7;
                    return;
                }
                return;
            }
        } else {
            zzo(0, this.zzj);
            this.zzj = 0;
        }
        i = i9;
        f = this.zze * f3;
        if (f != 1.0f) {
        }
    }
}
