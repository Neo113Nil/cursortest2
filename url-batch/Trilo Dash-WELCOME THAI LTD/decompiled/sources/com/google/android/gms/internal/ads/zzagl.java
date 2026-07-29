package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzagl implements zzaga {
    private final zzahb zza;
    private String zzb;
    private zzzz zzc;
    private zzagk zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzagp zzg = new zzagp(32, 128);
    private final zzagp zzh = new zzagp(33, 128);
    private final zzagp zzi = new zzagp(34, 128);
    private final zzagp zzj = new zzagp(39, 128);
    private final zzagp zzk = new zzagp(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzdy zzn = new zzdy();

    public zzagl(zzahb zzahbVar) {
        this.zza = zzahbVar;
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

    /* JADX WARN: Removed duplicated region for block: B:172:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0372  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
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
        zzcw.zzb(this.zzc);
        int i8 = zzeg.zza;
        while (zzdyVar.zza() > 0) {
            int zzc = zzdyVar.zzc();
            int zzd = zzdyVar.zzd();
            byte[] zzH = zzdyVar.zzH();
            this.zzl += zzdyVar.zza();
            zzzx.zzb(this.zzc, zzdyVar, zzdyVar.zza());
            while (zzc < zzd) {
                int zza = zzzp.zza(zzH, zzc, zzd, this.zzf);
                if (zza == zzd) {
                    zzf(zzH, zzc, zzd);
                    return;
                }
                int i9 = zza + 3;
                int i10 = (zzH[i9] & 126) >> 1;
                int i11 = zza - zzc;
                if (i11 > 0) {
                    zzf(zzH, zzc, zza);
                }
                int i12 = zzd - zza;
                long j5 = this.zzl - i12;
                int i13 = i11 < 0 ? -i11 : 0;
                long j6 = this.zzm;
                this.zzd.zza(j5, i12, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i13);
                    this.zzh.zzd(i13);
                    this.zzi.zzd(i13);
                    zzagp zzagpVar = this.zzg;
                    if (zzagpVar.zze()) {
                        zzagp zzagpVar2 = this.zzh;
                        if (zzagpVar2.zze()) {
                            zzagp zzagpVar3 = this.zzi;
                            if (zzagpVar3.zze()) {
                                zzzz zzzzVar = this.zzc;
                                i2 = i9;
                                String str = this.zzb;
                                int i14 = zzagpVar.zzb;
                                i = zzd;
                                bArr = zzH;
                                byte[] bArr2 = new byte[zzagpVar2.zzb + i14 + zzagpVar3.zzb];
                                i3 = i10;
                                System.arraycopy(zzagpVar.zza, 0, bArr2, 0, i14);
                                i4 = i12;
                                System.arraycopy(zzagpVar2.zza, 0, bArr2, zzagpVar.zzb, zzagpVar2.zzb);
                                System.arraycopy(zzagpVar3.zza, 0, bArr2, zzagpVar.zzb + zzagpVar2.zzb, zzagpVar3.zzb);
                                zzzr zzzrVar = new zzzr(zzagpVar2.zza, 0, zzagpVar2.zzb);
                                zzzrVar.zze(44);
                                int zza2 = zzzrVar.zza(3);
                                zzzrVar.zzd();
                                int zza3 = zzzrVar.zza(2);
                                boolean zzf = zzzrVar.zzf();
                                int zza4 = zzzrVar.zza(5);
                                int i15 = 0;
                                for (int i16 = 0; i16 < 32; i16++) {
                                    if (zzzrVar.zzf()) {
                                        i15 |= 1 << i16;
                                    }
                                }
                                int[] iArr = new int[6];
                                for (int i17 = 0; i17 < 6; i17++) {
                                    iArr[i17] = zzzrVar.zza(8);
                                }
                                int zza5 = zzzrVar.zza(8);
                                int i18 = 0;
                                for (int i19 = 0; i19 < zza2; i19++) {
                                    if (zzzrVar.zzf()) {
                                        i18 += 89;
                                    }
                                    if (zzzrVar.zzf()) {
                                        i18 += 8;
                                    }
                                }
                                zzzrVar.zze(i18);
                                if (zza2 > 0) {
                                    int i20 = 8 - zza2;
                                    zzzrVar.zze(i20 + i20);
                                }
                                zzzrVar.zzc();
                                int zzc2 = zzzrVar.zzc();
                                if (zzc2 == 3) {
                                    zzzrVar.zzd();
                                    zzc2 = 3;
                                }
                                int zzc3 = zzzrVar.zzc();
                                int zzc4 = zzzrVar.zzc();
                                if (zzzrVar.zzf()) {
                                    int zzc5 = zzzrVar.zzc();
                                    int zzc6 = zzzrVar.zzc();
                                    int zzc7 = zzzrVar.zzc();
                                    int zzc8 = zzzrVar.zzc();
                                    if (zzc2 == 1) {
                                        j = j5;
                                        i7 = 2;
                                    } else if (zzc2 == 2) {
                                        j = j5;
                                        i7 = 2;
                                        zzc2 = 2;
                                    } else {
                                        j = j5;
                                        i7 = 1;
                                    }
                                    zzc3 -= i7 * (zzc5 + zzc6);
                                    zzc4 -= (zzc2 == 1 ? 2 : 1) * (zzc7 + zzc8);
                                } else {
                                    j = j5;
                                }
                                zzzrVar.zzc();
                                zzzrVar.zzc();
                                int zzc9 = zzzrVar.zzc();
                                for (int i21 = true != zzzrVar.zzf() ? zza2 : 0; i21 <= zza2; i21++) {
                                    zzzrVar.zzc();
                                    zzzrVar.zzc();
                                    zzzrVar.zzc();
                                }
                                zzzrVar.zzc();
                                zzzrVar.zzc();
                                zzzrVar.zzc();
                                zzzrVar.zzc();
                                zzzrVar.zzc();
                                zzzrVar.zzc();
                                if (zzzrVar.zzf() && zzzrVar.zzf()) {
                                    int i22 = 0;
                                    for (int i23 = 4; i22 < i23; i23 = 4) {
                                        int i24 = 0;
                                        while (i24 < 6) {
                                            if (zzzrVar.zzf()) {
                                                j4 = j6;
                                                int min = Math.min(64, 1 << ((i22 + i22) + 4));
                                                if (i22 > 1) {
                                                    zzzrVar.zzb();
                                                }
                                                for (int i25 = 0; i25 < min; i25++) {
                                                    zzzrVar.zzb();
                                                }
                                            } else {
                                                zzzrVar.zzc();
                                                j4 = j6;
                                            }
                                            i24 += i22 == 3 ? 3 : 1;
                                            j6 = j4;
                                        }
                                        i22++;
                                    }
                                }
                                j2 = j6;
                                zzzrVar.zze(2);
                                if (zzzrVar.zzf()) {
                                    zzzrVar.zze(8);
                                    zzzrVar.zzc();
                                    zzzrVar.zzc();
                                    zzzrVar.zzd();
                                }
                                int zzc10 = zzzrVar.zzc();
                                int i26 = 0;
                                boolean z = false;
                                int i27 = 0;
                                while (i26 < zzc10) {
                                    if (i26 != 0) {
                                        z = zzzrVar.zzf();
                                    }
                                    if (z) {
                                        zzzrVar.zzd();
                                        zzzrVar.zzc();
                                        for (int i28 = 0; i28 <= i27; i28++) {
                                            if (zzzrVar.zzf()) {
                                                zzzrVar.zzd();
                                            }
                                        }
                                        i6 = zzc10;
                                    } else {
                                        int zzc11 = zzzrVar.zzc();
                                        int zzc12 = zzzrVar.zzc();
                                        int i29 = zzc11 + zzc12;
                                        i6 = zzc10;
                                        for (int i30 = 0; i30 < zzc11; i30++) {
                                            zzzrVar.zzc();
                                            zzzrVar.zzd();
                                        }
                                        for (int i31 = 0; i31 < zzc12; i31++) {
                                            zzzrVar.zzc();
                                            zzzrVar.zzd();
                                        }
                                        i27 = i29;
                                    }
                                    i26++;
                                    zzc10 = i6;
                                }
                                if (zzzrVar.zzf()) {
                                    for (int i32 = 0; i32 < zzzrVar.zzc(); i32++) {
                                        zzzrVar.zze(zzc9 + 5);
                                    }
                                }
                                zzzrVar.zze(2);
                                float f = 1.0f;
                                if (zzzrVar.zzf()) {
                                    if (zzzrVar.zzf()) {
                                        int zza6 = zzzrVar.zza(8);
                                        if (zza6 == 255) {
                                            int zza7 = zzzrVar.zza(16);
                                            int zza8 = zzzrVar.zza(16);
                                            if (zza7 != 0 && zza8 != 0) {
                                                f = zza7 / zza8;
                                            }
                                        } else if (zza6 < 17) {
                                            f = zzzp.zzb[zza6];
                                        } else {
                                            Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + zza6);
                                        }
                                    }
                                    if (zzzrVar.zzf()) {
                                        zzzrVar.zzd();
                                    }
                                    if (zzzrVar.zzf()) {
                                        zzzrVar.zze(4);
                                        if (zzzrVar.zzf()) {
                                            zzzrVar.zze(24);
                                        }
                                    }
                                    if (zzzrVar.zzf()) {
                                        zzzrVar.zzc();
                                        zzzrVar.zzc();
                                    }
                                    zzzrVar.zzd();
                                    if (zzzrVar.zzf()) {
                                        zzc4 += zzc4;
                                    }
                                }
                                String zzb = zzcy.zzb(zza3, zzf, zza4, i15, iArr, zza5);
                                zzab zzabVar = new zzab();
                                zzabVar.zzH(str);
                                zzabVar.zzS("video/hevc");
                                zzabVar.zzx(zzb);
                                zzabVar.zzX(zzc3);
                                zzabVar.zzF(zzc4);
                                zzabVar.zzP(f);
                                zzabVar.zzI(Collections.singletonList(bArr2));
                                zzzzVar.zzk(zzabVar.zzY());
                                this.zze = true;
                                if (this.zzj.zzd(i13)) {
                                    j3 = j2;
                                } else {
                                    zzagp zzagpVar4 = this.zzj;
                                    this.zzn.zzD(this.zzj.zza, zzzp.zzb(zzagpVar4.zza, zzagpVar4.zzb));
                                    this.zzn.zzG(5);
                                    j3 = j2;
                                    this.zza.zza(j3, this.zzn);
                                }
                                if (this.zzk.zzd(i13)) {
                                    zzagp zzagpVar5 = this.zzk;
                                    this.zzn.zzD(this.zzk.zza, zzzp.zzb(zzagpVar5.zza, zzagpVar5.zzb));
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
                i2 = i9;
                i3 = i10;
                j = j5;
                i4 = i12;
                j2 = j6;
                if (this.zzj.zzd(i13)) {
                }
                if (this.zzk.zzd(i13)) {
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

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzb = zzahmVar.zzb();
        zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzagk(zzv);
        this.zza.zzb(zzyvVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzzp.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzagk zzagkVar = this.zzd;
        if (zzagkVar != null) {
            zzagkVar.zzc();
        }
    }
}
