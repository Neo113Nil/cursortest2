package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzy {
    public final List zza;
    public final int zzb;
    public final float zzc;
    public final String zzd;

    private zzzy(List list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
        this.zzd = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x0377 A[Catch: ArrayIndexOutOfBoundsException -> 0x040d, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040d, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0045, B:16:0x0052, B:19:0x006f, B:22:0x0098, B:24:0x009e, B:26:0x00a3, B:29:0x00a6, B:32:0x00ae, B:34:0x00b7, B:36:0x00bf, B:38:0x00c5, B:39:0x00c7, B:41:0x00cd, B:43:0x00cf, B:46:0x00d2, B:48:0x00d7, B:49:0x00dd, B:51:0x00e7, B:52:0x00eb, B:54:0x00f9, B:62:0x0122, B:63:0x0130, B:68:0x0146, B:70:0x0152, B:72:0x016a, B:80:0x0178, B:82:0x017e, B:87:0x01ad, B:90:0x0187, B:92:0x019c, B:95:0x01a2, B:98:0x01b3, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01ec, B:108:0x01f2, B:110:0x0215, B:112:0x021b, B:114:0x0226, B:115:0x0222, B:118:0x0229, B:120:0x0233, B:122:0x0239, B:124:0x023f, B:126:0x0245, B:131:0x024a, B:133:0x024e, B:136:0x025b, B:138:0x0261, B:140:0x0265, B:142:0x026b, B:146:0x026e, B:148:0x0278, B:150:0x027e, B:152:0x0282, B:154:0x0288, B:159:0x028d, B:161:0x0291, B:164:0x029c, B:166:0x02a2, B:168:0x02a8, B:170:0x02ae, B:174:0x02b1, B:176:0x02f6, B:177:0x02ba, B:179:0x02d1, B:181:0x02df, B:183:0x02e4, B:188:0x0306, B:191:0x0315, B:193:0x031b, B:195:0x0324, B:197:0x032e, B:199:0x0334, B:201:0x033e, B:204:0x034c, B:205:0x0371, B:207:0x0377, B:208:0x037a, B:210:0x0380, B:212:0x038a, B:213:0x038f, B:215:0x0395, B:216:0x039b, B:218:0x03a4, B:219:0x03a9, B:221:0x03c5, B:224:0x0354, B:225:0x0359, B:236:0x03e0, B:240:0x03f9, B:241:0x0402, B:245:0x03fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0380 A[Catch: ArrayIndexOutOfBoundsException -> 0x040d, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040d, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0045, B:16:0x0052, B:19:0x006f, B:22:0x0098, B:24:0x009e, B:26:0x00a3, B:29:0x00a6, B:32:0x00ae, B:34:0x00b7, B:36:0x00bf, B:38:0x00c5, B:39:0x00c7, B:41:0x00cd, B:43:0x00cf, B:46:0x00d2, B:48:0x00d7, B:49:0x00dd, B:51:0x00e7, B:52:0x00eb, B:54:0x00f9, B:62:0x0122, B:63:0x0130, B:68:0x0146, B:70:0x0152, B:72:0x016a, B:80:0x0178, B:82:0x017e, B:87:0x01ad, B:90:0x0187, B:92:0x019c, B:95:0x01a2, B:98:0x01b3, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01ec, B:108:0x01f2, B:110:0x0215, B:112:0x021b, B:114:0x0226, B:115:0x0222, B:118:0x0229, B:120:0x0233, B:122:0x0239, B:124:0x023f, B:126:0x0245, B:131:0x024a, B:133:0x024e, B:136:0x025b, B:138:0x0261, B:140:0x0265, B:142:0x026b, B:146:0x026e, B:148:0x0278, B:150:0x027e, B:152:0x0282, B:154:0x0288, B:159:0x028d, B:161:0x0291, B:164:0x029c, B:166:0x02a2, B:168:0x02a8, B:170:0x02ae, B:174:0x02b1, B:176:0x02f6, B:177:0x02ba, B:179:0x02d1, B:181:0x02df, B:183:0x02e4, B:188:0x0306, B:191:0x0315, B:193:0x031b, B:195:0x0324, B:197:0x032e, B:199:0x0334, B:201:0x033e, B:204:0x034c, B:205:0x0371, B:207:0x0377, B:208:0x037a, B:210:0x0380, B:212:0x038a, B:213:0x038f, B:215:0x0395, B:216:0x039b, B:218:0x03a4, B:219:0x03a9, B:221:0x03c5, B:224:0x0354, B:225:0x0359, B:236:0x03e0, B:240:0x03f9, B:241:0x0402, B:245:0x03fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0395 A[Catch: ArrayIndexOutOfBoundsException -> 0x040d, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040d, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0045, B:16:0x0052, B:19:0x006f, B:22:0x0098, B:24:0x009e, B:26:0x00a3, B:29:0x00a6, B:32:0x00ae, B:34:0x00b7, B:36:0x00bf, B:38:0x00c5, B:39:0x00c7, B:41:0x00cd, B:43:0x00cf, B:46:0x00d2, B:48:0x00d7, B:49:0x00dd, B:51:0x00e7, B:52:0x00eb, B:54:0x00f9, B:62:0x0122, B:63:0x0130, B:68:0x0146, B:70:0x0152, B:72:0x016a, B:80:0x0178, B:82:0x017e, B:87:0x01ad, B:90:0x0187, B:92:0x019c, B:95:0x01a2, B:98:0x01b3, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01ec, B:108:0x01f2, B:110:0x0215, B:112:0x021b, B:114:0x0226, B:115:0x0222, B:118:0x0229, B:120:0x0233, B:122:0x0239, B:124:0x023f, B:126:0x0245, B:131:0x024a, B:133:0x024e, B:136:0x025b, B:138:0x0261, B:140:0x0265, B:142:0x026b, B:146:0x026e, B:148:0x0278, B:150:0x027e, B:152:0x0282, B:154:0x0288, B:159:0x028d, B:161:0x0291, B:164:0x029c, B:166:0x02a2, B:168:0x02a8, B:170:0x02ae, B:174:0x02b1, B:176:0x02f6, B:177:0x02ba, B:179:0x02d1, B:181:0x02df, B:183:0x02e4, B:188:0x0306, B:191:0x0315, B:193:0x031b, B:195:0x0324, B:197:0x032e, B:199:0x0334, B:201:0x033e, B:204:0x034c, B:205:0x0371, B:207:0x0377, B:208:0x037a, B:210:0x0380, B:212:0x038a, B:213:0x038f, B:215:0x0395, B:216:0x039b, B:218:0x03a4, B:219:0x03a9, B:221:0x03c5, B:224:0x0354, B:225:0x0359, B:236:0x03e0, B:240:0x03f9, B:241:0x0402, B:245:0x03fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03a4 A[Catch: ArrayIndexOutOfBoundsException -> 0x040d, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x040d, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0045, B:16:0x0052, B:19:0x006f, B:22:0x0098, B:24:0x009e, B:26:0x00a3, B:29:0x00a6, B:32:0x00ae, B:34:0x00b7, B:36:0x00bf, B:38:0x00c5, B:39:0x00c7, B:41:0x00cd, B:43:0x00cf, B:46:0x00d2, B:48:0x00d7, B:49:0x00dd, B:51:0x00e7, B:52:0x00eb, B:54:0x00f9, B:62:0x0122, B:63:0x0130, B:68:0x0146, B:70:0x0152, B:72:0x016a, B:80:0x0178, B:82:0x017e, B:87:0x01ad, B:90:0x0187, B:92:0x019c, B:95:0x01a2, B:98:0x01b3, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01ec, B:108:0x01f2, B:110:0x0215, B:112:0x021b, B:114:0x0226, B:115:0x0222, B:118:0x0229, B:120:0x0233, B:122:0x0239, B:124:0x023f, B:126:0x0245, B:131:0x024a, B:133:0x024e, B:136:0x025b, B:138:0x0261, B:140:0x0265, B:142:0x026b, B:146:0x026e, B:148:0x0278, B:150:0x027e, B:152:0x0282, B:154:0x0288, B:159:0x028d, B:161:0x0291, B:164:0x029c, B:166:0x02a2, B:168:0x02a8, B:170:0x02ae, B:174:0x02b1, B:176:0x02f6, B:177:0x02ba, B:179:0x02d1, B:181:0x02df, B:183:0x02e4, B:188:0x0306, B:191:0x0315, B:193:0x031b, B:195:0x0324, B:197:0x032e, B:199:0x0334, B:201:0x033e, B:204:0x034c, B:205:0x0371, B:207:0x0377, B:208:0x037a, B:210:0x0380, B:212:0x038a, B:213:0x038f, B:215:0x0395, B:216:0x039b, B:218:0x03a4, B:219:0x03a9, B:221:0x03c5, B:224:0x0354, B:225:0x0359, B:236:0x03e0, B:240:0x03f9, B:241:0x0402, B:245:0x03fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzzy zza(zzef zzefVar) throws zzbu {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        byte[] bArr2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            zzefVar.zzG(21);
            int zzk = zzefVar.zzk() & 3;
            int zzk2 = zzefVar.zzk();
            int zzc = zzefVar.zzc();
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < zzk2; i17++) {
                zzefVar.zzG(1);
                int zzo = zzefVar.zzo();
                for (int i18 = 0; i18 < zzo; i18++) {
                    int zzo2 = zzefVar.zzo();
                    i16 += zzo2 + 4;
                    zzefVar.zzG(zzo2);
                }
            }
            zzefVar.zzF(zzc);
            byte[] bArr3 = new byte[i16];
            int i19 = 0;
            String str = null;
            int i20 = -1;
            int i21 = -1;
            float f2 = 1.0f;
            int i22 = 0;
            while (i22 < zzk2) {
                int zzk3 = zzefVar.zzk() & 63;
                int zzo3 = zzefVar.zzo();
                int i23 = i15;
                while (i23 < zzo3) {
                    int zzo4 = zzefVar.zzo();
                    System.arraycopy(zzaaf.zza, i15, bArr3, i19, 4);
                    int i24 = i19 + 4;
                    System.arraycopy(zzefVar.zzH(), zzefVar.zzc(), bArr3, i24, zzo4);
                    if (zzk3 == 33 && i23 == 0) {
                        zzaah zzaahVar = new zzaah(bArr3, i24 + 2, i24 + zzo4);
                        zzaahVar.zze(4);
                        int zza = zzaahVar.zza(3);
                        zzaahVar.zzd();
                        int zza2 = zzaahVar.zza(2);
                        boolean zzf = zzaahVar.zzf();
                        int zza3 = zzaahVar.zza(5);
                        int i25 = 0;
                        for (int i26 = 0; i26 < 32; i26++) {
                            if (zzaahVar.zzf()) {
                                i25 |= 1 << i26;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i27 = 0; i27 < 6; i27++) {
                            iArr[i27] = zzaahVar.zza(8);
                        }
                        int zza4 = zzaahVar.zza(8);
                        int i28 = 0;
                        for (int i29 = 0; i29 < zza; i29++) {
                            if (zzaahVar.zzf()) {
                                i28 += 89;
                            }
                            if (zzaahVar.zzf()) {
                                i28 += 8;
                            }
                        }
                        zzaahVar.zze(i28);
                        if (zza > 0) {
                            int i30 = 8 - zza;
                            zzaahVar.zze(i30 + i30);
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
                            if (zzc2 == 1) {
                                i2 = zzk2;
                                i13 = 1;
                            } else if (zzc2 == 2) {
                                i2 = zzk2;
                                i13 = 1;
                                zzc2 = 2;
                            } else {
                                i2 = zzk2;
                                i13 = 1;
                                i14 = 1;
                                zzc3 -= i14 * (zzc5 + zzc6);
                                zzc4 -= (zzc2 != i13 ? 2 : 1) * (zzc7 + zzc8);
                            }
                            i14 = 2;
                            zzc3 -= i14 * (zzc5 + zzc6);
                            zzc4 -= (zzc2 != i13 ? 2 : 1) * (zzc7 + zzc8);
                        } else {
                            i2 = zzk2;
                        }
                        zzaahVar.zzc();
                        zzaahVar.zzc();
                        int zzc9 = zzaahVar.zzc();
                        for (int i31 = true != zzaahVar.zzf() ? zza : 0; i31 <= zza; i31++) {
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
                            int i32 = 0;
                            while (i32 < 4) {
                                int i33 = 0;
                                while (i33 < 6) {
                                    if (zzaahVar.zzf()) {
                                        i11 = zzc3;
                                        i12 = zzk3;
                                        int min = Math.min(64, 1 << ((i32 + i32) + 4));
                                        if (i32 > 1) {
                                            zzaahVar.zzb();
                                        }
                                        for (int i34 = 0; i34 < min; i34++) {
                                            zzaahVar.zzb();
                                        }
                                    } else {
                                        zzaahVar.zzc();
                                        i11 = zzc3;
                                        i12 = zzk3;
                                    }
                                    i33 += i32 == 3 ? 3 : 1;
                                    zzc3 = i11;
                                    zzk3 = i12;
                                }
                                i32++;
                                zzc3 = zzc3;
                            }
                        }
                        int i35 = zzc3;
                        i5 = zzk3;
                        zzaahVar.zze(2);
                        if (zzaahVar.zzf()) {
                            zzaahVar.zze(8);
                            zzaahVar.zzc();
                            zzaahVar.zzc();
                            zzaahVar.zzd();
                        }
                        int zzc10 = zzaahVar.zzc();
                        int[] iArr2 = new int[0];
                        int[] iArr3 = new int[0];
                        int i36 = 0;
                        i6 = zzo3;
                        int i37 = -1;
                        int i38 = -1;
                        while (i36 < zzc10) {
                            if (i36 == 0 || !zzaahVar.zzf()) {
                                i7 = zzk;
                                bArr2 = bArr3;
                                i8 = zzc10;
                                i9 = i22;
                                i10 = i16;
                                int zzc11 = zzaahVar.zzc();
                                int zzc12 = zzaahVar.zzc();
                                int[] iArr4 = new int[zzc11];
                                for (int i39 = 0; i39 < zzc11; i39++) {
                                    iArr4[i39] = zzaahVar.zzc() + 1;
                                    zzaahVar.zzd();
                                }
                                int[] iArr5 = new int[zzc12];
                                for (int i40 = 0; i40 < zzc12; i40++) {
                                    iArr5[i40] = zzaahVar.zzc() + 1;
                                    zzaahVar.zzd();
                                }
                                i37 = zzc11;
                                i38 = zzc12;
                                iArr2 = iArr4;
                                iArr3 = iArr5;
                            } else {
                                i8 = zzc10;
                                int i41 = i37 + i38;
                                boolean zzf2 = zzaahVar.zzf();
                                int zzc13 = (1 - ((zzf2 ? 1 : 0) + (zzf2 ? 1 : 0))) * (zzaahVar.zzc() + 1);
                                i7 = zzk;
                                int i42 = i41 + 1;
                                bArr2 = bArr3;
                                boolean[] zArr = new boolean[i42];
                                i10 = i16;
                                for (int i43 = 0; i43 <= i41; i43++) {
                                    if (zzaahVar.zzf()) {
                                        zArr[i43] = true;
                                    } else {
                                        zArr[i43] = zzaahVar.zzf();
                                    }
                                }
                                int[] iArr6 = new int[i42];
                                int[] iArr7 = new int[i42];
                                int i44 = 0;
                                for (int i45 = i38 - 1; i45 >= 0; i45--) {
                                    int i46 = iArr3[i45] + zzc13;
                                    if (i46 < 0 && zArr[i37 + i45]) {
                                        iArr6[i44] = i46;
                                        i44++;
                                    }
                                }
                                if (zzc13 < 0 && zArr[i41]) {
                                    iArr6[i44] = zzc13;
                                    i44++;
                                }
                                i9 = i22;
                                int i47 = i44;
                                for (int i48 = 0; i48 < i37; i48++) {
                                    int i49 = iArr2[i48] + zzc13;
                                    if (i49 < 0 && zArr[i48]) {
                                        iArr6[i47] = i49;
                                        i47++;
                                    }
                                }
                                int[] copyOf = Arrays.copyOf(iArr6, i47);
                                int i50 = 0;
                                for (int i51 = i37 - 1; i51 >= 0; i51--) {
                                    int i52 = iArr2[i51] + zzc13;
                                    if (i52 > 0 && zArr[i51]) {
                                        iArr7[i50] = i52;
                                        i50++;
                                    }
                                }
                                if (zzc13 > 0 && zArr[i41]) {
                                    iArr7[i50] = zzc13;
                                    i50++;
                                }
                                int i53 = i50;
                                for (int i54 = 0; i54 < i38; i54++) {
                                    int i55 = iArr3[i54] + zzc13;
                                    if (i55 > 0 && zArr[i37 + i54]) {
                                        iArr7[i53] = i55;
                                        i53++;
                                    }
                                }
                                iArr2 = copyOf;
                                iArr3 = Arrays.copyOf(iArr7, i53);
                                i38 = i53;
                                i37 = i47;
                            }
                            i36++;
                            zzc10 = i8;
                            zzk = i7;
                            bArr3 = bArr2;
                            i16 = i10;
                            i22 = i9;
                        }
                        i = zzk;
                        bArr = bArr3;
                        i3 = i22;
                        i4 = i16;
                        if (zzaahVar.zzf()) {
                            for (int i56 = 0; i56 < zzaahVar.zzc(); i56++) {
                                zzaahVar.zze(zzc9 + 5);
                            }
                        }
                        zzaahVar.zze(2);
                        if (zzaahVar.zzf()) {
                            if (zzaahVar.zzf()) {
                                int zza5 = zzaahVar.zza(8);
                                if (zza5 == 255) {
                                    int zza6 = zzaahVar.zza(16);
                                    int zza7 = zzaahVar.zza(16);
                                    if (zza6 != 0 && zza7 != 0) {
                                        f = zza6 / zza7;
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
                                } else if (zza5 < 17) {
                                    f = zzaaf.zzb[zza5];
                                    if (zzaahVar.zzf()) {
                                    }
                                    if (zzaahVar.zzf()) {
                                    }
                                    if (zzaahVar.zzf()) {
                                    }
                                    zzaahVar.zzd();
                                    if (zzaahVar.zzf()) {
                                    }
                                } else {
                                    zzdw.zze("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza5);
                                }
                            }
                            f = 1.0f;
                            if (zzaahVar.zzf()) {
                            }
                            if (zzaahVar.zzf()) {
                            }
                            if (zzaahVar.zzf()) {
                            }
                            zzaahVar.zzd();
                            if (zzaahVar.zzf()) {
                            }
                        } else {
                            f = 1.0f;
                        }
                        str = zzdf.zzb(zza2, zzf, zza3, i25, iArr, zza4);
                        f2 = f;
                        i21 = zzc4;
                        i20 = i35;
                        i23 = 0;
                    } else {
                        i = zzk;
                        i2 = zzk2;
                        bArr = bArr3;
                        i3 = i22;
                        i4 = i16;
                        i5 = zzk3;
                        i6 = zzo3;
                    }
                    i19 = i24 + zzo4;
                    zzefVar.zzG(zzo4);
                    i23++;
                    zzo3 = i6;
                    zzk3 = i5;
                    zzk2 = i2;
                    zzk = i;
                    bArr3 = bArr;
                    i16 = i4;
                    i22 = i3;
                    i15 = 0;
                }
                i22++;
                i15 = 0;
            }
            return new zzzy(i16 == 0 ? Collections.emptyList() : Collections.singletonList(bArr3), zzk + 1, i20, i21, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbu.zza("Error parsing HEVC config", e);
        }
    }
}
