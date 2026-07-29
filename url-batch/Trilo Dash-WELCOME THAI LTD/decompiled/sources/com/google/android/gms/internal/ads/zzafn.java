package com.google.android.gms.internal.ads;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzafn extends zzafl {
    private zzafm zza;
    private int zzb;
    private boolean zzc;
    private zzaae zzd;
    private zzaac zze;

    zzafn() {
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final long zza(zzdy zzdyVar) {
        if ((zzdyVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzdyVar.zzH()[0];
        zzafm zzafmVar = this.zza;
        zzcw.zzb(zzafmVar);
        int i = !zzafmVar.zzd[(b >> 1) & (255 >>> (8 - zzafmVar.zze))].zza ? zzafmVar.zza.zze : zzafmVar.zza.zzf;
        long j = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzdyVar.zzb() < zzdyVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd() + 4);
            zzdyVar.zzD(copyOf, copyOf.length);
        } else {
            zzdyVar.zzE(zzdyVar.zzd() + 4);
        }
        byte[] zzH = zzdyVar.zzH();
        zzH[zzdyVar.zzd() - 4] = (byte) (j & 255);
        zzH[zzdyVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzH[zzdyVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzH[zzdyVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
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

    @Override // com.google.android.gms.internal.ads.zzafl
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaae zzaaeVar = this.zzd;
        this.zzb = zzaaeVar != null ? zzaaeVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzdy zzdyVar, long j, zzafi zzafiVar) throws IOException {
        zzafm zzafmVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.zza != null) {
            Objects.requireNonNull(zzafiVar.zza);
            return false;
        }
        zzaae zzaaeVar = this.zzd;
        if (zzaaeVar == null) {
            zzaaf.zzd(1, zzdyVar, false);
            int zzh = zzdyVar.zzh();
            int zzk = zzdyVar.zzk();
            int zzh2 = zzdyVar.zzh();
            int zzg = zzdyVar.zzg();
            int i6 = zzg <= 0 ? -1 : zzg;
            int zzg2 = zzdyVar.zzg();
            int i7 = zzg2 <= 0 ? -1 : zzg2;
            int zzg3 = zzdyVar.zzg();
            int i8 = zzg3 <= 0 ? -1 : zzg3;
            int zzk2 = zzdyVar.zzk();
            this.zzd = new zzaae(zzh, zzk, zzh2, i6, i7, i8, (int) Math.pow(2.0d, zzk2 & 15), (int) Math.pow(2.0d, (zzk2 & 240) >> 4), 1 == (zzdyVar.zzk() & 1), Arrays.copyOf(zzdyVar.zzH(), zzdyVar.zzd()));
        } else {
            zzaac zzaacVar = this.zze;
            if (zzaacVar == null) {
                this.zze = zzaaf.zzc(zzdyVar, true, true);
            } else {
                byte[] bArr = new byte[zzdyVar.zzd()];
                System.arraycopy(zzdyVar.zzH(), 0, bArr, 0, zzdyVar.zzd());
                int i9 = zzaaeVar.zza;
                int i10 = 5;
                zzaaf.zzd(5, zzdyVar, false);
                int zzk3 = zzdyVar.zzk() + 1;
                zzaab zzaabVar = new zzaab(zzdyVar.zzH());
                zzaabVar.zzc(zzdyVar.zzc() * 8);
                int i11 = 0;
                while (i11 < zzk3) {
                    if (zzaabVar.zzb(24) != 5653314) {
                        throw zzbp.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaabVar.zza(), null);
                    }
                    int zzb = zzaabVar.zzb(16);
                    int zzb2 = zzaabVar.zzb(24);
                    long[] jArr = new long[zzb2];
                    long j2 = 0;
                    if (zzaabVar.zzd()) {
                        i4 = zzk3;
                        int zzb3 = zzaabVar.zzb(5) + 1;
                        int i12 = 0;
                        while (i12 < zzb2) {
                            int zzb4 = zzaabVar.zzb(zzaaf.zza(zzb2 - i12));
                            int i13 = 0;
                            while (i13 < zzb4 && i12 < zzb2) {
                                jArr[i12] = zzb3;
                                i12++;
                                i13++;
                                zzaacVar = zzaacVar;
                                bArr = bArr;
                            }
                            zzb3++;
                            zzaacVar = zzaacVar;
                            bArr = bArr;
                        }
                    } else {
                        boolean zzd = zzaabVar.zzd();
                        int i14 = 0;
                        while (i14 < zzb2) {
                            if (!zzd) {
                                i5 = zzk3;
                                jArr[i14] = zzaabVar.zzb(5) + 1;
                            } else if (zzaabVar.zzd()) {
                                i5 = zzk3;
                                jArr[i14] = zzaabVar.zzb(i10) + 1;
                            } else {
                                i5 = zzk3;
                                jArr[i14] = 0;
                            }
                            i14++;
                            zzk3 = i5;
                            i10 = 5;
                        }
                        i4 = zzk3;
                    }
                    zzaac zzaacVar2 = zzaacVar;
                    byte[] bArr2 = bArr;
                    int zzb5 = zzaabVar.zzb(4);
                    if (zzb5 > 2) {
                        throw zzbp.zza("lookup type greater than 2 not decodable: " + zzb5, null);
                    }
                    if (zzb5 != 1) {
                        if (zzb5 == 2) {
                            zzb5 = 2;
                        } else {
                            i11++;
                            zzaacVar = zzaacVar2;
                            zzk3 = i4;
                            bArr = bArr2;
                            i10 = 5;
                        }
                    }
                    zzaabVar.zzc(32);
                    zzaabVar.zzc(32);
                    int zzb6 = zzaabVar.zzb(4) + 1;
                    zzaabVar.zzc(1);
                    if (zzb5 != 1) {
                        j2 = zzb2 * zzb;
                    } else if (zzb != 0) {
                        double d = zzb;
                        Double.isNaN(d);
                        j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / d));
                    }
                    zzaabVar.zzc((int) (zzb6 * j2));
                    i11++;
                    zzaacVar = zzaacVar2;
                    zzk3 = i4;
                    bArr = bArr2;
                    i10 = 5;
                }
                zzaac zzaacVar3 = zzaacVar;
                byte[] bArr3 = bArr;
                int i15 = 6;
                int zzb7 = zzaabVar.zzb(6) + 1;
                for (int i16 = 0; i16 < zzb7; i16++) {
                    if (zzaabVar.zzb(16) != 0) {
                        throw zzbp.zza("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i17 = 1;
                int zzb8 = zzaabVar.zzb(6) + 1;
                int i18 = 0;
                while (true) {
                    int i19 = 3;
                    if (i18 < zzb8) {
                        int zzb9 = zzaabVar.zzb(16);
                        if (zzb9 == 0) {
                            int i20 = 8;
                            zzaabVar.zzc(8);
                            zzaabVar.zzc(16);
                            zzaabVar.zzc(16);
                            zzaabVar.zzc(6);
                            zzaabVar.zzc(8);
                            int zzb10 = zzaabVar.zzb(4) + 1;
                            int i21 = 0;
                            while (i21 < zzb10) {
                                zzaabVar.zzc(i20);
                                i21++;
                                i20 = 8;
                            }
                        } else {
                            if (zzb9 != i17) {
                                throw zzbp.zza("floor type greater than 1 not decodable: " + zzb9, null);
                            }
                            int zzb11 = zzaabVar.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i22 = -1;
                            for (int i23 = 0; i23 < zzb11; i23++) {
                                int zzb12 = zzaabVar.zzb(4);
                                iArr[i23] = zzb12;
                                if (zzb12 > i22) {
                                    i22 = zzb12;
                                }
                            }
                            int i24 = i22 + 1;
                            int[] iArr2 = new int[i24];
                            int i25 = 0;
                            while (i25 < i24) {
                                iArr2[i25] = zzaabVar.zzb(i19) + 1;
                                int zzb13 = zzaabVar.zzb(2);
                                if (zzb13 > 0) {
                                    i3 = 8;
                                    zzaabVar.zzc(8);
                                } else {
                                    i3 = 8;
                                }
                                int i26 = 0;
                                for (int i27 = 1; i26 < (i27 << zzb13); i27 = 1) {
                                    zzaabVar.zzc(i3);
                                    i26++;
                                    i3 = 8;
                                }
                                i25++;
                                i19 = 3;
                            }
                            zzaabVar.zzc(2);
                            int zzb14 = zzaabVar.zzb(4);
                            int i28 = 0;
                            int i29 = 0;
                            for (int i30 = 0; i30 < zzb11; i30++) {
                                i28 += iArr2[iArr[i30]];
                                while (i29 < i28) {
                                    zzaabVar.zzc(zzb14);
                                    i29++;
                                }
                            }
                        }
                        i18++;
                        i15 = 6;
                        i17 = 1;
                    } else {
                        int i31 = 1;
                        int zzb15 = zzaabVar.zzb(i15) + 1;
                        int i32 = 0;
                        while (i32 < zzb15) {
                            if (zzaabVar.zzb(16) > 2) {
                                throw zzbp.zza("residueType greater than 2 is not decodable", null);
                            }
                            zzaabVar.zzc(24);
                            zzaabVar.zzc(24);
                            zzaabVar.zzc(24);
                            int zzb16 = zzaabVar.zzb(i15) + i31;
                            int i33 = 8;
                            zzaabVar.zzc(8);
                            int[] iArr3 = new int[zzb16];
                            for (int i34 = 0; i34 < zzb16; i34++) {
                                iArr3[i34] = ((zzaabVar.zzd() ? zzaabVar.zzb(5) : 0) * 8) + zzaabVar.zzb(3);
                            }
                            int i35 = 0;
                            while (i35 < zzb16) {
                                int i36 = 0;
                                while (i36 < i33) {
                                    if ((iArr3[i35] & (1 << i36)) != 0) {
                                        zzaabVar.zzc(i33);
                                    }
                                    i36++;
                                    i33 = 8;
                                }
                                i35++;
                                i33 = 8;
                            }
                            i32++;
                            i15 = 6;
                            i31 = 1;
                        }
                        int zzb17 = zzaabVar.zzb(i15) + 1;
                        for (int i37 = 0; i37 < zzb17; i37++) {
                            int zzb18 = zzaabVar.zzb(16);
                            if (zzb18 != 0) {
                                Log.e("VorbisUtil", "mapping type other than 0 not supported: " + zzb18);
                            } else {
                                if (zzaabVar.zzd()) {
                                    i = 1;
                                    i2 = zzaabVar.zzb(4) + 1;
                                } else {
                                    i = 1;
                                    i2 = 1;
                                }
                                if (zzaabVar.zzd()) {
                                    int zzb19 = zzaabVar.zzb(8) + i;
                                    for (int i38 = 0; i38 < zzb19; i38++) {
                                        int i39 = i9 - 1;
                                        zzaabVar.zzc(zzaaf.zza(i39));
                                        zzaabVar.zzc(zzaaf.zza(i39));
                                    }
                                }
                                if (zzaabVar.zzb(2) != 0) {
                                    throw zzbp.zza("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i2 > 1) {
                                    for (int i40 = 0; i40 < i9; i40++) {
                                        zzaabVar.zzc(4);
                                    }
                                }
                                for (int i41 = 0; i41 < i2; i41++) {
                                    zzaabVar.zzc(8);
                                    zzaabVar.zzc(8);
                                    zzaabVar.zzc(8);
                                }
                            }
                        }
                        int zzb20 = zzaabVar.zzb(6) + 1;
                        zzaad[] zzaadVarArr = new zzaad[zzb20];
                        for (int i42 = 0; i42 < zzb20; i42++) {
                            zzaadVarArr[i42] = new zzaad(zzaabVar.zzd(), zzaabVar.zzb(16), zzaabVar.zzb(16), zzaabVar.zzb(8));
                        }
                        if (!zzaabVar.zzd()) {
                            throw zzbp.zza("framing bit after modes not set as expected", null);
                        }
                        zzafmVar = new zzafm(zzaaeVar, zzaacVar3, bArr3, zzaadVarArr, zzaaf.zza(zzb20 - 1));
                    }
                }
            }
        }
        zzafmVar = null;
        this.zza = zzafmVar;
        if (zzafmVar == null) {
            return true;
        }
        zzaae zzaaeVar2 = zzafmVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzaaeVar2.zzg);
        arrayList.add(zzafmVar.zzc);
        zzbl zzb21 = zzaaf.zzb(zzfrh.zzn(zzafmVar.zzb.zzb));
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/vorbis");
        zzabVar.zzv(zzaaeVar2.zzd);
        zzabVar.zzO(zzaaeVar2.zzc);
        zzabVar.zzw(zzaaeVar2.zza);
        zzabVar.zzT(zzaaeVar2.zzb);
        zzabVar.zzI(arrayList);
        zzabVar.zzM(zzb21);
        zzafiVar.zza = zzabVar.zzY();
        return true;
    }
}
