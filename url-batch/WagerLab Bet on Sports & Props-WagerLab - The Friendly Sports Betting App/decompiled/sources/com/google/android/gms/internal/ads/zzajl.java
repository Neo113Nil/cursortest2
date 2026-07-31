package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzajl extends zzajj {
    private zzajk zza;
    private int zzb;
    private boolean zzc;
    private zzaeg zzd;
    private zzaee zze;

    zzajl() {
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final long zzb(zzef zzefVar) {
        if ((zzefVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzefVar.zzi()[0];
        zzajk zzajkVar = this.zza;
        zzajkVar.getClass();
        int i = !zzajkVar.zzd[(b >> 1) & (255 >>> (8 - zzajkVar.zze))].zza ? zzajkVar.zza.zze : zzajkVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzefVar.zzj() < zzefVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzefVar.zzi(), zzefVar.zze() + 4);
            zzefVar.zzb(copyOf, copyOf.length);
        } else {
            zzefVar.zzf(zzefVar.zze() + 4);
        }
        long j = i2;
        byte[] zzi = zzefVar.zzi();
        zzi[zzefVar.zze() - 4] = (byte) (j & 255);
        zzi[zzefVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzi[zzefVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzi[zzefVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzaeg zzaegVar = this.zzd;
        this.zzb = zzaegVar != null ? zzaegVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzef zzefVar, long j, zzajh zzajhVar) throws IOException {
        zzajk zzajkVar;
        int i;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        long j2;
        if (this.zza != null) {
            zzajhVar.zza.getClass();
            return false;
        }
        zzaeg zzaegVar = this.zzd;
        int i5 = 1;
        if (zzaegVar == null) {
            zzaeh.zzd(1, zzefVar, false);
            int zzI = zzefVar.zzI();
            int zzs = zzefVar.zzs();
            int zzI2 = zzefVar.zzI();
            int zzC = zzefVar.zzC();
            int i6 = zzC <= 0 ? -1 : zzC;
            int zzC2 = zzefVar.zzC();
            int i7 = zzC2 <= 0 ? -1 : zzC2;
            int zzC3 = zzefVar.zzC();
            int i8 = zzC3 <= 0 ? -1 : zzC3;
            int zzs2 = zzefVar.zzs();
            this.zzd = new zzaeg(zzI, zzs, zzI2, i6, i7, i8, (int) Math.pow(2.0d, zzs2 & 15), (int) Math.pow(2.0d, (zzs2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), 1 == (zzefVar.zzs() & 1), Arrays.copyOf(zzefVar.zzi(), zzefVar.zze()));
        } else {
            int i9 = 4;
            zzaee zzaeeVar = this.zze;
            if (zzaeeVar == null) {
                this.zze = zzaeh.zzb(zzefVar, true, true);
            } else {
                byte[] bArr = new byte[zzefVar.zze()];
                System.arraycopy(zzefVar.zzi(), 0, bArr, 0, zzefVar.zze());
                int i10 = zzaegVar.zza;
                int i11 = 5;
                zzaeh.zzd(5, zzefVar, false);
                int zzs3 = zzefVar.zzs() + 1;
                zzaed zzaedVar = new zzaed(zzefVar.zzi());
                zzaedVar.zzc(zzefVar.zzg() * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = 16;
                    if (i12 >= zzs3) {
                        int i15 = i5;
                        int i16 = 6;
                        int zzb = zzaedVar.zzb(6) + i15;
                        for (int i17 = 0; i17 < zzb; i17++) {
                            if (zzaedVar.zzb(16) != 0) {
                                throw zzas.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int zzb2 = zzaedVar.zzb(6) + i15;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < zzb2) {
                                int zzb3 = zzaedVar.zzb(i14);
                                if (zzb3 == 0) {
                                    int i20 = 8;
                                    zzaedVar.zzc(8);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(16);
                                    zzaedVar.zzc(6);
                                    zzaedVar.zzc(8);
                                    int zzb4 = zzaedVar.zzb(4) + 1;
                                    int i21 = 0;
                                    while (i21 < zzb4) {
                                        zzaedVar.zzc(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (zzb3 != i15) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzb3).length() + 41);
                                        sb.append("floor type greater than 1 not decodable: ");
                                        sb.append(zzb3);
                                        throw zzas.zzb(sb.toString(), null);
                                    }
                                    int zzb5 = zzaedVar.zzb(5);
                                    int[] iArr2 = new int[zzb5];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < zzb5; i23++) {
                                        int zzb6 = zzaedVar.zzb(4);
                                        iArr2[i23] = zzb6;
                                        if (zzb6 > i22) {
                                            i22 = zzb6;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr3 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        int i26 = 1;
                                        iArr3[i25] = zzaedVar.zzb(i19) + 1;
                                        int zzb7 = zzaedVar.zzb(2);
                                        if (zzb7 > 0) {
                                            i3 = 8;
                                            zzaedVar.zzc(8);
                                        } else {
                                            i3 = 8;
                                        }
                                        int i27 = i24;
                                        int i28 = 0;
                                        while (true) {
                                            int i29 = i26 << zzb7;
                                            iArr = iArr2;
                                            if (i28 < i29) {
                                                zzaedVar.zzc(i3);
                                                i28++;
                                                iArr2 = iArr;
                                                i3 = 8;
                                                i26 = 1;
                                            }
                                        }
                                        i25++;
                                        iArr2 = iArr;
                                        i24 = i27;
                                        i19 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    zzaedVar.zzc(2);
                                    int zzb8 = zzaedVar.zzb(4);
                                    int i30 = 0;
                                    int i31 = 0;
                                    for (int i32 = 0; i32 < zzb5; i32++) {
                                        i30 += iArr3[iArr4[i32]];
                                        while (i31 < i30) {
                                            zzaedVar.zzc(zzb8);
                                            i31++;
                                        }
                                    }
                                }
                                i18++;
                                i16 = 6;
                                i14 = 16;
                                i15 = 1;
                            } else {
                                int i33 = 1;
                                int zzb9 = zzaedVar.zzb(i16) + 1;
                                int i34 = 0;
                                while (i34 < zzb9) {
                                    if (zzaedVar.zzb(16) > 2) {
                                        throw zzas.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    zzaedVar.zzc(24);
                                    int zzb10 = zzaedVar.zzb(i16) + i33;
                                    int i35 = 8;
                                    zzaedVar.zzc(8);
                                    int[] iArr5 = new int[zzb10];
                                    for (int i36 = 0; i36 < zzb10; i36++) {
                                        iArr5[i36] = ((zzaedVar.zza() ? zzaedVar.zzb(5) : 0) * 8) + zzaedVar.zzb(3);
                                    }
                                    int i37 = 0;
                                    while (i37 < zzb10) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr5[i37] & (1 << i38)) != 0) {
                                                zzaedVar.zzc(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i16 = 6;
                                    i33 = 1;
                                }
                                int zzb11 = zzaedVar.zzb(i16) + 1;
                                for (int i39 = 0; i39 < zzb11; i39++) {
                                    int zzb12 = zzaedVar.zzb(16);
                                    if (zzb12 != 0) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzb12).length() + 41);
                                        sb2.append("mapping type other than 0 not supported: ");
                                        sb2.append(zzb12);
                                        zzds.zze("VorbisUtil", sb2.toString());
                                    } else {
                                        if (zzaedVar.zza()) {
                                            i = 1;
                                            i2 = zzaedVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzaedVar.zza()) {
                                            int zzb13 = zzaedVar.zzb(8) + i;
                                            for (int i40 = 0; i40 < zzb13; i40++) {
                                                int i41 = i10 - 1;
                                                zzaedVar.zzc(zzaeh.zza(i41));
                                                zzaedVar.zzc(zzaeh.zza(i41));
                                            }
                                        }
                                        if (zzaedVar.zzb(2) != 0) {
                                            throw zzas.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i42 = 0; i42 < i10; i42++) {
                                                zzaedVar.zzc(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < i2; i43++) {
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                            zzaedVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzaedVar.zzb(6);
                                int i44 = zzb14 + 1;
                                zzaef[] zzaefVarArr = new zzaef[i44];
                                for (int i45 = 0; i45 < i44; i45++) {
                                    zzaefVarArr[i45] = new zzaef(zzaedVar.zza(), zzaedVar.zzb(16), zzaedVar.zzb(16), zzaedVar.zzb(8));
                                }
                                if (!zzaedVar.zza()) {
                                    throw zzas.zzb("framing bit after modes not set as expected", null);
                                }
                                zzajkVar = new zzajk(zzaegVar, zzaeeVar, bArr, zzaefVarArr, zzaeh.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzaedVar.zzb(24) != 5653314) {
                            int zzd = zzaedVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(zzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(zzd);
                            throw zzas.zzb(sb3.toString(), null);
                        }
                        int zzb15 = zzaedVar.zzb(16);
                        int zzb16 = zzaedVar.zzb(24);
                        if (zzaedVar.zza()) {
                            zzaedVar.zzc(i11);
                            for (int i46 = 0; i46 < zzb16; i46 += zzaedVar.zzb(zzaeh.zza(zzb16 - i46))) {
                            }
                        } else {
                            boolean zza = zzaedVar.zza();
                            for (int i47 = 0; i47 < zzb16; i47++) {
                                if (!zza) {
                                    zzaedVar.zzc(i11);
                                } else if (zzaedVar.zza()) {
                                    zzaedVar.zzc(i11);
                                }
                            }
                        }
                        int i48 = i9;
                        int zzb17 = zzaedVar.zzb(i48);
                        if (zzb17 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(zzb17).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(zzb17);
                            throw zzas.zzb(sb4.toString(), null);
                        }
                        if (zzb17 == i5) {
                            i13 = zzb17;
                        } else if (zzb17 != 2) {
                            i4 = i5;
                            i12++;
                            i5 = i4;
                            i9 = 4;
                            i11 = 5;
                        }
                        zzaedVar.zzc(32);
                        zzaedVar.zzc(32);
                        int zzb18 = zzaedVar.zzb(i48) + i5;
                        zzaedVar.zzc(i5);
                        if (i13 != i5) {
                            i4 = i5;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            i4 = i5;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            i4 = i5;
                            j2 = 0;
                        }
                        zzaedVar.zzc((int) (j2 * zzb18));
                        i12++;
                        i5 = i4;
                        i9 = 4;
                        i11 = 5;
                    }
                }
            }
        }
        zzajkVar = null;
        this.zza = zzajkVar;
        if (zzajkVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaeg zzaegVar2 = zzajkVar.zza;
        arrayList.add(zzaegVar2.zzg);
        arrayList.add(zzajkVar.zzc);
        zzao zzc = zzaeh.zzc(zzgjz.zzr(zzajkVar.zzb.zza));
        zzs zzsVar = new zzs();
        zzsVar.zzl(MimeTypes.AUDIO_OGG);
        zzsVar.zzm(MimeTypes.AUDIO_VORBIS);
        zzsVar.zzh(zzaegVar2.zzd);
        zzsVar.zzi(zzaegVar2.zzc);
        zzsVar.zzE(zzaegVar2.zza);
        zzsVar.zzF(zzaegVar2.zzb);
        zzsVar.zzp(arrayList);
        zzsVar.zzk(zzc);
        zzajhVar.zza = zzsVar.zzM();
        return true;
    }
}
