package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzalv {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfm.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0107, code lost:
    
        if (r43 == 0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0fe9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x1017  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0d95  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0d97  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzb(zzfz zzfzVar, zzaha zzahaVar, long j, @Nullable zzq zzqVar, boolean z, boolean z2, zzgub zzgubVar, boolean z3) throws zzat {
        int i;
        int i2;
        String str;
        String str2;
        long j2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        long j3;
        boolean z6;
        long j4;
        long zzw;
        int i10;
        zzga zzc;
        ArrayList arrayList;
        int i11;
        String str3;
        String str4;
        String str5;
        int i12;
        zzhbh zzhbhVar;
        zzhbh zzhbhVar2;
        zzfz zzfzVar2;
        boolean z7;
        String str6;
        zzamw zzo;
        zzap zzapVar;
        zzgub zzgubVar2;
        zzfz zzd;
        Pair zzq;
        zzga zzc2;
        int i13;
        long j5;
        short s;
        ArrayList arrayList2;
        int i14;
        zzfz zzfzVar3;
        int i15;
        short s2;
        char c;
        zzeu zzeuVar;
        zzq zzqVar2;
        String str7;
        int i16;
        int i17;
        int i18;
        String str8;
        String str9;
        String str10;
        String str11;
        int i19;
        int i20;
        boolean z8;
        String str12;
        zzalr zzalrVar;
        int i21;
        int i22;
        int i23;
        boolean z9;
        String str13;
        int i24;
        int i25;
        zzalr zzalrVar2;
        String str14;
        int i26;
        List list;
        int i27;
        String str15;
        String str16;
        zzgo zzgoVar;
        boolean z10;
        String str17;
        String str18;
        boolean z11;
        int i28;
        String str19;
        boolean z12;
        String str20;
        boolean z13;
        int i29;
        zzalr zzalrVar3;
        boolean z14;
        String str21;
        int i30;
        boolean z15;
        boolean z16;
        boolean z17;
        long j6;
        short s3;
        char c2;
        String str22;
        long j7;
        zzgxm zzgxmVar;
        boolean z18;
        zzamw zzamwVar;
        ArrayList arrayList3;
        zzfz zzfzVar4 = zzfzVar;
        String str23 = "video/x-vnd.on2.vp9";
        String str24 = "video/hevc";
        String str25 = "video/3gpp";
        String str26 = "text/x-unknown";
        String str27 = "BoxParsers";
        int i31 = 8;
        ArrayList arrayList4 = new ArrayList();
        int i32 = 0;
        while (true) {
            List list2 = zzfzVar4.zzc;
            if (i32 >= list2.size()) {
                return arrayList4;
            }
            zzfz zzfzVar5 = (zzfz) list2.get(i32);
            if (zzfzVar5.zzd != 1953653099) {
                i11 = i32;
                arrayList3 = arrayList4;
                i12 = i31;
                str3 = str23;
                str4 = str24;
                str = str25;
                str6 = str26;
                str5 = str27;
            } else {
                zzga zzc3 = zzfzVar4.zzc(1836476516);
                zzc3.getClass();
                zzfz zzd2 = zzfzVar5.zzd(1835297121);
                zzd2.getClass();
                zzga zzc4 = zzd2.zzc(1751411826);
                zzc4.getClass();
                int zzk = zzk(zzj(zzc4.zza));
                if (zzk == -1) {
                    i11 = i32;
                    arrayList = arrayList4;
                    i12 = i31;
                    zzfzVar2 = zzfzVar5;
                    str3 = str23;
                    str4 = str24;
                    str = str25;
                    str6 = str26;
                    zzo = null;
                    str5 = str27;
                } else {
                    zzga zzc5 = zzfzVar5.zzc(1953196132);
                    zzc5.getClass();
                    zzeu zzeuVar2 = zzc5.zza;
                    zzeuVar2.zzh(i31);
                    int zza2 = zza(zzeuVar2.zzB());
                    if (zza2 != 0) {
                        i31 = 16;
                    }
                    zzeuVar2.zzk(i31);
                    int zzB = zzeuVar2.zzB();
                    zzeuVar2.zzk(4);
                    int zzg = zzeuVar2.zzg();
                    int i33 = 0;
                    while (true) {
                        if (zza2 == 0) {
                            i = i32;
                            i2 = 4;
                        } else {
                            i = i32;
                            i2 = 8;
                        }
                        str = str25;
                        str2 = str26;
                        if (i33 >= i2) {
                            zzeuVar2.zzk(i2);
                            break;
                        }
                        if (zzeuVar2.zzi()[zzg + i33] != -1) {
                            j2 = zza2 == 0 ? zzeuVar2.zzz() : zzeuVar2.zzJ();
                        } else {
                            i33++;
                            i32 = i;
                            str25 = str;
                            str26 = str2;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzeuVar2.zzk(10);
                    int zzt = zzeuVar2.zzt();
                    zzeuVar2.zzk(4);
                    int zzB2 = zzeuVar2.zzB();
                    int zzB3 = zzeuVar2.zzB();
                    zzeuVar2.zzk(4);
                    int zzB4 = zzeuVar2.zzB();
                    int zzB5 = zzeuVar2.zzB();
                    ArrayList arrayList5 = arrayList4;
                    int i34 = 65536;
                    zzfz zzfzVar6 = zzfzVar5;
                    if (zzB2 == 0) {
                        if (zzB3 == 65536) {
                            if (zzB4 != -65536) {
                                if (zzB4 == 65536) {
                                    z18 = zzB5 != 0;
                                    zzB4 = 65536;
                                }
                                zzB3 = 65536;
                            } else {
                                z18 = zzB5 != 0;
                            }
                            if (true != z18) {
                                i6 = zzB5;
                                i8 = 16;
                                i7 = 90;
                                zzB2 = 0;
                                zzeuVar2.zzk(i8);
                                short zzv = zzeuVar2.zzv();
                                int i35 = zzk;
                                zzeuVar2.zzk(2);
                                String str28 = str23;
                                String str29 = str24;
                                short zzv2 = zzeuVar2.zzv();
                                if ((zzB2 * i6) - (i34 * zzB4) < 0) {
                                    j3 = -9223372036854775807L;
                                    z6 = true;
                                } else {
                                    j3 = -9223372036854775807L;
                                    z6 = false;
                                }
                                j4 = j == j3 ? j2 : j;
                                long j8 = zzd(zzc3.zza).zzc;
                                if (j4 == j3) {
                                    i10 = 1835626086;
                                    zzw = -9223372036854775807L;
                                } else {
                                    zzw = zzfm.zzw(j4, 1000000L, j8, RoundingMode.DOWN);
                                    i10 = 1835626086;
                                }
                                zzfz zzd3 = zzd2.zzd(i10);
                                zzd3.getClass();
                                zzfz zzd4 = zzd3.zzd(1937007212);
                                zzd4.getClass();
                                zzga zzc6 = zzd2.zzc(1835296868);
                                zzc6.getClass();
                                zzalo zzl = zzl(zzc6.zza);
                                zzc = zzd4.zzc(1937011556);
                                if (zzc == null) {
                                    zzeh.zzc(str27, "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                                    str5 = str27;
                                    arrayList = arrayList5;
                                    i11 = i;
                                    str6 = str2;
                                    zzfzVar2 = zzfzVar6;
                                    str3 = str28;
                                    str4 = str29;
                                    zzo = null;
                                    i12 = 8;
                                } else {
                                    String zzc7 = zzl.zzc();
                                    zzeu zzeuVar3 = zzc.zza;
                                    char c3 = '\f';
                                    zzeuVar3.zzh(12);
                                    int zzB6 = zzeuVar3.zzB();
                                    zzalr zzalrVar4 = new zzalr(zzB6);
                                    int i36 = 0;
                                    while (i36 < zzB6) {
                                        int i37 = zzt;
                                        int zzg2 = zzeuVar3.zzg();
                                        boolean z19 = z6;
                                        int zzB7 = zzeuVar3.zzB();
                                        String str30 = "childAtomSize must be positive";
                                        zzagl.zza(zzB7 > 0, "childAtomSize must be positive");
                                        int zzB8 = zzeuVar3.zzB();
                                        String str31 = str27;
                                        if (zzB8 == 1635148593 || zzB8 == 1635148595 || zzB8 == 1701733238 || zzB8 == 1831958048 || zzB8 == 1836070006 || zzB8 == 1752589105 || zzB8 == 1751479857 || zzB8 == 1987470129 || zzB8 == 1987471665 || zzB8 == 1932670515 || zzB8 == 1211250227 || zzB8 == 1748121139 || zzB8 == 1987063864 || zzB8 == 1987063865 || zzB8 == 1635135537 || zzB8 == 1685479798 || zzB8 == 1685479729 || zzB8 == 1685481573 || zzB8 == 1685481521 || zzB8 == 1634760241 || zzB8 == 1684108849) {
                                            i13 = zzB6;
                                            String str32 = zzc7;
                                            j5 = zzw;
                                            int i38 = i7;
                                            s = zzv;
                                            arrayList2 = arrayList5;
                                            i14 = i;
                                            zzfzVar3 = zzfzVar6;
                                            i15 = i35;
                                            s2 = zzv2;
                                            String str33 = str31;
                                            c = '\f';
                                            zzeuVar = zzeuVar3;
                                            int i39 = zzB;
                                            zzeuVar.zzh(zzg2 + 16);
                                            zzeuVar.zzk(16);
                                            int zzt2 = zzeuVar.zzt();
                                            int zzt3 = zzeuVar.zzt();
                                            zzeuVar.zzk(50);
                                            int zzg3 = zzeuVar.zzg();
                                            if (zzB8 == 1701733238) {
                                                Pair zzu = zzu(zzeuVar, zzg2, zzB7);
                                                if (zzu != null) {
                                                    int intValue = ((Integer) zzu.first).intValue();
                                                    zzqVar2 = zzqVar == null ? null : zzqVar.zzb(((zzamx) zzu.second).zzb);
                                                    zzalrVar4.zza[i36] = (zzamx) zzu.second;
                                                    zzB8 = intValue;
                                                } else {
                                                    zzB8 = 1701733238;
                                                    zzqVar2 = zzqVar;
                                                }
                                                zzeuVar.zzh(zzg3);
                                            } else {
                                                zzqVar2 = zzqVar;
                                            }
                                            if (zzB8 == 1831958048) {
                                                str7 = "video/mpeg";
                                            } else if (zzB8 == 1211250227) {
                                                zzB8 = 1211250227;
                                                str7 = str;
                                            } else {
                                                str7 = null;
                                            }
                                            int i40 = zzB8;
                                            String str34 = str7;
                                            zzq zzqVar3 = zzqVar2;
                                            float f = 1.0f;
                                            i16 = i36;
                                            int i41 = -1;
                                            zzgo zzgoVar2 = null;
                                            List list3 = null;
                                            int i42 = 8;
                                            int i43 = -1;
                                            int i44 = 8;
                                            int i45 = -1;
                                            int i46 = -1;
                                            int i47 = -1;
                                            boolean z20 = false;
                                            int i48 = -1;
                                            ByteBuffer byteBuffer = null;
                                            int i49 = -1;
                                            String str35 = null;
                                            zzalk zzalkVar = null;
                                            zzalm zzalmVar = null;
                                            zzfw zzfwVar = null;
                                            int i50 = -1;
                                            byte[] bArr = null;
                                            while (zzg3 - zzg2 < zzB7) {
                                                zzeuVar.zzh(zzg3);
                                                int zzg4 = zzeuVar.zzg();
                                                int zzB9 = zzeuVar.zzB();
                                                if (zzB9 == 0) {
                                                    i21 = zzg3;
                                                    if (zzeuVar.zzg() - zzg2 == zzB7) {
                                                        break;
                                                    }
                                                    i22 = 0;
                                                } else {
                                                    i21 = zzg3;
                                                    i22 = zzB9;
                                                }
                                                if (i22 > 0) {
                                                    i23 = zzg2;
                                                    z9 = true;
                                                } else {
                                                    i23 = zzg2;
                                                    z9 = false;
                                                }
                                                zzagl.zza(z9, str30);
                                                int zzB10 = zzeuVar.zzB();
                                                int i51 = zzB7;
                                                if (zzB10 == 1635148611) {
                                                    int i52 = zzg4 + 8;
                                                    zzagl.zza(str34 == null, null);
                                                    zzeuVar.zzh(i52);
                                                    zzafm zza3 = zzafm.zza(zzeuVar);
                                                    List list4 = zza3.zza;
                                                    zzalrVar4.zzc = zza3.zzb;
                                                    if (z20) {
                                                        z17 = true;
                                                    } else {
                                                        f = zza3.zzk;
                                                        z17 = false;
                                                    }
                                                    String str36 = zza3.zzl;
                                                    int i53 = zza3.zzj;
                                                    int i54 = zza3.zzg;
                                                    int i55 = zza3.zzh;
                                                    int i56 = zza3.zzi;
                                                    int i57 = zza3.zze;
                                                    list = list4;
                                                    str13 = str30;
                                                    str35 = str36;
                                                    i50 = i53;
                                                    i27 = i55;
                                                    zzalrVar2 = zzalrVar4;
                                                    str34 = "video/avc";
                                                    str15 = str28;
                                                    str14 = str29;
                                                    str16 = str33;
                                                    i44 = zza3.zzf;
                                                    i42 = i57;
                                                    zzgoVar = zzgoVar2;
                                                    z20 = z17;
                                                    i41 = i56;
                                                    i45 = i54;
                                                } else {
                                                    int i58 = i46;
                                                    if (zzB10 == 1752589123) {
                                                        int i59 = zzg4 + 8;
                                                        zzagl.zza(str34 == null, null);
                                                        zzeuVar.zzh(i59);
                                                        zzahb zza4 = zzahb.zza(zzeuVar);
                                                        List list5 = zza4.zza;
                                                        zzalrVar4.zzc = zza4.zzb;
                                                        if (z20) {
                                                            z16 = true;
                                                        } else {
                                                            f = zza4.zzl;
                                                            z16 = false;
                                                        }
                                                        int i60 = zza4.zzm;
                                                        int i61 = zza4.zzc;
                                                        String str37 = zza4.zzn;
                                                        int i62 = zza4.zzk;
                                                        int i63 = i62 != -1 ? i62 : i58;
                                                        int i64 = zza4.zzd;
                                                        int i65 = zza4.zze;
                                                        int i66 = zza4.zzh;
                                                        int i67 = zza4.zzi;
                                                        int i68 = zza4.zzj;
                                                        int i69 = zza4.zzf;
                                                        int i70 = zza4.zzg;
                                                        str35 = str37;
                                                        str13 = str30;
                                                        i50 = i60;
                                                        i49 = i64;
                                                        zzalrVar2 = zzalrVar4;
                                                        i48 = i65;
                                                        i27 = i67;
                                                        list = list5;
                                                        i42 = i69;
                                                        str15 = str28;
                                                        str34 = str29;
                                                        str14 = str34;
                                                        zzgoVar = zza4.zzo;
                                                        z20 = z16;
                                                        i47 = i61;
                                                        i45 = i66;
                                                        i46 = i63;
                                                        str16 = str33;
                                                        i44 = i70;
                                                        i41 = i68;
                                                    } else {
                                                        if (zzB10 == 1818785347) {
                                                            int i71 = zzg4 + 8;
                                                            String str38 = str29;
                                                            zzagl.zza(str38.equals(str34), "lhvC must follow hvcC atom");
                                                            if (zzgoVar2 != null) {
                                                                z15 = zzgoVar2.zza.size() >= 2;
                                                            } else {
                                                                z15 = false;
                                                                zzgoVar2 = null;
                                                            }
                                                            zzagl.zza(z15, "must have at least two layers");
                                                            zzeuVar.zzh(i71);
                                                            zzgoVar2.getClass();
                                                            zzahb zzb2 = zzahb.zzb(zzeuVar, zzgoVar2);
                                                            zzagl.zza(zzalrVar4.zzc == zzb2.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                            int i72 = zzb2.zzh;
                                                            if (i72 != -1) {
                                                                zzagl.zza(i45 == i72, "colorSpace must be the same for both views");
                                                            }
                                                            int i73 = zzb2.zzi;
                                                            if (i73 != -1) {
                                                                zzagl.zza(i43 == i73, "colorRange must be the same for both views");
                                                            }
                                                            int i74 = zzb2.zzj;
                                                            if (i74 != -1) {
                                                                zzagl.zza(i41 == i74, "colorTransfer must be the same for both views");
                                                            }
                                                            zzagl.zza(i42 == zzb2.zzf, "bitdepthLuma must be the same for both views");
                                                            zzagl.zza(i44 == zzb2.zzg, "bitdepthChroma must be the same for both views");
                                                            if (list3 != null) {
                                                                int i75 = zzgxm.zzd;
                                                                zzgxj zzgxjVar = new zzgxj();
                                                                zzgxjVar.zzh(list3);
                                                                zzgxjVar.zzh(zzb2.zza);
                                                                list3 = zzgxjVar.zzi();
                                                            } else {
                                                                zzagl.zza(false, "initializationData must be already set from hvcC atom");
                                                            }
                                                            str35 = zzb2.zzn;
                                                            str34 = "video/mv-hevc";
                                                            list = list3;
                                                            str13 = str30;
                                                            i27 = i43;
                                                            zzalrVar2 = zzalrVar4;
                                                            str14 = str38;
                                                            i46 = i58;
                                                            str16 = str33;
                                                        } else {
                                                            String str39 = str29;
                                                            if (zzB10 == 1987470147) {
                                                                int i76 = zzg4 + 8;
                                                                zzagl.zza(str34 == null, null);
                                                                zzeuVar.zzh(i76);
                                                                zzahw zza5 = zzahw.zza(zzeuVar);
                                                                List list6 = zza5.zza;
                                                                zzalrVar4.zzc = zza5.zzb;
                                                                String str40 = zza5.zzc;
                                                                str34 = "video/vvc";
                                                                i42 = zza5.zzd;
                                                                i44 = i42;
                                                                list = list6;
                                                                str35 = str40;
                                                                str13 = str30;
                                                                i27 = i43;
                                                                zzalrVar2 = zzalrVar4;
                                                                str14 = str39;
                                                                i46 = i58;
                                                                str16 = str33;
                                                                i50 = 16;
                                                            } else {
                                                                if (zzB10 == 1986361461) {
                                                                    zzeuVar.zzh(zzg4 + 8);
                                                                    int zzg5 = zzeuVar.zzg();
                                                                    str14 = str39;
                                                                    zzaln zzalnVar = null;
                                                                    while (zzg5 - zzg4 < i22) {
                                                                        zzeuVar.zzh(zzg5);
                                                                        int zzB11 = zzeuVar.zzB();
                                                                        if (zzB11 > 0) {
                                                                            zzalrVar3 = zzalrVar4;
                                                                            z14 = true;
                                                                        } else {
                                                                            zzalrVar3 = zzalrVar4;
                                                                            z14 = false;
                                                                        }
                                                                        zzagl.zza(z14, str30);
                                                                        int i77 = i44;
                                                                        if (zzeuVar.zzB() == 1702454643) {
                                                                            zzeuVar.zzh(zzg5 + 8);
                                                                            int zzg6 = zzeuVar.zzg();
                                                                            while (true) {
                                                                                if (zzg6 - zzg5 >= zzB11) {
                                                                                    str21 = str30;
                                                                                    i30 = i42;
                                                                                    zzalnVar = null;
                                                                                    break;
                                                                                }
                                                                                zzeuVar.zzh(zzg6);
                                                                                int zzB12 = zzeuVar.zzB();
                                                                                zzagl.zza(zzB12 > 0, str30);
                                                                                str21 = str30;
                                                                                if (zzeuVar.zzB() == 1937011305) {
                                                                                    zzeuVar.zzk(4);
                                                                                    int zzs = zzeuVar.zzs();
                                                                                    i30 = i42;
                                                                                    zzalnVar = new zzaln(new zzalq(1 == (zzs & 1), (zzs & 2) == 2, (zzs & 8) == 8));
                                                                                } else {
                                                                                    zzg6 += zzB12;
                                                                                    str30 = str21;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str21 = str30;
                                                                            i30 = i42;
                                                                        }
                                                                        zzg5 += zzB11;
                                                                        zzalrVar4 = zzalrVar3;
                                                                        i44 = i77;
                                                                        str30 = str21;
                                                                        i42 = i30;
                                                                    }
                                                                    str13 = str30;
                                                                    i24 = i42;
                                                                    i25 = i44;
                                                                    zzalrVar2 = zzalrVar4;
                                                                    zzalu zzaluVar = zzalnVar == null ? null : new zzalu(zzalnVar);
                                                                    if (zzaluVar != null) {
                                                                        if (zzgoVar2 == null) {
                                                                            z13 = true;
                                                                            i29 = i58;
                                                                            zzgoVar2 = null;
                                                                        } else if (zzgoVar2.zza.size() >= 2) {
                                                                            zzagl.zza(zzaluVar.zza(), "both eye views must be marked as available");
                                                                            zzagl.zza(!zzaluVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                                            list = list3;
                                                                            i27 = i43;
                                                                            i26 = i58;
                                                                            str16 = str33;
                                                                            str15 = str28;
                                                                        } else {
                                                                            z13 = true;
                                                                            i29 = i58;
                                                                        }
                                                                        if (i29 != -1) {
                                                                            list = list3;
                                                                            i46 = i29;
                                                                            i27 = i43;
                                                                            str15 = str28;
                                                                            str16 = str33;
                                                                            i44 = i25;
                                                                            i42 = i24;
                                                                        } else if (z13 != zzaluVar.zzb().zza().zzc()) {
                                                                            list = list3;
                                                                            i27 = i43;
                                                                            str15 = str28;
                                                                            str16 = str33;
                                                                            i44 = i25;
                                                                            i42 = i24;
                                                                            i46 = 4;
                                                                            zzgoVar = zzgoVar2;
                                                                        } else {
                                                                            list = list3;
                                                                            i27 = i43;
                                                                            i46 = 5;
                                                                            str15 = str28;
                                                                            str16 = str33;
                                                                            i44 = i25;
                                                                            i42 = i24;
                                                                        }
                                                                        zzgoVar = zzgoVar2;
                                                                    } else {
                                                                        i26 = i58;
                                                                        list = list3;
                                                                        i27 = i43;
                                                                        str15 = str28;
                                                                        str16 = str33;
                                                                    }
                                                                    zzgoVar = zzgoVar2;
                                                                } else {
                                                                    str13 = str30;
                                                                    i24 = i42;
                                                                    i25 = i44;
                                                                    zzalrVar2 = zzalrVar4;
                                                                    str14 = str39;
                                                                    i26 = i58;
                                                                    if (zzB10 == 1685480259 || zzB10 == 1685485123 || zzB10 == 1685485379) {
                                                                        list = list3;
                                                                        i27 = i43;
                                                                        str15 = str28;
                                                                        str16 = str33;
                                                                        zzgoVar = zzgoVar2;
                                                                        zzfwVar = zzfw.zza(zzeuVar);
                                                                    } else {
                                                                        if (zzB10 == 1987076931) {
                                                                            int i78 = zzg4 + 12;
                                                                            if (str34 == null) {
                                                                                str19 = null;
                                                                                z12 = true;
                                                                            } else {
                                                                                str19 = null;
                                                                                z12 = false;
                                                                            }
                                                                            zzagl.zza(z12, str19);
                                                                            zzeuVar.zzh(i78);
                                                                            byte zzs2 = (byte) zzeuVar.zzs();
                                                                            byte zzs3 = (byte) zzeuVar.zzs();
                                                                            int zzs4 = zzeuVar.zzs();
                                                                            int i79 = zzs4 >> 4;
                                                                            int i80 = zzs4 >> 1;
                                                                            int i81 = i40;
                                                                            if (i81 == 1987063864) {
                                                                                str17 = "video/x-vnd.on2.vp8";
                                                                                str20 = str28;
                                                                            } else {
                                                                                str17 = str28;
                                                                                str20 = str17;
                                                                            }
                                                                            if (str17.equals(str20)) {
                                                                                list3 = zzdr.zza(zzs2, zzs3, (byte) i79, (byte) (i80 & 7));
                                                                            }
                                                                            int i82 = zzs4 & 1;
                                                                            int zzs5 = zzeuVar.zzs();
                                                                            int zzs6 = zzeuVar.zzs();
                                                                            int zzb3 = zzi.zzb(zzs5);
                                                                            int i83 = 1 != i82 ? 2 : 1;
                                                                            i41 = zzi.zzc(zzs6);
                                                                            i27 = i83;
                                                                            zzgoVar = zzgoVar2;
                                                                            i45 = zzb3;
                                                                            list = list3;
                                                                            i40 = i81;
                                                                            i44 = i79;
                                                                            i46 = i26;
                                                                            str15 = str20;
                                                                            str16 = str33;
                                                                            i42 = i44;
                                                                        } else {
                                                                            String str41 = str28;
                                                                            int i84 = i40;
                                                                            if (zzB10 == 1635135811) {
                                                                                int i85 = i22 - 8;
                                                                                byte[] bArr2 = new byte[i85];
                                                                                zzeuVar.zzm(bArr2, 0, i85);
                                                                                zzgxm zzj = zzgxm.zzj(bArr2);
                                                                                zzafl zza6 = zzafl.zza(bArr2);
                                                                                if (zza6 != null) {
                                                                                    String str42 = zza6.zze;
                                                                                    int i86 = zza6.zzd;
                                                                                    i43 = zza6.zzc;
                                                                                    i45 = zza6.zzb;
                                                                                    i28 = zza6.zza;
                                                                                    str35 = str42;
                                                                                    i24 = i28;
                                                                                    i41 = i86;
                                                                                } else {
                                                                                    i28 = i25;
                                                                                }
                                                                                list = zzj;
                                                                                zzgoVar = zzgoVar2;
                                                                                i44 = i28;
                                                                                str34 = "video/av01";
                                                                                i40 = i84;
                                                                                i46 = i26;
                                                                                i27 = i43;
                                                                                str15 = str41;
                                                                                str16 = str33;
                                                                            } else {
                                                                                if (zzB10 == 1668050025) {
                                                                                    if (byteBuffer == null) {
                                                                                        byteBuffer = zzo();
                                                                                    }
                                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                                    byteBuffer2.position(21);
                                                                                    byteBuffer2.putShort(zzeuVar.zzv());
                                                                                    byteBuffer2.putShort(zzeuVar.zzv());
                                                                                    byteBuffer = byteBuffer2;
                                                                                    zzgoVar = zzgoVar2;
                                                                                    list = list3;
                                                                                    i40 = i84;
                                                                                    i46 = i26;
                                                                                    i27 = i43;
                                                                                    str15 = str41;
                                                                                } else if (zzB10 == 1835295606) {
                                                                                    if (byteBuffer == null) {
                                                                                        byteBuffer = zzo();
                                                                                    }
                                                                                    ByteBuffer byteBuffer3 = byteBuffer;
                                                                                    short zzv3 = zzeuVar.zzv();
                                                                                    short zzv4 = zzeuVar.zzv();
                                                                                    short zzv5 = zzeuVar.zzv();
                                                                                    short zzv6 = zzeuVar.zzv();
                                                                                    zzgoVar = zzgoVar2;
                                                                                    short zzv7 = zzeuVar.zzv();
                                                                                    i40 = i84;
                                                                                    short zzv8 = zzeuVar.zzv();
                                                                                    str15 = str41;
                                                                                    short zzv9 = zzeuVar.zzv();
                                                                                    i27 = i43;
                                                                                    short zzv10 = zzeuVar.zzv();
                                                                                    long zzz = zzeuVar.zzz();
                                                                                    long zzz2 = zzeuVar.zzz();
                                                                                    list = list3;
                                                                                    byteBuffer3.position(1);
                                                                                    byteBuffer3.putShort(zzv7);
                                                                                    byteBuffer3.putShort(zzv8);
                                                                                    byteBuffer3.putShort(zzv3);
                                                                                    byteBuffer3.putShort(zzv4);
                                                                                    byteBuffer3.putShort(zzv5);
                                                                                    byteBuffer3.putShort(zzv6);
                                                                                    byteBuffer3.putShort(zzv9);
                                                                                    byteBuffer3.putShort(zzv10);
                                                                                    byteBuffer3.putShort((short) (zzz / 10000));
                                                                                    byteBuffer3.putShort((short) (zzz2 / 10000));
                                                                                    byteBuffer = byteBuffer3;
                                                                                    i46 = i26;
                                                                                } else {
                                                                                    zzgoVar = zzgoVar2;
                                                                                    list = list3;
                                                                                    i40 = i84;
                                                                                    i27 = i43;
                                                                                    str15 = str41;
                                                                                    if (zzB10 == 1681012275) {
                                                                                        if (str34 == null) {
                                                                                            str18 = null;
                                                                                            z11 = true;
                                                                                        } else {
                                                                                            str18 = null;
                                                                                            z11 = false;
                                                                                        }
                                                                                        zzagl.zza(z11, str18);
                                                                                        i46 = i26;
                                                                                        str34 = str;
                                                                                        str16 = str33;
                                                                                        i44 = i25;
                                                                                        i42 = i24;
                                                                                    } else {
                                                                                        if (zzB10 == 1702061171) {
                                                                                            zzagl.zza(str34 == null, null);
                                                                                            zzalm zzs7 = zzs(zzeuVar, zzg4);
                                                                                            String zza7 = zzs7.zza();
                                                                                            byte[] zzb4 = zzs7.zzb();
                                                                                            if (zzb4 != null) {
                                                                                                zzalmVar = zzs7;
                                                                                                str34 = zza7;
                                                                                                list = zzgxm.zzj(zzb4);
                                                                                            } else {
                                                                                                zzalmVar = zzs7;
                                                                                                str34 = zza7;
                                                                                            }
                                                                                        } else if (zzB10 == 1651798644) {
                                                                                            zzalkVar = zzt(zzeuVar, zzg4);
                                                                                        } else if (zzB10 == 1885434736) {
                                                                                            zzeuVar.zzh(zzg4 + 8);
                                                                                            f = zzeuVar.zzH() / zzeuVar.zzH();
                                                                                            i46 = i26;
                                                                                            str16 = str33;
                                                                                            i44 = i25;
                                                                                            i42 = i24;
                                                                                            z20 = true;
                                                                                        } else if (zzB10 == 1937126244) {
                                                                                            int i87 = zzg4 + 8;
                                                                                            while (true) {
                                                                                                if (i87 - zzg4 >= i22) {
                                                                                                    bArr = null;
                                                                                                    break;
                                                                                                }
                                                                                                zzeuVar.zzh(i87);
                                                                                                int zzB13 = zzeuVar.zzB() + i87;
                                                                                                if (zzeuVar.zzB() == 1886547818) {
                                                                                                    bArr = Arrays.copyOfRange(zzeuVar.zzi(), i87, zzB13);
                                                                                                    break;
                                                                                                }
                                                                                                i87 = zzB13;
                                                                                            }
                                                                                        } else {
                                                                                            if (zzB10 == 1936995172) {
                                                                                                int zzs8 = zzeuVar.zzs();
                                                                                                zzeuVar.zzk(3);
                                                                                                if (zzs8 == 0) {
                                                                                                    int zzs9 = zzeuVar.zzs();
                                                                                                    if (zzs9 == 0) {
                                                                                                        str16 = str33;
                                                                                                        i44 = i25;
                                                                                                        i42 = i24;
                                                                                                        i46 = 0;
                                                                                                    } else if (zzs9 == 1) {
                                                                                                        str16 = str33;
                                                                                                        i44 = i25;
                                                                                                        i42 = i24;
                                                                                                        i46 = 1;
                                                                                                    } else if (zzs9 == 2) {
                                                                                                        str16 = str33;
                                                                                                        i44 = i25;
                                                                                                        i42 = i24;
                                                                                                        i46 = 2;
                                                                                                    } else if (zzs9 == 3) {
                                                                                                        i46 = 3;
                                                                                                        str16 = str33;
                                                                                                        i44 = i25;
                                                                                                        i42 = i24;
                                                                                                    }
                                                                                                }
                                                                                            } else if (zzB10 == 1634760259) {
                                                                                                int i88 = i22 - 12;
                                                                                                byte[] bArr3 = new byte[i88];
                                                                                                zzeuVar.zzh(zzg4 + 12);
                                                                                                zzeuVar.zzm(bArr3, 0, i88);
                                                                                                String zzd5 = zzdr.zzd(bArr3);
                                                                                                zzgxm zzj2 = zzgxm.zzj(bArr3);
                                                                                                zzi zzn = zzn(new zzeu(bArr3));
                                                                                                int i89 = zzn.zzf;
                                                                                                int i90 = zzn.zzg;
                                                                                                int i91 = zzn.zzb;
                                                                                                int i92 = zzn.zzc;
                                                                                                i41 = zzn.zzd;
                                                                                                str17 = "video/apv";
                                                                                                str35 = zzd5;
                                                                                                list = zzj2;
                                                                                                i46 = i26;
                                                                                                i45 = i91;
                                                                                                i27 = i92;
                                                                                                str16 = str33;
                                                                                                i42 = i89;
                                                                                                i44 = i90;
                                                                                            } else if (zzB10 == 1668246642) {
                                                                                                if (i45 != -1) {
                                                                                                    str16 = str33;
                                                                                                } else if (i41 == -1) {
                                                                                                    int zzB14 = zzeuVar.zzB();
                                                                                                    if (zzB14 == 1852009592 || zzB14 == 1852009571) {
                                                                                                        str16 = str33;
                                                                                                        int zzt4 = zzeuVar.zzt();
                                                                                                        int zzt5 = zzeuVar.zzt();
                                                                                                        zzeuVar.zzk(2);
                                                                                                        if (i22 == 19) {
                                                                                                            if ((zzeuVar.zzs() & 128) != 0) {
                                                                                                                i22 = 19;
                                                                                                                z10 = true;
                                                                                                                int zzb5 = zzi.zzb(zzt4);
                                                                                                                int i93 = true == z10 ? 2 : 1;
                                                                                                                i45 = zzb5;
                                                                                                                i41 = zzi.zzc(zzt5);
                                                                                                                i46 = i26;
                                                                                                                i27 = i93;
                                                                                                                i44 = i25;
                                                                                                                i42 = i24;
                                                                                                            } else {
                                                                                                                i22 = 19;
                                                                                                            }
                                                                                                        }
                                                                                                        z10 = false;
                                                                                                        int zzb52 = zzi.zzb(zzt4);
                                                                                                        if (true == z10) {
                                                                                                        }
                                                                                                        i45 = zzb52;
                                                                                                        i41 = zzi.zzc(zzt5);
                                                                                                        i46 = i26;
                                                                                                        i27 = i93;
                                                                                                        i44 = i25;
                                                                                                        i42 = i24;
                                                                                                    } else {
                                                                                                        str16 = str33;
                                                                                                        zzeh.zzc(str16, "Unsupported color type: ".concat(zzgb.zze(zzB14)));
                                                                                                        i41 = -1;
                                                                                                        i45 = -1;
                                                                                                        i46 = i26;
                                                                                                        i44 = i25;
                                                                                                        i42 = i24;
                                                                                                    }
                                                                                                } else {
                                                                                                    str16 = str33;
                                                                                                    i45 = -1;
                                                                                                }
                                                                                            }
                                                                                            str16 = str33;
                                                                                        }
                                                                                        i46 = i26;
                                                                                        str16 = str33;
                                                                                        i44 = i25;
                                                                                        i42 = i24;
                                                                                    }
                                                                                }
                                                                                str16 = str33;
                                                                                i44 = i25;
                                                                            }
                                                                            i42 = i24;
                                                                        }
                                                                        str34 = str17;
                                                                    }
                                                                }
                                                                i46 = i26;
                                                                i44 = i25;
                                                                i42 = i24;
                                                            }
                                                        }
                                                        str15 = str28;
                                                        zzgoVar = zzgoVar2;
                                                    }
                                                    zzg3 = i21 + i22;
                                                    str33 = str16;
                                                    zzgoVar2 = zzgoVar;
                                                    zzg2 = i23;
                                                    str29 = str14;
                                                    str28 = str15;
                                                    zzB7 = i51;
                                                    zzalrVar4 = zzalrVar2;
                                                    str30 = str13;
                                                    i43 = i27;
                                                    list3 = list;
                                                }
                                                zzg3 = i21 + i22;
                                                str33 = str16;
                                                zzgoVar2 = zzgoVar;
                                                zzg2 = i23;
                                                str29 = str14;
                                                str28 = str15;
                                                zzB7 = i51;
                                                zzalrVar4 = zzalrVar2;
                                                str30 = str13;
                                                i43 = i27;
                                                list3 = list;
                                            }
                                            i17 = zzg2;
                                            List list7 = list3;
                                            int i94 = i42;
                                            int i95 = i43;
                                            int i96 = i44;
                                            i18 = zzB7;
                                            zzalr zzalrVar5 = zzalrVar4;
                                            int i97 = i46;
                                            str8 = str28;
                                            str9 = str29;
                                            str10 = str33;
                                            if (zzfwVar != null) {
                                                str11 = zzfwVar.zza;
                                                str34 = "video/dolby-vision";
                                            } else {
                                                str11 = str35;
                                            }
                                            if (str34 == null) {
                                                i20 = i38;
                                                z8 = z19;
                                                i19 = i39;
                                                str12 = str32;
                                                zzalrVar = zzalrVar5;
                                            } else {
                                                zzt zztVar = new zzt();
                                                i19 = i39;
                                                zztVar.zzb(i19);
                                                zztVar.zzo(str34);
                                                zztVar.zzk(str11);
                                                zztVar.zzv(zzt2);
                                                zztVar.zzw(zzt3);
                                                zztVar.zzx(i49);
                                                zztVar.zzy(i48);
                                                zztVar.zzC(f);
                                                i20 = i38;
                                                zztVar.zzA(i20);
                                                z8 = z19;
                                                zztVar.zzB(z8);
                                                zztVar.zzD(bArr);
                                                zztVar.zzE(i97);
                                                zztVar.zzr(list7);
                                                zztVar.zzq(i50);
                                                zztVar.zzG(i47);
                                                zztVar.zzs(zzqVar3);
                                                str12 = str32;
                                                zztVar.zze(str12);
                                                zzh zzhVar = new zzh();
                                                zzhVar.zza(i45);
                                                zzhVar.zzb(i95);
                                                zzhVar.zzc(i41);
                                                zzhVar.zzd(byteBuffer != null ? byteBuffer.array() : null);
                                                zzhVar.zze(i94);
                                                zzhVar.zzf(i96);
                                                zztVar.zzF(zzhVar.zzg());
                                                if (zzalkVar != null) {
                                                    zztVar.zzi(zzhbj.zzb(zzalkVar.zza()));
                                                    zztVar.zzj(zzhbj.zzb(zzalkVar.zzb()));
                                                } else if (zzalmVar != null) {
                                                    zztVar.zzi(zzhbj.zzb(zzalmVar.zzc()));
                                                    zztVar.zzj(zzhbj.zzb(zzalmVar.zzd()));
                                                }
                                                zzv zzQ = zztVar.zzQ();
                                                zzalrVar = zzalrVar5;
                                                zzalrVar.zzb = zzQ;
                                            }
                                        } else if (zzB8 == 1836069985 || zzB8 == 1701733217 || zzB8 == 1633889587 || zzB8 == 1700998451 || zzB8 == 1633889588 || zzB8 == 1835823201 || zzB8 == 1685353315 || zzB8 == 1685353317 || zzB8 == 1685353320 || zzB8 == 1685353324 || zzB8 == 1685353336 || zzB8 == 1935764850 || zzB8 == 1935767394 || zzB8 == 1819304813 || zzB8 == 1936684916 || zzB8 == 1953984371 || zzB8 == 778924082 || zzB8 == 778924083 || zzB8 == 1835557169 || zzB8 == 1835560241 || zzB8 == 1634492771 || zzB8 == 1634492791 || zzB8 == 1970037111 || zzB8 == 1332770163 || zzB8 == 1716281667 || zzB8 == 1767992678 || zzB8 == 1768973165 || zzB8 == 1718641517) {
                                            i13 = zzB6;
                                            s = zzv;
                                            i14 = i;
                                            zzeuVar = zzeuVar3;
                                            arrayList2 = arrayList5;
                                            int i98 = zzB;
                                            String str43 = zzc7;
                                            c = '\f';
                                            zzfzVar3 = zzfzVar6;
                                            s2 = zzv2;
                                            j5 = zzw;
                                            i15 = i35;
                                            zzr(zzeuVar3, zzB8, zzg2, zzB7, zzB, zzc7, z2, zzqVar, zzalrVar4, i36);
                                            i17 = zzg2;
                                            i18 = zzB7;
                                            zzalrVar = zzalrVar4;
                                            i16 = i36;
                                            i20 = i7;
                                            z8 = z19;
                                            i19 = i98;
                                            str8 = str28;
                                            str9 = str29;
                                            str12 = str43;
                                            str10 = str31;
                                        } else if (zzB8 == 1414810956 || zzB8 == 1954034535 || zzB8 == 2004251764 || zzB8 == 1937010800 || zzB8 == 1664495672 || zzB8 == 1836070003 || zzB8 == 1952807028) {
                                            zzeuVar3.zzh(zzg2 + 16);
                                            if (zzB8 == 1414810956) {
                                                j6 = zzw;
                                                str22 = "application/ttml+xml";
                                            } else if (zzB8 == 1954034535) {
                                                int i99 = zzB7 - 16;
                                                byte[] bArr4 = new byte[i99];
                                                zzeuVar3.zzm(bArr4, 0, i99);
                                                zzgxmVar = zzgxm.zzj(bArr4);
                                                str22 = "application/x-quicktime-tx3g";
                                                j6 = zzw;
                                                s3 = zzv2;
                                                j7 = Long.MAX_VALUE;
                                                c2 = 25715;
                                                if (str22 == null) {
                                                    zzt zztVar2 = new zzt();
                                                    zztVar2.zzb(zzB);
                                                    zztVar2.zzo(str22);
                                                    zztVar2.zze(zzc7);
                                                    zztVar2.zzt(j7);
                                                    zztVar2.zzr(zzgxmVar);
                                                    zzalrVar4.zzb = zztVar2.zzQ();
                                                    i13 = zzB6;
                                                    i19 = zzB;
                                                    s2 = s3;
                                                    str12 = zzc7;
                                                    i18 = zzB7;
                                                    zzalrVar = zzalrVar4;
                                                    i16 = i36;
                                                    i20 = i7;
                                                    s = zzv;
                                                    z8 = z19;
                                                    arrayList2 = arrayList5;
                                                    i14 = i;
                                                    zzfzVar3 = zzfzVar6;
                                                    i15 = i35;
                                                    str8 = str28;
                                                    str9 = str29;
                                                    str10 = str31;
                                                    j5 = j6;
                                                    c = '\f';
                                                    i17 = zzg2;
                                                    zzeuVar = zzeuVar3;
                                                } else {
                                                    i13 = zzB6;
                                                    s2 = s3;
                                                    str12 = zzc7;
                                                    i18 = zzB7;
                                                    zzalrVar = zzalrVar4;
                                                    i16 = i36;
                                                    s = zzv;
                                                    z8 = z19;
                                                    arrayList2 = arrayList5;
                                                    i14 = i;
                                                    zzfzVar3 = zzfzVar6;
                                                    i15 = i35;
                                                    str8 = str28;
                                                    str9 = str29;
                                                    str10 = str31;
                                                    j5 = j6;
                                                    c = '\f';
                                                    i17 = zzg2;
                                                    zzeuVar = zzeuVar3;
                                                    i19 = zzB;
                                                    i20 = i7;
                                                }
                                            } else {
                                                if (zzB8 == 2004251764) {
                                                    str22 = "application/x-mp4-vtt";
                                                } else if (zzB8 == 1937010800) {
                                                    j6 = zzw;
                                                    str22 = "application/ttml+xml";
                                                    j7 = 0;
                                                    s3 = zzv2;
                                                    zzgxmVar = null;
                                                    c2 = 25715;
                                                    if (str22 == null) {
                                                    }
                                                } else if (zzB8 == 1664495672) {
                                                    zzalrVar4.zzd = 1;
                                                    str22 = "application/x-mp4-cea-608";
                                                } else {
                                                    j6 = zzw;
                                                    if (zzB8 == 1836070003) {
                                                        int zzg7 = zzeuVar3.zzg();
                                                        zzeuVar3.zzk(4);
                                                        c2 = 25715;
                                                        if (zzeuVar3.zzB() == 1702061171) {
                                                            zzalm zzs10 = zzs(zzeuVar3, zzg7);
                                                            if (zzs10.zzb() == null || zzs10.zzb().length != 64) {
                                                                i13 = zzB6;
                                                                i18 = zzB7;
                                                                zzalrVar = zzalrVar4;
                                                                i16 = i36;
                                                                s = zzv;
                                                                arrayList2 = arrayList5;
                                                                i14 = i;
                                                                zzfzVar3 = zzfzVar6;
                                                                i15 = i35;
                                                                str8 = str28;
                                                                str9 = str29;
                                                                s2 = zzv2;
                                                                str10 = str31;
                                                                j5 = j6;
                                                                c = '\f';
                                                                i17 = zzg2;
                                                                zzeuVar = zzeuVar3;
                                                                str12 = zzc7;
                                                                z8 = z19;
                                                                i19 = zzB;
                                                                i20 = i7;
                                                            } else {
                                                                s3 = zzv2;
                                                                String zzm = zzm(zzs10.zzb(), zzv, s3);
                                                                String str44 = zzfm.zza;
                                                                zzgxmVar = zzgxm.zzj(zzm.getBytes(StandardCharsets.UTF_8));
                                                                str22 = "application/vobsub";
                                                            }
                                                        } else {
                                                            s3 = zzv2;
                                                            zzgxmVar = null;
                                                            str22 = null;
                                                        }
                                                        j7 = Long.MAX_VALUE;
                                                    } else {
                                                        s3 = zzv2;
                                                        c2 = 25715;
                                                        str22 = str2;
                                                        j7 = Long.MAX_VALUE;
                                                        zzgxmVar = null;
                                                    }
                                                    if (str22 == null) {
                                                    }
                                                }
                                                j6 = zzw;
                                            }
                                            s3 = zzv2;
                                            j7 = Long.MAX_VALUE;
                                            zzgxmVar = null;
                                            c2 = 25715;
                                            if (str22 == null) {
                                            }
                                        } else {
                                            if (zzB8 == 1835365492 || zzB8 == 1769222965) {
                                                zzp(zzeuVar3, zzB8, zzg2, zzB, zzalrVar4);
                                            } else if (zzB8 == 1667329389) {
                                                zzt zztVar3 = new zzt();
                                                zztVar3.zzb(zzB);
                                                zztVar3.zzo("application/x-camera-motion");
                                                zzalrVar4.zzb = zztVar3.zzQ();
                                            }
                                            i17 = zzg2;
                                            i13 = zzB6;
                                            str12 = zzc7;
                                            j5 = zzw;
                                            i18 = zzB7;
                                            zzalrVar = zzalrVar4;
                                            i16 = i36;
                                            s = zzv;
                                            z8 = z19;
                                            arrayList2 = arrayList5;
                                            i14 = i;
                                            zzfzVar3 = zzfzVar6;
                                            i15 = i35;
                                            str8 = str28;
                                            str9 = str29;
                                            s2 = zzv2;
                                            str10 = str31;
                                            c = '\f';
                                            zzeuVar = zzeuVar3;
                                            i19 = zzB;
                                            i20 = i7;
                                        }
                                        zzeuVar.zzh(i17 + i18);
                                        i36 = i16 + 1;
                                        str27 = str10;
                                        i7 = i20;
                                        zzalrVar4 = zzalrVar;
                                        z6 = z8;
                                        zzc7 = str12;
                                        zzB = i19;
                                        zzeuVar3 = zzeuVar;
                                        zzv2 = s2;
                                        c3 = c;
                                        zzB6 = i13;
                                        zzv = s;
                                        i = i14;
                                        zzt = i37;
                                        str29 = str9;
                                        arrayList5 = arrayList2;
                                        zzfzVar6 = zzfzVar3;
                                        str28 = str8;
                                        zzw = j5;
                                        i35 = i15;
                                    }
                                    int i100 = zzt;
                                    long j9 = zzw;
                                    zzalr zzalrVar6 = zzalrVar4;
                                    arrayList = arrayList5;
                                    i11 = i;
                                    zzfz zzfzVar7 = zzfzVar6;
                                    int i101 = i35;
                                    str3 = str28;
                                    str4 = str29;
                                    int i102 = -1;
                                    str5 = str27;
                                    int i103 = zzB;
                                    zzfz zzd6 = zzfzVar7.zzd(1953654118);
                                    if (zzd6 == null || (zzc2 = zzd6.zzc(1667785072)) == null) {
                                        i12 = 8;
                                    } else {
                                        zzeu zzeuVar4 = zzc2.zza;
                                        i12 = 8;
                                        zzeuVar4.zzh(8);
                                        if (zzeuVar4.zzd() >= 4) {
                                            i102 = zzeuVar4.zzB();
                                        }
                                    }
                                    if (z || (zzd = zzfzVar7.zzd(1701082227)) == null || (zzq = zzq(zzd)) == null) {
                                        zzhbhVar = null;
                                        zzhbhVar2 = null;
                                    } else {
                                        zzhbhVar2 = (zzhbh) zzq.first;
                                        zzhbhVar = (zzhbh) zzq.second;
                                    }
                                    zzv zzvVar = zzalrVar6.zzb;
                                    if (zzvVar == null) {
                                        zzgubVar2 = zzgubVar;
                                        zzo = null;
                                        zzfzVar2 = zzfzVar7;
                                        str6 = str2;
                                        zzamwVar = (zzamw) zzgubVar2.apply(zzo);
                                        if (zzamwVar == null) {
                                            zzfz zzd7 = zzfzVar2.zzd(1835297121);
                                            zzd7.getClass();
                                            zzfz zzd8 = zzd7.zzd(1835626086);
                                            zzd8.getClass();
                                            zzfz zzd9 = zzd8.zzd(1937007212);
                                            zzd9.getClass();
                                            zzamz zzg8 = zzg(zzamwVar, zzd9, zzahaVar, false);
                                            arrayList3 = arrayList;
                                            arrayList3.add(zzg8);
                                        } else {
                                            arrayList3 = arrayList;
                                        }
                                    } else {
                                        if (i100 != 0) {
                                            zzfy zzfyVar = new zzfy(i100);
                                            zzt zza8 = zzvVar.zza();
                                            zzap zzapVar2 = zzvVar.zzl;
                                            if (zzapVar2 != null) {
                                                z7 = true;
                                                zzapVar = zzapVar2.zzg(zzfyVar);
                                                zzfzVar2 = zzfzVar7;
                                            } else {
                                                z7 = true;
                                                zzfzVar2 = zzfzVar7;
                                                zzapVar = new zzap(-9223372036854775807L, zzfyVar);
                                            }
                                            zza8.zzl(zzapVar);
                                            zzvVar = zza8.zzQ();
                                        } else {
                                            zzfzVar2 = zzfzVar7;
                                            z7 = true;
                                        }
                                        str6 = str2;
                                        boolean equals = Objects.equals(zzvVar.zzp, str6) ^ z7;
                                        zzamv zzamvVar = new zzamv();
                                        zzamvVar.zza(i103);
                                        zzamvVar.zzb(i101);
                                        zzamvVar.zzc(zzl.zza());
                                        zzamvVar.zzd(j8);
                                        zzamvVar.zze(j9);
                                        zzamvVar.zzf(zzl.zzb());
                                        zzamvVar.zzg(zzvVar);
                                        zzamvVar.zzh(zzalrVar6.zzd);
                                        zzamvVar.zzi(zzalrVar6.zza);
                                        zzamvVar.zzj(zzalrVar6.zzc);
                                        zzamvVar.zzk(zzhbhVar2);
                                        zzamvVar.zzl(zzhbhVar);
                                        zzamvVar.zzm(equals);
                                        zzamvVar.zzn(i102);
                                        zzo = zzamvVar.zzo();
                                    }
                                }
                            }
                            zzB3 = 65536;
                        }
                        zzB2 = 0;
                    }
                    if (zzB2 == 0) {
                        if (zzB3 == -65536) {
                            if (zzB4 == 65536) {
                                i3 = zzB4;
                                z4 = true;
                                z5 = zzB5 != 0;
                                i9 = i3;
                            } else if (zzB4 == -65536) {
                                z5 = zzB5 != 0;
                                i9 = -65536;
                                i3 = -65536;
                                z4 = true;
                            } else {
                                i3 = zzB4;
                                zzB3 = -65536;
                            }
                            if (z4 != z5) {
                                i6 = zzB5;
                                i34 = zzB3;
                                i8 = 16;
                                i7 = 270;
                                zzB4 = i9;
                                zzeuVar2.zzk(i8);
                                short zzv11 = zzeuVar2.zzv();
                                int i352 = zzk;
                                zzeuVar2.zzk(2);
                                String str282 = str23;
                                String str292 = str24;
                                short zzv22 = zzeuVar2.zzv();
                                if ((zzB2 * i6) - (i34 * zzB4) < 0) {
                                }
                                if (j == j3) {
                                }
                                long j82 = zzd(zzc3.zza).zzc;
                                if (j4 == j3) {
                                }
                                zzfz zzd32 = zzd2.zzd(i10);
                                zzd32.getClass();
                                zzfz zzd42 = zzd32.zzd(1937007212);
                                zzd42.getClass();
                                zzga zzc62 = zzd2.zzc(1835296868);
                                zzc62.getClass();
                                zzalo zzl2 = zzl(zzc62.zza);
                                zzc = zzd42.zzc(1937011556);
                                if (zzc == null) {
                                }
                            } else {
                                zzB3 = -65536;
                                zzB4 = i9;
                                i4 = 0;
                                zzB2 = 0;
                            }
                        } else {
                            i3 = zzB4;
                        }
                        i5 = zzB3;
                        i4 = 0;
                        zzB2 = 0;
                        if (zzB2 == -65536) {
                            if (zzB2 == 65536) {
                                i4 = 65536;
                            }
                            zzB2 = i4;
                            i6 = zzB5;
                            i34 = zzB3;
                            i7 = 0;
                            i8 = 16;
                            zzeuVar2.zzk(i8);
                            short zzv112 = zzeuVar2.zzv();
                            int i3522 = zzk;
                            zzeuVar2.zzk(2);
                            String str2822 = str23;
                            String str2922 = str24;
                            short zzv222 = zzeuVar2.zzv();
                            if ((zzB2 * i6) - (i34 * zzB4) < 0) {
                            }
                            if (j == j3) {
                            }
                            long j822 = zzd(zzc3.zza).zzc;
                            if (j4 == j3) {
                            }
                            zzfz zzd322 = zzd2.zzd(i10);
                            zzd322.getClass();
                            zzfz zzd422 = zzd322.zzd(1937007212);
                            zzd422.getClass();
                            zzga zzc622 = zzd2.zzc(1835296868);
                            zzc622.getClass();
                            zzalo zzl22 = zzl(zzc622.zza);
                            zzc = zzd422.zzc(1937011556);
                            if (zzc == null) {
                            }
                        } else {
                            i4 = zzB2;
                        }
                        if (i5 == 0 && i3 == 0 && zzB5 == -65536) {
                            i7 = 180;
                            i6 = -65536;
                            zzB2 = i4;
                            i34 = zzB3;
                            i8 = 16;
                            zzeuVar2.zzk(i8);
                            short zzv1122 = zzeuVar2.zzv();
                            int i35222 = zzk;
                            zzeuVar2.zzk(2);
                            String str28222 = str23;
                            String str29222 = str24;
                            short zzv2222 = zzeuVar2.zzv();
                            if ((zzB2 * i6) - (i34 * zzB4) < 0) {
                            }
                            if (j == j3) {
                            }
                            long j8222 = zzd(zzc3.zza).zzc;
                            if (j4 == j3) {
                            }
                            zzfz zzd3222 = zzd2.zzd(i10);
                            zzd3222.getClass();
                            zzfz zzd4222 = zzd3222.zzd(1937007212);
                            zzd4222.getClass();
                            zzga zzc6222 = zzd2.zzc(1835296868);
                            zzc6222.getClass();
                            zzalo zzl222 = zzl(zzc6222.zza);
                            zzc = zzd4222.zzc(1937011556);
                            if (zzc == null) {
                            }
                        }
                        zzB2 = i4;
                        i6 = zzB5;
                        i34 = zzB3;
                        i7 = 0;
                        i8 = 16;
                        zzeuVar2.zzk(i8);
                        short zzv11222 = zzeuVar2.zzv();
                        int i352222 = zzk;
                        zzeuVar2.zzk(2);
                        String str282222 = str23;
                        String str292222 = str24;
                        short zzv22222 = zzeuVar2.zzv();
                        if ((zzB2 * i6) - (i34 * zzB4) < 0) {
                        }
                        if (j == j3) {
                        }
                        long j82222 = zzd(zzc3.zza).zzc;
                        if (j4 == j3) {
                        }
                        zzfz zzd32222 = zzd2.zzd(i10);
                        zzd32222.getClass();
                        zzfz zzd42222 = zzd32222.zzd(1937007212);
                        zzd42222.getClass();
                        zzga zzc62222 = zzd2.zzc(1835296868);
                        zzc62222.getClass();
                        zzalo zzl2222 = zzl(zzc62222.zza);
                        zzc = zzd42222.zzc(1937011556);
                        if (zzc == null) {
                        }
                    } else {
                        i3 = zzB4;
                        i4 = zzB2;
                    }
                    i5 = zzB3;
                    if (zzB2 == -65536) {
                    }
                    if (i5 == 0) {
                        i7 = 180;
                        i6 = -65536;
                        zzB2 = i4;
                        i34 = zzB3;
                        i8 = 16;
                        zzeuVar2.zzk(i8);
                        short zzv112222 = zzeuVar2.zzv();
                        int i3522222 = zzk;
                        zzeuVar2.zzk(2);
                        String str2822222 = str23;
                        String str2922222 = str24;
                        short zzv222222 = zzeuVar2.zzv();
                        if ((zzB2 * i6) - (i34 * zzB4) < 0) {
                        }
                        if (j == j3) {
                        }
                        long j822222 = zzd(zzc3.zza).zzc;
                        if (j4 == j3) {
                        }
                        zzfz zzd322222 = zzd2.zzd(i10);
                        zzd322222.getClass();
                        zzfz zzd422222 = zzd322222.zzd(1937007212);
                        zzd422222.getClass();
                        zzga zzc622222 = zzd2.zzc(1835296868);
                        zzc622222.getClass();
                        zzalo zzl22222 = zzl(zzc622222.zza);
                        zzc = zzd422222.zzc(1937011556);
                        if (zzc == null) {
                        }
                    }
                    zzB2 = i4;
                    i6 = zzB5;
                    i34 = zzB3;
                    i7 = 0;
                    i8 = 16;
                    zzeuVar2.zzk(i8);
                    short zzv1122222 = zzeuVar2.zzv();
                    int i35222222 = zzk;
                    zzeuVar2.zzk(2);
                    String str28222222 = str23;
                    String str29222222 = str24;
                    short zzv2222222 = zzeuVar2.zzv();
                    if ((zzB2 * i6) - (i34 * zzB4) < 0) {
                    }
                    if (j == j3) {
                    }
                    long j8222222 = zzd(zzc3.zza).zzc;
                    if (j4 == j3) {
                    }
                    zzfz zzd3222222 = zzd2.zzd(i10);
                    zzd3222222.getClass();
                    zzfz zzd4222222 = zzd3222222.zzd(1937007212);
                    zzd4222222.getClass();
                    zzga zzc6222222 = zzd2.zzc(1835296868);
                    zzc6222222.getClass();
                    zzalo zzl222222 = zzl(zzc6222222.zza);
                    zzc = zzd4222222.zzc(1937011556);
                    if (zzc == null) {
                    }
                }
                zzgubVar2 = zzgubVar;
                zzamwVar = (zzamw) zzgubVar2.apply(zzo);
                if (zzamwVar == null) {
                }
            }
            zzfzVar4 = zzfzVar;
            str27 = str5;
            str26 = str6;
            i31 = i12;
            i32 = i11 + 1;
            str25 = str;
            str24 = str4;
            str23 = str3;
            arrayList4 = arrayList3;
        }
    }

    public static zzap zzc(zzga zzgaVar) {
        int zzF;
        zzeu zzeuVar = zzgaVar.zza;
        zzeuVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzeuVar.zzd() >= 8) {
            int zzg = zzeuVar.zzg();
            int zzB = zzeuVar.zzB() + zzg;
            int zzB2 = zzeuVar.zzB();
            zzap zzapVar2 = null;
            if (zzB2 == 1835365473) {
                zzeuVar.zzh(zzg);
                zzeuVar.zzk(8);
                zzf(zzeuVar);
                while (true) {
                    if (zzeuVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg2 = zzeuVar.zzg();
                    int zzB3 = zzeuVar.zzB() + zzg2;
                    if (zzeuVar.zzB() == 1768715124) {
                        zzeuVar.zzh(zzg2);
                        zzeuVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzeuVar.zzg() < zzB3) {
                            zzao zzc = zzamf.zzc(zzeuVar);
                            if (zzc != null) {
                                arrayList.add(zzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                        }
                    } else {
                        zzeuVar.zzh(zzB3);
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == 1936553057) {
                zzeuVar.zzh(zzg);
                zzeuVar.zzk(12);
                while (true) {
                    if (zzeuVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg3 = zzeuVar.zzg();
                    int zzB4 = zzeuVar.zzB();
                    if (zzeuVar.zzB() != 1935766900) {
                        zzeuVar.zzh(zzg3 + zzB4);
                    } else if (zzB4 >= 16) {
                        zzeuVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzs = zzeuVar.zzs();
                            int zzs2 = zzeuVar.zzs();
                            if (zzs == 0) {
                                i = zzs2;
                            } else if (zzs == 1) {
                                i2 = zzs2;
                            }
                        }
                        if (i == 12) {
                            zzF = 240;
                        } else if (i == 13) {
                            zzF = 120;
                        } else {
                            if (i == 21 && zzeuVar.zzd() >= 8 && zzeuVar.zzg() + 8 <= zzB) {
                                int zzB5 = zzeuVar.zzB();
                                int zzB6 = zzeuVar.zzB();
                                if (zzB5 >= 12 && zzB6 == 1936877170) {
                                    zzF = zzeuVar.zzF();
                                }
                            }
                            zzF = -2147483647;
                        }
                        if (zzF != -2147483647) {
                            zzapVar2 = new zzap(-9223372036854775807L, new zzaki(zzF, i2));
                        }
                    }
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (zzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzi(zzeuVar));
            } else if (zzB2 == 1667788908) {
                zzapVar = zzapVar.zzf(zzh(zzeuVar));
            }
            zzeuVar.zzh(zzB);
        }
        return zzapVar;
    }

    public static zzgd zzd(zzeu zzeuVar) {
        long zzD;
        long zzD2;
        zzeuVar.zzh(8);
        if (zza(zzeuVar.zzB()) == 0) {
            zzD = zzeuVar.zzz();
            zzD2 = zzeuVar.zzz();
        } else {
            zzD = zzeuVar.zzD();
            zzD2 = zzeuVar.zzD();
        }
        return new zzgd(zzD, zzD2, zzeuVar.zzz());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        r8 = r12.zzB();
        r10 = r12.zzB();
        r9 = r9 - 16;
        r11 = new byte[r9];
        r12.zzm(r11, 0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        r9 = new com.google.android.gms.internal.ads.zzfx(r7, r11, r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        com.google.android.gms.internal.ads.zzeh.zzc("MetadataUtil", "Failed to parse metadata entry with key: ".concat(java.lang.String.valueOf(r7)));
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzap zze(zzfz zzfzVar) {
        zzga zzc = zzfzVar.zzc(1751411826);
        zzga zzc2 = zzfzVar.zzc(1801812339);
        zzga zzc3 = zzfzVar.zzc(1768715124);
        if (zzc != null && zzc2 != null && zzc3 != null && zzj(zzc.zza) == 1835299937) {
            zzeu zzeuVar = zzc2.zza;
            zzeuVar.zzh(12);
            int zzB = zzeuVar.zzB();
            String[] strArr = new String[zzB];
            for (int i = 0; i < zzB; i++) {
                int zzB2 = zzeuVar.zzB();
                zzeuVar.zzk(4);
                strArr[i] = zzeuVar.zzK(zzB2 - 8, StandardCharsets.UTF_8);
            }
            zzeu zzeuVar2 = zzc3.zza;
            zzeuVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzeuVar2.zzd() > 8) {
                int zzg = zzeuVar2.zzg() + zzeuVar2.zzB();
                int zzB3 = zzeuVar2.zzB() - 1;
                if (zzB3 < 0 || zzB3 >= zzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(zzB3);
                    zzeh.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[zzB3];
                    while (true) {
                        int zzg2 = zzeuVar2.zzg();
                        if (zzg2 >= zzg) {
                            break;
                        }
                        int zzB4 = zzeuVar2.zzB();
                        if (zzeuVar2.zzB() == 1684108385) {
                            break;
                        }
                        zzeuVar2.zzh(zzg2 + zzB4);
                    }
                    zzfx zzfxVar = null;
                    if (zzfxVar != null) {
                        arrayList.add(zzfxVar);
                    }
                }
                zzeuVar2.zzh(zzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzeu zzeuVar) {
        int zzg = zzeuVar.zzg();
        zzeuVar.zzk(4);
        if (zzeuVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzeuVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0484  */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzamz zzg(zzamw zzamwVar, zzfz zzfzVar, zzaha zzahaVar, boolean z) throws zzat {
        zzalp zzaltVar;
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        zzv zzvVar;
        long j;
        zzeu zzeuVar;
        int[] iArr;
        ArrayList arrayList;
        int i4;
        int i5;
        int[] iArr2;
        boolean z4;
        boolean z5;
        long[] jArr;
        int i6;
        int i7;
        zzamw zzamwVar2;
        int i8;
        int i9;
        int i10;
        long j2;
        long[] jArr2;
        int i11;
        int i12;
        long[] jArr3;
        int[] iArr3;
        ArrayList arrayList2;
        int i13;
        int i14;
        ArrayList arrayList3;
        int i15;
        int[] iArr4;
        long j3;
        zzhbh zzhbhVar;
        int[] iArr5;
        int i16;
        ArrayList arrayList4;
        zzamw zzamwVar3;
        boolean z6;
        int[] iArr6;
        int i17;
        long[] jArr4;
        int i18;
        long j4;
        zzhbh zzhbhVar2;
        zzhbh zzhbhVar3;
        int i19;
        boolean z7;
        int length;
        long j5;
        zzamw zzamwVar4 = zzamwVar;
        zzga zzc = zzfzVar.zzc(1937011578);
        if (zzc != null) {
            zzaltVar = new zzals(zzc, zzamwVar4.zzg);
        } else {
            zzga zzc2 = zzfzVar.zzc(1937013298);
            if (zzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzaltVar = new zzalt(zzc2);
        }
        int zza2 = zzaltVar.zza();
        if (zza2 == 0) {
            return new zzamz(zzamwVar, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzamwVar4.zzb == 2) {
            long j6 = zzamwVar4.zzf;
            if (j6 > 0) {
                zzt zza3 = zzamwVar4.zzg.zza();
                zza3.zzz(zza2 / (j6 / 1000000.0f));
                zzv zzQ = zza3.zzQ();
                zzamv zzamvVar = new zzamv(zzamwVar4, null);
                zzamvVar.zzg(zzQ);
                zzamwVar4 = zzamvVar.zzo();
            }
        }
        zzga zzc3 = zzfzVar.zzc(1937007471);
        if (zzc3 == null) {
            zzc3 = zzfzVar.zzc(1668232756);
            zzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        zzga zzc4 = zzfzVar.zzc(1937011555);
        zzc4.getClass();
        zzeu zzeuVar2 = zzc4.zza;
        zzga zzc5 = zzfzVar.zzc(1937011827);
        zzc5.getClass();
        zzeu zzeuVar3 = zzc5.zza;
        zzga zzc6 = zzfzVar.zzc(1937011571);
        zzeu zzeuVar4 = zzc6 != null ? zzc6.zza : null;
        zzga zzc7 = zzfzVar.zzc(1668576371);
        zzeu zzeuVar5 = zzc7 != null ? zzc7.zza : null;
        zzall zzallVar = new zzall(zzeuVar2, zzc3.zza, z2);
        zzeuVar3.zzh(12);
        int zzH = zzeuVar3.zzH() - 1;
        int zzH2 = zzeuVar3.zzH();
        int zzH3 = zzeuVar3.zzH();
        if (zzeuVar5 != null) {
            zzeuVar5.zzh(12);
            i = zzeuVar5.zzH();
        } else {
            i = 0;
        }
        if (zzeuVar4 != null) {
            zzeuVar4.zzh(12);
            i3 = zzeuVar4.zzH();
            if (i3 > 0) {
                i2 = zzeuVar4.zzH() - 1;
            } else {
                i2 = -1;
                zzeuVar4 = null;
            }
        } else {
            i2 = -1;
            i3 = 0;
        }
        int zzb2 = zzaltVar.zzb();
        zzv zzvVar2 = zzamwVar4.zzg;
        if (zzb2 != -1) {
            String str = zzvVar2.zzp;
            if (("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && zzH == 0) {
                z3 = i == 0 && i3 == 0;
                zzH = 0;
                ArrayList arrayList5 = new ArrayList();
                ?? r31 = zzeuVar4 != null ? 1 : 0;
                if (z3) {
                    zzvVar = zzvVar2;
                    long[] jArr5 = new long[zza2];
                    int[] iArr7 = new int[zza2];
                    long[] jArr6 = new long[zza2];
                    int[] iArr8 = new int[zza2];
                    zzamw zzamwVar5 = zzamwVar4;
                    int i20 = zzH3;
                    int i21 = i;
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    long j7 = 0;
                    long j8 = 0;
                    j = 0;
                    int i26 = i3;
                    int i27 = 0;
                    int i28 = i2;
                    int i29 = zzH;
                    int i30 = i28;
                    while (true) {
                        if (i23 >= zza2) {
                            zzeuVar = zzeuVar5;
                            iArr = iArr7;
                            arrayList = arrayList5;
                            i4 = i22;
                            i5 = i25;
                            iArr2 = iArr8;
                            break;
                        }
                        long j9 = j7;
                        boolean z8 = true;
                        int i31 = i22;
                        while (true) {
                            if (i31 != 0) {
                                arrayList2 = arrayList5;
                                i13 = zza2;
                                i14 = i31;
                                break;
                            }
                            z8 = zzallVar.zza();
                            arrayList2 = arrayList5;
                            i13 = zza2;
                            if (!z8) {
                                i14 = 0;
                                break;
                            }
                            j9 = zzallVar.zzd;
                            i31 = zzallVar.zzc;
                            zza2 = i13;
                            arrayList5 = arrayList2;
                        }
                        if (!z8) {
                            zzeh.zzc("BoxParsers", "Unexpected end of chunk data");
                            jArr5 = Arrays.copyOf(jArr5, i23);
                            int[] copyOf = Arrays.copyOf(iArr7, i23);
                            jArr6 = Arrays.copyOf(jArr6, i23);
                            iArr = copyOf;
                            zza2 = i23;
                            i5 = i25;
                            arrayList = arrayList2;
                            int i32 = i31;
                            zzeuVar = zzeuVar5;
                            i4 = i32;
                            iArr2 = Arrays.copyOf(iArr8, i23);
                            break;
                        }
                        if (zzeuVar5 != null) {
                            while (true) {
                                if (i24 != 0) {
                                    break;
                                }
                                if (i21 <= 0) {
                                    i24 = 0;
                                    break;
                                }
                                i21--;
                                i24 = zzeuVar5.zzH();
                                i25 = zzeuVar5.zzB();
                            }
                            i24--;
                        }
                        int i33 = i25;
                        int zzc8 = zzaltVar.zzc();
                        zzeu zzeuVar6 = zzeuVar5;
                        int i34 = i20;
                        long j10 = zzc8;
                        j += j10;
                        if (zzc8 > i27) {
                            i27 = zzc8;
                        }
                        jArr5[i23] = j9;
                        iArr7[i23] = zzc8;
                        long[] jArr7 = jArr5;
                        int[] iArr9 = iArr7;
                        jArr6[i23] = j8 + i33;
                        iArr8[i23] = r31;
                        if (i23 == i30) {
                            iArr8[i23] = 1;
                            arrayList3 = arrayList2;
                            arrayList3.add(Integer.valueOf(i23));
                        } else {
                            arrayList3 = arrayList2;
                        }
                        if (zzeuVar4 == null || i23 != i30) {
                            i15 = -1;
                        } else {
                            i15 = -1;
                            i26--;
                            if (i26 > 0) {
                                i30 = zzeuVar4.zzH() - 1;
                            }
                        }
                        zzeu zzeuVar7 = zzeuVar4;
                        int i35 = i34;
                        zzalp zzalpVar = zzaltVar;
                        j8 += i35;
                        int i36 = zzH2 - 1;
                        if (i36 != 0) {
                            zzH2 = i36;
                        } else if (i29 > 0) {
                            i29--;
                            zzH2 = zzeuVar3.zzH();
                            i35 = zzeuVar3.zzB();
                        } else {
                            zzH2 = 0;
                        }
                        long j11 = j9 + j10;
                        i23++;
                        zzeuVar4 = zzeuVar7;
                        i22 = i14 + i15;
                        i25 = i33;
                        zzaltVar = zzalpVar;
                        zza2 = i13;
                        jArr5 = jArr7;
                        arrayList5 = arrayList3;
                        iArr7 = iArr9;
                        i20 = i35;
                        zzeuVar5 = zzeuVar6;
                        j7 = j11;
                    }
                    long j12 = j8 + i5;
                    if (zzeuVar != null) {
                        while (i21 > 0) {
                            if (zzeuVar.zzH() != 0) {
                                z4 = false;
                                break;
                            }
                            zzeuVar.zzB();
                            i21--;
                        }
                    }
                    z4 = true;
                    if (i26 == 0) {
                        if (zzH2 != 0) {
                            z5 = z4;
                            jArr = jArr5;
                            i6 = i29;
                            i7 = i24;
                            zzamwVar2 = zzamwVar5;
                        } else if (i4 == 0) {
                            if (i29 != 0) {
                                z5 = z4;
                                jArr = jArr5;
                                i6 = i29;
                                i7 = i24;
                                zzamwVar2 = zzamwVar5;
                                i9 = 0;
                                i8 = 0;
                            } else if (i24 != 0) {
                                z5 = z4;
                                jArr = jArr5;
                                i7 = i24;
                                zzamwVar2 = zzamwVar5;
                                i9 = 0;
                                i8 = 0;
                                i6 = 0;
                            } else if (z4) {
                                jArr = jArr5;
                                i10 = zza2;
                                zzamwVar2 = zzamwVar5;
                                j2 = j12;
                                jArr2 = jArr;
                                i11 = i10;
                                i12 = i27;
                                jArr3 = jArr6;
                                iArr3 = iArr;
                                iArr4 = iArr2;
                            } else {
                                jArr = jArr5;
                                zzamwVar2 = zzamwVar5;
                                i9 = 0;
                                i8 = 0;
                                i6 = 0;
                                i7 = 0;
                                z5 = false;
                            }
                            zzH2 = 0;
                        } else {
                            z5 = z4;
                            jArr = jArr5;
                            i6 = i29;
                            i7 = i24;
                            zzamwVar2 = zzamwVar5;
                            zzH2 = 0;
                        }
                        i8 = i4;
                        i9 = 0;
                    } else {
                        z5 = z4;
                        jArr = jArr5;
                        i6 = i29;
                        i7 = i24;
                        zzamwVar2 = zzamwVar5;
                        i8 = i4;
                        i9 = i26;
                    }
                    int i37 = zzamwVar2.zza;
                    int length2 = String.valueOf(i37).length() + 66 + String.valueOf(i9).length() + 35 + String.valueOf(zzH2).length() + 26 + String.valueOf(i8).length() + 33 + String.valueOf(i6).length() + 36;
                    int length3 = String.valueOf(i7).length();
                    i10 = zza2;
                    String str2 = true != z5 ? ", ctts invalid" : "";
                    j2 = j12;
                    StringBuilder sb = new StringBuilder(length2 + length3 + str2.length());
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(i37);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i9);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(zzH2);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i8);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i6);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i7);
                    sb.append(str2);
                    zzeh.zzc("BoxParsers", sb.toString());
                    jArr2 = jArr;
                    i11 = i10;
                    i12 = i27;
                    jArr3 = jArr6;
                    iArr3 = iArr;
                    iArr4 = iArr2;
                } else {
                    int i38 = zzallVar.zza;
                    long[] jArr8 = new long[i38];
                    int[] iArr10 = new int[i38];
                    while (zzallVar.zza()) {
                        int i39 = zzallVar.zzb;
                        jArr8[i39] = zzallVar.zzd;
                        iArr10[i39] = zzallVar.zzc;
                    }
                    long j13 = zzH3;
                    int i40 = 8192 / zzb2;
                    int i41 = 0;
                    for (int i42 = 0; i42 < i38; i42++) {
                        int i43 = iArr10[i42];
                        String str3 = zzfm.zza;
                        i41 += ((i43 + i40) - 1) / i40;
                    }
                    long[] jArr9 = new long[i41];
                    int[] iArr11 = new int[i41];
                    jArr3 = new long[i41];
                    int[] iArr12 = new int[i41];
                    int i44 = i41;
                    zzvVar = zzvVar2;
                    int i45 = 0;
                    int i46 = 0;
                    int i47 = 0;
                    int i48 = 0;
                    int i49 = 0;
                    while (i46 < i38) {
                        int i50 = iArr10[i46];
                        long j14 = jArr8[i46];
                        int i51 = i49;
                        int i52 = i38;
                        int i53 = i48;
                        int i54 = i51;
                        long[] jArr10 = jArr8;
                        int i55 = i50;
                        while (i55 > 0) {
                            int min = Math.min(i40, i55);
                            jArr9[i54] = j14;
                            int[] iArr13 = iArr10;
                            int i56 = zzb2 * min;
                            iArr11[i54] = i56;
                            i47 += i56;
                            i53 = Math.max(i53, i56);
                            jArr3[i54] = i45 * j13;
                            iArr12[i54] = 1;
                            j14 += iArr11[i54];
                            i45 += min;
                            i55 -= min;
                            i54++;
                            i40 = i40;
                            jArr9 = jArr9;
                            iArr10 = iArr13;
                        }
                        i46++;
                        i40 = i40;
                        jArr8 = jArr10;
                        iArr10 = iArr10;
                        int i57 = i54;
                        i48 = i53;
                        i38 = i52;
                        i49 = i57;
                    }
                    j = i47;
                    arrayList = arrayList5;
                    jArr2 = jArr9;
                    j2 = j13 * i45;
                    iArr4 = iArr12;
                    i12 = i48;
                    i11 = i44;
                    zzamwVar2 = zzamwVar4;
                    iArr3 = iArr11;
                }
                j3 = zzamwVar2.zzf;
                if (j3 > 0) {
                    long zzw = zzfm.zzw(8 * j, 1000000L, j3, RoundingMode.HALF_DOWN);
                    if (zzw > 0 && zzw < 2147483647L) {
                        zzt zza4 = zzvVar.zza();
                        zza4.zzi((int) zzw);
                        zzv zzQ2 = zza4.zzQ();
                        zzamv zzamvVar2 = new zzamv(zzamwVar2, null);
                        zzamvVar2.zzg(zzQ2);
                        zzamwVar2 = zzamvVar2.zzo();
                    }
                }
                long j15 = zzamwVar2.zzc;
                RoundingMode roundingMode = RoundingMode.DOWN;
                int[] iArr14 = iArr4;
                long j16 = j15;
                long zzw2 = zzfm.zzw(j2, 1000000L, j15, roundingMode);
                int[] zzf = zzhbj.zzf(arrayList);
                zzhbhVar = zzamwVar2.zzi;
                if (zzhbhVar != null) {
                    zzfm.zzx(jArr3, 1000000L, j16);
                    return new zzamz(zzamwVar2, jArr2, iArr3, i12, jArr3, iArr14, zzf, r31, zzw2, i11);
                }
                if (zzhbhVar.zzb() == 1 && zzamwVar2.zzb == 1 && (length = jArr3.length) >= 2) {
                    zzhbh zzhbhVar4 = zzamwVar2.zzj;
                    zzhbhVar4.getClass();
                    long zzc9 = zzhbhVar4.zzc(0);
                    long zzc10 = zzhbhVar.zzc(0);
                    i16 = i11;
                    arrayList4 = arrayList;
                    long j17 = zzamwVar2.zzd;
                    iArr5 = iArr3;
                    long zzw3 = zzc9 + zzfm.zzw(zzc10, j16, j17, roundingMode);
                    int i58 = length - 1;
                    int max = Math.max(0, Math.min(4, i58));
                    int max2 = Math.max(0, Math.min(length - 4, i58));
                    if (jArr3[0] <= zzc9 && zzc9 < jArr3[max] && jArr3[max2] < zzw3 && zzw3 <= j2 + 2) {
                        long max3 = Math.max(0L, j2 - zzw3);
                        long j18 = zzc9 - jArr3[0];
                        long j19 = zzamwVar2.zzg.zzK;
                        long zzw4 = zzfm.zzw(j18, j19, j16, roundingMode);
                        long zzw5 = zzfm.zzw(max3, j19, j16, roundingMode);
                        if (zzw4 != 0) {
                            j5 = zzw4;
                        } else if (zzw5 != 0) {
                            j5 = 0;
                        }
                        if (j5 <= 2147483647L && zzw5 <= 2147483647L) {
                            zzahaVar.zza = (int) j5;
                            zzahaVar.zzb = (int) zzw5;
                            zzfm.zzx(jArr3, 1000000L, j16);
                            return new zzamz(zzamwVar2, jArr2, iArr5, i12, jArr3, iArr14, zzf, r31, zzfm.zzw(zzhbhVar.zzc(0), 1000000L, j17, roundingMode), i16);
                        }
                    }
                } else {
                    iArr5 = iArr3;
                    i16 = i11;
                    arrayList4 = arrayList;
                }
                if (zzhbhVar.zzb() == 1 && zzhbhVar.zzc(0) == 0) {
                    zzhbh zzhbhVar5 = zzamwVar2.zzj;
                    zzhbhVar5.getClass();
                    long zzc11 = zzhbhVar5.zzc(0);
                    for (int i59 = 0; i59 < jArr3.length; i59++) {
                        jArr3[i59] = zzfm.zzw(jArr3[i59] - zzc11, 1000000L, j16, RoundingMode.DOWN);
                    }
                    return new zzamz(zzamwVar2, jArr2, iArr5, i12, jArr3, iArr14, zzf, r31, zzfm.zzw(j2 - zzc11, 1000000L, j16, RoundingMode.DOWN), i16);
                }
                boolean z9 = zzamwVar2.zzb == 1;
                int[] iArr15 = new int[zzhbhVar.zzb()];
                int[] iArr16 = new int[zzhbhVar.zzb()];
                zzhbh zzhbhVar6 = zzamwVar2.zzj;
                zzhbhVar6.getClass();
                int i60 = 0;
                int i61 = 0;
                int i62 = 0;
                boolean z10 = false;
                while (i61 < zzhbhVar.zzb()) {
                    long zzc12 = zzhbhVar6.zzc(i61);
                    if (zzc12 != -1) {
                        i18 = i61;
                        int i63 = i62;
                        jArr4 = jArr2;
                        zzhbhVar2 = zzhbhVar;
                        int i64 = i60;
                        j4 = j16;
                        zzhbhVar3 = zzhbhVar6;
                        long zzw6 = zzfm.zzw(zzhbhVar.zzc(i61), j16, zzamwVar2.zzd, RoundingMode.DOWN) + zzc12;
                        int i65 = 1;
                        iArr15[i18] = zzfm.zzo(jArr3, zzc12, true, true);
                        z9 = z9;
                        int zzq = zzfm.zzq(jArr3, zzw6, z9, false);
                        int i66 = zzq - 1;
                        int i67 = 0;
                        while (zzq < jArr3.length) {
                            if (jArr3[zzq] >= zzw6) {
                                i67++;
                                if (i67 > zzamwVar2.zzg.zzr) {
                                    break;
                                }
                            } else {
                                i66 = zzq;
                            }
                            zzq++;
                        }
                        iArr16[i18] = i66 + 1;
                        int i68 = iArr15[i18];
                        while (true) {
                            i19 = iArr15[i18];
                            if (i19 <= 0 || (iArr14[i19] & 1) != 0) {
                                break;
                            }
                            iArr15[i18] = i19 - 1;
                        }
                        if (i19 == 0) {
                            z7 = false;
                            if ((iArr14[0] & 1) == 0) {
                                iArr15[i18] = i68;
                                while (true) {
                                    i19 = iArr15[i18];
                                    if (i19 >= iArr16[i18] || (iArr14[i19] & i65) != 0) {
                                        break;
                                    }
                                    iArr15[i18] = i19 + i65;
                                    i65 = 1;
                                }
                            }
                        } else {
                            z7 = false;
                        }
                        int i69 = iArr16[i18];
                        i62 = i63 + (i69 - i19);
                        i60 = i69;
                        z10 |= i64 != i19 ? true : z7;
                    } else {
                        jArr4 = jArr2;
                        i18 = i61;
                        j4 = j16;
                        zzhbhVar2 = zzhbhVar;
                        zzhbhVar3 = zzhbhVar6;
                    }
                    i61 = i18 + 1;
                    zzhbhVar6 = zzhbhVar3;
                    zzhbhVar = zzhbhVar2;
                    jArr2 = jArr4;
                    j16 = j4;
                }
                long[] jArr11 = jArr2;
                long j20 = j16;
                zzhbh zzhbhVar7 = zzhbhVar;
                int i70 = i62;
                zzhbh zzhbhVar8 = zzhbhVar6;
                boolean z11 = z10 | (i70 != i16);
                long[] jArr12 = z11 ? new long[i70] : jArr11;
                int[] iArr17 = z11 ? new int[i70] : iArr5;
                if (true == z11) {
                    i12 = 0;
                }
                int[] iArr18 = z11 ? new int[i70] : iArr14;
                ArrayList arrayList6 = z11 ? new ArrayList() : arrayList4;
                long[] jArr13 = new long[i70];
                int i71 = 0;
                boolean z12 = false;
                int i72 = 0;
                long j21 = 0;
                while (i72 < zzhbhVar7.zzb()) {
                    long zzc13 = zzhbhVar8.zzc(i72);
                    int i73 = iArr15[i72];
                    int i74 = iArr16[i72];
                    int[] iArr19 = iArr15;
                    if (z11) {
                        int i75 = i74 - i73;
                        z6 = z12;
                        System.arraycopy(jArr11, i73, jArr12, i71, i75);
                        System.arraycopy(iArr5, i73, iArr17, i71, i75);
                        iArr6 = iArr14;
                        System.arraycopy(iArr6, i73, iArr18, i71, i75);
                    } else {
                        z6 = z12;
                        iArr6 = iArr14;
                    }
                    int i76 = i71;
                    int i77 = i73;
                    int i78 = i12;
                    boolean z13 = z6;
                    while (i77 < i74) {
                        int i79 = i78;
                        int[] iArr20 = iArr6;
                        long j22 = zzamwVar2.zzd;
                        RoundingMode roundingMode2 = RoundingMode.DOWN;
                        long zzw7 = zzfm.zzw(j21, 1000000L, j22, roundingMode2);
                        int[] iArr21 = iArr16;
                        int i80 = i77;
                        int i81 = i79;
                        int i82 = i74;
                        int[] iArr22 = iArr5;
                        long[] jArr14 = jArr11;
                        ArrayList arrayList7 = arrayList6;
                        int i83 = i72;
                        int[] iArr23 = iArr18;
                        long zzw8 = zzfm.zzw(jArr3[i77] - zzc13, 1000000L, j20, roundingMode2);
                        z13 = (!(zzw8 >= 0)) | z13;
                        jArr13[i76] = zzw7 + zzw8;
                        if (z11 && iArr17[i76] > i81) {
                            i81 = iArr22[i80];
                        }
                        i78 = i81;
                        if (z11 && r31 == 0) {
                            i17 = 1;
                            if ((iArr23[i76] & 1) != 0) {
                                arrayList6 = arrayList7;
                                arrayList6.add(Integer.valueOf(i76));
                            } else {
                                arrayList6 = arrayList7;
                            }
                        } else {
                            arrayList6 = arrayList7;
                            i17 = 1;
                        }
                        i76 += i17;
                        i77 = i80 + 1;
                        iArr6 = iArr20;
                        iArr16 = iArr21;
                        i74 = i82;
                        iArr18 = iArr23;
                        i72 = i83;
                        jArr11 = jArr14;
                        iArr5 = iArr22;
                    }
                    int[] iArr24 = iArr5;
                    long[] jArr15 = jArr11;
                    int[] iArr25 = iArr6;
                    j21 += zzhbhVar7.zzc(i72);
                    i72++;
                    i71 = i76;
                    iArr15 = iArr19;
                    z12 = z13;
                    iArr14 = iArr25;
                    i12 = i78;
                    jArr11 = jArr15;
                    iArr16 = iArr16;
                    iArr5 = iArr24;
                }
                boolean z14 = z12;
                int[] iArr26 = iArr18;
                long zzw9 = zzfm.zzw(j21, 1000000L, zzamwVar2.zzd, RoundingMode.DOWN);
                if (z14) {
                    zzt zza5 = zzamwVar2.zzg.zza();
                    zza5.zzu(true);
                    zzv zzQ3 = zza5.zzQ();
                    zzamv zzamvVar3 = new zzamv(zzamwVar2, null);
                    zzamvVar3.zzg(zzQ3);
                    zzamwVar3 = zzamvVar3.zzo();
                } else {
                    zzamwVar3 = zzamwVar2;
                }
                return new zzamz(zzamwVar3, jArr12, iArr17, i12, jArr13, iArr26, zzhbj.zzf(arrayList6), r31, zzw9, jArr12.length);
            }
        }
        z3 = false;
        ArrayList arrayList52 = new ArrayList();
        if (zzeuVar4 != null) {
        }
        if (z3) {
        }
        j3 = zzamwVar2.zzf;
        if (j3 > 0) {
        }
        long j152 = zzamwVar2.zzc;
        RoundingMode roundingMode3 = RoundingMode.DOWN;
        int[] iArr142 = iArr4;
        long j162 = j152;
        long zzw22 = zzfm.zzw(j2, 1000000L, j152, roundingMode3);
        int[] zzf2 = zzhbj.zzf(arrayList);
        zzhbhVar = zzamwVar2.zzi;
        if (zzhbhVar != null) {
        }
    }

    @Nullable
    static zzap zzh(zzeu zzeuVar) {
        try {
            zzeuVar.zzk(5);
            int zzB = zzeuVar.zzB();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < zzB; i++) {
                long zzD = zzeuVar.zzD() / 10000;
                if (zzD < 0) {
                    zzD = -9223372036854775807L;
                }
                String zzK = zzeuVar.zzK(zzeuVar.zzs(), StandardCharsets.UTF_8);
                zzajf zzajfVar = new zzajf();
                zzajfVar.zza(zzD);
                zzajfVar.zzd(new zzx(null, zzK));
                arrayList.add(zzajfVar.zze());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new zzap(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    @Nullable
    private static zzap zzi(zzeu zzeuVar) {
        short zzv = zzeuVar.zzv();
        zzeuVar.zzk(2);
        String zzK = zzeuVar.zzK(zzv, StandardCharsets.UTF_8);
        int max = Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzgc(Float.parseFloat(zzK.substring(0, max)), Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzj(zzeu zzeuVar) {
        zzeuVar.zzh(16);
        return zzeuVar.zzB();
    }

    private static int zzk(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728 || i == 1937072752) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static zzalo zzl(zzeu zzeuVar) {
        long j;
        String str;
        zzeuVar.zzh(8);
        int zza2 = zza(zzeuVar.zzB());
        zzeuVar.zzk(zza2 == 0 ? 8 : 16);
        long zzz = zzeuVar.zzz();
        int zzg = zzeuVar.zzg();
        int i = 0;
        while (true) {
            int i2 = zza2 == 0 ? 4 : 8;
            if (i >= i2) {
                zzeuVar.zzk(i2);
                break;
            }
            if (zzeuVar.zzi()[zzg + i] != -1) {
                long zzz2 = zza2 == 0 ? zzeuVar.zzz() : zzeuVar.zzJ();
                if (zzz2 != 0) {
                    j = zzfm.zzw(zzz2, 1000000L, zzz, RoundingMode.DOWN);
                }
            } else {
                i++;
            }
        }
        j = -9223372036854775807L;
        int zzt = zzeuVar.zzt();
        char[] cArr = {(char) (((zzt >> 10) & 31) + 96), (char) (((zzt >> 5) & 31) + 96), (char) ((zzt & 31) + 96)};
        for (int i3 = 0; i3 < 3; i3++) {
            char c = cArr[i3];
            if (c < 'a' || c > 'z') {
                str = null;
                break;
            }
        }
        str = new String(cArr);
        return new zzalo(zzz, j, str);
    }

    private static String zzm(byte[] bArr, int i, int i2) {
        zzguk.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int zze = zzhbj.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzfm.zza;
            int i4 = ((zze >> 8) & 255) - 128;
            int i5 = (zze >> 16) & 255;
            int i6 = (zze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        String zzd = zzgue.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + zzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append(VastAttributes.HORIZONTAL_POSITION);
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(zzd);
        sb.append("\n");
        return sb.toString();
    }

    private static zzi zzn(zzeu zzeuVar) {
        zzh zzhVar = new zzh();
        byte[] zzi = zzeuVar.zzi();
        zzet zzetVar = new zzet(zzi, zzi.length);
        zzetVar.zzf(zzeuVar.zzg() * 8);
        zzetVar.zzo(1);
        int zzj = zzetVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzetVar.zzo(1);
            int zzj2 = zzetVar.zzj(8);
            for (int i2 = 0; i2 < zzj2; i2++) {
                zzetVar.zzh(6);
                boolean zzi2 = zzetVar.zzi();
                zzetVar.zzg();
                zzetVar.zzo(11);
                zzetVar.zzh(4);
                int zzj3 = zzetVar.zzj(4) + 8;
                zzhVar.zze(zzj3);
                zzhVar.zzf(zzj3);
                zzetVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzetVar.zzj(8);
                    int zzj5 = zzetVar.zzj(8);
                    zzetVar.zzo(1);
                    boolean zzi3 = zzetVar.zzi();
                    zzhVar.zza(zzi.zzb(zzj4));
                    zzhVar.zzb(true != zzi3 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(zzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static void zzp(zzeu zzeuVar, int i, int i2, int i3, zzalr zzalrVar) {
        zzeuVar.zzh(i2 + 16);
        if (i == 1835365492) {
            zzeuVar.zzM((char) 0);
            String zzM = zzeuVar.zzM((char) 0);
            if (zzM != null) {
                zzt zztVar = new zzt();
                zztVar.zzb(i3);
                zztVar.zzo(zzM);
                zzalrVar.zzb = zztVar.zzQ();
                return;
            }
            return;
        }
        if (i == 1769222965) {
            int zzs = zzeuVar.zzs();
            byte[] bArr = new byte[zzs];
            zzeuVar.zzm(bArr, 0, zzs);
            zzt zztVar2 = new zzt();
            zztVar2.zzb(i3);
            zztVar2.zzo("application/x-itut-t35");
            zztVar2.zzr(zzgxm.zzj(bArr));
            zzalrVar.zzb = zztVar2.zzQ();
        }
    }

    @Nullable
    private static Pair zzq(zzfz zzfzVar) {
        zzga zzc = zzfzVar.zzc(1701606260);
        if (zzc == null) {
            return null;
        }
        zzeu zzeuVar = zzc.zza;
        zzeuVar.zzh(8);
        int zza2 = zza(zzeuVar.zzB());
        int zzH = zzeuVar.zzH();
        zzhbg zza3 = zzhbh.zza(zzH);
        zzhbg zza4 = zzhbh.zza(zzH);
        for (int i = 0; i < zzH; i++) {
            zza3.zza(zza2 == 1 ? zzeuVar.zzJ() : zzeuVar.zzz());
            zza4.zza(zza2 == 1 ? zzeuVar.zzD() : zzeuVar.zzB());
            if (zzeuVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzeuVar.zzk(2);
        }
        return Pair.create(zza3.zzb(), zza4.zzb());
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x015c, code lost:
    
        if (r11 == (-1)) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzr(zzeu zzeuVar, int i, int i2, int i3, int i4, @Nullable String str, boolean z, @Nullable zzq zzqVar, zzalr zzalrVar, int i5) throws zzat {
        int i6;
        int zzt;
        int zzB;
        int i7;
        int i8;
        String str2;
        String str3;
        boolean z2;
        zzalr zzalrVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        String str4;
        String str5;
        int i13;
        String str6;
        String str7;
        boolean z3;
        int i14 = i;
        int i15 = i2;
        int i16 = i3;
        zzq zzqVar2 = zzqVar;
        zzalr zzalrVar3 = zzalrVar;
        zzeuVar.zzh(i15 + 16);
        if (z) {
            int zzt2 = zzeuVar.zzt();
            zzeuVar.zzk(6);
            i6 = zzt2;
        } else {
            zzeuVar.zzk(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            zzt = zzeuVar.zzt();
            zzeuVar.zzk(6);
            int zzF = zzeuVar.zzF();
            zzeuVar.zzh(zzeuVar.zzg() - 4);
            zzB = zzeuVar.zzB();
            if (i6 == 1) {
                zzeuVar.zzk(16);
            }
            i7 = zzF;
            i8 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzeuVar.zzk(16);
            int round = (int) Math.round(Double.longBitsToDouble(zzeuVar.zzD()));
            int zzH = zzeuVar.zzH();
            zzeuVar.zzk(4);
            int zzH2 = zzeuVar.zzH();
            int zzH3 = zzeuVar.zzH();
            int i17 = zzH3 & 1;
            int i18 = zzH3 & 2;
            if (i17 != 0) {
                i8 = zzfm.zzD(zzH2, i18 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            } else {
                i8 = zzfm.zzC(zzH2, i18 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            }
            if (i8 == 0) {
                i8 = -1;
            }
            zzeuVar.zzk(8);
            zzB = 0;
            i7 = round;
            zzt = zzH;
        }
        if (i14 == 1767992678) {
            zzt = -1;
            i7 = -1;
        } else {
            if (i14 == 1935764850) {
                i7 = 8000;
            } else if (i14 == 1935767394) {
                i7 = 16000;
                i14 = 1935767394;
            }
            zzt = 1;
        }
        int zzg = zzeuVar.zzg();
        int i19 = 1701733217;
        if (i14 == 1701733217) {
            Pair zzu = zzu(zzeuVar, i15, i16);
            if (zzu != null) {
                i19 = ((Integer) zzu.first).intValue();
                zzqVar2 = zzqVar2 == null ? null : zzqVar2.zzb(((zzamx) zzu.second).zzb);
                zzalrVar3.zza[i5] = (zzamx) zzu.second;
            }
            i14 = i19;
            zzeuVar.zzh(zzg);
        }
        String str8 = "audio/mhm1";
        if (i14 == 1633889587) {
            str2 = "audio/ac3";
        } else if (i14 == 1700998451) {
            str2 = "audio/eac3";
        } else if (i14 == 1633889588) {
            str2 = "audio/ac4";
        } else if (i14 == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (i14 == 1685353320 || i14 == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (i14 == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i14 == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i14 == 1935764850) {
            str2 = "audio/3gpp";
        } else if (i14 == 1935767394) {
            str2 = "audio/amr-wb";
        } else {
            if (i14 != 1936684916) {
                if (i14 == 1953984371) {
                    i8 = 268435456;
                } else if (i14 != 1819304813) {
                    if (i14 == 778924082 || i14 == 778924083) {
                        str2 = "audio/mpeg";
                    } else if (i14 == 1835557169) {
                        str2 = "audio/mha1";
                    } else if (i14 == 1835560241) {
                        str2 = "audio/mhm1";
                    } else if (i14 == 1634492771) {
                        str2 = "audio/alac";
                    } else if (i14 == 1634492791) {
                        str2 = "audio/g711-alaw";
                    } else if (i14 == 1970037111) {
                        str2 = "audio/g711-mlaw";
                    } else if (i14 == 1332770163) {
                        str2 = "audio/opus";
                    } else if (i14 == 1716281667) {
                        str2 = "audio/flac";
                    } else if (i14 == 1835823201) {
                        str2 = "audio/true-hd";
                    } else if (i14 == 1767992678) {
                        str2 = "audio/iamf";
                        i14 = 1767992678;
                    } else {
                        str2 = null;
                    }
                }
                str2 = "audio/raw";
            }
            str2 = "audio/raw";
            i8 = 2;
        }
        int i20 = i8;
        String str9 = null;
        List list = null;
        zzalm zzalmVar = null;
        zzalk zzalkVar = null;
        while (zzg - i15 < i16) {
            zzeuVar.zzh(zzg);
            int zzB2 = zzeuVar.zzB();
            String str10 = "childAtomSize must be positive";
            zzagl.zza(zzB2 > 0, "childAtomSize must be positive");
            int zzB3 = zzeuVar.zzB();
            int i21 = i7;
            if (zzB3 == 1835557187) {
                zzeuVar.zzh(zzg + 8);
                zzeuVar.zzk(1);
                int zzs = zzeuVar.zzs();
                zzeuVar.zzk(1);
                str5 = Objects.equals(str2, str8) ? String.format("mhm1.%02X", Integer.valueOf(zzs)) : String.format("mha1.%02X", Integer.valueOf(zzs));
                int zzt3 = zzeuVar.zzt();
                byte[] bArr = new byte[zzt3];
                str3 = str8;
                z2 = false;
                zzeuVar.zzm(bArr, 0, zzt3);
                list = list == null ? zzgxm.zzj(bArr) : zzgxm.zzk(bArr, (byte[]) list.get(0));
            } else {
                str3 = str8;
                z2 = false;
                if (zzB3 == 1835557200) {
                    zzeuVar.zzh(zzg + 8);
                    int zzs2 = zzeuVar.zzs();
                    if (zzs2 > 0) {
                        byte[] bArr2 = new byte[zzs2];
                        zzeuVar.zzm(bArr2, 0, zzs2);
                        if (list == null) {
                            list = zzgxm.zzj(bArr2);
                            str5 = str9;
                        } else {
                            list = zzgxm.zzk((byte[]) list.get(0), bArr2);
                            str5 = str9;
                            zzalrVar2 = zzalrVar3;
                            i9 = zzB;
                            i10 = zzB2;
                            i7 = i21;
                        }
                    } else {
                        zzalrVar2 = zzalrVar3;
                        i9 = zzB;
                        i10 = zzB2;
                        i7 = i21;
                        str5 = str9;
                    }
                } else {
                    if (zzB3 == 1702061171) {
                        zzalrVar2 = zzalrVar3;
                        i9 = zzB;
                        i10 = zzB2;
                        i7 = i21;
                        i11 = zzg;
                        i12 = -1;
                    } else if (z && zzB3 == 2002876005) {
                        i11 = zzeuVar.zzg();
                        if (i11 >= zzg) {
                            str7 = null;
                            z3 = true;
                        } else {
                            str7 = null;
                            z3 = false;
                        }
                        zzagl.zza(z3, str7);
                        while (true) {
                            if (i11 - zzg >= zzB2) {
                                zzalrVar2 = zzalrVar3;
                                i9 = zzB;
                                i10 = zzB2;
                                i7 = i21;
                                i11 = -1;
                                break;
                            }
                            zzeuVar.zzh(i11);
                            int zzB4 = zzeuVar.zzB();
                            zzagl.zza(zzB4 > 0, str10);
                            String str11 = str10;
                            if (zzeuVar.zzB() == 1702061171) {
                                zzalrVar2 = zzalrVar3;
                                i9 = zzB;
                                i10 = zzB2;
                                i7 = i21;
                                break;
                            }
                            i11 += zzB4;
                            str10 = str11;
                        }
                        i12 = -1;
                    } else {
                        if (zzB3 == 1651798644) {
                            zzalkVar = zzt(zzeuVar, zzg);
                        } else {
                            if (zzB3 == 1684103987) {
                                zzeuVar.zzh(zzg + 8);
                                zzalrVar3.zzb = zzafh.zza(zzeuVar, Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 == 1684366131) {
                                zzeuVar.zzh(zzg + 8);
                                zzalrVar3.zzb = zzafh.zzb(zzeuVar, Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 == 1684103988) {
                                zzeuVar.zzh(zzg + 8);
                                zzalrVar3.zzb = zzafk.zza(zzeuVar, Integer.toString(i4), str, zzqVar2);
                            } else if (zzB3 != 1684892784) {
                                if (zzB3 == 1684305011 || zzB3 == 1969517683) {
                                    i9 = zzB;
                                    i10 = zzB2;
                                    zzt zztVar = new zzt();
                                    zztVar.zzb(i4);
                                    zztVar.zzo(str2);
                                    zztVar.zzH(zzt);
                                    i7 = i21;
                                    zztVar.zzJ(i7);
                                    zztVar.zzs(zzqVar2);
                                    zztVar.zze(str);
                                    zzalrVar2 = zzalrVar;
                                    zzalrVar2.zzb = zztVar.zzQ();
                                } else if (zzB3 == 1682927731) {
                                    int i22 = zzB2 - 8;
                                    byte[] bArr3 = zzb;
                                    int length = bArr3.length;
                                    byte[] copyOf = Arrays.copyOf(bArr3, length + i22);
                                    zzeuVar.zzh(zzg + 8);
                                    zzeuVar.zzm(copyOf, length, i22);
                                    list = zzgy.zza(copyOf);
                                } else if (zzB3 == 1684425825) {
                                    byte[] bArr4 = new byte[zzB2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzeuVar.zzh(zzg + 12);
                                    zzeuVar.zzm(bArr4, 4, zzB2 - 12);
                                    list = zzgxm.zzj(bArr4);
                                } else if (zzB3 == 1634492771) {
                                    int i23 = zzB2 - 12;
                                    byte[] bArr5 = new byte[i23];
                                    zzeuVar.zzh(zzg + 12);
                                    zzeuVar.zzm(bArr5, 0, i23);
                                    int i24 = zzdr.zza;
                                    zzeu zzeuVar2 = new zzeu(bArr5);
                                    zzeuVar2.zzh(5);
                                    int zzs3 = zzeuVar2.zzs();
                                    zzeuVar2.zzh(9);
                                    int zzs4 = zzeuVar2.zzs();
                                    zzeuVar2.zzh(20);
                                    int[] iArr = {zzeuVar2.zzH(), zzs4, zzs3};
                                    int i25 = iArr[0];
                                    int i26 = iArr[1];
                                    int zzC = zzfm.zzC(zzs3, ByteOrder.LITTLE_ENDIAN);
                                    if (zzC == 0) {
                                        zzC = -1;
                                    }
                                    list = zzgxm.zzj(bArr5);
                                    zzalrVar2 = zzalrVar3;
                                    i20 = zzC;
                                    i7 = i25;
                                    i9 = zzB;
                                    i10 = zzB2;
                                    zzt = i26;
                                    str5 = str9;
                                } else if (zzB3 == 1767990114) {
                                    zzeuVar.zzh(zzg + 9);
                                    int zza2 = zzhbj.zza(zzeuVar.zzP());
                                    byte[] bArr6 = new byte[zza2];
                                    zzeuVar.zzm(bArr6, 0, zza2);
                                    int i27 = zzdr.zza;
                                    zzeu zzeuVar3 = new zzeu(bArr6);
                                    String str12 = null;
                                    String str13 = null;
                                    while (zzeuVar3.zzd() > 0 && (str13 == null || str12 == null)) {
                                        int zzs5 = zzeuVar3.zzs();
                                        int i28 = zzs5 >> 3;
                                        int i29 = zzs5 & 2;
                                        int i30 = zzs5 & 1;
                                        int zza3 = zzhbj.zza(zzeuVar3.zzP());
                                        int i31 = zzB;
                                        if (i28 > 4 && i28 < 24 && i29 != 0) {
                                            zzeuVar3.zzQ();
                                            zzeuVar3.zzQ();
                                        }
                                        if (i30 != 0) {
                                            zzeuVar3.zzk(zzhbj.zza(zzeuVar3.zzP()));
                                        }
                                        int zzg2 = zzeuVar3.zzg() + zza3;
                                        int i32 = zzB2;
                                        if (i28 == 31) {
                                            zzeuVar3.zzk(4);
                                            Object[] objArr = {Integer.valueOf(zzeuVar3.zzs()), Integer.valueOf(zzeuVar3.zzs())};
                                            String str14 = zzfm.zza;
                                            str13 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                        } else if (i28 == 0) {
                                            zzeuVar3.zzQ();
                                            str12 = zzeuVar3.zzK(4, StandardCharsets.UTF_8);
                                            if (str12.equals("mp4a")) {
                                                zzeuVar3.zzQ();
                                                zzeuVar3.zzk(2);
                                                zzet zzetVar = new zzet();
                                                zzetVar.zza(zzeuVar3);
                                                int zzj = zzetVar.zzj(5);
                                                if (zzj == 31) {
                                                    zzj = zzetVar.zzj(6) + 32;
                                                }
                                                StringBuilder sb = new StringBuilder(str12.length() + 4 + String.valueOf(zzj).length());
                                                sb.append(str12);
                                                sb.append(".40.");
                                                sb.append(zzj);
                                                str12 = sb.toString();
                                                zzeuVar3.zzh(zzg2);
                                                zzB2 = i32;
                                                zzB = i31;
                                            }
                                        }
                                        zzeuVar3.zzh(zzg2);
                                        zzB2 = i32;
                                        zzB = i31;
                                    }
                                    i9 = zzB;
                                    i10 = zzB2;
                                    if (str13 == null || str12 == null) {
                                        str6 = null;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(str13.length() + 1 + str12.length());
                                        sb2.append(str13);
                                        sb2.append(".");
                                        sb2.append(str12);
                                        str6 = sb2.toString();
                                    }
                                    list = zzgxm.zzj(bArr6);
                                    zzalrVar2 = zzalrVar;
                                    str5 = str6;
                                    i7 = i21;
                                } else {
                                    i9 = zzB;
                                    i10 = zzB2;
                                    if (zzB3 == 1885564227) {
                                        zzeuVar.zzh(zzg + 12);
                                        ByteOrder byteOrder = (zzeuVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                        int zzs6 = zzeuVar.zzs();
                                        int zzC2 = i14 == 1768973165 ? zzfm.zzC(zzs6, byteOrder) : i14 == 1718641517 ? zzfm.zzD(zzs6, byteOrder) : i20;
                                        if (zzC2 == 0) {
                                            zzC2 = -1;
                                        }
                                        if (zzC2 != -1) {
                                            zzalrVar2 = zzalrVar;
                                            i20 = zzC2;
                                            str2 = "audio/raw";
                                        } else {
                                            zzalrVar2 = zzalrVar;
                                            i20 = zzC2;
                                        }
                                        i7 = i21;
                                    } else {
                                        zzalrVar2 = zzalrVar;
                                        i7 = i21;
                                    }
                                }
                                str5 = str9;
                            } else {
                                if (zzB <= 0) {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(zzB).length() + 49);
                                    sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                    sb3.append(zzB);
                                    throw zzat.zzb(sb3.toString(), null);
                                }
                                str5 = str9;
                                zzalrVar2 = zzalrVar3;
                                i7 = zzB;
                                i9 = i7;
                                i10 = zzB2;
                                zzt = 2;
                            }
                            zzalrVar2 = zzalrVar3;
                            i9 = zzB;
                            i10 = zzB2;
                            i7 = i21;
                            str5 = str9;
                        }
                        str5 = str9;
                        zzalrVar2 = zzalrVar3;
                        i9 = zzB;
                        i10 = zzB2;
                        i7 = i21;
                    }
                    if (i11 != i12) {
                        zzalmVar = zzs(zzeuVar, i11);
                        String zza4 = zzalmVar.zza();
                        byte[] zzb2 = zzalmVar.zzb();
                        if (zzb2 != null) {
                            if ("audio/vorbis".equals(zza4)) {
                                int i33 = zzahv.zza;
                                zzeu zzeuVar4 = new zzeu(zzb2);
                                int i34 = 1;
                                zzeuVar4.zzk(1);
                                int i35 = 0;
                                while (true) {
                                    if (zzeuVar4.zzd() <= 0) {
                                        i13 = 255;
                                        break;
                                    }
                                    i13 = 255;
                                    if (zzeuVar4.zzn() != 255) {
                                        break;
                                    }
                                    zzeuVar4.zzk(i34);
                                    i35 += 255;
                                    i34 = 1;
                                }
                                int zzs7 = i35 + zzeuVar4.zzs();
                                int i36 = 0;
                                while (zzeuVar4.zzd() > 0 && zzeuVar4.zzn() == i13) {
                                    zzeuVar4.zzk(1);
                                    i36 += i13;
                                }
                                int zzs8 = i36 + zzeuVar4.zzs();
                                byte[] bArr7 = new byte[zzs7];
                                int zzg3 = zzeuVar4.zzg();
                                System.arraycopy(zzb2, zzg3, bArr7, 0, zzs7);
                                int i37 = zzg3 + zzs7 + zzs8;
                                int length2 = zzb2.length - i37;
                                byte[] bArr8 = new byte[length2];
                                System.arraycopy(zzb2, i37, bArr8, 0, length2);
                                list = zzgxm.zzk(bArr7, bArr8);
                            } else {
                                if ("audio/mp4a-latm".equals(zza4)) {
                                    zzafe zza5 = zzaff.zza(zzb2);
                                    i7 = zza5.zza;
                                    zzt = zza5.zzb;
                                    str4 = zza5.zzc;
                                } else {
                                    str4 = str9;
                                }
                                list = zzgxm.zzj(zzb2);
                                str2 = zza4;
                                str5 = str4;
                            }
                        }
                        str2 = zza4;
                        str5 = str9;
                    }
                    str5 = str9;
                }
                zzg += i10;
                str9 = str5;
                zzalrVar3 = zzalrVar2;
                str8 = str3;
                zzB = i9;
                i15 = i2;
                i16 = i3;
            }
            zzalrVar2 = zzalrVar3;
            i9 = zzB;
            i10 = zzB2;
            i7 = i21;
            zzg += i10;
            str9 = str5;
            zzalrVar3 = zzalrVar2;
            str8 = str3;
            zzB = i9;
            i15 = i2;
            i16 = i3;
        }
        zzalr zzalrVar4 = zzalrVar3;
        if (zzalrVar4.zzb != null || str2 == null) {
            return;
        }
        zzt zztVar2 = new zzt();
        zztVar2.zzb(i4);
        zztVar2.zzo(str2);
        zztVar2.zzk(str9);
        zztVar2.zzH(zzt);
        zztVar2.zzJ(i7);
        zztVar2.zzK(i20);
        zztVar2.zzr(list);
        zztVar2.zzs(zzqVar2);
        zztVar2.zze(str);
        if (zzalmVar != null) {
            zztVar2.zzi(zzhbj.zzb(zzalmVar.zzc()));
            zztVar2.zzj(zzhbj.zzb(zzalmVar.zzd()));
        } else if (zzalkVar != null) {
            zztVar2.zzi(zzhbj.zzb(zzalkVar.zza()));
            zztVar2.zzj(zzhbj.zzb(zzalkVar.zzb()));
        }
        zzalrVar4.zzb = zztVar2.zzQ();
    }

    private static zzalm zzs(zzeu zzeuVar, int i) {
        zzeuVar.zzh(i + 12);
        zzeuVar.zzk(1);
        zzv(zzeuVar);
        zzeuVar.zzk(2);
        int zzs = zzeuVar.zzs();
        if ((zzs & 128) != 0) {
            zzeuVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzeuVar.zzk(zzeuVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzeuVar.zzk(2);
        }
        zzeuVar.zzk(1);
        zzv(zzeuVar);
        String zze = zzas.zze(zzeuVar.zzs());
        if ("audio/mpeg".equals(zze) || "audio/vnd.dts".equals(zze) || "audio/vnd.dts.hd".equals(zze)) {
            return new zzalm(zze, null, -1L, -1L);
        }
        zzeuVar.zzk(4);
        long zzz = zzeuVar.zzz();
        long zzz2 = zzeuVar.zzz();
        zzeuVar.zzk(1);
        int zzv = zzv(zzeuVar);
        byte[] bArr = new byte[zzv];
        zzeuVar.zzm(bArr, 0, zzv);
        return new zzalm(zze, bArr, zzz2 <= 0 ? -1L : zzz2, zzz > 0 ? zzz : -1L);
    }

    private static zzalk zzt(zzeu zzeuVar, int i) {
        zzeuVar.zzh(i + 8);
        zzeuVar.zzk(4);
        return new zzalk(zzeuVar.zzz(), zzeuVar.zzz());
    }

    @Nullable
    private static Pair zzu(zzeu zzeuVar, int i, int i2) throws zzat {
        Integer num;
        zzamx zzamxVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzg = zzeuVar.zzg();
        while (zzg - i < i2) {
            zzeuVar.zzh(zzg);
            int zzB = zzeuVar.zzB();
            zzagl.zza(zzB > 0, "childAtomSize must be positive");
            if (zzeuVar.zzB() == 1936289382) {
                int i5 = zzg + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzg < zzB) {
                    zzeuVar.zzh(i5);
                    int zzB2 = zzeuVar.zzB();
                    int zzB3 = zzeuVar.zzB();
                    if (zzB3 == 1718775137) {
                        num2 = Integer.valueOf(zzeuVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzeuVar.zzk(4);
                        str = zzeuVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i7 = i5;
                        i6 = zzB2;
                    }
                    i5 += zzB2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzagl.zza(num2 != null, "frma atom is mandatory");
                    zzagl.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzamxVar = null;
                            break;
                        }
                        zzeuVar.zzh(i8);
                        int zzB4 = zzeuVar.zzB();
                        if (zzeuVar.zzB() == 1952804451) {
                            int zza2 = zza(zzeuVar.zzB());
                            zzeuVar.zzk(1);
                            if (zza2 == 0) {
                                zzeuVar.zzk(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzs = zzeuVar.zzs();
                                int i9 = (zzs & 240) >> 4;
                                i3 = zzs & 15;
                                i4 = i9;
                            }
                            boolean z = zzeuVar.zzs() == 1;
                            int zzs2 = zzeuVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzeuVar.zzm(bArr2, 0, 16);
                            if (z && zzs2 == 0) {
                                int zzs3 = zzeuVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzeuVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzamxVar = new zzamx(z, str, zzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzB4;
                        }
                    }
                    zzagl.zza(zzamxVar != null, "tenc atom is mandatory");
                    String str2 = zzfm.zza;
                    create = Pair.create(num, zzamxVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzg += zzB;
        }
        return null;
    }

    private static int zzv(zzeu zzeuVar) {
        int zzs = zzeuVar.zzs();
        int i = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzeuVar.zzs();
            i = (i << 7) | (zzs & 127);
        }
        return i;
    }
}
