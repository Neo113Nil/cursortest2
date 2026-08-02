package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaff {
    private static final byte[] zza = zzen.zzaa("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r3 != 13) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzaew zzaewVar) {
        zzef zzefVar = zzaewVar.zza;
        zzefVar.zzF(8);
        zzbq zzbqVar = null;
        zzbq zzbqVar2 = null;
        while (zzefVar.zza() >= 8) {
            int zzc = zzefVar.zzc();
            int zze = zzefVar.zze();
            int zze2 = zzefVar.zze();
            if (zze2 == 1835365473) {
                zzefVar.zzF(zzc);
                int i = zzc + zze;
                zzefVar.zzG(8);
                zzd(zzefVar);
                while (true) {
                    if (zzefVar.zzc() >= i) {
                        break;
                    }
                    int zzc2 = zzefVar.zzc();
                    int zze3 = zzefVar.zze();
                    if (zzefVar.zze() == 1768715124) {
                        zzefVar.zzF(zzc2);
                        int i2 = zzc2 + zze3;
                        zzefVar.zzG(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzefVar.zzc() < i2) {
                            zzbp zza2 = zzafm.zza(zzefVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbqVar = new zzbq(arrayList);
                        }
                    } else {
                        zzefVar.zzF(zzc2 + zze3);
                    }
                }
                zzbqVar = null;
            } else if (zze2 == 1936553057) {
                zzefVar.zzF(zzc);
                int i3 = zzc + zze;
                zzefVar.zzG(12);
                while (true) {
                    if (zzefVar.zzc() >= i3) {
                        break;
                    }
                    int zzc3 = zzefVar.zzc();
                    int zze4 = zzefVar.zze();
                    if (zzefVar.zze() != 1935766900) {
                        zzefVar.zzF(zzc3 + zze4);
                    } else if (zze4 >= 14) {
                        zzefVar.zzG(5);
                        int zzk = zzefVar.zzk();
                        float f = 120.0f;
                        if (zzk == 12) {
                            if (zzk == 12) {
                                f = 240.0f;
                            }
                        }
                        zzefVar.zzG(1);
                        zzbqVar2 = new zzbq(-9223372036854775807L, new zzadw(f, zzefVar.zzk()));
                    }
                }
                zzbqVar2 = null;
            }
            zzefVar.zzF(zzc + zze);
        }
        return Pair.create(zzbqVar, zzbqVar2);
    }

    public static zzbq zzb(zzaev zzaevVar) {
        zzadq zzadqVar;
        zzaew zzb = zzaevVar.zzb(1751411826);
        zzaew zzb2 = zzaevVar.zzb(1801812339);
        zzaew zzb3 = zzaevVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzef zzefVar = zzb2.zza;
        zzefVar.zzF(12);
        int zze = zzefVar.zze();
        String[] strArr = new String[zze];
        for (int i = 0; i < zze; i++) {
            int zze2 = zzefVar.zze();
            zzefVar.zzG(4);
            strArr[i] = zzefVar.zzx(zze2 - 8, zzfsk.zzc);
        }
        zzef zzefVar2 = zzb3.zza;
        zzefVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzefVar2.zza() > 8) {
            int zzc = zzefVar2.zzc();
            int zze3 = zzefVar2.zze();
            int zze4 = zzefVar2.zze() - 1;
            if (zze4 < 0 || zze4 >= zze) {
                zzdw.zze("AtomParsers", "Skipped metadata with unknown key index: " + zze4);
            } else {
                String str = strArr[zze4];
                int i2 = zzc + zze3;
                int i3 = zzafm.zzb;
                while (true) {
                    int zzc2 = zzefVar2.zzc();
                    if (zzc2 >= i2) {
                        zzadqVar = null;
                        break;
                    }
                    int zze5 = zzefVar2.zze();
                    if (zzefVar2.zze() == 1684108385) {
                        int zze6 = zzefVar2.zze();
                        int zze7 = zzefVar2.zze();
                        int i4 = zze5 - 16;
                        byte[] bArr = new byte[i4];
                        zzefVar2.zzB(bArr, 0, i4);
                        zzadqVar = new zzadq(str, bArr, zze7, zze6);
                        break;
                    }
                    zzefVar2.zzF(zzc2 + zze5);
                }
                if (zzadqVar != null) {
                    arrayList.add(zzadqVar);
                }
            }
            zzefVar2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x00b6, code lost:
    
        if (r7 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0660, code lost:
    
        if (r1 != 3) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0756, code lost:
    
        if (r25 == null) goto L370;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b0f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0e06  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0b8b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzc(zzaev zzaevVar, zzzx zzzxVar, long j, zzx zzxVar, boolean z, boolean z2, zzfsm zzfsmVar) throws zzbu {
        int i;
        long j2;
        int i2;
        long j3;
        int i3;
        int i4;
        int zze;
        int i5;
        zzafb zzafbVar;
        ArrayList arrayList;
        String str;
        zzaev zzaevVar2;
        zzaev zza2;
        long[] jArr;
        long[] jArr2;
        zzafv zzafvVar;
        int i6;
        zzfsm zzfsmVar2;
        Pair zzh;
        String str2;
        int i7;
        zzaev zzaevVar3;
        zzafe zzafeVar;
        Pair pair;
        String str3;
        zzef zzefVar;
        zzafb zzafbVar2;
        zzx zzxVar2;
        int i8;
        String str4;
        int i9;
        int i10;
        int i11;
        int i12;
        float f;
        zzafb zzafbVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzafb zzafbVar4;
        long j4;
        long j5;
        int i19;
        int i20;
        int i21;
        boolean z3;
        int i22;
        boolean z4;
        int i23;
        int i24;
        float f2;
        zzafb zzafbVar5;
        byte[] bArr;
        boolean z5;
        byte[] bArr2;
        String str5;
        byte[] bArr3;
        String str6;
        List list;
        String str7;
        String str8;
        int i25;
        int i26;
        zzfvn zzfvnVar;
        long j6;
        long j7;
        zzafv zzafvVar2;
        ArrayList arrayList2;
        zzafa zzafdVar;
        zzaew zzaewVar;
        boolean z6;
        int i27;
        int i28;
        int i29;
        boolean z7;
        int i30;
        int i31;
        int i32;
        int i33;
        zzafv zzafvVar3;
        int i34;
        long[] jArr3;
        int i35;
        int[] iArr;
        long[] jArr4;
        int[] iArr2;
        int i36;
        long j8;
        long[] jArr5;
        int[] iArr3;
        int i37;
        zzef zzefVar2;
        zzef zzefVar3;
        int i38;
        long[] jArr6;
        int i39;
        zzafv zzafvVar4;
        zzafy zzafyVar;
        int[] iArr4;
        long[] jArr7;
        int[] iArr5;
        boolean z8;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        zzafy zzafyVar2;
        zzaev zzaevVar4 = zzaevVar;
        zzx zzxVar3 = zzxVar;
        ArrayList arrayList3 = new ArrayList();
        int i45 = 0;
        while (i45 < zzaevVar4.zzc.size()) {
            zzaev zzaevVar5 = (zzaev) zzaevVar4.zzc.get(i45);
            if (zzaevVar5.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i = i45;
            } else {
                zzaew zzb = zzaevVar4.zzb(1836476516);
                Objects.requireNonNull(zzb);
                zzaev zza3 = zzaevVar5.zza(1835297121);
                Objects.requireNonNull(zza3);
                zzaew zzb2 = zza3.zzb(1751411826);
                Objects.requireNonNull(zzb2);
                int zze2 = zze(zzg(zzb2.zza));
                i = i45;
                int i46 = -1;
                if (zze2 == -1) {
                    zzfsmVar2 = zzfsmVar;
                    str = "AtomParsers";
                    zzaevVar2 = zzaevVar5;
                    arrayList = arrayList3;
                } else {
                    zzaew zzb3 = zzaevVar5.zzb(1953196132);
                    Objects.requireNonNull(zzb3);
                    zzef zzefVar4 = zzb3.zza;
                    zzefVar4.zzF(8);
                    int zze3 = zzaex.zze(zzefVar4.zze());
                    zzefVar4.zzG(zze3 == 0 ? 8 : 16);
                    int zze4 = zzefVar4.zze();
                    zzefVar4.zzG(4);
                    int zzc = zzefVar4.zzc();
                    int i47 = zze3 != 0 ? 8 : 4;
                    int i48 = 0;
                    while (true) {
                        if (i48 >= i47) {
                            zzefVar4.zzG(i47);
                            break;
                        }
                        if (zzefVar4.zzH()[zzc + i48] != -1) {
                            j2 = zze3 == 0 ? zzefVar4.zzs() : zzefVar4.zzt();
                        } else {
                            i48++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzefVar4.zzG(16);
                    int zze5 = zzefVar4.zze();
                    int zze6 = zzefVar4.zze();
                    zzefVar4.zzG(4);
                    int zze7 = zzefVar4.zze();
                    int zze8 = zzefVar4.zze();
                    int i49 = 65536;
                    String str9 = "AtomParsers";
                    if (zze5 == 0) {
                        if (zze6 == 65536) {
                            if (zze7 != -65536) {
                                zze6 = 65536;
                            } else if (zze8 == 0) {
                                i2 = 90;
                                zzafe zzafeVar2 = new zzafe(zze4, j2, i2);
                                if (j == -9223372036854775807L) {
                                    j7 = zzafeVar2.zzb;
                                    j3 = j7;
                                } else {
                                    j3 = j;
                                }
                                zzef zzefVar5 = zzb.zza;
                                zzefVar5.zzF(8);
                                zzefVar5.zzG(zzaex.zze(zzefVar5.zze()) == 0 ? 8 : 16);
                                long zzs = zzefVar5.zzs();
                                long zzw = j3 != -9223372036854775807L ? zzen.zzw(j3, 1000000L, zzs) : -9223372036854775807L;
                                zzaev zza4 = zza3.zza(1835626086);
                                Objects.requireNonNull(zza4);
                                zzaev zza5 = zza4.zza(1937007212);
                                Objects.requireNonNull(zza5);
                                zzaew zzb4 = zza3.zzb(1835296868);
                                Objects.requireNonNull(zzb4);
                                Pair zzi = zzi(zzb4.zza);
                                zzaew zzb5 = zza5.zzb(1937011556);
                                Objects.requireNonNull(zzb5);
                                zzef zzefVar6 = zzb5.zza;
                                i3 = zzafeVar2.zza;
                                i4 = zzafeVar2.zzc;
                                String str10 = (String) zzi.second;
                                zzefVar6.zzF(12);
                                zze = zzefVar6.zze();
                                zzafb zzafbVar6 = new zzafb(zze);
                                i5 = 0;
                                while (i5 < zze) {
                                    ArrayList arrayList4 = arrayList3;
                                    int zzc2 = zzefVar6.zzc();
                                    int zze9 = zzefVar6.zze();
                                    zzzm.zzb(zze9 > 0, "childAtomSize must be positive");
                                    int zze10 = zzefVar6.zze();
                                    int i50 = zze;
                                    if (zze10 == 1635148593 || zze10 == 1635148595 || zze10 == 1701733238 || zze10 == 1831958048 || zze10 == 1836070006 || zze10 == 1752589105 || zze10 == 1751479857 || zze10 == 1932670515 || zze10 == 1211250227 || zze10 == 1987063864 || zze10 == 1987063865 || zze10 == 1635135537 || zze10 == 1685479798 || zze10 == 1685479729 || zze10 == 1685481573 || zze10 == 1685481521) {
                                        zzafb zzafbVar7 = zzafbVar6;
                                        str2 = str10;
                                        int i51 = i4;
                                        int i52 = i3;
                                        i7 = zze2;
                                        zzaevVar3 = zzaevVar5;
                                        zzafeVar = zzafeVar2;
                                        pair = zzi;
                                        str3 = str9;
                                        zzefVar = zzefVar6;
                                        zzefVar.zzF(zzc2 + 16);
                                        zzefVar.zzG(16);
                                        int zzo = zzefVar.zzo();
                                        int zzo2 = zzefVar.zzo();
                                        zzefVar.zzG(50);
                                        int zzc3 = zzefVar.zzc();
                                        if (zze10 == 1701733238) {
                                            Pair zzj = zzj(zzefVar, zzc2, zze9);
                                            if (zzj != null) {
                                                int intValue = ((Integer) zzj.first).intValue();
                                                if (zzxVar3 == null) {
                                                    zzafbVar2 = zzafbVar7;
                                                    zzxVar2 = null;
                                                } else {
                                                    zzxVar2 = zzxVar3.zzb(((zzafw) zzj.second).zzb);
                                                    zzafbVar2 = zzafbVar7;
                                                }
                                                zzafbVar2.zza[i5] = (zzafw) zzj.second;
                                                zze10 = intValue;
                                            } else {
                                                zzafbVar2 = zzafbVar7;
                                                zze10 = 1701733238;
                                                zzxVar2 = zzxVar3;
                                            }
                                            zzefVar.zzF(zzc3);
                                        } else {
                                            zzafbVar2 = zzafbVar7;
                                            zzxVar2 = zzxVar3;
                                        }
                                        if (zze10 == 1831958048) {
                                            int i53 = zze10;
                                            str4 = "video/mpeg";
                                            i8 = i53;
                                        } else {
                                            i8 = 1211250227;
                                            if (zze10 == 1211250227) {
                                                str4 = "video/3gpp";
                                            } else {
                                                i8 = zze10;
                                                str4 = null;
                                            }
                                        }
                                        i9 = i5;
                                        int i54 = zzc3;
                                        zzx zzxVar4 = zzxVar2;
                                        float f3 = 1.0f;
                                        String str11 = null;
                                        int i55 = -1;
                                        byte[] bArr4 = null;
                                        int i56 = -1;
                                        int i57 = -1;
                                        int i58 = -1;
                                        ByteBuffer byteBuffer = null;
                                        zzaez zzaezVar = null;
                                        List list2 = null;
                                        String str12 = str4;
                                        boolean z9 = false;
                                        while (true) {
                                            if (i54 - zzc2 >= zze9) {
                                                i10 = zze9;
                                                i11 = zzo;
                                                i12 = zzo2;
                                                f = f3;
                                                zzafbVar3 = zzafbVar2;
                                                i13 = i55;
                                                break;
                                            }
                                            zzefVar.zzF(i54);
                                            int zzc4 = zzefVar.zzc();
                                            int zze11 = zzefVar.zze();
                                            if (zze11 == 0) {
                                                i13 = i55;
                                                if (zzefVar.zzc() - zzc2 == zze9) {
                                                    i10 = zze9;
                                                    i11 = zzo;
                                                    i12 = zzo2;
                                                    f = f3;
                                                    zzafbVar3 = zzafbVar2;
                                                    break;
                                                }
                                                i19 = 0;
                                            } else {
                                                i13 = i55;
                                                i19 = zze11;
                                            }
                                            if (i19 > 0) {
                                                i20 = zze9;
                                                i21 = zzc2;
                                                z3 = true;
                                            } else {
                                                i20 = zze9;
                                                i21 = zzc2;
                                                z3 = false;
                                            }
                                            zzzm.zzb(z3, "childAtomSize must be positive");
                                            int zze12 = zzefVar.zze();
                                            if (zze12 == 1635148611) {
                                                zzzm.zzb(str12 == null, null);
                                                zzefVar.zzF(zzc4 + 8);
                                                zzyn zza6 = zzyn.zza(zzefVar);
                                                list = zza6.zza;
                                                zzafbVar2.zzc = zza6.zzb;
                                                if (!z9) {
                                                    f3 = zza6.zze;
                                                }
                                                str7 = zza6.zzf;
                                                str12 = "video/avc";
                                            } else if (zze12 == 1752589123) {
                                                zzzm.zzb(str12 == null, null);
                                                zzefVar.zzF(zzc4 + 8);
                                                zzzy zza7 = zzzy.zza(zzefVar);
                                                list = zza7.zza;
                                                zzafbVar2.zzc = zza7.zzb;
                                                if (!z9) {
                                                    f3 = zza7.zzc;
                                                }
                                                str7 = zza7.zzd;
                                                str12 = "video/hevc";
                                            } else {
                                                if (zze12 == 1685480259 || zze12 == 1685485123) {
                                                    i22 = i8;
                                                    z4 = z9;
                                                    i23 = zzo;
                                                    i24 = zzo2;
                                                    f2 = f3;
                                                    zzafbVar5 = zzafbVar2;
                                                    bArr = bArr4;
                                                    zzze zza8 = zzze.zza(zzefVar);
                                                    if (zza8 != null) {
                                                        str11 = zza8.zza;
                                                        str12 = "video/dolby-vision";
                                                    }
                                                } else {
                                                    if (zze12 == 1987076931) {
                                                        zzzm.zzb(str12 == null, null);
                                                        str6 = i8 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                    } else if (zze12 == 1635135811) {
                                                        zzzm.zzb(str12 == null, null);
                                                        str6 = "video/av01";
                                                    } else if (zze12 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = zzl();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(zzefVar.zzy());
                                                        byteBuffer2.putShort(zzefVar.zzy());
                                                        byteBuffer = byteBuffer2;
                                                        i22 = i8;
                                                        i23 = zzo;
                                                        i24 = zzo2;
                                                        zzafbVar5 = zzafbVar2;
                                                        i54 += i19;
                                                        zze9 = i20;
                                                        i55 = i13;
                                                        zzc2 = i21;
                                                        i8 = i22;
                                                        zzafbVar2 = zzafbVar5;
                                                        zzo2 = i24;
                                                        zzo = i23;
                                                    } else {
                                                        if (zze12 == 1835295606) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = zzl();
                                                            }
                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                            short zzy = zzefVar.zzy();
                                                            short zzy2 = zzefVar.zzy();
                                                            i22 = i8;
                                                            short zzy3 = zzefVar.zzy();
                                                            z4 = z9;
                                                            short zzy4 = zzefVar.zzy();
                                                            zzafbVar5 = zzafbVar2;
                                                            short zzy5 = zzefVar.zzy();
                                                            bArr = bArr4;
                                                            short zzy6 = zzefVar.zzy();
                                                            f2 = f3;
                                                            short zzy7 = zzefVar.zzy();
                                                            i24 = zzo2;
                                                            short zzy8 = zzefVar.zzy();
                                                            long zzs2 = zzefVar.zzs();
                                                            long zzs3 = zzefVar.zzs();
                                                            i23 = zzo;
                                                            byteBuffer3.position(1);
                                                            byteBuffer3.putShort(zzy5);
                                                            byteBuffer3.putShort(zzy6);
                                                            byteBuffer3.putShort(zzy);
                                                            byteBuffer3.putShort(zzy2);
                                                            byteBuffer3.putShort(zzy3);
                                                            byteBuffer3.putShort(zzy4);
                                                            byteBuffer3.putShort(zzy7);
                                                            byteBuffer3.putShort(zzy8);
                                                            byteBuffer3.putShort((short) (zzs2 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                            byteBuffer3.putShort((short) (zzs3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                                            byteBuffer = byteBuffer3;
                                                        } else {
                                                            i22 = i8;
                                                            z4 = z9;
                                                            i23 = zzo;
                                                            i24 = zzo2;
                                                            f2 = f3;
                                                            zzafbVar5 = zzafbVar2;
                                                            bArr = bArr4;
                                                            if (zze12 == 1681012275) {
                                                                zzzm.zzb(str12 == null, null);
                                                                str12 = "video/3gpp";
                                                            } else if (zze12 == 1702061171) {
                                                                zzzm.zzb(str12 == null, null);
                                                                zzaez zzk = zzk(zzefVar, zzc4);
                                                                str5 = zzk.zza;
                                                                bArr3 = zzk.zzb;
                                                                zzaezVar = zzk;
                                                                str12 = str5;
                                                                list2 = bArr3 != null ? zzfvn.zzp(bArr3) : list2;
                                                            } else if (zze12 == 1885434736) {
                                                                zzefVar.zzF(zzc4 + 8);
                                                                f3 = zzefVar.zzn() / zzefVar.zzn();
                                                                bArr4 = bArr;
                                                                z9 = true;
                                                                i54 += i19;
                                                                zze9 = i20;
                                                                i55 = i13;
                                                                zzc2 = i21;
                                                                i8 = i22;
                                                                zzafbVar2 = zzafbVar5;
                                                                zzo2 = i24;
                                                                zzo = i23;
                                                            } else if (zze12 == 1937126244) {
                                                                int i59 = zzc4 + 8;
                                                                while (true) {
                                                                    if (i59 - zzc4 >= i19) {
                                                                        bArr2 = null;
                                                                        break;
                                                                    }
                                                                    zzefVar.zzF(i59);
                                                                    int zze13 = zzefVar.zze();
                                                                    if (zzefVar.zze() == 1886547818) {
                                                                        bArr2 = Arrays.copyOfRange(zzefVar.zzH(), i59, zze13 + i59);
                                                                        break;
                                                                    }
                                                                    i59 += zze13;
                                                                }
                                                                bArr4 = bArr2;
                                                                z9 = z4;
                                                                f3 = f2;
                                                                i54 += i19;
                                                                zze9 = i20;
                                                                i55 = i13;
                                                                zzc2 = i21;
                                                                i8 = i22;
                                                                zzafbVar2 = zzafbVar5;
                                                                zzo2 = i24;
                                                                zzo = i23;
                                                            } else if (zze12 == 1936995172) {
                                                                int zzk2 = zzefVar.zzk();
                                                                int i60 = 3;
                                                                zzefVar.zzG(3);
                                                                if (zzk2 == 0) {
                                                                    int zzk3 = zzefVar.zzk();
                                                                    if (zzk3 == 0) {
                                                                        i60 = 0;
                                                                    } else if (zzk3 == 1) {
                                                                        i60 = 1;
                                                                    } else if (zzk3 == 2) {
                                                                        i60 = 2;
                                                                    }
                                                                    i13 = i60;
                                                                }
                                                                i60 = i13;
                                                                i13 = i60;
                                                            } else if (zze12 == 1668246642) {
                                                                int zze14 = zzefVar.zze();
                                                                if (zze14 == 1852009592 || zze14 == 1852009571) {
                                                                    int zzo3 = zzefVar.zzo();
                                                                    int zzo4 = zzefVar.zzo();
                                                                    zzefVar.zzG(2);
                                                                    if (i19 == 19) {
                                                                        i19 = 19;
                                                                        if ((zzefVar.zzk() & 128) != 0) {
                                                                            z5 = true;
                                                                            int zza9 = zzq.zza(zzo3);
                                                                            int i61 = true == z5 ? 2 : 1;
                                                                            i58 = zza9;
                                                                            i56 = zzq.zzb(zzo4);
                                                                            i57 = i61;
                                                                        }
                                                                    }
                                                                    z5 = false;
                                                                    int zza92 = zzq.zza(zzo3);
                                                                    if (true == z5) {
                                                                    }
                                                                    i58 = zza92;
                                                                    i56 = zzq.zzb(zzo4);
                                                                    i57 = i61;
                                                                } else {
                                                                    zzdw.zze(str3, "Unsupported color type: ".concat(zzaex.zzf(zze14)));
                                                                }
                                                            }
                                                        }
                                                        z9 = z4;
                                                        bArr4 = bArr;
                                                        f3 = f2;
                                                        i54 += i19;
                                                        zze9 = i20;
                                                        i55 = i13;
                                                        zzc2 = i21;
                                                        i8 = i22;
                                                        zzafbVar2 = zzafbVar5;
                                                        zzo2 = i24;
                                                        zzo = i23;
                                                    }
                                                    str12 = str6;
                                                    i22 = i8;
                                                    i23 = zzo;
                                                    i24 = zzo2;
                                                    zzafbVar5 = zzafbVar2;
                                                    i54 += i19;
                                                    zze9 = i20;
                                                    i55 = i13;
                                                    zzc2 = i21;
                                                    i8 = i22;
                                                    zzafbVar2 = zzafbVar5;
                                                    zzo2 = i24;
                                                    zzo = i23;
                                                }
                                                z9 = z4;
                                                bArr4 = bArr;
                                                f3 = f2;
                                                i54 += i19;
                                                zze9 = i20;
                                                i55 = i13;
                                                zzc2 = i21;
                                                i8 = i22;
                                                zzafbVar2 = zzafbVar5;
                                                zzo2 = i24;
                                                zzo = i23;
                                            }
                                            list2 = list;
                                            i22 = i8;
                                            i23 = zzo;
                                            i24 = zzo2;
                                            zzafbVar5 = zzafbVar2;
                                            str11 = str7;
                                            i54 += i19;
                                            zze9 = i20;
                                            i55 = i13;
                                            zzc2 = i21;
                                            i8 = i22;
                                            zzafbVar2 = zzafbVar5;
                                            zzo2 = i24;
                                            zzo = i23;
                                        }
                                        byte[] bArr5 = bArr4;
                                        i14 = zzc2;
                                        if (str12 == null) {
                                            i16 = i51;
                                            i15 = i52;
                                            zzafbVar4 = zzafbVar3;
                                        } else {
                                            zzad zzadVar = new zzad();
                                            i15 = i52;
                                            zzadVar.zzG(i15);
                                            zzadVar.zzS(str12);
                                            zzadVar.zzx(str11);
                                            zzadVar.zzX(i11);
                                            zzadVar.zzF(i12);
                                            zzadVar.zzP(f);
                                            i16 = i51;
                                            zzadVar.zzR(i16);
                                            zzadVar.zzQ(bArr5);
                                            zzadVar.zzV(i13);
                                            zzadVar.zzI(list2);
                                            zzadVar.zzB(zzxVar4);
                                            int i62 = i58;
                                            if (i62 == -1) {
                                                i18 = i57;
                                                i17 = i56;
                                                if (i18 == -1) {
                                                    if (i17 == -1) {
                                                    }
                                                }
                                            } else {
                                                i17 = i56;
                                                i18 = i57;
                                            }
                                            zzadVar.zzy(new zzq(i62, i18, i17, byteBuffer != null ? byteBuffer.array() : null));
                                            if (zzaezVar != null) {
                                                j4 = zzaezVar.zzc;
                                                zzadVar.zzv(zzfxs.zzc(j4));
                                                j5 = zzaezVar.zzd;
                                                zzadVar.zzO(zzfxs.zzc(j5));
                                            }
                                            zzafbVar4 = zzafbVar3;
                                            zzafbVar4.zzb = zzadVar.zzY();
                                        }
                                    } else if (zze10 == 1836069985 || zze10 == 1701733217 || zze10 == 1633889587 || zze10 == 1700998451 || zze10 == 1633889588 || zze10 == 1835823201 || zze10 == 1685353315 || zze10 == 1685353317 || zze10 == 1685353320 || zze10 == 1685353324 || zze10 == 1685353336 || zze10 == 1935764850 || zze10 == 1935767394 || zze10 == 1819304813 || zze10 == 1936684916 || zze10 == 1953984371 || zze10 == 778924082 || zze10 == 778924083 || zze10 == 1835557169 || zze10 == 1835560241 || zze10 == 1634492771 || zze10 == 1634492791 || zze10 == 1970037111 || zze10 == 1332770163 || zze10 == 1716281667) {
                                        int i63 = zze2;
                                        zzafb zzafbVar8 = zzafbVar6;
                                        str2 = str10;
                                        zzafeVar = zzafeVar2;
                                        pair = zzi;
                                        str3 = str9;
                                        i7 = i63;
                                        zzefVar = zzefVar6;
                                        zzaevVar3 = zzaevVar5;
                                        zzm(zzefVar6, zze10, zzc2, zze9, i3, str2, z2, zzxVar, zzafbVar8, i5);
                                        i10 = zze9;
                                        i14 = zzc2;
                                        zzafbVar4 = zzafbVar8;
                                        i16 = i4;
                                        i15 = i3;
                                        i9 = i5;
                                    } else {
                                        if (zze10 == 1414810956 || zze10 == 1954034535 || zze10 == 2004251764 || zze10 == 1937010800 || zze10 == 1664495672) {
                                            zzefVar6.zzF(zzc2 + 16);
                                            if (zze10 == 1414810956) {
                                                str8 = "application/ttml+xml";
                                            } else {
                                                if (zze10 == 1954034535) {
                                                    int i64 = zze9 - 16;
                                                    byte[] bArr6 = new byte[i64];
                                                    zzefVar6.zzB(bArr6, 0, i64);
                                                    i25 = i4;
                                                    i26 = zze2;
                                                    j6 = Long.MAX_VALUE;
                                                    zzfvnVar = zzfvn.zzp(bArr6);
                                                    str8 = "application/x-quicktime-tx3g";
                                                } else if (zze10 == 2004251764) {
                                                    str8 = "application/x-mp4-vtt";
                                                } else if (zze10 == 1937010800) {
                                                    str8 = "application/ttml+xml";
                                                    i25 = i4;
                                                    i26 = zze2;
                                                    zzfvnVar = null;
                                                    j6 = 0;
                                                } else {
                                                    zzafbVar6.zzd = 1;
                                                    str8 = "application/x-mp4-cea-608";
                                                }
                                                zzad zzadVar2 = new zzad();
                                                zzadVar2.zzG(i3);
                                                zzadVar2.zzS(str8);
                                                zzadVar2.zzK(str10);
                                                zzadVar2.zzW(j6);
                                                zzadVar2.zzI(zzfvnVar);
                                                zzafbVar6.zzb = zzadVar2.zzY();
                                                i9 = i5;
                                                i10 = zze9;
                                                zzafbVar4 = zzafbVar6;
                                                str2 = str10;
                                                i15 = i3;
                                                zzaevVar3 = zzaevVar5;
                                                i14 = zzc2;
                                                zzafeVar = zzafeVar2;
                                                pair = zzi;
                                                i7 = i26;
                                                str3 = str9;
                                                i16 = i25;
                                            }
                                            i25 = i4;
                                            i26 = zze2;
                                            j6 = Long.MAX_VALUE;
                                            zzfvnVar = null;
                                            zzad zzadVar22 = new zzad();
                                            zzadVar22.zzG(i3);
                                            zzadVar22.zzS(str8);
                                            zzadVar22.zzK(str10);
                                            zzadVar22.zzW(j6);
                                            zzadVar22.zzI(zzfvnVar);
                                            zzafbVar6.zzb = zzadVar22.zzY();
                                            i9 = i5;
                                            i10 = zze9;
                                            zzafbVar4 = zzafbVar6;
                                            str2 = str10;
                                            i15 = i3;
                                            zzaevVar3 = zzaevVar5;
                                            i14 = zzc2;
                                            zzafeVar = zzafeVar2;
                                            pair = zzi;
                                            i7 = i26;
                                            str3 = str9;
                                            i16 = i25;
                                        } else {
                                            if (zze10 == 1835365492) {
                                                zzn(zzefVar6, 1835365492, zzc2, i3, zzafbVar6);
                                            } else if (zze10 == 1667329389) {
                                                zzad zzadVar3 = new zzad();
                                                zzadVar3.zzG(i3);
                                                zzadVar3.zzS("application/x-camera-motion");
                                                zzafbVar6.zzb = zzadVar3.zzY();
                                            }
                                            i9 = i5;
                                            i10 = zze9;
                                            zzafbVar4 = zzafbVar6;
                                            str2 = str10;
                                            i16 = i4;
                                            i15 = i3;
                                            i7 = zze2;
                                            zzaevVar3 = zzaevVar5;
                                            i14 = zzc2;
                                            zzafeVar = zzafeVar2;
                                            pair = zzi;
                                            str3 = str9;
                                        }
                                        zzefVar = zzefVar6;
                                    }
                                    zzefVar.zzF(i14 + i10);
                                    i5 = i9 + 1;
                                    zzxVar3 = zzxVar;
                                    i3 = i15;
                                    i4 = i16;
                                    zzafbVar6 = zzafbVar4;
                                    str9 = str3;
                                    zzefVar6 = zzefVar;
                                    str10 = str2;
                                    zze2 = i7;
                                    zzi = pair;
                                    zzafeVar2 = zzafeVar;
                                    zze = i50;
                                    arrayList3 = arrayList4;
                                    zzaevVar5 = zzaevVar3;
                                }
                                zzafbVar = zzafbVar6;
                                int i65 = zze2;
                                arrayList = arrayList3;
                                zzafe zzafeVar3 = zzafeVar2;
                                Pair pair2 = zzi;
                                str = str9;
                                i46 = -1;
                                zzaevVar2 = zzaevVar5;
                                zza2 = zzaevVar2.zza(1701082227);
                                if (zza2 != null || (zzh = zzh(zza2)) == null) {
                                    jArr = null;
                                    jArr2 = null;
                                } else {
                                    jArr = (long[]) zzh.first;
                                    jArr2 = (long[]) zzh.second;
                                }
                                if (zzafbVar.zzb == null) {
                                    zzfsmVar2 = zzfsmVar;
                                } else {
                                    i6 = zzafeVar3.zza;
                                    zzafvVar = new zzafv(i6, i65, ((Long) pair2.first).longValue(), zzs, zzw, zzafbVar.zzb, zzafbVar.zzd, zzafbVar.zza, zzafbVar.zzc, jArr, jArr2);
                                    zzfsmVar2 = zzfsmVar;
                                    zzafvVar2 = (zzafv) zzfsmVar2.apply(zzafvVar);
                                    if (zzafvVar2 == null) {
                                        zzaev zza10 = zzaevVar2.zza(1835297121);
                                        Objects.requireNonNull(zza10);
                                        zzaev zza11 = zza10.zza(1835626086);
                                        Objects.requireNonNull(zza11);
                                        zzaev zza12 = zza11.zza(1937007212);
                                        Objects.requireNonNull(zza12);
                                        zzaew zzb6 = zza12.zzb(1937011578);
                                        if (zzb6 != null) {
                                            zzafdVar = new zzafc(zzb6, zzafvVar2.zzf);
                                        } else {
                                            zzaew zzb7 = zza12.zzb(1937013298);
                                            if (zzb7 == null) {
                                                throw zzbu.zza("Track has no sample table size information", null);
                                            }
                                            zzafdVar = new zzafd(zzb7);
                                        }
                                        int zzb8 = zzafdVar.zzb();
                                        if (zzb8 == 0) {
                                            zzafyVar = new zzafy(zzafvVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                        } else {
                                            zzaew zzb9 = zza12.zzb(1937007471);
                                            if (zzb9 == null) {
                                                zzaew zzb10 = zza12.zzb(1668232756);
                                                Objects.requireNonNull(zzb10);
                                                zzaewVar = zzb10;
                                                z6 = true;
                                            } else {
                                                zzaewVar = zzb9;
                                                z6 = false;
                                            }
                                            zzef zzefVar7 = zzaewVar.zza;
                                            zzaew zzb11 = zza12.zzb(1937011555);
                                            Objects.requireNonNull(zzb11);
                                            zzef zzefVar8 = zzb11.zza;
                                            zzaew zzb12 = zza12.zzb(1937011827);
                                            Objects.requireNonNull(zzb12);
                                            zzef zzefVar9 = zzb12.zza;
                                            zzaew zzb13 = zza12.zzb(1937011571);
                                            zzef zzefVar10 = zzb13 != null ? zzb13.zza : null;
                                            zzaew zzb14 = zza12.zzb(1668576371);
                                            zzef zzefVar11 = zzb14 != null ? zzb14.zza : null;
                                            zzaey zzaeyVar = new zzaey(zzefVar8, zzefVar7, z6);
                                            zzefVar9.zzF(12);
                                            int zzn = zzefVar9.zzn() + i46;
                                            int zzn2 = zzefVar9.zzn();
                                            int zzn3 = zzefVar9.zzn();
                                            if (zzefVar11 != null) {
                                                zzefVar11.zzF(12);
                                                i27 = zzefVar11.zzn();
                                            } else {
                                                i27 = 0;
                                            }
                                            if (zzefVar10 != null) {
                                                zzefVar10.zzF(12);
                                                i29 = zzefVar10.zzn();
                                                if (i29 > 0) {
                                                    i28 = zzefVar10.zzn() - 1;
                                                } else {
                                                    i28 = i46;
                                                    zzefVar10 = null;
                                                }
                                            } else {
                                                i28 = i46;
                                                i29 = 0;
                                            }
                                            int zza13 = zzafdVar.zza();
                                            String str13 = zzafvVar2.zzf.zzm;
                                            if (zza13 != i46 && (("audio/raw".equals(str13) || "audio/g711-mlaw".equals(str13) || "audio/g711-alaw".equals(str13)) && zzn == 0)) {
                                                if (i27 == 0 && i29 == 0) {
                                                    int i66 = zzaeyVar.zza;
                                                    long[] jArr8 = new long[i66];
                                                    int[] iArr6 = new int[i66];
                                                    while (zzaeyVar.zza()) {
                                                        int i67 = zzaeyVar.zzb;
                                                        jArr8[i67] = zzaeyVar.zzd;
                                                        iArr6[i67] = zzaeyVar.zzc;
                                                    }
                                                    long j9 = zzn3;
                                                    int i68 = 8192 / zza13;
                                                    int i69 = 0;
                                                    for (int i70 = 0; i70 < i66; i70++) {
                                                        i69 += zzen.zze(iArr6[i70], i68);
                                                    }
                                                    long[] jArr9 = new long[i69];
                                                    int[] iArr7 = new int[i69];
                                                    long[] jArr10 = new long[i69];
                                                    int[] iArr8 = new int[i69];
                                                    int i71 = 0;
                                                    int i72 = 0;
                                                    int i73 = 0;
                                                    int i74 = 0;
                                                    while (i71 < i66) {
                                                        int i75 = iArr6[i71];
                                                        long j10 = jArr8[i71];
                                                        int i76 = i66;
                                                        int i77 = i75;
                                                        while (i77 > 0) {
                                                            int min = Math.min(i68, i77);
                                                            jArr9[i74] = j10;
                                                            long[] jArr11 = jArr8;
                                                            int i78 = zza13 * min;
                                                            iArr7[i74] = i78;
                                                            i73 = Math.max(i73, i78);
                                                            jArr10[i74] = i72 * j9;
                                                            iArr8[i74] = 1;
                                                            j10 += iArr7[i74];
                                                            i72 += min;
                                                            i77 -= min;
                                                            i74++;
                                                            jArr8 = jArr11;
                                                            zza13 = zza13;
                                                        }
                                                        i71++;
                                                        i66 = i76;
                                                    }
                                                    long j11 = j9 * i72;
                                                    jArr5 = jArr9;
                                                    iArr2 = iArr8;
                                                    iArr3 = iArr7;
                                                    jArr4 = jArr10;
                                                    i36 = i73;
                                                    zzafvVar3 = zzafvVar2;
                                                    j8 = j11;
                                                    long zzw2 = zzen.zzw(j8, 1000000L, zzafvVar3.zzc);
                                                    jArr6 = zzafvVar3.zzh;
                                                    if (jArr6 != null) {
                                                        zzen.zzR(jArr4, 1000000L, zzafvVar3.zzc);
                                                        zzafyVar2 = new zzafy(zzafvVar3, jArr5, iArr3, i36, jArr4, iArr2, zzw2);
                                                    } else {
                                                        zzafv zzafvVar5 = zzafvVar3;
                                                        if (jArr6.length == 1 && zzafvVar5.zzb == 1 && jArr4.length >= 2) {
                                                            long[] jArr12 = zzafvVar5.zzi;
                                                            Objects.requireNonNull(jArr12);
                                                            long j12 = jArr12[0];
                                                            long zzw3 = j12 + zzen.zzw(jArr6[0], zzafvVar5.zzc, zzafvVar5.zzd);
                                                            i39 = zzb8;
                                                            zzafvVar4 = zzafvVar5;
                                                            if (zzo(jArr4, j8, j12, zzw3)) {
                                                                long zzw4 = zzen.zzw(j12 - jArr4[0], zzafvVar4.zzf.zzA, zzafvVar4.zzc);
                                                                long zzw5 = zzen.zzw(j8 - zzw3, zzafvVar4.zzf.zzA, zzafvVar4.zzc);
                                                                if (zzw4 == 0) {
                                                                    if (zzw5 != 0) {
                                                                        zzw4 = 0;
                                                                    }
                                                                }
                                                                if (zzw4 <= 2147483647L && zzw5 <= 2147483647L) {
                                                                    zzzxVar.zza = (int) zzw4;
                                                                    zzzxVar.zzb = (int) zzw5;
                                                                    zzen.zzR(jArr4, 1000000L, zzafvVar4.zzc);
                                                                    zzafyVar2 = new zzafy(zzafvVar4, jArr5, iArr3, i36, jArr4, iArr2, zzen.zzw(zzafvVar4.zzh[0], 1000000L, zzafvVar4.zzd));
                                                                }
                                                            }
                                                        } else {
                                                            i39 = zzb8;
                                                            zzafvVar4 = zzafvVar5;
                                                        }
                                                        long[] jArr13 = zzafvVar4.zzh;
                                                        int length = jArr13.length;
                                                        if (length == 1) {
                                                            if (jArr13[0] == 0) {
                                                                long[] jArr14 = zzafvVar4.zzi;
                                                                Objects.requireNonNull(jArr14);
                                                                long j13 = jArr14[0];
                                                                for (int i79 = 0; i79 < jArr4.length; i79++) {
                                                                    jArr4[i79] = zzen.zzw(jArr4[i79] - j13, 1000000L, zzafvVar4.zzc);
                                                                }
                                                                zzafyVar2 = new zzafy(zzafvVar4, jArr5, iArr3, i36, jArr4, iArr2, zzen.zzw(j8 - j13, 1000000L, zzafvVar4.zzc));
                                                            } else {
                                                                length = 1;
                                                            }
                                                        }
                                                        boolean z10 = zzafvVar4.zzb == 1;
                                                        int[] iArr9 = new int[length];
                                                        int[] iArr10 = new int[length];
                                                        long[] jArr15 = zzafvVar4.zzi;
                                                        Objects.requireNonNull(jArr15);
                                                        long[] jArr16 = jArr15;
                                                        int i80 = 0;
                                                        int i81 = 0;
                                                        int i82 = 0;
                                                        boolean z11 = false;
                                                        while (true) {
                                                            long[] jArr17 = zzafvVar4.zzh;
                                                            if (i80 >= jArr17.length) {
                                                                break;
                                                            }
                                                            long[] jArr18 = jArr5;
                                                            int[] iArr11 = iArr3;
                                                            long j14 = jArr16[i80];
                                                            if (j14 != -1) {
                                                                long j15 = jArr17[i80];
                                                                boolean z12 = z11;
                                                                i40 = i36;
                                                                int i83 = i81;
                                                                int i84 = i82;
                                                                long zzw6 = zzen.zzw(j15, zzafvVar4.zzc, zzafvVar4.zzd);
                                                                int i85 = 1;
                                                                iArr9[i80] = zzen.zzd(jArr4, j14, true, true);
                                                                iArr10[i80] = zzen.zzb(jArr4, j14 + zzw6, z10, false);
                                                                while (true) {
                                                                    i43 = iArr9[i80];
                                                                    i44 = iArr10[i80];
                                                                    if (i43 >= i44 || (iArr2[i43] & i85) != 0) {
                                                                        break;
                                                                    }
                                                                    iArr9[i80] = i43 + 1;
                                                                    i85 = 1;
                                                                }
                                                                i42 = i83 + (i44 - i43);
                                                                z8 = z12 | (i84 != i43);
                                                                i41 = i44;
                                                            } else {
                                                                z8 = z11;
                                                                i40 = i36;
                                                                i41 = i82;
                                                                i42 = i81;
                                                            }
                                                            i80++;
                                                            jArr5 = jArr18;
                                                            i81 = i42;
                                                            i82 = i41;
                                                            i36 = i40;
                                                            iArr3 = iArr11;
                                                            z11 = z8;
                                                        }
                                                        long[] jArr19 = jArr5;
                                                        int[] iArr12 = iArr3;
                                                        int i86 = i81;
                                                        int i87 = i36;
                                                        boolean z13 = z11 | (i86 != i39);
                                                        long[] jArr20 = z13 ? new long[i86] : jArr19;
                                                        int[] iArr13 = z13 ? new int[i86] : iArr12;
                                                        int i88 = true == z13 ? 0 : i87;
                                                        int[] iArr14 = z13 ? new int[i86] : iArr2;
                                                        long[] jArr21 = new long[i86];
                                                        int i89 = i88;
                                                        int i90 = 0;
                                                        int i91 = 0;
                                                        long j16 = 0;
                                                        while (i90 < zzafvVar4.zzh.length) {
                                                            long j17 = zzafvVar4.zzi[i90];
                                                            int i92 = iArr9[i90];
                                                            int i93 = iArr10[i90];
                                                            if (z13) {
                                                                iArr4 = iArr9;
                                                                int i94 = i93 - i92;
                                                                System.arraycopy(jArr19, i92, jArr20, i91, i94);
                                                                jArr7 = jArr19;
                                                                iArr5 = iArr12;
                                                                System.arraycopy(iArr5, i92, iArr13, i91, i94);
                                                                System.arraycopy(iArr2, i92, iArr14, i91, i94);
                                                            } else {
                                                                iArr4 = iArr9;
                                                                jArr7 = jArr19;
                                                                iArr5 = iArr12;
                                                            }
                                                            while (i92 < i93) {
                                                                int[] iArr15 = iArr10;
                                                                int[] iArr16 = iArr14;
                                                                long[] jArr22 = jArr4;
                                                                int[] iArr17 = iArr2;
                                                                long[] jArr23 = jArr20;
                                                                jArr21[i91] = zzen.zzw(j16, 1000000L, zzafvVar4.zzd) + zzen.zzw(Math.max(0L, jArr4[i92] - j17), 1000000L, zzafvVar4.zzc);
                                                                if (z13 && iArr13[i91] > i89) {
                                                                    i89 = iArr5[i92];
                                                                }
                                                                i91++;
                                                                i92++;
                                                                iArr10 = iArr15;
                                                                jArr4 = jArr22;
                                                                iArr2 = iArr17;
                                                                iArr14 = iArr16;
                                                                jArr20 = jArr23;
                                                            }
                                                            j16 += zzafvVar4.zzh[i90];
                                                            i90++;
                                                            iArr10 = iArr10;
                                                            jArr4 = jArr4;
                                                            iArr2 = iArr2;
                                                            iArr9 = iArr4;
                                                            jArr20 = jArr20;
                                                            iArr12 = iArr5;
                                                            jArr19 = jArr7;
                                                        }
                                                        zzafyVar = new zzafy(zzafvVar4, jArr20, iArr13, i89, jArr21, iArr14, zzen.zzw(j16, 1000000L, zzafvVar4.zzd));
                                                    }
                                                    zzafyVar = zzafyVar2;
                                                } else {
                                                    zzn = 0;
                                                }
                                            }
                                            long[] jArr24 = new long[zzb8];
                                            int[] iArr18 = new int[zzb8];
                                            long[] jArr25 = new long[zzb8];
                                            int i95 = i29;
                                            int[] iArr19 = new int[zzb8];
                                            int i96 = zzn2;
                                            int i97 = zzn3;
                                            int i98 = i27;
                                            int i99 = i28;
                                            int i100 = 0;
                                            int i101 = 0;
                                            int i102 = 0;
                                            int i103 = 0;
                                            long j18 = 0;
                                            long j19 = 0;
                                            int i104 = zzn;
                                            int i105 = 0;
                                            while (true) {
                                                if (i105 >= zzb8) {
                                                    break;
                                                }
                                                long j20 = j18;
                                                boolean z14 = true;
                                                while (true) {
                                                    if (i102 != 0) {
                                                        i37 = zzb8;
                                                        zzefVar2 = zzefVar9;
                                                        zzefVar3 = zzefVar10;
                                                        i38 = i102;
                                                        break;
                                                    }
                                                    z14 = zzaeyVar.zza();
                                                    if (!z14) {
                                                        i37 = zzb8;
                                                        zzefVar2 = zzefVar9;
                                                        zzefVar3 = zzefVar10;
                                                        i38 = 0;
                                                        break;
                                                    }
                                                    zzef zzefVar12 = zzefVar9;
                                                    long j21 = zzaeyVar.zzd;
                                                    i102 = zzaeyVar.zzc;
                                                    j20 = j21;
                                                    zzefVar9 = zzefVar12;
                                                    zzefVar10 = zzefVar10;
                                                    zzb8 = zzb8;
                                                }
                                                if (!z14) {
                                                    zzdw.zze(str, "Unexpected end of chunk data");
                                                    jArr24 = Arrays.copyOf(jArr24, i105);
                                                    iArr18 = Arrays.copyOf(iArr18, i105);
                                                    jArr25 = Arrays.copyOf(jArr25, i105);
                                                    iArr19 = Arrays.copyOf(iArr19, i105);
                                                    zzb8 = i105;
                                                    break;
                                                }
                                                if (zzefVar11 != null) {
                                                    while (true) {
                                                        if (i103 != 0) {
                                                            break;
                                                        }
                                                        if (i98 <= 0) {
                                                            i103 = 0;
                                                            break;
                                                        }
                                                        i103 = zzefVar11.zzn();
                                                        i101 = zzefVar11.zze();
                                                        i98--;
                                                    }
                                                    i103--;
                                                }
                                                jArr24[i105] = j20;
                                                int zzc5 = zzafdVar.zzc();
                                                iArr18[i105] = zzc5;
                                                if (zzc5 > i100) {
                                                    i100 = zzc5;
                                                }
                                                jArr25[i105] = j19 + i101;
                                                iArr19[i105] = zzefVar3 == null ? 1 : 0;
                                                if (i105 == i99) {
                                                    iArr19[i105] = 1;
                                                    i95--;
                                                    if (i95 > 0) {
                                                        Objects.requireNonNull(zzefVar3);
                                                        i99 = zzefVar3.zzn() - 1;
                                                    }
                                                }
                                                j19 += i97;
                                                int i106 = i96 - 1;
                                                if (i106 != 0) {
                                                    i96 = i106;
                                                } else if (i104 > 0) {
                                                    i104--;
                                                    i96 = zzefVar2.zzn();
                                                    i97 = zzefVar2.zze();
                                                } else {
                                                    i96 = 0;
                                                }
                                                long j22 = j20 + iArr18[i105];
                                                i102 = i38 - 1;
                                                i105++;
                                                zzb8 = i37;
                                                zzefVar9 = zzefVar2;
                                                j18 = j22;
                                                zzefVar10 = zzefVar3;
                                            }
                                            long j23 = j19 + i101;
                                            if (zzefVar11 != null) {
                                                while (i98 > 0) {
                                                    if (zzefVar11.zzn() != 0) {
                                                        z7 = false;
                                                        break;
                                                    }
                                                    zzefVar11.zze();
                                                    i98--;
                                                }
                                            }
                                            z7 = true;
                                            if (i95 != 0) {
                                                i30 = i104;
                                                i31 = i95;
                                                i32 = i96;
                                                i33 = i102;
                                                zzafvVar3 = zzafvVar2;
                                                i34 = i103;
                                            } else if (i96 != 0) {
                                                i30 = i104;
                                                i32 = i96;
                                                i33 = i102;
                                                zzafvVar3 = zzafvVar2;
                                                i34 = i103;
                                                i31 = 0;
                                            } else if (i102 != 0) {
                                                i30 = i104;
                                                i33 = i102;
                                                zzafvVar3 = zzafvVar2;
                                                i34 = i103;
                                                i31 = 0;
                                                i32 = 0;
                                            } else if (i104 == 0) {
                                                if (i103 != 0) {
                                                    jArr3 = jArr24;
                                                    zzafvVar3 = zzafvVar2;
                                                    i34 = i103;
                                                    i31 = 0;
                                                    i32 = 0;
                                                    i33 = 0;
                                                    i30 = 0;
                                                } else if (z7) {
                                                    jArr3 = jArr24;
                                                    iArr = iArr18;
                                                    i35 = zzb8;
                                                    zzafvVar3 = zzafvVar2;
                                                    jArr4 = jArr25;
                                                    iArr2 = iArr19;
                                                    i36 = i100;
                                                    j8 = j23;
                                                    jArr5 = jArr3;
                                                    iArr3 = iArr;
                                                    zzb8 = i35;
                                                    long zzw22 = zzen.zzw(j8, 1000000L, zzafvVar3.zzc);
                                                    jArr6 = zzafvVar3.zzh;
                                                    if (jArr6 != null) {
                                                    }
                                                    zzafyVar = zzafyVar2;
                                                } else {
                                                    jArr3 = jArr24;
                                                    zzafvVar3 = zzafvVar2;
                                                    z7 = false;
                                                    i31 = 0;
                                                    i32 = 0;
                                                    i33 = 0;
                                                    i30 = 0;
                                                    i34 = 0;
                                                }
                                                int i107 = zzafvVar3.zza;
                                                iArr = iArr18;
                                                String str14 = true == z7 ? ", ctts invalid" : "";
                                                StringBuilder sb = new StringBuilder();
                                                i35 = zzb8;
                                                sb.append("Inconsistent stbl box for track ");
                                                sb.append(i107);
                                                sb.append(": remainingSynchronizationSamples ");
                                                sb.append(i31);
                                                sb.append(", remainingSamplesAtTimestampDelta ");
                                                sb.append(i32);
                                                sb.append(", remainingSamplesInChunk ");
                                                sb.append(i33);
                                                sb.append(", remainingTimestampDeltaChanges ");
                                                sb.append(i30);
                                                sb.append(", remainingSamplesAtTimestampOffset ");
                                                sb.append(i34);
                                                sb.append(str14);
                                                zzdw.zze(str, sb.toString());
                                                jArr4 = jArr25;
                                                iArr2 = iArr19;
                                                i36 = i100;
                                                j8 = j23;
                                                jArr5 = jArr3;
                                                iArr3 = iArr;
                                                zzb8 = i35;
                                                long zzw222 = zzen.zzw(j8, 1000000L, zzafvVar3.zzc);
                                                jArr6 = zzafvVar3.zzh;
                                                if (jArr6 != null) {
                                                }
                                                zzafyVar = zzafyVar2;
                                            } else {
                                                i30 = i104;
                                                zzafvVar3 = zzafvVar2;
                                                i34 = i103;
                                                i31 = 0;
                                                i32 = 0;
                                                i33 = 0;
                                            }
                                            jArr3 = jArr24;
                                            int i1072 = zzafvVar3.zza;
                                            iArr = iArr18;
                                            if (true == z7) {
                                            }
                                            StringBuilder sb2 = new StringBuilder();
                                            i35 = zzb8;
                                            sb2.append("Inconsistent stbl box for track ");
                                            sb2.append(i1072);
                                            sb2.append(": remainingSynchronizationSamples ");
                                            sb2.append(i31);
                                            sb2.append(", remainingSamplesAtTimestampDelta ");
                                            sb2.append(i32);
                                            sb2.append(", remainingSamplesInChunk ");
                                            sb2.append(i33);
                                            sb2.append(", remainingTimestampDeltaChanges ");
                                            sb2.append(i30);
                                            sb2.append(", remainingSamplesAtTimestampOffset ");
                                            sb2.append(i34);
                                            sb2.append(str14);
                                            zzdw.zze(str, sb2.toString());
                                            jArr4 = jArr25;
                                            iArr2 = iArr19;
                                            i36 = i100;
                                            j8 = j23;
                                            jArr5 = jArr3;
                                            iArr3 = iArr;
                                            zzb8 = i35;
                                            long zzw2222 = zzen.zzw(j8, 1000000L, zzafvVar3.zzc);
                                            jArr6 = zzafvVar3.zzh;
                                            if (jArr6 != null) {
                                            }
                                            zzafyVar = zzafyVar2;
                                        }
                                        arrayList2 = arrayList;
                                        arrayList2.add(zzafyVar);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                }
                            } else {
                                zze6 = 65536;
                                zze7 = -65536;
                            }
                        }
                        zze5 = 0;
                    }
                    if (zze5 == 0) {
                        if (zze6 == -65536) {
                            if (zze7 != 65536) {
                                zze6 = -65536;
                            } else if (zze8 == 0) {
                                i2 = 270;
                                zzafe zzafeVar22 = new zzafe(zze4, j2, i2);
                                if (j == -9223372036854775807L) {
                                }
                                zzef zzefVar52 = zzb.zza;
                                zzefVar52.zzF(8);
                                zzefVar52.zzG(zzaex.zze(zzefVar52.zze()) == 0 ? 8 : 16);
                                long zzs4 = zzefVar52.zzs();
                                if (j3 != -9223372036854775807L) {
                                }
                                zzaev zza42 = zza3.zza(1835626086);
                                Objects.requireNonNull(zza42);
                                zzaev zza52 = zza42.zza(1937007212);
                                Objects.requireNonNull(zza52);
                                zzaew zzb42 = zza3.zzb(1835296868);
                                Objects.requireNonNull(zzb42);
                                Pair zzi2 = zzi(zzb42.zza);
                                zzaew zzb52 = zza52.zzb(1937011556);
                                Objects.requireNonNull(zzb52);
                                zzef zzefVar62 = zzb52.zza;
                                i3 = zzafeVar22.zza;
                                i4 = zzafeVar22.zzc;
                                String str102 = (String) zzi2.second;
                                zzefVar62.zzF(12);
                                zze = zzefVar62.zze();
                                zzafb zzafbVar62 = new zzafb(zze);
                                i5 = 0;
                                while (i5 < zze) {
                                }
                                zzafbVar = zzafbVar62;
                                int i652 = zze2;
                                arrayList = arrayList3;
                                zzafe zzafeVar32 = zzafeVar22;
                                Pair pair22 = zzi2;
                                str = str9;
                                i46 = -1;
                                zzaevVar2 = zzaevVar5;
                                zza2 = zzaevVar2.zza(1701082227);
                                if (zza2 != null) {
                                }
                                jArr = null;
                                jArr2 = null;
                                if (zzafbVar.zzb == null) {
                                }
                            } else {
                                zze6 = -65536;
                                zze5 = 0;
                            }
                        }
                        i49 = zze7;
                        zze5 = 0;
                    } else {
                        i49 = zze7;
                    }
                    i2 = (zze5 == -65536 && zze6 == 0 && i49 == 0 && zze8 == -65536) ? 180 : 0;
                    zzafe zzafeVar222 = new zzafe(zze4, j2, i2);
                    if (j == -9223372036854775807L) {
                    }
                    zzef zzefVar522 = zzb.zza;
                    zzefVar522.zzF(8);
                    zzefVar522.zzG(zzaex.zze(zzefVar522.zze()) == 0 ? 8 : 16);
                    long zzs42 = zzefVar522.zzs();
                    if (j3 != -9223372036854775807L) {
                    }
                    zzaev zza422 = zza3.zza(1835626086);
                    Objects.requireNonNull(zza422);
                    zzaev zza522 = zza422.zza(1937007212);
                    Objects.requireNonNull(zza522);
                    zzaew zzb422 = zza3.zzb(1835296868);
                    Objects.requireNonNull(zzb422);
                    Pair zzi22 = zzi(zzb422.zza);
                    zzaew zzb522 = zza522.zzb(1937011556);
                    Objects.requireNonNull(zzb522);
                    zzef zzefVar622 = zzb522.zza;
                    i3 = zzafeVar222.zza;
                    i4 = zzafeVar222.zzc;
                    String str1022 = (String) zzi22.second;
                    zzefVar622.zzF(12);
                    zze = zzefVar622.zze();
                    zzafb zzafbVar622 = new zzafb(zze);
                    i5 = 0;
                    while (i5 < zze) {
                    }
                    zzafbVar = zzafbVar622;
                    int i6522 = zze2;
                    arrayList = arrayList3;
                    zzafe zzafeVar322 = zzafeVar222;
                    Pair pair222 = zzi22;
                    str = str9;
                    i46 = -1;
                    zzaevVar2 = zzaevVar5;
                    zza2 = zzaevVar2.zza(1701082227);
                    if (zza2 != null) {
                    }
                    jArr = null;
                    jArr2 = null;
                    if (zzafbVar.zzb == null) {
                    }
                }
                zzafvVar = null;
                zzafvVar2 = (zzafv) zzfsmVar2.apply(zzafvVar);
                if (zzafvVar2 == null) {
                }
            }
            i45 = i + 1;
            zzxVar3 = zzxVar;
            arrayList3 = arrayList2;
            zzaevVar4 = zzaevVar;
        }
        return arrayList3;
    }

    public static void zzd(zzef zzefVar) {
        int zzc = zzefVar.zzc();
        zzefVar.zzG(4);
        if (zzefVar.zze() != 1751411826) {
            zzc += 4;
        }
        zzefVar.zzF(zzc);
    }

    private static int zze(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzef zzefVar) {
        int zzk = zzefVar.zzk();
        int i = zzk & WorkQueueKt.MASK;
        while ((zzk & 128) == 128) {
            zzk = zzefVar.zzk();
            i = (i << 7) | (zzk & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzg(zzef zzefVar) {
        zzefVar.zzF(16);
        return zzefVar.zze();
    }

    private static Pair zzh(zzaev zzaevVar) {
        zzaew zzb = zzaevVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzef zzefVar = zzb.zza;
        zzefVar.zzF(8);
        int zze = zzaex.zze(zzefVar.zze());
        int zzn = zzefVar.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        for (int i = 0; i < zzn; i++) {
            jArr[i] = zze == 1 ? zzefVar.zzt() : zzefVar.zzs();
            jArr2[i] = zze == 1 ? zzefVar.zzr() : zzefVar.zze();
            if (zzefVar.zzy() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzefVar.zzG(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzef zzefVar) {
        zzefVar.zzF(8);
        int zze = zzaex.zze(zzefVar.zze());
        zzefVar.zzG(zze == 0 ? 8 : 16);
        long zzs = zzefVar.zzs();
        zzefVar.zzG(zze == 0 ? 4 : 8);
        int zzo = zzefVar.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzo >> 10) & 31) + 96));
        sb.append((char) (((zzo >> 5) & 31) + 96));
        sb.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb.toString());
    }

    private static Pair zzj(zzef zzefVar, int i, int i2) throws zzbu {
        Integer num;
        zzafw zzafwVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzc = zzefVar.zzc();
        while (zzc - i < i2) {
            zzefVar.zzF(zzc);
            int zze = zzefVar.zze();
            zzzm.zzb(zze > 0, "childAtomSize must be positive");
            if (zzefVar.zze() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = 0;
                int i7 = -1;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zze) {
                    zzefVar.zzF(i5);
                    int zze2 = zzefVar.zze();
                    int zze3 = zzefVar.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzefVar.zze());
                    } else if (zze3 == 1935894637) {
                        zzefVar.zzG(4);
                        str = zzefVar.zzx(4, zzfsk.zzc);
                    } else if (zze3 == 1935894633) {
                        i7 = i5;
                        i6 = zze2;
                    }
                    i5 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzzm.zzb(num2 != null, "frma atom is mandatory");
                    zzzm.zzb(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            num = num2;
                            zzafwVar = null;
                            break;
                        }
                        zzefVar.zzF(i8);
                        int zze4 = zzefVar.zze();
                        if (zzefVar.zze() == 1952804451) {
                            int zze5 = zzefVar.zze();
                            zzefVar.zzG(1);
                            if (zzaex.zze(zze5) == 0) {
                                zzefVar.zzG(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzk = zzefVar.zzk();
                                int i9 = (zzk & 240) >> 4;
                                i3 = zzk & 15;
                                i4 = i9;
                            }
                            boolean z = zzefVar.zzk() == 1;
                            int zzk2 = zzefVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzefVar.zzB(bArr2, 0, 16);
                            if (z && zzk2 == 0) {
                                int zzk3 = zzefVar.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzefVar.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzafwVar = new zzafw(z, str, zzk2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zze4;
                        }
                    }
                    zzzm.zzb(zzafwVar != null, "tenc atom is mandatory");
                    int i10 = zzen.zza;
                    create = Pair.create(num, zzafwVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zze;
        }
        return null;
    }

    private static zzaez zzk(zzef zzefVar, int i) {
        zzefVar.zzF(i + 12);
        zzefVar.zzG(1);
        zzf(zzefVar);
        zzefVar.zzG(2);
        int zzk = zzefVar.zzk();
        if ((zzk & 128) != 0) {
            zzefVar.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzefVar.zzG(zzefVar.zzk());
        }
        if ((zzk & 32) != 0) {
            zzefVar.zzG(2);
        }
        zzefVar.zzG(1);
        zzf(zzefVar);
        String zzd = zzbt.zzd(zzefVar.zzk());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzaez(zzd, null, -1L, -1L);
        }
        zzefVar.zzG(4);
        long zzs = zzefVar.zzs();
        long zzs2 = zzefVar.zzs();
        zzefVar.zzG(1);
        int zzf = zzf(zzefVar);
        byte[] bArr = new byte[zzf];
        zzefVar.zzB(bArr, 0, zzf);
        return new zzaez(zzd, bArr, zzs2 <= 0 ? -1L : zzs2, zzs > 0 ? zzs : -1L);
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzm(zzef zzefVar, int i, int i2, int i3, int i4, String str, boolean z, zzx zzxVar, zzafb zzafbVar, int i5) throws zzbu {
        int i6;
        int zzl;
        int zze;
        int i7;
        int i8;
        long j;
        long j2;
        int i9;
        int i10;
        int i11;
        byte[] bArr;
        int i12;
        String str2;
        boolean z2;
        boolean z3;
        int i13 = i2;
        int i14 = i3;
        zzx zzxVar2 = zzxVar;
        zzefVar.zzF(i13 + 16);
        if (z) {
            i6 = zzefVar.zzo();
            zzefVar.zzG(6);
        } else {
            zzefVar.zzG(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzo = zzefVar.zzo();
            zzefVar.zzG(6);
            zzl = zzefVar.zzl();
            zzefVar.zzF(zzefVar.zzc() - 4);
            zze = zzefVar.zze();
            if (i6 == 1) {
                zzefVar.zzG(16);
            }
            i7 = zzo;
        } else {
            if (i6 != 2) {
                return;
            }
            zzefVar.zzG(16);
            zzl = (int) Math.round(Double.longBitsToDouble(zzefVar.zzr()));
            i7 = zzefVar.zzn();
            zzefVar.zzG(20);
            zze = 0;
        }
        int zzc = zzefVar.zzc();
        int i15 = 1701733217;
        int i16 = i;
        if (i16 == 1701733217) {
            Pair zzj = zzj(zzefVar, i13, i14);
            if (zzj != null) {
                i15 = ((Integer) zzj.first).intValue();
                zzxVar2 = zzxVar2 == null ? null : zzxVar2.zzb(((zzafw) zzj.second).zzb);
                zzafbVar.zza[i5] = (zzafw) zzj.second;
            }
            zzefVar.zzF(zzc);
            i16 = i15;
        }
        String str3 = "audio/raw";
        if (i16 == 1633889587) {
            str3 = "audio/ac3";
        } else if (i16 == 1700998451) {
            str3 = "audio/eac3";
        } else if (i16 == 1633889588) {
            str3 = "audio/ac4";
        } else if (i16 == 1685353315) {
            str3 = "audio/vnd.dts";
        } else if (i16 == 1685353320 || i16 == 1685353324) {
            str3 = "audio/vnd.dts.hd";
        } else if (i16 == 1685353317) {
            str3 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i16 == 1685353336) {
            str3 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i16 == 1935764850) {
            str3 = "audio/3gpp";
        } else {
            if (i16 != 1935767394) {
                if (i16 == 1819304813 || i16 == 1936684916) {
                    i8 = 2;
                } else if (i16 == 1953984371) {
                    i8 = 268435456;
                } else if (i16 == 778924082 || i16 == 778924083) {
                    str3 = "audio/mpeg";
                } else if (i16 == 1835557169) {
                    str3 = "audio/mha1";
                } else if (i16 == 1835560241) {
                    str3 = "audio/mhm1";
                } else if (i16 == 1634492771) {
                    str3 = "audio/alac";
                } else if (i16 == 1634492791) {
                    str3 = "audio/g711-alaw";
                } else if (i16 == 1970037111) {
                    str3 = "audio/g711-mlaw";
                } else if (i16 == 1332770163) {
                    str3 = "audio/opus";
                } else if (i16 == 1716281667) {
                    str3 = "audio/flac";
                } else if (i16 == 1835823201) {
                    str3 = "audio/true-hd";
                } else {
                    i8 = -1;
                    str3 = null;
                }
                String str4 = str3;
                zzaez zzaezVar = null;
                String str5 = null;
                List list = null;
                while (zzc - i13 < i14) {
                    zzefVar.zzF(zzc);
                    int zze2 = zzefVar.zze();
                    String str6 = "childAtomSize must be positive";
                    zzzm.zzb(zze2 > 0, "childAtomSize must be positive");
                    int zze3 = zzefVar.zze();
                    if (zze3 == 1835557187) {
                        int i17 = zze2 - 13;
                        byte[] bArr2 = new byte[i17];
                        zzefVar.zzF(zzc + 13);
                        zzefVar.zzB(bArr2, 0, i17);
                        list = zzfvn.zzp(bArr2);
                        i9 = i8;
                    } else {
                        if (zze3 == 1702061171) {
                            i9 = i8;
                            i10 = zzc;
                            i11 = -1;
                        } else if (z && zze3 == 2002876005) {
                            int zzc2 = zzefVar.zzc();
                            if (zzc2 >= zzc) {
                                i12 = zzc2;
                                str2 = null;
                                z2 = true;
                            } else {
                                i12 = zzc2;
                                str2 = null;
                                z2 = false;
                            }
                            zzzm.zzb(z2, str2);
                            i10 = i12;
                            while (true) {
                                if (i10 - zzc >= zze2) {
                                    i9 = i8;
                                    i11 = -1;
                                    i10 = -1;
                                    break;
                                }
                                zzefVar.zzF(i10);
                                int zze4 = zzefVar.zze();
                                if (zze4 > 0) {
                                    i9 = i8;
                                    z3 = true;
                                } else {
                                    i9 = i8;
                                    z3 = false;
                                }
                                zzzm.zzb(z3, str6);
                                String str7 = str6;
                                if (zzefVar.zze() == 1702061171) {
                                    i11 = -1;
                                    break;
                                } else {
                                    i10 += zze4;
                                    i8 = i9;
                                    str6 = str7;
                                }
                            }
                        } else {
                            i9 = i8;
                            if (zze3 == 1684103987) {
                                zzefVar.zzF(zzc + 8);
                                zzafbVar.zzb = zzyj.zzc(zzefVar, Integer.toString(i4), str, zzxVar2);
                            } else if (zze3 == 1684366131) {
                                zzefVar.zzF(zzc + 8);
                                zzafbVar.zzb = zzyj.zzd(zzefVar, Integer.toString(i4), str, zzxVar2);
                            } else if (zze3 == 1684103988) {
                                zzefVar.zzF(zzc + 8);
                                String num = Integer.toString(i4);
                                int i18 = zzym.zza;
                                zzefVar.zzG(1);
                                int i19 = 1 != ((zzefVar.zzk() & 32) >> 5) ? 44100 : 48000;
                                zzad zzadVar = new zzad();
                                zzadVar.zzH(num);
                                zzadVar.zzS("audio/ac4");
                                zzadVar.zzw(2);
                                zzadVar.zzT(i19);
                                zzadVar.zzB(zzxVar2);
                                zzadVar.zzK(str);
                                zzafbVar.zzb = zzadVar.zzY();
                            } else if (zze3 == 1684892784) {
                                if (zze <= 0) {
                                    throw zzbu.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + zze, null);
                                }
                                zzl = zze;
                                i7 = 2;
                            } else if (zze3 == 1684305011) {
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzG(i4);
                                zzadVar2.zzS(str4);
                                zzadVar2.zzw(i7);
                                zzadVar2.zzT(zzl);
                                zzadVar2.zzB(zzxVar2);
                                zzadVar2.zzK(str);
                                zzafbVar.zzb = zzadVar2.zzY();
                            } else if (zze3 == 1682927731) {
                                int i20 = zze2 - 8;
                                byte[] bArr3 = zza;
                                byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i20);
                                zzefVar.zzF(zzc + 8);
                                zzefVar.zzB(copyOf, bArr3.length, i20);
                                list = zzaag.zza(copyOf);
                            } else {
                                if (zze3 == 1684425825) {
                                    int i21 = zze2 - 12;
                                    byte[] bArr4 = new byte[i21 + 4];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    zzefVar.zzF(zzc + 12);
                                    zzefVar.zzB(bArr4, 4, i21);
                                    list = zzfvn.zzp(bArr4);
                                } else if (zze3 == 1634492771) {
                                    int i22 = zze2 - 12;
                                    byte[] bArr5 = new byte[i22];
                                    zzefVar.zzF(zzc + 12);
                                    zzefVar.zzB(bArr5, 0, i22);
                                    zzef zzefVar2 = new zzef(bArr5);
                                    zzefVar2.zzF(9);
                                    int zzk = zzefVar2.zzk();
                                    zzefVar2.zzF(20);
                                    Pair create = Pair.create(Integer.valueOf(zzefVar2.zzn()), Integer.valueOf(zzk));
                                    int intValue = ((Integer) create.first).intValue();
                                    int intValue2 = ((Integer) create.second).intValue();
                                    list = zzfvn.zzp(bArr5);
                                    zzl = intValue;
                                    i7 = intValue2;
                                    zzc += zze2;
                                    i13 = i2;
                                    i14 = i3;
                                    i8 = i9;
                                }
                                zzc += zze2;
                                i13 = i2;
                                i14 = i3;
                                i8 = i9;
                            }
                        }
                        if (i10 != i11) {
                            zzaez zzk2 = zzk(zzefVar, i10);
                            str4 = zzk2.zza;
                            bArr = zzk2.zzb;
                            if (bArr != null) {
                                if ("audio/mp4a-latm".equals(str4)) {
                                    zzyf zza2 = zzyg.zza(bArr);
                                    zzl = zza2.zza;
                                    i7 = zza2.zzb;
                                    str5 = zza2.zzc;
                                }
                                list = zzfvn.zzp(bArr);
                            }
                            zzaezVar = zzk2;
                        }
                        zzc += zze2;
                        i13 = i2;
                        i14 = i3;
                        i8 = i9;
                    }
                    zzc += zze2;
                    i13 = i2;
                    i14 = i3;
                    i8 = i9;
                }
                int i23 = i8;
                if (zzafbVar.zzb == null || str4 == null) {
                }
                zzad zzadVar3 = new zzad();
                zzadVar3.zzG(i4);
                zzadVar3.zzS(str4);
                zzadVar3.zzx(str5);
                zzadVar3.zzw(i7);
                zzadVar3.zzT(zzl);
                zzadVar3.zzN(i23);
                zzadVar3.zzI(list);
                zzadVar3.zzB(zzxVar2);
                zzadVar3.zzK(str);
                if (zzaezVar != null) {
                    j = zzaezVar.zzc;
                    zzadVar3.zzv(zzfxs.zzc(j));
                    j2 = zzaezVar.zzd;
                    zzadVar3.zzO(zzfxs.zzc(j2));
                }
                zzafbVar.zzb = zzadVar3.zzY();
                return;
            }
            str3 = "audio/amr-wb";
        }
        i8 = -1;
        String str42 = str3;
        zzaez zzaezVar2 = null;
        String str52 = null;
        List list2 = null;
        while (zzc - i13 < i14) {
        }
        int i232 = i8;
        if (zzafbVar.zzb == null) {
        }
    }

    private static void zzn(zzef zzefVar, int i, int i2, int i3, zzafb zzafbVar) {
        zzefVar.zzF(i2 + 16);
        zzefVar.zzv((char) 0);
        String zzv = zzefVar.zzv((char) 0);
        if (zzv != null) {
            zzad zzadVar = new zzad();
            zzadVar.zzG(i3);
            zzadVar.zzS(zzv);
            zzafbVar.zzb = zzadVar.zzY();
        }
    }

    private static boolean zzo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[zzen.zzf(4, 0, i)] && jArr[zzen.zzf(length + (-4), 0, i)] < j3 && j3 <= j;
    }
}
