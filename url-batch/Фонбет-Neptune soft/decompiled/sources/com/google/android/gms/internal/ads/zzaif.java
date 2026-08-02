package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaif {
    private static final byte[] zza;

    static {
        int i = zzet.zza;
        zza = "OpusHead".getBytes(zzfuj.zzc);
    }

    public static zzbk zza(zzahv zzahvVar) {
        zzex zzexVar;
        zzahw zzb = zzahvVar.zzb(1751411826);
        zzahw zzb2 = zzahvVar.zzb(1801812339);
        zzahw zzb3 = zzahvVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzek zzekVar = zzb2.zza;
            zzekVar.zzK(12);
            int zzg = zzekVar.zzg();
            String[] strArr = new String[zzg];
            for (int i = 0; i < zzg; i++) {
                int zzg2 = zzekVar.zzg();
                zzekVar.zzL(4);
                strArr[i] = zzekVar.zzA(zzg2 - 8, zzfuj.zzc);
            }
            zzek zzekVar2 = zzb3.zza;
            zzekVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzekVar2.zzb() > 8) {
                int zzd = zzekVar2.zzd() + zzekVar2.zzg();
                int zzg3 = zzekVar2.zzg() - 1;
                if (zzg3 < 0 || zzg3 >= zzg) {
                    zzea.zzf("AtomParsers", "Skipped metadata with unknown key index: " + zzg3);
                } else {
                    String str = strArr[zzg3];
                    while (true) {
                        int zzd2 = zzekVar2.zzd();
                        if (zzd2 >= zzd) {
                            zzexVar = null;
                            break;
                        }
                        int zzg4 = zzekVar2.zzg();
                        if (zzekVar2.zzg() == 1684108385) {
                            int zzg5 = zzekVar2.zzg();
                            int zzg6 = zzekVar2.zzg();
                            int i2 = zzg4 - 16;
                            byte[] bArr = new byte[i2];
                            zzekVar2.zzG(bArr, 0, i2);
                            zzexVar = new zzex(str, bArr, zzg6, zzg5);
                            break;
                        }
                        zzekVar2.zzK(zzd2 + zzg4);
                    }
                    if (zzexVar != null) {
                        arrayList.add(zzexVar);
                    }
                }
                zzekVar2.zzK(zzd);
            }
            if (!arrayList.isEmpty()) {
                return new zzbk(arrayList);
            }
        }
        return null;
    }

    public static zzbk zzb(zzahw zzahwVar) {
        int zzn;
        zzek zzekVar = zzahwVar.zza;
        zzekVar.zzK(8);
        zzbk zzbkVar = new zzbk(-9223372036854775807L, new zzbj[0]);
        while (zzekVar.zzb() >= 8) {
            int zzd = zzekVar.zzd();
            int zzg = zzekVar.zzg() + zzd;
            int zzg2 = zzekVar.zzg();
            zzbk zzbkVar2 = null;
            if (zzg2 == 1835365473) {
                zzekVar.zzK(zzd);
                zzekVar.zzL(8);
                zze(zzekVar);
                while (true) {
                    if (zzekVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzekVar.zzd();
                    int zzg3 = zzekVar.zzg() + zzd2;
                    if (zzekVar.zzg() == 1768715124) {
                        zzekVar.zzK(zzd2);
                        zzekVar.zzL(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzekVar.zzd() < zzg3) {
                            zzbj zza2 = zzain.zza(zzekVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbkVar2 = new zzbk(arrayList);
                        }
                    } else {
                        zzekVar.zzK(zzg3);
                    }
                }
                zzbkVar = zzbkVar.zzd(zzbkVar2);
            } else if (zzg2 == 1936553057) {
                zzekVar.zzK(zzd);
                zzekVar.zzL(12);
                while (true) {
                    if (zzekVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzekVar.zzd();
                    int zzg4 = zzekVar.zzg();
                    if (zzekVar.zzg() != 1935766900) {
                        zzekVar.zzK(zzd3 + zzg4);
                    } else if (zzg4 >= 16) {
                        zzekVar.zzL(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzm = zzekVar.zzm();
                            int zzm2 = zzekVar.zzm();
                            if (zzm == 0) {
                                i = zzm2;
                            } else if (zzm == 1) {
                                i2 = zzm2;
                            }
                        }
                        if (i == 12) {
                            zzn = 240;
                        } else if (i == 13) {
                            zzn = 120;
                        } else {
                            if (i == 21 && zzekVar.zzb() >= 8 && zzekVar.zzd() + 8 <= zzg) {
                                int zzg5 = zzekVar.zzg();
                                int zzg6 = zzekVar.zzg();
                                if (zzg5 >= 12 && zzg6 == 1936877170) {
                                    zzn = zzekVar.zzn();
                                }
                            }
                            zzn = -2147483647;
                        }
                        if (zzn != -2147483647) {
                            zzbkVar2 = new zzbk(-9223372036854775807L, new zzagy(zzn, i2));
                        }
                    }
                }
                zzbkVar = zzbkVar.zzd(zzbkVar2);
            } else if (zzg2 == -1451722374) {
                zzbkVar = zzbkVar.zzd(zzi(zzekVar));
            }
            zzekVar.zzK(zzg);
        }
        return zzbkVar;
    }

    public static zzfd zzc(zzek zzekVar) {
        long zzt;
        long zzt2;
        zzekVar.zzK(8);
        if (zzahx.zze(zzekVar.zzg()) == 0) {
            zzt = zzekVar.zzu();
            zzt2 = zzekVar.zzu();
        } else {
            zzt = zzekVar.zzt();
            zzt2 = zzekVar.zzt();
        }
        return new zzfd(zzt, zzt2, zzekVar.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:332:0x0741, code lost:
    
        if (r13 == 1) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x071d, code lost:
    
        if (r11.zzd(1) > 0) goto L349;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0b43  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0b7a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzd(zzahv zzahvVar, zzacy zzacyVar, long j, zzy zzyVar, boolean z, boolean z2, zzful zzfulVar) throws zzbo {
        long j2;
        int i;
        long j3;
        zzahw zzb;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        zzahv zzahvVar2;
        long[] jArr;
        long[] jArr2;
        zzaiw zzaiwVar;
        int i5;
        zzful zzfulVar2;
        Pair create;
        String str;
        int i6;
        Pair pair;
        long j4;
        zzy zzyVar2;
        int i7;
        String str2;
        int i8;
        int i9;
        int i10;
        float f;
        String str3;
        byte[] bArr;
        int i11;
        int i12;
        int i13;
        int i14;
        zzaib zzaibVar;
        long j5;
        long j6;
        int i15;
        int i16;
        int i17;
        boolean z3;
        int i18;
        int i19;
        int i20;
        float f2;
        String str4;
        zzaib zzaibVar2;
        boolean z4;
        byte[] bArr2;
        boolean z5;
        int zzd;
        int i21;
        boolean z6;
        zzo zzg;
        int i22;
        int i23;
        int zzd2;
        List list;
        float f3;
        boolean z7;
        String str5;
        int i24;
        int i25;
        int i26;
        int i27;
        String str6;
        boolean z8;
        String str7;
        long j7;
        zzfxr zzn;
        long j8;
        zzaiw zzaiwVar2;
        ArrayList arrayList2;
        zzahv zzahvVar3 = zzahvVar;
        zzy zzyVar3 = zzyVar;
        ArrayList arrayList3 = new ArrayList();
        int i28 = 0;
        while (i28 < zzahvVar3.zzc.size()) {
            zzahv zzahvVar4 = (zzahv) zzahvVar3.zzc.get(i28);
            if (zzahvVar4.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i4 = i28;
            } else {
                zzahw zzb2 = zzahvVar3.zzb(1836476516);
                zzb2.getClass();
                zzahv zza2 = zzahvVar4.zza(1835297121);
                zza2.getClass();
                zzahw zzb3 = zza2.zzb(1751411826);
                zzb3.getClass();
                int zzg2 = zzg(zzb3.zza);
                int i29 = zzg2 == 1936684398 ? 1 : zzg2 == 1986618469 ? 2 : (zzg2 == 1952807028 || zzg2 == 1935832172 || zzg2 == 1937072756 || zzg2 == 1668047728) ? 3 : zzg2 == 1835365473 ? 5 : -1;
                if (i29 == -1) {
                    zzfulVar2 = zzfulVar;
                    arrayList = arrayList3;
                    i4 = i28;
                    zzahvVar2 = zzahvVar4;
                } else {
                    zzahw zzb4 = zzahvVar4.zzb(1953196132);
                    zzb4.getClass();
                    zzek zzekVar = zzb4.zza;
                    zzekVar.zzK(8);
                    int zze = zzahx.zze(zzekVar.zzg());
                    zzekVar.zzL(zze == 0 ? 8 : 16);
                    int zzg3 = zzekVar.zzg();
                    zzekVar.zzL(4);
                    int zzd3 = zzekVar.zzd();
                    int i30 = 0;
                    while (true) {
                        int i31 = zze == 0 ? 4 : 8;
                        if (i30 >= i31) {
                            zzekVar.zzL(i31);
                            break;
                        }
                        if (zzekVar.zzM()[zzd3 + i30] != -1) {
                            long zzu = zze == 0 ? zzekVar.zzu() : zzekVar.zzv();
                            if (zzu != 0) {
                                j2 = zzu;
                            }
                        } else {
                            i30++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzekVar.zzL(16);
                    int zzg4 = zzekVar.zzg();
                    int zzg5 = zzekVar.zzg();
                    zzekVar.zzL(4);
                    int zzg6 = zzekVar.zzg();
                    int zzg7 = zzekVar.zzg();
                    int i32 = 65536;
                    if (zzg4 == 0) {
                        if (zzg5 == 65536) {
                            if (zzg6 == -65536) {
                                if (zzg7 == 0) {
                                    i = 90;
                                    zzaie zzaieVar = new zzaie(zzg3, j2, i);
                                    if (j == -9223372036854775807L) {
                                        j8 = zzaieVar.zzb;
                                        j3 = j8;
                                    } else {
                                        j3 = j;
                                    }
                                    long j9 = zzc(zzb2.zza).zzc;
                                    long zzt = j3 != -9223372036854775807L ? zzet.zzt(j3, 1000000L, j9, RoundingMode.FLOOR) : -9223372036854775807L;
                                    zzahv zza3 = zza2.zza(1835626086);
                                    zza3.getClass();
                                    zzahv zza4 = zza3.zza(1937007212);
                                    zza4.getClass();
                                    zzahw zzb5 = zza2.zzb(1835296868);
                                    zzb5.getClass();
                                    zzek zzekVar2 = zzb5.zza;
                                    zzekVar2.zzK(8);
                                    int zze2 = zzahx.zze(zzekVar2.zzg());
                                    zzekVar2.zzL(zze2 == 0 ? 8 : 16);
                                    int i33 = zze2 == 0 ? 4 : 8;
                                    long zzu2 = zzekVar2.zzu();
                                    zzekVar2.zzL(i33);
                                    int zzq = zzekVar2.zzq();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((char) (((zzq >> 10) & 31) + 96));
                                    sb.append((char) (((zzq >> 5) & 31) + 96));
                                    sb.append((char) ((zzq & 31) + 96));
                                    Pair create2 = Pair.create(Long.valueOf(zzu2), sb.toString());
                                    zzb = zza4.zzb(1937011556);
                                    if (zzb == null) {
                                        throw zzbo.zza("Malformed sample table (stbl) missing sample description (stsd)", null);
                                    }
                                    i2 = zzaieVar.zza;
                                    i3 = zzaieVar.zzc;
                                    String str8 = (String) create2.second;
                                    zzek zzekVar3 = zzb.zza;
                                    zzekVar3.zzK(12);
                                    int zzg8 = zzekVar3.zzg();
                                    i4 = i28;
                                    zzaib zzaibVar3 = new zzaib(zzg8);
                                    arrayList = arrayList3;
                                    int i34 = 0;
                                    while (i34 < zzg8) {
                                        zzaie zzaieVar2 = zzaieVar;
                                        int zzd4 = zzekVar3.zzd();
                                        zzahv zzahvVar5 = zzahvVar4;
                                        int zzg9 = zzekVar3.zzg();
                                        zzaco.zzb(zzg9 > 0, "childAtomSize must be positive");
                                        int zzg10 = zzekVar3.zzg();
                                        int i35 = zzg8;
                                        if (zzg10 == 1635148593 || zzg10 == 1635148595 || zzg10 == 1701733238 || zzg10 == 1831958048 || zzg10 == 1836070006 || zzg10 == 1752589105 || zzg10 == 1751479857 || zzg10 == 1932670515 || zzg10 == 1211250227 || zzg10 == 1987063864 || zzg10 == 1987063865 || zzg10 == 1635135537 || zzg10 == 1685479798 || zzg10 == 1685479729 || zzg10 == 1685481573 || zzg10 == 1685481521) {
                                            str = str8;
                                            int i36 = i3;
                                            i6 = i29;
                                            int i37 = i2;
                                            pair = create2;
                                            j4 = j9;
                                            zzekVar3.zzK(zzd4 + 16);
                                            zzekVar3.zzL(16);
                                            int zzq2 = zzekVar3.zzq();
                                            int zzq3 = zzekVar3.zzq();
                                            zzekVar3.zzL(50);
                                            int zzd5 = zzekVar3.zzd();
                                            if (zzg10 == 1701733238) {
                                                Pair zzh = zzh(zzekVar3, zzd4, zzg9);
                                                if (zzh != null) {
                                                    int intValue = ((Integer) zzh.first).intValue();
                                                    zzyVar2 = zzyVar3 == null ? null : zzyVar3.zzb(((zzaix) zzh.second).zzb);
                                                    zzaibVar3.zza[i34] = (zzaix) zzh.second;
                                                    zzg10 = intValue;
                                                } else {
                                                    zzyVar2 = zzyVar3;
                                                    zzg10 = 1701733238;
                                                }
                                                zzekVar3.zzK(zzd5);
                                            } else {
                                                zzyVar2 = zzyVar3;
                                            }
                                            if (zzg10 == 1831958048) {
                                                int i38 = zzg10;
                                                str2 = "video/mpeg";
                                                i7 = i38;
                                            } else {
                                                i7 = 1211250227;
                                                if (zzg10 == 1211250227) {
                                                    str2 = "video/3gpp";
                                                } else {
                                                    i7 = zzg10;
                                                    str2 = null;
                                                }
                                            }
                                            int i39 = zzd5;
                                            zzy zzyVar4 = zzyVar2;
                                            i8 = i34;
                                            ByteBuffer byteBuffer = null;
                                            float f4 = 1.0f;
                                            String str9 = null;
                                            byte[] bArr3 = null;
                                            int i40 = -1;
                                            int i41 = -1;
                                            zzahz zzahzVar = null;
                                            boolean z9 = false;
                                            int i42 = 8;
                                            int i43 = 8;
                                            int i44 = -1;
                                            List list2 = null;
                                            int i45 = -1;
                                            while (true) {
                                                if (i39 - zzd4 >= zzg9) {
                                                    i9 = zzq2;
                                                    i10 = zzq3;
                                                    f = f4;
                                                    str3 = str9;
                                                    bArr = bArr3;
                                                    break;
                                                }
                                                zzekVar3.zzK(i39);
                                                int zzd6 = zzekVar3.zzd();
                                                int zzg11 = zzekVar3.zzg();
                                                if (zzg11 == 0) {
                                                    bArr = bArr3;
                                                    if (zzekVar3.zzd() - zzd4 == zzg9) {
                                                        i9 = zzq2;
                                                        i10 = zzq3;
                                                        f = f4;
                                                        str3 = str9;
                                                        break;
                                                    }
                                                    i15 = 0;
                                                } else {
                                                    bArr = bArr3;
                                                    i15 = zzg11;
                                                }
                                                if (i15 > 0) {
                                                    i16 = zzd4;
                                                    i17 = zzg9;
                                                    z3 = true;
                                                } else {
                                                    i16 = zzd4;
                                                    i17 = zzg9;
                                                    z3 = false;
                                                }
                                                zzaco.zzb(z3, "childAtomSize must be positive");
                                                int zzg12 = zzekVar3.zzg();
                                                if (zzg12 == 1635148611) {
                                                    int i46 = zzd6 + 8;
                                                    zzaco.zzb(str2 == null, null);
                                                    zzekVar3.zzK(i46);
                                                    zzabn zza5 = zzabn.zza(zzekVar3);
                                                    list = zza5.zza;
                                                    zzaibVar3.zzc = zza5.zzb;
                                                    if (z9) {
                                                        f3 = f4;
                                                        z8 = true;
                                                    } else {
                                                        f3 = zza5.zzj;
                                                        z8 = false;
                                                    }
                                                    str5 = zza5.zzk;
                                                    i41 = zza5.zzg;
                                                    i24 = zza5.zzh;
                                                    i25 = zza5.zzi;
                                                    z9 = z8;
                                                    i26 = zza5.zze;
                                                    i27 = zza5.zzf;
                                                    str6 = "video/avc";
                                                } else if (zzg12 == 1752589123) {
                                                    int i47 = zzd6 + 8;
                                                    zzaco.zzb(str2 == null, null);
                                                    zzekVar3.zzK(i47);
                                                    zzacz zza6 = zzacz.zza(zzekVar3);
                                                    list = zza6.zza;
                                                    zzaibVar3.zzc = zza6.zzb;
                                                    if (z9) {
                                                        f3 = f4;
                                                        z7 = true;
                                                    } else {
                                                        f3 = zza6.zzh;
                                                        z7 = false;
                                                    }
                                                    str5 = zza6.zzi;
                                                    i41 = zza6.zze;
                                                    i24 = zza6.zzf;
                                                    i25 = zza6.zzg;
                                                    z9 = z7;
                                                    i26 = zza6.zzc;
                                                    i27 = zza6.zzd;
                                                    str6 = "video/hevc";
                                                } else {
                                                    if (zzg12 == 1685480259 || zzg12 == 1685485123) {
                                                        i18 = i7;
                                                        i19 = zzq2;
                                                        i20 = zzq3;
                                                        f2 = f4;
                                                        str4 = str9;
                                                        zzaibVar2 = zzaibVar3;
                                                        zzace zza7 = zzace.zza(zzekVar3);
                                                        if (zza7 != null) {
                                                            str2 = "video/dolby-vision";
                                                            str9 = zza7.zza;
                                                            f4 = f2;
                                                        }
                                                        f4 = f2;
                                                        str9 = str4;
                                                    } else if (zzg12 != 1987076931) {
                                                        i18 = i7;
                                                        if (zzg12 != 1635135811) {
                                                            if (zzg12 == 1668050025) {
                                                                if (byteBuffer == null) {
                                                                    byteBuffer = zzl();
                                                                }
                                                                byteBuffer.position(21);
                                                                byteBuffer.putShort(zzekVar3.zzD());
                                                                byteBuffer.putShort(zzekVar3.zzD());
                                                                i19 = zzq2;
                                                                i20 = zzq3;
                                                                zzaibVar2 = zzaibVar3;
                                                            } else {
                                                                if (zzg12 == 1835295606) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = zzl();
                                                                    }
                                                                    short zzD = zzekVar3.zzD();
                                                                    short zzD2 = zzekVar3.zzD();
                                                                    short zzD3 = zzekVar3.zzD();
                                                                    short zzD4 = zzekVar3.zzD();
                                                                    zzaibVar2 = zzaibVar3;
                                                                    short zzD5 = zzekVar3.zzD();
                                                                    f2 = f4;
                                                                    short zzD6 = zzekVar3.zzD();
                                                                    i20 = zzq3;
                                                                    short zzD7 = zzekVar3.zzD();
                                                                    i19 = zzq2;
                                                                    short zzD8 = zzekVar3.zzD();
                                                                    long zzu3 = zzekVar3.zzu();
                                                                    long zzu4 = zzekVar3.zzu();
                                                                    str4 = str9;
                                                                    byteBuffer.position(1);
                                                                    byteBuffer.putShort(zzD5);
                                                                    byteBuffer.putShort(zzD6);
                                                                    byteBuffer.putShort(zzD);
                                                                    byteBuffer.putShort(zzD2);
                                                                    byteBuffer.putShort(zzD3);
                                                                    byteBuffer.putShort(zzD4);
                                                                    byteBuffer.putShort(zzD7);
                                                                    byteBuffer.putShort(zzD8);
                                                                    byteBuffer.putShort((short) (zzu3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                    byteBuffer.putShort((short) (zzu4 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                                } else {
                                                                    i19 = zzq2;
                                                                    i20 = zzq3;
                                                                    f2 = f4;
                                                                    str4 = str9;
                                                                    zzaibVar2 = zzaibVar3;
                                                                    if (zzg12 == 1681012275) {
                                                                        zzaco.zzb(str2 == null, null);
                                                                        str2 = "video/3gpp";
                                                                    } else if (zzg12 == 1702061171) {
                                                                        zzaco.zzb(str2 == null, null);
                                                                        zzahz zzj = zzj(zzekVar3, zzd6);
                                                                        str2 = zzj.zza;
                                                                        bArr2 = zzj.zzb;
                                                                        if (bArr2 != null) {
                                                                            zzahzVar = zzj;
                                                                            list2 = zzfxr.zzn(bArr2);
                                                                        } else {
                                                                            zzahzVar = zzj;
                                                                        }
                                                                    } else if (zzg12 == 1885434736) {
                                                                        zzekVar3.zzK(zzd6 + 8);
                                                                        f4 = zzekVar3.zzp() / zzekVar3.zzp();
                                                                        str9 = str4;
                                                                        z9 = true;
                                                                    } else if (zzg12 == 1937126244) {
                                                                        int i48 = zzd6 + 8;
                                                                        while (i48 - zzd6 < i15) {
                                                                            zzekVar3.zzK(i48);
                                                                            int zzg13 = zzekVar3.zzg() + i48;
                                                                            if (zzekVar3.zzg() == 1886547818) {
                                                                                bArr = Arrays.copyOfRange(zzekVar3.zzM(), i48, zzg13);
                                                                            } else {
                                                                                i48 = zzg13;
                                                                            }
                                                                        }
                                                                        f4 = f2;
                                                                        str9 = str4;
                                                                        bArr = null;
                                                                    } else {
                                                                        if (zzg12 == 1936995172) {
                                                                            int zzm = zzekVar3.zzm();
                                                                            zzekVar3.zzL(3);
                                                                            if (zzm == 0) {
                                                                                int zzm2 = zzekVar3.zzm();
                                                                                if (zzm2 == 0) {
                                                                                    f4 = f2;
                                                                                    str9 = str4;
                                                                                    i45 = 0;
                                                                                } else if (zzm2 == 1) {
                                                                                    f4 = f2;
                                                                                    str9 = str4;
                                                                                    i45 = 1;
                                                                                } else if (zzm2 == 2) {
                                                                                    f4 = f2;
                                                                                    str9 = str4;
                                                                                    i45 = 2;
                                                                                } else if (zzm2 == 3) {
                                                                                    f4 = f2;
                                                                                    str9 = str4;
                                                                                    i45 = 3;
                                                                                }
                                                                            }
                                                                        } else if (zzg12 == 1668246642) {
                                                                            if (i41 == -1) {
                                                                                if (i40 == -1) {
                                                                                    int zzg14 = zzekVar3.zzg();
                                                                                    if (zzg14 == 1852009592 || zzg14 == 1852009571) {
                                                                                        int zzq4 = zzekVar3.zzq();
                                                                                        int zzq5 = zzekVar3.zzq();
                                                                                        zzekVar3.zzL(2);
                                                                                        if (i15 == 19) {
                                                                                            if ((zzekVar3.zzm() & 128) != 0) {
                                                                                                i15 = 19;
                                                                                                z4 = true;
                                                                                                int zza8 = zzo.zza(zzq4);
                                                                                                int i49 = true == z4 ? 2 : 1;
                                                                                                i41 = zza8;
                                                                                                i40 = zzo.zzb(zzq5);
                                                                                                i44 = i49;
                                                                                            } else {
                                                                                                i15 = 19;
                                                                                            }
                                                                                        }
                                                                                        z4 = false;
                                                                                        int zza82 = zzo.zza(zzq4);
                                                                                        if (true == z4) {
                                                                                        }
                                                                                        i41 = zza82;
                                                                                        i40 = zzo.zzb(zzq5);
                                                                                        i44 = i49;
                                                                                    } else {
                                                                                        zzea.zzf("AtomParsers", "Unsupported color type: ".concat(zzahx.zzf(zzg14)));
                                                                                        f4 = f2;
                                                                                        str9 = str4;
                                                                                        i40 = -1;
                                                                                    }
                                                                                } else {
                                                                                    f4 = f2;
                                                                                    str9 = str4;
                                                                                }
                                                                                i41 = -1;
                                                                            }
                                                                        }
                                                                        f4 = f2;
                                                                        str9 = str4;
                                                                    }
                                                                }
                                                                f4 = f2;
                                                                str9 = str4;
                                                            }
                                                            break;
                                                        }
                                                        int i50 = i15 - 8;
                                                        byte[] bArr4 = new byte[i50];
                                                        zzekVar3.zzG(bArr4, 0, i50);
                                                        zzfxr zzn2 = zzfxr.zzn(bArr4);
                                                        zzekVar3.zzK(zzd6 + 8);
                                                        zzm zzmVar = new zzm();
                                                        byte[] zzM = zzekVar3.zzM();
                                                        zzej zzejVar = new zzej(zzM, zzM.length);
                                                        zzejVar.zzl(zzekVar3.zzd() * 8);
                                                        zzejVar.zzo(1);
                                                        int zzd7 = zzejVar.zzd(3);
                                                        zzejVar.zzn(6);
                                                        boolean zzp = zzejVar.zzp();
                                                        boolean zzp2 = zzejVar.zzp();
                                                        if (zzd7 != 2) {
                                                            z5 = true;
                                                        } else if (zzp) {
                                                            int i51 = true != zzp2 ? 10 : 12;
                                                            zzmVar.zzf(i51);
                                                            zzmVar.zza(i51);
                                                            z5 = true;
                                                            zzejVar.zzn(13);
                                                            zzejVar.zzm();
                                                            int i52 = 4;
                                                            zzd = zzejVar.zzd(4);
                                                            if (zzd == z5) {
                                                                zzea.zze("AtomParsers", "Unsupported obu_type: " + zzd);
                                                                zzg = zzmVar.zzg();
                                                            } else if (zzejVar.zzp()) {
                                                                zzea.zze("AtomParsers", "Unsupported obu_extension_flag");
                                                                zzg = zzmVar.zzg();
                                                            } else {
                                                                boolean zzp3 = zzejVar.zzp();
                                                                zzejVar.zzm();
                                                                if (!zzp3 || zzejVar.zzd(8) <= 127) {
                                                                    int zzd8 = zzejVar.zzd(3);
                                                                    zzejVar.zzm();
                                                                    if (zzejVar.zzp()) {
                                                                        zzea.zze("AtomParsers", "Unsupported reduced_still_picture_header");
                                                                        zzg = zzmVar.zzg();
                                                                    } else if (zzejVar.zzp()) {
                                                                        zzea.zze("AtomParsers", "Unsupported timing_info_present_flag");
                                                                        zzg = zzmVar.zzg();
                                                                    } else if (zzejVar.zzp()) {
                                                                        zzea.zze("AtomParsers", "Unsupported initial_display_delay_present_flag");
                                                                        zzg = zzmVar.zzg();
                                                                    } else {
                                                                        int i53 = 5;
                                                                        int zzd9 = zzejVar.zzd(5);
                                                                        int i54 = 0;
                                                                        while (i54 <= zzd9) {
                                                                            zzejVar.zzn(12);
                                                                            if (zzejVar.zzd(i53) > 7) {
                                                                                zzejVar.zzm();
                                                                            }
                                                                            i54++;
                                                                            i53 = 5;
                                                                            i52 = 4;
                                                                        }
                                                                        int zzd10 = zzejVar.zzd(i52);
                                                                        int zzd11 = zzejVar.zzd(i52);
                                                                        zzejVar.zzn(zzd10 + 1);
                                                                        zzejVar.zzn(zzd11 + 1);
                                                                        if (zzejVar.zzp()) {
                                                                            zzejVar.zzn(7);
                                                                        }
                                                                        zzejVar.zzn(7);
                                                                        boolean zzp4 = zzejVar.zzp();
                                                                        if (zzp4) {
                                                                            zzejVar.zzn(2);
                                                                        }
                                                                        int i55 = zzejVar.zzp() ? 1 : 1;
                                                                        if (!zzejVar.zzp()) {
                                                                            zzejVar.zzn(i55);
                                                                        }
                                                                        if (zzp4) {
                                                                            i21 = 3;
                                                                            zzejVar.zzn(3);
                                                                        } else {
                                                                            i21 = 3;
                                                                        }
                                                                        zzejVar.zzn(i21);
                                                                        boolean zzp5 = zzejVar.zzp();
                                                                        if (zzd8 == 2) {
                                                                            if (zzp5) {
                                                                                zzejVar.zzm();
                                                                            }
                                                                        }
                                                                        if (zzejVar.zzp()) {
                                                                            z6 = true;
                                                                            if (zzejVar.zzp()) {
                                                                                int zzd12 = zzejVar.zzd(8);
                                                                                int zzd13 = zzejVar.zzd(8);
                                                                                int zzd14 = zzejVar.zzd(8);
                                                                                if (z6) {
                                                                                    i22 = 1;
                                                                                } else {
                                                                                    i22 = 1;
                                                                                    if (zzd12 == 1) {
                                                                                        i23 = 13;
                                                                                        if (zzd13 != 13) {
                                                                                            i23 = zzd13;
                                                                                        } else if (zzd14 == 0) {
                                                                                            zzd2 = 1;
                                                                                            zzd12 = 1;
                                                                                            zzmVar.zzc(zzo.zza(zzd12));
                                                                                            zzmVar.zzb(zzd2 == i22 ? 1 : 2);
                                                                                            zzmVar.zzd(zzo.zzb(i23));
                                                                                        }
                                                                                        zzd12 = 1;
                                                                                        zzd2 = zzejVar.zzd(i22);
                                                                                        zzmVar.zzc(zzo.zza(zzd12));
                                                                                        zzmVar.zzb(zzd2 == i22 ? 1 : 2);
                                                                                        zzmVar.zzd(zzo.zzb(i23));
                                                                                    }
                                                                                }
                                                                                i23 = zzd13;
                                                                                zzd2 = zzejVar.zzd(i22);
                                                                                zzmVar.zzc(zzo.zza(zzd12));
                                                                                zzmVar.zzb(zzd2 == i22 ? 1 : 2);
                                                                                zzmVar.zzd(zzo.zzb(i23));
                                                                            }
                                                                            zzg = zzmVar.zzg();
                                                                        }
                                                                        z6 = false;
                                                                        if (zzejVar.zzp()) {
                                                                        }
                                                                        zzg = zzmVar.zzg();
                                                                    }
                                                                } else {
                                                                    zzea.zze("AtomParsers", "Excessive obu_size");
                                                                    zzg = zzmVar.zzg();
                                                                }
                                                            }
                                                            int i56 = zzg.zzd;
                                                            int i57 = zzg.zzc;
                                                            int i58 = zzg.zzb;
                                                            i19 = zzq2;
                                                            i20 = zzq3;
                                                            i44 = i57;
                                                            i42 = zzg.zzg;
                                                            zzaibVar2 = zzaibVar3;
                                                            list2 = zzn2;
                                                            i43 = zzg.zzf;
                                                            i41 = i58;
                                                            i40 = i56;
                                                            str2 = "video/av01";
                                                        } else {
                                                            z5 = true;
                                                            zzd7 = 2;
                                                            zzp = false;
                                                        }
                                                        if (zzd7 <= 2) {
                                                            int i59 = z5 != zzp ? 8 : 10;
                                                            zzmVar.zzf(i59);
                                                            zzmVar.zza(i59);
                                                        }
                                                        zzejVar.zzn(13);
                                                        zzejVar.zzm();
                                                        int i522 = 4;
                                                        zzd = zzejVar.zzd(4);
                                                        if (zzd == z5) {
                                                        }
                                                        int i562 = zzg.zzd;
                                                        int i572 = zzg.zzc;
                                                        int i582 = zzg.zzb;
                                                        i19 = zzq2;
                                                        i20 = zzq3;
                                                        i44 = i572;
                                                        i42 = zzg.zzg;
                                                        zzaibVar2 = zzaibVar3;
                                                        list2 = zzn2;
                                                        i43 = zzg.zzf;
                                                        i41 = i582;
                                                        i40 = i562;
                                                        str2 = "video/av01";
                                                    } else {
                                                        zzaco.zzb(str2 == null, null);
                                                        zzekVar3.zzK(zzd6 + 12);
                                                        zzekVar3.zzL(2);
                                                        int zzm3 = zzekVar3.zzm();
                                                        int i60 = zzm3 >> 4;
                                                        int i61 = zzm3 & 1;
                                                        int zzm4 = zzekVar3.zzm();
                                                        int zzm5 = zzekVar3.zzm();
                                                        i41 = zzo.zza(zzm4);
                                                        int i62 = 1 != i61 ? 2 : 1;
                                                        int zzb6 = zzo.zzb(zzm5);
                                                        i18 = i7;
                                                        i44 = i62;
                                                        i19 = zzq2;
                                                        i20 = zzq3;
                                                        i42 = i60;
                                                        i43 = i42;
                                                        str2 = i7 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                        i40 = zzb6;
                                                        zzaibVar2 = zzaibVar3;
                                                    }
                                                    i39 += i15;
                                                    zzd4 = i16;
                                                    bArr3 = bArr;
                                                    zzg9 = i17;
                                                    i7 = i18;
                                                    zzaibVar3 = zzaibVar2;
                                                    zzq3 = i20;
                                                    zzq2 = i19;
                                                }
                                                i18 = i7;
                                                i19 = zzq2;
                                                i20 = zzq3;
                                                i43 = i26;
                                                list2 = list;
                                                f4 = f3;
                                                str9 = str5;
                                                i44 = i24;
                                                zzaibVar2 = zzaibVar3;
                                                i40 = i25;
                                                String str10 = str6;
                                                i42 = i27;
                                                str2 = str10;
                                                i39 += i15;
                                                zzd4 = i16;
                                                bArr3 = bArr;
                                                zzg9 = i17;
                                                i7 = i18;
                                                zzaibVar3 = zzaibVar2;
                                                zzq3 = i20;
                                                zzq2 = i19;
                                            }
                                            i11 = zzd4;
                                            zzaib zzaibVar4 = zzaibVar3;
                                            i12 = zzg9;
                                            if (str2 == null) {
                                                i14 = i36;
                                                i13 = i37;
                                                zzaibVar = zzaibVar4;
                                            } else {
                                                zzad zzadVar = new zzad();
                                                i13 = i37;
                                                zzadVar.zzJ(i13);
                                                zzadVar.zzX(str2);
                                                zzadVar.zzz(str3);
                                                zzadVar.zzac(i9);
                                                zzadVar.zzI(i10);
                                                zzadVar.zzT(f);
                                                i14 = i36;
                                                zzadVar.zzW(i14);
                                                zzadVar.zzU(bArr);
                                                zzadVar.zzaa(i45);
                                                zzadVar.zzL(list2);
                                                zzadVar.zzE(zzyVar4);
                                                zzm zzmVar2 = new zzm();
                                                zzmVar2.zzc(i41);
                                                zzmVar2.zzb(i44);
                                                zzmVar2.zzd(i40);
                                                zzmVar2.zze(byteBuffer != null ? byteBuffer.array() : null);
                                                zzmVar2.zzf(i43);
                                                zzmVar2.zza(i42);
                                                zzadVar.zzA(zzmVar2.zzg());
                                                if (zzahzVar != null) {
                                                    j5 = zzahzVar.zzc;
                                                    zzadVar.zzx(zzgap.zze(j5));
                                                    j6 = zzahzVar.zzd;
                                                    zzadVar.zzS(zzgap.zze(j6));
                                                }
                                                zzaibVar = zzaibVar4;
                                                zzaibVar.zzb = zzadVar.zzad();
                                            }
                                        } else if (zzg10 == 1836069985 || zzg10 == 1701733217 || zzg10 == 1633889587 || zzg10 == 1700998451 || zzg10 == 1633889588 || zzg10 == 1835823201 || zzg10 == 1685353315 || zzg10 == 1685353317 || zzg10 == 1685353320 || zzg10 == 1685353324 || zzg10 == 1685353336 || zzg10 == 1935764850 || zzg10 == 1935767394 || zzg10 == 1819304813 || zzg10 == 1936684916 || zzg10 == 1953984371 || zzg10 == 778924082 || zzg10 == 778924083 || zzg10 == 1835557169 || zzg10 == 1835560241 || zzg10 == 1634492771 || zzg10 == 1634492791 || zzg10 == 1970037111 || zzg10 == 1332770163 || zzg10 == 1716281667) {
                                            str = str8;
                                            i6 = i29;
                                            pair = create2;
                                            j4 = j9;
                                            zzm(zzekVar3, zzg10, zzd4, zzg9, i2, str, z2, zzyVar, zzaibVar3, i34);
                                            i8 = i34;
                                            i11 = zzd4;
                                            zzaibVar = zzaibVar3;
                                            i12 = zzg9;
                                            i14 = i3;
                                            i13 = i2;
                                        } else if (zzg10 == 1414810956 || zzg10 == 1954034535 || zzg10 == 2004251764 || zzg10 == 1937010800 || zzg10 == 1664495672) {
                                            zzekVar3.zzK(zzd4 + 16);
                                            long j10 = Long.MAX_VALUE;
                                            if (zzg10 == 1414810956) {
                                                str7 = "application/ttml+xml";
                                            } else if (zzg10 == 1954034535) {
                                                int i63 = zzg9 - 16;
                                                byte[] bArr5 = new byte[i63];
                                                zzekVar3.zzG(bArr5, 0, i63);
                                                j7 = Long.MAX_VALUE;
                                                zzn = zzfxr.zzn(bArr5);
                                                str7 = "application/x-quicktime-tx3g";
                                                zzad zzadVar2 = new zzad();
                                                zzadVar2.zzJ(i2);
                                                zzadVar2.zzX(str7);
                                                zzadVar2.zzO(str8);
                                                String str11 = str8;
                                                zzadVar2.zzab(j7);
                                                zzadVar2.zzL(zzn);
                                                zzaibVar3.zzb = zzadVar2.zzad();
                                                i6 = i29;
                                                i13 = i2;
                                                pair = create2;
                                                j4 = j9;
                                                i8 = i34;
                                                i11 = zzd4;
                                                zzaibVar = zzaibVar3;
                                                i12 = zzg9;
                                                i14 = i3;
                                                str = str11;
                                            } else if (zzg10 == 2004251764) {
                                                str7 = "application/x-mp4-vtt";
                                            } else if (zzg10 == 1937010800) {
                                                j10 = 0;
                                                str7 = "application/ttml+xml";
                                            } else {
                                                zzaibVar3.zzd = 1;
                                                str7 = "application/x-mp4-cea-608";
                                            }
                                            j7 = j10;
                                            zzn = null;
                                            zzad zzadVar22 = new zzad();
                                            zzadVar22.zzJ(i2);
                                            zzadVar22.zzX(str7);
                                            zzadVar22.zzO(str8);
                                            String str112 = str8;
                                            zzadVar22.zzab(j7);
                                            zzadVar22.zzL(zzn);
                                            zzaibVar3.zzb = zzadVar22.zzad();
                                            i6 = i29;
                                            i13 = i2;
                                            pair = create2;
                                            j4 = j9;
                                            i8 = i34;
                                            i11 = zzd4;
                                            zzaibVar = zzaibVar3;
                                            i12 = zzg9;
                                            i14 = i3;
                                            str = str112;
                                        } else {
                                            if (zzg10 == 1835365492) {
                                                zzekVar3.zzK(zzd4 + 16);
                                                zzekVar3.zzx((char) 0);
                                                String zzx = zzekVar3.zzx((char) 0);
                                                if (zzx != null) {
                                                    zzad zzadVar3 = new zzad();
                                                    zzadVar3.zzJ(i2);
                                                    zzadVar3.zzX(zzx);
                                                    zzaibVar3.zzb = zzadVar3.zzad();
                                                }
                                            } else if (zzg10 == 1667329389) {
                                                zzad zzadVar4 = new zzad();
                                                zzadVar4.zzJ(i2);
                                                zzadVar4.zzX("application/x-camera-motion");
                                                zzaibVar3.zzb = zzadVar4.zzad();
                                            }
                                            str = str8;
                                            i14 = i3;
                                            i6 = i29;
                                            i13 = i2;
                                            pair = create2;
                                            j4 = j9;
                                            i8 = i34;
                                            i11 = zzd4;
                                            zzaibVar = zzaibVar3;
                                            i12 = zzg9;
                                        }
                                        zzekVar3.zzK(i11 + i12);
                                        i34 = i8 + 1;
                                        zzyVar3 = zzyVar;
                                        i3 = i14;
                                        i2 = i13;
                                        zzaibVar3 = zzaibVar;
                                        i29 = i6;
                                        zzaieVar = zzaieVar2;
                                        j9 = j4;
                                        str8 = str;
                                        zzg8 = i35;
                                        zzahvVar4 = zzahvVar5;
                                        create2 = pair;
                                    }
                                    int i64 = i29;
                                    Pair pair2 = create2;
                                    long j11 = j9;
                                    zzaie zzaieVar3 = zzaieVar;
                                    zzaib zzaibVar5 = zzaibVar3;
                                    zzahv zzahvVar6 = zzahvVar4;
                                    if (z) {
                                        zzahvVar2 = zzahvVar6;
                                    } else {
                                        zzahvVar2 = zzahvVar6;
                                        zzahv zza9 = zzahvVar2.zza(1701082227);
                                        if (zza9 != null) {
                                            zzahw zzb7 = zza9.zzb(1701606260);
                                            if (zzb7 == null) {
                                                create = null;
                                            } else {
                                                zzek zzekVar4 = zzb7.zza;
                                                zzekVar4.zzK(8);
                                                int zze3 = zzahx.zze(zzekVar4.zzg());
                                                int zzp6 = zzekVar4.zzp();
                                                long[] jArr3 = new long[zzp6];
                                                long[] jArr4 = new long[zzp6];
                                                for (int i65 = 0; i65 < zzp6; i65++) {
                                                    jArr3[i65] = zze3 == 1 ? zzekVar4.zzv() : zzekVar4.zzu();
                                                    jArr4[i65] = zze3 == 1 ? zzekVar4.zzt() : zzekVar4.zzg();
                                                    if (zzekVar4.zzD() != 1) {
                                                        throw new IllegalArgumentException("Unsupported media rate.");
                                                    }
                                                    zzekVar4.zzL(2);
                                                }
                                                create = Pair.create(jArr3, jArr4);
                                            }
                                            if (create != null) {
                                                jArr = (long[]) create.first;
                                                jArr2 = (long[]) create.second;
                                                if (zzaibVar5.zzb != null) {
                                                    zzfulVar2 = zzfulVar;
                                                } else {
                                                    i5 = zzaieVar3.zza;
                                                    zzaiwVar = new zzaiw(i5, i64, ((Long) pair2.first).longValue(), j11, zzt, zzaibVar5.zzb, zzaibVar5.zzd, zzaibVar5.zza, zzaibVar5.zzc, jArr, jArr2);
                                                    zzfulVar2 = zzfulVar;
                                                    zzaiwVar2 = (zzaiw) zzfulVar2.apply(zzaiwVar);
                                                    if (zzaiwVar2 == null) {
                                                        zzahv zza10 = zzahvVar2.zza(1835297121);
                                                        zza10.getClass();
                                                        zzahv zza11 = zza10.zza(1835626086);
                                                        zza11.getClass();
                                                        zzahv zza12 = zza11.zza(1937007212);
                                                        zza12.getClass();
                                                        zzaiz zzk = zzk(zzaiwVar2, zza12, zzacyVar);
                                                        arrayList2 = arrayList;
                                                        arrayList2.add(zzk);
                                                    } else {
                                                        arrayList2 = arrayList;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    if (zzaibVar5.zzb != null) {
                                    }
                                } else {
                                    zzg6 = -65536;
                                }
                            }
                            zzg4 = 0;
                            zzg5 = 65536;
                        } else {
                            zzg4 = 0;
                        }
                    }
                    if (zzg4 != 0) {
                        i32 = zzg6;
                    } else if (zzg5 == -65536) {
                        if (zzg6 != 65536) {
                            i32 = zzg6;
                        } else if (zzg7 == 0) {
                            i = 270;
                            zzaie zzaieVar4 = new zzaie(zzg3, j2, i);
                            if (j == -9223372036854775807L) {
                            }
                            long j92 = zzc(zzb2.zza).zzc;
                            if (j3 != -9223372036854775807L) {
                            }
                            zzahv zza32 = zza2.zza(1835626086);
                            zza32.getClass();
                            zzahv zza42 = zza32.zza(1937007212);
                            zza42.getClass();
                            zzahw zzb52 = zza2.zzb(1835296868);
                            zzb52.getClass();
                            zzek zzekVar22 = zzb52.zza;
                            zzekVar22.zzK(8);
                            int zze22 = zzahx.zze(zzekVar22.zzg());
                            zzekVar22.zzL(zze22 == 0 ? 8 : 16);
                            if (zze22 == 0) {
                            }
                            long zzu22 = zzekVar22.zzu();
                            zzekVar22.zzL(i33);
                            int zzq6 = zzekVar22.zzq();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((char) (((zzq6 >> 10) & 31) + 96));
                            sb2.append((char) (((zzq6 >> 5) & 31) + 96));
                            sb2.append((char) ((zzq6 & 31) + 96));
                            Pair create22 = Pair.create(Long.valueOf(zzu22), sb2.toString());
                            zzb = zza42.zzb(1937011556);
                            if (zzb == null) {
                            }
                        }
                        zzg4 = 0;
                        zzg5 = -65536;
                    } else {
                        i32 = zzg6;
                        zzg4 = 0;
                    }
                    i = (zzg4 == -65536 && zzg5 == 0 && i32 == 0 && zzg7 == -65536) ? Opcodes.GETFIELD : 0;
                    zzaie zzaieVar42 = new zzaie(zzg3, j2, i);
                    if (j == -9223372036854775807L) {
                    }
                    long j922 = zzc(zzb2.zza).zzc;
                    if (j3 != -9223372036854775807L) {
                    }
                    zzahv zza322 = zza2.zza(1835626086);
                    zza322.getClass();
                    zzahv zza422 = zza322.zza(1937007212);
                    zza422.getClass();
                    zzahw zzb522 = zza2.zzb(1835296868);
                    zzb522.getClass();
                    zzek zzekVar222 = zzb522.zza;
                    zzekVar222.zzK(8);
                    int zze222 = zzahx.zze(zzekVar222.zzg());
                    zzekVar222.zzL(zze222 == 0 ? 8 : 16);
                    if (zze222 == 0) {
                    }
                    long zzu222 = zzekVar222.zzu();
                    zzekVar222.zzL(i33);
                    int zzq62 = zzekVar222.zzq();
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append((char) (((zzq62 >> 10) & 31) + 96));
                    sb22.append((char) (((zzq62 >> 5) & 31) + 96));
                    sb22.append((char) ((zzq62 & 31) + 96));
                    Pair create222 = Pair.create(Long.valueOf(zzu222), sb22.toString());
                    zzb = zza422.zzb(1937011556);
                    if (zzb == null) {
                    }
                }
                zzaiwVar = null;
                zzaiwVar2 = (zzaiw) zzfulVar2.apply(zzaiwVar);
                if (zzaiwVar2 == null) {
                }
            }
            i28 = i4 + 1;
            zzahvVar3 = zzahvVar;
            zzyVar3 = zzyVar;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zze(zzek zzekVar) {
        int zzd = zzekVar.zzd();
        zzekVar.zzL(4);
        if (zzekVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzekVar.zzK(zzd);
    }

    private static int zzf(zzek zzekVar) {
        int zzm = zzekVar.zzm();
        int i = zzm & 127;
        while ((zzm & 128) == 128) {
            zzm = zzekVar.zzm();
            i = (i << 7) | (zzm & 127);
        }
        return i;
    }

    private static int zzg(zzek zzekVar) {
        zzekVar.zzK(16);
        return zzekVar.zzg();
    }

    private static Pair zzh(zzek zzekVar, int i, int i2) throws zzbo {
        Integer num;
        zzaix zzaixVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzd = zzekVar.zzd();
        while (zzd - i < i2) {
            zzekVar.zzK(zzd);
            int zzg = zzekVar.zzg();
            zzaco.zzb(zzg > 0, "childAtomSize must be positive");
            if (zzekVar.zzg() == 1936289382) {
                int i5 = zzd + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - zzd < zzg) {
                    zzekVar.zzK(i5);
                    int zzg2 = zzekVar.zzg();
                    int zzg3 = zzekVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzekVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzekVar.zzL(4);
                        str = zzekVar.zzA(4, zzfuj.zzc);
                    } else if (zzg3 == 1935894633) {
                        i6 = i5;
                        i7 = zzg2;
                    }
                    i5 += zzg2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzaco.zzb(num2 != null, "frma atom is mandatory");
                    zzaco.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzaixVar = null;
                            break;
                        }
                        zzekVar.zzK(i8);
                        int zzg4 = zzekVar.zzg();
                        if (zzekVar.zzg() == 1952804451) {
                            int zze = zzahx.zze(zzekVar.zzg());
                            zzekVar.zzL(1);
                            if (zze == 0) {
                                zzekVar.zzL(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzm = zzekVar.zzm();
                                int i9 = (zzm & 240) >> 4;
                                i3 = zzm & 15;
                                i4 = i9;
                            }
                            boolean z = zzekVar.zzm() == 1;
                            int zzm2 = zzekVar.zzm();
                            byte[] bArr2 = new byte[16];
                            zzekVar.zzG(bArr2, 0, 16);
                            if (z && zzm2 == 0) {
                                int zzm3 = zzekVar.zzm();
                                byte[] bArr3 = new byte[zzm3];
                                zzekVar.zzG(bArr3, 0, zzm3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaixVar = new zzaix(z, str, zzm2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzg4;
                        }
                    }
                    zzaco.zzb(zzaixVar != null, "tenc atom is mandatory");
                    int i10 = zzet.zza;
                    create = Pair.create(num, zzaixVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    private static zzbk zzi(zzek zzekVar) {
        short zzD = zzekVar.zzD();
        zzekVar.zzL(2);
        String zzA = zzekVar.zzA(zzD, zzfuj.zzc);
        int max = Math.max(zzA.lastIndexOf(43), zzA.lastIndexOf(45));
        try {
            return new zzbk(-9223372036854775807L, new zzfa(Float.parseFloat(zzA.substring(0, max)), Float.parseFloat(zzA.substring(max, zzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzahz zzj(zzek zzekVar, int i) {
        zzekVar.zzK(i + 12);
        zzekVar.zzL(1);
        zzf(zzekVar);
        zzekVar.zzL(2);
        int zzm = zzekVar.zzm();
        if ((zzm & 128) != 0) {
            zzekVar.zzL(2);
        }
        if ((zzm & 64) != 0) {
            zzekVar.zzL(zzekVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzekVar.zzL(2);
        }
        zzekVar.zzL(1);
        zzf(zzekVar);
        String zzd = zzbn.zzd(zzekVar.zzm());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzahz(zzd, null, -1L, -1L);
        }
        zzekVar.zzL(4);
        long zzu = zzekVar.zzu();
        long zzu2 = zzekVar.zzu();
        zzekVar.zzL(1);
        int zzf = zzf(zzekVar);
        byte[] bArr = new byte[zzf];
        zzekVar.zzG(bArr, 0, zzf);
        return new zzahz(zzd, bArr, zzu2 <= 0 ? -1L : zzu2, zzu > 0 ? zzu : -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0353  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzaiz zzk(zzaiw zzaiwVar, zzahv zzahvVar, zzacy zzacyVar) throws zzbo {
        zzaia zzaidVar;
        boolean z;
        int i;
        int i2;
        int i3;
        long[] jArr;
        int i4;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        long[] jArr2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzaiw zzaiwVar2;
        int i12;
        int[] iArr;
        long[] jArr3;
        int[] iArr2;
        int i13;
        int[] iArr3;
        int i14;
        long j;
        int i15;
        int i16;
        int i17;
        long[] jArr4;
        int i18;
        int i19;
        long[] jArr5;
        int[] iArr4;
        int[] iArr5;
        int i20;
        int i21;
        boolean z4;
        int i22;
        int i23;
        int length;
        zzahw zzb = zzahvVar.zzb(1937011578);
        if (zzb != null) {
            zzaidVar = new zzaic(zzb, zzaiwVar.zzf);
        } else {
            zzahw zzb2 = zzahvVar.zzb(1937013298);
            if (zzb2 == null) {
                throw zzbo.zza("Track has no sample table size information", null);
            }
            zzaidVar = new zzaid(zzb2);
        }
        int zzb3 = zzaidVar.zzb();
        if (zzb3 == 0) {
            return new zzaiz(zzaiwVar, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        zzahw zzb4 = zzahvVar.zzb(1937007471);
        if (zzb4 == null) {
            zzb4 = zzahvVar.zzb(1668232756);
            zzb4.getClass();
            z = true;
        } else {
            z = false;
        }
        zzahw zzb5 = zzahvVar.zzb(1937011555);
        zzb5.getClass();
        zzahw zzb6 = zzahvVar.zzb(1937011827);
        zzb6.getClass();
        zzahw zzb7 = zzahvVar.zzb(1937011571);
        zzek zzekVar = zzb7 != null ? zzb7.zza : null;
        zzahw zzb8 = zzahvVar.zzb(1668576371);
        zzek zzekVar2 = zzb8 != null ? zzb8.zza : null;
        zzek zzekVar3 = zzb6.zza;
        zzahy zzahyVar = new zzahy(zzb5.zza, zzb4.zza, z);
        zzekVar3.zzK(12);
        int zzp = zzekVar3.zzp() - 1;
        int zzp2 = zzekVar3.zzp();
        int zzp3 = zzekVar3.zzp();
        if (zzekVar2 != null) {
            zzekVar2.zzK(12);
            i = zzekVar2.zzp();
        } else {
            i = 0;
        }
        if (zzekVar != null) {
            zzekVar.zzK(12);
            i3 = zzekVar.zzp();
            if (i3 > 0) {
                i2 = zzekVar.zzp() - 1;
            } else {
                zzekVar = null;
                i2 = -1;
            }
        } else {
            i2 = -1;
            i3 = 0;
        }
        int zza2 = zzaidVar.zza();
        String str = zzaiwVar.zzf.zzm;
        if (zza2 != -1 && (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzp == 0)) {
            if (i == 0 && i3 == 0) {
                int i24 = zzahyVar.zza;
                long[] jArr6 = new long[i24];
                int[] iArr6 = new int[i24];
                while (zzahyVar.zza()) {
                    int i25 = zzahyVar.zzb;
                    jArr6[i25] = zzahyVar.zzd;
                    iArr6[i25] = zzahyVar.zzc;
                }
                long j2 = zzp3;
                int i26 = 8192 / zza2;
                int i27 = 0;
                for (int i28 = 0; i28 < i24; i28++) {
                    int i29 = iArr6[i28];
                    int i30 = zzet.zza;
                    i27 += ((i29 + i26) - 1) / i26;
                }
                long[] jArr7 = new long[i27];
                int[] iArr7 = new int[i27];
                long[] jArr8 = new long[i27];
                int[] iArr8 = new int[i27];
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (i31 < i24) {
                    int i35 = iArr6[i31];
                    long j3 = jArr6[i31];
                    int i36 = i24;
                    int i37 = i35;
                    while (i37 > 0) {
                        int min = Math.min(i26, i37);
                        jArr7[i34] = j3;
                        long[] jArr9 = jArr6;
                        int i38 = zza2 * min;
                        iArr7[i34] = i38;
                        i33 = Math.max(i33, i38);
                        jArr8[i34] = i32 * j2;
                        iArr8[i34] = 1;
                        j3 += iArr7[i34];
                        i32 += min;
                        i37 -= min;
                        i34++;
                        jArr6 = jArr9;
                        iArr6 = iArr6;
                    }
                    i31++;
                    i24 = i36;
                }
                i14 = zzb3;
                j = j2 * i32;
                jArr3 = jArr7;
                iArr2 = iArr8;
                iArr3 = iArr7;
                jArr = jArr8;
                i13 = i33;
                zzaiwVar2 = zzaiwVar;
                long zzt = zzet.zzt(j, 1000000L, zzaiwVar2.zzc, RoundingMode.FLOOR);
                jArr4 = zzaiwVar2.zzh;
                if (jArr4 == null) {
                    zzet.zzF(jArr, 1000000L, zzaiwVar2.zzc);
                    return new zzaiz(zzaiwVar, jArr3, iArr3, i13, jArr, iArr2, zzt);
                }
                if (jArr4.length == 1 && zzaiwVar2.zzb == 1 && (length = jArr.length) >= 2) {
                    long[] jArr10 = zzaiwVar2.zzi;
                    jArr10.getClass();
                    long j4 = jArr10[0];
                    int i39 = i14;
                    long zzt2 = zzet.zzt(jArr4[0], zzaiwVar2.zzc, zzaiwVar2.zzd, RoundingMode.FLOOR) + j4;
                    int i40 = length - 1;
                    int max = Math.max(0, Math.min(4, i40));
                    int max2 = Math.max(0, Math.min(length - 4, i40));
                    long j5 = jArr[0];
                    if (j5 > j4 || j4 >= jArr[max] || jArr[max2] >= zzt2 || zzt2 > j) {
                        i18 = i39;
                    } else {
                        long zzt3 = zzet.zzt(j4 - j5, zzaiwVar2.zzf.zzA, zzaiwVar2.zzc, RoundingMode.FLOOR);
                        i18 = i39;
                        long zzt4 = zzet.zzt(j - zzt2, zzaiwVar2.zzf.zzA, zzaiwVar2.zzc, RoundingMode.FLOOR);
                        if (zzt3 == 0) {
                            if (zzt4 != 0) {
                                zzt3 = 0;
                            }
                        }
                        if (zzt3 <= 2147483647L && zzt4 <= 2147483647L) {
                            zzacyVar.zza = (int) zzt3;
                            zzacyVar.zzb = (int) zzt4;
                            zzet.zzF(jArr, 1000000L, zzaiwVar2.zzc);
                            return new zzaiz(zzaiwVar, jArr3, iArr3, i13, jArr, iArr2, zzet.zzt(zzaiwVar2.zzh[0], 1000000L, zzaiwVar2.zzd, RoundingMode.FLOOR));
                        }
                    }
                } else {
                    i18 = i14;
                }
                long[] jArr11 = zzaiwVar2.zzh;
                int length2 = jArr11.length;
                if (length2 == 1) {
                    if (jArr11[0] == 0) {
                        long[] jArr12 = zzaiwVar2.zzi;
                        jArr12.getClass();
                        long j6 = jArr12[0];
                        for (int i41 = 0; i41 < jArr.length; i41++) {
                            jArr[i41] = zzet.zzt(jArr[i41] - j6, 1000000L, zzaiwVar2.zzc, RoundingMode.FLOOR);
                        }
                        return new zzaiz(zzaiwVar, jArr3, iArr3, i13, jArr, iArr2, zzet.zzt(j - j6, 1000000L, zzaiwVar2.zzc, RoundingMode.FLOOR));
                    }
                    length2 = 1;
                }
                boolean z5 = zzaiwVar2.zzb == 1;
                long[] jArr13 = zzaiwVar2.zzi;
                int[] iArr9 = new int[length2];
                int[] iArr10 = new int[length2];
                jArr13.getClass();
                int i42 = 0;
                boolean z6 = false;
                int i43 = 0;
                int i44 = 0;
                while (true) {
                    long[] jArr14 = zzaiwVar2.zzh;
                    i19 = i13;
                    if (i43 >= jArr14.length) {
                        break;
                    }
                    int[] iArr11 = iArr3;
                    long j7 = jArr13[i43];
                    if (j7 != -1) {
                        i20 = i18;
                        int i45 = i42;
                        boolean z7 = z6;
                        long zzt5 = zzet.zzt(jArr14[i43], zzaiwVar2.zzc, zzaiwVar2.zzd, RoundingMode.FLOOR);
                        int i46 = 1;
                        iArr9[i43] = zzet.zzc(jArr, j7, true, true);
                        iArr10[i43] = zzet.zza(jArr, j7 + zzt5, z5, false);
                        while (true) {
                            i22 = iArr9[i43];
                            i23 = iArr10[i43];
                            if (i22 >= i23 || (iArr2[i22] & i46) != 0) {
                                break;
                            }
                            iArr9[i43] = i22 + 1;
                            i46 = 1;
                        }
                        i21 = i45 + (i23 - i22);
                        z4 = z7 | (i44 != i22);
                        i44 = i23;
                    } else {
                        boolean z8 = z6;
                        i20 = i18;
                        i21 = i42;
                        z4 = z8;
                    }
                    i43++;
                    i13 = i19;
                    i42 = i21;
                    i18 = i20;
                    z6 = z4;
                    iArr3 = iArr11;
                }
                int[] iArr12 = iArr3;
                boolean z9 = z6;
                int i47 = i42;
                int i48 = 0;
                boolean z10 = z9 | (i47 != i18);
                long[] jArr15 = z10 ? new long[i47] : jArr3;
                int[] iArr13 = z10 ? new int[i47] : iArr12;
                int i49 = true == z10 ? 0 : i19;
                int[] iArr14 = z10 ? new int[i47] : iArr2;
                long[] jArr16 = new long[i47];
                int i50 = i49;
                long j8 = 0;
                int i51 = 0;
                while (i48 < zzaiwVar2.zzh.length) {
                    long j9 = zzaiwVar2.zzi[i48];
                    int i52 = iArr9[i48];
                    int[] iArr15 = iArr9;
                    int i53 = iArr10[i48];
                    int[] iArr16 = iArr10;
                    if (z10) {
                        int i54 = i53 - i52;
                        System.arraycopy(jArr3, i52, jArr15, i51, i54);
                        jArr5 = jArr3;
                        iArr4 = iArr12;
                        System.arraycopy(iArr4, i52, iArr13, i51, i54);
                        System.arraycopy(iArr2, i52, iArr14, i51, i54);
                    } else {
                        jArr5 = jArr3;
                        iArr4 = iArr12;
                    }
                    int i55 = i50;
                    while (i52 < i53) {
                        int i56 = i53;
                        int i57 = i48;
                        long zzt6 = zzet.zzt(j8, 1000000L, zzaiwVar2.zzd, RoundingMode.FLOOR);
                        long[] jArr17 = jArr;
                        int[] iArr17 = iArr2;
                        long zzt7 = zzet.zzt(jArr[i52] - j9, 1000000L, zzaiwVar2.zzc, RoundingMode.FLOOR);
                        int[] iArr18 = iArr14;
                        long[] jArr18 = jArr15;
                        if (zzaiwVar2.zzb != 1) {
                            iArr5 = iArr13;
                            zzt7 = Math.max(0L, zzt7);
                        } else {
                            iArr5 = iArr13;
                        }
                        jArr16[i51] = zzt6 + zzt7;
                        if (z10 && iArr5[i51] > i55) {
                            i55 = iArr4[i52];
                        }
                        i51++;
                        i52++;
                        i53 = i56;
                        iArr13 = iArr5;
                        i48 = i57;
                        jArr = jArr17;
                        iArr2 = iArr17;
                        iArr14 = iArr18;
                        jArr15 = jArr18;
                    }
                    int i58 = i48;
                    j8 += zzaiwVar2.zzh[i58];
                    i48 = i58 + 1;
                    i50 = i55;
                    iArr12 = iArr4;
                    iArr13 = iArr13;
                    iArr9 = iArr15;
                    jArr = jArr;
                    iArr10 = iArr16;
                    jArr3 = jArr5;
                    iArr14 = iArr14;
                    jArr15 = jArr15;
                }
                return new zzaiz(zzaiwVar, jArr15, iArr13, i50, jArr16, iArr14, zzet.zzt(j8, 1000000L, zzaiwVar2.zzd, RoundingMode.FLOOR));
            }
            zzp = 0;
        }
        long[] jArr19 = new long[zzb3];
        int[] iArr19 = new int[zzb3];
        jArr = new long[zzb3];
        int[] iArr20 = new int[zzb3];
        int i59 = zzp;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            if (i60 >= zzb3) {
                i4 = zzp2;
                i5 = i64;
                i6 = i63;
                break;
            }
            boolean z11 = true;
            while (true) {
                if (i61 != 0) {
                    i15 = zzb3;
                    i4 = zzp2;
                    i16 = zzp3;
                    i17 = i61;
                    break;
                }
                z11 = zzahyVar.zza();
                if (!z11) {
                    i15 = zzb3;
                    i4 = zzp2;
                    i16 = zzp3;
                    i17 = 0;
                    break;
                }
                int i65 = zzp2;
                long j12 = zzahyVar.zzd;
                i61 = zzahyVar.zzc;
                j10 = j12;
                zzp2 = i65;
                zzp3 = zzp3;
                zzb3 = zzb3;
            }
            if (!z11) {
                zzea.zzf("AtomParsers", "Unexpected end of chunk data");
                jArr19 = Arrays.copyOf(jArr19, i60);
                iArr19 = Arrays.copyOf(iArr19, i60);
                jArr = Arrays.copyOf(jArr, i60);
                iArr20 = Arrays.copyOf(iArr20, i60);
                zzb3 = i60;
                i6 = i63;
                i5 = i64;
                break;
            }
            if (zzekVar2 != null) {
                while (true) {
                    if (i62 != 0) {
                        break;
                    }
                    if (i <= 0) {
                        i62 = 0;
                        break;
                    }
                    i--;
                    i62 = zzekVar2.zzp();
                    i63 = zzekVar2.zzg();
                }
                i62--;
            }
            int i66 = i63;
            jArr19[i60] = j10;
            int zzc = zzaidVar.zzc();
            iArr19[i60] = zzc;
            int i67 = i64;
            i64 = zzc > i67 ? zzc : i67;
            jArr[i60] = j11 + i66;
            iArr20[i60] = zzekVar == null ? 1 : 0;
            if (i60 == i2) {
                iArr20[i60] = 1;
                i3--;
                if (i3 > 0) {
                    zzekVar.getClass();
                    i2 = zzekVar.zzp() - 1;
                }
            }
            int i68 = i2;
            long[] jArr20 = jArr;
            zzp3 = i16;
            j11 += zzp3;
            int i69 = i4 - 1;
            if (i69 == 0) {
                if (i59 > 0) {
                    i69 = zzekVar3.zzp();
                    i59--;
                    zzp3 = zzekVar3.zzg();
                } else {
                    i69 = 0;
                }
            }
            int[] iArr21 = iArr19;
            j10 += iArr19[i60];
            int i70 = i17 - 1;
            i60++;
            i63 = i66;
            jArr = jArr20;
            jArr19 = jArr19;
            zzb3 = i15;
            zzp2 = i69;
            i2 = i68;
            i61 = i70;
            iArr19 = iArr21;
        }
        long j13 = j11 + i6;
        if (zzekVar2 != null) {
            while (i > 0) {
                if (zzekVar2.zzp() != 0) {
                    z2 = false;
                    break;
                }
                zzekVar2.zzg();
                i--;
            }
        }
        z2 = true;
        if (i3 == 0) {
            if (i4 == 0) {
                if (i61 != 0) {
                    i11 = 0;
                    zzaiwVar2 = zzaiwVar;
                    z3 = z2;
                    jArr2 = jArr19;
                    i8 = i61;
                } else if (i59 != 0) {
                    i11 = 0;
                    i8 = 0;
                    zzaiwVar2 = zzaiwVar;
                    z3 = z2;
                    jArr2 = jArr19;
                } else if (i62 != 0) {
                    i11 = 0;
                    i8 = 0;
                    i9 = 0;
                    zzaiwVar2 = zzaiwVar;
                    z3 = z2;
                    jArr2 = jArr19;
                    i10 = i62;
                } else if (z2) {
                    zzaiwVar2 = zzaiwVar;
                    jArr2 = jArr19;
                    iArr = iArr19;
                    i12 = zzb3;
                    jArr3 = jArr2;
                    iArr2 = iArr20;
                    i13 = i5;
                    iArr3 = iArr;
                    i14 = i12;
                    j = j13;
                    long zzt8 = zzet.zzt(j, 1000000L, zzaiwVar2.zzc, RoundingMode.FLOOR);
                    jArr4 = zzaiwVar2.zzh;
                    if (jArr4 == null) {
                    }
                } else {
                    i7 = 0;
                    i11 = 0;
                    z3 = false;
                    i8 = 0;
                    i9 = 0;
                    i10 = 0;
                    zzaiwVar2 = zzaiwVar;
                    jArr2 = jArr19;
                }
                i9 = i59;
                i10 = i62;
            } else {
                zzaiwVar2 = zzaiwVar;
                z3 = z2;
                jArr2 = jArr19;
                i8 = i61;
                i9 = i59;
                i10 = i62;
                i11 = i4;
            }
            i7 = 0;
        } else {
            z3 = z2;
            jArr2 = jArr19;
            i7 = i3;
            i8 = i61;
            i9 = i59;
            i10 = i62;
            i11 = i4;
            zzaiwVar2 = zzaiwVar;
        }
        int i71 = zzaiwVar2.zza;
        iArr = iArr19;
        i12 = zzb3;
        StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
        sb.append(i71);
        sb.append(": remainingSynchronizationSamples ");
        sb.append(i7);
        sb.append(", remainingSamplesAtTimestampDelta ");
        sb.append(i11);
        sb.append(", remainingSamplesInChunk ");
        sb.append(i8);
        sb.append(", remainingTimestampDeltaChanges ");
        sb.append(i9);
        sb.append(", remainingSamplesAtTimestampOffset ");
        sb.append(i10);
        sb.append(true != z3 ? ", ctts invalid" : "");
        zzea.zzf("AtomParsers", sb.toString());
        jArr3 = jArr2;
        iArr2 = iArr20;
        i13 = i5;
        iArr3 = iArr;
        i14 = i12;
        j = j13;
        long zzt82 = zzet.zzt(j, 1000000L, zzaiwVar2.zzc, RoundingMode.FLOOR);
        jArr4 = zzaiwVar2.zzh;
        if (jArr4 == null) {
        }
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzm(zzek zzekVar, int i, int i2, int i3, int i4, String str, boolean z, zzy zzyVar, zzaib zzaibVar, int i5) throws zzbo {
        int i6;
        int zzn;
        int zzg;
        int i7;
        int i8;
        zzy zzyVar2;
        String str2;
        int i9;
        long j;
        long j2;
        String str3;
        int i10;
        int i11;
        int i12;
        int i13;
        String str4;
        byte[] bArr;
        String str5;
        String str6;
        String str7;
        boolean z2;
        int i14;
        zzek zzekVar2 = zzekVar;
        int i15 = i2;
        int i16 = i3;
        zzekVar2.zzK(i15 + 16);
        if (z) {
            i6 = zzekVar.zzq();
            zzekVar2.zzL(6);
        } else {
            zzekVar2.zzL(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzq = zzekVar.zzq();
            zzekVar2.zzL(6);
            zzn = zzekVar.zzn();
            zzekVar2.zzK(zzekVar.zzd() - 4);
            zzg = zzekVar.zzg();
            if (i6 == 1) {
                zzekVar2.zzL(16);
            }
            i7 = zzq;
            i8 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzekVar2.zzL(16);
            zzn = (int) Math.round(Double.longBitsToDouble(zzekVar.zzt()));
            i7 = zzekVar.zzp();
            zzekVar2.zzL(4);
            int zzp = zzekVar.zzp();
            int zzp2 = zzekVar.zzp();
            int i17 = zzp2 & 1;
            int i18 = zzp2 & 2;
            if (i17 == 0) {
                if (zzp == 8) {
                    i8 = 3;
                } else if (zzp == 16) {
                    i8 = i18 != 0 ? 268435456 : 2;
                } else if (zzp == 24) {
                    i8 = i18 != 0 ? 1342177280 : 21;
                } else {
                    if (zzp == 32) {
                        i8 = i18 != 0 ? 1610612736 : 22;
                    }
                    i8 = -1;
                }
                zzekVar2.zzL(8);
                zzg = 0;
            } else {
                if (zzp == 32) {
                    i8 = 4;
                    zzekVar2.zzL(8);
                    zzg = 0;
                }
                i8 = -1;
                zzekVar2.zzL(8);
                zzg = 0;
            }
        }
        int zzd = zzekVar.zzd();
        int i19 = 1701733217;
        int i20 = i;
        if (i20 == 1701733217) {
            Pair zzh = zzh(zzekVar2, i15, i16);
            if (zzh != null) {
                i19 = ((Integer) zzh.first).intValue();
                zzyVar2 = zzyVar == null ? null : zzyVar.zzb(((zzaix) zzh.second).zzb);
                zzaibVar.zza[i5] = (zzaix) zzh.second;
            } else {
                zzyVar2 = zzyVar;
            }
            zzekVar2.zzK(zzd);
            i20 = i19;
        } else {
            zzyVar2 = zzyVar;
        }
        String str8 = "audio/mhm1";
        if (i20 == 1633889587) {
            str2 = "audio/ac3";
        } else {
            if (i20 != 1700998451) {
                if (i20 == 1633889588) {
                    i9 = i8;
                    str2 = "audio/ac4";
                } else if (i20 == 1685353315) {
                    str2 = "audio/vnd.dts";
                } else if (i20 == 1685353320 || i20 == 1685353324) {
                    str2 = "audio/vnd.dts.hd";
                } else if (i20 == 1685353317) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                } else if (i20 == 1685353336) {
                    str2 = "audio/vnd.dts.uhd;profile=p2";
                } else if (i20 == 1935764850) {
                    str2 = "audio/3gpp";
                } else if (i20 == 1935767394) {
                    str2 = "audio/amr-wb";
                } else {
                    if (i20 != 1936684916) {
                        if (i20 == 1953984371) {
                            str2 = "audio/raw";
                            i9 = 268435456;
                        } else if (i20 == 1819304813) {
                            if (i8 != -1) {
                                i9 = i8;
                                str2 = "audio/raw";
                            }
                        } else if (i20 == 778924082 || i20 == 778924083) {
                            str2 = "audio/mpeg";
                        } else if (i20 == 1835557169) {
                            str2 = "audio/mha1";
                        } else if (i20 == 1835560241) {
                            i9 = i8;
                            str2 = "audio/mhm1";
                        } else if (i20 == 1634492771) {
                            str2 = "audio/alac";
                        } else if (i20 == 1634492791) {
                            str2 = "audio/g711-alaw";
                        } else if (i20 == 1970037111) {
                            str2 = "audio/g711-mlaw";
                        } else if (i20 == 1332770163) {
                            str2 = "audio/opus";
                        } else if (i20 == 1716281667) {
                            str2 = "audio/flac";
                        } else if (i20 == 1835823201) {
                            str2 = "audio/true-hd";
                        } else {
                            i9 = i8;
                            str2 = null;
                        }
                    }
                    str2 = "audio/raw";
                    i9 = 2;
                }
                int i21 = i9;
                String str9 = null;
                List list = null;
                zzahz zzahzVar = null;
                while (zzd - i15 < i16) {
                    zzekVar2.zzK(zzd);
                    int zzg2 = zzekVar.zzg();
                    String str10 = "childAtomSize must be positive";
                    zzaco.zzb(zzg2 > 0, "childAtomSize must be positive");
                    int zzg3 = zzekVar.zzg();
                    int i22 = zzn;
                    if (zzg3 == 1835557187) {
                        zzekVar2.zzK(zzd + 8);
                        zzekVar2.zzL(1);
                        int zzm = zzekVar.zzm();
                        zzekVar2.zzL(1);
                        if (Objects.equals(str2, str8)) {
                            i14 = 0;
                            str6 = String.format("mhm1.%02X", Integer.valueOf(zzm));
                            str3 = str8;
                        } else {
                            i14 = 0;
                            str3 = str8;
                            str6 = String.format("mha1.%02X", Integer.valueOf(zzm));
                        }
                        int zzq2 = zzekVar.zzq();
                        byte[] bArr2 = new byte[zzq2];
                        zzekVar2.zzG(bArr2, i14, zzq2);
                        list = list == null ? zzfxr.zzn(bArr2) : zzfxr.zzo(bArr2, (byte[]) list.get(i14));
                    } else {
                        str3 = str8;
                        if (zzg3 == 1835557200) {
                            zzekVar2.zzK(zzd + 8);
                            int zzm2 = zzekVar.zzm();
                            if (zzm2 > 0) {
                                byte[] bArr3 = new byte[zzm2];
                                zzekVar2.zzG(bArr3, 0, zzm2);
                                list = list == null ? zzfxr.zzn(bArr3) : zzfxr.zzo((byte[]) list.get(0), bArr3);
                                str6 = str9;
                            }
                            i10 = i22;
                            i13 = zzg;
                            zzn = i10;
                            str6 = str9;
                        } else {
                            if (zzg3 == 1702061171) {
                                i10 = i22;
                                i11 = zzd;
                                i12 = -1;
                            } else if (z && zzg3 == 2002876005) {
                                i11 = zzekVar.zzd();
                                if (i11 >= zzd) {
                                    str7 = null;
                                    z2 = true;
                                } else {
                                    str7 = null;
                                    z2 = false;
                                }
                                zzaco.zzb(z2, str7);
                                while (true) {
                                    if (i11 - zzd >= zzg2) {
                                        i10 = i22;
                                        i11 = -1;
                                        break;
                                    }
                                    zzekVar2.zzK(i11);
                                    int zzg4 = zzekVar.zzg();
                                    zzaco.zzb(zzg4 > 0, str10);
                                    String str11 = str10;
                                    if (zzekVar.zzg() == 1702061171) {
                                        i10 = i22;
                                        break;
                                    } else {
                                        i11 += zzg4;
                                        str10 = str11;
                                    }
                                }
                                i12 = -1;
                            } else {
                                if (zzg3 == 1684103987) {
                                    zzekVar2.zzK(zzd + 8);
                                    zzaibVar.zzb = zzabj.zzc(zzekVar2, Integer.toString(i4), str, zzyVar2);
                                } else if (zzg3 == 1684366131) {
                                    zzekVar2.zzK(zzd + 8);
                                    zzaibVar.zzb = zzabj.zzd(zzekVar2, Integer.toString(i4), str, zzyVar2);
                                } else if (zzg3 == 1684103988) {
                                    zzekVar2.zzK(zzd + 8);
                                    String num = Integer.toString(i4);
                                    int i23 = zzabm.zza;
                                    zzekVar2.zzL(1);
                                    int zzm3 = zzekVar.zzm() & 32;
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzK(num);
                                    zzadVar.zzX("audio/ac4");
                                    zzadVar.zzy(2);
                                    zzadVar.zzY(1 != (zzm3 >> 5) ? 44100 : 48000);
                                    zzadVar.zzE(zzyVar2);
                                    zzadVar.zzO(str);
                                    zzaibVar.zzb = zzadVar.zzad();
                                } else if (zzg3 != 1684892784) {
                                    if (zzg3 == 1684305011 || zzg3 == 1969517683) {
                                        zzad zzadVar2 = new zzad();
                                        zzadVar2.zzJ(i4);
                                        zzadVar2.zzX(str2);
                                        zzadVar2.zzy(i7);
                                        i10 = i22;
                                        zzadVar2.zzY(i10);
                                        zzadVar2.zzE(zzyVar2);
                                        zzadVar2.zzO(str);
                                        zzaibVar.zzb = zzadVar2.zzad();
                                    } else if (zzg3 == 1682927731) {
                                        int i24 = zzg2 - 8;
                                        byte[] bArr4 = zza;
                                        byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i24);
                                        zzekVar2.zzK(zzd + 8);
                                        zzekVar2.zzG(copyOf, bArr4.length, i24);
                                        list = zzade.zze(copyOf);
                                        str6 = str9;
                                    } else if (zzg3 == 1684425825) {
                                        byte[] bArr5 = new byte[zzg2 - 8];
                                        bArr5[0] = 102;
                                        bArr5[1] = 76;
                                        bArr5[2] = 97;
                                        bArr5[3] = 67;
                                        zzekVar2.zzK(zzd + 12);
                                        zzekVar2.zzG(bArr5, 4, zzg2 - 12);
                                        list = zzfxr.zzn(bArr5);
                                        str6 = str9;
                                        zzn = i22;
                                        i13 = zzg;
                                    } else if (zzg3 == 1634492771) {
                                        int i25 = zzg2 - 12;
                                        byte[] bArr6 = new byte[i25];
                                        zzekVar2.zzK(zzd + 12);
                                        zzekVar2.zzG(bArr6, 0, i25);
                                        int i26 = zzdk.zza;
                                        zzek zzekVar3 = new zzek(bArr6);
                                        zzekVar3.zzK(9);
                                        int zzm4 = zzekVar3.zzm();
                                        zzekVar3.zzK(20);
                                        Pair create = Pair.create(Integer.valueOf(zzekVar3.zzp()), Integer.valueOf(zzm4));
                                        int intValue = ((Integer) create.first).intValue();
                                        int intValue2 = ((Integer) create.second).intValue();
                                        list = zzfxr.zzn(bArr6);
                                        i7 = intValue2;
                                        zzn = intValue;
                                        i13 = zzg;
                                        str6 = str9;
                                    } else {
                                        i10 = i22;
                                    }
                                    i13 = zzg;
                                    zzn = i10;
                                    str6 = str9;
                                } else {
                                    if (zzg <= 0) {
                                        throw zzbo.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + zzg, null);
                                    }
                                    str6 = str9;
                                    zzn = zzg;
                                    i13 = zzn;
                                    i7 = 2;
                                }
                                i10 = i22;
                                i13 = zzg;
                                zzn = i10;
                                str6 = str9;
                            }
                            if (i11 != i12) {
                                zzahzVar = zzj(zzekVar2, i11);
                                str4 = zzahzVar.zza;
                                bArr = zzahzVar.zzb;
                                if (bArr == null) {
                                    i13 = zzg;
                                } else if ("audio/vorbis".equals(str4)) {
                                    zzek zzekVar4 = new zzek(bArr);
                                    zzekVar4.zzL(1);
                                    int i27 = 0;
                                    while (zzekVar4.zzb() > 0 && zzekVar4.zzf() == 255) {
                                        zzekVar4.zzL(1);
                                        i27 += 255;
                                    }
                                    int zzm5 = i27 + zzekVar4.zzm();
                                    int i28 = 0;
                                    while (true) {
                                        if (zzekVar4.zzb() <= 0) {
                                            i13 = zzg;
                                            break;
                                        }
                                        i13 = zzg;
                                        if (zzekVar4.zzf() != 255) {
                                            break;
                                        }
                                        zzekVar4.zzL(1);
                                        i28 += 255;
                                        zzg = i13;
                                    }
                                    int zzm6 = i28 + zzekVar4.zzm();
                                    byte[] bArr7 = new byte[zzm5];
                                    int zzd2 = zzekVar4.zzd();
                                    System.arraycopy(bArr, zzd2, bArr7, 0, zzm5);
                                    int i29 = zzd2 + zzm5 + zzm6;
                                    int length = bArr.length - i29;
                                    byte[] bArr8 = new byte[length];
                                    System.arraycopy(bArr, i29, bArr8, 0, length);
                                    list = zzfxr.zzo(bArr7, bArr8);
                                } else {
                                    i13 = zzg;
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        zzabf zza2 = zzabg.zza(bArr);
                                        zzn = zza2.zza;
                                        i7 = zza2.zzb;
                                        str5 = zza2.zzc;
                                    } else {
                                        str5 = str9;
                                        zzn = i10;
                                    }
                                    list = zzfxr.zzn(bArr);
                                    str6 = str5;
                                    str2 = str4;
                                }
                                str2 = str4;
                                zzn = i10;
                                str6 = str9;
                            }
                            i13 = zzg;
                            zzn = i10;
                            str6 = str9;
                        }
                        zzd += zzg2;
                        zzekVar2 = zzekVar;
                        i15 = i2;
                        str9 = str6;
                        str8 = str3;
                        zzg = i13;
                        i16 = i3;
                    }
                    zzn = i22;
                    i13 = zzg;
                    zzd += zzg2;
                    zzekVar2 = zzekVar;
                    i15 = i2;
                    str9 = str6;
                    str8 = str3;
                    zzg = i13;
                    i16 = i3;
                }
                int i30 = zzn;
                if (zzaibVar.zzb == null || str2 == null) {
                }
                zzad zzadVar3 = new zzad();
                zzadVar3.zzJ(i4);
                zzadVar3.zzX(str2);
                zzadVar3.zzz(str9);
                zzadVar3.zzy(i7);
                zzadVar3.zzY(i30);
                zzadVar3.zzR(i21);
                zzadVar3.zzL(list);
                zzadVar3.zzE(zzyVar2);
                zzadVar3.zzO(str);
                if (zzahzVar != null) {
                    j = zzahzVar.zzc;
                    zzadVar3.zzx(zzgap.zze(j));
                    j2 = zzahzVar.zzd;
                    zzadVar3.zzS(zzgap.zze(j2));
                }
                zzaibVar.zzb = zzadVar3.zzad();
                return;
            }
            str2 = "audio/eac3";
        }
        i9 = i8;
        int i212 = i9;
        String str92 = null;
        List list2 = null;
        zzahz zzahzVar2 = null;
        while (zzd - i15 < i16) {
        }
        int i302 = zzn;
        if (zzaibVar.zzb == null) {
        }
    }
}
