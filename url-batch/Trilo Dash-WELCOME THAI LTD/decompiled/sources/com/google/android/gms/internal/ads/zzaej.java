package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaej implements zzys {
    public static final zzyz zza = new zzyz() { // from class: com.google.android.gms.internal.ads.zzaef
        @Override // com.google.android.gms.internal.ads.zzyz
        public final zzys[] zza() {
            zzyz zzyzVar = zzaej.zza;
            return new zzys[]{new zzaej(0, null)};
        }

        @Override // com.google.android.gms.internal.ads.zzyz
        public final /* synthetic */ zzys[] zzb(Uri uri, Map map) {
            return zzyy.zza(this, uri, map);
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzad zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzyv zzD;
    private zzzz[] zzE;
    private zzzz[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final byte[] zzi;
    private final zzdy zzj;
    private final zzabf zzk;
    private final zzdy zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    private zzdy zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private zzaei zzy;
    private int zzz;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzS("application/x-emsg");
        zzc = zzabVar.zzY();
    }

    public zzaej() {
        this(0, null);
    }

    private static int zze(int i) throws zzbp {
        if (i >= 0) {
            return i;
        }
        throw zzbp.zza("Unexpected negative value: " + i, null);
    }

    private static zzv zzf(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzadv zzadvVar = (zzadv) list.get(i);
            if (zzadvVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzH = zzadvVar.zza.zzH();
                UUID zza2 = zzaeq.zza(zzH);
                if (zza2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzu(zza2, null, "video/mp4", zzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzv(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzdy zzdyVar, int i, zzaev zzaevVar) throws zzbp {
        zzdyVar.zzF(i + 8);
        int zze = zzdyVar.zze() & ViewCompat.MEASURED_SIZE_MASK;
        if ((zze & 1) != 0) {
            throw zzbp.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zze & 2) != 0;
        int zzn = zzdyVar.zzn();
        if (zzn == 0) {
            Arrays.fill(zzaevVar.zzl, 0, zzaevVar.zze, false);
            return;
        }
        int i2 = zzaevVar.zze;
        if (zzn != i2) {
            throw zzbp.zza("Senc sample count " + zzn + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzaevVar.zzl, 0, zzn, z);
        zzaevVar.zza(zzdyVar.zza());
        zzdy zzdyVar2 = zzaevVar.zzn;
        zzdyVar.zzB(zzdyVar2.zzH(), 0, zzdyVar2.zzd());
        zzaevVar.zzn.zzF(0);
        zzaevVar.zzo = false;
    }

    private final void zzi(long j) throws zzbp {
        zzaej zzaejVar;
        SparseArray sparseArray;
        zzadu zzaduVar;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        int i5;
        zzadu zzaduVar2;
        byte[] bArr4;
        zzaev zzaevVar;
        List list;
        int i6;
        int i7;
        int i8;
        zzadu zzaduVar3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzaee zzaeeVar;
        long j2;
        final zzaej zzaejVar2 = this;
        while (!zzaejVar2.zzm.isEmpty() && ((zzadu) zzaejVar2.zzm.peek()).zza == j) {
            zzadu zzaduVar4 = (zzadu) zzaejVar2.zzm.pop();
            int i19 = zzaduVar4.zzd;
            int i20 = 12;
            int i21 = 8;
            if (i19 == 1836019574) {
                zzv zzf = zzf(zzaduVar4.zzb);
                zzadu zza2 = zzaduVar4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = -9223372036854775807L;
                int i22 = 0;
                while (i22 < size) {
                    zzadv zzadvVar = (zzadv) zza2.zzb.get(i22);
                    int i23 = zzadvVar.zzd;
                    if (i23 == 1953654136) {
                        zzdy zzdyVar = zzadvVar.zza;
                        zzdyVar.zzF(i20);
                        Pair create = Pair.create(Integer.valueOf(zzdyVar.zze()), new zzaee(zzdyVar.zze() - 1, zzdyVar.zze(), zzdyVar.zze(), zzdyVar.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaee) create.second);
                    } else if (i23 == 1835362404) {
                        zzdy zzdyVar2 = zzadvVar.zza;
                        zzdyVar2.zzF(8);
                        j3 = zzadw.zze(zzdyVar2.zze()) == 0 ? zzdyVar2.zzs() : zzdyVar2.zzt();
                    }
                    i22++;
                    i20 = 12;
                }
                List zzc2 = zzaed.zzc(zzaduVar4, new zzzh(), j3, zzf, false, false, new zzfoi() { // from class: com.google.android.gms.internal.ads.zzaeg
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj) {
                        return (zzaet) obj;
                    }
                });
                int size2 = zzc2.size();
                if (zzaejVar2.zze.size() == 0) {
                    for (int i24 = 0; i24 < size2; i24++) {
                        zzaew zzaewVar = (zzaew) zzc2.get(i24);
                        zzaet zzaetVar = zzaewVar.zza;
                        zzaejVar2.zze.put(zzaetVar.zza, new zzaei(zzaejVar2.zzD.zzv(i24, zzaetVar.zzb), zzaewVar, zzj(sparseArray2, zzaetVar.zza)));
                        zzaejVar2.zzw = Math.max(zzaejVar2.zzw, zzaetVar.zze);
                    }
                    zzaejVar2.zzD.zzB();
                } else {
                    zzcw.zzf(zzaejVar2.zze.size() == size2);
                    for (int i25 = 0; i25 < size2; i25++) {
                        zzaew zzaewVar2 = (zzaew) zzc2.get(i25);
                        zzaet zzaetVar2 = zzaewVar2.zza;
                        ((zzaei) zzaejVar2.zze.get(zzaetVar2.zza)).zzh(zzaewVar2, zzj(sparseArray2, zzaetVar2.zza));
                    }
                }
            } else {
                if (i19 == 1836019558) {
                    SparseArray sparseArray3 = zzaejVar2.zze;
                    byte[] bArr5 = zzaejVar2.zzi;
                    int size3 = zzaduVar4.zzc.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        zzadu zzaduVar5 = (zzadu) zzaduVar4.zzc.get(i26);
                        if (zzaduVar5.zzd == 1953653094) {
                            zzadv zzb2 = zzaduVar5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzdy zzdyVar3 = zzb2.zza;
                            zzdyVar3.zzF(i21);
                            int zze = zzdyVar3.zze() & ViewCompat.MEASURED_SIZE_MASK;
                            zzaei zzaeiVar = (zzaei) sparseArray3.get(zzdyVar3.zze());
                            if (zzaeiVar == null) {
                                zzaeiVar = null;
                            } else {
                                if ((zze & 1) != 0) {
                                    long zzt = zzdyVar3.zzt();
                                    zzaev zzaevVar2 = zzaeiVar.zzb;
                                    zzaevVar2.zzb = zzt;
                                    zzaevVar2.zzc = zzt;
                                }
                                zzaee zzaeeVar2 = zzaeiVar.zze;
                                zzaeiVar.zzb.zza = new zzaee((zze & 2) != 0 ? zzdyVar3.zze() - 1 : zzaeeVar2.zza, (zze & 8) != 0 ? zzdyVar3.zze() : zzaeeVar2.zzb, (zze & 16) != 0 ? zzdyVar3.zze() : zzaeeVar2.zzc, (zze & 32) != 0 ? zzdyVar3.zze() : zzaeeVar2.zzd);
                            }
                            if (zzaeiVar != null) {
                                zzaev zzaevVar3 = zzaeiVar.zzb;
                                long j4 = zzaevVar3.zzp;
                                boolean z2 = zzaevVar3.zzq;
                                zzaeiVar.zzi();
                                zzaeiVar.zzl = true;
                                zzadv zzb3 = zzaduVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzdy zzdyVar4 = zzb3.zza;
                                    zzdyVar4.zzF(i21);
                                    zzaevVar3.zzp = zzadw.zze(zzdyVar4.zze()) == 1 ? zzdyVar4.zzt() : zzdyVar4.zzs();
                                    zzaevVar3.zzq = true;
                                } else {
                                    zzaevVar3.zzp = j4;
                                    zzaevVar3.zzq = z2;
                                }
                                List list2 = zzaduVar5.zzb;
                                int size4 = list2.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i27 >= size4) {
                                        break;
                                    }
                                    zzadv zzadvVar2 = (zzadv) list2.get(i27);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzadvVar2.zzd == 1953658222) {
                                        zzdy zzdyVar5 = zzadvVar2.zza;
                                        zzdyVar5.zzF(12);
                                        int zzn = zzdyVar5.zzn();
                                        if (zzn > 0) {
                                            i29 += zzn;
                                            i28++;
                                        }
                                    }
                                    i27++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzaeiVar.zzh = 0;
                                zzaeiVar.zzg = 0;
                                zzaeiVar.zzf = 0;
                                zzaev zzaevVar4 = zzaeiVar.zzb;
                                zzaevVar4.zzd = i28;
                                zzaevVar4.zze = i29;
                                if (zzaevVar4.zzg.length < i28) {
                                    zzaevVar4.zzf = new long[i28];
                                    zzaevVar4.zzg = new int[i28];
                                }
                                if (zzaevVar4.zzh.length < i29) {
                                    int i30 = (i29 * 125) / 100;
                                    zzaevVar4.zzh = new int[i30];
                                    zzaevVar4.zzi = new long[i30];
                                    zzaevVar4.zzj = new boolean[i30];
                                    zzaevVar4.zzl = new boolean[i30];
                                }
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    zzadv zzadvVar3 = (zzadv) list2.get(i31);
                                    if (zzadvVar3.zzd == i3) {
                                        int i34 = i33 + 1;
                                        zzdy zzdyVar6 = zzadvVar3.zza;
                                        zzdyVar6.zzF(8);
                                        int zze2 = zzdyVar6.zze() & ViewCompat.MEASURED_SIZE_MASK;
                                        list = list2;
                                        zzaet zzaetVar3 = zzaeiVar.zzd.zza;
                                        i6 = size3;
                                        zzaev zzaevVar5 = zzaeiVar.zzb;
                                        i8 = size4;
                                        zzaee zzaeeVar3 = zzaevVar5.zza;
                                        int i35 = zzeg.zza;
                                        zzaevVar5.zzg[i33] = zzdyVar6.zzn();
                                        long[] jArr = zzaevVar5.zzf;
                                        zzaduVar2 = zzaduVar4;
                                        bArr4 = bArr5;
                                        long j6 = zzaevVar5.zzb;
                                        jArr[i33] = j6;
                                        if ((zze2 & 1) != 0) {
                                            i5 = i31;
                                            jArr[i33] = j6 + zzdyVar6.zze();
                                        } else {
                                            i5 = i31;
                                        }
                                        int i36 = zze2 & 4;
                                        int i37 = zzaeeVar3.zzd;
                                        if (i36 != 0) {
                                            i37 = zzdyVar6.zze();
                                        }
                                        int i38 = zze2 & 256;
                                        int i39 = zze2 & 512;
                                        int i40 = zze2 & 1024;
                                        int i41 = zze2 & 2048;
                                        int i42 = i37;
                                        long[] jArr2 = zzaetVar3.zzh;
                                        if (jArr2 != null) {
                                            i7 = i26;
                                            zzaduVar3 = zzaduVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) zzeg.zzG(zzaetVar3.zzi))[0];
                                            }
                                        } else {
                                            i7 = i26;
                                            zzaduVar3 = zzaduVar5;
                                        }
                                        int[] iArr = zzaevVar5.zzh;
                                        long[] jArr3 = zzaevVar5.zzi;
                                        boolean[] zArr = zzaevVar5.zzj;
                                        zzaevVar = zzaevVar3;
                                        int i43 = zzaevVar5.zzg[i33] + i32;
                                        long j7 = zzaetVar3.zzc;
                                        int i44 = i32;
                                        long j8 = zzaevVar5.zzp;
                                        while (i44 < i43) {
                                            if (i38 != 0) {
                                                i9 = i38;
                                                i10 = zzdyVar6.zze();
                                            } else {
                                                i9 = i38;
                                                i10 = zzaeeVar3.zzb;
                                            }
                                            zze(i10);
                                            if (i39 != 0) {
                                                i11 = i39;
                                                i12 = zzdyVar6.zze();
                                            } else {
                                                i11 = i39;
                                                i12 = zzaeeVar3.zzc;
                                            }
                                            zze(i12);
                                            if (i40 != 0) {
                                                i13 = i36;
                                                i14 = zzdyVar6.zze();
                                            } else {
                                                i13 = i36;
                                                if (i44 == 0) {
                                                    if (i36 != 0) {
                                                        i14 = i42;
                                                        i44 = 0;
                                                    } else {
                                                        i44 = 0;
                                                    }
                                                }
                                                i14 = zzaeeVar3.zzd;
                                            }
                                            if (i41 != 0) {
                                                i15 = i43;
                                                i16 = i40;
                                                i17 = i41;
                                                i18 = zzdyVar6.zze();
                                            } else {
                                                i15 = i43;
                                                i16 = i40;
                                                i17 = i41;
                                                i18 = 0;
                                            }
                                            long zzw = zzeg.zzw((i18 + j8) - j5, 1000000L, j7);
                                            jArr3[i44] = zzw;
                                            if (zzaevVar5.zzq) {
                                                zzaeeVar = zzaeeVar3;
                                                j2 = j7;
                                            } else {
                                                zzaeeVar = zzaeeVar3;
                                                j2 = j7;
                                                jArr3[i44] = zzw + zzaeiVar.zzd.zzh;
                                            }
                                            iArr[i44] = i12;
                                            zArr[i44] = 1 == (((i14 >> 16) & 1) ^ 1);
                                            j8 += i10;
                                            i44++;
                                            zzaeeVar3 = zzaeeVar;
                                            j7 = j2;
                                            i38 = i9;
                                            i39 = i11;
                                            i36 = i13;
                                            i43 = i15;
                                            i40 = i16;
                                            i41 = i17;
                                        }
                                        zzaevVar5.zzp = j8;
                                        i33 = i34;
                                        i32 = i43;
                                    } else {
                                        i5 = i31;
                                        zzaduVar2 = zzaduVar4;
                                        bArr4 = bArr5;
                                        zzaevVar = zzaevVar3;
                                        list = list2;
                                        i6 = size3;
                                        i7 = i26;
                                        i8 = size4;
                                        zzaduVar3 = zzaduVar5;
                                    }
                                    i31 = i5 + 1;
                                    list2 = list;
                                    size3 = i6;
                                    size4 = i8;
                                    zzaduVar4 = zzaduVar2;
                                    bArr5 = bArr4;
                                    i26 = i7;
                                    zzaduVar5 = zzaduVar3;
                                    zzaevVar3 = zzaevVar;
                                    i3 = 1953658222;
                                }
                                zzaduVar = zzaduVar4;
                                byte[] bArr6 = bArr5;
                                zzaev zzaevVar6 = zzaevVar3;
                                i = size3;
                                i2 = i26;
                                zzadu zzaduVar6 = zzaduVar5;
                                zzaet zzaetVar4 = zzaeiVar.zzd.zza;
                                zzaee zzaeeVar4 = zzaevVar6.zza;
                                Objects.requireNonNull(zzaeeVar4);
                                zzaeu zza3 = zzaetVar4.zza(zzaeeVar4.zza);
                                zzadv zzb4 = zzaduVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzdy zzdyVar7 = zzb4.zza;
                                    int i45 = zza3.zzd;
                                    zzdyVar7.zzF(8);
                                    if ((zzdyVar7.zze() & 1) == 1) {
                                        zzdyVar7.zzG(8);
                                    }
                                    int zzk = zzdyVar7.zzk();
                                    int zzn2 = zzdyVar7.zzn();
                                    int i46 = zzaevVar6.zze;
                                    if (zzn2 > i46) {
                                        throw zzbp.zza("Saiz sample count " + zzn2 + " is greater than fragment sample count" + i46, null);
                                    }
                                    if (zzk == 0) {
                                        boolean[] zArr2 = zzaevVar6.zzl;
                                        i4 = 0;
                                        for (int i47 = 0; i47 < zzn2; i47++) {
                                            int zzk2 = zzdyVar7.zzk();
                                            i4 += zzk2;
                                            zArr2[i47] = zzk2 > i45;
                                        }
                                        z = false;
                                    } else {
                                        boolean z3 = zzk > i45;
                                        i4 = zzk * zzn2;
                                        z = false;
                                        Arrays.fill(zzaevVar6.zzl, 0, zzn2, z3);
                                    }
                                    Arrays.fill(zzaevVar6.zzl, zzn2, zzaevVar6.zze, z);
                                    if (i4 > 0) {
                                        zzaevVar6.zza(i4);
                                    }
                                }
                                zzadv zzb5 = zzaduVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzdy zzdyVar8 = zzb5.zza;
                                    zzdyVar8.zzF(8);
                                    int zze3 = zzdyVar8.zze();
                                    if ((zze3 & 1) == 1) {
                                        zzdyVar8.zzG(8);
                                    }
                                    int zzn3 = zzdyVar8.zzn();
                                    if (zzn3 != 1) {
                                        throw zzbp.zza("Unexpected saio entry count: " + zzn3, null);
                                    }
                                    zzaevVar6.zzc += zzadw.zze(zze3) == 0 ? zzdyVar8.zzs() : zzdyVar8.zzt();
                                }
                                zzadv zzb6 = zzaduVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzaevVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzdy zzdyVar9 = null;
                                zzdy zzdyVar10 = null;
                                for (int i48 = 0; i48 < zzaduVar6.zzb.size(); i48++) {
                                    zzadv zzadvVar4 = (zzadv) zzaduVar6.zzb.get(i48);
                                    zzdy zzdyVar11 = zzadvVar4.zza;
                                    int i49 = zzadvVar4.zzd;
                                    if (i49 == 1935828848) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar9 = zzdyVar11;
                                        }
                                    } else if (i49 == 1936158820) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar10 = zzdyVar11;
                                        }
                                    }
                                }
                                if (zzdyVar9 != null && zzdyVar10 != null) {
                                    zzdyVar9.zzF(8);
                                    int zze4 = zzdyVar9.zze();
                                    zzdyVar9.zzG(4);
                                    if (zzadw.zze(zze4) == 1) {
                                        zzdyVar9.zzG(4);
                                    }
                                    if (zzdyVar9.zze() != 1) {
                                        throw zzbp.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzdyVar10.zzF(8);
                                    int zze5 = zzadw.zze(zzdyVar10.zze());
                                    zzdyVar10.zzG(4);
                                    if (zze5 == 1) {
                                        if (zzdyVar10.zzs() == 0) {
                                            throw zzbp.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zze5 >= 2) {
                                        zzdyVar10.zzG(4);
                                    }
                                    if (zzdyVar10.zzs() != 1) {
                                        throw zzbp.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzdyVar10.zzG(1);
                                    int zzk3 = zzdyVar10.zzk();
                                    int i50 = (zzk3 & 240) >> 4;
                                    int i51 = zzk3 & 15;
                                    if (zzdyVar10.zzk() == 1) {
                                        int zzk4 = zzdyVar10.zzk();
                                        byte[] bArr7 = new byte[16];
                                        zzdyVar10.zzB(bArr7, 0, 16);
                                        if (zzk4 == 0) {
                                            int zzk5 = zzdyVar10.zzk();
                                            byte[] bArr8 = new byte[zzk5];
                                            zzdyVar10.zzB(bArr8, 0, zzk5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzaevVar6.zzk = true;
                                        zzaevVar6.zzm = new zzaeu(true, str, zzk4, bArr7, i50, i51, bArr3);
                                    }
                                }
                                int size5 = zzaduVar6.zzb.size();
                                int i52 = 0;
                                while (i52 < size5) {
                                    zzadv zzadvVar5 = (zzadv) zzaduVar6.zzb.get(i52);
                                    if (zzadvVar5.zzd == 1970628964) {
                                        zzdy zzdyVar12 = zzadvVar5.zza;
                                        zzdyVar12.zzF(8);
                                        bArr2 = bArr6;
                                        zzdyVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzdyVar12, 16, zzaevVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i52++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i;
                                zzaduVar4 = zzaduVar;
                                i21 = 8;
                                i26 = i2 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzaduVar = zzaduVar4;
                        i = size3;
                        i2 = i26;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i;
                        zzaduVar4 = zzaduVar;
                        i21 = 8;
                        i26 = i2 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzv zzf2 = zzf(zzaduVar4.zzb);
                    zzaejVar = this;
                    if (zzf2 != null) {
                        int size6 = zzaejVar.zze.size();
                        for (int i53 = 0; i53 < size6; i53++) {
                            zzaei zzaeiVar2 = (zzaei) zzaejVar.zze.valueAt(i53);
                            zzaet zzaetVar5 = zzaeiVar2.zzd.zza;
                            zzaee zzaeeVar5 = zzaeiVar2.zzb.zza;
                            int i54 = zzeg.zza;
                            zzaeu zza4 = zzaetVar5.zza(zzaeeVar5.zza);
                            zzv zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzab zzb8 = zzaeiVar2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzaeiVar2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzaejVar.zzv != -9223372036854775807L) {
                        int size7 = zzaejVar.zze.size();
                        for (int i55 = 0; i55 < size7; i55++) {
                            zzaei zzaeiVar3 = (zzaei) zzaejVar.zze.valueAt(i55);
                            long j9 = zzaejVar.zzv;
                            int i56 = zzaeiVar3.zzf;
                            while (true) {
                                zzaev zzaevVar7 = zzaeiVar3.zzb;
                                if (i56 < zzaevVar7.zze && zzaevVar7.zzi[i56] < j9) {
                                    if (zzaevVar7.zzj[i56]) {
                                        zzaeiVar3.zzi = i56;
                                    }
                                    i56++;
                                }
                            }
                        }
                        zzaejVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzaejVar = zzaejVar2;
                    if (!zzaejVar.zzm.isEmpty()) {
                        ((zzadu) zzaejVar.zzm.peek()).zzc(zzaduVar4);
                    }
                }
                zzaejVar2 = zzaejVar;
            }
        }
        zzg();
    }

    private static final zzaee zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaee) sparseArray.valueAt(0);
        }
        zzaee zzaeeVar = (zzaee) sparseArray.get(i);
        Objects.requireNonNull(zzaeeVar);
        return zzaeeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:308:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009c, code lost:
    
        if (r33.zzo != 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzym) r1).zzo(r3, false);
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
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00d8, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00da, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00dc, code lost:
    
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00de, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00e7, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e9, code lost:
    
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzym) r1).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0103, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0105, code lost:
    
        r33.zzA = r2.zzc(r33.zzz, 7);
        com.google.android.gms.internal.ads.zzya.zzb(r33.zzz, r33.zzj);
        com.google.android.gms.internal.ads.zzzx.zzb(r2.zza, r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x012a, code lost:
    
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0122, code lost:
    
        r3 = r2.zzc(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0134, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0140, code lost:
    
        if (r6 != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0142, code lost:
    
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0146, code lost:
    
        if (r3 >= r4) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0148, code lost:
    
        r33.zzA += com.google.android.gms.internal.ads.zzzx.zza(r5, r1, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0237, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x023f, code lost:
    
        if (r1 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0241, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0248, code lost:
    
        r5.zzs(r10, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x025b, code lost:
    
        if (r33.zzn.isEmpty() != false) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x025d, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaeh) r33.zzn.removeFirst();
        r33.zzu -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0270, code lost:
    
        if (r1.zzb == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0272, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0273, code lost:
    
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0277, code lost:
    
        if (r8 >= r6) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0279, code lost:
    
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0291, code lost:
    
        if (r2.zzk() != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0293, code lost:
    
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0295, code lost:
    
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0246, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0153, code lost:
    
        r13 = r33.zzg.zzH();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0169, code lost:
    
        if (r33.zzA >= r33.zzz) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x016b, code lost:
    
        r12 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x016f, code lost:
    
        if (r12 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0171, code lost:
    
        ((com.google.android.gms.internal.ads.zzym) r1).zzn(r13, r6, r14, r9);
        r33.zzg.zzF(r9);
        r12 = r33.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0182, code lost:
    
        if (r12 <= 0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0184, code lost:
    
        r33.zzB = r12 - 1;
        r33.zzf.zzF(r9);
        com.google.android.gms.internal.ads.zzzx.zzb(r5, r33.zzf, 4);
        com.google.android.gms.internal.ads.zzzx.zzb(r5, r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x019b, code lost:
    
        if (r33.zzF.length <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x019d, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzzp.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x01ab, code lost:
    
        if ("video/avc".equals(r12) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01af, code lost:
    
        if ((r17 & 31) == r4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01b2, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x01c3, code lost:
    
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0233, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x01b8, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01bf, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x01c2, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x01d7, code lost:
    
        throw com.google.android.gms.internal.ads.zzbp.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01da, code lost:
    
        if (r33.zzC == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x01dc, code lost:
    
        r33.zzh.zzC(r12);
        ((com.google.android.gms.internal.ads.zzym) r1).zzn(r33.zzh.zzH(), 0, r33.zzB, false);
        com.google.android.gms.internal.ads.zzzx.zzb(r5, r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = r33.zzh;
        r8 = com.google.android.gms.internal.ads.zzzp.zzb(r8.zzH(), r8.zzd());
        r33.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzh.zzE(r8);
        com.google.android.gms.internal.ads.zzyj.zza(r10, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0227, code lost:
    
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0221, code lost:
    
        r4 = com.google.android.gms.internal.ads.zzzx.zza(r5, r1, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
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
        zzyt zzytVar2 = zzytVar;
        while (true) {
            int i = this.zzo;
            int i2 = 1;
            ?? r9 = 0;
            if (i == 0) {
                if (this.zzr == 0) {
                    if (!zzytVar2.zzn(this.zzl.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzr = 8;
                    this.zzl.zzF(0);
                    this.zzq = this.zzl.zzs();
                    this.zzp = this.zzl.zze();
                }
                long j3 = this.zzq;
                if (j3 == 1) {
                    ((zzym) zzytVar2).zzn(this.zzl.zzH(), 8, 8, false);
                    this.zzr += 8;
                    this.zzq = this.zzl.zzt();
                } else if (j3 == 0) {
                    long zzd = zzytVar.zzd();
                    if (zzd == -1) {
                        zzd = !this.zzm.isEmpty() ? ((zzadu) this.zzm.peek()).zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzq = (zzd - zzytVar.zzf()) + this.zzr;
                    }
                }
                long j4 = this.zzq;
                long j5 = this.zzr;
                if (j4 < j5) {
                    throw zzbp.zzc("Atom size less than header length (unsupported).");
                }
                long zzf = zzytVar.zzf() - j5;
                int i3 = this.zzp;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzG) {
                    this.zzD.zzL(new zzzu(this.zzw, zzf));
                    this.zzG = true;
                }
                if (this.zzp == 1836019558) {
                    int size = this.zze.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzaev zzaevVar = ((zzaei) this.zze.valueAt(i4)).zzb;
                        zzaevVar.zzc = zzf;
                        zzaevVar.zzb = zzf;
                    }
                }
                int i5 = this.zzp;
                if (i5 == 1835295092) {
                    this.zzy = null;
                    this.zzt = zzf + this.zzq;
                    this.zzo = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long zzf2 = (zzytVar.zzf() + this.zzq) - 8;
                    this.zzm.push(new zzadu(i5, zzf2));
                    if (this.zzq == this.zzr) {
                        zzi(zzf2);
                    } else {
                        zzg();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzr != 8) {
                        throw zzbp.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j6 = this.zzq;
                    if (j6 > 2147483647L) {
                        throw zzbp.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzdy zzdyVar = new zzdy((int) j6);
                    System.arraycopy(this.zzl.zzH(), 0, zzdyVar.zzH(), 0, 8);
                    this.zzs = zzdyVar;
                    this.zzo = 1;
                } else {
                    if (this.zzq > 2147483647L) {
                        throw zzbp.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzs = null;
                    this.zzo = 1;
                }
            } else if (i != 1) {
                long j7 = Long.MAX_VALUE;
                if (i != 2) {
                    zzaei zzaeiVar = this.zzy;
                    if (zzaeiVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zze;
                    int size2 = sparseArray.size();
                    long j8 = Long.MAX_VALUE;
                    zzaei zzaeiVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzaei zzaeiVar3 = (zzaei) sparseArray.valueAt(i6);
                        z = zzaeiVar3.zzl;
                        if (z || zzaeiVar3.zzf != zzaeiVar3.zzd.zzb) {
                            z2 = zzaeiVar3.zzl;
                            if (!z2 || zzaeiVar3.zzh != zzaeiVar3.zzb.zzd) {
                                long zzd2 = zzaeiVar3.zzd();
                                if (zzd2 < j8) {
                                    zzaeiVar2 = zzaeiVar3;
                                    j8 = zzd2;
                                }
                            }
                        }
                    }
                    if (zzaeiVar2 == null) {
                        int zzf3 = (int) (this.zzt - zzytVar.zzf());
                        if (zzf3 < 0) {
                            throw zzbp.zza("Offset to end of mdat was negative.", null);
                        }
                        ((zzym) zzytVar2).zzo(zzf3, false);
                        zzg();
                    } else {
                        int zzd3 = (int) (zzaeiVar2.zzd() - zzytVar.zzf());
                        if (zzd3 < 0) {
                            Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd3 = 0;
                        }
                        ((zzym) zzytVar2).zzo(zzd3, false);
                        this.zzy = zzaeiVar2;
                        zzaeiVar = zzaeiVar2;
                    }
                } else {
                    int size3 = this.zze.size();
                    zzaei zzaeiVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzaev zzaevVar2 = ((zzaei) this.zze.valueAt(i7)).zzb;
                        if (zzaevVar2.zzo) {
                            long j9 = zzaevVar2.zzc;
                            if (j9 < j7) {
                                zzaeiVar4 = (zzaei) this.zze.valueAt(i7);
                                j7 = j9;
                            }
                        }
                    }
                    if (zzaeiVar4 == null) {
                        this.zzo = 3;
                    } else {
                        int zzf4 = (int) (j7 - zzytVar.zzf());
                        if (zzf4 < 0) {
                            throw zzbp.zza("Offset to encryption data was negative.", null);
                        }
                        zzym zzymVar = (zzym) zzytVar2;
                        zzymVar.zzo(zzf4, false);
                        zzaev zzaevVar3 = zzaeiVar4.zzb;
                        zzdy zzdyVar2 = zzaevVar3.zzn;
                        zzymVar.zzn(zzdyVar2.zzH(), 0, zzdyVar2.zzd(), false);
                        zzaevVar3.zzn.zzF(0);
                        zzaevVar3.zzo = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzq) - this.zzr;
                zzdy zzdyVar3 = this.zzs;
                if (zzdyVar3 != null) {
                    ((zzym) zzytVar2).zzn(zzdyVar3.zzH(), 8, i8, false);
                    zzadv zzadvVar = new zzadv(this.zzp, zzdyVar3);
                    long zzf5 = zzytVar.zzf();
                    if (this.zzm.isEmpty()) {
                        int i9 = zzadvVar.zzd;
                        if (i9 == 1936286840) {
                            zzdy zzdyVar4 = zzadvVar.zza;
                            zzdyVar4.zzF(8);
                            int zze = zzdyVar4.zze();
                            zzdyVar4.zzG(4);
                            long zzs2 = zzdyVar4.zzs();
                            if (zzadw.zze(zze) == 0) {
                                zzt = zzdyVar4.zzs();
                                zzt2 = zzdyVar4.zzs();
                            } else {
                                zzt = zzdyVar4.zzt();
                                zzt2 = zzdyVar4.zzt();
                            }
                            long j10 = zzf5 + zzt2;
                            long zzw2 = zzeg.zzw(zzt, 1000000L, zzs2);
                            zzdyVar4.zzG(2);
                            int zzo = zzdyVar4.zzo();
                            int[] iArr = new int[zzo];
                            long[] jArr = new long[zzo];
                            long[] jArr2 = new long[zzo];
                            long[] jArr3 = new long[zzo];
                            long j11 = zzw2;
                            int i10 = 0;
                            while (i10 < zzo) {
                                int zze2 = zzdyVar4.zze();
                                if ((zze2 & Integer.MIN_VALUE) != 0) {
                                    throw zzbp.zza("Unhandled indirect reference", null);
                                }
                                long zzs3 = zzdyVar4.zzs();
                                iArr[i10] = zze2 & Integer.MAX_VALUE;
                                jArr[i10] = j10;
                                jArr3[i10] = j11;
                                long j12 = zzt + zzs3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                j11 = zzeg.zzw(j12, 1000000L, zzs2);
                                jArr5[i11] = j11 - jArr4[i11];
                                zzdyVar4.zzG(4);
                                j10 += r1[i11];
                                i10 = i11 + 1;
                                iArr = iArr;
                                jArr = jArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                zzo = zzo;
                                zzt = j12;
                            }
                            Pair create = Pair.create(Long.valueOf(zzw2), new zzyk(iArr, jArr, jArr2, jArr3));
                            this.zzx = ((Long) create.first).longValue();
                            this.zzD.zzL((zzzv) create.second);
                            this.zzG = true;
                        } else if (i9 == 1701671783) {
                            zzdy zzdyVar5 = zzadvVar.zza;
                            if (this.zzE.length != 0) {
                                zzdyVar5.zzF(8);
                                int zze3 = zzadw.zze(zzdyVar5.zze());
                                if (zze3 == 0) {
                                    String zzv = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv);
                                    String zzv2 = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv2);
                                    long zzs4 = zzdyVar5.zzs();
                                    long zzw3 = zzeg.zzw(zzdyVar5.zzs(), 1000000L, zzs4);
                                    long j13 = this.zzx;
                                    long j14 = j13 != -9223372036854775807L ? j13 + zzw3 : -9223372036854775807L;
                                    zzw = zzeg.zzw(zzdyVar5.zzs(), 1000L, zzs4);
                                    zzs = zzdyVar5.zzs();
                                    str = zzv;
                                    str2 = zzv2;
                                    j = zzw3;
                                    j2 = j14;
                                } else if (zze3 != 1) {
                                    Log.w("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + zze3);
                                } else {
                                    long zzs5 = zzdyVar5.zzs();
                                    long zzw4 = zzeg.zzw(zzdyVar5.zzt(), 1000000L, zzs5);
                                    long zzw5 = zzeg.zzw(zzdyVar5.zzs(), 1000L, zzs5);
                                    long zzs6 = zzdyVar5.zzs();
                                    String zzv3 = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv3);
                                    String zzv4 = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv4);
                                    zzw = zzw5;
                                    zzs = zzs6;
                                    str = zzv3;
                                    str2 = zzv4;
                                    j = -9223372036854775807L;
                                    j2 = zzw4;
                                }
                                byte[] bArr = new byte[zzdyVar5.zza()];
                                zzdyVar5.zzB(bArr, 0, zzdyVar5.zza());
                                zzdy zzdyVar6 = new zzdy(this.zzk.zza(new zzabe(str, str2, zzw, zzs, bArr)));
                                int zza2 = zzdyVar6.zza();
                                for (zzzz zzzzVar : this.zzE) {
                                    zzdyVar6.zzF(0);
                                    zzzzVar.zzq(zzdyVar6, zza2);
                                }
                                if (j2 == -9223372036854775807L) {
                                    this.zzn.addLast(new zzaeh(j, true, zza2));
                                    this.zzu += zza2;
                                } else if (this.zzn.isEmpty()) {
                                    for (zzzz zzzzVar2 : this.zzE) {
                                        zzzzVar2.zzs(j2, 1, zza2, 0, null);
                                    }
                                } else {
                                    this.zzn.addLast(new zzaeh(j2, false, zza2));
                                    this.zzu += zza2;
                                }
                            }
                        }
                        zzytVar2 = zzytVar;
                    } else {
                        ((zzadu) this.zzm.peek()).zzd(zzadvVar);
                    }
                } else {
                    ((zzym) zzytVar2).zzo(i8, false);
                }
                zzi(zzytVar.zzf());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzD = zzyvVar;
        zzg();
        zzzz[] zzzzVarArr = new zzzz[2];
        this.zzE = zzzzVarArr;
        int i = 0;
        zzzz[] zzzzVarArr2 = (zzzz[]) zzeg.zzad(zzzzVarArr, 0);
        this.zzE = zzzzVarArr2;
        for (zzzz zzzzVar : zzzzVarArr2) {
            zzzzVar.zzk(zzc);
        }
        this.zzF = new zzzz[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzzz zzv = this.zzD.zzv(i2, 3);
            zzv.zzk((zzad) this.zzd.get(i));
            this.zzF[i] = zzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzaei) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        return zzaes.zza(zzytVar);
    }

    public zzaej(int i, zzee zzeeVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzabf();
        this.zzl = new zzdy(16);
        this.zzf = new zzdy(zzzp.zza);
        this.zzg = new zzdy(5);
        this.zzh = new zzdy();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzdy(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzyv.zza;
        this.zzE = new zzzz[0];
        this.zzF = new zzzz[0];
    }
}
