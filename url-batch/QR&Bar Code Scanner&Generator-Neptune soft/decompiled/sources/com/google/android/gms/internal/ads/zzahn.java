package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahn implements zzahc {
    private final zzaid zza;
    private String zzb;
    private zzaap zzc;
    private zzahm zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzahr zzg = new zzahr(32, 128);
    private final zzahr zzh = new zzahr(33, 128);
    private final zzahr zzi = new zzahr(34, 128);
    private final zzahr zzj = new zzahr(39, 128);
    private final zzahr zzk = new zzahr(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzef zzn = new zzef();

    public zzahn(zzaid zzaidVar) {
        this.zza = zzaidVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0373  */
    @Override // com.google.android.gms.internal.ads.zzahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzef zzefVar) {
        int i;
        byte[] bArr;
        int i2;
        int i3;
        long j;
        int i4;
        long j2;
        long j3;
        int i5;
        int i6;
        long j4;
        int i7;
        int i8;
        zzdd.zzb(this.zzc);
        int i9 = zzen.zza;
        while (zzefVar.zza() > 0) {
            int zzc = zzefVar.zzc();
            int zzd = zzefVar.zzd();
            byte[] zzH = zzefVar.zzH();
            this.zzl += zzefVar.zza();
            this.zzc.zzq(zzefVar, zzefVar.zza());
            while (zzc < zzd) {
                int zza = zzaaf.zza(zzH, zzc, zzd, this.zzf);
                if (zza == zzd) {
                    zzf(zzH, zzc, zzd);
                    return;
                }
                int i10 = zza + 3;
                int i11 = (zzH[i10] & 126) >> 1;
                int i12 = zza - zzc;
                if (i12 > 0) {
                    zzf(zzH, zzc, zza);
                }
                int i13 = zzd - zza;
                long j5 = this.zzl - i13;
                int i14 = i12 < 0 ? -i12 : 0;
                long j6 = this.zzm;
                this.zzd.zza(j5, i13, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i14);
                    this.zzh.zzd(i14);
                    this.zzi.zzd(i14);
                    zzahr zzahrVar = this.zzg;
                    if (zzahrVar.zze()) {
                        zzahr zzahrVar2 = this.zzh;
                        if (zzahrVar2.zze()) {
                            zzahr zzahrVar3 = this.zzi;
                            if (zzahrVar3.zze()) {
                                zzaap zzaapVar = this.zzc;
                                i2 = i10;
                                String str = this.zzb;
                                int i15 = zzahrVar.zzb;
                                i = zzd;
                                bArr = zzH;
                                byte[] bArr2 = new byte[zzahrVar2.zzb + i15 + zzahrVar3.zzb];
                                i3 = i11;
                                System.arraycopy(zzahrVar.zza, 0, bArr2, 0, i15);
                                i4 = i13;
                                System.arraycopy(zzahrVar2.zza, 0, bArr2, zzahrVar.zzb, zzahrVar2.zzb);
                                System.arraycopy(zzahrVar3.zza, 0, bArr2, zzahrVar.zzb + zzahrVar2.zzb, zzahrVar3.zzb);
                                zzaah zzaahVar = new zzaah(zzahrVar2.zza, 0, zzahrVar2.zzb);
                                zzaahVar.zze(44);
                                int zza2 = zzaahVar.zza(3);
                                zzaahVar.zzd();
                                int zza3 = zzaahVar.zza(2);
                                boolean zzf = zzaahVar.zzf();
                                int zza4 = zzaahVar.zza(5);
                                int i16 = 0;
                                for (int i17 = 0; i17 < 32; i17++) {
                                    if (zzaahVar.zzf()) {
                                        i16 |= 1 << i17;
                                    }
                                }
                                int[] iArr = new int[6];
                                for (int i18 = 0; i18 < 6; i18++) {
                                    iArr[i18] = zzaahVar.zza(8);
                                }
                                int zza5 = zzaahVar.zza(8);
                                int i19 = 0;
                                for (int i20 = 0; i20 < zza2; i20++) {
                                    if (zzaahVar.zzf()) {
                                        i19 += 89;
                                    }
                                    if (zzaahVar.zzf()) {
                                        i19 += 8;
                                    }
                                }
                                zzaahVar.zze(i19);
                                if (zza2 > 0) {
                                    int i21 = 8 - zza2;
                                    zzaahVar.zze(i21 + i21);
                                }
                                zzaahVar.zzc();
                                int zzc2 = zzaahVar.zzc();
                                if (zzc2 == 3) {
                                    zzaahVar.zzd();
                                    zzc2 = 3;
                                }
                                int zzc3 = zzaahVar.zzc();
                                int zzc4 = zzaahVar.zzc();
                                if (zzaahVar.zzf()) {
                                    int zzc5 = zzaahVar.zzc();
                                    int zzc6 = zzaahVar.zzc();
                                    int zzc7 = zzaahVar.zzc();
                                    int zzc8 = zzaahVar.zzc();
                                    if (zzc2 != 1) {
                                        if (zzc2 == 2) {
                                            j = j5;
                                            i8 = 2;
                                            zzc2 = 2;
                                        } else {
                                            j = j5;
                                            i8 = 1;
                                        }
                                        i7 = 1;
                                    } else {
                                        j = j5;
                                        i7 = 1;
                                        i8 = 2;
                                    }
                                    zzc3 -= i8 * (zzc5 + zzc6);
                                    zzc4 -= (zzc2 == i7 ? 2 : 1) * (zzc7 + zzc8);
                                } else {
                                    j = j5;
                                }
                                zzaahVar.zzc();
                                zzaahVar.zzc();
                                int zzc9 = zzaahVar.zzc();
                                for (int i22 = true != zzaahVar.zzf() ? zza2 : 0; i22 <= zza2; i22++) {
                                    zzaahVar.zzc();
                                    zzaahVar.zzc();
                                    zzaahVar.zzc();
                                }
                                zzaahVar.zzc();
                                zzaahVar.zzc();
                                zzaahVar.zzc();
                                zzaahVar.zzc();
                                zzaahVar.zzc();
                                zzaahVar.zzc();
                                if (zzaahVar.zzf() && zzaahVar.zzf()) {
                                    int i23 = 0;
                                    for (int i24 = 4; i23 < i24; i24 = 4) {
                                        int i25 = 0;
                                        while (i25 < 6) {
                                            if (zzaahVar.zzf()) {
                                                j4 = j6;
                                                int min = Math.min(64, 1 << ((i23 + i23) + 4));
                                                if (i23 > 1) {
                                                    zzaahVar.zzb();
                                                }
                                                for (int i26 = 0; i26 < min; i26++) {
                                                    zzaahVar.zzb();
                                                }
                                            } else {
                                                zzaahVar.zzc();
                                                j4 = j6;
                                            }
                                            i25 += i23 == 3 ? 3 : 1;
                                            j6 = j4;
                                        }
                                        i23++;
                                    }
                                }
                                j2 = j6;
                                zzaahVar.zze(2);
                                if (zzaahVar.zzf()) {
                                    zzaahVar.zze(8);
                                    zzaahVar.zzc();
                                    zzaahVar.zzc();
                                    zzaahVar.zzd();
                                }
                                int zzc10 = zzaahVar.zzc();
                                int i27 = 0;
                                boolean z = false;
                                int i28 = 0;
                                while (i27 < zzc10) {
                                    if (i27 != 0) {
                                        z = zzaahVar.zzf();
                                    }
                                    if (z) {
                                        zzaahVar.zzd();
                                        zzaahVar.zzc();
                                        for (int i29 = 0; i29 <= i28; i29++) {
                                            if (zzaahVar.zzf()) {
                                                zzaahVar.zzd();
                                            }
                                        }
                                        i6 = zzc10;
                                    } else {
                                        int zzc11 = zzaahVar.zzc();
                                        int zzc12 = zzaahVar.zzc();
                                        int i30 = zzc11 + zzc12;
                                        i6 = zzc10;
                                        for (int i31 = 0; i31 < zzc11; i31++) {
                                            zzaahVar.zzc();
                                            zzaahVar.zzd();
                                        }
                                        for (int i32 = 0; i32 < zzc12; i32++) {
                                            zzaahVar.zzc();
                                            zzaahVar.zzd();
                                        }
                                        i28 = i30;
                                    }
                                    i27++;
                                    zzc10 = i6;
                                }
                                if (zzaahVar.zzf()) {
                                    for (int i33 = 0; i33 < zzaahVar.zzc(); i33++) {
                                        zzaahVar.zze(zzc9 + 5);
                                    }
                                }
                                zzaahVar.zze(2);
                                float f = 1.0f;
                                if (zzaahVar.zzf()) {
                                    if (zzaahVar.zzf()) {
                                        int zza6 = zzaahVar.zza(8);
                                        if (zza6 == 255) {
                                            int zza7 = zzaahVar.zza(16);
                                            int zza8 = zzaahVar.zza(16);
                                            if (zza7 != 0 && zza8 != 0) {
                                                f = zza7 / zza8;
                                            }
                                        } else if (zza6 < 17) {
                                            f = zzaaf.zzb[zza6];
                                        } else {
                                            zzdw.zze("H265Reader", "Unexpected aspect_ratio_idc value: " + zza6);
                                        }
                                    }
                                    if (zzaahVar.zzf()) {
                                        zzaahVar.zzd();
                                    }
                                    if (zzaahVar.zzf()) {
                                        zzaahVar.zze(4);
                                        if (zzaahVar.zzf()) {
                                            zzaahVar.zze(24);
                                        }
                                    }
                                    if (zzaahVar.zzf()) {
                                        zzaahVar.zzc();
                                        zzaahVar.zzc();
                                    }
                                    zzaahVar.zzd();
                                    if (zzaahVar.zzf()) {
                                        zzc4 += zzc4;
                                    }
                                }
                                String zzb = zzdf.zzb(zza3, zzf, zza4, i16, iArr, zza5);
                                zzad zzadVar = new zzad();
                                zzadVar.zzH(str);
                                zzadVar.zzS("video/hevc");
                                zzadVar.zzx(zzb);
                                zzadVar.zzX(zzc3);
                                zzadVar.zzF(zzc4);
                                zzadVar.zzP(f);
                                zzadVar.zzI(Collections.singletonList(bArr2));
                                zzaapVar.zzk(zzadVar.zzY());
                                this.zze = true;
                                if (this.zzj.zzd(i14)) {
                                    j3 = j2;
                                } else {
                                    zzahr zzahrVar4 = this.zzj;
                                    this.zzn.zzD(this.zzj.zza, zzaaf.zzb(zzahrVar4.zza, zzahrVar4.zzb));
                                    this.zzn.zzG(5);
                                    j3 = j2;
                                    this.zza.zza(j3, this.zzn);
                                }
                                if (this.zzk.zzd(i14)) {
                                    zzahr zzahrVar5 = this.zzk;
                                    this.zzn.zzD(this.zzk.zza, zzaaf.zzb(zzahrVar5.zza, zzahrVar5.zzb));
                                    this.zzn.zzG(5);
                                    this.zza.zza(j3, this.zzn);
                                }
                                this.zzd.zzd(j, i4, i3, this.zzm, this.zze);
                                if (this.zze) {
                                    i5 = i3;
                                    this.zzg.zzc(i5);
                                    this.zzh.zzc(i5);
                                    this.zzi.zzc(i5);
                                } else {
                                    i5 = i3;
                                }
                                this.zzj.zzc(i5);
                                this.zzk.zzc(i5);
                                zzc = i2;
                                zzd = i;
                                zzH = bArr;
                            }
                        }
                    }
                }
                i = zzd;
                bArr = zzH;
                i2 = i10;
                i3 = i11;
                j = j5;
                i4 = i13;
                j2 = j6;
                if (this.zzj.zzd(i14)) {
                }
                if (this.zzk.zzd(i14)) {
                }
                this.zzd.zzd(j, i4, i3, this.zzm, this.zze);
                if (this.zze) {
                }
                this.zzj.zzc(i5);
                this.zzk.zzc(i5);
                zzc = i2;
                zzd = i;
                zzH = bArr;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zzb = zzaioVar.zzb();
        this.zzc = zzzlVar.zzv(zzaioVar.zza(), 2);
        this.zzd = new zzahm(this.zzc);
        this.zza.zzb(zzzlVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzaaf.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzahm zzahmVar = this.zzd;
        if (zzahmVar != null) {
            zzahmVar.zzc();
        }
    }
}
