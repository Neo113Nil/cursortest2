package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzail implements zzack {
    private static final byte[] zza = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzaf zzb;
    private zzaik zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private boolean zzE;
    private zzacn zzF;
    private zzadp[] zzG;
    private zzadp[] zzH;
    private boolean zzI;
    private final zzajy zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzek zzg;
    private final zzek zzh;
    private final zzek zzi;
    private final byte[] zzj;
    private final zzek zzk;
    private final zzafh zzl;
    private final zzek zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private zzfxr zzp;
    private int zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    private zzek zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzX("application/x-emsg");
        zzb = zzadVar.zzad();
    }

    @Deprecated
    public zzail() {
        this(zzajy.zza, 32, null, null, zzfxr.zzm(), null);
    }

    private static int zza(int i) throws zzbo {
        if (i >= 0) {
            return i;
        }
        throw zzbo.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzy zzg(List list) {
        int i;
        ArrayList arrayList;
        UUID[] uuidArr;
        zzais zzaisVar;
        UUID uuid;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList2 = null;
        while (i2 < size) {
            zzahw zzahwVar = (zzahw) list.get(i2);
            if (zzahwVar.zzd == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] zzM = zzahwVar.zza.zzM();
                zzek zzekVar = new zzek(zzM);
                if (zzekVar.zze() >= 32) {
                    zzekVar.zzK(0);
                    int zzb2 = zzekVar.zzb();
                    int zzg = zzekVar.zzg();
                    if (zzg != zzb2) {
                        zzea.zzf("PsshAtomUtil", "Advertised atom size (" + zzg + ") does not match buffer size: " + zzb2);
                    } else {
                        int zzg2 = zzekVar.zzg();
                        if (zzg2 != 1886614376) {
                            zzea.zzf("PsshAtomUtil", "Atom type is not pssh: " + zzg2);
                        } else {
                            int zze = zzahx.zze(zzekVar.zzg());
                            if (zze > 1) {
                                zzea.zzf("PsshAtomUtil", "Unsupported pssh version: " + zze);
                            } else {
                                UUID uuid2 = new UUID(zzekVar.zzt(), zzekVar.zzt());
                                if (zze == 1) {
                                    int zzp = zzekVar.zzp();
                                    uuidArr = new UUID[zzp];
                                    int i3 = 0;
                                    while (i3 < zzp) {
                                        uuidArr[i3] = new UUID(zzekVar.zzt(), zzekVar.zzt());
                                        i3++;
                                        i2 = i2;
                                        arrayList2 = arrayList2;
                                    }
                                    i = i2;
                                    arrayList = arrayList2;
                                } else {
                                    i = i2;
                                    arrayList = arrayList2;
                                    uuidArr = null;
                                }
                                int zzp2 = zzekVar.zzp();
                                int zzb3 = zzekVar.zzb();
                                if (zzp2 != zzb3) {
                                    zzea.zzf("PsshAtomUtil", "Atom data size (" + zzp2 + ") does not match the bytes left: " + zzb3);
                                    zzaisVar = null;
                                    uuid = zzaisVar == null ? null : zzaisVar.zza;
                                    if (uuid == null) {
                                        zzea.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                        arrayList2 = arrayList;
                                    } else {
                                        arrayList2 = arrayList;
                                        arrayList2.add(new zzx(uuid, null, "video/mp4", zzM));
                                        i2 = i + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzp2];
                                    zzekVar.zzG(bArr, 0, zzp2);
                                    zzaisVar = new zzais(uuid2, zze, bArr, uuidArr);
                                    if (zzaisVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                arrayList = arrayList2;
                zzaisVar = null;
                if (zzaisVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList2 == null) {
            return null;
        }
        return new zzy(arrayList2);
    }

    private final void zzh() {
        this.zzq = 0;
        this.zzt = 0;
    }

    private static void zzk(zzek zzekVar, int i, zzaiy zzaiyVar) throws zzbo {
        zzekVar.zzK(i + 8);
        int zzg = zzekVar.zzg();
        if ((zzg & 1) != 0) {
            throw zzbo.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzg & 2) != 0;
        int zzp = zzekVar.zzp();
        if (zzp == 0) {
            Arrays.fill(zzaiyVar.zzl, 0, zzaiyVar.zze, false);
            return;
        }
        int i2 = zzaiyVar.zze;
        if (zzp != i2) {
            throw zzbo.zza("Senc sample count " + zzp + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzaiyVar.zzl, 0, zzp, z);
        zzaiyVar.zza(zzekVar.zzb());
        zzek zzekVar2 = zzaiyVar.zzn;
        zzekVar.zzG(zzekVar2.zzM(), 0, zzekVar2.zze());
        zzaiyVar.zzn.zzK(0);
        zzaiyVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0322, code lost:
    
        if (r0 < r5.zze) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzl(long j) throws zzbo {
        zzail zzailVar;
        SparseArray sparseArray;
        zzahv zzahvVar;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        zzahv zzahvVar2;
        int i7;
        zzaiy zzaiyVar;
        List list;
        byte[] bArr4;
        int i8;
        int i9;
        zzahv zzahvVar3;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        int i18;
        zzaih zzaihVar;
        int i19;
        long j2;
        boolean z4;
        long[] jArr;
        final zzail zzailVar2 = this;
        while (!zzailVar2.zzn.isEmpty() && ((zzahv) zzailVar2.zzn.peek()).zza == j) {
            zzahv zzahvVar4 = (zzahv) zzailVar2.zzn.pop();
            int i20 = zzahvVar4.zzd;
            int i21 = 12;
            int i22 = 8;
            if (i20 == 1836019574) {
                zzy zzg = zzg(zzahvVar4.zzb);
                zzahv zza2 = zzahvVar4.zza(1836475768);
                zza2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = -9223372036854775807L;
                int i23 = 0;
                while (i23 < size) {
                    zzahw zzahwVar = (zzahw) zza2.zzb.get(i23);
                    int i24 = zzahwVar.zzd;
                    if (i24 == 1953654136) {
                        zzek zzekVar = zzahwVar.zza;
                        zzekVar.zzK(i21);
                        Pair create = Pair.create(Integer.valueOf(zzekVar.zzg()), new zzaih(zzekVar.zzg() - 1, zzekVar.zzg(), zzekVar.zzg(), zzekVar.zzg()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaih) create.second);
                    } else if (i24 == 1835362404) {
                        zzek zzekVar2 = zzahwVar.zza;
                        zzekVar2.zzK(8);
                        j3 = zzahx.zze(zzekVar2.zzg()) == 0 ? zzekVar2.zzu() : zzekVar2.zzv();
                    }
                    i23++;
                    i21 = 12;
                }
                List zzd = zzaif.zzd(zzahvVar4, new zzacy(), j3, zzg, (zzailVar2.zzd & 16) != 0, false, new zzful(zzailVar2) { // from class: com.google.android.gms.internal.ads.zzaii
                    @Override // com.google.android.gms.internal.ads.zzful
                    public final Object apply(Object obj) {
                        return (zzaiw) obj;
                    }
                });
                int size2 = zzd.size();
                if (zzailVar2.zzf.size() == 0) {
                    for (int i25 = 0; i25 < size2; i25++) {
                        zzaiz zzaizVar = (zzaiz) zzd.get(i25);
                        zzaiw zzaiwVar = zzaizVar.zza;
                        zzailVar2.zzf.put(zzaiwVar.zza, new zzaik(zzailVar2.zzF.zzw(i25, zzaiwVar.zzb), zzaizVar, zzm(sparseArray2, zzaiwVar.zza)));
                        zzailVar2.zzy = Math.max(zzailVar2.zzy, zzaiwVar.zze);
                    }
                    zzailVar2.zzF.zzD();
                } else {
                    zzdi.zzf(zzailVar2.zzf.size() == size2);
                    for (int i26 = 0; i26 < size2; i26++) {
                        zzaiz zzaizVar2 = (zzaiz) zzd.get(i26);
                        zzaiw zzaiwVar2 = zzaizVar2.zza;
                        ((zzaik) zzailVar2.zzf.get(zzaiwVar2.zza)).zzh(zzaizVar2, zzm(sparseArray2, zzaiwVar2.zza));
                    }
                }
            } else {
                if (i20 == 1836019558) {
                    SparseArray sparseArray3 = zzailVar2.zzf;
                    int i27 = zzailVar2.zzd;
                    byte[] bArr5 = zzailVar2.zzj;
                    int size3 = zzahvVar4.zzc.size();
                    int i28 = 0;
                    while (i28 < size3) {
                        zzahv zzahvVar5 = (zzahv) zzahvVar4.zzc.get(i28);
                        if (zzahvVar5.zzd == 1953653094) {
                            zzahw zzb2 = zzahvVar5.zzb(1952868452);
                            zzb2.getClass();
                            zzek zzekVar3 = zzb2.zza;
                            zzekVar3.zzK(i22);
                            int zzg2 = zzekVar3.zzg();
                            zzaik zzaikVar = (zzaik) sparseArray3.get(zzekVar3.zzg());
                            if (zzaikVar == null) {
                                zzaikVar = null;
                            } else {
                                if ((zzg2 & 1) != 0) {
                                    long zzv = zzekVar3.zzv();
                                    zzaiy zzaiyVar2 = zzaikVar.zzb;
                                    zzaiyVar2.zzb = zzv;
                                    zzaiyVar2.zzc = zzv;
                                }
                                zzaih zzaihVar2 = zzaikVar.zze;
                                zzaikVar.zzb.zza = new zzaih((zzg2 & 2) != 0 ? zzekVar3.zzg() - 1 : zzaihVar2.zza, (zzg2 & 8) != 0 ? zzekVar3.zzg() : zzaihVar2.zzb, (zzg2 & 16) != 0 ? zzekVar3.zzg() : zzaihVar2.zzc, (zzg2 & 32) != 0 ? zzekVar3.zzg() : zzaihVar2.zzd);
                            }
                            if (zzaikVar != null) {
                                zzaiy zzaiyVar3 = zzaikVar.zzb;
                                long j4 = zzaiyVar3.zzp;
                                boolean z5 = zzaiyVar3.zzq;
                                zzaikVar.zzi();
                                zzaikVar.zzl = true;
                                zzahw zzb3 = zzahvVar5.zzb(1952867444);
                                if (zzb3 == null || (i27 & 2) != 0) {
                                    zzaiyVar3.zzp = j4;
                                    zzaiyVar3.zzq = z5;
                                } else {
                                    zzek zzekVar4 = zzb3.zza;
                                    zzekVar4.zzK(i22);
                                    zzaiyVar3.zzp = zzahx.zze(zzekVar4.zzg()) == 1 ? zzekVar4.zzv() : zzekVar4.zzu();
                                    zzaiyVar3.zzq = true;
                                }
                                List list2 = zzahvVar5.zzb;
                                int size4 = list2.size();
                                int i29 = 0;
                                int i30 = 0;
                                int i31 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i29 >= size4) {
                                        break;
                                    }
                                    SparseArray sparseArray4 = sparseArray3;
                                    zzahw zzahwVar2 = (zzahw) list2.get(i29);
                                    int i32 = size3;
                                    if (zzahwVar2.zzd == 1953658222) {
                                        zzek zzekVar5 = zzahwVar2.zza;
                                        zzekVar5.zzK(12);
                                        int zzp = zzekVar5.zzp();
                                        if (zzp > 0) {
                                            i31 += zzp;
                                            i30++;
                                        }
                                    }
                                    i29++;
                                    size3 = i32;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i2 = size3;
                                zzaikVar.zzh = 0;
                                zzaikVar.zzg = 0;
                                zzaikVar.zzf = 0;
                                zzaiy zzaiyVar4 = zzaikVar.zzb;
                                zzaiyVar4.zzd = i30;
                                zzaiyVar4.zze = i31;
                                if (zzaiyVar4.zzg.length < i30) {
                                    zzaiyVar4.zzf = new long[i30];
                                    zzaiyVar4.zzg = new int[i30];
                                }
                                if (zzaiyVar4.zzh.length < i31) {
                                    int i33 = (i31 * 125) / 100;
                                    zzaiyVar4.zzh = new int[i33];
                                    zzaiyVar4.zzi = new long[i33];
                                    zzaiyVar4.zzj = new boolean[i33];
                                    zzaiyVar4.zzl = new boolean[i33];
                                }
                                int i34 = 0;
                                int i35 = 0;
                                int i36 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i34 >= size4) {
                                        break;
                                    }
                                    zzahw zzahwVar3 = (zzahw) list2.get(i34);
                                    if (zzahwVar3.zzd == i4) {
                                        int i37 = i35 + 1;
                                        zzek zzekVar6 = zzahwVar3.zza;
                                        zzekVar6.zzK(8);
                                        int zzg3 = zzekVar6.zzg();
                                        list = list2;
                                        zzaiw zzaiwVar3 = zzaikVar.zzd.zza;
                                        i9 = size4;
                                        zzaiy zzaiyVar5 = zzaikVar.zzb;
                                        zzaih zzaihVar3 = zzaiyVar5.zza;
                                        int i38 = zzet.zza;
                                        zzaiyVar5.zzg[i35] = zzekVar6.zzp();
                                        long[] jArr2 = zzaiyVar5.zzf;
                                        i6 = i34;
                                        zzahvVar2 = zzahvVar4;
                                        long j6 = zzaiyVar5.zzb;
                                        jArr2[i35] = j6;
                                        if ((zzg3 & 1) != 0) {
                                            i8 = i28;
                                            zzahvVar3 = zzahvVar5;
                                            i10 = i36;
                                            jArr2[i35] = j6 + zzekVar6.zzg();
                                        } else {
                                            i8 = i28;
                                            zzahvVar3 = zzahvVar5;
                                            i10 = i36;
                                        }
                                        boolean z6 = (zzg3 & 4) != 0;
                                        int i39 = zzaihVar3.zzd;
                                        if (z6) {
                                            i39 = zzekVar6.zzg();
                                        }
                                        int i40 = zzg3 & 256;
                                        int i41 = zzg3 & 512;
                                        int i42 = zzg3 & 1024;
                                        int i43 = zzg3 & 2048;
                                        long[] jArr3 = zzaiwVar3.zzh;
                                        if (jArr3 != null) {
                                            i11 = i39;
                                            bArr4 = bArr5;
                                            if (jArr3.length != 1 || (jArr = zzaiwVar3.zzi) == null) {
                                                z2 = z6;
                                                i12 = i42;
                                            } else {
                                                long j7 = jArr3[0];
                                                if (j7 == 0) {
                                                    z2 = z6;
                                                    i12 = i42;
                                                } else {
                                                    z2 = z6;
                                                    long zzt = zzet.zzt(j7 + jArr[0], 1000000L, zzaiwVar3.zzd, RoundingMode.FLOOR);
                                                    i12 = i42;
                                                }
                                                j5 = zzaiwVar3.zzi[0];
                                            }
                                        } else {
                                            i11 = i39;
                                            bArr4 = bArr5;
                                            i12 = i42;
                                            z2 = z6;
                                        }
                                        int[] iArr = zzaiyVar5.zzh;
                                        long[] jArr4 = zzaiyVar5.zzi;
                                        boolean[] zArr = zzaiyVar5.zzj;
                                        zzaiyVar = zzaiyVar3;
                                        boolean z7 = zzaiwVar3.zzb == 2 && (i27 & 1) != 0;
                                        i36 = i10 + zzaiyVar5.zzg[i35];
                                        i7 = i27;
                                        boolean z8 = z7;
                                        long j8 = zzaiwVar3.zzc;
                                        long j9 = zzaiyVar5.zzp;
                                        int i44 = i10;
                                        while (i44 < i36) {
                                            if (i40 != 0) {
                                                i13 = i40;
                                                i14 = zzekVar6.zzg();
                                            } else {
                                                i13 = i40;
                                                i14 = zzaihVar3.zzb;
                                            }
                                            zza(i14);
                                            if (i41 != 0) {
                                                i16 = zzekVar6.zzg();
                                                i15 = i41;
                                            } else {
                                                i15 = i41;
                                                i16 = zzaihVar3.zzc;
                                            }
                                            zza(i16);
                                            if (i12 != 0) {
                                                i17 = zzekVar6.zzg();
                                            } else {
                                                if (i44 == 0) {
                                                    if (z2) {
                                                        i17 = i11;
                                                        i44 = 0;
                                                    } else {
                                                        i44 = 0;
                                                    }
                                                }
                                                i17 = zzaihVar3.zzd;
                                            }
                                            if (i43 != 0) {
                                                z3 = z2;
                                                i18 = i36;
                                                zzaihVar = zzaihVar3;
                                                i19 = zzekVar6.zzg();
                                            } else {
                                                z3 = z2;
                                                i18 = i36;
                                                zzaihVar = zzaihVar3;
                                                i19 = 0;
                                            }
                                            long zzt2 = zzet.zzt((i19 + j9) - j5, 1000000L, j8, RoundingMode.FLOOR);
                                            jArr4[i44] = zzt2;
                                            if (zzaiyVar5.zzq) {
                                                j2 = j8;
                                            } else {
                                                j2 = j8;
                                                jArr4[i44] = zzt2 + zzaikVar.zzd.zzh;
                                            }
                                            iArr[i44] = i16;
                                            if (((i17 >> 16) & 1) == 0) {
                                                if (!z8) {
                                                    z4 = true;
                                                } else if (i44 == 0) {
                                                    z4 = true;
                                                    i44 = 0;
                                                }
                                                zArr[i44] = z4;
                                                j9 += i14;
                                                i44++;
                                                j8 = j2;
                                                i40 = i13;
                                                i41 = i15;
                                                z2 = z3;
                                                zzaihVar3 = zzaihVar;
                                                i36 = i18;
                                            }
                                            z4 = false;
                                            zArr[i44] = z4;
                                            j9 += i14;
                                            i44++;
                                            j8 = j2;
                                            i40 = i13;
                                            i41 = i15;
                                            z2 = z3;
                                            zzaihVar3 = zzaihVar;
                                            i36 = i18;
                                        }
                                        zzaiyVar5.zzp = j9;
                                        i35 = i37;
                                    } else {
                                        i6 = i34;
                                        zzahvVar2 = zzahvVar4;
                                        i7 = i27;
                                        zzaiyVar = zzaiyVar3;
                                        list = list2;
                                        bArr4 = bArr5;
                                        i8 = i28;
                                        i9 = size4;
                                        zzahvVar3 = zzahvVar5;
                                    }
                                    i34 = i6 + 1;
                                    list2 = list;
                                    size4 = i9;
                                    zzahvVar4 = zzahvVar2;
                                    i28 = i8;
                                    zzahvVar5 = zzahvVar3;
                                    bArr5 = bArr4;
                                    zzaiyVar3 = zzaiyVar;
                                    i27 = i7;
                                    i4 = 1953658222;
                                }
                                zzahvVar = zzahvVar4;
                                i = i27;
                                zzaiy zzaiyVar6 = zzaiyVar3;
                                byte[] bArr6 = bArr5;
                                i3 = i28;
                                zzahv zzahvVar6 = zzahvVar5;
                                zzaiw zzaiwVar4 = zzaikVar.zzd.zza;
                                zzaih zzaihVar4 = zzaiyVar6.zza;
                                zzaihVar4.getClass();
                                zzaix zza3 = zzaiwVar4.zza(zzaihVar4.zza);
                                zzahw zzb4 = zzahvVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    zza3.getClass();
                                    zzek zzekVar7 = zzb4.zza;
                                    zzekVar7.zzK(8);
                                    if ((zzekVar7.zzg() & 1) == 1) {
                                        zzekVar7.zzL(8);
                                    }
                                    int zzm = zzekVar7.zzm();
                                    int zzp2 = zzekVar7.zzp();
                                    int i45 = zzaiyVar6.zze;
                                    if (zzp2 > i45) {
                                        throw zzbo.zza("Saiz sample count " + zzp2 + " is greater than fragment sample count" + i45, null);
                                    }
                                    int i46 = zza3.zzd;
                                    if (zzm == 0) {
                                        boolean[] zArr2 = zzaiyVar6.zzl;
                                        i5 = 0;
                                        for (int i47 = 0; i47 < zzp2; i47++) {
                                            int zzm2 = zzekVar7.zzm();
                                            i5 += zzm2;
                                            zArr2[i47] = zzm2 > i46;
                                        }
                                        z = false;
                                    } else {
                                        boolean z9 = zzm > i46;
                                        i5 = zzm * zzp2;
                                        z = false;
                                        Arrays.fill(zzaiyVar6.zzl, 0, zzp2, z9);
                                    }
                                    Arrays.fill(zzaiyVar6.zzl, zzp2, zzaiyVar6.zze, z);
                                    if (i5 > 0) {
                                        zzaiyVar6.zza(i5);
                                    }
                                }
                                zzahw zzb5 = zzahvVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzek zzekVar8 = zzb5.zza;
                                    zzekVar8.zzK(8);
                                    int zzg4 = zzekVar8.zzg();
                                    if ((zzg4 & 1) == 1) {
                                        zzekVar8.zzL(8);
                                    }
                                    int zzp3 = zzekVar8.zzp();
                                    if (zzp3 != 1) {
                                        throw zzbo.zza("Unexpected saio entry count: " + zzp3, null);
                                    }
                                    zzaiyVar6.zzc += zzahx.zze(zzg4) == 0 ? zzekVar8.zzu() : zzekVar8.zzv();
                                }
                                zzahw zzb6 = zzahvVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzk(zzb6.zza, 0, zzaiyVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzek zzekVar9 = null;
                                zzek zzekVar10 = null;
                                for (int i48 = 0; i48 < zzahvVar6.zzb.size(); i48++) {
                                    zzahw zzahwVar4 = (zzahw) zzahvVar6.zzb.get(i48);
                                    zzek zzekVar11 = zzahwVar4.zza;
                                    int i49 = zzahwVar4.zzd;
                                    if (i49 == 1935828848) {
                                        zzekVar11.zzK(12);
                                        if (zzekVar11.zzg() == 1936025959) {
                                            zzekVar9 = zzekVar11;
                                        }
                                    } else if (i49 == 1936158820) {
                                        zzekVar11.zzK(12);
                                        if (zzekVar11.zzg() == 1936025959) {
                                            zzekVar10 = zzekVar11;
                                        }
                                    }
                                }
                                if (zzekVar9 != null && zzekVar10 != null) {
                                    zzekVar9.zzK(8);
                                    int zze = zzahx.zze(zzekVar9.zzg());
                                    zzekVar9.zzL(4);
                                    if (zze == 1) {
                                        zzekVar9.zzL(4);
                                    }
                                    if (zzekVar9.zzg() != 1) {
                                        throw zzbo.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzekVar10.zzK(8);
                                    int zze2 = zzahx.zze(zzekVar10.zzg());
                                    zzekVar10.zzL(4);
                                    if (zze2 == 1) {
                                        if (zzekVar10.zzu() == 0) {
                                            throw zzbo.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zze2 >= 2) {
                                        zzekVar10.zzL(4);
                                    }
                                    if (zzekVar10.zzu() != 1) {
                                        throw zzbo.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzekVar10.zzL(1);
                                    int zzm3 = zzekVar10.zzm();
                                    int i50 = (zzm3 & 240) >> 4;
                                    int i51 = zzm3 & 15;
                                    if (zzekVar10.zzm() == 1) {
                                        int zzm4 = zzekVar10.zzm();
                                        byte[] bArr7 = new byte[16];
                                        zzekVar10.zzG(bArr7, 0, 16);
                                        if (zzm4 == 0) {
                                            int zzm5 = zzekVar10.zzm();
                                            byte[] bArr8 = new byte[zzm5];
                                            zzekVar10.zzG(bArr8, 0, zzm5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzaiyVar6.zzk = true;
                                        zzaiyVar6.zzm = new zzaix(true, str, zzm4, bArr7, i50, i51, bArr3);
                                    }
                                }
                                int size5 = zzahvVar6.zzb.size();
                                int i52 = 0;
                                while (i52 < size5) {
                                    zzahw zzahwVar5 = (zzahw) zzahvVar6.zzb.get(i52);
                                    if (zzahwVar5.zzd == 1970628964) {
                                        zzek zzekVar12 = zzahwVar5.zza;
                                        zzekVar12.zzK(8);
                                        bArr2 = bArr6;
                                        zzekVar12.zzG(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzk(zzekVar12, 16, zzaiyVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i52++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i28 = i3 + 1;
                                bArr5 = bArr;
                                size3 = i2;
                                sparseArray3 = sparseArray;
                                zzahvVar4 = zzahvVar;
                                i27 = i;
                                i22 = 8;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzahvVar = zzahvVar4;
                        i = i27;
                        i2 = size3;
                        i3 = i28;
                        bArr = bArr5;
                        i28 = i3 + 1;
                        bArr5 = bArr;
                        size3 = i2;
                        sparseArray3 = sparseArray;
                        zzahvVar4 = zzahvVar;
                        i27 = i;
                        i22 = 8;
                    }
                    zzy zzg5 = zzg(zzahvVar4.zzb);
                    zzailVar = this;
                    if (zzg5 != null) {
                        int size6 = zzailVar.zzf.size();
                        for (int i53 = 0; i53 < size6; i53++) {
                            zzaik zzaikVar2 = (zzaik) zzailVar.zzf.valueAt(i53);
                            zzaiw zzaiwVar5 = zzaikVar2.zzd.zza;
                            zzaih zzaihVar5 = zzaikVar2.zzb.zza;
                            int i54 = zzet.zza;
                            zzaix zza4 = zzaiwVar5.zza(zzaihVar5.zza);
                            zzy zzb7 = zzg5.zzb(zza4 != null ? zza4.zzb : null);
                            zzad zzb8 = zzaikVar2.zzd.zza.zzf.zzb();
                            zzb8.zzE(zzb7);
                            zzaikVar2.zza.zzl(zzb8.zzad());
                        }
                    }
                    if (zzailVar.zzx != -9223372036854775807L) {
                        int size7 = zzailVar.zzf.size();
                        for (int i55 = 0; i55 < size7; i55++) {
                            zzaik zzaikVar3 = (zzaik) zzailVar.zzf.valueAt(i55);
                            long j10 = zzailVar.zzx;
                            int i56 = zzaikVar3.zzf;
                            while (true) {
                                zzaiy zzaiyVar7 = zzaikVar3.zzb;
                                if (i56 < zzaiyVar7.zze && zzaiyVar7.zzi[i56] <= j10) {
                                    if (zzaiyVar7.zzj[i56]) {
                                        zzaikVar3.zzi = i56;
                                    }
                                    i56++;
                                }
                            }
                        }
                        zzailVar.zzx = -9223372036854775807L;
                    }
                } else {
                    zzailVar = zzailVar2;
                    if (!zzailVar.zzn.isEmpty()) {
                        ((zzahv) zzailVar.zzn.peek()).zzc(zzahvVar4);
                    }
                }
                zzailVar2 = zzailVar;
            }
        }
        zzh();
    }

    private static final zzaih zzm(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaih) sparseArray.valueAt(0);
        }
        zzaih zzaihVar = (zzaih) sparseArray.get(i);
        zzaihVar.getClass();
        return zzaihVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x009c, code lost:
    
        if (r33.zzq != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzaby) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00be, code lost:
    
        r3.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00cb, code lost:
    
        r3.zzL(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00d8, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00da, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0298, code lost:
    
        r33.zzq = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x029b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00e5, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e7, code lost:
    
        r33.zzB = r3 - 8;
        ((com.google.android.gms.internal.ads.zzaby) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0101, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0103, code lost:
    
        r33.zzC = r2.zzc(r33.zzB, 7);
        com.google.android.gms.internal.ads.zzabm.zzb(r33.zzB, r33.zzk);
        r2.zza.zzq(r33.zzk, 7);
        r3 = r33.zzC + 7;
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0128, code lost:
    
        r33.zzB += r3;
        r33.zzq = 4;
        r33.zzD = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0120, code lost:
    
        r3 = r2.zzc(r33.zzB, 0);
        r33.zzC = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0132, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x013e, code lost:
    
        if (r6 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0140, code lost:
    
        r3 = r33.zzC;
        r4 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0144, code lost:
    
        if (r3 >= r4) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0146, code lost:
    
        r33.zzC += r5.zzf(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0235, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x023d, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x023f, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0246, code lost:
    
        r5.zzs(r10, r20, r33.zzB, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0259, code lost:
    
        if (r33.zzo.isEmpty() != false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x025b, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaij) r33.zzo.removeFirst();
        r33.zzw -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x026e, code lost:
    
        if (r1.zzb == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0270, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0271, code lost:
    
        r5 = r33.zzG;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0275, code lost:
    
        if (r8 >= r6) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0277, code lost:
    
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzw, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0292, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0294, code lost:
    
        r33.zzA = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0244, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0151, code lost:
    
        r13 = r33.zzh.zzM();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0167, code lost:
    
        if (r33.zzC >= r33.zzB) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0169, code lost:
    
        r12 = r33.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x016d, code lost:
    
        if (r12 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x016f, code lost:
    
        ((com.google.android.gms.internal.ads.zzaby) r34).zzn(r13, r6, r14, r9);
        r33.zzh.zzK(r9);
        r12 = r33.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0180, code lost:
    
        if (r12 <= 0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0182, code lost:
    
        r33.zzD = r12 - 1;
        r33.zzg.zzK(r9);
        r5.zzq(r33.zzg, 4);
        r5.zzq(r33.zzh, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0199, code lost:
    
        if (r33.zzH.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x019b, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzfh.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x01a9, code lost:
    
        if ("video/avc".equals(r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01ad, code lost:
    
        if ((r17 & com.google.common.base.Ascii.US) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01b0, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01c1, code lost:
    
        r33.zzE = r9;
        r33.zzC += 5;
        r33.zzB += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0231, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x01b6, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01bd, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01c0, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x01d5, code lost:
    
        throw com.google.android.gms.internal.ads.zzbo.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x01d8, code lost:
    
        if (r33.zzE == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01da, code lost:
    
        r33.zzi.zzH(r12);
        ((com.google.android.gms.internal.ads.zzaby) r34).zzn(r33.zzi.zzM(), 0, r33.zzD, false);
        r5.zzq(r33.zzi, r33.zzD);
        r4 = r33.zzD;
        r8 = r33.zzi;
        r8 = com.google.android.gms.internal.ads.zzfh.zzb(r8.zzM(), r8.zze());
        r33.zzi.zzK("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzi.zzJ(r8);
        com.google.android.gms.internal.ads.zzabv.zza(r10, r33.zzi, r33.zzH);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0225, code lost:
    
        r33.zzC += r4;
        r33.zzD -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x021f, code lost:
    
        r4 = r5.zzf(r34, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        boolean z;
        boolean z2;
        long zzt;
        long zzt2;
        String str;
        String str2;
        long zzu;
        long j;
        long zzv;
        long zzv2;
        while (true) {
            int i = this.zzq;
            int i2 = 1;
            ?? r9 = 0;
            if (i == 0) {
                if (this.zzt == 0) {
                    if (!zzaclVar.zzn(this.zzm.zzM(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzt = 8;
                    this.zzm.zzK(0);
                    this.zzs = this.zzm.zzu();
                    this.zzr = this.zzm.zzg();
                }
                long j2 = this.zzs;
                if (j2 == 1) {
                    ((zzaby) zzaclVar).zzn(this.zzm.zzM(), 8, 8, false);
                    this.zzt += 8;
                    this.zzs = this.zzm.zzv();
                } else if (j2 == 0) {
                    long zzd = zzaclVar.zzd();
                    if (zzd == -1) {
                        zzd = !this.zzn.isEmpty() ? ((zzahv) this.zzn.peek()).zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzs = (zzd - zzaclVar.zzf()) + this.zzt;
                    }
                }
                long j3 = this.zzs;
                long j4 = this.zzt;
                if (j3 < j4) {
                    throw zzbo.zzc("Atom size less than header length (unsupported).");
                }
                long zzf = zzaclVar.zzf() - j4;
                int i3 = this.zzr;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzI) {
                    this.zzF.zzO(new zzadh(this.zzy, zzf));
                    this.zzI = true;
                }
                if (this.zzr == 1836019558) {
                    int size = this.zzf.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzaiy zzaiyVar = ((zzaik) this.zzf.valueAt(i4)).zzb;
                        zzaiyVar.zzc = zzf;
                        zzaiyVar.zzb = zzf;
                    }
                }
                int i5 = this.zzr;
                if (i5 == 1835295092) {
                    this.zzA = null;
                    this.zzv = zzf + this.zzs;
                    this.zzq = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long zzf2 = (zzaclVar.zzf() + this.zzs) - 8;
                    this.zzn.push(new zzahv(i5, zzf2));
                    if (this.zzs == this.zzt) {
                        zzl(zzf2);
                    } else {
                        zzh();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzt != 8) {
                        throw zzbo.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzs > 2147483647L) {
                        throw zzbo.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzek zzekVar = new zzek((int) this.zzs);
                    System.arraycopy(this.zzm.zzM(), 0, zzekVar.zzM(), 0, 8);
                    this.zzu = zzekVar;
                    this.zzq = 1;
                } else {
                    if (this.zzs > 2147483647L) {
                        throw zzbo.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzu = null;
                    this.zzq = 1;
                }
            } else if (i != 1) {
                long j5 = Long.MAX_VALUE;
                if (i != 2) {
                    zzaik zzaikVar = this.zzA;
                    if (zzaikVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j6 = Long.MAX_VALUE;
                    zzaik zzaikVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzaik zzaikVar3 = (zzaik) sparseArray.valueAt(i6);
                        z = zzaikVar3.zzl;
                        if (z || zzaikVar3.zzf != zzaikVar3.zzd.zzb) {
                            z2 = zzaikVar3.zzl;
                            if (!z2 || zzaikVar3.zzh != zzaikVar3.zzb.zzd) {
                                long zzd2 = zzaikVar3.zzd();
                                if (zzd2 < j6) {
                                    zzaikVar2 = zzaikVar3;
                                    j6 = zzd2;
                                }
                            }
                        }
                    }
                    if (zzaikVar2 == null) {
                        int zzf3 = (int) (this.zzv - zzaclVar.zzf());
                        if (zzf3 < 0) {
                            throw zzbo.zza("Offset to end of mdat was negative.", null);
                        }
                        ((zzaby) zzaclVar).zzo(zzf3, false);
                        zzh();
                    } else {
                        int zzd3 = (int) (zzaikVar2.zzd() - zzaclVar.zzf());
                        if (zzd3 < 0) {
                            zzea.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd3 = 0;
                        }
                        ((zzaby) zzaclVar).zzo(zzd3, false);
                        this.zzA = zzaikVar2;
                        zzaikVar = zzaikVar2;
                    }
                } else {
                    int size3 = this.zzf.size();
                    zzaik zzaikVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzaiy zzaiyVar2 = ((zzaik) this.zzf.valueAt(i7)).zzb;
                        if (zzaiyVar2.zzo) {
                            long j7 = zzaiyVar2.zzc;
                            if (j7 < j5) {
                                zzaikVar4 = (zzaik) this.zzf.valueAt(i7);
                                j5 = j7;
                            }
                        }
                    }
                    if (zzaikVar4 == null) {
                        this.zzq = 3;
                    } else {
                        int zzf4 = (int) (j5 - zzaclVar.zzf());
                        if (zzf4 < 0) {
                            throw zzbo.zza("Offset to encryption data was negative.", null);
                        }
                        zzaby zzabyVar = (zzaby) zzaclVar;
                        zzabyVar.zzo(zzf4, false);
                        zzaiy zzaiyVar3 = zzaikVar4.zzb;
                        zzek zzekVar2 = zzaiyVar3.zzn;
                        zzabyVar.zzn(zzekVar2.zzM(), 0, zzekVar2.zze(), false);
                        zzaiyVar3.zzn.zzK(0);
                        zzaiyVar3.zzo = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzs) - this.zzt;
                zzek zzekVar3 = this.zzu;
                if (zzekVar3 != null) {
                    ((zzaby) zzaclVar).zzn(zzekVar3.zzM(), 8, i8, false);
                    zzahw zzahwVar = new zzahw(this.zzr, zzekVar3);
                    long zzf5 = zzaclVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i9 = zzahwVar.zzd;
                        if (i9 == 1936286840) {
                            zzek zzekVar4 = zzahwVar.zza;
                            zzekVar4.zzK(8);
                            int zze = zzahx.zze(zzekVar4.zzg());
                            zzekVar4.zzL(4);
                            long zzu2 = zzekVar4.zzu();
                            if (zze == 0) {
                                zzv = zzekVar4.zzu();
                                zzv2 = zzekVar4.zzu();
                            } else {
                                zzv = zzekVar4.zzv();
                                zzv2 = zzekVar4.zzv();
                            }
                            long j8 = zzf5 + zzv2;
                            long zzt3 = zzet.zzt(zzv, 1000000L, zzu2, RoundingMode.FLOOR);
                            zzekVar4.zzL(2);
                            int zzq = zzekVar4.zzq();
                            int[] iArr = new int[zzq];
                            long[] jArr = new long[zzq];
                            long[] jArr2 = new long[zzq];
                            long[] jArr3 = new long[zzq];
                            long j9 = zzt3;
                            int i10 = 0;
                            while (i10 < zzq) {
                                int zzg = zzekVar4.zzg();
                                if ((zzg & Integer.MIN_VALUE) != 0) {
                                    throw zzbo.zza("Unhandled indirect reference", null);
                                }
                                long zzu3 = zzekVar4.zzu();
                                iArr[i10] = zzg & Integer.MAX_VALUE;
                                jArr[i10] = j8;
                                jArr3[i10] = j9;
                                long j10 = zzv + zzu3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                j9 = zzet.zzt(j10, 1000000L, zzu2, RoundingMode.FLOOR);
                                jArr5[i11] = j9 - jArr4[i11];
                                zzekVar4.zzL(4);
                                j8 += r3[i11];
                                i10 = i11 + 1;
                                iArr = iArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                zzv = j10;
                                jArr = jArr;
                            }
                            Pair create = Pair.create(Long.valueOf(zzt3), new zzabw(iArr, jArr, jArr2, jArr3));
                            this.zzz = ((Long) create.first).longValue();
                            this.zzF.zzO((zzadi) create.second);
                            this.zzI = true;
                        } else if (i9 == 1701671783) {
                            zzek zzekVar5 = zzahwVar.zza;
                            if (this.zzG.length != 0) {
                                zzekVar5.zzK(8);
                                int zze2 = zzahx.zze(zzekVar5.zzg());
                                if (zze2 == 0) {
                                    String zzx = zzekVar5.zzx((char) 0);
                                    zzx.getClass();
                                    String zzx2 = zzekVar5.zzx((char) 0);
                                    zzx2.getClass();
                                    long zzu4 = zzekVar5.zzu();
                                    zzt = zzet.zzt(zzekVar5.zzu(), 1000000L, zzu4, RoundingMode.FLOOR);
                                    long j11 = this.zzz;
                                    long j12 = j11 != -9223372036854775807L ? j11 + zzt : -9223372036854775807L;
                                    zzt2 = zzet.zzt(zzekVar5.zzu(), 1000L, zzu4, RoundingMode.FLOOR);
                                    str = zzx;
                                    str2 = zzx2;
                                    zzu = zzekVar5.zzu();
                                    j = j12;
                                } else if (zze2 != 1) {
                                    zzea.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + zze2);
                                } else {
                                    long zzu5 = zzekVar5.zzu();
                                    long zzt4 = zzet.zzt(zzekVar5.zzv(), 1000000L, zzu5, RoundingMode.FLOOR);
                                    long zzt5 = zzet.zzt(zzekVar5.zzu(), 1000L, zzu5, RoundingMode.FLOOR);
                                    long zzu6 = zzekVar5.zzu();
                                    String zzx3 = zzekVar5.zzx((char) 0);
                                    zzx3.getClass();
                                    String zzx4 = zzekVar5.zzx((char) 0);
                                    zzx4.getClass();
                                    zzt2 = zzt5;
                                    zzu = zzu6;
                                    str = zzx3;
                                    str2 = zzx4;
                                    j = zzt4;
                                    zzt = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzekVar5.zzb()];
                                zzekVar5.zzG(bArr, 0, zzekVar5.zzb());
                                zzek zzekVar6 = new zzek(this.zzl.zza(new zzafg(str, str2, zzt2, zzu, bArr)));
                                int zzb2 = zzekVar6.zzb();
                                for (zzadp zzadpVar : this.zzG) {
                                    zzekVar6.zzK(0);
                                    zzadpVar.zzq(zzekVar6, zzb2);
                                }
                                if (j == -9223372036854775807L) {
                                    this.zzo.addLast(new zzaij(zzt, true, zzb2));
                                    this.zzw += zzb2;
                                } else if (this.zzo.isEmpty()) {
                                    for (zzadp zzadpVar2 : this.zzG) {
                                        zzadpVar2.zzs(j, 1, zzb2, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new zzaij(j, false, zzb2));
                                    this.zzw += zzb2;
                                }
                            }
                        }
                    } else {
                        ((zzahv) this.zzn.peek()).zzd(zzahwVar);
                    }
                } else {
                    ((zzaby) zzaclVar).zzo(i8, false);
                }
                zzl(zzaclVar.zzf());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        int i;
        if ((this.zzd & 32) == 0) {
            zzacnVar = new zzakc(zzacnVar, this.zzc);
        }
        this.zzF = zzacnVar;
        zzh();
        zzadp[] zzadpVarArr = new zzadp[2];
        this.zzG = zzadpVarArr;
        int i2 = 100;
        int i3 = 0;
        if ((this.zzd & 4) != 0) {
            zzadpVarArr[0] = this.zzF.zzw(100, 5);
            i = 1;
            i2 = 101;
        } else {
            i = 0;
        }
        zzadp[] zzadpVarArr2 = (zzadp[]) zzet.zzP(this.zzG, i);
        this.zzG = zzadpVarArr2;
        for (zzadp zzadpVar : zzadpVarArr2) {
            zzadpVar.zzl(zzb);
        }
        this.zzH = new zzadp[this.zze.size()];
        while (i3 < this.zzH.length) {
            zzadp zzw = this.zzF.zzw(i2, 3);
            zzw.zzl((zzaf) this.zze.get(i3));
            this.zzH[i3] = zzw;
            i3++;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((zzaik) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzw = 0;
        this.zzx = j2;
        this.zzn.clear();
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        zzadm zza2 = zzaiv.zza(zzaclVar);
        this.zzp = zza2 != null ? zzfxr.zzn(zza2) : zzfxr.zzm();
        return zza2 == null;
    }

    public zzail(zzajy zzajyVar, int i, zzer zzerVar, zzaiw zzaiwVar, List list, zzadp zzadpVar) {
        this.zzc = zzajyVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafh();
        this.zzm = new zzek(16);
        this.zzg = new zzek(zzfh.zza);
        this.zzh = new zzek(5);
        this.zzi = new zzek();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzek(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzp = zzfxr.zzm();
        this.zzy = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzF = zzacn.zza;
        this.zzG = new zzadp[0];
        this.zzH = new zzadp[0];
    }
}
