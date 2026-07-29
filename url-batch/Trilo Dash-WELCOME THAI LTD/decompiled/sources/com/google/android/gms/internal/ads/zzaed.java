package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import androidx.core.internal.view.SupportMenu;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzaed {
    private static final byte[] zza = zzeg.zzZ("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
    
        if (r3 != 13) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzadv zzadvVar) {
        zzdy zzdyVar = zzadvVar.zza;
        zzdyVar.zzF(8);
        zzbl zzblVar = null;
        zzbl zzblVar2 = null;
        while (zzdyVar.zza() >= 8) {
            int zzc = zzdyVar.zzc();
            int zze = zzdyVar.zze();
            int zze2 = zzdyVar.zze();
            if (zze2 == 1835365473) {
                zzdyVar.zzF(zzc);
                int i = zzc + zze;
                zzdyVar.zzG(8);
                zzd(zzdyVar);
                while (true) {
                    if (zzdyVar.zzc() >= i) {
                        break;
                    }
                    int zzc2 = zzdyVar.zzc();
                    int zze3 = zzdyVar.zze();
                    if (zzdyVar.zze() == 1768715124) {
                        zzdyVar.zzF(zzc2);
                        int i2 = zzc2 + zze3;
                        zzdyVar.zzG(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzdyVar.zzc() < i2) {
                            zzbk zza2 = zzaek.zza(zzdyVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzblVar = new zzbl(arrayList);
                        }
                    } else {
                        zzdyVar.zzF(zzc2 + zze3);
                    }
                }
                zzblVar = null;
            } else if (zze2 == 1936553057) {
                zzdyVar.zzF(zzc);
                int i3 = zzc + zze;
                zzdyVar.zzG(12);
                while (true) {
                    if (zzdyVar.zzc() >= i3) {
                        break;
                    }
                    int zzc3 = zzdyVar.zzc();
                    int zze4 = zzdyVar.zze();
                    if (zzdyVar.zze() != 1935766900) {
                        zzdyVar.zzF(zzc3 + zze4);
                    } else if (zze4 >= 14) {
                        zzdyVar.zzG(5);
                        int zzk = zzdyVar.zzk();
                        float f = 120.0f;
                        if (zzk == 12) {
                            if (zzk == 12) {
                                f = 240.0f;
                            }
                        }
                        zzdyVar.zzG(1);
                        zzblVar2 = new zzbl(new zzacv(f, zzdyVar.zzk()));
                    }
                }
                zzblVar2 = null;
            }
            zzdyVar.zzF(zzc + zze);
        }
        return Pair.create(zzblVar, zzblVar2);
    }

    public static zzbl zzb(zzadu zzaduVar) {
        zzacp zzacpVar;
        zzadv zzb = zzaduVar.zzb(1751411826);
        zzadv zzb2 = zzaduVar.zzb(1801812339);
        zzadv zzb3 = zzaduVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzdy zzdyVar = zzb2.zza;
        zzdyVar.zzF(12);
        int zze = zzdyVar.zze();
        String[] strArr = new String[zze];
        for (int i = 0; i < zze; i++) {
            int zze2 = zzdyVar.zze();
            zzdyVar.zzG(4);
            strArr[i] = zzdyVar.zzx(zze2 - 8, zzfog.zzc);
        }
        zzdy zzdyVar2 = zzb3.zza;
        zzdyVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzdyVar2.zza() > 8) {
            int zzc = zzdyVar2.zzc();
            int zze3 = zzdyVar2.zze();
            int zze4 = zzdyVar2.zze() - 1;
            if (zze4 < 0 || zze4 >= zze) {
                Log.w("AtomParsers", "Skipped metadata with unknown key index: " + zze4);
            } else {
                String str = strArr[zze4];
                int i2 = zzc + zze3;
                int i3 = zzaek.zzb;
                while (true) {
                    int zzc2 = zzdyVar2.zzc();
                    if (zzc2 >= i2) {
                        zzacpVar = null;
                        break;
                    }
                    int zze5 = zzdyVar2.zze();
                    if (zzdyVar2.zze() == 1684108385) {
                        int zze6 = zzdyVar2.zze();
                        int zze7 = zzdyVar2.zze();
                        int i4 = zze5 - 16;
                        byte[] bArr = new byte[i4];
                        zzdyVar2.zzB(bArr, 0, i4);
                        zzacpVar = new zzacp(str, bArr, zze7, zze6);
                        break;
                    }
                    zzdyVar2.zzF(zzc2 + zze5);
                }
                if (zzacpVar != null) {
                    arrayList.add(zzacpVar);
                }
            }
            zzdyVar2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:280:0x00b7, code lost:
    
        if (r7 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x067f, code lost:
    
        if (r1 != 3) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0777, code lost:
    
        if (r25 == null) goto L374;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0aa5 A[ADDED_TO_REGION, LOOP:13: B:216:0x0aa5->B:219:0x0aaf, LOOP_START, PHI: r23
      0x0aa5: PHI (r23v8 int) = (r23v7 int), (r23v9 int) binds: [B:215:0x0aa3, B:219:0x0aaf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0a9e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0e0d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0b94  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzc(zzadu zzaduVar, zzzh zzzhVar, long j, zzv zzvVar, boolean z, boolean z2, zzfoi zzfoiVar) throws zzbp {
        int i;
        long j2;
        int i2;
        long j3;
        int i3;
        int i4;
        int zze;
        int i5;
        zzadz zzadzVar;
        ArrayList arrayList;
        String str;
        zzadu zzaduVar2;
        zzadu zza2;
        long[] jArr;
        long[] jArr2;
        zzaet zzaetVar;
        int i6;
        zzfoi zzfoiVar2;
        Pair zzh;
        String str2;
        int i7;
        zzadu zzaduVar3;
        zzaec zzaecVar;
        Pair pair;
        String str3;
        zzdy zzdyVar;
        zzadz zzadzVar2;
        zzv zzvVar2;
        int i8;
        String str4;
        int i9;
        int i10;
        int i11;
        int i12;
        float f;
        zzadz zzadzVar3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzadz zzadzVar4;
        int i19;
        int i20;
        int i21;
        boolean z3;
        int i22;
        boolean z4;
        int i23;
        int i24;
        float f2;
        zzadz zzadzVar5;
        byte[] bArr;
        boolean z5;
        byte[] bArr2;
        String str5;
        List list;
        String str6;
        String str7;
        int i25;
        int i26;
        zzfrh zzfrhVar;
        long j4;
        long j5;
        zzaet zzaetVar2;
        ArrayList arrayList2;
        zzady zzaebVar;
        zzadv zzadvVar;
        boolean z6;
        int i27;
        int i28;
        int i29;
        int zza3;
        int[] iArr;
        int i30;
        int i31;
        long j6;
        int i32;
        boolean z7;
        int i33;
        int i34;
        int i35;
        int i36;
        zzaet zzaetVar3;
        int i37;
        long[] jArr3;
        int i38;
        int[] iArr2;
        long[] jArr4;
        int[] iArr3;
        int i39;
        long j7;
        long[] jArr5;
        int[] iArr4;
        long j8;
        int i40;
        zzdy zzdyVar2;
        zzdy zzdyVar3;
        int i41;
        long[] jArr6;
        int i42;
        zzaet zzaetVar4;
        zzaew zzaewVar;
        int[] iArr5;
        long[] jArr7;
        int[] iArr6;
        boolean z8;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        zzaew zzaewVar2;
        zzadu zzaduVar4 = zzaduVar;
        zzv zzvVar3 = zzvVar;
        ArrayList arrayList3 = new ArrayList();
        int i48 = 0;
        while (i48 < zzaduVar4.zzc.size()) {
            zzadu zzaduVar5 = (zzadu) zzaduVar4.zzc.get(i48);
            if (zzaduVar5.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i = i48;
            } else {
                zzadv zzb = zzaduVar4.zzb(1836476516);
                Objects.requireNonNull(zzb);
                zzadu zza4 = zzaduVar5.zza(1835297121);
                Objects.requireNonNull(zza4);
                zzadv zzb2 = zza4.zzb(1751411826);
                Objects.requireNonNull(zzb2);
                int zze2 = zze(zzg(zzb2.zza));
                i = i48;
                int i49 = -1;
                if (zze2 == -1) {
                    zzfoiVar2 = zzfoiVar;
                    str = "AtomParsers";
                    zzaduVar2 = zzaduVar5;
                    arrayList = arrayList3;
                } else {
                    zzadv zzb3 = zzaduVar5.zzb(1953196132);
                    Objects.requireNonNull(zzb3);
                    zzdy zzdyVar4 = zzb3.zza;
                    zzdyVar4.zzF(8);
                    int zze3 = zzadw.zze(zzdyVar4.zze());
                    zzdyVar4.zzG(zze3 == 0 ? 8 : 16);
                    int zze4 = zzdyVar4.zze();
                    zzdyVar4.zzG(4);
                    int zzc = zzdyVar4.zzc();
                    int i50 = zze3 != 0 ? 8 : 4;
                    int i51 = 0;
                    while (true) {
                        if (i51 >= i50) {
                            zzdyVar4.zzG(i50);
                            break;
                        }
                        if (zzdyVar4.zzH()[zzc + i51] != -1) {
                            j2 = zze3 == 0 ? zzdyVar4.zzs() : zzdyVar4.zzt();
                        } else {
                            i51++;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzdyVar4.zzG(16);
                    int zze5 = zzdyVar4.zze();
                    int zze6 = zzdyVar4.zze();
                    zzdyVar4.zzG(4);
                    int zze7 = zzdyVar4.zze();
                    int zze8 = zzdyVar4.zze();
                    int i52 = 65536;
                    String str8 = "AtomParsers";
                    if (zze5 == 0) {
                        if (zze6 == 65536) {
                            if (zze7 != -65536) {
                                zze6 = 65536;
                            } else if (zze8 == 0) {
                                i2 = 90;
                                zzaec zzaecVar2 = new zzaec(zze4, j2, i2);
                                if (j == -9223372036854775807L) {
                                    j5 = zzaecVar2.zzb;
                                    j3 = j5;
                                } else {
                                    j3 = j;
                                }
                                zzdy zzdyVar5 = zzb.zza;
                                zzdyVar5.zzF(8);
                                zzdyVar5.zzG(zzadw.zze(zzdyVar5.zze()) == 0 ? 8 : 16);
                                long zzs = zzdyVar5.zzs();
                                long zzw = j3 != -9223372036854775807L ? zzeg.zzw(j3, 1000000L, zzs) : -9223372036854775807L;
                                zzadu zza5 = zza4.zza(1835626086);
                                Objects.requireNonNull(zza5);
                                zzadu zza6 = zza5.zza(1937007212);
                                Objects.requireNonNull(zza6);
                                zzadv zzb4 = zza4.zzb(1835296868);
                                Objects.requireNonNull(zzb4);
                                Pair zzj = zzj(zzb4.zza);
                                zzadv zzb5 = zza6.zzb(1937011556);
                                Objects.requireNonNull(zzb5);
                                zzdy zzdyVar6 = zzb5.zza;
                                i3 = zzaecVar2.zza;
                                i4 = zzaecVar2.zzc;
                                String str9 = (String) zzj.second;
                                zzdyVar6.zzF(12);
                                zze = zzdyVar6.zze();
                                zzadz zzadzVar6 = new zzadz(zze);
                                i5 = 0;
                                while (i5 < zze) {
                                    ArrayList arrayList4 = arrayList3;
                                    int zzc2 = zzdyVar6.zzc();
                                    int zze9 = zzdyVar6.zze();
                                    zzyw.zzb(zze9 > 0, "childAtomSize must be positive");
                                    int zze10 = zzdyVar6.zze();
                                    int i53 = zze;
                                    if (zze10 == 1635148593 || zze10 == 1635148595 || zze10 == 1701733238 || zze10 == 1831958048 || zze10 == 1836070006 || zze10 == 1752589105 || zze10 == 1751479857 || zze10 == 1932670515 || zze10 == 1211250227 || zze10 == 1987063864 || zze10 == 1987063865 || zze10 == 1635135537 || zze10 == 1685479798 || zze10 == 1685479729 || zze10 == 1685481573 || zze10 == 1685481521) {
                                        zzadz zzadzVar7 = zzadzVar6;
                                        str2 = str9;
                                        int i54 = i4;
                                        int i55 = i3;
                                        i7 = zze2;
                                        zzaduVar3 = zzaduVar5;
                                        zzaecVar = zzaecVar2;
                                        pair = zzj;
                                        str3 = str8;
                                        zzdyVar = zzdyVar6;
                                        zzdyVar.zzF(zzc2 + 16);
                                        zzdyVar.zzG(16);
                                        int zzo = zzdyVar.zzo();
                                        int zzo2 = zzdyVar.zzo();
                                        zzdyVar.zzG(50);
                                        int zzc3 = zzdyVar.zzc();
                                        if (zze10 == 1701733238) {
                                            Pair zzk = zzk(zzdyVar, zzc2, zze9);
                                            if (zzk != null) {
                                                int intValue = ((Integer) zzk.first).intValue();
                                                if (zzvVar3 == null) {
                                                    zzadzVar2 = zzadzVar7;
                                                    zzvVar2 = null;
                                                } else {
                                                    zzvVar2 = zzvVar3.zzb(((zzaeu) zzk.second).zzb);
                                                    zzadzVar2 = zzadzVar7;
                                                }
                                                zzadzVar2.zza[i5] = (zzaeu) zzk.second;
                                                zze10 = intValue;
                                            } else {
                                                zzadzVar2 = zzadzVar7;
                                                zzvVar2 = zzvVar3;
                                                zze10 = 1701733238;
                                            }
                                            zzdyVar.zzF(zzc3);
                                        } else {
                                            zzadzVar2 = zzadzVar7;
                                            zzvVar2 = zzvVar3;
                                        }
                                        if (zze10 == 1831958048) {
                                            int i56 = zze10;
                                            str4 = "video/mpeg";
                                            i8 = i56;
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
                                        int i57 = zzc3;
                                        zzv zzvVar4 = zzvVar2;
                                        String str10 = null;
                                        float f3 = 1.0f;
                                        int i58 = -1;
                                        byte[] bArr3 = null;
                                        int i59 = -1;
                                        int i60 = -1;
                                        int i61 = -1;
                                        ByteBuffer byteBuffer = null;
                                        List list2 = null;
                                        String str11 = str4;
                                        boolean z9 = false;
                                        while (true) {
                                            if (i57 - zzc2 >= zze9) {
                                                i10 = zze9;
                                                i11 = zzo;
                                                i12 = zzo2;
                                                f = f3;
                                                zzadzVar3 = zzadzVar2;
                                                i13 = i58;
                                                break;
                                            }
                                            zzdyVar.zzF(i57);
                                            int zzc4 = zzdyVar.zzc();
                                            int zze11 = zzdyVar.zze();
                                            if (zze11 == 0) {
                                                i13 = i58;
                                                if (zzdyVar.zzc() - zzc2 == zze9) {
                                                    i10 = zze9;
                                                    i11 = zzo;
                                                    i12 = zzo2;
                                                    f = f3;
                                                    zzadzVar3 = zzadzVar2;
                                                    break;
                                                }
                                                i19 = 0;
                                            } else {
                                                i13 = i58;
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
                                            zzyw.zzb(z3, "childAtomSize must be positive");
                                            int zze12 = zzdyVar.zze();
                                            if (zze12 == 1635148611) {
                                                zzyw.zzb(str11 == null, null);
                                                zzdyVar.zzF(zzc4 + 8);
                                                zzyb zza7 = zzyb.zza(zzdyVar);
                                                list = zza7.zza;
                                                zzadzVar2.zzc = zza7.zzb;
                                                if (!z9) {
                                                    f3 = zza7.zze;
                                                }
                                                str6 = zza7.zzf;
                                                str11 = "video/avc";
                                            } else if (zze12 == 1752589123) {
                                                zzyw.zzb(str11 == null, null);
                                                zzdyVar.zzF(zzc4 + 8);
                                                zzzi zza8 = zzzi.zza(zzdyVar);
                                                list = zza8.zza;
                                                zzadzVar2.zzc = zza8.zzb;
                                                if (!z9) {
                                                    f3 = zza8.zzc;
                                                }
                                                str6 = zza8.zzd;
                                                str11 = "video/hevc";
                                            } else {
                                                if (zze12 == 1685480259 || zze12 == 1685485123) {
                                                    i22 = i8;
                                                    z4 = z9;
                                                    i23 = zzo;
                                                    i24 = zzo2;
                                                    f2 = f3;
                                                    zzadzVar5 = zzadzVar2;
                                                    bArr = bArr3;
                                                    zzyp zza9 = zzyp.zza(zzdyVar);
                                                    if (zza9 != null) {
                                                        str10 = zza9.zza;
                                                        str11 = "video/dolby-vision";
                                                    }
                                                } else {
                                                    if (zze12 == 1987076931) {
                                                        zzyw.zzb(str11 == null, null);
                                                        str5 = i8 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                    } else if (zze12 == 1635135811) {
                                                        zzyw.zzb(str11 == null, null);
                                                        str5 = "video/av01";
                                                    } else if (zze12 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = zzl();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(zzdyVar.zzy());
                                                        byteBuffer2.putShort(zzdyVar.zzy());
                                                        byteBuffer = byteBuffer2;
                                                        i22 = i8;
                                                        i23 = zzo;
                                                        i24 = zzo2;
                                                        zzadzVar5 = zzadzVar2;
                                                        i57 += i19;
                                                        zze9 = i20;
                                                        i58 = i13;
                                                        zzc2 = i21;
                                                        i8 = i22;
                                                        zzadzVar2 = zzadzVar5;
                                                        zzo2 = i24;
                                                        zzo = i23;
                                                    } else {
                                                        if (zze12 == 1835295606) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = zzl();
                                                            }
                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                            short zzy = zzdyVar.zzy();
                                                            short zzy2 = zzdyVar.zzy();
                                                            i22 = i8;
                                                            short zzy3 = zzdyVar.zzy();
                                                            z4 = z9;
                                                            short zzy4 = zzdyVar.zzy();
                                                            zzadzVar5 = zzadzVar2;
                                                            short zzy5 = zzdyVar.zzy();
                                                            bArr = bArr3;
                                                            short zzy6 = zzdyVar.zzy();
                                                            f2 = f3;
                                                            short zzy7 = zzdyVar.zzy();
                                                            i24 = zzo2;
                                                            short zzy8 = zzdyVar.zzy();
                                                            long zzs2 = zzdyVar.zzs();
                                                            long zzs3 = zzdyVar.zzs();
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
                                                            zzadzVar5 = zzadzVar2;
                                                            bArr = bArr3;
                                                            if (zze12 == 1681012275) {
                                                                zzyw.zzb(str11 == null, null);
                                                                str11 = "video/3gpp";
                                                            } else if (zze12 == 1702061171) {
                                                                zzyw.zzb(str11 == null, null);
                                                                Pair zzi = zzi(zzdyVar, zzc4);
                                                                String str12 = (String) zzi.first;
                                                                byte[] bArr4 = (byte[]) zzi.second;
                                                                str11 = str12;
                                                                list2 = bArr4 != null ? zzfrh.zzp(bArr4) : list2;
                                                            } else if (zze12 == 1885434736) {
                                                                zzdyVar.zzF(zzc4 + 8);
                                                                f3 = zzdyVar.zzn() / zzdyVar.zzn();
                                                                bArr3 = bArr;
                                                                z9 = true;
                                                                i57 += i19;
                                                                zze9 = i20;
                                                                i58 = i13;
                                                                zzc2 = i21;
                                                                i8 = i22;
                                                                zzadzVar2 = zzadzVar5;
                                                                zzo2 = i24;
                                                                zzo = i23;
                                                            } else if (zze12 == 1937126244) {
                                                                int i62 = zzc4 + 8;
                                                                while (true) {
                                                                    if (i62 - zzc4 >= i19) {
                                                                        bArr2 = null;
                                                                        break;
                                                                    }
                                                                    zzdyVar.zzF(i62);
                                                                    int zze13 = zzdyVar.zze();
                                                                    if (zzdyVar.zze() == 1886547818) {
                                                                        bArr2 = Arrays.copyOfRange(zzdyVar.zzH(), i62, zze13 + i62);
                                                                        break;
                                                                    }
                                                                    i62 += zze13;
                                                                }
                                                                bArr3 = bArr2;
                                                                z9 = z4;
                                                                f3 = f2;
                                                                i57 += i19;
                                                                zze9 = i20;
                                                                i58 = i13;
                                                                zzc2 = i21;
                                                                i8 = i22;
                                                                zzadzVar2 = zzadzVar5;
                                                                zzo2 = i24;
                                                                zzo = i23;
                                                            } else if (zze12 == 1936995172) {
                                                                int zzk2 = zzdyVar.zzk();
                                                                int i63 = 3;
                                                                zzdyVar.zzG(3);
                                                                if (zzk2 == 0) {
                                                                    int zzk3 = zzdyVar.zzk();
                                                                    if (zzk3 == 0) {
                                                                        i63 = 0;
                                                                    } else if (zzk3 == 1) {
                                                                        i63 = 1;
                                                                    } else if (zzk3 == 2) {
                                                                        i63 = 2;
                                                                    }
                                                                    i13 = i63;
                                                                }
                                                                i63 = i13;
                                                                i13 = i63;
                                                            } else if (zze12 == 1668246642) {
                                                                int zze14 = zzdyVar.zze();
                                                                if (zze14 == 1852009592 || zze14 == 1852009571) {
                                                                    int zzo3 = zzdyVar.zzo();
                                                                    int zzo4 = zzdyVar.zzo();
                                                                    zzdyVar.zzG(2);
                                                                    if (i19 == 19) {
                                                                        z5 = (zzdyVar.zzk() & 128) != 0;
                                                                        i19 = 19;
                                                                    } else {
                                                                        z5 = false;
                                                                    }
                                                                    int zza10 = zzo.zza(zzo3);
                                                                    int i64 = true != z5 ? 2 : 1;
                                                                    i61 = zza10;
                                                                    i59 = zzo.zzb(zzo4);
                                                                    i60 = i64;
                                                                } else {
                                                                    Log.w(str3, "Unsupported color type: ".concat(zzadw.zzf(zze14)));
                                                                }
                                                            }
                                                        }
                                                        z9 = z4;
                                                        bArr3 = bArr;
                                                        f3 = f2;
                                                        i57 += i19;
                                                        zze9 = i20;
                                                        i58 = i13;
                                                        zzc2 = i21;
                                                        i8 = i22;
                                                        zzadzVar2 = zzadzVar5;
                                                        zzo2 = i24;
                                                        zzo = i23;
                                                    }
                                                    str11 = str5;
                                                    i22 = i8;
                                                    i23 = zzo;
                                                    i24 = zzo2;
                                                    zzadzVar5 = zzadzVar2;
                                                    i57 += i19;
                                                    zze9 = i20;
                                                    i58 = i13;
                                                    zzc2 = i21;
                                                    i8 = i22;
                                                    zzadzVar2 = zzadzVar5;
                                                    zzo2 = i24;
                                                    zzo = i23;
                                                }
                                                z9 = z4;
                                                bArr3 = bArr;
                                                f3 = f2;
                                                i57 += i19;
                                                zze9 = i20;
                                                i58 = i13;
                                                zzc2 = i21;
                                                i8 = i22;
                                                zzadzVar2 = zzadzVar5;
                                                zzo2 = i24;
                                                zzo = i23;
                                            }
                                            list2 = list;
                                            i22 = i8;
                                            i23 = zzo;
                                            i24 = zzo2;
                                            zzadzVar5 = zzadzVar2;
                                            str10 = str6;
                                            i57 += i19;
                                            zze9 = i20;
                                            i58 = i13;
                                            zzc2 = i21;
                                            i8 = i22;
                                            zzadzVar2 = zzadzVar5;
                                            zzo2 = i24;
                                            zzo = i23;
                                        }
                                        byte[] bArr5 = bArr3;
                                        i14 = zzc2;
                                        if (str11 == null) {
                                            i16 = i54;
                                            i15 = i55;
                                            zzadzVar4 = zzadzVar3;
                                        } else {
                                            zzab zzabVar = new zzab();
                                            i15 = i55;
                                            zzabVar.zzG(i15);
                                            zzabVar.zzS(str11);
                                            zzabVar.zzx(str10);
                                            zzabVar.zzX(i11);
                                            zzabVar.zzF(i12);
                                            zzabVar.zzP(f);
                                            i16 = i54;
                                            zzabVar.zzR(i16);
                                            zzabVar.zzQ(bArr5);
                                            zzabVar.zzV(i13);
                                            zzabVar.zzI(list2);
                                            zzabVar.zzB(zzvVar4);
                                            int i65 = i61;
                                            if (i65 == -1) {
                                                i18 = i60;
                                                i17 = i59;
                                                if (i18 == -1) {
                                                    if (i17 == -1) {
                                                    }
                                                }
                                            } else {
                                                i17 = i59;
                                                i18 = i60;
                                            }
                                            zzabVar.zzy(new zzo(i65, i18, i17, byteBuffer != null ? byteBuffer.array() : null));
                                            zzadzVar4 = zzadzVar3;
                                            zzadzVar4.zzb = zzabVar.zzY();
                                        }
                                    } else if (zze10 == 1836069985 || zze10 == 1701733217 || zze10 == 1633889587 || zze10 == 1700998451 || zze10 == 1633889588 || zze10 == 1835823201 || zze10 == 1685353315 || zze10 == 1685353317 || zze10 == 1685353320 || zze10 == 1685353324 || zze10 == 1685353336 || zze10 == 1935764850 || zze10 == 1935767394 || zze10 == 1819304813 || zze10 == 1936684916 || zze10 == 1953984371 || zze10 == 778924082 || zze10 == 778924083 || zze10 == 1835557169 || zze10 == 1835560241 || zze10 == 1634492771 || zze10 == 1634492791 || zze10 == 1970037111 || zze10 == 1332770163 || zze10 == 1716281667) {
                                        int i66 = zze2;
                                        zzadz zzadzVar8 = zzadzVar6;
                                        str2 = str9;
                                        zzaecVar = zzaecVar2;
                                        pair = zzj;
                                        str3 = str8;
                                        i7 = i66;
                                        zzdyVar = zzdyVar6;
                                        zzaduVar3 = zzaduVar5;
                                        zzm(zzdyVar6, zze10, zzc2, zze9, i3, str2, z2, zzvVar, zzadzVar8, i5);
                                        i10 = zze9;
                                        i14 = zzc2;
                                        zzadzVar4 = zzadzVar8;
                                        i16 = i4;
                                        i15 = i3;
                                        i9 = i5;
                                    } else {
                                        if (zze10 == 1414810956 || zze10 == 1954034535 || zze10 == 2004251764 || zze10 == 1937010800 || zze10 == 1664495672) {
                                            zzdyVar6.zzF(zzc2 + 16);
                                            if (zze10 == 1414810956) {
                                                str7 = "application/ttml+xml";
                                            } else {
                                                if (zze10 == 1954034535) {
                                                    int i67 = zze9 - 16;
                                                    byte[] bArr6 = new byte[i67];
                                                    zzdyVar6.zzB(bArr6, 0, i67);
                                                    i25 = i4;
                                                    i26 = zze2;
                                                    j4 = Long.MAX_VALUE;
                                                    zzfrhVar = zzfrh.zzp(bArr6);
                                                    str7 = "application/x-quicktime-tx3g";
                                                } else if (zze10 == 2004251764) {
                                                    str7 = "application/x-mp4-vtt";
                                                } else if (zze10 == 1937010800) {
                                                    str7 = "application/ttml+xml";
                                                    i25 = i4;
                                                    i26 = zze2;
                                                    zzfrhVar = null;
                                                    j4 = 0;
                                                } else {
                                                    zzadzVar6.zzd = 1;
                                                    str7 = "application/x-mp4-cea-608";
                                                }
                                                zzab zzabVar2 = new zzab();
                                                zzabVar2.zzG(i3);
                                                zzabVar2.zzS(str7);
                                                zzabVar2.zzK(str9);
                                                zzabVar2.zzW(j4);
                                                zzabVar2.zzI(zzfrhVar);
                                                zzadzVar6.zzb = zzabVar2.zzY();
                                                i9 = i5;
                                                i10 = zze9;
                                                zzadzVar4 = zzadzVar6;
                                                str2 = str9;
                                                i15 = i3;
                                                zzaduVar3 = zzaduVar5;
                                                i14 = zzc2;
                                                zzaecVar = zzaecVar2;
                                                pair = zzj;
                                                i7 = i26;
                                                str3 = str8;
                                                i16 = i25;
                                            }
                                            i25 = i4;
                                            i26 = zze2;
                                            j4 = Long.MAX_VALUE;
                                            zzfrhVar = null;
                                            zzab zzabVar22 = new zzab();
                                            zzabVar22.zzG(i3);
                                            zzabVar22.zzS(str7);
                                            zzabVar22.zzK(str9);
                                            zzabVar22.zzW(j4);
                                            zzabVar22.zzI(zzfrhVar);
                                            zzadzVar6.zzb = zzabVar22.zzY();
                                            i9 = i5;
                                            i10 = zze9;
                                            zzadzVar4 = zzadzVar6;
                                            str2 = str9;
                                            i15 = i3;
                                            zzaduVar3 = zzaduVar5;
                                            i14 = zzc2;
                                            zzaecVar = zzaecVar2;
                                            pair = zzj;
                                            i7 = i26;
                                            str3 = str8;
                                            i16 = i25;
                                        } else {
                                            if (zze10 == 1835365492) {
                                                zzdyVar6.zzF(zzc2 + 16);
                                                zzdyVar6.zzv((char) 0);
                                                String zzv = zzdyVar6.zzv((char) 0);
                                                if (zzv != null) {
                                                    zzab zzabVar3 = new zzab();
                                                    zzabVar3.zzG(i3);
                                                    zzabVar3.zzS(zzv);
                                                    zzadzVar6.zzb = zzabVar3.zzY();
                                                }
                                            } else if (zze10 == 1667329389) {
                                                zzab zzabVar4 = new zzab();
                                                zzabVar4.zzG(i3);
                                                zzabVar4.zzS("application/x-camera-motion");
                                                zzadzVar6.zzb = zzabVar4.zzY();
                                            }
                                            i9 = i5;
                                            i10 = zze9;
                                            zzadzVar4 = zzadzVar6;
                                            str2 = str9;
                                            i16 = i4;
                                            i15 = i3;
                                            i7 = zze2;
                                            zzaduVar3 = zzaduVar5;
                                            i14 = zzc2;
                                            zzaecVar = zzaecVar2;
                                            pair = zzj;
                                            str3 = str8;
                                        }
                                        zzdyVar = zzdyVar6;
                                    }
                                    zzdyVar.zzF(i14 + i10);
                                    i5 = i9 + 1;
                                    zzvVar3 = zzvVar;
                                    i3 = i15;
                                    i4 = i16;
                                    zzadzVar6 = zzadzVar4;
                                    str8 = str3;
                                    zzdyVar6 = zzdyVar;
                                    str9 = str2;
                                    zze2 = i7;
                                    zzj = pair;
                                    zzaecVar2 = zzaecVar;
                                    zze = i53;
                                    arrayList3 = arrayList4;
                                    zzaduVar5 = zzaduVar3;
                                }
                                zzadzVar = zzadzVar6;
                                int i68 = zze2;
                                arrayList = arrayList3;
                                zzaec zzaecVar3 = zzaecVar2;
                                Pair pair2 = zzj;
                                str = str8;
                                i49 = -1;
                                zzaduVar2 = zzaduVar5;
                                zza2 = zzaduVar2.zza(1701082227);
                                if (zza2 != null || (zzh = zzh(zza2)) == null) {
                                    jArr = null;
                                    jArr2 = null;
                                } else {
                                    jArr = (long[]) zzh.first;
                                    jArr2 = (long[]) zzh.second;
                                }
                                if (zzadzVar.zzb == null) {
                                    zzfoiVar2 = zzfoiVar;
                                } else {
                                    i6 = zzaecVar3.zza;
                                    zzaetVar = new zzaet(i6, i68, ((Long) pair2.first).longValue(), zzs, zzw, zzadzVar.zzb, zzadzVar.zzd, zzadzVar.zza, zzadzVar.zzc, jArr, jArr2);
                                    zzfoiVar2 = zzfoiVar;
                                    zzaetVar2 = (zzaet) zzfoiVar2.apply(zzaetVar);
                                    if (zzaetVar2 == null) {
                                        zzadu zza11 = zzaduVar2.zza(1835297121);
                                        Objects.requireNonNull(zza11);
                                        zzadu zza12 = zza11.zza(1835626086);
                                        Objects.requireNonNull(zza12);
                                        zzadu zza13 = zza12.zza(1937007212);
                                        Objects.requireNonNull(zza13);
                                        zzadv zzb6 = zza13.zzb(1937011578);
                                        if (zzb6 != null) {
                                            zzaebVar = new zzaea(zzb6, zzaetVar2.zzf);
                                        } else {
                                            zzadv zzb7 = zza13.zzb(1937013298);
                                            if (zzb7 == null) {
                                                throw zzbp.zza("Track has no sample table size information", null);
                                            }
                                            zzaebVar = new zzaeb(zzb7);
                                        }
                                        int zzb8 = zzaebVar.zzb();
                                        if (zzb8 == 0) {
                                            zzaewVar = new zzaew(zzaetVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                                        } else {
                                            zzadv zzb9 = zza13.zzb(1937007471);
                                            if (zzb9 == null) {
                                                zzadv zzb10 = zza13.zzb(1668232756);
                                                Objects.requireNonNull(zzb10);
                                                zzadvVar = zzb10;
                                                z6 = true;
                                            } else {
                                                zzadvVar = zzb9;
                                                z6 = false;
                                            }
                                            zzdy zzdyVar7 = zzadvVar.zza;
                                            zzadv zzb11 = zza13.zzb(1937011555);
                                            Objects.requireNonNull(zzb11);
                                            zzdy zzdyVar8 = zzb11.zza;
                                            zzadv zzb12 = zza13.zzb(1937011827);
                                            Objects.requireNonNull(zzb12);
                                            zzdy zzdyVar9 = zzb12.zza;
                                            zzadv zzb13 = zza13.zzb(1937011571);
                                            zzdy zzdyVar10 = zzb13 != null ? zzb13.zza : null;
                                            zzadv zzb14 = zza13.zzb(1668576371);
                                            zzdy zzdyVar11 = zzb14 != null ? zzb14.zza : null;
                                            zzadx zzadxVar = new zzadx(zzdyVar8, zzdyVar7, z6);
                                            zzdyVar9.zzF(12);
                                            int zzn = zzdyVar9.zzn() + i49;
                                            int zzn2 = zzdyVar9.zzn();
                                            int zzn3 = zzdyVar9.zzn();
                                            if (zzdyVar11 != null) {
                                                zzdyVar11.zzF(12);
                                                i27 = zzdyVar11.zzn();
                                            } else {
                                                i27 = 0;
                                            }
                                            if (zzdyVar10 != null) {
                                                zzdyVar10.zzF(12);
                                                i28 = zzdyVar10.zzn();
                                                if (i28 > 0) {
                                                    i29 = zzdyVar10.zzn() - 1;
                                                    zza3 = zzaebVar.zza();
                                                    String str13 = zzaetVar2.zzf.zzm;
                                                    if (zza3 != i49 && (("audio/raw".equals(str13) || "audio/g711-mlaw".equals(str13) || "audio/g711-alaw".equals(str13)) && zzn == 0)) {
                                                        if (i27 == 0 || i28 != 0) {
                                                            zzn = 0;
                                                        } else {
                                                            int i69 = zzadxVar.zza;
                                                            long[] jArr8 = new long[i69];
                                                            int[] iArr7 = new int[i69];
                                                            while (zzadxVar.zza()) {
                                                                int i70 = zzadxVar.zzb;
                                                                jArr8[i70] = zzadxVar.zzd;
                                                                iArr7[i70] = zzadxVar.zzc;
                                                            }
                                                            long j9 = zzn3;
                                                            int i71 = 8192 / zza3;
                                                            int i72 = 0;
                                                            for (int i73 = 0; i73 < i69; i73++) {
                                                                i72 += zzeg.zze(iArr7[i73], i71);
                                                            }
                                                            long[] jArr9 = new long[i72];
                                                            int[] iArr8 = new int[i72];
                                                            long[] jArr10 = new long[i72];
                                                            int[] iArr9 = new int[i72];
                                                            int i74 = 0;
                                                            int i75 = 0;
                                                            int i76 = 0;
                                                            int i77 = 0;
                                                            while (i74 < i69) {
                                                                int i78 = iArr7[i74];
                                                                long j10 = jArr8[i74];
                                                                int i79 = i69;
                                                                int i80 = i78;
                                                                while (i80 > 0) {
                                                                    int min = Math.min(i71, i80);
                                                                    jArr9[i77] = j10;
                                                                    long[] jArr11 = jArr8;
                                                                    int i81 = zza3 * min;
                                                                    iArr8[i77] = i81;
                                                                    i76 = Math.max(i76, i81);
                                                                    jArr10[i77] = i75 * j9;
                                                                    iArr9[i77] = 1;
                                                                    j10 += iArr8[i77];
                                                                    i75 += min;
                                                                    i80 -= min;
                                                                    i77++;
                                                                    jArr8 = jArr11;
                                                                    zza3 = zza3;
                                                                }
                                                                i74++;
                                                                i69 = i79;
                                                            }
                                                            long j11 = j9 * i75;
                                                            jArr5 = jArr9;
                                                            iArr3 = iArr9;
                                                            iArr4 = iArr8;
                                                            jArr4 = jArr10;
                                                            i39 = i76;
                                                            zzaetVar3 = zzaetVar2;
                                                            j7 = j11;
                                                            long zzw2 = zzeg.zzw(j7, 1000000L, zzaetVar3.zzc);
                                                            jArr6 = zzaetVar3.zzh;
                                                            if (jArr6 == null) {
                                                                zzeg.zzQ(jArr4, 1000000L, zzaetVar3.zzc);
                                                                zzaewVar2 = new zzaew(zzaetVar3, jArr5, iArr4, i39, jArr4, iArr3, zzw2);
                                                            } else {
                                                                zzaet zzaetVar5 = zzaetVar3;
                                                                if (jArr6.length == 1 && zzaetVar5.zzb == 1 && jArr4.length >= 2) {
                                                                    long[] jArr12 = zzaetVar5.zzi;
                                                                    Objects.requireNonNull(jArr12);
                                                                    long j12 = jArr12[0];
                                                                    long zzw3 = j12 + zzeg.zzw(jArr6[0], zzaetVar5.zzc, zzaetVar5.zzd);
                                                                    i42 = zzb8;
                                                                    zzaetVar4 = zzaetVar5;
                                                                    if (zzn(jArr4, j7, j12, zzw3)) {
                                                                        long zzw4 = zzeg.zzw(j12 - jArr4[0], zzaetVar4.zzf.zzA, zzaetVar4.zzc);
                                                                        long zzw5 = zzeg.zzw(j7 - zzw3, zzaetVar4.zzf.zzA, zzaetVar4.zzc);
                                                                        if (zzw4 == 0) {
                                                                            if (zzw5 != 0) {
                                                                                zzw4 = 0;
                                                                            }
                                                                        }
                                                                        if (zzw4 <= 2147483647L && zzw5 <= 2147483647L) {
                                                                            zzzhVar.zza = (int) zzw4;
                                                                            zzzhVar.zzb = (int) zzw5;
                                                                            zzeg.zzQ(jArr4, 1000000L, zzaetVar4.zzc);
                                                                            zzaewVar2 = new zzaew(zzaetVar4, jArr5, iArr4, i39, jArr4, iArr3, zzeg.zzw(zzaetVar4.zzh[0], 1000000L, zzaetVar4.zzd));
                                                                        }
                                                                    }
                                                                } else {
                                                                    i42 = zzb8;
                                                                    zzaetVar4 = zzaetVar5;
                                                                }
                                                                long[] jArr13 = zzaetVar4.zzh;
                                                                int length = jArr13.length;
                                                                if (length == 1) {
                                                                    if (jArr13[0] == 0) {
                                                                        long[] jArr14 = zzaetVar4.zzi;
                                                                        Objects.requireNonNull(jArr14);
                                                                        long j13 = jArr14[0];
                                                                        for (int i82 = 0; i82 < jArr4.length; i82++) {
                                                                            jArr4[i82] = zzeg.zzw(jArr4[i82] - j13, 1000000L, zzaetVar4.zzc);
                                                                        }
                                                                        zzaewVar2 = new zzaew(zzaetVar4, jArr5, iArr4, i39, jArr4, iArr3, zzeg.zzw(j7 - j13, 1000000L, zzaetVar4.zzc));
                                                                    } else {
                                                                        length = 1;
                                                                    }
                                                                }
                                                                boolean z10 = zzaetVar4.zzb == 1;
                                                                int[] iArr10 = new int[length];
                                                                int[] iArr11 = new int[length];
                                                                long[] jArr15 = zzaetVar4.zzi;
                                                                Objects.requireNonNull(jArr15);
                                                                long[] jArr16 = jArr15;
                                                                int i83 = 0;
                                                                int i84 = 0;
                                                                int i85 = 0;
                                                                boolean z11 = false;
                                                                while (true) {
                                                                    long[] jArr17 = zzaetVar4.zzh;
                                                                    if (i83 >= jArr17.length) {
                                                                        break;
                                                                    }
                                                                    long[] jArr18 = jArr5;
                                                                    int[] iArr12 = iArr4;
                                                                    long j14 = jArr16[i83];
                                                                    if (j14 != -1) {
                                                                        long j15 = jArr17[i83];
                                                                        boolean z12 = z11;
                                                                        i43 = i39;
                                                                        int i86 = i84;
                                                                        int i87 = i85;
                                                                        long zzw6 = zzeg.zzw(j15, zzaetVar4.zzc, zzaetVar4.zzd);
                                                                        int i88 = 1;
                                                                        iArr10[i83] = zzeg.zzd(jArr4, j14, true, true);
                                                                        iArr11[i83] = zzeg.zzb(jArr4, j14 + zzw6, z10, false);
                                                                        while (true) {
                                                                            i46 = iArr10[i83];
                                                                            i47 = iArr11[i83];
                                                                            if (i46 >= i47 || (iArr3[i46] & i88) != 0) {
                                                                                break;
                                                                            }
                                                                            iArr10[i83] = i46 + 1;
                                                                            i88 = 1;
                                                                        }
                                                                        i45 = i86 + (i47 - i46);
                                                                        z8 = z12 | (i87 != i46);
                                                                        i44 = i47;
                                                                    } else {
                                                                        z8 = z11;
                                                                        i43 = i39;
                                                                        i44 = i85;
                                                                        i45 = i84;
                                                                    }
                                                                    i83++;
                                                                    jArr5 = jArr18;
                                                                    i84 = i45;
                                                                    i85 = i44;
                                                                    i39 = i43;
                                                                    iArr4 = iArr12;
                                                                    z11 = z8;
                                                                }
                                                                long[] jArr19 = jArr5;
                                                                int[] iArr13 = iArr4;
                                                                int i89 = i84;
                                                                int i90 = i39;
                                                                boolean z13 = z11 | (i89 != i42);
                                                                long[] jArr20 = z13 ? new long[i89] : jArr19;
                                                                int[] iArr14 = z13 ? new int[i89] : iArr13;
                                                                if (true == z13) {
                                                                    i90 = 0;
                                                                }
                                                                int[] iArr15 = z13 ? new int[i89] : iArr3;
                                                                long[] jArr21 = new long[i89];
                                                                int i91 = i90;
                                                                int i92 = 0;
                                                                int i93 = 0;
                                                                long j16 = 0;
                                                                while (i92 < zzaetVar4.zzh.length) {
                                                                    long j17 = zzaetVar4.zzi[i92];
                                                                    int i94 = iArr10[i92];
                                                                    int i95 = iArr11[i92];
                                                                    if (z13) {
                                                                        iArr5 = iArr10;
                                                                        int i96 = i95 - i94;
                                                                        System.arraycopy(jArr19, i94, jArr20, i93, i96);
                                                                        jArr7 = jArr19;
                                                                        iArr6 = iArr13;
                                                                        System.arraycopy(iArr6, i94, iArr14, i93, i96);
                                                                        System.arraycopy(iArr3, i94, iArr15, i93, i96);
                                                                    } else {
                                                                        iArr5 = iArr10;
                                                                        jArr7 = jArr19;
                                                                        iArr6 = iArr13;
                                                                    }
                                                                    while (i94 < i95) {
                                                                        int[] iArr16 = iArr11;
                                                                        int[] iArr17 = iArr15;
                                                                        long[] jArr22 = jArr4;
                                                                        int[] iArr18 = iArr3;
                                                                        long[] jArr23 = jArr20;
                                                                        jArr21[i93] = zzeg.zzw(j16, 1000000L, zzaetVar4.zzd) + zzeg.zzw(Math.max(0L, jArr4[i94] - j17), 1000000L, zzaetVar4.zzc);
                                                                        if (z13 && iArr14[i93] > i91) {
                                                                            i91 = iArr6[i94];
                                                                        }
                                                                        i93++;
                                                                        i94++;
                                                                        iArr11 = iArr16;
                                                                        jArr4 = jArr22;
                                                                        iArr3 = iArr18;
                                                                        iArr15 = iArr17;
                                                                        jArr20 = jArr23;
                                                                    }
                                                                    j16 += zzaetVar4.zzh[i92];
                                                                    i92++;
                                                                    iArr11 = iArr11;
                                                                    jArr4 = jArr4;
                                                                    iArr3 = iArr3;
                                                                    iArr10 = iArr5;
                                                                    jArr20 = jArr20;
                                                                    iArr13 = iArr6;
                                                                    jArr19 = jArr7;
                                                                }
                                                                zzaewVar = new zzaew(zzaetVar4, jArr20, iArr14, i91, jArr21, iArr15, zzeg.zzw(j16, 1000000L, zzaetVar4.zzd));
                                                            }
                                                            zzaewVar = zzaewVar2;
                                                        }
                                                    }
                                                    long[] jArr24 = new long[zzb8];
                                                    iArr = new int[zzb8];
                                                    long[] jArr25 = new long[zzb8];
                                                    i30 = i28;
                                                    int[] iArr19 = new int[zzb8];
                                                    int i97 = zzn2;
                                                    int i98 = zzn3;
                                                    int i99 = i27;
                                                    int i100 = i29;
                                                    int i101 = 0;
                                                    int i102 = 0;
                                                    i31 = 0;
                                                    int i103 = 0;
                                                    j6 = 0;
                                                    long j18 = 0;
                                                    int i104 = zzn;
                                                    i32 = 0;
                                                    while (true) {
                                                        if (i32 < zzb8) {
                                                            break;
                                                        }
                                                        j8 = j6;
                                                        boolean z14 = true;
                                                        while (true) {
                                                            if (i31 != 0) {
                                                                i40 = zzb8;
                                                                zzdyVar2 = zzdyVar9;
                                                                zzdyVar3 = zzdyVar10;
                                                                i41 = i31;
                                                                break;
                                                            }
                                                            z14 = zzadxVar.zza();
                                                            if (!z14) {
                                                                i40 = zzb8;
                                                                zzdyVar2 = zzdyVar9;
                                                                zzdyVar3 = zzdyVar10;
                                                                i41 = 0;
                                                                break;
                                                            }
                                                            zzdy zzdyVar12 = zzdyVar9;
                                                            long j19 = zzadxVar.zzd;
                                                            i31 = zzadxVar.zzc;
                                                            j8 = j19;
                                                            zzdyVar9 = zzdyVar12;
                                                            zzdyVar10 = zzdyVar10;
                                                            zzb8 = zzb8;
                                                        }
                                                        if (!z14) {
                                                            Log.w(str, "Unexpected end of chunk data");
                                                            jArr24 = Arrays.copyOf(jArr24, i32);
                                                            iArr = Arrays.copyOf(iArr, i32);
                                                            jArr25 = Arrays.copyOf(jArr25, i32);
                                                            iArr19 = Arrays.copyOf(iArr19, i32);
                                                            zzb8 = i32;
                                                            break;
                                                        }
                                                        if (zzdyVar11 != null) {
                                                            while (true) {
                                                                if (i103 != 0) {
                                                                    break;
                                                                }
                                                                if (i99 <= 0) {
                                                                    i103 = 0;
                                                                    break;
                                                                }
                                                                i103 = zzdyVar11.zzn();
                                                                i102 = zzdyVar11.zze();
                                                                i99--;
                                                            }
                                                            i103--;
                                                        }
                                                        jArr24[i32] = j8;
                                                        int zzc5 = zzaebVar.zzc();
                                                        iArr[i32] = zzc5;
                                                        if (zzc5 > i101) {
                                                            i101 = zzc5;
                                                        }
                                                        jArr25[i32] = j18 + i102;
                                                        iArr19[i32] = zzdyVar3 == null ? 1 : 0;
                                                        if (i32 == i100) {
                                                            iArr19[i32] = 1;
                                                            i30--;
                                                            if (i30 > 0) {
                                                                Objects.requireNonNull(zzdyVar3);
                                                                i100 = zzdyVar3.zzn() - 1;
                                                            }
                                                        }
                                                        j18 += i98;
                                                        int i105 = i97 - 1;
                                                        if (i105 != 0) {
                                                            i97 = i105;
                                                        } else if (i104 > 0) {
                                                            i104--;
                                                            i97 = zzdyVar2.zzn();
                                                            i98 = zzdyVar2.zze();
                                                        } else {
                                                            i97 = 0;
                                                        }
                                                        long j20 = j8 + iArr[i32];
                                                        i31 = i41 - 1;
                                                        i32++;
                                                        zzb8 = i40;
                                                        zzdyVar9 = zzdyVar2;
                                                        j6 = j20;
                                                        zzdyVar10 = zzdyVar3;
                                                    }
                                                    long j21 = j18 + i102;
                                                    if (zzdyVar11 != null) {
                                                        while (i99 > 0) {
                                                            if (zzdyVar11.zzn() != 0) {
                                                                z7 = false;
                                                                break;
                                                            }
                                                            zzdyVar11.zze();
                                                            i99--;
                                                        }
                                                    }
                                                    z7 = true;
                                                    if (i30 == 0) {
                                                        i33 = i104;
                                                        i34 = i30;
                                                        i35 = i97;
                                                        i36 = i31;
                                                        zzaetVar3 = zzaetVar2;
                                                        i37 = i103;
                                                    } else if (i97 != 0) {
                                                        i33 = i104;
                                                        i35 = i97;
                                                        i36 = i31;
                                                        zzaetVar3 = zzaetVar2;
                                                        i37 = i103;
                                                        i34 = 0;
                                                    } else if (i31 != 0) {
                                                        i33 = i104;
                                                        i36 = i31;
                                                        zzaetVar3 = zzaetVar2;
                                                        i37 = i103;
                                                        i34 = 0;
                                                        i35 = 0;
                                                    } else if (i104 == 0) {
                                                        if (i103 != 0) {
                                                            jArr3 = jArr24;
                                                            zzaetVar3 = zzaetVar2;
                                                            i37 = i103;
                                                            i34 = 0;
                                                            i35 = 0;
                                                            i36 = 0;
                                                            i33 = 0;
                                                        } else if (z7) {
                                                            jArr3 = jArr24;
                                                            iArr2 = iArr;
                                                            i38 = zzb8;
                                                            zzaetVar3 = zzaetVar2;
                                                            jArr4 = jArr25;
                                                            iArr3 = iArr19;
                                                            i39 = i101;
                                                            j7 = j21;
                                                            jArr5 = jArr3;
                                                            iArr4 = iArr2;
                                                            zzb8 = i38;
                                                            long zzw22 = zzeg.zzw(j7, 1000000L, zzaetVar3.zzc);
                                                            jArr6 = zzaetVar3.zzh;
                                                            if (jArr6 == null) {
                                                            }
                                                            zzaewVar = zzaewVar2;
                                                        } else {
                                                            jArr3 = jArr24;
                                                            zzaetVar3 = zzaetVar2;
                                                            z7 = false;
                                                            i34 = 0;
                                                            i35 = 0;
                                                            i36 = 0;
                                                            i33 = 0;
                                                            i37 = 0;
                                                        }
                                                        int i106 = zzaetVar3.zza;
                                                        iArr2 = iArr;
                                                        String str14 = true != z7 ? ", ctts invalid" : "";
                                                        StringBuilder sb = new StringBuilder();
                                                        i38 = zzb8;
                                                        sb.append("Inconsistent stbl box for track ");
                                                        sb.append(i106);
                                                        sb.append(": remainingSynchronizationSamples ");
                                                        sb.append(i34);
                                                        sb.append(", remainingSamplesAtTimestampDelta ");
                                                        sb.append(i35);
                                                        sb.append(", remainingSamplesInChunk ");
                                                        sb.append(i36);
                                                        sb.append(", remainingTimestampDeltaChanges ");
                                                        sb.append(i33);
                                                        sb.append(", remainingSamplesAtTimestampOffset ");
                                                        sb.append(i37);
                                                        sb.append(str14);
                                                        Log.w(str, sb.toString());
                                                        jArr4 = jArr25;
                                                        iArr3 = iArr19;
                                                        i39 = i101;
                                                        j7 = j21;
                                                        jArr5 = jArr3;
                                                        iArr4 = iArr2;
                                                        zzb8 = i38;
                                                        long zzw222 = zzeg.zzw(j7, 1000000L, zzaetVar3.zzc);
                                                        jArr6 = zzaetVar3.zzh;
                                                        if (jArr6 == null) {
                                                        }
                                                        zzaewVar = zzaewVar2;
                                                    } else {
                                                        i33 = i104;
                                                        zzaetVar3 = zzaetVar2;
                                                        i37 = i103;
                                                        i34 = 0;
                                                        i35 = 0;
                                                        i36 = 0;
                                                    }
                                                    jArr3 = jArr24;
                                                    int i1062 = zzaetVar3.zza;
                                                    iArr2 = iArr;
                                                    if (true != z7) {
                                                    }
                                                    StringBuilder sb2 = new StringBuilder();
                                                    i38 = zzb8;
                                                    sb2.append("Inconsistent stbl box for track ");
                                                    sb2.append(i1062);
                                                    sb2.append(": remainingSynchronizationSamples ");
                                                    sb2.append(i34);
                                                    sb2.append(", remainingSamplesAtTimestampDelta ");
                                                    sb2.append(i35);
                                                    sb2.append(", remainingSamplesInChunk ");
                                                    sb2.append(i36);
                                                    sb2.append(", remainingTimestampDeltaChanges ");
                                                    sb2.append(i33);
                                                    sb2.append(", remainingSamplesAtTimestampOffset ");
                                                    sb2.append(i37);
                                                    sb2.append(str14);
                                                    Log.w(str, sb2.toString());
                                                    jArr4 = jArr25;
                                                    iArr3 = iArr19;
                                                    i39 = i101;
                                                    j7 = j21;
                                                    jArr5 = jArr3;
                                                    iArr4 = iArr2;
                                                    zzb8 = i38;
                                                    long zzw2222 = zzeg.zzw(j7, 1000000L, zzaetVar3.zzc);
                                                    jArr6 = zzaetVar3.zzh;
                                                    if (jArr6 == null) {
                                                    }
                                                    zzaewVar = zzaewVar2;
                                                } else {
                                                    zzdyVar10 = null;
                                                }
                                            } else {
                                                i28 = 0;
                                            }
                                            i29 = -1;
                                            zza3 = zzaebVar.zza();
                                            String str132 = zzaetVar2.zzf.zzm;
                                            if (zza3 != i49) {
                                                if (i27 == 0) {
                                                }
                                                zzn = 0;
                                            }
                                            long[] jArr242 = new long[zzb8];
                                            iArr = new int[zzb8];
                                            long[] jArr252 = new long[zzb8];
                                            i30 = i28;
                                            int[] iArr192 = new int[zzb8];
                                            int i972 = zzn2;
                                            int i982 = zzn3;
                                            int i992 = i27;
                                            int i1002 = i29;
                                            int i1012 = 0;
                                            int i1022 = 0;
                                            i31 = 0;
                                            int i1032 = 0;
                                            j6 = 0;
                                            long j182 = 0;
                                            int i1042 = zzn;
                                            i32 = 0;
                                            while (true) {
                                                if (i32 < zzb8) {
                                                }
                                                long j202 = j8 + iArr[i32];
                                                i31 = i41 - 1;
                                                i32++;
                                                zzb8 = i40;
                                                zzdyVar9 = zzdyVar2;
                                                j6 = j202;
                                                zzdyVar10 = zzdyVar3;
                                            }
                                            long j212 = j182 + i1022;
                                            if (zzdyVar11 != null) {
                                            }
                                            z7 = true;
                                            if (i30 == 0) {
                                            }
                                            jArr3 = jArr242;
                                            int i10622 = zzaetVar3.zza;
                                            iArr2 = iArr;
                                            if (true != z7) {
                                            }
                                            StringBuilder sb22 = new StringBuilder();
                                            i38 = zzb8;
                                            sb22.append("Inconsistent stbl box for track ");
                                            sb22.append(i10622);
                                            sb22.append(": remainingSynchronizationSamples ");
                                            sb22.append(i34);
                                            sb22.append(", remainingSamplesAtTimestampDelta ");
                                            sb22.append(i35);
                                            sb22.append(", remainingSamplesInChunk ");
                                            sb22.append(i36);
                                            sb22.append(", remainingTimestampDeltaChanges ");
                                            sb22.append(i33);
                                            sb22.append(", remainingSamplesAtTimestampOffset ");
                                            sb22.append(i37);
                                            sb22.append(str14);
                                            Log.w(str, sb22.toString());
                                            jArr4 = jArr252;
                                            iArr3 = iArr192;
                                            i39 = i1012;
                                            j7 = j212;
                                            jArr5 = jArr3;
                                            iArr4 = iArr2;
                                            zzb8 = i38;
                                            long zzw22222 = zzeg.zzw(j7, 1000000L, zzaetVar3.zzc);
                                            jArr6 = zzaetVar3.zzh;
                                            if (jArr6 == null) {
                                            }
                                            zzaewVar = zzaewVar2;
                                        }
                                        arrayList2 = arrayList;
                                        arrayList2.add(zzaewVar);
                                    } else {
                                        arrayList2 = arrayList;
                                    }
                                }
                            } else {
                                zze6 = 65536;
                                zze7 = SupportMenu.CATEGORY_MASK;
                            }
                        }
                        zze5 = 0;
                    }
                    if (zze5 == 0) {
                        if (zze6 == -65536) {
                            if (zze7 != 65536) {
                                i52 = zze7;
                            } else if (zze8 == 0) {
                                i2 = 270;
                                zzaec zzaecVar22 = new zzaec(zze4, j2, i2);
                                if (j == -9223372036854775807L) {
                                }
                                zzdy zzdyVar52 = zzb.zza;
                                zzdyVar52.zzF(8);
                                zzdyVar52.zzG(zzadw.zze(zzdyVar52.zze()) == 0 ? 8 : 16);
                                long zzs4 = zzdyVar52.zzs();
                                if (j3 != -9223372036854775807L) {
                                }
                                zzadu zza52 = zza4.zza(1835626086);
                                Objects.requireNonNull(zza52);
                                zzadu zza62 = zza52.zza(1937007212);
                                Objects.requireNonNull(zza62);
                                zzadv zzb42 = zza4.zzb(1835296868);
                                Objects.requireNonNull(zzb42);
                                Pair zzj2 = zzj(zzb42.zza);
                                zzadv zzb52 = zza62.zzb(1937011556);
                                Objects.requireNonNull(zzb52);
                                zzdy zzdyVar62 = zzb52.zza;
                                i3 = zzaecVar22.zza;
                                i4 = zzaecVar22.zzc;
                                String str92 = (String) zzj2.second;
                                zzdyVar62.zzF(12);
                                zze = zzdyVar62.zze();
                                zzadz zzadzVar62 = new zzadz(zze);
                                i5 = 0;
                                while (i5 < zze) {
                                }
                                zzadzVar = zzadzVar62;
                                int i682 = zze2;
                                arrayList = arrayList3;
                                zzaec zzaecVar32 = zzaecVar22;
                                Pair pair22 = zzj2;
                                str = str8;
                                i49 = -1;
                                zzaduVar2 = zzaduVar5;
                                zza2 = zzaduVar2.zza(1701082227);
                                if (zza2 != null) {
                                }
                                jArr = null;
                                jArr2 = null;
                                if (zzadzVar.zzb == null) {
                                }
                            }
                            zze6 = SupportMenu.CATEGORY_MASK;
                        } else {
                            i52 = zze7;
                        }
                        zze5 = 0;
                    } else {
                        i52 = zze7;
                    }
                    i2 = (zze5 == -65536 && zze6 == 0 && i52 == 0 && zze8 == -65536) ? 180 : 0;
                    zzaec zzaecVar222 = new zzaec(zze4, j2, i2);
                    if (j == -9223372036854775807L) {
                    }
                    zzdy zzdyVar522 = zzb.zza;
                    zzdyVar522.zzF(8);
                    zzdyVar522.zzG(zzadw.zze(zzdyVar522.zze()) == 0 ? 8 : 16);
                    long zzs42 = zzdyVar522.zzs();
                    if (j3 != -9223372036854775807L) {
                    }
                    zzadu zza522 = zza4.zza(1835626086);
                    Objects.requireNonNull(zza522);
                    zzadu zza622 = zza522.zza(1937007212);
                    Objects.requireNonNull(zza622);
                    zzadv zzb422 = zza4.zzb(1835296868);
                    Objects.requireNonNull(zzb422);
                    Pair zzj22 = zzj(zzb422.zza);
                    zzadv zzb522 = zza622.zzb(1937011556);
                    Objects.requireNonNull(zzb522);
                    zzdy zzdyVar622 = zzb522.zza;
                    i3 = zzaecVar222.zza;
                    i4 = zzaecVar222.zzc;
                    String str922 = (String) zzj22.second;
                    zzdyVar622.zzF(12);
                    zze = zzdyVar622.zze();
                    zzadz zzadzVar622 = new zzadz(zze);
                    i5 = 0;
                    while (i5 < zze) {
                    }
                    zzadzVar = zzadzVar622;
                    int i6822 = zze2;
                    arrayList = arrayList3;
                    zzaec zzaecVar322 = zzaecVar222;
                    Pair pair222 = zzj22;
                    str = str8;
                    i49 = -1;
                    zzaduVar2 = zzaduVar5;
                    zza2 = zzaduVar2.zza(1701082227);
                    if (zza2 != null) {
                    }
                    jArr = null;
                    jArr2 = null;
                    if (zzadzVar.zzb == null) {
                    }
                }
                zzaetVar = null;
                zzaetVar2 = (zzaet) zzfoiVar2.apply(zzaetVar);
                if (zzaetVar2 == null) {
                }
            }
            i48 = i + 1;
            zzvVar3 = zzvVar;
            arrayList3 = arrayList2;
            zzaduVar4 = zzaduVar;
        }
        return arrayList3;
    }

    public static void zzd(zzdy zzdyVar) {
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(4);
        if (zzdyVar.zze() != 1751411826) {
            zzc += 4;
        }
        zzdyVar.zzF(zzc);
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

    private static int zzf(zzdy zzdyVar) {
        int zzk = zzdyVar.zzk();
        int i = zzk & WorkQueueKt.MASK;
        while ((zzk & 128) == 128) {
            zzk = zzdyVar.zzk();
            i = (i << 7) | (zzk & WorkQueueKt.MASK);
        }
        return i;
    }

    private static int zzg(zzdy zzdyVar) {
        zzdyVar.zzF(16);
        return zzdyVar.zze();
    }

    private static Pair zzh(zzadu zzaduVar) {
        zzadv zzb = zzaduVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzdy zzdyVar = zzb.zza;
        zzdyVar.zzF(8);
        int zze = zzadw.zze(zzdyVar.zze());
        int zzn = zzdyVar.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        for (int i = 0; i < zzn; i++) {
            jArr[i] = zze == 1 ? zzdyVar.zzt() : zzdyVar.zzs();
            jArr2[i] = zze == 1 ? zzdyVar.zzr() : zzdyVar.zze();
            if (zzdyVar.zzy() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzdyVar.zzG(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzdy zzdyVar, int i) {
        zzdyVar.zzF(i + 12);
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        if ((zzk & 128) != 0) {
            zzdyVar.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzdyVar.zzG(zzdyVar.zzo());
        }
        if ((zzk & 32) != 0) {
            zzdyVar.zzG(2);
        }
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        String zzd = zzbo.zzd(zzdyVar.zzk());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return Pair.create(zzd, null);
        }
        zzdyVar.zzG(12);
        zzdyVar.zzG(1);
        int zzf = zzf(zzdyVar);
        byte[] bArr = new byte[zzf];
        zzdyVar.zzB(bArr, 0, zzf);
        return Pair.create(zzd, bArr);
    }

    private static Pair zzj(zzdy zzdyVar) {
        zzdyVar.zzF(8);
        int zze = zzadw.zze(zzdyVar.zze());
        zzdyVar.zzG(zze == 0 ? 8 : 16);
        long zzs = zzdyVar.zzs();
        zzdyVar.zzG(zze == 0 ? 4 : 8);
        int zzo = zzdyVar.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzo >> 10) & 31) + 96));
        sb.append((char) (((zzo >> 5) & 31) + 96));
        sb.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb.toString());
    }

    private static Pair zzk(zzdy zzdyVar, int i, int i2) throws zzbp {
        Integer num;
        zzaeu zzaeuVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzc = zzdyVar.zzc();
        while (zzc - i < i2) {
            zzdyVar.zzF(zzc);
            int zze = zzdyVar.zze();
            zzyw.zzb(zze > 0, "childAtomSize must be positive");
            if (zzdyVar.zze() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zze) {
                    zzdyVar.zzF(i5);
                    int zze2 = zzdyVar.zze();
                    int zze3 = zzdyVar.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzdyVar.zze());
                    } else if (zze3 == 1935894637) {
                        zzdyVar.zzG(4);
                        str = zzdyVar.zzx(4, zzfog.zzc);
                    } else if (zze3 == 1935894633) {
                        i6 = i5;
                        i7 = zze2;
                    }
                    i5 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzyw.zzb(num2 != null, "frma atom is mandatory");
                    zzyw.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzaeuVar = null;
                            break;
                        }
                        zzdyVar.zzF(i8);
                        int zze4 = zzdyVar.zze();
                        if (zzdyVar.zze() == 1952804451) {
                            int zze5 = zzdyVar.zze();
                            zzdyVar.zzG(1);
                            if (zzadw.zze(zze5) == 0) {
                                zzdyVar.zzG(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzk = zzdyVar.zzk();
                                int i9 = (zzk & 240) >> 4;
                                i3 = zzk & 15;
                                i4 = i9;
                            }
                            boolean z = zzdyVar.zzk() == 1;
                            int zzk2 = zzdyVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzdyVar.zzB(bArr2, 0, 16);
                            if (z && zzk2 == 0) {
                                int zzk3 = zzdyVar.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzdyVar.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaeuVar = new zzaeu(z, str, zzk2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zze4;
                        }
                    }
                    zzyw.zzb(zzaeuVar != null, "tenc atom is mandatory");
                    int i10 = zzeg.zza;
                    create = Pair.create(num, zzaeuVar);
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

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzm(zzdy zzdyVar, int i, int i2, int i3, int i4, String str, boolean z, zzv zzvVar, zzadz zzadzVar, int i5) throws zzbp {
        int i6;
        int zzl;
        int zze;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str2;
        boolean z2;
        boolean z3;
        int i13 = i2;
        int i14 = i3;
        zzv zzvVar2 = zzvVar;
        zzdyVar.zzF(i13 + 16);
        if (z) {
            i6 = zzdyVar.zzo();
            zzdyVar.zzG(6);
        } else {
            zzdyVar.zzG(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzo = zzdyVar.zzo();
            zzdyVar.zzG(6);
            zzl = zzdyVar.zzl();
            zzdyVar.zzF(zzdyVar.zzc() - 4);
            zze = zzdyVar.zze();
            if (i6 == 1) {
                zzdyVar.zzG(16);
            }
            i7 = zzo;
        } else {
            if (i6 != 2) {
                return;
            }
            zzdyVar.zzG(16);
            zzl = (int) Math.round(Double.longBitsToDouble(zzdyVar.zzr()));
            i7 = zzdyVar.zzn();
            zzdyVar.zzG(20);
            zze = 0;
        }
        int zzc = zzdyVar.zzc();
        int i15 = 1701733217;
        int i16 = i;
        if (i16 == 1701733217) {
            Pair zzk = zzk(zzdyVar, i13, i14);
            if (zzk != null) {
                i15 = ((Integer) zzk.first).intValue();
                zzvVar2 = zzvVar2 == null ? null : zzvVar2.zzb(((zzaeu) zzk.second).zzb);
                zzadzVar.zza[i5] = (zzaeu) zzk.second;
            }
            zzdyVar.zzF(zzc);
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
                String str5 = null;
                List list = null;
                while (zzc - i13 < i14) {
                    zzdyVar.zzF(zzc);
                    int zze2 = zzdyVar.zze();
                    String str6 = "childAtomSize must be positive";
                    zzyw.zzb(zze2 > 0, "childAtomSize must be positive");
                    int zze3 = zzdyVar.zze();
                    if (zze3 == 1835557187) {
                        int i17 = zze2 - 13;
                        byte[] bArr = new byte[i17];
                        zzdyVar.zzF(zzc + 13);
                        zzdyVar.zzB(bArr, 0, i17);
                        list = zzfrh.zzp(bArr);
                        i9 = i8;
                    } else {
                        if (zze3 == 1702061171) {
                            i9 = i8;
                            i10 = zzc;
                            i11 = -1;
                        } else if (z && zze3 == 2002876005) {
                            int zzc2 = zzdyVar.zzc();
                            if (zzc2 >= zzc) {
                                i12 = zzc2;
                                str2 = null;
                                z2 = true;
                            } else {
                                i12 = zzc2;
                                str2 = null;
                                z2 = false;
                            }
                            zzyw.zzb(z2, str2);
                            i10 = i12;
                            while (true) {
                                if (i10 - zzc >= zze2) {
                                    i9 = i8;
                                    i11 = -1;
                                    i10 = -1;
                                    break;
                                }
                                zzdyVar.zzF(i10);
                                int zze4 = zzdyVar.zze();
                                if (zze4 > 0) {
                                    i9 = i8;
                                    z3 = true;
                                } else {
                                    i9 = i8;
                                    z3 = false;
                                }
                                zzyw.zzb(z3, str6);
                                String str7 = str6;
                                if (zzdyVar.zze() == 1702061171) {
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
                                zzdyVar.zzF(zzc + 8);
                                zzadzVar.zzb = zzxx.zzc(zzdyVar, Integer.toString(i4), str, zzvVar2);
                            } else if (zze3 == 1684366131) {
                                zzdyVar.zzF(zzc + 8);
                                zzadzVar.zzb = zzxx.zzd(zzdyVar, Integer.toString(i4), str, zzvVar2);
                            } else if (zze3 == 1684103988) {
                                zzdyVar.zzF(zzc + 8);
                                String num = Integer.toString(i4);
                                int i18 = zzya.zza;
                                zzdyVar.zzG(1);
                                int i19 = 1 != ((zzdyVar.zzk() & 32) >> 5) ? 44100 : 48000;
                                zzab zzabVar = new zzab();
                                zzabVar.zzH(num);
                                zzabVar.zzS("audio/ac4");
                                zzabVar.zzw(2);
                                zzabVar.zzT(i19);
                                zzabVar.zzB(zzvVar2);
                                zzabVar.zzK(str);
                                zzadzVar.zzb = zzabVar.zzY();
                            } else if (zze3 == 1684892784) {
                                if (zze <= 0) {
                                    throw zzbp.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + zze, null);
                                }
                                zzl = zze;
                                i7 = 2;
                            } else if (zze3 == 1684305011) {
                                zzab zzabVar2 = new zzab();
                                zzabVar2.zzG(i4);
                                zzabVar2.zzS(str4);
                                zzabVar2.zzw(i7);
                                zzabVar2.zzT(zzl);
                                zzabVar2.zzB(zzvVar2);
                                zzabVar2.zzK(str);
                                zzadzVar.zzb = zzabVar2.zzY();
                            } else if (zze3 == 1682927731) {
                                int i20 = zze2 - 8;
                                byte[] bArr2 = zza;
                                byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length + i20);
                                zzdyVar.zzF(zzc + 8);
                                zzdyVar.zzB(copyOf, bArr2.length, i20);
                                list = zzzq.zza(copyOf);
                            } else {
                                if (zze3 == 1684425825) {
                                    int i21 = zze2 - 12;
                                    byte[] bArr3 = new byte[i21 + 4];
                                    bArr3[0] = 102;
                                    bArr3[1] = 76;
                                    bArr3[2] = 97;
                                    bArr3[3] = 67;
                                    zzdyVar.zzF(zzc + 12);
                                    zzdyVar.zzB(bArr3, 4, i21);
                                    list = zzfrh.zzp(bArr3);
                                } else if (zze3 == 1634492771) {
                                    int i22 = zze2 - 12;
                                    byte[] bArr4 = new byte[i22];
                                    zzdyVar.zzF(zzc + 12);
                                    zzdyVar.zzB(bArr4, 0, i22);
                                    zzdy zzdyVar2 = new zzdy(bArr4);
                                    zzdyVar2.zzF(9);
                                    int zzk2 = zzdyVar2.zzk();
                                    zzdyVar2.zzF(20);
                                    Pair create = Pair.create(Integer.valueOf(zzdyVar2.zzn()), Integer.valueOf(zzk2));
                                    int intValue = ((Integer) create.first).intValue();
                                    int intValue2 = ((Integer) create.second).intValue();
                                    list = zzfrh.zzp(bArr4);
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
                            Pair zzi = zzi(zzdyVar, i10);
                            str4 = (String) zzi.first;
                            byte[] bArr5 = (byte[]) zzi.second;
                            if (bArr5 != null) {
                                if ("audio/mp4a-latm".equals(str4)) {
                                    zzxt zza2 = zzxu.zza(bArr5);
                                    zzl = zza2.zza;
                                    i7 = zza2.zzb;
                                    str5 = zza2.zzc;
                                }
                                list = zzfrh.zzp(bArr5);
                            }
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
                if (zzadzVar.zzb == null || str4 == null) {
                }
                zzab zzabVar3 = new zzab();
                zzabVar3.zzG(i4);
                zzabVar3.zzS(str4);
                zzabVar3.zzx(str5);
                zzabVar3.zzw(i7);
                zzabVar3.zzT(zzl);
                zzabVar3.zzN(i23);
                zzabVar3.zzI(list);
                zzabVar3.zzB(zzvVar2);
                zzabVar3.zzK(str);
                zzadzVar.zzb = zzabVar3.zzY();
                return;
            }
            str3 = "audio/amr-wb";
        }
        i8 = -1;
        String str42 = str3;
        String str52 = null;
        List list2 = null;
        while (zzc - i13 < i14) {
        }
        int i232 = i8;
        if (zzadzVar.zzb == null) {
        }
    }

    private static boolean zzn(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[zzeg.zzf(4, 0, i)] && jArr[zzeg.zzf(length + (-4), 0, i)] < j3 && j3 <= j;
    }
}
