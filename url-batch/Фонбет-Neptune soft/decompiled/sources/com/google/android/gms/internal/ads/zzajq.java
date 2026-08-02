package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzajq extends zzajo {
    private zzajp zza;
    private int zzb;
    private boolean zzc;
    private zzadu zzd;
    private zzads zze;

    zzajq() {
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    protected final long zza(zzek zzekVar) {
        if ((zzekVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzekVar.zzM()[0];
        zzajp zzajpVar = this.zza;
        zzdi.zzb(zzajpVar);
        int i = !zzajpVar.zzd[(b >> 1) & (255 >>> (8 - zzajpVar.zze))].zza ? zzajpVar.zza.zze : zzajpVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzekVar.zzc() < zzekVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzekVar.zzM(), zzekVar.zze() + 4);
            zzekVar.zzI(copyOf, copyOf.length);
        } else {
            zzekVar.zzJ(zzekVar.zze() + 4);
        }
        long j = i2;
        byte[] zzM = zzekVar.zzM();
        zzM[zzekVar.zze() - 4] = (byte) (j & 255);
        zzM[zzekVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzM[zzekVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzM[zzekVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzadu zzaduVar = this.zzd;
        this.zzb = zzaduVar != null ? zzaduVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzek zzekVar, long j, zzajl zzajlVar) throws IOException {
        zzajp zzajpVar;
        int i;
        int i2;
        int i3;
        int i4;
        zzadu zzaduVar;
        long j2;
        if (this.zza != null) {
            zzajlVar.zza.getClass();
            return false;
        }
        zzadu zzaduVar2 = this.zzd;
        int i5 = 4;
        if (zzaduVar2 == null) {
            zzadv.zzd(1, zzekVar, false);
            int zzj = zzekVar.zzj();
            int zzm = zzekVar.zzm();
            int zzj2 = zzekVar.zzj();
            int zzi = zzekVar.zzi();
            int i6 = zzi <= 0 ? -1 : zzi;
            int zzi2 = zzekVar.zzi();
            int i7 = zzi2 <= 0 ? -1 : zzi2;
            int zzi3 = zzekVar.zzi();
            int i8 = zzi3 <= 0 ? -1 : zzi3;
            int zzm2 = zzekVar.zzm();
            this.zzd = new zzadu(zzj, zzm, zzj2, i6, i7, i8, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzekVar.zzm() & 1), Arrays.copyOf(zzekVar.zzM(), zzekVar.zze()));
        } else {
            zzads zzadsVar = this.zze;
            if (zzadsVar == null) {
                this.zze = zzadv.zzc(zzekVar, true, true);
            } else {
                byte[] bArr = new byte[zzekVar.zze()];
                System.arraycopy(zzekVar.zzM(), 0, bArr, 0, zzekVar.zze());
                int i9 = zzaduVar2.zza;
                int i10 = 5;
                zzadv.zzd(5, zzekVar, false);
                int zzm3 = zzekVar.zzm() + 1;
                zzadr zzadrVar = new zzadr(zzekVar.zzM());
                zzadrVar.zzc(zzekVar.zzd() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= zzm3) {
                        zzadu zzaduVar3 = zzaduVar2;
                        int i14 = 6;
                        int zzb = zzadrVar.zzb(6) + 1;
                        for (int i15 = 0; i15 < zzb; i15++) {
                            if (zzadrVar.zzb(16) != 0) {
                                throw zzbo.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i16 = 1;
                        int zzb2 = zzadrVar.zzb(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < zzb2) {
                                int zzb3 = zzadrVar.zzb(i13);
                                if (zzb3 == 0) {
                                    i3 = zzb2;
                                    int i19 = 8;
                                    zzadrVar.zzc(8);
                                    zzadrVar.zzc(16);
                                    zzadrVar.zzc(16);
                                    zzadrVar.zzc(6);
                                    zzadrVar.zzc(8);
                                    int zzb4 = zzadrVar.zzb(4) + 1;
                                    int i20 = 0;
                                    while (i20 < zzb4) {
                                        zzadrVar.zzc(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (zzb3 != i16) {
                                        throw zzbo.zza("floor type greater than 1 not decodable: " + zzb3, null);
                                    }
                                    int zzb5 = zzadrVar.zzb(i10);
                                    int[] iArr = new int[zzb5];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < zzb5; i22++) {
                                        int zzb6 = zzadrVar.zzb(4);
                                        iArr[i22] = zzb6;
                                        if (zzb6 > i21) {
                                            i21 = zzb6;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = zzadrVar.zzb(i18) + 1;
                                        int zzb7 = zzadrVar.zzb(i12);
                                        if (zzb7 > 0) {
                                            i4 = 8;
                                            zzadrVar.zzc(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i25 = zzb2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << zzb7); i27 = 1) {
                                            zzadrVar.zzc(i4);
                                            i26++;
                                            i4 = 8;
                                        }
                                        i24++;
                                        zzb2 = i25;
                                        i12 = 2;
                                        i18 = 3;
                                    }
                                    i3 = zzb2;
                                    zzadrVar.zzc(i12);
                                    int zzb8 = zzadrVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzadrVar.zzc(zzb8);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                zzb2 = i3;
                                i14 = 6;
                                i12 = 2;
                                i13 = 16;
                                i16 = 1;
                                i10 = 5;
                            } else {
                                int i31 = 1;
                                int zzb9 = zzadrVar.zzb(i14) + 1;
                                int i32 = 0;
                                while (i32 < zzb9) {
                                    if (zzadrVar.zzb(16) > 2) {
                                        throw zzbo.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzadrVar.zzc(24);
                                    zzadrVar.zzc(24);
                                    zzadrVar.zzc(24);
                                    int zzb10 = zzadrVar.zzb(i14) + i31;
                                    int i33 = 8;
                                    zzadrVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i34 = 0; i34 < zzb10; i34++) {
                                        iArr3[i34] = ((zzadrVar.zzd() ? zzadrVar.zzb(5) : 0) * 8) + zzadrVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzadrVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i14 = 6;
                                    i31 = 1;
                                }
                                int zzb11 = zzadrVar.zzb(i14) + 1;
                                for (int i37 = 0; i37 < zzb11; i37++) {
                                    int zzb12 = zzadrVar.zzb(16);
                                    if (zzb12 != 0) {
                                        zzea.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb12);
                                    } else {
                                        if (zzadrVar.zzd()) {
                                            i = 1;
                                            i2 = zzadrVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzadrVar.zzd()) {
                                            int zzb13 = zzadrVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < zzb13; i38++) {
                                                int i39 = i9 - 1;
                                                zzadrVar.zzc(zzadv.zza(i39));
                                                zzadrVar.zzc(zzadv.zza(i39));
                                            }
                                        }
                                        if (zzadrVar.zzb(2) != 0) {
                                            throw zzbo.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                zzadrVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            zzadrVar.zzc(8);
                                            zzadrVar.zzc(8);
                                            zzadrVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzadrVar.zzb(6);
                                int i42 = zzb14 + 1;
                                zzadt[] zzadtVarArr = new zzadt[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    zzadtVarArr[i43] = new zzadt(zzadrVar.zzd(), zzadrVar.zzb(16), zzadrVar.zzb(16), zzadrVar.zzb(8));
                                }
                                if (!zzadrVar.zzd()) {
                                    throw zzbo.zza("framing bit after modes not set as expected", null);
                                }
                                zzajpVar = new zzajp(zzaduVar3, zzadsVar, bArr, zzadtVarArr, zzadv.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzadrVar.zzb(24) != 5653314) {
                            throw zzbo.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzadrVar.zza(), null);
                        }
                        int zzb15 = zzadrVar.zzb(16);
                        int zzb16 = zzadrVar.zzb(24);
                        if (zzadrVar.zzd()) {
                            zzadrVar.zzc(5);
                            for (int i44 = 0; i44 < zzb16; i44 += zzadrVar.zzb(zzadv.zza(zzb16 - i44))) {
                            }
                        } else {
                            boolean zzd = zzadrVar.zzd();
                            for (int i45 = 0; i45 < zzb16; i45++) {
                                if (!zzd) {
                                    zzadrVar.zzc(5);
                                } else if (zzadrVar.zzd()) {
                                    zzadrVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzadrVar.zzb(i5);
                        if (zzb17 > 2) {
                            throw zzbo.zza("lookup type greater than 2 not decodable: " + zzb17, null);
                        }
                        if (zzb17 == 1) {
                            i12 = zzb17;
                        } else if (zzb17 != 2) {
                            zzaduVar = zzaduVar2;
                            i11++;
                            zzaduVar2 = zzaduVar;
                            i5 = 4;
                        }
                        zzadrVar.zzc(32);
                        zzadrVar.zzc(32);
                        int zzb18 = zzadrVar.zzb(i5) + 1;
                        zzadrVar.zzc(1);
                        if (i12 != 1) {
                            zzaduVar = zzaduVar2;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzaduVar = zzaduVar2;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzaduVar = zzaduVar2;
                            j2 = 0;
                        }
                        zzadrVar.zzc((int) (j2 * zzb18));
                        i11++;
                        zzaduVar2 = zzaduVar;
                        i5 = 4;
                    }
                }
            }
        }
        zzajpVar = null;
        this.zza = zzajpVar;
        if (zzajpVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzadu zzaduVar4 = zzajpVar.zza;
        arrayList.add(zzaduVar4.zzg);
        arrayList.add(zzajpVar.zzc);
        zzbk zzb19 = zzadv.zzb(zzfxr.zzl(zzajpVar.zzb.zza));
        zzad zzadVar = new zzad();
        zzadVar.zzX("audio/vorbis");
        zzadVar.zzx(zzaduVar4.zzd);
        zzadVar.zzS(zzaduVar4.zzc);
        zzadVar.zzy(zzaduVar4.zza);
        zzadVar.zzY(zzaduVar4.zzb);
        zzadVar.zzL(arrayList);
        zzadVar.zzQ(zzb19);
        zzajlVar.zza = zzadVar.zzad();
        return true;
    }
}
