package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzauz {
    private static final int zza = zzazn.zzg("vide");
    private static final int zzb = zzazn.zzg("soun");
    private static final int zzc = zzazn.zzg("text");
    private static final int zzd = zzazn.zzg("sbtl");
    private static final int zze = zzazn.zzg("subt");
    private static final int zzf = zzazn.zzg("clcp");
    private static final int zzg = zzazn.zzg("cenc");
    private static final int zzh = zzazn.zzg("meta");

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r12 == 0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0832 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzavk zza(zzauq zzauqVar, zzaur zzaurVar, long j, zzatr zzatrVar, boolean z) throws zzarv {
        long j2;
        int i;
        zzaur zzaurVar2;
        long j3;
        int i2;
        int i3;
        int zze2;
        int i4;
        zzauv zzauvVar;
        zzauq zza2;
        zzavk zzavkVar;
        Pair create;
        int i5;
        zzaur zzb2;
        int i6;
        boolean z2;
        int i7;
        String str;
        zzazg zzazgVar;
        Pair pair;
        zzauy zzauyVar;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        zzauv zzauvVar2;
        int i13;
        int i14;
        boolean z3;
        byte[] bArr;
        String str2;
        int i15;
        int i16;
        int i17;
        int i18;
        int zzc2;
        int i19;
        int i20;
        int i21;
        int i22;
        zzauv zzauvVar3;
        int i23;
        int i24;
        String str3;
        int i25;
        String str4;
        zzauv zzauvVar4;
        int zzc3;
        String str5;
        int i26;
        int i27;
        String str6;
        String str7;
        Object obj;
        long j4;
        zzatr zzatrVar2 = zzatrVar;
        zzauq zza3 = zzauqVar.zza(zzaus.zzH);
        zzazg zzazgVar2 = zza3.zzb(zzaus.zzV).zza;
        zzazgVar2.zzv(16);
        int zze3 = zzazgVar2.zze();
        int i28 = -1;
        int i29 = zze3 == zzb ? 1 : zze3 == zza ? 2 : (zze3 == zzc || zze3 == zzd || zze3 == zze || zze3 == zzf) ? 3 : zze3 == zzh ? 4 : -1;
        String str8 = null;
        if (i29 == -1) {
            return null;
        }
        zzazg zzazgVar3 = zzauqVar.zzb(zzaus.zzR).zza;
        zzazgVar3.zzv(8);
        int zzf2 = zzaus.zzf(zzazgVar3.zze());
        zzazgVar3.zzw(zzf2 == 0 ? 8 : 16);
        int zze4 = zzazgVar3.zze();
        zzazgVar3.zzw(4);
        int zzc4 = zzazgVar3.zzc();
        int i30 = zzf2 == 0 ? 4 : 8;
        int i31 = 0;
        while (true) {
            if (i31 >= i30) {
                zzazgVar3.zzw(i30);
                break;
            }
            if (zzazgVar3.zza[zzc4 + i31] != -1) {
                j2 = zzf2 == 0 ? zzazgVar3.zzm() : zzazgVar3.zzn();
            } else {
                i31++;
            }
        }
        j2 = -9223372036854775807L;
        zzazgVar3.zzw(16);
        int zze5 = zzazgVar3.zze();
        int zze6 = zzazgVar3.zze();
        zzazgVar3.zzw(4);
        int zze7 = zzazgVar3.zze();
        int zze8 = zzazgVar3.zze();
        int i32 = 65536;
        if (zze5 == 0) {
            if (zze6 != 65536) {
                zze5 = 0;
            } else if (zze7 != -65536) {
                zze5 = 0;
                zze6 = 65536;
            } else {
                if (zze8 == 0) {
                    i = 90;
                    zzauy zzauyVar2 = new zzauy(zze4, j2, i);
                    if (j == -9223372036854775807L) {
                        j4 = zzauyVar2.zzb;
                        j3 = j4;
                        zzaurVar2 = zzaurVar;
                    } else {
                        zzaurVar2 = zzaurVar;
                        j3 = j;
                    }
                    zzazg zzazgVar4 = zzaurVar2.zza;
                    zzazgVar4.zzv(8);
                    zzazgVar4.zzw(zzaus.zzf(zzazgVar4.zze()) == 0 ? 8 : 16);
                    long zzm = zzazgVar4.zzm();
                    long zzj = j3 == -9223372036854775807L ? -9223372036854775807L : zzazn.zzj(j3, 1000000L, zzm);
                    zzauq zza4 = zza3.zza(zzaus.zzI).zza(zzaus.zzJ);
                    zzazg zzazgVar5 = zza3.zzb(zzaus.zzU).zza;
                    zzazgVar5.zzv(8);
                    int zzf3 = zzaus.zzf(zzazgVar5.zze());
                    zzazgVar5.zzw(zzf3 == 0 ? 8 : 16);
                    long zzm2 = zzazgVar5.zzm();
                    zzazgVar5.zzw(zzf3 == 0 ? 4 : 8);
                    int zzj2 = zzazgVar5.zzj();
                    StringBuilder sb = new StringBuilder();
                    sb.append((char) (((zzj2 >> 10) & 31) + 96));
                    sb.append((char) (((zzj2 >> 5) & 31) + 96));
                    sb.append((char) ((zzj2 & 31) + 96));
                    Pair create2 = Pair.create(Long.valueOf(zzm2), sb.toString());
                    zzazg zzazgVar6 = zza4.zzb(zzaus.zzW).zza;
                    i2 = zzauyVar2.zza;
                    i3 = zzauyVar2.zzc;
                    String str9 = (String) create2.second;
                    zzazgVar6.zzv(12);
                    zze2 = zzazgVar6.zze();
                    zzauv zzauvVar5 = new zzauv(zze2);
                    i4 = 0;
                    while (i4 < zze2) {
                        int zzc5 = zzazgVar6.zzc();
                        int zze9 = zzazgVar6.zze();
                        if (zze9 > 0) {
                            i6 = i29;
                            z2 = true;
                        } else {
                            i6 = i29;
                            z2 = false;
                        }
                        String str10 = "childAtomSize should be positive";
                        zzayy.zzd(z2, "childAtomSize should be positive");
                        int zze10 = zzazgVar6.zze();
                        if (zze10 == zzaus.zze || zze10 == zzaus.zzf || zze10 == zzaus.zzac || zze10 == zzaus.zzan || zze10 == zzaus.zzg || zze10 == zzaus.zzh || zze10 == zzaus.zzi || zze10 == zzaus.zzaM || zze10 == zzaus.zzaN) {
                            int i33 = i4;
                            i7 = zze2;
                            str = str9;
                            zzazgVar = zzazgVar6;
                            pair = create2;
                            zzauyVar = zzauyVar2;
                            zzauv zzauvVar6 = zzauvVar5;
                            zzazgVar.zzv(zzc5 + 16);
                            zzazgVar.zzw(16);
                            int zzj3 = zzazgVar.zzj();
                            int zzj4 = zzazgVar.zzj();
                            zzazgVar.zzw(50);
                            int zzc6 = zzazgVar.zzc();
                            if (zze10 == zzaus.zzac) {
                                i8 = i33;
                                i9 = zze9;
                                zze10 = zze(zzazgVar, zzc5, i9, zzauvVar6, i8);
                                zzazgVar.zzv(zzc6);
                            } else {
                                i8 = i33;
                                i9 = zze9;
                            }
                            String str11 = null;
                            boolean z4 = false;
                            List list = null;
                            float f = 1.0f;
                            byte[] bArr2 = null;
                            int i34 = -1;
                            while (zzc6 - zzc5 < i9) {
                                zzazgVar.zzv(zzc6);
                                int zzc7 = zzazgVar.zzc();
                                int zze11 = zzazgVar.zze();
                                if (zze11 == 0) {
                                    if (zzazgVar.zzc() - zzc5 == i9) {
                                        break;
                                    }
                                    zze11 = 0;
                                }
                                zzayy.zzd(zze11 > 0, "childAtomSize should be positive");
                                int zze12 = zzazgVar.zze();
                                int i35 = i9;
                                if (zze12 == zzaus.zzK) {
                                    zzayy.zze(str11 == null);
                                    zzazgVar.zzv(zzc7 + 8);
                                    zzazo zza5 = zzazo.zza(zzazgVar);
                                    list = zza5.zza;
                                    zzauvVar6.zzc = zza5.zzb;
                                    if (!z4) {
                                        f = zza5.zzc;
                                    }
                                    str11 = "video/avc";
                                } else if (zze12 == zzaus.zzL) {
                                    zzayy.zze(str11 == null);
                                    zzazgVar.zzv(zzc7 + 8);
                                    zzazu zza6 = zzazu.zza(zzazgVar);
                                    list = zza6.zza;
                                    zzauvVar6.zzc = zza6.zzb;
                                    str11 = "video/hevc";
                                } else if (zze12 == zzaus.zzaO) {
                                    zzayy.zze(str11 == null);
                                    str11 = zze10 == zzaus.zzaM ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                } else if (zze12 == zzaus.zzj) {
                                    zzayy.zze(str11 == null);
                                    str11 = "video/3gpp";
                                } else {
                                    if (zze12 == zzaus.zzM) {
                                        zzayy.zze(str11 == null);
                                        Pair zzf4 = zzf(zzazgVar, zzc7);
                                        String str12 = (String) zzf4.first;
                                        list = Collections.singletonList((byte[]) zzf4.second);
                                        i14 = zze10;
                                        str11 = str12;
                                    } else if (zze12 == zzaus.zzal) {
                                        zzazgVar.zzv(zzc7 + 8);
                                        f = zzazgVar.zzi() / zzazgVar.zzi();
                                        i14 = zze10;
                                        z4 = true;
                                    } else if (zze12 == zzaus.zzaK) {
                                        int i36 = zzc7 + 8;
                                        while (true) {
                                            if (i36 - zzc7 >= zze11) {
                                                i14 = zze10;
                                                z3 = z4;
                                                bArr = null;
                                                break;
                                            }
                                            zzazgVar.zzv(i36);
                                            int zze13 = zzazgVar.zze();
                                            i14 = zze10;
                                            z3 = z4;
                                            if (zzazgVar.zze() == zzaus.zzaL) {
                                                bArr = Arrays.copyOfRange(zzazgVar.zza, i36, zze13 + i36);
                                                break;
                                            }
                                            i36 += zze13;
                                            z4 = z3;
                                            zze10 = i14;
                                        }
                                        z4 = z3;
                                        bArr2 = bArr;
                                    } else {
                                        i14 = zze10;
                                        boolean z5 = z4;
                                        if (zze12 == zzaus.zzaJ) {
                                            int zzg2 = zzazgVar.zzg();
                                            zzazgVar.zzw(3);
                                            if (zzg2 == 0) {
                                                int zzg3 = zzazgVar.zzg();
                                                if (zzg3 == 0) {
                                                    z4 = z5;
                                                    i34 = 0;
                                                } else if (zzg3 == 1) {
                                                    z4 = z5;
                                                    i34 = 1;
                                                } else if (zzg3 == 2) {
                                                    z4 = z5;
                                                    i34 = 2;
                                                } else if (zzg3 == 3) {
                                                    z4 = z5;
                                                    i34 = 3;
                                                }
                                                zzc6 += zze11;
                                                zze10 = i14;
                                                i9 = i35;
                                            }
                                        }
                                        z4 = z5;
                                        zzc6 += zze11;
                                        zze10 = i14;
                                        i9 = i35;
                                    }
                                    zzc6 += zze11;
                                    zze10 = i14;
                                    i9 = i35;
                                }
                                i14 = zze10;
                                zzc6 += zze11;
                                zze10 = i14;
                                i9 = i35;
                            }
                            i10 = i9;
                            if (str11 != null) {
                                i13 = i10;
                                i11 = i8;
                                byte[] bArr3 = bArr2;
                                i12 = zzc5;
                                zzauvVar2 = zzauvVar6;
                                zzauvVar2.zzb = zzars.zzl(Integer.toString(i2), str11, null, -1, -1, zzj3, zzj4, -1.0f, list, i3, f, bArr3, i34, null, zzatrVar);
                                zzazgVar.zzv(i12 + i13);
                                i4 = i11 + 1;
                                zzatrVar2 = zzatrVar;
                                zzazgVar6 = zzazgVar;
                                zzauvVar5 = zzauvVar2;
                                zzauyVar2 = zzauyVar;
                                i29 = i6;
                                zze2 = i7;
                                str9 = str;
                                create2 = pair;
                                str8 = null;
                                i28 = -1;
                            } else {
                                i11 = i8;
                                i12 = zzc5;
                                zzauvVar2 = zzauvVar6;
                            }
                        } else {
                            if (zze10 == zzaus.zzl || zze10 == zzaus.zzad || zze10 == zzaus.zzq || zze10 == zzaus.zzs || zze10 == zzaus.zzu || zze10 == zzaus.zzx || zze10 == zzaus.zzv || zze10 == zzaus.zzw || zze10 == zzaus.zzaA || zze10 == zzaus.zzaB || zze10 == zzaus.zzo || zze10 == zzaus.zzp || zze10 == zzaus.zzm || zze10 == zzaus.zzaQ) {
                                int i37 = i4;
                                zzauv zzauvVar7 = zzauvVar5;
                                i7 = zze2;
                                str2 = str9;
                                Pair pair2 = create2;
                                int i38 = zze9;
                                int i39 = zzc5;
                                zzazgVar6.zzv(i39 + 16);
                                if (z) {
                                    i15 = zzazgVar6.zzj();
                                    zzazgVar6.zzw(6);
                                } else {
                                    zzazgVar6.zzw(8);
                                    i15 = 0;
                                }
                                if (i15 != 0) {
                                    i16 = 1;
                                    if (i15 != 1) {
                                        if (i15 == 2) {
                                            zzazgVar6.zzw(16);
                                            i17 = (int) Math.round(Double.longBitsToDouble(zzazgVar6.zzl()));
                                            i18 = zzazgVar6.zzi();
                                            zzazgVar6.zzw(20);
                                            zzc2 = zzazgVar6.zzc();
                                            if (zze10 != zzaus.zzad) {
                                                i19 = i37;
                                                zze10 = zze(zzazgVar6, i39, i38, zzauvVar7, i19);
                                                zzazgVar6.zzv(zzc2);
                                            } else {
                                                i19 = i37;
                                            }
                                            String str13 = zze10 != zzaus.zzq ? "audio/ac3" : zze10 == zzaus.zzs ? "audio/eac3" : zze10 == zzaus.zzu ? "audio/vnd.dts" : (zze10 == zzaus.zzv || zze10 == zzaus.zzw) ? "audio/vnd.dts.hd" : zze10 == zzaus.zzx ? "audio/vnd.dts.hd;profile=lbr" : zze10 == zzaus.zzaA ? "audio/3gpp" : zze10 == zzaus.zzaB ? "audio/amr-wb" : (zze10 == zzaus.zzo || zze10 == zzaus.zzp) ? "audio/raw" : zze10 == zzaus.zzm ? "audio/mpeg" : zze10 == zzaus.zzaQ ? "audio/alac" : null;
                                            int i40 = i18;
                                            int i41 = i17;
                                            byte[] bArr4 = null;
                                            while (zzc2 - i39 < i38) {
                                                zzazgVar6.zzv(zzc2);
                                                int zze14 = zzazgVar6.zze();
                                                zzayy.zzd(zze14 > 0, str10);
                                                int zze15 = zzazgVar6.zze();
                                                int i42 = zzaus.zzM;
                                                if (zze15 == i42 || (z && zze15 == zzaus.zzn)) {
                                                    i23 = i19;
                                                    String str14 = str13;
                                                    i24 = i39;
                                                    str3 = str10;
                                                    i25 = i38;
                                                    str4 = str2;
                                                    zzauvVar4 = zzauvVar7;
                                                    if (zze15 != i42) {
                                                        zzc3 = zzazgVar6.zzc();
                                                        while (true) {
                                                            if (zzc3 - zzc2 >= zze14) {
                                                                zzc3 = -1;
                                                                break;
                                                            }
                                                            zzazgVar6.zzv(zzc3);
                                                            int zze16 = zzazgVar6.zze();
                                                            zzayy.zzd(zze16 > 0, str3);
                                                            if (zzazgVar6.zze() == zzaus.zzM) {
                                                                break;
                                                            }
                                                            zzc3 += zze16;
                                                        }
                                                    } else {
                                                        zzc3 = zzc2;
                                                    }
                                                    if (zzc3 != -1) {
                                                        Pair zzf5 = zzf(zzazgVar6, zzc3);
                                                        String str15 = (String) zzf5.first;
                                                        bArr4 = (byte[]) zzf5.second;
                                                        if ("audio/mp4a-latm".equals(str15)) {
                                                            Pair zza7 = zzayz.zza(bArr4);
                                                            int intValue = ((Integer) zza7.first).intValue();
                                                            i40 = ((Integer) zza7.second).intValue();
                                                            str13 = str15;
                                                            i41 = intValue;
                                                        } else {
                                                            str13 = str15;
                                                        }
                                                    } else {
                                                        str13 = str14;
                                                    }
                                                } else {
                                                    if (zze15 == zzaus.zzr) {
                                                        zzazgVar6.zzv(zzc2 + 8);
                                                        str5 = str2;
                                                        zzauvVar7.zzb = zzase.zzb(zzazgVar6, Integer.toString(i2), str5, zzatrVar2);
                                                    } else {
                                                        str5 = str2;
                                                        if (zze15 == zzaus.zzt) {
                                                            zzazgVar6.zzv(zzc2 + 8);
                                                            zzauvVar7.zzb = zzase.zzc(zzazgVar6, Integer.toString(i2), str5, zzatrVar2);
                                                        } else {
                                                            if (zze15 == zzaus.zzy) {
                                                                i26 = zze14;
                                                                i27 = zzc2;
                                                                i23 = i19;
                                                                str6 = str13;
                                                                str4 = str5;
                                                                i24 = i39;
                                                                str3 = str10;
                                                                i25 = i38;
                                                                zzauvVar4 = zzauvVar7;
                                                                zzauvVar4.zzb = zzars.zzg(Integer.toString(i2), str13, null, -1, -1, i40, i41, null, zzatrVar, 0, str4);
                                                            } else {
                                                                i26 = zze14;
                                                                i27 = zzc2;
                                                                i23 = i19;
                                                                str6 = str13;
                                                                str4 = str5;
                                                                i24 = i39;
                                                                str3 = str10;
                                                                i25 = i38;
                                                                zzauvVar4 = zzauvVar7;
                                                                if (zze15 == zzaus.zzaQ) {
                                                                    zze14 = i26;
                                                                    byte[] bArr5 = new byte[zze14];
                                                                    zzc2 = i27;
                                                                    zzazgVar6.zzv(zzc2);
                                                                    zzazgVar6.zzq(bArr5, 0, zze14);
                                                                    bArr4 = bArr5;
                                                                    str13 = str6;
                                                                }
                                                            }
                                                            zze14 = i26;
                                                            zzc2 = i27;
                                                            str13 = str6;
                                                        }
                                                    }
                                                    i23 = i19;
                                                    str6 = str13;
                                                    str4 = str5;
                                                    i24 = i39;
                                                    str3 = str10;
                                                    i25 = i38;
                                                    zzauvVar4 = zzauvVar7;
                                                    str13 = str6;
                                                }
                                                zzc2 += zze14;
                                                zzauvVar7 = zzauvVar4;
                                                str10 = str3;
                                                str2 = str4;
                                                i38 = i25;
                                                i19 = i23;
                                                i39 = i24;
                                                zzatrVar2 = zzatrVar;
                                            }
                                            i20 = i19;
                                            String str16 = str13;
                                            i21 = i39;
                                            i22 = i38;
                                            str = str2;
                                            zzauvVar3 = zzauvVar7;
                                            if (zzauvVar3.zzb == null || str16 == null) {
                                                pair = pair2;
                                                zzazgVar = zzazgVar6;
                                                zzauyVar = zzauyVar2;
                                                zzauvVar2 = zzauvVar3;
                                                i13 = i22;
                                                i11 = i20;
                                                i12 = i21;
                                                zzazgVar.zzv(i12 + i13);
                                                i4 = i11 + 1;
                                                zzatrVar2 = zzatrVar;
                                                zzazgVar6 = zzazgVar;
                                                zzauvVar5 = zzauvVar2;
                                                zzauyVar2 = zzauyVar;
                                                i29 = i6;
                                                zze2 = i7;
                                                str9 = str;
                                                create2 = pair;
                                                str8 = null;
                                                i28 = -1;
                                            } else {
                                                zzazgVar = zzazgVar6;
                                                pair = pair2;
                                                i10 = i22;
                                                zzauyVar = zzauyVar2;
                                                zzauvVar3.zzb = zzars.zzh(Integer.toString(i2), str16, null, -1, -1, i40, i41, true != "audio/raw".equals(str16) ? -1 : 2, -1, -1, bArr4 == null ? null : Collections.singletonList(bArr4), zzatrVar, 0, str, null);
                                                zzauvVar2 = zzauvVar3;
                                                i11 = i20;
                                                i12 = i21;
                                            }
                                        } else {
                                            pair = pair2;
                                            i12 = i39;
                                            zzauvVar2 = zzauvVar7;
                                            zzazgVar = zzazgVar6;
                                            i13 = i38;
                                            zzauyVar = zzauyVar2;
                                            i11 = i37;
                                        }
                                    }
                                } else {
                                    i16 = 1;
                                }
                                int zzj5 = zzazgVar6.zzj();
                                zzazgVar6.zzw(6);
                                int zzh2 = zzazgVar6.zzh();
                                if (i15 == i16) {
                                    zzazgVar6.zzw(16);
                                }
                                i17 = zzh2;
                                i18 = zzj5;
                                zzc2 = zzazgVar6.zzc();
                                if (zze10 != zzaus.zzad) {
                                }
                                String str132 = zze10 != zzaus.zzq ? "audio/ac3" : zze10 == zzaus.zzs ? "audio/eac3" : zze10 == zzaus.zzu ? "audio/vnd.dts" : (zze10 == zzaus.zzv || zze10 == zzaus.zzw) ? "audio/vnd.dts.hd" : zze10 == zzaus.zzx ? "audio/vnd.dts.hd;profile=lbr" : zze10 == zzaus.zzaA ? "audio/3gpp" : zze10 == zzaus.zzaB ? "audio/amr-wb" : (zze10 == zzaus.zzo || zze10 == zzaus.zzp) ? "audio/raw" : zze10 == zzaus.zzm ? "audio/mpeg" : zze10 == zzaus.zzaQ ? "audio/alac" : null;
                                int i402 = i18;
                                int i412 = i17;
                                byte[] bArr42 = null;
                                while (zzc2 - i39 < i38) {
                                }
                                i20 = i19;
                                String str162 = str132;
                                i21 = i39;
                                i22 = i38;
                                str = str2;
                                zzauvVar3 = zzauvVar7;
                                if (zzauvVar3.zzb == null) {
                                }
                                pair = pair2;
                                zzazgVar = zzazgVar6;
                                zzauyVar = zzauyVar2;
                                zzauvVar2 = zzauvVar3;
                                i13 = i22;
                                i11 = i20;
                                i12 = i21;
                                zzazgVar.zzv(i12 + i13);
                                i4 = i11 + 1;
                                zzatrVar2 = zzatrVar;
                                zzazgVar6 = zzazgVar;
                                zzauvVar5 = zzauvVar2;
                                zzauyVar2 = zzauyVar;
                                i29 = i6;
                                zze2 = i7;
                                str9 = str;
                                create2 = pair;
                                str8 = null;
                                i28 = -1;
                            } else if (zze10 == zzaus.zzam || zze10 == zzaus.zzaw || zze10 == zzaus.zzax || zze10 == zzaus.zzay || zze10 == zzaus.zzaz) {
                                zzazgVar6.zzv(zzc5 + 16);
                                long j5 = Long.MAX_VALUE;
                                if (zze10 == zzaus.zzam) {
                                    obj = str8;
                                    str7 = "application/ttml+xml";
                                } else if (zze10 == zzaus.zzaw) {
                                    int i43 = zze9 - 16;
                                    byte[] bArr6 = new byte[i43];
                                    zzazgVar6.zzq(bArr6, 0, i43);
                                    Object singletonList = Collections.singletonList(bArr6);
                                    str7 = "application/x-quicktime-tx3g";
                                    obj = singletonList;
                                } else if (zze10 == zzaus.zzax) {
                                    str7 = "application/x-mp4-vtt";
                                    obj = str8;
                                } else if (zze10 == zzaus.zzay) {
                                    obj = str8;
                                    str7 = "application/ttml+xml";
                                    j5 = 0;
                                } else {
                                    if (zze10 != zzaus.zzaz) {
                                        throw new IllegalStateException();
                                    }
                                    zzauvVar5.zzd = 1;
                                    str7 = "application/x-mp4-cea-608";
                                    obj = str8;
                                    zzauv zzauvVar8 = zzauvVar5;
                                    i7 = zze2;
                                    str2 = str9;
                                    zzauvVar8.zzb = zzars.zzk(Integer.toString(i2), str7, null, -1, 0, str9, -1, zzatrVar, j5, obj);
                                    pair = create2;
                                    zzauvVar2 = zzauvVar8;
                                    zzazgVar = zzazgVar6;
                                    i13 = zze9;
                                    zzauyVar = zzauyVar2;
                                    i11 = i4;
                                    i12 = zzc5;
                                }
                                zzauv zzauvVar82 = zzauvVar5;
                                i7 = zze2;
                                str2 = str9;
                                zzauvVar82.zzb = zzars.zzk(Integer.toString(i2), str7, null, -1, 0, str9, -1, zzatrVar, j5, obj);
                                pair = create2;
                                zzauvVar2 = zzauvVar82;
                                zzazgVar = zzazgVar6;
                                i13 = zze9;
                                zzauyVar = zzauyVar2;
                                i11 = i4;
                                i12 = zzc5;
                            } else {
                                if (zze10 == zzaus.zzaP) {
                                    zzauvVar5.zzb = zzars.zzj(Integer.toString(i2), "application/x-camera-motion", str8, i28, zzatrVar2);
                                }
                                i13 = zze9;
                                i12 = zzc5;
                                i11 = i4;
                                zzauvVar2 = zzauvVar5;
                                i7 = zze2;
                                str = str9;
                                zzazgVar = zzazgVar6;
                                pair = create2;
                                zzauyVar = zzauyVar2;
                                zzazgVar.zzv(i12 + i13);
                                i4 = i11 + 1;
                                zzatrVar2 = zzatrVar;
                                zzazgVar6 = zzazgVar;
                                zzauvVar5 = zzauvVar2;
                                zzauyVar2 = zzauyVar;
                                i29 = i6;
                                zze2 = i7;
                                str9 = str;
                                create2 = pair;
                                str8 = null;
                                i28 = -1;
                            }
                            str = str2;
                            zzazgVar.zzv(i12 + i13);
                            i4 = i11 + 1;
                            zzatrVar2 = zzatrVar;
                            zzazgVar6 = zzazgVar;
                            zzauvVar5 = zzauvVar2;
                            zzauyVar2 = zzauyVar;
                            i29 = i6;
                            zze2 = i7;
                            str9 = str;
                            create2 = pair;
                            str8 = null;
                            i28 = -1;
                        }
                        i13 = i10;
                        zzazgVar.zzv(i12 + i13);
                        i4 = i11 + 1;
                        zzatrVar2 = zzatrVar;
                        zzazgVar6 = zzazgVar;
                        zzauvVar5 = zzauvVar2;
                        zzauyVar2 = zzauyVar;
                        i29 = i6;
                        zze2 = i7;
                        str9 = str;
                        create2 = pair;
                        str8 = null;
                        i28 = -1;
                    }
                    zzauvVar = zzauvVar5;
                    int i44 = i29;
                    Pair pair3 = create2;
                    zzauy zzauyVar3 = zzauyVar2;
                    zza2 = zzauqVar.zza(zzaus.zzS);
                    if (zza2 != null || (zzb2 = zza2.zzb(zzaus.zzT)) == null) {
                        zzavkVar = null;
                        create = Pair.create(null, null);
                    } else {
                        zzazg zzazgVar7 = zzb2.zza;
                        zzazgVar7.zzv(8);
                        int zzf6 = zzaus.zzf(zzazgVar7.zze());
                        int zzi = zzazgVar7.zzi();
                        long[] jArr = new long[zzi];
                        long[] jArr2 = new long[zzi];
                        for (int i45 = 0; i45 < zzi; i45++) {
                            jArr[i45] = zzf6 == 1 ? zzazgVar7.zzn() : zzazgVar7.zzm();
                            jArr2[i45] = zzf6 == 1 ? zzazgVar7.zzl() : zzazgVar7.zze();
                            if (zzazgVar7.zzp() != 1) {
                                throw new IllegalArgumentException("Unsupported media rate.");
                            }
                            zzazgVar7.zzw(2);
                        }
                        create = Pair.create(jArr, jArr2);
                        zzavkVar = null;
                    }
                    if (zzauvVar.zzb == null) {
                        return zzavkVar;
                    }
                    i5 = zzauyVar3.zza;
                    return new zzavk(i5, i44, ((Long) pair3.first).longValue(), zzm, zzj, zzauvVar.zzb, zzauvVar.zzd, zzauvVar.zza, zzauvVar.zzc, (long[]) create.first, (long[]) create.second);
                }
                zze5 = 0;
                zze6 = 65536;
                zze7 = SupportMenu.CATEGORY_MASK;
            }
        }
        if (zze5 != 0) {
            i32 = zze7;
        } else if (zze6 == -65536) {
            if (zze7 != 65536) {
                i32 = zze7;
            } else if (zze8 == 0) {
                i = 270;
                zzauy zzauyVar22 = new zzauy(zze4, j2, i);
                if (j == -9223372036854775807L) {
                }
                zzazg zzazgVar42 = zzaurVar2.zza;
                zzazgVar42.zzv(8);
                zzazgVar42.zzw(zzaus.zzf(zzazgVar42.zze()) == 0 ? 8 : 16);
                long zzm3 = zzazgVar42.zzm();
                if (j3 == -9223372036854775807L) {
                }
                zzauq zza42 = zza3.zza(zzaus.zzI).zza(zzaus.zzJ);
                zzazg zzazgVar52 = zza3.zzb(zzaus.zzU).zza;
                zzazgVar52.zzv(8);
                int zzf32 = zzaus.zzf(zzazgVar52.zze());
                zzazgVar52.zzw(zzf32 == 0 ? 8 : 16);
                long zzm22 = zzazgVar52.zzm();
                zzazgVar52.zzw(zzf32 == 0 ? 4 : 8);
                int zzj22 = zzazgVar52.zzj();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) (((zzj22 >> 10) & 31) + 96));
                sb2.append((char) (((zzj22 >> 5) & 31) + 96));
                sb2.append((char) ((zzj22 & 31) + 96));
                Pair create22 = Pair.create(Long.valueOf(zzm22), sb2.toString());
                zzazg zzazgVar62 = zza42.zzb(zzaus.zzW).zza;
                i2 = zzauyVar22.zza;
                i3 = zzauyVar22.zzc;
                String str92 = (String) create22.second;
                zzazgVar62.zzv(12);
                zze2 = zzazgVar62.zze();
                zzauv zzauvVar52 = new zzauv(zze2);
                i4 = 0;
                while (i4 < zze2) {
                }
                zzauvVar = zzauvVar52;
                int i442 = i29;
                Pair pair32 = create22;
                zzauy zzauyVar32 = zzauyVar22;
                zza2 = zzauqVar.zza(zzaus.zzS);
                if (zza2 != null) {
                }
                zzavkVar = null;
                create = Pair.create(null, null);
                if (zzauvVar.zzb == null) {
                }
            }
            zze5 = 0;
            zze6 = SupportMenu.CATEGORY_MASK;
        } else {
            i32 = zze7;
            zze5 = 0;
        }
        i = (zze5 == -65536 && zze6 == 0 && i32 == 0 && zze8 == -65536) ? 180 : 0;
        zzauy zzauyVar222 = new zzauy(zze4, j2, i);
        if (j == -9223372036854775807L) {
        }
        zzazg zzazgVar422 = zzaurVar2.zza;
        zzazgVar422.zzv(8);
        zzazgVar422.zzw(zzaus.zzf(zzazgVar422.zze()) == 0 ? 8 : 16);
        long zzm32 = zzazgVar422.zzm();
        if (j3 == -9223372036854775807L) {
        }
        zzauq zza422 = zza3.zza(zzaus.zzI).zza(zzaus.zzJ);
        zzazg zzazgVar522 = zza3.zzb(zzaus.zzU).zza;
        zzazgVar522.zzv(8);
        int zzf322 = zzaus.zzf(zzazgVar522.zze());
        zzazgVar522.zzw(zzf322 == 0 ? 8 : 16);
        long zzm222 = zzazgVar522.zzm();
        zzazgVar522.zzw(zzf322 == 0 ? 4 : 8);
        int zzj222 = zzazgVar522.zzj();
        StringBuilder sb22 = new StringBuilder();
        sb22.append((char) (((zzj222 >> 10) & 31) + 96));
        sb22.append((char) (((zzj222 >> 5) & 31) + 96));
        sb22.append((char) ((zzj222 & 31) + 96));
        Pair create222 = Pair.create(Long.valueOf(zzm222), sb22.toString());
        zzazg zzazgVar622 = zza422.zzb(zzaus.zzW).zza;
        i2 = zzauyVar222.zza;
        i3 = zzauyVar222.zzc;
        String str922 = (String) create222.second;
        zzazgVar622.zzv(12);
        zze2 = zzazgVar622.zze();
        zzauv zzauvVar522 = new zzauv(zze2);
        i4 = 0;
        while (i4 < zze2) {
        }
        zzauvVar = zzauvVar522;
        int i4422 = i29;
        Pair pair322 = create222;
        zzauy zzauyVar322 = zzauyVar222;
        zza2 = zzauqVar.zza(zzaus.zzS);
        if (zza2 != null) {
        }
        zzavkVar = null;
        create = Pair.create(null, null);
        if (zzauvVar.zzb == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0174 A[ADDED_TO_REGION, LOOP:10: B:171:0x0174->B:172:0x0176, LOOP_START, PHI: r14 r15 r22 r25
      0x0174: PHI (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:170:0x0172, B:172:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:170:0x0172, B:172:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:170:0x0172, B:172:0x0176] A[DONT_GENERATE, DONT_INLINE]
      0x0174: PHI (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:170:0x0172, B:172:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzavn zzb(zzavk zzavkVar, zzauq zzauqVar, zzatz zzatzVar) throws zzarv {
        zzauu zzauxVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        zzavk zzavkVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        zzauu zzauuVar;
        long[] jArr3;
        int i11;
        int i12;
        long[] jArr4;
        int[] iArr3;
        long[] jArr5;
        boolean z2;
        int[] iArr4;
        int i13;
        int[] iArr5;
        long[] jArr6;
        int length;
        zzaur zzb2 = zzauqVar.zzb(zzaus.zzas);
        if (zzb2 != null) {
            zzauxVar = new zzauw(zzb2);
        } else {
            zzaur zzb3 = zzauqVar.zzb(zzaus.zzat);
            if (zzb3 == null) {
                throw new zzarv("Track has no sample table size information");
            }
            zzauxVar = new zzaux(zzb3);
        }
        int zza2 = zzauxVar.zza();
        if (zza2 == 0) {
            return new zzavn(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzaur zzb4 = zzauqVar.zzb(zzaus.zzau);
        if (zzb4 == null) {
            zzb4 = zzauqVar.zzb(zzaus.zzav);
            z = true;
        } else {
            z = false;
        }
        zzazg zzazgVar = zzb4.zza;
        zzazg zzazgVar2 = zzauqVar.zzb(zzaus.zzar).zza;
        zzazg zzazgVar3 = zzauqVar.zzb(zzaus.zzao).zza;
        zzaur zzb5 = zzauqVar.zzb(zzaus.zzap);
        zzazg zzazgVar4 = zzb5 != null ? zzb5.zza : null;
        zzaur zzb6 = zzauqVar.zzb(zzaus.zzaq);
        zzazg zzazgVar5 = zzb6 != null ? zzb6.zza : null;
        zzaut zzautVar = new zzaut(zzazgVar2, zzazgVar, z);
        zzazgVar3.zzv(12);
        int zzi = zzazgVar3.zzi() - 1;
        int zzi2 = zzazgVar3.zzi();
        int zzi3 = zzazgVar3.zzi();
        if (zzazgVar5 != null) {
            zzazgVar5.zzv(12);
            i = zzazgVar5.zzi();
        } else {
            i = 0;
        }
        if (zzazgVar4 != null) {
            zzazgVar4.zzv(12);
            i2 = zzazgVar4.zzi();
            if (i2 > 0) {
                i3 = zzazgVar4.zzi() - 1;
                if (zzauxVar.zzc() && "audio/raw".equals(zzavkVar.zzf.zzf) && zzi == 0) {
                    if (i != 0 && i2 == 0) {
                        int i14 = zzautVar.zza;
                        long[] jArr7 = new long[i14];
                        int[] iArr6 = new int[i14];
                        while (zzautVar.zza()) {
                            int i15 = zzautVar.zzb;
                            jArr7[i15] = zzautVar.zzd;
                            iArr6[i15] = zzautVar.zzc;
                        }
                        int zzb7 = zzauxVar.zzb();
                        long j2 = zzi3;
                        int i16 = 8192 / zzb7;
                        int i17 = 0;
                        for (int i18 = 0; i18 < i14; i18++) {
                            i17 += zzazn.zzd(iArr6[i18], i16);
                        }
                        jArr2 = new long[i17];
                        int[] iArr7 = new int[i17];
                        jArr = new long[i17];
                        int[] iArr8 = new int[i17];
                        int i19 = 0;
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 0;
                        while (i19 < i14) {
                            int i23 = iArr6[i19];
                            long j3 = jArr7[i19];
                            int i24 = i20;
                            int i25 = i21;
                            int i26 = i14;
                            int i27 = i25;
                            long[] jArr8 = jArr7;
                            int i28 = i23;
                            while (i28 > 0) {
                                int min = Math.min(i16, i28);
                                jArr2[i22] = j3;
                                int[] iArr9 = iArr6;
                                int i29 = zzb7 * min;
                                iArr7[i22] = i29;
                                int max = Math.max(i24, i29);
                                jArr[i22] = i27 * j2;
                                iArr8[i22] = 1;
                                j3 += iArr7[i22];
                                i27 += min;
                                i28 -= min;
                                i22++;
                                iArr6 = iArr9;
                                i24 = max;
                            }
                            i19++;
                            i20 = i24;
                            jArr7 = jArr8;
                            i21 = i27;
                            i14 = i26;
                        }
                        zzavkVar2 = zzavkVar;
                        iArr2 = iArr8;
                        iArr = iArr7;
                        i10 = i20;
                        j = 0;
                        jArr4 = zzavkVar2.zzi;
                        if (jArr4 != null || zzatzVar.zza()) {
                            zzazn.zzn(jArr, 1000000L, zzavkVar2.zzc);
                            return new zzavn(jArr2, iArr, i10, jArr, iArr2);
                        }
                        if (jArr4.length == 1 && zzavkVar2.zzb == 1 && (length = jArr.length) >= 2) {
                            long j4 = zzavkVar2.zzj[0];
                            long zzj = j4 + zzazn.zzj(jArr4[0], zzavkVar2.zzc, zzavkVar2.zzd);
                            long j5 = jArr[0];
                            if (j5 <= j4 && j4 < jArr[1] && jArr[length - 1] < zzj && zzj <= j) {
                                long zzj2 = zzazn.zzj(j4 - j5, zzavkVar2.zzf.zzs, zzavkVar2.zzc);
                                long zzj3 = zzazn.zzj(j - zzj, zzavkVar2.zzf.zzs, zzavkVar2.zzc);
                                if (zzj2 == 0) {
                                    if (zzj3 != 0) {
                                        zzj2 = 0;
                                    }
                                }
                                if (zzj2 <= 2147483647L && zzj3 <= 2147483647L) {
                                    zzatzVar.zzb = (int) zzj2;
                                    zzatzVar.zzc = (int) zzj3;
                                    zzazn.zzn(jArr, 1000000L, zzavkVar2.zzc);
                                    return new zzavn(jArr2, iArr, i10, jArr, iArr2);
                                }
                            }
                        }
                        long[] jArr9 = zzavkVar2.zzi;
                        if (jArr9.length == 1) {
                            char c = 0;
                            if (jArr9[0] == 0) {
                                int i30 = 0;
                                while (i30 < jArr.length) {
                                    jArr[i30] = zzazn.zzj(jArr[i30] - zzavkVar2.zzj[c], 1000000L, zzavkVar2.zzc);
                                    i30++;
                                    c = 0;
                                }
                                return new zzavn(jArr2, iArr, i10, jArr, iArr2);
                            }
                        }
                        boolean z3 = zzavkVar2.zzb == 1;
                        int i31 = 0;
                        int i32 = 0;
                        boolean z4 = false;
                        int i33 = 0;
                        while (true) {
                            long[] jArr10 = zzavkVar2.zzi;
                            if (i33 >= jArr10.length) {
                                break;
                            }
                            int[] iArr10 = iArr;
                            int i34 = i10;
                            long j6 = zzavkVar2.zzj[i33];
                            if (j6 != -1) {
                                jArr6 = jArr2;
                                long zzj4 = zzazn.zzj(jArr10[i33], zzavkVar2.zzc, zzavkVar2.zzd);
                                int zzb8 = zzazn.zzb(jArr, j6, true, true);
                                int zzb9 = zzazn.zzb(jArr, j6 + zzj4, z3, false);
                                i31 += zzb9 - zzb8;
                                z4 = (i32 != zzb8) | z4;
                                i32 = zzb9;
                            } else {
                                jArr6 = jArr2;
                            }
                            i33++;
                            iArr = iArr10;
                            jArr2 = jArr6;
                            i10 = i34;
                        }
                        long[] jArr11 = jArr2;
                        int[] iArr11 = iArr;
                        int i35 = i10;
                        boolean z5 = (i31 != zza2) | z4;
                        long[] jArr12 = z5 ? new long[i31] : jArr11;
                        int[] iArr12 = z5 ? new int[i31] : iArr11;
                        int i36 = true == z5 ? 0 : i35;
                        int[] iArr13 = z5 ? new int[i31] : iArr2;
                        long[] jArr13 = new long[i31];
                        int i37 = i36;
                        long j7 = 0;
                        int i38 = 0;
                        int i39 = 0;
                        while (true) {
                            long[] jArr14 = zzavkVar2.zzi;
                            if (i38 >= jArr14.length) {
                                break;
                            }
                            long j8 = j7;
                            long j9 = zzavkVar2.zzj[i38];
                            long j10 = jArr14[i38];
                            if (j9 != -1) {
                                int[] iArr14 = iArr13;
                                i13 = i38;
                                long zzj5 = zzazn.zzj(j10, zzavkVar2.zzc, zzavkVar2.zzd);
                                int zzb10 = zzazn.zzb(jArr, j9, true, true);
                                int zzb11 = zzazn.zzb(jArr, zzj5 + j9, z3, false);
                                if (z5) {
                                    int i40 = zzb11 - zzb10;
                                    System.arraycopy(jArr11, zzb10, jArr12, i39, i40);
                                    iArr3 = iArr11;
                                    System.arraycopy(iArr3, zzb10, iArr12, i39, i40);
                                    z2 = z3;
                                    iArr5 = iArr14;
                                    System.arraycopy(iArr2, zzb10, iArr5, i39, i40);
                                } else {
                                    iArr3 = iArr11;
                                    z2 = z3;
                                    iArr5 = iArr14;
                                }
                                int i41 = i37;
                                while (zzb10 < zzb11) {
                                    long[] jArr15 = jArr11;
                                    int[] iArr15 = iArr5;
                                    long j11 = j9;
                                    jArr13[i39] = zzazn.zzj(j8, 1000000L, zzavkVar2.zzd) + zzazn.zzj(jArr[zzb10] - j9, 1000000L, zzavkVar2.zzc);
                                    if (z5 && iArr12[i39] > i41) {
                                        i41 = iArr3[zzb10];
                                    }
                                    i39++;
                                    zzb10++;
                                    j9 = j11;
                                    iArr5 = iArr15;
                                    jArr11 = jArr15;
                                }
                                jArr5 = jArr11;
                                iArr4 = iArr5;
                                i37 = i41;
                            } else {
                                iArr3 = iArr11;
                                jArr5 = jArr11;
                                z2 = z3;
                                iArr4 = iArr13;
                                i13 = i38;
                            }
                            j7 = j8 + j10;
                            i38 = i13 + 1;
                            iArr11 = iArr3;
                            iArr13 = iArr4;
                            z3 = z2;
                            jArr11 = jArr5;
                        }
                        int[] iArr16 = iArr13;
                        int i42 = 0;
                        int i43 = 0;
                        while (true) {
                            if (i42 < iArr16.length) {
                                if (i43 != 0) {
                                    break;
                                }
                                i43 = iArr16[i42] & 1;
                                i42++;
                            } else if (i43 == 0) {
                                throw new zzarv("The edited sample sequence does not contain a sync sample.");
                            }
                        }
                        return new zzavn(jArr12, iArr12, i37, jArr13, iArr16);
                    }
                    zzi = 0;
                }
                long[] jArr16 = new long[zza2];
                int[] iArr17 = new int[zza2];
                long[] jArr17 = new long[zza2];
                i4 = i2;
                int[] iArr18 = new int[zza2];
                long j12 = 0;
                j = 0;
                int i44 = 0;
                i5 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                while (i5 < zza2) {
                    while (i46 == 0) {
                        zzayy.zze(zzautVar.zza());
                        j12 = zzautVar.zzd;
                        i46 = zzautVar.zzc;
                        zzi2 = zzi2;
                        zzi3 = zzi3;
                    }
                    int i48 = zzi2;
                    int i49 = zzi3;
                    if (zzazgVar5 != null) {
                        while (true) {
                            if (i45 != 0) {
                                break;
                            }
                            if (i <= 0) {
                                i45 = 0;
                                break;
                            }
                            i45 = zzazgVar5.zzi();
                            i47 = zzazgVar5.zze();
                            i--;
                        }
                        i45--;
                    }
                    int i50 = i47;
                    jArr16[i5] = j12;
                    int zzb12 = zzauxVar.zzb();
                    iArr17[i5] = zzb12;
                    if (zzb12 > i44) {
                        jArr3 = jArr16;
                        i44 = zzb12;
                        zzauuVar = zzauxVar;
                    } else {
                        zzauuVar = zzauxVar;
                        jArr3 = jArr16;
                    }
                    jArr17[i5] = j + i50;
                    iArr18[i5] = zzazgVar4 == null ? 1 : 0;
                    if (i5 == i3) {
                        iArr18[i5] = 1;
                        i4--;
                        if (i4 > 0) {
                            i3 = zzazgVar4.zzi() - 1;
                        }
                    }
                    int[] iArr19 = iArr18;
                    j += i49;
                    int i51 = i48 - 1;
                    if (i51 != 0) {
                        i11 = i49;
                        i12 = i51;
                    } else if (zzi > 0) {
                        i12 = zzazgVar3.zzi();
                        i11 = zzazgVar3.zzi();
                        zzi--;
                    } else {
                        i11 = i49;
                        i12 = 0;
                    }
                    int i52 = i12;
                    int i53 = i11;
                    j12 += iArr17[i5];
                    i46--;
                    i5++;
                    zzauxVar = zzauuVar;
                    jArr16 = jArr3;
                    iArr18 = iArr19;
                    zzi3 = i53;
                    i47 = i50;
                    zzi2 = i52;
                }
                long[] jArr18 = jArr16;
                int[] iArr20 = iArr18;
                int i54 = zzi2;
                zzayy.zzc(i45 != 0);
                while (i > 0) {
                    zzayy.zzc(zzazgVar5.zzi() == 0);
                    zzazgVar5.zze();
                    i--;
                }
                if (i4 != 0) {
                    if (i54 != 0) {
                        zzavkVar2 = zzavkVar;
                        i6 = i44;
                        i8 = i46;
                        i9 = i54;
                    } else if (i46 != 0) {
                        i9 = 0;
                        zzavkVar2 = zzavkVar;
                        i6 = i44;
                        i8 = i46;
                    } else {
                        if (zzi == 0) {
                            zzavkVar2 = zzavkVar;
                            i6 = i44;
                            i10 = i6;
                            iArr = iArr17;
                            jArr = jArr17;
                            jArr2 = jArr18;
                            iArr2 = iArr20;
                            jArr4 = zzavkVar2.zzi;
                            if (jArr4 != null) {
                            }
                            zzazn.zzn(jArr, 1000000L, zzavkVar2.zzc);
                            return new zzavn(jArr2, iArr, i10, jArr, iArr2);
                        }
                        i9 = 0;
                        i8 = 0;
                        zzavkVar2 = zzavkVar;
                        i6 = i44;
                    }
                    i7 = 0;
                } else {
                    zzavkVar2 = zzavkVar;
                    i6 = i44;
                    i7 = i4;
                    i8 = i46;
                    i9 = i54;
                }
                Log.w("AtomParsers", "Inconsistent stbl box for track " + zzavkVar2.zza + ": remainingSynchronizationSamples " + i7 + ", remainingSamplesAtTimestampDelta " + i9 + ", remainingSamplesInChunk " + i8 + ", remainingTimestampDeltaChanges " + zzi);
                i10 = i6;
                iArr = iArr17;
                jArr = jArr17;
                jArr2 = jArr18;
                iArr2 = iArr20;
                jArr4 = zzavkVar2.zzi;
                if (jArr4 != null) {
                }
                zzazn.zzn(jArr, 1000000L, zzavkVar2.zzc);
                return new zzavn(jArr2, iArr, i10, jArr, iArr2);
            }
            zzazgVar4 = null;
        } else {
            i2 = 0;
        }
        i3 = -1;
        if (zzauxVar.zzc()) {
            if (i != 0) {
            }
            zzi = 0;
        }
        long[] jArr162 = new long[zza2];
        int[] iArr172 = new int[zza2];
        long[] jArr172 = new long[zza2];
        i4 = i2;
        int[] iArr182 = new int[zza2];
        long j122 = 0;
        j = 0;
        int i442 = 0;
        i5 = 0;
        int i452 = 0;
        int i462 = 0;
        int i472 = 0;
        while (i5 < zza2) {
        }
        long[] jArr182 = jArr162;
        int[] iArr202 = iArr182;
        int i542 = zzi2;
        zzayy.zzc(i452 != 0);
        while (i > 0) {
        }
        if (i4 != 0) {
        }
        Log.w("AtomParsers", "Inconsistent stbl box for track " + zzavkVar2.zza + ": remainingSynchronizationSamples " + i7 + ", remainingSamplesAtTimestampDelta " + i9 + ", remainingSamplesInChunk " + i8 + ", remainingTimestampDeltaChanges " + zzi);
        i10 = i6;
        iArr = iArr172;
        jArr = jArr172;
        jArr2 = jArr182;
        iArr2 = iArr202;
        jArr4 = zzavkVar2.zzi;
        if (jArr4 != null) {
        }
        zzazn.zzn(jArr, 1000000L, zzavkVar2.zzc);
        return new zzavn(jArr2, iArr, i10, jArr, iArr2);
    }

    public static zzawd zzc(zzaur zzaurVar, boolean z) {
        if (z) {
            return null;
        }
        zzazg zzazgVar = zzaurVar.zza;
        zzazgVar.zzv(8);
        while (zzazgVar.zza() >= 8) {
            int zzc2 = zzazgVar.zzc();
            int zze2 = zzazgVar.zze();
            if (zzazgVar.zze() == zzaus.zzaD) {
                zzazgVar.zzv(zzc2);
                int i = zzc2 + zze2;
                zzazgVar.zzw(12);
                while (zzazgVar.zzc() < i) {
                    int zzc3 = zzazgVar.zzc();
                    int zze3 = zzazgVar.zze();
                    if (zzazgVar.zze() == zzaus.zzaE) {
                        zzazgVar.zzv(zzc3);
                        int i2 = zzc3 + zze3;
                        zzazgVar.zzw(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzazgVar.zzc() < i2) {
                            zzawc zza2 = zzavf.zza(zzazgVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzawd(arrayList);
                    }
                    zzazgVar.zzw(zze3 - 8);
                }
                return null;
            }
            zzazgVar.zzw(zze2 - 8);
        }
        return null;
    }

    private static int zzd(zzazg zzazgVar) {
        int zzg2 = zzazgVar.zzg();
        int i = zzg2 & WorkQueueKt.MASK;
        while ((zzg2 & 128) == 128) {
            zzg2 = zzazgVar.zzg();
            i = (i << 7) | (zzg2 & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zze(zzazg zzazgVar, int i, int i2, zzauv zzauvVar, int i3) {
        int zzc2 = zzazgVar.zzc();
        while (true) {
            if (zzc2 - i >= i2) {
                return 0;
            }
            zzazgVar.zzv(zzc2);
            int zze2 = zzazgVar.zze();
            zzayy.zzd(zze2 > 0, "childAtomSize should be positive");
            if (zzazgVar.zze() == zzaus.zzY) {
                int i4 = zzc2 + 8;
                Pair pair = null;
                Integer num = null;
                zzavl zzavlVar = null;
                boolean z = false;
                while (i4 - zzc2 < zze2) {
                    zzazgVar.zzv(i4);
                    int zze3 = zzazgVar.zze();
                    int zze4 = zzazgVar.zze();
                    if (zze4 == zzaus.zzae) {
                        num = Integer.valueOf(zzazgVar.zze());
                    } else if (zze4 == zzaus.zzZ) {
                        zzazgVar.zzw(4);
                        z = zzazgVar.zze() == zzg;
                    } else if (zze4 == zzaus.zzaa) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= zze3) {
                                zzavlVar = null;
                                break;
                            }
                            zzazgVar.zzv(i5);
                            int zze5 = zzazgVar.zze();
                            if (zzazgVar.zze() == zzaus.zzab) {
                                zzazgVar.zzw(6);
                                boolean z2 = zzazgVar.zzg() == 1;
                                int zzg2 = zzazgVar.zzg();
                                byte[] bArr = new byte[16];
                                zzazgVar.zzq(bArr, 0, 16);
                                zzavlVar = new zzavl(z2, zzg2, bArr);
                            } else {
                                i5 += zze5;
                            }
                        }
                    }
                    i4 += zze3;
                }
                if (z) {
                    zzayy.zzd(num != null, "frma atom is mandatory");
                    zzayy.zzd(zzavlVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzavlVar);
                }
                if (pair != null) {
                    zzauvVar.zza[i3] = (zzavl) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzc2 += zze2;
        }
    }

    private static Pair zzf(zzazg zzazgVar, int i) {
        zzazgVar.zzv(i + 12);
        zzazgVar.zzw(1);
        zzd(zzazgVar);
        zzazgVar.zzw(2);
        int zzg2 = zzazgVar.zzg();
        if ((zzg2 & 128) != 0) {
            zzazgVar.zzw(2);
        }
        if ((zzg2 & 64) != 0) {
            zzazgVar.zzw(zzazgVar.zzj());
        }
        if ((zzg2 & 32) != 0) {
            zzazgVar.zzw(2);
        }
        zzazgVar.zzw(1);
        zzd(zzazgVar);
        int zzg3 = zzazgVar.zzg();
        String str = null;
        if (zzg3 == 32) {
            str = "video/mp4v-es";
        } else if (zzg3 == 33) {
            str = "video/avc";
        } else if (zzg3 != 35) {
            if (zzg3 != 64) {
                if (zzg3 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (zzg3 == 165) {
                    str = "audio/ac3";
                } else if (zzg3 != 166) {
                    switch (zzg3) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (zzg3) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzazgVar.zzw(12);
        zzazgVar.zzw(1);
        int zzd2 = zzd(zzazgVar);
        byte[] bArr = new byte[zzd2];
        zzazgVar.zzq(bArr, 0, zzd2);
        return Pair.create(str, bArr);
    }
}
