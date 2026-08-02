package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzagp extends zzagn {
    private zzago zza;
    private int zzb;
    private boolean zzc;
    private zzaau zzd;
    private zzaas zze;

    zzagp() {
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    protected final long zza(zzef zzefVar) {
        if ((zzefVar.zzH()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzefVar.zzH()[0];
        zzago zzagoVar = this.zza;
        zzdd.zzb(zzagoVar);
        int i = !zzagoVar.zzd[(b >> 1) & (255 >>> (8 - zzagoVar.zze))].zza ? zzagoVar.zza.zze : zzagoVar.zza.zzf;
        long j = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzefVar.zzb() < zzefVar.zzd() + 4) {
            byte[] copyOf = Arrays.copyOf(zzefVar.zzH(), zzefVar.zzd() + 4);
            zzefVar.zzD(copyOf, copyOf.length);
        } else {
            zzefVar.zzE(zzefVar.zzd() + 4);
        }
        byte[] zzH = zzefVar.zzH();
        zzH[zzefVar.zzd() - 4] = (byte) (j & 255);
        zzH[zzefVar.zzd() - 3] = (byte) ((j >>> 8) & 255);
        zzH[zzefVar.zzd() - 2] = (byte) ((j >>> 16) & 255);
        zzH[zzefVar.zzd() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzagn
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

    @Override // com.google.android.gms.internal.ads.zzagn
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaau zzaauVar = this.zzd;
        this.zzb = zzaauVar != null ? zzaauVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagn
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzef zzefVar, long j, zzagk zzagkVar) throws IOException {
        zzago zzagoVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.zza != null) {
            Objects.requireNonNull(zzagkVar.zza);
            return false;
        }
        zzaau zzaauVar = this.zzd;
        if (zzaauVar == null) {
            zzaav.zzd(1, zzefVar, false);
            int zzh = zzefVar.zzh();
            int zzk = zzefVar.zzk();
            int zzh2 = zzefVar.zzh();
            int zzg = zzefVar.zzg();
            int i7 = zzg <= 0 ? -1 : zzg;
            int zzg2 = zzefVar.zzg();
            int i8 = zzg2 <= 0 ? -1 : zzg2;
            int zzg3 = zzefVar.zzg();
            int i9 = zzg3 <= 0 ? -1 : zzg3;
            int zzk2 = zzefVar.zzk();
            this.zzd = new zzaau(zzh, zzk, zzh2, i7, i8, i9, (int) Math.pow(2.0d, zzk2 & 15), (int) Math.pow(2.0d, (zzk2 & 240) >> 4), 1 == (zzefVar.zzk() & 1), Arrays.copyOf(zzefVar.zzH(), zzefVar.zzd()));
        } else {
            zzaas zzaasVar = this.zze;
            if (zzaasVar == null) {
                this.zze = zzaav.zzc(zzefVar, true, true);
            } else {
                byte[] bArr = new byte[zzefVar.zzd()];
                System.arraycopy(zzefVar.zzH(), 0, bArr, 0, zzefVar.zzd());
                int i10 = zzaauVar.zza;
                int i11 = 5;
                zzaav.zzd(5, zzefVar, false);
                int zzk3 = zzefVar.zzk() + 1;
                zzaar zzaarVar = new zzaar(zzefVar.zzH());
                zzaarVar.zzc(zzefVar.zzc() * 8);
                int i12 = 0;
                while (i12 < zzk3) {
                    if (zzaarVar.zzb(24) != 5653314) {
                        throw zzbu.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaarVar.zza(), null);
                    }
                    int zzb = zzaarVar.zzb(16);
                    int zzb2 = zzaarVar.zzb(24);
                    long[] jArr = new long[zzb2];
                    long j2 = 0;
                    if (zzaarVar.zzd()) {
                        i4 = zzk3;
                        int zzb3 = zzaarVar.zzb(i11) + 1;
                        int i13 = 0;
                        while (i13 < zzb2) {
                            int zzb4 = zzaarVar.zzb(zzaav.zza(zzb2 - i13));
                            int i14 = 0;
                            while (i14 < zzb4 && i13 < zzb2) {
                                jArr[i13] = zzb3;
                                i13++;
                                i14++;
                                zzaasVar = zzaasVar;
                                bArr = bArr;
                            }
                            zzb3++;
                            zzaasVar = zzaasVar;
                            bArr = bArr;
                        }
                    } else {
                        boolean zzd = zzaarVar.zzd();
                        int i15 = 0;
                        while (i15 < zzb2) {
                            if (zzd) {
                                if (zzaarVar.zzd()) {
                                    i6 = zzk3;
                                    jArr[i15] = zzaarVar.zzb(i11) + 1;
                                } else {
                                    i6 = zzk3;
                                    jArr[i15] = 0;
                                }
                                i5 = 5;
                            } else {
                                i5 = i11;
                                i6 = zzk3;
                                jArr[i15] = zzaarVar.zzb(i5) + 1;
                            }
                            i15++;
                            i11 = i5;
                            zzk3 = i6;
                        }
                        i4 = zzk3;
                    }
                    zzaas zzaasVar2 = zzaasVar;
                    byte[] bArr2 = bArr;
                    int zzb5 = zzaarVar.zzb(4);
                    if (zzb5 > 2) {
                        throw zzbu.zza("lookup type greater than 2 not decodable: " + zzb5, null);
                    }
                    if (zzb5 != 1) {
                        if (zzb5 == 2) {
                            zzb5 = 2;
                        } else {
                            i12++;
                            zzaasVar = zzaasVar2;
                            zzk3 = i4;
                            bArr = bArr2;
                            i11 = 5;
                        }
                    }
                    zzaarVar.zzc(32);
                    zzaarVar.zzc(32);
                    int zzb6 = zzaarVar.zzb(4) + 1;
                    zzaarVar.zzc(1);
                    if (zzb5 != 1) {
                        j2 = zzb2 * zzb;
                    } else if (zzb != 0) {
                        j2 = (long) Math.floor(Math.pow(zzb2, 1.0d / zzb));
                    }
                    zzaarVar.zzc((int) (zzb6 * j2));
                    i12++;
                    zzaasVar = zzaasVar2;
                    zzk3 = i4;
                    bArr = bArr2;
                    i11 = 5;
                }
                zzaas zzaasVar3 = zzaasVar;
                byte[] bArr3 = bArr;
                int i16 = 6;
                int zzb7 = zzaarVar.zzb(6) + 1;
                for (int i17 = 0; i17 < zzb7; i17++) {
                    if (zzaarVar.zzb(16) != 0) {
                        throw zzbu.zza("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i18 = 1;
                int zzb8 = zzaarVar.zzb(6) + 1;
                int i19 = 0;
                while (true) {
                    int i20 = 3;
                    if (i19 < zzb8) {
                        int zzb9 = zzaarVar.zzb(16);
                        if (zzb9 == 0) {
                            int i21 = 8;
                            zzaarVar.zzc(8);
                            zzaarVar.zzc(16);
                            zzaarVar.zzc(16);
                            zzaarVar.zzc(6);
                            zzaarVar.zzc(8);
                            int zzb10 = zzaarVar.zzb(4) + 1;
                            int i22 = 0;
                            while (i22 < zzb10) {
                                zzaarVar.zzc(i21);
                                i22++;
                                i21 = 8;
                            }
                        } else {
                            if (zzb9 != i18) {
                                throw zzbu.zza("floor type greater than 1 not decodable: " + zzb9, null);
                            }
                            int zzb11 = zzaarVar.zzb(5);
                            int[] iArr = new int[zzb11];
                            int i23 = -1;
                            for (int i24 = 0; i24 < zzb11; i24++) {
                                int zzb12 = zzaarVar.zzb(4);
                                iArr[i24] = zzb12;
                                if (zzb12 > i23) {
                                    i23 = zzb12;
                                }
                            }
                            int i25 = i23 + 1;
                            int[] iArr2 = new int[i25];
                            int i26 = 0;
                            while (i26 < i25) {
                                iArr2[i26] = zzaarVar.zzb(i20) + 1;
                                int zzb13 = zzaarVar.zzb(2);
                                if (zzb13 > 0) {
                                    i3 = 8;
                                    zzaarVar.zzc(8);
                                } else {
                                    i3 = 8;
                                }
                                int i27 = 0;
                                for (int i28 = 1; i27 < (i28 << zzb13); i28 = 1) {
                                    zzaarVar.zzc(i3);
                                    i27++;
                                    i3 = 8;
                                }
                                i26++;
                                i20 = 3;
                            }
                            zzaarVar.zzc(2);
                            int zzb14 = zzaarVar.zzb(4);
                            int i29 = 0;
                            int i30 = 0;
                            for (int i31 = 0; i31 < zzb11; i31++) {
                                i29 += iArr2[iArr[i31]];
                                while (i30 < i29) {
                                    zzaarVar.zzc(zzb14);
                                    i30++;
                                }
                            }
                        }
                        i19++;
                        i16 = 6;
                        i18 = 1;
                    } else {
                        int i32 = 1;
                        int zzb15 = zzaarVar.zzb(i16) + 1;
                        int i33 = 0;
                        while (i33 < zzb15) {
                            if (zzaarVar.zzb(16) > 2) {
                                throw zzbu.zza("residueType greater than 2 is not decodable", null);
                            }
                            zzaarVar.zzc(24);
                            zzaarVar.zzc(24);
                            zzaarVar.zzc(24);
                            int zzb16 = zzaarVar.zzb(i16) + i32;
                            int i34 = 8;
                            zzaarVar.zzc(8);
                            int[] iArr3 = new int[zzb16];
                            for (int i35 = 0; i35 < zzb16; i35++) {
                                iArr3[i35] = ((zzaarVar.zzd() ? zzaarVar.zzb(5) : 0) * 8) + zzaarVar.zzb(3);
                            }
                            int i36 = 0;
                            while (i36 < zzb16) {
                                int i37 = 0;
                                while (i37 < i34) {
                                    if ((iArr3[i36] & (1 << i37)) != 0) {
                                        zzaarVar.zzc(i34);
                                    }
                                    i37++;
                                    i34 = 8;
                                }
                                i36++;
                                i34 = 8;
                            }
                            i33++;
                            i16 = 6;
                            i32 = 1;
                        }
                        int zzb17 = zzaarVar.zzb(i16) + 1;
                        for (int i38 = 0; i38 < zzb17; i38++) {
                            int zzb18 = zzaarVar.zzb(16);
                            if (zzb18 != 0) {
                                zzdw.zzb("VorbisUtil", "mapping type other than 0 not supported: " + zzb18);
                            } else {
                                if (zzaarVar.zzd()) {
                                    i = 1;
                                    i2 = zzaarVar.zzb(4) + 1;
                                } else {
                                    i = 1;
                                    i2 = 1;
                                }
                                if (zzaarVar.zzd()) {
                                    int zzb19 = zzaarVar.zzb(8) + i;
                                    for (int i39 = 0; i39 < zzb19; i39++) {
                                        int i40 = i10 - 1;
                                        zzaarVar.zzc(zzaav.zza(i40));
                                        zzaarVar.zzc(zzaav.zza(i40));
                                    }
                                }
                                if (zzaarVar.zzb(2) != 0) {
                                    throw zzbu.zza("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i2 > 1) {
                                    for (int i41 = 0; i41 < i10; i41++) {
                                        zzaarVar.zzc(4);
                                    }
                                }
                                for (int i42 = 0; i42 < i2; i42++) {
                                    zzaarVar.zzc(8);
                                    zzaarVar.zzc(8);
                                    zzaarVar.zzc(8);
                                }
                            }
                        }
                        int zzb20 = zzaarVar.zzb(6) + 1;
                        zzaat[] zzaatVarArr = new zzaat[zzb20];
                        for (int i43 = 0; i43 < zzb20; i43++) {
                            zzaatVarArr[i43] = new zzaat(zzaarVar.zzd(), zzaarVar.zzb(16), zzaarVar.zzb(16), zzaarVar.zzb(8));
                        }
                        if (!zzaarVar.zzd()) {
                            throw zzbu.zza("framing bit after modes not set as expected", null);
                        }
                        zzagoVar = new zzago(zzaauVar, zzaasVar3, bArr3, zzaatVarArr, zzaav.zza(zzb20 - 1));
                    }
                }
            }
        }
        zzagoVar = null;
        this.zza = zzagoVar;
        if (zzagoVar == null) {
            return true;
        }
        zzaau zzaauVar2 = zzagoVar.zza;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzaauVar2.zzg);
        arrayList.add(zzagoVar.zzc);
        zzbq zzb21 = zzaav.zzb(zzfvn.zzn(zzagoVar.zzb.zzb));
        zzad zzadVar = new zzad();
        zzadVar.zzS("audio/vorbis");
        zzadVar.zzv(zzaauVar2.zzd);
        zzadVar.zzO(zzaauVar2.zzc);
        zzadVar.zzw(zzaauVar2.zza);
        zzadVar.zzT(zzaauVar2.zzb);
        zzadVar.zzI(arrayList);
        zzadVar.zzM(zzb21);
        zzagkVar.zza = zzadVar.zzY();
        return true;
    }
}
