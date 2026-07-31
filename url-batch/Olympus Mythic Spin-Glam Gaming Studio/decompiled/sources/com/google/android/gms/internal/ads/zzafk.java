package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzafk {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Removed duplicated region for block: B:108:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0365  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzv zza(zzeu zzeuVar, String str, @Nullable String str2, @Nullable zzq zzqVar) throws zzat {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean zzi;
        int zzj;
        int zzj2;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        zzet zzetVar = new zzet();
        zzetVar.zza(zzeuVar);
        int zzc = zzetVar.zzc();
        int zzj3 = zzetVar.zzj(3);
        if (zzj3 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzj3).length() + 30);
            sb.append("Unsupported AC-4 DSI version: ");
            sb.append(zzj3);
            throw zzat.zzc(sb.toString());
        }
        int zzj4 = zzetVar.zzj(7);
        int i11 = true != zzetVar.zzi() ? 44100 : 48000;
        zzetVar.zzh(4);
        int zzj5 = zzetVar.zzj(9);
        if (zzj4 > 1) {
            if (zzj3 == 0) {
                throw zzat.zzc("Invalid AC-4 DSI version: 0");
            }
            if (zzetVar.zzi()) {
                zzetVar.zzh(16);
                if (zzetVar.zzi()) {
                    zzetVar.zzh(128);
                }
            }
        }
        if (zzj3 == 1) {
            if (!zzg(zzetVar)) {
                throw zzat.zzc("Invalid AC-4 DSI bitrate.");
            }
            zzetVar.zzm();
        }
        zzafi zzafiVar = new zzafi(null);
        for (int i12 = 0; i12 < zzj5; i12++) {
            if (zzj3 == 0) {
                zzi = zzetVar.zzi();
                zzj = zzetVar.zzj(5);
                zzj2 = zzetVar.zzj(5);
                i6 = 0;
                i7 = 0;
                z = false;
            } else {
                int zzj6 = zzetVar.zzj(8);
                i6 = zzetVar.zzj(8);
                if (i6 == 255) {
                    i6 = zzetVar.zzj(16) + 255;
                }
                if (zzj6 > 2) {
                    zzetVar.zzh(i6 * 8);
                } else {
                    int zzc2 = (zzc - zzetVar.zzc()) / 8;
                    int zzj7 = zzetVar.zzj(5);
                    zzj2 = zzj6;
                    zzj = zzj7;
                    z = zzj7 == 31;
                    i7 = zzc2;
                    zzi = false;
                }
            }
            zzafiVar.zzf = zzj2;
            if (zzi || z || zzj != 6) {
                zzafiVar.zzg = zzetVar.zzj(3);
                if (zzetVar.zzi()) {
                    zzetVar.zzh(5);
                }
                zzetVar.zzh(2);
                if (zzj3 == 1) {
                    if (zzj2 != 1) {
                        if (zzj2 == 2) {
                            zzj2 = 2;
                        }
                    }
                    zzetVar.zzh(2);
                }
                zzetVar.zzh(5);
                zzetVar.zzh(10);
                if (zzj3 == 1) {
                    if (zzj2 > 0) {
                        zzafiVar.zza = zzetVar.zzi();
                    }
                    if (zzafiVar.zza) {
                        if (zzj2 == 1) {
                            i9 = 1;
                        } else if (zzj2 == 2) {
                            i9 = 2;
                        } else {
                            i8 = 2;
                            i10 = 24;
                            i9 = zzj2;
                            zzetVar.zzh(i10);
                        }
                        int zzj8 = zzetVar.zzj(5);
                        if (zzj8 >= 0 && zzj8 <= 15) {
                            zzafiVar.zzb = zzj8;
                        }
                        if (zzj8 < 11 || zzj8 > 14) {
                            i8 = 2;
                        } else {
                            zzafiVar.zzd = zzetVar.zzi();
                            i8 = 2;
                            zzafiVar.zze = zzetVar.zzj(2);
                        }
                        i10 = 24;
                        zzetVar.zzh(i10);
                    } else {
                        i8 = 2;
                        i9 = zzj2;
                    }
                    if (zzj2 == 1 || zzj2 == i8) {
                        if (zzetVar.zzi() && zzetVar.zzi()) {
                            zzetVar.zzh(i8);
                        }
                        if (zzetVar.zzi()) {
                            zzetVar.zzg();
                            int i13 = 8;
                            int zzj9 = zzetVar.zzj(8);
                            int i14 = 0;
                            while (i14 < zzj9) {
                                zzetVar.zzh(i13);
                                i14++;
                                i13 = 8;
                            }
                        }
                    }
                    zzj2 = i9;
                }
                if (!zzi && !z) {
                    zzetVar.zzg();
                    if (zzj == 0 || zzj == 1 || zzj == 2) {
                        if (zzj2 == 0) {
                            for (int i15 = 0; i15 < 2; i15++) {
                                zzd(zzetVar, zzafiVar);
                            }
                            zzj2 = 0;
                            zzetVar.zzg();
                            if (!zzetVar.zzi()) {
                            }
                        } else {
                            int i16 = 0;
                            for (int i17 = 2; i16 < i17; i17 = 2) {
                                zze(zzetVar, zzafiVar);
                                i16++;
                            }
                            zzetVar.zzg();
                            if (!zzetVar.zzi()) {
                            }
                        }
                    } else if (zzj != 3 && zzj != 4) {
                        if (zzj != 5) {
                            int zzj10 = zzetVar.zzj(7);
                            for (int i18 = 0; i18 < zzj10; i18++) {
                                zzetVar.zzh(8);
                            }
                        } else if (zzj2 == 0) {
                            zzd(zzetVar, zzafiVar);
                            zzj2 = 0;
                        } else {
                            int zzj11 = zzetVar.zzj(3);
                            for (int i19 = 0; i19 < zzj11 + 2; i19++) {
                                zze(zzetVar, zzafiVar);
                            }
                        }
                        zzetVar.zzg();
                        if (!zzetVar.zzi()) {
                        }
                    } else if (zzj2 == 0) {
                        for (int i20 = 0; i20 < 3; i20++) {
                            zzd(zzetVar, zzafiVar);
                        }
                        zzj2 = 0;
                        zzetVar.zzg();
                        if (!zzetVar.zzi()) {
                        }
                    } else {
                        int i21 = 0;
                        for (int i22 = 3; i21 < i22; i22 = 3) {
                            zze(zzetVar, zzafiVar);
                            i21++;
                        }
                        zzetVar.zzg();
                        if (!zzetVar.zzi()) {
                        }
                    }
                } else if (zzj2 == 0) {
                    zzd(zzetVar, zzafiVar);
                    zzj2 = 0;
                    zzetVar.zzg();
                    if (!zzetVar.zzi()) {
                        i4 = 7;
                        if (zzj2 > 0) {
                            if (zzetVar.zzi() && !zzg(zzetVar)) {
                                throw zzat.zzc("Can't parse bitrate DSI.");
                            }
                            if (zzetVar.zzi()) {
                                zzetVar.zzm();
                                zzetVar.zzo(zzetVar.zzj(16));
                                i2 = 5;
                                int zzj12 = zzetVar.zzj(5);
                                for (int i23 = 0; i23 < zzj12; i23++) {
                                    zzetVar.zzh(3);
                                    zzetVar.zzh(8);
                                }
                                i = 8;
                                zzetVar.zzm();
                                if (zzj3 == 1) {
                                    int zzc3 = ((zzc - zzetVar.zzc()) / 8) - i7;
                                    if (i6 < zzc3) {
                                        throw zzat.zzc("pres_bytes is smaller than presentation bytes read.");
                                    }
                                    zzetVar.zzo(i6 - zzc3);
                                }
                                if (zzafiVar.zza) {
                                    i3 = -1;
                                    if (zzafiVar.zzb == -1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 45);
                                        sb2.append("Can't determine channel mode of presentation ");
                                        sb2.append(i12);
                                        throw zzat.zzc(sb2.toString());
                                    }
                                } else {
                                    i3 = -1;
                                }
                                if (zzafiVar.zza) {
                                    int i24 = zzafiVar.zzc;
                                    if (i24 > 0) {
                                        i2 = i24 + 1;
                                        if (zzafiVar.zzg == 4 && i2 == 17) {
                                            i2 = 21;
                                        }
                                    } else {
                                        int i25 = zzafiVar.zzg;
                                        if (i25 == 0) {
                                            i5 = 2;
                                        } else if (i25 != 1) {
                                            i5 = 2;
                                            if (i25 == 2) {
                                                i2 = i;
                                            } else if (i25 == 3) {
                                                i2 = 10;
                                            } else if (i25 != 4) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(i25).length() + 33);
                                                sb3.append("AC-4 level ");
                                                sb3.append(i25);
                                                sb3.append(" has not been defined.");
                                                zzeh.zzc("Ac4Util", sb3.toString());
                                            } else {
                                                i2 = 12;
                                            }
                                        } else {
                                            i2 = 6;
                                        }
                                        i2 = i5;
                                    }
                                } else {
                                    int i26 = zzafiVar.zzb;
                                    boolean z2 = zzafiVar.zzd;
                                    int i27 = zzafiVar.zze;
                                    switch (i26) {
                                        case 0:
                                            i2 = 1;
                                            break;
                                        case 1:
                                            i2 = 2;
                                            break;
                                        case 2:
                                            i2 = 3;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i2 = 6;
                                            break;
                                        case 5:
                                        case 7:
                                        case 9:
                                            i2 = i4;
                                            break;
                                        case 6:
                                        case 8:
                                        case 10:
                                            i2 = i;
                                            break;
                                        case 11:
                                            i2 = 11;
                                            break;
                                        case 12:
                                            i2 = 12;
                                            break;
                                        case 13:
                                            i2 = 13;
                                            break;
                                        case 14:
                                            i2 = 14;
                                            break;
                                        case 15:
                                            i2 = 24;
                                            break;
                                        default:
                                            i2 = i3;
                                            break;
                                    }
                                    if (i26 == 11 || i26 == 12 || i26 == 13 || i26 == 14) {
                                        if (!z2) {
                                            i2 -= 2;
                                        }
                                        if (i27 == 0) {
                                            i2 -= 4;
                                        } else if (i27 == 1) {
                                            i2 -= 2;
                                        }
                                    }
                                }
                                if (i2 > 0) {
                                    throw zzat.zzc("Cannot determine channel count of presentation.");
                                }
                                Object[] objArr = {Integer.valueOf(zzj4), Integer.valueOf(zzafiVar.zzf), Integer.valueOf(zzafiVar.zzg)};
                                String str3 = zzfm.zza;
                                String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                zzt zztVar = new zzt();
                                zztVar.zza(str);
                                zztVar.zzo("audio/ac4");
                                zztVar.zzH(i2);
                                zztVar.zzJ(i11);
                                zztVar.zzs(zzqVar);
                                zztVar.zze(str2);
                                zztVar.zzk(format);
                                return zztVar.zzQ();
                            }
                        }
                        i2 = 5;
                        i = 8;
                        zzetVar.zzm();
                        if (zzj3 == 1) {
                        }
                        if (zzafiVar.zza) {
                        }
                        if (zzafiVar.zza) {
                        }
                        if (i2 > 0) {
                        }
                    }
                } else {
                    zze(zzetVar, zzafiVar);
                    zzetVar.zzg();
                    if (!zzetVar.zzi()) {
                    }
                }
            }
            i4 = 7;
            int zzj13 = zzetVar.zzj(7);
            for (int i28 = 0; i28 < zzj13; i28++) {
                zzetVar.zzh(15);
            }
            if (zzj2 > 0) {
            }
            i2 = 5;
            i = 8;
            zzetVar.zzm();
            if (zzj3 == 1) {
            }
            if (zzafiVar.zza) {
            }
            if (zzafiVar.zza) {
            }
            if (i2 > 0) {
            }
        }
        i = 8;
        i2 = 5;
        i3 = -1;
        i4 = 7;
        if (zzafiVar.zza) {
        }
        if (i2 > 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r12 != 11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
    
        if (r12 != 11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if (r12 != 8) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzafj zzb(zzet zzetVar) {
        int i;
        int i2;
        int zzj;
        int zzj2 = zzetVar.zzj(16);
        int zzj3 = zzetVar.zzj(16);
        if (zzj3 == 65535) {
            zzj3 = zzetVar.zzj(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = zzj3 + i;
        if (zzj2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int zzj4 = zzetVar.zzj(2);
        int i5 = 0;
        if (zzj4 == 3) {
            int i6 = 0;
            while (true) {
                zzj = i6 + zzetVar.zzj(2);
                if (!zzetVar.zzi()) {
                    break;
                }
                i6 = (zzj + 1) << 2;
            }
            zzj4 = zzj + 3;
        }
        int i7 = zzj4;
        int zzj5 = zzetVar.zzj(10);
        if (zzetVar.zzi() && zzetVar.zzj(3) > 0) {
            zzetVar.zzh(2);
        }
        int i8 = true != zzetVar.zzi() ? 44100 : 48000;
        int zzj6 = zzetVar.zzj(4);
        if (i8 == 44100 && zzj6 == 13) {
            i2 = zzb[13];
        } else {
            if (i8 == 48000 && zzj6 < 14) {
                i5 = zzb[zzj6];
                int i9 = zzj5 % 5;
                if (i9 != 1) {
                    if (i9 == 2) {
                        if (zzj6 != 8) {
                        }
                        i5++;
                    } else if (i9 != 3) {
                        if (i9 == 4) {
                            if (zzj6 != 3) {
                                if (zzj6 != 8) {
                                }
                            }
                            i5++;
                        }
                    }
                }
                if (zzj6 != 3) {
                }
                i5++;
            }
            i2 = i5;
        }
        return new zzafj(i7, 2, i8, i4, i2, null);
    }

    public static void zzc(int i, zzeu zzeuVar) {
        zzeuVar.zza(7);
        byte[] zzi = zzeuVar.zzi();
        zzi[0] = -84;
        zzi[1] = 64;
        zzi[2] = -1;
        zzi[3] = -1;
        zzi[4] = (byte) ((i >> 16) & 255);
        zzi[5] = (byte) ((i >> 8) & 255);
        zzi[6] = (byte) (i & 255);
    }

    private static void zzd(zzet zzetVar, zzafi zzafiVar) throws zzat {
        int zzj = zzetVar.zzj(5);
        zzetVar.zzh(2);
        if (zzetVar.zzi()) {
            zzetVar.zzh(5);
        }
        if (zzj >= 7 && zzj <= 10) {
            zzetVar.zzg();
        }
        if (zzetVar.zzi()) {
            int zzj2 = zzetVar.zzj(3);
            if (zzafiVar.zzb == -1 && zzj >= 0 && zzj <= 15 && (zzj2 == 0 || zzj2 == 1)) {
                zzafiVar.zzb = zzj;
            }
            if (zzetVar.zzi()) {
                zzf(zzetVar);
            }
        }
    }

    private static void zze(zzet zzetVar, zzafi zzafiVar) throws zzat {
        zzetVar.zzh(2);
        boolean zzi = zzetVar.zzi();
        int zzj = zzetVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzetVar.zzh(2);
            if (zzetVar.zzi()) {
                zzetVar.zzh(5);
            }
            if (zzi) {
                zzetVar.zzh(24);
            } else {
                if (zzetVar.zzi()) {
                    if (!zzetVar.zzi()) {
                        zzetVar.zzh(4);
                    }
                    zzafiVar.zzc = zzetVar.zzj(6) + 1;
                }
                zzetVar.zzh(4);
            }
        }
        if (zzetVar.zzi()) {
            zzetVar.zzh(3);
            if (zzetVar.zzi()) {
                zzf(zzetVar);
            }
        }
    }

    private static void zzf(zzet zzetVar) throws zzat {
        int zzj = zzetVar.zzj(6);
        if (zzj < 2 || zzj > 42) {
            throw zzat.zzc(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(zzj)));
        }
        zzetVar.zzh(zzj * 8);
    }

    private static boolean zzg(zzet zzetVar) {
        if (zzetVar.zzc() < 66) {
            return false;
        }
        zzetVar.zzh(66);
        return true;
    }
}
