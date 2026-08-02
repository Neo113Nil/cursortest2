package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzawd {
    private static final int zza = zzbar.zzg("vide");
    private static final int zzb = zzbar.zzg("soun");
    private static final int zzc = zzbar.zzg("text");
    private static final int zzd = zzbar.zzg("sbtl");
    private static final int zze = zzbar.zzg("subt");
    private static final int zzf = zzbar.zzg("clcp");
    private static final int zzg = zzbar.zzg("cenc");
    private static final int zzh = zzbar.zzg("meta");

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r12 == 0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0838 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3  */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v84 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzawo zza(zzavu zzavuVar, zzavv zzavvVar, long j, zzauv zzauvVar, boolean z) throws zzasz {
        long j2;
        int i;
        zzavv zzavvVar2;
        long j3;
        int i2;
        int i3;
        int zze2;
        int i4;
        zzavz zzavzVar;
        zzavu zza2;
        zzawo zzawoVar;
        Pair create;
        int i5;
        zzavv zzb2;
        int i6;
        boolean z2;
        int i7;
        String str;
        int i8;
        zzbak zzbakVar;
        Pair pair;
        zzawc zzawcVar;
        int i9;
        int i10;
        int i11;
        int i12;
        zzavz zzavzVar2;
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
        zzavz zzavzVar3;
        int i23;
        int i24;
        String str3;
        int i25;
        String str4;
        zzavz zzavzVar4;
        int zzc3;
        String str5;
        int i26;
        int i27;
        String str6;
        String str7;
        Object obj;
        long j4;
        zzauv zzauvVar2 = zzauvVar;
        zzavu zza3 = zzavuVar.zza(zzavw.zzH);
        zzbak zzbakVar2 = zza3.zzb(zzavw.zzV).zza;
        zzbakVar2.zzv(16);
        int zze3 = zzbakVar2.zze();
        int i28 = -1;
        int i29 = zze3 == zzb ? 1 : zze3 == zza ? 2 : (zze3 == zzc || zze3 == zzd || zze3 == zze || zze3 == zzf) ? 3 : zze3 == zzh ? 4 : -1;
        String str8 = null;
        if (i29 == -1) {
            return null;
        }
        zzbak zzbakVar3 = zzavuVar.zzb(zzavw.zzR).zza;
        zzbakVar3.zzv(8);
        int zzf2 = zzavw.zzf(zzbakVar3.zze());
        zzbakVar3.zzw(zzf2 == 0 ? 8 : 16);
        int zze4 = zzbakVar3.zze();
        zzbakVar3.zzw(4);
        int zzc4 = zzbakVar3.zzc();
        int i30 = zzf2 == 0 ? 4 : 8;
        int i31 = 0;
        while (true) {
            if (i31 >= i30) {
                zzbakVar3.zzw(i30);
                break;
            }
            if (zzbakVar3.zza[zzc4 + i31] != -1) {
                j2 = zzf2 == 0 ? zzbakVar3.zzm() : zzbakVar3.zzn();
            } else {
                i31++;
            }
        }
        j2 = -9223372036854775807L;
        zzbakVar3.zzw(16);
        int zze5 = zzbakVar3.zze();
        int zze6 = zzbakVar3.zze();
        zzbakVar3.zzw(4);
        int zze7 = zzbakVar3.zze();
        int zze8 = zzbakVar3.zze();
        int i32 = 65536;
        if (zze5 == 0) {
            if (zze6 == 65536) {
                if (zze7 != -65536) {
                    zze6 = 65536;
                } else {
                    if (zze8 == 0) {
                        i = 90;
                        zzawc zzawcVar2 = new zzawc(zze4, j2, i);
                        if (j == -9223372036854775807L) {
                            j4 = zzawcVar2.zzb;
                            j3 = j4;
                            zzavvVar2 = zzavvVar;
                        } else {
                            zzavvVar2 = zzavvVar;
                            j3 = j;
                        }
                        zzbak zzbakVar4 = zzavvVar2.zza;
                        zzbakVar4.zzv(8);
                        zzbakVar4.zzw(zzavw.zzf(zzbakVar4.zze()) == 0 ? 8 : 16);
                        long zzm = zzbakVar4.zzm();
                        long zzj = j3 == -9223372036854775807L ? -9223372036854775807L : zzbar.zzj(j3, 1000000L, zzm);
                        zzavu zza4 = zza3.zza(zzavw.zzI).zza(zzavw.zzJ);
                        zzbak zzbakVar5 = zza3.zzb(zzavw.zzU).zza;
                        zzbakVar5.zzv(8);
                        int zzf3 = zzavw.zzf(zzbakVar5.zze());
                        zzbakVar5.zzw(zzf3 == 0 ? 8 : 16);
                        long zzm2 = zzbakVar5.zzm();
                        zzbakVar5.zzw(zzf3 == 0 ? 4 : 8);
                        int zzj2 = zzbakVar5.zzj();
                        StringBuilder sb = new StringBuilder();
                        sb.append((char) (((zzj2 >> 10) & 31) + 96));
                        sb.append((char) (((zzj2 >> 5) & 31) + 96));
                        sb.append((char) ((zzj2 & 31) + 96));
                        Pair create2 = Pair.create(Long.valueOf(zzm2), sb.toString());
                        zzbak zzbakVar6 = zza4.zzb(zzavw.zzW).zza;
                        i2 = zzawcVar2.zza;
                        i3 = zzawcVar2.zzc;
                        String str9 = (String) create2.second;
                        zzbakVar6.zzv(12);
                        zze2 = zzbakVar6.zze();
                        zzavz zzavzVar5 = new zzavz(zze2);
                        i4 = 0;
                        while (i4 < zze2) {
                            int zzc5 = zzbakVar6.zzc();
                            int zze9 = zzbakVar6.zze();
                            if (zze9 > 0) {
                                i6 = i29;
                                z2 = true;
                            } else {
                                i6 = i29;
                                z2 = false;
                            }
                            String str10 = "childAtomSize should be positive";
                            zzbac.zzd(z2, "childAtomSize should be positive");
                            int zze10 = zzbakVar6.zze();
                            if (zze10 == zzavw.zze || zze10 == zzavw.zzf || zze10 == zzavw.zzac || zze10 == zzavw.zzan || zze10 == zzavw.zzg || zze10 == zzavw.zzh || zze10 == zzavw.zzi || zze10 == zzavw.zzaM || zze10 == zzavw.zzaN) {
                                int i33 = i4;
                                i7 = zze2;
                                str = str9;
                                i8 = i28;
                                zzbakVar = zzbakVar6;
                                pair = create2;
                                zzawcVar = zzawcVar2;
                                zzavz zzavzVar6 = zzavzVar5;
                                zzbakVar.zzv(zzc5 + 16);
                                zzbakVar.zzw(16);
                                int zzj3 = zzbakVar.zzj();
                                int zzj4 = zzbakVar.zzj();
                                zzbakVar.zzw(50);
                                int zzc6 = zzbakVar.zzc();
                                if (zze10 == zzavw.zzac) {
                                    i9 = i33;
                                    i10 = zze9;
                                    zze10 = zze(zzbakVar, zzc5, i10, zzavzVar6, i9);
                                    zzbakVar.zzv(zzc6);
                                } else {
                                    i9 = i33;
                                    i10 = zze9;
                                }
                                float f = 1.0f;
                                boolean z4 = false;
                                int i34 = i8;
                                String str11 = null;
                                List list = null;
                                byte[] bArr2 = null;
                                while (zzc6 - zzc5 < i10) {
                                    zzbakVar.zzv(zzc6);
                                    int zzc7 = zzbakVar.zzc();
                                    int zze11 = zzbakVar.zze();
                                    if (zze11 == 0) {
                                        if (zzbakVar.zzc() - zzc5 == i10) {
                                            break;
                                        }
                                        zze11 = 0;
                                    }
                                    zzbac.zzd(zze11 > 0, "childAtomSize should be positive");
                                    int zze12 = zzbakVar.zze();
                                    int i35 = i10;
                                    if (zze12 == zzavw.zzK) {
                                        zzbac.zze(str11 == null);
                                        zzbakVar.zzv(zzc7 + 8);
                                        zzbas zza5 = zzbas.zza(zzbakVar);
                                        list = zza5.zza;
                                        zzavzVar6.zzc = zza5.zzb;
                                        if (!z4) {
                                            f = zza5.zzc;
                                        }
                                        str11 = "video/avc";
                                    } else if (zze12 == zzavw.zzL) {
                                        zzbac.zze(str11 == null);
                                        zzbakVar.zzv(zzc7 + 8);
                                        zzbay zza6 = zzbay.zza(zzbakVar);
                                        list = zza6.zza;
                                        zzavzVar6.zzc = zza6.zzb;
                                        str11 = "video/hevc";
                                    } else if (zze12 == zzavw.zzaO) {
                                        zzbac.zze(str11 == null);
                                        str11 = zze10 == zzavw.zzaM ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    } else if (zze12 == zzavw.zzj) {
                                        zzbac.zze(str11 == null);
                                        str11 = "video/3gpp";
                                    } else {
                                        if (zze12 == zzavw.zzM) {
                                            zzbac.zze(str11 == null);
                                            Pair zzf4 = zzf(zzbakVar, zzc7);
                                            String str12 = (String) zzf4.first;
                                            list = Collections.singletonList((byte[]) zzf4.second);
                                            i14 = zze10;
                                            str11 = str12;
                                        } else if (zze12 == zzavw.zzal) {
                                            zzbakVar.zzv(zzc7 + 8);
                                            f = zzbakVar.zzi() / zzbakVar.zzi();
                                            i14 = zze10;
                                            z4 = true;
                                        } else if (zze12 == zzavw.zzaK) {
                                            int i36 = zzc7 + 8;
                                            while (true) {
                                                if (i36 - zzc7 >= zze11) {
                                                    i14 = zze10;
                                                    z3 = z4;
                                                    bArr = null;
                                                    break;
                                                }
                                                zzbakVar.zzv(i36);
                                                int zze13 = zzbakVar.zze();
                                                i14 = zze10;
                                                z3 = z4;
                                                if (zzbakVar.zze() == zzavw.zzaL) {
                                                    bArr = Arrays.copyOfRange(zzbakVar.zza, i36, zze13 + i36);
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
                                            if (zze12 == zzavw.zzaJ) {
                                                int zzg2 = zzbakVar.zzg();
                                                zzbakVar.zzw(3);
                                                if (zzg2 == 0) {
                                                    int zzg3 = zzbakVar.zzg();
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
                                                    i10 = i35;
                                                }
                                            }
                                            z4 = z5;
                                            zzc6 += zze11;
                                            zze10 = i14;
                                            i10 = i35;
                                        }
                                        zzc6 += zze11;
                                        zze10 = i14;
                                        i10 = i35;
                                    }
                                    i14 = zze10;
                                    zzc6 += zze11;
                                    zze10 = i14;
                                    i10 = i35;
                                }
                                int i37 = i10;
                                if (str11 != null) {
                                    i13 = i37;
                                    i11 = i9;
                                    byte[] bArr3 = bArr2;
                                    i12 = zzc5;
                                    zzavzVar2 = zzavzVar6;
                                    zzavzVar2.zzb = zzasw.zzl(Integer.toString(i2), str11, null, -1, -1, zzj3, zzj4, -1.0f, list, i3, f, bArr3, i34, null, zzauvVar);
                                    zzbakVar.zzv(i12 + i13);
                                    i4 = i11 + 1;
                                    zzauvVar2 = zzauvVar;
                                    zzbakVar6 = zzbakVar;
                                    zzavzVar5 = zzavzVar2;
                                    zzawcVar2 = zzawcVar;
                                    i29 = i6;
                                    i28 = i8;
                                    zze2 = i7;
                                    str9 = str;
                                    create2 = pair;
                                    str8 = null;
                                } else {
                                    i11 = i9;
                                    i12 = zzc5;
                                    zzavzVar2 = zzavzVar6;
                                    i13 = i37;
                                    zzbakVar.zzv(i12 + i13);
                                    i4 = i11 + 1;
                                    zzauvVar2 = zzauvVar;
                                    zzbakVar6 = zzbakVar;
                                    zzavzVar5 = zzavzVar2;
                                    zzawcVar2 = zzawcVar;
                                    i29 = i6;
                                    i28 = i8;
                                    zze2 = i7;
                                    str9 = str;
                                    create2 = pair;
                                    str8 = null;
                                }
                            } else {
                                if (zze10 == zzavw.zzl || zze10 == zzavw.zzad || zze10 == zzavw.zzq || zze10 == zzavw.zzs || zze10 == zzavw.zzu || zze10 == zzavw.zzx || zze10 == zzavw.zzv || zze10 == zzavw.zzw || zze10 == zzavw.zzaA || zze10 == zzavw.zzaB || zze10 == zzavw.zzo || zze10 == zzavw.zzp || zze10 == zzavw.zzm || zze10 == zzavw.zzaQ) {
                                    int i38 = i4;
                                    i7 = zze2;
                                    str2 = str9;
                                    int i39 = i28;
                                    Pair pair2 = create2;
                                    int i40 = zze9;
                                    zzavz zzavzVar7 = zzavzVar5;
                                    int i41 = zzc5;
                                    zzbakVar6.zzv(i41 + 16);
                                    if (z) {
                                        i15 = zzbakVar6.zzj();
                                        zzbakVar6.zzw(6);
                                    } else {
                                        zzbakVar6.zzw(8);
                                        i15 = 0;
                                    }
                                    if (i15 != 0) {
                                        i16 = 1;
                                        if (i15 != 1) {
                                            if (i15 == 2) {
                                                zzbakVar6.zzw(16);
                                                i18 = (int) Math.round(Double.longBitsToDouble(zzbakVar6.zzl()));
                                                i17 = zzbakVar6.zzi();
                                                zzbakVar6.zzw(20);
                                                zzc2 = zzbakVar6.zzc();
                                                if (zze10 != zzavw.zzad) {
                                                    i19 = i38;
                                                    zze10 = zze(zzbakVar6, i41, i40, zzavzVar7, i19);
                                                    zzbakVar6.zzv(zzc2);
                                                } else {
                                                    i19 = i38;
                                                }
                                                String str13 = zze10 != zzavw.zzq ? "audio/ac3" : zze10 == zzavw.zzs ? "audio/eac3" : zze10 == zzavw.zzu ? "audio/vnd.dts" : (zze10 == zzavw.zzv || zze10 == zzavw.zzw) ? "audio/vnd.dts.hd" : zze10 == zzavw.zzx ? "audio/vnd.dts.hd;profile=lbr" : zze10 == zzavw.zzaA ? "audio/3gpp" : zze10 == zzavw.zzaB ? "audio/amr-wb" : (zze10 == zzavw.zzo || zze10 == zzavw.zzp) ? "audio/raw" : zze10 == zzavw.zzm ? "audio/mpeg" : zze10 == zzavw.zzaQ ? "audio/alac" : null;
                                                int i42 = i18;
                                                int i43 = i17;
                                                byte[] bArr4 = null;
                                                while (zzc2 - i41 < i40) {
                                                    zzbakVar6.zzv(zzc2);
                                                    int zze14 = zzbakVar6.zze();
                                                    zzbac.zzd(zze14 > 0 ? i16 : 0, str10);
                                                    int zze15 = zzbakVar6.zze();
                                                    int i44 = zzavw.zzM;
                                                    if (zze15 == i44 || (z && zze15 == zzavw.zzn)) {
                                                        i23 = i19;
                                                        String str14 = str13;
                                                        i24 = i41;
                                                        str3 = str10;
                                                        i25 = i40;
                                                        str4 = str2;
                                                        zzavzVar4 = zzavzVar7;
                                                        if (zze15 != i44) {
                                                            zzc3 = zzbakVar6.zzc();
                                                            while (true) {
                                                                if (zzc3 - zzc2 >= zze14) {
                                                                    zzc3 = -1;
                                                                    break;
                                                                }
                                                                zzbakVar6.zzv(zzc3);
                                                                int zze16 = zzbakVar6.zze();
                                                                zzbac.zzd(zze16 > 0, str3);
                                                                if (zzbakVar6.zze() == zzavw.zzM) {
                                                                    break;
                                                                }
                                                                zzc3 += zze16;
                                                            }
                                                        } else {
                                                            zzc3 = zzc2;
                                                        }
                                                        if (zzc3 != -1) {
                                                            Pair zzf5 = zzf(zzbakVar6, zzc3);
                                                            String str15 = (String) zzf5.first;
                                                            bArr4 = (byte[]) zzf5.second;
                                                            if ("audio/mp4a-latm".equals(str15)) {
                                                                Pair zza7 = zzbad.zza(bArr4);
                                                                int intValue = ((Integer) zza7.first).intValue();
                                                                i43 = ((Integer) zza7.second).intValue();
                                                                str13 = str15;
                                                                i42 = intValue;
                                                            } else {
                                                                str13 = str15;
                                                            }
                                                        } else {
                                                            str13 = str14;
                                                        }
                                                    } else {
                                                        if (zze15 == zzavw.zzr) {
                                                            zzbakVar6.zzv(zzc2 + 8);
                                                            str5 = str2;
                                                            zzavzVar7.zzb = zzati.zzb(zzbakVar6, Integer.toString(i2), str5, zzauvVar2);
                                                        } else {
                                                            str5 = str2;
                                                            if (zze15 == zzavw.zzt) {
                                                                zzbakVar6.zzv(zzc2 + 8);
                                                                zzavzVar7.zzb = zzati.zzc(zzbakVar6, Integer.toString(i2), str5, zzauvVar2);
                                                            } else {
                                                                if (zze15 == zzavw.zzy) {
                                                                    i26 = zze14;
                                                                    i27 = zzc2;
                                                                    i23 = i19;
                                                                    str6 = str13;
                                                                    str4 = str5;
                                                                    i24 = i41;
                                                                    str3 = str10;
                                                                    i25 = i40;
                                                                    zzavzVar4 = zzavzVar7;
                                                                    zzavzVar4.zzb = zzasw.zzg(Integer.toString(i2), str13, null, -1, -1, i43, i42, null, zzauvVar, 0, str4);
                                                                } else {
                                                                    i26 = zze14;
                                                                    i27 = zzc2;
                                                                    i23 = i19;
                                                                    str6 = str13;
                                                                    str4 = str5;
                                                                    i24 = i41;
                                                                    str3 = str10;
                                                                    i25 = i40;
                                                                    zzavzVar4 = zzavzVar7;
                                                                    if (zze15 == zzavw.zzaQ) {
                                                                        zze14 = i26;
                                                                        byte[] bArr5 = new byte[zze14];
                                                                        zzc2 = i27;
                                                                        zzbakVar6.zzv(zzc2);
                                                                        zzbakVar6.zzq(bArr5, 0, zze14);
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
                                                        i24 = i41;
                                                        str3 = str10;
                                                        i25 = i40;
                                                        zzavzVar4 = zzavzVar7;
                                                        str13 = str6;
                                                    }
                                                    zzc2 += zze14;
                                                    zzavzVar7 = zzavzVar4;
                                                    str10 = str3;
                                                    str2 = str4;
                                                    i40 = i25;
                                                    i19 = i23;
                                                    i41 = i24;
                                                    i16 = 1;
                                                    zzauvVar2 = zzauvVar;
                                                }
                                                i20 = i19;
                                                String str16 = str13;
                                                i21 = i41;
                                                i22 = i40;
                                                str = str2;
                                                zzavzVar3 = zzavzVar7;
                                                if (zzavzVar3.zzb == null || str16 == null) {
                                                    pair = pair2;
                                                    i8 = -1;
                                                    zzbakVar = zzbakVar6;
                                                    zzawcVar = zzawcVar2;
                                                    zzavzVar2 = zzavzVar3;
                                                    i13 = i22;
                                                    i11 = i20;
                                                    i12 = i21;
                                                    zzbakVar.zzv(i12 + i13);
                                                    i4 = i11 + 1;
                                                    zzauvVar2 = zzauvVar;
                                                    zzbakVar6 = zzbakVar;
                                                    zzavzVar5 = zzavzVar2;
                                                    zzawcVar2 = zzawcVar;
                                                    i29 = i6;
                                                    i28 = i8;
                                                    zze2 = i7;
                                                    str9 = str;
                                                    create2 = pair;
                                                    str8 = null;
                                                } else {
                                                    i8 = -1;
                                                    zzbakVar = zzbakVar6;
                                                    pair = pair2;
                                                    zzawcVar = zzawcVar2;
                                                    zzavzVar3.zzb = zzasw.zzh(Integer.toString(i2), str16, null, -1, -1, i43, i42, true != "audio/raw".equals(str16) ? -1 : 2, -1, -1, bArr4 == null ? null : Collections.singletonList(bArr4), zzauvVar, 0, str, null);
                                                    zzavzVar2 = zzavzVar3;
                                                    i11 = i20;
                                                    i12 = i21;
                                                    i13 = i22;
                                                    zzbakVar.zzv(i12 + i13);
                                                    i4 = i11 + 1;
                                                    zzauvVar2 = zzauvVar;
                                                    zzbakVar6 = zzbakVar;
                                                    zzavzVar5 = zzavzVar2;
                                                    zzawcVar2 = zzawcVar;
                                                    i29 = i6;
                                                    i28 = i8;
                                                    zze2 = i7;
                                                    str9 = str;
                                                    create2 = pair;
                                                    str8 = null;
                                                }
                                            } else {
                                                pair = pair2;
                                                i8 = i39;
                                                i12 = i41;
                                                zzavzVar2 = zzavzVar7;
                                                zzbakVar = zzbakVar6;
                                                i13 = i40;
                                                zzawcVar = zzawcVar2;
                                                i11 = i38;
                                            }
                                        }
                                    } else {
                                        i16 = 1;
                                    }
                                    int zzj5 = zzbakVar6.zzj();
                                    zzbakVar6.zzw(6);
                                    i18 = zzbakVar6.zzh();
                                    if (i15 == i16) {
                                        zzbakVar6.zzw(16);
                                    }
                                    i17 = zzj5;
                                    zzc2 = zzbakVar6.zzc();
                                    if (zze10 != zzavw.zzad) {
                                    }
                                    String str132 = zze10 != zzavw.zzq ? "audio/ac3" : zze10 == zzavw.zzs ? "audio/eac3" : zze10 == zzavw.zzu ? "audio/vnd.dts" : (zze10 == zzavw.zzv || zze10 == zzavw.zzw) ? "audio/vnd.dts.hd" : zze10 == zzavw.zzx ? "audio/vnd.dts.hd;profile=lbr" : zze10 == zzavw.zzaA ? "audio/3gpp" : zze10 == zzavw.zzaB ? "audio/amr-wb" : (zze10 == zzavw.zzo || zze10 == zzavw.zzp) ? "audio/raw" : zze10 == zzavw.zzm ? "audio/mpeg" : zze10 == zzavw.zzaQ ? "audio/alac" : null;
                                    int i422 = i18;
                                    int i432 = i17;
                                    byte[] bArr42 = null;
                                    while (zzc2 - i41 < i40) {
                                    }
                                    i20 = i19;
                                    String str162 = str132;
                                    i21 = i41;
                                    i22 = i40;
                                    str = str2;
                                    zzavzVar3 = zzavzVar7;
                                    if (zzavzVar3.zzb == null) {
                                    }
                                    pair = pair2;
                                    i8 = -1;
                                    zzbakVar = zzbakVar6;
                                    zzawcVar = zzawcVar2;
                                    zzavzVar2 = zzavzVar3;
                                    i13 = i22;
                                    i11 = i20;
                                    i12 = i21;
                                    zzbakVar.zzv(i12 + i13);
                                    i4 = i11 + 1;
                                    zzauvVar2 = zzauvVar;
                                    zzbakVar6 = zzbakVar;
                                    zzavzVar5 = zzavzVar2;
                                    zzawcVar2 = zzawcVar;
                                    i29 = i6;
                                    i28 = i8;
                                    zze2 = i7;
                                    str9 = str;
                                    create2 = pair;
                                    str8 = null;
                                } else if (zze10 == zzavw.zzam || zze10 == zzavw.zzaw || zze10 == zzavw.zzax || zze10 == zzavw.zzay || zze10 == zzavw.zzaz) {
                                    zzbakVar6.zzv(zzc5 + 16);
                                    long j5 = Long.MAX_VALUE;
                                    if (zze10 == zzavw.zzam) {
                                        obj = str8;
                                        str7 = "application/ttml+xml";
                                    } else if (zze10 == zzavw.zzaw) {
                                        int i45 = zze9 - 16;
                                        byte[] bArr6 = new byte[i45];
                                        zzbakVar6.zzq(bArr6, 0, i45);
                                        Object singletonList = Collections.singletonList(bArr6);
                                        str7 = "application/x-quicktime-tx3g";
                                        obj = singletonList;
                                    } else if (zze10 == zzavw.zzax) {
                                        str7 = "application/x-mp4-vtt";
                                        obj = str8;
                                    } else if (zze10 == zzavw.zzay) {
                                        obj = str8;
                                        str7 = "application/ttml+xml";
                                        j5 = 0;
                                    } else {
                                        if (zze10 != zzavw.zzaz) {
                                            throw new IllegalStateException();
                                        }
                                        zzavzVar5.zzd = 1;
                                        str7 = "application/x-mp4-cea-608";
                                        obj = str8;
                                        zzavz zzavzVar8 = zzavzVar5;
                                        i7 = zze2;
                                        str2 = str9;
                                        zzavzVar8.zzb = zzasw.zzk(Integer.toString(i2), str7, null, -1, 0, str9, -1, zzauvVar, j5, obj);
                                        pair = create2;
                                        i8 = i28;
                                        zzavzVar2 = zzavzVar8;
                                        zzbakVar = zzbakVar6;
                                        i13 = zze9;
                                        zzawcVar = zzawcVar2;
                                        i11 = i4;
                                        i12 = zzc5;
                                    }
                                    zzavz zzavzVar82 = zzavzVar5;
                                    i7 = zze2;
                                    str2 = str9;
                                    zzavzVar82.zzb = zzasw.zzk(Integer.toString(i2), str7, null, -1, 0, str9, -1, zzauvVar, j5, obj);
                                    pair = create2;
                                    i8 = i28;
                                    zzavzVar2 = zzavzVar82;
                                    zzbakVar = zzbakVar6;
                                    i13 = zze9;
                                    zzawcVar = zzawcVar2;
                                    i11 = i4;
                                    i12 = zzc5;
                                } else {
                                    if (zze10 == zzavw.zzaP) {
                                        zzavzVar5.zzb = zzasw.zzj(Integer.toString(i2), "application/x-camera-motion", str8, i28, zzauvVar2);
                                    }
                                    i13 = zze9;
                                    i12 = zzc5;
                                    i11 = i4;
                                    zzavzVar2 = zzavzVar5;
                                    i7 = zze2;
                                    str = str9;
                                    i8 = i28;
                                    zzbakVar = zzbakVar6;
                                    pair = create2;
                                    zzawcVar = zzawcVar2;
                                    zzbakVar.zzv(i12 + i13);
                                    i4 = i11 + 1;
                                    zzauvVar2 = zzauvVar;
                                    zzbakVar6 = zzbakVar;
                                    zzavzVar5 = zzavzVar2;
                                    zzawcVar2 = zzawcVar;
                                    i29 = i6;
                                    i28 = i8;
                                    zze2 = i7;
                                    str9 = str;
                                    create2 = pair;
                                    str8 = null;
                                }
                                str = str2;
                                zzbakVar.zzv(i12 + i13);
                                i4 = i11 + 1;
                                zzauvVar2 = zzauvVar;
                                zzbakVar6 = zzbakVar;
                                zzavzVar5 = zzavzVar2;
                                zzawcVar2 = zzawcVar;
                                i29 = i6;
                                i28 = i8;
                                zze2 = i7;
                                str9 = str;
                                create2 = pair;
                                str8 = null;
                            }
                        }
                        zzavzVar = zzavzVar5;
                        int i46 = i29;
                        Pair pair3 = create2;
                        zzawc zzawcVar3 = zzawcVar2;
                        zza2 = zzavuVar.zza(zzavw.zzS);
                        if (zza2 != null || (zzb2 = zza2.zzb(zzavw.zzT)) == null) {
                            zzawoVar = null;
                            create = Pair.create(null, null);
                        } else {
                            zzbak zzbakVar7 = zzb2.zza;
                            zzbakVar7.zzv(8);
                            int zzf6 = zzavw.zzf(zzbakVar7.zze());
                            int zzi = zzbakVar7.zzi();
                            long[] jArr = new long[zzi];
                            long[] jArr2 = new long[zzi];
                            for (int i47 = 0; i47 < zzi; i47++) {
                                jArr[i47] = zzf6 == 1 ? zzbakVar7.zzn() : zzbakVar7.zzm();
                                jArr2[i47] = zzf6 == 1 ? zzbakVar7.zzl() : zzbakVar7.zze();
                                if (zzbakVar7.zzp() != 1) {
                                    throw new IllegalArgumentException("Unsupported media rate.");
                                }
                                zzbakVar7.zzw(2);
                            }
                            create = Pair.create(jArr, jArr2);
                            zzawoVar = null;
                        }
                        if (zzavzVar.zzb == null) {
                            return zzawoVar;
                        }
                        i5 = zzawcVar3.zza;
                        return new zzawo(i5, i46, ((Long) pair3.first).longValue(), zzm, zzj, zzavzVar.zzb, zzavzVar.zzd, zzavzVar.zza, zzavzVar.zzc, (long[]) create.first, (long[]) create.second);
                    }
                    zze6 = 65536;
                    zze7 = -65536;
                }
            }
            zze5 = 0;
        }
        if (zze5 == 0) {
            if (zze6 == -65536) {
                if (zze7 != 65536) {
                    i32 = zze7;
                } else if (zze8 == 0) {
                    i = 270;
                    zzawc zzawcVar22 = new zzawc(zze4, j2, i);
                    if (j == -9223372036854775807L) {
                    }
                    zzbak zzbakVar42 = zzavvVar2.zza;
                    zzbakVar42.zzv(8);
                    zzbakVar42.zzw(zzavw.zzf(zzbakVar42.zze()) == 0 ? 8 : 16);
                    long zzm3 = zzbakVar42.zzm();
                    if (j3 == -9223372036854775807L) {
                    }
                    zzavu zza42 = zza3.zza(zzavw.zzI).zza(zzavw.zzJ);
                    zzbak zzbakVar52 = zza3.zzb(zzavw.zzU).zza;
                    zzbakVar52.zzv(8);
                    int zzf32 = zzavw.zzf(zzbakVar52.zze());
                    zzbakVar52.zzw(zzf32 == 0 ? 8 : 16);
                    long zzm22 = zzbakVar52.zzm();
                    zzbakVar52.zzw(zzf32 == 0 ? 4 : 8);
                    int zzj22 = zzbakVar52.zzj();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((char) (((zzj22 >> 10) & 31) + 96));
                    sb2.append((char) (((zzj22 >> 5) & 31) + 96));
                    sb2.append((char) ((zzj22 & 31) + 96));
                    Pair create22 = Pair.create(Long.valueOf(zzm22), sb2.toString());
                    zzbak zzbakVar62 = zza42.zzb(zzavw.zzW).zza;
                    i2 = zzawcVar22.zza;
                    i3 = zzawcVar22.zzc;
                    String str92 = (String) create22.second;
                    zzbakVar62.zzv(12);
                    zze2 = zzbakVar62.zze();
                    zzavz zzavzVar52 = new zzavz(zze2);
                    i4 = 0;
                    while (i4 < zze2) {
                    }
                    zzavzVar = zzavzVar52;
                    int i462 = i29;
                    Pair pair32 = create22;
                    zzawc zzawcVar32 = zzawcVar22;
                    zza2 = zzavuVar.zza(zzavw.zzS);
                    if (zza2 != null) {
                    }
                    zzawoVar = null;
                    create = Pair.create(null, null);
                    if (zzavzVar.zzb == null) {
                    }
                }
                zze6 = -65536;
            } else {
                i32 = zze7;
            }
            zze5 = 0;
        } else {
            i32 = zze7;
        }
        i = (zze5 == -65536 && zze6 == 0 && i32 == 0 && zze8 == -65536) ? 180 : 0;
        zzawc zzawcVar222 = new zzawc(zze4, j2, i);
        if (j == -9223372036854775807L) {
        }
        zzbak zzbakVar422 = zzavvVar2.zza;
        zzbakVar422.zzv(8);
        zzbakVar422.zzw(zzavw.zzf(zzbakVar422.zze()) == 0 ? 8 : 16);
        long zzm32 = zzbakVar422.zzm();
        if (j3 == -9223372036854775807L) {
        }
        zzavu zza422 = zza3.zza(zzavw.zzI).zza(zzavw.zzJ);
        zzbak zzbakVar522 = zza3.zzb(zzavw.zzU).zza;
        zzbakVar522.zzv(8);
        int zzf322 = zzavw.zzf(zzbakVar522.zze());
        zzbakVar522.zzw(zzf322 == 0 ? 8 : 16);
        long zzm222 = zzbakVar522.zzm();
        zzbakVar522.zzw(zzf322 == 0 ? 4 : 8);
        int zzj222 = zzbakVar522.zzj();
        StringBuilder sb22 = new StringBuilder();
        sb22.append((char) (((zzj222 >> 10) & 31) + 96));
        sb22.append((char) (((zzj222 >> 5) & 31) + 96));
        sb22.append((char) ((zzj222 & 31) + 96));
        Pair create222 = Pair.create(Long.valueOf(zzm222), sb22.toString());
        zzbak zzbakVar622 = zza422.zzb(zzavw.zzW).zza;
        i2 = zzawcVar222.zza;
        i3 = zzawcVar222.zzc;
        String str922 = (String) create222.second;
        zzbakVar622.zzv(12);
        zze2 = zzbakVar622.zze();
        zzavz zzavzVar522 = new zzavz(zze2);
        i4 = 0;
        while (i4 < zze2) {
        }
        zzavzVar = zzavzVar522;
        int i4622 = i29;
        Pair pair322 = create222;
        zzawc zzawcVar322 = zzawcVar222;
        zza2 = zzavuVar.zza(zzavw.zzS);
        if (zza2 != null) {
        }
        zzawoVar = null;
        create = Pair.create(null, null);
        if (zzavzVar.zzb == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0173 A[ADDED_TO_REGION, LOOP:10: B:171:0x0173->B:172:0x0175, LOOP_START, PHI: r14 r15 r22 r25
      0x0173: PHI (r14v3 int) = (r14v1 int), (r14v10 int) binds: [B:170:0x0171, B:172:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r15v3 int) = (r15v1 int), (r15v9 int) binds: [B:170:0x0171, B:172:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r22v2 int) = (r22v1 int), (r22v5 int) binds: [B:170:0x0171, B:172:0x0175] A[DONT_GENERATE, DONT_INLINE]
      0x0173: PHI (r25v2 long) = (r25v1 long), (r25v4 long) binds: [B:170:0x0171, B:172:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzawr zzb(zzawo zzawoVar, zzavu zzavuVar, zzavd zzavdVar) throws zzasz {
        zzavy zzawbVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        zzawo zzawoVar2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr2;
        zzavy zzavyVar;
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
        zzavv zzb2 = zzavuVar.zzb(zzavw.zzas);
        if (zzb2 != null) {
            zzawbVar = new zzawa(zzb2);
        } else {
            zzavv zzb3 = zzavuVar.zzb(zzavw.zzat);
            if (zzb3 == null) {
                throw new zzasz("Track has no sample table size information");
            }
            zzawbVar = new zzawb(zzb3);
        }
        int zza2 = zzawbVar.zza();
        if (zza2 == 0) {
            return new zzawr(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzavv zzb4 = zzavuVar.zzb(zzavw.zzau);
        if (zzb4 == null) {
            zzb4 = zzavuVar.zzb(zzavw.zzav);
            z = true;
        } else {
            z = false;
        }
        zzbak zzbakVar = zzb4.zza;
        zzbak zzbakVar2 = zzavuVar.zzb(zzavw.zzar).zza;
        zzbak zzbakVar3 = zzavuVar.zzb(zzavw.zzao).zza;
        zzavv zzb5 = zzavuVar.zzb(zzavw.zzap);
        zzbak zzbakVar4 = zzb5 != null ? zzb5.zza : null;
        zzavv zzb6 = zzavuVar.zzb(zzavw.zzaq);
        zzbak zzbakVar5 = zzb6 != null ? zzb6.zza : null;
        zzavx zzavxVar = new zzavx(zzbakVar2, zzbakVar, z);
        zzbakVar3.zzv(12);
        int zzi = zzbakVar3.zzi() - 1;
        int zzi2 = zzbakVar3.zzi();
        int zzi3 = zzbakVar3.zzi();
        if (zzbakVar5 != null) {
            zzbakVar5.zzv(12);
            i = zzbakVar5.zzi();
        } else {
            i = 0;
        }
        if (zzbakVar4 != null) {
            zzbakVar4.zzv(12);
            i2 = zzbakVar4.zzi();
            if (i2 > 0) {
                i3 = zzbakVar4.zzi() - 1;
                if (zzawbVar.zzc() && "audio/raw".equals(zzawoVar.zzf.zzf) && zzi == 0) {
                    if (i != 0 && i2 == 0) {
                        int i14 = zzavxVar.zza;
                        long[] jArr7 = new long[i14];
                        int[] iArr6 = new int[i14];
                        while (zzavxVar.zza()) {
                            int i15 = zzavxVar.zzb;
                            jArr7[i15] = zzavxVar.zzd;
                            iArr6[i15] = zzavxVar.zzc;
                        }
                        int zzb7 = zzawbVar.zzb();
                        long j2 = zzi3;
                        int i16 = 8192 / zzb7;
                        int i17 = 0;
                        for (int i18 = 0; i18 < i14; i18++) {
                            i17 += zzbar.zzd(iArr6[i18], i16);
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
                        zzawoVar2 = zzawoVar;
                        iArr2 = iArr8;
                        iArr = iArr7;
                        i10 = i20;
                        j = 0;
                        jArr4 = zzawoVar2.zzi;
                        if (jArr4 != null || zzavdVar.zza()) {
                            zzbar.zzn(jArr, 1000000L, zzawoVar2.zzc);
                            return new zzawr(jArr2, iArr, i10, jArr, iArr2);
                        }
                        if (jArr4.length == 1 && zzawoVar2.zzb == 1 && (length = jArr.length) >= 2) {
                            long j4 = zzawoVar2.zzj[0];
                            long zzj = j4 + zzbar.zzj(jArr4[0], zzawoVar2.zzc, zzawoVar2.zzd);
                            long j5 = jArr[0];
                            if (j5 <= j4 && j4 < jArr[1] && jArr[length - 1] < zzj && zzj <= j) {
                                long zzj2 = zzbar.zzj(j4 - j5, zzawoVar2.zzf.zzs, zzawoVar2.zzc);
                                long zzj3 = zzbar.zzj(j - zzj, zzawoVar2.zzf.zzs, zzawoVar2.zzc);
                                if (zzj2 == 0) {
                                    if (zzj3 != 0) {
                                        zzj2 = 0;
                                    }
                                }
                                if (zzj2 <= 2147483647L && zzj3 <= 2147483647L) {
                                    zzavdVar.zzb = (int) zzj2;
                                    zzavdVar.zzc = (int) zzj3;
                                    zzbar.zzn(jArr, 1000000L, zzawoVar2.zzc);
                                    return new zzawr(jArr2, iArr, i10, jArr, iArr2);
                                }
                            }
                        }
                        long[] jArr9 = zzawoVar2.zzi;
                        if (jArr9.length == 1) {
                            char c = 0;
                            if (jArr9[0] == 0) {
                                int i30 = 0;
                                while (i30 < jArr.length) {
                                    jArr[i30] = zzbar.zzj(jArr[i30] - zzawoVar2.zzj[c], 1000000L, zzawoVar2.zzc);
                                    i30++;
                                    c = 0;
                                }
                                return new zzawr(jArr2, iArr, i10, jArr, iArr2);
                            }
                        }
                        boolean z3 = zzawoVar2.zzb == 1;
                        int i31 = 0;
                        int i32 = 0;
                        boolean z4 = false;
                        int i33 = 0;
                        while (true) {
                            long[] jArr10 = zzawoVar2.zzi;
                            if (i33 >= jArr10.length) {
                                break;
                            }
                            int[] iArr10 = iArr;
                            int i34 = i10;
                            long j6 = zzawoVar2.zzj[i33];
                            if (j6 != -1) {
                                jArr6 = jArr2;
                                long zzj4 = zzbar.zzj(jArr10[i33], zzawoVar2.zzc, zzawoVar2.zzd);
                                int zzb8 = zzbar.zzb(jArr, j6, true, true);
                                int zzb9 = zzbar.zzb(jArr, j6 + zzj4, z3, false);
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
                            long[] jArr14 = zzawoVar2.zzi;
                            if (i38 >= jArr14.length) {
                                break;
                            }
                            long j8 = j7;
                            long j9 = zzawoVar2.zzj[i38];
                            long j10 = jArr14[i38];
                            if (j9 != -1) {
                                int[] iArr14 = iArr13;
                                i13 = i38;
                                long zzj5 = zzbar.zzj(j10, zzawoVar2.zzc, zzawoVar2.zzd);
                                int zzb10 = zzbar.zzb(jArr, j9, true, true);
                                int zzb11 = zzbar.zzb(jArr, zzj5 + j9, z3, false);
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
                                    jArr13[i39] = zzbar.zzj(j8, 1000000L, zzawoVar2.zzd) + zzbar.zzj(jArr[zzb10] - j9, 1000000L, zzawoVar2.zzc);
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
                                throw new zzasz("The edited sample sequence does not contain a sync sample.");
                            }
                        }
                        return new zzawr(jArr12, iArr12, i37, jArr13, iArr16);
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
                        zzbac.zze(zzavxVar.zza());
                        j12 = zzavxVar.zzd;
                        i46 = zzavxVar.zzc;
                        zzi2 = zzi2;
                        zzi3 = zzi3;
                    }
                    int i48 = zzi2;
                    int i49 = zzi3;
                    if (zzbakVar5 != null) {
                        while (true) {
                            if (i45 != 0) {
                                break;
                            }
                            if (i <= 0) {
                                i45 = 0;
                                break;
                            }
                            i45 = zzbakVar5.zzi();
                            i47 = zzbakVar5.zze();
                            i--;
                        }
                        i45--;
                    }
                    int i50 = i47;
                    jArr16[i5] = j12;
                    int zzb12 = zzawbVar.zzb();
                    iArr17[i5] = zzb12;
                    if (zzb12 > i44) {
                        jArr3 = jArr16;
                        i44 = zzb12;
                        zzavyVar = zzawbVar;
                    } else {
                        zzavyVar = zzawbVar;
                        jArr3 = jArr16;
                    }
                    jArr17[i5] = j + i50;
                    iArr18[i5] = zzbakVar4 == null ? 1 : 0;
                    if (i5 == i3) {
                        iArr18[i5] = 1;
                        i4--;
                        if (i4 > 0) {
                            i3 = zzbakVar4.zzi() - 1;
                        }
                    }
                    int[] iArr19 = iArr18;
                    j += i49;
                    int i51 = i48 - 1;
                    if (i51 != 0) {
                        i11 = i49;
                        i12 = i51;
                    } else if (zzi > 0) {
                        i12 = zzbakVar3.zzi();
                        i11 = zzbakVar3.zzi();
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
                    zzawbVar = zzavyVar;
                    jArr16 = jArr3;
                    iArr18 = iArr19;
                    zzi3 = i53;
                    i47 = i50;
                    zzi2 = i52;
                }
                long[] jArr18 = jArr16;
                int[] iArr20 = iArr18;
                int i54 = zzi2;
                zzbac.zzc(i45 != 0);
                while (i > 0) {
                    zzbac.zzc(zzbakVar5.zzi() == 0);
                    zzbakVar5.zze();
                    i--;
                }
                if (i4 != 0) {
                    if (i54 != 0) {
                        zzawoVar2 = zzawoVar;
                        i6 = i44;
                        i8 = i46;
                        i9 = i54;
                    } else if (i46 != 0) {
                        i9 = 0;
                        zzawoVar2 = zzawoVar;
                        i6 = i44;
                        i8 = i46;
                    } else {
                        if (zzi == 0) {
                            zzawoVar2 = zzawoVar;
                            i6 = i44;
                            i10 = i6;
                            iArr = iArr17;
                            jArr = jArr17;
                            jArr2 = jArr18;
                            iArr2 = iArr20;
                            jArr4 = zzawoVar2.zzi;
                            if (jArr4 != null) {
                            }
                            zzbar.zzn(jArr, 1000000L, zzawoVar2.zzc);
                            return new zzawr(jArr2, iArr, i10, jArr, iArr2);
                        }
                        i9 = 0;
                        i8 = 0;
                        zzawoVar2 = zzawoVar;
                        i6 = i44;
                    }
                    i7 = 0;
                } else {
                    zzawoVar2 = zzawoVar;
                    i6 = i44;
                    i7 = i4;
                    i8 = i46;
                    i9 = i54;
                }
                Log.w("AtomParsers", "Inconsistent stbl box for track " + zzawoVar2.zza + ": remainingSynchronizationSamples " + i7 + ", remainingSamplesAtTimestampDelta " + i9 + ", remainingSamplesInChunk " + i8 + ", remainingTimestampDeltaChanges " + zzi);
                i10 = i6;
                iArr = iArr17;
                jArr = jArr17;
                jArr2 = jArr18;
                iArr2 = iArr20;
                jArr4 = zzawoVar2.zzi;
                if (jArr4 != null) {
                }
                zzbar.zzn(jArr, 1000000L, zzawoVar2.zzc);
                return new zzawr(jArr2, iArr, i10, jArr, iArr2);
            }
            zzbakVar4 = null;
        } else {
            i2 = 0;
        }
        i3 = -1;
        if (zzawbVar.zzc()) {
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
        zzbac.zzc(i452 != 0);
        while (i > 0) {
        }
        if (i4 != 0) {
        }
        Log.w("AtomParsers", "Inconsistent stbl box for track " + zzawoVar2.zza + ": remainingSynchronizationSamples " + i7 + ", remainingSamplesAtTimestampDelta " + i9 + ", remainingSamplesInChunk " + i8 + ", remainingTimestampDeltaChanges " + zzi);
        i10 = i6;
        iArr = iArr172;
        jArr = jArr172;
        jArr2 = jArr182;
        iArr2 = iArr202;
        jArr4 = zzawoVar2.zzi;
        if (jArr4 != null) {
        }
        zzbar.zzn(jArr, 1000000L, zzawoVar2.zzc);
        return new zzawr(jArr2, iArr, i10, jArr, iArr2);
    }

    public static zzaxh zzc(zzavv zzavvVar, boolean z) {
        if (z) {
            return null;
        }
        zzbak zzbakVar = zzavvVar.zza;
        zzbakVar.zzv(8);
        while (zzbakVar.zza() >= 8) {
            int zzc2 = zzbakVar.zzc();
            int zze2 = zzbakVar.zze();
            if (zzbakVar.zze() == zzavw.zzaD) {
                zzbakVar.zzv(zzc2);
                int i = zzc2 + zze2;
                zzbakVar.zzw(12);
                while (zzbakVar.zzc() < i) {
                    int zzc3 = zzbakVar.zzc();
                    int zze3 = zzbakVar.zze();
                    if (zzbakVar.zze() == zzavw.zzaE) {
                        zzbakVar.zzv(zzc3);
                        int i2 = zzc3 + zze3;
                        zzbakVar.zzw(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzbakVar.zzc() < i2) {
                            zzaxg zza2 = zzawj.zza(zzbakVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzaxh(arrayList);
                    }
                    zzbakVar.zzw(zze3 - 8);
                }
                return null;
            }
            zzbakVar.zzw(zze2 - 8);
        }
        return null;
    }

    private static int zzd(zzbak zzbakVar) {
        int zzg2 = zzbakVar.zzg();
        int i = zzg2 & WorkQueueKt.MASK;
        while ((zzg2 & 128) == 128) {
            zzg2 = zzbakVar.zzg();
            i = (i << 7) | (zzg2 & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zze(zzbak zzbakVar, int i, int i2, zzavz zzavzVar, int i3) {
        int zzc2 = zzbakVar.zzc();
        while (true) {
            if (zzc2 - i >= i2) {
                return 0;
            }
            zzbakVar.zzv(zzc2);
            int zze2 = zzbakVar.zze();
            zzbac.zzd(zze2 > 0, "childAtomSize should be positive");
            if (zzbakVar.zze() == zzavw.zzY) {
                int i4 = zzc2 + 8;
                Pair pair = null;
                boolean z = false;
                Integer num = null;
                zzawp zzawpVar = null;
                while (i4 - zzc2 < zze2) {
                    zzbakVar.zzv(i4);
                    int zze3 = zzbakVar.zze();
                    int zze4 = zzbakVar.zze();
                    if (zze4 == zzavw.zzae) {
                        num = Integer.valueOf(zzbakVar.zze());
                    } else if (zze4 == zzavw.zzZ) {
                        zzbakVar.zzw(4);
                        z = zzbakVar.zze() == zzg;
                    } else if (zze4 == zzavw.zzaa) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= zze3) {
                                zzawpVar = null;
                                break;
                            }
                            zzbakVar.zzv(i5);
                            int zze5 = zzbakVar.zze();
                            if (zzbakVar.zze() == zzavw.zzab) {
                                zzbakVar.zzw(6);
                                boolean z2 = zzbakVar.zzg() == 1;
                                int zzg2 = zzbakVar.zzg();
                                byte[] bArr = new byte[16];
                                zzbakVar.zzq(bArr, 0, 16);
                                zzawpVar = new zzawp(z2, zzg2, bArr);
                            } else {
                                i5 += zze5;
                            }
                        }
                    }
                    i4 += zze3;
                }
                if (z) {
                    zzbac.zzd(num != null, "frma atom is mandatory");
                    zzbac.zzd(zzawpVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzawpVar);
                }
                if (pair != null) {
                    zzavzVar.zza[i3] = (zzawp) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzc2 += zze2;
        }
    }

    private static Pair zzf(zzbak zzbakVar, int i) {
        zzbakVar.zzv(i + 12);
        zzbakVar.zzw(1);
        zzd(zzbakVar);
        zzbakVar.zzw(2);
        int zzg2 = zzbakVar.zzg();
        if ((zzg2 & 128) != 0) {
            zzbakVar.zzw(2);
        }
        if ((zzg2 & 64) != 0) {
            zzbakVar.zzw(zzbakVar.zzj());
        }
        if ((zzg2 & 32) != 0) {
            zzbakVar.zzw(2);
        }
        zzbakVar.zzw(1);
        zzd(zzbakVar);
        int zzg3 = zzbakVar.zzg();
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
        zzbakVar.zzw(12);
        zzbakVar.zzw(1);
        int zzd2 = zzd(zzbakVar);
        byte[] bArr = new byte[zzd2];
        zzbakVar.zzq(bArr, 0, zzd2);
        return Pair.create(str, bArr);
    }
}
