package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzamp implements zzagh {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private int zzB;
    private int zzC;
    private long zzD;
    private zzagk zzE;
    private zzamo[] zzF;

    @Nullable
    private long[][] zzG;
    private int zzH;
    private final zzanx zzb;
    private final int zzc;
    private final zzeu zzd;
    private final zzeu zze;
    private final zzeu zzf;
    private final zzeu zzg;
    private final ArrayDeque zzh;
    private final zzamt zzi;
    private final List zzj;
    private final List zzk;
    private final List zzl;
    private zzgxm zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;

    @Nullable
    private zzeu zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private long zzz;

    static {
        int i = zzaml.zza;
    }

    @Deprecated
    public zzamp() {
        this(zzanx.zza, 16);
    }

    static /* synthetic */ long zzh(zzamz zzamzVar, long j, long j2) {
        int zzl = zzl(zzamzVar, j);
        return zzl == -1 ? j2 : Math.min(zzamzVar.zzc[zzl], j2);
    }

    private final void zzj() {
        this.zzn = 0;
        this.zzq = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0471  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(long j) throws zzat {
        ArrayList arrayList;
        zzap zzapVar;
        ArrayDeque arrayDeque;
        zzap zzapVar2;
        int i;
        boolean z;
        ArrayDeque arrayDeque2;
        List list;
        String str;
        int i2;
        int i3;
        ArrayList arrayList2;
        zzap zzapVar3;
        zzap zzapVar4;
        zzaha zzahaVar;
        int i4;
        long j2;
        ArrayList arrayList3;
        zzamw zzamwVar;
        zzamo zzamoVar;
        int i5;
        long j3;
        zzv zzQ;
        zzamw zzamwVar2;
        boolean z2;
        int i6;
        boolean z3;
        zzamo zzamoVar2;
        int i7;
        int i8;
        boolean z4;
        int i9;
        zzfx zzfxVar;
        int i10;
        loop0: while (true) {
            int i11 = 0;
            int i12 = 1;
            while (true) {
                ArrayDeque arrayDeque3 = this.zzh;
                if (arrayDeque3.isEmpty() || ((zzfz) arrayDeque3.peek()).zza != j) {
                    break loop0;
                }
                zzfz zzfzVar = (zzfz) arrayDeque3.pop();
                if (zzfzVar.zzd == 1836019574) {
                    zzfz zzd = zzfzVar.zzd(1835365473);
                    ArrayList arrayList4 = new ArrayList();
                    long j4 = 0;
                    if (zzd != null) {
                        zzapVar = zzalv.zze(zzd);
                        if (this.zzA) {
                            zzapVar.getClass();
                            zzfx zzfxVar2 = (zzfx) zzapVar.zzc(zzfx.class, zzami.zza);
                            if (zzfxVar2 != null && zzfxVar2.zzb[i11] == 0) {
                                this.zzD = this.zzz + 16;
                            }
                            zzfx zzfxVar3 = (zzfx) zzapVar.zzc(zzfx.class, zzamj.zza);
                            zzfxVar3.getClass();
                            List zzb = zzfxVar3.zzb();
                            ArrayList arrayList5 = new ArrayList(zzb.size());
                            for (int i13 = i11; i13 < zzb.size(); i13 += i12) {
                                int intValue = ((Integer) zzb.get(i13)).intValue();
                                if (intValue == 0) {
                                    i10 = i12;
                                } else if (intValue != i12) {
                                    i10 = 3;
                                    if (intValue != 2) {
                                        i10 = intValue != 3 ? i11 : 4;
                                    }
                                } else {
                                    i10 = 2;
                                }
                                arrayList5.add(Integer.valueOf(i10));
                            }
                            arrayList = arrayList5;
                        } else {
                            if (zzapVar != null && (this.zzc & 64) != 0 && (zzfxVar = (zzfx) zzapVar.zzc(zzfx.class, zzamh.zza)) != null) {
                                long zzJ = new zzeu(zzfxVar.zzb).zzJ();
                                if (zzJ > 0) {
                                    this.zzz = zzJ;
                                    this.zzy = i12;
                                    arrayDeque = arrayDeque3;
                                    arrayDeque.clear();
                                    if (this.zzy) {
                                        i12 = 1;
                                        this.zzn = true != this.zzk.isEmpty() ? 4 : 2;
                                    }
                                }
                            }
                            arrayList = arrayList4;
                        }
                    } else {
                        arrayList = arrayList4;
                        zzapVar = null;
                    }
                    ArrayList arrayList6 = new ArrayList();
                    int i14 = this.zzH;
                    zzaha zzahaVar2 = new zzaha();
                    zzga zzc = zzfzVar.zzc(1969517665);
                    if (zzc != null) {
                        zzap zzc2 = zzalv.zzc(zzc);
                        zzahaVar2.zza(zzc2);
                        zzapVar2 = zzc2;
                    } else {
                        zzapVar2 = null;
                    }
                    zzga zzc3 = zzfzVar.zzc(1836476516);
                    zzc3.getClass();
                    int i15 = i12 != i14 ? i11 : i12;
                    zzgd zzd2 = zzalv.zzd(zzc3.zza);
                    zzao[] zzaoVarArr = new zzao[i12];
                    zzaoVarArr[i11] = zzd2;
                    zzap zzapVar5 = new zzap(-9223372036854775807L, zzaoVarArr);
                    int i16 = this.zzc;
                    zzap zzapVar6 = zzapVar5;
                    zzap zzapVar7 = zzapVar2;
                    zzaha zzahaVar3 = zzahaVar2;
                    boolean z5 = i15;
                    ArrayList arrayList7 = arrayList6;
                    ArrayList arrayList8 = arrayList;
                    List<zzamz> zzb2 = zzalv.zzb(zzfzVar, zzahaVar2, -9223372036854775807L, null, i12 != (i16 & 1) ? i11 : i12, z5, zzamm.zza, false);
                    if (this.zzA) {
                        zzguk.zzj(arrayList8.size() == zzb2.size() ? i12 : i11, String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(arrayList8.size()), Integer.valueOf(zzb2.size())));
                    }
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it = zzb2.iterator();
                    while (true) {
                        i = -1;
                        if (!it.hasNext()) {
                            break;
                        }
                        int i17 = ((zzamz) it.next()).zza.zzl;
                        if (i17 != -1) {
                            Integer valueOf = Integer.valueOf(i17);
                            if (!arrayList9.contains(valueOf)) {
                                arrayList9.add(valueOf);
                            }
                        }
                    }
                    List list2 = this.zzk;
                    list2.clear();
                    for (zzamz zzamzVar : zzb2) {
                        if (arrayList9.contains(Integer.valueOf(zzamzVar.zza.zza))) {
                            list2.add(zzamzVar);
                        }
                    }
                    String zza2 = zzamg.zza(zzb2);
                    int i18 = i11;
                    int i19 = i18;
                    long j5 = -9223372036854775807L;
                    int i20 = -1;
                    boolean z6 = i12;
                    while (i18 < zzb2.size()) {
                        zzamz zzamzVar2 = (zzamz) zzb2.get(i18);
                        int i21 = zzamzVar2.zzb;
                        if (i21 != 0) {
                            zzamw zzamwVar3 = zzamzVar2.zza;
                            if (zzamwVar3.zzm) {
                                list = zzb2;
                                zzagk zzagkVar = this.zzE;
                                i3 = i19 + 1;
                                int i22 = zzamwVar3.zzb;
                                zzamo zzamoVar3 = new zzamo(zzamwVar3, zzamzVar2, zzagkVar.zzs(i19, i22));
                                String str2 = zza2;
                                long j6 = zzamwVar3.zze;
                                if (j6 == -9223372036854775807L) {
                                    j6 = zzamzVar2.zzi;
                                }
                                zzaht zzahtVar = zzamoVar3.zzc;
                                zzahtVar.zzP(j6);
                                long max = Math.max(j5, j6);
                                zzv zzvVar = zzamwVar3.zzg;
                                String str3 = zzvVar.zzp;
                                int i23 = "audio/true-hd".equals(str3) ? zzamzVar2.zze * 16 : zzamzVar2.zze + 30;
                                arrayDeque2 = arrayDeque3;
                                zzt zza3 = zzvVar.zza();
                                zza3.zzp(i23);
                                if (i22 == 2) {
                                    int i24 = zzvVar.zzf;
                                    if ((i16 & 8) != 0) {
                                        i24 |= i20 == -1 ? 1 : 2;
                                    }
                                    if (this.zzA) {
                                        arrayList3 = arrayList8;
                                        zza3.zzh(((Integer) arrayList3.get(i18)).intValue());
                                        i24 |= 32768;
                                    } else {
                                        arrayList3 = arrayList8;
                                    }
                                    zza3.zzg(i24);
                                    i22 = 2;
                                } else {
                                    arrayList3 = arrayList8;
                                }
                                if (zzas.zzb(str3) && zzamzVar2.zza()) {
                                    arrayList8 = arrayList3;
                                    boolean z7 = zzamzVar2.zzj;
                                    i2 = i18;
                                    i5 = i20;
                                    int min = Math.min(!z7 ? zzamzVar2.zzh.length : i21, 20);
                                    zzguk.zzi(j6 != -9223372036854775807L);
                                    zzamoVar = zzamoVar3;
                                    long min2 = Math.min(j6, 10000000L);
                                    zzamwVar = zzamwVar3;
                                    int i25 = 0;
                                    int i26 = 0;
                                    int i27 = -1;
                                    while (i25 < min) {
                                        if (z7) {
                                            i7 = min;
                                            z4 = z7;
                                            i8 = i25;
                                        } else {
                                            i7 = min;
                                            i8 = zzamzVar2.zzh[i25];
                                            z4 = z7;
                                        }
                                        long j7 = zzamzVar2.zzf[i8];
                                        if (j7 > min2) {
                                            break;
                                        }
                                        if (j7 >= 0 && (i9 = zzamzVar2.zzd[i8]) > i26) {
                                            i27 = i8;
                                            i26 = i9;
                                        }
                                        i25++;
                                        min = i7;
                                        z7 = z4;
                                    }
                                    if (i27 != -1) {
                                        j3 = zzamzVar2.zzf[i27];
                                        j2 = -9223372036854775807L;
                                        zzap zzapVar8 = j3 == -9223372036854775807L ? new zzap(-9223372036854775807L, new zzajk(j3)) : null;
                                        zzahaVar = zzahaVar3;
                                        zzamf.zzb(i22, zzahaVar, zza3);
                                        zzap zzapVar9 = zzvVar.zzl;
                                        List list3 = this.zzj;
                                        zzap zzapVar10 = !list3.isEmpty() ? null : new zzap(list3);
                                        zzapVar3 = zzapVar6;
                                        zzapVar4 = zzapVar7;
                                        zzamf.zza(i22, zzapVar, zza3, zzapVar9, zzapVar10, zzapVar4, zzapVar3, zzapVar8);
                                        str = str2;
                                        zza3.zzn(str);
                                        zzQ = zza3.zzQ();
                                        if (!Objects.equals(str3, "audio/mpeg") || zzagg.zza(str3)) {
                                            zzamwVar2 = zzamwVar;
                                            z2 = true;
                                        } else {
                                            zzamwVar2 = zzamwVar;
                                            z2 = false;
                                        }
                                        i6 = zzamwVar2.zzl;
                                        if (i6 != -1) {
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                if (((zzamz) it2.next()).zza.zza == i6) {
                                                    z3 = true;
                                                    break;
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (!z2 || z3) {
                                            zzamoVar2 = zzamoVar;
                                            zzamoVar2.zzb(zzQ);
                                        } else {
                                            zzahtVar.zzA(zzQ);
                                            zzamoVar2 = zzamoVar;
                                        }
                                        int i28 = i5;
                                        if (i22 != 2) {
                                            i4 = -1;
                                            if (i28 == -1) {
                                                i20 = arrayList7.size();
                                                arrayList2 = arrayList7;
                                                arrayList2.add(zzamoVar2);
                                                j5 = max;
                                                z = true;
                                                arrayList7 = arrayList2;
                                                zzahaVar3 = zzahaVar;
                                                zzapVar7 = zzapVar4;
                                                i18 = i2 + 1;
                                                zzapVar6 = zzapVar3;
                                                i19 = i3;
                                                arrayDeque3 = arrayDeque2;
                                                i = i4;
                                                z6 = z;
                                                zzb2 = list;
                                                zza2 = str;
                                            }
                                        } else {
                                            i4 = -1;
                                        }
                                        i20 = i28;
                                        arrayList2 = arrayList7;
                                        arrayList2.add(zzamoVar2);
                                        j5 = max;
                                        z = true;
                                        arrayList7 = arrayList2;
                                        zzahaVar3 = zzahaVar;
                                        zzapVar7 = zzapVar4;
                                        i18 = i2 + 1;
                                        zzapVar6 = zzapVar3;
                                        i19 = i3;
                                        arrayDeque3 = arrayDeque2;
                                        i = i4;
                                        z6 = z;
                                        zzb2 = list;
                                        zza2 = str;
                                    }
                                } else {
                                    zzamwVar = zzamwVar3;
                                    zzamoVar = zzamoVar3;
                                    i2 = i18;
                                    arrayList8 = arrayList3;
                                    i5 = i20;
                                }
                                j3 = -9223372036854775807L;
                                j2 = -9223372036854775807L;
                                if (j3 == -9223372036854775807L) {
                                }
                                zzahaVar = zzahaVar3;
                                zzamf.zzb(i22, zzahaVar, zza3);
                                zzap zzapVar92 = zzvVar.zzl;
                                List list32 = this.zzj;
                                if (!list32.isEmpty()) {
                                }
                                zzapVar3 = zzapVar6;
                                zzapVar4 = zzapVar7;
                                zzamf.zza(i22, zzapVar, zza3, zzapVar92, zzapVar10, zzapVar4, zzapVar3, zzapVar8);
                                str = str2;
                                zza3.zzn(str);
                                zzQ = zza3.zzQ();
                                if (Objects.equals(str3, "audio/mpeg")) {
                                }
                                zzamwVar2 = zzamwVar;
                                z2 = true;
                                i6 = zzamwVar2.zzl;
                                if (i6 != -1) {
                                }
                                z3 = false;
                                if (z2) {
                                }
                                zzamoVar2 = zzamoVar;
                                zzamoVar2.zzb(zzQ);
                                int i282 = i5;
                                if (i22 != 2) {
                                }
                                i20 = i282;
                                arrayList2 = arrayList7;
                                arrayList2.add(zzamoVar2);
                                j5 = max;
                                z = true;
                                arrayList7 = arrayList2;
                                zzahaVar3 = zzahaVar;
                                zzapVar7 = zzapVar4;
                                i18 = i2 + 1;
                                zzapVar6 = zzapVar3;
                                i19 = i3;
                                arrayDeque3 = arrayDeque2;
                                i = i4;
                                z6 = z;
                                zzb2 = list;
                                zza2 = str;
                            }
                        }
                        z = z6;
                        arrayDeque2 = arrayDeque3;
                        list = zzb2;
                        str = zza2;
                        i2 = i18;
                        i3 = i19;
                        arrayList2 = arrayList7;
                        zzapVar3 = zzapVar6;
                        zzapVar4 = zzapVar7;
                        zzahaVar = zzahaVar3;
                        i4 = -1;
                        j2 = -9223372036854775807L;
                        arrayList7 = arrayList2;
                        zzahaVar3 = zzahaVar;
                        zzapVar7 = zzapVar4;
                        i18 = i2 + 1;
                        zzapVar6 = zzapVar3;
                        i19 = i3;
                        arrayDeque3 = arrayDeque2;
                        i = i4;
                        z6 = z;
                        zzb2 = list;
                        zza2 = str;
                    }
                    arrayDeque = arrayDeque3;
                    int i29 = i;
                    int i30 = i20;
                    zzamo[] zzamoVarArr = (zzamo[]) arrayList7.toArray(new zzamo[0]);
                    this.zzF = zzamoVarArr;
                    int length = zzamoVarArr.length;
                    long[][] jArr = new long[length][];
                    int[] iArr = new int[length];
                    long[] jArr2 = new long[length];
                    boolean[] zArr = new boolean[length];
                    for (int i31 = 0; i31 < zzamoVarArr.length; i31++) {
                        jArr[i31] = new long[zzamoVarArr[i31].zzb.zzb];
                        jArr2[i31] = zzamoVarArr[i31].zzb.zzf[0];
                    }
                    int i32 = 0;
                    int i33 = 0;
                    while (i33 < zzamoVarArr.length) {
                        long j8 = Long.MAX_VALUE;
                        int i34 = i29;
                        for (int i35 = i32; i35 < zzamoVarArr.length; i35++) {
                            if (!zArr[i35]) {
                                long j9 = jArr2[i35];
                                if (j9 <= j8) {
                                    i34 = i35;
                                    j8 = j9;
                                }
                            }
                        }
                        int i36 = iArr[i34];
                        long[] jArr3 = jArr[i34];
                        jArr3[i36] = j4;
                        zzamz zzamzVar3 = zzamoVarArr[i34].zzb;
                        int i37 = i30;
                        long j10 = j5;
                        j4 += zzamzVar3.zzd[i36];
                        int i38 = i36 + 1;
                        iArr[i34] = i38;
                        if (i38 < jArr3.length) {
                            jArr2[i34] = zzamzVar3.zzf[i38];
                        } else {
                            zArr[i34] = true;
                            i33++;
                        }
                        j5 = j10;
                        i30 = i37;
                        i29 = -1;
                        i32 = 0;
                    }
                    this.zzG = jArr;
                    this.zzE.zzv();
                    this.zzE.zzw(new zzamn(j5, this.zzF, i30));
                    arrayDeque.clear();
                    if (this.zzy) {
                        break;
                    }
                } else if (!arrayDeque3.isEmpty()) {
                    ((zzfz) arrayDeque3.peek()).zzb(zzfzVar);
                }
                i11 = 0;
                i12 = i12;
            }
        }
        int i39 = this.zzn;
        if (i39 == 4 || i39 == 2) {
            return;
        }
        zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzamz zzamzVar, long j) {
        int zzb = zzamzVar.zzb(j);
        return zzb == -1 ? zzamzVar.zzc(j) : zzb;
    }

    private static int zzm(int i) {
        return i != 1903435808 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzaho zzb = zzamu.zzb(zzagiVar);
        this.zzm = zzb != null ? zzgxm.zzj(zzb) : zzgxm.zzi();
        return zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final /* synthetic */ List zzb() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        if ((this.zzc & 16) == 0) {
            zzagkVar = new zzaoa(zzagkVar, this.zzb);
        }
        this.zzE = zzagkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzq = 0;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzk.clear();
        this.zzl.clear();
        if (j == 0) {
            if (this.zzn != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzamo zzamoVar : this.zzF) {
            zzamz zzamzVar = zzamoVar.zzb;
            int zzb = zzamzVar.zzb(j2);
            if (zzb == -1) {
                zzb = zzamzVar.zzc(j2);
            }
            zzamoVar.zze = zzb;
            zzahu zzahuVar = zzamoVar.zzd;
            if (zzahuVar != null) {
                zzahuVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    public zzamp(zzanx zzanxVar, int i) {
        this.zzb = zzanxVar;
        this.zzc = i;
        this.zzm = zzgxm.zzi();
        this.zzn = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzamt();
        this.zzj = new ArrayList();
        this.zzg = new zzeu(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzeu(zzgr.zza);
        this.zze = new zzeu(6);
        this.zzf = new zzeu();
        this.zzs = -1;
        this.zzE = zzagk.zza;
        this.zzF = new zzamo[0];
        this.zzk = new ArrayList();
        this.zzl = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x03b0, code lost:
    
        return 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b0 A[EDGE_INSN: B:145:0x03b0->B:146:0x03b0 BREAK  A[LOOP:0: B:2:0x0006->B:55:0x0006], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x043e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x029f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        char c;
        int[] iArr;
        int i;
        int i2;
        int zzB;
        boolean z;
        boolean z2;
        int i3;
        while (true) {
            int i4 = this.zzn;
            if (i4 == 0) {
                if (this.zzq == 0) {
                    zzeu zzeuVar = this.zzg;
                    if (!zzagiVar.zzb(zzeuVar.zzi(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzq = 8;
                    zzeuVar.zzh(0);
                    this.zzp = zzeuVar.zzz();
                    this.zzo = zzeuVar.zzB();
                }
                long j = this.zzp;
                if (j == 1) {
                    zzeu zzeuVar2 = this.zzg;
                    zzagiVar.zzc(zzeuVar2.zzi(), 8, 8);
                    this.zzq += 8;
                    this.zzp = zzeuVar2.zzJ();
                } else if (j == 0) {
                    long zzo = zzagiVar.zzo();
                    if (zzo == -1) {
                        zzfz zzfzVar = (zzfz) this.zzh.peek();
                        zzo = zzfzVar != null ? zzfzVar.zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzp = (zzo - zzagiVar.zzn()) + this.zzq;
                    }
                }
                long j2 = this.zzp;
                int i5 = this.zzq;
                long j3 = i5;
                if (j2 < j3) {
                    if (this.zzo != 1718773093 || i5 != 8) {
                        break;
                    }
                    this.zzp = j3;
                    i5 = 8;
                }
                int i6 = this.zzo;
                if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1701082227 || i6 == 1835365473 || i6 == 1635284069 || i6 == 1953654118) {
                    long zzn = zzagiVar.zzn();
                    long j4 = this.zzp;
                    long j5 = zzn + j4;
                    long j6 = this.zzq;
                    if (j4 != j6 && this.zzo == 1835365473) {
                        zzeu zzeuVar3 = this.zzf;
                        zzeuVar3.zza(8);
                        zzagiVar.zzi(zzeuVar3.zzi(), 0, 8);
                        zzalv.zzf(zzeuVar3);
                        zzagiVar.zzf(zzeuVar3.zzg());
                        zzagiVar.zzl();
                    }
                    long j7 = j5 - j6;
                    this.zzh.push(new zzfz(this.zzo, j7));
                    if (this.zzp == this.zzq) {
                        zzk(j7);
                    } else {
                        zzj();
                    }
                } else {
                    if (i6 == 1835296868 || i6 == 1836476516 || i6 == 1751411826 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1937011571 || i6 == 1668576371 || i6 == 1701606260 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1953196132 || i6 == 1718909296 || i6 == 1969517665 || i6 == 1801812339 || i6 == 1768715124 || i6 == 1667785072) {
                        zzguk.zzi(i5 == 8);
                        zzguk.zzi(this.zzp <= 2147483647L);
                        zzeu zzeuVar4 = new zzeu((int) this.zzp);
                        System.arraycopy(this.zzg.zzi(), 0, zzeuVar4.zzi(), 0, 8);
                        this.zzr = zzeuVar4;
                    } else {
                        this.zzr = null;
                    }
                    this.zzn = 1;
                }
            } else if (i4 == 1) {
                long j8 = this.zzp - this.zzq;
                long zzn2 = zzagiVar.zzn() + j8;
                zzeu zzeuVar5 = this.zzr;
                if (zzeuVar5 == null) {
                    if (!this.zzx && this.zzo == 1835295092) {
                        this.zzH = 1;
                    }
                    if (j8 >= 262144) {
                        zzahhVar.zza = zzagiVar.zzn() + j8;
                        z2 = true;
                        zzk(zzn2);
                        if (!this.zzy) {
                            this.zzA = true;
                            zzahhVar.zza = this.zzz;
                            this.zzy = false;
                        } else if (!z2) {
                            continue;
                        }
                        if (this.zzn == 2) {
                            break;
                        }
                    } else {
                        zzagiVar.zzf((int) j8);
                    }
                } else {
                    zzagiVar.zzc(zzeuVar5.zzi(), this.zzq, (int) j8);
                    if (this.zzo == 1718909296) {
                        this.zzx = true;
                        zzeuVar5.zzh(8);
                        if (zzm(zzeuVar5.zzB()) == 0) {
                            zzeuVar5.zzk(4);
                            while (zzeuVar5.zzd() > 0) {
                                if (zzm(zzeuVar5.zzB()) != 0) {
                                }
                            }
                            i3 = 0;
                            this.zzH = i3;
                        }
                        i3 = 1;
                        this.zzH = i3;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfz) arrayDeque.peek()).zza(new zzga(this.zzo, zzeuVar5));
                        }
                    }
                }
                z2 = false;
                zzk(zzn2);
                if (!this.zzy) {
                }
                if (this.zzn == 2) {
                }
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        List list = this.zzk;
                        zzamz zzamzVar = (zzamz) list.get(this.zzB);
                        int i7 = this.zzC;
                        int i8 = zzamzVar.zzb;
                        if (i7 < i8) {
                            long j9 = zzamzVar.zzc[i7];
                            if (zzagiVar.zzn() != j9) {
                                zzahhVar.zza = j9;
                            } else {
                                int i9 = zzamzVar.zzd[this.zzC];
                                zzeu zzeuVar6 = this.zzf;
                                zzeuVar6.zza(i9);
                                zzagiVar.zzc(zzeuVar6.zzi(), 0, i9);
                                String zzK = zzeuVar6.zzK(Math.min(zzeuVar6.zzt(), zzeuVar6.zzd()), StandardCharsets.UTF_8);
                                long[] jArr = zzamzVar.zzf;
                                long zzs = zzfm.zzs(jArr[this.zzC]);
                                int i10 = this.zzC + 1;
                                long zzs2 = i10 < i8 ? zzfm.zzs(jArr[i10]) : zzfm.zzs(zzamzVar.zzi);
                                List list2 = this.zzl;
                                zzajf zzajfVar = new zzajf();
                                zzajfVar.zza(zzs);
                                zzajfVar.zzb(zzs2);
                                zzajfVar.zzd(new zzx(null, zzK));
                                list2.add(zzajfVar.zze());
                                this.zzC++;
                            }
                        } else {
                            for (zzamo zzamoVar : this.zzF) {
                                if (zzamoVar.zza.zzl == zzamzVar.zza.zza) {
                                    zzv zza2 = zzamoVar.zza();
                                    zza2.getClass();
                                    zzap zzapVar = zza2.zzl;
                                    ArrayList arrayList = new ArrayList();
                                    if (zzapVar != null) {
                                        arrayList.addAll(zzapVar.zze(zzao.class, zzamk.zza));
                                    }
                                    arrayList.addAll(this.zzl);
                                    zzt zza3 = zza2.zza();
                                    zza3.zzl(new zzap(arrayList));
                                    zzv zzQ = zza3.zzQ();
                                    String str = zzQ.zzp;
                                    if (Objects.equals(str, "audio/mpeg") || zzagg.zza(str)) {
                                        zzamoVar.zzb(zzQ);
                                    } else {
                                        zzamoVar.zzc.zzA(zzQ);
                                        zzamoVar.zzb(null);
                                    }
                                }
                            }
                            this.zzB++;
                            this.zzC = 0;
                            this.zzl.clear();
                            if (this.zzB == list.size()) {
                                this.zzn = 2;
                                return 0;
                            }
                        }
                        return 0;
                    }
                    this.zzi.zzb(zzagiVar, zzahhVar, this.zzj);
                    if (zzahhVar.zza == 0) {
                        zzj();
                        return 1;
                    }
                    return 1;
                }
                long zzn3 = zzagiVar.zzn();
                int i11 = this.zzs;
                if (i11 == -1) {
                    int i12 = -1;
                    int i13 = -1;
                    boolean z3 = true;
                    boolean z4 = true;
                    int i14 = 0;
                    long j10 = Long.MAX_VALUE;
                    long j11 = Long.MAX_VALUE;
                    long j12 = Long.MAX_VALUE;
                    while (true) {
                        zzamo[] zzamoVarArr = this.zzF;
                        if (i14 >= zzamoVarArr.length) {
                            break;
                        }
                        zzamo zzamoVar2 = zzamoVarArr[i14];
                        int i15 = zzamoVar2.zze;
                        zzamz zzamzVar2 = zzamoVar2.zzb;
                        if (i15 != zzamzVar2.zzb) {
                            long j13 = zzamzVar2.zzc[i15];
                            long[][] jArr2 = this.zzG;
                            jArr2.getClass();
                            long j14 = jArr2[i14][i15];
                            long j15 = j13 - zzn3;
                            boolean z5 = j15 < 0 || j15 >= 262144;
                            if (z5) {
                                z = z4;
                            } else {
                                if (!z4) {
                                    z = false;
                                }
                                i13 = i14;
                                z4 = z5;
                                j12 = j15;
                                j11 = j14;
                                if (j14 < j10) {
                                    i12 = i14;
                                    z3 = z5;
                                    j10 = j14;
                                }
                            }
                            if (z5 != z || j15 >= j12) {
                                z4 = z;
                                if (j14 < j10) {
                                }
                            }
                            i13 = i14;
                            z4 = z5;
                            j12 = j15;
                            j11 = j14;
                            if (j14 < j10) {
                            }
                        }
                        i14++;
                    }
                    i11 = (j10 == Long.MAX_VALUE || !z3 || j11 < j10 + 10485760) ? i13 : i12;
                    this.zzs = i11;
                    if (i11 == -1) {
                        return -1;
                    }
                }
                zzamo zzamoVar3 = this.zzF[i11];
                zzaht zzahtVar = zzamoVar3.zzc;
                int i16 = zzamoVar3.zze;
                zzamz zzamzVar3 = zzamoVar3.zzb;
                long j16 = zzamzVar3.zzc[i16] + this.zzD;
                int[] iArr2 = zzamzVar3.zzd;
                int i17 = iArr2[i16];
                zzahu zzahuVar = zzamoVar3.zzd;
                long j17 = (j16 - zzn3) + this.zzt;
                if (j17 >= 0 && j17 < 262144) {
                    zzamw zzamwVar = zzamoVar3.zza;
                    if (zzamwVar.zzh == 1) {
                        j17 += 8;
                        i17 -= 8;
                    }
                    int i18 = i17;
                    zzagiVar.zzf((int) j17);
                    zzv zzvVar = zzamwVar.zzg;
                    String str2 = zzvVar.zzp;
                    if (!Objects.equals(str2, "video/avc") ? !Objects.equals(str2, "video/hevc") ? Objects.equals(str2, "video/apv") : (this.zzc & 128) != 0 : (this.zzc & 32) != 0) {
                        c = 1;
                    } else {
                        c = 1;
                        this.zzw = true;
                    }
                    int i19 = zzamwVar.zzk;
                    if (i19 == 0) {
                        zzv zza4 = zzamoVar3.zza();
                        if ("audio/ac4".equals(str2)) {
                            if (this.zzu == 0) {
                                zzeu zzeuVar7 = this.zzf;
                                zzafk.zzc(i18, zzeuVar7);
                                zzahtVar.zzc(zzeuVar7, 7);
                                this.zzu += 7;
                            }
                            i18 += 7;
                        } else if (zza4 != null && Objects.equals(str2, "audio/mpeg")) {
                            zzeu zzeuVar8 = this.zzf;
                            zzeuVar8.zza(4);
                            zzagiVar.zzi(zzeuVar8.zzi(), 0, 4);
                            zzagiVar.zzl();
                            zzahe zzaheVar = new zzahe();
                            if (zzaheVar.zza(zzeuVar8.zzB()) && !Objects.equals(zza4.zzp, zzaheVar.zzb)) {
                                zzt zza5 = zza4.zza();
                                String str3 = zzaheVar.zzb;
                                str3.getClass();
                                zza5.zzo(str3);
                                zza4 = zza5.zzQ();
                            }
                            zzahtVar.zzA(zza4);
                            zzamoVar3.zzb(null);
                        } else if (zza4 != null && zzagg.zza(str2)) {
                            zzahtVar.zzA(zzagg.zzi(zzagiVar, i18, zza4));
                            zzamoVar3.zzb(null);
                        } else if (zzahuVar != null) {
                            zzahuVar.zzb(zzagiVar);
                        }
                        while (true) {
                            int i20 = this.zzu;
                            if (i20 >= i18) {
                                break;
                            }
                            int zza6 = zzahtVar.zza(zzagiVar, i18 - i20, false);
                            this.zzt += zza6;
                            this.zzu += zza6;
                            this.zzv -= zza6;
                        }
                    } else {
                        zzeu zzeuVar9 = this.zze;
                        byte[] zzi = zzeuVar9.zzi();
                        zzi[0] = 0;
                        zzi[c] = 0;
                        zzi[2] = 0;
                        int i21 = 4 - i19;
                        i18 += i21;
                        while (this.zzu < i18) {
                            int i22 = this.zzv;
                            if (i22 == 0) {
                                if (this.zzw) {
                                    iArr = iArr2;
                                } else {
                                    iArr = iArr2;
                                    if (zzgr.zzc(zzvVar) + i19 <= iArr2[i16] - this.zzt) {
                                        i2 = zzgr.zzc(zzvVar);
                                        i = i19 + i2;
                                        zzagiVar.zzc(zzi, i21, i);
                                        this.zzt += i;
                                        zzeuVar9.zzh(0);
                                        zzB = zzeuVar9.zzB();
                                        if (zzB >= 0) {
                                            throw zzat.zzb("Invalid NAL length", null);
                                        }
                                        this.zzv = zzB - i2;
                                        zzeu zzeuVar10 = this.zzd;
                                        zzeuVar10.zzh(0);
                                        zzahtVar.zzc(zzeuVar10, 4);
                                        this.zzu += 4;
                                        if (i2 > 0) {
                                            zzahtVar.zzc(zzeuVar9, i2);
                                            this.zzu += i2;
                                            if (zzgr.zzd(zzi, 4, i2, zzvVar)) {
                                                this.zzw = true;
                                            }
                                        }
                                    }
                                }
                                i = i19;
                                i2 = 0;
                                zzagiVar.zzc(zzi, i21, i);
                                this.zzt += i;
                                zzeuVar9.zzh(0);
                                zzB = zzeuVar9.zzB();
                                if (zzB >= 0) {
                                }
                            } else {
                                iArr = iArr2;
                                int zza7 = zzahtVar.zza(zzagiVar, i22, false);
                                this.zzt += zza7;
                                this.zzu += zza7;
                                this.zzv -= zza7;
                            }
                            iArr2 = iArr;
                        }
                    }
                    long j18 = zzamzVar3.zzf[i16];
                    int i23 = zzamzVar3.zzg[i16];
                    if (!this.zzw) {
                        i23 |= 67108864;
                    }
                    if (zzahuVar != null) {
                        zzahuVar.zzc(zzahtVar, j18, i23, i18, 0, null);
                        if (i16 + 1 == zzamzVar3.zzb) {
                            zzahuVar.zzd(zzahtVar, null);
                        }
                    } else {
                        zzahtVar.zze(j18, i23, i18, 0, null);
                    }
                    zzamoVar3.zze++;
                    this.zzs = -1;
                    this.zzt = 0;
                    this.zzu = 0;
                    this.zzv = 0;
                    this.zzw = false;
                    return 0;
                }
                zzahhVar.zza = j16;
            }
        }
        throw zzat.zzc("Atom size less than header length (unsupported).");
    }
}
