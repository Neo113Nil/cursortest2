package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzafl implements zzzi {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzafh
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzafl.zza;
            return new zzzi[]{new zzafl(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzaf zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzzl zzD;
    private zzaap[] zzE;
    private zzaap[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzef zzf;
    private final zzef zzg;
    private final zzef zzh;
    private final byte[] zzi;
    private final zzef zzj;
    private final zzacg zzk;
    private final zzef zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzef zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzafk zzy;
    private int zzz;

    static {
        zzad zzadVar = new zzad();
        zzadVar.zzS("application/x-emsg");
        zzc = zzadVar.zzY();
    }

    public zzafl() {
        this(0, null);
    }

    private static int zze(int i) throws zzbu {
        if (i >= 0) {
            return i;
        }
        throw zzbu.zza("Unexpected negative value: " + i, null);
    }

    private static zzx zzf(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzaew zzaewVar = (zzaew) list.get(i);
            if (zzaewVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzH = zzaewVar.zza.zzH();
                UUID zza2 = zzafs.zza(zzH);
                if (zza2 == null) {
                    zzdw.zze("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzw(zza2, null, "video/mp4", zzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzx(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzef zzefVar, int i, zzafx zzafxVar) throws zzbu {
        zzefVar.zzF(i + 8);
        int zze = zzefVar.zze() & ViewCompat.MEASURED_SIZE_MASK;
        if ((zze & 1) != 0) {
            throw zzbu.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zze & 2) != 0;
        int zzn = zzefVar.zzn();
        if (zzn == 0) {
            Arrays.fill(zzafxVar.zzl, 0, zzafxVar.zze, false);
            return;
        }
        int i2 = zzafxVar.zze;
        if (zzn != i2) {
            throw zzbu.zza("Senc sample count " + zzn + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzafxVar.zzl, 0, zzn, z);
        zzafxVar.zza(zzefVar.zza());
        zzef zzefVar2 = zzafxVar.zzn;
        zzefVar.zzB(zzefVar2.zzH(), 0, zzefVar2.zzd());
        zzafxVar.zzn.zzF(0);
        zzafxVar.zzo = false;
    }

    private final void zzi(long j) throws zzbu {
        zzafl zzaflVar;
        SparseArray sparseArray;
        zzaev zzaevVar;
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
        zzaev zzaevVar2;
        byte[] bArr4;
        zzafx zzafxVar;
        List list;
        int i7;
        int i8;
        int i9;
        zzaev zzaevVar3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zzafg zzafgVar;
        long j2;
        final zzafl zzaflVar2 = this;
        while (!zzaflVar2.zzm.isEmpty() && ((zzaev) zzaflVar2.zzm.peek()).zza == j) {
            zzaev zzaevVar4 = (zzaev) zzaflVar2.zzm.pop();
            int i20 = zzaevVar4.zzd;
            int i21 = 12;
            int i22 = 8;
            if (i20 == 1836019574) {
                zzx zzf = zzf(zzaevVar4.zzb);
                zzaev zza2 = zzaevVar4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = -9223372036854775807L;
                int i23 = 0;
                while (i23 < size) {
                    zzaew zzaewVar = (zzaew) zza2.zzb.get(i23);
                    int i24 = zzaewVar.zzd;
                    if (i24 == 1953654136) {
                        zzef zzefVar = zzaewVar.zza;
                        zzefVar.zzF(i21);
                        Pair create = Pair.create(Integer.valueOf(zzefVar.zze()), new zzafg(zzefVar.zze() - 1, zzefVar.zze(), zzefVar.zze(), zzefVar.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzafg) create.second);
                    } else if (i24 == 1835362404) {
                        zzef zzefVar2 = zzaewVar.zza;
                        zzefVar2.zzF(8);
                        j3 = zzaex.zze(zzefVar2.zze()) == 0 ? zzefVar2.zzs() : zzefVar2.zzt();
                    }
                    i23++;
                    i21 = 12;
                }
                List zzc2 = zzaff.zzc(zzaevVar4, new zzzx(), j3, zzf, false, false, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzafi
                    @Override // com.google.android.gms.internal.ads.zzfsm
                    public final Object apply(Object obj) {
                        return (zzafv) obj;
                    }
                });
                int size2 = zzc2.size();
                if (zzaflVar2.zze.size() == 0) {
                    for (int i25 = 0; i25 < size2; i25++) {
                        zzafy zzafyVar = (zzafy) zzc2.get(i25);
                        zzafv zzafvVar = zzafyVar.zza;
                        zzaflVar2.zze.put(zzafvVar.zza, new zzafk(zzaflVar2.zzD.zzv(i25, zzafvVar.zzb), zzafyVar, zzj(sparseArray2, zzafvVar.zza)));
                        zzaflVar2.zzw = Math.max(zzaflVar2.zzw, zzafvVar.zze);
                    }
                    zzaflVar2.zzD.zzC();
                } else {
                    zzdd.zzf(zzaflVar2.zze.size() == size2);
                    for (int i26 = 0; i26 < size2; i26++) {
                        zzafy zzafyVar2 = (zzafy) zzc2.get(i26);
                        zzafv zzafvVar2 = zzafyVar2.zza;
                        ((zzafk) zzaflVar2.zze.get(zzafvVar2.zza)).zzh(zzafyVar2, zzj(sparseArray2, zzafvVar2.zza));
                    }
                }
            } else {
                if (i20 == 1836019558) {
                    SparseArray sparseArray3 = zzaflVar2.zze;
                    byte[] bArr5 = zzaflVar2.zzi;
                    int size3 = zzaevVar4.zzc.size();
                    int i27 = 0;
                    while (i27 < size3) {
                        zzaev zzaevVar5 = (zzaev) zzaevVar4.zzc.get(i27);
                        if (zzaevVar5.zzd == 1953653094) {
                            zzaew zzb2 = zzaevVar5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzef zzefVar3 = zzb2.zza;
                            zzefVar3.zzF(i22);
                            int zze = zzefVar3.zze() & ViewCompat.MEASURED_SIZE_MASK;
                            zzafk zzafkVar = (zzafk) sparseArray3.get(zzefVar3.zze());
                            if (zzafkVar == null) {
                                zzafkVar = null;
                            } else {
                                if ((zze & 1) != 0) {
                                    long zzt = zzefVar3.zzt();
                                    zzafx zzafxVar2 = zzafkVar.zzb;
                                    zzafxVar2.zzb = zzt;
                                    zzafxVar2.zzc = zzt;
                                }
                                zzafg zzafgVar2 = zzafkVar.zze;
                                zzafkVar.zzb.zza = new zzafg((zze & 2) != 0 ? zzefVar3.zze() - 1 : zzafgVar2.zza, (zze & 8) != 0 ? zzefVar3.zze() : zzafgVar2.zzb, (zze & 16) != 0 ? zzefVar3.zze() : zzafgVar2.zzc, (zze & 32) != 0 ? zzefVar3.zze() : zzafgVar2.zzd);
                            }
                            if (zzafkVar != null) {
                                zzafx zzafxVar3 = zzafkVar.zzb;
                                long j4 = zzafxVar3.zzp;
                                boolean z2 = zzafxVar3.zzq;
                                zzafkVar.zzi();
                                zzafkVar.zzl = true;
                                zzaew zzb3 = zzaevVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzef zzefVar4 = zzb3.zza;
                                    zzefVar4.zzF(i22);
                                    zzafxVar3.zzp = zzaex.zze(zzefVar4.zze()) == 1 ? zzefVar4.zzt() : zzefVar4.zzs();
                                    zzafxVar3.zzq = true;
                                } else {
                                    zzafxVar3.zzp = j4;
                                    zzafxVar3.zzq = z2;
                                }
                                List list2 = zzaevVar5.zzb;
                                int size4 = list2.size();
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i28 >= size4) {
                                        break;
                                    }
                                    zzaew zzaewVar2 = (zzaew) list2.get(i28);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzaewVar2.zzd == 1953658222) {
                                        zzef zzefVar5 = zzaewVar2.zza;
                                        zzefVar5.zzF(12);
                                        int zzn = zzefVar5.zzn();
                                        if (zzn > 0) {
                                            i30 += zzn;
                                            i29++;
                                        }
                                    }
                                    i28++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzafkVar.zzh = 0;
                                zzafkVar.zzg = 0;
                                zzafkVar.zzf = 0;
                                zzafx zzafxVar4 = zzafkVar.zzb;
                                zzafxVar4.zzd = i29;
                                zzafxVar4.zze = i30;
                                if (zzafxVar4.zzg.length < i29) {
                                    zzafxVar4.zzf = new long[i29];
                                    zzafxVar4.zzg = new int[i29];
                                }
                                if (zzafxVar4.zzh.length < i30) {
                                    int i31 = (i30 * 125) / 100;
                                    zzafxVar4.zzh = new int[i31];
                                    zzafxVar4.zzi = new long[i31];
                                    zzafxVar4.zzj = new boolean[i31];
                                    zzafxVar4.zzl = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i32 >= size4) {
                                        break;
                                    }
                                    zzaew zzaewVar3 = (zzaew) list2.get(i32);
                                    if (zzaewVar3.zzd == i4) {
                                        int i35 = i34 + 1;
                                        zzef zzefVar6 = zzaewVar3.zza;
                                        zzefVar6.zzF(8);
                                        int zze2 = zzefVar6.zze() & ViewCompat.MEASURED_SIZE_MASK;
                                        list = list2;
                                        zzafv zzafvVar3 = zzafkVar.zzd.zza;
                                        i7 = size3;
                                        zzafx zzafxVar5 = zzafkVar.zzb;
                                        i9 = size4;
                                        zzafg zzafgVar3 = zzafxVar5.zza;
                                        int i36 = zzen.zza;
                                        zzafxVar5.zzg[i34] = zzefVar6.zzn();
                                        long[] jArr = zzafxVar5.zzf;
                                        zzaevVar2 = zzaevVar4;
                                        bArr4 = bArr5;
                                        long j6 = zzafxVar5.zzb;
                                        jArr[i34] = j6;
                                        if ((zze2 & 1) != 0) {
                                            i6 = i32;
                                            jArr[i34] = j6 + zzefVar6.zze();
                                        } else {
                                            i6 = i32;
                                        }
                                        int i37 = zze2 & 4;
                                        int i38 = zzafgVar3.zzd;
                                        if (i37 != 0) {
                                            i38 = zzefVar6.zze();
                                        }
                                        int i39 = zze2 & 256;
                                        int i40 = zze2 & 512;
                                        int i41 = zze2 & 1024;
                                        int i42 = zze2 & 2048;
                                        int i43 = i38;
                                        long[] jArr2 = zzafvVar3.zzh;
                                        if (jArr2 != null) {
                                            i8 = i27;
                                            zzaevVar3 = zzaevVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) zzen.zzH(zzafvVar3.zzi))[0];
                                            }
                                        } else {
                                            i8 = i27;
                                            zzaevVar3 = zzaevVar5;
                                        }
                                        int[] iArr = zzafxVar5.zzh;
                                        long[] jArr3 = zzafxVar5.zzi;
                                        boolean[] zArr = zzafxVar5.zzj;
                                        zzafxVar = zzafxVar3;
                                        int i44 = zzafxVar5.zzg[i34] + i33;
                                        long j7 = zzafvVar3.zzc;
                                        int i45 = i33;
                                        long j8 = zzafxVar5.zzp;
                                        while (i45 < i44) {
                                            if (i39 != 0) {
                                                i10 = i39;
                                                i11 = zzefVar6.zze();
                                            } else {
                                                i10 = i39;
                                                i11 = zzafgVar3.zzb;
                                            }
                                            zze(i11);
                                            if (i40 != 0) {
                                                i12 = i40;
                                                i13 = zzefVar6.zze();
                                            } else {
                                                i12 = i40;
                                                i13 = zzafgVar3.zzc;
                                            }
                                            zze(i13);
                                            if (i41 != 0) {
                                                i14 = i37;
                                                i15 = zzefVar6.zze();
                                            } else {
                                                i14 = i37;
                                                if (i45 == 0) {
                                                    if (i37 != 0) {
                                                        i15 = i43;
                                                        i45 = 0;
                                                    } else {
                                                        i45 = 0;
                                                    }
                                                }
                                                i15 = zzafgVar3.zzd;
                                            }
                                            if (i42 != 0) {
                                                i16 = i44;
                                                i17 = i41;
                                                i18 = i42;
                                                i19 = zzefVar6.zze();
                                            } else {
                                                i16 = i44;
                                                i17 = i41;
                                                i18 = i42;
                                                i19 = 0;
                                            }
                                            long zzw = zzen.zzw((i19 + j8) - j5, 1000000L, j7);
                                            jArr3[i45] = zzw;
                                            if (zzafxVar5.zzq) {
                                                zzafgVar = zzafgVar3;
                                                j2 = j7;
                                            } else {
                                                zzafgVar = zzafgVar3;
                                                j2 = j7;
                                                jArr3[i45] = zzw + zzafkVar.zzd.zzh;
                                            }
                                            iArr[i45] = i13;
                                            zArr[i45] = 1 == (((i15 >> 16) & 1) ^ 1);
                                            j8 += i11;
                                            i45++;
                                            zzafgVar3 = zzafgVar;
                                            j7 = j2;
                                            i39 = i10;
                                            i40 = i12;
                                            i37 = i14;
                                            i44 = i16;
                                            i41 = i17;
                                            i42 = i18;
                                        }
                                        zzafxVar5.zzp = j8;
                                        i34 = i35;
                                        i33 = i44;
                                    } else {
                                        i6 = i32;
                                        zzaevVar2 = zzaevVar4;
                                        bArr4 = bArr5;
                                        zzafxVar = zzafxVar3;
                                        list = list2;
                                        i7 = size3;
                                        i8 = i27;
                                        i9 = size4;
                                        zzaevVar3 = zzaevVar5;
                                    }
                                    i32 = i6 + 1;
                                    list2 = list;
                                    size3 = i7;
                                    size4 = i9;
                                    zzaevVar4 = zzaevVar2;
                                    bArr5 = bArr4;
                                    i27 = i8;
                                    zzaevVar5 = zzaevVar3;
                                    zzafxVar3 = zzafxVar;
                                    i4 = 1953658222;
                                }
                                zzaevVar = zzaevVar4;
                                byte[] bArr6 = bArr5;
                                zzafx zzafxVar6 = zzafxVar3;
                                i = size3;
                                i3 = i27;
                                zzaev zzaevVar6 = zzaevVar5;
                                zzafv zzafvVar4 = zzafkVar.zzd.zza;
                                zzafg zzafgVar4 = zzafxVar6.zza;
                                Objects.requireNonNull(zzafgVar4);
                                zzafw zza3 = zzafvVar4.zza(zzafgVar4.zza);
                                zzaew zzb4 = zzaevVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzef zzefVar7 = zzb4.zza;
                                    int i46 = zza3.zzd;
                                    zzefVar7.zzF(8);
                                    if ((zzefVar7.zze() & 1) == 1) {
                                        zzefVar7.zzG(8);
                                    }
                                    int zzk = zzefVar7.zzk();
                                    int zzn2 = zzefVar7.zzn();
                                    int i47 = zzafxVar6.zze;
                                    if (zzn2 > i47) {
                                        throw zzbu.zza("Saiz sample count " + zzn2 + " is greater than fragment sample count" + i47, null);
                                    }
                                    if (zzk == 0) {
                                        boolean[] zArr2 = zzafxVar6.zzl;
                                        i5 = 0;
                                        for (int i48 = 0; i48 < zzn2; i48++) {
                                            int zzk2 = zzefVar7.zzk();
                                            i5 += zzk2;
                                            zArr2[i48] = zzk2 > i46;
                                        }
                                        z = false;
                                    } else {
                                        boolean z3 = zzk > i46;
                                        i5 = zzk * zzn2;
                                        z = false;
                                        Arrays.fill(zzafxVar6.zzl, 0, zzn2, z3);
                                    }
                                    Arrays.fill(zzafxVar6.zzl, zzn2, zzafxVar6.zze, z);
                                    if (i5 > 0) {
                                        zzafxVar6.zza(i5);
                                    }
                                }
                                zzaew zzb5 = zzaevVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzef zzefVar8 = zzb5.zza;
                                    zzefVar8.zzF(8);
                                    int zze3 = zzefVar8.zze();
                                    if ((zze3 & 1) == 1) {
                                        zzefVar8.zzG(8);
                                    }
                                    int zzn3 = zzefVar8.zzn();
                                    if (zzn3 != 1) {
                                        throw zzbu.zza("Unexpected saio entry count: " + zzn3, null);
                                    }
                                    zzafxVar6.zzc += zzaex.zze(zze3) == 0 ? zzefVar8.zzs() : zzefVar8.zzt();
                                }
                                zzaew zzb6 = zzaevVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzafxVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzef zzefVar9 = null;
                                zzef zzefVar10 = null;
                                for (int i49 = 0; i49 < zzaevVar6.zzb.size(); i49++) {
                                    zzaew zzaewVar4 = (zzaew) zzaevVar6.zzb.get(i49);
                                    zzef zzefVar11 = zzaewVar4.zza;
                                    int i50 = zzaewVar4.zzd;
                                    if (i50 == 1935828848) {
                                        zzefVar11.zzF(12);
                                        if (zzefVar11.zze() == 1936025959) {
                                            zzefVar9 = zzefVar11;
                                        }
                                    } else if (i50 == 1936158820) {
                                        zzefVar11.zzF(12);
                                        if (zzefVar11.zze() == 1936025959) {
                                            zzefVar10 = zzefVar11;
                                        }
                                    }
                                }
                                if (zzefVar9 != null && zzefVar10 != null) {
                                    zzefVar9.zzF(8);
                                    int zze4 = zzefVar9.zze();
                                    zzefVar9.zzG(4);
                                    if (zzaex.zze(zze4) == 1) {
                                        zzefVar9.zzG(4);
                                    }
                                    if (zzefVar9.zze() != 1) {
                                        throw zzbu.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzefVar10.zzF(8);
                                    int zze5 = zzaex.zze(zzefVar10.zze());
                                    zzefVar10.zzG(4);
                                    if (zze5 == 1) {
                                        if (zzefVar10.zzs() == 0) {
                                            throw zzbu.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zze5 >= 2) {
                                        zzefVar10.zzG(4);
                                    }
                                    if (zzefVar10.zzs() != 1) {
                                        throw zzbu.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzefVar10.zzG(1);
                                    int zzk3 = zzefVar10.zzk();
                                    int i51 = (zzk3 & 240) >> 4;
                                    int i52 = zzk3 & 15;
                                    if (zzefVar10.zzk() == 1) {
                                        int zzk4 = zzefVar10.zzk();
                                        byte[] bArr7 = new byte[16];
                                        zzefVar10.zzB(bArr7, 0, 16);
                                        if (zzk4 == 0) {
                                            int zzk5 = zzefVar10.zzk();
                                            byte[] bArr8 = new byte[zzk5];
                                            zzefVar10.zzB(bArr8, 0, zzk5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzafxVar6.zzk = true;
                                        zzafxVar6.zzm = new zzafw(true, str, zzk4, bArr7, i51, i52, bArr3);
                                    }
                                }
                                int size5 = zzaevVar6.zzb.size();
                                int i53 = 0;
                                while (i53 < size5) {
                                    zzaew zzaewVar5 = (zzaew) zzaevVar6.zzb.get(i53);
                                    if (zzaewVar5.zzd == 1970628964) {
                                        zzef zzefVar12 = zzaewVar5.zza;
                                        zzefVar12.zzF(8);
                                        bArr2 = bArr6;
                                        zzefVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzefVar12, 16, zzafxVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i53++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i2 = 8;
                                i22 = i2;
                                bArr5 = bArr;
                                size3 = i;
                                zzaevVar4 = zzaevVar;
                                i27 = i3 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzaevVar = zzaevVar4;
                        i = size3;
                        i2 = i22;
                        i3 = i27;
                        bArr = bArr5;
                        i22 = i2;
                        bArr5 = bArr;
                        size3 = i;
                        zzaevVar4 = zzaevVar;
                        i27 = i3 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzx zzf2 = zzf(zzaevVar4.zzb);
                    zzaflVar = this;
                    if (zzf2 != null) {
                        int size6 = zzaflVar.zze.size();
                        for (int i54 = 0; i54 < size6; i54++) {
                            zzafk zzafkVar2 = (zzafk) zzaflVar.zze.valueAt(i54);
                            zzafv zzafvVar5 = zzafkVar2.zzd.zza;
                            zzafg zzafgVar5 = zzafkVar2.zzb.zza;
                            int i55 = zzen.zza;
                            zzafw zza4 = zzafvVar5.zza(zzafgVar5.zza);
                            zzx zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzad zzb8 = zzafkVar2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzafkVar2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzaflVar.zzv != -9223372036854775807L) {
                        int size7 = zzaflVar.zze.size();
                        for (int i56 = 0; i56 < size7; i56++) {
                            zzafk zzafkVar3 = (zzafk) zzaflVar.zze.valueAt(i56);
                            long j9 = zzaflVar.zzv;
                            int i57 = zzafkVar3.zzf;
                            while (true) {
                                zzafx zzafxVar7 = zzafkVar3.zzb;
                                if (i57 < zzafxVar7.zze && zzafxVar7.zzi[i57] < j9) {
                                    if (zzafxVar7.zzj[i57]) {
                                        zzafkVar3.zzi = i57;
                                    }
                                    i57++;
                                }
                            }
                        }
                        zzaflVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzaflVar = zzaflVar2;
                    if (!zzaflVar.zzm.isEmpty()) {
                        ((zzaev) zzaflVar.zzm.peek()).zzc(zzaevVar4);
                    }
                }
                zzaflVar2 = zzaflVar;
            }
        }
        zzg();
    }

    private static final zzafg zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzafg) sparseArray.valueAt(0);
        }
        zzafg zzafgVar = (zzafg) sparseArray.get(i);
        Objects.requireNonNull(zzafgVar);
        return zzafgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:308:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009c, code lost:
    
        if (r33.zzo != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzyy) r1).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x00be, code lost:
    
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00cb, code lost:
    
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00d7, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00d9, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00db, code lost:
    
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00e6, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e8, code lost:
    
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzyy) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0102, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0104, code lost:
    
        r33.zzA = r2.zzc(r33.zzz, 7);
        com.google.android.gms.internal.ads.zzym.zzb(r33.zzz, r33.zzj);
        r2.zza.zzq(r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0129, code lost:
    
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0121, code lost:
    
        r3 = r2.zzc(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0133, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x013f, code lost:
    
        if (r6 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0141, code lost:
    
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0145, code lost:
    
        if (r3 >= r4) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0147, code lost:
    
        r33.zzA += r5.zze(r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0236, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x023e, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0240, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0247, code lost:
    
        r5.zzs(r10, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x025a, code lost:
    
        if (r33.zzn.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x025c, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzafj) r33.zzn.removeFirst();
        r33.zzu -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x026f, code lost:
    
        if (r1.zzb == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0271, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0272, code lost:
    
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0276, code lost:
    
        if (r8 >= r6) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0278, code lost:
    
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0290, code lost:
    
        if (r2.zzk() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0292, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0294, code lost:
    
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0298, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0245, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0152, code lost:
    
        r13 = r33.zzg.zzH();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0168, code lost:
    
        if (r33.zzA >= r33.zzz) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x016a, code lost:
    
        r12 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x016e, code lost:
    
        if (r12 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0170, code lost:
    
        ((com.google.android.gms.internal.ads.zzyy) r1).zzn(r13, r6, r14, r9);
        r33.zzg.zzF(r9);
        r12 = r33.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0181, code lost:
    
        if (r12 <= 0) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0183, code lost:
    
        r33.zzB = r12 - 1;
        r33.zzf.zzF(r9);
        r5.zzq(r33.zzf, 4);
        r5.zzq(r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x019a, code lost:
    
        if (r33.zzF.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x019c, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzaaf.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01aa, code lost:
    
        if ("video/avc".equals(r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01ae, code lost:
    
        if ((r17 & 31) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01b1, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01c2, code lost:
    
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0232, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01b7, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01be, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01c1, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x01d6, code lost:
    
        throw com.google.android.gms.internal.ads.zzbu.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01d9, code lost:
    
        if (r33.zzC == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01db, code lost:
    
        r33.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzyy) r1).zzn(r33.zzh.zzH(), 0, r33.zzB, false);
        r5.zzq(r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = r33.zzh;
        r8 = com.google.android.gms.internal.ads.zzaaf.zzb(r8.zzH(), r8.zzd());
        r33.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzh.zzE(r8);
        com.google.android.gms.internal.ads.zzyv.zza(r10, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0226, code lost:
    
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0220, code lost:
    
        r4 = r5.zze(r1, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        boolean z;
        boolean z2;
        long zzw;
        long zzs;
        String str;
        String str2;
        long j;
        long j2;
        long zzt;
        long zzt2;
        zzzj zzzjVar2 = zzzjVar;
        while (true) {
            int i = this.zzo;
            int i2 = 1;
            ?? r9 = 0;
            if (i == 0) {
                if (this.zzr == 0) {
                    if (!zzzjVar2.zzn(this.zzl.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzr = 8;
                    this.zzl.zzF(0);
                    this.zzq = this.zzl.zzs();
                    this.zzp = this.zzl.zze();
                }
                long j3 = this.zzq;
                if (j3 == 1) {
                    ((zzyy) zzzjVar2).zzn(this.zzl.zzH(), 8, 8, false);
                    this.zzr += 8;
                    this.zzq = this.zzl.zzt();
                } else if (j3 == 0) {
                    long zzd = zzzjVar.zzd();
                    if (zzd == -1) {
                        zzd = !this.zzm.isEmpty() ? ((zzaev) this.zzm.peek()).zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzq = (zzd - zzzjVar.zzf()) + this.zzr;
                    }
                }
                long j4 = this.zzq;
                long j5 = this.zzr;
                if (j4 < j5) {
                    throw zzbu.zzc("Atom size less than header length (unsupported).");
                }
                long zzf = zzzjVar.zzf() - j5;
                int i3 = this.zzp;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzG) {
                    this.zzD.zzN(new zzaak(this.zzw, zzf));
                    this.zzG = true;
                }
                if (this.zzp == 1836019558) {
                    int size = this.zze.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzafx zzafxVar = ((zzafk) this.zze.valueAt(i4)).zzb;
                        zzafxVar.zzc = zzf;
                        zzafxVar.zzb = zzf;
                    }
                }
                int i5 = this.zzp;
                if (i5 == 1835295092) {
                    this.zzy = null;
                    this.zzt = zzf + this.zzq;
                    this.zzo = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long zzf2 = (zzzjVar.zzf() + this.zzq) - 8;
                    this.zzm.push(new zzaev(i5, zzf2));
                    if (this.zzq == this.zzr) {
                        zzi(zzf2);
                    } else {
                        zzg();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzr != 8) {
                        throw zzbu.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j6 = this.zzq;
                    if (j6 > 2147483647L) {
                        throw zzbu.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzef zzefVar = new zzef((int) j6);
                    System.arraycopy(this.zzl.zzH(), 0, zzefVar.zzH(), 0, 8);
                    this.zzs = zzefVar;
                    this.zzo = 1;
                } else {
                    if (this.zzq > 2147483647L) {
                        throw zzbu.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzs = null;
                    this.zzo = 1;
                }
            } else if (i != 1) {
                long j7 = Long.MAX_VALUE;
                if (i != 2) {
                    zzafk zzafkVar = this.zzy;
                    if (zzafkVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zze;
                    int size2 = sparseArray.size();
                    long j8 = Long.MAX_VALUE;
                    zzafk zzafkVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzafk zzafkVar3 = (zzafk) sparseArray.valueAt(i6);
                        z = zzafkVar3.zzl;
                        if (z || zzafkVar3.zzf != zzafkVar3.zzd.zzb) {
                            z2 = zzafkVar3.zzl;
                            if (!z2 || zzafkVar3.zzh != zzafkVar3.zzb.zzd) {
                                long zzd2 = zzafkVar3.zzd();
                                if (zzd2 < j8) {
                                    zzafkVar2 = zzafkVar3;
                                    j8 = zzd2;
                                }
                            }
                        }
                    }
                    if (zzafkVar2 == null) {
                        int zzf3 = (int) (this.zzt - zzzjVar.zzf());
                        if (zzf3 < 0) {
                            throw zzbu.zza("Offset to end of mdat was negative.", null);
                        }
                        ((zzyy) zzzjVar2).zzo(zzf3, false);
                        zzg();
                    } else {
                        int zzd3 = (int) (zzafkVar2.zzd() - zzzjVar.zzf());
                        if (zzd3 < 0) {
                            zzdw.zze("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd3 = 0;
                        }
                        ((zzyy) zzzjVar2).zzo(zzd3, false);
                        this.zzy = zzafkVar2;
                        zzafkVar = zzafkVar2;
                    }
                } else {
                    int size3 = this.zze.size();
                    zzafk zzafkVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzafx zzafxVar2 = ((zzafk) this.zze.valueAt(i7)).zzb;
                        if (zzafxVar2.zzo) {
                            long j9 = zzafxVar2.zzc;
                            if (j9 < j7) {
                                zzafkVar4 = (zzafk) this.zze.valueAt(i7);
                                j7 = j9;
                            }
                        }
                    }
                    if (zzafkVar4 == null) {
                        this.zzo = 3;
                    } else {
                        int zzf4 = (int) (j7 - zzzjVar.zzf());
                        if (zzf4 < 0) {
                            throw zzbu.zza("Offset to encryption data was negative.", null);
                        }
                        zzyy zzyyVar = (zzyy) zzzjVar2;
                        zzyyVar.zzo(zzf4, false);
                        zzafx zzafxVar3 = zzafkVar4.zzb;
                        zzef zzefVar2 = zzafxVar3.zzn;
                        zzyyVar.zzn(zzefVar2.zzH(), 0, zzefVar2.zzd(), false);
                        zzafxVar3.zzn.zzF(0);
                        zzafxVar3.zzo = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzq) - this.zzr;
                zzef zzefVar3 = this.zzs;
                if (zzefVar3 != null) {
                    ((zzyy) zzzjVar2).zzn(zzefVar3.zzH(), 8, i8, false);
                    zzaew zzaewVar = new zzaew(this.zzp, zzefVar3);
                    long zzf5 = zzzjVar.zzf();
                    if (this.zzm.isEmpty()) {
                        int i9 = zzaewVar.zzd;
                        if (i9 == 1936286840) {
                            zzef zzefVar4 = zzaewVar.zza;
                            zzefVar4.zzF(8);
                            int zze = zzefVar4.zze();
                            zzefVar4.zzG(4);
                            long zzs2 = zzefVar4.zzs();
                            if (zzaex.zze(zze) == 0) {
                                zzt = zzefVar4.zzs();
                                zzt2 = zzefVar4.zzs();
                            } else {
                                zzt = zzefVar4.zzt();
                                zzt2 = zzefVar4.zzt();
                            }
                            long j10 = zzf5 + zzt2;
                            long zzw2 = zzen.zzw(zzt, 1000000L, zzs2);
                            zzefVar4.zzG(2);
                            int zzo = zzefVar4.zzo();
                            int[] iArr = new int[zzo];
                            long[] jArr = new long[zzo];
                            long[] jArr2 = new long[zzo];
                            long[] jArr3 = new long[zzo];
                            long j11 = zzw2;
                            int i10 = 0;
                            while (i10 < zzo) {
                                int zze2 = zzefVar4.zze();
                                if ((zze2 & Integer.MIN_VALUE) != 0) {
                                    throw zzbu.zza("Unhandled indirect reference", null);
                                }
                                long zzs3 = zzefVar4.zzs();
                                iArr[i10] = zze2 & Integer.MAX_VALUE;
                                jArr[i10] = j10;
                                jArr3[i10] = j11;
                                long j12 = zzt + zzs3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                j11 = zzen.zzw(j12, 1000000L, zzs2);
                                jArr5[i11] = j11 - jArr4[i11];
                                zzefVar4.zzG(4);
                                j10 += r1[i11];
                                i10 = i11 + 1;
                                iArr = iArr;
                                jArr = jArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                zzo = zzo;
                                zzt = j12;
                            }
                            Pair create = Pair.create(Long.valueOf(zzw2), new zzyw(iArr, jArr, jArr2, jArr3));
                            this.zzx = ((Long) create.first).longValue();
                            this.zzD.zzN((zzaal) create.second);
                            this.zzG = true;
                        } else if (i9 == 1701671783) {
                            zzef zzefVar5 = zzaewVar.zza;
                            if (this.zzE.length != 0) {
                                zzefVar5.zzF(8);
                                int zze3 = zzaex.zze(zzefVar5.zze());
                                if (zze3 == 0) {
                                    String zzv = zzefVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv);
                                    String zzv2 = zzefVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv2);
                                    long zzs4 = zzefVar5.zzs();
                                    long zzw3 = zzen.zzw(zzefVar5.zzs(), 1000000L, zzs4);
                                    long j13 = this.zzx;
                                    long j14 = j13 != -9223372036854775807L ? j13 + zzw3 : -9223372036854775807L;
                                    zzw = zzen.zzw(zzefVar5.zzs(), 1000L, zzs4);
                                    zzs = zzefVar5.zzs();
                                    str = zzv;
                                    str2 = zzv2;
                                    j = zzw3;
                                    j2 = j14;
                                } else if (zze3 != 1) {
                                    zzdw.zze("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + zze3);
                                } else {
                                    long zzs5 = zzefVar5.zzs();
                                    long zzw4 = zzen.zzw(zzefVar5.zzt(), 1000000L, zzs5);
                                    long zzw5 = zzen.zzw(zzefVar5.zzs(), 1000L, zzs5);
                                    long zzs6 = zzefVar5.zzs();
                                    String zzv3 = zzefVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv3);
                                    String zzv4 = zzefVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv4);
                                    zzw = zzw5;
                                    zzs = zzs6;
                                    str = zzv3;
                                    str2 = zzv4;
                                    j = -9223372036854775807L;
                                    j2 = zzw4;
                                }
                                byte[] bArr = new byte[zzefVar5.zza()];
                                zzefVar5.zzB(bArr, 0, zzefVar5.zza());
                                zzef zzefVar6 = new zzef(this.zzk.zza(new zzacf(str, str2, zzw, zzs, bArr)));
                                int zza2 = zzefVar6.zza();
                                for (zzaap zzaapVar : this.zzE) {
                                    zzefVar6.zzF(0);
                                    zzaapVar.zzq(zzefVar6, zza2);
                                }
                                if (j2 == -9223372036854775807L) {
                                    this.zzn.addLast(new zzafj(j, true, zza2));
                                    this.zzu += zza2;
                                } else if (this.zzn.isEmpty()) {
                                    for (zzaap zzaapVar2 : this.zzE) {
                                        zzaapVar2.zzs(j2, 1, zza2, 0, null);
                                    }
                                } else {
                                    this.zzn.addLast(new zzafj(j2, false, zza2));
                                    this.zzu += zza2;
                                }
                            }
                        }
                        zzzjVar2 = zzzjVar;
                    } else {
                        ((zzaev) this.zzm.peek()).zzd(zzaewVar);
                    }
                } else {
                    ((zzyy) zzzjVar2).zzo(i8, false);
                }
                zzi(zzzjVar.zzf());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzD = zzzlVar;
        zzg();
        zzaap[] zzaapVarArr = new zzaap[2];
        this.zzE = zzaapVarArr;
        int i = 0;
        zzaap[] zzaapVarArr2 = (zzaap[]) zzen.zzae(zzaapVarArr, 0);
        this.zzE = zzaapVarArr2;
        for (zzaap zzaapVar : zzaapVarArr2) {
            zzaapVar.zzk(zzc);
        }
        this.zzF = new zzaap[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzaap zzv = this.zzD.zzv(i2, 3);
            zzv.zzk((zzaf) this.zzd.get(i));
            this.zzF[i] = zzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzafk) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        return zzafu.zza(zzzjVar);
    }

    public zzafl(int i, zzel zzelVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzacg();
        this.zzl = new zzef(16);
        this.zzf = new zzef(zzaaf.zza);
        this.zzg = new zzef(5);
        this.zzh = new zzef();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzef(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzzl.zza;
        this.zzE = new zzaap[0];
        this.zzF = new zzaap[0];
    }
}
