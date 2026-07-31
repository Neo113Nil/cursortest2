package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.collection.SieveCacheKt;
import androidx.compose.material.MenuKt;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.imagepipeline.common.RotationOptions;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzahy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzeo.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ed, code lost:
    
        if (r24 == 0) goto L53;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0e0e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0e42  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0da7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0e4f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzb(zzet zzetVar, zzadk zzadkVar, long j, zzp zzpVar, boolean z, boolean z2, zzggr zzggrVar, boolean z3) throws zzas {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        boolean z4;
        int i5;
        long j3;
        long j4;
        long zzt;
        int i6;
        int zza2;
        int i7;
        zzet zzetVar2;
        long j5;
        long j6;
        int i8;
        int i9;
        String str;
        zzeu zzc;
        ArrayList arrayList;
        zzet zzetVar3;
        long[] jArr;
        long[] jArr2;
        zzu zzuVar;
        zzggr zzggrVar2;
        zzais zzaisVar;
        Pair zzn;
        int i10;
        boolean z5;
        short s;
        short s2;
        int i11;
        int i12;
        long j7;
        int i13;
        ArrayList arrayList2;
        String str2;
        zzp zzpVar2;
        int i14;
        String str3;
        long j8;
        int i15;
        char c;
        int i16;
        int i17;
        String str4;
        zzahu zzahuVar;
        int i18;
        int i19;
        int i20;
        boolean z6;
        zzahu zzahuVar2;
        String str5;
        int i21;
        int i22;
        int i23;
        int i24;
        zzfi zzfiVar;
        int i25;
        zzgjz zzgjzVar;
        boolean z7;
        int i26;
        char c2;
        int i27;
        int i28;
        boolean z8;
        int i29;
        String str6;
        zzfi zzfiVar2;
        boolean z9;
        int i30;
        int i31;
        int i32;
        boolean z10;
        boolean z11;
        zzp zzpVar3;
        int i33;
        zzgjz zzgjzVar2;
        String str7;
        zzgjz zzgjzVar3;
        String str8;
        long j9;
        boolean z12;
        zzais zzaisVar2;
        ArrayList arrayList3;
        zzet zzetVar4 = zzetVar;
        ArrayList arrayList4 = new ArrayList();
        int i34 = 0;
        while (true) {
            List list = zzetVar4.zzc;
            if (i34 >= list.size()) {
                return arrayList4;
            }
            zzet zzetVar5 = (zzet) list.get(i34);
            if (zzetVar5.zzd != 1953653099) {
                arrayList3 = arrayList4;
                i = i34;
            } else {
                zzeu zzc2 = zzetVar4.zzc(Mp4Box.TYPE_mvhd);
                zzc2.getClass();
                zzet zzd = zzetVar5.zzd(Mp4Box.TYPE_mdia);
                zzd.getClass();
                zzeu zzc3 = zzd.zzc(Mp4Box.TYPE_hdlr);
                zzc3.getClass();
                int zzi = zzi(zzc3.zza);
                int i35 = zzi == 1936684398 ? 1 : zzi == 1986618469 ? 2 : (zzi == 1952807028 || zzi == 1935832172 || zzi == 1937072756 || zzi == 1668047728 || zzi == 1937072752) ? 3 : zzi == 1835365473 ? 5 : -1;
                if (i35 == -1) {
                    zzggrVar2 = zzggrVar;
                    arrayList = arrayList4;
                    i = i34;
                    zzetVar3 = zzetVar5;
                } else {
                    zzeu zzc4 = zzetVar5.zzc(Mp4Box.TYPE_tkhd);
                    zzc4.getClass();
                    zzef zzefVar = zzc4.zza;
                    int i36 = 8;
                    zzefVar.zzh(8);
                    int zza3 = zza(zzefVar.zzB());
                    zzefVar.zzk(zza3 == 0 ? 8 : 16);
                    int zzB = zzefVar.zzB();
                    char c3 = 0;
                    int i37 = 4;
                    zzefVar.zzk(4);
                    int zzg = zzefVar.zzg();
                    int i38 = 0;
                    while (true) {
                        if (zza3 == 0) {
                            i36 = i37;
                        }
                        i = i34;
                        if (i38 >= i36) {
                            zzefVar.zzk(i36);
                            break;
                        }
                        if (zzefVar.zzi()[zzg + i38] != -1) {
                            j2 = zza3 == 0 ? zzefVar.zzz() : zzefVar.zzJ();
                        } else {
                            i38++;
                            i34 = i;
                            i36 = 8;
                            i37 = 4;
                        }
                    }
                    j2 = C.TIME_UNSET;
                    zzefVar.zzk(10);
                    int zzt2 = zzefVar.zzt();
                    zzefVar.zzk(4);
                    int zzB2 = zzefVar.zzB();
                    int zzB3 = zzefVar.zzB();
                    zzefVar.zzk(4);
                    int zzB4 = zzefVar.zzB();
                    int zzB5 = zzefVar.zzB();
                    if (zzB2 == 0) {
                        if (zzB3 == 65536) {
                            if (zzB4 != -65536) {
                                if (zzB4 == 65536) {
                                    z12 = zzB5 != 0;
                                    zzB4 = 65536;
                                }
                                zzB3 = 65536;
                            } else {
                                z12 = zzB5 != 0;
                            }
                            if (true != z12) {
                                i5 = 90;
                                i4 = i5;
                                i2 = 1;
                                zzefVar.zzk(16);
                                short zzv = zzefVar.zzv();
                                zzefVar.zzk(2);
                                short zzv2 = zzefVar.zzv();
                                j3 = j == C.TIME_UNSET ? j2 : j;
                                long j10 = zzd(zzc2.zza).zzc;
                                if (j3 == C.TIME_UNSET) {
                                    j4 = j10;
                                    zzt = -9223372036854775807L;
                                } else {
                                    j4 = j10;
                                    zzt = zzeo.zzt(j3, 1000000L, j4, RoundingMode.DOWN);
                                }
                                zzet zzd2 = zzd.zzd(Mp4Box.TYPE_minf);
                                zzd2.getClass();
                                zzet zzd3 = zzd2.zzd(Mp4Box.TYPE_stbl);
                                zzd3.getClass();
                                zzeu zzc5 = zzd.zzc(Mp4Box.TYPE_mdhd);
                                zzc5.getClass();
                                zzef zzefVar2 = zzc5.zza;
                                i6 = 8;
                                zzefVar2.zzh(8);
                                zza2 = zza(zzefVar2.zzB());
                                zzefVar2.zzk(zza2 == 0 ? 8 : 16);
                                long zzz = zzefVar2.zzz();
                                int zzg2 = zzefVar2.zzg();
                                i7 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                        i6 = 4;
                                    }
                                    if (i7 >= i6) {
                                        zzetVar2 = zzetVar5;
                                        j5 = zzz;
                                        zzefVar2.zzk(i6);
                                        j6 = -9223372036854775807L;
                                        break;
                                    }
                                    if (zzefVar2.zzi()[zzg2 + i7] != -1) {
                                        long zzz2 = zza2 == 0 ? zzefVar2.zzz() : zzefVar2.zzJ();
                                        if (zzz2 == 0) {
                                            zzetVar2 = zzetVar5;
                                            j6 = -9223372036854775807L;
                                        } else {
                                            j6 = zzeo.zzt(zzz2, 1000000L, zzz, RoundingMode.DOWN);
                                            zzetVar2 = zzetVar5;
                                        }
                                        j5 = zzz;
                                    } else {
                                        i7++;
                                        zzetVar5 = zzetVar5;
                                        i6 = 8;
                                    }
                                }
                                int zzt3 = zzefVar2.zzt();
                                char c4 = (char) (((zzt3 >> 10) & 31) + 96);
                                char c5 = (char) (((zzt3 >> 5) & 31) + 96);
                                char c6 = (char) ((zzt3 & 31) + 96);
                                char[] cArr = new char[3];
                                cArr[0] = c4;
                                cArr[i2] = c5;
                                char c7 = 2;
                                cArr[2] = c6;
                                i9 = 0;
                                for (i8 = 3; i9 < i8; i8 = 3) {
                                    char c8 = cArr[i9];
                                    if (c8 < 'a' || c8 > 'z') {
                                        str = null;
                                        break;
                                    }
                                    i9++;
                                }
                                str = new String(cArr);
                                zzc = zzd3.zzc(Mp4Box.TYPE_stsd);
                                if (zzc == null) {
                                    throw zzas.zzb("Malformed sample table (stbl) missing sample description (stsd)", null);
                                }
                                long j11 = j6;
                                String zzc6 = zzahr.zzc(j5, j11, str);
                                zzef zzefVar3 = zzc.zza;
                                zzefVar3.zzh(12);
                                int zzB6 = zzefVar3.zzB();
                                zzahu zzahuVar3 = new zzahu(zzB6);
                                int i39 = zzt2;
                                int i40 = 0;
                                while (i40 < zzB6) {
                                    int i41 = i35;
                                    int zzg3 = zzefVar3.zzg();
                                    int zzB7 = zzefVar3.zzB();
                                    if (zzB7 > 0) {
                                        i10 = zzg3;
                                        z5 = i2;
                                    } else {
                                        i10 = zzg3;
                                        z5 = c3;
                                    }
                                    long j12 = j11;
                                    String str9 = "childAtomSize must be positive";
                                    zzacy.zza(z5, "childAtomSize must be positive");
                                    int zzB8 = zzefVar3.zzB();
                                    int i42 = zzB6;
                                    if (zzB8 == 1635148593 || zzB8 == 1635148595 || zzB8 == 1701733238 || zzB8 == 1831958048 || zzB8 == 1836070006 || zzB8 == 1752589105 || zzB8 == 1751479857 || zzB8 == 1932670515 || zzB8 == 1211250227 || zzB8 == 1748121139 || zzB8 == 1987063864 || zzB8 == 1987063865 || zzB8 == 1635135537 || zzB8 == 1685479798 || zzB8 == 1685479729 || zzB8 == 1685481573 || zzB8 == 1685481521 || zzB8 == 1634760241) {
                                        s = zzv2;
                                        s2 = zzv;
                                        i11 = i39;
                                        i12 = i41;
                                        j7 = j12;
                                        int i43 = zzB8;
                                        int i44 = zzB;
                                        int i45 = zzB7;
                                        int i46 = i10;
                                        zzefVar3.zzh(i46 + 16);
                                        zzefVar3.zzk(16);
                                        int zzt4 = zzefVar3.zzt();
                                        i13 = i40;
                                        int zzt5 = zzefVar3.zzt();
                                        arrayList2 = arrayList4;
                                        zzefVar3.zzk(50);
                                        int zzg4 = zzefVar3.zzg();
                                        str2 = str;
                                        int i47 = Mp4Box.TYPE_encv;
                                        if (i43 == 1701733238) {
                                            Pair zzr = zzr(zzefVar3, i46, i45);
                                            if (zzr != null) {
                                                int intValue = ((Integer) zzr.first).intValue();
                                                if (zzpVar == null) {
                                                    i33 = intValue;
                                                    zzpVar3 = null;
                                                } else {
                                                    i33 = intValue;
                                                    zzpVar3 = zzpVar.zzb(((zzait) zzr.second).zzb);
                                                }
                                                zzahuVar3.zza[i13] = (zzait) zzr.second;
                                                i47 = i33;
                                            } else {
                                                zzpVar3 = zzpVar;
                                            }
                                            zzefVar3.zzh(zzg4);
                                            i43 = i47;
                                            zzpVar2 = zzpVar3;
                                        } else {
                                            zzpVar2 = zzpVar;
                                        }
                                        i10 = i46;
                                        if (i43 == 1831958048) {
                                            int i48 = i43;
                                            str3 = MimeTypes.VIDEO_MPEG;
                                            i14 = i48;
                                        } else {
                                            i14 = Mp4Box.TYPE_H263;
                                            if (i43 == 1211250227) {
                                                str3 = MimeTypes.VIDEO_H263;
                                            } else {
                                                i14 = i43;
                                                str3 = null;
                                            }
                                        }
                                        zzp zzpVar4 = zzpVar2;
                                        String str10 = zzc6;
                                        int i49 = zzg4;
                                        int i50 = i4;
                                        j8 = j5;
                                        float f = 1.0f;
                                        int i51 = 8;
                                        int i52 = -1;
                                        int i53 = -1;
                                        int i54 = 8;
                                        List list2 = null;
                                        int i55 = -1;
                                        zzfi zzfiVar3 = null;
                                        int i56 = -1;
                                        ByteBuffer byteBuffer = null;
                                        zzahn zzahnVar = null;
                                        zzahp zzahpVar = null;
                                        int i57 = -1;
                                        int i58 = -1;
                                        byte[] bArr = null;
                                        int i59 = -1;
                                        boolean z13 = false;
                                        int i60 = -1;
                                        String str11 = null;
                                        while (i49 - i10 < i45) {
                                            zzefVar3.zzh(i49);
                                            int zzg5 = zzefVar3.zzg();
                                            int zzB9 = zzefVar3.zzB();
                                            if (zzB9 == 0) {
                                                i18 = i49;
                                                if (zzefVar3.zzg() - i10 == i45) {
                                                    break;
                                                }
                                                i19 = 0;
                                            } else {
                                                i18 = i49;
                                                i19 = zzB9;
                                            }
                                            if (i19 > 0) {
                                                i20 = i45;
                                                z6 = true;
                                            } else {
                                                i20 = i45;
                                                z6 = false;
                                            }
                                            zzacy.zza(z6, str9);
                                            int zzB10 = zzefVar3.zzB();
                                            if (zzB10 == 1635148611) {
                                                int i61 = zzg5 + 8;
                                                zzacy.zza(str3 == null, null);
                                                zzefVar3.zzh(i61);
                                                zzabz zza4 = zzabz.zza(zzefVar3);
                                                List list3 = zza4.zza;
                                                zzahuVar3.zzc = zza4.zzb;
                                                if (z13) {
                                                    z11 = true;
                                                } else {
                                                    f = zza4.zzk;
                                                    z11 = false;
                                                }
                                                String str12 = zza4.zzl;
                                                int i62 = zza4.zzj;
                                                int i63 = zza4.zzg;
                                                int i64 = zza4.zzh;
                                                int i65 = zza4.zzi;
                                                int i66 = zza4.zze;
                                                i21 = zza4.zzf;
                                                zzahuVar2 = zzahuVar3;
                                                i23 = i14;
                                                str11 = str12;
                                                str5 = str9;
                                                z13 = z11;
                                                i53 = i63;
                                                i51 = i66;
                                                zzfiVar = zzfiVar3;
                                                str3 = MimeTypes.VIDEO_H264;
                                                i58 = i62;
                                                i52 = i65;
                                                i55 = i64;
                                                list2 = list3;
                                            } else if (zzB10 == 1752589123) {
                                                int i67 = zzg5 + 8;
                                                zzacy.zza(str3 == null, null);
                                                zzefVar3.zzh(i67);
                                                zzadl zza5 = zzadl.zza(zzefVar3);
                                                List list4 = zza5.zza;
                                                zzahuVar3.zzc = zza5.zzb;
                                                if (z13) {
                                                    z10 = true;
                                                } else {
                                                    f = zza5.zzl;
                                                    z10 = false;
                                                }
                                                int i68 = zza5.zzm;
                                                int i69 = zza5.zzc;
                                                String str13 = zza5.zzn;
                                                int i70 = zza5.zzk;
                                                if (i70 == -1) {
                                                    i70 = i56;
                                                }
                                                int i71 = zza5.zzd;
                                                int i72 = zza5.zze;
                                                int i73 = zza5.zzh;
                                                i55 = zza5.zzi;
                                                int i74 = zza5.zzj;
                                                int i75 = zza5.zzf;
                                                int i76 = zza5.zzg;
                                                zzfiVar = zza5.zzo;
                                                zzahuVar2 = zzahuVar3;
                                                i23 = i14;
                                                i21 = i76;
                                                str5 = str9;
                                                str11 = str13;
                                                i60 = i71;
                                                i51 = i75;
                                                str3 = MimeTypes.VIDEO_H265;
                                                z13 = z10;
                                                i59 = i72;
                                                i53 = i73;
                                                i56 = i70;
                                                list2 = list4;
                                                i57 = i69;
                                                i52 = i74;
                                                i58 = i68;
                                            } else if (zzB10 == 1818785347) {
                                                int i77 = zzg5 + 8;
                                                zzacy.zza(MimeTypes.VIDEO_H265.equals(str3), "lhvC must follow hvcC atom");
                                                if (zzfiVar3 == null) {
                                                    zzfiVar2 = null;
                                                } else if (zzfiVar3.zza.size() >= 2) {
                                                    zzfiVar2 = zzfiVar3;
                                                    z9 = true;
                                                    zzacy.zza(z9, "must have at least two layers");
                                                    zzefVar3.zzh(i77);
                                                    zzfiVar2.getClass();
                                                    zzadl zzb2 = zzadl.zzb(zzefVar3, zzfiVar2);
                                                    zzacy.zza(zzahuVar3.zzc != zzb2.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                    i30 = zzb2.zzh;
                                                    if (i30 != -1) {
                                                        zzacy.zza(i53 == i30, "colorSpace must be the same for both views");
                                                    }
                                                    i31 = zzb2.zzi;
                                                    if (i31 != -1) {
                                                        zzacy.zza(i55 == i31, "colorRange must be the same for both views");
                                                    }
                                                    i32 = zzb2.zzj;
                                                    if (i32 != -1) {
                                                        zzacy.zza(i52 == i32, "colorTransfer must be the same for both views");
                                                    }
                                                    zzacy.zza(i51 != zzb2.zzf, "bitdepthLuma must be the same for both views");
                                                    zzacy.zza(i54 != zzb2.zzg, "bitdepthChroma must be the same for both views");
                                                    if (list2 == null) {
                                                        int i78 = zzgjz.zzd;
                                                        zzgjw zzgjwVar = new zzgjw();
                                                        zzgjwVar.zzh(list2);
                                                        zzgjwVar.zzh(zzb2.zza);
                                                        list2 = zzgjwVar.zzi();
                                                    } else {
                                                        zzacy.zza(false, "initializationData must be already set from hvcC atom");
                                                        list2 = null;
                                                    }
                                                    String str14 = zzb2.zzn;
                                                    str3 = MimeTypes.VIDEO_MV_HEVC;
                                                    zzahuVar2 = zzahuVar3;
                                                    i23 = i14;
                                                    zzfiVar = zzfiVar2;
                                                    str11 = str14;
                                                    str5 = str9;
                                                    i21 = i54;
                                                } else {
                                                    zzfiVar2 = zzfiVar3;
                                                }
                                                z9 = false;
                                                zzacy.zza(z9, "must have at least two layers");
                                                zzefVar3.zzh(i77);
                                                zzfiVar2.getClass();
                                                zzadl zzb22 = zzadl.zzb(zzefVar3, zzfiVar2);
                                                zzacy.zza(zzahuVar3.zzc != zzb22.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                i30 = zzb22.zzh;
                                                if (i30 != -1) {
                                                }
                                                i31 = zzb22.zzi;
                                                if (i31 != -1) {
                                                }
                                                i32 = zzb22.zzj;
                                                if (i32 != -1) {
                                                }
                                                zzacy.zza(i51 != zzb22.zzf, "bitdepthLuma must be the same for both views");
                                                zzacy.zza(i54 != zzb22.zzg, "bitdepthChroma must be the same for both views");
                                                if (list2 == null) {
                                                }
                                                String str142 = zzb22.zzn;
                                                str3 = MimeTypes.VIDEO_MV_HEVC;
                                                zzahuVar2 = zzahuVar3;
                                                i23 = i14;
                                                zzfiVar = zzfiVar2;
                                                str11 = str142;
                                                str5 = str9;
                                                i21 = i54;
                                            } else if (zzB10 == 1986361461) {
                                                zzefVar3.zzh(zzg5 + 8);
                                                int zzg6 = zzefVar3.zzg();
                                                zzahuVar2 = zzahuVar3;
                                                zzahq zzahqVar = null;
                                                while (zzg6 - zzg5 < i19) {
                                                    zzefVar3.zzh(zzg6);
                                                    int zzB11 = zzefVar3.zzB();
                                                    if (zzB11 > 0) {
                                                        i28 = zzg6;
                                                        z8 = true;
                                                    } else {
                                                        i28 = zzg6;
                                                        z8 = false;
                                                    }
                                                    zzacy.zza(z8, str9);
                                                    int i79 = i54;
                                                    if (zzefVar3.zzB() == 1702454643) {
                                                        zzefVar3.zzh(i28 + 8);
                                                        int zzg7 = zzefVar3.zzg();
                                                        while (true) {
                                                            if (zzg7 - i28 >= zzB11) {
                                                                i29 = zzB11;
                                                                str6 = str9;
                                                                zzahqVar = null;
                                                                break;
                                                            }
                                                            zzefVar3.zzh(zzg7);
                                                            int zzB12 = zzefVar3.zzB();
                                                            zzacy.zza(zzB12 > 0, str9);
                                                            i29 = zzB11;
                                                            if (zzefVar3.zzB() == 1937011305) {
                                                                zzefVar3.zzk(4);
                                                                int zzs = zzefVar3.zzs();
                                                                str6 = str9;
                                                                zzahqVar = new zzahq(new zzaht(1 == (zzs & 1), (zzs & 2) == 2, (zzs & 8) == 8));
                                                            } else {
                                                                zzg7 += zzB12;
                                                                zzB11 = i29;
                                                            }
                                                        }
                                                    } else {
                                                        i29 = zzB11;
                                                        str6 = str9;
                                                    }
                                                    zzg6 = i28 + i29;
                                                    i54 = i79;
                                                    str9 = str6;
                                                }
                                                str5 = str9;
                                                i21 = i54;
                                                zzahx zzahxVar = zzahqVar == null ? null : new zzahx(zzahqVar);
                                                if (zzahxVar != null) {
                                                    if (zzfiVar3 == null) {
                                                        zzfiVar3 = null;
                                                    } else if (zzfiVar3.zza.size() >= 2) {
                                                        zzacy.zza(zzahxVar.zza(), "both eye views must be marked as available");
                                                        zzacy.zza(!zzahxVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                                    }
                                                    if (i56 != -1) {
                                                        i23 = i14;
                                                        zzfiVar = zzfiVar3;
                                                    } else if (true != zzahxVar.zzb().zza().zzc()) {
                                                        i23 = i14;
                                                        zzfiVar = zzfiVar3;
                                                        i56 = 4;
                                                    } else {
                                                        i56 = 5;
                                                        i23 = i14;
                                                        zzfiVar = zzfiVar3;
                                                    }
                                                }
                                                i22 = i51;
                                                i23 = i14;
                                                i24 = i55;
                                                zzfiVar = zzfiVar3;
                                                i25 = i56;
                                                i51 = i22;
                                                i55 = i24;
                                                i56 = i25;
                                            } else {
                                                zzahuVar2 = zzahuVar3;
                                                str5 = str9;
                                                i21 = i54;
                                                if (zzB10 == 1685480259 || zzB10 == 1685485123 || zzB10 == 1685485379) {
                                                    i22 = i51;
                                                    i23 = i14;
                                                    i24 = i55;
                                                    zzfiVar = zzfiVar3;
                                                    i25 = i56;
                                                    int i80 = i19 - 8;
                                                    int i81 = zzg5 + 8;
                                                    byte[] bArr2 = new byte[i80];
                                                    zzefVar3.zzm(bArr2, 0, i80);
                                                    if (list2 != null) {
                                                        int i82 = zzgjz.zzd;
                                                        zzgjw zzgjwVar2 = new zzgjw();
                                                        zzgjwVar2.zzh(list2);
                                                        zzgjwVar2.zzf(bArr2);
                                                        zzgjzVar = zzgjwVar2.zzi();
                                                    } else {
                                                        zzacy.zza(false, "initializationData must already be set from hvcC or avcC atom");
                                                        zzgjzVar = null;
                                                    }
                                                    zzefVar3.zzh(i81);
                                                    zzeq zza6 = zzeq.zza(zzefVar3);
                                                    if (zza6 != null) {
                                                        str11 = zza6.zza;
                                                        str3 = MimeTypes.VIDEO_DOLBY_VISION;
                                                    }
                                                    list2 = zzgjzVar;
                                                } else if (zzB10 == 1987076931) {
                                                    int i83 = zzg5 + 12;
                                                    zzacy.zza(str3 == null, null);
                                                    zzefVar3.zzh(i83);
                                                    byte zzs2 = (byte) zzefVar3.zzs();
                                                    byte zzs3 = (byte) zzefVar3.zzs();
                                                    int zzs4 = zzefVar3.zzs();
                                                    int i84 = zzs4 >> 4;
                                                    int i85 = zzs4 >> 1;
                                                    String str15 = i14 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                                    if (str15.equals(MimeTypes.VIDEO_VP9)) {
                                                        int i86 = zzdc.zza;
                                                        i27 = 1;
                                                        c2 = 3;
                                                        list2 = zzgjz.zzj(new byte[]{1, 1, zzs2, 2, 1, zzs3, 3, 1, (byte) i84, 4, 1, (byte) (i85 & 7)});
                                                    } else {
                                                        c2 = 3;
                                                        i27 = 1;
                                                    }
                                                    int i87 = zzs4 & 1;
                                                    int zzs5 = zzefVar3.zzs();
                                                    int zzs6 = zzefVar3.zzs();
                                                    int zzb3 = zzh.zzb(zzs5);
                                                    int i88 = i27 != i87 ? 2 : 1;
                                                    i52 = zzh.zzc(zzs6);
                                                    i55 = i88;
                                                    i23 = i14;
                                                    i53 = zzb3;
                                                    i21 = i84;
                                                    str3 = str15;
                                                    zzfiVar = zzfiVar3;
                                                    i51 = i21;
                                                } else {
                                                    if (zzB10 != 1635135811) {
                                                        if (zzB10 == 1668050025) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = zzm();
                                                            }
                                                            ByteBuffer byteBuffer2 = byteBuffer;
                                                            byteBuffer2.position(21);
                                                            byteBuffer2.putShort(zzefVar3.zzv());
                                                            byteBuffer2.putShort(zzefVar3.zzv());
                                                            i23 = i14;
                                                            byteBuffer = byteBuffer2;
                                                            zzfiVar = zzfiVar3;
                                                        } else {
                                                            if (zzB10 == 1835295606) {
                                                                if (byteBuffer == null) {
                                                                    byteBuffer = zzm();
                                                                }
                                                                ByteBuffer byteBuffer3 = byteBuffer;
                                                                short zzv3 = zzefVar3.zzv();
                                                                short zzv4 = zzefVar3.zzv();
                                                                short zzv5 = zzefVar3.zzv();
                                                                short zzv6 = zzefVar3.zzv();
                                                                i23 = i14;
                                                                short zzv7 = zzefVar3.zzv();
                                                                zzfiVar = zzfiVar3;
                                                                short zzv8 = zzefVar3.zzv();
                                                                i22 = i51;
                                                                short zzv9 = zzefVar3.zzv();
                                                                i24 = i55;
                                                                short zzv10 = zzefVar3.zzv();
                                                                long zzz3 = zzefVar3.zzz();
                                                                long zzz4 = zzefVar3.zzz();
                                                                i25 = i56;
                                                                byteBuffer3.position(1);
                                                                byteBuffer3.putShort(zzv7);
                                                                byteBuffer3.putShort(zzv8);
                                                                byteBuffer3.putShort(zzv3);
                                                                byteBuffer3.putShort(zzv4);
                                                                byteBuffer3.putShort(zzv5);
                                                                byteBuffer3.putShort(zzv6);
                                                                byteBuffer3.putShort(zzv9);
                                                                byteBuffer3.putShort(zzv10);
                                                                byteBuffer3.putShort((short) (zzz3 / 10000));
                                                                byteBuffer3.putShort((short) (zzz4 / 10000));
                                                                byteBuffer = byteBuffer3;
                                                            } else {
                                                                i22 = i51;
                                                                i23 = i14;
                                                                i24 = i55;
                                                                zzfiVar = zzfiVar3;
                                                                i25 = i56;
                                                                if (zzB10 == 1681012275) {
                                                                    zzacy.zza(str3 == null, null);
                                                                    str3 = MimeTypes.VIDEO_H263;
                                                                } else if (zzB10 == 1702061171) {
                                                                    zzacy.zza(str3 == null, null);
                                                                    zzahp zzp = zzp(zzefVar3, zzg5);
                                                                    String zza7 = zzp.zza();
                                                                    byte[] zzb4 = zzp.zzb();
                                                                    if (zzb4 != null) {
                                                                        zzahpVar = zzp;
                                                                        str3 = zza7;
                                                                        list2 = zzgjz.zzj(zzb4);
                                                                    } else {
                                                                        zzahpVar = zzp;
                                                                        str3 = zza7;
                                                                    }
                                                                } else if (zzB10 == 1651798644) {
                                                                    zzahnVar = zzq(zzefVar3, zzg5);
                                                                } else if (zzB10 == 1885434736) {
                                                                    zzefVar3.zzh(zzg5 + 8);
                                                                    f = zzefVar3.zzH() / zzefVar3.zzH();
                                                                    i51 = i22;
                                                                    i55 = i24;
                                                                    i56 = i25;
                                                                    z13 = true;
                                                                } else if (zzB10 == 1937126244) {
                                                                    int i89 = zzg5 + 8;
                                                                    while (i89 - zzg5 < i19) {
                                                                        zzefVar3.zzh(i89);
                                                                        int zzB13 = zzefVar3.zzB() + i89;
                                                                        if (zzefVar3.zzB() == 1886547818) {
                                                                            bArr = Arrays.copyOfRange(zzefVar3.zzi(), i89, zzB13);
                                                                        } else {
                                                                            i89 = zzB13;
                                                                        }
                                                                    }
                                                                    i51 = i22;
                                                                    i55 = i24;
                                                                    i56 = i25;
                                                                    bArr = null;
                                                                } else if (zzB10 == 1936995172) {
                                                                    int zzs7 = zzefVar3.zzs();
                                                                    zzefVar3.zzk(3);
                                                                    if (zzs7 == 0) {
                                                                        int zzs8 = zzefVar3.zzs();
                                                                        if (zzs8 == 0) {
                                                                            i51 = i22;
                                                                            i55 = i24;
                                                                            i56 = 0;
                                                                        } else if (zzs8 == 1) {
                                                                            i51 = i22;
                                                                            i55 = i24;
                                                                            i56 = 1;
                                                                        } else if (zzs8 == 2) {
                                                                            i51 = i22;
                                                                            i55 = i24;
                                                                            i56 = 2;
                                                                        } else if (zzs8 == 3) {
                                                                            i56 = 3;
                                                                            i51 = i22;
                                                                            i55 = i24;
                                                                        }
                                                                    }
                                                                } else if (zzB10 == 1634760259) {
                                                                    int i90 = i19 - 12;
                                                                    byte[] bArr3 = new byte[i90];
                                                                    zzefVar3.zzh(zzg5 + 12);
                                                                    zzefVar3.zzm(bArr3, 0, i90);
                                                                    String zzd4 = zzdc.zzd(bArr3);
                                                                    zzgjz zzj = zzgjz.zzj(bArr3);
                                                                    zzh zzl = zzl(new zzef(bArr3));
                                                                    int i91 = zzl.zzf;
                                                                    int i92 = zzl.zzg;
                                                                    i26 = zzl.zzb;
                                                                    int i93 = zzl.zzc;
                                                                    int i94 = zzl.zzd;
                                                                    str11 = zzd4;
                                                                    list2 = zzj;
                                                                    i51 = i91;
                                                                    i21 = i92;
                                                                    i55 = i93;
                                                                    str3 = MimeTypes.VIDEO_APV;
                                                                    i56 = i25;
                                                                    i52 = i94;
                                                                } else if (zzB10 == 1668246642) {
                                                                    if (i53 == -1) {
                                                                        if (i52 == -1) {
                                                                            int zzB14 = zzefVar3.zzB();
                                                                            if (zzB14 == 1852009592 || zzB14 == 1852009571) {
                                                                                int zzt6 = zzefVar3.zzt();
                                                                                int zzt7 = zzefVar3.zzt();
                                                                                zzefVar3.zzk(2);
                                                                                if (i19 == 19) {
                                                                                    if ((zzefVar3.zzs() & 128) != 0) {
                                                                                        i19 = 19;
                                                                                        z7 = true;
                                                                                        int zzb5 = zzh.zzb(zzt6);
                                                                                        int i95 = true == z7 ? 2 : 1;
                                                                                        i53 = zzb5;
                                                                                        i55 = i95;
                                                                                        i51 = i22;
                                                                                        i56 = i25;
                                                                                        i52 = zzh.zzc(zzt7);
                                                                                    } else {
                                                                                        i19 = 19;
                                                                                    }
                                                                                }
                                                                                z7 = false;
                                                                                int zzb52 = zzh.zzb(zzt6);
                                                                                if (true == z7) {
                                                                                }
                                                                                i53 = zzb52;
                                                                                i55 = i95;
                                                                                i51 = i22;
                                                                                i56 = i25;
                                                                                i52 = zzh.zzc(zzt7);
                                                                            } else {
                                                                                zzds.zzc("BoxParsers", "Unsupported color type: ".concat(zzev.zze(zzB14)));
                                                                                i52 = -1;
                                                                                i53 = -1;
                                                                                i51 = i22;
                                                                                i55 = i24;
                                                                                i56 = i25;
                                                                            }
                                                                        } else {
                                                                            i53 = -1;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            i51 = i22;
                                                            i55 = i24;
                                                            i56 = i25;
                                                        }
                                                        break;
                                                    }
                                                    int i96 = i19 - 8;
                                                    byte[] bArr4 = new byte[i96];
                                                    zzefVar3.zzm(bArr4, 0, i96);
                                                    zzgjz zzj2 = zzgjz.zzj(bArr4);
                                                    zzefVar3.zzh(zzg5 + 8);
                                                    zzh zzk = zzk(zzefVar3);
                                                    int i97 = zzk.zzf;
                                                    int i98 = zzk.zzg;
                                                    i26 = zzk.zzb;
                                                    int i99 = zzk.zzc;
                                                    int i100 = zzk.zzd;
                                                    i23 = i14;
                                                    i21 = i98;
                                                    i55 = i99;
                                                    str3 = MimeTypes.VIDEO_AV1;
                                                    zzfiVar = zzfiVar3;
                                                    list2 = zzj2;
                                                    i52 = i100;
                                                    i51 = i97;
                                                    i53 = i26;
                                                }
                                                i51 = i22;
                                                i55 = i24;
                                                i56 = i25;
                                            }
                                            i49 = i18 + i19;
                                            i45 = i20;
                                            zzahuVar3 = zzahuVar2;
                                            i14 = i23;
                                            i54 = i21;
                                            zzfiVar3 = zzfiVar;
                                            str9 = str5;
                                        }
                                        int i101 = i51;
                                        zzahu zzahuVar4 = zzahuVar3;
                                        i15 = i45;
                                        int i102 = i54;
                                        int i103 = i55;
                                        int i104 = i56;
                                        c = 2;
                                        if (str3 == null) {
                                            str4 = str10;
                                            i17 = i50;
                                            i16 = i44;
                                            zzahuVar = zzahuVar4;
                                        } else {
                                            zzs zzsVar = new zzs();
                                            i16 = i44;
                                            zzsVar.zzb(i16);
                                            zzsVar.zzm(str3);
                                            zzsVar.zzj(str11);
                                            zzsVar.zzt(zzt4);
                                            zzsVar.zzu(zzt5);
                                            zzsVar.zzv(i60);
                                            zzsVar.zzw(i59);
                                            zzsVar.zzz(f);
                                            i17 = i50;
                                            zzsVar.zzy(i17);
                                            zzsVar.zzA(bArr);
                                            zzsVar.zzB(i104);
                                            zzsVar.zzp(list2);
                                            zzsVar.zzo(i58);
                                            zzsVar.zzD(i57);
                                            zzsVar.zzq(zzpVar4);
                                            str4 = str10;
                                            zzsVar.zze(str4);
                                            zzg zzgVar = new zzg();
                                            zzgVar.zza(i53);
                                            zzgVar.zzb(i103);
                                            zzgVar.zzc(i52);
                                            zzgVar.zzd(byteBuffer != null ? byteBuffer.array() : null);
                                            zzgVar.zze(i101);
                                            zzgVar.zzf(i102);
                                            zzsVar.zzC(zzgVar.zzg());
                                            if (zzahnVar != null) {
                                                zzsVar.zzh(zzgne.zzb(zzahnVar.zza()));
                                                zzsVar.zzi(zzgne.zzb(zzahnVar.zzb()));
                                            } else if (zzahpVar != null) {
                                                zzsVar.zzh(zzgne.zzb(zzahpVar.zzc()));
                                                zzsVar.zzi(zzgne.zzb(zzahpVar.zzd()));
                                            }
                                            zzahuVar = zzahuVar4;
                                            zzahuVar.zzb = zzsVar.zzM();
                                        }
                                    } else if (zzB8 == 1836069985 || zzB8 == 1701733217 || zzB8 == 1633889587 || zzB8 == 1700998451 || zzB8 == 1633889588 || zzB8 == 1835823201 || zzB8 == 1685353315 || zzB8 == 1685353317 || zzB8 == 1685353320 || zzB8 == 1685353324 || zzB8 == 1685353336 || zzB8 == 1935764850 || zzB8 == 1935767394 || zzB8 == 1819304813 || zzB8 == 1936684916 || zzB8 == 1953984371 || zzB8 == 778924082 || zzB8 == 778924083 || zzB8 == 1835557169 || zzB8 == 1835560241 || zzB8 == 1634492771 || zzB8 == 1634492791 || zzB8 == 1970037111 || zzB8 == 1332770163 || zzB8 == 1716281667 || zzB8 == 1767992678 || zzB8 == 1768973165 || zzB8 == 1718641517) {
                                        zzahuVar = zzahuVar3;
                                        s = zzv2;
                                        s2 = zzv;
                                        i11 = i39;
                                        i12 = i41;
                                        int i105 = i10;
                                        j7 = j12;
                                        i16 = zzB;
                                        zzo(zzefVar3, zzB8, i105, zzB7, i16, zzc6, z2, zzpVar, zzahuVar, i40);
                                        str2 = str;
                                        i10 = i105;
                                        i15 = zzB7;
                                        str4 = zzc6;
                                        i13 = i40;
                                        arrayList2 = arrayList4;
                                        i17 = i4;
                                        j8 = j5;
                                        c = 2;
                                    } else {
                                        if (zzB8 == 1414810956 || zzB8 == 1954034535 || zzB8 == 2004251764 || zzB8 == 1937010800 || zzB8 == 1664495672 || zzB8 == 1836070003) {
                                            zzefVar3.zzh(i10 + 16);
                                            if (zzB8 == 1414810956) {
                                                str8 = MimeTypes.APPLICATION_TTML;
                                            } else {
                                                if (zzB8 == 1954034535) {
                                                    int i106 = zzB7 - 16;
                                                    byte[] bArr5 = new byte[i106];
                                                    zzefVar3.zzm(bArr5, 0, i106);
                                                    zzgjzVar3 = zzgjz.zzj(bArr5);
                                                    str8 = MimeTypes.APPLICATION_TX3G;
                                                } else if (zzB8 == 2004251764) {
                                                    str8 = MimeTypes.APPLICATION_MP4VTT;
                                                } else if (zzB8 == 1937010800) {
                                                    str8 = MimeTypes.APPLICATION_TTML;
                                                    j9 = 0;
                                                    zzgjzVar3 = null;
                                                    if (str8 != null) {
                                                        zzef zzefVar4 = zzefVar3;
                                                        zzs zzsVar2 = new zzs();
                                                        zzsVar2.zzb(zzB);
                                                        zzsVar2.zzm(str8);
                                                        zzsVar2.zze(zzc6);
                                                        zzsVar2.zzr(j9);
                                                        zzsVar2.zzp(zzgjzVar3);
                                                        zzahuVar3.zzb = zzsVar2.zzM();
                                                        zzahuVar = zzahuVar3;
                                                        s = zzv2;
                                                        i13 = i40;
                                                        i17 = i4;
                                                        s2 = zzv;
                                                        c = c7;
                                                        i11 = i39;
                                                        i12 = i41;
                                                        i15 = zzB7;
                                                        j7 = j12;
                                                        zzefVar3 = zzefVar4;
                                                        str2 = str;
                                                        i16 = zzB;
                                                        str4 = zzc6;
                                                        arrayList2 = arrayList4;
                                                        j8 = j5;
                                                    }
                                                } else if (zzB8 == 1664495672) {
                                                    zzahuVar3.zzd = i2;
                                                    str8 = MimeTypes.APPLICATION_MP4CEA608;
                                                } else {
                                                    int zzg8 = zzefVar3.zzg();
                                                    zzefVar3.zzk(4);
                                                    if (zzefVar3.zzB() == 1702061171) {
                                                        zzahp zzp2 = zzp(zzefVar3, zzg8);
                                                        if (zzp2.zzb() != null && zzp2.zzb().length == 64) {
                                                            String zzj3 = zzj(zzp2.zzb(), zzv, zzv2);
                                                            String str16 = zzeo.zza;
                                                            zzgjzVar2 = zzgjz.zzj(zzj3.getBytes(StandardCharsets.UTF_8));
                                                            str7 = MimeTypes.APPLICATION_VOBSUB;
                                                        }
                                                    } else {
                                                        zzgjzVar2 = null;
                                                        str7 = null;
                                                    }
                                                    zzgjzVar3 = zzgjzVar2;
                                                    str8 = str7;
                                                }
                                                j9 = Long.MAX_VALUE;
                                                if (str8 != null) {
                                                }
                                            }
                                            j9 = Long.MAX_VALUE;
                                            zzgjzVar3 = null;
                                            if (str8 != null) {
                                            }
                                        } else if (zzB8 == 1835365492) {
                                            zzefVar3.zzh(i10 + 16);
                                            char c9 = c3;
                                            zzefVar3.zzM(c9);
                                            String zzM = zzefVar3.zzM(c9);
                                            if (zzM != null) {
                                                zzs zzsVar3 = new zzs();
                                                zzsVar3.zzb(zzB);
                                                zzsVar3.zzm(zzM);
                                                zzahuVar3.zzb = zzsVar3.zzM();
                                            }
                                        } else if (zzB8 == 1667329389) {
                                            zzs zzsVar4 = new zzs();
                                            zzsVar4.zzb(zzB);
                                            zzsVar4.zzm(MimeTypes.APPLICATION_CAMERA_MOTION);
                                            zzahuVar3.zzb = zzsVar4.zzM();
                                        }
                                        zzahuVar = zzahuVar3;
                                        s = zzv2;
                                        i13 = i40;
                                        i17 = i4;
                                        s2 = zzv;
                                        c = c7;
                                        i11 = i39;
                                        i12 = i41;
                                        i15 = zzB7;
                                        j7 = j12;
                                        str2 = str;
                                        i16 = zzB;
                                        str4 = zzc6;
                                        arrayList2 = arrayList4;
                                        j8 = j5;
                                    }
                                    zzefVar3.zzh(i10 + i15);
                                    char c10 = c;
                                    i40 = i13 + 1;
                                    str = str2;
                                    c7 = c10;
                                    i4 = i17;
                                    zzc6 = str4;
                                    zzB = i16;
                                    zzahuVar3 = zzahuVar;
                                    zzv2 = s;
                                    i35 = i12;
                                    arrayList4 = arrayList2;
                                    j5 = j8;
                                    zzB6 = i42;
                                    zzv = s2;
                                    i39 = i11;
                                    j11 = j7;
                                    i2 = 1;
                                    c3 = 0;
                                }
                                String str17 = str;
                                zzahu zzahuVar5 = zzahuVar3;
                                int i107 = i35;
                                int i108 = zzB;
                                long j13 = j11;
                                arrayList = arrayList4;
                                long j14 = j5;
                                int i109 = i39;
                                if (z) {
                                    zzetVar3 = zzetVar2;
                                } else {
                                    zzetVar3 = zzetVar2;
                                    zzet zzd5 = zzetVar3.zzd(Mp4Box.TYPE_edts);
                                    if (zzd5 != null && (zzn = zzn(zzd5)) != null) {
                                        long[] jArr3 = (long[]) zzn.first;
                                        jArr2 = (long[]) zzn.second;
                                        jArr = jArr3;
                                        zzuVar = zzahuVar5.zzb;
                                        if (zzuVar != null) {
                                            zzggrVar2 = zzggrVar;
                                        } else {
                                            if (i109 != 0) {
                                                zzes zzesVar = new zzes(i109);
                                                zzs zza8 = zzuVar.zza();
                                                zzao zzaoVar = zzuVar.zzl;
                                                zza8.zzk(zzaoVar != null ? zzaoVar.zzd(zzesVar) : new zzao(C.TIME_UNSET, zzesVar));
                                                zzuVar = zza8.zzM();
                                            }
                                            zzais zzaisVar3 = new zzais(i108, i107, zzahr.zza(j14, j13, str17), j4, zzt, zzahr.zzb(j14, j13, str17), zzuVar, zzahuVar5.zzd, zzahuVar5.zza, zzahuVar5.zzc, jArr, jArr2);
                                            zzggrVar2 = zzggrVar;
                                            zzaisVar = zzaisVar3;
                                            zzaisVar2 = (zzais) zzggrVar2.apply(zzaisVar);
                                            if (zzaisVar2 == null) {
                                                zzet zzd6 = zzetVar3.zzd(Mp4Box.TYPE_mdia);
                                                zzd6.getClass();
                                                zzet zzd7 = zzd6.zzd(Mp4Box.TYPE_minf);
                                                zzd7.getClass();
                                                zzet zzd8 = zzd7.zzd(Mp4Box.TYPE_stbl);
                                                zzd8.getClass();
                                                zzaiv zzg9 = zzg(zzaisVar2, zzd8, zzadkVar, false);
                                                arrayList3 = arrayList;
                                                arrayList3.add(zzg9);
                                                i34 = i + 1;
                                                zzetVar4 = zzetVar;
                                                arrayList4 = arrayList3;
                                            } else {
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                }
                                jArr = null;
                                jArr2 = null;
                                zzuVar = zzahuVar5.zzb;
                                if (zzuVar != null) {
                                }
                            }
                            zzB3 = 65536;
                        }
                        zzB2 = 0;
                    }
                    if (zzB2 == 0) {
                        if (zzB3 == -65536) {
                            if (zzB4 != 65536) {
                                if (zzB4 == -65536) {
                                    z4 = zzB5 != 0;
                                    zzB4 = -65536;
                                }
                                zzB3 = -65536;
                            } else {
                                z4 = zzB5 != 0;
                            }
                            if (true != z4) {
                                i5 = RotationOptions.ROTATE_270;
                                i4 = i5;
                                i2 = 1;
                                zzefVar.zzk(16);
                                short zzv11 = zzefVar.zzv();
                                zzefVar.zzk(2);
                                short zzv22 = zzefVar.zzv();
                                if (j == C.TIME_UNSET) {
                                }
                                long j102 = zzd(zzc2.zza).zzc;
                                if (j3 == C.TIME_UNSET) {
                                }
                                zzet zzd22 = zzd.zzd(Mp4Box.TYPE_minf);
                                zzd22.getClass();
                                zzet zzd32 = zzd22.zzd(Mp4Box.TYPE_stbl);
                                zzd32.getClass();
                                zzeu zzc52 = zzd.zzc(Mp4Box.TYPE_mdhd);
                                zzc52.getClass();
                                zzef zzefVar22 = zzc52.zza;
                                i6 = 8;
                                zzefVar22.zzh(8);
                                zza2 = zza(zzefVar22.zzB());
                                zzefVar22.zzk(zza2 == 0 ? 8 : 16);
                                long zzz5 = zzefVar22.zzz();
                                int zzg22 = zzefVar22.zzg();
                                i7 = 0;
                                while (true) {
                                    if (zza2 == 0) {
                                    }
                                    if (i7 >= i6) {
                                    }
                                    i7++;
                                    zzetVar5 = zzetVar5;
                                    i6 = 8;
                                }
                                int zzt32 = zzefVar22.zzt();
                                char c42 = (char) (((zzt32 >> 10) & 31) + 96);
                                char c52 = (char) (((zzt32 >> 5) & 31) + 96);
                                char c62 = (char) ((zzt32 & 31) + 96);
                                char[] cArr2 = new char[3];
                                cArr2[0] = c42;
                                cArr2[i2] = c52;
                                char c72 = 2;
                                cArr2[2] = c62;
                                i9 = 0;
                                while (i9 < i8) {
                                }
                                str = new String(cArr2);
                                zzc = zzd32.zzc(Mp4Box.TYPE_stsd);
                                if (zzc == null) {
                                }
                            }
                            zzB3 = -65536;
                        }
                        i2 = 1;
                        i3 = 0;
                    } else {
                        int i110 = zzB2;
                        i2 = 1;
                        i3 = i110;
                    }
                    i4 = ((i3 == -65536 || i3 == 65536) && zzB3 == 0 && zzB4 == 0 && zzB5 == -65536) ? 180 : 0;
                    zzefVar.zzk(16);
                    short zzv112 = zzefVar.zzv();
                    zzefVar.zzk(2);
                    short zzv222 = zzefVar.zzv();
                    if (j == C.TIME_UNSET) {
                    }
                    long j1022 = zzd(zzc2.zza).zzc;
                    if (j3 == C.TIME_UNSET) {
                    }
                    zzet zzd222 = zzd.zzd(Mp4Box.TYPE_minf);
                    zzd222.getClass();
                    zzet zzd322 = zzd222.zzd(Mp4Box.TYPE_stbl);
                    zzd322.getClass();
                    zzeu zzc522 = zzd.zzc(Mp4Box.TYPE_mdhd);
                    zzc522.getClass();
                    zzef zzefVar222 = zzc522.zza;
                    i6 = 8;
                    zzefVar222.zzh(8);
                    zza2 = zza(zzefVar222.zzB());
                    zzefVar222.zzk(zza2 == 0 ? 8 : 16);
                    long zzz52 = zzefVar222.zzz();
                    int zzg222 = zzefVar222.zzg();
                    i7 = 0;
                    while (true) {
                        if (zza2 == 0) {
                        }
                        if (i7 >= i6) {
                        }
                        i7++;
                        zzetVar5 = zzetVar5;
                        i6 = 8;
                    }
                    int zzt322 = zzefVar222.zzt();
                    char c422 = (char) (((zzt322 >> 10) & 31) + 96);
                    char c522 = (char) (((zzt322 >> 5) & 31) + 96);
                    char c622 = (char) ((zzt322 & 31) + 96);
                    char[] cArr22 = new char[3];
                    cArr22[0] = c422;
                    cArr22[i2] = c522;
                    char c722 = 2;
                    cArr22[2] = c622;
                    i9 = 0;
                    while (i9 < i8) {
                    }
                    str = new String(cArr22);
                    zzc = zzd322.zzc(Mp4Box.TYPE_stsd);
                    if (zzc == null) {
                    }
                }
                zzaisVar = null;
                zzaisVar2 = (zzais) zzggrVar2.apply(zzaisVar);
                if (zzaisVar2 == null) {
                }
            }
            i34 = i + 1;
            zzetVar4 = zzetVar;
            arrayList4 = arrayList3;
        }
    }

    public static zzao zzc(zzeu zzeuVar) {
        int zzF;
        zzef zzefVar = zzeuVar.zza;
        zzefVar.zzh(8);
        zzao zzaoVar = new zzao(C.TIME_UNSET, new zzan[0]);
        while (zzefVar.zzd() >= 8) {
            int zzg = zzefVar.zzg();
            int zzB = zzefVar.zzB() + zzg;
            int zzB2 = zzefVar.zzB();
            zzao zzaoVar2 = null;
            if (zzB2 == 1835365473) {
                zzefVar.zzh(zzg);
                zzefVar.zzk(8);
                zzf(zzefVar);
                while (true) {
                    if (zzefVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg2 = zzefVar.zzg();
                    int zzB3 = zzefVar.zzB() + zzg2;
                    if (zzefVar.zzB() == 1768715124) {
                        zzefVar.zzh(zzg2);
                        zzefVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzefVar.zzg() < zzB3) {
                            zzan zzc = zzaih.zzc(zzefVar);
                            if (zzc != null) {
                                arrayList.add(zzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzaoVar2 = new zzao(arrayList);
                        }
                    } else {
                        zzefVar.zzh(zzB3);
                    }
                }
                zzaoVar = zzaoVar.zzc(zzaoVar2);
            } else if (zzB2 == 1936553057) {
                zzefVar.zzh(zzg);
                zzefVar.zzk(12);
                while (true) {
                    if (zzefVar.zzg() >= zzB) {
                        break;
                    }
                    int zzg3 = zzefVar.zzg();
                    int zzB4 = zzefVar.zzB();
                    if (zzefVar.zzB() != 1935766900) {
                        zzefVar.zzh(zzg3 + zzB4);
                    } else if (zzB4 >= 16) {
                        zzefVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int zzs = zzefVar.zzs();
                            int zzs2 = zzefVar.zzs();
                            if (zzs == 0) {
                                i = zzs2;
                            } else if (zzs == 1) {
                                i2 = zzs2;
                            }
                        }
                        if (i == 12) {
                            zzF = PsExtractor.VIDEO_STREAM_MASK;
                        } else if (i == 13) {
                            zzF = MenuKt.InTransitionDuration;
                        } else {
                            if (i == 21 && zzefVar.zzd() >= 8 && zzefVar.zzg() + 8 <= zzB) {
                                int zzB5 = zzefVar.zzB();
                                int zzB6 = zzefVar.zzB();
                                if (zzB5 >= 12 && zzB6 == 1936877170) {
                                    zzF = zzefVar.zzF();
                                }
                            }
                            zzF = -2147483647;
                        }
                        if (zzF != -2147483647) {
                            zzaoVar2 = new zzao(C.TIME_UNSET, new zzagr(zzF, i2));
                        }
                    }
                }
                zzaoVar = zzaoVar.zzc(zzaoVar2);
            } else if (zzB2 == -1451722374) {
                zzaoVar = zzaoVar.zzc(zzh(zzefVar));
            }
            zzefVar.zzh(zzB);
        }
        return zzaoVar;
    }

    public static zzex zzd(zzef zzefVar) {
        long zzD;
        long zzD2;
        zzefVar.zzh(8);
        if (zza(zzefVar.zzB()) == 0) {
            zzD = zzefVar.zzz();
            zzD2 = zzefVar.zzz();
        } else {
            zzD = zzefVar.zzD();
            zzD2 = zzefVar.zzD();
        }
        return new zzex(zzD, zzD2, zzefVar.zzz());
    }

    public static zzao zze(zzet zzetVar) {
        zzer zzerVar;
        zzeu zzc = zzetVar.zzc(Mp4Box.TYPE_hdlr);
        zzeu zzc2 = zzetVar.zzc(Mp4Box.TYPE_keys);
        zzeu zzc3 = zzetVar.zzc(Mp4Box.TYPE_ilst);
        if (zzc != null && zzc2 != null && zzc3 != null && zzi(zzc.zza) == 1835299937) {
            zzef zzefVar = zzc2.zza;
            zzefVar.zzh(12);
            int zzB = zzefVar.zzB();
            String[] strArr = new String[zzB];
            for (int i = 0; i < zzB; i++) {
                int zzB2 = zzefVar.zzB();
                zzefVar.zzk(4);
                strArr[i] = zzefVar.zzK(zzB2 - 8, StandardCharsets.UTF_8);
            }
            zzef zzefVar2 = zzc3.zza;
            zzefVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzefVar2.zzd() > 8) {
                int zzg = zzefVar2.zzg() + zzefVar2.zzB();
                int zzB3 = zzefVar2.zzB() - 1;
                if (zzB3 < 0 || zzB3 >= zzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(zzB3);
                    zzds.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[zzB3];
                    while (true) {
                        int zzg2 = zzefVar2.zzg();
                        if (zzg2 >= zzg) {
                            zzerVar = null;
                            break;
                        }
                        int zzB4 = zzefVar2.zzB();
                        if (zzefVar2.zzB() == 1684108385) {
                            int zzB5 = zzefVar2.zzB();
                            int zzB6 = zzefVar2.zzB();
                            int i2 = zzB4 - 16;
                            byte[] bArr = new byte[i2];
                            zzefVar2.zzm(bArr, 0, i2);
                            zzerVar = new zzer(str, bArr, zzB6, zzB5);
                            break;
                        }
                        zzefVar2.zzh(zzg2 + zzB4);
                    }
                    if (zzerVar != null) {
                        arrayList.add(zzerVar);
                    }
                }
                zzefVar2.zzh(zzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzao(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzef zzefVar) {
        int zzg = zzefVar.zzg();
        zzefVar.zzk(4);
        if (zzefVar.zzB() != 1751411826) {
            zzg += 4;
        }
        zzefVar.zzh(zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaiv zzg(zzais zzaisVar, zzet zzetVar, zzadk zzadkVar, boolean z) throws zzas {
        zzahs zzahwVar;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        zzu zzuVar;
        int i7;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        long j2;
        long j3;
        long[] jArr3;
        long j4;
        int i8;
        long[] jArr4;
        int i9;
        int i10;
        int i11;
        int length;
        int i12;
        int i13;
        long j5;
        int i14;
        int i15;
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
        zzais zzaisVar2 = zzaisVar;
        zzeu zzc = zzetVar.zzc(Mp4Box.TYPE_stsz);
        if (zzc != null) {
            zzahwVar = new zzahv(zzc, zzaisVar2.zzg);
        } else {
            zzeu zzc2 = zzetVar.zzc(Mp4Box.TYPE_stz2);
            if (zzc2 == null) {
                throw zzas.zzb("Track has no sample table size information", null);
            }
            zzahwVar = new zzahw(zzc2);
        }
        int zza2 = zzahwVar.zza();
        if (zza2 == 0) {
            return new zzaiv(zzaisVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L, 0);
        }
        if (zzaisVar2.zzb == 2) {
            long j6 = zzaisVar2.zzf;
            if (j6 > 0) {
                zzs zza3 = zzaisVar2.zzg.zza();
                zza3.zzx(zza2 / (j6 / 1000000.0f));
                zzaisVar2 = zzaisVar2.zzb(zza3.zzM());
            }
        }
        zzeu zzc3 = zzetVar.zzc(Mp4Box.TYPE_stco);
        if (zzc3 == null) {
            zzc3 = zzetVar.zzc(Mp4Box.TYPE_co64);
            zzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        zzeu zzc4 = zzetVar.zzc(Mp4Box.TYPE_stsc);
        zzc4.getClass();
        zzef zzefVar = zzc4.zza;
        zzeu zzc5 = zzetVar.zzc(Mp4Box.TYPE_stts);
        zzc5.getClass();
        zzef zzefVar2 = zzc5.zza;
        zzeu zzc6 = zzetVar.zzc(Mp4Box.TYPE_stss);
        zzef zzefVar3 = zzc6 != null ? zzc6.zza : null;
        zzeu zzc7 = zzetVar.zzc(Mp4Box.TYPE_ctts);
        zzef zzefVar4 = zzc7 != null ? zzc7.zza : null;
        zzaho zzahoVar = new zzaho(zzefVar, zzc3.zza, z2);
        zzefVar2.zzh(12);
        int zzH = zzefVar2.zzH() - 1;
        int zzH2 = zzefVar2.zzH();
        int zzH3 = zzefVar2.zzH();
        if (zzefVar4 != null) {
            zzefVar4.zzh(12);
            i = zzefVar4.zzH();
        } else {
            i = 0;
        }
        if (zzefVar3 != null) {
            zzefVar3.zzh(12);
            i2 = zzefVar3.zzH();
            if (i2 > 0) {
                i4 = zzefVar3.zzH() - 1;
                i3 = 0;
            } else {
                i3 = 0;
                i4 = -1;
                zzefVar3 = null;
            }
        } else {
            i2 = 0;
            i3 = 0;
            i4 = -1;
        }
        int zzb2 = zzahwVar.zzb();
        zzu zzuVar2 = zzaisVar2.zzg;
        if (zzb2 != -1) {
            String str = zzuVar2.zzo;
            i5 = 1;
            if ((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && zzH == 0) {
                if (i == 0 && i2 == 0) {
                    int i26 = zzahoVar.zza;
                    long[] jArr5 = new long[i26];
                    int[] iArr3 = new int[i26];
                    while (zzahoVar.zza()) {
                        int i27 = zzahoVar.zzb;
                        jArr5[i27] = zzahoVar.zzd;
                        iArr3[i27] = zzahoVar.zzc;
                    }
                    long j7 = zzH3;
                    int i28 = 8192 / zzb2;
                    int i29 = i3;
                    int i30 = i29;
                    while (i29 < i26) {
                        int i31 = iArr3[i29];
                        String str2 = zzeo.zza;
                        i30 += ((i31 + i28) - 1) / i28;
                        i29++;
                    }
                    jArr2 = new long[i30];
                    iArr = new int[i30];
                    jArr = new long[i30];
                    iArr2 = new int[i30];
                    int i32 = i3;
                    int i33 = i32;
                    int i34 = i33;
                    i7 = i34;
                    int i35 = i7;
                    while (i34 < i26) {
                        int i36 = iArr3[i34];
                        long j8 = jArr5[i34];
                        int i37 = i35;
                        int i38 = i26;
                        int i39 = i7;
                        int i40 = i37;
                        int i41 = i33;
                        int i42 = i36;
                        while (i42 > 0) {
                            int min = Math.min(i28, i42);
                            jArr2[i40] = j8;
                            int i43 = i42;
                            int i44 = zzb2 * min;
                            iArr[i40] = i44;
                            int i45 = i41 + i44;
                            i39 = Math.max(i39, i44);
                            jArr[i40] = i32 * j7;
                            iArr2[i40] = 1;
                            j8 += iArr[i40];
                            i32 += min;
                            i42 = i43 - min;
                            i40++;
                            i41 = i45;
                            iArr3 = iArr3;
                        }
                        i34++;
                        int i46 = i40;
                        i7 = i39;
                        i26 = i38;
                        i35 = i46;
                        i33 = i41;
                    }
                    long j9 = j7 * i32;
                    j2 = i33;
                    i6 = zza2;
                    zzuVar = zzuVar2;
                    j = j9;
                    long[] jArr6 = jArr2;
                    int[] iArr4 = iArr2;
                    int[] iArr5 = iArr;
                    int i47 = i7;
                    j3 = zzaisVar2.zzf;
                    if (j3 > 0) {
                        long zzt = zzeo.zzt(j2 * 8, 1000000L, j3, RoundingMode.HALF_DOWN);
                        if (zzt > 0 && zzt < SieveCacheKt.NodeLinkMask) {
                            zzs zza4 = zzuVar.zza();
                            zza4.zzh((int) zzt);
                            zzaisVar2 = zzaisVar2.zzb(zza4.zzM());
                        }
                    }
                    long j10 = zzaisVar2.zzc;
                    long zzt2 = zzeo.zzt(j, 1000000L, j10, RoundingMode.DOWN);
                    jArr3 = zzaisVar2.zzi;
                    if (jArr3 == null) {
                        zzeo.zzu(jArr, 1000000L, j10);
                        return new zzaiv(zzaisVar2, jArr6, iArr5, i47, jArr, iArr4, zzt2, i6);
                    }
                    int length2 = jArr3.length;
                    if (length2 == 1) {
                        if (zzaisVar2.zzb != 1 || (length = jArr.length) < 2) {
                            j4 = j10;
                        } else {
                            long[] jArr7 = zzaisVar2.zzj;
                            jArr7.getClass();
                            long j11 = jArr7[i3];
                            long j12 = jArr3[i3];
                            long j13 = zzaisVar2.zzd;
                            long zzt3 = zzeo.zzt(j12, j10, j13, RoundingMode.DOWN) + j11;
                            int i48 = length - 1;
                            int i49 = i3;
                            int max = Math.max(i49, Math.min(4, i48));
                            int max2 = Math.max(i49, Math.min(length - 4, i48));
                            if (jArr[i49] > j11 || j11 >= jArr[max] || jArr[max2] >= zzt3 || zzt3 > 2 + j) {
                                j4 = j10;
                            } else {
                                long max3 = Math.max(0L, j - zzt3);
                                long j14 = j11 - jArr[0];
                                long j15 = zzaisVar2.zzg.zzH;
                                long zzt4 = zzeo.zzt(j14, j15, j10, RoundingMode.DOWN);
                                long zzt5 = zzeo.zzt(max3, j15, j10, RoundingMode.DOWN);
                                j4 = j10;
                                if (zzt4 == 0) {
                                    if (zzt5 != 0) {
                                        zzt4 = 0;
                                    }
                                }
                                if (zzt4 <= SieveCacheKt.NodeLinkMask && zzt5 <= SieveCacheKt.NodeLinkMask) {
                                    zzadkVar.zza = (int) zzt4;
                                    zzadkVar.zzb = (int) zzt5;
                                    zzeo.zzu(jArr, 1000000L, j4);
                                    return new zzaiv(zzaisVar2, jArr6, iArr5, i47, jArr, iArr4, zzeo.zzt(jArr3[0], 1000000L, j13, RoundingMode.DOWN), i6);
                                }
                            }
                        }
                        i8 = 1;
                        length2 = 1;
                    } else {
                        j4 = j10;
                        i8 = 1;
                    }
                    if (length2 == i8 && jArr3[0] == 0) {
                        long[] jArr8 = zzaisVar2.zzj;
                        jArr8.getClass();
                        long j16 = jArr8[0];
                        int i50 = 0;
                        while (i50 < jArr.length) {
                            long j17 = j4;
                            jArr[i50] = zzeo.zzt(jArr[i50] - j16, 1000000L, j17, RoundingMode.DOWN);
                            i50++;
                            j4 = j17;
                        }
                        return new zzaiv(zzaisVar2, jArr6, iArr5, i47, jArr, iArr4, zzeo.zzt(j - j16, 1000000L, j4, RoundingMode.DOWN), i6);
                    }
                    long j18 = j4;
                    int i51 = i6;
                    int i52 = zzaisVar2.zzb;
                    boolean z3 = i52 == 1;
                    long[] jArr9 = zzaisVar2.zzj;
                    int[] iArr6 = new int[length2];
                    int[] iArr7 = new int[length2];
                    jArr9.getClass();
                    long[] jArr10 = jArr9;
                    int i53 = 0;
                    int i54 = 0;
                    int i55 = 0;
                    boolean z4 = false;
                    while (i54 < jArr3.length) {
                        int[] iArr8 = iArr6;
                        long j19 = jArr10[i54];
                        if (j19 != -1) {
                            jArr4 = jArr10;
                            i9 = i54;
                            long j20 = j18;
                            long zzt6 = zzeo.zzt(jArr3[i54], j20, zzaisVar2.zzd, RoundingMode.DOWN);
                            j18 = j20;
                            iArr8[i9] = zzeo.zzm(jArr, j19, true, true);
                            long j21 = j19 + zzt6;
                            iArr7[i9] = zzeo.zzo(jArr, j21, z3, false);
                            int i56 = iArr8[i9];
                            while (true) {
                                i10 = iArr8[i9];
                                if (i10 < 0 || (iArr4[i10] & 1) != 0) {
                                    break;
                                }
                                iArr8[i9] = i10 - 1;
                            }
                            if (i10 < 0) {
                                iArr8[i9] = i56;
                                while (true) {
                                    i11 = iArr8[i9];
                                    if (i11 >= iArr7[i9] || (iArr4[i11] & 1) != 0) {
                                        break;
                                    }
                                    iArr8[i9] = i11 + 1;
                                }
                            } else {
                                i11 = i10;
                            }
                            if (i52 == 2 && i11 != iArr7[i9]) {
                                while (true) {
                                    int i57 = iArr7[i9];
                                    if (i57 >= jArr.length - 1) {
                                        break;
                                    }
                                    int i58 = i57 + 1;
                                    if (jArr[i58] > j21) {
                                        break;
                                    }
                                    iArr7[i9] = i58;
                                }
                            }
                            int i59 = iArr7[i9];
                            int i60 = iArr8[i9];
                            i55 += i59 - i60;
                            z4 = (i53 != i60) | z4;
                            i53 = i59;
                        } else {
                            jArr4 = jArr10;
                            i9 = i54;
                        }
                        i54 = i9 + 1;
                        jArr10 = jArr4;
                        iArr6 = iArr8;
                    }
                    int[] iArr9 = iArr6;
                    boolean z5 = (i55 != i51) | z4;
                    long[] jArr11 = z5 ? new long[i55] : jArr6;
                    int[] iArr10 = z5 ? new int[i55] : iArr5;
                    if (true == z5) {
                        i47 = 0;
                    }
                    int[] iArr11 = z5 ? new int[i55] : iArr4;
                    long[] jArr12 = new long[i55];
                    int i61 = i47;
                    int i62 = 0;
                    boolean z6 = false;
                    int i63 = 0;
                    long j22 = 0;
                    while (i62 < jArr3.length) {
                        long j23 = jArr9[i62];
                        int i64 = iArr9[i62];
                        int i65 = iArr7[i62];
                        long[] jArr13 = jArr3;
                        if (z5) {
                            int i66 = i65 - i64;
                            System.arraycopy(jArr6, i64, jArr11, i63, i66);
                            System.arraycopy(iArr5, i64, iArr10, i63, i66);
                            System.arraycopy(iArr4, i64, iArr11, i63, i66);
                        }
                        int i67 = i61;
                        while (i64 < i65) {
                            int[] iArr12 = iArr10;
                            int[] iArr13 = iArr11;
                            long zzt7 = zzeo.zzt(j22, 1000000L, zzaisVar2.zzd, RoundingMode.DOWN);
                            long zzt8 = zzeo.zzt(jArr[i64] - j23, 1000000L, j18, RoundingMode.DOWN);
                            z6 = (!(zzt8 >= 0)) | z6;
                            jArr12[i63] = zzt7 + zzt8;
                            if (z5 && iArr12[i63] > i67) {
                                i67 = iArr5[i64];
                            }
                            i63++;
                            i64++;
                            iArr10 = iArr12;
                            iArr11 = iArr13;
                        }
                        j22 += jArr13[i62];
                        i62++;
                        i61 = i67;
                        jArr3 = jArr13;
                        iArr10 = iArr10;
                        iArr11 = iArr11;
                    }
                    int[] iArr14 = iArr10;
                    int[] iArr15 = iArr11;
                    long zzt9 = zzeo.zzt(j22, 1000000L, zzaisVar2.zzd, RoundingMode.DOWN);
                    if (z6) {
                        zzs zza5 = zzaisVar2.zzg.zza();
                        zza5.zzs(true);
                        zzaisVar2 = zzaisVar2.zzb(zza5.zzM());
                    }
                    return new zzaiv(zzaisVar2, jArr11, iArr14, i61, jArr12, iArr15, zzt9, jArr11.length);
                }
                zzH = i3;
            }
        } else {
            i5 = 1;
        }
        long[] jArr14 = new long[zza2];
        int[] iArr16 = new int[zza2];
        long[] jArr15 = new long[zza2];
        zzef zzefVar5 = zzefVar4;
        int[] iArr17 = new int[zza2];
        int i68 = i2;
        zzahs zzahsVar = zzahwVar;
        zzuVar = zzuVar2;
        int i69 = i;
        int i70 = zzH;
        long j24 = 0;
        long j25 = 0;
        long j26 = 0;
        int i71 = i4;
        int i72 = i3;
        int i73 = i72;
        int i74 = i73;
        int i75 = i74;
        int i76 = i75;
        while (true) {
            if (i72 >= zza2) {
                jArr = jArr15;
                iArr = iArr16;
                jArr2 = jArr14;
                break;
            }
            long j27 = j24;
            int i77 = i5;
            while (true) {
                if (i75 == 0) {
                    boolean zza6 = zzahoVar.zza();
                    if (zza6 == 0) {
                        i20 = zza2;
                        i21 = i3;
                        i22 = zza6;
                        break;
                    }
                    zzef zzefVar6 = zzefVar2;
                    long j28 = zzahoVar.zzd;
                    i75 = zzahoVar.zzc;
                    j27 = j28;
                    zzefVar2 = zzefVar6;
                    zzefVar3 = zzefVar3;
                    zza2 = zza2;
                    i77 = zza6;
                } else {
                    i20 = zza2;
                    i21 = i75;
                    i22 = i77;
                    break;
                }
            }
            zzef zzefVar7 = zzefVar2;
            zzef zzefVar8 = zzefVar3;
            if (i22 == 0) {
                zzds.zzc("BoxParsers", "Unexpected end of chunk data");
                long[] copyOf = Arrays.copyOf(jArr14, i72);
                int[] copyOf2 = Arrays.copyOf(iArr16, i72);
                long[] copyOf3 = Arrays.copyOf(jArr15, i72);
                iArr17 = Arrays.copyOf(iArr17, i72);
                jArr2 = copyOf;
                zza2 = i72;
                iArr = copyOf2;
                jArr = copyOf3;
                break;
            }
            if (zzefVar5 != null) {
                int i78 = i69;
                while (true) {
                    if (i76 == 0) {
                        if (i78 <= 0) {
                            i76 = i3;
                            break;
                        }
                        i78--;
                        i76 = zzefVar5.zzH();
                        i73 = zzefVar5.zzB();
                    } else {
                        break;
                    }
                }
                i76--;
                i69 = i78;
            }
            int zzc8 = zzahsVar.zzc();
            long j29 = zzc8;
            j26 += j29;
            if (zzc8 > i74) {
                i74 = zzc8;
            }
            jArr14[i72] = j27;
            iArr16[i72] = zzc8;
            zzaho zzahoVar2 = zzahoVar;
            int i79 = i74;
            jArr15[i72] = j25 + i73;
            iArr17[i72] = zzefVar8 == null ? i5 : i3;
            if (i72 == i71) {
                iArr17[i72] = i5;
            }
            if (zzefVar8 == null || i72 != i71) {
                i23 = i68;
            } else {
                i23 = i68 - 1;
                if (i23 > 0) {
                    i24 = i21;
                    i25 = i72;
                    i71 = zzefVar8.zzH() - 1;
                    j25 += zzH3;
                    zzH2--;
                    if (zzH2 == 0) {
                        if (i70 > 0) {
                            i70--;
                            zzH2 = zzefVar7.zzH();
                            zzH3 = zzefVar7.zzB();
                        } else {
                            zzH2 = i3;
                        }
                    }
                    long j30 = j27 + j29;
                    i75 = i24 - 1;
                    i68 = i23;
                    zzahoVar = zzahoVar2;
                    zzefVar2 = zzefVar7;
                    zzefVar3 = zzefVar8;
                    j24 = j30;
                    i72 = i25 + 1;
                    i74 = i79;
                    zza2 = i20;
                }
            }
            i24 = i21;
            i25 = i72;
            j25 += zzH3;
            zzH2--;
            if (zzH2 == 0) {
            }
            long j302 = j27 + j29;
            i75 = i24 - 1;
            i68 = i23;
            zzahoVar = zzahoVar2;
            zzefVar2 = zzefVar7;
            zzefVar3 = zzefVar8;
            j24 = j302;
            i72 = i25 + 1;
            i74 = i79;
            zza2 = i20;
        }
        iArr2 = iArr17;
        long j31 = j25 + i73;
        if (zzefVar5 != null) {
            while (i69 > 0) {
                if (zzefVar5.zzH() != 0) {
                    i12 = i3;
                    break;
                }
                zzefVar5.zzB();
                i69--;
            }
        }
        i12 = i5;
        if (i68 != 0) {
            i13 = zza2;
            j5 = j31;
            i14 = zzH2;
            i15 = i75;
            i16 = i70;
            i17 = i76;
            i18 = i12;
            i19 = i68;
        } else if (zzH2 != 0) {
            i13 = zza2;
            j5 = j31;
            i14 = zzH2;
            i15 = i75;
            i16 = i70;
            i17 = i76;
            i18 = i12;
            i19 = i3;
        } else if (i75 != 0) {
            i13 = zza2;
            j5 = j31;
            i15 = i75;
            i14 = i3;
            i16 = i70;
            i17 = i76;
            i18 = i12;
            i19 = i14;
        } else if (i70 != 0) {
            i13 = zza2;
            j5 = j31;
            i14 = i3;
            i15 = i14;
            i16 = i70;
            i17 = i76;
            i18 = i12;
            i19 = i15;
        } else if (i76 != 0) {
            i13 = zza2;
            j5 = j31;
            i14 = i3;
            i15 = i14;
            i16 = i15;
            i17 = i76;
            i18 = i12;
            i19 = i16;
        } else if (i12 == 0) {
            i13 = zza2;
            j5 = j31;
            i19 = i3;
            i18 = i19;
            i14 = i18;
            i15 = i14;
            i16 = i15;
            i17 = i16;
        } else {
            i13 = zza2;
            j5 = j31;
            i7 = i74;
            i6 = i13;
            j = j5;
            j2 = j26;
            long[] jArr62 = jArr2;
            int[] iArr42 = iArr2;
            int[] iArr52 = iArr;
            int i472 = i7;
            j3 = zzaisVar2.zzf;
            if (j3 > 0) {
            }
            long j102 = zzaisVar2.zzc;
            long zzt22 = zzeo.zzt(j, 1000000L, j102, RoundingMode.DOWN);
            jArr3 = zzaisVar2.zzi;
            if (jArr3 == null) {
            }
        }
        int i80 = zzaisVar2.zza;
        int length3 = String.valueOf(i80).length() + 66 + String.valueOf(i19).length() + 35 + String.valueOf(i14).length() + 26 + String.valueOf(i15).length() + 33 + String.valueOf(i16).length() + 36;
        int length4 = String.valueOf(i17).length();
        String str3 = i5 != i18 ? ", ctts invalid" : "";
        i7 = i74;
        StringBuilder sb = new StringBuilder(length3 + length4 + str3.length());
        sb.append("Inconsistent stbl box for track ");
        sb.append(i80);
        sb.append(": remainingSynchronizationSamples ");
        sb.append(i19);
        sb.append(", remainingSamplesAtTimestampDelta ");
        sb.append(i14);
        sb.append(", remainingSamplesInChunk ");
        sb.append(i15);
        sb.append(", remainingTimestampDeltaChanges ");
        sb.append(i16);
        sb.append(", remainingSamplesAtTimestampOffset ");
        sb.append(i17);
        sb.append(str3);
        zzds.zzc("BoxParsers", sb.toString());
        i6 = i13;
        j = j5;
        j2 = j26;
        long[] jArr622 = jArr2;
        int[] iArr422 = iArr2;
        int[] iArr522 = iArr;
        int i4722 = i7;
        j3 = zzaisVar2.zzf;
        if (j3 > 0) {
        }
        long j1022 = zzaisVar2.zzc;
        long zzt222 = zzeo.zzt(j, 1000000L, j1022, RoundingMode.DOWN);
        jArr3 = zzaisVar2.zzi;
        if (jArr3 == null) {
        }
    }

    private static zzao zzh(zzef zzefVar) {
        short zzv = zzefVar.zzv();
        zzefVar.zzk(2);
        String zzK = zzefVar.zzK(zzv, StandardCharsets.UTF_8);
        int max = Math.max(zzK.lastIndexOf(43), zzK.lastIndexOf(45));
        try {
            return new zzao(C.TIME_UNSET, new zzew(Float.parseFloat(zzK.substring(0, max)), Float.parseFloat(zzK.substring(max, zzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzi(zzef zzefVar) {
        zzefVar.zzh(16);
        return zzefVar.zzB();
    }

    private static String zzj(byte[] bArr, int i, int i2) {
        zzghc.zzh(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int zze = zzgne.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzeo.zza;
            int i4 = ((zze >> 8) & 255) - 128;
            int i5 = (zze >> 16) & 255;
            int i6 = (zze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        String zzd = zzggw.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + zzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(zzd);
        sb.append("\n");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x014e, code lost:
    
        if (r6 == 1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzh zzk(zzef zzefVar) {
        int i;
        int zzj;
        int zzj2;
        zzg zzgVar = new zzg();
        byte[] zzi = zzefVar.zzi();
        zzee zzeeVar = new zzee(zzi, zzi.length);
        zzeeVar.zzf(zzefVar.zzg() * 8);
        zzeeVar.zzo(1);
        int zzj3 = zzeeVar.zzj(3);
        zzeeVar.zzh(6);
        boolean zzi2 = zzeeVar.zzi();
        boolean zzi3 = zzeeVar.zzi();
        boolean z = false;
        if (zzj3 == 2) {
            if (zzi2) {
                i = true == zzi3 ? 12 : 10;
                zzgVar.zze(i);
                zzgVar.zzf(i);
                int i2 = 13;
                zzeeVar.zzh(13);
                zzeeVar.zzg();
                zzj = zzeeVar.zzj(4);
                if (zzj == 1) {
                    StringBuilder sb = new StringBuilder(String.valueOf(zzj).length() + 22);
                    sb.append("Unsupported obu_type: ");
                    sb.append(zzj);
                    zzds.zzb("BoxParsers", sb.toString());
                    return zzgVar.zzg();
                }
                if (zzeeVar.zzi()) {
                    zzds.zzb("BoxParsers", "Unsupported obu_extension_flag");
                    return zzgVar.zzg();
                }
                boolean zzi4 = zzeeVar.zzi();
                zzeeVar.zzg();
                if (zzi4 && zzeeVar.zzj(8) > 127) {
                    zzds.zzb("BoxParsers", "Excessive obu_size");
                    return zzgVar.zzg();
                }
                int zzj4 = zzeeVar.zzj(3);
                zzeeVar.zzg();
                if (zzeeVar.zzi()) {
                    zzds.zzb("BoxParsers", "Unsupported reduced_still_picture_header");
                    return zzgVar.zzg();
                }
                if (zzeeVar.zzi()) {
                    zzds.zzb("BoxParsers", "Unsupported timing_info_present_flag");
                    return zzgVar.zzg();
                }
                if (zzeeVar.zzi()) {
                    zzds.zzb("BoxParsers", "Unsupported initial_display_delay_present_flag");
                    return zzgVar.zzg();
                }
                int zzj5 = zzeeVar.zzj(5);
                for (int i3 = 0; i3 <= zzj5; i3++) {
                    zzeeVar.zzh(12);
                    if (zzeeVar.zzj(5) > 7) {
                        zzeeVar.zzg();
                    }
                }
                int zzj6 = zzeeVar.zzj(4);
                int zzj7 = zzeeVar.zzj(4);
                zzeeVar.zzh(zzj6 + 1);
                zzeeVar.zzh(zzj7 + 1);
                if (zzeeVar.zzi()) {
                    zzeeVar.zzh(7);
                }
                zzeeVar.zzh(7);
                boolean zzi5 = zzeeVar.zzi();
                if (zzi5) {
                    zzeeVar.zzh(2);
                }
                if ((zzeeVar.zzi() || zzeeVar.zzj(1) > 0) && !zzeeVar.zzi()) {
                    zzeeVar.zzh(1);
                }
                if (zzi5) {
                    zzeeVar.zzh(3);
                }
                zzeeVar.zzh(3);
                boolean zzi6 = zzeeVar.zzi();
                if (zzj4 == 2) {
                    if (zzi6) {
                        zzeeVar.zzg();
                    }
                }
                if (zzeeVar.zzi()) {
                    z = true;
                }
                if (zzeeVar.zzi()) {
                    int zzj8 = zzeeVar.zzj(8);
                    int zzj9 = zzeeVar.zzj(8);
                    int zzj10 = zzeeVar.zzj(8);
                    if (!z && zzj8 == 1) {
                        if (zzj9 != 13) {
                            zzj8 = 1;
                        } else if (zzj10 == 0) {
                            zzj2 = 1;
                            zzj8 = 1;
                            zzgVar.zza(zzh.zzb(zzj8));
                            zzgVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzgVar.zzc(zzh.zzc(i2));
                        } else {
                            zzj8 = 1;
                            zzj2 = zzeeVar.zzj(1);
                            zzgVar.zza(zzh.zzb(zzj8));
                            zzgVar.zzb(zzj2 != 1 ? 2 : 1);
                            zzgVar.zzc(zzh.zzc(i2));
                        }
                    }
                    i2 = zzj9;
                    zzj2 = zzeeVar.zzj(1);
                    zzgVar.zza(zzh.zzb(zzj8));
                    zzgVar.zzb(zzj2 != 1 ? 2 : 1);
                    zzgVar.zzc(zzh.zzc(i2));
                }
                return zzgVar.zzg();
            }
            zzi2 = false;
            zzj3 = 2;
        }
        if (zzj3 <= 2) {
            i = true != zzi2 ? 8 : 10;
            zzgVar.zze(i);
            zzgVar.zzf(i);
        }
        int i22 = 13;
        zzeeVar.zzh(13);
        zzeeVar.zzg();
        zzj = zzeeVar.zzj(4);
        if (zzj == 1) {
        }
    }

    private static zzh zzl(zzef zzefVar) {
        zzg zzgVar = new zzg();
        byte[] zzi = zzefVar.zzi();
        zzee zzeeVar = new zzee(zzi, zzi.length);
        zzeeVar.zzf(zzefVar.zzg() * 8);
        zzeeVar.zzo(1);
        int zzj = zzeeVar.zzj(8);
        for (int i = 0; i < zzj; i++) {
            zzeeVar.zzo(1);
            int zzj2 = zzeeVar.zzj(8);
            for (int i2 = 0; i2 < zzj2; i2++) {
                zzeeVar.zzh(6);
                boolean zzi2 = zzeeVar.zzi();
                zzeeVar.zzg();
                zzeeVar.zzo(11);
                zzeeVar.zzh(4);
                int zzj3 = zzeeVar.zzj(4) + 8;
                zzgVar.zze(zzj3);
                zzgVar.zzf(zzj3);
                zzeeVar.zzo(1);
                if (zzi2) {
                    int zzj4 = zzeeVar.zzj(8);
                    int zzj5 = zzeeVar.zzj(8);
                    zzeeVar.zzo(1);
                    boolean zzi3 = zzeeVar.zzi();
                    zzgVar.zza(zzh.zzb(zzj4));
                    zzgVar.zzb(true != zzi3 ? 2 : 1);
                    zzgVar.zzc(zzh.zzc(zzj5));
                }
            }
        }
        return zzgVar.zzg();
    }

    private static ByteBuffer zzm() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzn(zzet zzetVar) {
        zzeu zzc = zzetVar.zzc(Mp4Box.TYPE_elst);
        if (zzc == null) {
            return null;
        }
        zzef zzefVar = zzc.zza;
        zzefVar.zzh(8);
        int zza2 = zza(zzefVar.zzB());
        int zzH = zzefVar.zzH();
        long[] jArr = new long[zzH];
        long[] jArr2 = new long[zzH];
        for (int i = 0; i < zzH; i++) {
            jArr[i] = zza2 == 1 ? zzefVar.zzJ() : zzefVar.zzz();
            jArr2[i] = zza2 == 1 ? zzefVar.zzD() : zzefVar.zzB();
            if (zzefVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzefVar.zzk(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x016a, code lost:
    
        if (r11 == (-1)) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzo(zzef zzefVar, int i, int i2, int i3, int i4, String str, boolean z, zzp zzpVar, zzahu zzahuVar, int i5) throws zzas {
        int i6;
        int zzt;
        int zzF;
        int zzB;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z2;
        boolean z3;
        zzef zzefVar2 = zzefVar;
        int i16 = i;
        int i17 = i3;
        zzp zzpVar2 = zzpVar;
        zzefVar2.zzh(i2 + 16);
        if (z) {
            i6 = zzefVar2.zzt();
            zzefVar2.zzk(6);
        } else {
            zzefVar2.zzk(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            zzt = zzefVar2.zzt();
            zzefVar2.zzk(6);
            zzF = zzefVar2.zzF();
            zzefVar2.zzh(zzefVar2.zzg() - 4);
            zzB = zzefVar2.zzB();
            i7 = 2;
            if (i6 == 1) {
                zzefVar2.zzk(16);
            }
            i8 = -1;
        } else {
            if (i6 != 2) {
                return;
            }
            zzefVar2.zzk(16);
            zzF = (int) Math.round(Double.longBitsToDouble(zzefVar2.zzD()));
            int zzH = zzefVar2.zzH();
            zzefVar2.zzk(4);
            int zzH2 = zzefVar2.zzH();
            int zzH3 = zzefVar2.zzH();
            int i18 = zzH3 & 1;
            int i19 = zzH3 & 2;
            if (i18 == 0) {
                if (zzH2 == 8) {
                    i8 = 3;
                } else if (zzH2 == 16) {
                    i8 = i19 != 0 ? 268435456 : 2;
                } else if (zzH2 == 24) {
                    i8 = i19 != 0 ? C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
                } else {
                    if (zzH2 == 32) {
                        i8 = i19 != 0 ? C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
                    }
                    i8 = -1;
                }
                zzefVar2.zzk(8);
                zzt = zzH;
                i7 = 2;
                zzB = 0;
            } else {
                if (zzH2 == 32) {
                    i8 = 4;
                    zzefVar2.zzk(8);
                    zzt = zzH;
                    i7 = 2;
                    zzB = 0;
                }
                i8 = -1;
                zzefVar2.zzk(8);
                zzt = zzH;
                i7 = 2;
                zzB = 0;
            }
        }
        if (i16 == 1767992678) {
            zzF = -1;
            zzt = -1;
        } else {
            if (i16 == 1935764850) {
                zzF = 8000;
            } else if (i16 == 1935767394) {
                zzF = 16000;
                i16 = 1935767394;
            }
            zzt = 1;
        }
        int zzg = zzefVar2.zzg();
        int i20 = Mp4Box.TYPE_enca;
        if (i16 == 1701733217) {
            Pair zzr = zzr(zzefVar2, i2, i17);
            if (zzr != null) {
                i20 = ((Integer) zzr.first).intValue();
                zzpVar2 = zzpVar2 == null ? null : zzpVar2.zzb(((zzait) zzr.second).zzb);
                zzahuVar.zza[i5] = (zzait) zzr.second;
            }
            i16 = i20;
            zzefVar2.zzh(zzg);
        }
        if (i16 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i16 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i16 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (i16 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i16 == 1685353320 || i16 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i16 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i16 == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (i16 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (i16 == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else {
            if (i16 != 1936684916) {
                if (i16 == 1953984371) {
                    str2 = MimeTypes.AUDIO_RAW;
                    i8 = 268435456;
                } else if (i16 != 1819304813) {
                    if (i16 == 778924082 || i16 == 778924083) {
                        str2 = MimeTypes.AUDIO_MPEG;
                    } else if (i16 == 1835557169) {
                        str2 = MimeTypes.AUDIO_MPEGH_MHA1;
                    } else if (i16 == 1835560241) {
                        str2 = MimeTypes.AUDIO_MPEGH_MHM1;
                    } else if (i16 == 1634492771) {
                        str2 = MimeTypes.AUDIO_ALAC;
                    } else if (i16 == 1634492791) {
                        str2 = MimeTypes.AUDIO_ALAW;
                    } else if (i16 == 1970037111) {
                        str2 = MimeTypes.AUDIO_MLAW;
                    } else if (i16 == 1332770163) {
                        str2 = MimeTypes.AUDIO_OPUS;
                    } else if (i16 == 1716281667) {
                        str2 = MimeTypes.AUDIO_FLAC;
                    } else if (i16 == 1835823201) {
                        str2 = MimeTypes.AUDIO_TRUEHD;
                    } else if (i16 == 1767992678) {
                        str2 = MimeTypes.AUDIO_IAMF;
                        i16 = 1767992678;
                    } else {
                        str2 = null;
                    }
                }
            }
            i8 = i7;
            str2 = MimeTypes.AUDIO_RAW;
        }
        int i21 = i8;
        List list = null;
        String str3 = null;
        zzahp zzahpVar = null;
        zzahn zzahnVar = null;
        while (zzg - i2 < i17) {
            zzefVar2.zzh(zzg);
            int zzB2 = zzefVar2.zzB();
            String str4 = str3;
            zzacy.zza(zzB2 > 0, "childAtomSize must be positive");
            int zzB3 = zzefVar2.zzB();
            int i22 = zzF;
            if (zzB3 == 1835557187) {
                zzefVar2.zzh(zzg + 8);
                zzefVar2.zzk(1);
                int zzs = zzefVar2.zzs();
                zzefVar2.zzk(1);
                String format = Objects.equals(str2, MimeTypes.AUDIO_MPEGH_MHM1) ? String.format("mhm1.%02X", Integer.valueOf(zzs)) : String.format("mha1.%02X", Integer.valueOf(zzs));
                int zzt2 = zzefVar2.zzt();
                byte[] bArr = new byte[zzt2];
                str4 = format;
                z3 = false;
                zzefVar2.zzm(bArr, 0, zzt2);
                if (list == null) {
                    list = zzgjz.zzj(bArr);
                    zzF = i22;
                    i12 = i16;
                    i9 = zzB;
                    str3 = str4;
                } else {
                    list = zzgjz.zzk(bArr, (byte[]) list.get(0));
                    str3 = str4;
                    zzF = i22;
                    i12 = i16;
                    i9 = zzB;
                }
            } else if (zzB3 == 1835557200) {
                zzefVar2.zzh(zzg + 8);
                int zzs2 = zzefVar2.zzs();
                if (zzs2 > 0) {
                    byte[] bArr2 = new byte[zzs2];
                    z3 = false;
                    zzefVar2.zzm(bArr2, 0, zzs2);
                    if (list == null) {
                        list = zzgjz.zzj(bArr2);
                        zzF = i22;
                        i12 = i16;
                        i9 = zzB;
                        str3 = str4;
                    } else {
                        list = zzgjz.zzk((byte[]) list.get(0), bArr2);
                        str3 = str4;
                        zzF = i22;
                        i12 = i16;
                        i9 = zzB;
                    }
                }
                zzF = i22;
                i12 = i16;
                i9 = zzB;
                str3 = str4;
            } else {
                if (zzB3 == 1702061171) {
                    zzF = i22;
                    i9 = zzB;
                    i10 = zzg;
                    i11 = -1;
                } else if (z && zzB3 == 2002876005) {
                    int zzg2 = zzefVar2.zzg();
                    zzacy.zza(zzg2 >= zzg, null);
                    int i23 = zzg2;
                    while (true) {
                        if (i23 - zzg >= zzB2) {
                            zzF = i22;
                            i9 = zzB;
                            i10 = -1;
                            break;
                        }
                        zzefVar2.zzh(i23);
                        int zzB4 = zzefVar2.zzB();
                        if (zzB4 > 0) {
                            i15 = i23;
                            z2 = true;
                        } else {
                            i15 = i23;
                            z2 = false;
                        }
                        zzacy.zza(z2, "childAtomSize must be positive");
                        if (zzefVar2.zzB() == 1702061171) {
                            zzF = i22;
                            i9 = zzB;
                            i10 = i15;
                            break;
                        }
                        i23 = i15 + zzB4;
                    }
                    i11 = -1;
                } else if (zzB3 == 1651798644) {
                    zzahnVar = zzq(zzefVar2, zzg);
                    str3 = str4;
                    zzF = i22;
                    i12 = i16;
                    i9 = zzB;
                } else {
                    if (zzB3 == 1684103987) {
                        zzefVar2.zzh(zzg + 8);
                        zzahuVar.zzb = zzabv.zza(zzefVar2, Integer.toString(i4), str, zzpVar2);
                    } else if (zzB3 == 1684366131) {
                        zzefVar2.zzh(zzg + 8);
                        zzahuVar.zzb = zzabv.zzb(zzefVar2, Integer.toString(i4), str, zzpVar2);
                    } else if (zzB3 == 1684103988) {
                        zzefVar2.zzh(zzg + 8);
                        zzahuVar.zzb = zzaby.zza(zzefVar2, Integer.toString(i4), str, zzpVar2);
                    } else if (zzB3 != 1684892784) {
                        if (zzB3 == 1684305011 || zzB3 == 1969517683) {
                            i9 = zzB;
                            zzs zzsVar = new zzs();
                            zzsVar.zzb(i4);
                            zzsVar.zzm(str2);
                            zzsVar.zzE(zzt);
                            zzF = i22;
                            zzsVar.zzF(zzF);
                            zzsVar.zzq(zzpVar2);
                            zzsVar.zze(str);
                            zzahuVar.zzb = zzsVar.zzM();
                        } else {
                            if (zzB3 == 1682927731) {
                                int i24 = zzB2 - 8;
                                byte[] bArr3 = zzb;
                                int length = bArr3.length;
                                i9 = zzB;
                                byte[] copyOf = Arrays.copyOf(bArr3, length + i24);
                                zzefVar2.zzh(zzg + 8);
                                zzefVar2.zzm(copyOf, length, i24);
                                list = zzadr.zza(copyOf);
                            } else {
                                i9 = zzB;
                                if (zzB3 == 1684425825) {
                                    byte[] bArr4 = new byte[zzB2 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[i7] = 97;
                                    bArr4[3] = 67;
                                    zzefVar2.zzh(zzg + 12);
                                    zzefVar2.zzm(bArr4, 4, zzB2 - 12);
                                    list = zzgjz.zzj(bArr4);
                                } else if (zzB3 == 1634492771) {
                                    int i25 = zzB2 - 12;
                                    byte[] bArr5 = new byte[i25];
                                    zzefVar2.zzh(zzg + 12);
                                    zzefVar2.zzm(bArr5, 0, i25);
                                    int i26 = zzdc.zza;
                                    zzef zzefVar3 = new zzef(bArr5);
                                    zzefVar3.zzh(9);
                                    int zzs3 = zzefVar3.zzs();
                                    zzefVar3.zzh(20);
                                    Pair create = Pair.create(Integer.valueOf(zzefVar3.zzH()), Integer.valueOf(zzs3));
                                    int intValue = ((Integer) create.first).intValue();
                                    str3 = str4;
                                    i12 = i16;
                                    zzt = ((Integer) create.second).intValue();
                                    list = zzgjz.zzj(bArr5);
                                    zzF = intValue;
                                } else if (zzB3 == 1767990114) {
                                    zzefVar2.zzh(zzg + 9);
                                    int zza2 = zzgne.zza(zzefVar2.zzP());
                                    byte[] bArr6 = new byte[zza2];
                                    zzefVar2.zzm(bArr6, 0, zza2);
                                    str3 = zzdc.zza(bArr6);
                                    list = zzgjz.zzj(bArr6);
                                    zzF = i22;
                                    i12 = i16;
                                } else if (zzB3 == 1885564227) {
                                    zzefVar2.zzh(zzg + 12);
                                    ByteOrder byteOrder = (zzefVar2.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                    int zzs4 = zzefVar2.zzs();
                                    if (i16 == 1768973165) {
                                        i13 = zzeo.zzz(zzs4, byteOrder);
                                        i14 = -1;
                                    } else {
                                        if (i16 == 1718641517 && zzs4 == 32 && byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                                            i13 = 4;
                                            i14 = -1;
                                        }
                                        i13 = i21;
                                        i14 = -1;
                                    }
                                    str3 = str4;
                                    if (i13 != i14) {
                                        zzF = i22;
                                        i12 = i16;
                                        i21 = i13;
                                        str2 = MimeTypes.AUDIO_RAW;
                                    } else {
                                        zzF = i22;
                                        i12 = i16;
                                        i21 = i13;
                                    }
                                } else {
                                    zzF = i22;
                                }
                            }
                            str3 = str4;
                            zzF = i22;
                            i12 = i16;
                        }
                        i12 = i16;
                        str3 = str4;
                    } else {
                        if (zzB <= 0) {
                            StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 49);
                            sb.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                            sb.append(zzB);
                            throw zzas.zzb(sb.toString(), null);
                        }
                        str3 = str4;
                        i12 = i16;
                        zzF = zzB;
                        i9 = zzF;
                        zzt = i7;
                    }
                    zzF = i22;
                    i12 = i16;
                    i9 = zzB;
                    str3 = str4;
                }
                if (i10 != i11) {
                    zzahpVar = zzp(zzefVar2, i10);
                    String zza3 = zzahpVar.zza();
                    byte[] zzb2 = zzahpVar.zzb();
                    if (zzb2 == null) {
                        i12 = i16;
                    } else if (MimeTypes.AUDIO_VORBIS.equals(zza3)) {
                        zzef zzefVar4 = new zzef(zzb2);
                        zzefVar4.zzk(1);
                        int i27 = 0;
                        while (zzefVar4.zzd() > 0 && zzefVar4.zzn() == 255) {
                            zzefVar4.zzk(1);
                            i27 += 255;
                        }
                        int zzs5 = i27 + zzefVar4.zzs();
                        int i28 = 0;
                        while (true) {
                            if (zzefVar4.zzd() <= 0) {
                                i12 = i16;
                                break;
                            }
                            i12 = i16;
                            if (zzefVar4.zzn() != 255) {
                                break;
                            }
                            zzefVar4.zzk(1);
                            i28 += 255;
                            i16 = i12;
                        }
                        int zzs6 = i28 + zzefVar4.zzs();
                        byte[] bArr7 = new byte[zzs5];
                        int zzg3 = zzefVar4.zzg();
                        System.arraycopy(zzb2, zzg3, bArr7, 0, zzs5);
                        int i29 = zzg3 + zzs5 + zzs6;
                        int length2 = zzb2.length - i29;
                        byte[] bArr8 = new byte[length2];
                        System.arraycopy(zzb2, i29, bArr8, 0, length2);
                        list = zzgjz.zzk(bArr7, bArr8);
                    } else {
                        i12 = i16;
                        if (MimeTypes.AUDIO_AAC.equals(zza3)) {
                            zzabs zza4 = zzabt.zza(zzb2);
                            zzF = zza4.zza;
                            zzt = zza4.zzb;
                            str3 = zza4.zzc;
                        } else {
                            str3 = str4;
                        }
                        list = zzgjz.zzj(zzb2);
                        str2 = zza3;
                    }
                    str3 = str4;
                    str2 = zza3;
                }
                i12 = i16;
                str3 = str4;
            }
            zzg += zzB2;
            zzefVar2 = zzefVar;
            i17 = i3;
            zzB = i9;
            i16 = i12;
        }
        String str5 = str3;
        if (zzahuVar.zzb != null || str2 == null) {
            return;
        }
        zzs zzsVar2 = new zzs();
        zzsVar2.zzb(i4);
        zzsVar2.zzm(str2);
        zzsVar2.zzj(str5);
        zzsVar2.zzE(zzt);
        zzsVar2.zzF(zzF);
        zzsVar2.zzG(i21);
        zzsVar2.zzp(list);
        zzsVar2.zzq(zzpVar2);
        zzsVar2.zze(str);
        if (zzahpVar != null) {
            zzsVar2.zzh(zzgne.zzb(zzahpVar.zzc()));
            zzsVar2.zzi(zzgne.zzb(zzahpVar.zzd()));
        } else if (zzahnVar != null) {
            zzsVar2.zzh(zzgne.zzb(zzahnVar.zza()));
            zzsVar2.zzi(zzgne.zzb(zzahnVar.zzb()));
        }
        zzahuVar.zzb = zzsVar2.zzM();
    }

    private static zzahp zzp(zzef zzefVar, int i) {
        zzefVar.zzh(i + 12);
        zzefVar.zzk(1);
        zzs(zzefVar);
        zzefVar.zzk(2);
        int zzs = zzefVar.zzs();
        if ((zzs & 128) != 0) {
            zzefVar.zzk(2);
        }
        if ((zzs & 64) != 0) {
            zzefVar.zzk(zzefVar.zzs());
        }
        if ((zzs & 32) != 0) {
            zzefVar.zzk(2);
        }
        zzefVar.zzk(1);
        zzs(zzefVar);
        String zzf = zzar.zzf(zzefVar.zzs());
        if (MimeTypes.AUDIO_MPEG.equals(zzf) || MimeTypes.AUDIO_DTS.equals(zzf) || MimeTypes.AUDIO_DTS_HD.equals(zzf)) {
            return new zzahp(zzf, null, -1L, -1L);
        }
        zzefVar.zzk(4);
        long zzz = zzefVar.zzz();
        long zzz2 = zzefVar.zzz();
        zzefVar.zzk(1);
        int zzs2 = zzs(zzefVar);
        long j = zzz2;
        byte[] bArr = new byte[zzs2];
        zzefVar.zzm(bArr, 0, zzs2);
        if (j <= 0) {
            j = -1;
        }
        return new zzahp(zzf, bArr, j, zzz > 0 ? zzz : -1L);
    }

    private static zzahn zzq(zzef zzefVar, int i) {
        zzefVar.zzh(i + 8);
        zzefVar.zzk(4);
        return new zzahn(zzefVar.zzz(), zzefVar.zzz());
    }

    private static Pair zzr(zzef zzefVar, int i, int i2) throws zzas {
        Integer num;
        zzait zzaitVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int zzg = zzefVar.zzg();
        while (zzg - i < i2) {
            zzefVar.zzh(zzg);
            int zzB = zzefVar.zzB();
            zzacy.zza(zzB > 0, "childAtomSize must be positive");
            if (zzefVar.zzB() == 1936289382) {
                int i5 = zzg + 8;
                int i6 = 0;
                int i7 = -1;
                Integer num3 = null;
                String str = null;
                while (i5 - zzg < zzB) {
                    zzefVar.zzh(i5);
                    int zzB2 = zzefVar.zzB();
                    int zzB3 = zzefVar.zzB();
                    if (zzB3 == 1718775137) {
                        num3 = Integer.valueOf(zzefVar.zzB());
                    } else if (zzB3 == 1935894637) {
                        zzefVar.zzk(4);
                        str = zzefVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (zzB3 == 1935894633) {
                        i7 = i5;
                        i6 = zzB2;
                    }
                    i5 += zzB2;
                }
                byte[] bArr = null;
                if (C.CENC_TYPE_cenc.equals(str) || C.CENC_TYPE_cbc1.equals(str) || C.CENC_TYPE_cens.equals(str) || C.CENC_TYPE_cbcs.equals(str)) {
                    zzacy.zza(num3 != null, "frma atom is mandatory");
                    zzacy.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num3;
                            zzaitVar = null;
                            break;
                        }
                        zzefVar.zzh(i8);
                        int zzB4 = zzefVar.zzB();
                        if (zzefVar.zzB() == 1952804451) {
                            int zza2 = zza(zzefVar.zzB());
                            zzefVar.zzk(1);
                            if (zza2 == 0) {
                                zzefVar.zzk(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int zzs = zzefVar.zzs();
                                i3 = zzs & 15;
                                i4 = (zzs & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                            }
                            if (zzefVar.zzs() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int zzs2 = zzefVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzefVar.zzm(bArr2, 0, 16);
                            if (z && zzs2 == 0) {
                                int zzs3 = zzefVar.zzs();
                                byte[] bArr3 = new byte[zzs3];
                                zzefVar.zzm(bArr3, 0, zzs3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzaitVar = new zzait(z, str, zzs2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zzB4;
                        }
                    }
                    zzacy.zza(zzaitVar != null, "tenc atom is mandatory");
                    String str2 = zzeo.zza;
                    create = Pair.create(num, zzaitVar);
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

    private static int zzs(zzef zzefVar) {
        int zzs = zzefVar.zzs();
        int i = zzs & 127;
        while ((zzs & 128) == 128) {
            zzs = zzefVar.zzs();
            i = (i << 7) | (zzs & 127);
        }
        return i;
    }
}
