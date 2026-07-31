package com.google.android.gms.internal.ads;

import androidx.media3.common.MimeTypes;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfl {
    public static final byte[] zza = {0, 0, 0, 1};
    public static final float[] zzb = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object zzc = new Object();
    private static int[] zzd = new int[10];

    public static int zzb(zzu zzuVar) {
        String str = zzuVar.zzo;
        if (Objects.equals(str, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return (Objects.equals(str, MimeTypes.VIDEO_H265) || zzar.zze(zzuVar.zzk, MimeTypes.VIDEO_H265)) ? 2 : 0;
    }

    public static boolean zzc(byte[] bArr, int i, int i2, zzu zzuVar) {
        String str = zzuVar.zzo;
        if (Objects.equals(str, MimeTypes.VIDEO_H264)) {
            byte b = bArr[4];
            if (((b & 96) >> 5) != 0) {
                return true;
            }
            int i3 = b & Ascii.US;
            return (i3 == 1 || i3 == 9 || i3 == 14) ? false : true;
        }
        if (Objects.equals(str, MimeTypes.VIDEO_H265)) {
            zzez zzk = zzk(new zzfm(bArr, 4, i2 + 4));
            int i4 = zzk.zza;
            if (i4 == 35) {
                return false;
            }
            return (i4 <= 14 && i4 % 2 == 0 && zzk.zzc == zzuVar.zzF + (-1)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfk zzd(byte[] bArr, int i, int i2) {
        int zzg;
        int i3;
        boolean z;
        int i4;
        int zzg2;
        int i5;
        int zzg3;
        int i6;
        int i7;
        boolean z2;
        boolean zze;
        int i8;
        int i9;
        float f;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzfm zzfmVar = new zzfm(bArr, i, i2);
        int zzf = zzfmVar.zzf(8);
        int zzf2 = zzfmVar.zzf(8);
        int zzf3 = zzfmVar.zzf(8);
        int zzg4 = zzfmVar.zzg();
        if (zzf != 100 && zzf != 110 && zzf != 122 && zzf != 244 && zzf != 44 && zzf != 83 && zzf != 86 && zzf != 118 && zzf != 128) {
            if (zzf != 138) {
                zzg = 1;
                i4 = 16;
                i5 = 0;
                z = false;
                zzg2 = 0;
                int zzg5 = zzfmVar.zzg() + 4;
                zzg3 = zzfmVar.zzg();
                if (zzg3 != 0) {
                    i7 = zzfmVar.zzg() + 4;
                    i6 = 244;
                } else {
                    if (zzg3 == 1) {
                        boolean zze2 = zzfmVar.zze();
                        zzfmVar.zzh();
                        zzfmVar.zzh();
                        long zzg6 = zzfmVar.zzg();
                        for (int i15 = 0; i15 < zzg6; i15++) {
                            zzfmVar.zzg();
                        }
                        z2 = zze2;
                        zzg3 = 1;
                        i6 = 244;
                        i7 = 0;
                        int zzg7 = zzfmVar.zzg();
                        zzfmVar.zza();
                        int zzg8 = zzfmVar.zzg() + 1;
                        int zzg9 = zzfmVar.zzg() + 1;
                        zze = zzfmVar.zze();
                        int i16 = 2 - (zze ? 1 : 0);
                        if (!zze) {
                            zzfmVar.zza();
                        }
                        zzfmVar.zza();
                        int i17 = zzg8 * 16;
                        int i18 = zzg9 * i16 * 16;
                        if (zzfmVar.zze()) {
                            int zzg10 = zzfmVar.zzg();
                            int zzg11 = zzfmVar.zzg();
                            int zzg12 = zzfmVar.zzg();
                            int zzg13 = zzfmVar.zzg();
                            if (zzg == 0) {
                                i14 = 1;
                            } else {
                                i14 = zzg == 3 ? 1 : 2;
                                i16 *= zzg == 1 ? 2 : 1;
                            }
                            i17 -= (zzg10 + zzg11) * i14;
                            i18 -= (zzg12 + zzg13) * i16;
                        }
                        if (zzf != 44 && zzf != 86 && zzf != 100 && zzf != 110 && zzf != 122) {
                            if (zzf == i6) {
                                zzf = i6;
                            }
                            i8 = i4;
                            float f2 = 1.0f;
                            int i19 = -1;
                            if (zzfmVar.zze()) {
                                i9 = i8;
                                f = 1.0f;
                                i10 = -1;
                                i11 = -1;
                            } else {
                                if (zzfmVar.zze()) {
                                    int zzf4 = zzfmVar.zzf(8);
                                    if (zzf4 == 255) {
                                        int i20 = i4;
                                        int zzf5 = zzfmVar.zzf(i20);
                                        int zzf6 = zzfmVar.zzf(i20);
                                        if (zzf5 != 0 && zzf6 != 0) {
                                            f2 = zzf5 / zzf6;
                                        }
                                    } else if (zzf4 < 17) {
                                        f2 = zzb[zzf4];
                                    } else {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzf4).length() + 35);
                                        sb.append("Unexpected aspect_ratio_idc value: ");
                                        sb.append(zzf4);
                                        zzds.zzc("NalUnitUtil", sb.toString());
                                    }
                                }
                                if (zzfmVar.zze()) {
                                    zzfmVar.zza();
                                }
                                if (zzfmVar.zze()) {
                                    zzfmVar.zzb(3);
                                    int i21 = true != zzfmVar.zze() ? 2 : 1;
                                    if (zzfmVar.zze()) {
                                        int zzf7 = zzfmVar.zzf(8);
                                        int zzf8 = zzfmVar.zzf(8);
                                        zzfmVar.zzb(8);
                                        i12 = zzh.zzb(zzf7);
                                        i13 = zzh.zzc(zzf8);
                                    } else {
                                        i12 = -1;
                                        i13 = -1;
                                    }
                                    i19 = i21;
                                } else {
                                    i12 = -1;
                                    i13 = -1;
                                }
                                if (zzfmVar.zze()) {
                                    zzfmVar.zzg();
                                    zzfmVar.zzg();
                                }
                                if (zzfmVar.zze()) {
                                    zzfmVar.zzb(65);
                                }
                                boolean zze3 = zzfmVar.zze();
                                if (zze3) {
                                    zzo(zzfmVar);
                                }
                                boolean zze4 = zzfmVar.zze();
                                if (zze4) {
                                    zzo(zzfmVar);
                                }
                                if (zze3 || zze4) {
                                    zzfmVar.zza();
                                }
                                zzfmVar.zza();
                                if (zzfmVar.zze()) {
                                    zzfmVar.zza();
                                    zzfmVar.zzg();
                                    zzfmVar.zzg();
                                    zzfmVar.zzg();
                                    zzfmVar.zzg();
                                    i8 = zzfmVar.zzg();
                                    zzfmVar.zzg();
                                }
                                i11 = i13;
                                i9 = i8;
                                f = f2;
                                i10 = i19;
                                i19 = i12;
                            }
                            return new zzfk(zzf, zzf2, zzf3, zzg4, zzg7, i17, i18, f, i5, zzg2, z, zze, zzg5, zzg3, i7, z2, i19, i10, i11, i9);
                        }
                        if ((zzf2 & 16) != 0) {
                            i8 = 0;
                            float f22 = 1.0f;
                            int i192 = -1;
                            if (zzfmVar.zze()) {
                            }
                            return new zzfk(zzf, zzf2, zzf3, zzg4, zzg7, i17, i18, f, i5, zzg2, z, zze, zzg5, zzg3, i7, z2, i192, i10, i11, i9);
                        }
                        i8 = i4;
                        float f222 = 1.0f;
                        int i1922 = -1;
                        if (zzfmVar.zze()) {
                        }
                        return new zzfk(zzf, zzf2, zzf3, zzg4, zzg7, i17, i18, f, i5, zzg2, z, zze, zzg5, zzg3, i7, z2, i1922, i10, i11, i9);
                    }
                    i6 = 244;
                    i7 = 0;
                }
                z2 = false;
                int zzg72 = zzfmVar.zzg();
                zzfmVar.zza();
                int zzg82 = zzfmVar.zzg() + 1;
                int zzg92 = zzfmVar.zzg() + 1;
                zze = zzfmVar.zze();
                int i162 = 2 - (zze ? 1 : 0);
                if (!zze) {
                }
                zzfmVar.zza();
                int i172 = zzg82 * 16;
                int i182 = zzg92 * i162 * 16;
                if (zzfmVar.zze()) {
                }
                if (zzf != 44) {
                    if (zzf == i6) {
                    }
                    i8 = i4;
                    float f2222 = 1.0f;
                    int i19222 = -1;
                    if (zzfmVar.zze()) {
                    }
                    return new zzfk(zzf, zzf2, zzf3, zzg4, zzg72, i172, i182, f, i5, zzg2, z, zze, zzg5, zzg3, i7, z2, i19222, i10, i11, i9);
                }
                if ((zzf2 & 16) != 0) {
                }
                i8 = i4;
                float f22222 = 1.0f;
                int i192222 = -1;
                if (zzfmVar.zze()) {
                }
                return new zzfk(zzf, zzf2, zzf3, zzg4, zzg72, i172, i182, f, i5, zzg2, z, zze, zzg5, zzg3, i7, z2, i192222, i10, i11, i9);
            }
            zzf = 138;
        }
        zzg = zzfmVar.zzg();
        if (zzg == 3) {
            z = zzfmVar.zze();
            i3 = 3;
        } else {
            i3 = zzg;
            z = false;
        }
        i4 = 16;
        int zzg14 = zzfmVar.zzg();
        zzg2 = zzfmVar.zzg();
        zzfmVar.zza();
        if (zzfmVar.zze()) {
            int i22 = i3 != 3 ? 8 : 12;
            int i23 = 0;
            while (i23 < i22) {
                if (zzfmVar.zze()) {
                    int i24 = i23 < 6 ? 16 : 64;
                    int i25 = 8;
                    int i26 = 8;
                    for (int i27 = 0; i27 < i24; i27++) {
                        if (i25 != 0) {
                            i25 = ((i26 + zzfmVar.zzh()) + 256) % 256;
                        }
                        if (i25 != 0) {
                            i26 = i25;
                        }
                    }
                }
                i23++;
            }
        }
        i5 = zzg14;
        int zzg52 = zzfmVar.zzg() + 4;
        zzg3 = zzfmVar.zzg();
        if (zzg3 != 0) {
        }
        z2 = false;
        int zzg722 = zzfmVar.zzg();
        zzfmVar.zza();
        int zzg822 = zzfmVar.zzg() + 1;
        int zzg922 = zzfmVar.zzg() + 1;
        zze = zzfmVar.zze();
        int i1622 = 2 - (zze ? 1 : 0);
        if (!zze) {
        }
        zzfmVar.zza();
        int i1722 = zzg822 * 16;
        int i1822 = zzg922 * i1622 * 16;
        if (zzfmVar.zze()) {
        }
        if (zzf != 44) {
        }
        if ((zzf2 & 16) != 0) {
        }
        i8 = i4;
        float f222222 = 1.0f;
        int i1922222 = -1;
        if (zzfmVar.zze()) {
        }
        return new zzfk(zzf, zzf2, zzf3, zzg4, zzg722, i1722, i1822, f, i5, zzg2, z, zze, zzg52, zzg3, i7, z2, i1922222, i10, i11, i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfi zze(byte[] bArr, int i, int i2) {
        int i3;
        int[] iArr;
        zzfh zzfhVar;
        boolean z;
        int i4;
        boolean[][] zArr;
        int i5;
        int i6;
        int i7;
        zzgjz zzgjzVar;
        int i8;
        boolean[][] zArr2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr2;
        int[] iArr3;
        int i14;
        int i15;
        boolean zze;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzg;
        int i20;
        int i21;
        boolean z2;
        boolean z3;
        zzfm zzfmVar = new zzfm(bArr, i, i2);
        zzez zzk = zzk(zzfmVar);
        zzfmVar.zzb(4);
        boolean zze2 = zzfmVar.zze();
        boolean zze3 = zzfmVar.zze();
        int zzf = zzfmVar.zzf(6);
        int i22 = zzf + 1;
        int zzf2 = zzfmVar.zzf(3);
        zzfmVar.zzb(17);
        zzfa zzl = zzl(zzfmVar, true, zzf2, null);
        int i23 = 0;
        for (int i24 = true != zzfmVar.zze() ? zzf2 : 0; i24 <= zzf2; i24++) {
            zzfmVar.zzg();
            zzfmVar.zzg();
            zzfmVar.zzg();
        }
        int zzf3 = zzfmVar.zzf(6);
        int zzg2 = zzfmVar.zzg() + 1;
        int i25 = 6;
        zzfb zzfbVar = new zzfb(zzgjz.zzj(zzl), new int[1]);
        boolean z4 = i22 >= 2 && zzg2 >= 2;
        boolean z5 = zze2 && zze3;
        int i26 = 1;
        int i27 = zzf3 + 1;
        if (!z4 || !z5 || i27 < i22) {
            return new zzfi(zzk, null, zzfbVar, null, null);
        }
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, zzg2, i27);
        int[] iArr5 = new int[zzg2];
        int[] iArr6 = new int[zzg2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        int i28 = 1;
        while (i28 < zzg2) {
            int i29 = i23;
            while (i23 <= zzf3) {
                if (zzfmVar.zze()) {
                    iArr4[i28][i29] = i23;
                    iArr6[i28] = i23;
                    i29++;
                }
                iArr5[i28] = i29;
                i23++;
            }
            i28++;
            i23 = 0;
        }
        if (zzfmVar.zze()) {
            zzfmVar.zzb(64);
            if (zzfmVar.zze()) {
                zzfmVar.zzg();
            }
            int zzg3 = zzfmVar.zzg();
            int i30 = 0;
            while (i30 < zzg3) {
                zzfmVar.zzg();
                if (i30 == 0 || zzfmVar.zze()) {
                    boolean zze4 = zzfmVar.zze();
                    boolean zze5 = zzfmVar.zze();
                    z3 = zze4;
                    z2 = zze5;
                    if (zze4 || zze5) {
                        zze = zzfmVar.zze();
                        if (zze) {
                            zzfmVar.zzb(19);
                        }
                        zzfmVar.zzb(8);
                        if (zze) {
                            zzfmVar.zzb(4);
                        }
                        zzfmVar.zzb(15);
                        i17 = zze4;
                        i16 = zze5;
                        i18 = 0;
                        while (i18 <= zzf2) {
                            if (zzfmVar.zze() || zzfmVar.zze()) {
                                zzfmVar.zzg();
                            } else if (zzfmVar.zze()) {
                                i19 = i30;
                                zzg = 0;
                                zzez zzezVar = zzk;
                                i20 = i17 + i16;
                                int[][] iArr7 = iArr4;
                                i21 = 0;
                                while (i21 < i20) {
                                    int i31 = i20;
                                    for (int i32 = 0; i32 <= zzg; i32++) {
                                        zzfmVar.zzg();
                                        zzfmVar.zzg();
                                        if (zze) {
                                            zzfmVar.zzg();
                                            zzfmVar.zzg();
                                        }
                                        zzfmVar.zza();
                                    }
                                    i21++;
                                    i20 = i31;
                                }
                                i18++;
                                zzk = zzezVar;
                                i30 = i19;
                                iArr4 = iArr7;
                            }
                            i19 = i30;
                            zzg = zzfmVar.zzg();
                            zzez zzezVar2 = zzk;
                            i20 = i17 + i16;
                            int[][] iArr72 = iArr4;
                            i21 = 0;
                            while (i21 < i20) {
                            }
                            i18++;
                            zzk = zzezVar2;
                            i30 = i19;
                            iArr4 = iArr72;
                        }
                        i30++;
                    }
                } else {
                    z3 = false;
                    z2 = false;
                }
                zze = false;
                i17 = z3;
                i16 = z2;
                i18 = 0;
                while (i18 <= zzf2) {
                }
                i30++;
            }
        }
        zzez zzezVar3 = zzk;
        int[][] iArr8 = iArr4;
        if (!zzfmVar.zze()) {
            return new zzfi(zzezVar3, null, zzfbVar, null, null);
        }
        zzfmVar.zzc();
        zzfa zzl2 = zzl(zzfmVar, false, zzf2, zzl);
        boolean zze6 = zzfmVar.zze();
        boolean[] zArr3 = new boolean[16];
        int i33 = 0;
        for (int i34 = 0; i34 < 16; i34++) {
            boolean zze7 = zzfmVar.zze();
            zArr3[i34] = zze7;
            if (zze7) {
                i33++;
            }
        }
        if (i33 == 0 || !zArr3[1]) {
            return new zzfi(zzezVar3, null, zzfbVar, null, null);
        }
        int i35 = i33 + 1;
        int[] iArr9 = new int[i33];
        for (int i36 = 0; i36 < i33 - (zze6 ? 1 : 0); i36++) {
            iArr9[i36] = zzfmVar.zzf(3);
        }
        int[] iArr10 = new int[i35];
        if (zze6) {
            for (int i37 = 1; i37 < i33; i37++) {
                for (int i38 = 0; i38 < i37; i38++) {
                    iArr10[i37] = iArr10[i37] + iArr9[i38] + 1;
                }
            }
            iArr10[i33] = 6;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i22, i33);
        int[] iArr12 = new int[i22];
        iArr12[0] = 0;
        boolean zze8 = zzfmVar.zze();
        int i39 = 1;
        while (i39 < i22) {
            if (zze8) {
                iArr12[i39] = zzfmVar.zzf(i25);
            } else {
                iArr12[i39] = i39;
            }
            if (zze6) {
                i15 = i39;
                for (int i40 = 0; i40 < i33; i40++) {
                    iArr11[i15][i40] = (iArr12[i15] & ((1 << iArr10[r32]) - 1)) >> iArr10[i40];
                }
            } else {
                int i41 = 0;
                while (i41 < i33) {
                    iArr11[i39][i41] = zzfmVar.zzf(iArr9[i41] + 1);
                    i41++;
                    i39 = i39;
                }
                i15 = i39;
            }
            i39 = i15 + 1;
            i25 = 6;
        }
        int[] iArr13 = new int[i27];
        int i42 = 1;
        int i43 = 0;
        while (i43 < i22) {
            iArr13[iArr12[i43]] = -1;
            int[] iArr14 = iArr13;
            int i44 = 0;
            int i45 = 0;
            while (i44 < 16) {
                if (zArr3[i44]) {
                    i14 = i26;
                    if (i44 == i14) {
                        iArr14[iArr12[i43]] = iArr11[i43][i45];
                        i44 = i14;
                    }
                    i45++;
                } else {
                    i14 = i26;
                }
                i44 += i14;
                i26 = i14;
            }
            if (i43 > 0) {
                int i46 = 0;
                while (true) {
                    if (i46 >= i43) {
                        i42++;
                        break;
                    }
                    int i47 = i46;
                    if (iArr14[iArr12[i43]] == iArr14[iArr12[i46]]) {
                        break;
                    }
                    i46 = i47 + 1;
                }
            }
            i43++;
            iArr13 = iArr14;
            i26 = 1;
        }
        int[] iArr15 = iArr13;
        int zzf4 = zzfmVar.zzf(4);
        if (i42 < 2 || zzf4 == 0) {
            return new zzfi(zzezVar3, null, zzfbVar, null, null);
        }
        int[] iArr16 = new int[i42];
        for (int i48 = 0; i48 < i42; i48++) {
            iArr16[i48] = zzfmVar.zzf(zzf4);
        }
        int[] iArr17 = new int[i27];
        for (int i49 = 0; i49 < i22; i49++) {
            iArr17[Math.min(iArr12[i49], zzf3)] = i49;
        }
        zzgjw zzgjwVar = new zzgjw();
        int i50 = 0;
        while (i50 <= zzf3) {
            int[] iArr18 = iArr16;
            int i51 = i42;
            int min = Math.min(iArr15[i50], i51 - 1);
            int[] iArr19 = iArr17;
            zzgjwVar.zzf(new zzey(iArr19[i50], min >= 0 ? iArr18[min] : -1));
            i50++;
            i42 = i51;
            iArr16 = iArr18;
            iArr17 = iArr19;
        }
        zzgjz zzi = zzgjwVar.zzi();
        if (((zzey) zzi.get(0)).zzb == -1) {
            return new zzfi(zzezVar3, null, zzfbVar, null, null);
        }
        zzfb zzfbVar2 = zzfbVar;
        int i52 = 1;
        while (true) {
            zzez zzezVar4 = zzezVar3;
            if (i52 > zzf3) {
                zzezVar3 = zzezVar4;
                i3 = -1;
                i52 = -1;
                break;
            }
            zzezVar3 = zzezVar4;
            i3 = -1;
            if (((zzey) zzi.get(i52)).zzb != -1) {
                break;
            }
            i52++;
        }
        if (i52 == i3) {
            return new zzfi(zzezVar3, null, zzfbVar2, null, null);
        }
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i22, i22);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, i22, i22);
        int i53 = 1;
        while (i53 < i22) {
            boolean[][] zArr6 = zArr5;
            for (int i54 = 0; i54 < i53; i54++) {
                boolean[] zArr7 = zArr4[i53];
                boolean[] zArr8 = zArr6[i53];
                boolean zze9 = zzfmVar.zze();
                zArr8[i54] = zze9;
                zArr7[i54] = zze9;
            }
            i53++;
            zArr5 = zArr6;
        }
        boolean[][] zArr9 = zArr5;
        for (int i55 = 1; i55 < i22; i55++) {
            int i56 = 0;
            while (i56 < zzf) {
                zzfb zzfbVar3 = zzfbVar2;
                int i57 = 0;
                while (true) {
                    if (i57 < i55) {
                        boolean[] zArr10 = zArr9[i55];
                        if (zArr10[i57] && zArr9[i57][i56]) {
                            zArr10[i56] = true;
                            break;
                        }
                        i57++;
                    }
                }
                i56++;
                zzfbVar2 = zzfbVar3;
            }
        }
        zzfb zzfbVar4 = zzfbVar2;
        int[] iArr20 = new int[i27];
        for (int i58 = 0; i58 < i22; i58++) {
            int i59 = 0;
            for (int i60 = 0; i60 < i58; i60++) {
                i59 += zArr4[i58][i60] ? 1 : 0;
            }
            iArr20[iArr12[i58]] = i59;
        }
        int i61 = 0;
        for (int i62 = 0; i62 < i22; i62++) {
            if (iArr20[iArr12[i62]] == 0) {
                i61++;
            }
        }
        if (i61 > 1) {
            return new zzfi(zzezVar3, null, zzfbVar4, null, null);
        }
        zzfb zzfbVar5 = zzfbVar4;
        int[] iArr21 = new int[i22];
        int[] iArr22 = new int[zzg2];
        if (zzfmVar.zze()) {
            iArr = iArr22;
            int i63 = 0;
            while (i63 < i22) {
                int i64 = i63;
                iArr21[i64] = zzfmVar.zzf(3);
                i63 = i64 + 1;
            }
        } else {
            iArr = iArr22;
            Arrays.fill(iArr21, 0, i22, zzf2);
        }
        int i65 = 0;
        while (i65 < zzg2) {
            int i66 = i65;
            zzfb zzfbVar6 = zzfbVar5;
            int[] iArr23 = iArr12;
            int i67 = 0;
            for (int i68 = 0; i68 < iArr5[i66]; i68++) {
                i67 = Math.max(i67, iArr21[((zzey) zzi.get(iArr8[i66][i68])).zza]);
            }
            iArr[i66] = i67 + 1;
            i65 = i66 + 1;
            zzfbVar5 = zzfbVar6;
            iArr12 = iArr23;
        }
        zzfb zzfbVar7 = zzfbVar5;
        int[] iArr24 = iArr12;
        if (zzfmVar.zze()) {
            int i69 = 0;
            while (i69 < zzf) {
                int i70 = i69 + 1;
                for (int i71 = i70; i71 < i22; i71++) {
                    if (zArr4[i71][i69]) {
                        zzfmVar.zzb(3);
                    }
                }
                i69 = i70;
            }
        }
        zzfmVar.zza();
        int zzg4 = zzfmVar.zzg() + 1;
        zzgjw zzgjwVar2 = new zzgjw();
        zzgjwVar2.zzf(zzl);
        if (zzg4 > 1) {
            zzgjwVar2.zzf(zzl2);
            for (int i72 = 2; i72 < zzg4; i72++) {
                zzl2 = zzl(zzfmVar, zzfmVar.zze(), zzf2, zzl2);
                zzgjwVar2.zzf(zzl2);
            }
        }
        zzgjz zzi2 = zzgjwVar2.zzi();
        int zzg5 = zzfmVar.zzg() + zzg2;
        if (zzg5 > zzg2) {
            return new zzfi(zzezVar3, null, zzfbVar7, null, null);
        }
        int zzf5 = zzfmVar.zzf(2);
        int i73 = 0;
        boolean[][] zArr11 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, zzg5, i27);
        int[] iArr25 = new int[zzg5];
        int[] iArr26 = new int[zzg5];
        int i74 = 0;
        while (i73 < zzg2) {
            iArr25[i73] = i74;
            boolean[][] zArr12 = zArr11;
            int i75 = iArr6[i73];
            iArr26[i73] = i75;
            if (zzf5 == 0) {
                i13 = i73;
                iArr2 = iArr5;
                iArr3 = iArr25;
                Arrays.fill(zArr12[i73], i74, iArr5[i13], true);
                iArr3[i13] = iArr2[i13];
            } else {
                i13 = i73;
                iArr2 = iArr5;
                iArr3 = iArr25;
                if (zzf5 == 1) {
                    for (int i76 = 0; i76 < iArr2[i13]; i76++) {
                        zArr12[i13][i76] = iArr8[i13][i76] == i75;
                    }
                    iArr3[i13] = 1;
                } else {
                    i74 = 0;
                    zArr12[0][0] = true;
                    iArr3[0] = 1;
                    i73 = i13 + 1;
                    zArr11 = zArr12;
                    iArr5 = iArr2;
                    iArr25 = iArr3;
                }
            }
            i74 = 0;
            i73 = i13 + 1;
            zArr11 = zArr12;
            iArr5 = iArr2;
            iArr25 = iArr3;
        }
        boolean[][] zArr13 = zArr11;
        int[] iArr27 = iArr5;
        int[] iArr28 = iArr25;
        int[] iArr29 = new int[i27];
        int i77 = 2;
        int[] iArr30 = new int[2];
        iArr30[1] = i27;
        iArr30[i74] = zzg5;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, iArr30);
        int i78 = 1;
        int i79 = 0;
        while (i78 < zzg5) {
            int i80 = zzf5;
            if (zzf5 == i77) {
                for (int i81 = 0; i81 < iArr27[i78]; i81++) {
                    zArr13[i78][i81] = zzfmVar.zze();
                    int i82 = iArr28[i78];
                    boolean z6 = zArr13[i78][i81];
                    iArr28[i78] = i82 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr26[i78] = iArr8[i78][i81];
                    }
                }
            }
            if (i79 == 0) {
                i9 = 0;
                if (iArr8[i78][0] == 0 && zArr13[i78][0]) {
                    int i83 = 0;
                    for (int i84 = 1; i84 < iArr27[i78]; i84++) {
                        if (iArr8[i78][i84] == i52 && zArr13[i78][i52]) {
                            i83 = i78;
                        }
                    }
                    i79 = i83;
                } else {
                    i79 = 0;
                }
            } else {
                i9 = 0;
            }
            int i85 = i9;
            while (i85 < iArr27[i78]) {
                if (zzg4 > 1) {
                    zArr14[i78][i85] = zArr13[i78][i85];
                    i12 = i52;
                    i10 = zzg4;
                    int zzc2 = zzgmu.zzc(zzg4, RoundingMode.CEILING);
                    if (!zArr14[i78][i85]) {
                        int i86 = ((zzey) zzi.get(iArr8[i78][i85])).zza;
                        int i87 = i9;
                        while (i87 < i85) {
                            i11 = i85;
                            if (zArr9[i86][((zzey) zzi.get(iArr8[i78][i87])).zza]) {
                                zArr14[i78][i11] = true;
                                break;
                            }
                            i87++;
                            i85 = i11;
                        }
                    }
                    i11 = i85;
                    if (zArr14[i78][i11]) {
                        if (i79 <= 0 || i78 != i79) {
                            zzfmVar.zzb(zzc2);
                        } else {
                            iArr29[i11] = zzfmVar.zzf(zzc2);
                        }
                    }
                } else {
                    i10 = zzg4;
                    i11 = i85;
                    i12 = i52;
                }
                i85 = i11 + 1;
                i52 = i12;
                zzg4 = i10;
            }
            int i88 = zzg4;
            int i89 = i52;
            if (iArr28[i78] == 1 && iArr20[iArr26[i78]] > 0) {
                zzfmVar.zza();
            }
            i78++;
            zzf5 = i80;
            i52 = i89;
            zzg4 = i88;
            i77 = 2;
        }
        if (i79 == 0) {
            return new zzfi(zzezVar3, null, zzfbVar7, null, null);
        }
        zzez zzezVar5 = zzezVar3;
        int zzg6 = zzfmVar.zzg();
        int i90 = zzg6 + 1;
        zzgjw zzv = zzgjz.zzv(i90);
        int[] iArr31 = new int[i22];
        int i91 = 0;
        while (i91 < i90) {
            zzgjz zzgjzVar2 = zzi;
            int zzf6 = zzfmVar.zzf(16);
            zzez zzezVar6 = zzezVar5;
            int zzf7 = zzfmVar.zzf(16);
            if (zzfmVar.zze()) {
                zArr = zArr14;
                i5 = zzfmVar.zzf(2);
                if (i5 == 3) {
                    zzfmVar.zza();
                }
                i6 = zzfmVar.zzf(4);
                i7 = zzfmVar.zzf(4);
            } else {
                zArr = zArr14;
                i5 = 0;
                i6 = 0;
                i7 = 0;
            }
            if (zzfmVar.zze()) {
                int zzg7 = zzfmVar.zzg();
                i8 = i91;
                int zzg8 = zzfmVar.zzg();
                zArr2 = zArr4;
                int zzg9 = zzfmVar.zzg();
                zzgjzVar = zzi2;
                int zzg10 = zzfmVar.zzg();
                zzf6 = zzm(zzf6, i5, zzg7, zzg8);
                zzf7 = zzn(zzf7, i5, zzg9, zzg10);
            } else {
                zzgjzVar = zzi2;
                i8 = i91;
                zArr2 = zArr4;
            }
            zzv.zzf(new zzfc(i5, i6, i7, zzf6, zzf7));
            i91 = i8 + 1;
            zzi = zzgjzVar2;
            zzezVar5 = zzezVar6;
            zArr14 = zArr;
            zArr4 = zArr2;
            zzi2 = zzgjzVar;
        }
        zzgjz zzgjzVar3 = zzi;
        zzez zzezVar7 = zzezVar5;
        zzgjz zzgjzVar4 = zzi2;
        boolean[][] zArr15 = zArr14;
        boolean[][] zArr16 = zArr4;
        if (i90 <= 1 || !zzfmVar.zze()) {
            for (int i92 = 1; i92 < i22; i92++) {
                iArr31[i92] = Math.min(i92, zzg6);
            }
        } else {
            int zzc3 = zzgmu.zzc(i90, RoundingMode.CEILING);
            for (int i93 = 1; i93 < i22; i93++) {
                iArr31[i93] = zzfmVar.zzf(zzc3);
            }
        }
        zzfd zzfdVar = new zzfd(zzv.zzi(), iArr31);
        zzfmVar.zzb(2);
        for (int i94 = 1; i94 < i22; i94++) {
            if (iArr20[iArr24[i94]] == 0) {
                zzfmVar.zza();
            }
        }
        for (int i95 = 1; i95 < zzg5; i95++) {
            boolean zze10 = zzfmVar.zze();
            int i96 = 0;
            while (i96 < iArr[i95]) {
                if ((i96 <= 0 || !zze10) ? i96 == 0 : zzfmVar.zze()) {
                    for (int i97 = 0; i97 < iArr27[i95]; i97++) {
                        if (zArr15[i95][i97]) {
                            zzfmVar.zzg();
                        }
                    }
                    zzfmVar.zzg();
                    zzfmVar.zzg();
                }
                i96++;
            }
        }
        int zzg11 = zzfmVar.zzg() + 2;
        if (zzfmVar.zze()) {
            zzfmVar.zzb(zzg11);
        } else {
            for (int i98 = 1; i98 < i22; i98++) {
                for (int i99 = 0; i99 < i98; i99++) {
                    if (zArr16[i98][i99]) {
                        zzfmVar.zzb(zzg11);
                    }
                }
            }
        }
        int zzg12 = zzfmVar.zzg();
        for (int i100 = 1; i100 <= zzg12; i100++) {
            zzfmVar.zzb(8);
        }
        if (zzfmVar.zze()) {
            zzfmVar.zzc();
            if (zzfmVar.zze() || zzfmVar.zze()) {
                zzfmVar.zza();
            }
            boolean zze11 = zzfmVar.zze();
            boolean zze12 = zzfmVar.zze();
            if (zze11 || zze12) {
                for (int i101 = 0; i101 < zzg2; i101++) {
                    for (int i102 = 0; i102 < iArr[i101]; i102++) {
                        boolean zze13 = zze11 ? zzfmVar.zze() : false;
                        boolean zze14 = zze12 ? zzfmVar.zze() : false;
                        if (zze13) {
                            zzfmVar.zzb(32);
                        }
                        if (zze14) {
                            zzfmVar.zzb(18);
                        }
                    }
                }
            }
            boolean zze15 = zzfmVar.zze();
            if (zze15) {
                z = true;
                i4 = zzfmVar.zzf(4) + 1;
            } else {
                z = true;
                i4 = i22;
            }
            zzgjw zzv2 = zzgjz.zzv(i4);
            int[] iArr32 = new int[i22];
            int i103 = 0;
            while (i103 < i4) {
                zzfmVar.zzb(3);
                int i104 = z != zzfmVar.zze() ? 2 : 1;
                int zzb2 = zzh.zzb(zzfmVar.zzf(8));
                int zzc4 = zzh.zzc(zzfmVar.zzf(8));
                zzfmVar.zzb(8);
                zzv2.zzf(new zzfg(zzb2, i104, zzc4));
                i103++;
                z = true;
            }
            if (zze15 && i4 > 1) {
                for (int i105 = 0; i105 < i22; i105++) {
                    iArr32[i105] = zzfmVar.zzf(4);
                }
            }
            zzfhVar = new zzfh(zzv2.zzi(), iArr32);
        } else {
            zzfhVar = null;
        }
        return new zzfi(zzezVar7, zzgjzVar3, new zzfb(zzgjzVar4, iArr29), zzfdVar, zzfhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzff zzf(byte[] bArr, int i, int i2, zzfi zzfiVar) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int zzg;
        int i7;
        int i8;
        int i9;
        int i10;
        int zzg2;
        int i11;
        int i12;
        int i13;
        int i14;
        int zzg3;
        int i15;
        float f;
        zzfa zzfaVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        zzfh zzfhVar;
        int i26;
        int i27;
        zzez zzezVar;
        int i28;
        int i29;
        int i30;
        zzfd zzfdVar;
        zzez zzk = zzk(new zzfm(bArr, i, i2));
        zzfm zzfmVar = new zzfm(bArr, i + 2, i2);
        zzfmVar.zzb(4);
        int zzf = zzfmVar.zzf(3);
        int i31 = zzk.zzb;
        if (i31 == 0 || zzf != 7) {
            z = false;
        } else {
            zzf = 7;
            z = true;
        }
        if (zzfiVar != null) {
            zzgjz zzgjzVar = zzfiVar.zza;
            if (!zzgjzVar.isEmpty()) {
                i3 = ((zzey) zzgjzVar.get(Math.min(i31, zzgjzVar.size() - 1))).zza;
                zzfa zzfaVar2 = null;
                if (z) {
                    zzfmVar.zza();
                    zzfaVar2 = zzl(zzfmVar, true, zzf, null);
                } else if (zzfiVar != null) {
                    zzfb zzfbVar = zzfiVar.zzb;
                    int i32 = zzfbVar.zzb[i3];
                    zzgjz zzgjzVar2 = zzfbVar.zza;
                    if (zzgjzVar2.size() > i32) {
                        zzfaVar2 = (zzfa) zzgjzVar2.get(i32);
                    }
                }
                int zzg4 = zzfmVar.zzg();
                if (z) {
                    int zzg5 = zzfmVar.zzg();
                    if (zzg5 == 3) {
                        zzfmVar.zza();
                        i4 = 3;
                    } else {
                        i4 = zzg5;
                    }
                    int zzg6 = zzfmVar.zzg();
                    int zzg7 = zzfmVar.zzg();
                    if (zzfmVar.zze()) {
                        int zzg8 = zzfmVar.zzg();
                        int zzg9 = zzfmVar.zzg();
                        int zzg10 = zzfmVar.zzg();
                        int zzg11 = zzfmVar.zzg();
                        i6 = zzm(zzg6, i4, zzg8, zzg9);
                        i5 = zzn(zzg7, i4, zzg10, zzg11);
                    } else {
                        i5 = zzg7;
                        i6 = zzg6;
                    }
                    zzg = zzfmVar.zzg();
                    i7 = i5;
                    i8 = zzg7;
                    i9 = i6;
                    i10 = zzg6;
                    zzg2 = zzfmVar.zzg();
                    i11 = zzg5;
                } else {
                    int zzf2 = zzfmVar.zze() ? zzfmVar.zzf(8) : -1;
                    if (zzfiVar != null && (zzfdVar = zzfiVar.zzc) != null) {
                        if (zzf2 == -1) {
                            zzf2 = zzfdVar.zzb[i3];
                        }
                        if (zzf2 != -1) {
                            zzgjz zzgjzVar3 = zzfdVar.zza;
                            if (zzgjzVar3.size() > zzf2) {
                                zzfc zzfcVar = (zzfc) zzgjzVar3.get(zzf2);
                                int i33 = zzfcVar.zza;
                                i9 = zzfcVar.zzd;
                                i7 = zzfcVar.zze;
                                zzg = zzfcVar.zzb;
                                zzg2 = zzfcVar.zzc;
                                i11 = i33;
                                i8 = i7;
                                i10 = i9;
                            }
                        }
                    }
                    i8 = 0;
                    i10 = 0;
                    zzg = 0;
                    i11 = 0;
                    zzg2 = 0;
                    i7 = 0;
                    i9 = 0;
                }
                int zzg12 = zzfmVar.zzg();
                if (z) {
                    i12 = i8;
                    i13 = i10;
                    i14 = -1;
                    for (int i34 = true != zzfmVar.zze() ? zzf : 0; i34 <= zzf; i34++) {
                        zzfmVar.zzg();
                        i14 = Math.max(zzfmVar.zzg(), i14);
                        zzfmVar.zzg();
                    }
                } else {
                    i12 = i8;
                    i13 = i10;
                    i14 = -1;
                }
                zzfmVar.zzg();
                zzfmVar.zzg();
                zzfmVar.zzg();
                zzfmVar.zzg();
                zzfmVar.zzg();
                zzfmVar.zzg();
                if (zzfmVar.zze()) {
                    if (z && zzfmVar.zze()) {
                        zzfmVar.zzb(6);
                    } else if (zzfmVar.zze()) {
                        int i35 = 4;
                        int i36 = 0;
                        while (i36 < i35) {
                            int i37 = i35;
                            int i38 = i14;
                            for (int i39 = 0; i39 < 6; i39 = i30 + (i36 == 3 ? 3 : 1)) {
                                if (zzfmVar.zze()) {
                                    i30 = i39;
                                    int min = Math.min(64, 1 << ((i36 + i36) + 4));
                                    if (i36 > 1) {
                                        zzfmVar.zzh();
                                    }
                                    for (int i40 = 0; i40 < min; i40++) {
                                        zzfmVar.zzh();
                                    }
                                } else {
                                    zzfmVar.zzg();
                                    i30 = i39;
                                }
                            }
                            i36++;
                            i14 = i38;
                            i35 = i37;
                        }
                    }
                }
                int i41 = i14;
                zzfmVar.zzb(2);
                if (zzfmVar.zze()) {
                    zzfmVar.zzb(8);
                    zzfmVar.zzg();
                    zzfmVar.zzg();
                    zzfmVar.zza();
                }
                zzg3 = zzfmVar.zzg();
                i15 = 0;
                int[] iArr = new int[0];
                int i42 = zzf;
                int[] iArr2 = new int[0];
                int i43 = zzg;
                int i44 = -1;
                int i45 = -1;
                while (i15 < zzg3) {
                    if (i15 == 0 || !zzfmVar.zze()) {
                        i26 = zzg3;
                        i27 = i15;
                        zzezVar = zzk;
                        i28 = i3;
                        int zzg13 = zzfmVar.zzg();
                        int zzg14 = zzfmVar.zzg();
                        int[] iArr3 = new int[zzg13];
                        int i46 = 0;
                        while (i46 < zzg13) {
                            iArr3[i46] = (i46 > 0 ? iArr3[i46 - 1] : 0) - (zzfmVar.zzg() + 1);
                            zzfmVar.zza();
                            i46++;
                        }
                        int[] iArr4 = new int[zzg14];
                        int i47 = 0;
                        while (i47 < zzg14) {
                            iArr4[i47] = (i47 > 0 ? iArr4[i47 - 1] : 0) + zzfmVar.zzg() + 1;
                            zzfmVar.zza();
                            i47++;
                        }
                        iArr = iArr3;
                        iArr2 = iArr4;
                        i44 = zzg13;
                        i45 = zzg14;
                    } else {
                        i26 = zzg3;
                        int i48 = i44 + i45;
                        boolean zze = zzfmVar.zze();
                        boolean z2 = true;
                        int zzg15 = zzfmVar.zzg() + 1;
                        int i49 = 1 - ((zze ? 1 : 0) + (zze ? 1 : 0));
                        i27 = i15;
                        int i50 = i48 + 1;
                        zzezVar = zzk;
                        boolean[] zArr = new boolean[i50];
                        int i51 = 0;
                        while (i51 <= i48) {
                            if (zzfmVar.zze()) {
                                zArr[i51] = z2;
                            } else {
                                zArr[i51] = zzfmVar.zze();
                            }
                            i51++;
                            z2 = true;
                        }
                        int i52 = i45 - 1;
                        int[] iArr5 = new int[i50];
                        int[] iArr6 = new int[i50];
                        int i53 = 0;
                        while (true) {
                            i29 = i49 * zzg15;
                            if (i52 < 0) {
                                break;
                            }
                            int i54 = iArr2[i52] + i29;
                            if (i54 < 0 && zArr[i44 + i52]) {
                                iArr5[i53] = i54;
                                i53++;
                            }
                            i52--;
                        }
                        if (i29 < 0 && zArr[i48]) {
                            iArr5[i53] = i29;
                            i53++;
                        }
                        i28 = i3;
                        int i55 = i53;
                        for (int i56 = 0; i56 < i44; i56++) {
                            int i57 = iArr[i56] + i29;
                            if (i57 < 0 && zArr[i56]) {
                                iArr5[i55] = i57;
                                i55++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr5, i55);
                        int i58 = 0;
                        for (int i59 = i44 - 1; i59 >= 0; i59--) {
                            int i60 = iArr[i59] + i29;
                            if (i60 > 0 && zArr[i59]) {
                                iArr6[i58] = i60;
                                i58++;
                            }
                        }
                        if (i29 > 0 && zArr[i48]) {
                            iArr6[i58] = i29;
                            i58++;
                        }
                        int i61 = i58;
                        for (int i62 = 0; i62 < i45; i62++) {
                            int i63 = iArr2[i62] + i29;
                            if (i63 > 0 && zArr[i44 + i62]) {
                                iArr6[i61] = i63;
                                i61++;
                            }
                        }
                        iArr = copyOf;
                        iArr2 = Arrays.copyOf(iArr6, i61);
                        i44 = i55;
                        i45 = i61;
                    }
                    i15 = i27 + 1;
                    zzg3 = i26;
                    i3 = i28;
                    zzk = zzezVar;
                }
                zzez zzezVar2 = zzk;
                int i64 = i3;
                if (zzfmVar.zze()) {
                    int zzg16 = zzfmVar.zzg();
                    for (int i65 = 0; i65 < zzg16; i65++) {
                        zzfmVar.zzb(zzg12 + 5);
                    }
                }
                zzfmVar.zzb(2);
                float f2 = 1.0f;
                if (zzfmVar.zze()) {
                    f = 1.0f;
                    zzfaVar = zzfaVar2;
                    i16 = zzg4;
                    i17 = i9;
                    i18 = i12;
                    i19 = i13;
                    i20 = -1;
                    i21 = -1;
                    i22 = -1;
                } else {
                    if (zzfmVar.zze()) {
                        int zzf3 = zzfmVar.zzf(8);
                        if (zzf3 == 255) {
                            int zzf4 = zzfmVar.zzf(16);
                            int zzf5 = zzfmVar.zzf(16);
                            if (zzf4 != 0 && zzf5 != 0) {
                                f2 = zzf4 / zzf5;
                            }
                        } else if (zzf3 < 17) {
                            f2 = zzb[zzf3];
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(zzf3).length() + 35);
                            sb.append("Unexpected aspect_ratio_idc value: ");
                            sb.append(zzf3);
                            zzds.zzc("NalUnitUtil", sb.toString());
                        }
                    }
                    if (zzfmVar.zze()) {
                        zzfmVar.zza();
                    }
                    if (zzfmVar.zze()) {
                        zzfmVar.zzb(3);
                        i25 = true != zzfmVar.zze() ? 2 : 1;
                        if (zzfmVar.zze()) {
                            int zzf6 = zzfmVar.zzf(8);
                            int zzf7 = zzfmVar.zzf(8);
                            zzfmVar.zzb(8);
                            i23 = zzh.zzb(zzf6);
                            i24 = zzh.zzc(zzf7);
                        } else {
                            i23 = -1;
                            i24 = -1;
                        }
                    } else {
                        if (zzfiVar != null && (zzfhVar = zzfiVar.zzd) != null) {
                            int i66 = zzfhVar.zzb[i64];
                            zzgjz zzgjzVar4 = zzfhVar.zza;
                            if (zzgjzVar4.size() > i66) {
                                zzfg zzfgVar = (zzfg) zzgjzVar4.get(i66);
                                int i67 = zzfgVar.zza;
                                int i68 = zzfgVar.zzb;
                                i24 = zzfgVar.zzc;
                                i23 = i67;
                                i25 = i68;
                            }
                        }
                        i23 = -1;
                        i24 = -1;
                        i25 = -1;
                    }
                    if (zzfmVar.zze()) {
                        zzfmVar.zzg();
                        zzfmVar.zzg();
                    }
                    zzfmVar.zza();
                    if (zzfmVar.zze()) {
                        i7 += i7;
                    }
                    i20 = i23;
                    f = f2;
                    zzfaVar = zzfaVar2;
                    i16 = zzg4;
                    i17 = i9;
                    i18 = i12;
                    i19 = i13;
                    i22 = i24;
                    i21 = i25;
                }
                return new zzff(zzezVar2, i42, zzfaVar, i11, i43, zzg2, i16, i17, i7, i19, i18, f, i41, i20, i21, i22);
            }
        }
        i3 = 0;
        zzfa zzfaVar22 = null;
        if (z) {
        }
        int zzg42 = zzfmVar.zzg();
        if (z) {
        }
        int zzg122 = zzfmVar.zzg();
        if (z) {
        }
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        zzfmVar.zzg();
        if (zzfmVar.zze()) {
        }
        int i412 = i14;
        zzfmVar.zzb(2);
        if (zzfmVar.zze()) {
        }
        zzg3 = zzfmVar.zzg();
        i15 = 0;
        int[] iArr7 = new int[0];
        int i422 = zzf;
        int[] iArr22 = new int[0];
        int i432 = zzg;
        int i442 = -1;
        int i452 = -1;
        while (i15 < zzg3) {
        }
        zzez zzezVar22 = zzk;
        int i642 = i3;
        if (zzfmVar.zze()) {
        }
        zzfmVar.zzb(2);
        float f22 = 1.0f;
        if (zzfmVar.zze()) {
        }
        return new zzff(zzezVar22, i422, zzfaVar, i11, i432, zzg2, i16, i17, i7, i19, i18, f, i412, i20, i21, i22);
    }

    public static zzfj zzg(byte[] bArr, int i, int i2) {
        zzfm zzfmVar = new zzfm(bArr, 4, i2);
        int zzg = zzfmVar.zzg();
        int zzg2 = zzfmVar.zzg();
        zzfmVar.zza();
        return new zzfj(zzg, zzg2, zzfmVar.zze());
    }

    public static int zzh(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        zzghc.zzh(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            zzi(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            zzi(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            zzi(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    zzi(zArr);
                    return i6;
                }
                i5 = i6;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static void zzi(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static String zzj(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = zzgjz.zzd;
                zzgjw zzgjwVar = new zzgjw();
                int i3 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int zzh = zzh(bArr, i3, length2, zArr);
                    if (zzh != length2) {
                        zzgjwVar.zzf(Integer.valueOf(zzh));
                    }
                    i3 = zzh + 3;
                }
                zzgjz zzi = zzgjwVar.zzi();
                for (int i4 = 0; i4 < zzi.size(); i4++) {
                    if (((Integer) zzi.get(i4)).intValue() + 3 < length) {
                        zzfm zzfmVar = new zzfm(bArr, ((Integer) zzi.get(i4)).intValue() + 3, length);
                        zzez zzk = zzk(zzfmVar);
                        if (zzk.zza == 33 && zzk.zzb == 0) {
                            zzfmVar.zzb(4);
                            int zzf = zzfmVar.zzf(3);
                            zzfmVar.zza();
                            zzfa zzl = zzl(zzfmVar, true, zzf, null);
                            return zzdc.zzc(zzl.zza, zzl.zzb, zzl.zzc, zzl.zzd, zzl.zze, zzl.zzf);
                        }
                    }
                }
            }
        }
        return null;
    }

    private static zzez zzk(zzfm zzfmVar) {
        zzfmVar.zza();
        return new zzez(zzfmVar.zzf(6), zzfmVar.zzf(6), zzfmVar.zzf(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzfa zzl(zzfm zzfmVar, boolean z, int i, zzfa zzfaVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int zzf = zzfmVar.zzf(2);
            z3 = zzfmVar.zze();
            i5 = zzfmVar.zzf(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (zzfmVar.zze()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = zzfmVar.zzf(8);
            }
            i2 = zzf;
        } else {
            if (zzfaVar == null) {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
                int zzf2 = zzfmVar.zzf(8);
                int i9 = 0;
                for (int i10 = 0; i10 < i; i10++) {
                    if (zzfmVar.zze()) {
                        i9 += 88;
                    }
                    if (zzfmVar.zze()) {
                        i9 += 8;
                    }
                }
                zzfmVar.zzb(i9);
                if (i > 0) {
                    int i11 = 8 - i;
                    zzfmVar.zzb(i11 + i11);
                }
                return new zzfa(i2, z2, i3, i4, iArr, zzf2);
            }
            int i12 = zzfaVar.zza;
            z3 = zzfaVar.zzb;
            i5 = zzfaVar.zzc;
            i6 = zzfaVar.zzd;
            iArr2 = zzfaVar.zze;
            i2 = i12;
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int zzf22 = zzfmVar.zzf(8);
        int i92 = 0;
        while (i10 < i) {
        }
        zzfmVar.zzb(i92);
        if (i > 0) {
        }
        return new zzfa(i2, z2, i3, i4, iArr, zzf22);
    }

    private static int zzm(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    private static int zzn(int i, int i2, int i3, int i4) {
        return i - ((i2 == 1 ? 2 : 1) * (i3 + i4));
    }

    private static void zzo(zzfm zzfmVar) {
        int zzg = zzfmVar.zzg() + 1;
        zzfmVar.zzb(8);
        for (int i = 0; i < zzg; i++) {
            zzfmVar.zzg();
            zzfmVar.zzg();
            zzfmVar.zza();
        }
        zzfmVar.zzb(20);
    }

    public static int zza(byte[] bArr, int i) {
        int i2;
        synchronized (zzc) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 >= i - 2) {
                            i3 = i;
                            break;
                        }
                        int i5 = i3 + 1;
                        if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3 = i5;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = zzd;
                    int length = iArr.length;
                    if (length <= i4) {
                        zzd = Arrays.copyOf(iArr, length + length);
                    }
                    zzd[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = zzd[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }
}
