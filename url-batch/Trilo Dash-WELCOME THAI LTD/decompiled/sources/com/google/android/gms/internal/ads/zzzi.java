package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzzi {
    public final List zza;
    public final int zzb;
    public final float zzc;
    public final String zzd;

    private zzzi(List list, int i, int i2, int i3, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = f;
        this.zzd = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0298 A[Catch: ArrayIndexOutOfBoundsException -> 0x030c, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030c, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0123, B:63:0x0131, B:68:0x0148, B:70:0x0154, B:72:0x016c, B:80:0x017a, B:82:0x0180, B:87:0x01af, B:90:0x0189, B:92:0x019e, B:95:0x01a4, B:98:0x01b5, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01e5, B:108:0x01eb, B:110:0x01f4, B:112:0x01fa, B:114:0x01fd, B:119:0x0229, B:120:0x0203, B:122:0x0212, B:126:0x021e, B:131:0x022f, B:134:0x0236, B:136:0x023c, B:138:0x0245, B:140:0x024f, B:142:0x0255, B:144:0x025f, B:147:0x026d, B:148:0x0292, B:150:0x0298, B:151:0x029b, B:153:0x02a1, B:155:0x02ab, B:156:0x02b0, B:158:0x02b6, B:159:0x02bc, B:161:0x02c5, B:162:0x02ca, B:164:0x02dc, B:167:0x0275, B:168:0x027a, B:179:0x02ed, B:182:0x02f8, B:183:0x0301, B:187:0x02fd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02a1 A[Catch: ArrayIndexOutOfBoundsException -> 0x030c, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030c, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0123, B:63:0x0131, B:68:0x0148, B:70:0x0154, B:72:0x016c, B:80:0x017a, B:82:0x0180, B:87:0x01af, B:90:0x0189, B:92:0x019e, B:95:0x01a4, B:98:0x01b5, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01e5, B:108:0x01eb, B:110:0x01f4, B:112:0x01fa, B:114:0x01fd, B:119:0x0229, B:120:0x0203, B:122:0x0212, B:126:0x021e, B:131:0x022f, B:134:0x0236, B:136:0x023c, B:138:0x0245, B:140:0x024f, B:142:0x0255, B:144:0x025f, B:147:0x026d, B:148:0x0292, B:150:0x0298, B:151:0x029b, B:153:0x02a1, B:155:0x02ab, B:156:0x02b0, B:158:0x02b6, B:159:0x02bc, B:161:0x02c5, B:162:0x02ca, B:164:0x02dc, B:167:0x0275, B:168:0x027a, B:179:0x02ed, B:182:0x02f8, B:183:0x0301, B:187:0x02fd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02b6 A[Catch: ArrayIndexOutOfBoundsException -> 0x030c, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030c, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0123, B:63:0x0131, B:68:0x0148, B:70:0x0154, B:72:0x016c, B:80:0x017a, B:82:0x0180, B:87:0x01af, B:90:0x0189, B:92:0x019e, B:95:0x01a4, B:98:0x01b5, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01e5, B:108:0x01eb, B:110:0x01f4, B:112:0x01fa, B:114:0x01fd, B:119:0x0229, B:120:0x0203, B:122:0x0212, B:126:0x021e, B:131:0x022f, B:134:0x0236, B:136:0x023c, B:138:0x0245, B:140:0x024f, B:142:0x0255, B:144:0x025f, B:147:0x026d, B:148:0x0292, B:150:0x0298, B:151:0x029b, B:153:0x02a1, B:155:0x02ab, B:156:0x02b0, B:158:0x02b6, B:159:0x02bc, B:161:0x02c5, B:162:0x02ca, B:164:0x02dc, B:167:0x0275, B:168:0x027a, B:179:0x02ed, B:182:0x02f8, B:183:0x0301, B:187:0x02fd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c5 A[Catch: ArrayIndexOutOfBoundsException -> 0x030c, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x030c, blocks: (B:3:0x0004, B:6:0x001b, B:8:0x0025, B:10:0x0032, B:12:0x0035, B:14:0x0046, B:16:0x0053, B:19:0x0070, B:22:0x0099, B:24:0x009f, B:26:0x00a4, B:29:0x00a7, B:32:0x00af, B:34:0x00b8, B:36:0x00c0, B:38:0x00c6, B:39:0x00c8, B:41:0x00ce, B:43:0x00d0, B:46:0x00d3, B:48:0x00d8, B:49:0x00de, B:51:0x00e8, B:52:0x00ec, B:54:0x00fa, B:62:0x0123, B:63:0x0131, B:68:0x0148, B:70:0x0154, B:72:0x016c, B:80:0x017a, B:82:0x0180, B:87:0x01af, B:90:0x0189, B:92:0x019e, B:95:0x01a4, B:98:0x01b5, B:100:0x01bd, B:102:0x01cc, B:103:0x01da, B:106:0x01e5, B:108:0x01eb, B:110:0x01f4, B:112:0x01fa, B:114:0x01fd, B:119:0x0229, B:120:0x0203, B:122:0x0212, B:126:0x021e, B:131:0x022f, B:134:0x0236, B:136:0x023c, B:138:0x0245, B:140:0x024f, B:142:0x0255, B:144:0x025f, B:147:0x026d, B:148:0x0292, B:150:0x0298, B:151:0x029b, B:153:0x02a1, B:155:0x02ab, B:156:0x02b0, B:158:0x02b6, B:159:0x02bc, B:161:0x02c5, B:162:0x02ca, B:164:0x02dc, B:167:0x0275, B:168:0x027a, B:179:0x02ed, B:182:0x02f8, B:183:0x0301, B:187:0x02fd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzzi zza(zzdy zzdyVar) throws zzbp {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        try {
            zzdyVar.zzG(21);
            int zzk = zzdyVar.zzk() & 3;
            int zzk2 = zzdyVar.zzk();
            int zzc = zzdyVar.zzc();
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < zzk2; i11++) {
                zzdyVar.zzG(1);
                int zzo = zzdyVar.zzo();
                for (int i12 = 0; i12 < zzo; i12++) {
                    int zzo2 = zzdyVar.zzo();
                    i10 += zzo2 + 4;
                    zzdyVar.zzG(zzo2);
                }
            }
            zzdyVar.zzF(zzc);
            byte[] bArr = new byte[i10];
            String str = null;
            int i13 = 0;
            int i14 = 0;
            int i15 = -1;
            int i16 = -1;
            float f2 = 1.0f;
            while (i13 < zzk2) {
                int zzk3 = zzdyVar.zzk() & WorkQueueKt.MASK;
                int zzo3 = zzdyVar.zzo();
                int i17 = 0;
                while (i17 < zzo3) {
                    int zzo4 = zzdyVar.zzo();
                    System.arraycopy(zzzp.zza, i9, bArr, i14, 4);
                    int i18 = i14 + 4;
                    System.arraycopy(zzdyVar.zzH(), zzdyVar.zzc(), bArr, i18, zzo4);
                    if (zzk3 == 33 && i17 == 0) {
                        zzzr zzzrVar = new zzzr(bArr, i18 + 2, i18 + zzo4);
                        zzzrVar.zze(4);
                        int zza = zzzrVar.zza(3);
                        zzzrVar.zzd();
                        int zza2 = zzzrVar.zza(2);
                        boolean zzf = zzzrVar.zzf();
                        int zza3 = zzzrVar.zza(5);
                        int i19 = 0;
                        for (int i20 = 0; i20 < 32; i20++) {
                            if (zzzrVar.zzf()) {
                                i19 |= 1 << i20;
                            }
                        }
                        int[] iArr = new int[6];
                        for (int i21 = 0; i21 < 6; i21++) {
                            iArr[i21] = zzzrVar.zza(8);
                        }
                        int zza4 = zzzrVar.zza(8);
                        int i22 = 0;
                        for (int i23 = 0; i23 < zza; i23++) {
                            if (zzzrVar.zzf()) {
                                i22 += 89;
                            }
                            if (zzzrVar.zzf()) {
                                i22 += 8;
                            }
                        }
                        zzzrVar.zze(i22);
                        if (zza > 0) {
                            int i24 = 8 - zza;
                            zzzrVar.zze(i24 + i24);
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
                                i = zzk2;
                                i7 = 1;
                            } else if (zzc2 == 2) {
                                i = zzk2;
                                i7 = 1;
                                zzc2 = 2;
                            } else {
                                i = zzk2;
                                i7 = 1;
                                i8 = 1;
                                zzc3 -= i8 * (zzc5 + zzc6);
                                zzc4 -= (zzc2 != i7 ? 2 : 1) * (zzc7 + zzc8);
                            }
                            i8 = 2;
                            zzc3 -= i8 * (zzc5 + zzc6);
                            zzc4 -= (zzc2 != i7 ? 2 : 1) * (zzc7 + zzc8);
                        } else {
                            i = zzk2;
                        }
                        i15 = zzc3;
                        zzzrVar.zzc();
                        zzzrVar.zzc();
                        int zzc9 = zzzrVar.zzc();
                        for (int i25 = true != zzzrVar.zzf() ? zza : 0; i25 <= zza; i25++) {
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
                            int i26 = 0;
                            while (i26 < 4) {
                                int i27 = 0;
                                while (i27 < 6) {
                                    if (zzzrVar.zzf()) {
                                        i5 = zzk3;
                                        i6 = zzo3;
                                        int min = Math.min(64, 1 << ((i26 + i26) + 4));
                                        if (i26 > 1) {
                                            zzzrVar.zzb();
                                        }
                                        for (int i28 = 0; i28 < min; i28++) {
                                            zzzrVar.zzb();
                                        }
                                    } else {
                                        zzzrVar.zzc();
                                        i5 = zzk3;
                                        i6 = zzo3;
                                    }
                                    i27 += i26 == 3 ? 3 : 1;
                                    zzk3 = i5;
                                    zzo3 = i6;
                                }
                                i26++;
                            }
                        }
                        i2 = zzk3;
                        i3 = zzo3;
                        zzzrVar.zze(2);
                        if (zzzrVar.zzf()) {
                            zzzrVar.zze(8);
                            zzzrVar.zzc();
                            zzzrVar.zzc();
                            zzzrVar.zzd();
                        }
                        int zzc10 = zzzrVar.zzc();
                        int i29 = 0;
                        boolean z = false;
                        int i30 = 0;
                        while (i29 < zzc10) {
                            if (i29 != 0) {
                                z = zzzrVar.zzf();
                            }
                            if (z) {
                                zzzrVar.zzd();
                                zzzrVar.zzc();
                                for (int i31 = 0; i31 <= i30; i31++) {
                                    if (!zzzrVar.zzf()) {
                                        zzzrVar.zzd();
                                    }
                                }
                                i4 = zzc10;
                            } else {
                                int zzc11 = zzzrVar.zzc();
                                int zzc12 = zzzrVar.zzc();
                                int i32 = zzc11 + zzc12;
                                i4 = zzc10;
                                for (int i33 = 0; i33 < zzc11; i33++) {
                                    zzzrVar.zzc();
                                    zzzrVar.zzd();
                                }
                                for (int i34 = 0; i34 < zzc12; i34++) {
                                    zzzrVar.zzc();
                                    zzzrVar.zzd();
                                }
                                i30 = i32;
                            }
                            i29++;
                            zzc10 = i4;
                        }
                        if (zzzrVar.zzf()) {
                            for (int i35 = 0; i35 < zzzrVar.zzc(); i35++) {
                                zzzrVar.zze(zzc9 + 5);
                            }
                        }
                        zzzrVar.zze(2);
                        if (zzzrVar.zzf()) {
                            if (zzzrVar.zzf()) {
                                int zza5 = zzzrVar.zza(8);
                                if (zza5 == 255) {
                                    int zza6 = zzzrVar.zza(16);
                                    int zza7 = zzzrVar.zza(16);
                                    if (zza6 != 0 && zza7 != 0) {
                                        f = zza6 / zza7;
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
                                } else if (zza5 < 17) {
                                    f = zzzp.zzb[zza5];
                                    if (zzzrVar.zzf()) {
                                    }
                                    if (zzzrVar.zzf()) {
                                    }
                                    if (zzzrVar.zzf()) {
                                    }
                                    zzzrVar.zzd();
                                    if (zzzrVar.zzf()) {
                                    }
                                } else {
                                    Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + zza5);
                                }
                            }
                            f = 1.0f;
                            if (zzzrVar.zzf()) {
                            }
                            if (zzzrVar.zzf()) {
                            }
                            if (zzzrVar.zzf()) {
                            }
                            zzzrVar.zzd();
                            if (zzzrVar.zzf()) {
                            }
                        } else {
                            f = 1.0f;
                        }
                        str = zzcy.zzb(zza2, zzf, zza3, i19, iArr, zza4);
                        f2 = f;
                        i16 = zzc4;
                        i17 = 0;
                    } else {
                        i = zzk2;
                        i2 = zzk3;
                        i3 = zzo3;
                    }
                    i14 = i18 + zzo4;
                    zzdyVar.zzG(zzo4);
                    i17++;
                    zzk3 = i2;
                    zzo3 = i3;
                    zzk2 = i;
                    i9 = 0;
                }
                i13++;
                i9 = 0;
            }
            return new zzzi(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzk + 1, i15, i16, f2, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbp.zza("Error parsing HEVC config", e);
        }
    }
}
